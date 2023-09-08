package com.tencent.p014mm.mj_template.api;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/mj_template/api/MaasAlbumTemplateSnsFeedInfo;", "Landroid/os/Parcelable;", "plugin-mj-template.api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo */
public final class MaasAlbumTemplateSnsFeedInfo implements Parcelable {
    public static final Parcelable.Creator<MaasAlbumTemplateSnsFeedInfo> CREATOR = new C55285a();

    /* renamed from: d */
    public final String f157476d;

    /* renamed from: e */
    public final int f157477e;

    /* renamed from: f */
    public final byte[] f157478f;

    /* renamed from: g */
    public final long f157479g;

    /* renamed from: h */
    public final long f157480h;

    /* renamed from: i */
    public final boolean f157481i;

    /* renamed from: com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo$a */
    public static final class C55285a implements Parcelable.Creator<MaasAlbumTemplateSnsFeedInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MaasAlbumTemplateSnsFeedInfo(parcel.readString(), parcel.readInt(), parcel.createByteArray(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new MaasAlbumTemplateSnsFeedInfo[i];
        }
    }

    public MaasAlbumTemplateSnsFeedInfo(String str, int i, byte[] bArr, long j, long j2, boolean z) {
        C87412m.m108594g(str, "desc");
        this.f157476d = str;
        this.f157477e = i;
        this.f157478f = bArr;
        this.f157479g = j;
        this.f157480h = j2;
        this.f157481i = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaasAlbumTemplateSnsFeedInfo)) {
            return false;
        }
        MaasAlbumTemplateSnsFeedInfo maasAlbumTemplateSnsFeedInfo = (MaasAlbumTemplateSnsFeedInfo) obj;
        return C87412m.m108589b(this.f157476d, maasAlbumTemplateSnsFeedInfo.f157476d) && this.f157477e == maasAlbumTemplateSnsFeedInfo.f157477e && C87412m.m108589b(this.f157478f, maasAlbumTemplateSnsFeedInfo.f157478f) && this.f157479g == maasAlbumTemplateSnsFeedInfo.f157479g && this.f157480h == maasAlbumTemplateSnsFeedInfo.f157480h && this.f157481i == maasAlbumTemplateSnsFeedInfo.f157481i;
    }

    public int hashCode() {
        int hashCode = ((this.f157476d.hashCode() * 31) + this.f157477e) * 31;
        byte[] bArr = this.f157478f;
        int hashCode2 = bArr == null ? 0 : Arrays.hashCode(bArr);
        long j = this.f157479g;
        long j2 = this.f157480h;
        int i = (((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f157481i;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public String toString() {
        return "MaasAlbumTemplateSnsFeedInfo(desc=" + this.f157476d + ", videoSource=" + this.f157477e + ", location=" + Arrays.toString(this.f157478f) + ", snsFeedId=" + this.f157479g + ", snsLocalId=" + this.f157480h + ", selectNoTemplate=" + this.f157481i + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f157476d);
        parcel.writeInt(this.f157477e);
        parcel.writeByteArray(this.f157478f);
        parcel.writeLong(this.f157479g);
        parcel.writeLong(this.f157480h);
        parcel.writeInt(this.f157481i ? 1 : 0);
    }
}
