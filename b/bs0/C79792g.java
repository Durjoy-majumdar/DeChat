package bs0;

import a14.C0000n0;
import android.view.View;
import android.view.ViewGroup;
import as0.C39633a;
import as0.C39635c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage.AppBrandAuthorizeScopeModifyObserver;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage.AppBrandPrivacyManagePage;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8479f0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import qo3.C89779i0;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage$initContentArea$5", mo125469f = "AppBrandPrivacyManagePage.kt", mo125470l = {205}, mo125471m = "invokeSuspend")
/* renamed from: bs0.g */
public final class C79792g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f233833d;

    /* renamed from: e */
    public Object f233834e;

    /* renamed from: f */
    public Object f233835f;

    /* renamed from: g */
    public Object f233836g;

    /* renamed from: h */
    public Object f233837h;

    /* renamed from: i */
    public Object f233838i;

    /* renamed from: j */
    public int f233839j;

    /* renamed from: n */
    public final /* synthetic */ C89779i0 f233840n;

    /* renamed from: o */
    public final /* synthetic */ ViewGroup f233841o;

    /* renamed from: p */
    public final /* synthetic */ C39633a f233842p;

    /* renamed from: q */
    public final /* synthetic */ C8479f0<Integer> f233843q;

    /* renamed from: r */
    public final /* synthetic */ C79798p f233844r;

    /* renamed from: s */
    public final /* synthetic */ AppBrandPrivacyManagePage f233845s;

    /* renamed from: t */
    public final /* synthetic */ LoadMoreRecyclerView f233846t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79792g(C89779i0 i0Var, ViewGroup viewGroup, C39633a aVar, C8479f0<Integer> f0Var, C79798p pVar, AppBrandPrivacyManagePage appBrandPrivacyManagePage, LoadMoreRecyclerView loadMoreRecyclerView, C15601d<? super C79792g> dVar) {
        super(2, dVar);
        this.f233840n = i0Var;
        this.f233841o = viewGroup;
        this.f233842p = aVar;
        this.f233843q = f0Var;
        this.f233844r = pVar;
        this.f233845s = appBrandPrivacyManagePage;
        this.f233846t = loadMoreRecyclerView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C79792g(this.f233840n, this.f233841o, this.f233842p, this.f233843q, this.f233844r, this.f233845s, this.f233846t, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C79792g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ViewGroup viewGroup;
        C39633a aVar;
        C8479f0<Integer> f0Var;
        C79798p pVar;
        AppBrandPrivacyManagePage appBrandPrivacyManagePage;
        LoadMoreRecyclerView loadMoreRecyclerView;
        C79800r rVar;
        C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f233839j;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            viewGroup = this.f233841o;
            aVar = this.f233842p;
            f0Var = this.f233843q;
            pVar = this.f233844r;
            appBrandPrivacyManagePage = this.f233845s;
            LoadMoreRecyclerView loadMoreRecyclerView2 = this.f233846t;
            C79801s sVar = C79801s.f233867a;
            this.f233833d = viewGroup;
            this.f233834e = aVar;
            this.f233835f = f0Var;
            this.f233836g = pVar;
            this.f233837h = appBrandPrivacyManagePage;
            this.f233838i = loadMoreRecyclerView2;
            this.f233839j = 1;
            obj2 = sVar.mo109934a(Integer.MAX_VALUE, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
            loadMoreRecyclerView = loadMoreRecyclerView2;
        } else if (i == 1) {
            loadMoreRecyclerView = (LoadMoreRecyclerView) this.f233838i;
            appBrandPrivacyManagePage = (AppBrandPrivacyManagePage) this.f233837h;
            pVar = (C79798p) this.f233836g;
            f0Var = (C8479f0) this.f233835f;
            aVar = (C39633a) this.f233834e;
            viewGroup = (ViewGroup) this.f233833d;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C79807t tVar = (C79807t) obj2;
        AppBrandPrivacyManagePage.C84576a aVar3 = AppBrandPrivacyManagePage.f246784e;
        if (tVar == null) {
            Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", "onFirstTimesFetched, userAuthScopeList is null");
            Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", "showEmptyView");
            appBrandPrivacyManagePage.getLayoutInflater().inflate(C0966R.C0971layout.cjq, viewGroup);
        } else {
            View findViewById = viewGroup.findViewById(C0966R.C0970id.c8m);
            if (findViewById != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage", "initContentArea$onFirstTimesFetched", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/UserAuthorizeScopeListAdapter;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage;Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/WxaAppUserAuthorizeScopeListWithAttrs;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage", "initContentArea$onFirstTimesFetched", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyFooterController;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/UserAuthorizeScopeListAdapter;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage;Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/WxaAppUserAuthorizeScopeListWithAttrs;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            aVar.mo62189a(1 == tVar.f233877a);
            T t = null;
            if ((1 == tVar.f233877a) && (rVar = (C79800r) C110818d0.m150925W(tVar.f233878b)) != null) {
                t = Integer.valueOf(rVar.f233866c);
            }
            f0Var.f27484d = t;
            pVar.mo109933F4(appBrandPrivacyManagePage.mo117262L(tVar));
            loadMoreRecyclerView.post(new C79793h(loadMoreRecyclerView));
            MMActivity a = C39635c.m42237a(appBrandPrivacyManagePage);
            if (a != null) {
                new AppBrandAuthorizeScopeModifyObserver(a, new C79794i(pVar, appBrandPrivacyManagePage, tVar));
            }
        }
        this.f233840n.dismiss();
        return C13598b0.f38549a;
    }
}
