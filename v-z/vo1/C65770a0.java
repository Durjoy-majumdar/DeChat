package vo1;

import al1.C54127h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import bp1.C54518c;
import bp1.C54519d;
import cj1.C54753e6;
import cl1.C0668l;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import cp1.C57941h;
import cp1.C57952m;
import cp1.C57957o;
import cp1.C57959q;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32225b;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ks3.C61162l;
import ok1.C62042e;
import org.json.JSONObject;
import pg1.C62283d;
import r50.C63367f;
import r50.C63373l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import tf0.C64916p1;
import w50.C65928b;
import wo1.C66162t;
import yo1.C16058c;
import yo1.C66686a;
import yo1.C66690g;

/* renamed from: vo1.a0 */
public final class C65770a0 {

    /* renamed from: r */
    public static final C65771b f189184r = new C65771b((C8480h) null);

    /* renamed from: s */
    public static volatile C65770a0 f189185s;

    /* renamed from: t */
    public static final C13601g<Boolean> f189186t = C36568h.m40985a(C37792a.f100105d);

    /* renamed from: a */
    public final List<C32225b<String, Float, String, String, Float, Float, Float, Float, String, String, Boolean>> f189187a = new ArrayList();

    /* renamed from: b */
    public C16058c f189188b;

    /* renamed from: c */
    public C45795b f189189c;

    /* renamed from: d */
    public final C66686a f189190d = new C66686a();

    /* renamed from: e */
    public C57957o f189191e;

    /* renamed from: f */
    public C57941h f189192f;

    /* renamed from: g */
    public final C13601g f189193g = C36568h.m40985a(new C65772c(this));

    /* renamed from: h */
    public final C13601g f189194h = C36568h.m40985a(new C65778j(this));

    /* renamed from: i */
    public final C13601g f189195i = C36568h.m40985a(new C65777i(this));

    /* renamed from: j */
    public final C13601g f189196j = C36568h.m40985a(new C65774f(this));

    /* renamed from: k */
    public HashSet<C66162t> f189197k = new HashSet<>();

    /* renamed from: l */
    public HashSet<C65818s0> f189198l = new HashSet<>();

    /* renamed from: m */
    public boolean f189199m;

    /* renamed from: n */
    public boolean f189200n;

    /* renamed from: o */
    public C57952m f189201o;

    /* renamed from: p */
    public C65768a f189202p;

    /* renamed from: q */
    public C65794g f189203q;

    /* renamed from: vo1.a0$a */
    public static final class C37792a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C37792a f100105d = new C37792a();

        public C37792a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C32444a.f86038B1.mo60266n().intValue() == 0);
        }
    }

    /* renamed from: vo1.a0$e */
    public static final class C37793e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f100106d;

        public C37793e(C32224a aVar) {
            this.f100106d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f100106d.invoke();
        }
    }

    /* renamed from: vo1.a0$b */
    public static final class C65771b {
        public C65771b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C65770a0 mo89819a() {
            if (C65770a0.f189185s == null) {
                synchronized (this) {
                    if (C65770a0.f189185s == null) {
                        C65770a0.f189185s = new C65770a0();
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            C65770a0 a0Var = C65770a0.f189185s;
            C87412m.m108591d(a0Var);
            return a0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
            r2 = (bp1.C54519d) r2.mo89804e(bp1.C54519d.class);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo89820b() {
            /*
                r4 = this;
                vo1.a0 r0 = vo1.C65770a0.f189185s
                r1 = 1
                if (r0 == 0) goto L_0x0022
                vo1.a0 r0 = vo1.C65770a0.f189185s
                if (r0 == 0) goto L_0x0023
                vo1.a0 r2 = vo1.C65770a0.f189185s
                if (r2 == 0) goto L_0x001c
                java.lang.Class<bp1.d> r3 = bp1.C54519d.class
                androidx.lifecycle.i0 r2 = r2.mo89804e(r3)
                bp1.d r2 = (bp1.C54519d) r2
                if (r2 == 0) goto L_0x001c
                long r2 = r2.mo75371d3()
                goto L_0x001e
            L_0x001c:
                r2 = 0
            L_0x001e:
                r0.mo89811l(r1, r2, r1)
                goto L_0x0023
            L_0x0022:
                r1 = 0
            L_0x0023:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: vo1.C65770a0.C65771b.mo89820b():boolean");
        }
    }

    /* renamed from: vo1.a0$c */
    public static final class C65772c extends C87413o implements C32224a<C57941h> {

        /* renamed from: d */
        public final /* synthetic */ C65770a0 f189204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65772c(C65770a0 a0Var) {
            super(0);
            this.f189204d = a0Var;
        }

        public Object invoke() {
            Log.m105924i("FinderLiveReplayService", "generator innerReplayMiniView!");
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C57941h hVar = new C57941h(context, new C65783b0(this.f189204d));
            hVar.mo82742p(this.f189204d.f189189c);
            return hVar;
        }
    }

    /* renamed from: vo1.a0$d */
    public static final class C65773d implements C54753e6 {

        /* renamed from: a */
        public final /* synthetic */ C65770a0 f189205a;

        public C65773d(C65770a0 a0Var) {
            this.f189205a = a0Var;
        }

        /* renamed from: a */
        public void mo75640a(String str, float f, String str2, String str3, float f2, float f3, float f4, float f5, String str4, String str5) {
            C87412m.m108594g(str, "sdkUserId");
            C87412m.m108594g(str2, "gestureId");
            C87412m.m108594g(str3, "randomId");
            C87412m.m108594g(str4, "giftComboId");
            C87412m.m108594g(str5, "giftSoundId");
            Iterator it = ((ArrayList) this.f189205a.f189187a).iterator();
            while (it.hasNext()) {
                ((C32225b) it.next()).mo9163x0(str, Float.valueOf(f), str2, str3, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), str4, str5);
            }
        }

        /* renamed from: b */
        public void mo75638b(Bundle bundle) {
            C87412m.m108594g(bundle, "params");
            C62283d dVar = (C62283d) this.f189205a.mo89804e(C62283d.class);
            if (dVar != null) {
                dVar.mo87349Y2(20, bundle);
            }
        }

        /* renamed from: c */
        public void mo75643c(Bundle bundle) {
            C87412m.m108594g(bundle, "params");
            C62283d dVar = (C62283d) this.f189205a.mo89804e(C62283d.class);
            if (dVar != null) {
                dVar.mo87349Y2(18, bundle);
            }
        }
    }

    /* renamed from: vo1.a0$f */
    public static final class C65774f extends C87413o implements C32224a<C65788d0> {

        /* renamed from: d */
        public final /* synthetic */ C65770a0 f189206d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65774f(C65770a0 a0Var) {
            super(0);
            this.f189206d = a0Var;
        }

        public Object invoke() {
            return new C65788d0(this.f189206d);
        }
    }

    /* renamed from: vo1.a0$g */
    public static final class C65775g implements C57959q {

        /* renamed from: a */
        public final /* synthetic */ C65770a0 f189207a;

        public C65775g(C65770a0 a0Var) {
            this.f189207a = a0Var;
        }

        /* renamed from: a */
        public void mo82765a(boolean z) {
            C54519d dVar = (C54519d) this.f189207a.mo89804e(C54519d.class);
            int i = dVar != null ? dVar.f152854q : 0;
            Log.m105924i("FinderLiveReplayService", "onPlayBtnClick start to play:" + z + ",offset:" + i);
            if (z) {
                C65770a0.m77401c(this.f189207a, i);
            }
        }

        /* renamed from: b */
        public void mo82766b() {
            C57957o oVar = this.f189207a.f189191e;
            if (oVar != null && oVar.getUIContext() != null) {
                C65770a0 a0Var = this.f189207a;
                Intent intent = new Intent();
                intent.putExtra("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
                a0Var.mo89817r(intent);
            }
        }

        /* renamed from: c */
        public void mo82767c(C61162l lVar) {
            C87412m.m108594g(lVar, "mode");
            Log.m105924i("FinderLiveReplayService", "FullScreenUI onCloseClick mode:" + lVar + '!');
            if (lVar != C61162l.Replay) {
                C65770a0 a0Var = this.f189207a;
                C54519d dVar = (C54519d) a0Var.mo89804e(C54519d.class);
                a0Var.mo89811l(4, dVar != null ? dVar.mo75371d3() : 0, true);
            }
        }
    }

    /* renamed from: vo1.a0$h */
    public static final class C65776h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65770a0 f189208d;

        /* renamed from: e */
        public final /* synthetic */ Intent f189209e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65776h(C65770a0 a0Var, Intent intent) {
            super(0);
            this.f189208d = a0Var;
            this.f189209e = intent;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a4, code lost:
            if (vo1.C65770a0.m77399a(r11.f189208d) != false) goto L_0x016f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x013d, code lost:
            if (vo1.C65770a0.m77399a(r1) != false) goto L_0x0149;
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00bc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r11 = this;
                java.lang.Class<bp1.d> r0 = bp1.C54519d.class
                vo1.a0 r1 = r11.f189208d
                r1.mo89807h()
                vo1.a0 r1 = r11.f189208d
                cp1.m r1 = r1.f189201o
                r2 = 0
                if (r1 == 0) goto L_0x0027
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r1 = r1.f165852a
                if (r1 == 0) goto L_0x0027
                fs3.b r1 = r1.getEventDetectorAdapter()
                if (r1 == 0) goto L_0x0027
                vo1.a0 r3 = r11.f189208d
                cp1.h r3 = r3.f189192f
                if (r3 == 0) goto L_0x0023
                com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r3 = r3.mo82739m()
                goto L_0x0024
            L_0x0023:
                r3 = r2
            L_0x0024:
                r1.mo84415a(r3)
            L_0x0027:
                vo1.a0 r1 = r11.f189208d
                java.lang.Class<cl1.a1> r3 = cl1.C54943a1.class
                androidx.lifecycle.i0 r1 = r1.mo89804e(r3)
                cl1.a1 r1 = (cl1.C54943a1) r1
                if (r1 == 0) goto L_0x0036
                r1.mo75855c3()
            L_0x0036:
                vo1.a0 r1 = r11.f189208d
                androidx.lifecycle.i0 r1 = r1.mo89804e(r0)
                bp1.d r1 = (bp1.C54519d) r1
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x004f
                d50.i$b r1 = r1.f152852o
                d50.i$b r5 = d50.C58115i.C58117b.AUDIO_MODE
                if (r1 != r5) goto L_0x004a
                r1 = 1
                goto L_0x004b
            L_0x004a:
                r1 = 0
            L_0x004b:
                if (r1 != r3) goto L_0x004f
                r1 = 1
                goto L_0x0050
            L_0x004f:
                r1 = 0
            L_0x0050:
                if (r1 == 0) goto L_0x00b6
                vo1.a0 r1 = r11.f189208d
                java.lang.Class<cl1.o> r5 = cl1.C54991o.class
                androidx.lifecycle.i0 r1 = r1.mo89804e(r5)
                cl1.o r1 = (cl1.C54991o) r1
                if (r1 == 0) goto L_0x0066
                boolean r1 = r1.mo76003g4()
                if (r1 != r3) goto L_0x0066
                r1 = 1
                goto L_0x0067
            L_0x0066:
                r1 = 0
            L_0x0067:
                if (r1 != 0) goto L_0x00b6
                vo1.a0 r1 = r11.f189208d
                android.content.Intent r5 = r11.f189209e
                vo1.C65770a0.m77402d(r1, r5)
                vo1.a0 r1 = r11.f189208d
                cp1.h r1 = r1.f189192f
                if (r1 == 0) goto L_0x0079
                r1.mo82740n()
            L_0x0079:
                vo1.a0 r1 = r11.f189208d
                androidx.lifecycle.i0 r1 = r1.mo89804e(r0)
                bp1.d r1 = (bp1.C54519d) r1
                if (r1 == 0) goto L_0x0089
                boolean r1 = r1.f152859v
                if (r1 != r3) goto L_0x0089
                r1 = 1
                goto L_0x008a
            L_0x0089:
                r1 = 0
            L_0x008a:
                if (r1 != 0) goto L_0x00a6
                vo1.a0 r1 = r11.f189208d
                androidx.lifecycle.i0 r0 = r1.mo89804e(r0)
                bp1.d r0 = (bp1.C54519d) r0
                if (r0 == 0) goto L_0x009b
                boolean r0 = r0.f152860w
                if (r0 != r3) goto L_0x009b
                goto L_0x009c
            L_0x009b:
                r3 = 0
            L_0x009c:
                if (r3 != 0) goto L_0x00a6
                vo1.a0 r0 = r11.f189208d
                boolean r0 = vo1.C65770a0.m77399a(r0)
                if (r0 != 0) goto L_0x016f
            L_0x00a6:
                vo1.a0 r0 = r11.f189208d
                cp1.o r0 = r0.f189191e
                if (r0 == 0) goto L_0x00af
                r0.mo78590q()
            L_0x00af:
                vo1.a0 r0 = r11.f189208d
                r0.mo89816q(r2)
                goto L_0x016f
            L_0x00b6:
                vo1.a0 r1 = r11.f189208d
                cp1.m r5 = r1.f189201o
                if (r5 == 0) goto L_0x014b
                android.content.Intent r6 = r11.f189209e
                vo1.C65770a0.m77402d(r1, r6)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r6 = r5.f165852a
                gr1.q2 r6 = r6.getVideoMediaInfo()
                if (r6 == 0) goto L_0x00d8
                pl1.u0 r6 = r6.f170495e
                if (r6 == 0) goto L_0x00d8
                te3.rq2 r6 = r6.mo87421f()
                if (r6 == 0) goto L_0x00d8
                android.util.Size r6 = vp1.C65840n.m77566b(r6, r3)
                goto L_0x00dd
            L_0x00d8:
                android.util.Size r6 = new android.util.Size
                r6.<init>(r4, r4)
            L_0x00dd:
                r8 = r6
                cp1.h r6 = r1.f189192f
                if (r6 == 0) goto L_0x0111
                androidx.lifecycle.i0 r7 = r1.mo89804e(r0)
                bp1.d r7 = (bp1.C54519d) r7
                if (r7 != 0) goto L_0x00eb
                goto L_0x00f0
            L_0x00eb:
                d50.i$d r9 = d50.C58115i.C58119d.FLOAT_MODE
                r7.mo75368N3(r9)
            L_0x00f0:
                r50.f r6 = r6.mo82738l()
                android.widget.FrameLayout r6 = r6.f179748h
                r7 = 0
                androidx.lifecycle.i0 r9 = r1.mo89804e(r0)
                bp1.d r9 = (bp1.C54519d) r9
                if (r9 == 0) goto L_0x0105
                boolean r9 = r9.f152853p
                if (r9 != r3) goto L_0x0105
                r9 = 1
                goto L_0x0106
            L_0x0105:
                r9 = 0
            L_0x0106:
                if (r9 == 0) goto L_0x010b
                com.tencent.mm.pluginsdk.ui.a$e r9 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.CONTAIN
                goto L_0x010d
            L_0x010b:
                com.tencent.mm.pluginsdk.ui.a$e r9 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            L_0x010d:
                r10 = 1
                r5.mo82756b(r6, r7, r8, r9, r10)
            L_0x0111:
                cp1.h r5 = r1.f189192f
                if (r5 == 0) goto L_0x0118
                r5.mo82740n()
            L_0x0118:
                androidx.lifecycle.i0 r5 = r1.mo89804e(r0)
                bp1.d r5 = (bp1.C54519d) r5
                if (r5 == 0) goto L_0x0126
                boolean r5 = r5.f152859v
                if (r5 != r3) goto L_0x0126
                r5 = 1
                goto L_0x0127
            L_0x0126:
                r5 = 0
            L_0x0127:
                if (r5 != 0) goto L_0x013f
                androidx.lifecycle.i0 r0 = r1.mo89804e(r0)
                bp1.d r0 = (bp1.C54519d) r0
                if (r0 == 0) goto L_0x0136
                boolean r0 = r0.f152860w
                if (r0 != r3) goto L_0x0136
                goto L_0x0137
            L_0x0136:
                r3 = 0
            L_0x0137:
                if (r3 != 0) goto L_0x013f
                boolean r0 = vo1.C65770a0.m77399a(r1)
                if (r0 != 0) goto L_0x0149
            L_0x013f:
                cp1.o r0 = r1.f189191e
                if (r0 == 0) goto L_0x0146
                r0.mo78590q()
            L_0x0146:
                r1.mo89816q(r2)
            L_0x0149:
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x014b:
                if (r2 != 0) goto L_0x016f
                vo1.a0 r0 = r11.f189208d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "startReplayMiniUI playerWidget is null,"
                r1.append(r2)
                java.lang.String r0 = r0.mo89808i()
                r1.append(r0)
                r0 = 33
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "FinderLiveReplayService"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            L_0x016f:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vo1.C65770a0.C65776h.invoke():java.lang.Object");
        }
    }

    /* renamed from: vo1.a0$i */
    public static final class C65777i extends C87413o implements C32224a<C65791e0> {

        /* renamed from: d */
        public final /* synthetic */ C65770a0 f189210d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65777i(C65770a0 a0Var) {
            super(0);
            this.f189210d = a0Var;
        }

        public Object invoke() {
            return new C65791e0(this.f189210d);
        }
    }

    /* renamed from: vo1.a0$j */
    public static final class C65778j extends C87413o implements C32224a<C65793f0> {

        /* renamed from: d */
        public final /* synthetic */ C65770a0 f189211d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65778j(C65770a0 a0Var) {
            super(0);
            this.f189211d = a0Var;
        }

        public Object invoke() {
            return new C65793f0(this.f189211d);
        }
    }

    /* renamed from: a */
    public static final boolean m77399a(C65770a0 a0Var) {
        a0Var.getClass();
        AppForegroundDelegate.INSTANCE.getClass();
        String str = (String) C110818d0.m150923U(new ArrayList(AppForegroundDelegate.f343442v));
        C57957o oVar = a0Var.f189191e;
        String str2 = null;
        Context uIContext = oVar != null ? oVar.getUIContext() : null;
        Activity activity = uIContext instanceof Activity ? (Activity) uIContext : null;
        if (activity != null) {
            str2 = activity.getClass().getName();
        }
        Log.m105918d("FinderLiveReplayService", "topActivityName = " + str + ", curActivityName = " + str2);
        return C87412m.m108589b(str2, str);
    }

    /* renamed from: b */
    public static final void m77400b(C65770a0 a0Var, int i) {
        Class cls = C54519d.class;
        C54519d dVar = (C54519d) a0Var.mo89804e(cls);
        boolean z = false;
        int i2 = dVar != null ? dVar.f152855r : 0;
        C54519d dVar2 = (C54519d) a0Var.mo89804e(cls);
        Integer num = null;
        int k3 = dVar2 != null ? C54519d.m61244k3(dVar2, 0, 1, (Object) null) : 0;
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoPlayEndLogic source:");
        sb.append(i);
        sb.append(" total:");
        sb.append(i2);
        sb.append(",offset:");
        C54519d dVar3 = (C54519d) a0Var.mo89804e(cls);
        if (dVar3 != null) {
            num = Integer.valueOf(dVar3.f152854q);
        }
        sb.append(num);
        sb.append(",previewTimeLimit:");
        sb.append(k3);
        Log.m105924i("FinderLiveReplayService", sb.toString());
        if (i2 >= k3) {
            C54519d dVar4 = (C54519d) a0Var.mo89804e(cls);
            if (dVar4 != null) {
                dVar4.mo75366L3(3);
            }
            C57957o oVar = a0Var.f189191e;
            if (oVar != null) {
                oVar.mo78578c(i);
            }
            C0668l lVar = (C0668l) a0Var.mo89804e(C0668l.class);
            if (lVar != null && lVar.mo631g3()) {
                z = true;
            }
            if (z) {
                C57941h hVar = a0Var.f189192f;
                if (hVar != null) {
                    hVar.mo78578c(i);
                    return;
                }
                return;
            }
            C57941h hVar2 = a0Var.f189192f;
            if (hVar2 != null) {
                hVar2.mo78581f(i);
                return;
            }
            return;
        }
        C54519d dVar5 = (C54519d) a0Var.mo89804e(cls);
        if (dVar5 != null) {
            dVar5.mo75366L3(2);
        }
        C57957o oVar2 = a0Var.f189191e;
        if (oVar2 != null) {
            oVar2.mo78581f(i);
        }
        C57941h hVar3 = a0Var.f189192f;
        if (hVar3 != null) {
            hVar3.mo78581f(i);
        }
    }

    /* renamed from: c */
    public static final void m77401c(C65770a0 a0Var, int i) {
        Class cls = C54519d.class;
        C54519d dVar = (C54519d) a0Var.mo89804e(cls);
        if (dVar != null) {
            dVar.mo75366L3(1);
        }
        C54519d dVar2 = (C54519d) a0Var.mo89804e(cls);
        a0Var.mo89812m(i, dVar2 != null ? dVar2.mo75371d3() : 0);
        C57941h hVar = a0Var.f189192f;
        if (hVar != null) {
            hVar.mo78580e(i);
        }
        C57957o oVar = a0Var.f189191e;
        if (oVar != null) {
            oVar.mo78580e(i);
        }
    }

    /* renamed from: d */
    public static final void m77402d(C65770a0 a0Var, Intent intent) {
        C65770a0 a0Var2 = a0Var;
        Class cls = C54519d.class;
        C57941h hVar = a0Var2.f189192f;
        if (hVar != null) {
            C54991o oVar = (C54991o) a0Var2.mo89804e(C54991o.class);
            Point a = oVar != null ? C65928b.f189533a.mo89963a(oVar.f154335l1, oVar.f154338m1) : new Point(C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_c), C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a_a));
            C54519d dVar = (C54519d) a0Var2.mo89804e(cls);
            long d3 = dVar != null ? dVar.mo75371d3() : 0;
            C54519d dVar2 = (C54519d) a0Var2.mo89804e(cls);
            boolean j3 = dVar2 != null ? dVar2.mo75376j3() : false;
            int intExtra = intent.getIntExtra("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 0);
            C65771b bVar = f189184r;
            bVar.mo89819a().mo89810k((C65817r0) ((C36570n) hVar.f165839n).getValue());
            C63367f l = hVar.mo82738l();
            C57952m mVar = bVar.mo89819a().f189201o;
            l.mo88274d(a, d3, j3, intExtra, 12, new C63373l(mVar != null && mVar.f165852a.isPlaying(), 0, false, false, false, (String) null, (Bitmap) null, 126, (C8480h) null));
        }
    }

    /* renamed from: t */
    public static void m77403t(C65770a0 a0Var, int i, JSONObject jSONObject, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jSONObject = null;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        C57941h hVar = a0Var.f189192f;
        if (hVar != null) {
            hVar.mo82737b(i, jSONObject, z);
        }
    }

    /* renamed from: e */
    public final <T extends C39622i0> T mo89804e(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        C45795b bVar = this.f189189c;
        if (bVar != null) {
            return bVar.mo71262a(cls);
        }
        return null;
    }

    /* renamed from: f */
    public final LiveRoomControllerStore mo89805f() {
        C54127h a;
        C16058c cVar = this.f189188b;
        if (cVar == null || (a = cVar.mo14672a()) == null) {
            return null;
        }
        return a.f151979f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: al1.h} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89806g(long r8, android.content.Intent r10, te3.C49431fj1 r11, boolean r12) {
        /*
            r7 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            java.lang.String r1 = "intent"
            gy3.C87412m.m108594g(r10, r1)
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L_0x0028
            cp1.h r10 = r7.f189192f
            if (r10 == 0) goto L_0x0012
            r10.mo82741o()
        L_0x0012:
            yo1.c r10 = r7.f189188b
            if (r10 != 0) goto L_0x0018
            goto L_0x0179
        L_0x0018:
            rx3.l r11 = new rx3.l
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r11.<init>(r8, r9)
            r10.mo14674c(r11)
            goto L_0x0179
        L_0x0028:
            java.lang.String r12 = "FinderLiveReplayService"
            if (r11 == 0) goto L_0x017b
            r3 = 3
            r7.mo89811l(r3, r8, r2)
            yo1.c r8 = new yo1.c
            r8.<init>()
            r8.f43186a = r11
            int r9 = r11.f133536h
            r8.mo14673b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r11 = r11.f133533e
            java.lang.String r3 = "baseData.objects"
            gy3.C87412m.m108593f(r11, r3)
            java.util.Iterator r11 = r11.iterator()
        L_0x004c:
            boolean r3 = r11.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = r11.next()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r3
            if (r3 != 0) goto L_0x005c
            goto L_0x0067
        L_0x005c:
            al1.h r4 = new al1.h
            r4.<init>((com.tencent.p014mm.protocal.protobuf.FinderObject) r3)
            sk1.a r5 = sk1.C63947a.f181274a
            r6 = 2
            r5.mo88734t(r4, r3, r6)
        L_0x0067:
            if (r4 == 0) goto L_0x004c
            te3.c21 r3 = r3.liveInfo
            if (r3 == 0) goto L_0x0082
            te3.e71 r3 = r3.f182388Z
            if (r3 == 0) goto L_0x0082
            int r3 = r3.f182930f
            fj1.b r5 = r4.f151978e
            java.lang.Class<bp1.d> r6 = bp1.C54519d.class
            androidx.lifecycle.i0 r5 = r5.mo71262a(r6)
            bp1.d r5 = (bp1.C54519d) r5
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo75363I3(r3, r6)
        L_0x0082:
            r9.add(r4)
            goto L_0x004c
        L_0x0086:
            r8.f43188c = r9
            java.lang.String r9 = "KEY_PAGE_TYPE"
            boolean r11 = r10.hasExtra(r9)
            java.lang.String r3 = "FinderReplayLiveData"
            java.lang.String r5 = " to "
            if (r11 == 0) goto L_0x00bb
            java.lang.String r9 = r10.getStringExtra(r9)
            if (r9 != 0) goto L_0x009c
            java.lang.String r9 = ""
        L_0x009c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r6 = "set pageType from "
            r11.append(r6)
            java.lang.String r6 = r8.f43190e
            r11.append(r6)
            r11.append(r5)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            r8.f43190e = r9
        L_0x00bb:
            java.lang.String r9 = "KEY_PAGE_SUB_TYPE"
            boolean r11 = r10.hasExtra(r9)
            if (r11 == 0) goto L_0x00e6
            int r9 = r10.getIntExtra(r9, r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "set pageSubType from "
            r10.append(r11)
            int r11 = r8.f43191f
            r10.append(r11)
            r10.append(r5)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            r8.f43191f = r9
        L_0x00e6:
            r8.mo14674c(r4)
            java.util.ArrayList<al1.h> r9 = r8.f43188c
            java.util.Iterator r9 = r9.iterator()
        L_0x00ef:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x010f
            java.lang.Object r10 = r9.next()
            al1.h r10 = (al1.C54127h) r10
            fj1.b r10 = r10.f151978e
            androidx.lifecycle.i0 r10 = r10.mo71262a(r0)
            cl1.u r10 = (cl1.C55001u) r10
            te3.c21 r10 = r10.f154420q
            te3.e71 r10 = r10.f182388Z
            if (r10 != 0) goto L_0x010a
            goto L_0x00ef
        L_0x010a:
            r5 = 0
            r10.f182929e = r5
            goto L_0x00ef
        L_0x010f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "set replayData:"
            r9.append(r10)
            int r10 = r8.hashCode()
            r9.append(r10)
            r10 = 44
            r9.append(r10)
            java.lang.String r10 = r7.mo89808i()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
            r7.f189188b = r8
            al1.h r8 = r8.mo14672a()
            if (r8 == 0) goto L_0x0179
            fj1.b r8 = r8.f151978e
            if (r8 == 0) goto L_0x0179
            androidx.lifecycle.i0 r8 = r8.mo71262a(r0)
            cl1.u r8 = (cl1.C55001u) r8
            te3.c21 r8 = r8.f154420q
            if (r8 == 0) goto L_0x0179
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "initData liveInfo:"
            r9.append(r10)
            sk1.a r10 = sk1.C63947a.f181274a
            java.lang.String r11 = r10.mo88736v(r8)
            r9.append(r11)
            java.lang.String r11 = ",replayInfo:"
            r9.append(r11)
            te3.e71 r8 = r8.f182388Z
            if (r8 == 0) goto L_0x016a
            java.lang.String r4 = r10.mo88726l(r8)
        L_0x016a:
            r9.append(r4)
            r8 = 33
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
        L_0x0179:
            r1 = 1
            goto L_0x0180
        L_0x017b:
            java.lang.String r8 = "initData fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r8)
        L_0x0180:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65770a0.mo89806g(long, android.content.Intent, te3.fj1, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        if (r3.f159790n == false) goto L_0x0085;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89807h() {
        /*
            r7 = this;
            cp1.h r0 = r7.f189192f
            if (r0 != 0) goto L_0x000e
            rx3.g r0 = r7.f189193g
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            cp1.h r0 = (cp1.C57941h) r0
        L_0x000e:
            ok1.e r1 = ok1.C62042e.f176370a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "set replayMiniWindowView:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLiveReplayService"
            r1.mo87001E1(r3, r2)
            r7.f189192f = r0
            if (r0 == 0) goto L_0x00b0
            java.lang.Class<bp1.d> r1 = bp1.C54519d.class
            androidx.lifecycle.i0 r1 = r7.mo89804e(r1)
            bp1.d r1 = (bp1.C54519d) r1
            r2 = 0
            if (r1 == 0) goto L_0x003b
            java.lang.String r1 = r1.mo75370c3()
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            androidx.lifecycle.i0 r3 = r7.mo89804e(r3)
            cl1.o r3 = (cl1.C54991o) r3
            if (r3 == 0) goto L_0x004a
            java.lang.String r2 = r3.mo75969L3()
        L_0x004a:
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r3 = r0.mo82739m()
            r3.getClass()
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x005e
            int r6 = r1.length()
            if (r6 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r6 = 0
            goto L_0x005f
        L_0x005e:
            r6 = 1
        L_0x005f:
            if (r6 != 0) goto L_0x0084
            java.lang.String r6 = r3.f159793q
            boolean r6 = gy3.C87412m.m108589b(r6, r1)
            if (r6 == 0) goto L_0x0084
            if (r2 == 0) goto L_0x0074
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r6 = 0
            goto L_0x0075
        L_0x0074:
            r6 = 1
        L_0x0075:
            if (r6 != 0) goto L_0x0084
            java.lang.String r6 = r3.f159792p
            boolean r6 = gy3.C87412m.m108589b(r6, r2)
            if (r6 == 0) goto L_0x0084
            boolean r3 = r3.f159790n
            if (r3 != 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "setupMiniView haveSetup:"
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "FinderLiveReplayMiniView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            if (r4 != 0) goto L_0x00b0
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r3 = r0.mo82739m()
            r3.mo77963f(r1, r2, r5)
            r50.f r1 = r0.mo82738l()
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r0 = r0.mo82739m()
            r1.mo88277g(r0)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65770a0.mo89807h():void");
    }

    /* renamed from: i */
    public final String mo89808i() {
        Class cls = C54519d.class;
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = null;
        int i = 0;
        if (this.f189189c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("data is null,liveId:");
            C54519d dVar = (C54519d) mo89804e(cls);
            sb.append(dVar != null ? Long.valueOf(dVar.mo75371d3()) : null);
            sb.append("-playerWidget:");
            C57952m mVar = this.f189201o;
            sb.append(mVar != null ? mVar.hashCode() : 0);
            sb.append("-player:");
            C57952m mVar2 = this.f189201o;
            if (mVar2 != null) {
                finderLiveThumbPlayerProxy = mVar2.f165852a;
            }
            sb.append(finderLiveThumbPlayerProxy != null ? finderLiveThumbPlayerProxy.hashCode() : 0);
            sb.append("-layout:");
            C57957o oVar = this.f189191e;
            if (oVar != null) {
                i = oVar.hashCode();
            }
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("service liveId:");
        C54519d dVar2 = (C54519d) mo89804e(cls);
        sb4.append(dVar2 != null ? Long.valueOf(dVar2.mo75371d3()) : null);
        sb4.append("-playerWidget:");
        C57952m mVar3 = this.f189201o;
        sb4.append(mVar3 != null ? mVar3.hashCode() : 0);
        sb4.append("-player:");
        C57952m mVar4 = this.f189201o;
        if (mVar4 != null) {
            finderLiveThumbPlayerProxy = mVar4.f165852a;
        }
        sb4.append(finderLiveThumbPlayerProxy != null ? finderLiveThumbPlayerProxy.hashCode() : 0);
        sb4.append("-layout:");
        C57957o oVar2 = this.f189191e;
        if (oVar2 != null) {
            i = oVar2.hashCode();
        }
        sb4.append(i);
        return sb4.toString();
    }

    /* renamed from: j */
    public final C13604l<C57952m, Boolean> mo89809j(long j, C57952m mVar) {
        long j2 = 0;
        if (j != 0) {
            C54519d dVar = (C54519d) mo89804e(C54519d.class);
            if (dVar != null) {
                j2 = dVar.mo75371d3();
            }
            if (j == j2) {
                mVar = this.f189201o;
            }
        }
        if (mVar != null) {
            return new C13604l<>(mVar, Boolean.TRUE);
        }
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C57952m mVar2 = new C57952m(context, j);
        mVar2.f165852a.setVideoViewCallback((C65793f0) ((C36570n) this.f189194h).getValue());
        mVar2.f165852a.setLifecycle((C65791e0) ((C36570n) this.f189195i).getValue());
        C65773d dVar2 = new C65773d(this);
        mVar2.f165852a.setSeiInfoCallback(mVar2.f165854c);
        mVar2.f165853b = dVar2;
        return new C13604l<>(mVar2, Boolean.FALSE);
    }

    /* renamed from: k */
    public final void mo89810k(C65818s0 s0Var) {
        C87412m.m108594g(s0Var, "proxy");
        Log.m105924i("FinderLiveReplayService", "registerSeiProcessViewCallbackProxy:" + s0Var.hashCode());
        this.f189198l.add(s0Var);
        s0Var.mo89831i(this.f189199m, this.f189200n);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [cp1.o, cp1.m, android.view.View, fj1.b] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0049, code lost:
        r8 = r8.f154420q;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x026c  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89811l(int r17, long r18, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r3 = r20
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            java.lang.Class<bp1.d> r5 = bp1.C54519d.class
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "release source:"
            r6.append(r7)
            r7 = r17
            r6.append(r7)
            java.lang.String r7 = ", force;"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ", remote liveId:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", "
            r6.append(r7)
            java.lang.String r7 = r16.mo89808i()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "FinderLiveReplayService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            if (r3 != 0) goto L_0x0080
            androidx.lifecycle.i0 r8 = r0.mo89804e(r4)
            cl1.u r8 = (cl1.C55001u) r8
            r9 = 1
            if (r8 == 0) goto L_0x0055
            te3.c21 r8 = r8.f154420q
            if (r8 == 0) goto L_0x0055
            long r10 = r8.f182392d
            int r8 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0055
            r8 = 1
            goto L_0x0056
        L_0x0055:
            r8 = 0
        L_0x0056:
            if (r8 != 0) goto L_0x007e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "release"
            r8.append(r9)
            java.lang.String r9 = " remote liveId:"
            r8.append(r9)
            r8.append(r1)
            r9 = 44
            r8.append(r9)
            java.lang.String r9 = r16.mo89808i()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r8)
            r9 = 0
        L_0x007e:
            if (r9 == 0) goto L_0x027d
        L_0x0080:
            cp1.o r8 = r0.f189191e
            if (r8 == 0) goto L_0x00a1
            boolean r8 = r8 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r8 == 0) goto L_0x00a1
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r8 = r16.mo89805f()
            if (r8 == 0) goto L_0x00a1
            gh1.j r9 = gh1.C59447j.f169870a
            cp1.o r10 = r0.f189191e
            java.lang.String r11 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout"
            gy3.C87412m.m108592e(r10, r11)
            com.tencent.mm.plugin.finder.live.view.b r10 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r10
            gh1.o r11 = new gh1.o
            r11.<init>(r8, r10)
            r9.mo84557i(r8, r11)
        L_0x00a1:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r8 = r16.mo89805f()
            if (r8 == 0) goto L_0x00b1
            gh1.j r9 = gh1.C59447j.f169870a
            gh1.i r10 = new gh1.i
            r10.<init>(r8)
            r9.mo84557i(r8, r10)
        L_0x00b1:
            androidx.lifecycle.i0 r8 = r0.mo89804e(r5)
            bp1.d r8 = (bp1.C54519d) r8
            r10 = 0
            if (r8 == 0) goto L_0x017a
            boolean r12 = r8.f152846f
            if (r12 == 0) goto L_0x00c5
            r1 = 2
            r8.mo75377l3(r1)
            goto L_0x017a
        L_0x00c5:
            androidx.lifecycle.i0 r12 = r8.business(r5)
            bp1.d r12 = (bp1.C54519d) r12
            long r13 = android.os.SystemClock.elapsedRealtime()
            r17 = r7
            long r6 = r12.f152847g
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00de
            int r12 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r12 < 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            long r13 = r13 - r6
            goto L_0x00df
        L_0x00de:
            r13 = r10
        L_0x00df:
            int r6 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x00e7
            int r1 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0137
        L_0x00e7:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            androidx.lifecycle.i0 r2 = r8.business(r4)
            cl1.u r2 = (cl1.C55001u) r2
            long r9 = r2.f154416j
            java.lang.String r2 = o40.C61926c.m72691p(r9)
            java.lang.String r9 = "object_id"
            r1.put(r9, r2)
            r9 = 0
            int r2 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0112
            androidx.lifecycle.i0 r2 = r8.business(r5)
            bp1.d r2 = (bp1.C54519d) r2
            int r2 = r2.f152854q
            int r2 = r2 * 1000
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0116
        L_0x0112:
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
        L_0x0116:
            java.lang.String r9 = "duration"
            r1.put(r9, r2)
            ak1.e0 r2 = ak1.C0047e0.f58a
            r2.mo54a(r1)
            java.lang.Class<ht1.j5> r2 = ht1.C8777j5.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.j5 r2 = (ht1.C8777j5) r2
            java.lang.String r1 = r1.toString()
            java.lang.String r9 = "this.toString()"
            gy3.C87412m.m108593f(r1, r9)
            java.lang.String r9 = "live_record_duration"
            r2.hg0(r9, r1)
        L_0x0137:
            r1 = 0
            if (r6 == 0) goto L_0x017d
            int r6 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x017d
            int r6 = (int) r13
            java.lang.Class<tf0.p1> r9 = tf0.C64916p1.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            tf0.p1 r9 = (tf0.C64916p1) r9
            te3.cb0 r10 = new te3.cb0
            r10.<init>()
            zc1.b r11 = zc1.C66785b.f191882e
            java.lang.String r11 = r11.mo90662O5()
            r10.f131608e = r11
            androidx.lifecycle.i0 r11 = r8.business(r4)
            cl1.u r11 = (cl1.C55001u) r11
            long r11 = r11.f154416j
            r10.f131607d = r11
            androidx.lifecycle.i0 r8 = r8.business(r4)
            cl1.u r8 = (cl1.C55001u) r8
            java.lang.String r8 = r8.f154424u
            r10.f131609f = r8
            te3.ua1 r8 = new te3.ua1
            r8.<init>()
            r8.f142696d = r6
            r10.f131615o = r8
            rx3.b0 r6 = rx3.C13598b0.f38549a
            r6 = 6
            r7 = 0
            r9.mo76728y(r7, r6, r10)
            goto L_0x017d
        L_0x017a:
            r17 = r7
            r1 = r10
        L_0x017d:
            if (r3 == 0) goto L_0x01b3
            yo1.a r6 = r0.f189190d
            boolean r6 = r6.f191725b
            if (r6 == 0) goto L_0x01b3
            bl3.r r6 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            bl3.r$a r6 = r6.mo62446e(r8)
            java.lang.Class<bp1.c> r8 = bp1.C54518c.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r8)
            bp1.c r6 = (bp1.C54518c) r6
            androidx.lifecycle.i0 r8 = r0.mo89804e(r5)
            bp1.d r8 = (bp1.C54519d) r8
            if (r8 == 0) goto L_0x01a2
            long r10 = r8.mo75371d3()
            goto L_0x01a3
        L_0x01a2:
            r10 = r1
        L_0x01a3:
            androidx.lifecycle.i0 r1 = r0.mo89804e(r5)
            bp1.d r1 = (bp1.C54519d) r1
            if (r1 == 0) goto L_0x01af
            int r1 = r1.f152854q
            r15 = r1
            goto L_0x01b0
        L_0x01af:
            r15 = 0
        L_0x01b0:
            r6.mo75360c3(r10, r15)
        L_0x01b3:
            if (r3 == 0) goto L_0x01e8
            vo1.g r1 = r0.f189203q
            if (r1 == 0) goto L_0x01e4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "releaseAudioFocus audioFocusSession:"
            r2.append(r3)
            nc3.b$c r3 = r1.f189236a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLiveReplayAudioManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            nc3.b$c r2 = r1.f189236a
            if (r2 == 0) goto L_0x01e0
            java.lang.Class<nc3.b> r3 = nc3.C34767b.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            nc3.b r3 = (nc3.C34767b) r3
            r3.b20(r2)
        L_0x01e0:
            r2 = 0
            r1.f189236a = r2
            goto L_0x01e5
        L_0x01e4:
            r2 = 0
        L_0x01e5:
            r0.f189203q = r2
            goto L_0x01e9
        L_0x01e8:
            r2 = 0
        L_0x01e9:
            r0.mo89816q(r2)
            fj1.b r1 = r0.f189189c
            if (r1 == 0) goto L_0x01f3
            r1.mo71263b()
        L_0x01f3:
            r0.mo89813n(r2)
            cp1.m r1 = r0.f189201o
            if (r1 == 0) goto L_0x0207
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r1 = r1.f165852a
            if (r1 == 0) goto L_0x0207
            fs3.b r1 = r1.getEventDetectorAdapter()
            if (r1 == 0) goto L_0x0207
            r1.mo84415a(r2)
        L_0x0207:
            cp1.m r1 = r0.f189201o
            if (r1 == 0) goto L_0x020e
            r1.mo82760f()
        L_0x020e:
            r0.f189201o = r2
            cp1.h r1 = r0.f189192f
            if (r1 == 0) goto L_0x0254
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "release:"
            r2.append(r3)
            fj1.b r3 = r1.f165834f
            if (r3 == 0) goto L_0x0233
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            if (r3 == 0) goto L_0x0233
            long r3 = r3.f182392d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0234
        L_0x0233:
            r3 = 0
        L_0x0234:
            r2.append(r3)
            r3 = 33
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLiveReplayMiniView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r1.mo82741o()
            r50.f r2 = r1.mo82738l()
            r2.mo88275e()
            r2 = 0
            r1.mo82742p(r2)
            goto L_0x0255
        L_0x0254:
            r2 = 0
        L_0x0255:
            ok1.e r1 = ok1.C62042e.f176370a
            java.lang.String r3 = "set replayMiniWindowView:null"
            r4 = r17
            r1.mo87001E1(r4, r3)
            r0.f189192f = r2
            java.util.HashSet<vo1.s0> r1 = r0.f189198l
            r1.clear()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = r16.mo89805f()
            if (r1 == 0) goto L_0x0276
            gh1.j r2 = gh1.C59447j.f169870a
            gh1.i r3 = new gh1.i
            r3.<init>(r1)
            r2.mo84557i(r1, r3)
        L_0x0276:
            java.util.List<fy3.b<java.lang.String, java.lang.Float, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Boolean>> r1 = r0.f189187a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
        L_0x027d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65770a0.mo89811l(int, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r2.f154420q;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89812m(int r12, long r13) {
        /*
            r11 = this;
            vo1.a r0 = r11.f189202p
            if (r0 == 0) goto L_0x010a
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r0.mo89803a(r1)
            cl1.u r2 = (cl1.C55001u) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001c
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x001c
            long r5 = r2.f182392d
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x001c
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 != 0) goto L_0x0058
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "selectLiveMsg"
            r2.append(r5)
            java.lang.String r5 = " remote liveId:"
            r2.append(r5)
            r2.append(r13)
            java.lang.String r5 = ",local liveId:"
            r2.append(r5)
            androidx.lifecycle.i0 r5 = r0.mo89803a(r1)
            cl1.u r5 = (cl1.C55001u) r5
            if (r5 == 0) goto L_0x0049
            te3.c21 r5 = r5.f154420q
            if (r5 == 0) goto L_0x0049
            long r5 = r5.f182392d
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x004a
        L_0x0049:
            r5 = 0
        L_0x004a:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "FinderLiveMsgOffsetProcess"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            r2 = 0
            goto L_0x0059
        L_0x0058:
            r2 = 1
        L_0x0059:
            if (r2 != 0) goto L_0x005d
            goto L_0x010a
        L_0x005d:
            vo1.a$a r2 = r0.f189183c
            if (r2 == 0) goto L_0x0064
            r2.mo13968a(r12)
        L_0x0064:
            yo1.e r2 = new yo1.e
            java.lang.Class<bp1.d> r5 = bp1.C54519d.class
            androidx.lifecycle.i0 r5 = r0.mo89803a(r5)
            bp1.d r5 = (bp1.C54519d) r5
            if (r5 == 0) goto L_0x0074
            int r5 = r5.f152855r
            r9 = r5
            goto L_0x0075
        L_0x0074:
            r9 = 0
        L_0x0075:
            r10 = 1
            r5 = r2
            r6 = r13
            r8 = r12
            r5.<init>(r6, r8, r9, r10)
            java.lang.Class<bp1.a> r12 = bp1.C54515a.class
            androidx.lifecycle.i0 r12 = r0.mo89803a(r12)
            bp1.a r12 = (bp1.C54515a) r12
            if (r12 == 0) goto L_0x010a
            yo1.d r0 = r0.f189182b
            androidx.lifecycle.i0 r5 = r12.business(r1)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            long r5 = r5.f182392d
            java.lang.String r7 = "LiveMsgOffsetSlice"
            int r8 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00c5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "trackMessage"
            r3.append(r5)
            java.lang.String r5 = " error, remote liveId:"
            r3.append(r5)
            r3.append(r13)
            java.lang.String r13 = ",local liveId"
            r3.append(r13)
            androidx.lifecycle.i0 r13 = r12.business(r1)
            cl1.u r13 = (cl1.C55001u) r13
            te3.c21 r13 = r13.f154420q
            long r13 = r13.f182392d
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r13)
            r3 = 0
        L_0x00c5:
            if (r3 != 0) goto L_0x00c8
            goto L_0x010a
        L_0x00c8:
            r12.f152823h = r2
            r12.f152824i = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "trackMessage msgParams:"
            r13.append(r14)
            r13.append(r2)
            java.lang.String r14 = ",startOffsetSec:"
            r13.append(r14)
            int r14 = r12.f152829q
            r13.append(r14)
            java.lang.String r14 = ", callback:"
            r13.append(r14)
            if (r0 == 0) goto L_0x00ef
            int r4 = r0.hashCode()
        L_0x00ef:
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)
            java.util.concurrent.CopyOnWriteArrayList<te3.qq1> r13 = r12.f152825j
            r13.clear()
            yo1.e r13 = r12.f152823h
            int r14 = r13.f191727b
            int r0 = r12.f152829q
            int r14 = r14 + r0
            boolean r13 = r13.f191729d
            r12.mo75359g3(r14, r13)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65770a0.mo89812m(int, long):void");
    }

    /* renamed from: n */
    public final void mo89813n(C45795b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("set curLiveContext:");
        sb.append(bVar != null ? bVar.hashCode() : 0);
        sb.append(',');
        sb.append(mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        this.f189189c = bVar;
    }

    /* renamed from: o */
    public final void mo89814o(C45795b bVar, C66686a aVar) {
        String str;
        Class cls = C54519d.class;
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(aVar, "config");
        mo89813n(bVar);
        C66686a aVar2 = this.f189190d;
        aVar2.getClass();
        aVar2.f191724a = aVar.f191724a;
        aVar2.f191725b = aVar.f191725b;
        Long l = null;
        if (this.f189190d.f191725b) {
            C66690g gVar = ((C54518c) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C54518c.class)).f152838e.get(Long.valueOf(((C54519d) bVar.mo71262a(cls)).mo75371d3()));
            Integer valueOf = gVar != null ? Integer.valueOf(gVar.f191730a) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                str = "change offset:" + ((C54519d) bVar.mo71262a(cls)).f152854q + " to " + intValue;
                ((C54519d) bVar.mo71262a(cls)).mo75361F3(intValue);
            } else {
                str = null;
            }
        } else {
            str = "";
        }
        if (this.f189190d.f191724a) {
            mo89807h();
        }
        C57941h hVar = this.f189192f;
        if (hVar != null) {
            hVar.mo82742p(this.f189189c);
        }
        C62283d dVar = (C62283d) mo89804e(C62283d.class);
        if (dVar != null) {
            C65788d0 d0Var = (C65788d0) ((C36570n) this.f189196j).getValue();
            String c3 = dVar.mo87350c3();
            StringBuilder sb = new StringBuilder();
            sb.append("set SeiProcessViewCallback:");
            sb.append(d0Var != null ? d0Var.hashCode() : 0);
            Log.m105924i(c3, sb.toString());
            dVar.f177051h = d0Var;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("setData:");
        C45795b bVar2 = this.f189189c;
        if (bVar2 != null) {
            l = Long.valueOf(((C54519d) bVar2.mo71262a(cls)).mo75371d3());
        }
        sb4.append(l);
        sb4.append(" logicConfig:");
        sb4.append(this.f189190d);
        sb4.append(' ');
        sb4.append(str);
        Log.m105924i("FinderLiveReplayService", sb4.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = (zo1.C66925j0) r7.mo78582g(zo1.C66925j0.class);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89815p(cp1.C57957o r7, ks3.C61162l r8) {
        /*
            r6 = this;
            java.lang.Class<bp1.d> r0 = bp1.C54519d.class
            java.lang.String r1 = "targetMode"
            gy3.C87412m.m108594g(r8, r1)
            r6.mo89816q(r7)
            if (r7 == 0) goto L_0x001a
            java.lang.Class<zo1.j0> r1 = zo1.C66925j0.class
            qj1.c r1 = r7.mo78582g(r1)
            zo1.j0 r1 = (zo1.C66925j0) r1
            if (r1 == 0) goto L_0x001a
            cp1.m r1 = r1.f192301r
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            r6.f189201o = r1
            androidx.lifecycle.i0 r1 = r6.mo89804e(r0)
            bp1.d r1 = (bp1.C54519d) r1
            r2 = 0
            if (r1 == 0) goto L_0x002a
            long r4 = r1.f152847g
            goto L_0x002b
        L_0x002a:
            r4 = r2
        L_0x002b:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x003e
            androidx.lifecycle.i0 r1 = r6.mo89804e(r0)
            bp1.d r1 = (bp1.C54519d) r1
            if (r1 != 0) goto L_0x0038
            goto L_0x003e
        L_0x0038:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r1.f152847g = r2
        L_0x003e:
            androidx.lifecycle.i0 r0 = r6.mo89804e(r0)
            bp1.d r0 = (bp1.C54519d) r0
            if (r0 != 0) goto L_0x0047
            goto L_0x004c
        L_0x0047:
            d50.i$d r1 = d50.C58115i.C58119d.NORMAL_MODE
            r0.mo75368N3(r1)
        L_0x004c:
            cp1.o r0 = r6.f189191e
            if (r0 == 0) goto L_0x0058
            vo1.a0$g r1 = new vo1.a0$g
            r1.<init>(r6)
            r0.setUIClickListener(r1)
        L_0x0058:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r6.mo89805f()
            if (r0 == 0) goto L_0x0063
            gh1.j r1 = gh1.C59447j.f169870a
            r1.mo84552d(r0, r8)
        L_0x0063:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r6.mo89805f()
            if (r0 == 0) goto L_0x007a
            gh1.j r1 = gh1.C59447j.f169870a
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r7, r2)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            gh1.l r2 = new gh1.l
            r2.<init>(r0, r7)
            r1.mo84557i(r0, r2)
        L_0x007a:
            ks3.l r7 = ks3.C61162l.Replay
            if (r8 != r7) goto L_0x00d4
            vo1.g r7 = r6.f189203q
            if (r7 != 0) goto L_0x0087
            vo1.g r7 = new vo1.g
            r7.<init>()
        L_0x0087:
            r6.f189203q = r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "requestAudioFocus audioFocusSession:"
            r8.append(r0)
            nc3.b$c r0 = r7.f189236a
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "FinderLiveReplayAudioManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            nc3.b$c r8 = r7.f189236a
            if (r8 != 0) goto L_0x00ba
            java.lang.Class<nc3.b> r8 = nc3.C34767b.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            nc3.b r8 = (nc3.C34767b) r8
            nc3.b$b$d r0 = nc3.C34767b.C34769b.C34771d.f93454c
            vo1.f r1 = new vo1.f
            r1.<init>(r7)
            nc3.b$c r8 = r8.mo34192el(r0, r1)
            r7.f189236a = r8
        L_0x00ba:
            nc3.b$c r8 = r7.f189236a
            r0 = 1
            if (r8 == 0) goto L_0x00c6
            boolean r8 = r8.mo34198a()
            if (r8 != r0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            if (r0 != 0) goto L_0x00cf
            java.lang.String r8 = "not gain focus"
            r7.mo89840b(r8)
            goto L_0x00d4
        L_0x00cf:
            java.lang.String r8 = "requestAudioFocus"
            r7.mo89839a(r8)
        L_0x00d4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setFullScreenUI:"
            r7.append(r8)
            java.lang.String r8 = r6.mo89808i()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FinderLiveReplayService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65770a0.mo89815p(cp1.o, ks3.l):void");
    }

    /* renamed from: q */
    public final void mo89816q(C57957o oVar) {
        C62042e eVar = C62042e.f176370a;
        eVar.mo87001E1("FinderLiveReplayService", "set replayFullScreenView:" + oVar);
        this.f189191e = oVar;
    }

    /* renamed from: r */
    public final void mo89817r(Intent intent) {
        C65776h hVar = new C65776h(this, intent);
        if (((C64916p1) C86312j.m106911c(C64916p1.class)).mo76723ty()) {
            MMHandlerThread.postToMainThreadDelayed(new C37793e(hVar), 200);
        } else {
            hVar.invoke();
        }
    }

    /* renamed from: s */
    public final void mo89818s(C65818s0 s0Var) {
        C87412m.m108594g(s0Var, "proxy");
        Log.m105924i("FinderLiveReplayService", "unregisterSeiProcessViewCallbackProxy:" + s0Var.hashCode());
        this.f189198l.remove(s0Var);
    }
}
