package mr1;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: mr1.s */
public final class C61575s implements Cloneable {

    /* renamed from: A */
    public JSONObject f175114A;

    /* renamed from: B */
    public int f175115B;

    /* renamed from: C */
    public int f175116C;

    /* renamed from: d */
    public String f175117d = "";

    /* renamed from: e */
    public int f175118e;

    /* renamed from: f */
    public long f175119f;

    /* renamed from: g */
    public int f175120g;

    /* renamed from: h */
    public int f175121h;

    /* renamed from: i */
    public long f175122i;

    /* renamed from: j */
    public long f175123j;

    /* renamed from: n */
    public long f175124n;

    /* renamed from: o */
    public int f175125o;

    /* renamed from: p */
    public int f175126p = -1;

    /* renamed from: q */
    public int f175127q = -1;

    /* renamed from: r */
    public int f175128r = -1;

    /* renamed from: s */
    public int f175129s = -1;

    /* renamed from: t */
    public int f175130t;

    /* renamed from: u */
    public int f175131u = -1;

    /* renamed from: v */
    public int f175132v;

    /* renamed from: w */
    public int f175133w;

    /* renamed from: x */
    public CopyOnWriteArrayList<Integer> f175134x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    public CopyOnWriteArrayList<Integer> f175135y = new CopyOnWriteArrayList<>();

    /* renamed from: z */
    public String f175136z = "";

    /* renamed from: a */
    public final C61575s mo86511a() {
        Object clone = super.clone();
        C87412m.m108592e(clone, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.reporter.OnStopPlayData");
        C61575s sVar = (C61575s) clone;
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        sVar.f175135y = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(this.f175135y);
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
        sVar.f175134x = copyOnWriteArrayList2;
        copyOnWriteArrayList2.addAll(this.f175134x);
        JSONObject jSONObject = this.f175114A;
        if (jSONObject != null) {
            sVar.f175114A = new JSONObject(jSONObject.toString());
        }
        return sVar;
    }

    /* renamed from: b */
    public final float mo86512b() {
        long j = this.f175119f;
        if (j == 0) {
            return -1.0f;
        }
        return (((float) this.f175118e) * 1000.0f) / ((float) j);
    }

    /* renamed from: c */
    public final void mo86513c() {
        if (this.f175123j != 0 && this.f175119f <= 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f175123j;
            if (elapsedRealtime >= 0) {
                this.f175119f += elapsedRealtime;
            }
            if (elapsedRealtime > this.f175122i) {
                this.f175122i = elapsedRealtime;
            }
            Log.m105924i("OnStopPlayData", "onBlur focusTimeMs:" + elapsedRealtime + " focusMaxTimeMs:" + this.f175122i + " blurFPS:" + mo86512b() + ' ' + this.f175117d);
        }
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: d */
    public final void mo86515d() {
        if (this.f175123j == 0) {
            this.f175123j = SystemClock.elapsedRealtime();
            this.f175121h++;
            Log.m105924i("OnStopPlayData", "onFocus focusTotalCount:" + this.f175121h + ' ' + this.f175117d);
        }
    }

    /* renamed from: e */
    public final void mo86516e(long j, long j2) {
        if (j - this.f175124n > 1000) {
            this.f175134x.add(Integer.valueOf((int) (j / ((long) 1000))));
            int i = this.f175118e - this.f175125o;
            this.f175135y.add(Integer.valueOf(i));
            int i2 = this.f175129s;
            if (i < i2 || i2 == -1) {
                this.f175129s = i;
            }
            int i3 = this.f175128r;
            if (i > i3 || i3 == -1) {
                this.f175128r = i;
            }
            if (this.f175126p == -1) {
                this.f175126p = i;
            }
            this.f175127q = i;
            if (i < this.f175131u) {
                this.f175130t++;
            }
            this.f175125o = this.f175118e;
            this.f175124n = j;
        }
    }

    /* renamed from: f */
    public final void mo86517f() {
        this.f175118e = 0;
        this.f175119f = 0;
        this.f175120g = 0;
        this.f175121h = 0;
        this.f175122i = 0;
        this.f175123j = 0;
        this.f175124n = -1;
        this.f175125o = 0;
        this.f175128r = -1;
        this.f175129s = -1;
        this.f175126p = -1;
        this.f175127q = -1;
        this.f175130t = 0;
        this.f175131u = 0;
        this.f175132v = 0;
        this.f175133w = 0;
        this.f175136z = "";
        this.f175115B = 0;
        this.f175116C = 0;
        this.f175134x.clear();
        this.f175135y.clear();
    }

    public String toString() {
        return "OnStopPlayData hitPreloadSize:" + this.f175115B + " TextureUpdateCount:" + this.f175118e + " PlayerState:" + this.f175120g + "  FocusTotalTimeMs:" + this.f175119f + " FocusTotalCount:" + this.f175121h + " FocusMaxTimeMs:" + this.f175122i + " FocusFps:" + mo86512b() + " lessVideoFpsCount:" + this.f175130t + " videoFps:" + this.f175131u + " focusMinFps:" + this.f175129s + " focusMaxFps:" + this.f175128r + " firstSecondFps:" + this.f175126p + " lastSecondFps:" + this.f175127q + " progressList:" + this.f175134x + " fpsList:" + this.f175135y + " mediaId:" + this.f175117d;
    }
}
