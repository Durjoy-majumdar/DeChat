package aa2;

import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.xweb.util.WXWebReporter;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: aa2.j */
public final class C112778j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C112765c f337693d;

    public C112778j(C112765c cVar) {
        this.f337693d = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f337693d.mo164523n3(false, true);
        C39622i0 a = C39818r.f106831a.mo62444c(this.f337693d.getActivity()).mo75002a(MultiTaskUIC.class);
        C87412m.m108593f(a, "of(activity).get(MultiTaskUIC::class.java)");
        MultiTaskUIC.m162482m3((MultiTaskUIC) a, true, true, false, false, false, false, false, false, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
