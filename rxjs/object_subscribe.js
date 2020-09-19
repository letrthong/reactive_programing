// File object_subscribe.js

//Way1
/*
module.exports = {
    onNext: function(x) {
        console.log('observable_subscribe::onNext  value ' + x);
    }

};*/

//Way2
function onNext(x) {
     console.log('observable_subscribe::onNext  value ' + x);
}


function onNextA(x) {
    console.log('observable_subscribe::onNextA  value ' + x);
}

module.exports.onNext = onNext;
module.exports.onNextA = onNextA;