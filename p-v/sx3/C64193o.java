package sx3;

import java.util.RandomAccess;

/* renamed from: sx3.o */
public final class C64193o extends C64177c<Float> implements RandomAccess {

    /* renamed from: e */
    public final /* synthetic */ float[] f181917e;

    public C64193o(float[] fArr) {
        this.f181917e = fArr;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Float)) {
            return false;
        }
        float floatValue = ((Number) obj).floatValue();
        float[] fArr = this.f181917e;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(floatValue)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo52189f() {
        return this.f181917e.length;
    }

    public Object get(int i) {
        return Float.valueOf(this.f181917e[i]);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Number) obj).floatValue();
        float[] fArr = this.f181917e;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(floatValue)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f181917e.length == 0;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Number) obj).floatValue();
        float[] fArr = this.f181917e;
        int length = fArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(floatValue)) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
