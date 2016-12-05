/**
 * Create by kirika
 * js for test list 
 **/
 $(function() {
 	$(".testList .image").lazyload();
    $(".tab").click(function(){
        if($(this).hasClass('current')){
            return;
        }
        $(this).addClass('current').siblings().removeClass('current');
        $(".testList").empty();
        if($(this).index()==0){
            //最新
            //ajax here
        }
        else{
            //最热
            //ajax here
        }
    });
    $("i[class*=icon-zx-xin]").click(function(){
        favor($(this));
        return false;
    });
 	$(".commonContent").bind("scroll",function(){
        if($(".testList li").length<1 || $(".commonContent").find('#load').length>0){
            return;
        }
 		if($(this).scrollTop()>$(".testList").height()-$(this).height()-10){
 			$(".commonContent").append($('<div id="load">正在加载</div>'));
            //ajax here
        	setTimeout(function(){
        		var $newitem=$('<li><a href="#">\
                    <div class="image" data-original="img/testimg/viper_corner.jpg"></div>\
                    <p class="title">16年秋季第一次体检</p>\
                    <p class="content"><span class="time">9月30日</span><span>市人民医院</span></p>\
                    </a>\
                    <i class="icon-zx-xin"></i></li>');
        		$(".testList").append($newitem);
        		$newitem.find('.image').lazyload();
                $newitem.find('i[class*=icon-zx-xin]').click(function(){
                    favor($(this));
                    return false;
                });
        		$("#load").remove();
        	},1000);
        
    	}
	});

    function favor($icon){
        if($icon.hasClass('icon-zx-xin-stroke')){
            //收藏
            //ajax here
            $icon.removeClass("icon-zx-xin-stroke").addClass("icon-zx-xin");
        }
        else{
            //取消收藏
            //ajax here
            $icon.removeClass("icon-zx-xin").addClass("icon-zx-xin-stroke");
        }
    }
});