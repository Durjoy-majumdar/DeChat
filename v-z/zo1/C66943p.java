package zo1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bp1.C54519d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.IXWebBroadcastListener;
import cp1.C57959q;
import d60.C58124b;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ok1.C62042e;
import p447aw.C103918d;
import p447aw.C54369c;
import qj1.C62660c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import vc3.C78382a;
import vo1.C65770a0;

/* renamed from: zo1.p */
public final class C66943p extends C62660c {

    /* renamed from: p */
    public final C58124b f192331p;

    /* renamed from: q */
    public final String f192332q = "ReplayMiniViewPlugin";

    /* renamed from: r */
    public final C13601g f192333r;

    /* renamed from: s */
    public final C13601g f192334s;

    /* renamed from: zo1.p$a */
    public static final class C66944a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66943p f192335d;

        public C66944a(C66943p pVar) {
            this.f192335d = pVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/replay/plugin/ReplayMiniViewPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66943p pVar = this.f192335d;
            pVar.getClass();
            if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(pVar.mo14484z0().getContext(), 21)) {
                Log.m105924i(pVar.f192332q, "miniWindow, permission denied");
                ((C54519d) pVar.mo87696x0(C54519d.class)).mo75380o3(true);
                ((C54369c) C86312j.m106911c(C54369c.class)).Oa0(pVar.f166287d.getContext(), 21, pVar.f166287d.getContext().getResources().getString(C0966R.string.e69), (C66948q) ((C36570n) pVar.f192333r).getValue(), false, true, C78382a.m94650b());
            } else {
                pVar.mo90933Z0();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayMiniViewPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zo1.p$b */
    public static final class C66945b implements Runnable {

        /* renamed from: d */
        public final long f192336d;

        /* renamed from: e */
        public final WeakReference<C66943p> f192337e;

        public C66945b(long j, WeakReference<C66943p> weakReference) {
            C87412m.m108594g(weakReference, "rMiniviewPlugin");
            this.f192336d = j;
            this.f192337e = weakReference;
        }

        public void run() {
            Activity activity;
            C66948q qVar;
            C66943p pVar = this.f192337e.get();
            boolean Jn = ((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext());
            C54519d dVar = null;
            Context context = pVar != null ? pVar.mo14484z0().getContext() : null;
            WeakReference<Activity> g = AppForegroundDelegate.m161224g();
            if (g == null || (activity = g.get()) == null) {
                WeakReference<Activity> f = AppForegroundDelegate.INSTANCE.mo174212f();
                activity = f != null ? f.get() : null;
            }
            Log.m105924i("ReplayMiniViewPlugin", "isTopApp context:" + context + ",topActivity:" + activity);
            boolean b = C87412m.m108589b(context, activity);
            C65770a0.C65771b bVar = C65770a0.f189184r;
            boolean z = bVar.mo89819a().f189191e != null;
            Log.m105924i("ReplayMiniViewPlugin", "excute delay task,liveId:" + this.f192336d + ",permission:" + Jn + ",isTopApp:" + b + ",replayFullViewShow:" + z + '!');
            if (pVar != null) {
                dVar = (C54519d) pVar.mo87696x0(C54519d.class);
            }
            if (dVar != null) {
                dVar.mo75380o3(false);
            }
            if (!(pVar == null || (qVar = (C66948q) ((C36570n) pVar.f192333r).getValue()) == null)) {
                ((C54369c) C86312j.m106911c(C54369c.class)).A60(qVar);
            }
            if (!Jn && !b) {
                if (pVar != null) {
                    pVar.mo14484z0().finish();
                }
                if (!z) {
                    bVar.mo89819a().mo89811l(10, this.f192336d, true);
                }
            }
        }
    }

    /* renamed from: zo1.p$c */
    public static final class C66946c extends C87413o implements C32224a<C66948q> {

        /* renamed from: d */
        public final /* synthetic */ C66943p f192338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66946c(C66943p pVar) {
            super(0);
            this.f192338d = pVar;
        }

        public Object invoke() {
            return new C66948q(this.f192338d);
        }
    }

    /* renamed from: zo1.p$d */
    public static final class C66947d extends C87413o implements C32224a<C66945b> {

        /* renamed from: d */
        public final /* synthetic */ C66943p f192339d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66947d(C66943p pVar) {
            super(0);
            this.f192339d = pVar;
        }

        public Object invoke() {
            return new C66945b(((C54519d) this.f192339d.mo87696x0(C54519d.class)).mo75371d3(), new WeakReference(this.f192339d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66943p(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f192331p = bVar;
        viewGroup.setOnClickListener(new C66944a(this));
        C62042e.f176370a.mo87071d(this);
        this.f192333r = C36568h.m40985a(new C66946c(this));
        this.f192334s = C36568h.m40985a(new C66947d(this));
    }

    /* renamed from: Z0 */
    public final void mo90933Z0() {
        C57959q uiClickListener;
        ((C54519d) mo87684A0().mo71262a(C54519d.class)).mo75380o3(true);
        C56032b z0 = mo14484z0();
        FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = z0 instanceof FinderLiveReplayPluginLayout ? (FinderLiveReplayPluginLayout) z0 : null;
        if (finderLiveReplayPluginLayout != null && (uiClickListener = finderLiveReplayPluginLayout.getUiClickListener()) != null) {
            uiClickListener.mo82766b();
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: t0 */
    public void mo82897t0() {
        Log.m105924i(this.f192332q, IXWebBroadcastListener.STAGE_START);
        mo14484z0().removeCallbacks((C66945b) ((C36570n) this.f192334s).getValue());
    }

    /* renamed from: v0 */
    public void mo12287v0() {
        Class cls = C54519d.class;
        boolean Jn = ((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext());
        String str = this.f192332q;
        Log.m105924i(str, "stop, permission:" + Jn + ", manualMinimum:" + ((C54519d) mo87684A0().mo71262a(cls)).f152860w);
        if (!Jn && ((C54519d) mo87684A0().mo71262a(cls)).f152860w) {
            mo14484z0().postDelayed((C66945b) ((C36570n) this.f192334s).getValue(), 20000);
        }
    }
}
