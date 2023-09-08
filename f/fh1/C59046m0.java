package fh1;

import a14.C0000n0;
import a14.C53934p0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import cj1.C0581o5;
import cj1.C0584p5;
import cl1.C0702z0;
import cl1.C54991o;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.replay.bullet.LiveDanmakuView;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d14.C45253g;
import d14.C58052j1;
import d14.C58085t0;
import d14.C58087u0;
import d14.C58100z0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gh1.C59453p;
import gh1.C8313a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import p001ak.C54053a;
import p001ak.C54057e;
import p848dk.C58306h;
import p871zj.C66834a;
import p871zj.C66846j;
import p871zj.C66856o;
import qj1.C62632a6;
import rx3.C13598b0;
import rx3.C13600d;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49765hx0;
import te3.C51343t41;
import te3.C52005xq0;
import vg1.C52891f;
import wk1.C15440n;
import wo1.C66145c;
import wo1.C66154f;
import wo1.C66155g;
import wo1.C66156i;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: fh1.m0 */
public final class C59046m0 extends C8313a {

    /* renamed from: j */
    public final String f168949j = "LiveDanmakuController";

    /* renamed from: n */
    public C59453p f168950n;

    /* renamed from: o */
    public View f168951o;

    /* renamed from: p */
    public LiveDanmakuView f168952p;

    /* renamed from: q */
    public C66154f f168953q;

    /* renamed from: r */
    public final C13601g f168954r;

    /* renamed from: s */
    public final C13601g f168955s;

    /* renamed from: fh1.m0$b */
    public static final class C45787b extends C87413o implements C32224a<Runnable> {

        /* renamed from: d */
        public static final C45787b f123685d = new C45787b();

        public C45787b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C45789n0.f123687d;
        }
    }

    /* renamed from: fh1.m0$a */
    public static final class C59047a {

        /* renamed from: a */
        public String f168956a;

        /* renamed from: b */
        public int f168957b;

        /* renamed from: c */
        public boolean f168958c;

        /* renamed from: d */
        public boolean f168959d;

        public C59047a(String str, int i, boolean z, boolean z2) {
            C87412m.m108594g(str, "id");
            this.f168956a = str;
            this.f168957b = i;
            this.f168958c = z;
            this.f168959d = z2;
        }

        /* renamed from: a */
        public final void mo84262a(String str, C0584p5 p5Var) {
            C87412m.m108594g(str, "id");
            this.f168956a = str;
            boolean z = false;
            this.f168957b = p5Var != null ? p5Var.getLikeCount() : 0;
            this.f168958c = p5Var != null ? p5Var.mo583m() : false;
            if (p5Var != null) {
                z = p5Var.mo567a();
            }
            this.f168959d = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C59047a)) {
                return false;
            }
            C59047a aVar = (C59047a) obj;
            return C87412m.m108589b(this.f168956a, aVar.f168956a) && this.f168957b == aVar.f168957b && this.f168958c == aVar.f168958c && this.f168959d == aVar.f168959d;
        }

        public int hashCode() {
            int hashCode = ((this.f168956a.hashCode() * 31) + this.f168957b) * 31;
            boolean z = this.f168958c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f168959d;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            return "SubLikeMsg(id=" + this.f168956a + ", likeCount=" + this.f168957b + ", selfLike=" + this.f168958c + ", selfOp=" + this.f168959d + ')';
        }
    }

    /* renamed from: fh1.m0$c */
    public static final class C59048c extends C87413o implements C32224a<C66155g> {

        /* renamed from: d */
        public final /* synthetic */ LiveRoomControllerStore f168960d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59048c(LiveRoomControllerStore liveRoomControllerStore) {
            super(0);
            this.f168960d = liveRoomControllerStore;
        }

        public Object invoke() {
            return new C66155g(2, 2, 6500, 12000, 0, 5000, C59059o0.f168976a, new C8076p0(this.f168960d), 0, 256, (C8480h) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveDanmakuController$onViewMount$1", mo125469f = "LiveDanmakuController.kt", mo125470l = {625}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.m0$d */
    public static final class C59049d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f168961d;

        /* renamed from: e */
        public final /* synthetic */ C59046m0 f168962e;

        /* renamed from: fh1.m0$d$a */
        public static final class C59050a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C59046m0 f168963d;

            public C59050a(C59046m0 m0Var) {
                this.f168963d = m0Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                if (((Boolean) obj).booleanValue()) {
                    this.f168963d.mo84260G3("Server");
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59049d(C59046m0 m0Var, C15601d<? super C59049d> dVar) {
            super(2, dVar);
            this.f168962e = m0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59049d(this.f168962e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C59049d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f168961d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<Boolean> t0Var = ((C0702z0) this.f168962e.business(C0702z0.class)).f1687x;
                C59050a aVar2 = new C59050a(this.f168962e);
                this.f168961d = 1;
                C58100z0 z0Var = (C58100z0) t0Var;
                z0Var.getClass();
                if (C58100z0.m67238l(z0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveDanmakuController$onViewMount$2", mo125469f = "LiveDanmakuController.kt", mo125470l = {632}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.m0$e */
    public static final class C59051e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f168964d;

        /* renamed from: e */
        public final /* synthetic */ C59046m0 f168965e;

        /* renamed from: fh1.m0$e$a */
        public static final class C59052a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C59046m0 f168966d;

            public C59052a(C59046m0 m0Var) {
                this.f168966d = m0Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean e4 = ((C54991o) this.f168966d.business(C54991o.class)).mo75999e4();
                String str = this.f168966d.f168949j;
                Log.m105924i(str, "onViewMount liveStart:" + e4 + ", customerEnableDanmakuFlow:" + booleanValue + '!');
                if (e4) {
                    if (booleanValue) {
                        this.f168966d.mo84259F3("customerEnableDanmaku");
                    } else {
                        this.f168966d.mo84261o3();
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59051e(C59046m0 m0Var, C15601d<? super C59051e> dVar) {
            super(2, dVar);
            this.f168965e = m0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59051e(this.f168965e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C59051e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f168964d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58087u0<Boolean> u0Var = ((C0702z0) this.f168965e.business(C0702z0.class)).f1688y;
                C59052a aVar2 = new C59052a(this.f168965e);
                this.f168964d = 1;
                if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveDanmakuController$onViewMount$3", mo125469f = "LiveDanmakuController.kt", mo125470l = {664}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.m0$f */
    public static final class C59053f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f168967d;

        /* renamed from: e */
        public final /* synthetic */ C59046m0 f168968e;

        /* renamed from: fh1.m0$f$a */
        public static final class C59054a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ C59046m0 f168969d;

            /* renamed from: e */
            public final /* synthetic */ C13601g<C59047a> f168970e;

            public C59054a(C59046m0 m0Var, C13601g<C59047a> gVar) {
                this.f168969d = m0Var;
                this.f168970e = gVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                boolean z;
                C0581o5 o5Var = (C0581o5) obj;
                if (o5Var instanceof C0584p5) {
                    C59047a value = this.f168970e.getValue();
                    String f = o5Var.mo572f();
                    String str = "";
                    if (f == null) {
                        f = str;
                    }
                    C0584p5 p5Var = (C0584p5) o5Var;
                    value.getClass();
                    if (C87412m.m108589b(value.f168956a, f) && value.f168958c == p5Var.mo583m() && value.f168957b == p5Var.getLikeCount() && value.f168959d == p5Var.mo567a()) {
                        String str2 = this.f168969d.f168949j;
                        Log.m105924i(str2, "LiveDanmaku_step3_0 updateDanmakuMsg " + o5Var.hashCode() + ", " + o5Var.getContent() + ",seq:" + o5Var.getSeq() + " same with last!");
                        C59047a value2 = this.f168970e.getValue();
                        String f2 = o5Var.mo572f();
                        if (f2 != null) {
                            str = f2;
                        }
                        value2.mo84262a(str, p5Var);
                        return C13598b0.f38549a;
                    }
                    C59047a value3 = this.f168970e.getValue();
                    String f3 = o5Var.mo572f();
                    if (f3 != null) {
                        str = f3;
                    }
                    value3.mo84262a(str, p5Var);
                    String str3 = this.f168969d.f168949j;
                    Log.m105924i(str3, "LiveDanmaku_step3_0 updateDanmakuMsg " + o5Var.hashCode() + ',' + o5Var.getContent() + ",seq:" + o5Var.getSeq());
                    C66154f fVar = this.f168969d.f168953q;
                    if (fVar != null) {
                        C66846j k = ((C66145c) fVar).mo90203k();
                        C59046m0 m0Var = this.f168969d;
                        C66834a aVar = k.f192019d.f191978G;
                        List<List<C54053a>> list = aVar instanceof C66856o ? ((C66856o) aVar).f192036m : null;
                        C87412m.m108593f(list, "danmakuLines");
                        loop0:
                        for (List list2 : list) {
                            C87412m.m108593f(list2, "line");
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    C54053a aVar2 = (C54053a) it.next();
                                    C87412m.m108593f(aVar2, "danmaku");
                                    DATA data = aVar2.f151367x;
                                    if (BuildInfo.DEBUG) {
                                        String str4 = m0Var.f168949j;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("LiveDanmaku_step3_0 find data from ");
                                        sb.append("danmakuLines");
                                        sb.append(",find item is msg:");
                                        boolean z2 = data instanceof C0581o5;
                                        sb.append(z2);
                                        sb.append(",content:");
                                        C0581o5 o5Var2 = z2 ? (C0581o5) data : null;
                                        sb.append(o5Var2 != null ? o5Var2.getContent() : null);
                                        Log.m105924i(str4, sb.toString());
                                    }
                                    if (!(data instanceof C0581o5) || !(data instanceof C0584p5) || !C87412m.m108589b(((C0581o5) data).mo572f(), o5Var.mo572f())) {
                                        z = false;
                                        continue;
                                    } else {
                                        String str5 = m0Var.f168949j;
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("LiveDanmaku_step3_0 update data from ");
                                        sb4.append("danmakuLines");
                                        sb4.append(",data:");
                                        sb4.append(data.hashCode());
                                        sb4.append(" content:");
                                        C0581o5 o5Var3 = (C0581o5) data;
                                        sb4.append(o5Var3.getContent());
                                        sb4.append(",like:");
                                        C0584p5 p5Var2 = (C0584p5) data;
                                        sb4.append(p5Var2.getLikeCount());
                                        sb4.append(",selfLike:");
                                        sb4.append(p5Var2.mo583m());
                                        sb4.append(",badgeInfo:");
                                        C15440n nVar = C15440n.f41895a;
                                        C49765hx0 i = o5Var3.mo579i();
                                        sb4.append(nVar.mo14268s(i != null ? i.f134930r : null));
                                        sb4.append('!');
                                        Log.m105924i(str5, sb4.toString());
                                        C61926c.m72668M(new C59074r0(m0Var, aVar2));
                                        z = true;
                                        continue;
                                    }
                                    if (z) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: fh1.m0$f$b */
        public static final class C59055b extends C87413o implements C32224a<C59047a> {

            /* renamed from: d */
            public static final C59055b f168971d = new C59055b();

            public C59055b() {
                super(0);
            }

            public Object invoke() {
                return new C59047a("", 0, false, false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59053f(C59046m0 m0Var, C15601d<? super C59053f> dVar) {
            super(2, dVar);
            this.f168968e = m0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59053f(this.f168968e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C59053f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f168967d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C13601g a = C36568h.m40985a(C59055b.f168971d);
                C58085t0<C0581o5> t0Var = ((C0702z0) this.f168968e.business(C0702z0.class)).f1689z;
                C59054a aVar2 = new C59054a(this.f168968e, a);
                this.f168967d = 1;
                C58100z0 z0Var = (C58100z0) t0Var;
                z0Var.getClass();
                if (C58100z0.m67238l(z0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59046m0(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
        this.f168954r = C36568h.m40985a(new C59048c(liveRoomControllerStore));
        this.f168955s = C36568h.m40985a(C45787b.f123685d);
    }

    /* renamed from: m3 */
    public static final void m68966m3(C59046m0 m0Var, C0581o5 o5Var, View view, C54057e eVar) {
        m0Var.getClass();
        String f = o5Var.mo572f();
        if (f != null) {
            ((C0702z0) m0Var.getStore().getLiveRoomData().mo71262a(C0702z0.class)).mo673g3(new C13604l(f, 2));
        }
        C52891f fVar = C52891f.f147704a;
        C3206b2 b2Var = m0Var.f27261e;
        C56032b bVar = b2Var instanceof C56032b ? (C56032b) b2Var : null;
        C55908a viewScope = bVar != null ? bVar.getViewScope() : null;
        C45795b liveRoomData = m0Var.getStore().getLiveRoomData();
        C3206b2 b2Var2 = m0Var.f27261e;
        C87412m.m108592e(b2Var2, "null cannot be cast to non-null type android.view.View");
        Context context = ((View) b2Var2).getContext();
        C87412m.m108593f(context, "pluginLayout as View).context");
        fVar.mo73657g(viewScope, o5Var, view, liveRoomData, context, false);
        C66154f fVar2 = m0Var.f168953q;
        if (fVar2 != null) {
            C66846j k = ((C66145c) fVar2).mo90203k();
            k.f192019d.f191978G.mo90810d(eVar);
            k.mo90845d();
        }
    }

    /* renamed from: n3 */
    public static final boolean m68967n3(C58306h hVar, View view) {
        return ((float) hVar.f166949b.x) - hVar.f166951d >= ((float) view.getLeft()) && ((float) hVar.f166949b.x) - hVar.f166951d <= ((float) view.getRight()) && ((float) hVar.f166949b.y) - hVar.f166952e >= ((float) view.getTop()) && ((float) hVar.f166949b.y) - hVar.f166952e <= ((float) view.getBottom());
    }

    /* renamed from: F3 */
    public final void mo84259F3(String str) {
        View view;
        C62632a6 a6Var;
        View view2;
        Class cls = C0702z0.class;
        String str2 = this.f168949j;
        Log.m105924i(str2, str + " tryShow enablePostDanmaku:" + ((C0702z0) business(cls)).mo670d3() + ",customerEnableDanmaku:" + ((Boolean) ((C58052j1) ((C0702z0) business(cls)).f1688y).getValue()).booleanValue() + '!');
        if (((C0702z0) business(cls)).mo670d3() && ((Boolean) ((C58052j1) ((C0702z0) business(cls)).f1688y).getValue()).booleanValue()) {
            this.f168951o = mo9309f3(C0966R.C0970id.om7, C0966R.C0970id.om6);
            String str3 = this.f168949j;
            StringBuilder sb = new StringBuilder();
            sb.append("root origin topMargin:");
            View view3 = this.f168951o;
            C59453p pVar = null;
            ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            sb.append(marginLayoutParams != null ? Integer.valueOf(marginLayoutParams.topMargin) : null);
            Log.m105924i(str3, sb.toString());
            C3206b2 b2Var = this.f27261e;
            if (!(b2Var == null || (a6Var = (C62632a6) b2Var.getPlugin(C62632a6.class)) == null || (view2 = a6Var.f177874u) == null)) {
                int[] iArr = new int[2];
                view2.getLocationInWindow(iArr);
                int height = iArr[1] + view2.getHeight();
                if (height > 0) {
                    View view4 = this.f168951o;
                    ViewGroup.LayoutParams layoutParams2 = view4 != null ? view4.getLayoutParams() : null;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.topMargin = (mo9310g3() ? MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df) : MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3761db)) + height;
                    }
                }
                String str4 = this.f168949j;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("root final topMargin:");
                View view5 = this.f168951o;
                ViewGroup.LayoutParams layoutParams3 = view5 != null ? view5.getLayoutParams() : null;
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                sb4.append(marginLayoutParams3 != null ? Integer.valueOf(marginLayoutParams3.topMargin) : null);
                sb4.append(",anchorBottomPoxY:");
                sb4.append(height);
                Log.m105924i(str4, sb4.toString());
            }
            View view6 = this.f168951o;
            LiveDanmakuView liveDanmakuView = view6 != null ? (LiveDanmakuView) view6.findViewById(C0966R.C0970id.bys) : null;
            this.f168952p = liveDanmakuView;
            if (liveDanmakuView != null) {
                View view7 = this.f168951o;
                liveDanmakuView.setAnchorView(view7 != null ? view7.findViewById(C0966R.C0970id.f357592nk3) : null);
            }
            LiveDanmakuView liveDanmakuView2 = this.f168952p;
            if (liveDanmakuView2 != null) {
                liveDanmakuView2.setVisibility(0);
                C66155g gVar = (C66155g) ((C36570n) this.f168954r).getValue();
                String str5 = this.f168949j;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("initManager,manager:");
                sb5.append(this.f168953q);
                sb5.append(",bulletView:");
                sb5.append(liveDanmakuView2.hashCode());
                sb5.append(",manager view:");
                C66154f fVar = this.f168953q;
                sb5.append((fVar == null || (view = ((C66145c) fVar).f190121a) == null) ? null : Integer.valueOf(view.hashCode()));
                Log.m105928w(str5, sb5.toString());
                C66154f fVar2 = this.f168953q;
                if (fVar2 == null || !C87412m.m108589b(liveDanmakuView2, ((C66145c) fVar2).f190121a)) {
                    C66156i iVar = new C66156i(liveDanmakuView2, getStore().getLiveRoomData(), gVar);
                    iVar.f190128h = new C59070q0(this, iVar);
                    this.f168953q = iVar;
                }
                C66154f fVar3 = this.f168953q;
                C87412m.m108591d(fVar3);
                liveDanmakuView2.mo78677a(fVar3, (C66155g) ((C36570n) this.f168954r).getValue(), (List<? extends C51343t41>) null);
                mo84260G3(APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            }
            View view8 = this.f168951o;
            if (view8 != null) {
                pVar = new C59453p(view8, this);
            }
            this.f168950n = pVar;
            this.f27265i = new C59077s0(this);
            if (pVar != null) {
                pVar.mo84560c(0);
            }
        }
    }

    /* renamed from: G3 */
    public final synchronized void mo84260G3(String str) {
        C66154f fVar;
        Class cls = C0702z0.class;
        synchronized (this) {
            List<C0581o5> list = ((C0702z0) business(cls)).f1676j;
            C87412m.m108593f(list, "business(LiveMsgSlice::class.java).floatMsgList");
            if (!list.isEmpty()) {
                if (((C0702z0) business(cls)).mo670d3() && ((Boolean) ((C58052j1) ((C0702z0) business(cls)).f1688y).getValue()).booleanValue() && (fVar = this.f168953q) != null) {
                    List<C0581o5> list2 = ((C0702z0) business(cls)).f1676j;
                    C87412m.m108593f(list2, "business(LiveMsgSlice::class.java).floatMsgList");
                    ((C66156i) fVar).mo90217o(list2, "LiveDanmaku_step2_" + str);
                }
                ((C0702z0) business(cls)).f1676j.clear();
            }
        }
    }

    /* renamed from: o3 */
    public final void mo84261o3() {
        C66154f fVar;
        C66154f fVar2 = this.f168953q;
        if (fVar2 != null) {
            ((C66145c) fVar2).stop();
        }
        LiveDanmakuView liveDanmakuView = this.f168952p;
        if (!(liveDanmakuView == null || (fVar = liveDanmakuView.f160794e) == null)) {
            fVar.onDetach();
        }
        LiveDanmakuView liveDanmakuView2 = this.f168952p;
        if (liveDanmakuView2 != null) {
            liveDanmakuView2.setVisibility(8);
        }
        C59453p pVar = this.f168950n;
        if (pVar != null) {
            pVar.mo84560c(8);
        }
        C41573e3 e3Var = C41573e3.f111902a;
        if (e3Var.mo64659b()) {
            C61926c.m72698w((Runnable) ((C36570n) this.f168955s).getValue());
            e3Var.mo64658a();
        }
    }

    public void onLiveActivate() {
        Log.m105924i(this.f168949j, "onLiveActivate");
    }

    public void onLiveStart(C52005xq0 xq02) {
        mo84259F3("onLiveStart");
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        C11207i.m11071g(this, (C66212f) null, (C53934p0) null, new C59049d(this, (C15601d<? super C59049d>) null), 3, (Object) null);
        C11207i.m11071g(this, (C66212f) null, (C53934p0) null, new C59051e(this, (C15601d<? super C59051e>) null), 3, (Object) null);
        C11207i.m11071g(this, (C66212f) null, (C53934p0) null, new C59053f(this, (C15601d<? super C59053f>) null), 3, (Object) null);
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        mo84261o3();
    }
}
