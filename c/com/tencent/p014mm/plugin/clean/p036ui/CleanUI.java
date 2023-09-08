package com.tencent.p014mm.plugin.clean.p036ui;

import android.content.Intent;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import j20.C117292a;
import k20.C9556a;
import nj3.C88989a;
import org.json.JSONException;
import org.json.JSONObject;
import p823sg.C90193h;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.clean.ui.CleanUI */
public class CleanUI extends MMActivity {

    /* renamed from: d */
    public String f12163d = "com.tencent.qqpimsecure";

    /* renamed from: e */
    public String f12164e = "00B1208638DE0FCD3E920886D658DAF6";

    /* renamed from: f */
    public String f12165f = "11206657";

    /* renamed from: g */
    public JSONObject f12166g;

    static {
        WeChatHosts.domainString(C0966R.string.fmp);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7008us;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        Signature[] a;
        Signature signature;
        String f;
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("had_detected_no_sdcard_space", false)) {
            String str = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CLEANUI_QQMGRINFO_STRING, "");
            if (!Util.isNullOrNil(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.f12166g = jSONObject;
                    this.f12163d = jSONObject.getString("packageName");
                    this.f12166g.get("md5");
                    this.f12165f = this.f12166g.getString("launcherID");
                    this.f12164e = this.f12166g.getString("signature");
                    this.f12166g.get("url");
                    this.f12166g.getLong("size");
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.CleanUI", e, "", new Object[0]);
                }
            }
            if (!C72688j0.m85020f(getContext(), this.f12163d) || (a = C6647c.m6936a(this, this.f12163d)) == null || (signature = a[0]) == null || (f = C90193h.m112878f(signature.toByteArray())) == null || !f.equalsIgnoreCase(this.f12164e)) {
                z = false;
            } else {
                z = true;
                try {
                    Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(this.f12163d);
                    if (launchIntentForPackage != null) {
                        Bundle bundle2 = new Bundle();
                        C72688j0.m85023i(bundle2, this.f12165f);
                        launchIntentForPackage.putExtras(bundle2);
                        launchIntentForPackage.addFlags(268435456);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(launchIntentForPackage);
                        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/clean/ui/CleanUI", "jumpToQQMgrApp", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/clean/ui/CleanUI", "jumpToQQMgrApp", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        C115669n.INSTANCE.idkeyStat(282, 6, 1, false);
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.CleanUI", e2, "", new Object[0]);
                }
            }
            if (z) {
                finish();
                return;
            }
        }
        Intent intent = new Intent(this, CleanNewUI.class);
        intent.putExtras(getIntent());
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/clean/ui/CleanUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/clean/ui/CleanUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }
}
