package com.tencent.p014mm.live.core.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/live/core/core/model/UserVolumeInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.core.model.UserVolumeInfo */
public final class UserVolumeInfo implements Parcelable {
    public static final C55205a CREATOR = new C55205a((C8480h) null);

    /* renamed from: d */
    public String f157117d;

    /* renamed from: e */
    public int f157118e;

    /* renamed from: com.tencent.mm.live.core.core.model.UserVolumeInfo$a */
    public static final class C55205a implements Parcelable.Creator<UserVolumeInfo> {
        public C55205a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            UserVolumeInfo userVolumeInfo = new UserVolumeInfo((String) null, 0, 3, (C8480h) null);
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            userVolumeInfo.f157117d = readString;
            userVolumeInfo.f157118e = parcel.readInt();
            return userVolumeInfo;
        }

        public Object[] newArray(int i) {
            return new UserVolumeInfo[i];
        }
    }

    public UserVolumeInfo() {
        this((String) null, 0, 3, (C8480h) null);
    }

    public UserVolumeInfo(String str, int i) {
        C87412m.m108594g(str, "userId");
        this.f157117d = str;
        this.f157118e = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f157117d);
        parcel.writeInt(this.f157118e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserVolumeInfo(String str, int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
