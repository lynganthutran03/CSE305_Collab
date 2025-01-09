package Property;

import User.User;
import java.util.*;

public class PropertyOwner extends User {

    private List<Property> listOfProperties;

    public PropertyOwner(String userID, String password, String email, String userType) {
        super(userID, password, email, userType);
        this.listOfProperties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        listOfProperties.add(property);
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
    }

    public List<Property> getListOfProperties() {
        return listOfProperties;
    }
}
