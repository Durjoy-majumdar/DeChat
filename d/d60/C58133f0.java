package d60;

import android.os.Bundle;
import android.view.View;
import d60.C58124b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: d60.f0 */
public final class C58133f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58130e0 f166537d;

    public C58133f0(C58130e0 e0Var) {
        this.f166537d = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/plugin/LiveHostRightPanelPlugin$setupForHost$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f166537d.f166523f.statusChange(C58124b.C58125b.SHARE_LIVE, new Bundle());
        C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveHostRightPanelPlugin$setupForHost$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
