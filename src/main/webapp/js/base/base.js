;(function(){

	$k = {
		page: {},
		proto: {},
		member: {},
		util: {},
		system: {}
	};
	
	$k.util.getDateString = function(data) {
		if (data) {
			if (data.$date) {
				return Date.init(data.$date).format("yyyy-mm-dd");
			}
			return Date.init(data).format("yyyy-mm-dd");
		}
		return "";
	};
	
	$k.util.getDate = function(data) {
		if (data) {
			if (data.$date) {
				return Date.init(data.$date).format("yyyy-mm-dd HH:MM:ss");
			}
			return Date.init(data).format("yyyy-mm-dd");
		}
		return "";
	};

})();
