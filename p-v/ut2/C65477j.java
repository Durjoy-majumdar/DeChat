package ut2;

import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import iu2.C98799a;

/* renamed from: ut2.j */
public final class C65477j {

    /* renamed from: a */
    public final int f188428a;

    /* renamed from: b */
    public final C98799a f188429b;

    /* renamed from: c */
    public final View f188430c;

    /* renamed from: d */
    public final Rect f188431d;

    public C65477j(int i, C98799a aVar, View view, Rect rect) {
        C87412m.m108594g(aVar, "item");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(rect, "pos");
        this.f188428a = i;
        this.f188429b = aVar;
        this.f188430c = view;
        this.f188431d = rect;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
            return true;
        } else if (!(obj instanceof C65477j)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
            return false;
        } else {
            C65477j jVar = (C65477j) obj;
            if (this.f188428a != jVar.f188428a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                return false;
            } else if (!C87412m.m108589b(this.f188429b, jVar.f188429b)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                return false;
            } else if (!C87412m.m108589b(this.f188430c, jVar.f188430c)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f188431d, jVar.f188431d);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        int hashCode = (((((this.f188428a * 31) + this.f188429b.hashCode()) * 31) + this.f188430c.hashCode()) * 31) + this.f188431d.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        String str = "ImproveItemSnapshot(index=" + this.f188428a + ", item=" + this.f188429b + ", view=" + this.f188430c + ", pos=" + this.f188431d + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
        return str;
    }
}
