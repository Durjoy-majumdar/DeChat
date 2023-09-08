package v23;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v23.k */
public final class C111361k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111353i f333393d;

    public C111361k(C111353i iVar) {
        this.f333393d = iVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorEffectTimeCropPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f333393d.f333372f.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorEffectTimeCropPlugin$checkInit$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
