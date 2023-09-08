package p396x6;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;

/* renamed from: x6.o */
public final class C23016o {

    /* renamed from: d */
    public static final C23016o f66185d = new C23016o(1.0f, 1.0f);

    /* renamed from: a */
    public final float f66186a;

    /* renamed from: b */
    public final float f66187b;

    /* renamed from: c */
    public final int f66188c;

    public C23016o(float f, float f2) {
        this.f66186a = f;
        this.f66187b = f2;
        this.f66188c = Math.round(f * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23016o.class != obj.getClass()) {
            return false;
        }
        C23016o oVar = (C23016o) obj;
        return this.f66186a == oVar.f66186a && this.f66187b == oVar.f66187b;
    }

    public int hashCode() {
        return ((C1883v2.CTRL_INDEX + Float.floatToRawIntBits(this.f66186a)) * 31) + Float.floatToRawIntBits(this.f66187b);
    }
}
