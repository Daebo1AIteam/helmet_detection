<template>
  <div class="homeContainer">
      <a @click="loginKakao" class="btn">
  <svg width="277" height="62">
    <defs>
        <linearGradient id="grad1">
            <stop offset="0%" stop-color="#FF8282"/>
            <stop offset="100%" stop-color="#E178ED" />
        </linearGradient>
    </defs>
     <rect x="5" y="5" rx="25" fill="none" stroke="url(#grad1)" width="266" height="50"/>
  </svg>
  <!--<span>Voir mes réalisations</span>-->
    <span>Welcome in my world</span>
</a>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  name: 'Home',
  components: {
  },
    methods: {
        loginKakao(){
            console.log('로그인');
            console.log(window.Kakao);
            window.Kakao.Auth.login({
                scope : 'account_email',
                success: this.GetMe,
            });
        },
      GetMe(authObj){
            console.log(authObj);
            window.Kakao.API.request({
                url:'/v2/user/me',
                success : async(res) => {
                    const kakao_account = res.kakao_account;
                    const userInfo = {
                      id: res.id,
                      nickname : kakao_account.profile.nickname,
                        email : kakao_account.email,
                        profileIMG: kakao_account.profile.profile_image_url,
                    };

             axios.post('http://localhost:8000/accounts/checked/',
            { 
                username: req_body.email
            })
            .then(res => {
                res
                axios.post('http://localhost:8000/accounts/user/login/',{
                    username: req_body.email,
                    password: '1234qwer!'
                })
                .then(res => {
                    console.log(res.data)
                    // saveTokenToCookie(res.data.token)
                    // saveUserpkToCookie(res.data.user.pk)
                    // saveEmailToCookie(req_body.email)

                    // console.log('login 유저 pk :' + res.data.user.pk)
                    // store.commit('Savepk', res.data.user.pk)
                    // store.commit('Savetoken', res.data.token)
                    // store.commit('loginCheck',0)
                })
                .catch(res => {
                    res
                    alert('로그인 할 수 없습니다!')
                })
           
            })
            .catch(res => {
                res
                alert('로그인 할 수 없습니다!')
            })
        },
        fail: (error) => {
            // LoginFailure();
            error
        },
            })
        }
    }
}
</script>

<style scoped>

body{
  width: 100%;
  height:100%;
  position:relative;
  overflow:hidden;
  background: 
    linear-gradient(
      rgba(0, 0, 0, 0.7), 
      rgba(0, 0, 0, 0.7)
    ),
    black url('https://images.unsplash.com/photo-1439723680580-bfd9d28ef9b6?crop=entropy&fit=crop&fm=jpg&h=950&ixjsv=2.1.0&ixlib=rb-0.3.5&q=80&w=1925') 50% 50% no-repeat;
   /* //background: 
     linear-gradient(
      rgba(0, 0, 0, 0.7), 
      rgba(0, 0, 0, 0.7)
    ),
     rgba(220, 220, 220, 1) url('https://images.unsplash.com/photo-1449157291145-7efd050a4d0e?crop=entropy&fit=crop&fm=jpg&h=950&ixjsv=2.1.0&ixlib=rb-0.3.5&q=80&w=1925') 50% 50% no-repeat;
  //background-blend-mode: exclusion; */
  background-blend-mode: luminosity;
  
 
}
.homeContainer{



  height:100%;
 position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
}
.btn {
    margin-top: calc(50% + 25px);
    position: relative;
    display: inline-block;
    width: 277px;
    height: 50px;
    font-size: 1em;
    font-weight: bold;
    line-height: 60px;
    text-align: center;
    text-transform: uppercase;
    background-color: transparent;
    cursor: pointer;
    text-decoration:none;
    font-family: 'Roboto', sans-serif;
    font-weight:900;
    font-size:17px;
    letter-spacing: 0.045em;
}

.btn svg {
    position: absolute;
    top: 0;
    left: 0;
}

.btn svg rect {
    /* //stroke: #EC0033; */
    stroke-width: 4;
    stroke-dasharray: 353, 0;
    stroke-dashoffset: 0;
    -webkit-transition: all 600ms ease;
    transition: all 600ms ease;
}

.btn span{
  background: rgb(255,130,130);
  background: -moz-linear-gradient(left,  rgba(255,130,130,1) 0%, rgba(225,120,237,1) 100%);
  background: -webkit-linear-gradient(left,  rgba(255,130,130,1) 0%,rgba(225,120,237,1) 100%);
  background: linear-gradient(to right,  rgba(255,130,130,1) 0%,rgba(225,120,237,1) 100%);
  filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ff8282', endColorstr='#e178ed',GradientType=1 );
  
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
}

.btn:hover svg rect {
    stroke-width: 4;
    stroke-dasharray: 196, 543;
    stroke-dashoffset: 437;
}
</style>