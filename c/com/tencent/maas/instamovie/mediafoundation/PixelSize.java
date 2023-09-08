package com.tencent.maas.instamovie.mediafoundation;

public class PixelSize implements Cloneable {
    public static final PixelSize SizeZero = new PixelSize(0, 0);
    public int height;
    public int width;

    public PixelSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PixelSize)) {
            return false;
        }
        PixelSize pixelSize = (PixelSize) obj;
        return pixelSize.width == this.width && pixelSize.height == this.height;
    }

    public String toString() {
        return "[" + this.width + "," + this.height + "]";
    }

    public PixelSize clone() {
        return new PixelSize(this.width, this.height);
    }
}
