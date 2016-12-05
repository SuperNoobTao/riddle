/**
 * Create by 
 * common js for 
 **/

$(function() {
	//判断可以点击登录
	$("input").keydown(function() {
		var $user = $(".user")
		var $password = $(".password")
		if ($user.val() !== "" && $password.val() !== "") {
			$(".click").css({
				"background-color": "#a28c67"
			});
			//$(".click").click(function() {
			//
			//	$(".error").css({
			//		"display": "inline"
			//	})
			//
			//});

		};
	});
	//焦点在input上时，错误隐藏
	$("input").focus(function(){
		$(this).parents(".denglu").siblings('.error').css({"display":"none"});
	});
	//焦点在input上时 对应的input清空value
	$("input").click(function(){
		$(this).val("")
	});

});