const Scooter = require('./Scooter');

describe('Scooter object', () => {

    const scooterTest = new Scooter('lima4001', 88);
    test('if my inventory control method is storing working scooter', () => {
        expect(scooterTest.inventoryStock()).toBe();
        

    })

    test('if my inventory control can store bad scooters', () => {
        const scooterTest = new Scooter('lima4050', 80);
        expect(scooterTest.inventoryStock());

    })

   
})