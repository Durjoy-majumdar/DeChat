package p345h7;

import androidx.exifinterface.media.ExifInterface;
import p294b7.C16743g;
import p333e8.C20541m;
import p333e8.C20549u;
import p333e8.C20551y;
import p345h7.C20923v;

/* renamed from: h7.r */
public final class C20917r implements C20923v {

    /* renamed from: a */
    public final C20916q f59240a;

    /* renamed from: b */
    public final C20541m f59241b = new C20541m(32);

    /* renamed from: c */
    public int f59242c;

    /* renamed from: d */
    public int f59243d;

    /* renamed from: e */
    public boolean f59244e;

    /* renamed from: f */
    public boolean f59245f;

    public C20917r(C20916q qVar) {
        this.f59240a = qVar;
    }

    /* renamed from: a */
    public void mo32626a(C20541m mVar, boolean z) {
        int i;
        if (z) {
            i = mVar.f57810b + mVar.mo32103n();
        } else {
            i = -1;
        }
        if (this.f59245f) {
            if (z) {
                this.f59245f = false;
                mVar.mo32113x(i);
                this.f59243d = 0;
            } else {
                return;
            }
        }
        while (true) {
            int i2 = mVar.f57811c;
            int i3 = mVar.f57810b;
            if (i2 - i3 > 0) {
                int i4 = this.f59243d;
                boolean z2 = true;
                if (i4 < 3) {
                    if (i4 == 0) {
                        int n = mVar.mo32103n();
                        mVar.mo32113x(mVar.f57810b - 1);
                        if (n == 255) {
                            this.f59245f = true;
                            return;
                        }
                    }
                    int min = Math.min(mVar.f57811c - mVar.f57810b, 3 - this.f59243d);
                    mVar.mo32091b(this.f59241b.f57809a, this.f59243d, min);
                    int i5 = this.f59243d + min;
                    this.f59243d = i5;
                    if (i5 == 3) {
                        this.f59241b.mo32110u(3);
                        this.f59241b.mo32114y(1);
                        int n2 = this.f59241b.mo32103n();
                        int n3 = this.f59241b.mo32103n();
                        if ((n2 & 128) == 0) {
                            z2 = false;
                        }
                        this.f59244e = z2;
                        this.f59242c = (((n2 & 15) << 8) | n3) + 3;
                        int a = this.f59241b.mo32090a();
                        int i6 = this.f59242c;
                        if (a < i6) {
                            C20541m mVar2 = this.f59241b;
                            byte[] bArr = mVar2.f57809a;
                            mVar2.mo32110u(Math.min(4098, Math.max(i6, bArr.length * 2)));
                            System.arraycopy(bArr, 0, this.f59241b.f57809a, 0, 3);
                        }
                    }
                } else {
                    int min2 = Math.min(i2 - i3, this.f59242c - i4);
                    mVar.mo32091b(this.f59241b.f57809a, this.f59243d, min2);
                    int i7 = this.f59243d + min2;
                    this.f59243d = i7;
                    int i8 = this.f59242c;
                    if (i7 != i8) {
                        continue;
                    } else {
                        if (this.f59244e) {
                            byte[] bArr2 = this.f59241b.f57809a;
                            int i9 = -1;
                            for (int i15 = 0; i15 < i8; i15++) {
                                i9 = C20551y.f57841g[((i9 >>> 24) ^ (bArr2[i15] & ExifInterface.MARKER)) & ExifInterface.MARKER] ^ (i9 << 8);
                            }
                            int i16 = C20551y.f57835a;
                            if (i9 != 0) {
                                this.f59245f = true;
                                return;
                            }
                            this.f59241b.mo32110u(this.f59242c - 4);
                        } else {
                            this.f59241b.mo32110u(i8);
                        }
                        this.f59240a.mo32630a(this.f59241b);
                        this.f59243d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo32627b() {
        this.f59245f = true;
    }

    /* renamed from: c */
    public void mo32628c(C20549u uVar, C16743g gVar, C20923v.C20927d dVar) {
        this.f59240a.mo32631c(uVar, gVar, dVar);
        this.f59245f = true;
    }
}
