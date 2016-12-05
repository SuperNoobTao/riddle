/**
 * Create by kirika
 * js for radio list 
 **/
 $(function() {
 	$(".radioList .image").lazyload();
 	$(".tab").click(function(){
        if($(this).hasClass('current')){
            return;
        }
        $(this).addClass('current').siblings().removeClass('current');
        $(".radioList").empty();
        if($(this).index()==0){
            //最新
            //ajax here
        }
        else{
            //最热
            //ajax here
        }
    });
 	$(".commonContent").bind("scroll",function(){
 		if($(".radioList li").length<1 || $(".commonContent").find('#load').length>0){
 			return;
 		}
 		if( $(this).scrollTop()>$(".radioList").height()-$(this).height()-10){
 			$(".commonContent").append($('<div id="load">正在加载</div>'));
            //ajax here
        	setTimeout(function(){
        		var $newitem=$('<li><a href="#"><div class="image" data-original="img/testimg/viper_corner.jpg"></div><p class="title">早安展讯</p><p class="content">早安展讯，希望大家做好整体精力管理，正能量充满每一天</p></a></li>');
        		$(".radioList").append($newitem);
        		$newitem.find('.image').lazyload();
        		$("#load").remove();
        	},1000);
        
    	}
	});
});