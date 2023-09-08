package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import org.json.JSONObject;
import p225rc.C89916g;
import p225rc.C89922k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.b */
public abstract class C82576b<CONTEXT extends C82381f> extends C82268c<CONTEXT> {

    /* renamed from: g */
    public boolean f241689g;

    /* renamed from: u */
    public void mo1505u(CONTEXT context, JSONObject jSONObject, int i) {
        boolean z;
        if (mo114895w(context)) {
            z = true;
        } else {
            if (this.f241689g) {
                context.mo109647a(i, mo115109j("fail:system permission denied"));
            } else {
                Activity activity = context.getContext() instanceof Activity ? (Activity) context.getContext() : null;
                if (activity == null) {
                    Log.m105920e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "operateRecorder, pageContext is null");
                    context.mo109647a(i, mo115109j("fail:internal error invalid android context"));
                } else {
                    z = C89916g.m112446a(activity).mo124229c(context, "android.permission.ACCESS_FINE_LOCATION", new C82571a(this, context, jSONObject, i));
                }
            }
            z = false;
        }
        if (!z) {
            Log.m105921e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "%s requestPermission fail", mo114779e());
        } else if (jSONObject == null) {
            Log.m105921e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "%s invalid data", mo114779e());
            context.mo109647a(i, mo115109j("fail:invalid data"));
        } else {
            mo114896x(context, jSONObject, i);
        }
    }

    /* renamed from: w */
    public final boolean mo114895w(CONTEXT context) {
        Context context2 = context.getContext();
        if (context2 == null) {
            context2 = MMApplicationContext.getContext();
        }
        return C89922k.m112465b(context2, context, "android.permission.ACCESS_FINE_LOCATION");
    }

    /* renamed from: x */
    public abstract void mo114896x(CONTEXT context, JSONObject jSONObject, int i);
}
