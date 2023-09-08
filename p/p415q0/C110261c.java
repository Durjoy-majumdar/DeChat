package p415q0;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import p175j0.C108504h;

/* renamed from: q0.c */
public final class C110261c {
    /* renamed from: a */
    public static final int m149877a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* renamed from: b */
    public static final C25518a m149878b(C108504h hVar, int i, boolean z, Object obj) {
        C35747b bVar;
        C87412m.m108594g(hVar, FFmpegMetadataRetriever.METADATA_KEY_COMPOSER);
        C87412m.m108594g(obj, "block");
        hVar.mo51557H(i);
        Object q = hVar.mo51606q();
        int i2 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            bVar = new C35747b(i, z);
            hVar.mo51553F(bVar);
        } else if (q != null) {
            bVar = (C35747b) q;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
        }
        bVar.mo60384j(obj);
        hVar.mo51565P();
        return bVar;
    }

    /* renamed from: c */
    public static final C25518a m149879c(int i, boolean z, Object obj) {
        C87412m.m108594g(obj, "block");
        C35747b bVar = new C35747b(i, z);
        bVar.mo60384j(obj);
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m149880d(p175j0.C33486h1 r4, p175j0.C33486h1 r5) {
        /*
            java.lang.String r0 = "other"
            gy3.C87412m.m108594g(r5, r0)
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x003d
            boolean r2 = r4 instanceof p175j0.C24705j1
            if (r2 == 0) goto L_0x003c
            boolean r2 = r5 instanceof p175j0.C24705j1
            if (r2 == 0) goto L_0x003c
            r2 = r4
            j0.j1 r2 = (p175j0.C24705j1) r2
            j0.t r3 = r2.f70463a
            if (r3 == 0) goto L_0x0026
            j0.c r3 = r2.f70465c
            if (r3 == 0) goto L_0x0021
            boolean r3 = r3.mo51537a()
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r3 == 0) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r3 == 0) goto L_0x003d
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 != 0) goto L_0x003d
            j0.c r4 = r2.f70465c
            j0.j1 r5 = (p175j0.C24705j1) r5
            j0.c r5 = r5.f70465c
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p415q0.C110261c.m149880d(j0.h1, j0.h1):boolean");
    }
}
