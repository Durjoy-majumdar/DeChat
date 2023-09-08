package rs1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import c30.C104289g;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import te3.C49712hj1;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@C113200q(initialMode = 2)
/* renamed from: rs1.y9 */
public final class C63672y9 extends UIComponent {

    /* renamed from: d */
    public int f180501d;

    /* renamed from: e */
    public long f180502e;

    /* renamed from: f */
    public int f180503f;

    /* renamed from: g */
    public int f180504g;

    /* renamed from: h */
    public final long f180505h = C37521f.f99207J6.mo60266n().longValue();

    /* renamed from: i */
    public final int f180506i;

    /* renamed from: j */
    public int f180507j;

    /* renamed from: n */
    public int f180508n;

    /* renamed from: o */
    public long f180509o;

    /* renamed from: p */
    public long f180510p;

    /* renamed from: q */
    public boolean f180511q;

    /* renamed from: r */
    public boolean f180512r;

    /* renamed from: s */
    public final MTimerHandler f180513s;

    /* renamed from: t */
    public FinderFullSeekBarLayout f180514t;

    /* renamed from: rs1.y9$a */
    public static final class C63673a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C63672y9 f180515d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderSilentPlayControlUIC$playLoopHandler$1$1", mo125469f = "FinderSilentPlayControlUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: rs1.y9$a$a */
        public static final class C63674a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C63672y9 f180516d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63674a(C63672y9 y9Var, C15601d<? super C63674a> dVar) {
                super(2, dVar);
                this.f180516d = y9Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C63674a(this.f180516d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C63674a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C63672y9 y9Var = this.f180516d;
                long j = y9Var.f180510p;
                y9Var.f180509o = j;
                y9Var.f180511q = true;
                C63672y9.m74981c3(y9Var, j, 0, 0, true);
                this.f180516d.mo88482e3("playLoopHandler");
                return C13598b0.f38549a;
            }
        }

        public C63673a(C63672y9 y9Var) {
            this.f180515d = y9Var;
        }

        public final boolean onTimerExpired() {
            long currentTimeMillis = System.currentTimeMillis();
            C63672y9 y9Var = this.f180515d;
            long j = currentTimeMillis - y9Var.f180502e;
            int i = (int) (j / ((long) 30000));
            y9Var.f180501d = i;
            if (i < y9Var.f180506i || j < y9Var.f180505h) {
                return true;
            }
            C53895h.m60466d(y9Var.getMainScope(), (C66212f) null, (C53934p0) null, new C63674a(this.f180515d, (C15601d<? super C63674a>) null), 3, (Object) null);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63672y9(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        fVar.getClass();
        this.f180506i = C37521f.f99216K6.mo60266n().intValue();
        this.f180509o = -1;
        MTimerHandler mTimerHandler = new MTimerHandler("Finder.SilentPlayControlUIC", (MTimerHandler.CallBack) new C63673a(this), true);
        mTimerHandler.setLogging(false);
        this.f180513s = mTimerHandler;
    }

    /* renamed from: c3 */
    public static final void m74981c3(C63672y9 y9Var, long j, int i, int i2, boolean z) {
        y9Var.getClass();
        Log.m105924i("Finder.SilentPlayControlUIC", "[pausePlay] feedId=" + C61926c.m72691p(j) + " isImage=" + z + " limitPlayDuration=" + y9Var.f180505h + " limitPlayCount=" + y9Var.f180506i);
        y9Var.mo88481d3(1, z, j, i, i2, true);
        C61926c.m72668M(new C63668x9(z, y9Var));
    }

    /* renamed from: d3 */
    public final void mo88481d3(int i, boolean z, long j, int i2, int i3, boolean z2) {
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        if (f != null) {
            C49712hj1 q3 = f.mo12861q3();
            C104289g gVar = new C104289g();
            gVar.put("feedid", C61926c.m72691p(j));
            if (!z) {
                C104289g gVar2 = new C104289g();
                gVar2.mo145953n("current_play_sec", i2);
                gVar2.mo145953n("video_duration", i3);
                C13598b0 b0Var = C13598b0.f38549a;
                gVar.put("video_play_info", gVar2);
            }
            gVar.mo145953n("pause_type", i);
            if (i == 1) {
                C104289g gVar3 = new C104289g();
                gVar3.mo145953n("replay_cnt", this.f180501d);
                gVar3.mo145954o("freeze_sec", (System.currentTimeMillis() - this.f180502e) / ((long) 1000));
                C13598b0 b0Var2 = C13598b0.f38549a;
                gVar.put("auto_pause", gVar3);
            }
            Log.m105924i("Finder.SilentPlayControlUIC", "[report] isExposed=" + z2 + ' ' + gVar);
            C115669n nVar = C115669n.INSTANCE;
            String gVar4 = gVar.toString();
            C87412m.m108593f(gVar4, "json.toString()");
            nVar.mo160131h(21875, q3.f134670d, q3.f134671e, Integer.valueOf(q3.f134675i), Integer.valueOf(true ^ z2 ? 1 : 0), Long.valueOf(System.currentTimeMillis()), "button_goon_play", C112551y.m153814n(gVar4, ",", ";", false), q3.f134672f, Integer.valueOf(q3.f134677n));
        }
    }

    /* renamed from: e3 */
    public final void mo88482e3(String str) {
        Log.m105924i("Finder.SilentPlayControlUIC", "[reset] playCount=" + this.f180501d + " playTime=" + (System.currentTimeMillis() - this.f180502e) + "ms source=" + str);
        this.f180501d = 0;
        this.f180502e = System.currentTimeMillis();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        mo88482e3("onKeyDown");
        return super.onKeyDown(i, keyEvent);
    }

    public void onStop() {
        super.onStop();
        this.f180513s.stopTimer();
        this.f180514t = null;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        mo88482e3("WINDOW_FOCUS");
    }
}
