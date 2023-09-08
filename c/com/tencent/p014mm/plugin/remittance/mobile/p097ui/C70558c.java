package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord;
import com.tencent.p014mm.plugin.remittance.mobile.p097ui.MobileRemitHistoryRecodUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.c */
public class C70558c extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ MobileRemitHistoryRecodUI f204018d;

    public C70558c(MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI) {
        this.f204018d = mobileRemitHistoryRecodUI;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        Log.m105919d("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "mHistroyRecordRv onScrollStateChanged() newState:%s mLastVisibleItem:%s isFinish:%s itemCount:%s", Integer.valueOf(i), Integer.valueOf(this.f204018d.f203851o), Boolean.valueOf(this.f204018d.f203850n.f203861d), Integer.valueOf(this.f204018d.f203850n.getItemCount()));
        if (i == 0) {
            MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = this.f204018d;
            MobileRemitHistoryRecodUI.C70528f fVar = mobileRemitHistoryRecodUI.f203850n;
            if (!fVar.f203861d && mobileRemitHistoryRecodUI.f203851o + 1 == fVar.getItemCount()) {
                MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI2 = this.f204018d;
                Log.m105925i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "doFetchHistoryRecord() mLastId:%s", mobileRemitHistoryRecodUI2.f203846g);
                mobileRemitHistoryRecodUI2.doSceneProgress(new NetSceneMobileRemitGetRecord(mobileRemitHistoryRecodUI2.f203846g, mobileRemitHistoryRecodUI2.f203845f), false);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI = this.f204018d;
        mobileRemitHistoryRecodUI.f203851o = mobileRemitHistoryRecodUI.f203849j.mo16959E();
        C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
