package p341g7;

import java.io.EOFException;
import p294b7.C16738b;
import p294b7.C16742f;
import p333e8.C20541m;
import p333e8.C20551y;
import p396x6.C23015n;

/* renamed from: g7.e */
public final class C20797e {

    /* renamed from: h */
    public static final int f58765h = C20551y.m22316f("OggS");

    /* renamed from: a */
    public int f58766a;

    /* renamed from: b */
    public long f58767b;

    /* renamed from: c */
    public int f58768c;

    /* renamed from: d */
    public int f58769d;

    /* renamed from: e */
    public int f58770e;

    /* renamed from: f */
    public final int[] f58771f = new int[255];

    /* renamed from: g */
    public final C20541m f58772g = new C20541m(255);

    /* renamed from: a */
    public boolean mo32499a(C16742f fVar, boolean z) {
        this.f58772g.mo32109t();
        this.f58766a = 0;
        this.f58767b = 0;
        this.f58768c = 0;
        this.f58769d = 0;
        this.f58770e = 0;
        C16738b bVar = (C16738b) fVar;
        long j = bVar.f45241b;
        if (!(j == -1 || j - (bVar.f45242c + ((long) bVar.f45244e)) >= 27) || !bVar.mo17734b(this.f58772g.f57809a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f58772g.mo32104o() != ((long) f58765h)) {
            if (z) {
                return false;
            }
            throw new C23015n("expected OggS capture pattern at begin of page");
        } else if (this.f58772g.mo32103n() == 0) {
            this.f58766a = this.f58772g.mo32103n();
            C20541m mVar = this.f58772g;
            byte[] bArr = mVar.f57809a;
            int i = mVar.f57810b;
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            mVar.f57810b = i8 + 1;
            this.f58767b = ((((long) bArr[i8]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48);
            mVar.mo32095f();
            this.f58772g.mo32095f();
            this.f58772g.mo32095f();
            int n = this.f58772g.mo32103n();
            this.f58768c = n;
            this.f58769d = n + 27;
            this.f58772g.mo32109t();
            bVar.mo17734b(this.f58772g.f57809a, 0, this.f58768c, false);
            for (int i9 = 0; i9 < this.f58768c; i9++) {
                this.f58771f[i9] = this.f58772g.mo32103n();
                this.f58770e += this.f58771f[i9];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new C23015n("unsupported bit stream revision");
        }
    }
}
