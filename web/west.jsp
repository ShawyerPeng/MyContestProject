<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="inc.jsp"/>
<script type="text/javascript">
var layout_west_tree;
	$(function() {
		layout_west_tree = $('#layout_west_tree').tree({
			onClick : function(node) {
					addTab({
						url : node.attributes.url,
						title : node.text,
					});
			},
		});
	});

	function addTab(params) {
		var iframe = '<iframe src="' + params.url + '" frameborder="0" style="border:0;width:100%;height:98%;"></iframe>';
		var t = $('#index_tabs');
		var opts = {
			title : params.title,
			closable : true,
			content : iframe,
			border : false,
			fit : true
		};
		if (t.tabs('exists', opts.title)) {
			t.tabs('select', opts.title);
			parent.$.messager.progress('close');
		} else {
			t.tabs('add', opts);
		}
	}
</script>
</head>

<body>

			<ul class="easyui-tree" id="layout_west_tree">
				<li>
					<span>账户管理</span>
					<ul>
						<li data-options="attributes:{'url':'${pageContext.request.contextPath}/account/accountmanage'}"> <span>个人中心</span>  </li>
					</ul>
				</li>
				<li>
					<span>信息管理</span>
					<ul>
						<li data-options="attributes:{'url':'${pageContext.request.contextPath}/users/usersmanage'}"> <span>司机信息</span>  </li>
						<li data-options="attributes:{'url':'${pageContext.request.contextPath}/car/carmanage'}"> <span>车辆信息</span>  </li>
						<li data-options="attributes:{'url':'${pageContext.request.contextPath}/gps/gpsmanage'}"> <span>GPS信息</span>  </li>
					</ul>
				</li>
				<li>
					<span>车辆监管</span>
					<ul>
						<li data-options="attributes:{'url':'http://lbsyun.baidu.com/trace/admin/managerdemo?service_id=134858'}"> <span>车辆监控</span> </li>
						<li data-options="attributes:{'url':'${pageContext.request.contextPath}/index'}"> <span>车辆控制</span>  </li>
					</ul>
				</li>
			</ul> 
		
</body>
</html>