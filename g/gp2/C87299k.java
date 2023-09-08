package gp2;

import android.app.Activity;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import hp2.C87579c;
import ip2.C87788c;
import lo2.C99542h0;
import vr2.C102260r;
import z04.C112551y;

/* renamed from: gp2.k */
public final class C87299k<T extends C7594e> extends C87579c<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenFinderDetailUI");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenFinderDetailUI");
        return "openFinderDetail";
    }

    /* renamed from: s */
    public void mo121698s(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenFinderDetailUI");
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString("finderUsername");
        String optString2 = hVar.optString("finderExportId");
        String optString3 = hVar.optString("finderObjectNonceId");
        boolean z = true;
        if (!(optString == null || C112551y.m153811k(optString))) {
            if (!(optString2 == null || C112551y.m153811k(optString2))) {
                if (!(optString3 == null || C112551y.m153811k(optString3))) {
                    T t = this.f251227a;
                    String str = null;
                    Activity e0 = t != null ? t.mo8720e0() : null;
                    if (e0 instanceof SnsAdNativeLandingPagesUI) {
                        SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) e0;
                        AdLandingPagesProxy.getInstance().doJumpToFinderFeedsDetailUI(optString, optString3, optString2, C87788c.m109226a(snsAdNativeLandingPagesUI.mo132541n8()), snsAdNativeLandingPagesUI.mo132541n8().mo140741h(), snsAdNativeLandingPagesUI.mo132541n8().mo140742i(), 5);
                        mo122027r(mo120844i());
                    } else {
                        String optString4 = hVar.optString("snsId");
                        int optInt = hVar.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
                        if (optString4 != null && !C112551y.m153811k(optString4)) {
                            z = false;
                        }
                        if (z) {
                            Log.m105920e("SnsAdMb.JsApi", "the sns id is empty!");
                            mo122027r(mo120842g(10000, "the sns id is empty!"));
                            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenFinderDetailUI");
                            return;
                        }
                        SnsInfo TE = C94866e1.Yx0().mo139807TE(optString4);
                        if (TE == null) {
                            Log.m105920e("SnsAdMb.JsApi", "the sns info doesn't exist!");
                            mo122027r(mo120842g(10000, "the sns info doesn't exist!"));
                            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenFinderDetailUI");
                            return;
                        }
                        ADInfo adInfo = TE.getAdInfo();
                        if (adInfo != null) {
                            str = adInfo.uxInfo;
                        }
                        String str2 = str == null ? "" : str;
                        ADInfo adInfo2 = TE.getAdInfo();
                        if (C99542h0.m129907e(MMApplicationContext.getContext(), str2, optString, optString3, optString2, C102260r.m134863c0(optString4), adInfo2 != null ? adInfo2.preloadFinderFeed : false, optInt)) {
                            Log.m105924i("SnsAdMb.JsApi", "open finder feed detail ui successfully!");
                            mo122027r(mo120844i());
                        } else {
                            Log.m105920e("SnsAdMb.JsApi", "open finder feed detail ui failed!");
                            mo122027r(mo120842g(10000, "open finder feed detail ui failed!"));
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenFinderDetailUI");
                    return;
                }
            }
        }
        Log.m105920e("SnsAdMb.JsApi", "input param is invalid!");
        mo122027r(mo120842g(10000, "input param is invalid!"));
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenFinderDetailUI");
    }
}
