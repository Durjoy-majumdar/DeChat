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

/* renamed from: h7.a */
public final class C20894a implements C16741e {

    /* renamed from: e */
    public static final int f59038e = C20551y.m22316f("ID3");

    /* renamed from: a */
    public final long f59039a;

    /* renamed from: b */
    public final C20895b f59040b;

    /* renamed from: c */
    public final C20541m f59041c;

    /* renamed from: d */
    public boolean f59042d;

    public C20894a() {
        this(0);
    }

    /* renamed from: a */
    public int mo17745a(C16742f fVar, C16747k kVar) {
        int c = ((C16738b) fVar).mo17735c(this.f59041c.f57809a, 0, 2786);
        if (c == -1) {
            return -1;
        }
        this.f59041c.mo32113x(0);
        this.f59041c.mo32112w(c);
        if (!this.f59042d) {
            this.f59040b.f59054l = this.f59039a;
            this.f59042d = true;
        }
        this.f59040b.mo32609a(this.f59041c);
        return 0;
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        this.f59042d = false;
        this.f59040b.mo32610b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r4.f45244e = 0;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        if ((r1 - r3) < 8192) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
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
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f57809a
            r5 = r11
            b7.b r5 = (p294b7.C16738b) r5
            r5.mo17734b(r4, r2, r1, r2)
            r0.mo32113x(r2)
            int r4 = r0.mo32105p()
            int r5 = f59038e
            if (r4 == r5) goto L_0x0069
            r4 = r11
            b7.b r4 = (p294b7.C16738b) r4
            r4.f45244e = r2
            r4.mo17733a(r3, r2)
            r1 = r3
        L_0x0025:
            r11 = 0
        L_0x0026:
            byte[] r5 = r0.f57809a
            r6 = 5
            r4.mo17734b(r5, r2, r6, r2)
            r0.mo32113x(r2)
            int r5 = r0.mo32108s()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r5 == r7) goto L_0x0046
            r4.f45244e = r2
            int r1 = r1 + 1
            int r11 = r1 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r11 < r5) goto L_0x0042
            return r2
        L_0x0042:
            r4.mo17733a(r1, r2)
            goto L_0x0025
        L_0x0046:
            r5 = 1
            int r11 = r11 + r5
            r7 = 4
            if (r11 < r7) goto L_0x004c
            return r5
        L_0x004c:
            byte[] r5 = r0.f57809a
            int r8 = r5.length
            r9 = -1
            if (r8 >= r6) goto L_0x0054
            r5 = -1
            goto L_0x0060
        L_0x0054:
            byte r5 = r5[r7]
            r6 = r5 & 192(0xc0, float:2.69E-43)
            int r6 = r6 >> 6
            r5 = r5 & 63
            int r5 = p401y6.C23224a.m27627a(r6, r5)
        L_0x0060:
            if (r5 != r9) goto L_0x0063
            return r2
        L_0x0063:
            int r5 = r5 + -5
            r4.mo17733a(r5, r2)
            goto L_0x0026
        L_0x0069:
            r4 = 3
            r0.mo32114y(r4)
            int r4 = r0.mo32102m()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r5 = r11
            b7.b r5 = (p294b7.C16738b) r5
            r5.mo17733a(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p345h7.C20894a.mo17747c(b7.f):boolean");
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f59040b.mo32612d(gVar, new C20923v.C20927d(0, 1));
        gVar.mo17751i();
        gVar.mo17750g(new C16748l.C16749a(-9223372036854775807L));
    }

    public void release() {
    }

    public C20894a(long j) {
        this.f59039a = j;
        this.f59040b = new C20895b((String) null);
        this.f59041c = new C20541m(2786);
    }
}
