package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.scanner.model.m1 */
public class C19028m1 {

    /* renamed from: v */
    public static C19028m1 f53480v;

    /* renamed from: a */
    public C5156b f53481a;

    /* renamed from: b */
    public String f53482b;

    /* renamed from: c */
    public String f53483c;

    /* renamed from: d */
    public C19029c f53484d;

    /* renamed from: e */
    public String f53485e;

    /* renamed from: f */
    public C5155a f53486f;

    /* renamed from: g */
    public C5155a f53487g;

    /* renamed from: h */
    public C5155a f53488h;

    /* renamed from: i */
    public C5155a f53489i;

    /* renamed from: j */
    public List<String> f53490j;

    /* renamed from: k */
    public List<String> f53491k;

    /* renamed from: l */
    public List<String> f53492l;

    /* renamed from: m */
    public List<String> f53493m;

    /* renamed from: n */
    public List<String> f53494n;

    /* renamed from: o */
    public String f53495o;

    /* renamed from: p */
    public String f53496p;

    /* renamed from: q */
    public String f53497q;

    /* renamed from: r */
    public String f53498r;

    /* renamed from: s */
    public String f53499s;

    /* renamed from: t */
    public String f53500t;

    /* renamed from: u */
    public String f53501u;

    /* renamed from: com.tencent.mm.plugin.scanner.model.m1$a */
    public static class C5155a {

        /* renamed from: a */
        public String f20556a;

        /* renamed from: b */
        public String f20557b;

        /* renamed from: c */
        public String f20558c;

        /* renamed from: d */
        public String f20559d;

        /* renamed from: e */
        public String f20560e;

        /* renamed from: f */
        public String f20561f;

        /* renamed from: g */
        public String f20562g;

        public C5155a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f20556a = str == null ? "" : str;
            this.f20557b = str2 == null ? "" : str2;
            this.f20558c = str3 == null ? "" : str3;
            this.f20559d = str4 == null ? "" : str4;
            this.f20560e = str5 == null ? "" : str5;
            this.f20561f = str6 == null ? "" : str6;
            this.f20562g = str7 == null ? "" : str7;
        }

        /* renamed from: a */
        public String mo6119a() {
            if (Util.isChinese(this.f20556a) || Util.isChinese(this.f20557b) || Util.isChinese(this.f20558c) || Util.isChinese(this.f20559d) || Util.isChinese(this.f20560e) || Util.isChinese(this.f20562g)) {
                StringBuilder sb = new StringBuilder();
                if (this.f20562g.length() > 0) {
                    sb.append(this.f20562g);
                    sb.append("\n");
                }
                if (this.f20560e.length() > 0) {
                    sb.append(this.f20560e + " ");
                }
                if (this.f20559d.length() > 0) {
                    sb.append(this.f20559d);
                }
                if (this.f20560e.length() > 0 || this.f20559d.length() > 0) {
                    sb.append("\n");
                }
                if (this.f20558c.length() > 0) {
                    sb.append(this.f20558c + " ");
                    sb.append("\n");
                }
                if (this.f20557b.length() > 0) {
                    sb.append(this.f20557b);
                    sb.append("\n");
                }
                if (this.f20556a.length() > 0) {
                    sb.append(this.f20556a);
                    sb.append("\n");
                }
                if (this.f20561f.length() > 0) {
                    sb.append(this.f20561f);
                }
                String sb4 = sb.toString();
                return sb4.endsWith("\n") ? sb4.substring(0, sb4.length() - 1) : sb4;
            }
            StringBuilder sb5 = new StringBuilder();
            if (this.f20556a.length() > 0) {
                sb5.append(this.f20556a);
                sb5.append("\n");
            }
            if (this.f20557b.length() > 0) {
                sb5.append(this.f20557b);
                sb5.append("\n");
            }
            if (this.f20558c.length() > 0) {
                sb5.append(this.f20558c);
                sb5.append("\n");
            }
            if (this.f20559d.length() > 0) {
                sb5.append(this.f20559d + " ");
            }
            if (this.f20560e.length() > 0) {
                sb5.append(this.f20560e + " ");
            }
            if (this.f20561f.length() > 0) {
                sb5.append(this.f20561f);
            }
            if (this.f20559d.length() > 0 || this.f20560e.length() > 0) {
                sb5.append("\n");
            }
            if (this.f20562g.length() > 0) {
                sb5.append(this.f20562g);
            }
            String sb6 = sb5.toString();
            return sb6.endsWith("\n") ? sb6.substring(0, sb6.length() - 1) : sb6;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.m1$b */
    public static class C5156b {

        /* renamed from: a */
        public String f20563a;

        /* renamed from: b */
        public String f20564b;

        /* renamed from: c */
        public String f20565c;

        public C5156b(String str, String str2, String str3) {
            this.f20563a = str == null ? "" : str;
            this.f20564b = str2 == null ? "" : str2;
            this.f20565c = str3 == null ? "" : str3;
        }

        /* renamed from: a */
        public String mo6120a() {
            StringBuilder sb = new StringBuilder();
            if (Util.isChinese(this.f20563a) || Util.isChinese(this.f20564b) || Util.isChinese(this.f20565c)) {
                if (this.f20565c.trim().length() > 0) {
                    sb.append(this.f20565c);
                }
                if (this.f20564b.trim().length() > 0) {
                    sb.append(this.f20564b);
                }
                if (this.f20563a.trim().length() > 0) {
                    sb.append(this.f20563a);
                }
            } else {
                if (this.f20563a.trim().length() > 0) {
                    sb.append(this.f20563a);
                }
                if (this.f20564b.trim().length() > 0) {
                    sb.append(" ");
                    sb.append(this.f20564b);
                }
                if (this.f20565c.trim().length() > 0) {
                    sb.append(" ");
                    sb.append(this.f20565c);
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.m1$c */
    public static class C19029c {

        /* renamed from: a */
        public String f53502a;

        /* renamed from: b */
        public String f53503b;

        public C19029c(String str, String str2) {
            this.f53502a = str;
            this.f53503b = str2;
        }
    }
}
