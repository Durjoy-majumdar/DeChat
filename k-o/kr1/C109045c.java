package kr1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kr1.c */
public final class C109045c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C109039b f326581d;

    public C109045c(C109039b bVar) {
        this.f326581d = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin$setupSettingView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f326581d.f326569n.setShow(false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin$setupSettingView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
