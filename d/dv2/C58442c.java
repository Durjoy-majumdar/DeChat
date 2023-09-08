package dv2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: dv2.c */
public abstract class C58442c {

    /* renamed from: a */
    public final C13601g f167419a = C36568h.m40985a(new C58443a(this));

    /* renamed from: dv2.c$a */
    public static final class C58443a extends C87413o implements C32224a<List<? extends C58445f>> {

        /* renamed from: d */
        public final /* synthetic */ C58442c f167420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58443a(C58442c cVar) {
            super(0);
            this.f167420d = cVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector$selectVisibleGroupHeaders$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector$selectVisibleGroupHeaders$2");
            List<C58445f> c = this.f167420d.mo83397c();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector$selectVisibleGroupHeaders$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector$selectVisibleGroupHeaders$2");
            return c;
        }
    }

    /* renamed from: a */
    public final boolean mo83395a(int i, int i2, int i3) {
        C58444e eVar;
        SnsMethodCalculate.markStartTimeMs("checkMatchChildKeyByChildPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        SnsMethodCalculate.markStartTimeMs("getChildKeyByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        SnsMethodCalculate.markStartTimeMs("findSelectVisibleChildItemByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        C58445f g = mo83401g(i);
        Integer num = null;
        if (g == null) {
            SnsMethodCalculate.markEndTimeMs("findSelectVisibleChildItemByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            eVar = null;
        } else {
            SnsMethodCalculate.markStartTimeMs("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            List<C58444e> list = g.f167428d;
            SnsMethodCalculate.markEndTimeMs("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            eVar = (C58444e) C110818d0.m150917O(list, i2);
            SnsMethodCalculate.markEndTimeMs("findSelectVisibleChildItemByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        }
        if (eVar != null) {
            SnsMethodCalculate.markStartTimeMs("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            int i4 = eVar.f167422b;
            SnsMethodCalculate.markEndTimeMs("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            num = Integer.valueOf(i4);
        }
        SnsMethodCalculate.markEndTimeMs("getChildKeyByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        boolean z = num != null && i3 == num.intValue();
        SnsMethodCalculate.markEndTimeMs("checkMatchChildKeyByChildPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return z;
    }

    /* renamed from: b */
    public final boolean mo83396b(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("checkMatchTargetVisibilityByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        boolean z = mo83404j(i) == i2;
        SnsMethodCalculate.markEndTimeMs("checkMatchTargetVisibilityByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return z;
    }

    /* renamed from: c */
    public abstract List<C58445f> mo83397c();

    /* renamed from: d */
    public final int mo83398d(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("findChildSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        C58444e f = mo83400f(i, i2);
        if (f == null) {
            SnsMethodCalculate.markEndTimeMs("findChildSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            return 0;
        }
        SnsMethodCalculate.markStartTimeMs("getSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        int i3 = f.f167424d;
        SnsMethodCalculate.markEndTimeMs("getSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        SnsMethodCalculate.markEndTimeMs("findChildSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return i3;
    }

    /* renamed from: e */
    public final int mo83399e(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("findChildTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        C58444e f = mo83400f(i, i2);
        if (f == null) {
            SnsMethodCalculate.markEndTimeMs("findChildTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            return 0;
        }
        SnsMethodCalculate.markStartTimeMs("getTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        int i3 = f.f167423c;
        SnsMethodCalculate.markEndTimeMs("getTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        SnsMethodCalculate.markEndTimeMs("findChildTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return i3;
    }

    /* renamed from: f */
    public final C58444e mo83400f(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        C58445f g = mo83401g(i);
        if (g == null) {
            SnsMethodCalculate.markEndTimeMs("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            return null;
        }
        SnsMethodCalculate.markStartTimeMs("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        List<C58444e> list = g.f167428d;
        SnsMethodCalculate.markEndTimeMs("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        for (C58444e eVar : list) {
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            int i3 = eVar.f167422b;
            SnsMethodCalculate.markEndTimeMs("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            if (i3 == i2) {
                SnsMethodCalculate.markEndTimeMs("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
                return eVar;
            }
        }
        SnsMethodCalculate.markEndTimeMs("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return null;
    }

    /* renamed from: g */
    public final C58445f mo83401g(int i) {
        SnsMethodCalculate.markStartTimeMs("findSelectVisibleGroupHeaderItem", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        for (C58445f fVar : mo83403i()) {
            fVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            int i2 = fVar.f167425a;
            SnsMethodCalculate.markEndTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            if (i2 == i) {
                SnsMethodCalculate.markEndTimeMs("findSelectVisibleGroupHeaderItem", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
                return fVar;
            }
        }
        SnsMethodCalculate.markEndTimeMs("findSelectVisibleGroupHeaderItem", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return null;
    }

    /* renamed from: h */
    public final int mo83402h(int i) {
        SnsMethodCalculate.markStartTimeMs("getGroupPositionByVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        int i2 = 0;
        for (T next : mo83403i()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C58445f fVar = (C58445f) next;
                fVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
                int i4 = fVar.f167425a;
                SnsMethodCalculate.markEndTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
                if (i4 == i) {
                    SnsMethodCalculate.markEndTimeMs("getGroupPositionByVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
                    return i2;
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getGroupPositionByVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return 0;
    }

    /* renamed from: i */
    public final List<C58445f> mo83403i() {
        SnsMethodCalculate.markStartTimeMs("getSelectVisibleGroupHeaders", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        List<C58445f> list = (List) ((C36570n) this.f167419a).getValue();
        SnsMethodCalculate.markEndTimeMs("getSelectVisibleGroupHeaders", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return list;
    }

    /* renamed from: j */
    public final int mo83404j(int i) {
        int i2;
        SnsMethodCalculate.markStartTimeMs("getVisibleStateByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        C58445f fVar = (C58445f) C110818d0.m150917O(mo83403i(), i);
        if (fVar != null) {
            SnsMethodCalculate.markStartTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            i2 = fVar.f167425a;
            SnsMethodCalculate.markEndTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        } else {
            i2 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("getVisibleStateByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return i2;
    }

    /* renamed from: k */
    public final boolean mo83405k(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("matchTargetVisibilityState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        boolean z = i == i2;
        SnsMethodCalculate.markEndTimeMs("matchTargetVisibilityState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return z;
    }
}
