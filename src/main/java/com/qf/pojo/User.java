package com.qf.pojo;

import lombok.*;
@Data //相当于生成get和set方法 @Setter //相当于set方法
@Getter //相当于get方法
@AllArgsConstructor //相当于有参构造函数
@NoArgsConstructor //相当于无参构造函数

public class User {
    private int id;

    private String name;

    private String password;

    private String address;
}
