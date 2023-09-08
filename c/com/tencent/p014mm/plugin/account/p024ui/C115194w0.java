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

/* renamed from: com.tencent.mm.plugin.account.ui.w0 */
public class C115194w0 implements MMHandlerThread.IWaitWorkThread {

    /* renamed from: a */
    public JSONObject f345238a = null;

    /* renamed from: b */
    public final /* synthetic */ MMFBLoginUI f345239b;

    public C115194w0(MMFBLoginUI mMFBLoginUI) {
        this.f345239b = mMFBLoginUI;
    }

    public boolean doInBackground() {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "name,picture.type(large)");
        try {
            String f = this.f345239b.f344656d.mo177422f("me", bundle, "GET");
            Log.m105925i("MicroMsg.FacebookLoginUI", "result json %s", f);
            this.f345238a = new JSONObject(f);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FacebookLoginUI", e, "get name and picture error!", new Object[0]);
            C76879j.m92748s(this.f345239b, "Retrieve Failed, Error Format!", "");
        }
        return true;
    }

    public boolean onPostExecute() {
        if (this.f345238a == null) {
            return true;
        }
        try {
            Intent intent = new Intent(this.f345239b, RegByMobileRegAIOUI.class);
            intent.putExtra("third_app_token", this.f345239b.f344656d.f348440a.toString());
            intent.putExtra("register_title", this.f345239b.getString(C0966R.string.f360323bv3));
            intent.putExtra("register_nick_name", this.f345238a.getString("name"));
            intent.putExtra("register_avatar", ((JSONObject) this.f345238a.get("picture")).getJSONObject("data").getString("url"));
            MMFBLoginUI mMFBLoginUI = this.f345239b;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(mMFBLoginUI, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MMFBLoginUI$2", "onPostExecute", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMFBLoginUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMFBLoginUI, "com/tencent/mm/plugin/account/ui/MMFBLoginUI$2", "onPostExecute", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ThirdAppRegisterStruct thirdAppRegisterStruct = this.f345239b.f344662j;
            thirdAppRegisterStruct.f343856d = 1;
            thirdAppRegisterStruct.f343857e = 4;
            thirdAppRegisterStruct.mo86054n();
            this.f345239b.finish();
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FacebookLoginUI", e, "parse json error!", new Object[0]);
            C76879j.m92748s(this.f345239b, "Retrieve Failed, Error Format!", "");
            return true;
        }
    }
}
