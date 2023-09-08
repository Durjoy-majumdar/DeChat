package qk1;

import android.view.View;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import qk1.C63257t;
import rx3.C13598b0;

/* renamed from: qk1.v */
public final class C63264v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63257t.C63258a f179541d;

    /* renamed from: e */
    public final /* synthetic */ C63257t f179542e;

    /* renamed from: f */
    public final /* synthetic */ int f179543f;

    public C63264v(C63257t.C63258a aVar, C63257t tVar, int i) {
        this.f179541d = aVar;
        this.f179542e = tVar;
        this.f179543f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongAddAdapter$bindSong$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f179541d.f179523D.setText("");
        this.f179542e.f179507g.remove(this.f179543f);
        C63257t tVar = this.f179542e;
        int i = tVar.f179514q;
        int i2 = this.f179543f;
        if (i == i2) {
            tVar.f179514q = -1;
        } else if (i > i2) {
            tVar.f179514q = i - 1;
        }
        tVar.notifyItemRemoved(i2);
        C63257t tVar2 = this.f179542e;
        tVar2.notifyItemRangeChanged(this.f179543f, tVar2.f179507g.size() - this.f179543f, this.f179542e.f179506f);
        C63257t tVar3 = this.f179542e;
        C32226l<? super Integer, C13598b0> lVar = tVar3.f179510j;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(tVar3.f179507g.size() - 1));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongAddAdapter$bindSong$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
