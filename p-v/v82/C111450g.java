package v82;

import android.view.View;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.CollapseView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v82.g */
public class C111450g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CollapseView f333675d;

    public C111450g(CollapseView collapseView) {
        this.f333675d = collapseView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f333675d.f314976y) {
            if (C105851w0.zx0().mo150670m().mo150708j()) {
                C105853x.f314831i++;
            }
            CollapseView collapseView = this.f333675d;
            collapseView.f314976y = false;
            collapseView.mo150913g();
            this.f333675d.mo150912f();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
