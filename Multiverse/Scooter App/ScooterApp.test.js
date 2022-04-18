const ScooterApp = require('./ScooterApp');

describe('Scooter app object', () => {

    const scooterAppTest = new ScooterApp('abc123@gmail.com', 7894, 8175478954);
   
    test('if user is old enough to register to ride the lime scooter', () =>{

        expect(scooterAppTest.registration(19)).toBe('You are eligible to register please proceed with registration');

    })

    test('registration app to throw error when user is uner 18', () => {

        expect(scooterAppTest.registration(16)).toBe('Sorry you are not old enough to register')
    })    
})