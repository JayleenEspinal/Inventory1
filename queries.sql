SELECT * FROM Item;

SELECT Item.ItemName, ItemGroup.GroupName FROM Item
INNER JOIN ItemGroup ON Item.ItemGroupID = ItemGroup.GroupID;

SELECT AVG(UnitPrice) FROM Item;

UPDATE Item SET InventoryBalance = 45 WHERE ItemID = 1;

DELETE FROM Supplier WHERE SupplierID = 1;


SELECT
    Item.ItemID,
    Item.ItemName,
    Item.InventoryBalance,
    ItemGroup.GroupName
FROM
    Item
JOIN
    ItemGroup ON Item.ItemGroupID = ItemGroup.GroupID;


SELECT * FROM Item;

SELECT Item.ItemName, ItemGroup.GroupName FROM Item
INNER JOIN ItemGroup ON Item.ItemGroupID = ItemGroup.GroupID;

SELECT AVG(UnitPrice) FROM Item;

UPDATE Item SET InventoryBalance = 45 WHERE ItemID = 1;

DELETE FROM Supplier WHERE SupplierID = 1;

SELECT
    Item.ItemID,
    Item.ItemName,
    Item.InventoryBalance,
    ItemGroup.GroupName
FROM
    Item
JOIN
    ItemGroup ON Item.ItemGroupID = ItemGroup.GroupID;


UPDATE Transactions
SET TransactionDate = NOW()
WHERE TransactionType = 'Received'
  AND ItemID IN (SELECT ItemID FROM Item WHERE ItemGroupID = (SELECT GroupID FROM ItemGroup WHERE GroupName = 'YourItemGroupName'));


UPDATE Item
SET UnitPrice = UnitPrice * 1.1
WHERE ItemGroupID = (SELECT GroupID FROM ItemGroup WHERE GroupName = 'YourItemGroupName');

UPDATE Item
SET UnitPrice = UnitPrice * 1.1
WHERE ItemGroupID = (SELECT GroupID FROM ItemGroup WHERE GroupName = 'YourItemGroupName');
