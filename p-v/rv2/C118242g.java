package rv2;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.soter.p322ui.SoterTestUI;
import j20.C117292a;
import java.util.ArrayList;
import lt3.C21460a;
import ot3.C117897l;

/* renamed from: rv2.g */
public class C118242g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SoterTestUI f353421d;

    public C118242g(SoterTestUI soterTestUI) {
        this.f353421d = soterTestUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/soter/ui/SoterTestUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117897l e = C21460a.m24271e("sample_auth_key_name");
        if (e == null) {
            this.f353421d.f347297o.setText("not passed: no certificate");
            C117292a.m165361g(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        TextView textView = this.f353421d.f347297o;
        textView.setText("model available: " + e.toString());
        C117292a.m165361g(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
