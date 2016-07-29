;(function(){
	$.extend($.datepicker.regional[''], {
		dateFormat: "yy/mm/dd",
		showMonthAfterYear: true
	});
	$.datepicker.regional['en-US'] = $.datepicker.regional[''];
	$.datepicker.setDefaults($.datepicker.regional['en-US']);
})();
