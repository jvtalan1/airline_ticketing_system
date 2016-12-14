$(document).ready(function() {
	$("#fromdate").datepicker();
	$("#todate").datepicker();
	
	var header = $('header'), btn = $('button.toggle-nav');

	btn.on('click', function() {
		header.toggleClass('active');
	});
});