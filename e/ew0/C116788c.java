package ew0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.matrix.batterycanary.stats.p1183ui.C114594b;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;
import j20.C117292a;
import java.util.ArrayList;
import p933be.C79691a;

/* renamed from: ew0.c */
public class C116788c extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ LinearLayoutManager f350114d;

    /* renamed from: e */
    public final /* synthetic */ MMBatteryStatsActivity f350115e;

    public C116788c(MMBatteryStatsActivity mMBatteryStatsActivity, LinearLayoutManager linearLayoutManager) {
        this.f350115e = mMBatteryStatsActivity;
        this.f350114d = linearLayoutManager;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        super.onScrollStateChanged(recyclerView, i);
        C117292a.m165361g(this, "com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        int C = this.f350114d.mo16957C();
        MMBatteryStatsActivity mMBatteryStatsActivity = this.f350115e;
        int i3 = MMBatteryStatsActivity.f345515j;
        mMBatteryStatsActivity.mo175079I7(C);
        if (this.f350114d.mo16959E() == ((ArrayList) this.f350115e.f345516d.f343428a.f343382d).size() - 1) {
            C116790e eVar = this.f350115e.f345516d;
            if (Math.abs(eVar.f343431d) >= eVar.f343429b) {
                z = false;
            } else {
                int i4 = eVar.f343431d - 1;
                eVar.f343431d = i4;
                C79691a.m96805b(C114572i.class, new C114594b(eVar, i4));
                z = true;
            }
            if (!z) {
                MMBatteryStatsActivity mMBatteryStatsActivity2 = this.f350115e;
                if (!mMBatteryStatsActivity2.f345521i) {
                    mMBatteryStatsActivity2.f345521i = true;
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
