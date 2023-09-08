package qj1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import sk1.C63959n;

/* renamed from: qj1.cb */
public final class C62673cb implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63959n f177960d;

    /* renamed from: e */
    public final /* synthetic */ C12925w f177961e;

    /* renamed from: f */
    public final /* synthetic */ C62651bb f177962f;

    public C62673cb(C63959n nVar, C12925w wVar, C62651bb bbVar) {
        this.f177960d = nVar;
        this.f177961e = wVar;
        this.f177962f = bbVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$1$2$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f177960d.f181311s.f185504g;
        if (str != null) {
            C62651bb.m73629a(this.f177962f, str);
        }
        this.f177961e.mo5085n();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$1$2$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
