package com.p013qq.taf.jce.dynamic;

/* renamed from: com.qq.taf.jce.dynamic.StringField */
public class StringField extends JceField {
    private String data;

    public StringField(String str, int i) {
        super(i);
        this.data = str;
    }

    public String get() {
        return this.data;
    }

    public void set(String str) {
        this.data = str;
    }
}
