package df2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import he0.C76159l;
import he0.C76160m;
import ke3.C88144b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: df2.e */
public class C75379e implements Preference.C44715b {

    /* renamed from: a */
    public final /* synthetic */ C76160m f221626a;

    /* renamed from: b */
    public final /* synthetic */ C72996z1 f221627b;

    /* renamed from: c */
    public final /* synthetic */ C76159l f221628c;

    /* renamed from: d */
    public final /* synthetic */ Context f221629d;

    public C75379e(C76160m mVar, C72996z1 z1Var, C76159l lVar, Context context) {
        this.f221626a = mVar;
        this.f221627b = z1Var;
        this.f221628c = lVar;
        this.f221629d = context;
    }

    /* renamed from: a */
    public boolean mo24588a(Preference preference) {
        String str;
        Intent intent = new Intent();
        try {
            str = new JSONObject(this.f221626a.f223094e).optString("url");
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", e, "loadProfile", new Object[0]);
            str = "";
        }
        C115669n.INSTANCE.mo160131h(15319, this.f221627b.mo73980x2(), Integer.valueOf(this.f221626a.f223093d), this.f221628c.f223088a);
        intent.putExtra("geta8key_scene", 58);
        intent.putExtra("rawUrl", str);
        C88144b.m109791i(this.f221629d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        return true;
    }
}
