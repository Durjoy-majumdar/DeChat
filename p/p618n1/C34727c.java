package p618n1;

import p559i1.C33176a;

/* renamed from: n1.c */
public final class C34727c implements C33176a {

    /* renamed from: a */
    public final float f93365a;

    /* renamed from: b */
    public final float f93366b;

    /* renamed from: c */
    public final long f93367c;

    public C34727c(float f, float f2, long j) {
        this.f93365a = f;
        this.f93366b = f2;
        this.f93367c = j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C34727c) {
            C34727c cVar = (C34727c) obj;
            if (cVar.f93365a == this.f93365a) {
                return ((cVar.f93366b > this.f93366b ? 1 : (cVar.f93366b == this.f93366b ? 0 : -1)) == 0) && cVar.f93367c == this.f93367c;
            }
        }
    }

    public int hashCode() {
        long j = this.f93367c;
        return ((((0 + Float.floatToIntBits(this.f93365a)) * 31) + Float.floatToIntBits(this.f93366b)) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f93365a + ",horizontalScrollPixels=" + this.f93366b + ",uptimeMillis=" + this.f93367c + ')';
    }
}
