package gt0;

import android.view.View;
import gt0.C87330d0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gt0.f0 */
public final class C87346f0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C87330d0.C87337f f253137d;

    /* renamed from: e */
    public final /* synthetic */ C87330d0.C87331a f253138e;

    /* renamed from: f */
    public final /* synthetic */ int f253139f;

    public C87346f0(C87330d0.C87337f fVar, C87330d0.C87331a aVar, int i) {
        this.f253137d = fVar;
        this.f253138e = aVar;
        this.f253139f = i;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        C87330d0.C87337f fVar = this.f253137d;
        C87330d0.C87333c cVar = fVar.f253119B.f253101f;
        if (cVar != null) {
            cVar.mo114556a(fVar.f253120z, this.f253138e, this.f253139f);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/widget/dialog/AuthorizeOptionalListAdapter$ViewHolder$applyData$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
