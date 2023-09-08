package com.tencent.p014mm.plugin.rtos.model;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/rtos/model/RtosQuickReplyList;", "Landroid/os/Parcelable;", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.rtos.model.RtosQuickReplyList */
public final class RtosQuickReplyList implements Parcelable {
    public static final Parcelable.Creator<RtosQuickReplyList> CREATOR = new C30362a();

    /* renamed from: d */
    public ArrayList<RtosQuickReply> f81933d;

    /* renamed from: com.tencent.mm.plugin.rtos.model.RtosQuickReplyList$a */
    public static final class C30362a implements Parcelable.Creator<RtosQuickReplyList> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(RtosQuickReply.CREATOR.createFromParcel(parcel));
            }
            return new RtosQuickReplyList(arrayList);
        }

        public Object[] newArray(int i) {
            return new RtosQuickReplyList[i];
        }
    }

    public RtosQuickReplyList(ArrayList<RtosQuickReply> arrayList) {
        C87412m.m108594g(arrayList, "list");
        this.f81933d = arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RtosQuickReplyList) && C87412m.m108589b(this.f81933d, ((RtosQuickReplyList) obj).f81933d);
    }

    public int hashCode() {
        return this.f81933d.hashCode();
    }

    public String toString() {
        return "RtosQuickReplyList(list=" + this.f81933d + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        ArrayList<RtosQuickReply> arrayList = this.f81933d;
        parcel.writeInt(arrayList.size());
        Iterator<RtosQuickReply> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }
}
