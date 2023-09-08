package p345h7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import p294b7.C16743g;
import p294b7.C16750m;
import p333e8.C20541m;
import p345h7.C20923v;

/* renamed from: h7.g */
public final class C20900g implements C20901h {

    /* renamed from: a */
    public final List<C20923v.C20924a> f59091a;

    /* renamed from: b */
    public final C16750m[] f59092b;

    /* renamed from: c */
    public boolean f59093c;

    /* renamed from: d */
    public int f59094d;

    /* renamed from: e */
    public int f59095e;

    /* renamed from: f */
    public long f59096f;

    public C20900g(List<C20923v.C20924a> list) {
        this.f59091a = list;
        this.f59092b = new C16750m[list.size()];
    }

    /* renamed from: a */
    public void mo32609a(C20541m mVar) {
        boolean z;
        boolean z2;
        if (this.f59093c) {
            if (this.f59094d == 2) {
                if (mVar.f57811c - mVar.f57810b == 0) {
                    z2 = false;
                } else {
                    if (mVar.mo32103n() != 32) {
                        this.f59093c = false;
                    }
                    this.f59094d--;
                    z2 = this.f59093c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f59094d == 1) {
                if (mVar.f57811c - mVar.f57810b == 0) {
                    z = false;
                } else {
                    if (mVar.mo32103n() != 0) {
                        this.f59093c = false;
                    }
                    this.f59094d--;
                    z = this.f59093c;
                }
                if (!z) {
                    return;
                }
            }
            int i = mVar.f57810b;
            int i2 = mVar.f57811c - i;
            for (C16750m b : this.f59092b) {
                mVar.mo32113x(i);
                b.mo17742b(mVar, i2);
            }
            this.f59095e += i2;
        }
    }

    /* renamed from: b */
    public void mo32610b() {
        this.f59093c = false;
    }

    /* renamed from: c */
    public void mo32611c() {
        if (this.f59093c) {
            for (C16750m d : this.f59092b) {
                d.mo17744d(this.f59096f, 1, this.f59095e, 0, (C16750m.C16751a) null);
            }
            this.f59093c = false;
        }
    }

    /* renamed from: d */
    public void mo32612d(C16743g gVar, C20923v.C20927d dVar) {
        for (int i = 0; i < this.f59092b.length; i++) {
            C20923v.C20924a aVar = this.f59091a.get(i);
            dVar.mo32634a();
            dVar.mo32635b();
            C16750m o = gVar.mo17752o(dVar.f59280d, 3);
            dVar.mo32635b();
            o.mo17741a(Format.m16643d(dVar.f59281e, MimeTypes.APPLICATION_DVBSUBS, (String) null, -1, Collections.singletonList(aVar.f59273b), aVar.f59272a, (DrmInitData) null));
            this.f59092b[i] = o;
        }
    }

    /* renamed from: e */
    public void mo32613e(long j, boolean z) {
        if (z) {
            this.f59093c = true;
            this.f59096f = j;
            this.f59095e = 0;
            this.f59094d = 2;
        }
    }
}
