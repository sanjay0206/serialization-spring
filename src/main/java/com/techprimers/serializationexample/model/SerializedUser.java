package com.techprimers.serializationexample.model;

import javax.persistence.*;

@Entity
@Table
public class SerializedUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private byte[] serializedUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getSerializedUser() {
        return serializedUser;
    }

    public void setSerializedUser(byte[] serializedUser) {
        this.serializedUser = serializedUser;
    }

    public SerializedUser(byte[] serializedUser) {
        this.serializedUser = serializedUser;
    }

    public SerializedUser() {
    }
}
