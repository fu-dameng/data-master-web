CREATE TABLE form_value (
  id INT PRIMARY KEY AUTO_INCREMENT,
  type VARCHAR(20) NOT NULL,
  key VARCHAR(50) NOT NULL,
  json_data VARCHAR(10000) NOT NULL,
  create_time DATETIME NOT NULL,
  update_time DATETIME NOT NULL
);

create table super_data
(
	id int auto_increment,
	label_position VARCHAR(20) null,
	label_width VARCHAR(20) null,
	size VARCHAR(20) null,
	status_icon int null,
	form_item_list VARCHAR(10000) null,
	create_time datetime null,
	update_time datetime null,
	constraint super_data_pk
		primary key (id)
)
comment '表单数据详情';
