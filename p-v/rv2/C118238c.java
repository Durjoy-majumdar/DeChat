package rv2;

import android.view.View;
import com.tencent.p014mm.plugin.soter.p322ui.SoterTestUI;
import j20.C117292a;
import java.util.ArrayList;
import lt3.C21460a;

/* renamed from: rv2.c */
public class C118238c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SoterTestUI f353417d;

    public C118238c(SoterTestUI soterTestUI) {
        this.f353417d = soterTestUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/soter/ui/SoterTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f353417d.f347297o.setText(C21460a.m24283q().mo34909a() ? "passed" : "not passed");
        C117292a.m165361g(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
