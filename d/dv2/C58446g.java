package dv2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.List;
import sx3.C64186f0;

/* renamed from: dv2.g */
public final class C58446g extends C58442c {
    /* renamed from: c */
    public List<C58445f> mo83397c() {
        SnsMethodCalculate.markStartTimeMs("createSelectVisibleGroupHeaders", "com.tencent.mm.plugin.sns.ui.visiblerange.SnsSelectVisibleResCollector");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C58444e(2, 0, C0966R.string.f361379mz3, C0966R.string.mz7));
        arrayList.add(new C58444e(2, 1, C0966R.string.myy, C0966R.string.jdr));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C58444e(3, 0, C0966R.string.f361379mz3, C0966R.string.mz6));
        arrayList2.add(new C58444e(3, 1, C0966R.string.myy, C0966R.string.jdi));
        ArrayList arrayList3 = new ArrayList();
        C64186f0 f0Var = C64186f0.f181907d;
        arrayList3.add(new C58445f(0, C0966R.string.jdw, C0966R.string.jdx, f0Var));
        arrayList3.add(new C58445f(1, C0966R.string.jdu, C0966R.string.jdv, f0Var));
        arrayList3.add(new C58445f(2, C0966R.string.jdq, C0966R.string.jdr, arrayList));
        arrayList3.add(new C58445f(3, C0966R.string.jdh, C0966R.string.jdi, arrayList2));
        SnsMethodCalculate.markEndTimeMs("createSelectVisibleGroupHeaders", "com.tencent.mm.plugin.sns.ui.visiblerange.SnsSelectVisibleResCollector");
        return arrayList3;
    }
}
