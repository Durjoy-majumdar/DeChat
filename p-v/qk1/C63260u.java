package qk1;

import android.view.View;
import cj1.C54785k6;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C63257t;

/* renamed from: qk1.u */
public final class C63260u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63257t.C63258a f179527d;

    /* renamed from: e */
    public final /* synthetic */ C63257t f179528e;

    /* renamed from: f */
    public final /* synthetic */ int f179529f;

    public C63260u(C63257t.C63258a aVar, C63257t tVar, int i) {
        this.f179527d = aVar;
        this.f179528e = tVar;
        this.f179529f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongAddAdapter$bindSong$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f179527d.f179523D.setText("");
        C54785k6 k6Var = this.f179528e.f179507g.get(this.f179529f);
        k6Var.getClass();
        k6Var.f153566a = "";
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongAddAdapter$bindSong$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
