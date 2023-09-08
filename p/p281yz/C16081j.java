package p281yz;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C75592q0;
import eb0.C86497v5;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: yz.j */
public final class C16081j implements C86497v5.C31521b {

    /* renamed from: yz.j$a */
    public static final class C16082a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map<String, String> f43230d;

        public C16082a(Map<String, String> map) {
            this.f43230d = map;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0116, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0117, code lost:
            r3 = r10;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0116 A[ExcHandler: all (th java.lang.Throwable), PHI: r10 
          PHI: (r10v5 android.database.Cursor) = (r10v6 android.database.Cursor), (r10v6 android.database.Cursor), (r10v11 android.database.Cursor) binds: [B:37:0x0112, B:38:?, B:18:0x009b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:18:0x009b] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x012a A[Catch:{ Exception -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0161 A[Catch:{ Exception -> 0x010c }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01b7  */
        /* JADX WARNING: Removed duplicated region for block: B:70:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r17 = this;
                r1 = r17
                java.lang.Class<f62.k0> r0 = f62.C75700k0.class
                java.lang.String r2 = "MicroMsg.PayMsgListener"
                r3 = 0
                r4 = 0
                r5 = 1
                java.util.Map<java.lang.String, java.lang.String> r6 = r1.f43230d     // Catch:{ Exception -> 0x010c }
                java.lang.String r7 = ".sysmsg.paymsg.appmsgcontent"
                java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x010c }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x010c }
                java.util.Map<java.lang.String, java.lang.String> r7 = r1.f43230d     // Catch:{ Exception -> 0x010c }
                java.lang.String r8 = ".sysmsg.paymsg.fromusername"
                java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x010c }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x010c }
                java.util.Map<java.lang.String, java.lang.String> r8 = r1.f43230d     // Catch:{ Exception -> 0x010c }
                java.lang.String r9 = ".sysmsg.paymsg.tousername"
                java.lang.Object r8 = r8.get(r9)     // Catch:{ Exception -> 0x010c }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x010c }
                java.util.Map<java.lang.String, java.lang.String> r9 = r1.f43230d     // Catch:{ Exception -> 0x010c }
                java.lang.String r10 = ".sysmsg.paymsg.paymsgid"
                java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x010c }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x010c }
                java.lang.String r10 = "UTF-8"
                java.lang.String r6 = java.net.URLDecoder.decode(r6, r10)     // Catch:{ Exception -> 0x010c }
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x010c }
                if (r10 != 0) goto L_0x0049
                java.lang.String r10 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x010c }
                boolean r10 = gy3.C87412m.m108589b(r7, r10)     // Catch:{ Exception -> 0x010c }
                if (r10 != 0) goto L_0x0049
                r10 = r7
                goto L_0x004a
            L_0x0049:
                r10 = r8
            L_0x004a:
                boolean r11 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)     // Catch:{ Exception -> 0x010c }
                if (r11 == 0) goto L_0x0052
                r10 = r7
                goto L_0x0059
            L_0x0052:
                boolean r11 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)     // Catch:{ Exception -> 0x010c }
                if (r11 == 0) goto L_0x0059
                r10 = r8
            L_0x0059:
                java.lang.String r11 = "username: %s, fromUsername: %s, toUsername: %s, talker: %s, payMsgId: %s"
                r12 = 5
                java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x010c }
                java.lang.String r13 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x010c }
                r12[r4] = r13     // Catch:{ Exception -> 0x010c }
                r12[r5] = r7     // Catch:{ Exception -> 0x010c }
                r7 = 2
                r12[r7] = r8     // Catch:{ Exception -> 0x010c }
                r8 = 3
                r12[r8] = r10     // Catch:{ Exception -> 0x010c }
                r13 = 4
                r12[r13] = r9     // Catch:{ Exception -> 0x010c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r12)     // Catch:{ Exception -> 0x010c }
                com.tencent.mm.message.l$b r9 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r3)     // Catch:{ Exception -> 0x010c }
                java.lang.String r11 = "appMsgContent: %s, appMsg: %s"
                java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x010c }
                r12[r4] = r6     // Catch:{ Exception -> 0x010c }
                r12[r5] = r9     // Catch:{ Exception -> 0x010c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r12)     // Catch:{ Exception -> 0x010c }
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x010c }
                r11.<init>()     // Catch:{ Exception -> 0x010c }
                if (r9 == 0) goto L_0x010f
                k40.a r12 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x010c }
                f62.k0 r12 = (f62.C75700k0) r12     // Catch:{ Exception -> 0x010c }
                g62.l r12 = r12.mo96095LE()     // Catch:{ Exception -> 0x010c }
                com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12     // Catch:{ Exception -> 0x010c }
                android.database.Cursor r10 = r12.Cx0(r10)     // Catch:{ Exception -> 0x010c }
                if (r10 == 0) goto L_0x0110
            L_0x009b:
                boolean r12 = r10.moveToNext()     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                if (r12 == 0) goto L_0x0110
                com.tencent.mm.storage.f4 r12 = new com.tencent.mm.storage.f4     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                r12.<init>()     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                r12.convertFrom(r10)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                java.lang.String r13 = r12.getContent()     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                com.tencent.mm.message.l$b r13 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r13, r3)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                if (r13 == 0) goto L_0x009b
                java.lang.String r14 = r13.f195616q1     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                if (r14 != 0) goto L_0x009b
                java.lang.String r13 = r13.f195616q1     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                java.lang.String r14 = r9.f195616q1     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                boolean r13 = gy3.C87412m.m108589b(r13, r14)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                if (r13 == 0) goto L_0x009b
                java.lang.String r13 = "update find msg id: %s, talker: %s, sender: %s"
                java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                long r15 = r12.getMsgId()     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                r14[r4] = r15     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                java.lang.String r15 = r12.mo108768t()     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                r14[r5] = r15     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                int r15 = r12.mo108769t2()     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                r14[r7] = r15     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r13, r14)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                java.lang.String r13 = r12.mo108768t()     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                boolean r13 = com.tencent.p014mm.storage.C72996z1.m85820U5(r13)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                if (r13 == 0) goto L_0x0101
                java.lang.String r13 = r12.getContent()     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                java.lang.String r13 = eb0.C75604z3.m90847s(r13)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                java.lang.String r13 = eb0.C75604z3.m90826A(r6, r13)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                r12.mo108732L2(r13)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                goto L_0x0104
            L_0x0101:
                r12.mo108732L2(r6)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
            L_0x0104:
                r11.add(r12)     // Catch:{ Exception -> 0x0108, all -> 0x0116 }
                goto L_0x009b
            L_0x0108:
                r0 = move-exception
                r3 = r10
                goto L_0x01a4
            L_0x010c:
                r0 = move-exception
                goto L_0x01a4
            L_0x010f:
                r10 = r3
            L_0x0110:
                if (r10 == 0) goto L_0x011a
                r10.close()     // Catch:{ Exception -> 0x011a, all -> 0x0116 }
                goto L_0x011b
            L_0x0116:
                r0 = move-exception
                r3 = r10
                goto L_0x01b5
            L_0x011a:
                r3 = r10
            L_0x011b:
                gy3.C87412m.m108591d(r9)     // Catch:{ Exception -> 0x010c }
                java.lang.String r8 = r9.f195616q1     // Catch:{ Exception -> 0x010c }
                long r12 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81600f(r8)     // Catch:{ Exception -> 0x010c }
                r14 = 0
                int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r8 < 0) goto L_0x0151
                java.lang.String r8 = "find lucky money msg, payMsgId:%s msgId:%d"
                java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x010c }
                java.lang.String r9 = r9.f195616q1     // Catch:{ Exception -> 0x010c }
                r10[r4] = r9     // Catch:{ Exception -> 0x010c }
                java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x010c }
                r10[r5] = r9     // Catch:{ Exception -> 0x010c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r10)     // Catch:{ Exception -> 0x010c }
                k40.a r8 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x010c }
                f62.k0 r8 = (f62.C75700k0) r8     // Catch:{ Exception -> 0x010c }
                g62.l r8 = r8.mo96095LE()     // Catch:{ Exception -> 0x010c }
                com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8     // Catch:{ Exception -> 0x010c }
                com.tencent.mm.storage.f4 r8 = r8.b00(r12)     // Catch:{ Exception -> 0x010c }
                r8.mo108732L2(r6)     // Catch:{ Exception -> 0x010c }
                r11.add(r8)     // Catch:{ Exception -> 0x010c }
            L_0x0151:
                java.lang.String r6 = "updateMsg: %s"
                java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x010c }
                r8[r4] = r11     // Catch:{ Exception -> 0x010c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r8)     // Catch:{ Exception -> 0x010c }
                int r6 = r11.size()     // Catch:{ Exception -> 0x010c }
                if (r6 <= 0) goto L_0x019c
                java.util.Iterator r6 = r11.iterator()     // Catch:{ Exception -> 0x010c }
            L_0x0165:
                boolean r8 = r6.hasNext()     // Catch:{ Exception -> 0x010c }
                if (r8 == 0) goto L_0x019c
                java.lang.Object r8 = r6.next()     // Catch:{ Exception -> 0x010c }
                com.tencent.mm.storage.f4 r8 = (com.tencent.p014mm.storage.C72963f4) r8     // Catch:{ Exception -> 0x010c }
                java.lang.String r9 = "do update msg: %s %s"
                java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x010c }
                long r11 = r8.getMsgId()     // Catch:{ Exception -> 0x010c }
                java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x010c }
                r10[r4] = r11     // Catch:{ Exception -> 0x010c }
                java.lang.String r11 = r8.getContent()     // Catch:{ Exception -> 0x010c }
                r10[r5] = r11     // Catch:{ Exception -> 0x010c }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r10)     // Catch:{ Exception -> 0x010c }
                k40.a r9 = f40.C86709a0.m107533q(r0)     // Catch:{ Exception -> 0x010c }
                f62.k0 r9 = (f62.C75700k0) r9     // Catch:{ Exception -> 0x010c }
                g62.l r9 = r9.mo96095LE()     // Catch:{ Exception -> 0x010c }
                long r10 = r8.getMsgId()     // Catch:{ Exception -> 0x010c }
                com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9     // Catch:{ Exception -> 0x010c }
                r9.xy0(r10, r8)     // Catch:{ Exception -> 0x010c }
                goto L_0x0165
            L_0x019c:
                if (r3 == 0) goto L_0x01b4
            L_0x019e:
                r3.close()
                goto L_0x01b4
            L_0x01a2:
                r0 = move-exception
                goto L_0x01b5
            L_0x01a4:
                java.lang.String r6 = "parse c2c content update msg error"
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a2 }
                java.lang.String r7 = r0.getMessage()     // Catch:{ all -> 0x01a2 }
                r5[r4] = r7     // Catch:{ all -> 0x01a2 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r6, r5)     // Catch:{ all -> 0x01a2 }
                if (r3 == 0) goto L_0x01b4
                goto L_0x019e
            L_0x01b4:
                return
            L_0x01b5:
                if (r3 == 0) goto L_0x01ba
                r3.close()
            L_0x01ba:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p281yz.C16081j.C16082a.run():void");
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
        C87412m.m108594g(cVar, "msg");
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        C87412m.m108594g(aVar, "addMsgInfo");
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        Map<String, String> parseXml = XmlParser.parseXml(g, "sysmsg", (String) null);
        if (parseXml != null) {
            int i = Util.getInt(parseXml.get(".sysmsg.paymsg.PayMsgType"), -1);
            Log.m105924i("MicroMsg.PayMsgListener", "got a pay msg, type = " + i);
            if (i == 16) {
                int i2 = Util.getInt(parseXml.get(".sysmsg.paymsg.Flag"), 0);
                Log.m105924i("MicroMsg.PayMsgListener", "MSG_TYPE_WALLET_TYPE_CHANGE,wallet_type=" + i2);
                if (i2 == 1) {
                    Log.m105924i("MicroMsg.PayMsgListener", "open wallet");
                    C75592q0.m90767O();
                } else if (i2 == 2) {
                    Log.m105924i("MicroMsg.PayMsgListener", "close wallet");
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119676J(40, Integer.valueOf(C75592q0.m90786p() & -32769));
                }
            } else if (i == 17) {
                int i3 = Util.getInt(parseXml.get(".sysmsg.paymsg.WalletType"), -1);
                Log.m105924i("MicroMsg.PayMsgListener", "MSG_TYPE_WALLET_TYPE_CHANGE,wallet_type=" + i3);
                if (i3 >= 0) {
                    C86709a0.m107535s().mo121142i().mo119676J(339975, Integer.valueOf(i3));
                }
            } else if (i == 37) {
                Log.m105925i("MicroMsg.PayMsgListener", "receive c2c content update msg: %s", g);
                C86709a0.m107525e().postToWorker(new C16082a(parseXml));
            }
        }
    }
}
