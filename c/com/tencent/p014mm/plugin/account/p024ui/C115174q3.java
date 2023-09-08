package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.account.ui.q3 */
public class C115174q3 implements MMHandlerThread.IWaitWorkThread {

    /* renamed from: a */
    public JSONObject f345220a = null;

    /* renamed from: b */
    public final /* synthetic */ WelcomeActivity f345221b;

    public C115174q3(WelcomeActivity welcomeActivity) {
        this.f345221b = welcomeActivity;
    }

    public boolean doInBackground() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "name,picture.type(large)");
        try {
            String f = this.f345221b.f345074e.mo177422f("me", bundle, "GET");
            Log.m105925i("MicroMsg.WelcomeActivity", "result json %s", f);
            this.f345220a = new JSONObject(f);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WelcomeActivity", e, "get name and picture error!", new Object[0]);
            C76879j.m92748s(this.f345221b, "Retrieve Failed, Error Format!", "");
        }
        return true;
    }

    public boolean onPostExecute() {
        if (this.f345220a != null) {
            try {
                Intent intent = new Intent(this.f345221b, RegByMobileRegAIOUI.class);
                intent.putExtra("third_app_token", this.f345221b.f345074e.f348440a.toString());
                intent.putExtra("reg_3d_app_type", 1);
                intent.putExtra("register_title", this.f345221b.getString(C0966R.string.f360323bv3));
                intent.putExtra("register_nick_name", this.f345220a.getString("name"));
                intent.putExtra("register_avatar", ((JSONObject) this.f345220a.get("picture")).getJSONObject("data").getString("url"));
                intent.addFlags(603979776);
                WelcomeActivity welcomeActivity = this.f345221b;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(welcomeActivity, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/WelcomeActivity$8", "onPostExecute", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                welcomeActivity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(welcomeActivity, "com/tencent/mm/plugin/account/ui/WelcomeActivity$8", "onPostExecute", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                ThirdAppRegisterStruct thirdAppRegisterStruct = this.f345221b.f345075f;
                thirdAppRegisterStruct.f343856d = 1;
                thirdAppRegisterStruct.f343857e = 3;
                thirdAppRegisterStruct.mo86054n();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WelcomeActivity", e, "parse json error!", new Object[0]);
                C76879j.m92748s(this.f345221b, "Retrieve Failed, Error Format!", "");
            }
        }
        return true;
    }
}
