package rp3;

/* renamed from: rp3.n */
public class C110617n {

    /* renamed from: a */
    public static final float[] f330953a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: b */
    public static final float[] f330954b = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: c */
    public static final float[] f330955c = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: d */
    public static final float[] f330956d = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public static float m150611a(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }

    /* renamed from: b */
    public static float[] m150612b(C110614k kVar, boolean z, boolean z2) {
        int ordinal = kVar.ordinal();
        float[] fArr = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? f330953a : f330956d : f330955c : f330954b;
        if (z) {
            fArr = new float[]{m150611a(fArr[0]), fArr[1], m150611a(fArr[2]), fArr[3], m150611a(fArr[4]), fArr[5], m150611a(fArr[6]), fArr[7]};
        }
        if (!z2) {
            return fArr;
        }
        return new float[]{fArr[0], m150611a(fArr[1]), fArr[2], m150611a(fArr[3]), fArr[4], m150611a(fArr[5]), fArr[6], m150611a(fArr[7])};
    }
}
