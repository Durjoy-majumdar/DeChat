package df2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import he0.C76159l;
import he0.C76160m;
import j20.C117292a;
import k20.C9556a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: df2.d */
public class C75378d implements Preference.C44715b {

    /* renamed from: a */
    public final /* synthetic */ C76160m f221622a;

    /* renamed from: b */
    public final /* synthetic */ C72996z1 f221623b;

    /* renamed from: c */
    public final /* synthetic */ C76159l f221624c;

    /* renamed from: d */
    public final /* synthetic */ Context f221625d;

    public C75378d(C76160m mVar, C72996z1 z1Var, C76159l lVar, Context context) {
        this.f221622a = mVar;
        this.f221623b = z1Var;
        this.f221624c = lVar;
        this.f221625d = context;
    }

    /* renamed from: a */
    public boolean mo24588a(Preference preference) {
        String str;
        try {
            str = new JSONObject(this.f221622a.f223094e).optString("mailto");
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", e, "loadProfile", new Object[0]);
            str = "";
        }
        C115669n.INSTANCE.mo160131h(15319, this.f221623b.mo73980x2(), Integer.valueOf(this.f221622a.f223093d), this.f221624c.f223088a);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + str));
        try {
            Context context = this.f221625d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$3", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$3", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.Profile.OpenIMProfileLogic", "onPreferenceClick OPENIM_ACTION_OPEN_MAIL_BOX Exception:%s %s", e2.getClass().getSimpleName(), e2.getMessage());
        }
        return true;
    }
}
