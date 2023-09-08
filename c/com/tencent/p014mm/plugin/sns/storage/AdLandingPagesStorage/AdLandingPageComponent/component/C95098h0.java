package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONException;
import org.json.JSONObject;
import qs2.C101255a0;
import qs2.C101271i0;
import ys2.C66696h;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h0 */
public abstract class C95098h0 extends C95295z {

    /* renamed from: s */
    public int f276009s = 0;

    /* renamed from: t */
    public C66696h.C66697a f276010t;

    public C95098h0(Context context, C101255a0 a0Var, ViewGroup viewGroup) {
        super(context, a0Var, viewGroup);
        SnsMethodCalculate.markStartTimeMs("initClickReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        this.f276010t = new C66696h.C66697a();
        mo131616J(a0Var, mo131854m());
        SnsMethodCalculate.markEndTimeMs("initClickReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }

    /* renamed from: E */
    public void mo131612E() {
        SnsMethodCalculate.markStartTimeMs("addClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        this.f276009s++;
        SnsMethodCalculate.markEndTimeMs("addClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }

    /* renamed from: G */
    public void mo131613G() {
        SnsMethodCalculate.markStartTimeMs("clickReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        this.f276010t.mo90732f("13387");
        SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }

    /* renamed from: H */
    public int mo131614H() {
        SnsMethodCalculate.markStartTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        int i = this.f276009s;
        SnsMethodCalculate.markEndTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        return i;
    }

    /* renamed from: I */
    public void mo131615I(int i) {
        SnsMethodCalculate.markStartTimeMs("setClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        this.f276009s = i;
        SnsMethodCalculate.markEndTimeMs("setClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }

    /* renamed from: J */
    public void mo131616J(C101255a0 a0Var, C101271i0 i0Var) {
        String str;
        C101255a0 a0Var2 = a0Var;
        C101271i0 i0Var2 = i0Var;
        SnsMethodCalculate.markStartTimeMs("setClickReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        if (!(a0Var2 == null || i0Var2 == null)) {
            try {
                if (this.f276010t != null) {
                    String nullAsNil = Util.nullAsNil(i0Var.mo140745l());
                    int e = i0Var.mo140738e();
                    int i = i0Var.mo140742i();
                    long safeParseLong = Util.safeParseLong(i0Var.mo140737d());
                    int i2 = a0Var2.f296504j;
                    SnsMethodCalculate.markStartTimeMs("getViewId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                    String str2 = "";
                    if (Util.isNullOrNil(i0Var2.f296629n)) {
                        SnsMethodCalculate.markEndTimeMs("getViewId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                        str = str2;
                    } else {
                        str = i0Var2.f296629n;
                        SnsMethodCalculate.markEndTimeMs("getViewId", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                    }
                    String nullAsNil2 = Util.nullAsNil(str);
                    SnsMethodCalculate.markStartTimeMs("getCommInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                    if (Util.isNullOrNil(i0Var2.f296630o)) {
                        SnsMethodCalculate.markEndTimeMs("getCommInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                    } else {
                        String str3 = i0Var2.f296630o;
                        SnsMethodCalculate.markEndTimeMs("getCommInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                        str2 = str3;
                    }
                    String nullAsNil3 = Util.nullAsNil(str2);
                    String nullAsNil4 = Util.nullAsNil(a0Var2.f296495a);
                    String nullAsNil5 = Util.nullAsNil(a0Var2.f296517w);
                    String str4 = nullAsNil4;
                    this.f276010t.mo90731e(nullAsNil, i, e, safeParseLong, 21, i2, 1, nullAsNil2, nullAsNil3);
                    this.f276010t.mo90727a("halfScreenMode", (long) (i0Var.mo140747n() ? 1 : 0));
                    this.f276010t.mo90729c("cid", str4);
                    this.f276010t.mo90729c("jumpExtInfo", nullAsNil5);
                    SnsMethodCalculate.markEndTimeMs("setClickReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
                    return;
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageBtnBaseComp", "setClickReportInfo exp=" + th.toString());
            }
        }
        Log.m105920e("MicroMsg.Sns.AdLandingPageBtnBaseComp", "setClickReportInfo null");
        SnsMethodCalculate.markEndTimeMs("setClickReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        int i;
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
            return false;
        }
        try {
            jSONObject.put("clickCount", mo131614H());
            SnsMethodCalculate.markStartTimeMs("getSubType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
            C101255a0 a0Var = this.f276580e;
            if (a0Var != null) {
                i = a0Var.f296504j;
                SnsMethodCalculate.markEndTimeMs("getSubType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
            } else {
                SnsMethodCalculate.markEndTimeMs("getSubType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
                i = 0;
            }
            jSONObject.putOpt("subType", Integer.valueOf(i));
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
            return true;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Sns.AdLandingPageBtnBaseComp", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
            return false;
        }
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C101255a0 a0Var = this.f276580e;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
        }
        this.f276586n.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnBaseComp");
    }
}
