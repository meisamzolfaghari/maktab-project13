package ir.maktab.busticket.features.usermanagement.models;

import ir.maktab.busticket.features.share.models.PersistenceEntity;

import javax.persistence.Column;

public class User extends PersistenceEntity<Long> {

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "USERNAME", nullable = false, unique = true)
    private String username;

    @Column(name = "PASSWORD" , nullable = false)
    private String password;

}
