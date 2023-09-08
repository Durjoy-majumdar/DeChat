package kj1;

import a14.C0000n0;
import a14.C53921m;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.view.View;
import com.tencent.p014mm.C0966R;
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
import ok1.C62042e;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C50415mk1;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.d */
public final class C10113d extends C10535c {

    /* renamed from: h */
    public final String f30927h;

    /* renamed from: kj1.d$a */
    public static final class C10114a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10125e1 f30928d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10114a(C10125e1 e1Var) {
            super(0);
            this.f30928d = e1Var;
        }

        public Object invoke() {
            return Boolean.valueOf(C62042e.f176370a.mo87040S0(this.f30928d.f30982b));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.AnchorCommentOption$addItem$1$2", mo125469f = "AnchorCommentOption.kt", mo125470l = {98}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.d$b */
    public static final class C10115b extends C91594j implements C32227p<Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f30929d;

        /* renamed from: e */
        public Object f30930e;

        /* renamed from: f */
        public int f30931f;

        /* renamed from: g */
        public /* synthetic */ boolean f30932g;

        /* renamed from: h */
        public final /* synthetic */ C10113d f30933h;

        /* renamed from: i */
        public final /* synthetic */ C10125e1 f30934i;

        /* renamed from: kj1.d$b$a */
        public static final class C10116a extends C87413o implements C32227p<Boolean, C50415mk1, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f30935d;

            /* renamed from: e */
            public final /* synthetic */ C10113d f30936e;

            /* renamed from: f */
            public final /* synthetic */ C10125e1 f30937f;

            /* renamed from: g */
            public final /* synthetic */ SafeResume<Boolean> f30938g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10116a(boolean z, C10113d dVar, C10125e1 e1Var, SafeResume<Boolean> safeResume) {
                super(2);
                this.f30935d = z;
                this.f30936e = dVar;
                this.f30937f = e1Var;
                this.f30938g = safeResume;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C50415mk1 mk12 = (C50415mk1) obj2;
                C0073g0 g0Var = C0073g0.LIVE_ANCHOR_ACTION_COMMENT;
                Class cls = C54108o.class;
                if (booleanValue) {
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8606g((C8777j5) c, this.f30935d ? C54067f0.C0064m.COMMENT_OPEN : C54067f0.C0064m.COMMENT_CLOSE, ((C54108o) C86312j.m106911c(cls)).Ex0(this.f30936e.mo10805j() ? C54067f0.C0062l.LIVING : C54067f0.C0062l.BEFORE), (String) null, 4, (Object) null);
                    if (this.f30937f.f30984c == 1) {
                        if (this.f30935d) {
                            ((C54108o) C86312j.m106911c(cls)).getClass();
                            String str = "sub_type";
                            C54108o.f151869h.f151443Y.f151841r++;
                            if (this.f30936e.mo10805j()) {
                                C7335d c2 = C86312j.m106911c(cls);
                                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                                C8777j5.C8778a.m8605f((C8777j5) c2, g0Var, String.valueOf(2), (String) null, 4, (Object) null);
                            } else {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("element", 5);
                                jSONObject.put("type", 0);
                                jSONObject.put("sub_element", 1);
                                jSONObject.put(str, 1);
                                C7335d c3 = C86312j.m106911c(cls);
                                C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                                C8777j5.C8778a.m8600a((C8777j5) c3, 37, jSONObject.toString(), (String) null, 4, (Object) null);
                            }
                        } else {
                            String str2 = "sub_type";
                            ((C54108o) C86312j.m106911c(cls)).getClass();
                            C54108o.f151869h.f151443Y.f151840q++;
                            if (this.f30936e.mo10805j()) {
                                C7335d c4 = C86312j.m106911c(cls);
                                C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
                                C8777j5.C8778a.m8605f((C8777j5) c4, g0Var, String.valueOf(1), (String) null, 4, (Object) null);
                            } else {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("element", 5);
                                jSONObject2.put("type", 0);
                                jSONObject2.put("sub_element", 1);
                                jSONObject2.put(str2, 2);
                                C7335d c5 = C86312j.m106911c(cls);
                                C87412m.m108593f(c5, "getService(HellLiveReport::class.java)");
                                C8777j5.C8778a.m8600a((C8777j5) c5, 37, jSONObject2.toString(), (String) null, 4, (Object) null);
                            }
                        }
                    }
                }
                this.f30938g.resume(Boolean.valueOf(booleanValue));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10115b(C10113d dVar, C10125e1 e1Var, C15601d<? super C10115b> dVar2) {
            super(2, dVar2);
            this.f30933h = dVar;
            this.f30934i = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10115b bVar = new C10115b(this.f30933h, this.f30934i, dVar);
            bVar.f30932g = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10115b) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f30931f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.f30932g;
                C10536d.m10457e(this.f30933h, false, 1, (Object) null);
                C10125e1 e1Var = this.f30934i;
                C10113d dVar = this.f30933h;
                this.f30929d = e1Var;
                this.f30930e = dVar;
                this.f30932g = z;
                this.f30931f = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                e1Var.mo10537e(8, !z, dVar.mo10805j(), new C10116a(z, dVar, e1Var, new SafeResume(mVar)));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C10113d dVar2 = (C10113d) this.f30930e;
                C10125e1 e1Var2 = (C10125e1) this.f30929d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10113d(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f30927h = mo10805j() ? "anchorlive.more.commentmanage.comment" : "startlive.more.commentmanage.comment";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30927h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return !mo10805j() || !C62042e.f176370a.mo87043T0(this.f31809a.f30982b);
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
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LoadingSwitchBtn d = e1Var.mo10536d(view, C0966R.C0970id.f359328o40, S0);
        C0000n0 h = mo10803h();
        if (h != null) {
            d.mo4816f(h, new C10114a(e1Var), new C10115b(this, e1Var, (C15601d<? super C10115b>) null));
        }
        ((C54108o) C86312j.m106911c(cls)).mo9602Jz(S0 ? C54067f0.C0066n.COMMENT_CLOSE : C54067f0.C0066n.COMMENT_OPEN, ((C54108o) C86312j.m106911c(cls)).Ex0(mo10805j() ? C54067f0.C0062l.LIVING : C54067f0.C0062l.BEFORE));
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.juo);
    }
}
