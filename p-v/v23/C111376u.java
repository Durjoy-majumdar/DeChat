package v23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v23.u */
public final class C111376u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111369t f333431d;

    public C111376u(C111369t tVar) {
        this.f333431d = tVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorTrackEditPlugin$checkInit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C111369t tVar = this.f333431d;
        tVar.f333420s = tVar.f333418q;
        tVar.f333421t = tVar.f333419r;
        tVar.f333410f.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorTrackEditPlugin$checkInit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
