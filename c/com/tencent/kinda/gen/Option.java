package com.tencent.kinda.gen;

public final class Option {
    public String mContent;
    public boolean mEnabled;

    public Option() {
    }

    public Option(String str, boolean z) {
        this.mContent = str;
        this.mEnabled = z;
    }

    public String getContent() {
        return this.mContent;
    }

    public boolean getEnabled() {
        return this.mEnabled;
    }

    public String toString() {
        return "Option{mContent=" + this.mContent + ",mEnabled=" + this.mEnabled + "}";
    }
}
