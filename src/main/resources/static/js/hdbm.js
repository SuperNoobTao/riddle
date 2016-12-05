/**
 * Create by 
 * common js for 
 * 签到和报名用同一个mrqd.js了，此文件不用了
 **/
//点击报名-已报名
/**
$(function(){
$(".click").click(function(){
	$(this).hide().siblings('.click1').show().parent().siblings('.success').show();
});
});
**/

//查看更多
$(function(){
	var screenWidth=$(window).width();
if (screenWidth<330){
	$(".more").click(function(){

		$(this).hide().siblings('.apostrophe2').hide()
		.siblings('.rule2').css({"overflow":"visible","height":"170px"}).children('.br1').css("display","inline")
		.parent().siblings('.close').show();
});
}else {
	$(".more").click(function(){

		$(this).hide().siblings('.apostrophe2').hide()
		.siblings('.rule2').css({"overflow":"visible","height":"135px"}).children('.br1').css("display","inline")
		.parent().siblings('.close').show();

	});
};
$(".close").click(function(){
		$(this).hide().siblings('.apostrophe2').show()
		.siblings('.rule2').css({"overflow":"hidden","height":"30px"}).children('.br1').css("display","none")
		.parent().siblings('.more').show();
});
});


//头像展开
/**
$(function(){
	
	$(".apostrophe").click(function(){
		$(this).hide().parent().css({"overflow":"visible"}).siblings('.close1').css("display","inline");
	});
	$(".close1").click(function(){
		$(this).hide().siblings(".head").css({"overflow":"hidden","height":"30px"}).children('.apostrophe').show();
	});
});
**/


