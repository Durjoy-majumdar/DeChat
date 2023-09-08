package ow2;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: ow2.a */
public final class C77042a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77044c f225051d;

    public C77042a(C77044c cVar) {
        this.f225051d = cVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog$initDelBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> aVar = this.f225051d.f225068w;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f225051d.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryDeleteDialog$initDelBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
