package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import pe3.C89349b;
import te3.C51174ry0;
import te3.C51314sy0;

/* renamed from: cj1.m5 */
public final class C0572m5 {

    /* renamed from: a */
    public final C51174ry0 f1372a;

    /* renamed from: b */
    public final int f1373b;

    /* renamed from: c */
    public final int f1374c;

    /* renamed from: d */
    public final C51314sy0 f1375d;

    public C0572m5(C51174ry0 ry02) {
        C89349b bVar;
        this.f1372a = ry02;
        this.f1373b = ry02 != null ? ry02.f141214e : 0;
        this.f1374c = ry02 != null ? ry02.f141213d : 0;
        C51314sy0 sy02 = new C51314sy0();
        byte[] f = (ry02 == null || (bVar = ry02.f141215f) == null) ? null : bVar.mo123703f();
        if (f != null) {
            try {
                sy02.parseFrom(f);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
            this.f1375d = sy02;
        }
        sy02 = null;
        this.f1375d = sy02;
    }
}
