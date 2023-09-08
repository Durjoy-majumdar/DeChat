package p345h7;

import p294b7.C16743g;
import p333e8.C20540l;
import p333e8.C20541m;
import p333e8.C20549u;
import p345h7.C20923v;

/* renamed from: h7.o */
public final class C20913o implements C20923v {

    /* renamed from: a */
    public final C20901h f59214a;

    /* renamed from: b */
    public final C20540l f59215b = new C20540l(new byte[10], 10);

    /* renamed from: c */
    public int f59216c = 0;

    /* renamed from: d */
    public int f59217d;

    /* renamed from: e */
    public C20549u f59218e;

    /* renamed from: f */
    public boolean f59219f;

    /* renamed from: g */
    public boolean f59220g;

    /* renamed from: h */
    public boolean f59221h;

    /* renamed from: i */
    public int f59222i;

    /* renamed from: j */
    public int f59223j;

    /* renamed from: k */
    public boolean f59224k;

    /* renamed from: l */
    public long f59225l;

    public C20913o(C20901h hVar) {
        this.f59214a = hVar;
    }

    /* renamed from: a */
    public final void mo32626a(C20541m mVar, boolean z) {
        boolean z2;
        if (z) {
            if (this.f59216c == 3) {
                this.f59214a.mo32611c();
            }
            this.f59216c = 1;
            this.f59217d = 0;
        }
        while (true) {
            int i = mVar.f57811c;
            int i2 = mVar.f57810b;
            int i3 = i - i2;
            if (i3 > 0) {
                int i4 = this.f59216c;
                if (i4 != 0) {
                    int i5 = 2;
                    if (i4 != 1) {
                        if (i4 == 2) {
                            if (mo32629d(mVar, this.f59215b.f57805a, Math.min(10, this.f59222i)) && mo32629d(mVar, (byte[]) null, this.f59222i)) {
                                this.f59215b.mo32088e(0);
                                this.f59225l = -9223372036854775807L;
                                if (this.f59219f) {
                                    this.f59215b.mo32089f(4);
                                    this.f59215b.mo32089f(1);
                                    this.f59215b.mo32089f(1);
                                    long d = (((long) this.f59215b.mo32087d(3)) << 30) | ((long) (this.f59215b.mo32087d(15) << 15)) | ((long) this.f59215b.mo32087d(15));
                                    this.f59215b.mo32089f(1);
                                    if (!this.f59221h && this.f59220g) {
                                        this.f59215b.mo32089f(4);
                                        this.f59215b.mo32089f(1);
                                        this.f59215b.mo32089f(1);
                                        long d2 = (long) this.f59215b.mo32087d(15);
                                        this.f59215b.mo32089f(1);
                                        this.f59218e.mo32131b(d2 | (((long) this.f59215b.mo32087d(3)) << 30) | ((long) (this.f59215b.mo32087d(15) << 15)));
                                        this.f59221h = true;
                                    }
                                    this.f59225l = this.f59218e.mo32131b(d);
                                }
                                this.f59214a.mo32613e(this.f59225l, this.f59224k);
                                this.f59216c = 3;
                                this.f59217d = 0;
                            }
                        } else if (i4 == 3) {
                            int i6 = this.f59223j;
                            int i7 = i6 == -1 ? 0 : i3 - i6;
                            if (i7 > 0) {
                                i3 -= i7;
                                mVar.mo32112w(i2 + i3);
                            }
                            this.f59214a.mo32609a(mVar);
                            int i8 = this.f59223j;
                            if (i8 != -1) {
                                int i9 = i8 - i3;
                                this.f59223j = i9;
                                if (i9 == 0) {
                                    this.f59214a.mo32611c();
                                    this.f59216c = 1;
                                    this.f59217d = 0;
                                }
                            }
                        }
                    } else if (mo32629d(mVar, this.f59215b.f57805a, 9)) {
                        this.f59215b.mo32088e(0);
                        if (this.f59215b.mo32087d(24) != 1) {
                            this.f59223j = -1;
                            z2 = false;
                        } else {
                            this.f59215b.mo32089f(8);
                            int d3 = this.f59215b.mo32087d(16);
                            this.f59215b.mo32089f(5);
                            this.f59224k = this.f59215b.mo32086c();
                            this.f59215b.mo32089f(2);
                            this.f59219f = this.f59215b.mo32086c();
                            this.f59220g = this.f59215b.mo32086c();
                            this.f59215b.mo32089f(6);
                            int d4 = this.f59215b.mo32087d(8);
                            this.f59222i = d4;
                            if (d3 == 0) {
                                this.f59223j = -1;
                            } else {
                                this.f59223j = ((d3 + 6) - 9) - d4;
                            }
                            z2 = true;
                        }
                        if (!z2) {
                            i5 = 0;
                        }
                        this.f59216c = i5;
                        this.f59217d = 0;
                    }
                } else {
                    mVar.mo32114y(i3);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo32627b() {
        this.f59216c = 0;
        this.f59217d = 0;
        this.f59221h = false;
        this.f59214a.mo32610b();
    }

    /* renamed from: c */
    public void mo32628c(C20549u uVar, C16743g gVar, C20923v.C20927d dVar) {
        this.f59218e = uVar;
        this.f59214a.mo32612d(gVar, dVar);
    }

    /* renamed from: d */
    public final boolean mo32629d(C20541m mVar, byte[] bArr, int i) {
        int min = Math.min(mVar.f57811c - mVar.f57810b, i - this.f59217d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            mVar.mo32114y(min);
        } else {
            mVar.mo32091b(bArr, this.f59217d, min);
        }
        int i2 = this.f59217d + min;
        this.f59217d = i2;
        return i2 == i;
    }
}
