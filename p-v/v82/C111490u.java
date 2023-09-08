package v82;

import android.view.View;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultiTalkControlIconLayout;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v82.u */
public final class C111490u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111474m f333785d;

    /* renamed from: e */
    public final /* synthetic */ MultiTalkControlIconLayout f333786e;

    public C111490u(C111474m mVar, MultiTalkControlIconLayout multiTalkControlIconLayout) {
        this.f333785d = mVar;
        this.f333786e = multiTalkControlIconLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$initNormalControl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f333785d.onClick(this.f333786e);
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$initNormalControl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
