package st1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import qo3.C77390c0;

/* renamed from: st1.j0 */
public class C77765j0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f226597d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f226598e;

    /* renamed from: f */
    public final /* synthetic */ C77390c0 f226599f;

    public C77765j0(C77762i0 i0Var, Activity activity, Bundle bundle, C77390c0 c0Var) {
        this.f226597d = activity;
        this.f226598e = bundle;
        this.f226599f = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WalletSoterService", "click faceid btn");
        Intent intent = new Intent(this.f226597d, WalletFaceIdAuthUI.class);
        intent.putExtra("pwd", this.f226598e.getString("key_pwd1"));
        intent.putExtra("key_scene", 1);
        Activity activity = this.f226597d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f226599f.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
