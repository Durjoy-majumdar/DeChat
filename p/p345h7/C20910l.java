package p345h7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import p294b7.C16743g;
import p294b7.C16750m;
import p333e8.C20541m;
import p345h7.C20923v;

/* renamed from: h7.l */
public final class C20910l implements C20901h {

    /* renamed from: a */
    public final C20541m f59191a = new C20541m(10);

    /* renamed from: b */
    public C16750m f59192b;

    /* renamed from: c */
    public boolean f59193c;

    /* renamed from: d */
    public long f59194d;

    /* renamed from: e */
    public int f59195e;

    /* renamed from: f */
    public int f59196f;

    /* renamed from: a */
    public void mo32609a(C20541m mVar) {
        if (this.f59193c) {
            int i = mVar.f57811c - mVar.f57810b;
            int i2 = this.f59196f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(mVar.f57809a, mVar.f57810b, this.f59191a.f57809a, this.f59196f, min);
                if (this.f59196f + min == 10) {
                    this.f59191a.mo32113x(0);
                    if (73 == this.f59191a.mo32103n() && 68 == this.f59191a.mo32103n() && 51 == this.f59191a.mo32103n()) {
                        this.f59191a.mo32114y(3);
                        this.f59195e = this.f59191a.mo32102m() + 10;
                    } else {
                        this.f59193c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i, this.f59195e - this.f59196f);
            this.f59192b.mo17742b(mVar, min2);
            this.f59196f += min2;
        }
    }

    /* renamed from: b */
    public void mo32610b() {
        this.f59193c = false;
    }

    /* renamed from: c */
    public void mo32611c() {
        int i;
        if (this.f59193c && (i = this.f59195e) != 0 && this.f59196f == i) {
            this.f59192b.mo17744d(this.f59194d, 1, i, 0, (C16750m.C16751a) null);
            this.f59193c = false;
        }
    }

    /* renamed from: d */
    public void mo32612d(C16743g gVar, C20923v.C20927d dVar) {
        dVar.mo32634a();
        dVar.mo32635b();
        C16750m o = gVar.mo17752o(dVar.f59280d, 4);
        this.f59192b = o;
        dVar.mo32635b();
        o.mo17741a(Format.m16645f(dVar.f59281e, MimeTypes.APPLICATION_ID3, (String) null, -1, (DrmInitData) null));
    }

    /* renamed from: e */
    public void mo32613e(long j, boolean z) {
        if (z) {
            this.f59193c = true;
            this.f59194d = j;
            this.f59195e = 0;
            this.f59196f = 0;
        }
    }
}
