package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.a */
public class C82324a {

    /* renamed from: a */
    public C82326b f241259a;

    /* renamed from: b */
    public String f241260b;

    /* renamed from: c */
    public String f241261c;

    /* renamed from: d */
    public C82325a f241262d;

    /* renamed from: e */
    public C82325a f241263e;

    /* renamed from: f */
    public C82325a f241264f;

    /* renamed from: g */
    public String f241265g;

    /* renamed from: h */
    public String f241266h;

    /* renamed from: i */
    public String f241267i;

    /* renamed from: j */
    public String f241268j;

    /* renamed from: k */
    public String f241269k;

    /* renamed from: l */
    public String f241270l;

    /* renamed from: m */
    public String f241271m;

    /* renamed from: n */
    public String f241272n;

    /* renamed from: o */
    public String f241273o;

    /* renamed from: p */
    public String f241274p;

    /* renamed from: q */
    public String f241275q;

    /* renamed from: r */
    public String f241276r;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.a$a */
    public static class C82325a {

        /* renamed from: a */
        public String f241277a;

        /* renamed from: b */
        public String f241278b;

        /* renamed from: c */
        public String f241279c;

        /* renamed from: d */
        public String f241280d;

        /* renamed from: e */
        public String f241281e;

        public C82325a(String str, String str2, String str3, String str4, String str5) {
            this.f241277a = Util.nullAsNil(str);
            this.f241278b = Util.nullAsNil(str2);
            this.f241279c = Util.nullAsNil(str3);
            this.f241280d = Util.nullAsNil(str4);
            this.f241281e = Util.nullAsNil(str5);
        }

        /* renamed from: a */
        public String mo114718a() {
            if (Util.isChinese(this.f241277a) || Util.isChinese(this.f241278b) || Util.isChinese(this.f241279c) || Util.isChinese(this.f241280d) || Util.isChinese(this.f241281e)) {
                StringBuilder sb = new StringBuilder();
                if (this.f241277a.length() > 0) {
                    sb.append(this.f241277a);
                }
                if (this.f241278b.length() > 0) {
                    sb.append(this.f241278b);
                }
                if (this.f241279c.length() > 0) {
                    sb.append(this.f241279c);
                }
                if (this.f241280d.length() > 0) {
                    sb.append(this.f241280d);
                }
                if (this.f241281e.length() > 0) {
                    sb.append(" ");
                    sb.append(this.f241281e);
                }
                return sb.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            if (this.f241280d.length() > 0) {
                sb4.append(this.f241280d);
                sb4.append(" ");
            }
            if (this.f241279c.length() > 0) {
                sb4.append(this.f241279c + " ");
            }
            if (this.f241278b.length() > 0) {
                sb4.append(this.f241278b + " ");
            }
            if (this.f241277a.length() > 0) {
                sb4.append(this.f241277a);
            }
            if (this.f241281e.length() > 0) {
                sb4.append(" ");
                sb4.append(this.f241281e);
            }
            return sb4.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.a$b */
    public static class C82326b {

        /* renamed from: a */
        public String f241282a;

        /* renamed from: b */
        public String f241283b;

        /* renamed from: c */
        public String f241284c;

        public C82326b(String str, String str2, String str3) {
            this.f241282a = Util.nullAsNil(str);
            this.f241283b = Util.nullAsNil(str2);
            this.f241284c = Util.nullAsNil(str3);
        }
    }
}
