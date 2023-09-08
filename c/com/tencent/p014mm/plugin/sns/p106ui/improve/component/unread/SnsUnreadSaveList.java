package com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/component/unread/SnsUnreadSaveList;", "Landroid/os/Parcelable;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList */
public final class SnsUnreadSaveList implements Parcelable {
    public static final Parcelable.Creator<SnsUnreadSaveList> CREATOR = new C95872a();

    /* renamed from: d */
    public final ArrayList<SnsUnreadSaveItem> f279803d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$a */
    public static final class C95872a implements Parcelable.Creator<SnsUnreadSaveList> {
        public Object createFromParcel(Parcel parcel) {
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
            SnsMethodCalculate.markStartTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
            C87412m.m108594g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(SnsUnreadSaveItem.CREATOR.createFromParcel(parcel));
            }
            SnsUnreadSaveList snsUnreadSaveList = new SnsUnreadSaveList(arrayList);
            SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
            SnsMethodCalculate.markEndTimeMs("createFromParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
            return snsUnreadSaveList;
        }

        public Object[] newArray(int i) {
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
            SnsMethodCalculate.markStartTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
            SnsUnreadSaveList[] snsUnreadSaveListArr = new SnsUnreadSaveList[i];
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
            SnsMethodCalculate.markEndTimeMs("newArray", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList$Creator");
            return snsUnreadSaveListArr;
        }
    }

    public SnsUnreadSaveList() {
        this((ArrayList) null, 1, (C8480h) null);
    }

    public SnsUnreadSaveList(ArrayList<SnsUnreadSaveItem> arrayList) {
        C87412m.m108594g(arrayList, "items");
        this.f279803d = arrayList;
    }

    public int describeContents() {
        SnsMethodCalculate.markStartTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
        SnsMethodCalculate.markEndTimeMs("describeContents", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
        return 0;
    }

    public boolean equals(Object obj) {
        SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
        if (this == obj) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            return true;
        } else if (!(obj instanceof SnsUnreadSaveList)) {
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            return false;
        } else {
            boolean b = C87412m.m108589b(this.f279803d, ((SnsUnreadSaveList) obj).f279803d);
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            return b;
        }
    }

    public int hashCode() {
        SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
        int hashCode = this.f279803d.hashCode();
        SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
        return hashCode;
    }

    public String toString() {
        SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
        String str = "SnsUnreadSaveList(items=" + this.f279803d + ')';
        SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
        return str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnsMethodCalculate.markStartTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
        C87412m.m108594g(parcel, "out");
        ArrayList<SnsUnreadSaveItem> arrayList = this.f279803d;
        parcel.writeInt(arrayList.size());
        Iterator<SnsUnreadSaveItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        SnsMethodCalculate.markEndTimeMs("writeToParcel", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnsUnreadSaveList(ArrayList arrayList, int i, C8480h hVar) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }
}
