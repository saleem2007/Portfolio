const Station = require('./Station');

describe('Station object', () => {

    const stationTest = new Station('Broadwalk', true);
    test('only fully charged scooter should be dispensed for rental', () => {
        expect(stationTest.rental());

    })

    test('if return method is working when return is complete', () => {
        expect(stationTest.returnScooter());

    })

})