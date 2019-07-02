class Cookie {
    //data fields
    private String shape          = "Triangle";
    private String color          = "Red";
    private boolean greenSprinkle = false;
    private boolean redSprinkle   = false;
    private boolean blackSprinkle = false;

    public Cookie() {
    }

    public Cookie(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isGreenSprinkle() {
        return greenSprinkle;
    }

    public void setGreenSprinkle(boolean greenSprinkle) {
        this.greenSprinkle = greenSprinkle;
    }

    public boolean isRedSprinkle() {
        return redSprinkle;
    }

    public void setRedSprinkle(boolean redSprinkle) {
        this.redSprinkle = redSprinkle;
    }

    public boolean isBlackSprinkle() {
        return blackSprinkle;
    }

    public void setBlackSprinkle(boolean blackSprinkle) {
        this.blackSprinkle = blackSprinkle;
    }
}


