package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.ipc.JsApiMMTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p213oh.C11412b;
import p828wa.C53095a;
import p828wa.C53096b;
import y83.C53505a;
import y83.C53507c;
import y83.C53509e;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.m2 */
public abstract class C43620m2<T extends C53095a> extends C53096b<T> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.m2$b */
    public static abstract class C5947b {
        /* renamed from: a */
        public abstract void mo6945a(String str, JSONObject jSONObject);

        /* renamed from: b */
        public abstract void mo6946b(String str, JSONObject jSONObject);
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.m2$a */
    public class C43621a implements C53505a {

        /* renamed from: a */
        public final /* synthetic */ C53096b.C53097a f117871a;

        public C43621a(C43620m2 m2Var, C53096b.C53097a aVar) {
            this.f117871a = aVar;
        }

        /* renamed from: a */
        public void mo41060a(Bundle bundle) {
            JSONObject jSONObject;
            String string = bundle.getString("event");
            String string2 = bundle.getString("data");
            if ((this.f117871a.f148189a instanceof C53095a) && !TextUtils.isEmpty(string)) {
                try {
                    jSONObject = new JSONObject(string2);
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                ((C53095a) this.f117871a.f148189a).getRuntime().mo73814a(string, jSONObject);
            }
        }

        public void onCallback(Bundle bundle) {
            String string = bundle.getString("err_msg");
            String string2 = bundle.getString("data");
            if (!Util.isNullOrNil(string)) {
                this.f117871a.mo73778c(string, (JSONObject) null);
                return;
            }
            try {
                this.f117871a.mo73780e(new JSONObject(string2));
            } catch (Exception unused) {
                this.f117871a.mo73776a();
            }
        }
    }

    /* renamed from: a */
    public void mo6949a(C53096b<T>.a aVar) {
        String name = getClass().getName();
        int i = C11412b.f33577a;
        Log.m105925i(name, "gamelog.jsapi, webview, invoke", (Object[]) null);
        if (mo5383c() == 1) {
            JsApiMMTask jsApiMMTask = new JsApiMMTask();
            jsApiMMTask.f117843f = aVar;
            jsApiMMTask.f117845h = getClass().getName();
            jsApiMMTask.f117844g = aVar.f148190b.f129368c.toString();
            jsApiMMTask.mo114395c();
        } else if (mo5383c() == 2) {
            Bundle bundle = new Bundle();
            bundle.putString("jsapi_name", getClass().getName());
            bundle.putString("data", aVar.f148190b.f129368c.toString());
            C53507c.m60047a((MMActivity) ((C53095a) aVar.f148189a).getContext(), bundle, C53509e.class, new C43621a(this, aVar));
        } else {
            mo5385e(aVar);
        }
    }

    /* renamed from: c */
    public abstract int mo5383c();

    /* renamed from: d */
    public abstract void mo5384d(Context context, String str, C5947b bVar);

    /* renamed from: e */
    public abstract void mo5385e(C53096b<T>.a aVar);
}
