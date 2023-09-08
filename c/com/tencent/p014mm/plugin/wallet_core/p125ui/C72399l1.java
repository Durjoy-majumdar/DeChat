package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import rt1.C22249a;
import vt1.C78473a;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.l1 */
public class C72399l1 implements C22249a {

    /* renamed from: a */
    public final /* synthetic */ C72379f1 f210629a;

    public C72399l1(C72379f1 f1Var) {
        this.f210629a = f1Var;
    }

    public void onAuthCancel() {
        View view = this.f210629a.f210562d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onAuthFail(int i) {
        Log.m105925i("MicroMsg.WalletPwdDialog", "face id auth fail: %s, %s", Integer.valueOf(i), Integer.valueOf(this.f210629a.f210559X.f212573D));
        View view = this.f210629a.f210562d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthFail", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthFail", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f210629a.f210549M.setVisibility(8);
        this.f210629a.mo99739c();
        this.f210629a.f210559X.f212573D++;
    }

    public void onAuthSuccess(int i, int i2) {
        Log.m105924i("MicroMsg.WalletPwdDialog", "face id auth success");
        PayInfo payInfo = this.f210629a.f210559X;
        payInfo.f212603x = 1;
        payInfo.f212570A = "";
        payInfo.f212571B = "";
        try {
            JSONObject jSONObject = new JSONObject(((C78473a) C86709a0.m107533q(C78473a.class)).sw0());
            jSONObject.put("soter_type", ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91317G());
            this.f210629a.f210559X.f212576G = jSONObject.toString();
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.WalletPwdDialog", e, "", new Object[0]);
        }
        C72379f1 f1Var = this.f210629a;
        PayInfo payInfo2 = f1Var.f210559X;
        payInfo2.f212572C = i;
        payInfo2.f212573D = i2;
        f1Var.mo99740d();
    }
}
