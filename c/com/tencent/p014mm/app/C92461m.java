package com.tencent.p014mm.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kj2.C117407d;

/* renamed from: com.tencent.mm.app.m */
public final class C92461m {

    /* renamed from: com.tencent.mm.app.m$b */
    public enum C92463b {
        IMAGE(1),
        VIDEO(2);
        

        /* renamed from: d */
        public final int f264624d;

        /* access modifiers changed from: public */
        C92463b(int i) {
            this.f264624d = i;
        }
    }

    /* renamed from: com.tencent.mm.app.m$c */
    public static class C92464c {

        /* renamed from: a */
        public final int f264625a;

        /* renamed from: b */
        public String f264626b = "";

        /* renamed from: c */
        public String f264627c = "";

        /* renamed from: d */
        public long f264628d = 0;

        /* renamed from: e */
        public int f264629e = 0;

        /* renamed from: f */
        public String f264630f = "";

        /* renamed from: g */
        public int f264631g = 0;

        /* renamed from: h */
        public int f264632h = 0;

        /* renamed from: i */
        public String f264633i = "";

        /* renamed from: j */
        public int f264634j = 0;

        /* renamed from: k */
        public String f264635k = "";

        /* renamed from: l */
        public String f264636l = "";

        /* renamed from: m */
        public String f264637m = "";

        /* renamed from: n */
        public String f264638n = "";

        /* renamed from: o */
        public int f264639o = 0;

        public C92464c(int i, C92463b bVar, C92462a aVar) {
            this.f264625a = i;
            this.f264629e = bVar.f264624d;
        }
    }

    /* renamed from: a */
    public static void m116308a(C92464c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f264625a);
        sb.append(',');
        sb.append(Util.nullAsNil(cVar.f264626b));
        sb.append(',');
        sb.append(Util.nullAsNil(cVar.f264627c));
        sb.append(',');
        sb.append(cVar.f264628d);
        sb.append(',');
        sb.append(cVar.f264629e);
        sb.append(',');
        String str = cVar.f264630f;
        if (str != null && !str.isEmpty()) {
            try {
                str = URLEncoder.encode(str, "utf-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        sb.append(Util.nullAsNil(str));
        sb.append(',');
        sb.append(cVar.f264631g);
        sb.append(',');
        sb.append(cVar.f264632h);
        sb.append(',');
        String str2 = cVar.f264633i;
        if (str2 != null && !str2.isEmpty()) {
            try {
                str2 = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        sb.append(Util.nullAsNil(str2));
        sb.append(',');
        sb.append(cVar.f264634j);
        sb.append(',');
        sb.append(Util.nullAsNil(cVar.f264635k));
        sb.append(',');
        sb.append(Util.nullAsNil(cVar.f264636l));
        sb.append(',');
        sb.append(Util.nullAsNil(cVar.f264637m));
        sb.append(',');
        String str3 = cVar.f264638n;
        if (str3 != null && !str3.isEmpty()) {
            try {
                str3 = URLEncoder.encode(str3, "utf-8");
            } catch (UnsupportedEncodingException unused3) {
            }
        }
        sb.append(Util.nullAsNil(str3));
        sb.append(',');
        sb.append(cVar.f264639o);
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.ExportMediaReporter", "[+] Report content: %s", sb4);
        C117407d.INSTANCE.mo160126c(20966, sb4, true, true);
    }
}
