<template>
  <button class="kakao_btn" @click="loginKakao">kakao</button>
</template>

<script>
export default {
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
                success : res => {
                    const kakao_account = res.kakao_account;
                    const userInfo = {
                        nickname : kakao_account.profile.nickname,
                        email : kakao_account.email,
                        password : '',
                        // account_type : 2,
                    }   
                }
            })
        }
    }
}

</script>

<style>

</style>