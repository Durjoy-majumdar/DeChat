package rv2;

import android.view.View;
import com.tencent.p014mm.plugin.soter.p322ui.SoterTestUI;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import j20.C117292a;
import java.util.ArrayList;
import lt3.C21460a;

/* renamed from: rv2.f */
public class C118241f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SoterTestUI f353420d;

    public C118241f(SoterTestUI soterTestUI) {
        this.f353420d = soterTestUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/soter/ui/SoterTestUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f353420d.f347297o.setText(C21460a.m24284r("sample_auth_key_name", false).mo34909a() ? StateEvent.ActionValue.STAGE_PASS : "not passed");
        C117292a.m165361g(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
