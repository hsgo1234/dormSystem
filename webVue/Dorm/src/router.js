import Vue from "vue";
import Router from "vue-router";
import Login from "./views/Login.vue";
import Admin from "./views/Admin.vue";
import Visual from "./views/Visual.vue";
import Plan from "./components/Plan.vue";

Vue.use(Router);

export default new Router({
  routes: [
    { path: "/login", component: Login },
    { path: "/visual", component: Visual },
    { path: "/admin", component: Admin },
    { path: "/plan", component: Plan }
  ]
});
