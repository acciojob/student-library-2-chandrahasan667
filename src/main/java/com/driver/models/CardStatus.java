package com.driver.models;


import javax.persistence.Table;
@Table(name = "CardStatus")
public enum CardStatus {
    ACTIVATED,
    DEACTIVATED
}
