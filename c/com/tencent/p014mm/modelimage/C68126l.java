package com.tencent.p014mm.modelimage;

/* renamed from: com.tencent.mm.modelimage.l */
public class C68126l {
    /* renamed from: a */
    public static boolean m80527a(C92836k kVar) {
        if (kVar == null) {
            return false;
        }
        int i = kVar.f267376c;
        int i2 = kVar.f267377d;
        long j = kVar.f267375b;
        if (kVar.mo127145p()) {
            C92836k TO = C92837k0.Bx0().mo127173TO(kVar.f267390q);
            i = TO.f267376c;
            i2 = TO.f267377d;
            j = TO.f267375b;
        }
        if (i2 == 0) {
            return true;
        }
        return (i == i2 && i2 != 0) || j != 0;
    }
}
