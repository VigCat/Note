<%@ page language="java" isThreadSafe="true" pageEncoding="utf8"%>
<%
	String basePath = request.getContextPath();
%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="X-UA-Compatible" content="IE=IE9">
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
<script type="text/javascript" charset="utf-8" src="<%=basePath%>/js/plugins/UEditor_all/lang/zh-cn/zh-cn.js"></script>
<script src="<%=basePath%>/js/jquery-1.12.3.min.js" type="text/javascript"></script>

</head>

<body>
	<div class="headBar">
		<div class="headBar-logo padding-l15 padding-r15">个人笔记</div>
		<div class="seperate float-l"></div>
		<div class="headBar-tool padding-l10 padding-r15 margin-t5">
			<img id="theme-img" src="<%=basePath%>/img/icon/theme.png" alt="" width="30px" height="30px" />
		</div>
		<div class="seperate float-r"></div>
		<div class="headBar-info padding-r15">个人信息就在这儿呀</div>
	</div>
	<div class="container">
		<div class="container-menu">
			<div class="menuBar">
				<img src="<%=basePath%>/img/icon/icon.png" alt="" style="vertical-align: middle;" class="" />
			</div>
			<div class="menuItems">
				<div class="ulcontainer"></div>
				<div class="menuToolsContainer">
					<ul class="menuTools">
						<li class="menuTool">
							<div class="m-tool-icon">
								<img src="<%=basePath%>/img/icon/icon.png" />
							</div>
							<div class="m-tool-desc">tooltool</div>
						</li>
						<li class="menuTool">
							<div class="m-tool-icon">
								<img src="<%=basePath%>/img/icon/icon.png" />
							</div>
							<div class="m-tool-desc"><%=basePath%><%=basePath%>tool
							</div>
						</li>
						<li class="menuTool">
							<div class="m-tool-icon">
								<img src="<%=basePath%>/img/icon/icon.png" />
							</div>
							<div class="m-tool-desc">tool</div>
						</li>
						<li class="menuTool">
							<div class="m-tool-icon">
								<img src="<%=basePath%>/img/icon/icon.png" />
							</div>
							<div class="m-tool-desc">tool</div>
						</li>
						<li class="menuTool">
							<div class="m-tool-icon">
								<img src="<%=basePath%>/img/icon/icon.png" />
							</div>
							<div class="m-tool-desc">tool</div>
						</li>
						<li class="menuTool">
							<div class="m-tool-icon">
								<img src="<%=basePath%>/img/icon/icon.png" />
							</div>
							<div class="m-tool-desc">tool</div>
						</li>
						<li class="menuTool">
							<div class="m-tool-icon">
								<img src="<%=basePath%>/img/icon/icon.png" />
							</div>
							<div class="m-tool-desc">tool</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="fileList float-l margin-r5 hide" style="">
			<div class="fileList-headBar">
				<img src="" class="add" alt="+" />
			</div>
			<div class="fileList-content">
				<ul class="fileList-items">
				</ul>
			</div>
		</div>
		<div class="container-content" style="">
			<div class="content-article">
				<div class="article-title-container">
					<div class="article-title">
						<input id="title" type="text" name="title" placeholder="请输入标题" />
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
					<div class="article-info">
						<div class="info-contianer">字数: 108;大小:108k;date:2017-02-22</div>
					</div>
				</div>
				<div class="article-content">
					<div class="article-content-innerhtml"></div>
					<script id="UEditor-article" style="height: 500px;" name="content" type="text/plain">
						</script>
					<div class="saprate-v"></div>

					<div class="footer">
						<ul>
							<li>
								<ul>
									<li>2123</li>
									<li><%=1 + 2 + 3%></li>
									<li>2123</li>
									<li>2123</li>
								</ul>
							</li>
							<li>
								<ul>
									<li>2123</li>
									<li>2123</li>
									<li>2123</li>
									<li>2123</li>
								</ul>
							</li>
							<li>
								<ul>
									<li>2123</li>
									<li>2123</li>
									<li>2123</li>
									<li>2123</li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
<script src="<%=basePath%>/js/UEditor_init.js" type="text/javascript"></script>
<script type="text/javascript">
	var GLOBLE = {
		dataStore : {},
		currentData : {
			username : "",
			id : "",
			content : "",
			title : "",
			parentid : "",
			createtime : "",
			url : "",
		},
		user : {
			userName : "",
			isLogin : false
		},
		menu : {
			current : {}
		},
		layout : {

		},
		basePath : ''
	};
	$(function() {
		loadMenu($(".menuItems>.ulcontainer"), 0);
		$(".add").click(function() {
			console.log("add");
			GLOBLE.currentData = {};
			$(".article-title input[name=title]").attr("disabled", false);
			$(".article-info .info-contianer").html("");
			$(".article-content-innerhtml").html("").hide();
			$(".btn-save").show();
			$(".btn-alter").hide();
			ue.setShow();
		});

		$(".article-content-innerhtml").hide();

		$(".btn-save").click(function() {
			//logAll(GLOBLE.currentData);
			//console.log(GLOBLE.menu.current.id);
			//return;
			$(".btn-alter,.btn-save,.article-content-innerhtml").toggle();
			$(".article-title input[name=title]").attr("disabled", true);
			$(".article-content-innerhtml").html(ue.getContent());
			ue.setHide();
			var data = {
				id : GLOBLE.currentData.id,
				content : $(".article-content-innerhtml").html(),
				title : $(".article-title input[name=title]").val(),
				fkparentid : GLOBLE.menu.current.id,
				createtime : GLOBLE.currentData.createtime,
				url : GLOBLE.currentData.url
			};
			logAll(data);
			$.ajax({
				type : "POST",
				url : "/note_web/note/saveNote.action",
				data : {
					id : GLOBLE.currentData.id,
					content : $(".article-content-innerhtml").html(),
					title : $(".article-title input[name=title]").val(),
					fkparentid : GLOBLE.menu.current.id,
					createtime : GLOBLE.currentData.createtime,
					url : GLOBLE.currentData.url
				},
				dataType : "json",
				success : function(data) {
					//alert(data[1].title + " : " + data[1].id);
					//logAll(data);
					GLOBLE.currentData = data;
					//alert("data");
					$(".menuItemSelected").click();
				},
				error : function() {
					alert("保存失败");
				}
			});

		})

		$(".btn-alter").click(function() {
			$(".btn-save,.btn-alter,.article-content-innerhtml").toggle();
			$(".article-title input[name=title]").attr("disabled", false);
			//$(".article-content-innerhtml").hide();
			ue.setContent($(".article-content-innerhtml").html());
			ue.setShow();
		});

		$(".btn-delete")
				.click(
						function() {
							$
									.ajax({
										url : "/note_web/note/delNoteById.action",
										type : "post",
										data : {
											id : GLOBLE.currentData.id
										},
										dataType : "text",//返回值类型
										contentType : "application/x-www-form-urlencoded; charset=UTF-8",
										success : function(data) {
											reloadList();
										},
										error : function() {
											alert("删除失败");
										}
									});
						});

		$("#theme-img").click(function() {
			$("#theme").attr("href", "css/theme_new.css");
		});

		$(".menuBar").click(function() {
			if (!$(".container-menu").hasClass("subnail")) {
				$(".m-item-desc,.m-tool-desc").hide();
				$(".container-menu").addClass("subnail");
			} else {
				$(".m-item-desc,.m-tool-desc").show();
				$(".container-menu").removeClass("subnail");
			}
		});
	});

	function note_init(data) {
		GLOBLE.currentData = data;
		$(".article-title input[name=title]").val(data.title).attr("disabled",
				true);
		$(".article-info .info-contianer").html(data.createtime);
		$(".btn-save").hide();
		$(".btn-alter").show();
		ue.setHide();
	}
	function fileList_getNote(obj) {
		var id = $(obj).attr("data-item-id");
		$.ajax({
			url : "/note_web/note/selectById.action",
			type : "POST",
			//async : true,
			data : {
				"id" : id
			},
			dataType : "json",//返回值类型
			//contentType:
			/*
			"application/x-www-form-urlencoded; charset=UTF-8" 默认值
			multipart/form-data  文件上传
			application/json   json对象
			 */
			contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			success : function(data) {
				//logAll(data);
				note_init(data.note);
				$(".article-content-innerhtml").html(data.content).show();
			},
			error : function() {
				console.log("note Load Error...");
			}
		});
	}
	function file_initItem(data) {
		console.log("new");
		var noteList = "";
		for ( var i in data) {
			noteList += "<li class='fileList-item' onclick='fileList_getNote(this)' data-item-id="
					+ data[i].id
					+ ">"
					+ "	<section>"
					+ "		<header>"
					+ data[i].title
					+ "</header>"
					+ "		<article>"
					+ "			<div class='sub'>"
					+ data[i].createtime
					+ "</div>"
					+ "			<div class='detail'>"
					+ (data[i].description == null ? "" : data.description)
					+ "</div>"
					+ "		</article>"
					+ " </section>"
					+ " <div class='saprate-line'></div>" + " </li>";
		}
		$(".fileList-content>ul").html(noteList);
	}
	function menu_click_data_action(obj) {
		/* if (GLOBLE.dataStore[obj.id] != undefined) {
			file_initItem(GLOBLE.dataStore[obj.id]);
			return;
		} */
		GLOBLE.menu.current.id = obj.id;
		$.ajax({
			type : "POST",
			url : "/note_web/note/selectByParentID.action",
			data : {
				"menuID" : obj.id
			},
			dataType : "json",
			success : function(data) {
				//数据缓存，减少请求次数
				GLOBLE.dataStore[obj.id] = data;
				file_initItem(data);
			},
			error : function() {
				console.log("数据加载失败,请联系管理员。");
			}
		});
	}
	//操作是否展开详细
	function menu_click_UI_action(obj) {
		if ($(obj).hasClass("showFileList")) {
			$(".fileList").hide();
			$(".menuItem").removeClass("showFileList");
		} else {
			$(".fileList").show();
			$(".menuItem").removeClass("showFileList");
			$(obj).addClass("showFileList");
		}
		$(".menuItem").removeClass("menuItemSelected");
		$(obj).addClass("menuItemSelected");
	}
	//点击菜单的操作
	function menu_click(obj, event) {
		$(obj).find(".submenu").toggle();
		loadMenu($(obj).find(".submenu"), $(obj).attr("data-menu-id"));
		menu_click_UI_action(obj);
		menu_click_data_action({
			id : $(obj).attr('data-menu-id')
		});
		//中断事件冒泡
		event.stopPropagation();
	}

	function init_menu(target, data) {
		if (data.length == 0)
			return;
		target.removeClass("hide");
		//alert(target);
		var mItems = "";
		for ( var i in data) {
			mItems += "<li class='menuItem' onClick='menu_click(this,window.event)' data-menu-id="
					+ data[i].id
					+ ">"
					+ "<div class='m-item-icon'>"
					+ "<img src='"
					+ (data.iconUrl == undefined ? '/note_web/img/icon/icon.png'
							: data.iconUrl)
					+ "'/></div>"
					+ "<div class='m-item-desc'>"
					+ data[i].description
					+ "</div><div class='submenu hide'></div>" + "</li>";
		}
		target.html("<ul>" + mItems + "</ul>");
	}

	function loadMenu(target, parentid) {
		$.ajax({
			type : "POST",
			url : "/note_web/menu/selectByParentId.action",
			dataType : "json",
			data : {
				id : parentid
			},
			success : function(data) {
				init_menu(target, data);
			},
			error : function() {
				alert("菜单加载失败,请联系管理员。");
				return false;
			}
		});
	}
	function logAll(obj, startStr, endStr) {
		if (typeof obj != "object") {
			return;
		}
		var str = "";
		for ( var i in obj) {
			if (i != "logAll") {
				str += i + " : " + obj[i] + ",\n";
				logAll(obj[i]);
			}
		}
		console.log((startStr == undefined ? "" : startStr) + str
				+ (endStr == undefined ? "" : endStr));
	}
	//window.load

	/* 	ue.ready(function() {
			//this是当前创建的编辑器实例
		}); */
</script>

</html>