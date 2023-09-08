package v82;

import android.view.View;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v82.m0 */
public final class C111479m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111456j0 f333769d;

    public C111479m0(C111456j0 j0Var) {
        this.f333769d = j0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$hideScreenCastBigVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f333769d.getClass();
        Log.m105924i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "onMiniMultitalkClicked");
        C105853x.f314823a++;
        C105851w0.zx0().mo150626C(true);
        C105853x.m142230a(8);
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$hideScreenCastBigVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
