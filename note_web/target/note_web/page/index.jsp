<%@ page language="java" isThreadSafe="true" pageEncoding="utf8"%>
<%
	String basePath = request.getContextPath();
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title></title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/common.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/main_layout.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/index.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>/css/theme_common.css" id="theme" />

<!--引入UEditor的文件-->
<!-- 配置文件 -->
<script type="text/javascript" src="<%=basePath%>/js/plugins/UEditor_all/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="<%=basePath%>/js/plugins/UEditor_all/ueditor.all.js"></script>

</head>

<body>
	<div class="headBar">
		<div class="headBar-content">
			<div class="headBar-logo padding-l15 padding-r15">个人笔记</div>
			<div class="seperate-w float-l"></div>
			<div class="headBar-tool padding-l10 padding-r15">
				<img id="theme-img" src="<%=basePath%>/img/icon/theme.png" alt="" width="30px" height="30px" />
			</div>
			<div class="seperate-w float-r"></div>
			<div class="headBar-info padding-r15">个人信息就在这儿呀</div>
		</div>
	</div>
	<div class="container">
		<div class="container-menu">
			<div class="menuBar">
				<img src="<%=basePath%>/img/icon/icon.png" alt="" style="vertical-align: middle;" class="" />
			</div>
			<ul class="menuItems">
				<li class="menuItem">
					<div class="m-item-icon">
						<img src="<%=basePath%>/img/icon/icon.png" />
					</div>
					<div class="m-item-desc">menudsadsadsadsad</div>
				</li>
				<li class="menuItem">
					<div class="m-item-icon">
						<img src="<%=basePath%>/img/icon/icon.png" />
					</div>
					<div class="m-item-desc">menu</div>
				</li>
				<li class="menuItem">
					<div class="m-item-icon">
						<img src="<%=basePath%>/img/icon/icon.png" />
					</div>
					<div class="m-item-desc">menu</div>
				</li>
				<li class="menuItem">
					<div class="m-item-icon">
						<img src="<%=basePath%>/img/icon/icon.png" />
					</div>
					<div class="m-item-desc">menu</div>
				</li>
				<li class="menuItem">
					<div class="m-item-icon">
						<img src="<%=basePath%>/img/icon/icon.png" />
					</div>
					<div class="m-item-desc">menu</div>
				</li>
			</ul>
		</div>
		<div class="fileList float-l margin-r5 hide" style="">
			<div class="fileList-headBar"></div>
		</div>
		<div class="container-content" style="">
			<div class="content-article">
				<div class="article-title">
					<div class="article-title-input">
						<input type="text" name="title" placeholder="请输入标题" />
					</div>
					<div class="article-title-tool">
						<label class="button btn-save padding-r5 border-r ">
							<img class="" src="<%=basePath%>/img/icon/save-b.png" width="25" height="25" /> 保存
						</label>
						<label class="button btn-alter padding-l10 padding-r5 border-r hide">
							<img class="" src="<%=basePath%>/img/icon/edit-b.png" width="25" height="25" /> 编辑
						</label>
						<label class="button btn-delete padding-l10 padding-r15">
							<img class="" src="<%=basePath%>/img/icon/delete-b.png" width="25" height="25" /> 删除
						</label>
					</div>
				</div>
				<hr style="clear: all; margin-top: 3px;" />
				<div class="article-content">
					<div class="article-content-innerhtml"></div>
					<script id="UEditor-article" style="height: 500px;" name="content" type="text/plain">
					</script>
				</div>
			</div>
		</div>
	</div>
</body>
<script src="<%=basePath%>/js/jquery-1.12.3.min.js" type="text/javascript" charset="utf-8"></script>
<script src="<%=basePath%>/js/UEditor_init.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		var GLOBLE = {
			article : {
				title : "",
				url : "",
				content : "",
				contentHTML : "",
				createTime : "",
				isEdit : false,
				draftCatch : ""
			},
			user : {
				userName : "",
				isLogin : false
			},
			menu : {

			},
			layout : {

			},
			basePath:'<%=basePath%>'
		};

		$(".article-content-innerhtml").hide();

		$(".btn-save").click(function() {
			$(".btn-alter").show();
			$(".article-title-input input").attr("disabled", true);
			$(this).hide();
			var html = ue.getContent();
			$(".article-content-innerhtml").html(html).show();
			ue.setHide();
		});

		$(".btn-alter").click(function() {
			$(".btn-save").show();
			$(".article-title-input input").attr("disabled", false);
			$(this).hide();
			$(".article-content-innerhtml").hide();
			ue.setShow();
		});

		$(".btn-delete").click(function() {
			console.log("哎呀！出错了，待我去禀报小主才能删除，客官稍候...");
		});

		$("#theme-img").click(function() {
			$("#theme").attr("href", "<%=basePath%>/css/theme_new.css");
		});

		$(".menuBar").click(function() {
			if (!$(".container-menu").hasClass("subnail")) {
				$(".m-item-desc").hide();
				$(".container-menu").addClass("subnail");
			} else {
				$(".m-item-desc").show();
				$(".container-menu").removeClass("subnail");
			}
		});

		$(".menuItem").click(function() {
			/*操作是否展开详细*/
			if ($(this).hasClass("showFileList")) {
				$(".fileList").hide();
				$(".menuItem").removeClass("showFileList");
			} else {
				$(".fileList").show();
				$(".menuItem").removeClass("showFileList");
				$(this).addClass("showFileList");
			}
			$(".menuItem").removeClass("menuItemSelected");
			$(this).addClass("menuItemSelected");

		});

	}); //window.load

	ue.ready(function() {
		//this是当前创建的编辑器实例
	});
</script>

</html>