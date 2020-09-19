const {Subject} = require('rxjs'); 

var PersonDTO = require('./PersonDTO');
var PersonPresenter = require('./PersonPresenter');
var IntPresenter = require('./IntPresenter');

var person = new PersonDTO("Phong", "96 Cao Thang");
console.log("Log: " + person.toString());

const subject = new Subject();

const personSubject = new PersonPresenter();
subject.subscribe({
   next: personSubject.accept
});
subject.next(person);

subject.subscribe({
   next: IntPresenter.accept
});
subject.next(1);