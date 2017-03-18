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
	</head>

	<body>
		<div class="headBar">
			<div class="headBar-content">
				<div class="headBar-logo padding-l15 padding-r15">个人笔记</div>
				<div class="seperate float-l"></div>
				<div class="headBar-tool padding-l10 padding-r15">
					<img id="theme-img" src="img/icon/theme.png" alt="" width="30px" height="30px" />
				</div>
				<div class="seperate float-r"></div>
				<div class="headBar-info padding-r15">个人信息就在这儿呀</div>
			</div>
		</div>
		<div class="container">
			<div class="container-menu">
				<div>
					<label for="" class="menuBar">三</label>
				</div>
				<ul class="menuItems">
					<li class="menuItem">
						<div class="m-item-icon">
							<img src="img/icon/icon.png" />
						</div>
						<div class="m-item-desc">menu</div>
					</li>
					<li class="menuItem">
						<div class="m-item-icon">
							<img src="img/icon/icon.png" />
						</div>
						<div class="m-item-desc">menu</div>
					</li>
					<li class="menuItem">
						<div class="m-item-icon">
							<img src="img/icon/icon.png" />
						</div>
						<div class="m-item-desc">menu</div>
					</li>
					<li class="menuItem">
						<div class="m-item-icon">
							<img src="img/icon/icon.png" />
						</div>
						<div class="m-item-desc">menu</div>
					</li>
					<li class="menuItem">
						<div class="m-item-icon">
							<img src="img/icon/icon.png" />
						</div>
						<div class="m-item-desc">menu</div>
					</li>
				</ul>
			</div>
			<div class="container-content">
				<div class="article">
					<div class="article-title">
						<div class="article-title-input">
							<input type="text" class="" placeholder="请输入文章标题" />
						</div>
						<div class="article-title-tool"></div>
					</div>
					<hr />
					<div class="article-content">
						<textarea name="" rows="15" cols="150"></textarea></div>
				</div>
			</div>
		</div>
	</body>
	<script src="<%=basePath%>/js/jquery-1.12.3.min.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript">
		$(function() {
			$("#theme-img").click(function() {
				$("#theme").attr("href", "css/theme_new.css")
			});

			$(".menuBar").click(function() {
				if($(".container-menu").attr("class").indexOf("subnail") == -1) {
					$(".m-item-desc").hide();
					$(".container-menu").addClass("subnail");
				} else {
					$(".m-item-desc").show();
					$(".container-menu").removeClass("subnail");
				}
			});

		})
	</script>
</html>