package zt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gu2.C98214b;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: zt2.g */
public final class C103080g {

    /* renamed from: a */
    public boolean f304143a;

    /* renamed from: b */
    public boolean f304144b;

    /* renamed from: c */
    public C98214b f304145c;

    public C103080g(boolean z, boolean z2, C98214b bVar, int i, C8480h hVar) {
        z2 = (i & 2) != 0 ? false : z2;
        bVar = (i & 4) != 0 ? null : bVar;
        this.f304143a = z;
        this.f304144b = z2;
        this.f304145c = bVar;
    }

    /* renamed from: a */
    public final boolean mo142789a() {
        SnsMethodCalculate.markStartTimeMs("getExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        boolean z = this.f304143a;
        SnsMethodCalculate.markEndTimeMs("getExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return z;
    }

    /* renamed from: b */
    public final boolean mo142790b() {
        SnsMethodCalculate.markStartTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        boolean z = this.f304144b;
        SnsMethodCalculate.markEndTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return z;
    }

    /* renamed from: c */
    public final C98214b mo142791c() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        C98214b bVar = this.f304145c;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return bVar;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
            return true;
        } else if (!(obj instanceof C103080g)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
            return false;
        } else {
            C103080g gVar = (C103080g) obj;
            if (this.f304143a != gVar.f304143a) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                return false;
            } else if (this.f304144b != gVar.f304144b) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                return false;
            } else {
                boolean b = C87412m.m108589b(this.f304145c, gVar.f304145c);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                return b;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        boolean z = this.f304143a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f304144b;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        C98214b bVar = this.f304145c;
        int hashCode = i2 + (bVar == null ? 0 : bVar.hashCode());
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        String str = "SnsUnreadPair(expose=" + this.f304143a + ", indicator=" + this.f304144b + ", info=" + this.f304145c + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return str;
    }
}
