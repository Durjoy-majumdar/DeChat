package yz2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.e0 */
public final class C16084e0 implements View.OnClickListener {

    /* renamed from: d */
    public static final C16084e0 f43231d = new C16084e0();

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusCardDialog$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.kin) {
            Log.m105918d("MicroMsg.TextStatus.TextStatusCardDialog", "clickcardview called");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardDialog$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
