package com.poeticdrunkencat.syncmariadb.entitys;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="transaction_state")
public class transaction_state {

    @Id
    private String transaction_id;

    private String transaction_name;

    private String transaction_source;

    private String transaction_target;

    private Timestamp transaction_start;



    private String transaction_user;

    public transaction_state() {
    }

    public transaction_state(String transaction_name, String transaction_source, String transaction_target) {
        this.transaction_name = transaction_name;
        this.transaction_source = transaction_source;
        this.transaction_target = transaction_target;
        this.transaction_start = new Timestamp(System.currentTimeMillis());;
        this.transaction_user = System.getProperty("user.name");

    }

    public String getTransaction_name() {
        return transaction_name;
    }

    public void setTransaction_name(String transaction_name) {
        this.transaction_name = transaction_name;
    }

    public String getTransaction_source() {
        return transaction_source;
    }

    public void setTransaction_source(String transaction_source) {
        this.transaction_source = transaction_source;
    }

    public String getTransaction_target() {
        return transaction_target;
    }

    public void setTransaction_target(String transaction_target) {
        this.transaction_target = transaction_target;
    }

    public Timestamp getTransaction_start() {
        return transaction_start;
    }

    public void setTransaction_start(Timestamp transaction_start) {
        this.transaction_start = transaction_start;
    }


    public String getTransaction_user() {
        return transaction_user;
    }

    public void setTransaction_user(String transaction_user) {
        this.transaction_user = transaction_user;
    }
}
