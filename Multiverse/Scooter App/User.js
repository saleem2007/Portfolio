class User {

    constructor(userName, password, phoneNumber) {

        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        

    }
 
    changeUsername(updatedUserName) {

        this.userName = updatedUserName;

    }

    changePassword(updatePassword) {

        this.password = updatePassword;

    }

    reportDamage(broken) {

        if (broken === true) {

            console.log('Please return to the nearest station, A technician will arrive soon to repair it \n We will take this scooter off the inventory, sorry for the inconvenience.');

        } else {

            console.log('Enjoy the ride');

        }
    }
    
}







module.exports = User;