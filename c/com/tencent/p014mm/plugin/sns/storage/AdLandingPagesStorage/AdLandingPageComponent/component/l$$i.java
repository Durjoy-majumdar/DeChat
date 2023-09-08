package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44243c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32224a;
import java.util.Map;
import ke3.C88144b;
import org.json.JSONObject;
import qo2.C101214a;
import qs2.C101271i0;
import qs2.C101286q0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import us2.C102078g;
import us2.C37576d;
import vr2.C102236a0;
import vs2.C102274c;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$i */
public class l$$i implements C44243c0 {

    /* renamed from: a */
    public final /* synthetic */ C101286q0 f276120a;

    /* renamed from: b */
    public final /* synthetic */ ObjectAnimator f276121b;

    /* renamed from: c */
    public final /* synthetic */ C95136l f276122c;

    public l$$i(C95136l lVar, C101286q0 q0Var, ObjectAnimator objectAnimator) {
        this.f276122c = lVar;
        this.f276120a = q0Var;
        this.f276121b = objectAnimator;
    }

    /* renamed from: a */
    public void mo63036a(MMWebView mMWebView, String str) {
        SnsMethodCalculate.markStartTimeMs("onPageStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        Log.m105924i("AdLandingNewH5Comp", "onPageStarted, cid is " + this.f276122c.mo131857r());
        SnsMethodCalculate.markEndTimeMs("onPageStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
    }

    /* renamed from: b */
    public boolean mo63037b(String str) {
        SnsMethodCalculate.markStartTimeMs("handleUrlLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        SnsMethodCalculate.markEndTimeMs("handleUrlLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        return false;
    }

    /* renamed from: c */
    public void mo63038c(MMWebView mMWebView, String str) {
        SnsMethodCalculate.markStartTimeMs("onPageFinished", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        StringBuilder sb = new StringBuilder();
        sb.append("onPageFinished, cid is ");
        sb.append(this.f276122c.mo131857r());
        sb.append(", showLoadAnimation is ");
        C101286q0 q0Var = this.f276120a;
        sb.append(q0Var != null ? Boolean.valueOf(q0Var.f296687D) : "info is null");
        sb.append(", mPageStartDisplay is ");
        sb.append(C95136l.m121011E(this.f276122c));
        Log.m105924i("AdLandingNewH5Comp", sb.toString());
        C101286q0 q0Var2 = this.f276120a;
        if (q0Var2 != null && q0Var2.f296687D && !C95136l.m121011E(this.f276122c)) {
            C95136l lVar = this.f276122c;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            lVar.f276113x = true;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            this.f276121b.start();
        }
        SnsMethodCalculate.markEndTimeMs("onPageFinished", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
    }

    public boolean callback(int i, Bundle bundle) {
        String str;
        int i2 = i;
        Bundle bundle2 = bundle;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        Log.m105924i("AdLandingNewH5Comp", "callback, actionCode=" + i2);
        boolean z = false;
        switch (i2) {
            case 150:
                int i3 = bundle2.getInt("sns_landing_pages_ad_vote_index");
                String string = bundle2.getString("sns_landing_pages_ad_vote_result");
                AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
                String str2 = ((C101286q0) this.f276122c.mo131856q()).f296688z;
                String l = this.f276122c.mo131854m().mo140745l();
                C101271i0 m = this.f276122c.mo131854m();
                m.getClass();
                SnsMethodCalculate.markStartTimeMs("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                String str3 = m.f296621f;
                SnsMethodCalculate.markEndTimeMs("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                instance.saveAdVoteInfo(str2, l, str3, i3, 0, string);
                break;
            case 151:
                try {
                    Intent intent = new Intent();
                    String a = C95198o2.m121129a(bundle2.getString("sns_landing_pages_ad_jumpurl"), "traceid=" + this.f276122c.mo131854m().mo140743j(), "aid=" + this.f276122c.mo131854m().mo140735b());
                    String k = this.f276122c.mo131854m().mo140744k();
                    if (TextUtils.isEmpty(k)) {
                        k = this.f276122c.mo131854m().mo140745l();
                        Log.m105924i("AdLandingNewH5Comp", "opJumpView, use orig_UxInfo:" + k);
                    } else {
                        Log.m105924i("AdLandingNewH5Comp", "opJumpView, use updated_UxInfo:" + k);
                    }
                    String b = C102236a0.m134734b(a, k);
                    C102236a0.m134736c(intent, k);
                    intent.putExtra("rawUrl", b);
                    intent.putExtra("useJs", true);
                    intent.putExtra("type", -255);
                    C102236a0.m134732a(intent, 84);
                    C88144b.m109791i(this.f276122c.f276579d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    Log.m105924i("AdLandingNewH5Comp", "jumpUrl, finalUrl=" + b);
                    break;
                } catch (Exception e) {
                    Log.m105920e("AdLandingNewH5Comp", "OptJump exp=" + e.toString());
                    break;
                }
            case 152:
                String string2 = bundle2.getString("sns_landing_pages_h5_params");
                String string3 = bundle2.getString("callbackId");
                C95136l lVar = this.f276122c;
                lVar.getClass();
                SnsMethodCalculate.markStartTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                try {
                    Log.m105924i("AdLandingNewH5Comp", "handleJSAPI, params=" + string2 + ", callbackId=" + string3);
                    JSONObject jSONObject = new JSONObject(string2);
                    String optString = jSONObject.optString("funcName");
                    if ("opUpdateContentHeight".equals(optString)) {
                        int i4 = jSONObject.getInt("height");
                        SnsMethodCalculate.markStartTimeMs("adJuestHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                        MMHandlerThread.postToMainThread(new C95212r(lVar, i4));
                        SnsMethodCalculate.markEndTimeMs("adJuestHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                    } else if ("opStartQRScan".equals(optString)) {
                        jSONObject.getString("scanUrl");
                    } else {
                        if ("opEndQRScan".equals(optString)) {
                            lVar.mo131658V(jSONObject.getString("scanUrl"), jSONObject.optInt("directJump"), jSONObject.optInt("syncQrImageDownload"), string3);
                            SnsMethodCalculate.markEndTimeMs("handleJSAPI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                        } else if ("opGetLocation".equals(optString)) {
                            String optString2 = jSONObject.optString("type");
                            SnsMethodCalculate.markStartTimeMs("handleGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
                            str = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp";
                            try {
                                C102078g.m134487c(string3, optString2, lVar.f276579d, false, true, (C32224a<C13598b0>) null, lVar.f276107D);
                                SnsMethodCalculate.markEndTimeMs("handleGeoLocation", str);
                                SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } else {
                            str = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp";
                            if ("opGetDeviceInfo".equals(optString)) {
                                lVar.mo131652N(string3);
                                SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                            } else if ("requestBindPhoneNumber".equals(optString)) {
                                lVar.mo131657U(string3, jSONObject);
                                SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                            } else if ("openWheelPicker".equals(optString)) {
                                C102274c.m134909a(lVar.f276579d, string3, jSONObject, lVar);
                                SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                            } else if ("getCanAutoFillData".equals(optString)) {
                                C102078g.m134486a(string3, lVar.f276107D);
                                SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                            } else if ("setCanAutoFillData".equals(optString)) {
                                C102078g.m134488e(jSONObject.optString("status"), string3, lVar.f276107D);
                                SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                            } else {
                                C13601g gVar = C37576d.f99662a;
                                SnsMethodCalculate.markStartTimeMs("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                C13601g gVar2 = C37576d.f99662a;
                                SnsMethodCalculate.markEndTimeMs("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                if (((Map) ((C36570n) gVar2).getValue()).containsKey(optString)) {
                                    SnsMethodCalculate.markStartTimeMs("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                    SnsMethodCalculate.markEndTimeMs("getJsapiMap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool");
                                    ((C37576d.C37577a) ((Map) ((C36570n) gVar2).getValue()).get(optString)).mo61213a(jSONObject, lVar.f276579d, new l$$a(lVar, string3));
                                    SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                                } else if ("opOpenFinderProfile".equals(optString)) {
                                    C101214a.m132755d(lVar.f276579d, string3, jSONObject, lVar, lVar.mo131854m());
                                    SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                                } else if ("opFinderFollow".equals(optString)) {
                                    C101214a.m132754c(string3, jSONObject, lVar, lVar.mo131854m());
                                    SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                                } else if ("opQueryFinderFollowState".equals(optString)) {
                                    C101214a.m132756e(string3, jSONObject, lVar, lVar.mo131854m());
                                    SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                                } else {
                                    Log.m105928w("AdLandingNewH5Comp", "handleJSAPI without processor! func=" + optString);
                                    SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
                                    return z;
                                }
                            }
                        }
                        z = true;
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
                        return z;
                    }
                    str = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp";
                } catch (Throwable th4) {
                    th = th4;
                    str = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp";
                    Log.m105920e("AdLandingNewH5Comp", "handleJSAPI, exp=" + th.toString());
                    SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
                    return z;
                }
                SnsMethodCalculate.markEndTimeMs("handleJSAPI", str);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
                return z;
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        return false;
    }

    /* renamed from: d */
    public boolean mo63040d(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("closeWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        SnsMethodCalculate.markEndTimeMs("closeWindow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$4");
        return false;
    }
}
