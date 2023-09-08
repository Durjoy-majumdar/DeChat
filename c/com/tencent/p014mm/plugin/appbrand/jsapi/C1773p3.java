package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.p3 */
public class C1773p3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f11523d;

    /* renamed from: e */
    public final /* synthetic */ String f11524e;

    /* renamed from: f */
    public final /* synthetic */ String f11525f;

    /* renamed from: g */
    public final /* synthetic */ String f11526g;

    /* renamed from: h */
    public final /* synthetic */ String f11527h;

    /* renamed from: i */
    public final /* synthetic */ String f11528i;

    /* renamed from: j */
    public final /* synthetic */ int f11529j;

    /* renamed from: n */
    public final /* synthetic */ JsApiLaunchApplicationDirectly f11530n;

    public C1773p3(JsApiLaunchApplicationDirectly jsApiLaunchApplicationDirectly, C81925i2 i2Var, String str, String str2, String str3, String str4, String str5, int i) {
        this.f11530n = jsApiLaunchApplicationDirectly;
        this.f11523d = i2Var;
        this.f11524e = str;
        this.f11525f = str2;
        this.f11526g = str3;
        this.f11527h = str4;
        this.f11528i = str5;
        this.f11529j = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        JsApiLaunchApplicationDirectly jsApiLaunchApplicationDirectly = this.f11530n;
        C81925i2 i2Var = this.f11523d;
        jsApiLaunchApplicationDirectly.getClass();
        MMHandlerThread.postToMainThread(new C82866o3(jsApiLaunchApplicationDirectly, i2Var));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.f11524e);
            jSONObject.put("taskUrl", this.f11525f);
            jSONObject.put("taskName", this.f11526g);
            jSONObject.put("fileMd5", this.f11527h);
            jSONObject.put("packageName", this.f11528i);
            new JsApiLaunchApplicationDirectly.AddDownloadTaskStraightTask(this.f11530n, this.f11523d, this.f11529j, jSONObject).mo114395c();
            this.f11523d.mo109647a(this.f11529j, this.f11530n.mo115109j("ok:user downloaded app"));
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication, download app fail", e);
            this.f11523d.mo109647a(this.f11529j, this.f11530n.mo115109j("fail:download app fail"));
        }
    }
}
