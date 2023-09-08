package com.tencent.p014mm.plugin.mediabasic.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b62.C92180d;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaErrorInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo */
public final class MediaErrorInfo implements Parcelable {
    public static final Parcelable.Creator<MediaErrorInfo> CREATOR = new C94196a();

    /* renamed from: d */
    public C92180d f272116d;

    /* renamed from: e */
    public final int f272117e;

    /* renamed from: f */
    public String f272118f;

    /* renamed from: g */
    public Bundle f272119g;

    /* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo$a */
    public static final class C94196a implements Parcelable.Creator<MediaErrorInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MediaErrorInfo(C92180d.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readBundle(MediaErrorInfo.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new MediaErrorInfo[i];
        }
    }

    public MediaErrorInfo(C92180d dVar, int i, String str, Bundle bundle) {
        C87412m.m108594g(dVar, "status");
        this.f272116d = dVar;
        this.f272117e = i;
        this.f272118f = str;
        this.f272119g = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaErrorInfo)) {
            return false;
        }
        MediaErrorInfo mediaErrorInfo = (MediaErrorInfo) obj;
        return this.f272116d == mediaErrorInfo.f272116d && this.f272117e == mediaErrorInfo.f272117e && C87412m.m108589b(this.f272118f, mediaErrorInfo.f272118f) && C87412m.m108589b(this.f272119g, mediaErrorInfo.f272119g);
    }

    public int hashCode() {
        int hashCode = ((this.f272116d.hashCode() * 31) + this.f272117e) * 31;
        String str = this.f272118f;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Bundle bundle = this.f272119g;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "MediaErrorInfo(status=" + this.f272116d + ", errorCode=" + this.f272117e + ", errorMsg=" + this.f272118f + ", extra=" + this.f272119g + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f272116d.name());
        parcel.writeInt(this.f272117e);
        parcel.writeString(this.f272118f);
        parcel.writeBundle(this.f272119g);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaErrorInfo(C92180d dVar, int i, String str, Bundle bundle, int i2, C8480h hVar) {
        this(dVar, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : bundle);
    }
}
