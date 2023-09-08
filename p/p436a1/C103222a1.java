package p436a1;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: a1.a1 */
public final class C103222a1 {

    /* renamed from: b */
    public static final long f304424b = ((((long) Float.floatToIntBits(0.5f)) << 32) | (((long) Float.floatToIntBits(0.5f)) & Util.MAX_32BIT_VALUE));

    /* renamed from: c */
    public static final /* synthetic */ int f304425c = 0;

    /* renamed from: a */
    public final long f304426a;

    public /* synthetic */ C103222a1(long j) {
        this.f304426a = j;
    }

    /* renamed from: a */
    public static final float m136604a(long j) {
        return Float.intBitsToFloat((int) (j & Util.MAX_32BIT_VALUE));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C103222a1) && this.f304426a == ((C103222a1) obj).f304426a;
    }

    public int hashCode() {
        long j = this.f304426a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        long j = this.f304426a;
        return "TransformOrigin(packedValue=" + j + ')';
    }
}
