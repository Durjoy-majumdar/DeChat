package w50;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112550d0;

/* renamed from: w50.o */
public final class C38014o {

    /* renamed from: a */
    public static final C38014o f100509a = new C38014o();

    /* renamed from: b */
    public static final C13601g f100510b = C36568h.m40985a(C38017c.f100516d);

    /* renamed from: c */
    public static final C13601g f100511c = C36568h.m40985a(C38016b.f100515d);

    /* renamed from: w50.o$a */
    public static final class C38015a {

        /* renamed from: a */
        public String f100512a;

        /* renamed from: b */
        public String f100513b;

        /* renamed from: c */
        public String f100514c;

        public C38015a(String str, String str2, String str3) {
            C87412m.m108594g(str, "decoderType");
            C87412m.m108594g(str2, "decoderDev");
            C87412m.m108594g(str3, "url");
            this.f100512a = str;
            this.f100513b = str2;
            this.f100514c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38015a)) {
                return false;
            }
            C38015a aVar = (C38015a) obj;
            return C87412m.m108589b(this.f100512a, aVar.f100512a) && C87412m.m108589b(this.f100513b, aVar.f100513b) && C87412m.m108589b(this.f100514c, aVar.f100514c);
        }

        public int hashCode() {
            return (((this.f100512a.hashCode() * 31) + this.f100513b.hashCode()) * 31) + this.f100514c.hashCode();
        }

        public String toString() {
            return "DecoderInfo(decoderType=" + this.f100512a + ", decoderDev=" + this.f100513b + ", url=" + this.f100514c + ')';
        }
    }

    /* renamed from: w50.o$b */
    public static final class C38016b extends C87413o implements C32224a<LruCache<String, C38015a>> {

        /* renamed from: d */
        public static final C38016b f100515d = new C38016b();

        public C38016b() {
            super(0);
        }

        public Object invoke() {
            return new LruCache(50);
        }
    }

    /* renamed from: w50.o$c */
    public static final class C38017c extends C87413o implements C32224a<LruCache<String, Boolean>> {

        /* renamed from: d */
        public static final C38017c f100516d = new C38017c();

        public C38017c() {
            super(0);
        }

        public Object invoke() {
            return new LruCache(5);
        }
    }

    /* renamed from: a */
    public final void mo61478a(Bundle bundle) {
        String string;
        C65928b bVar = C65928b.f189533a;
        if (bVar.mo89967f() && bundle != null && (string = bundle.getString("EVT_USERID")) != null) {
            String e = bVar.mo89966e(string);
            if (e == null || e.length() == 0) {
                Log.m105924i("LiveStatisticUtil", "parseTestDecoderMsg url:" + string);
                return;
            }
            String string2 = bundle.getString(TXLiveConstants.EVT_DESCRIPTION);
            if (string2 == null) {
                string2 = "";
            }
            String str = "H265";
            String str2 = "NULL";
            if (!C112550d0.m153801u(string2, str, false)) {
                str = C112550d0.m153801u(string2, "H264", false) ? "H264" : str2;
            }
            if (C112550d0.m153801u(string2, "hardware", false)) {
                str2 = "硬解";
            } else if (C112550d0.m153801u(string2, "software", false)) {
                str2 = "软解";
            }
            C38015a aVar = new C38015a(str, str2, string);
            ((LruCache) ((C36570n) f100511c).getValue()).put(e, aVar);
            Log.m105924i("LiveStatisticUtil", "parseTestDecoderMsg [" + e + XVFSFile.PATH_SEPARATOR_CHAR + aVar + ']');
        }
    }
}
