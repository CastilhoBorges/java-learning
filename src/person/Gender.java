package person;

public enum Gender {
    FEMALE("Female"), MALE("Male");

    final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
