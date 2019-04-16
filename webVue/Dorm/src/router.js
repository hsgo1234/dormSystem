import Vue from "vue";
import Router from "vue-router"
Vue.use(Router);

const requireComponent = require.context(
    // 其组件目录的相对路径
    "./",
    // 是否查询其子目录
    true,
    // 匹配基础组件文件名的正则表达式
    /[A-Z]\w+\.(vue|js)$/
);

const routes = requireComponent.keys().map(fileName => {
  // 获取组件配置
  const componentConfig = requireComponent(fileName);
  const componentName = fileName.split("/")[fileName.split("/").length-1].split(".")[0];
  const component = Vue.component(
      componentName,
      // 如果这个组件选项是通过 `export default` 导出的，
      // 那么就会优先使用 `.default`，
      // 否则回退到使用模块的根。
      componentConfig.default || componentConfig
  );
  return {
    path:`/${componentName}`,
    name:componentName,
    component
  }

});
export default new Router({
  routes
});
