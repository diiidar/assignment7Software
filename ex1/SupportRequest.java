package assignment7Software.ex1;

class SupportRequest {
    private int id;
    private String description;
    private Type type;

    public SupportRequest(int id, String description, Type type) {
        this.id = id;
        this.description = description;
        this.type = type;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    // Enum for support request type
    public enum Type {
        HARDWARE, SOFTWARE, NETWORK, OTHER
    }
}
