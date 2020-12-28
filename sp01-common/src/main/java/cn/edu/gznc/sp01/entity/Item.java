package cn.edu.gznc.sp01.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item implements Serializable{
	private static final long serialVersionUID = -4530463749376768012L;
	private Integer id;
	private String name;
	private Integer number; // 库存
}
