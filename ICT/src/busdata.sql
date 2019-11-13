CREATE  TABLE IDと乗り場(ID int,NORIBA int)　AS SELECT * FROM CSVREAD('C:\Users\小橋司明\ICTデータ\IDと乗り場.csv',null,'UTF-8',',');
CREATE TABLE 往路時刻表　(ID int,CHITOSE time,MINAMICHITOSE time,KENKYUTOU time,HONBUTOU time)AS SELECT * FROM CSVREAD('C:\Users\小橋司明\ICTデータ\往路時刻表.csv',null,'UTF-8',',');
CREATE TABLE 復路時刻表　AS SELECT * FROM CSVREAD('C:\Users\小橋司明\ICTデータ\復路時刻表.csv',null,'UTF-8',',');

-- SELECT * FROM 往路時刻表　WHERE 往路時刻表.CHITOSE > '08:25:00'     ;
-- SELECT 復路時刻表.* ,IDと乗り場.NORIBA FROM 復路時刻表 LEFT JOIN  IDと乗り場 ON 復路時刻表.ID = IDと乗り場.ID ;
