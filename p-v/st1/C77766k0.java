package st1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import qo3.C77390c0;
import yq3.C79148e;

/* renamed from: st1.k0 */
public class C77766k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79148e f226600d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f226601e;

    /* renamed from: f */
    public final /* synthetic */ Activity f226602f;

    /* renamed from: g */
    public final /* synthetic */ C77390c0 f226603g;

    public C77766k0(C77762i0 i0Var, C79148e eVar, Bundle bundle, Activity activity, C77390c0 c0Var) {
        this.f226600d = eVar;
        this.f226601e = bundle;
        this.f226602f = activity;
        this.f226603g = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WalletSoterService", "click fingerprint btn");
        if (this.f226600d != null) {
            this.f226601e.putBoolean("key_show_guide", false);
            Intent intent = new Intent();
            intent.putExtras(this.f226601e);
            C88144b.m109791i(this.f226602f, FingerprintManagerProxy.FINGERPRINT_SERVICE, ".ui.FingerPrintAuthTransparentUI", intent, (Bundle) null);
        }
        this.f226603g.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
