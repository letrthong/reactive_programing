//import { Observable } from 'rxjs';

const { Observable } = require('rxjs'); 
var tools = require("./observable_subscribe.js");


const observable = new Observable(subscriber => {
  subscriber.next(1);
  subscriber.next(2);
  subscriber.next(3);
  setTimeout(() => {
    subscriber.next(4);
    subscriber.complete();
  }, 1000);
});

 

console.log('just before subscribe');
//https://rxjs.dev/api/index/class/Observable#methods
observable.subscribe({
  next: tools.onNext,
  error(err) { console.error('something wrong occurred: ' + err); },
  complete() { console.log('done'); }
});
console.log('just after subscribe');