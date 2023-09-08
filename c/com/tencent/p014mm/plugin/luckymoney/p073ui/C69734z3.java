package com.tencent.p014mm.plugin.luckymoney.p073ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.z3 */
public class C69734z3 extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI f201162d;

    public C69734z3(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        this.f201162d = luckyMoneyPickEnvelopeUI;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$20", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            int E = this.f201162d.f200551p.mo16959E();
            Log.m105919d("MicroMsg.LuckyMoneyPickEnvelopeUI", "trigger load more, isLoading:%s, hasMore：%s, count：%s,pos：%s", Boolean.valueOf(this.f201162d.f200560x), Integer.valueOf(this.f201162d.f200561y), Integer.valueOf(this.f201162d.f200553q.getItemCount() - 1), Integer.valueOf(E));
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f201162d;
            if (!luckyMoneyPickEnvelopeUI.f200560x && luckyMoneyPickEnvelopeUI.f200561y == 1 && E == luckyMoneyPickEnvelopeUI.f200553q.getItemCount() - 1) {
                this.f201162d.mo95737M7(false);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$20", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$20", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$20", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
