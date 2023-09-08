package ut2;

import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: ut2.r */
public final class C102104r {

    /* renamed from: a */
    public final int f300666a;

    /* renamed from: b */
    public final int f300667b;

    /* renamed from: c */
    public final ArrayList<C65477j> f300668c;

    public C102104r(int i, int i2, ArrayList<C65477j> arrayList) {
        C87412m.m108594g(arrayList, AppBrandFileCleaner.f238098c);
        this.f300666a = i;
        this.f300667b = i2;
        this.f300668c = arrayList;
    }

    /* renamed from: a */
    public final ArrayList<C65477j> mo141604a() {
        SnsMethodCalculate.markStartTimeMs("getSnapshot", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        ArrayList<C65477j> arrayList = this.f300668c;
        SnsMethodCalculate.markEndTimeMs("getSnapshot", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return arrayList;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            return true;
        } else if (!(obj instanceof C102104r)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            return false;
        } else {
            C102104r rVar = (C102104r) obj;
            if (this.f300666a != rVar.f300666a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
                return false;
            } else if (this.f300667b != rVar.f300667b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f300668c, rVar.f300668c);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        int hashCode = (((this.f300666a * 31) + this.f300667b) * 31) + this.f300668c.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        String str = "ImproveSnapshotStruct(firstVisiblePosition=" + this.f300666a + ", lastVisiblePosition=" + this.f300667b + ", snapshot=" + this.f300668c + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return str;
    }
}
