package com.tencent.p014mm.plugin.finder.utils;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/utils/LocalFinderAtContactParcel;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.utils.LocalFinderAtContactParcel */
public final class LocalFinderAtContactParcel implements Parcelable {
    public static final C56495a CREATOR = new C56495a((C8480h) null);

    /* renamed from: d */
    public String f161647d;

    /* renamed from: e */
    public String f161648e;

    /* renamed from: f */
    public String f161649f;

    /* renamed from: g */
    public byte[] f161650g;

    /* renamed from: h */
    public long f161651h;

    /* renamed from: com.tencent.mm.plugin.finder.utils.LocalFinderAtContactParcel$a */
    public static final class C56495a implements Parcelable.Creator<LocalFinderAtContactParcel> {
        public C56495a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            LocalFinderAtContactParcel localFinderAtContactParcel = new LocalFinderAtContactParcel();
            localFinderAtContactParcel.f161647d = parcel.readString();
            localFinderAtContactParcel.f161648e = parcel.readString();
            localFinderAtContactParcel.f161649f = parcel.readString();
            localFinderAtContactParcel.f161650g = parcel.createByteArray();
            localFinderAtContactParcel.f161651h = parcel.readLong();
            return localFinderAtContactParcel;
        }

        public Object[] newArray(int i) {
            return new LocalFinderAtContactParcel[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f161647d);
        parcel.writeString(this.f161648e);
        parcel.writeString(this.f161649f);
        parcel.writeByteArray(this.f161650g);
        parcel.writeLong(this.f161651h);
    }
}
