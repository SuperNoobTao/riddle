/**
 * Create by 
 * common js for 
 **/

$(function(){
$(".header1 i").click(function(){
	var $this = $(".header1 i");
	if($this.hasClass('icon-zx-xin')){

            $this.removeClass("icon-zx-xin").addClass("icon-zx-xin-stroke");
        }
        else{

            $this.removeClass("icon-zx-xin-stroke").addClass("icon-zx-xin");
        }

});
});