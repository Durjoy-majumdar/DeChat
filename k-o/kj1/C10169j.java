package kj1;

import a14.C0000n0;
import a14.C53921m;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.LoadingSwitchBtn;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import lj1.C10535c;
import lj1.C10536d;
import nj3.C76912y0;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C50415mk1;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.j */
public final class C10169j extends C10535c {

    /* renamed from: h */
    public final String f31117h;

    /* renamed from: kj1.j$a */
    public static final class C10170a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f31118d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10170a(C10125e1 e1Var) {
            super(0);
            this.f31118d = e1Var;
        }

        public Object invoke() {
            return Boolean.valueOf(C62042e.f176370a.mo87078f1(this.f31118d.f30982b));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.AnchorLikeOption$addItem$1$2", mo125469f = "AnchorLikeOption.kt", mo125470l = {90}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.j$b */
    public static final class C10171b extends C91594j implements C32227p<Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f31119d;

        /* renamed from: e */
        public Object f31120e;

        /* renamed from: f */
        public int f31121f;

        /* renamed from: g */
        public /* synthetic */ boolean f31122g;

        /* renamed from: h */
        public final /* synthetic */ C10169j f31123h;

        /* renamed from: i */
        public final /* synthetic */ C10125e1 f31124i;

        /* renamed from: kj1.j$b$a */
        public static final class C10172a extends C87413o implements C32227p<Boolean, C50415mk1, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f31125d;

            /* renamed from: e */
            public final /* synthetic */ C10125e1 f31126e;

            /* renamed from: f */
            public final /* synthetic */ C10169j f31127f;

            /* renamed from: g */
            public final /* synthetic */ SafeResume<Boolean> f31128g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10172a(boolean z, C10125e1 e1Var, C10169j jVar, SafeResume<Boolean> safeResume) {
                super(2);
                this.f31125d = z;
                this.f31126e = e1Var;
                this.f31127f = jVar;
                this.f31128g = safeResume;
            }

            public Object invoke(Object obj, Object obj2) {
                Resources resources;
                int i;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C50415mk1 mk12 = (C50415mk1) obj2;
                Class cls = C54108o.class;
                if (booleanValue) {
                    C87412m.m108593f(this.f31125d ? this.f31126e.f30985d.getResources().getString(C0966R.string.dwu) : this.f31126e.f30985d.getResources().getString(C0966R.string.f360637dx2), "if (check) {\n           …                        }");
                    if (this.f31127f.mo10805j()) {
                        Bundle bundle = new Bundle();
                        boolean z = this.f31125d;
                        C10125e1 e1Var = this.f31126e;
                        bundle.putBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", z);
                        e1Var.mo10539g(C58124b.C58125b.FINDER_LIVE_LIKE_SWITCH, bundle);
                    }
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8606g((C8777j5) c, this.f31125d ? C54067f0.C0064m.LIKE_OPEN : C54067f0.C0064m.LIKE_CLOSE, ((C54108o) C86312j.m106911c(cls)).Ex0(this.f31127f.mo10805j() ? C54067f0.C0062l.LIVING : C54067f0.C0062l.BEFORE), (String) null, 4, (Object) null);
                    if (this.f31126e.f30984c == 1) {
                        C7335d c2 = C86312j.m106911c(cls);
                        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8605f((C8777j5) c2, C0073g0.LIVE_ANCHOR_ACTION_LIKE, this.f31125d ? String.valueOf(1) : String.valueOf(2), (String) null, 4, (Object) null);
                    }
                } else {
                    if (this.f31125d) {
                        resources = this.f31126e.f30985d.getResources();
                        i = C0966R.string.dwt;
                    } else {
                        resources = this.f31126e.f30985d.getResources();
                        i = C0966R.string.f360636dx1;
                    }
                    String string = resources.getString(i);
                    C87412m.m108593f(string, "if (check) context.resou…ive_more_action_ban_like)");
                    MMActivity mMActivity = this.f31126e.f30985d;
                    C76912y0.m92763b(mMActivity, string + MMApplicationContext.getContext().getResources().getString(C0966R.string.f360496d80));
                }
                this.f31128g.resume(Boolean.valueOf(booleanValue));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10171b(C10169j jVar, C10125e1 e1Var, C15601d<? super C10171b> dVar) {
            super(2, dVar);
            this.f31123h = jVar;
            this.f31124i = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10171b bVar = new C10171b(this.f31123h, this.f31124i, dVar);
            bVar.f31122g = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10171b) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31121f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.f31122g;
                C10536d.m10457e(this.f31123h, false, 1, (Object) null);
                C10125e1 e1Var = this.f31124i;
                C10169j jVar = this.f31123h;
                this.f31119d = e1Var;
                this.f31120e = jVar;
                this.f31122g = z;
                this.f31121f = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                e1Var.mo10537e(512, !z, jVar.mo10805j(), new C10172a(z, e1Var, jVar, new SafeResume(mVar)));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C10169j jVar2 = (C10169j) this.f31120e;
                C10125e1 e1Var2 = (C10125e1) this.f31119d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10169j(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31117h = mo10805j() ? "anchorlive.more.morefunction.like" : "startlive.more.morefunction.like";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31117h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r1 = r1.mo10555b();
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10519k() {
        /*
            r3 = this;
            boolean r0 = r3.mo10805j()
            if (r0 == 0) goto L_0x0013
            kj1.e1 r0 = r3.f31809a
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo10534b(r1)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154392z
            goto L_0x0030
        L_0x0013:
            ok1.e r0 = ok1.C62042e.f176370a
            kj1.e1 r1 = r3.f31809a
            kj1.e1$d r1 = r1.f30989h
            if (r1 == 0) goto L_0x0024
            fe1.q r1 = r1.mo10555b()
            if (r1 == 0) goto L_0x0024
            long r1 = r1.field_liveSwitchFlag
            goto L_0x0026
        L_0x0024:
            r1 = 0
        L_0x0026:
            r0.getClass()
            int r0 = (int) r1
            r1 = 256(0x100, float:3.59E-43)
            boolean r0 = o40.C61926c.m72696u(r0, r1)
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10169j.mo10519k():boolean");
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "bottomSheet");
        View view = v0Var.f18463f;
        boolean f1 = C62042e.f176370a.mo87078f1(e1Var.f30982b);
        View findViewById = view.findViewById(C0966R.C0970id.ck_);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorLikeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorLikeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = view.findViewById(C0966R.C0970id.lkj);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorLikeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorLikeOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LoadingSwitchBtn d = e1Var.mo10536d(view, C0966R.C0970id.f359329o41, f1);
        C0000n0 h = mo10803h();
        if (h != null) {
            d.mo4816f(h, new C10170a(e1Var), new C10171b(this, e1Var, (C15601d<? super C10171b>) null));
        }
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.k_v);
    }
}
