package com.tencent.p014mm.media.camera;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/media/camera/CameraSupportInfo;", "Landroid/os/Parcelable;", "CREATOR", "a", "plugin-camera_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.camera.CameraSupportInfo */
public final class CameraSupportInfo implements Parcelable {
    public static final C28967a CREATOR = new C28967a((C8480h) null);

    /* renamed from: d */
    public String f79443d;

    /* renamed from: e */
    public int f79444e;

    /* renamed from: f */
    public int f79445f;

    /* renamed from: g */
    public String f79446g;

    /* renamed from: com.tencent.mm.media.camera.CameraSupportInfo$a */
    public static final class C28967a implements Parcelable.Creator<CameraSupportInfo> {
        public C28967a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            String readString = parcel.readString();
            String str = "";
            if (readString == null) {
                readString = str;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            if (readString2 != null) {
                str = readString2;
            }
            return new CameraSupportInfo(readString, readInt, readInt2, str);
        }

        public Object[] newArray(int i) {
            return new CameraSupportInfo[i];
        }
    }

    public CameraSupportInfo() {
        this((String) null, 0, 0, (String) null, 15, (C8480h) null);
    }

    public CameraSupportInfo(String str, int i, int i2, String str2) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, "str");
        this.f79443d = str;
        this.f79444e = i;
        this.f79445f = i2;
        this.f79446g = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraSupportInfo)) {
            return false;
        }
        CameraSupportInfo cameraSupportInfo = (CameraSupportInfo) obj;
        return C87412m.m108589b(this.f79443d, cameraSupportInfo.f79443d) && this.f79444e == cameraSupportInfo.f79444e && this.f79445f == cameraSupportInfo.f79445f && C87412m.m108589b(this.f79446g, cameraSupportInfo.f79446g);
    }

    public int hashCode() {
        return (((((this.f79443d.hashCode() * 31) + this.f79444e) * 31) + this.f79445f) * 31) + this.f79446g.hashCode();
    }

    public String toString() {
        return "CameraSupportInfo(id=" + this.f79443d + ", lensFacing=" + this.f79444e + ", level=" + this.f79445f + ", str=" + this.f79446g + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeString(this.f79443d);
        parcel.writeInt(this.f79444e);
        parcel.writeInt(this.f79445f);
        parcel.writeString(this.f79446g);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraSupportInfo(String str, int i, int i2, String str2, int i3, C8480h hVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? "" : str2);
    }
}
