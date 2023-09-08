package com.tencent.p014mm.plugin.luckymoney.p073ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import com.tencent.p014mm.plugin.luckymoney.scaledLayout.ScaleLayoutManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.q3 */
public class C69671q3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI f201062d;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.q3$a */
    public class C69672a extends RecyclerView.C0130p {
        public C69672a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$11$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = C69671q3.this.f201062d;
                if (!luckyMoneyPickEnvelopeUI.f200552p0 && (i2 = luckyMoneyPickEnvelopeUI.f200557u) >= 0) {
                    C115669n.INSTANCE.mo160131h(19272, 1, C69671q3.this.f201062d.f200527K, ((LuckyMoneyPickEnvelopeUI.C69497p) ((ArrayList) luckyMoneyPickEnvelopeUI.f200555s).get(i2)).f200615b.f228202f);
                    C69671q3.this.f201062d.f200552p0 = true;
                }
                LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = C69671q3.this.f201062d;
                int i3 = luckyMoneyPickEnvelopeUI2.f200557u;
                if (i3 >= 0) {
                    C77994sf2 sf22 = ((LuckyMoneyPickEnvelopeUI.C69497p) ((ArrayList) luckyMoneyPickEnvelopeUI2.f200555s).get(i3)).f200615b;
                    if (sf22.f228208o == 3) {
                        C115669n.INSTANCE.mo160131h(22104, sf22.f228202f, 2);
                    }
                }
                C69671q3.this.f201062d.mo95746V7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$11$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$11$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            int E = C69671q3.this.f201062d.f200547i.mo16959E();
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = C69671q3.this.f201062d;
            if (!luckyMoneyPickEnvelopeUI.f200560x && luckyMoneyPickEnvelopeUI.f200561y == 1 && E == luckyMoneyPickEnvelopeUI.f200548j.getItemCount() - 1) {
                Log.m105919d("MicroMsg.LuckyMoneyPickEnvelopeUI", "trigger load more: %s", Integer.valueOf(E));
                C69671q3.this.f201062d.mo95737M7(false);
            }
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = C69671q3.this.f201062d;
            int N0 = C69671q3.this.f201062d.f200546h.mo17029N0(luckyMoneyPickEnvelopeUI2.f200519C.mo80268n(luckyMoneyPickEnvelopeUI2.f200547i));
            C69671q3.this.f201062d.getClass();
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI3 = C69671q3.this.f201062d;
            if (N0 != luckyMoneyPickEnvelopeUI3.f200557u && N0 >= 0 && N0 < ((ArrayList) luckyMoneyPickEnvelopeUI3.f200555s).size()) {
                LuckyMoneyPickEnvelopeUI.C69497p pVar = (LuckyMoneyPickEnvelopeUI.C69497p) ((ArrayList) C69671q3.this.f201062d.f200555s).get(N0);
                C77994sf2 sf22 = pVar.f200615b;
                if (sf22 == null || !(sf22.f228205i == 1 || sf22.f228209p == 1)) {
                    if (pVar.f200616c) {
                        C69671q3.this.f201062d.f200557u = -2;
                    } else if (!pVar.f200614a) {
                        Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do select pos: %s", Integer.valueOf(N0));
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI4 = C69671q3.this.f201062d;
                        int i3 = luckyMoneyPickEnvelopeUI4.f200557u;
                        if (i3 >= 0 && i3 < ((ArrayList) luckyMoneyPickEnvelopeUI4.f200555s).size()) {
                            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI5 = C69671q3.this.f201062d;
                            ((LuckyMoneyPickEnvelopeUI.C69497p) ((ArrayList) luckyMoneyPickEnvelopeUI5.f200555s).get(luckyMoneyPickEnvelopeUI5.f200557u)).f200614a = false;
                            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI6 = C69671q3.this.f201062d;
                            luckyMoneyPickEnvelopeUI6.mo95744T7(luckyMoneyPickEnvelopeUI6.f200557u, false);
                        }
                        pVar.f200614a = true;
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI7 = C69671q3.this.f201062d;
                        luckyMoneyPickEnvelopeUI7.f200557u = N0;
                        luckyMoneyPickEnvelopeUI7.mo95744T7(N0, true);
                    } else {
                        pVar.f200614a = false;
                        C69671q3.this.f201062d.f200557u = -1;
                    }
                    Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "post run finalSelect : %s lastSelect:%s", Integer.valueOf(N0), Integer.valueOf(E));
                } else {
                    Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "expired: %s", Integer.valueOf(N0));
                    LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI8 = C69671q3.this.f201062d;
                    int i4 = luckyMoneyPickEnvelopeUI8.f200557u;
                    if (i4 >= 0 && i4 < ((ArrayList) luckyMoneyPickEnvelopeUI8.f200555s).size()) {
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI9 = C69671q3.this.f201062d;
                        ((LuckyMoneyPickEnvelopeUI.C69497p) ((ArrayList) luckyMoneyPickEnvelopeUI9.f200555s).get(luckyMoneyPickEnvelopeUI9.f200557u)).f200614a = false;
                        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI10 = C69671q3.this.f201062d;
                        luckyMoneyPickEnvelopeUI10.mo95744T7(luckyMoneyPickEnvelopeUI10.f200557u, false);
                        C69671q3.this.f201062d.f200557u = -1;
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$11$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                    return;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$11$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C69671q3(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        this.f201062d = luckyMoneyPickEnvelopeUI;
    }

    public void run() {
        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f201062d;
        int i = luckyMoneyPickEnvelopeUI.f200557u;
        if (i >= 0 && i < luckyMoneyPickEnvelopeUI.f200548j.getItemCount()) {
            Log.m105925i("MicroMsg.LuckyMoneyPickEnvelopeUI", "normal scroll，pos: %s", Integer.valueOf(this.f201062d.f200557u));
            LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = this.f201062d;
            LuckyMoneyEnvelopeTouchRecyclerView luckyMoneyEnvelopeTouchRecyclerView = luckyMoneyPickEnvelopeUI2.f200546h;
            ScaleLayoutManager scaleLayoutManager = luckyMoneyPickEnvelopeUI2.f200547i;
            int h0 = scaleLayoutManager.mo23964h0(luckyMoneyPickEnvelopeUI2.f200557u);
            if (scaleLayoutManager.f53140y == 1) {
                luckyMoneyEnvelopeTouchRecyclerView.scrollBy(0, h0);
            } else {
                luckyMoneyEnvelopeTouchRecyclerView.scrollBy(h0, 0);
            }
        }
        Math.max(this.f201062d.f200557u, 0);
        this.f201062d.getClass();
        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI3 = this.f201062d;
        RecyclerView.C0130p pVar = luckyMoneyPickEnvelopeUI3.f200523G;
        if (pVar == null) {
            luckyMoneyPickEnvelopeUI3.f200523G = new C69672a();
        } else {
            luckyMoneyPickEnvelopeUI3.f200546h.mo17098m1(pVar);
        }
        LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI4 = this.f201062d;
        luckyMoneyPickEnvelopeUI4.f200546h.mo17043c(luckyMoneyPickEnvelopeUI4.f200523G);
    }
}
