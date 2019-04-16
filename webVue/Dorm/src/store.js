import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    screenporps: {
      screenwidth: window.innerWidth,
      screenheight: window.innerHeight
    }
  },
  mutations: {
    screenporpschange() {
      this.state.screenporps.screenwidth = window.innerWidth;
      this.state.screenporps.screenheight = window.innerHeight;
    }
  },
  actions: {}
});

