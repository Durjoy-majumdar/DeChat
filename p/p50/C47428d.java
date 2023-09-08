package p50;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import h81.C32735h;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: p50.d */
public final class C47428d {

    /* renamed from: d */
    public static final C47429b f127226d = new C47429b((C8480h) null);

    /* renamed from: e */
    public static final C13601g<Boolean> f127227e = C36568h.m40985a(C35368a.f94701d);

    /* renamed from: a */
    public int f127228a;

    /* renamed from: b */
    public String f127229b = "";

    /* renamed from: c */
    public String f127230c = "";

    /* renamed from: p50.d$a */
    public static final class C35368a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C35368a f94701d = new C35368a();

        public C35368a() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_cgi_dns_enable_switch, 0) == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: p50.d$b */
    public static final class C47429b {
        public C47429b(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            r3 = r4.getString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo72454a(int r3, android.os.Bundle r4) {
            /*
                r2 = this;
                rx3.g<java.lang.Boolean> r3 = p50.C47428d.f127227e
                rx3.n r3 = (rx3.C36570n) r3
                java.lang.Object r3 = r3.getValue()
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                r0 = 1
                r1 = 0
                if (r3 == 0) goto L_0x0026
                if (r4 != 0) goto L_0x0015
                goto L_0x0026
            L_0x0015:
                java.lang.String r3 = "EVT_MSG"
                java.lang.String r3 = r4.getString(r3)
                if (r3 == 0) goto L_0x0026
                java.lang.String r4 = "errCode:1003"
                boolean r3 = z04.C112550d0.m153801u(r3, r4, r1)
                if (r3 != r0) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p50.C47428d.C47429b.mo72454a(int, android.os.Bundle):boolean");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0174  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Boolean, java.lang.String> mo72451a(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r19
            r8 = r20
            java.lang.String r1 = "playerUrl"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "backupDomain"
            gy3.C87412m.m108594g(r8, r1)
            int r1 = r20.length()
            r9 = 1
            r10 = 0
            if (r1 != 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.String r11 = "getBackupUrlByDomain: backupDomain:"
            java.lang.String r12 = "LiveBackupHelper"
            if (r1 == 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r8)
            java.lang.String r2 = " is invalid!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r7)
            return r1
        L_0x0040:
            int r1 = r0.f127228a
            if (r1 <= 0) goto L_0x006a
            w50.b r1 = w50.C65928b.f189533a
            boolean r1 = r1.mo89967f()
            if (r1 == 0) goto L_0x0062
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "(DEBUG)getBackupUrlByDomain unknowHostBackUpCnt:"
            r1.append(r2)
            int r2 = r0.f127228a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
        L_0x0062:
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r7)
            return r1
        L_0x006a:
            int r1 = r1 + r9
            r0.f127228a = r1
            w50.a r13 = w50.C53075a.f148139a
            int r1 = r20.length()
            if (r1 != 0) goto L_0x0077
            r1 = 1
            goto L_0x0078
        L_0x0077:
            r1 = 0
        L_0x0078:
            if (r1 == 0) goto L_0x007d
        L_0x007a:
            r4 = 0
            goto L_0x014b
        L_0x007d:
            java.net.URI r1 = new java.net.URI
            r1.<init>(r7)
            java.lang.String r1 = r1.getHost()
            java.lang.String r2 = "domain"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r14 = ".com"
            boolean r2 = z04.C112550d0.m153801u(r1, r14, r10)
            r15 = 2
            java.lang.String r6 = "LiveBackUpUtil"
            r5 = 0
            if (r2 == 0) goto L_0x009b
            r3 = r5
            r10 = r6
            goto L_0x010c
        L_0x009b:
            int r1 = r19.length()
            if (r1 != 0) goto L_0x00a3
            r1 = 1
            goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            if (r1 != 0) goto L_0x00c1
            java.lang.String[] r2 = new java.lang.String[]{r14}
            r3 = 0
            r4 = 0
            r16 = 6
            r17 = 0
            r1 = r19
            r5 = r16
            r10 = r6
            r6 = r17
            java.util.List r1 = z04.C112550d0.m153785U(r1, r2, r3, r4, r5, r6)
            int r1 = r1.size()
            int r1 = r1 - r9
            goto L_0x00c3
        L_0x00c1:
            r10 = r6
            r1 = 0
        L_0x00c3:
            if (r1 == r9) goto L_0x00c7
        L_0x00c5:
            r3 = 0
            goto L_0x010b
        L_0x00c7:
            java.util.List r2 = r13.mo73764b(r7)
            w50.b r3 = w50.C65928b.f189533a
            boolean r3 = r3.mo89967f()
            if (r3 == 0) goto L_0x00ef
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getDomain comCount:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " spiltList:"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
        L_0x00ef:
            if (r2 == 0) goto L_0x00c5
            java.util.Iterator r1 = r2.iterator()
        L_0x00f5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c5
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r4 = 0
            boolean r5 = z04.C112550d0.m153803w(r2, r14, r4, r15, r3)
            if (r5 == 0) goto L_0x00f5
            r1 = r2
            goto L_0x010c
        L_0x010b:
            r1 = r3
        L_0x010c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "replaceDomain domain:"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = ",backupDomain:"
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            if (r1 == 0) goto L_0x0133
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            r4 = 0
            goto L_0x0134
        L_0x0133:
            r4 = 1
        L_0x0134:
            if (r4 != 0) goto L_0x007a
            java.lang.String r2 = "live.p2p.com"
            r4 = 0
            boolean r2 = z04.C112550d0.m153803w(r1, r2, r4, r15, r3)
            if (r2 != 0) goto L_0x014b
            boolean r2 = gy3.C87412m.m108589b(r1, r8)
            if (r2 == 0) goto L_0x0146
            goto L_0x014b
        L_0x0146:
            java.lang.String r1 = z04.C112551y.m153814n(r7, r1, r8, r4)
            goto L_0x014c
        L_0x014b:
            r1 = r7
        L_0x014c:
            boolean r2 = gy3.C87412m.m108589b(r7, r1)
            if (r2 == 0) goto L_0x0174
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r8)
            java.lang.String r2 = ", backDomainUrl equal playerUrl:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r7)
            return r1
        L_0x0174:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getBackupUrlByDomain: curUrl:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " ,"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = " ,backDomainUrl:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x019f
            goto L_0x01a0
        L_0x019f:
            r9 = 0
        L_0x01a0:
            if (r9 == 0) goto L_0x01ac
            r0.f127229b = r1
            rx3.l r2 = new rx3.l
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.<init>(r3, r1)
            goto L_0x01b3
        L_0x01ac:
            rx3.l r2 = new rx3.l
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2.<init>(r1, r7)
        L_0x01b3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p50.C47428d.mo72451a(java.lang.String, java.lang.String):rx3.l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a2, code lost:
        if (com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv4Address(r8) != false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01af, code lost:
        if (com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv6Address(r2) == false) goto L_0x01b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x00b7 A[EDGE_INSN: B:149:0x00b7->B:55:0x00b7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Boolean, java.lang.String> mo72452b(java.lang.String r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.String r1 = "playerUrl"
            r2 = r22
            gy3.C87412m.m108594g(r2, r1)
            int r1 = r22.length()
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = r0.f127229b
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.lang.String r11 = "LiveBackupHelper"
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = "getBackupUrlByIp but backup player url is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r2)
            rx3.l r2 = new rx3.l
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.<init>(r3, r1)
            return r2
        L_0x0034:
            w50.a r2 = w50.C53075a.f148139a
            java.util.LinkedList<te3.ro> r5 = w50.C53075a.f148140b
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r5 = 0
            goto L_0x0044
        L_0x0043:
            r5 = 1
        L_0x0044:
            if (r5 == 0) goto L_0x005b
            w50.b r2 = w50.C65928b.f189533a
            boolean r2 = r2.mo89967f()
            if (r2 == 0) goto L_0x0053
            java.lang.String r2 = "(DEBUG)getBackupUrlByIp cdnIpInfoList is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
        L_0x0053:
            rx3.l r2 = new rx3.l
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.<init>(r3, r1)
            return r2
        L_0x005b:
            java.lang.String r5 = r0.f127230c
            java.lang.String r6 = "url"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "lastIp"
            gy3.C87412m.m108594g(r5, r6)
            boolean r6 = w50.C53075a.f148141c
            r7 = 0
            if (r6 != 0) goto L_0x0080
            java.util.LinkedList<te3.ro> r6 = w50.C53075a.f148140b
            if (r6 == 0) goto L_0x0079
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r6 = 0
            goto L_0x007a
        L_0x0079:
            r6 = 1
        L_0x007a:
            if (r6 == 0) goto L_0x0080
            r2.mo73763a()
            goto L_0x00be
        L_0x0080:
            java.util.LinkedList<te3.ro> r6 = w50.C53075a.f148140b
            if (r6 == 0) goto L_0x00be
            java.util.Iterator r6 = r6.iterator()
        L_0x0088:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00b6
            java.lang.Object r8 = r6.next()
            r9 = r8
            te3.ro r9 = (te3.C51133ro) r9
            java.lang.String r10 = r9.f141056d
            if (r10 == 0) goto L_0x00a2
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r10 = 0
            goto L_0x00a3
        L_0x00a2:
            r10 = 1
        L_0x00a3:
            if (r10 != 0) goto L_0x00b2
            java.lang.String r9 = r9.f141056d
            gy3.C87412m.m108591d(r9)
            boolean r9 = z04.C112550d0.m153801u(r1, r9, r4)
            if (r9 == 0) goto L_0x00b2
            r9 = 1
            goto L_0x00b3
        L_0x00b2:
            r9 = 0
        L_0x00b3:
            if (r9 == 0) goto L_0x0088
            goto L_0x00b7
        L_0x00b6:
            r8 = r7
        L_0x00b7:
            te3.ro r8 = (te3.C51133ro) r8
            if (r8 == 0) goto L_0x00be
            java.util.LinkedList<java.lang.String> r6 = r8.f141057e
            goto L_0x00bf
        L_0x00be:
            r6 = r7
        L_0x00bf:
            if (r6 == 0) goto L_0x00ca
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r8 = 0
            goto L_0x00cb
        L_0x00ca:
            r8 = 1
        L_0x00cb:
            java.lang.String r12 = ""
            java.lang.String r9 = "LiveBackUpUtil"
            if (r8 == 0) goto L_0x00dd
            java.lang.String r2 = "insertIpIntoUrl ipList is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            rx3.l r2 = new rx3.l
            r2.<init>(r12, r1)
            goto L_0x024f
        L_0x00dd:
            java.net.URI r8 = new java.net.URI
            r8.<init>(r1)
            java.lang.String r10 = r8.getHost()
            if (r10 == 0) goto L_0x00f1
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r10 = 0
            goto L_0x00f2
        L_0x00f1:
            r10 = 1
        L_0x00f2:
            java.lang.String r13 = ".com"
            r14 = -1
            if (r10 != 0) goto L_0x0130
            java.lang.String r10 = r8.getHost()
            java.lang.String r15 = "uri.host"
            gy3.C87412m.m108593f(r10, r15)
            boolean r10 = z04.C112550d0.m153801u(r10, r13, r4)
            if (r10 != 0) goto L_0x0130
            int r2 = r8.getPort()
            if (r2 == r14) goto L_0x012a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = r8.getHost()
            r2.append(r7)
            r7 = 58
            r2.append(r7)
            int r7 = r8.getPort()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            goto L_0x01b2
        L_0x012a:
            java.lang.String r7 = r8.getHost()
            goto L_0x01b2
        L_0x0130:
            java.util.List r2 = r2.mo73764b(r1)
            w50.b r8 = w50.C65928b.f189533a
            boolean r8 = r8.mo89967f()
            if (r8 == 0) goto L_0x0150
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "getIp spiltList:"
            r8.append(r10)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
        L_0x0150:
            if (r2 == 0) goto L_0x0159
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x015a
        L_0x0159:
            r2 = r7
        L_0x015a:
            if (r2 == 0) goto L_0x0165
            int r8 = r2.length()
            if (r8 != 0) goto L_0x0163
            goto L_0x0165
        L_0x0163:
            r8 = 0
            goto L_0x0166
        L_0x0165:
            r8 = 1
        L_0x0166:
            if (r8 != 0) goto L_0x01b2
            r8 = 2
            boolean r10 = z04.C112550d0.m153803w(r2, r13, r4, r8, r7)
            if (r10 != 0) goto L_0x01b2
            java.lang.String r10 = "::"
            boolean r13 = z04.C112550d0.m153803w(r2, r10, r4, r8, r7)
            if (r13 == 0) goto L_0x01a5
            java.lang.String[] r16 = new java.lang.String[]{r10}
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            r15 = r2
            java.util.List r10 = z04.C112550d0.m153785U(r15, r16, r17, r18, r19, r20)
            int r13 = r10.size()
            if (r13 <= r8) goto L_0x0195
            boolean r8 = com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv6Address(r2)
            if (r8 == 0) goto L_0x0195
            goto L_0x01b1
        L_0x0195:
            java.lang.Object r8 = sx3.C110818d0.m150916N(r10)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x019e
            r8 = r12
        L_0x019e:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv4Address(r8)
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x01a5:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv4Address(r2)
            if (r8 != 0) goto L_0x01b1
            boolean r8 = com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv6Address(r2)
            if (r8 == 0) goto L_0x01b2
        L_0x01b1:
            r7 = r2
        L_0x01b2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "insertIpIntoUrl lastIp:"
            r2.append(r8)
            r2.append(r5)
            java.lang.String r8 = ", urlSourceIp:"
            r2.append(r8)
            r2.append(r7)
            java.lang.String r8 = ",ipList:"
            r2.append(r8)
            r2.append(r6)
            r8 = 33
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            if (r7 == 0) goto L_0x01e6
            int r2 = r7.length()
            if (r2 != 0) goto L_0x01e4
            goto L_0x01e6
        L_0x01e4:
            r2 = 0
            goto L_0x01e7
        L_0x01e6:
            r2 = 1
        L_0x01e7:
            if (r2 == 0) goto L_0x0233
            java.lang.String r2 = w50.C53075a.m59427d(r6, r5)
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x01f5
            r5 = 1
            goto L_0x01f6
        L_0x01f5:
            r5 = 0
        L_0x01f6:
            if (r5 == 0) goto L_0x0231
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.lang.String r6 = "://"
            r5 = r1
            int r5 = z04.C112550d0.m153769E(r5, r6, r7, r8, r9, r10)
            if (r5 == r14) goto L_0x0247
            int r5 = r5 + 3
            int r6 = r1.length()
            if (r5 >= r6) goto L_0x0247
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            r8 = 47
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r5 = r6.insert(r5, r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "StringBuilder(url).inser…urlTargetIp/\").toString()"
            gy3.C87412m.m108593f(r5, r6)
            goto L_0x0249
        L_0x0231:
            r5 = r1
            goto L_0x0249
        L_0x0233:
            java.lang.String r12 = w50.C53075a.m59427d(r6, r7)
            int r2 = r12.length()
            if (r2 <= 0) goto L_0x023f
            r2 = 1
            goto L_0x0240
        L_0x023f:
            r2 = 0
        L_0x0240:
            if (r2 == 0) goto L_0x0247
            java.lang.String r5 = z04.C112551y.m153814n(r1, r7, r12, r4)
            goto L_0x0248
        L_0x0247:
            r5 = r1
        L_0x0248:
            r2 = r12
        L_0x0249:
            rx3.l r6 = new rx3.l
            r6.<init>(r2, r5)
            r2 = r6
        L_0x024f:
            B r5 = r2.f38556e
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = gy3.C87412m.m108589b(r1, r5)
            if (r6 == 0) goto L_0x027a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getBackupUrlByIp but curUrl:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " equal backupPlayerUrl!"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r2)
            rx3.l r2 = new rx3.l
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.<init>(r3, r1)
            return r2
        L_0x027a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getBackupUrlByIp: curUrl:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = " ,backDomainUrl:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = " ,unknowHostBackupIp:"
            r6.append(r7)
            A r7 = r2.f38555d
            java.lang.String r7 = (java.lang.String) r7
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r6)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x02a9
            r4 = 1
        L_0x02a9:
            if (r4 == 0) goto L_0x02c0
            int r1 = r0.f127228a
            int r1 = r1 + r3
            r0.f127228a = r1
            A r1 = r2.f38555d
            java.lang.String r1 = (java.lang.String) r1
            r0.f127230c = r1
            r0.f127229b = r5
            rx3.l r1 = new rx3.l
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r2, r5)
            goto L_0x02c8
        L_0x02c0:
            rx3.l r2 = new rx3.l
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.<init>(r3, r1)
            r1 = r2
        L_0x02c8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p50.C47428d.mo72452b(java.lang.String):rx3.l");
    }

    /* renamed from: c */
    public final void mo72453c() {
        Log.m105924i("LiveBackupHelper", "resetUnknowHostBackupInfo");
        this.f127228a = 0;
        this.f127229b = "";
        this.f127230c = "";
    }
}
