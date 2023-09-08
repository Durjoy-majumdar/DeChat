package kj1;

import a14.C0000n0;
import a14.C53921m;
import ak1.C54108o;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.LoadingSwitchBtn;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import ht1.C8782l3;
import ht1.C8794p5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import lj1.C10535c;
import lj1.C10536d;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C48841bd1;
import te3.C50542nh0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.x */
public final class C10259x extends C10535c {

    /* renamed from: h */
    public final String f31295h;

    /* renamed from: kj1.x$a */
    public static final class C10260a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C10260a f31296d = new C10260a();

        public C10260a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_RECOMMEND_SWITCH_SETTING_BOOLEAN_SYNC, false));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.AnchorRecommendOption$addItem$1$2", mo125469f = "AnchorRecommendOption.kt", mo125470l = {84}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.x$b */
    public static final class C10261b extends C91594j implements C32227p<Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f31297d;

        /* renamed from: e */
        public int f31298e;

        /* renamed from: f */
        public /* synthetic */ boolean f31299f;

        /* renamed from: g */
        public final /* synthetic */ C10259x f31300g;

        /* renamed from: h */
        public final /* synthetic */ C10125e1 f31301h;

        /* renamed from: kj1.x$b$a */
        public static final class C10262a implements C8794p5<C48841bd1> {

            /* renamed from: d */
            public final /* synthetic */ C10125e1 f31302d;

            /* renamed from: e */
            public final /* synthetic */ SafeResume<Boolean> f31303e;

            public C10262a(C10125e1 e1Var, SafeResume<Boolean> safeResume) {
                this.f31302d = e1Var;
                this.f31303e = safeResume;
            }

            /* renamed from: c5 */
            public void mo705c5(Object obj, C50542nh0 nh02) {
                C87412m.m108594g((C48841bd1) obj, "req");
                C87412m.m108594g(nh02, "ret");
                String str = this.f31302d.f30980a;
                Log.m105924i(str, "modifyLiveUserRecommendSetting ret:" + nh02.f138603e + ", " + nh02.f138604f + ", " + nh02.f138602d);
                if (nh02.f138603e == 0) {
                    this.f31303e.resume(Boolean.TRUE);
                } else {
                    this.f31303e.resume(Boolean.FALSE);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10261b(C10259x xVar, C10125e1 e1Var, C15601d<? super C10261b> dVar) {
            super(2, dVar);
            this.f31300g = xVar;
            this.f31301h = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10261b bVar = new C10261b(this.f31300g, this.f31301h, dVar);
            bVar.f31299f = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10261b) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31298e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z2 = this.f31299f;
                C10536d.m10457e(this.f31300g, false, 1, (Object) null);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "2");
                jSONObject.put("switch_result", z2 ? "1" : "0");
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8600a((C8777j5) c, 33, jSONObject.toString(), (String) null, 4, (Object) null);
                String str = this.f31301h.f30980a;
                Log.m105924i(str, "modifyLiveUserRecommendSetting isCheck:" + z2);
                int i2 = z2 ? 1 : 2;
                C10125e1 e1Var = this.f31301h;
                this.f31297d = e1Var;
                this.f31299f = z2;
                this.f31298e = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                ((C8782l3) C86312j.m106911c(C8782l3.class)).At0(i2, new C10262a(e1Var, new SafeResume(mVar)));
                Object o = mVar.mo74608o();
                if (o == aVar) {
                    return aVar;
                }
                z = z2;
                obj = o;
            } else if (i == 1) {
                z = this.f31299f;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_RECOMMEND_SWITCH_SETTING_BOOLEAN_SYNC, Boolean.valueOf(z));
            }
            return Boolean.valueOf(booleanValue);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10259x(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31295h = mo10805j() ? "anchorlive.more.morefunction.recommend" : "startlive.more.recommend";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31295h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return !mo10805j();
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        C10125e1 e1Var2 = e1Var;
        C4191v0 v0Var2 = v0Var;
        C87412m.m108594g(e1Var2, "<this>");
        C87412m.m108594g(v0Var2, "bottomSheet");
        View view = v0Var2.f18463f;
        if (mo10805j()) {
            View findViewById = view.findViewById(C0966R.C0970id.cik);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = view.findViewById(C0966R.C0970id.m9h);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = findViewById2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View findViewById3 = view.findViewById(C0966R.C0970id.cik);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view4 = findViewById3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById4 = view.findViewById(C0966R.C0970id.m9h);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view5 = findViewById4;
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRecommendOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "1");
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c, 32, jSONObject.toString(), (String) null, 4, (Object) null);
            LoadingSwitchBtn d = e1Var2.mo10536d(view, C0966R.C0970id.o46, C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_RECOMMEND_SWITCH_SETTING_BOOLEAN_SYNC, false));
            C0000n0 h = mo10803h();
            if (h != null) {
                d.mo4816f(h, C10260a.f31296d, new C10261b(this, e1Var2, (C15601d<? super C10261b>) null));
                return;
            }
        }
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.oo5);
    }
}
