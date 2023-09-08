package com.tencent.p014mm.plugin.appbrand.floatball;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82229d0;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.ball.model.BallReportInfo;
import com.tencent.p014mm.plugin.ball.service.FloatBallHelper;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.floatball.i */
public class C81855i {

    /* renamed from: a */
    public final AppBrandRuntimeWC f240134a;

    /* renamed from: b */
    public C81849e f240135b;

    /* renamed from: c */
    public C81858k f240136c;

    /* renamed from: d */
    public C81862l f240137d;

    /* renamed from: e */
    public C81869m f240138e;

    /* renamed from: f */
    public C81840a f240139f;

    public C81855i(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f240134a = appBrandRuntimeWC;
    }

    /* renamed from: c */
    public static void m100487c(FloatBallHelper floatBallHelper, AppBrandInitConfig appBrandInitConfig) {
        if (appBrandInitConfig instanceof AppBrandInitConfigWC) {
            AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) appBrandInitConfig;
            int i = 0;
            Log.m105925i("MicroMsg.AppBrandFloatBallLogic", "setReportInfo, floatBallHelper:%s, configAppName:%s", floatBallHelper, appBrandInitConfigWC.f239363e);
            floatBallHelper.getReportInfo().f311718g = appBrandInitConfigWC.f239362d;
            floatBallHelper.getReportInfo().f311720i = appBrandInitConfigWC.f239363e;
            floatBallHelper.getReportInfo().f311719h = String.valueOf(appBrandInitConfigWC.f234841u);
            BallReportInfo reportInfo = floatBallHelper.getReportInfo();
            AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f234834c1;
            if (appBrandStatObject != null) {
                i = appBrandStatObject.f245533f;
            }
            reportInfo.f311716e = i;
        }
    }

    /* renamed from: a */
    public boolean mo114250a(int i) {
        C81849e eVar = this.f240135b;
        if (eVar != null) {
            eVar.mo149068c0();
        }
        C81849e eVar2 = this.f240135b;
        if (eVar2 != null && eVar2.mo64004y0(i)) {
            return true;
        }
        C81858k kVar = this.f240136c;
        if (kVar != null && kVar.mo64004y0(i)) {
            return true;
        }
        C81862l lVar = this.f240137d;
        if (lVar != null) {
            lVar.mo64004y0(i);
        }
        C81840a aVar = this.f240139f;
        if (aVar != null && aVar.mo64004y0(i)) {
            return true;
        }
        C81869m mVar = this.f240138e;
        if (mVar != null) {
            mVar.mo64004y0(i);
        }
        C81845c e = C82229d0.m100955e(this.f240134a);
        return e != null && e.mo64004y0(i);
    }

    /* renamed from: b */
    public void mo114251b(AppBrandRuntimeWC appBrandRuntimeWC) {
        Log.m105925i("MicroMsg.AppBrandFloatBallLogic", "destroy, runtime:%s", appBrandRuntimeWC.f238147j);
        C81849e eVar = this.f240135b;
        if (eVar != null) {
            eVar.mo67996A0();
        }
        C81858k kVar = this.f240136c;
        if (kVar != null) {
            kVar.mo67996A0();
        }
        C81862l lVar = this.f240137d;
        if (lVar != null) {
            lVar.mo67996A0();
        }
        C81840a aVar = this.f240139f;
        if (aVar != null) {
            aVar.mo67996A0();
        }
        C81869m mVar = this.f240138e;
        if (mVar != null) {
            mVar.mo67996A0();
        }
        C81845c e = C82229d0.m100955e(this.f240134a);
        if (e != null) {
            e.mo67996A0();
        }
    }
}
