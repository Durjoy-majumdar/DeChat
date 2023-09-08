package tn1;

import cm1.C0740i2;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C49398f93;
import te3.C49677h93;
import te3.qa4;
import te3.v54;
import tf1.C13914m;

/* renamed from: tn1.n */
public final class C14059n implements C0740i2 {

    /* renamed from: d */
    public final v54 f39438d;

    /* renamed from: e */
    public final String f39439e;

    /* renamed from: f */
    public final int f39440f;

    /* renamed from: g */
    public final String f39441g;

    /* renamed from: h */
    public final String f39442h;

    /* renamed from: i */
    public final String f39443i;

    /* renamed from: j */
    public final LinkedList<C49398f93> f39444j;

    /* renamed from: n */
    public final LinkedList<C49398f93> f39445n;

    /* renamed from: o */
    public final LinkedList<C49677h93> f39446o;

    /* renamed from: p */
    public final String f39447p;

    /* renamed from: q */
    public final String f39448q;

    /* renamed from: r */
    public final String f39449r;

    /* renamed from: s */
    public final int f39450s;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r6 = r4.f140218i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14059n(te3.v54 r3, java.lang.String r4, int r5, java.lang.String r6) {
        /*
            r2 = this;
            java.lang.String r0 = "skuInfo"
            gy3.C87412m.m108594g(r3, r0)
            r2.<init>()
            r2.f39438d = r3
            r2.f39439e = r4
            r2.f39440f = r5
            r2.f39441g = r6
            te3.qa4 r4 = r3.f143320d
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x001f
            te3.p60 r6 = r4.f140218i
            if (r6 == 0) goto L_0x001f
            java.lang.String r6 = r6.f139598f
            if (r6 != 0) goto L_0x002c
        L_0x001f:
            if (r4 == 0) goto L_0x0028
            te3.p60 r6 = r4.f140218i
            if (r6 == 0) goto L_0x0028
            java.lang.String r6 = r6.f139597e
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            if (r6 != 0) goto L_0x002c
            r6 = r5
        L_0x002c:
            r2.f39442h = r6
            if (r4 == 0) goto L_0x0034
            java.lang.String r6 = r4.f140215f
            if (r6 != 0) goto L_0x0035
        L_0x0034:
            r6 = r5
        L_0x0035:
            r2.f39443i = r6
            java.util.LinkedList<te3.f93> r6 = r3.f143328o
            r2.f39444j = r6
            java.util.LinkedList<te3.f93> r6 = r3.f143331r
            r2.f39445n = r6
            java.util.LinkedList<te3.h93> r6 = r3.f143329p
            r2.f39446o = r6
            if (r4 == 0) goto L_0x004b
            java.lang.String r6 = r4.f140216g
            if (r6 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r5 = r6
        L_0x004b:
            r2.f39447p = r5
            er1.j4 r5 = er1.C58739j4.f168176a
            r6 = 0
            if (r4 == 0) goto L_0x0056
            long r0 = r4.f140219j
            int r4 = (int) r0
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            java.lang.String r4 = r5.mo83699a0(r4)
            r2.f39448q = r4
            te3.qa4 r4 = r3.f143320d
            if (r4 == 0) goto L_0x0065
            long r4 = r4.f140219j
            int r5 = (int) r4
            goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            double r4 = (double) r5
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r0
            int r4 = (int) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.f39449r = r4
            te3.qa4 r3 = r3.f143320d
            if (r3 == 0) goto L_0x0077
            int r6 = r3.f140217h
        L_0x0077:
            r2.f39450s = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tn1.C14059n.<init>(te3.v54, java.lang.String, int, java.lang.String):void");
    }

    /* renamed from: c */
    public int mo75c() {
        return C14059n.class.hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (!(mVar instanceof C14059n)) {
            return -1;
        }
        qa4 qa4 = ((C14059n) mVar).f39438d.f143320d;
        Long l = null;
        Long valueOf = qa4 != null ? Long.valueOf(qa4.f140213d) : null;
        qa4 qa42 = this.f39438d.f143320d;
        if (qa42 != null) {
            l = Long.valueOf(qa42.f140213d);
        }
        return C87412m.m108589b(valueOf, l) ? 0 : -1;
    }

    public long getItemId() {
        qa4 qa4 = this.f39438d.f143320d;
        if (qa4 != null) {
            return qa4.f140213d;
        }
        return 0;
    }
}
