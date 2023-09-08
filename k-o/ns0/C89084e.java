package ns0;

import com.tencent.p014mm.sdk.platformtools.Log;
import cy3.C58003b;
import fn0.C87002g;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import in0.C87758b;
import os0.C89295c;

/* renamed from: ns0.e */
public abstract class C89084e {

    /* renamed from: d */
    public static final C89085a f256740d = new C89085a((C8480h) null);

    /* renamed from: a */
    public final String f256741a;

    /* renamed from: b */
    public final String f256742b;

    /* renamed from: c */
    public final Long f256743c;

    /* renamed from: ns0.e$a */
    public static final class C89085a {

        /* renamed from: ns0.e$a$a */
        public static final class C89086a {

            /* renamed from: a */
            public final String f256744a;

            /* renamed from: b */
            public final String f256745b;

            /* renamed from: c */
            public final boolean f256746c;

            /* renamed from: d */
            public final String f256747d;

            /* renamed from: e */
            public final String f256748e;

            /* renamed from: f */
            public final Long f256749f;

            public C89086a(String str, String str2, boolean z, String str3, String str4, Long l) {
                C87412m.m108594g(str, "srcUrl");
                C87412m.m108594g(str2, "finalSrcUrl");
                this.f256744a = str;
                this.f256745b = str2;
                this.f256746c = z;
                this.f256747d = str3;
                this.f256748e = str4;
                this.f256749f = l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C89086a)) {
                    return false;
                }
                C89086a aVar = (C89086a) obj;
                return C87412m.m108589b(this.f256744a, aVar.f256744a) && C87412m.m108589b(this.f256745b, aVar.f256745b) && this.f256746c == aVar.f256746c && C87412m.m108589b(this.f256747d, aVar.f256747d) && C87412m.m108589b(this.f256748e, aVar.f256748e) && C87412m.m108589b(this.f256749f, aVar.f256749f);
            }

            public int hashCode() {
                int hashCode = ((this.f256744a.hashCode() * 31) + this.f256745b.hashCode()) * 31;
                boolean z = this.f256746c;
                if (z) {
                    z = true;
                }
                int i = (hashCode + (z ? 1 : 0)) * 31;
                String str = this.f256747d;
                int i2 = 0;
                int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f256748e;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Long l = this.f256749f;
                if (l != null) {
                    i2 = l.hashCode();
                }
                return hashCode3 + i2;
            }

            public String toString() {
                return "VideoDataSourceBasicPack(srcUrl=" + this.f256744a + ", finalSrcUrl=" + this.f256745b + ", isHls=" + this.f256746c + ", contentType=" + this.f256747d + ", transferEncoding=" + this.f256748e + ", totalContentLength=" + this.f256749f + ')';
            }
        }

        /* renamed from: ns0.e$a$b */
        public static final class C89087b extends C87413o implements C32224a<C89086a> {

            /* renamed from: d */
            public final /* synthetic */ String f256750d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89087b(String str) {
                super(0);
                this.f256750d = str;
            }

            public Object invoke() {
                String str = this.f256750d;
                C87412m.m108594g(str, "url");
                return new C89086a(this.f256750d, str, C87002g.m108019m(str), (String) null, (String) null, (Long) null);
            }
        }

        public C89085a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C89086a mo123429a(String str, boolean z) {
            C89086a aVar;
            C89295c cVar;
            C89087b bVar = new C89087b(str);
            if (z) {
                aVar = (C89086a) bVar.invoke();
            } else {
                C32226l<String, C89295c> lVar = C89295c.f257244e;
                cVar = (C89295c) ((C89295c.C89296a) C89295c.f257244e).invoke(str);
                try {
                    boolean a = C87758b.f254077a.mo122162a(cVar);
                    String b = cVar.mo123636b();
                    aVar = new C89086a(str, b == null ? str : b, a, cVar.mo123635a(), cVar.mo123638d(), cVar.mo123637c());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.VideoDataSource", e, "create, judge isHls fail", new Object[0]);
                    aVar = (C89086a) bVar.invoke();
                }
                C58003b.m67160a(cVar, (Throwable) null);
            }
            Log.m105918d("MicroMsg.AppBrand.VideoDataSource", "create, pack: " + aVar);
            return aVar;
            try {
            } catch (Throwable th) {
                C58003b.m67160a(cVar, r12);
                throw th;
            }
        }

        /* renamed from: b */
        public final C89089c mo123430b(String str) {
            C87412m.m108594g(str, "srcUrl");
            C89086a a = mo123429a(str, false);
            return new C89089c(a.f256744a, a.f256745b, a.f256747d, a.f256748e, a.f256749f, a.f256746c);
        }
    }

    /* renamed from: ns0.e$b */
    public static final class C89088b extends C89084e {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89088b(String str, String str2, String str3, String str4, Long l) {
            super(str, str2, str3, str4, l, (C8480h) null);
            C87412m.m108594g(str, "srcUrl");
            C87412m.m108594g(str2, "finalSrcUrl");
        }
    }

    /* renamed from: ns0.e$c */
    public static final class C89089c extends C89084e {

        /* renamed from: e */
        public final boolean f256751e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89089c(String str, String str2, String str3, String str4, Long l, boolean z) {
            super(str, str2, str3, str4, l, (C8480h) null);
            C87412m.m108594g(str, "srcUrl");
            C87412m.m108594g(str2, "finalSrcUrl");
            this.f256751e = z;
        }
    }

    public C89084e(String str, String str2, String str3, String str4, Long l, C8480h hVar) {
        this.f256741a = str2;
        this.f256742b = str4;
        this.f256743c = l;
    }
}
