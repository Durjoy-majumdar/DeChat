package st1;

import android.view.View;
import android.widget.CheckBox;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77390c0;

/* renamed from: st1.l0 */
public class C77769l0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBox f226608d;

    /* renamed from: e */
    public final /* synthetic */ C77390c0 f226609e;

    public C77769l0(C77762i0 i0Var, CheckBox checkBox, C77390c0 c0Var) {
        this.f226608d = checkBox;
        this.f226609e = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.WalletSoterService", "click cancel btn");
        if (this.f226608d.isChecked()) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_IN_TRANSPARENT_NEW_BOOLEAN_SYNC, Boolean.TRUE);
        }
        this.f226609e.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
