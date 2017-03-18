var ue = UE.getEditor("UEditor-article", {
	toolbars: [
		[ 
			'source', //源代码
			'preview', //预览
			"|",
			'removeformat', //清除格式
			'formatmatch', //格式刷
			'pasteplain', //纯文本粘贴模式
			"|",
			/*操作按钮*/
			'undo', //撤销
			'redo' //重做
		],
		[
		'fullscreen', //全屏
			/*字体设置*/
			'fontfamily', //字体
			'fontsize', //字号
			'bold', //加粗
			'indent', //首行缩进 
			'italic', //斜体
			'underline', //下划线
			'subscript', //下标
			'superscript', //上标
			'touppercase', //字母大写
			'tolowercase', //字母小写
			'blockquote', //引用
			'forecolor', //字体颜色
			'backcolor', //背景色
			'justifyleft', //居左对齐
			'justifyright', //居右对齐
			'justifycenter', //居中对齐
			'justifyjustify', //两端对齐
			'lineheight', //行间距
			'insertorderedlist', //有序列表
			'insertunorderedlist', //无序列表
			'imagenone', //默认
			'imageleft', //左浮动
			'imageright', //右浮动
			'imagecenter', //居中
			'wordimage', //图片转存
			"|",
			'horizontal', //分隔线
			'time', //时间
			'date', //日期
			'insertcode', //代码语言
			'simpleupload', //单图上传
			'insertimage', //多图上传
			'link', //超链接
			'emotion', //表情
			'spechars', //特殊字符
			'searchreplace', //查询替换
			'attachment', //附件
			'insertvideo', //视频
			'music', //音乐
			"|",
			'background', //背景
			'template', //模板
			'autotypeset', //自动排版
			'help'
		]
	],
	initialFrameWidth: "null",
	autoHeightEnabled: false,
	autoFloatEnabled: false,
	elementPathEnabled: false,
	enableAutoSave: false
});
