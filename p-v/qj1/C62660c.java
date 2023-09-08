package qj1;

import al1.C27914d;
import al1.C54127h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import bl3.C39818r;
import cj1.C54795n5;
import cl1.C0702z0;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58121a;
import d60.C58124b;
import dk1.C58312g;
import fj1.C45795b;
import gg1.C32444a;
import gy3.C87412m;
import o40.C61926c;
import ob0.C117747y;
import te3.C49712hj1;

/* renamed from: qj1.c */
public abstract class C62660c extends C58121a implements C62945qi, C0125s {

    /* renamed from: f */
    public final ViewGroup f177935f;

    /* renamed from: g */
    public final C58124b f177936g;

    /* renamed from: h */
    public final C49712hj1 f177937h;

    /* renamed from: i */
    public int f177938i = this.f166287d.getVisibility();

    /* renamed from: j */
    public int f177939j = 65535;

    /* renamed from: n */
    public int f177940n;

    /* renamed from: o */
    public C103766u f177941o;

    /* renamed from: qj1.c$a */
    public /* synthetic */ class C62661a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f177942a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[7] = 1;
            f177942a = iArr;
        }
    }

    /* renamed from: qj1.c$b */
    public static final class C62662b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f177943d;

        /* renamed from: e */
        public final /* synthetic */ String f177944e;

        /* renamed from: f */
        public final /* synthetic */ C62660c f177945f;

        public C62662b(View view, String str, C62660c cVar) {
            this.f177943d = view;
            this.f177944e = str;
            this.f177945f = cVar;
        }

        public final void run() {
            int i = C61926c.m72688m(this.f177943d).bottom;
            Log.m105924i("notify2ChangeCommentHeight", "[notify2CHangeCommentHeight] tag = " + this.f177944e + ", bottom = " + i);
            ((C0702z0) this.f177945f.mo87696x0(C0702z0.class)).f1686w.setValue(Integer.valueOf(i));
        }
    }

    /* renamed from: qj1.c$c */
    public static final class C62663c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f177946d;

        /* renamed from: e */
        public final /* synthetic */ C62660c f177947e;

        public C62663c(String str, C62660c cVar) {
            this.f177946d = str;
            this.f177947e = cVar;
        }

        public final void run() {
            Log.m105924i("notify2ChangeCommentHeight", "[notify2CHangeCommentHeight] tag = " + this.f177946d + ", post null");
            ((C0702z0) this.f177947e.mo87696x0(C0702z0.class)).f1686w.postValue(null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62660c(ViewGroup viewGroup, C58124b bVar, C49712hj1 hj12) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "vg");
        C87412m.m108594g(bVar, "liveStatus");
        this.f177935f = viewGroup;
        this.f177936g = bVar;
        this.f177937h = hj12;
        C32444a aVar = C32444a.f86121a;
        this.f177940n = C32444a.f86139e1.mo60266n().intValue();
        this.f177941o = new C103766u(this);
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m73643W0(C62660c cVar, String str, Object obj, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                obj = null;
            }
            cVar.mo87694V0(str, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postPortraitAction");
    }

    /* renamed from: Y0 */
    public static /* synthetic */ void m73644Y0(C62660c cVar, String str, Object obj, int i, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 2) != 0) {
                obj = null;
            }
            if ((i2 & 4) != 0) {
                i = ViewConfiguration.getJumpTapTimeout();
            }
            cVar.mo87695X0(str, obj, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postPortraitActionDelay");
    }

    /* renamed from: A0 */
    public final C45795b mo87684A0() {
        C58124b bVar = this.f177936g;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return ((C56032b) bVar).getBuContext();
    }

    /* renamed from: B0 */
    public <T extends LiveRoomController> T mo87685B0(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        C58124b bVar = this.f177936g;
        C56032b bVar2 = bVar instanceof C56032b ? (C56032b) bVar : null;
        if (bVar2 != null) {
            return bVar2.getController(cls);
        }
        return null;
    }

    /* renamed from: C0 */
    public final C54127h mo87686C0() {
        C58124b bVar = this.f177936g;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return ((C56032b) bVar).getData();
    }

    /* renamed from: D0 */
    public C54795n5 mo14476D0() {
        FinderLiveService.f159376d.getClass();
        return FinderLiveService.f159396y;
    }

    /* renamed from: E0 */
    public <T extends C62660c> T mo87687E0(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        C58124b bVar = this.f177936g;
        C56032b bVar2 = bVar instanceof C56032b ? (C56032b) bVar : null;
        if (bVar2 != null) {
            return bVar2.getPlugin(cls);
        }
        return null;
    }

    /* renamed from: F0 */
    public C56032b mo14482F0() {
        C58124b bVar = this.f177936g;
        if (bVar instanceof C56032b) {
            return (C56032b) bVar;
        }
        return null;
    }

    /* renamed from: G0 */
    public boolean mo87688G0() {
        Context context = this.f177935f.getContext();
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return activity.isDestroyed() | activity.isFinishing();
    }

    /* renamed from: H0 */
    public final void mo87689H0(View view, String str) {
        C87412m.m108594g(str, "tag");
        if (mo82893g0()) {
            return;
        }
        if (view != null) {
            view.post(new C62662b(view, str, this));
        } else {
            this.f166287d.post(new C62663c(str, this));
        }
    }

    /* renamed from: I0 */
    public void mo12076I0(boolean z) {
    }

    /* renamed from: J0 */
    public void mo87690J0(boolean z) {
        if (this.f177940n == 1 && Build.VERSION.SDK_INT >= 24) {
            ViewGroup viewGroup = this.f166287d;
            viewGroup.forceHasOverlappingRendering(viewGroup.hasOverlappingRendering());
        }
        if (z) {
            mo10792g(this.f177938i);
        }
    }

    /* renamed from: K0 */
    public void mo87674K0(boolean z) {
    }

    /* renamed from: L0 */
    public void mo87691L0(boolean z) {
        if (this.f177940n == 1 && Build.VERSION.SDK_INT >= 24) {
            this.f166287d.forceHasOverlappingRendering(false);
        }
        if (!z) {
            mo10792g(this.f177938i);
        }
    }

    /* renamed from: M0 */
    public void mo87675M0(boolean z) {
    }

    /* renamed from: N0 */
    public void mo12123N0(float f) {
        if (this.f177940n == 1 && Build.VERSION.SDK_INT >= 24) {
            this.f166287d.setAlpha(f);
        }
    }

    /* renamed from: O0 */
    public void mo12017O0(Configuration configuration) {
    }

    /* renamed from: P0 */
    public void mo12077P0(C117747y yVar, boolean z) {
    }

    /* renamed from: Q0 */
    public void mo12018Q0(Bundle bundle) {
    }

    /* renamed from: R0 */
    public void mo87692R0(Bundle bundle, long j) {
    }

    /* renamed from: S0 */
    public void mo87693S0(Intent intent) {
    }

    /* renamed from: T0 */
    public void mo11982T0(Bundle bundle, Object obj) {
    }

    /* renamed from: U0 */
    public void mo12048U0() {
    }

    /* renamed from: V0 */
    public final void mo87694V0(String str, Object obj) {
        C87412m.m108594g(str, "action");
        mo87695X0(str, obj, 0);
    }

    /* renamed from: X0 */
    public final void mo87695X0(String str, Object obj, int i) {
        Class cls = C54991o.class;
        C87412m.m108594g(str, "action");
        ((C54991o) mo87696x0(cls)).f154255S3 = true;
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_POST_PORTRAIT", str);
        if (i > 0) {
            bundle.putInt("ACTION_POST_PORTRAIT_DELAY", i);
        }
        ((C54991o) mo87696x0(cls)).f154321h1 = new C27914d("EVENT_POST_PORTRAIT_ACTION", bundle, obj);
        mo14484z0().onPortraitAction(((C54991o) mo87696x0(cls)).f154295b1, ((C54991o) mo87696x0(cls)).f154291a1, bundle, obj);
    }

    /* renamed from: e */
    public void mo12022e(Bundle bundle, Object obj, long j) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (r4.f177939j == 8) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (mo3206h() != false) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10792g(int r5) {
        /*
            r4 = this;
            r4.f177938i = r5
            boolean r0 = r4.mo3208m()
            r1 = 8
            if (r0 != 0) goto L_0x000d
        L_0x000a:
            r5 = 8
            goto L_0x003e
        L_0x000d:
            bl3.r r0 = bl3.C39818r.f106831a
            com.tencent.mm.plugin.finder.live.view.b r2 = r4.mo14484z0()
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = "basePluginLayout.context"
            gy3.C87412m.m108593f(r2, r3)
            bl3.r$a r0 = r0.mo62443b(r2)
            java.lang.Class<dk1.g> r2 = dk1.C58312g.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            dk1.g r0 = (dk1.C58312g) r0
            boolean r0 = r0.f166967e
            if (r0 == 0) goto L_0x0033
            boolean r0 = r4.mo3206h()
            if (r0 == 0) goto L_0x0033
            goto L_0x000a
        L_0x0033:
            boolean r0 = r4.mo3200b()
            if (r0 == 0) goto L_0x003e
            int r0 = r4.f177939j
            if (r0 != r1) goto L_0x003e
            goto L_0x000a
        L_0x003e:
            super.mo10792g(r5)
            if (r5 != 0) goto L_0x004a
            android.view.ViewGroup r5 = r4.f166287d
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62660c.mo10792g(int):void");
    }

    public C39623j getLifecycle() {
        return this.f177941o;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        if (this.f177941o.f306531b == C39623j.C39626c.DESTROYED) {
            this.f177941o = new C103766u(this);
        }
        this.f177941o.mo145138f(C39623j.C39626c.RESUMED);
    }

    /* renamed from: j0 */
    public String mo82894j0() {
        return getClass().getSimpleName() + '@' + hashCode();
    }

    /* renamed from: n0 */
    public void mo12054n0(int i) {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C62661a.f177942a[bVar.ordinal()] == 1) {
            mo12048U0();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        this.f177941o.mo145138f(C39623j.C39626c.DESTROYED);
    }

    /* renamed from: x0 */
    public <T extends C39622i0> T mo87696x0(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        return mo87684A0().mo71262a(cls);
    }

    /* renamed from: y0 */
    public final void mo87697y0() {
        C39818r rVar = C39818r.f106831a;
        Context context = mo14484z0().getContext();
        C87412m.m108593f(context, "basePluginLayout.context");
        if (((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e && mo3206h()) {
            return;
        }
        if (!mo3200b() || this.f177939j != 8) {
            mo10792g(this.f177938i);
        }
    }

    /* renamed from: z0 */
    public C56032b mo14484z0() {
        C58124b bVar = this.f177936g;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return (C56032b) bVar;
    }
}
