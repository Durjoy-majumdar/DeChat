package com.tencent.p014mm.plugin.game.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import org.json.JSONException;
import org.json.JSONObject;
import p447aw.C103918d;
import p447aw.C54369c;
import p828wa.C53095a;
import p828wa.C53096b;
import vc3.C78382a;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.j1 */
public class C4487j1 extends C43620m2<C53095a> {

    /* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.j1$a */
    public class C4488a implements AbsRequestFloatWindowPermissionDialog.C85613a {

        /* renamed from: a */
        public final /* synthetic */ C43620m2.C5947b f19259a;

        public C4488a(C4487j1 j1Var, C43620m2.C5947b bVar) {
            this.f19259a = bVar;
        }

        /* renamed from: a */
        public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            JSONObject jSONObject;
            Log.m105928w("MicroMsg.JsApiRequestOverlayPermission", "float window permission granted");
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            try {
                jSONObject = new JSONObject();
                jSONObject.put("ret", 0);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            this.f19259a.mo6945a((String) null, jSONObject);
        }

        /* renamed from: b */
        public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            JSONObject jSONObject;
            Log.m105929w("MicroMsg.JsApiRequestOverlayPermission", "onResultCancel ok:%b", Boolean.valueOf(((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())));
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            try {
                jSONObject = new JSONObject();
                jSONObject.put("ret", -1);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            this.f19259a.mo6945a((String) null, jSONObject);
        }

        /* renamed from: c */
        public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            JSONObject jSONObject;
            Log.m105928w("MicroMsg.JsApiRequestOverlayPermission", "float window permission refused");
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            try {
                jSONObject = new JSONObject();
                jSONObject.put("ret", -1);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            this.f19259a.mo6945a((String) null, jSONObject);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "requestOverlayPermission";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        String optString = jSONObject != null ? jSONObject.optString("desc", MMApplicationContext.getContext().getString(C0966R.string.f8172c)) : MMApplicationContext.getContext().getString(C0966R.string.f8172c);
        if (((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ret", 0);
            } catch (JSONException unused2) {
                jSONObject2 = null;
            }
            bVar.mo6945a((String) null, jSONObject2);
            return;
        }
        ((C54369c) C86312j.m106911c(C54369c.class)).mo75136wJ(MMApplicationContext.getContext(), optString, new C4488a(this, bVar), true, C78382a.m94650b());
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C53095a>.a aVar) {
    }
}
