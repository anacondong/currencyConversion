truncate table currency;

insert into currency(id,name,detail,buying_Rates,selling_Rates,chg_Dt,volumn) values
(1,'USD1','USD: 1-2',32.33,33.68,NOW(),123.976),
(2,'USD5','USD: 5-20',32.63,33.69,NOW(),123.976),
(3,'USD50','USD: 50-100',32.68,33.75,NOW(),456.45),
(4,'GBP','United Kingdom',42.72,44.69,NOW(),789.43),
(5,'EUR','Euro Zone',38.43,39.60,NOW(),345.243),
(6,'JPY','Japan (:100)',29.34,30.81,NOW(),242.42),
(7,'HKD','Hong Kong',4.18,4.35,NOW(),356.323),
(8,'MYR','Malaysia',7.47,7.94,NOW(),564.543),
(9,'SGD','Singapore',24.10,24.93,NOW(),1123.647),
(10,'BND','Brunei: 1-2',23.56,24.83,NOW(),2395.97),
(11,'CNY','China',4.69,5.07,NOW(),9999.99),
(12,'IDR','Indonesia',2.01,2.71,NOW(),1.1);
