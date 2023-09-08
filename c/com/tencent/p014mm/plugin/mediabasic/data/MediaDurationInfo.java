package com.tencent.p014mm.plugin.mediabasic.data;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaDurationInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo */
public final class MediaDurationInfo implements Parcelable {
    public static final Parcelable.Creator<MediaDurationInfo> CREATOR = new C94195a();

    /* renamed from: d */
    public long f272114d;

    /* renamed from: e */
    public long f272115e;

    /* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaDurationInfo$a */
    public static final class C94195a implements Parcelable.Creator<MediaDurationInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return new MediaDurationInfo(parcel.readLong(), parcel.readLong());
        }

        public Object[] newArray(int i) {
            return new MediaDurationInfo[i];
        }
    }

    public MediaDurationInfo(long j, long j2) {
        this.f272114d = j;
        this.f272115e = j2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaDurationInfo)) {
            return false;
        }
        MediaDurationInfo mediaDurationInfo = (MediaDurationInfo) obj;
        return this.f272114d == mediaDurationInfo.f272114d && this.f272115e == mediaDurationInfo.f272115e;
    }

    public int hashCode() {
        long j = this.f272114d;
        long j2 = this.f272115e;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "MediaDurationInfo(startMs=" + this.f272114d + ", endMs=" + this.f272115e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeLong(this.f272114d);
        parcel.writeLong(this.f272115e);
    }
}
