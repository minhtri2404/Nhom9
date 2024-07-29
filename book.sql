Drop database LibraryDB
CREATE DATABASE LibraryDB
use LibraryDB;	
UPDATE books SET Book_Id = 1 WHERE Book_Id IS NULL;
ALTER TABLE books MODIFY COLUMN Book_Id INT NOT NULL AUTO_INCREMENT;
CREATE TABLE books (
    Book_Id INT PRIMARY KEY,
    Entry_Date DATE,
    Price DECIMAL(10, 2),
    Quantity INT,
    Publisher VARCHAR(100),
    Condition_Book ENUM('mới', 'cũ'),
    Tax DECIMAL(10, 2)
)
INSERT INTO books (Book_Id, Entry_Date, Price, Quantity, Publisher, Condition_Book, Tax)
VALUES 
    (1, '2024-07-25', 270.00, 15, 'Nhà xuất bản Alpha', 'mới', 0.00),
    (2, '2024-07-28', 140.00, 8, 'Nhà xuất bản Beta', 'cũ', 0.00),
    (3, '2024-08-02', 290.00, 12, 'Nhà xuất bản Gamma', 'mới', 00.00),
    (4, '2024-08-07', 210.00, 10, 'Nhà xuất bản Delta', 'cũ', 0.00),
    (5, '2024-08-12', 190.00, 9, 'Nhà xuất bản Epsilon', 'mới', 0.00),
    (6, '2024-08-17', 350.00, 7, 'Nhà xuất bản Zeta', 'mới', 00.00),
    (7, '2024-08-22', 230.00, 11, 'Nhà xuất bản Eta', 'cũ', 0.00),
    (8, '2024-08-27', 260.00, 14, 'Nhà xuất bản Theta', 'mới', 0.00),
    (9, '2024-08-29', 180.00, 6, 'Nhà xuất bản Iota', 'cũ', 0.00),
    (10, '2024-09-03', 310.00, 8, 'Nhà xuất bản Kappa', 'mới', 00.00);