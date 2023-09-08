package rv2;

import android.view.View;
import com.tencent.p014mm.plugin.soter.p322ui.SoterTestUI;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import j20.C117292a;
import java.util.ArrayList;
import lt3.C21460a;
import ot3.C21881e;
import ot3.C21885g;
import pt3.C22005b;

/* renamed from: rv2.e */
public class C118240e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SoterTestUI f353419d;

    public C118240e(SoterTestUI soterTestUI) {
        this.f353419d = soterTestUI;
    }

    public void onClick(View view) {
        C21885g gVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/soter/ui/SoterTestUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C22005b bVar = C21460a.f60758c;
        if (bVar == null) {
            C21881e.m25083b("Soter.SoterCore", "soter: generateAuthKey IMPL is null, not support soter", new Object[0]);
            gVar = new C21885g(2);
        } else {
            gVar = bVar.mo35101c("sample_auth_key_name");
        }
        this.f353419d.f347297o.setText(gVar.mo34909a() ? StateEvent.ActionValue.STAGE_PASS : "not passed");
        C117292a.m165361g(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
