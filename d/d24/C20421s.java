package d24;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.xweb.file.XVFSFile;
import e24.C20509c;
import gy3.C87412m;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o24.C21766h;
import z04.C119027c;

/* renamed from: d24.s */
public final class C20421s {

    /* renamed from: j */
    public static final char[] f57264j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f57265a;

    /* renamed from: b */
    public final String f57266b;

    /* renamed from: c */
    public final String f57267c;

    /* renamed from: d */
    public final String f57268d;

    /* renamed from: e */
    public final int f57269e;

    /* renamed from: f */
    public final List<String> f57270f;

    /* renamed from: g */
    public final List<String> f57271g;

    /* renamed from: h */
    public final String f57272h;

    /* renamed from: i */
    public final String f57273i;

    /* renamed from: d24.s$a */
    public static final class C20422a {

        /* renamed from: a */
        public String f57274a;

        /* renamed from: b */
        public String f57275b = "";

        /* renamed from: c */
        public String f57276c = "";

        /* renamed from: d */
        public String f57277d;

        /* renamed from: e */
        public int f57278e = -1;

        /* renamed from: f */
        public final List<String> f57279f;

        /* renamed from: g */
        public List<String> f57280g;

        /* renamed from: h */
        public String f57281h;

        public C20422a() {
            ArrayList arrayList = new ArrayList();
            this.f57279f = arrayList;
            arrayList.add("");
        }

        /* renamed from: a */
        public C20421s mo31949a() {
            if (this.f57274a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f57277d != null) {
                return new C20421s(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x02c7  */
        /* JADX WARNING: Removed duplicated region for block: B:209:0x039c A[SYNTHETIC] */
        /* renamed from: b */
        public d24.C20421s.C20422a mo31950b(d24.C20421s r35, java.lang.String r36) {
            /*
                r34 = this;
                r0 = r34
                r1 = r35
                r10 = r36
                int r2 = r36.length()
                r11 = 0
                int r8 = e24.C20509c.m22212r(r10, r11, r2)
                int r2 = r36.length()
                int r12 = e24.C20509c.m22213s(r10, r8, r2)
                int r2 = r12 - r8
                r13 = -1
                r14 = 1
                r9 = 2
                r15 = 58
                if (r2 >= r9) goto L_0x0021
                goto L_0x0062
            L_0x0021:
                char r2 = r10.charAt(r8)
                r3 = 122(0x7a, float:1.71E-43)
                r4 = 65
                r5 = 97
                r6 = 90
                if (r2 < r5) goto L_0x0031
                if (r2 <= r3) goto L_0x0036
            L_0x0031:
                if (r2 < r4) goto L_0x0062
                if (r2 <= r6) goto L_0x0036
                goto L_0x0062
            L_0x0036:
                r2 = r8
            L_0x0037:
                int r2 = r2 + r14
                if (r2 >= r12) goto L_0x0062
                char r7 = r10.charAt(r2)
                if (r7 < r5) goto L_0x0042
                if (r7 <= r3) goto L_0x005f
            L_0x0042:
                if (r7 < r4) goto L_0x0046
                if (r7 <= r6) goto L_0x005f
            L_0x0046:
                r3 = 48
                if (r7 < r3) goto L_0x004e
                r3 = 57
                if (r7 <= r3) goto L_0x005f
            L_0x004e:
                r3 = 43
                if (r7 == r3) goto L_0x005f
                r3 = 45
                if (r7 == r3) goto L_0x005f
                r3 = 46
                if (r7 != r3) goto L_0x005b
                goto L_0x005f
            L_0x005b:
                if (r7 != r15) goto L_0x0062
                r7 = r2
                goto L_0x0063
            L_0x005f:
                r3 = 122(0x7a, float:1.71E-43)
                goto L_0x0037
            L_0x0062:
                r7 = -1
            L_0x0063:
                if (r7 == r13) goto L_0x00b3
                r3 = 1
                r6 = 0
                r16 = 6
                java.lang.String r5 = "https:"
                r2 = r36
                r4 = r8
                r14 = r7
                r7 = r16
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x007e
                java.lang.String r2 = "https"
                r0.f57274a = r2
                int r8 = r8 + 6
                goto L_0x00b9
            L_0x007e:
                r3 = 1
                r6 = 0
                r7 = 5
                java.lang.String r5 = "http:"
                r2 = r36
                r4 = r8
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0093
                java.lang.String r2 = "http"
                r0.f57274a = r2
                int r8 = r8 + 5
                goto L_0x00b9
            L_0x0093:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Expected URL scheme 'http' or 'https' but was '"
                r2.append(r3)
                java.lang.String r3 = r10.substring(r11, r14)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00b3:
                if (r1 == 0) goto L_0x0405
                java.lang.String r2 = r1.f57265a
                r0.f57274a = r2
            L_0x00b9:
                r2 = r8
                r3 = 0
            L_0x00bb:
                r14 = 92
                r7 = 47
                if (r2 >= r12) goto L_0x00ce
                char r4 = r10.charAt(r2)
                if (r4 == r14) goto L_0x00c9
                if (r4 != r7) goto L_0x00ce
            L_0x00c9:
                int r3 = r3 + 1
                int r2 = r2 + 1
                goto L_0x00bb
            L_0x00ce:
                r6 = 63
                r5 = 35
                if (r3 >= r9) goto L_0x012e
                if (r1 == 0) goto L_0x012e
                java.lang.String r2 = r1.f57265a
                java.lang.String r4 = r0.f57274a
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x00e1
                goto L_0x012e
            L_0x00e1:
                java.lang.String r2 = r35.mo31944h()
                r0.f57275b = r2
                java.lang.String r2 = r35.mo31939d()
                r0.f57276c = r2
                java.lang.String r2 = r1.f57268d
                r0.f57277d = r2
                int r2 = r1.f57269e
                r0.f57278e = r2
                java.util.List<java.lang.String> r2 = r0.f57279f
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.f57279f
                java.util.List r3 = r35.mo31942f()
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r2.addAll(r3)
                if (r8 == r12) goto L_0x010f
                char r2 = r10.charAt(r8)
                if (r2 != r5) goto L_0x012b
            L_0x010f:
                java.lang.String r18 = r35.mo31943g()
                if (r18 == 0) goto L_0x0128
                r20 = 1
                r21 = 0
                r22 = 1
                r23 = 1
                java.lang.String r19 = " \"'<>#"
                java.lang.String r1 = d24.C20421s.m21984b(r18, r19, r20, r21, r22, r23)
                java.util.List r1 = d24.C20421s.m21989m(r1)
                goto L_0x0129
            L_0x0128:
                r1 = 0
            L_0x0129:
                r0.f57280g = r1
            L_0x012b:
                r1 = 0
                goto L_0x027c
            L_0x012e:
                int r8 = r8 + r3
                r9 = r8
                r16 = 0
                r18 = 0
            L_0x0134:
                java.lang.String r1 = "@/\\?#"
                int r8 = e24.C20509c.m22202h(r10, r9, r12, r1)
                if (r8 == r12) goto L_0x0141
                char r1 = r10.charAt(r8)
                goto L_0x0142
            L_0x0141:
                r1 = -1
            L_0x0142:
                if (r1 == r13) goto L_0x01e4
                if (r1 == r5) goto L_0x01e4
                if (r1 == r7) goto L_0x01e4
                if (r1 == r14) goto L_0x01e4
                if (r1 == r6) goto L_0x01e4
                r2 = 64
                if (r1 == r2) goto L_0x0152
                goto L_0x01d8
            L_0x0152:
                java.lang.String r4 = "%40"
                if (r16 != 0) goto L_0x01ae
                int r3 = e24.C20509c.m22201g(r10, r9, r8, r15)
                r19 = 1
                r20 = 0
                r21 = 0
                r22 = 1
                r23 = 0
                java.lang.String r24 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r36
                r2 = r9
                r9 = r3
                r14 = r4
                r4 = r24
                r5 = r19
                r6 = r20
                r7 = r21
                r13 = r8
                r8 = r22
                r11 = r9
                r9 = r23
                java.lang.String r1 = d24.C20421s.m21983a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r18 == 0) goto L_0x0193
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f57275b
                r2.append(r3)
                r2.append(r14)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x0193:
                r0.f57275b = r1
                if (r11 == r13) goto L_0x01ab
                int r2 = r11 + 1
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r36
                r3 = r13
                java.lang.String r1 = d24.C20421s.m21983a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0.f57276c = r1
                r16 = 1
            L_0x01ab:
                r18 = 1
                goto L_0x01d6
            L_0x01ae:
                r14 = r4
                r13 = r8
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r1 = r0.f57276c
                r11.append(r1)
                r11.append(r14)
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r14 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r36
                r2 = r9
                r3 = r13
                r9 = r14
                java.lang.String r1 = d24.C20421s.m21983a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r11.append(r1)
                java.lang.String r1 = r11.toString()
                r0.f57276c = r1
            L_0x01d6:
                int r9 = r13 + 1
            L_0x01d8:
                r5 = 35
                r6 = 63
                r7 = 47
                r11 = 0
                r13 = -1
                r14 = 92
                goto L_0x0134
            L_0x01e4:
                r13 = r8
                r8 = r9
            L_0x01e6:
                if (r8 >= r13) goto L_0x0204
                char r1 = r10.charAt(r8)
                if (r1 == r15) goto L_0x0202
                r2 = 91
                if (r1 == r2) goto L_0x01f4
                r1 = 1
                goto L_0x0200
            L_0x01f4:
                r1 = 1
            L_0x01f5:
                int r8 = r8 + r1
                if (r8 >= r13) goto L_0x0200
                char r2 = r10.charAt(r8)
                r3 = 93
                if (r2 != r3) goto L_0x01f5
            L_0x0200:
                int r8 = r8 + r1
                goto L_0x01e6
            L_0x0202:
                r11 = r8
                goto L_0x0205
            L_0x0204:
                r11 = r13
            L_0x0205:
                int r14 = r11 + 1
                r15 = 34
                if (r14 >= r13) goto L_0x0263
                r1 = 0
                java.lang.String r2 = d24.C20421s.m21987j(r10, r9, r11, r1)
                java.lang.String r1 = e24.C20509c.m22196b(r2)
                r0.f57277d = r1
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r16 = 0
                r1 = r36
                r2 = r14
                r3 = r13
                r26 = r9
                r9 = r16
                java.lang.String r1 = d24.C20421s.m21983a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x0236 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0236 }
                if (r1 <= 0) goto L_0x023b
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 > r2) goto L_0x023b
                goto L_0x023c
            L_0x0236:
                goto L_0x023b
            L_0x0238:
                r26 = r9
                goto L_0x0236
            L_0x023b:
                r1 = -1
            L_0x023c:
                r0.f57278e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0245
                r8 = r26
                r1 = 0
                goto L_0x0277
            L_0x0245:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid URL port: \""
                r2.append(r3)
                java.lang.String r3 = r10.substring(r14, r13)
                r2.append(r3)
                r2.append(r15)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0263:
                r8 = r9
                r1 = 0
                java.lang.String r2 = d24.C20421s.m21987j(r10, r8, r11, r1)
                java.lang.String r2 = e24.C20509c.m22196b(r2)
                r0.f57277d = r2
                java.lang.String r2 = r0.f57274a
                int r2 = d24.C20421s.m21985c(r2)
                r0.f57278e = r2
            L_0x0277:
                java.lang.String r2 = r0.f57277d
                if (r2 == 0) goto L_0x03e7
                r8 = r13
            L_0x027c:
                java.lang.String r2 = "?#"
                int r2 = e24.C20509c.m22202h(r10, r8, r12, r2)
                if (r8 != r2) goto L_0x028a
                r14 = r0
                r1 = r10
                r3 = r1
            L_0x0287:
                r13 = r12
                goto L_0x03a1
            L_0x028a:
                char r3 = r10.charAt(r8)
                java.lang.String r4 = ""
                r5 = 47
                if (r3 == r5) goto L_0x02ae
                r5 = 92
                if (r3 != r5) goto L_0x0299
                goto L_0x02ae
            L_0x0299:
                java.util.List<java.lang.String> r3 = r0.f57279f
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                int r5 = r3.size()
                r6 = 1
                int r5 = r5 - r6
                r3.set(r5, r4)
                r9 = r0
                r11 = r9
                r5 = r2
                r7 = r4
                r3 = r10
                r4 = r5
                r2 = r3
                goto L_0x02c5
            L_0x02ae:
                r6 = 1
                java.util.List<java.lang.String> r3 = r0.f57279f
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r3.clear()
                java.util.List<java.lang.String> r3 = r0.f57279f
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r3.add(r4)
                r9 = r0
                r11 = r9
                r5 = r2
                r7 = r4
                r3 = r10
                r4 = r5
                r2 = r3
            L_0x02c4:
                int r8 = r8 + r6
            L_0x02c5:
                if (r8 >= r5) goto L_0x039c
                java.lang.String r6 = "/\\"
                int r6 = e24.C20509c.m22202h(r2, r8, r5, r6)
                if (r6 >= r5) goto L_0x02d1
                r13 = 1
                goto L_0x02d2
            L_0x02d1:
                r13 = 0
            L_0x02d2:
                r29 = 1
                r30 = 0
                r31 = 0
                r32 = 1
                r33 = 0
                java.lang.String r28 = " \"<>^`{}|/\\?#"
                r25 = r2
                r26 = r8
                r27 = r6
                java.lang.String r8 = d24.C20421s.m21983a(r25, r26, r27, r28, r29, r30, r31, r32, r33)
                java.lang.String r14 = "."
                boolean r14 = r8.equals(r14)
                if (r14 != 0) goto L_0x02fb
                java.lang.String r14 = "%2e"
                boolean r14 = r8.equalsIgnoreCase(r14)
                if (r14 == 0) goto L_0x02f9
                goto L_0x02fb
            L_0x02f9:
                r14 = 0
                goto L_0x02fc
            L_0x02fb:
                r14 = 1
            L_0x02fc:
                if (r14 == 0) goto L_0x0301
                r15 = -1
                goto L_0x0395
            L_0x0301:
                java.lang.String r14 = ".."
                boolean r14 = r8.equals(r14)
                if (r14 != 0) goto L_0x0324
                java.lang.String r14 = "%2e."
                boolean r14 = r8.equalsIgnoreCase(r14)
                if (r14 != 0) goto L_0x0324
                java.lang.String r14 = ".%2e"
                boolean r14 = r8.equalsIgnoreCase(r14)
                if (r14 != 0) goto L_0x0324
                java.lang.String r14 = "%2e%2e"
                boolean r14 = r8.equalsIgnoreCase(r14)
                if (r14 == 0) goto L_0x0322
                goto L_0x0324
            L_0x0322:
                r14 = 0
                goto L_0x0325
            L_0x0324:
                r14 = 1
            L_0x0325:
                if (r14 == 0) goto L_0x035e
                java.util.List<java.lang.String> r8 = r11.f57279f
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                int r14 = r8.size()
                r15 = -1
                int r14 = r14 + r15
                java.lang.Object r8 = r8.remove(r14)
                java.lang.String r8 = (java.lang.String) r8
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x0355
                java.util.List<java.lang.String> r8 = r11.f57279f
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                boolean r8 = r8.isEmpty()
                if (r8 != 0) goto L_0x0355
                java.util.List<java.lang.String> r8 = r11.f57279f
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                int r14 = r8.size()
                r15 = -1
                int r14 = r14 + r15
                r8.set(r14, r7)
                goto L_0x0395
            L_0x0355:
                r15 = -1
                java.util.List<java.lang.String> r8 = r11.f57279f
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                r8.add(r7)
                goto L_0x0395
            L_0x035e:
                r15 = -1
                java.util.List<java.lang.String> r14 = r11.f57279f
                java.util.ArrayList r14 = (java.util.ArrayList) r14
                int r16 = r14.size()
                r17 = 1
                int r1 = r16 + -1
                java.lang.Object r1 = r14.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0385
                java.util.List<java.lang.String> r1 = r11.f57279f
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                int r14 = r1.size()
                int r14 = r14 + -1
                r1.set(r14, r8)
                goto L_0x038c
            L_0x0385:
                java.util.List<java.lang.String> r1 = r11.f57279f
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                r1.add(r8)
            L_0x038c:
                if (r13 == 0) goto L_0x0395
                java.util.List<java.lang.String> r1 = r11.f57279f
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                r1.add(r7)
            L_0x0395:
                r8 = r6
                r1 = 0
                if (r13 == 0) goto L_0x02c5
                r6 = 1
                goto L_0x02c4
            L_0x039c:
                r2 = r4
                r14 = r9
                r1 = r10
                goto L_0x0287
            L_0x03a1:
                if (r2 >= r13) goto L_0x03ca
                char r4 = r3.charAt(r2)
                r5 = 63
                if (r4 != r5) goto L_0x03ca
                r15 = 35
                int r16 = e24.C20509c.m22201g(r3, r2, r13, r15)
                int r5 = r2 + 1
                r8 = 1
                r9 = 0
                r10 = 1
                r11 = 1
                r12 = 0
                java.lang.String r7 = " \"'<>#"
                r4 = r1
                r6 = r16
                java.lang.String r2 = d24.C20421s.m21983a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.util.List r2 = d24.C20421s.m21989m(r2)
                r14.f57280g = r2
                r2 = r16
                goto L_0x03cc
            L_0x03ca:
                r15 = 35
            L_0x03cc:
                if (r2 >= r13) goto L_0x03e6
                char r3 = r3.charAt(r2)
                if (r3 != r15) goto L_0x03e6
                r3 = 1
                int r5 = r2 + 1
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                java.lang.String r7 = ""
                r4 = r1
                r6 = r13
                java.lang.String r1 = d24.C20421s.m21983a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r14.f57281h = r1
            L_0x03e6:
                return r14
            L_0x03e7:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid URL host: \""
                r2.append(r3)
                java.lang.String r3 = r10.substring(r8, r11)
                r2.append(r3)
                r2.append(r15)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0405:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d24.C20421s.C20422a.mo31950b(d24.s, java.lang.String):d24.s$a");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f57274a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f57275b.isEmpty() || !this.f57276c.isEmpty()) {
                sb.append(this.f57275b);
                if (!this.f57276c.isEmpty()) {
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    sb.append(this.f57276c);
                }
                sb.append('@');
            }
            String str2 = this.f57277d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f57277d);
                    sb.append(']');
                } else {
                    sb.append(this.f57277d);
                }
            }
            int i = this.f57278e;
            if (!(i == -1 && this.f57274a == null)) {
                if (i == -1) {
                    i = C20421s.m21985c(this.f57274a);
                }
                String str3 = this.f57274a;
                if (str3 == null || i != C20421s.m21985c(str3)) {
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    sb.append(i);
                }
            }
            ArrayList arrayList = (ArrayList) this.f57279f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(XVFSFile.SEPARATOR_CHAR);
                sb.append((String) arrayList.get(i2));
            }
            if (this.f57280g != null) {
                sb.append('?');
                C20421s.m21986i(sb, this.f57280g);
            }
            if (this.f57281h != null) {
                sb.append('#');
                sb.append(this.f57281h);
            }
            return sb.toString();
        }
    }

    public C20421s(C20422a aVar) {
        this.f57265a = aVar.f57274a;
        String str = aVar.f57275b;
        this.f57266b = m21987j(str, 0, str.length(), false);
        String str2 = aVar.f57276c;
        this.f57267c = m21987j(str2, 0, str2.length(), false);
        this.f57268d = aVar.f57277d;
        int i = aVar.f57278e;
        this.f57269e = i == -1 ? m21985c(aVar.f57274a) : i;
        this.f57270f = mo31946k(aVar.f57279f, false);
        List<String> list = aVar.f57280g;
        String str3 = null;
        this.f57271g = list != null ? mo31946k(list, true) : null;
        String str4 = aVar.f57281h;
        this.f57272h = str4 != null ? m21987j(str4, 0, str4.length(), false) : str3;
        this.f57273i = aVar.toString();
    }

    /* renamed from: a */
    public static String m21983a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        String str4 = str2;
        Charset charset2 = charset;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str3.codePointAt(i4);
            int i5 = 127;
            int i6 = 43;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !m21988l(str3, i4, i3)))) || (codePointAt == 43 && z3)))) {
                C21766h hVar = new C21766h();
                hVar.mo34117C(str3, i, i4);
                C21766h hVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str3.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == i6 && z3) {
                            hVar.mo34116B(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == i5 || ((codePointAt2 >= 128 && z4) || str4.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !m21988l(str3, i4, i3)))))) {
                            if (hVar2 == null) {
                                hVar2 = new C21766h();
                            }
                            if (charset2 == null || charset2.equals(C20509c.f57732d)) {
                                hVar2.mo34118E(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i4;
                                boolean z5 = true;
                                if (i4 >= 0) {
                                    if (charCount >= i4) {
                                        if (charCount > str.length()) {
                                            z5 = false;
                                        }
                                        if (!z5) {
                                            throw new IllegalArgumentException(("endIndex > string.length: " + charCount + " > " + str.length()).toString());
                                        } else if (C87412m.m108589b(charset2, C119027c.f356488a)) {
                                            hVar2.mo34117C(str3, i4, charCount);
                                        } else {
                                            String substring = str3.substring(i4, charCount);
                                            C87412m.m108593f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                            byte[] bytes = substring.getBytes(charset2);
                                            C87412m.m108593f(bytes, "(this as java.lang.String).getBytes(charset)");
                                            hVar2.mo34145n(bytes, 0, bytes.length);
                                        }
                                    } else {
                                        throw new IllegalArgumentException(("endIndex < beginIndex: " + charCount + " < " + i4).toString());
                                    }
                                } else {
                                    throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
                                }
                            }
                            while (!hVar2.mo34134e0()) {
                                byte readByte = hVar2.readByte() & ExifInterface.MARKER;
                                hVar.mo34148q(37);
                                char[] cArr = f57264j;
                                hVar.mo34148q(cArr[(readByte >> 4) & 15]);
                                hVar.mo34148q(cArr[readByte & 15]);
                            }
                        } else {
                            hVar.mo34118E(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    i5 = 127;
                    i6 = 43;
                }
                return hVar.mo34141j(hVar.f61695e, C119027c.f356488a);
            }
            i4 += Character.charCount(codePointAt);
        }
        int i7 = i;
        return str.substring(i, i2);
    }

    /* renamed from: b */
    public static String m21984b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m21983a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    /* renamed from: c */
    public static int m21985c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals(C113600ck.f339986i)) {
            return JsApiPauseDownloadTask.CTRL_INDEX;
        }
        return -1;
    }

    /* renamed from: i */
    public static void m21986i(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: j */
    public static String m21987j(String str, int i, int i2, boolean z) {
        int i3;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                C21766h hVar = new C21766h();
                hVar.mo34117C(str, i, i4);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt == 37 && (i3 = i4 + 2) < i2) {
                        int e = C20509c.m22199e(str.charAt(i4 + 1));
                        int e2 = C20509c.m22199e(str.charAt(i3));
                        if (!(e == -1 || e2 == -1)) {
                            hVar.mo34148q((e << 4) + e2);
                            i4 = i3;
                            i4 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z) {
                        hVar.mo34148q(32);
                        i4 += Character.charCount(codePointAt);
                    }
                    hVar.mo34118E(codePointAt);
                    i4 += Character.charCount(codePointAt);
                }
                return hVar.mo34141j(hVar.f61695e, C119027c.f356488a);
            }
            i4++;
        }
        return str.substring(i, i2);
    }

    /* renamed from: l */
    public static boolean m21988l(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C20509c.m22199e(str.charAt(i + 1)) != -1 && C20509c.m22199e(str.charAt(i3)) != -1;
    }

    /* renamed from: m */
    public static List<String> m21989m(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: d */
    public String mo31939d() {
        if (this.f57267c.isEmpty()) {
            return "";
        }
        int indexOf = this.f57273i.indexOf(64);
        return this.f57273i.substring(this.f57273i.indexOf(58, this.f57265a.length() + 3) + 1, indexOf);
    }

    /* renamed from: e */
    public String mo31940e() {
        int indexOf = this.f57273i.indexOf(47, this.f57265a.length() + 3);
        String str = this.f57273i;
        return this.f57273i.substring(indexOf, C20509c.m22202h(str, indexOf, str.length(), "?#"));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C20421s) && ((C20421s) obj).f57273i.equals(this.f57273i);
    }

    /* renamed from: f */
    public List<String> mo31942f() {
        int indexOf = this.f57273i.indexOf(47, this.f57265a.length() + 3);
        String str = this.f57273i;
        int h = C20509c.m22202h(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < h) {
            int i = indexOf + 1;
            int g = C20509c.m22201g(this.f57273i, i, h, XVFSFile.SEPARATOR_CHAR);
            arrayList.add(this.f57273i.substring(i, g));
            indexOf = g;
        }
        return arrayList;
    }

    /* renamed from: g */
    public String mo31943g() {
        if (this.f57271g == null) {
            return null;
        }
        int indexOf = this.f57273i.indexOf(63) + 1;
        String str = this.f57273i;
        return this.f57273i.substring(indexOf, C20509c.m22201g(str, indexOf, str.length(), '#'));
    }

    /* renamed from: h */
    public String mo31944h() {
        if (this.f57266b.isEmpty()) {
            return "";
        }
        int length = this.f57265a.length() + 3;
        String str = this.f57273i;
        return this.f57273i.substring(length, C20509c.m22202h(str, length, str.length(), ":@"));
    }

    public int hashCode() {
        return this.f57273i.hashCode();
    }

    /* renamed from: k */
    public final List<String> mo31946k(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m21987j(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: n */
    public URI mo31947n() {
        C20422a aVar = new C20422a();
        aVar.f57274a = this.f57265a;
        aVar.f57275b = mo31944h();
        aVar.f57276c = mo31939d();
        aVar.f57277d = this.f57268d;
        aVar.f57278e = this.f57269e != m21985c(this.f57265a) ? this.f57269e : -1;
        ((ArrayList) aVar.f57279f).clear();
        ((ArrayList) aVar.f57279f).addAll(mo31942f());
        String g = mo31943g();
        String str = null;
        aVar.f57280g = g != null ? m21989m(m21984b(g, " \"'<>#", true, false, true, true)) : null;
        if (this.f57272h != null) {
            str = this.f57273i.substring(this.f57273i.indexOf(35) + 1);
        }
        aVar.f57281h = str;
        int size = ((ArrayList) aVar.f57279f).size();
        for (int i = 0; i < size; i++) {
            ((ArrayList) aVar.f57279f).set(i, m21984b((String) ((ArrayList) aVar.f57279f).get(i), "[]", true, true, false, true));
        }
        List<String> list = aVar.f57280g;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = aVar.f57280g.get(i2);
                if (str2 != null) {
                    aVar.f57280g.set(i2, m21984b(str2, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str3 = aVar.f57281h;
        if (str3 != null) {
            aVar.f57281h = m21984b(str3, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public String toString() {
        return this.f57273i;
    }
}
