<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            url:'/gps/list',
            pagination: true,
            columns:[[
                {field:'gpsid',title:'GPS ID',width:100},
                {field:'longitude',title:'经度',width:100},
                {field:'latitude',title:'纬度',width:100},
                {field:'speed',title:'速度',width:100},
                {field:'direction',title:'方向',width:100},
                {field:'location',title:'位置',width:100},
                {field:'extra',title:'其他信息',width:100},
                {field:'created',title:'创建时间',width:100},
                {field:'status',title:'状态',width:100,align:'center'}
            ]]
        });

    });
</script>
</html>
