const {sequelize, DataTypes, Model} = require('./db');
const {Restaurant} = require('./Restaurant');
const {Menu} = require('./Menu');
const {FoodItems} = require('./FoodItems');

// creates our Association !!!!
Menu.belongsTo(Restaurant); // adds a foreign key on the Restaurant table.
Restaurant.hasMany(Menu); //gives us sequelize
FoodItems.belongsTo(Menu); // adds a foreign key
Menu.hasMany(FoodItems); //gives us sequelize 



module.exports = { Restaurant, Menu, FoodItems };