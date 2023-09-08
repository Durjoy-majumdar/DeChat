package com.tencent.p014mm.plugin.finder.search.data;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import te3.C48727ak1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/data/SearchHotWordParcelable;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable */
public final class SearchHotWordParcelable implements Parcelable {
    public static final C3583a CREATOR = new C3583a((C8480h) null);

    /* renamed from: d */
    public C48727ak1 f16639d;

    /* renamed from: com.tencent.mm.plugin.finder.search.data.SearchHotWordParcelable$a */
    public static final class C3583a implements Parcelable.Creator<SearchHotWordParcelable> {
        public C3583a(C8480h hVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            SearchHotWordParcelable searchHotWordParcelable = new SearchHotWordParcelable();
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            C48727ak1 ak12 = new C48727ak1();
            ak12.parseFrom(bArr);
            searchHotWordParcelable.f16639d = ak12;
            return searchHotWordParcelable;
        }

        public Object[] newArray(int i) {
            return new SearchHotWordParcelable[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        C48727ak1 ak12 = this.f16639d;
        String str = ak12 != null ? ak12.f130586d : null;
        return str == null ? "null" : str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        C48727ak1 ak12 = this.f16639d;
        if (ak12 != null) {
            byte[] byteArray = ak12.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        }
    }
}
