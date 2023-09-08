package tj1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;

/* renamed from: tj1.l */
public final class C13956l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveGiftTagView f39198d;

    /* renamed from: e */
    public final /* synthetic */ int f39199e;

    /* renamed from: f */
    public final /* synthetic */ C13957m f39200f;

    public C13956l(FinderLiveGiftTagView finderLiveGiftTagView, int i, C13957m mVar) {
        this.f39198d = finderLiveGiftTagView;
        this.f39199e = i;
        this.f39200f = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f39198d.setSelectedTabIndex(this.f39199e);
        this.f39200f.notifyDataSetChanged();
        int i = this.f39199e;
        int i2 = 0;
        if (i == 0) {
            C32226l<? super Integer, C13598b0> lVar = this.f39198d.f15189n;
            if (lVar != null) {
                lVar.invoke(0);
            }
        } else if (i > 0) {
            List<Integer> list = this.f39198d.f15186h;
            if (list != null) {
                i2 = list.get(i - 1).intValue();
            }
            C32226l<? super Integer, C13598b0> lVar2 = this.f39198d.f15189n;
            if (lVar2 != null) {
                lVar2.invoke(Integer.valueOf(i2));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
