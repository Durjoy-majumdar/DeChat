package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.e */
public abstract class C82892e extends C82268c<C82381f> {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.e$a */
    public static final class C82893a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ C82892e f242351a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f242352b;

        /* renamed from: c */
        public final /* synthetic */ int f242353c;

        public C82893a(C82892e eVar, C82381f fVar, int i) {
            this.f242351a = eVar;
            this.f242352b = fVar;
            this.f242353c = i;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            JumpToProfileResult jumpToProfileResult = (JumpToProfileResult) processResult;
            if (jumpToProfileResult == null) {
                C82892e eVar = this.f242351a;
                C82381f fVar = this.f242352b;
                int i = this.f242353c;
                Log.m105920e("MicroMsg.AppBrand.OpenWeComUserProfile", "onReceiveResult#IProcessResultReceiver, result is null");
                eVar.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                fVar.mo109647a(i, eVar.mo115115p("fail:internal error", jSONObject));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.OpenWeComUserProfile", "onReceiveResult#IProcessResultReceiver, result: " + jumpToProfileResult);
            int ordinal = jumpToProfileResult.f242331d.ordinal();
            if (ordinal == 0) {
                C82381f fVar2 = this.f242352b;
                int i2 = this.f242353c;
                C82892e eVar2 = this.f242351a;
                eVar2.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                fVar2.mo109647a(i2, eVar2.mo115115p("ok", jSONObject2));
            } else if (ordinal == 1) {
                C82381f fVar3 = this.f242352b;
                int i3 = this.f242353c;
                C82892e eVar3 = this.f242351a;
                eVar3.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1, "cancel");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 1);
                } catch (Exception e3) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
                }
                fVar3.mo109647a(i3, eVar3.mo115115p("cancel", jSONObject3));
            } else if (ordinal == 2) {
                C82381f fVar4 = this.f242352b;
                int i4 = this.f242353c;
                C82892e eVar4 = this.f242351a;
                eVar4.getClass();
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("errno", 4);
                } catch (Exception e4) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
                }
                fVar4.mo109647a(i4, eVar4.mo115115p("fail:internal error", jSONObject4));
            } else if (ordinal == 3) {
                C82381f fVar5 = this.f242352b;
                int i5 = this.f242353c;
                C82892e eVar5 = this.f242351a;
                String str = "fail:" + jumpToProfileResult.f242332e;
                eVar5.getClass();
                if (str == null) {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 8, str);
                }
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("errno", 8);
                } catch (Exception e5) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e5);
                }
                fVar5.mo109647a(i5, eVar5.mo115115p(str, jSONObject5));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar != null) {
            Context context = fVar.getContext();
            if (context == null) {
                Log.m105928w("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, context is null");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("errno", 4);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
                }
                fVar.mo109647a(i, mo115115p("fail:internal error", jSONObject2));
            } else if (jSONObject == null) {
                Log.m105920e("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, data is null");
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("errno", 101);
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
                }
                fVar.mo109647a(i, mo115115p("fail:jsapi invalid request data", jSONObject3));
            } else {
                Log.m105924i("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, data: " + jSONObject);
                AppBrandProxyUIProcessTask.ProcessRequest w = mo115149w(fVar, jSONObject, i);
                if (w != null) {
                    C81956c.m100675c(context, w, new C82893a(this, fVar, i), (Intent) null);
                }
            }
        }
    }

    /* renamed from: w */
    public abstract AppBrandProxyUIProcessTask.ProcessRequest mo115149w(C82381f fVar, JSONObject jSONObject, int i);
}
