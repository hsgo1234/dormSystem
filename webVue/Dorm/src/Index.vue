<template>
    <div id="app">
        <Login v-if="false"></Login>
        <visual v-else-if="false"></visual>
        <admin v-else></admin>
    </div>
</template>

<script>
    import Login from "./views/Login";
    import Visual from "./views/Visual";
    import Admin from "./views/Admin";
    export default {
        name: 'Index',
        components: {
            Admin,
            Visual,
            Login
        }
    }
</script>

<style>
    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
    }
    body{
        margin: 0 0;
    }
</style>
