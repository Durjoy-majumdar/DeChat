package rv2;

import android.view.View;
import com.tencent.p014mm.plugin.soter.p322ui.SoterTestUI;
import j20.C117292a;
import java.util.ArrayList;
import rt3.C22252b;

/* renamed from: rv2.a */
public class C118236a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SoterTestUI f353415d;

    public C118236a(SoterTestUI soterTestUI) {
        this.f353415d = soterTestUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/soter/ui/SoterTestUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f353415d.f347297o.setText(C22252b.m25806c() ? "passed" : "not support");
        C117292a.m165361g(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
