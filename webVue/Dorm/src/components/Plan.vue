<template>
    <div style="height:100%;width:100%;">
        <el-row type="flex" class="row-bg">
            <el-col :span="3"><div class="grid-content bg-purple">浮山公寓</div></el-col>
            <el-col :span="3"><div class="grid-content bg-purple">鸿园</div></el-col>
            <el-col :span="3"><div class="grid-content bg-purple">鸡舍</div></el-col>
            <el-col :span="3"><div class="grid-content bg-purple">鸟笼</div></el-col>
        </el-row>
        <el-row type="flex" class="row-bg" justify="space-around">
            <el-col :span="12"><div class="grid-content bg-purple grid-content-content"></div></el-col>
            <el-col :span="6"><div class="grid-content bg-purple grid-content-content"></div></el-col>
            <el-col :span="6"><div class="grid-content bg-purple grid-content-content"></div></el-col>
        </el-row>

        <el-row class="row-bg-foot">
            <el-col :span="24"><div class="grid-content grid-content-content"></div></el-col>
        </el-row>
    </div>
</template>

<script>
    export default {
    }
</script>

<style>
    .bg-purple {
        background: #161e33;
    }
    .grid-content {
        border-radius: 4px;
        min-height: 2.1vw;
        line-height: 2.1vw;
        margin-left: 1vw;
    }
    .grid-content-content{
        min-height: 24vw;
        background-color: #030a1d;
    }
    .row-bg {
        padding: 1vw;
        color: #fff;
        font-size: 1vw;
    }
    .row-bg-foot{
        padding: 0 1vw;
        color: #fff;
        font-size: 1vw;
    }
</style>