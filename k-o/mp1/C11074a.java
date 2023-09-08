package mp1;

import android.content.Intent;
import com.tencent.p014mm.plugin.finder.shell.FinderShellInit;
import com.tencent.xweb.FileReaderHelper;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8814x2;
import java.util.HashMap;
import java.util.Locale;
import rx3.C13598b0;

/* renamed from: mp1.a */
public final class C11074a {

    /* renamed from: mp1.a$a */
    public static final class C11075a extends C87413o implements C32226l<Intent, C13598b0> {

        /* renamed from: d */
        public static final C11075a f32851d = new C11075a();

        public C11075a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((Intent) obj, "intent");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mp1.a$b */
    public static final class C11076b extends C87413o implements C32226l<Intent, C13598b0> {

        /* renamed from: d */
        public static final C11076b f32852d = new C11076b();

        public C11076b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Intent intent = (Intent) obj;
            C87412m.m108594g(intent, "intent");
            ((C8814x2) C86312j.m106911c(C8814x2.class)).mo9640oR(intent);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mp1.a$c */
    public static final class C11077c extends C87413o implements C32226l<Intent, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C11074a f32853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11077c(C11074a aVar) {
            super(1);
            this.f32853d = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: org.json.JSONObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: org.json.JSONObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: org.json.JSONObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: org.json.JSONObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: org.json.JSONObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: org.json.JSONObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: org.json.JSONObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: org.json.JSONObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: org.json.JSONObject} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r18
                android.content.Intent r0 = (android.content.Intent) r0
                java.lang.String r1 = "intent"
                gy3.C87412m.m108594g(r0, r1)
                r1 = r17
                mp1.a r2 = r1.f32853d
                r2.getClass()
                java.lang.String r2 = "action"
                java.lang.String r2 = r0.getStringExtra(r2)
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r3 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
                com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r4 = r3.Nt0()
                if (r2 == 0) goto L_0x0267
                int r3 = r2.hashCode()
                java.lang.String r15 = "execRedDot push"
                r10 = 0
                java.lang.String r5 = "decodeInfo"
                java.lang.String r6 = "redDotInfo"
                java.lang.String r7 = ""
                java.lang.String r14 = "Finder.Shell"
                r8 = 1
                r13 = 0
                switch(r3) {
                    case -1768624314: goto L_0x0217;
                    case -1636480013: goto L_0x01c0;
                    case -934908847: goto L_0x0127;
                    case 3452698: goto L_0x00cc;
                    case 1426876321: goto L_0x007f;
                    case 1940808485: goto L_0x003a;
                    default: goto L_0x0038;
                }
            L_0x0038:
                goto L_0x0267
            L_0x003a:
                java.lang.String r3 = "notifyWxCount"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0044
                goto L_0x0267
            L_0x0044:
                java.lang.String r0 = r0.getStringExtra(r6)
                if (r0 != 0) goto L_0x004b
                goto L_0x004c
            L_0x004b:
                r7 = r0
            L_0x004c:
                byte[] r0 = android.util.Base64.decode(r7, r13)
                java.lang.String r2 = new java.lang.String
                gy3.C87412m.m108593f(r0, r5)
                java.nio.charset.Charset r3 = z04.C119027c.f356488a
                r2.<init>(r0, r3)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x0077 }
                if (r0 != 0) goto L_0x0267
                te3.xi1 r0 = new te3.xi1     // Catch:{ Exception -> 0x0077 }
                r0.<init>()     // Catch:{ Exception -> 0x0077 }
                r0.toPb(r2)     // Catch:{ Exception -> 0x0077 }
                te3.kp1 r2 = new te3.kp1     // Catch:{ Exception -> 0x0077 }
                r2.<init>()     // Catch:{ Exception -> 0x0077 }
                r2.f136960i = r0     // Catch:{ Exception -> 0x0077 }
                r0 = 2
                r2.f136955d = r0     // Catch:{ Exception -> 0x0077 }
                r4.mo77226G(r2)     // Catch:{ Exception -> 0x0077 }
                goto L_0x0267
            L_0x0077:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r15, r2)
                goto L_0x0267
            L_0x007f:
                java.lang.String r3 = "notifyRedDot"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0089
                goto L_0x0267
            L_0x0089:
                java.lang.String r0 = r0.getStringExtra(r6)
                if (r0 != 0) goto L_0x0090
                goto L_0x0091
            L_0x0090:
                r7 = r0
            L_0x0091:
                byte[] r0 = android.util.Base64.decode(r7, r13)
                java.lang.String r2 = new java.lang.String
                gy3.C87412m.m108593f(r0, r5)
                java.nio.charset.Charset r3 = z04.C119027c.f356488a
                r2.<init>(r0, r3)
                int r3 = r0.length     // Catch:{ Exception -> 0x00c4 }
                if (r3 != 0) goto L_0x00a4
                r3 = 1
                goto L_0x00a5
            L_0x00a4:
                r3 = 0
            L_0x00a5:
                r3 = r3 ^ r8
                if (r3 == 0) goto L_0x00a9
                r10 = r0
            L_0x00a9:
                if (r10 == 0) goto L_0x0267
                te3.xi1 r0 = new te3.xi1     // Catch:{ Exception -> 0x00c4 }
                r0.<init>()     // Catch:{ Exception -> 0x00c4 }
                r0.toPb(r2)     // Catch:{ Exception -> 0x00c4 }
                te3.wi1 r2 = new te3.wi1     // Catch:{ Exception -> 0x00c4 }
                r2.<init>()     // Catch:{ Exception -> 0x00c4 }
                r2.f144068e = r0     // Catch:{ Exception -> 0x00c4 }
                java.util.LinkedList<te3.xi1> r3 = r2.f144069f     // Catch:{ Exception -> 0x00c4 }
                r3.add(r0)     // Catch:{ Exception -> 0x00c4 }
                r4.mo77224E(r2)     // Catch:{ Exception -> 0x00c4 }
                goto L_0x0267
            L_0x00c4:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r13]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r15, r2)
                goto L_0x0267
            L_0x00cc:
                java.lang.String r3 = "push"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00d6
                goto L_0x0267
            L_0x00d6:
                java.lang.String r0 = r0.getStringExtra(r6)
                if (r0 != 0) goto L_0x00dd
                goto L_0x00de
            L_0x00dd:
                r7 = r0
            L_0x00de:
                byte[] r0 = android.util.Base64.decode(r7, r13)
                java.lang.String r2 = new java.lang.String
                gy3.C87412m.m108593f(r0, r5)
                java.nio.charset.Charset r3 = z04.C119027c.f356488a
                r2.<init>(r0, r3)
                int r3 = r0.length     // Catch:{ Exception -> 0x0119 }
                if (r3 != 0) goto L_0x00f1
                r3 = 1
                goto L_0x00f2
            L_0x00f1:
                r3 = 0
            L_0x00f2:
                r3 = r3 ^ r8
                if (r3 == 0) goto L_0x00f6
                r10 = r0
            L_0x00f6:
                if (r10 == 0) goto L_0x0267
                te3.xi1 r5 = new te3.xi1     // Catch:{ Exception -> 0x0119 }
                r5.<init>()     // Catch:{ Exception -> 0x0119 }
                r5.toPb(r2)     // Catch:{ Exception -> 0x0119 }
                java.lang.String r6 = "FinderShell"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r0 = 0
                r2 = 252(0xfc, float:3.53E-43)
                r3 = 0
                r13 = r0
                r16 = r14
                r14 = r2
                r2 = r15
                r15 = r3
                ht1.C60152b4.C8759a.m8561a(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ Exception -> 0x0117 }
                goto L_0x0267
            L_0x0117:
                r0 = move-exception
                goto L_0x011d
            L_0x0119:
                r0 = move-exception
                r16 = r14
                r2 = r15
            L_0x011d:
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r11 = r16
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r2, r3)
                goto L_0x0267
            L_0x0127:
                r11 = r14
                r3 = 0
                java.lang.String r5 = "record"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0133
                goto L_0x0267
            L_0x0133:
                java.lang.String r2 = "ctrlType"
                int r2 = r0.getIntExtra(r2, r3)
                java.lang.String r5 = "path"
                java.lang.String r0 = r0.getStringExtra(r5)
                if (r0 != 0) goto L_0x0142
                r0 = r7
            L_0x0142:
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r5 != 0) goto L_0x0267
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r5 = r0
                java.util.List r4 = ht1.C60152b4.C8759a.m8564d(r4, r5, r6, r7, r8, r9)
                java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
                com.tencent.mm.plugin.finder.extension.reddot.s0 r4 = (com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0) r4
                if (r4 == 0) goto L_0x015e
                te3.xi1 r5 = r4.field_ctrInfo
                pe3.b r5 = r5.f144671f
                goto L_0x015f
            L_0x015e:
                r5 = r10
            L_0x015f:
                if (r5 == 0) goto L_0x0190
                byte[] r6 = r5.f257327a
                java.lang.String r6 = android.util.Base64.encodeToString(r6, r3)
                byte[] r6 = android.util.Base64.decode(r6, r3)
                byte[] r5 = r5.f257327a
                if (r5 == 0) goto L_0x0190
                int r7 = r5.length
                r13 = 0
            L_0x0171:
                if (r13 >= r7) goto L_0x0190
                byte r3 = r5[r13]
                byte r8 = r6[r13]
                if (r3 == r8) goto L_0x018d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r8 = "diff "
                r3.append(r8)
                r3.append(r13)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            L_0x018d:
                int r13 = r13 + 1
                goto L_0x0171
            L_0x0190:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "record path:"
                r3.append(r5)
                r3.append(r0)
                java.lang.String r0 = " ctrlType:"
                r3.append(r0)
                r3.append(r2)
                java.lang.String r0 = " ctrlInfo:"
                r3.append(r0)
                if (r4 == 0) goto L_0x01b4
                te3.xi1 r0 = r4.field_ctrInfo
                if (r0 == 0) goto L_0x01b4
                org.json.JSONObject r10 = r0.toJSON()
            L_0x01b4:
                r3.append(r10)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
                goto L_0x0267
            L_0x01c0:
                r11 = r14
                r12 = r15
                r3 = 0
                java.lang.String r9 = "pushTabTips"
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x01cd
                goto L_0x0267
            L_0x01cd:
                java.lang.String r0 = r0.getStringExtra(r6)
                if (r0 != 0) goto L_0x01d4
                goto L_0x01d5
            L_0x01d4:
                r7 = r0
            L_0x01d5:
                byte[] r0 = android.util.Base64.decode(r7, r3)
                java.lang.String r2 = new java.lang.String
                gy3.C87412m.m108593f(r0, r5)
                java.nio.charset.Charset r5 = z04.C119027c.f356488a
                r2.<init>(r0, r5)
                int r5 = r0.length     // Catch:{ Exception -> 0x0210 }
                if (r5 != 0) goto L_0x01e8
                r13 = 1
                goto L_0x01e9
            L_0x01e8:
                r13 = 0
            L_0x01e9:
                r5 = r13 ^ 1
                if (r5 == 0) goto L_0x01ee
                r10 = r0
            L_0x01ee:
                if (r10 == 0) goto L_0x0267
                te3.xi1 r0 = new te3.xi1     // Catch:{ Exception -> 0x0210 }
                r0.<init>()     // Catch:{ Exception -> 0x0210 }
                r0.toPb(r2)     // Catch:{ Exception -> 0x0210 }
                te3.dn1 r2 = new te3.dn1     // Catch:{ Exception -> 0x0210 }
                r2.<init>()     // Catch:{ Exception -> 0x0210 }
                java.util.LinkedList<te3.fn1> r5 = r2.f132433d     // Catch:{ Exception -> 0x0210 }
                te3.fn1 r6 = new te3.fn1     // Catch:{ Exception -> 0x0210 }
                r6.<init>()     // Catch:{ Exception -> 0x0210 }
                r6.f133597d = r0     // Catch:{ Exception -> 0x0210 }
                r5.add(r6)     // Catch:{ Exception -> 0x0210 }
                java.lang.String r0 = "shellTest"
                r4.mo77250V5(r2, r0)     // Catch:{ Exception -> 0x0210 }
                goto L_0x0267
            L_0x0210:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r12, r2)
                goto L_0x0267
            L_0x0217:
                r11 = r14
                r12 = r15
                r3 = 0
                java.lang.String r8 = "notifyCount"
                boolean r2 = r2.equals(r8)
                if (r2 != 0) goto L_0x0223
                goto L_0x0267
            L_0x0223:
                java.lang.String r0 = r0.getStringExtra(r6)
                if (r0 != 0) goto L_0x022a
                goto L_0x022b
            L_0x022a:
                r7 = r0
            L_0x022b:
                byte[] r0 = android.util.Base64.decode(r7, r3)
                java.lang.String r2 = new java.lang.String
                gy3.C87412m.m108593f(r0, r5)
                java.nio.charset.Charset r5 = z04.C119027c.f356488a
                r2.<init>(r0, r5)
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0261 }
                r0.<init>(r2)     // Catch:{ Exception -> 0x0261 }
                java.lang.String r2 = "likeCount"
                int r5 = r0.optInt(r2)     // Catch:{ Exception -> 0x0261 }
                java.lang.String r2 = "commentCount"
                int r6 = r0.optInt(r2)     // Catch:{ Exception -> 0x0261 }
                java.lang.String r2 = "followCount"
                int r7 = r0.optInt(r2)     // Catch:{ Exception -> 0x0261 }
                java.lang.String r2 = "systemCount"
                int r8 = r0.optInt(r2)     // Catch:{ Exception -> 0x0261 }
                zc1.b r0 = zc1.C66785b.f191882e     // Catch:{ Exception -> 0x0261 }
                java.lang.String r9 = r0.mo90662O5()     // Catch:{ Exception -> 0x0261 }
                r4.mo77223D(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0261 }
                goto L_0x0267
            L_0x0261:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r12, r2)
            L_0x0267:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mp1.C11074a.C11077c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C11074a() {
        mo11213a("execSql", C11075a.f32851d);
        mo11213a("sendGifts", C11076b.f32852d);
        mo11213a("redDot", new C11077c(this));
    }

    /* renamed from: a */
    public final void mo11213a(String str, C32226l<? super Intent, C13598b0> lVar) {
        HashMap<String, C32226l<Intent, C13598b0>> hashMap = FinderShellInit.f81258a;
        C87412m.m108594g(str, FileReaderHelper.OPEN_FILE_FROM_CMD);
        C87412m.m108594g(lVar, "shell");
        HashMap<String, C32226l<Intent, C13598b0>> hashMap2 = FinderShellInit.f81258a;
        Locale locale = Locale.getDefault();
        C87412m.m108593f(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        hashMap2.put(lowerCase, lVar);
    }
}
