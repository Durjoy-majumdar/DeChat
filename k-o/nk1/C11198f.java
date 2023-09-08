package nk1;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import eb0.C75592q0;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.UUID;
import o40.C61926c;
import p823sg.C90193h;
import rx3.C13598b0;
import z04.C119027c;

/* renamed from: nk1.f */
public final class C11198f {

    /* renamed from: a */
    public final int f33012a;

    /* renamed from: b */
    public final int f33013b;

    /* renamed from: c */
    public final long f33014c;

    /* renamed from: d */
    public final long f33015d;

    /* renamed from: e */
    public volatile C11201b f33016e;

    /* renamed from: f */
    public volatile String f33017f;

    /* renamed from: g */
    public volatile int f33018g;

    /* renamed from: h */
    public volatile int f33019h;

    /* renamed from: i */
    public volatile long f33020i;

    /* renamed from: j */
    public volatile boolean f33021j;

    /* renamed from: k */
    public volatile boolean f33022k;

    /* renamed from: l */
    public C11199a f33023l;

    /* renamed from: m */
    public boolean f33024m;

    /* renamed from: n */
    public volatile View f33025n;

    /* renamed from: o */
    public final View.OnTouchListener f33026o;

    /* renamed from: p */
    public final C11202c f33027p;

    /* renamed from: q */
    public MTimerHandler f33028q;

    /* renamed from: r */
    public MTimerHandler f33029r;

    /* renamed from: nk1.f$a */
    public interface C11199a {

        /* renamed from: nk1.f$a$a */
        public static final class C11200a {
            /* renamed from: a */
            public static /* synthetic */ boolean m11063a(C11199a aVar, View view, int i, int i2, C11201b bVar, String str, boolean z, boolean z2, int i3, Object obj) {
                if (obj == null) {
                    return aVar.mo11286a(view, i, i2, bVar, str, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: batchCallback");
            }

            /* renamed from: b */
            public static /* synthetic */ boolean m11064b(C11199a aVar, View view, int i, C11201b bVar, String str, int i2, boolean z, int i3, Object obj) {
                if (obj == null) {
                    return aVar.mo11288c(view, i, bVar, str, i2, (i3 & 32) != 0 ? false : z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: instantCallback");
            }
        }

        /* renamed from: a */
        boolean mo11286a(View view, int i, int i2, C11201b bVar, String str, boolean z, boolean z2);

        /* renamed from: b */
        void mo11287b(MotionEvent motionEvent);

        /* renamed from: c */
        boolean mo11288c(View view, int i, C11201b bVar, String str, int i2, boolean z);
    }

    /* renamed from: nk1.f$b */
    public enum C11201b {
        NORMAL,
        SINGLE_CLICK,
        CONTINUOUS_CLICKING,
        LONG_CLICK
    }

    /* renamed from: nk1.f$c */
    public static final class C11202c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C11198f f33035d;

        public C11202c(C11198f fVar) {
            this.f33035d = fVar;
        }

        public void run() {
            this.f33035d.mo11285e(C11201b.LONG_CLICK);
            if (this.f33035d.f33028q.stopped()) {
                String unused = this.f33035d.getClass();
                Log.m105924i("Finder.ContinuousClickManager", "long click start timer");
                C11198f fVar = this.f33035d;
                fVar.f33028q.startTimer((long) fVar.f33013b);
            }
            if (this.f33035d.f33029r.stopped()) {
                String unused2 = this.f33035d.getClass();
                Log.m105924i("Finder.ContinuousClickManager", "long click start longClickTimer");
                C11198f fVar2 = this.f33035d;
                fVar2.f33029r.startTimer(fVar2.f33015d);
            }
        }
    }

    /* renamed from: nk1.f$d */
    public static final class C11203d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C11198f f33036d;

        /* renamed from: nk1.f$d$a */
        public static final class C11204a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C11198f f33037d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11204a(C11198f fVar) {
                super(0);
                this.f33037d = fVar;
            }

            public Object invoke() {
                this.f33037d.mo11285e(C11201b.LONG_CLICK);
                return C13598b0.f38549a;
            }
        }

        public C11203d(C11198f fVar) {
            this.f33036d = fVar;
        }

        public boolean onTimerExpired() {
            if (this.f33036d.f33021j) {
                return false;
            }
            String unused = this.f33036d.getClass();
            Log.m105924i("Finder.ContinuousClickManager", "ContinuousClickManager longClickTimer callback: clickCnt = " + this.f33036d.f33018g + ", state = " + this.f33036d.f33016e.name() + ", lastClickCnt = " + this.f33036d.f33019h);
            C61926c.m72668M(new C11204a(this.f33036d));
            return true;
        }
    }

    /* renamed from: nk1.f$e */
    public static final class C11205e implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C11198f f33038d;

        public C11205e(C11198f fVar) {
            this.f33038d = fVar;
        }

        public boolean onTimerExpired() {
            C11201b bVar = C11201b.NORMAL;
            String unused = this.f33038d.getClass();
            Log.m105924i("Finder.ContinuousClickManager", "ContinuousClickManager Timer callback: clickCnt = " + this.f33038d.f33018g + ", state = " + this.f33038d.f33016e.name() + ", lastClickCnt = " + this.f33038d.f33019h);
            if (this.f33038d.f33019h != this.f33038d.f33018g) {
                int i = this.f33038d.f33018g - this.f33038d.f33019h;
                C11198f fVar = this.f33038d;
                fVar.f33019h = fVar.f33018g;
                if (i < 0) {
                    this.f33038d.mo11285e(bVar);
                    C11198f fVar2 = this.f33038d;
                    C11199a aVar = fVar2.f33023l;
                    if (aVar != null) {
                        C11199a.C11200a.m11063a(aVar, fVar2.f33025n, this.f33038d.f33018g, 0, bVar, this.f33038d.f33017f, false, this.f33038d.f33022k, 32, (Object) null);
                    }
                    return false;
                }
                C11198f fVar3 = this.f33038d;
                C11199a aVar2 = fVar3.f33023l;
                if (aVar2 != null) {
                    C11199a.C11200a.m11063a(aVar2, fVar3.f33025n, this.f33038d.f33018g, i, this.f33038d.f33016e, this.f33038d.f33017f, false, this.f33038d.f33022k, 32, (Object) null);
                }
            }
            C11198f fVar4 = this.f33038d;
            if (!fVar4.f33021j || System.currentTimeMillis() - fVar4.f33020i < 3000) {
                return true;
            }
            this.f33038d.mo11285e(bVar);
            C11198f fVar5 = this.f33038d;
            C11199a aVar3 = fVar5.f33023l;
            if (aVar3 == null) {
                return false;
            }
            C11199a.C11200a.m11063a(aVar3, fVar5.f33025n, this.f33038d.f33018g, 0, bVar, this.f33038d.f33017f, false, this.f33038d.f33022k, 32, (Object) null);
            return false;
        }
    }

    /* renamed from: nk1.f$f */
    public static final class C11206f implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C11198f f33039d;

        public C11206f(C11198f fVar) {
            this.f33039d = fVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C11201b bVar = C11201b.SINGLE_CLICK;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/util/ContinuousClickManager$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            byte[] bArr = null;
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
            boolean z = false;
            if (valueOf != null && valueOf.intValue() == 0) {
                this.f33039d.f33021j = false;
                int ordinal = this.f33039d.f33016e.ordinal();
                if (ordinal == 0) {
                    if ((BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) && 1 == C32444a.f86130c0.mo60266n().intValue()) {
                        C11198f fVar = this.f33039d;
                        StringBuilder sb = new StringBuilder();
                        String s = C75592q0.m90789s();
                        if (s != null) {
                            bArr = s.getBytes(C119027c.f356488a);
                            C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
                        }
                        sb.append(C90193h.m112878f(bArr));
                        sb.append("_123456");
                        fVar.f33017f = sb.toString();
                    } else {
                        C11198f fVar2 = this.f33039d;
                        StringBuilder sb4 = new StringBuilder();
                        String s2 = C75592q0.m90789s();
                        if (s2 != null) {
                            bArr = s2.getBytes(C119027c.f356488a);
                            C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
                        }
                        sb4.append(C90193h.m112878f(bArr));
                        sb4.append('_');
                        sb4.append(UUID.randomUUID());
                        fVar2.f33017f = sb4.toString();
                    }
                    this.f33039d.mo11285e(bVar);
                } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    C11198f fVar3 = this.f33039d;
                    if (!fVar3.f33021j || System.currentTimeMillis() - fVar3.f33020i < 3000) {
                        z = true;
                    }
                    if (z) {
                        this.f33039d.mo11285e(C11201b.CONTINUOUS_CLICKING);
                    } else {
                        this.f33039d.mo11285e(bVar);
                    }
                }
                C11198f fVar4 = this.f33039d;
                C61926c.m72667L(fVar4.f33014c, fVar4.f33027p);
            } else if (valueOf != null && valueOf.intValue() == 2) {
                this.f33039d.f33021j = false;
            } else {
                if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                    z = true;
                }
                if (z) {
                    String unused = this.f33039d.getClass();
                    Log.m105924i("Finder.ContinuousClickManager", "on ACTION_UP or ACTION_CANCEL: " + motionEvent);
                    this.f33039d.f33021j = true;
                    this.f33039d.f33020i = System.currentTimeMillis();
                    if (this.f33039d.f33028q.stopped()) {
                        String unused2 = this.f33039d.getClass();
                        Log.m105924i("Finder.ContinuousClickManager", "single click start timer");
                        C11198f fVar5 = this.f33039d;
                        fVar5.f33028q.startTimer((long) fVar5.f33013b);
                    }
                    this.f33039d.mo11282b();
                    C11199a aVar = this.f33039d.f33023l;
                    if (aVar != null) {
                        C87412m.m108593f(motionEvent, "event");
                        aVar.mo11287b(motionEvent);
                    }
                }
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/util/ContinuousClickManager$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    public C11198f() {
        FinderLiveService.f159376d.getClass();
        int i = FinderLiveService.f159354G;
        this.f33012a = i <= 0 ? 5 : i;
        int i2 = FinderLiveService.f159355H;
        this.f33013b = i2 <= 0 ? 1000 : i2;
        this.f33014c = 500;
        this.f33015d = 200;
        this.f33016e = C11201b.NORMAL;
        this.f33017f = "";
        this.f33021j = true;
        this.f33024m = true;
        this.f33026o = new C11206f(this);
        this.f33027p = new C11202c(this);
        this.f33028q = new MTimerHandler("ContinuousClickManager::Timer", (MTimerHandler.CallBack) new C11205e(this), true);
        this.f33029r = new MTimerHandler("ContinuousClickManager::longClickTimer", (MTimerHandler.CallBack) new C11203d(this), true);
    }

    /* renamed from: b */
    public final void mo11282b() {
        C61926c.m72698w(this.f33027p);
        this.f33029r.stopTimer();
        Log.m105924i("Finder.ContinuousClickManager", "cancelLongClickState: longClickTimer.stopped = " + this.f33029r.stopped());
    }

    /* renamed from: c */
    public final void mo11283c() {
        int i = this.f33018g - this.f33019h;
        if (i >= this.f33012a) {
            Log.m105924i("Finder.ContinuousClickManager", "checkComboBatchSize: clickCnt = " + this.f33018g + ", lastClickCnt = " + this.f33019h);
            this.f33019h = this.f33018g;
            C11199a aVar = this.f33023l;
            if (aVar != null) {
                C11199a.C11200a.m11063a(aVar, this.f33025n, this.f33018g, i, this.f33016e, this.f33017f, false, false, 96, (Object) null);
            }
            if (!this.f33028q.stopped()) {
                this.f33028q.stopTimer();
                this.f33028q.startTimer((long) this.f33013b);
            }
        }
    }

    /* renamed from: d */
    public final void mo11284d(View view) {
        C11199a aVar;
        if (this.f33025n != null) {
            Log.m105924i("Finder.ContinuousClickManager", "unRegisterView view: " + view);
            if (view != null) {
                view.setOnTouchListener((View.OnTouchListener) null);
            }
            this.f33025n = null;
            this.f33022k = false;
            this.f33028q.stopTimer();
            mo11282b();
            int i = this.f33018g - this.f33019h;
            if (i > 0 && (aVar = this.f33023l) != null) {
                C11199a.C11200a.m11063a(aVar, this.f33025n, this.f33018g, i, this.f33016e, this.f33017f, true, false, 64, (Object) null);
            }
            this.f33023l = null;
            mo11285e(C11201b.NORMAL);
            this.f33021j = true;
        }
    }

    /* renamed from: e */
    public final void mo11285e(C11201b bVar) {
        Log.m105924i("Finder.ContinuousClickManager", "updateState: newState = " + bVar);
        this.f33016e = bVar;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            this.f33018g = 0;
            this.f33019h = 0;
            this.f33017f = "";
        } else if (ordinal == 1 || ordinal == 2) {
            this.f33018g++;
            C11199a aVar = this.f33023l;
            if (aVar != null) {
                C11199a.C11200a.m11064b(aVar, this.f33025n, this.f33018g, bVar, this.f33017f, this.f33018g - this.f33019h, false, 32, (Object) null);
            }
            mo11283c();
        } else if (ordinal == 3) {
            this.f33018g++;
            C11199a aVar2 = this.f33023l;
            if (aVar2 != null) {
                C11199a.C11200a.m11064b(aVar2, this.f33025n, this.f33018g, bVar, this.f33017f, this.f33018g - this.f33019h, false, 32, (Object) null);
            }
            mo11283c();
        }
    }
}
