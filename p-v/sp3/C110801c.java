package sp3;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tavkit.composition.TAVClip;
import com.tencent.tavkit.composition.model.TAVAudioConfiguration;
import com.tencent.tavkit.composition.resource.TAVResource;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import rr3.C110625c0;
import sx3.C110818d0;
import yp3.C112478a;

/* renamed from: sp3.c */
public final class C110801c {

    /* renamed from: v */
    public static final C101691a f331462v = new C101691a((C8480h) null);

    /* renamed from: a */
    public long f331463a;

    /* renamed from: b */
    public long f331464b;

    /* renamed from: c */
    public long f331465c;

    /* renamed from: d */
    public long f331466d;

    /* renamed from: e */
    public long f331467e;

    /* renamed from: f */
    public float f331468f = 1.0f;

    /* renamed from: g */
    public float f331469g = 1.0f;

    /* renamed from: h */
    public long f331470h;

    /* renamed from: i */
    public int f331471i;

    /* renamed from: j */
    public int f331472j;

    /* renamed from: k */
    public int f331473k;

    /* renamed from: l */
    public Rect f331474l = new Rect();

    /* renamed from: m */
    public Rect f331475m = new Rect();

    /* renamed from: n */
    public boolean f331476n = true;

    /* renamed from: o */
    public C110805h f331477o = new C110805h((String) null, (C110625c0) null, 0, 7, (C8480h) null);

    /* renamed from: p */
    public long f331478p;

    /* renamed from: q */
    public long f331479q;

    /* renamed from: r */
    public boolean f331480r = true;

    /* renamed from: s */
    public TAVClip f331481s;

    /* renamed from: t */
    public String f331482t;

    /* renamed from: u */
    public int f331483u;

    /* renamed from: sp3.c$a */
    public static final class C101691a {
        public C101691a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo141145a(List<C110801c> list) {
            C87412m.m108595h(list, "trackList");
            if (!list.isEmpty()) {
                C110801c cVar = null;
                long j = 0;
                long j2 = 0;
                for (C110801c cVar2 : list) {
                    long j3 = (long) (((float) (cVar2.f331467e - cVar2.f331466d)) / cVar2.f331468f);
                    long min = Math.min(cVar2.f331477o.mo162376b() ? cVar2.f331477o.f331495c : 0, Math.min(j, j3));
                    if (cVar != null) {
                        cVar.f331479q = j2 - (min / ((long) 2));
                    }
                    cVar2.f331478p = j2 - (min / ((long) 2));
                    cVar2.mo162366d(j2 - min);
                    cVar2.mo162365c(cVar2.f331464b + j3);
                    j2 = cVar2.f331465c;
                    cVar = cVar2;
                    j = j3;
                }
                C110801c cVar3 = (C110801c) C110818d0.m150923U(list);
                cVar3.f331479q = cVar3.f331465c;
            }
        }
    }

    public C110801c(String str, int i) {
        Bitmap bitmap;
        C87412m.m108595h(str, "path");
        this.f331482t = str;
        this.f331483u = i;
        C112478a.m153625c("CompositionTrack", "create VCLogCompositionTrack path:" + this.f331482t + ", type:" + this.f331483u + ", id:" + this.f331463a, new Object[0]);
        int i2 = this.f331483u;
        if (i2 == 1) {
            mo162363a();
            synchronized (C110803f.f331490g) {
                bitmap = C110803f.f331486c.get(this.f331482t);
            }
            if (bitmap != null) {
                this.f331471i = bitmap.getWidth();
                this.f331472j = bitmap.getHeight();
                C112478a.m153625c("CompositionTrack", "initImageClipInfo sourceWidth:" + this.f331471i + ", sourceHeight:" + this.f331472j, new Object[0]);
            }
        } else if (i2 == 2 || i2 == 3) {
            C110806j d = C110803f.f331490g.mo162374d(this.f331482t);
            if (d != null) {
                this.f331471i = d.f331496a;
                this.f331472j = d.f331497b;
                C112478a.m153625c("CompositionTrack", "initVideoClipInfo, sourceWidth:" + this.f331471i + ", sourceHeight:" + this.f331472j, new Object[0]);
            } else {
                C112478a.m153625c("CompositionTrack", "initVideoClipInfo failed", new Object[0]);
            }
        }
        CMTime duration = mo162363a().getDuration();
        C87412m.m108590c(duration, "getResource().duration");
        this.f331470h = duration.getTimeUs() / ((long) 1000);
        mo162368f(0);
        mo162367e(this.f331470h);
        mo162365c(this.f331467e);
    }

    /* renamed from: a */
    public final TAVResource mo162363a() {
        return C110803f.f331490g.mo162373c(this);
    }

    /* renamed from: b */
    public final C110805h mo162364b() {
        return this.f331477o;
    }

    /* renamed from: c */
    public final void mo162365c(long j) {
        if (j >= 0) {
            this.f331465c = j;
        }
    }

    /* renamed from: d */
    public final void mo162366d(long j) {
        if (j >= 0) {
            this.f331464b = j;
        }
    }

    /* renamed from: e */
    public final void mo162367e(long j) {
        if (j >= 0) {
            this.f331467e = j;
        }
    }

    /* renamed from: f */
    public final void mo162368f(long j) {
        if (j >= 0) {
            this.f331466d = j;
        }
    }

    /* renamed from: g */
    public final void mo162369g(float f) {
        TAVClip tAVClip;
        TAVAudioConfiguration audioConfiguration;
        this.f331469g = f;
        if ((this.f331483u != 2 || this.f331480r) && (tAVClip = this.f331481s) != null && (audioConfiguration = tAVClip.getAudioConfiguration()) != null) {
            audioConfiguration.setVolume(f);
        }
    }

    /* renamed from: h */
    public final void mo162370h() {
        mo162365c((long) (((float) this.f331464b) + (((float) (this.f331467e - this.f331466d)) / this.f331468f)));
    }
}
