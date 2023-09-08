package com.tencent.p014mm.plugin.mediabasic.data;

import android.os.Parcel;
import android.os.Parcelable;
import b62.C92177a;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaSingleInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo */
public final class MediaSingleInfo implements Parcelable {
    public static final Parcelable.Creator<MediaSingleInfo> CREATOR = new C94198a();

    /* renamed from: d */
    public C92177a f272123d;

    /* renamed from: e */
    public String f272124e;

    /* renamed from: f */
    public MediaDurationInfo f272125f;

    /* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo$a */
    public static final class C94198a implements Parcelable.Creator<MediaSingleInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MediaSingleInfo(C92177a.valueOf(parcel.readString()), parcel.readString(), MediaDurationInfo.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i) {
            return new MediaSingleInfo[i];
        }
    }

    public MediaSingleInfo(C92177a aVar, String str, MediaDurationInfo mediaDurationInfo) {
        C87412m.m108594g(aVar, "type");
        C87412m.m108594g(str, "path");
        C87412m.m108594g(mediaDurationInfo, "durationInfo");
        this.f272123d = aVar;
        this.f272124e = str;
        this.f272125f = mediaDurationInfo;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSingleInfo)) {
            return false;
        }
        MediaSingleInfo mediaSingleInfo = (MediaSingleInfo) obj;
        return this.f272123d == mediaSingleInfo.f272123d && C87412m.m108589b(this.f272124e, mediaSingleInfo.f272124e) && C87412m.m108589b(this.f272125f, mediaSingleInfo.f272125f);
    }

    public int hashCode() {
        return (((this.f272123d.hashCode() * 31) + this.f272124e.hashCode()) * 31) + this.f272125f.hashCode();
    }

    public String toString() {
        return "MediaSingleInfo(type=" + this.f272123d + ", path=" + this.f272124e + ", durationInfo=" + this.f272125f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeString(this.f272123d.name());
        parcel.writeString(this.f272124e);
        this.f272125f.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaSingleInfo(C92177a aVar, String str, MediaDurationInfo mediaDurationInfo, int i, C8480h hVar) {
        this(aVar, str, (i & 4) != 0 ? new MediaDurationInfo(0, 2147483647L) : mediaDurationInfo);
    }
}
