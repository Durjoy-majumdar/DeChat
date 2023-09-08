package p345h7;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.tav.coremedia.TimeUtil;
import java.util.List;
import p294b7.C16743g;
import p294b7.C16746j;
import p294b7.C16750m;
import p333e8.C20541m;
import p345h7.C20923v;

/* renamed from: h7.m */
public final class C20911m implements C20901h {

    /* renamed from: a */
    public final C20541m f59197a;

    /* renamed from: b */
    public final C16746j f59198b;

    /* renamed from: c */
    public final String f59199c;

    /* renamed from: d */
    public String f59200d;

    /* renamed from: e */
    public C16750m f59201e;

    /* renamed from: f */
    public int f59202f = 0;

    /* renamed from: g */
    public int f59203g;

    /* renamed from: h */
    public boolean f59204h;

    /* renamed from: i */
    public boolean f59205i;

    /* renamed from: j */
    public long f59206j;

    /* renamed from: k */
    public int f59207k;

    /* renamed from: l */
    public long f59208l;

    public C20911m(String str) {
        C20541m mVar = new C20541m(4);
        this.f59197a = mVar;
        mVar.f57809a[0] = -1;
        this.f59198b = new C16746j();
        this.f59199c = str;
    }

    /* renamed from: a */
    public void mo32609a(C20541m mVar) {
        C20541m mVar2 = mVar;
        while (true) {
            int i = mVar2.f57811c;
            int i2 = mVar2.f57810b;
            if (i - i2 > 0) {
                int i3 = this.f59202f;
                if (i3 == 0) {
                    byte[] bArr = mVar2.f57809a;
                    while (true) {
                        if (i2 >= i) {
                            mVar2.mo32113x(i);
                            break;
                        }
                        byte b = bArr[i2];
                        boolean z = (b & ExifInterface.MARKER) == 255;
                        boolean z2 = this.f59205i && (b & 224) == 224;
                        this.f59205i = z;
                        if (z2) {
                            mVar2.mo32113x(i2 + 1);
                            this.f59205i = false;
                            this.f59197a.f57809a[1] = bArr[i2];
                            this.f59203g = 2;
                            this.f59202f = 1;
                            break;
                        }
                        i2++;
                    }
                } else if (i3 == 1) {
                    int min = Math.min(i - i2, 4 - this.f59203g);
                    mVar2.mo32091b(this.f59197a.f57809a, this.f59203g, min);
                    int i4 = this.f59203g + min;
                    this.f59203g = i4;
                    if (i4 >= 4) {
                        this.f59197a.mo32113x(0);
                        if (!C16746j.m16335b(this.f59197a.mo32092c(), this.f59198b)) {
                            this.f59203g = 0;
                            this.f59202f = 1;
                        } else {
                            C16746j jVar = this.f59198b;
                            this.f59207k = jVar.f45259c;
                            if (!this.f59204h) {
                                long j = ((long) jVar.f45263g) * TimeUtil.SECOND_TO_US;
                                int i5 = jVar.f45260d;
                                this.f59206j = j / ((long) i5);
                                this.f59201e.mo17741a(Format.m16642c(this.f59200d, jVar.f45258b, (String) null, -1, 4096, jVar.f45261e, i5, (List<byte[]>) null, (DrmInitData) null, 0, this.f59199c));
                                this.f59204h = true;
                            }
                            this.f59197a.mo32113x(0);
                            this.f59201e.mo17742b(this.f59197a, 4);
                            this.f59202f = 2;
                        }
                    }
                } else if (i3 == 2) {
                    int min2 = Math.min(i - i2, this.f59207k - this.f59203g);
                    this.f59201e.mo17742b(mVar2, min2);
                    int i6 = this.f59203g + min2;
                    this.f59203g = i6;
                    int i7 = this.f59207k;
                    if (i6 >= i7) {
                        this.f59201e.mo17744d(this.f59208l, 1, i7, 0, (C16750m.C16751a) null);
                        this.f59208l += this.f59206j;
                        this.f59203g = 0;
                        this.f59202f = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo32610b() {
        this.f59202f = 0;
        this.f59203g = 0;
        this.f59205i = false;
    }

    /* renamed from: c */
    public void mo32611c() {
    }

    /* renamed from: d */
    public void mo32612d(C16743g gVar, C20923v.C20927d dVar) {
        dVar.mo32634a();
        dVar.mo32635b();
        this.f59200d = dVar.f59281e;
        dVar.mo32635b();
        this.f59201e = gVar.mo17752o(dVar.f59280d, 1);
    }

    /* renamed from: e */
    public void mo32613e(long j, boolean z) {
        this.f59208l = j;
    }
}
