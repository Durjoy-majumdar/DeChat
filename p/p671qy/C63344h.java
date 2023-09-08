package p671qy;

import android.content.Context;
import di3.C7335d;
import gy3.C8480h;
import gy3.C87412m;
import i70.C87667c;
import org.json.JSONObject;

/* renamed from: qy.h */
public interface C63344h extends C7335d {

    /* renamed from: qy.h$a */
    public static final class C63345a {

        /* renamed from: a */
        public String f179711a;

        /* renamed from: b */
        public long f179712b;

        /* renamed from: c */
        public String f179713c;

        public C63345a() {
            this((String) null, 0, (String) null, 7, (C8480h) null);
        }

        public C63345a(String str, long j, String str2) {
            C87412m.m108594g(str, "finderUserName");
            C87412m.m108594g(str2, "encodedUxInfo");
            this.f179711a = str;
            this.f179712b = j;
            this.f179713c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63345a)) {
                return false;
            }
            C63345a aVar = (C63345a) obj;
            return C87412m.m108589b(this.f179711a, aVar.f179711a) && this.f179712b == aVar.f179712b && C87412m.m108589b(this.f179713c, aVar.f179713c);
        }

        public int hashCode() {
            long j = this.f179712b;
            return (((this.f179711a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f179713c.hashCode();
        }

        public String toString() {
            return "FinderExtData(finderUserName=" + this.f179711a + ", objectId=" + this.f179712b + ", encodedUxInfo=" + this.f179713c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C63345a(String str, long j, String str2, int i, C8480h hVar) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? "" : str2);
        }
    }

    /* renamed from: qy.h$b */
    public interface C63346b {
        /* renamed from: a */
        void mo87817a(String str, JSONObject jSONObject);
    }

    /* renamed from: Eu */
    void mo88242Eu(String str);

    /* renamed from: Ji */
    void mo88243Ji(C63346b bVar);

    /* renamed from: Pc */
    void mo88244Pc(C63346b bVar);

    /* renamed from: QC */
    String mo88245QC();

    void destroy();

    C87667c<?, ?>.a qf0(Object obj, Context context, C63345a aVar);

    /* renamed from: t */
    void mo88248t();

    /* renamed from: xp */
    String mo88249xp();

    /* renamed from: zf */
    void mo88250zf(String str);
}
