package com.homework.chapters.four;

public enum Colors {
    BLACK("#000000"), RED("#E32636"), BLUE("#6A5ACD"), GREEN("#00FF7F"), CYAN("#ED3CCA"), MAGENTA("green"), YELLOW("#EDFF21"), WHITE("#FFFFFF");

    private String color;
    Colors(String color) {
        this.color = color;
    }

    public String getHexColor() {
        return color;
    }
}
