//import { Observable } from 'rxjs';

const {Subject} = require('rxjs'); 
var tools = require("./object_subscribe.js");

 
//https://rxjs.dev/guide/subject
 const subject = new Subject();

  
subject.subscribe({
   next: tools.onNext
});

subject.next(1);
subject.next(2); 