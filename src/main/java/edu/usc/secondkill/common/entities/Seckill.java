package edu.usc.secondkill.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Seckill {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="seckill_id", nullable = false)
    private long seckillId;

    private String name;
    private int number;
    private int price;
    private Timestamp startTime;
    private Timestamp endTime;
    private Timestamp createTime;

    @Version
    private int version;

}
