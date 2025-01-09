package Tenant;

import Rental.RentalContract;
import User.User;
import java.util.*;

public class Tenant extends User {

    private List<RentalContract> listOfContracts;

    // Constructor
    public Tenant(String userID, String password, String email, String userType) {
        super(userID, password, email, userType);
        this.listOfContracts = new ArrayList<>();
    }

    // Methods related to rental contracts
    public void requestCreateRentalContract(RentalContract contract) {
        listOfContracts.add(contract);
    }

    public void requestTerminateRentalContract(RentalContract contract) {
        listOfContracts.remove(contract);
    }

    // Getter for listOfContracts
    public List<RentalContract> getListOfContracts() {
        return listOfContracts;
    }
}
