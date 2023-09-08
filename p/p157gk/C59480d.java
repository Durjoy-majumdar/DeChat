package p157gk;

import com.tencent.p014mm.api.QueryImageData;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: gk.d */
public final class C59480d {

    /* renamed from: a */
    public final String f169959a;

    /* renamed from: b */
    public final ArrayList<QueryImageData> f169960b;

    public C59480d(String str, ArrayList<QueryImageData> arrayList) {
        C87412m.m108594g(str, "header");
        C87412m.m108594g(arrayList, "imageDataList");
        this.f169959a = str;
        this.f169960b = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59480d)) {
            return false;
        }
        C59480d dVar = (C59480d) obj;
        return C87412m.m108589b(this.f169959a, dVar.f169959a) && C87412m.m108589b(this.f169960b, dVar.f169960b);
    }

    public int hashCode() {
        return (this.f169959a.hashCode() * 31) + this.f169960b.hashCode();
    }

    public String toString() {
        return "ImageDataListItem(header=" + this.f169959a + ", imageDataList=" + this.f169960b + ')';
    }
}
