package yz2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39688b;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusHistoryUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.i2 */
public final class C53683i2 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ LinearLayoutManager f150767d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusHistoryUI f150768e;

    public C53683i2(LinearLayoutManager linearLayoutManager, TextStatusHistoryUI textStatusHistoryUI) {
        this.f150767d = linearLayoutManager;
        this.f150768e = textStatusHistoryUI;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusHistoryUI$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (this.f150767d.mo16959E() >= this.f150767d.getItemCount() - 5) {
            C39688b bVar = this.f150768e.f116927g;
            if (bVar != null) {
                bVar.mo62268b();
            } else {
                C87412m.m108603p("dataLoader");
                throw null;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusHistoryUI$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusHistoryUI$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusHistoryUI$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
