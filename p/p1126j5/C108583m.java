package p1126j5;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import o24.C21768j;
import p972h5.C108136b;

/* renamed from: j5.m */
public final class C108583m extends C108575f {

    /* renamed from: a */
    public final C21768j f325044a;

    /* renamed from: b */
    public final String f325045b;

    /* renamed from: c */
    public final C108136b f325046c;

    public C108583m(C21768j jVar, String str, C108136b bVar) {
        C87412m.m108594g(jVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "dataSource");
        this.f325044a = jVar;
        this.f325045b = str;
        this.f325046c = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108583m)) {
            return false;
        }
        C108583m mVar = (C108583m) obj;
        return C87412m.m108589b(this.f325044a, mVar.f325044a) && C87412m.m108589b(this.f325045b, mVar.f325045b) && this.f325046c == mVar.f325046c;
    }

    public int hashCode() {
        int hashCode = this.f325044a.hashCode() * 31;
        String str = this.f325045b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f325046c.hashCode();
    }

    public String toString() {
        return "SourceResult(source=" + this.f325044a + ", mimeType=" + this.f325045b + ", dataSource=" + this.f325046c + ')';
    }
}
