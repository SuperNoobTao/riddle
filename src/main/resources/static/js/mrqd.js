/**
 * Create by wsl
 * js for qiandao and baoming
 **/
//点击签到-已签到。签到成功后直接给.sign1加上class：disabled可以改变上面的字和颜色
/**
$(function(){
$(".click").click(function(){
	$(this).hide()
	.siblings('.day').hide()
	.siblings('.click1').show()
	.parent().css({"background-color": "#cccccc"})
});
});
**/


//查看更多
$(function(){
	var screenWidth=$(window).width();
if (screenWidth<330){
	$(".more").click(function(){
		$(this).hide().siblings('.apostrophe2').hide()
		.siblings('.rule2').css({"overflow":"visible","height":"200px"}).children('.br1').css("display","inline")
		.parent().siblings('.close').show();
	});
}else {
	$(".more").click(function(){
		$(this).hide().siblings('.apostrophe2').hide()
		.siblings('.rule2').css({"padding-bottom":"10px","height":"auto"}).children('.br1').css("display","inline")
		.parent().siblings('.close').show();
	});
}
	$(".close").click(function(){
		$(this).hide().siblings('.apostrophe2').show()
		.siblings('.rule2').removeAttr('style').children('.br1').css("display","none")
		.parent().siblings('.more').show();
});
});


//头像展开

$(function(){
	
	$(".apostrophe").click(function(){
		$(this).hide().parent().css({"overflow":"visible"}).siblings('.close1').css("display","inline");
	});
	$(".close1").click(function(){
		$(this).hide().siblings(".head").css({"overflow":"hidden","height":"30px"}).children('.apostrophe').show();
	});
});


//判定省略号是否存在
$(function(){
	var headWidth=$(".head").width();
	var Size = $(".head").children().length;
if (Size*40 > headWidth ){
		$(".apostrophe").show();
}else{
	$(".apostrophe").hide();
}
});