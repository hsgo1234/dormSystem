<template>
    <div style="width: 100%;height: 100%;color: #ffffff;">
        <ul>
            <li v-for="item in respond" :key="item.id">
                {{item.id}}:{{item.name}}:{{item.age}}
            </li>
        </ul>
    </div>
</template>

<script>
    export default {
        name: "GetData",
        data: function(){
            return {
                respond: []
            }
        },
        mounted: function() {
            this.$http.get("http://localhost:8090/selectAll").then(response =>{
                this.respond = response.body;
            }, response =>{
                this.respond = "no find"+response
            })
        }
    }
</script>

<style scoped>

</style>