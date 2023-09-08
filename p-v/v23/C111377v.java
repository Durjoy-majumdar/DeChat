package v23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v23.v */
public final class C111377v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111369t f333432d;

    public C111377v(C111369t tVar) {
        this.f333432d = tVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorTrackEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f333432d.f333410f.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorTrackEditPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
