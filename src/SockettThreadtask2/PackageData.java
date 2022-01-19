package SockettThreadtask2;

import javax.swing.*;
import java.io.Serializable;

public class PackageData implements Serializable {
    private String name;
    private String textField;

    public PackageData(String textField, String name) {
        this.name = name; this.textField = textField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }
}
