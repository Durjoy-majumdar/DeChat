package qk3;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.api.QueryImageData;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: qk3.a */
public final class C63281a {

    /* renamed from: a */
    public final String f179598a;

    /* renamed from: b */
    public final boolean f179599b;

    /* renamed from: c */
    public final long f179600c;

    /* renamed from: d */
    public final long f179601d;

    /* renamed from: e */
    public final ArrayList<QueryImageData> f179602e;

    /* renamed from: f */
    public final ArrayList<QueryImageData> f179603f;

    public C63281a(String str, boolean z, long j, long j2, ArrayList<QueryImageData> arrayList, ArrayList<QueryImageData> arrayList2) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(arrayList, "picDataList");
        C87412m.m108594g(arrayList2, "ocrDataList");
        this.f179598a = str;
        this.f179599b = z;
        this.f179600c = j;
        this.f179601d = j2;
        this.f179602e = arrayList;
        this.f179603f = arrayList2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63281a)) {
            return false;
        }
        C63281a aVar = (C63281a) obj;
        return C87412m.m108589b(this.f179598a, aVar.f179598a) && this.f179599b == aVar.f179599b && this.f179600c == aVar.f179600c && this.f179601d == aVar.f179601d && C87412m.m108589b(this.f179602e, aVar.f179602e) && C87412m.m108589b(this.f179603f, aVar.f179603f);
    }

    public int hashCode() {
        int hashCode = this.f179598a.hashCode() * 31;
        boolean z = this.f179599b;
        if (z) {
            z = true;
        }
        long j = this.f179600c;
        long j2 = this.f179601d;
        return ((((((((hashCode + (z ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f179602e.hashCode()) * 31) + this.f179603f.hashCode();
    }

    public String toString() {
        return "LoadMoreDataBean(query=" + this.f179598a + ", isLastData=" + this.f179599b + ", firstTimeStamp=" + this.f179600c + ", lastTimeStamp=" + this.f179601d + ", picDataList=" + this.f179602e + ", ocrDataList=" + this.f179603f + ')';
    }
}
