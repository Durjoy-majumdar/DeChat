package v23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v23.b */
public final class C111345b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111333a f333352d;

    public C111345b(C111333a aVar) {
        this.f333352d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$checkInit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C111333a aVar = this.f333352d;
        aVar.f333337w = false;
        aVar.f333324g.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$checkInit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
