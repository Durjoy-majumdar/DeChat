package pk2;

import android.view.View;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: pk2.q */
public final class C21992q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RtosWatchLoginUI f62246d;

    public C21992q(RtosWatchLoginUI rtosWatchLoginUI) {
        this.f62246d = rtosWatchLoginUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$switchStatusView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f62246d.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$switchStatusView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
