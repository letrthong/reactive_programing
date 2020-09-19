//Way1
/*
module.exports = {
    onNext: function(x) {
        console.log('observable_subscribe::onNext  value ' + x);
    }
};*/

//Way2
function accept(x) {
	console.log('observable_subscribe::onNext  value ' + x);
}
module.exports.accept = accept;