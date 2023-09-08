package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbase.BaseResp;
import com.tencent.p014mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.p014mm.opensdk.modelbiz.WXOpenBusinessView;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44623b1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import org.json.JSONObject;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication */
public class JsApiNavigateBackApplication extends C82268c<C81879g> {
    private static final int CTRL_INDEX = 288;
    public static final String NAME = "navigateBackApplication";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppTask */
    public static final class NavigateBackAppTask extends MainProcessTask {
        public static final Parcelable.Creator<NavigateBackAppTask> CREATOR = new C81987a();

        /* renamed from: f */
        public String f240419f;

        /* renamed from: g */
        public String f240420g;

        /* renamed from: h */
        public String f240421h;

        /* renamed from: i */
        public int f240422i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppTask$a */
        public class C81987a implements Parcelable.Creator<NavigateBackAppTask> {
            public Object createFromParcel(Parcel parcel) {
                NavigateBackAppTask navigateBackAppTask = new NavigateBackAppTask();
                navigateBackAppTask.mo1551g(parcel);
                return navigateBackAppTask;
            }

            public Object[] newArray(int i) {
                return new NavigateBackAppTask[i];
            }
        }

        public NavigateBackAppTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f240419f = parcel.readString();
            this.f240420g = parcel.readString();
            this.f240421h = parcel.readString();
            this.f240422i = parcel.readInt();
        }

        /* renamed from: j */
        public void mo1553j() {
            Class cls = C79138l.class;
            C44561j Pw0 = ((C79138l) C86312j.m106911c(cls)).Pw0(this.f240419f, true, true);
            Log.m105925i("MicroMsg.JsApiNavigateBackApplication", "NavigateBackAppTask appid %s", this.f240419f);
            if (Pw0 == null) {
                Log.m105928w("MicroMsg.JsApiNavigateBackApplication", "NavigateBackAppTask appinfo is null");
            } else if (!((C79138l) C86312j.m106911c(cls)).mo73987D8(Pw0)) {
                Log.m105920e("MicroMsg.JsApiNavigateBackApplication", "NavigateBackAppTask packageName invalid");
            } else {
                Bundle bundle = new Bundle();
                if (Util.isNullOrNil(this.f240421h)) {
                    WXLaunchMiniProgram.Resp resp = new WXLaunchMiniProgram.Resp(bundle);
                    resp.extMsg = this.f240420g;
                    resp.openId = Pw0.field_openId;
                    mo114433q(bundle, resp, Pw0);
                    return;
                }
                WXOpenBusinessView.Resp resp2 = new WXOpenBusinessView.Resp(bundle);
                resp2.extMsg = this.f240420g;
                resp2.openId = Pw0.field_openId;
                resp2.errCode = this.f240422i;
                resp2.businessType = this.f240421h;
                resp2.transaction = C44623b1.f121003a;
                mo114433q(bundle, resp2, Pw0);
            }
        }

        /* renamed from: q */
        public final void mo114433q(Bundle bundle, BaseResp baseResp, C44561j jVar) {
            baseResp.toBundle(bundle);
            MMessageActV2.Args args = new MMessageActV2.Args();
            args.targetPkgName = jVar.field_packageName;
            args.bundle = bundle;
            C72688j0.m85024j(args);
            C72688j0.m85021g(bundle);
            C72688j0.m85022h(bundle);
            MMessageActV2.send(MMApplicationContext.getContext(), args);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f240419f);
            parcel.writeString(this.f240420g);
            parcel.writeString(this.f240421h);
            parcel.writeInt(this.f240422i);
        }

        public NavigateBackAppTask(String str, String str2, String str3, int i) {
            this.f240419f = str;
            this.f240420g = str2;
            this.f240421h = str3;
            this.f240422i = i;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int i2;
        C81879g gVar = (C81879g) fVar;
        AppBrandLaunchReferrer appBrandLaunchReferrer = ((AppBrandRuntimeWC) gVar.getRuntime()).mo113210l1().f234846y;
        String optString = jSONObject.optString("appId");
        String optString2 = jSONObject.optString("extraData");
        String str = C84072q1.m103587b(gVar.getRuntime().f238147j).f245465i;
        Log.m105925i("MicroMsg.JsApiNavigateBackApplication", "navigate back Application, businessType:%s", str);
        if (!Util.isNullOrNil(str)) {
            C84072q1.m103586a(gVar.getAppId()).f245469m = true;
        }
        if (!Util.isNullOrNil(optString)) {
            new NavigateBackAppTask(optString, Util.nullAs(optString2, "{}"), str, 0).mo114395c();
        } else if (Util.isNullOrNil(appBrandLaunchReferrer.f239397e) || !((i2 = appBrandLaunchReferrer.f239396d) == 4 || i2 == 7)) {
            Log.m105929w("MicroMsg.JsApiNavigateBackApplication", "navigateBackApplication appid %s,launchScene %d", appBrandLaunchReferrer.f239397e, Integer.valueOf(appBrandLaunchReferrer.f239396d));
            gVar.mo109647a(i, mo115109j("fail:not from opensdk"));
            return;
        } else {
            new NavigateBackAppTask(appBrandLaunchReferrer.f239397e, Util.nullAs(optString2, "{}"), str, 0).mo114395c();
        }
        gVar.mo109647a(i, mo115109j("ok"));
        if (!Util.isNullOrNil(str)) {
            MMHandlerThread.postToMainThreadDelayed(new C83041u3(this, gVar), 1000);
        }
    }
}
