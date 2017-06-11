<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
  <head>
    <title>国家列表分页展示</title>
      <link rel="stylesheet" type="text/css" href="../jslib/jquery-easyui-1.4.1/themes/default/easyui.css" />
      <link rel="stylesheet" type="text/css" href="../jslib/jquery-easyui-1.4.1/themes/icon.css" />
      <link rel="stylesheet" type="text/css" href="../css/taotao.css" />
      <script type="text/javascript" src="../jslib/jquery-easyui-1.4.1/jquery.min.js"></script>
      <script type="text/javascript" src="../jslib/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
      <script type="text/javascript" src="../jslib/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
      <script type="text/javascript" src="../jslib/common.js"></script>
  </head>


  <body>
    <table id="dg"></table>
  </body>
    
<script>
    $(document).ready(function () {
        $('#dg').datagrid({
            url:'/car/list',
            pagination: true,
            columns:[[
                {field:'carid',title:'车辆ID',width:100},
                {field:'carno',title:'车辆',width:100},
                {field:'userid',title:'司机ID',width:100},
                {field:'driver',title:'司机',width:100},
                {field:'mobile',title:'手机号',width:100},
                {field:'gpsid',title:'GPS ID',width:100},
                {field:'lastid',title:'最后所在GPS位置ID',width:100},
                {field:'created',title:'创建时间',width:100},
                {field:'carstatus',title:'车辆状态',width:100,align:'center'},
                {field:'driverstatus',title:'司机状态',width:100,align:'right',align:'center'},
                {field:'lockstatus',title:'电子锁状态',width:100,align:'right',align:'center'}
            ]]
        });

    });
</script>
</html>
