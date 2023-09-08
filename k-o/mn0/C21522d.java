package mn0;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import p295b8.C16762b;
import p295b8.C16772f;
import p300c8.C16871d;
import p370p7.C21961u;

/* renamed from: mn0.d */
public final class C21522d extends C16762b {

    /* renamed from: g */
    public final C16871d f60942g;

    /* renamed from: h */
    public final int f60943h;

    /* renamed from: i */
    public final float f60944i;

    /* renamed from: j */
    public final long f60945j;

    /* renamed from: k */
    public final long f60946k;

    /* renamed from: l */
    public int f60947l;

    /* renamed from: m */
    public int f60948m;

    /* renamed from: n */
    public volatile double f60949n = -1.0d;

    /* renamed from: mn0.d$a */
    public static final class C21523a implements C16772f.C16773a {

        /* renamed from: a */
        public final C16871d f60950a;

        /* renamed from: b */
        public final int f60951b;

        /* renamed from: c */
        public final int f60952c;

        /* renamed from: d */
        public final int f60953d;

        /* renamed from: e */
        public final int f60954e;

        /* renamed from: f */
        public final float f60955f;

        /* renamed from: g */
        public final ArrayList<C21522d> f60956g = new ArrayList<>();

        /* renamed from: h */
        public volatile double f60957h = -1.0d;

        public C21523a(C16871d dVar, int i, int i2, int i3, int i4, float f) {
            C87412m.m108594g(dVar, "bandwidthMeter");
            this.f60950a = dVar;
            this.f60951b = i;
            this.f60952c = i2;
            this.f60953d = i3;
            this.f60954e = i4;
            this.f60955f = f;
        }

        /* renamed from: a */
        public C16772f mo17787a(C21961u uVar, int[] iArr) {
            C87412m.m108594g(uVar, "group");
            C87412m.m108594g(iArr, "tracks");
            C21522d dVar = new C21522d(uVar, iArr, this.f60950a, this.f60951b, (long) this.f60952c, (long) this.f60953d, (long) this.f60954e, this.f60955f);
            dVar.f60949n = this.f60957h;
            this.f60956g.add(dVar);
            return dVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21522d(C21961u uVar, int[] iArr, C16871d dVar, int i, long j, long j2, long j3, float f) {
        super(uVar, Arrays.copyOf(iArr, iArr.length));
        C87412m.m108594g(uVar, "group");
        C87412m.m108594g(iArr, "tracks");
        C87412m.m108594g(dVar, "bandwidthMeter");
        this.f60942g = dVar;
        this.f60943h = i;
        this.f60944i = f;
        this.f60945j = j * 1000;
        this.f60946k = j2 * 1000;
        C21518b bVar = dVar instanceof C21518b ? (C21518b) dVar : null;
        if (bVar != null) {
            bVar.f60930j = -1;
        }
        this.f60947l = mo33734l(-1);
        this.f60948m = 1;
    }

    /* renamed from: g */
    public void mo17782g(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.f60947l;
        int l = mo33734l(elapsedRealtime);
        this.f60947l = l;
        if (l != i) {
            if (!mo17797k(i, elapsedRealtime)) {
                Format[] formatArr = this.f45305d;
                Format format = formatArr[i];
                int i2 = formatArr[this.f60947l].f45773e;
                int i3 = format.f45773e;
                if (i2 > i3 && j < this.f60945j) {
                    Log.m105924i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] updateSelectedTrack < selectIndex = " + this.f60947l + ", bufferedDurationUs = " + j + ", min = " + this.f60945j);
                    this.f60947l = i;
                } else if (i2 < i3 && j >= this.f60946k) {
                    Log.m105924i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] updateSelectedTrack > selectIndex = " + this.f60947l + ", bufferedDurationUs = " + j);
                    this.f60947l = i;
                }
            }
            if (this.f60947l != i) {
                this.f60948m = 3;
            }
        }
        Log.m105924i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] updateSelectedTrack selectIndex = " + this.f60947l);
    }

    public int getSelectedIndex() {
        return this.f60947l;
    }

    /* renamed from: i */
    public Object mo17784i() {
        return null;
    }

    /* renamed from: j */
    public int mo17785j() {
        return this.f60948m;
    }

    /* renamed from: l */
    public final int mo33734l(long j) {
        long b = this.f60942g.mo17927b();
        double d = this.f60949n;
        long j2 = (Double.isNaN(d) || 0.0d >= d) ? b == -1 ? (long) this.f60943h : (long) (((float) b) * this.f60944i) : (long) d;
        Log.m105924i("MicroMsg.AdavanceTrackSelection", "[TRACE_ADAPTIVE] determineIdealSelectedIndex bitrateEstimate = " + b + ", effectiveBitrate = " + j2);
        int i = this.f45303b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (j == -1 || !mo17797k(i3, j)) {
                if (((long) this.f45305d[i3].f45773e) <= j2) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
