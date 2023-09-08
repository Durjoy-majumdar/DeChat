package fk3;

import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p248ug.C65347o0;

/* renamed from: fk3.f */
public final class C59139f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C59141h f169144d;

    public C59139f(C59141h hVar) {
        this.f169144d = hVar;
    }

    public final void onClick(View view) {
        Class cls = C65347o0.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C59141h hVar = this.f169144d;
        if (hVar.f169149d) {
            C97886b bVar = C97886b.f287172a;
            bVar.mo137235v(hVar.f169147b);
            C97886b.f287174c = "";
            C97886b.f287175d = hVar.f169153h;
            ((C65347o0) C86312j.m106911c(cls)).mo89079oA(hVar.f169146a, bVar);
        } else {
            hVar.mo84357d();
        }
        ((C65347o0) C86312j.m106911c(cls)).mo89074NX(2);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
