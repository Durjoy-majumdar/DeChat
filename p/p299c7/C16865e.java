package p299c7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import p294b7.C16750m;
import p299c7.C16863d;
import p333e8.C20537k;
import p333e8.C20541m;
import p337f8.C20679a;

/* renamed from: c7.e */
public final class C16865e extends C16863d {

    /* renamed from: b */
    public final C20541m f45584b = new C20541m(C20537k.f57788a);

    /* renamed from: c */
    public final C20541m f45585c = new C20541m(4);

    /* renamed from: d */
    public int f45586d;

    /* renamed from: e */
    public boolean f45587e;

    /* renamed from: f */
    public int f45588f;

    public C16865e(C16750m mVar) {
        super(mVar);
    }

    /* renamed from: a */
    public boolean mo17912a(C20541m mVar) {
        int n = mVar.mo32103n();
        int i = (n >> 4) & 15;
        int i2 = n & 15;
        if (i2 == 7) {
            this.f45588f = i;
            return i != 5;
        }
        throw new C16863d.C16864a("Video format not supported: " + i2);
    }

    /* renamed from: b */
    public void mo17913b(C20541m mVar, long j) {
        int n = mVar.mo32103n();
        long p = j + (((long) mVar.mo32105p()) * 1000);
        if (n == 0 && !this.f45587e) {
            C20541m mVar2 = new C20541m(new byte[(mVar.f57811c - mVar.f57810b)]);
            mVar.mo32091b(mVar2.f57809a, 0, mVar.f57811c - mVar.f57810b);
            C20679a a = C20679a.m22613a(mVar2);
            this.f45586d = a.f58428b;
            this.f45583a.mo17741a(Format.m16649j((String) null, "video/avc", (String) null, -1, -1, a.f58429c, a.f58430d, -1.0f, a.f58427a, -1, a.f58431e, (DrmInitData) null));
            this.f45587e = true;
        } else if (n == 1 && this.f45587e) {
            byte[] bArr = this.f45585c.f57809a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.f45586d;
            int i2 = 0;
            while (mVar.f57811c - mVar.f57810b > 0) {
                mVar.mo32091b(this.f45585c.f57809a, i, this.f45586d);
                this.f45585c.mo32113x(0);
                int q = this.f45585c.mo32106q();
                this.f45584b.mo32113x(0);
                this.f45583a.mo17742b(this.f45584b, 4);
                this.f45583a.mo17742b(mVar, q);
                i2 = i2 + 4 + q;
            }
            this.f45583a.mo17744d(p, this.f45588f == 1 ? 1 : 0, i2, 0, (C16750m.C16751a) null);
        }
    }
}
