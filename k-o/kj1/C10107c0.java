package kj1;

import a14.C0000n0;
import a14.C53921m;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.LoadingSwitchBtn;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
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

/* renamed from: kj1.c0 */
public final class C10107c0 extends C10535c {

    /* renamed from: h */
    public final String f30915h = "assistant.more.commentmanage.comment";

    /* renamed from: kj1.c0$a */
    public static final class C10108a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f30916d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10108a(C10125e1 e1Var) {
            super(0);
            this.f30916d = e1Var;
        }

        public Object invoke() {
            return Boolean.valueOf(C62042e.f176370a.mo87040S0(this.f30916d.f30982b));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.AssistantCommentOption$addItem$1$2", mo125469f = "AssistantCommentOption.kt", mo125470l = {75}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.c0$b */
    public static final class C10109b extends C91594j implements C32227p<Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f30917d;

        /* renamed from: e */
        public int f30918e;

        /* renamed from: f */
        public /* synthetic */ boolean f30919f;

        /* renamed from: g */
        public final /* synthetic */ C10107c0 f30920g;

        /* renamed from: h */
        public final /* synthetic */ C10125e1 f30921h;

        /* renamed from: kj1.c0$b$a */
        public static final class C10110a extends C87413o implements C32227p<Boolean, C50415mk1, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f30922d;

            /* renamed from: e */
            public final /* synthetic */ C10125e1 f30923e;

            /* renamed from: f */
            public final /* synthetic */ SafeResume<Boolean> f30924f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10110a(boolean z, C10125e1 e1Var, SafeResume<Boolean> safeResume) {
                super(2);
                this.f30922d = z;
                this.f30923e = e1Var;
                this.f30924f = safeResume;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C50415mk1 mk12 = (C50415mk1) obj2;
                Class cls = C54116w.class;
                Class cls2 = C54108o.class;
                if (booleanValue) {
                    if (!this.f30922d) {
                        MMActivity mMActivity = this.f30923e.f30985d;
                        C76912y0.m92768g(mMActivity, mMActivity.getResources().getString(C0966R.string.f360635dx0));
                    }
                    C7335d c = C86312j.m106911c(cls2);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8606g((C8777j5) c, this.f30922d ? C54067f0.C0064m.COMMENT_OPEN : C54067f0.C0064m.COMMENT_CLOSE, ((C54108o) C86312j.m106911c(cls2)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
                    if (this.f30922d) {
                        C7335d c2 = C86312j.m106911c(cls);
                        C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                        ((C54116w) c2).Hx0(4, (String) null);
                    } else {
                        C7335d c3 = C86312j.m106911c(cls);
                        C87412m.m108593f(c3, "getService(HellLiveVisitorReoprter::class.java)");
                        ((C54116w) c3).Hx0(3, (String) null);
                    }
                }
                this.f30924f.resume(Boolean.valueOf(booleanValue));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10109b(C10107c0 c0Var, C10125e1 e1Var, C15601d<? super C10109b> dVar) {
            super(2, dVar);
            this.f30920g = c0Var;
            this.f30921h = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10109b bVar = new C10109b(this.f30920g, this.f30921h, dVar);
            bVar.f30919f = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10109b) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f30918e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.f30919f;
                C10536d.m10457e(this.f30920g, false, 1, (Object) null);
                C10125e1 e1Var = this.f30921h;
                this.f30917d = e1Var;
                this.f30919f = z;
                this.f30918e = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                e1Var.mo10537e(8, !z, true, new C10110a(z, e1Var, new SafeResume(mVar)));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C10125e1 e1Var2 = (C10125e1) this.f30917d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10107c0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30915h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return !C62042e.f176370a.mo87043T0(this.f31809a.f30982b);
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "bottomSheet");
        View view = v0Var.f18463f;
        View findViewById = view.findViewById(C0966R.C0970id.lke);
        boolean S0 = C62042e.f176370a.mo87040S0(e1Var.f30982b);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AssistantCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LoadingSwitchBtn d = e1Var.mo10536d(view, C0966R.C0970id.f359328o40, S0);
        C0000n0 h = mo10803h();
        if (h != null) {
            d.mo4816f(h, new C10108a(e1Var), new C10109b(this, e1Var, (C15601d<? super C10109b>) null));
        }
        ((C54108o) C86312j.m106911c(cls)).mo9602Jz(S0 ? C54067f0.C0066n.COMMENT_CLOSE : C54067f0.C0066n.COMMENT_OPEN, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.juo);
    }
}
