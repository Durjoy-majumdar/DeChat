package qy2;

/* renamed from: qy2.a0 */
public class C47894a0 implements Cloneable {

    /* renamed from: d */
    public int f128516d = 12480;

    /* renamed from: e */
    public boolean f128517e = false;

    /* renamed from: f */
    public boolean f128518f = false;

    /* renamed from: g */
    public int f128519g = 3;

    /* renamed from: h */
    public boolean f128520h = true;

    /* renamed from: i */
    public boolean f128521i = false;

    /* renamed from: a */
    public boolean mo72635a(int i) {
        return (i & this.f128516d) != 0;
    }

    /* renamed from: b */
    public C47894a0 mo72636b(boolean z) {
        if (z) {
            this.f128516d |= 32768;
        } else {
            this.f128516d &= -32769;
        }
        return this;
    }

    /* renamed from: c */
    public C47894a0 mo72637c(boolean z) {
        if (z) {
            this.f128516d |= 8;
        } else {
            this.f128516d &= -9;
        }
        return this;
    }

    public Object clone() {
        try {
            return (C47894a0) super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public C47894a0 mo72639d(boolean z) {
        if (z) {
            this.f128516d |= 16;
        } else {
            this.f128516d &= -17;
        }
        return this;
    }
}
