package com.tencent.p014mm.plugin.mediabasic.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mediabasic/data/MediaResultInfo;", "Landroid/os/Parcelable;", "plugin-basic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaResultInfo */
public final class MediaResultInfo implements Parcelable {
    public static final Parcelable.Creator<MediaResultInfo> CREATOR = new C94197a();

    /* renamed from: d */
    public boolean f272120d;

    /* renamed from: e */
    public ArrayList<MediaSingleInfo> f272121e;

    /* renamed from: f */
    public Bundle f272122f;

    /* renamed from: com.tencent.mm.plugin.mediabasic.data.MediaResultInfo$a */
    public static final class C94197a implements Parcelable.Creator<MediaResultInfo> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(MediaSingleInfo.CREATOR.createFromParcel(parcel));
            }
            return new MediaResultInfo(z, arrayList, parcel.readBundle(MediaResultInfo.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new MediaResultInfo[i];
        }
    }

    public MediaResultInfo(boolean z, ArrayList<MediaSingleInfo> arrayList, Bundle bundle) {
        C87412m.m108594g(arrayList, "mediaList");
        this.f272120d = z;
        this.f272121e = arrayList;
        this.f272122f = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaResultInfo)) {
            return false;
        }
        MediaResultInfo mediaResultInfo = (MediaResultInfo) obj;
        return this.f272120d == mediaResultInfo.f272120d && C87412m.m108589b(this.f272121e, mediaResultInfo.f272121e) && C87412m.m108589b(this.f272122f, mediaResultInfo.f272122f);
    }

    public int hashCode() {
        boolean z = this.f272120d;
        if (z) {
            z = true;
        }
        int hashCode = (((z ? 1 : 0) * true) + this.f272121e.hashCode()) * 31;
        Bundle bundle = this.f272122f;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public String toString() {
        return "MediaResultInfo(result=" + this.f272120d + ", mediaList=" + this.f272121e + ", extra=" + this.f272122f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "out");
        parcel.writeInt(this.f272120d ? 1 : 0);
        ArrayList<MediaSingleInfo> arrayList = this.f272121e;
        parcel.writeInt(arrayList.size());
        Iterator<MediaSingleInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeBundle(this.f272122f);
    }
}
