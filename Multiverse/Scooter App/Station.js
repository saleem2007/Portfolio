class Station {

    constructor(location, status) {

        this.location = location;
        this.status = status;

    }

    rental() {

        if (this.status === true) {

            console.log('Scooter is ready to ride, Please wear helmet and follow the safety guidelines!!! \n Payment will be collected after returning at the nearest charging station :) ');

        } else {

            console.log('This scooter is not fully charged please select the next one');
        }
    }

    returnScooter() {

       console.log('Thank you for renting, Please swipe your credit card to pay the final bill. \n Please come again :) :) ');
    }
}


module.exports = Station;