package com.tencent.p014mm.advertise.util;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/advertise/util/MagicAdPushMsg;", "Landroid/os/Parcelable;", "ad-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.advertise.util.MagicAdPushMsg */
public final class MagicAdPushMsg implements Parcelable {
    public static final Parcelable.Creator<MagicAdPushMsg> CREATOR = new C0986a();

    /* renamed from: d */
    public int f9008d;

    /* renamed from: e */
    public final long f9009e;

    /* renamed from: f */
    public final long f9010f;

    /* renamed from: g */
    public final long f9011g;

    /* renamed from: h */
    public final String f9012h;

    /* renamed from: com.tencent.mm.advertise.util.MagicAdPushMsg$a */
    public static final class C0986a implements Parcelable.Creator<MagicAdPushMsg> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MagicAdPushMsg(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new MagicAdPushMsg[i];
        }
    }

    public MagicAdPushMsg(int i, long j, long j2, long j3, String str) {
        C87412m.m108594g(str, "traceid");
        this.f9008d = i;
        this.f9009e = j;
        this.f9010f = j2;
        this.f9011g = j3;
        this.f9012h = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagicAdPushMsg)) {
            return false;
        }
        MagicAdPushMsg magicAdPushMsg = (MagicAdPushMsg) obj;
        return this.f9008d == magicAdPushMsg.f9008d && this.f9009e == magicAdPushMsg.f9009e && this.f9010f == magicAdPushMsg.f9010f && this.f9011g == magicAdPushMsg.f9011g && C87412m.m108589b(this.f9012h, magicAdPushMsg.f9012h);
    }

    public int hashCode() {
        long j = this.f9009e;
        long j2 = this.f9010f;
        long j3 = this.f9011g;
        return (((((((this.f9008d * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f9012h.hashCode();
    }

    public String toString() {
        return "MagicAdPushMsg(opcpde=" + this.f9008d + ", aid=" + this.f9009e + ", slotid=" + this.f9010f + ", op_time=" + this.f9011g + ", traceid=" + this.f9012h + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f9008d);
        parcel.writeLong(this.f9009e);
        parcel.writeLong(this.f9010f);
        parcel.writeLong(this.f9011g);
        parcel.writeString(this.f9012h);
    }
}
