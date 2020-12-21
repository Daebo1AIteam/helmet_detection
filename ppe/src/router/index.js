import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
import Result from '../views/Result.vue'
import Main from '../views/Main.vue'
import Capture from '../views/Capture.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/login',
    name: 'login',
    component: Login
  },
  {
    path: '/result',
    name: 'result',
    component: Result
  },
  {
    path: '/main',
    name: 'main',
    component: Main
  },
  {
    path: '/capture',
    name: 'capture',
    component: Capture

  }

]

const router = new VueRouter({
  mode: "history",
  routes,
});

export default router
