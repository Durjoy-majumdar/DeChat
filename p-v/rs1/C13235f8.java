package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rs1.f8 */
public final class C13235f8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C56711j f37586d;

    public C13235f8(C56711j jVar) {
        this.f37586d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f37586d.mo80098l3();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
