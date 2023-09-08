package o22;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f40.C86709a0;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p167hz.C33152m;
import p167hz.C60234g;

/* renamed from: o22.b */
public class C61921b extends C4770c {

    /* renamed from: o22.b$a */
    public class C61922a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C60234g f176030d;

        public C61922a(C60234g gVar) {
            this.f176030d = gVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107524d().mo123470p(this.f176030d.getType(), this);
            if (i == 0 && i2 == 0) {
                String str2 = ((C60234g) yVar).getResponse().f137283d;
                Intent intent = new Intent();
                intent.putExtra("Contact_User", str2);
                intent.putExtra("Contact_Scene", 3);
                if (str2 != null && str2.length() > 0) {
                    C88144b.m109791i(MMApplicationContext.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                    C61921b.this.f19815f.mo5690b();
                    return;
                }
                return;
            }
            C61921b.this.f19815f.mo5689a("goUserProfile failed");
            Log.m105921e("LiteAppJsApiOpenProfileWithOpenId", "goUserProfile failed, NetSceneTopStoryGetUsername errType:%s, errCode:%s, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        try {
            String string = jSONObject.has("openId") ? jSONObject.getString("openId") : null;
            String string2 = jSONObject.has("userName") ? jSONObject.getString("userName") : null;
            if (string2 != null) {
                Intent intent = new Intent();
                intent.putExtra("Contact_User", string2);
                intent.putExtra("Contact_Scene", 3);
                C88144b.m109791i(MMApplicationContext.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                this.f19815f.mo5690b();
            } else if (string == null) {
                this.f19815f.mo5689a("openId or userName is required");
            } else {
                C60234g vs = ((C33152m) C86312j.m106911c(C33152m.class)).mo58718vs(string);
                C86709a0.m107524d().mo123455a(vs.getType(), new C61922a(vs));
                C86709a0.m107524d().mo123460f((C117747y) vs);
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("LiteAppJsApiOpenProfileWithOpenId", e, "get openId", new Object[0]);
            this.f19815f.mo5689a("get openId exception");
        }
    }
}
