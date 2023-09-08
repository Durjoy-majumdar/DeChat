package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import or2.C100381a;
import os2.C100417r0;
import qs2.C101255a0;
import qs2.C101271i0;
import qs2.C89839x;
import rq2.C101424j;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s */
public class C95213s extends C95108i0 {

    /* renamed from: B */
    public C89839x f276291B;

    /* renamed from: C */
    public C101271i0 f276292C = mo131854m();

    /* renamed from: D */
    public C100381a f276293D = new C100381a();

    /* renamed from: E */
    public boolean f276294E;

    public C95213s(Context context, C89839x xVar, ViewGroup viewGroup) {
        super(context, xVar, viewGroup);
        this.f276291B = xVar;
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        super.mo124360B();
        this.f276294E = AdLandingPagesProxy.getInstance().isBrandAdded(this.f276291B.f258259Z);
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
    }

    /* renamed from: G */
    public void mo131613G() {
        SnsMethodCalculate.markStartTimeMs("clickReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        this.f276010t.mo90732f("13387");
        SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
    }

    /* renamed from: P */
    public void mo130182P() {
        SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        long j = 0;
        if (!mo131713b0()) {
            C89839x xVar = this.f276291B;
            if (xVar.f258265f0 == 0) {
                C100381a aVar = this.f276293D;
                Context context = this.f276579d;
                C101271i0 i0Var = this.f276292C;
                boolean z = this.f276294E;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("showHalfScreenBrandView", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                aVar.mo139668h(context, xVar, i0Var, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS, z);
                aVar.mo139666e();
                SnsMethodCalculate.markEndTimeMs("showHalfScreenBrandView", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            } else {
                this.f276293D.mo139668h(this.f276579d, xVar, this.f276292C, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS, this.f276294E);
                this.f276293D.mo139667g(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS);
            }
            this.f276010t.mo90728b("addBrandBtnJumpType", 0);
            mo131613G();
        } else if (!TextUtils.isEmpty(this.f276291B.f258264e0)) {
            String str = this.f276291B.f258264e0;
            SnsMethodCalculate.markStartTimeMs("jumpH5", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
            try {
                int i = mo131854m().mo140742i();
                Context context2 = this.f276579d;
                if (context2 instanceof SnsAdNativeLandingPagesUI) {
                    j = C100417r0.m131425n(((Activity) context2).getIntent().getStringExtra("sns_landing_pages_share_sns_id"));
                    Log.m105924i("AdLandingPageAddBrandComp", "jumpH5, snsId=" + j + ", snsIdStr=" + C102236a0.m134765q0(j) + ", source=" + i);
                }
                C101424j.m133096b(this.f276579d, str, mo131854m(), i, j, mo131626O().f296495a, false);
            } catch (Throwable th) {
                Log.m105920e("AdLandingPageAddBrandComp", "jumpH5 exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("jumpH5", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
            this.f276010t.mo90728b("addBrandBtnJumpType", 1);
            mo131613G();
        } else {
            Log.m105920e("AdLandingPageAddBrandComp", "canNotJumpAddBrand and jumpUrl is empty");
        }
        SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
    }

    /* renamed from: b0 */
    public final boolean mo131713b0() {
        SnsMethodCalculate.markStartTimeMs("canNotJumpAddBrand", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        int i = this.f276292C.mo140742i();
        int e = this.f276292C.mo140738e();
        Log.m105924i("AdLandingPageAddBrandComp", "canNotJumpAddBrand, source=" + i + ", originSource=" + e);
        boolean z = SnsAdNativeLandingPagesUI.m121814z8(i) || SnsAdNativeLandingPagesUI.m121814z8(e) || i == 27 || e == 27 || i == 7 || e == 7;
        SnsMethodCalculate.markEndTimeMs("canNotJumpAddBrand", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        return z;
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        super.mo67238e();
        SnsMethodCalculate.markStartTimeMs("setBtnView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        if (this.f276291B == null) {
            SnsMethodCalculate.markEndTimeMs("setBtnView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        } else {
            try {
                boolean b0 = mo131713b0();
                Log.m105924i("AdLandingPageAddBrandComp", "setBtnView, canNotAddBrand=" + b0 + ", compatibleJumpUrl=" + this.f276291B.f258264e0);
                if (b0 && TextUtils.isEmpty(this.f276291B.f258264e0)) {
                    int safeParseDouble = (int) (Util.safeParseDouble("0.6") * 255.0d);
                    if (!Util.isNullOrNil(this.f276291B.f296695G)) {
                        mo131626O().f296695G = String.format("#%02x%s", new Object[]{Integer.valueOf(safeParseDouble), this.f276291B.f296695G.substring(1)});
                    }
                    if (!Util.isNullOrNil(this.f276291B.f296691C)) {
                        mo131626O().f296691C = String.format("#%02x%s", new Object[]{Integer.valueOf(safeParseDouble), this.f276291B.f296691C.substring(1)});
                    }
                    if (!Util.isNullOrNil(this.f276291B.f296696H)) {
                        mo131626O().f296696H = String.format("#%02x%s", new Object[]{Integer.valueOf(safeParseDouble), this.f276291B.f296696H.substring(1)});
                    }
                    Button button = this.f276027v;
                    if (button != null) {
                        button.setEnabled(false);
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("AdLandingPageAddBrandComp", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("setBtnView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        }
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
    }

    /* renamed from: z */
    public void mo130213z(C101255a0 a0Var) {
        SnsMethodCalculate.markStartTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
        super.mo130213z(this.f276291B);
        SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAddBrandComp");
    }
}
