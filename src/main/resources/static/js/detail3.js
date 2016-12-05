/**
 * Create by 
 * common js for 
 **/

$(function() {
	$(".header2 i").click(function() {
		var $this = $(".header2 i");
		if ($this.hasClass('icon-zx-xin')) {

			$this.removeClass("icon-zx-xin").addClass("icon-zx-xin-stroke");
		} else {

			$this.removeClass("icon-zx-xin-stroke").addClass("icon-zx-xin");
		}

});
});

//视频
var myVideo = document.getElementById("video1");
var tol = 0;

function playPauseV() { //按钮与背景隐藏
	$(".play").css({
		"display": "none"
	});
	$(".bg").css({
		"display": "none"
	});

	{
		if (myVideo.paused)

			myVideo.play();
	}

};
$(function() {
	myVideo.addEventListener("loadedmetadata", function() {
		tol = myVideo.duration; //获取总时长

		myVideo.addEventListener("timeupdate", function() {
			var currentTime = myVideo.currentTime; //获取当前播放时间
			if (currentTime == tol) {
				setTimeout('$(".play").css({"display":"inline"});$(".bg").css({"display":"inline"});', 1000); //延迟一秒跳回最初状态

			};
		});

	});

});

//音频


var myAudio = document.getElementById("audio1");

function playPauseA() { //播放&暂停
	{
		if (myAudio.paused)
			myAudio.play();
		else
			myAudio.pause();
	}
};
//时长

var time1 = document.getElementById('time1');
var int = self.setInterval("time2()", 500);

function time2() {
	//var time3 = myAudio.duration;    //获取总时间
	var time = myAudio.currentTime; //获取当前时间
	var t = time;
	var m = Math.floor(t / 60);
	if (m < 10) {
		m = "0" + m
	}
	var time4 = m + ":" + (t % 60 / 100).toFixed(2).slice(-2);
	document.getElementById("time1").innerHTML = time4;

	var progress = document.getElementById("solid1");
	var value = 0;
	if (myAudio.currentTime > 0) {
		value = Math.floor((100 / myAudio.duration) * myAudio.currentTime);
	}
	progress.style.width = value + "%";



};