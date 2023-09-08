package com.tencent.p014mm.plugin.rtos.model;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/rtos/model/RtosQuickReply;", "Landroid/os/Parcelable;", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.rtos.model.RtosQuickReply */
public final class RtosQuickReply implements Parcelable {
    public static final Parcelable.Creator<RtosQuickReply> CREATOR = new C30361a();

    /* renamed from: d */
    public int f81931d;

    /* renamed from: e */
    public final String f81932e;

    /* renamed from: com.tencent.mm.plugin.rtos.model.RtosQuickReply$a */
    public static final class C30361a implements Parcelable.Creator<RtosQuickReply> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new RtosQuickReply(parcel.readInt(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new RtosQuickReply[i];
        }
    }

    public RtosQuickReply(int i, String str) {
        C87412m.m108594g(str, "msg");
        this.f81931d = i;
        this.f81932e = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtosQuickReply)) {
            return false;
        }
        RtosQuickReply rtosQuickReply = (RtosQuickReply) obj;
        return this.f81931d == rtosQuickReply.f81931d && C87412m.m108589b(this.f81932e, rtosQuickReply.f81932e);
    }

    public int hashCode() {
        return (this.f81931d * 31) + this.f81932e.hashCode();
    }

    public String toString() {
        return "RtosQuickReply(index=" + this.f81931d + ", msg=" + this.f81932e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f81931d);
        parcel.writeString(this.f81932e);
    }

    public RtosQuickReply() {
        this(0, "");
    }
}
