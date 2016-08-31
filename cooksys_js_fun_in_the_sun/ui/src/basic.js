import $ from 'jquery'

import './basic.css'

$(document).ready(() => {
	$('#box1').css('background', 'white');
	$('#box2').css('background', 'red');
	$('#box3').css('background', 'blue');

	let b1 = 0;
	let b2 = 0;
	let b3 = 0;

	$('#btn1').click(function() {
		b1++;
		switch (b1 % 3) {
		case 0:
			$('#box1').css('background', 'white');
			break
		case 1:
			$('#box1').css('background', 'red');
			break
		case 2:
			$('#box1').css('background', 'blue');
			break
		}
	});

	$('#btn2').click(function() {
		b2++;
		switch (b2 % 3) {
		case 0:
			$('#box2').css('background', 'red');
			break
		case 1:
			$('#box2').css('background', 'blue');
			break
		case 2:
			$('#box2').css('background', 'white');
			break
		}
	});

	$('#btn3').click(function() {
		b3++;
		switch (b3 % 3) {
		case 0:
			$('#box3').css('background', 'blue');
			break
		case 1:
			$('#box3').css('background', 'white');
			break
		case 2:
			$('#box3').css('background', 'red');
			break
		}
	});

	$('#resetBtn').click(function() {
		$('#box1').css('background', 'white');
		b1 = 0;
		$('#box2').css('background', 'red');
		b2 = 0;
		$('#box3').css('background', 'blue');
		b3 = 0;
	});
});
