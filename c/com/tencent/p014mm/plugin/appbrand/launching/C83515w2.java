package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized;
import com.tencent.luggage.sdk.config.LaunchWxaAppMigrateInfoParcelized;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import eb0.C31543z5;
import js0.C88022n;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C91211t5;
import pe3.C89349b;
import te3.C51662v83;
import te3.C64567n1;
import te3.C90446wm2;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.w2 */
public final class C83515w2 extends C91211t5 {

    /* renamed from: G */
    public static final IAutoDBItem.MAutoDBInfo f243993G = C91211t5.initAutoDBInfo(C91211t5.class);

    /* renamed from: F */
    public transient boolean f243994F;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r0 = r6.field_hostInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r0 = r6.field_actionsheetInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r0 = r6.field_operationInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = r6.field_launchAction;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = r6.field_jsapiInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83515w2
            r1 = 0
            if (r0 == 0) goto L_0x006a
            com.tencent.mm.plugin.appbrand.launching.w2 r7 = (com.tencent.p014mm.plugin.appbrand.launching.C83515w2) r7
            java.lang.String r0 = r6.field_appId
            java.lang.String r2 = r7.field_appId
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006a
            te3.rm2 r0 = r6.field_launchAction
            if (r0 == 0) goto L_0x006a
            te3.rm2 r2 = r7.field_launchAction
            boolean r0 = js0.C46572o.m51895a(r0, r2)
            if (r0 == 0) goto L_0x006a
            te3.au r0 = r6.field_jsapiInfo
            if (r0 == 0) goto L_0x006a
            te3.au r2 = r7.field_jsapiInfo
            boolean r0 = js0.C46572o.m51895a(r0, r2)
            if (r0 == 0) goto L_0x006a
            te3.b55 r0 = r6.field_hostInfo
            if (r0 == 0) goto L_0x006a
            te3.b55 r2 = r7.field_hostInfo
            boolean r0 = js0.C46572o.m51895a(r0, r2)
            if (r0 == 0) goto L_0x006a
            te3.n1 r0 = r6.field_actionsheetInfo
            if (r0 == 0) goto L_0x006a
            te3.n1 r2 = r7.field_actionsheetInfo
            boolean r0 = js0.C46572o.m51895a(r0, r2)
            if (r0 == 0) goto L_0x006a
            te3.v83 r0 = r6.field_operationInfo
            if (r0 == 0) goto L_0x006a
            te3.v83 r2 = r7.field_operationInfo
            boolean r0 = js0.C46572o.m51895a(r0, r2)
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r6.field_opConfig
            java.lang.String r2 = r7.field_opConfig
            boolean r0 = u24.C90599h.m113509b(r0, r2)
            if (r0 == 0) goto L_0x006a
            long r2 = r6.field_expiredAtTimestampSeconds
            long r4 = r7.field_expiredAtTimestampSeconds
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = r6.field_openId
            java.lang.String r7 = r7.field_openId
            boolean r7 = u24.C90599h.m113509b(r0, r7)
            if (r7 == 0) goto L_0x006a
            r1 = 1
        L_0x006a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83515w2.equals(java.lang.Object):boolean");
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f243993G;
    }

    /* renamed from: l2 */
    public void mo115808l2(C90446wm2 wm22) {
        this.field_launchAction = wm22.f259922d;
        this.field_jsapiInfo = wm22.f259923e;
        this.field_hostInfo = wm22.f259924f;
        this.field_actionsheetInfo = wm22.f259926h;
        this.field_operationInfo = wm22.f259927i;
        this.field_opConfig = wm22.f259930o;
        long a = C88022n.m109570a(wm22.f259932q);
        if (a > 0) {
            this.field_expiredAtTimestampSeconds = ((long) C31543z5.m39455e()) + a;
        } else {
            this.field_expiredAtTimestampSeconds = 0;
        }
        this.field_openId = wm22.f259933r;
    }

    /* renamed from: m2 */
    public void mo115809m2(AppBrandSysConfigWC appBrandSysConfigWC) {
        C89349b bVar;
        C64567n1 n1Var = this.field_actionsheetInfo;
        appBrandSysConfigWC.f239408W0 = n1Var != null && n1Var.f184418d;
        appBrandSysConfigWC.f239409X0 = n1Var != null && n1Var.f184419e;
        appBrandSysConfigWC.f239410Y0 = n1Var != null && n1Var.f184421g;
        appBrandSysConfigWC.f239411Z0 = n1Var != null ? n1Var.f184420f : 0;
        if (n1Var == null || (bVar = n1Var.f184422h) == null) {
            Log.m105921e("MicroMsg.AppBrand.LaunchWxaAppInfo", "fillLaunchConfig, appId:%s, field_actionsheetInfo null", this.field_appId);
            appBrandSysConfigWC.f239412a1 = null;
        } else {
            appBrandSysConfigWC.f239412a1 = bVar.f257327a;
            Log.m105925i("MicroMsg.AppBrand.LaunchWxaAppInfo", "fillLaunchConfig, appId:%s, has field_actionsheetInfo", this.field_appId);
        }
        C51662v83 v832 = this.field_operationInfo;
        if (v832 != null && !Util.isNullOrNil(v832.f143388d)) {
            appBrandSysConfigWC.f234859D = this.field_operationInfo.f143388d;
            try {
                JSONObject jSONObject = new JSONObject(appBrandSysConfigWC.f234859D).getJSONObject("privacy");
                appBrandSysConfigWC.f261068n = jSONObject.getInt("banLocationIfEmptyDesc") == 1;
                appBrandSysConfigWC.f261069o = jSONObject.getInt("banGetWifiListIfEmptyDesc") == 1;
            } catch (JSONException unused) {
                appBrandSysConfigWC.f261068n = false;
                appBrandSysConfigWC.f261069o = false;
            }
            String str = appBrandSysConfigWC.f234859D;
            appBrandSysConfigWC.f261065h = true;
            appBrandSysConfigWC.f261066i = true;
            appBrandSysConfigWC.f261067j = true;
            if (Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.AppBrandSysConfigUtil", "operationInfo nil");
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject(str).getJSONObject("bgKeepAlive");
                    appBrandSysConfigWC.f261065h = jSONObject2.optInt("music", 1) == 1;
                    appBrandSysConfigWC.f261066i = jSONObject2.optInt(FirebaseAnalytics.C113379b.LOCATION, 1) == 1;
                    appBrandSysConfigWC.f261067j = jSONObject2.optInt("bluetooth", 1) == 1;
                } catch (JSONException e) {
                    Log.m105929w("MicroMsg.AppBrandSysConfigUtil", "assembleBgKeepAliveConfigByOperationInfo operationInfo:%s", str);
                    Log.m105929w("MicroMsg.AppBrandSysConfigUtil", "assembleBgKeepAliveConfigByOperationInfo exp:%s", e);
                }
            }
        }
        appBrandSysConfigWC.f234856A = new LaunchWxaAppInfoParcelized(new AppRuntimeApiPermissionBundle(this.field_jsapiInfo), (Parcelable) null, this.field_opConfig, false, false, (LaunchWxaAppMigrateInfoParcelized) null);
        appBrandSysConfigWC.f234882V0 = this.field_openId;
    }

    /* renamed from: n2 */
    public final boolean mo115810n2(String str) {
        C51662v83 v832 = this.field_operationInfo;
        if (v832 != null && !Util.isNullOrNil(v832.f143388d)) {
            try {
                JSONObject jSONObject = new JSONObject(this.field_operationInfo.f143388d);
                if (!jSONObject.has("jumpWeAppFromLongPressCodeBanInfo")) {
                    return false;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("jumpWeAppFromLongPressCodeBanInfo");
                return jSONObject2.has(str) && jSONObject2.optInt(str, 0) == 1;
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.AppBrand.LaunchWxaAppInfo", "[banjump] shouldBanJumpInternal fail", e);
            }
        }
        return false;
    }
}
