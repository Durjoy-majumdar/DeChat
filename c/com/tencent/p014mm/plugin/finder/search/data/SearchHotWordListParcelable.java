package com.tencent.p014mm.plugin.finder.search.data;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import te3.C48727ak1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/data/SearchHotWordListParcelable;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable */
public final class SearchHotWordListParcelable implements Parcelable {
    public static final C3582a CREATOR = new C3582a((C8480h) null);

    /* renamed from: d */
    public final String f16635d = "Finder.SearchHotWordList";

    /* renamed from: e */
    public SearchHotWordParcelable f16636e;

    /* renamed from: f */
    public int f16637f = -1;

    /* renamed from: g */
    public LinkedList<SearchHotWordParcelable> f16638g = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.finder.search.data.SearchHotWordListParcelable$a */
    public static final class C3582a implements Parcelable.Creator<SearchHotWordListParcelable> {
        public C3582a(C8480h hVar) {
        }

        /* renamed from: a */
        public final SearchHotWordListParcelable mo3935a(C48727ak1 ak12, int i, List<? extends C48727ak1> list) {
            SearchHotWordParcelable searchHotWordParcelable = new SearchHotWordParcelable();
            searchHotWordParcelable.f16639d = ak12;
            SearchHotWordListParcelable searchHotWordListParcelable = new SearchHotWordListParcelable();
            searchHotWordListParcelable.f16636e = searchHotWordParcelable;
            searchHotWordListParcelable.f16637f = i;
            searchHotWordListParcelable.f16638g = mo3936b(list);
            return searchHotWordListParcelable;
        }

        /* renamed from: b */
        public final LinkedList<SearchHotWordParcelable> mo3936b(List<? extends C48727ak1> list) {
            LinkedList<SearchHotWordParcelable> linkedList = new LinkedList<>();
            if (list != null) {
                for (C48727ak1 ak12 : list) {
                    SearchHotWordParcelable searchHotWordParcelable = new SearchHotWordParcelable();
                    searchHotWordParcelable.f16639d = ak12;
                    linkedList.add(searchHotWordParcelable);
                }
            }
            return linkedList;
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            SearchHotWordListParcelable searchHotWordListParcelable = new SearchHotWordListParcelable();
            searchHotWordListParcelable.f16636e = (SearchHotWordParcelable) parcel.readParcelable(SearchHotWordParcelable.class.getClassLoader());
            searchHotWordListParcelable.f16637f = parcel.readInt();
            parcel.readTypedList(searchHotWordListParcelable.f16638g, SearchHotWordParcelable.CREATOR);
            return searchHotWordListParcelable;
        }

        public Object[] newArray(int i) {
            return new SearchHotWordListParcelable[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f16636e + " pos:" + this.f16637f + " list:" + this.f16638g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "parcel");
        parcel.writeParcelable(this.f16636e, i);
        parcel.writeInt(this.f16637f);
        parcel.writeTypedList(this.f16638g);
    }
}
