package df2;

import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import he0.C76159l;
import he0.C76160m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: df2.f */
public class C75380f implements Preference.C44715b {

    /* renamed from: a */
    public final /* synthetic */ C76160m f221630a;

    /* renamed from: b */
    public final /* synthetic */ C72996z1 f221631b;

    /* renamed from: c */
    public final /* synthetic */ C76159l f221632c;

    public C75380f(C76160m mVar, C72996z1 z1Var, C76159l lVar) {
        this.f221630a = mVar;
        this.f221631b = z1Var;
        this.f221632c = lVar;
    }

    /* renamed from: a */
    public boolean mo24588a(Preference preference) {
        try {
            JSONObject jSONObject = new JSONObject(this.f221630a.f223094e);
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("pagepath");
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            aVar.f9526a = optString;
            aVar.f9527b = Util.nullAs(optString2, "");
            startAppBrandUIFromOuterEvent.publish();
            C115669n.INSTANCE.mo160131h(15319, this.f221631b.mo73980x2(), Integer.valueOf(this.f221630a.f223093d), this.f221632c.f223088a);
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", e, "loadProfile", new Object[0]);
        }
        return true;
    }
}
