--创建数据库
CREATE  database seckill;

--使用数据库
use seckill;
--创建秒杀库存表
CREATE  TABLE  seckill(
'seckill_id' bigint NOT NULL  AUTO_INCREMENT COMMENT '商品库存id',
'name' varchar(120) NOT NULL  COMMENT '商品名称',
'number' INT NOT NULL COMMNET '库存数量',
'start_time' TIMESTAMP NOT NULL COMMENT '秒杀开始时间',
'end_time' TIMESTAMP NOT NULL COMMENT '秒杀结束时间',
'create_time' TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
PRIMARY KEY (seckill_id),
KEY idx_start_time(start_time),
KEY idx_end_time(end_time),
KEY idx_create_time(create_time)
)ENGINE=innoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=uft8 COMMENT='秒杀库存表'

--初使化时间
INSERT INTO
  seckill(name,number,start_time,end_time)
VALUES
  ('1000元秒杀',100,'2015-11-01 00:00:00','2015-11-01 00:00:00'),
  ('500元秒杀',200,'2015-12-01 00:00:00','2015-11-03 00:00:00'),
  ('1元秒杀',300,'2015-11-03 00:00:00','2015-11-02 00:00:00');

