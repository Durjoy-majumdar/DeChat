package us2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import qo3.C101218e0;
import qs2.C101271i0;
import rx3.C13598b0;
import vr2.C102260r;

/* renamed from: us2.l */
public final class C102082l implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C32224a<C13598b0> f300603a;

    /* renamed from: b */
    public final /* synthetic */ String f300604b;

    /* renamed from: c */
    public final /* synthetic */ String f300605c;

    /* renamed from: d */
    public final /* synthetic */ Context f300606d;

    /* renamed from: e */
    public final /* synthetic */ boolean f300607e;

    /* renamed from: f */
    public final /* synthetic */ C32228q<String, String, Map<String, ? extends Object>, C13598b0> f300608f;

    /* renamed from: g */
    public final /* synthetic */ C101218e0 f300609g;

    public C102082l(C32224a<C13598b0> aVar, String str, String str2, Context context, boolean z, C32228q<? super String, ? super String, ? super Map<String, ? extends Object>, C13598b0> qVar, C101218e0 e0Var) {
        this.f300603a = aVar;
        this.f300604b = str;
        this.f300605c = str2;
        this.f300606d = context;
        this.f300607e = z;
        this.f300608f = qVar;
        this.f300609g = e0Var;
    }

    /* renamed from: a */
    public final void mo2001a() {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$rightClickFunc$1");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("sns_ad_landing_page_key");
        if (mmkv == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$rightClickFunc$1");
            return;
        }
        mmkv.putBoolean("canRequestLBS", true);
        C102078g gVar = C102078g.f300591a;
        SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        Log.m105924i("RequestGeoLocationHelper", "showLBSAuthDialog and confirm!");
        C32224a<C13598b0> aVar = this.f300603a;
        if (aVar != null) {
            aVar.invoke();
        }
        gVar.mo141573d(this.f300604b, this.f300605c, this.f300606d, this.f300607e, this.f300608f);
        this.f300609g.mo140680z();
        JSONObject jSONObject = new JSONObject();
        C101271i0 b = gVar.mo141572b(this.f300606d);
        String str = null;
        String h = b != null ? b.mo140741h() : null;
        String str2 = "";
        if (h == null) {
            h = str2;
        }
        jSONObject.put("snsid", h);
        if (b != null) {
            str = b.mo140745l();
        }
        if (str != null) {
            str2 = str;
        }
        jSONObject.put("uxinfo", str2);
        jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, b != null ? b.mo140742i() : 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", "ad");
        jSONObject2.put("status", "ok");
        jSONObject.put("extInfo", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        C87412m.m108593f(jSONObject3, "obj.toString()");
        C102260r.m134858a("location_ad_auth_report", jSONObject3);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$rightClickFunc$1");
    }
}
