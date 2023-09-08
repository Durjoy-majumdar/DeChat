package us2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32228q;
import java.util.HashMap;
import java.util.Map;
import qo3.C101218e0;
import rx3.C13598b0;

/* renamed from: us2.k */
public final class C14385k implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C32228q<String, String, Map<String, ? extends Object>, C13598b0> f39957a;

    /* renamed from: b */
    public final /* synthetic */ String f39958b;

    /* renamed from: c */
    public final /* synthetic */ C101218e0 f39959c;

    public C14385k(C32228q<? super String, ? super String, ? super Map<String, ? extends Object>, C13598b0> qVar, String str, C101218e0 e0Var) {
        this.f39957a = qVar;
        this.f39958b = str;
        this.f39959c = e0Var;
    }

    /* renamed from: a */
    public final void mo2001a() {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$leftClickFunc$1");
        HashMap hashMap = new HashMap();
        hashMap.put("ret", 4);
        hashMap.put("err_msg", "get_location:user_cancel");
        C32228q<String, String, Map<String, ? extends Object>, C13598b0> qVar = this.f39957a;
        if (qVar != null) {
            qVar.invoke(this.f39958b, "GEO", hashMap);
        }
        this.f39959c.mo140680z();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$leftClickFunc$1");
    }
}
