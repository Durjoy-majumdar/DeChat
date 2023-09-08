package p288a6;

import java.io.File;
import p409b6.C23674a;
import p421x5.C26534c;

/* renamed from: a6.a */
public class C23610a {

    /* renamed from: a */
    public String f67749a;

    /* renamed from: b */
    public long f67750b;

    /* renamed from: c */
    public int f67751c;

    /* renamed from: d */
    public int f67752d;

    /* renamed from: e */
    public int f67753e;

    /* renamed from: f */
    public C26534c f67754f;

    /* renamed from: g */
    public C23674a f67755g;

    /* renamed from: h */
    public int f67756h;

    /* renamed from: i */
    public int f67757i;

    /* renamed from: j */
    public File f67758j;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r4 = (p424z5.C26654a) r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m28204a(p421x5.C26534c r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.getVersion()
            r2 = 1
            if (r2 != r1) goto L_0x0026
            y5.a r4 = (p422y5.C26624a) r4
            java.util.ArrayList<x5.e> r1 = r4.f74065b
            if (r1 == 0) goto L_0x0025
            int r1 = r1.size()
            if (r1 < r2) goto L_0x0025
            java.util.ArrayList<x5.e> r4 = r4.f74065b
            java.lang.Object r4 = r4.get(r0)
            x5.e r4 = (p421x5.C26536e) r4
            x5.b r4 = r4.f73838a
            if (r4 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            return r2
        L_0x0025:
            return r0
        L_0x0026:
            r1 = 2
            int r3 = r4.getVersion()
            if (r1 != r3) goto L_0x006b
            z5.a r4 = (p424z5.C26654a) r4
            java.util.ArrayList<z5.c> r1 = r4.f74226b
            if (r1 == 0) goto L_0x006b
            int r1 = r1.size()
            if (r1 < r2) goto L_0x006b
            java.util.ArrayList<z5.c> r1 = r4.f74226b
            java.lang.Object r1 = r1.get(r0)
            z5.c r1 = (p424z5.C26656c) r1
            java.util.ArrayList<x5.e> r1 = r1.f74228b
            if (r1 == 0) goto L_0x006b
            java.util.ArrayList<z5.c> r1 = r4.f74226b
            java.lang.Object r1 = r1.get(r0)
            z5.c r1 = (p424z5.C26656c) r1
            java.util.ArrayList<x5.e> r1 = r1.f74228b
            int r1 = r1.size()
            if (r1 < r2) goto L_0x006b
            java.util.ArrayList<z5.c> r4 = r4.f74226b
            java.lang.Object r4 = r4.get(r0)
            z5.c r4 = (p424z5.C26656c) r4
            java.util.ArrayList<x5.e> r4 = r4.f74228b
            java.lang.Object r4 = r4.get(r0)
            x5.e r4 = (p421x5.C26536e) r4
            x5.b r4 = r4.f73838a
            if (r4 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            return r2
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p288a6.C23610a.m28204a(x5.c):boolean");
    }

    /* renamed from: b */
    public void mo37100b() {
        this.f67749a = null;
        this.f67750b = 0;
        this.f67751c = 0;
        this.f67752d = 0;
        this.f67753e = 0;
        this.f67754f = null;
        this.f67755g = null;
        this.f67756h = 0;
        this.f67757i = 0;
    }

    public String toString() {
        return "CurrentPlayingHeInfo{mHeString='" + this.f67749a + '\'' + ", mStartTime=" + this.f67750b + ", mLoop=" + this.f67751c + ", mAmplitude=" + this.f67752d + ", mFreq=" + this.f67753e + ", mHeRoot=" + this.f67754f + ", mSyncCallback=" + this.f67755g + ", mStartPosition=" + this.f67756h + ", mStatus:" + this.f67757i + '}';
    }
}
