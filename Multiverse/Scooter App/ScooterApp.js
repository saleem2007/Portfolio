const User = require('./User');

class ScooterApp extends User {

   constructor(userName, password, phoneNumber, age) {
        super(userName, password, phoneNumber);
        this.age = age;
        

    }

    registration(age) {

        if (age >= 18) {

            return 'You are eligible to register please proceed with registration';


        } else {

            return 'Sorry you are not old enough to register';

        }
    }

   
}

module.exports = ScooterApp;