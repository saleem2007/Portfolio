const {sequelize, DataTypes, Model} = require('./db');

class FoodItems extends Model { }

FoodItems.init({
    name: DataTypes.STRING,
    cost: DataTypes.INTEGER
    
}, {
    sequelize,
    
});

module.exports = { FoodItems };
