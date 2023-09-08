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

/* renamed from: df2.c */
public class C75377c implements Preference.C44715b {

    /* renamed from: a */
    public final /* synthetic */ C76160m f221618a;

    /* renamed from: b */
    public final /* synthetic */ C72996z1 f221619b;

    /* renamed from: c */
    public final /* synthetic */ C76159l f221620c;

    /* renamed from: d */
    public final /* synthetic */ Context f221621d;

    public C75377c(C76160m mVar, C72996z1 z1Var, C76159l lVar, Context context) {
        this.f221618a = mVar;
        this.f221619b = z1Var;
        this.f221620c = lVar;
        this.f221621d = context;
    }

    /* renamed from: a */
    public boolean mo24588a(Preference preference) {
        String str = this.f221618a.f223094e;
        try {
            str = new JSONObject(this.f221618a.f223094e).optString("tel");
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", e, "OpenIMCustomDetail.OPENIM_ACTION_DIAL_PHONE click parse error", new Object[0]);
        }
        C115669n.INSTANCE.mo160131h(15319, this.f221619b.mo73980x2(), Integer.valueOf(this.f221618a.f223093d), this.f221620c.f223088a);
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str));
        intent.setFlags(268435456);
        Context context = this.f221621d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$2", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$2", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
