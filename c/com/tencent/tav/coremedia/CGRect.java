package com.tencent.tav.coremedia;

import android.graphics.PointF;

public class CGRect implements Cloneable {
    public final PointF origin;
    public final CGSize size;

    public CGRect(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new CGSize(f3, f4));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CGRect cGRect = (CGRect) obj;
        return this.origin.equals(cGRect.origin) && this.size.equals(cGRect.size);
    }

    public String toString() {
        return "[" + this.origin + "," + this.size + "]";
    }

    public CGRect(PointF pointF, CGSize cGSize) {
        pointF = pointF == null ? new PointF() : pointF;
        cGSize = cGSize == null ? new CGSize() : cGSize;
        this.origin = pointF;
        this.size = cGSize;
    }

    public CGRect clone() {
        PointF pointF = this.origin;
        float f = pointF.x;
        float f2 = pointF.y;
        CGSize cGSize = this.size;
        return new CGRect(f, f2, cGSize.width, cGSize.height);
    }

    public CGRect() {
        this.origin = new PointF();
        this.size = new CGSize();
    }
}
