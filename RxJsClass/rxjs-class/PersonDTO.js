module.exports = class PersonDTO {
	constructor(name, address) {
		this.name = name;
		this.address = address;
	}
	
	toString(){
		return "Person name: " + this.name + " address: " + this.address;
	}
};