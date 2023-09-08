package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import org.json.JSONObject;
import p1044ub.C90630c;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g */
public class C82801g extends C82268c<C91635f> {
    public static final int CTRL_INDEX = 166;
    public static final String NAME = "launchMiniProgram";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C91635f fVar2 = (C91635f) fVar;
        String optString = jSONObject.optString("appId", (String) null);
        String optString2 = jSONObject.optString("username");
        boolean z = !Util.isNullOrNil(optString2) && fVar2.getRuntime().mo113036W().f234841u == 7;
        if (!z && Util.isNullOrNil(optString)) {
            fVar2.mo109647a(i, mo115109j("fail:invalid data"));
        } else if (z || !optString.equals(fVar2.getAppId())) {
            String optString3 = jSONObject.optString("path", (String) null);
            String optString4 = jSONObject.optString("extraData", (String) null);
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
            String optString5 = jSONObject.optString("sceneNote", (String) null);
            int i2 = C82793b.m101536a(jSONObject.optString("envVersion"), C82793b.RELEASE).f242156d;
            LaunchParcel launchParcel = new LaunchParcel();
            if (z) {
                launchParcel.f243730d = optString2;
            } else {
                launchParcel.f243731e = optString;
            }
            launchParcel.f243733g = i2;
            launchParcel.f243735i = optString3;
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            if (optInt != -1) {
                appBrandStatObject.f245533f = optInt;
            } else {
                appBrandStatObject.f245533f = 1037;
            }
            if (!TextUtils.isEmpty(optString5)) {
                appBrandStatObject.f245534g = optString5;
            } else {
                appBrandStatObject.f245534g = fVar2.getAppId() + XVFSFile.PATH_SEPARATOR + fVar2.getRuntime().mo113036W().f234837q;
            }
            if (jSONObject.has("preScene")) {
                appBrandStatObject.f245531d = jSONObject.optInt("preScene", 0);
                appBrandStatObject.f245532e = jSONObject.optString("preSceneNote");
            }
            launchParcel.f243715G = jSONObject.optBoolean("noRelaunchIfPathUnchanged", false);
            C90630c F0 = fVar2.mo114341l0();
            String R0 = F0 != null ? F0.mo116163R0() : "";
            AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
            appBrandLaunchReferrer.f239397e = fVar2.getAppId();
            appBrandLaunchReferrer.f239398f = optString4;
            appBrandLaunchReferrer.f239396d = 1;
            appBrandLaunchReferrer.f239401i = R0;
            launchParcel.f243738o = appBrandStatObject;
            launchParcel.f243739p = appBrandLaunchReferrer;
            launchParcel.f243749z = new C82800f(this, fVar2, i);
            if (mo115042w(fVar2, jSONObject, i)) {
                C83231l.m102146g(fVar2.getAppId(), C83231l.C83235e.LAUNCH_MINI_PROGRAM);
                ((C83285a) C83428o.f243800a).mo115582b(fVar2.getContext(), launchParcel);
            }
        } else {
            fVar2.mo109647a(i, mo115109j("fail target appId is the same as the caller appId"));
        }
    }

    /* renamed from: w */
    public boolean mo115042w(C91635f fVar, JSONObject jSONObject, int i) {
        return true;
    }
}
