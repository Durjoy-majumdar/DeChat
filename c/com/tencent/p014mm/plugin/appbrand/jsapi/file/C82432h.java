package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import android.util.Base64;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import js0.C88016e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h */
public interface C82432h {

    /* renamed from: a */
    public static final Charset f241518a = Charset.forName("UTF-8");

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h$a */
    public static class C82433a {

        /* renamed from: a */
        public static final Map<String, C82432h> f241519a;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h$a$a */
        public class C82434a implements C82432h {

            /* renamed from: b */
            public final Charset f241520b = Charset.forName("US-ASCII");

            /* renamed from: a */
            public ByteBuffer mo114813a(String str) {
                return ByteBuffer.wrap(str.getBytes(this.f241520b));
            }

            /* renamed from: b */
            public String mo114814b(ByteBuffer byteBuffer) {
                return new String(C88016e.m109544a(byteBuffer), this.f241520b);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h$a$b */
        public class C82435b implements C82432h {
            /* renamed from: a */
            public ByteBuffer mo114813a(String str) {
                return ByteBuffer.wrap(Base64.decode(str.getBytes(C82432h.f241518a), 2));
            }

            /* renamed from: b */
            public String mo114814b(ByteBuffer byteBuffer) {
                return new String(Base64.encode(C88016e.m109544a(byteBuffer), 2), C82432h.f241518a);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h$a$c */
        public class C82436c implements C82432h {
            /* renamed from: a */
            public ByteBuffer mo114813a(String str) {
                return ByteBuffer.wrap(new BigInteger(str, 16).toByteArray());
            }

            /* renamed from: b */
            public String mo114814b(ByteBuffer byteBuffer) {
                return new BigInteger(1, C88016e.m109544a(byteBuffer)).toString(16);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h$a$d */
        public class C82437d implements C82432h {

            /* renamed from: b */
            public final /* synthetic */ Charset f241521b;

            public C82437d(Charset charset) {
                this.f241521b = charset;
            }

            /* renamed from: a */
            public ByteBuffer mo114813a(String str) {
                return ByteBuffer.wrap(str.getBytes(this.f241521b)).order(ByteOrder.LITTLE_ENDIAN);
            }

            /* renamed from: b */
            public String mo114814b(ByteBuffer byteBuffer) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                return new String(C88016e.m109544a(byteBuffer), this.f241521b);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h$a$e */
        public class C82438e implements C82432h {

            /* renamed from: b */
            public final /* synthetic */ Charset f241522b;

            public C82438e(Charset charset) {
                this.f241522b = charset;
            }

            /* renamed from: a */
            public ByteBuffer mo114813a(String str) {
                return ByteBuffer.wrap(str.getBytes(this.f241522b)).order(ByteOrder.LITTLE_ENDIAN);
            }

            /* renamed from: b */
            public String mo114814b(ByteBuffer byteBuffer) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                return new String(C88016e.m109544a(byteBuffer), this.f241522b);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h$a$f */
        public class C82439f implements C82432h {
            /* renamed from: a */
            public ByteBuffer mo114813a(String str) {
                return ByteBuffer.wrap(str.getBytes(C82432h.f241518a));
            }

            /* renamed from: b */
            public String mo114814b(ByteBuffer byteBuffer) {
                return new String(C88016e.m109544a(byteBuffer), C82432h.f241518a);
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.h$a$g */
        public class C82440g implements C82432h {

            /* renamed from: b */
            public final Charset f241523b = Charset.forName(KindaConfigCacheStg.SAVE_CHARSET);

            /* renamed from: a */
            public ByteBuffer mo114813a(String str) {
                return ByteBuffer.wrap(str.getBytes(this.f241523b));
            }

            /* renamed from: b */
            public String mo114814b(ByteBuffer byteBuffer) {
                return new String(C88016e.m109544a(byteBuffer), this.f241523b);
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f241519a = hashMap;
            hashMap.put("ascii", new C82434a());
            hashMap.put("base64", new C82435b());
            hashMap.put("hex", new C82436c());
            C82437d dVar = new C82437d(Charset.forName("ISO-10646-UCS-2"));
            hashMap.put("ucs2", dVar);
            hashMap.put("ucs-2", dVar);
            C82438e eVar = new C82438e(Charset.forName("UTF-16LE"));
            hashMap.put("utf16le", eVar);
            hashMap.put("utf-16le", eVar);
            C82439f fVar = new C82439f();
            hashMap.put("utf8", fVar);
            hashMap.put("utf-8", fVar);
            C82440g gVar = new C82440g();
            hashMap.put("latin1", gVar);
            hashMap.put("binary", gVar);
        }
    }

    /* renamed from: a */
    ByteBuffer mo114813a(String str);

    /* renamed from: b */
    String mo114814b(ByteBuffer byteBuffer);
}
