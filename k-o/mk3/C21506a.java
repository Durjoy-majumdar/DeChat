package mk3;

import android.net.Uri;
import android.util.Base64;
import com.tencent.p014mm.autogen.mmdata.rpt.MMBizExcerptsOpReportStruct;
import com.tencent.p014mm.p136ui.chatting.component.C73412a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.net.URLDecoder;
import java.util.HashSet;
import p270xi.C91212b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C119027c;
import zj3.C79392y0;

@C91212b(exportInterface = C79392y0.class)
/* renamed from: mk3.a */
public final class C21506a extends C73412a implements C79392y0 {

    /* renamed from: e */
    public static final C21506a f60891e = new C21506a();

    /* renamed from: f */
    public static final C13601g f60892f = C36568h.m40985a(C21508b.f60900d);

    /* renamed from: g */
    public static final C13601g f60893g = C36568h.m40985a(C21509c.f60901d);

    /* renamed from: mk3.a$a */
    public static final class C21507a {

        /* renamed from: a */
        public final long f60894a;

        /* renamed from: b */
        public final long f60895b;

        /* renamed from: c */
        public final long f60896c;

        /* renamed from: d */
        public final long f60897d;

        /* renamed from: e */
        public final long f60898e;

        /* renamed from: f */
        public final String f60899f;

        public C21507a(long j, long j2, long j3, long j4, long j5, String str) {
            C87412m.m108594g(str, "contentMd5");
            this.f60894a = j;
            this.f60895b = j2;
            this.f60896c = j3;
            this.f60897d = j4;
            this.f60898e = j5;
            this.f60899f = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21507a)) {
                return false;
            }
            C21507a aVar = (C21507a) obj;
            return this.f60894a == aVar.f60894a && this.f60895b == aVar.f60895b && this.f60896c == aVar.f60896c && this.f60897d == aVar.f60897d && this.f60898e == aVar.f60898e && C87412m.m108589b(this.f60899f, aVar.f60899f);
        }

        public int hashCode() {
            long j = this.f60894a;
            long j2 = this.f60895b;
            long j3 = this.f60896c;
            long j4 = this.f60897d;
            long j5 = this.f60898e;
            return (((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f60899f.hashCode();
        }

        public String toString() {
            return "UrlParseData(biz=" + this.f60894a + ", msgId=" + this.f60895b + ", idx=" + this.f60896c + ", beginOffset=" + this.f60897d + ", endOffset=" + this.f60898e + ", contentMd5=" + this.f60899f + ')';
        }
    }

    /* renamed from: mk3.a$b */
    public static final class C21508b extends C87413o implements C32224a<HashSet<Long>> {

        /* renamed from: d */
        public static final C21508b f60900d = new C21508b();

        public C21508b() {
            super(0);
        }

        public Object invoke() {
            return new HashSet();
        }
    }

    /* renamed from: mk3.a$c */
    public static final class C21509c extends C87413o implements C32224a<LruCache<String, C21507a>> {

        /* renamed from: d */
        public static final C21509c f60901d = new C21509c();

        public C21509c() {
            super(0);
        }

        public Object invoke() {
            return new LruCache(20);
        }
    }

    /* renamed from: Y5 */
    public static final void m24351Y5(int i, boolean z, String str) {
        C21507a aVar;
        C21507a aVar2;
        if (str != null) {
            f60891e.getClass();
            String mD5String = MD5Util.getMD5String(str);
            C13601g gVar = f60893g;
            if (((LruCache) ((C36570n) gVar).getValue()).check(mD5String)) {
                Object obj = ((LruCache) ((C36570n) gVar).getValue()).get(mD5String);
                C87412m.m108593f(obj, "{\n            parseDataCache.get(key)\n        }");
                aVar = (C21507a) obj;
            } else {
                try {
                    Uri parse = Uri.parse(str);
                    byte[] decode = Base64.decode(URLDecoder.decode(Util.nullAsNil(parse.getQueryParameter("__biz"))), 0);
                    C87412m.m108593f(decode, "bizUinStr");
                    long j = Util.getLong(new String(decode, C119027c.f356488a), 0);
                    long j2 = Util.getLong(parse.getQueryParameter("mid"), 0);
                    long j3 = Util.getLong(parse.getQueryParameter("idx"), 0);
                    long j4 = Util.getLong(parse.getQueryParameter(IXWebBroadcastListener.STAGE_START), 0);
                    long j5 = Util.getLong(parse.getQueryParameter("end"), 0);
                    String nullAsNil = Util.nullAsNil(parse.getQueryParameter("contentMd5"));
                    C87412m.m108593f(nullAsNil, "contentMd5");
                    aVar2 = new C21507a(j, j2, j3, j4, j5, nullAsNil);
                } catch (Exception unused) {
                    aVar2 = new C21507a(0, 0, 0, 0, 0, "");
                }
                ((LruCache) ((C36570n) f60893g).getValue()).put(mD5String, aVar2);
                aVar = aVar2;
            }
            long j6 = z ? 1 : 2;
            MMBizExcerptsOpReportStruct mMBizExcerptsOpReportStruct = new MMBizExcerptsOpReportStruct();
            mMBizExcerptsOpReportStruct.f48536d = aVar.f60894a;
            mMBizExcerptsOpReportStruct.f48537e = aVar.f60895b;
            mMBizExcerptsOpReportStruct.f48538f = aVar.f60896c;
            mMBizExcerptsOpReportStruct.f48539g = aVar.f60897d;
            mMBizExcerptsOpReportStruct.f48540h = aVar.f60898e;
            mMBizExcerptsOpReportStruct.f48541i = mMBizExcerptsOpReportStruct.mo86045b("content_md5", aVar.f60899f, true);
            mMBizExcerptsOpReportStruct.f48543k = (long) i;
            mMBizExcerptsOpReportStruct.f48542j = j6;
            Log.m105926v("MicroMsg.BizExcerptsOpReporter", "opReport " + mMBizExcerptsOpReportStruct.mo1005p());
            mMBizExcerptsOpReportStruct.mo86054n();
        }
    }
}
