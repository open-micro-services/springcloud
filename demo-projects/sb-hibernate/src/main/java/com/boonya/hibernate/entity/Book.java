package com.boonya.hibernate.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "books")
@Data
public class Book implements Serializable {

    private static final long serialVersionUID = 4055235145107081639L;

    /**
     * 自定义ID生成规则
     * public enum GenerationType{
     *
     *     TABLE,
     *
     *     SEQUENCE,
     *
     *     IDENTITY,
     *
     *     AUTO
     *
     * }
     * TABLE：使用一个特定的数据库表格来保存主键。
     * SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
     * IDENTITY：主键由数据库自动生成（主要是自动增长型）
     * AUTO：主键由程序控制。
     */
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "id",nullable = false)
    protected String id;

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private String category;
}
