package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Portfolio() {}

    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
