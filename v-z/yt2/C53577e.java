package yt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;

/* renamed from: yt2.e */
public final class C53577e {

    /* renamed from: a */
    public int f150575a;

    /* renamed from: b */
    public int f150576b;

    /* renamed from: c */
    public int f150577c;

    /* renamed from: d */
    public int f150578d;

    public C53577e() {
        this(0, 0, 0, 0, 15, (C8480h) null);
    }

    public C53577e(int i, int i2, int i3, int i4, int i5, C8480h hVar) {
        i = (i5 & 1) != 0 ? 0 : i;
        i2 = (i5 & 2) != 0 ? 0 : i2;
        i3 = (i5 & 4) != 0 ? 0 : i3;
        i4 = (i5 & 8) != 0 ? 0 : i4;
        this.f150575a = i;
        this.f150576b = i2;
        this.f150577c = i3;
        this.f150578d = i4;
    }

    /* renamed from: a */
    public final int mo74220a() {
        SnsMethodCalculate.markStartTimeMs("getFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        int i = this.f150575a;
        SnsMethodCalculate.markEndTimeMs("getFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return i;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return true;
        } else if (!(obj instanceof C53577e)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return false;
        } else {
            C53577e eVar = (C53577e) obj;
            if (this.f150575a != eVar.f150575a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                return false;
            } else if (this.f150576b != eVar.f150576b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                return false;
            } else if (this.f150577c != eVar.f150577c) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                return false;
            } else {
                int i = this.f150578d;
                int i2 = eVar.f150578d;
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                return i == i2;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        int i = (((((this.f150575a * 31) + this.f150576b) * 31) + this.f150577c) * 31) + this.f150578d;
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return i;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        String str = "FinderEntranceData(finderEntranceEnableType=" + this.f150575a + ", finderEntranceMaxCountNoUser=" + this.f150576b + ", finderEntranceMaxCountNoFeed=" + this.f150577c + ", finderEntranceMaxCountNormal=" + this.f150578d + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return str;
    }
}
