package p299c7;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import p294b7.C16750m;
import p299c7.C16863d;
import p333e8.C20530d;
import p333e8.C20541m;

/* renamed from: c7.a */
public final class C16860a extends C16863d {

    /* renamed from: e */
    public static final int[] f45564e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f45565b;

    /* renamed from: c */
    public boolean f45566c;

    /* renamed from: d */
    public int f45567d;

    public C16860a(C16750m mVar) {
        super(mVar);
    }

    /* renamed from: a */
    public boolean mo17908a(C20541m mVar) {
        if (!this.f45565b) {
            int n = mVar.mo32103n();
            int i = (n >> 4) & 15;
            this.f45567d = i;
            if (i == 2) {
                this.f45583a.mo17741a(Format.m16642c((String) null, MimeTypes.AUDIO_MPEG, (String) null, -1, -1, 1, f45564e[(n >> 2) & 3], (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
                this.f45566c = true;
            } else if (i == 7 || i == 8) {
                this.f45583a.mo17741a(Format.m16641b((String) null, i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW, (String) null, -1, -1, 1, 8000, (n & 1) == 1 ? 2 : 3, (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
                this.f45566c = true;
            } else if (i != 10) {
                throw new C16863d.C16864a("Audio format not supported: " + this.f45567d);
            }
            this.f45565b = true;
        } else {
            mVar.mo32114y(1);
        }
        return true;
    }

    /* renamed from: b */
    public void mo17909b(C20541m mVar, long j) {
        C20541m mVar2 = mVar;
        if (this.f45567d == 2) {
            int i = mVar2.f57811c - mVar2.f57810b;
            this.f45583a.mo17742b(mVar2, i);
            this.f45583a.mo17744d(j, 1, i, 0, (C16750m.C16751a) null);
            return;
        }
        int n = mVar.mo32103n();
        if (n == 0 && !this.f45566c) {
            int i2 = mVar2.f57811c - mVar2.f57810b;
            byte[] bArr = new byte[i2];
            mVar2.mo32091b(bArr, 0, i2);
            Pair<Integer, Integer> b = C20530d.m22243b(bArr);
            this.f45583a.mo17741a(Format.m16642c((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) b.second).intValue(), ((Integer) b.first).intValue(), Collections.singletonList(bArr), (DrmInitData) null, 0, (String) null));
            this.f45566c = true;
        } else if (this.f45567d != 10 || n == 1) {
            int i3 = mVar2.f57811c - mVar2.f57810b;
            this.f45583a.mo17742b(mVar2, i3);
            this.f45583a.mo17744d(j, 1, i3, 0, (C16750m.C16751a) null);
        }
    }
}
