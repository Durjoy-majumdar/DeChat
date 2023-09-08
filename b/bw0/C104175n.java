package bw0;

import android.view.View;
import com.tencent.p014mm.plugin.ball.view.FloatMenuView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import yv0.C112506c;

/* renamed from: bw0.n */
public class C104175n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FloatMenuView f308416d;

    public C104175n(FloatMenuView floatMenuView) {
        this.f308416d = floatMenuView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/view/FloatMenuView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Iterator it = ((CopyOnWriteArraySet) this.f308416d.f312041j).iterator();
        while (it.hasNext()) {
            ((C112506c) it.next()).mo149207b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/view/FloatMenuView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
