<template>
    <div id="app">
        <Login v-if="!loginstate"></Login>
        <visual v-else-if="false"></visual>
        <admin v-else></admin>
    </div>
</template>

<script>
    export default {
        name: 'Index',
        components: {
        },
        computed: {
            loginstate() {
                return this.$store.state.loginfo.state
            }
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
