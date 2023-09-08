package mh2;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import hi2.C87514t;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: mh2.b */
public final class C88730b implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C77407n f256100d;

    /* renamed from: e */
    public final /* synthetic */ C99896a f256101e;

    public C88730b(C77407n nVar, C99896a aVar) {
        this.f256100d = nVar;
        this.f256101e = aVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        Class cls = C32735h.class;
        this.f256100d.mo107567l((View) null);
        e0Var.clear();
        if (this.f256101e.f292735w) {
            C87514t tVar = C87514t.f253524a;
            String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_pop_wordig_finder, "");
            Log.m105924i("MicroMsg.SecondCutConfig", "PopupFinderWordingConfig: " + Y60);
            if (!TextUtils.isEmpty(Y60)) {
                C87412m.m108593f(Y60, "result");
                Y60 = tVar.mo121967a(Y60);
                Log.m105924i("MicroMsg.SecondCutConfig", "PopupFinderWordingParse: " + Y60);
            }
            C87412m.m108593f(Y60, "result");
            if (TextUtils.isEmpty(Y60)) {
                Y60 = this.f256101e.f292719d.getContext().getResources().getString(C0966R.string.c3g);
            }
            e0Var.mo107142f(0, Y60);
        }
        if (this.f256101e.f292737y) {
            C87514t tVar2 = C87514t.f253524a;
            String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_pop_wording_second_cut, "");
            Log.m105924i("MicroMsg.SecondCutConfig", "PopupSecondCutWordingConfig: " + Y602);
            if (!TextUtils.isEmpty(Y602)) {
                C87412m.m108593f(Y602, "result");
                Y602 = tVar2.mo121967a(Y602);
                Log.m105924i("MicroMsg.SecondCutConfig", "PopupSecondCutWordingParse: " + Y602);
            }
            C87412m.m108593f(Y602, "result");
            if (TextUtils.isEmpty(Y602)) {
                Y602 = this.f256101e.f292719d.getContext().getResources().getString(C0966R.string.c3h);
            }
            e0Var.mo107142f(2, Y602);
        }
        if (this.f256101e.f292736x) {
            C87514t tVar3 = C87514t.f253524a;
            String Y603 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_pop_wording_wesee, "");
            Log.m105924i("MicroMsg.SecondCutConfig", "PopupWeSeeWordingConfig: " + Y603);
            if (!TextUtils.isEmpty(Y603)) {
                C87412m.m108593f(Y603, "result");
                Y603 = tVar3.mo121967a(Y603);
                Log.m105924i("MicroMsg.SecondCutConfig", "PopupWeSeeWordingParse: " + Y603);
            }
            C87412m.m108593f(Y603, "result");
            if (TextUtils.isEmpty(Y603)) {
                Y603 = this.f256101e.f292719d.getContext().getResources().getString(C0966R.string.c3i);
            }
            e0Var.mo107142f(1, Y603);
        }
    }
}
