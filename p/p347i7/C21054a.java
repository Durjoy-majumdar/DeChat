package p347i7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.List;
import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16747k;
import p294b7.C16748l;
import p294b7.C16750m;
import p333e8.C20541m;
import p333e8.C20551y;
import p347i7.C21056c;
import p396x6.C23015n;

/* renamed from: i7.a */
public final class C21054a implements C16741e, C16748l {

    /* renamed from: a */
    public C16743g f59562a;

    /* renamed from: b */
    public C16750m f59563b;

    /* renamed from: c */
    public C21055b f59564c;

    /* renamed from: d */
    public int f59565d;

    /* renamed from: e */
    public int f59566e;

    /* renamed from: a */
    public int mo17745a(C16742f fVar, C16747k kVar) {
        C16742f fVar2 = fVar;
        if (this.f59564c == null) {
            C21055b a = C21056c.m23243a(fVar);
            this.f59564c = a;
            if (a != null) {
                int i = a.f59568b;
                int i2 = a.f59567a;
                this.f59563b.mo17741a(Format.m16641b((String) null, MimeTypes.AUDIO_RAW, (String) null, a.f59571e * i * i2, 32768, i2, i, a.f59572f, (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
                this.f59565d = this.f59564c.f59570d;
            } else {
                throw new C23015n("Unsupported or unrecognized wav header.");
            }
        }
        C21055b bVar = this.f59564c;
        if (!((bVar.f59573g == 0 || bVar.f59574h == 0) ? false : true)) {
            fVar.getClass();
            bVar.getClass();
            C16738b bVar2 = (C16738b) fVar2;
            bVar2.f45244e = 0;
            C20541m mVar = new C20541m(8);
            C21056c.C21057a a2 = C21056c.C21057a.m23244a(fVar2, mVar);
            while (a2.f59575a != C20551y.m22316f("data")) {
                int i3 = a2.f59575a;
                long j = a2.f59576b + 8;
                if (i3 == C20551y.m22316f("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    bVar2.mo17738f((int) j);
                    a2 = C21056c.C21057a.m23244a(fVar2, mVar);
                } else {
                    throw new C23015n("Chunk is too large (~2GB+) to skip; id: " + a2.f59575a);
                }
            }
            bVar2.mo17738f(8);
            long j2 = bVar2.f45242c;
            long j3 = a2.f59576b;
            bVar.f59573g = j2;
            bVar.f59574h = j3;
            this.f59562a.mo17750g(this);
        }
        int c = this.f59563b.mo17743c(fVar2, 32768 - this.f59566e, true);
        if (c != -1) {
            this.f59566e += c;
        }
        int i4 = this.f59566e;
        int i5 = this.f59565d;
        int i6 = i4 / i5;
        if (i6 > 0) {
            C21055b bVar3 = this.f59564c;
            int i7 = i6 * i5;
            int i8 = i4 - i7;
            this.f59566e = i8;
            this.f59563b.mo17744d(((((C16738b) fVar2).f45242c - ((long) i4)) * TimeUtil.SECOND_TO_US) / ((long) bVar3.f59569c), 1, i7, i8, (C16750m.C16751a) null);
        }
        return c == -1 ? -1 : 0;
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        this.f59566e = 0;
    }

    /* renamed from: c */
    public boolean mo17747c(C16742f fVar) {
        return C21056c.m23243a(fVar) != null;
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f59562a = gVar;
        this.f59563b = gVar.mo17752o(0, 1);
        this.f59564c = null;
        gVar.mo17751i();
    }

    /* renamed from: f */
    public boolean mo17730f() {
        return true;
    }

    /* renamed from: g */
    public long mo17731g(long j) {
        C21055b bVar = this.f59564c;
        long j2 = (j * ((long) bVar.f59569c)) / TimeUtil.SECOND_TO_US;
        long j3 = (long) bVar.f59570d;
        return Math.min((j2 / j3) * j3, bVar.f59574h - j3) + bVar.f59573g;
    }

    /* renamed from: h */
    public long mo17732h() {
        C21055b bVar = this.f59564c;
        return ((bVar.f59574h / ((long) bVar.f59570d)) * TimeUtil.SECOND_TO_US) / ((long) bVar.f59568b);
    }

    public void release() {
    }
}
