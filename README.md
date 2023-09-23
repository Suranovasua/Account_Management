# Personal Account Management System

This Java project is a simple personal account management system that allows users to create and manage personal accounts, make deposits, withdrawals, and view transaction history. It includes three main classes: `Amount`, `PersonalAccount`, and `Main`, which work together to provide basic account management functionality.

## Table of Contents
- [Project Overview](#project-overview)
- [Usage](#usage)
- [Classes](#classes)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

## Project Overview
The project consists of the following key components:

### 1. Amount Class
The `Amount` class represents a financial transaction with attributes such as `amount` and `transactionType`. It provides methods to retrieve these attributes.

```java
public class Amount {
    private double amount;
    private String transactionType;

    public Amount(double theamount, String theTransactionType) {
        amount = theamount;
        transactionType = theTransactionType;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }
}
