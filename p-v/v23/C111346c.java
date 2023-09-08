package v23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v23.c */
public final class C111346c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111333a f333353d;

    public C111346c(C111333a aVar) {
        this.f333353d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C111333a aVar = this.f333353d;
        aVar.f333337w = true;
        aVar.f333324g.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorCompositionEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
