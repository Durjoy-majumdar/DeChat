package kq1;

import android.view.View;
import dr1.C7493o;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;
import te3.t54;

/* renamed from: kq1.i */
public final class C10393i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C10389f f31608d;

    /* renamed from: e */
    public final /* synthetic */ t54 f31609e;

    /* renamed from: f */
    public final /* synthetic */ C12925w f31610f;

    public C10393i(C10389f fVar, t54 t54, C12925w wVar) {
        this.f31608d = fVar;
        this.f31609e = t54;
        this.f31610f = wVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7493o oVar = this.f31608d.f31603g;
        if (oVar != null) {
            oVar.mo8632n(this.f31609e, true);
        }
        this.f31610f.mo5085n();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
