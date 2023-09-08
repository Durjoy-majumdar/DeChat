package bs0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import androidx.lifecycle.C54218t;
import androidx.recyclerview.widget.RecyclerView;
import as0.C39633a;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage.AppBrandPrivacyManagePage;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8479f0;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: bs0.e */
public final class C79789e implements LoadMoreRecyclerView.C40579c {

    /* renamed from: a */
    public final /* synthetic */ C39633a f233819a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandPrivacyManagePage f233820b;

    /* renamed from: c */
    public final /* synthetic */ C8479f0<Integer> f233821c;

    /* renamed from: d */
    public final /* synthetic */ C79798p f233822d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage$initContentArea$3$1", mo125469f = "AppBrandPrivacyManagePage.kt", mo125470l = {195}, mo125471m = "invokeSuspend")
    /* renamed from: bs0.e$a */
    public static final class C79790a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f233823d;

        /* renamed from: e */
        public Object f233824e;

        /* renamed from: f */
        public Object f233825f;

        /* renamed from: g */
        public Object f233826g;

        /* renamed from: h */
        public int f233827h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<Integer> f233828i;

        /* renamed from: j */
        public final /* synthetic */ C39633a f233829j;

        /* renamed from: n */
        public final /* synthetic */ C79798p f233830n;

        /* renamed from: o */
        public final /* synthetic */ AppBrandPrivacyManagePage f233831o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79790a(C8479f0<Integer> f0Var, C39633a aVar, C79798p pVar, AppBrandPrivacyManagePage appBrandPrivacyManagePage, C15601d<? super C79790a> dVar) {
            super(2, dVar);
            this.f233828i = f0Var;
            this.f233829j = aVar;
            this.f233830n = pVar;
            this.f233831o = appBrandPrivacyManagePage;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C79790a(this.f233828i, this.f233829j, this.f233830n, this.f233831o, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C79790a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C39633a aVar;
            C8479f0<Integer> f0Var;
            C79798p pVar;
            AppBrandPrivacyManagePage appBrandPrivacyManagePage;
            C79800r rVar;
            C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
            int i = this.f233827h;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                f0Var = this.f233828i;
                Integer num = (Integer) f0Var.f27484d;
                if (num == null) {
                    Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", "onLoadMore, fetchToken is null, not need");
                    return C13598b0.f38549a;
                }
                aVar = this.f233829j;
                pVar = this.f233830n;
                AppBrandPrivacyManagePage appBrandPrivacyManagePage2 = this.f233831o;
                C79801s sVar = C79801s.f233867a;
                int intValue = num.intValue();
                this.f233823d = aVar;
                this.f233824e = f0Var;
                this.f233825f = pVar;
                this.f233826g = appBrandPrivacyManagePage2;
                this.f233827h = 1;
                obj = sVar.mo109934a(intValue, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                appBrandPrivacyManagePage = appBrandPrivacyManagePage2;
            } else if (i == 1) {
                appBrandPrivacyManagePage = (AppBrandPrivacyManagePage) this.f233826g;
                pVar = (C79798p) this.f233825f;
                f0Var = (C8479f0) this.f233824e;
                aVar = (C39633a) this.f233823d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C79807t tVar = (C79807t) obj;
            AppBrandPrivacyManagePage.C84576a aVar3 = AppBrandPrivacyManagePage.f246784e;
            T t = null;
            if (tVar == null) {
                Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", "onSecondTimesFetched, fetchResp is empty");
                aVar.mo62189a(false);
                f0Var.f27484d = null;
            } else {
                aVar.mo62189a(1 == tVar.f233877a);
                if (1 != tVar.f233877a) {
                    z = false;
                }
                if (z && (rVar = (C79800r) C110818d0.m150925W(tVar.f233878b)) != null) {
                    t = Integer.valueOf(rVar.f233866c);
                }
                f0Var.f27484d = t;
                pVar.mo109933F4(appBrandPrivacyManagePage.mo117262L(tVar));
            }
            return C13598b0.f38549a;
        }
    }

    public C79789e(C39633a aVar, AppBrandPrivacyManagePage appBrandPrivacyManagePage, C8479f0<Integer> f0Var, C79798p pVar) {
        this.f233819a = aVar;
        this.f233820b = appBrandPrivacyManagePage;
        this.f233821c = f0Var;
        this.f233822d = pVar;
    }

    /* renamed from: a */
    public final void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
        if (!this.f233819a.f106395e) {
            Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", "onLoadMore, loading is not shown");
        } else {
            C53895h.m60466d(C54218t.m60906a(this.f233820b), (C66212f) null, (C53934p0) null, new C79790a(this.f233821c, this.f233819a, this.f233822d, this.f233820b, (C15601d<? super C79790a>) null), 3, (Object) null);
        }
    }
}
