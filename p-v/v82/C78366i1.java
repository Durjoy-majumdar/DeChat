package v82;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.C105895a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v82.i1 */
public class C78366i1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105895a f229644d;

    public C78366i1(C105895a aVar) {
        this.f229644d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f229644d.f315047d.findViewById(C0966R.C0970id.has) != null) {
            this.f229644d.f315047d.mo150873V(1);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
