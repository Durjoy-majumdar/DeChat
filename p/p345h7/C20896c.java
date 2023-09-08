package p345h7;

import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16747k;
import p294b7.C16748l;
import p333e8.C20541m;
import p333e8.C20551y;
import p345h7.C20923v;

/* renamed from: h7.c */
public final class C20896c implements C16741e {

    /* renamed from: e */
    public static final int f59055e = C20551y.m22316f("ID3");

    /* renamed from: a */
    public final long f59056a;

    /* renamed from: b */
    public final C20897d f59057b;

    /* renamed from: c */
    public final C20541m f59058c;

    /* renamed from: d */
    public boolean f59059d;

    public C20896c() {
        this(0);
    }

    /* renamed from: a */
    public int mo17745a(C16742f fVar, C16747k kVar) {
        int c = ((C16738b) fVar).mo17735c(this.f59058c.f57809a, 0, 200);
        if (c == -1) {
            return -1;
        }
        this.f59058c.mo32113x(0);
        this.f59058c.mo32112w(c);
        if (!this.f59059d) {
            this.f59057b.f59075o = this.f59056a;
            this.f59059d = true;
        }
        this.f59057b.mo32609a(this.f59058c);
        return 0;
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        this.f59059d = false;
        C20897d dVar = this.f59057b;
        dVar.f59068h = 0;
        dVar.f59069i = 0;
        dVar.f59070j = 256;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        r5.f45244e = 0;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004d, code lost:
        if ((r1 - r4) < 8192) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17747c(p294b7.C16742f r11) {
        /*
            r10 = this;
            e8.m r0 = new e8.m
            r1 = 10
            r0.<init>((int) r1)
            e8.l r2 = new e8.l
            byte[] r3 = r0.f57809a
            int r4 = r3.length
            r2.<init>(r3, r4)
            r3 = 0
            r4 = 0
        L_0x0011:
            byte[] r5 = r0.f57809a
            r6 = r11
            b7.b r6 = (p294b7.C16738b) r6
            r6.mo17734b(r5, r3, r1, r3)
            r0.mo32113x(r3)
            int r5 = r0.mo32105p()
            int r6 = f59055e
            if (r5 == r6) goto L_0x0079
            r5 = r11
            b7.b r5 = (p294b7.C16738b) r5
            r5.f45244e = r3
            r5.mo17733a(r4, r3)
            r1 = r4
        L_0x002d:
            r11 = 0
            r6 = 0
        L_0x002f:
            byte[] r7 = r0.f57809a
            r8 = 2
            r5.mo17734b(r7, r3, r8, r3)
            r0.mo32113x(r3)
            int r7 = r0.mo32108s()
            r8 = 65526(0xfff6, float:9.1821E-41)
            r7 = r7 & r8
            r8 = 65520(0xfff0, float:9.1813E-41)
            if (r7 == r8) goto L_0x0054
            r5.f45244e = r3
            int r1 = r1 + 1
            int r11 = r1 - r4
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r11 < r6) goto L_0x0050
            return r3
        L_0x0050:
            r5.mo17733a(r1, r3)
            goto L_0x002d
        L_0x0054:
            r7 = 1
            int r11 = r11 + r7
            r8 = 4
            if (r11 < r8) goto L_0x005e
            r9 = 188(0xbc, float:2.63E-43)
            if (r6 <= r9) goto L_0x005e
            return r7
        L_0x005e:
            byte[] r7 = r0.f57809a
            r5.mo17734b(r7, r3, r8, r3)
            r7 = 14
            r2.mo32088e(r7)
            r7 = 13
            int r7 = r2.mo32087d(r7)
            r8 = 6
            if (r7 > r8) goto L_0x0072
            return r3
        L_0x0072:
            int r8 = r7 + -6
            r5.mo17733a(r8, r3)
            int r6 = r6 + r7
            goto L_0x002f
        L_0x0079:
            r5 = 3
            r0.mo32114y(r5)
            int r5 = r0.mo32102m()
            int r6 = r5 + 10
            int r4 = r4 + r6
            r6 = r11
            b7.b r6 = (p294b7.C16738b) r6
            r6.mo17733a(r5, r3)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: p345h7.C20896c.mo17747c(b7.f):boolean");
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f59057b.mo32612d(gVar, new C20923v.C20927d(0, 1));
        gVar.mo17751i();
        gVar.mo17750g(new C16748l.C16749a(-9223372036854775807L));
    }

    public void release() {
    }

    public C20896c(long j) {
        this.f59056a = j;
        this.f59057b = new C20897d(true, (String) null);
        this.f59058c = new C20541m(200);
    }
}
