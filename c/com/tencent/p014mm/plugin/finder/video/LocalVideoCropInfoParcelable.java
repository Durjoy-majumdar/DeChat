package com.tencent.p014mm.plugin.finder.video;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import te3.C64477jr2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/LocalVideoCropInfoParcelable;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable */
public final class LocalVideoCropInfoParcelable implements Parcelable {
    public static final C56530a CREATOR = new C56530a((C8480h) null);

    /* renamed from: d */
    public C64477jr2 f161940d;

    /* renamed from: com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable$a */
    public static final class C56530a implements Parcelable.Creator<LocalVideoCropInfoParcelable> {
        public C56530a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            LocalVideoCropInfoParcelable localVideoCropInfoParcelable = new LocalVideoCropInfoParcelable();
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            C64477jr2 jr22 = new C64477jr2();
            jr22.parseFrom(bArr);
            localVideoCropInfoParcelable.f161940d = jr22;
            return localVideoCropInfoParcelable;
        }

        public Object[] newArray(int i) {
            return new LocalVideoCropInfoParcelable[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C64477jr2 jr22;
        if (parcel != null && (jr22 = this.f161940d) != null) {
            C87412m.m108591d(jr22);
            byte[] byteArray = jr22.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        }
    }
}
