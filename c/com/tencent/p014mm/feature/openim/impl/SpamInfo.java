package com.tencent.p014mm.feature.openim.impl;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/feature/openim/impl/SpamInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.feature.openim.impl.SpamInfo */
public final class SpamInfo implements Parcelable {
    public static final C68042a CREATOR = new C68042a((C8480h) null);

    /* renamed from: d */
    public final int f195284d;

    /* renamed from: e */
    public final String f195285e;

    /* renamed from: f */
    public final byte[] f195286f;

    /* renamed from: com.tencent.mm.feature.openim.impl.SpamInfo$a */
    public static final class C68042a implements Parcelable.Creator<SpamInfo> {
        public C68042a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new SpamInfo(parcel.readInt(), parcel.readString(), parcel.createByteArray());
        }

        public Object[] newArray(int i) {
            return new SpamInfo[i];
        }
    }

    public SpamInfo(int i, String str, byte[] bArr) {
        this.f195284d = i;
        this.f195285e = str;
        this.f195286f = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeInt(this.f195284d);
        parcel.writeString(this.f195285e);
        parcel.writeByteArray(this.f195286f);
    }
}
