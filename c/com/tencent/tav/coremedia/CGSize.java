package com.tencent.tav.coremedia;

public class CGSize implements Cloneable {
    public static final CGSize CGSizeZero = new CGSize(0.0f, 0.0f);
    public float height;
    public float width;

    public CGSize(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CGSize)) {
            return false;
        }
        CGSize cGSize = (CGSize) obj;
        return cGSize.width == this.width && cGSize.height == this.height;
    }

    public String toString() {
        return "[" + this.width + "," + this.height + "]";
    }

    public CGSize clone() {
        return new CGSize(this.width, this.height);
    }

    public CGSize() {
        this(1.0f, 1.0f);
    }
}
