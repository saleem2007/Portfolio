class Scooter {

    constructor(serialNumber, batteryLevel) {

        this.serialNumber = serialNumber;
        this.batteryLevel = batteryLevel;
        
    }

    inventoryStock() {

        let goodStock = [];
        let badStock = [];
        
        if (this.batteryLevel >= 85) {

            goodStock.push(this.serialNumber);
            
        } else if (this.batteryLevel < 85) {

            badStock.push(this.serialNumber);
           
        }

        
        
    }
}


module.exports = Scooter;