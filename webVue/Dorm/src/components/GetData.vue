<template>
    <div style="width: 100%;height: 100%;color: #ffffff;">
        <ul>
            <li>
                {{respond}}
            </li>
        </ul>
    </div>
</template>

<script>
    export default {
        name: "GetData",
        data: function(){
            return {
                respond: [],
                person:{
                    id:12,
                    name:"ld",
                    age:16
                }
            }
        },
        mounted: function() {
            console.log(this.person);
            this.$http.post("http://localhost:8090/test",this.person).then(response =>{
                this.respond = response.data;
            }, response =>{
                this.respond = "no find"+response
            })
        }
    }
</script>

<style scoped>

</style>