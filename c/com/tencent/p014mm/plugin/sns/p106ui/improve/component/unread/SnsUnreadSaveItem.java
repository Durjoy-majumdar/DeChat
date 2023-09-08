package com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/component/unread/SnsUnreadSaveItem;", "Landroid/os/Parcelable;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem */
public final class SnsUnreadSaveItem implements Parcelable {
    public static final Parcelable.Creator<SnsUnreadSaveItem> CREATOR = new C95871a();

    /* renamed from: d */
    public final String f279800d;

    /* renamed from: e */
    public final boolean f279801e;

    /* renamed from: f */
    public final boolean f279802f;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$a */
    public static final class C95871a implements Parcelable.Creator<SnsUnreadSaveItem> {
        public Object createFromParcel(Parcel parcel) {
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            SnsUnreadSaveItem snsUnreadSaveItem = new SnsUnreadSaveItem(readString, z2, z);
            SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
            SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
            return snsUnreadSaveItem;
        }

        public Object[] newArray(int i) {
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
            SnsUnreadSaveItem[] snsUnreadSaveItemArr = new SnsUnreadSaveItem[i];
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem$Creator");
            return snsUnreadSaveItemArr;
        }
    }

    public SnsUnreadSaveItem(String str, boolean z, boolean z2) {
        C87412m.m108594g(str, "feedId");
        this.f279800d = str;
        this.f279801e = z;
        this.f279802f = z2;
    }

    public int describeContents() {
        SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return 0;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
            return true;
        } else if (!(obj instanceof SnsUnreadSaveItem)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
            return false;
        } else {
            SnsUnreadSaveItem snsUnreadSaveItem = (SnsUnreadSaveItem) obj;
            if (!C87412m.m108589b(this.f279800d, snsUnreadSaveItem.f279800d)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                return false;
            } else if (this.f279801e != snsUnreadSaveItem.f279801e) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                return false;
            } else {
                boolean z = this.f279802f;
                boolean z2 = snsUnreadSaveItem.f279802f;
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
                return z == z2;
            }
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        int hashCode = this.f279800d.hashCode() * 31;
        boolean z = this.f279801e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f279802f;
        if (!z3) {
            z2 = z3;
        }
        int i2 = i + (z2 ? 1 : 0);
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return i2;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        String str = "SnsUnreadSaveItem(feedId=" + this.f279800d + ", expose=" + this.f279801e + ", indicator=" + this.f279802f + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        return str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f279800d);
        parcel.writeInt(this.f279801e ? 1 : 0);
        parcel.writeInt(this.f279802f ? 1 : 0);
        SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveItem");
    }
}
