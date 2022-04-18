const User = require('./User');

describe('User object', () => {

    const userTest = new User('john123@gmail.com', 1789, 8172587499);
    test('if user name is all string', () => {
        expect(typeof userTest.userName).toBe('string');

    })

    test('if password is all numbers', () => {
        expect(typeof userTest.password).toBe('number');

    })

    test('if phone number is in ten digit format', () => {
        expect(userTest.phoneNumber).toBeGreaterThanOrEqual(1234567899);

    })

    test('if user is able to update username using method', () => {
        userTest.changeUsername('mouse@abc.com');
        expect(userTest.userName).toBe('mouse@abc.com');

    })

    test('if user is able to change password using method', () =>{
        userTest.changePassword(2547);
        expect(userTest.password).toBe(2547);

    })

    test('if user entered correct email format', () => {
        const emailTest = userTest.userName;
        const indexOfAt = userTest.userName.split('').indexOf('@');
        expect(emailTest.slice(indexOfAt)).toBe('@abc.com');

    })

    test('damage reporting function is working', () => {
       
        expect(userTest.reportDamage(true)).toBe();
        
    })


})
