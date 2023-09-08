package com.tencent.p014mm.modelstat;

import com.tencent.p014mm.autogen.mmdata.rpt.MsgHistoryResendActionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MsgHistoryWatchReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45629t0;
import eb0.C75592q0;
import eb0.C75604z3;

/* renamed from: com.tencent.mm.modelstat.a */
public class C68144a {

    /* renamed from: com.tencent.mm.modelstat.a$a */
    public enum C68145a {
        Expose(1),
        Click(2);
        

        /* renamed from: d */
        public int f195830d;

        /* access modifiers changed from: public */
        C68145a(int i) {
            this.f195830d = i;
        }
    }

    /* renamed from: a */
    public static void m80545a(C72963f4 f4Var) {
        if (f4Var == null) {
            Log.m105926v("MicroMsg.ChattingExpUtil", "reportClickRecordHistoryMsgs, msg = null.");
            return;
        }
        MsgHistoryWatchReportStruct msgHistoryWatchReportStruct = new MsgHistoryWatchReportStruct();
        String t = f4Var.mo108768t();
        msgHistoryWatchReportStruct.f156511e = msgHistoryWatchReportStruct.mo86045b("ChatNameStr", t, true);
        int c = C45629t0.m50816c(t);
        msgHistoryWatchReportStruct.f156510d = (long) c;
        msgHistoryWatchReportStruct.mo86054n();
        Log.m105919d("MicroMsg.ChattingExpUtil", "report logbuffer(22335): [curUsername]: %s, chatType: %s", t, Integer.valueOf(c));
    }

    /* renamed from: b */
    public static void m80546b(C72963f4 f4Var, int i) {
        String s;
        if (f4Var == null) {
            Log.m105926v("MicroMsg.ChattingExpUtil", "reportHistoryRecordAction, msg = null.");
            return;
        }
        MsgHistoryResendActionReportStruct msgHistoryResendActionReportStruct = new MsgHistoryResendActionReportStruct();
        String t = f4Var.mo108768t();
        String nullAs = Util.nullAs(t, "");
        boolean U5 = C72996z1.m85820U5(t);
        if (U5 && U5 && (s = C75604z3.m90847s(f4Var.getContent())) != null && s.length() > 0) {
            nullAs = s;
        }
        String s2 = C75592q0.m90789s();
        int c = C45629t0.m50816c(t);
        msgHistoryResendActionReportStruct.f156507d = (long) c;
        Log.m105919d("MicroMsg.ChattingExpUtil", "report logbuffer(22336): [username]: %s, curUsername: %s, actionType: %s, chatType: %s, chatname: %s.", s2, t, Integer.valueOf(i), Integer.valueOf(c), nullAs);
        msgHistoryResendActionReportStruct.f156509f = msgHistoryResendActionReportStruct.mo86045b("ChatNameStr", t, true);
        msgHistoryResendActionReportStruct.f156508e = (long) i;
        msgHistoryResendActionReportStruct.mo86054n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0073, code lost:
        r7 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6.getContent(), r6.mo108775z2());
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m80547c(com.tencent.p014mm.storage.C72963f4 r6, com.tencent.p014mm.modelstat.C68144a.C68145a r7) {
        /*
            java.lang.String r0 = r6.f230733Q
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            ad0.t r0 = new ad0.t
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.f230733Q
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "20ExpIdStr"
            r0.mo32a(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r7 = r7.f195830d
            r1.append(r7)
            r1.append(r2)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "21OpType"
            r0.mo32a(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r3 = r6.mo108774y2()
            r7.append(r3)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "22msgId"
            r0.mo32a(r1, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r1 = r6.getType()
            r7.append(r1)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "23MessageType"
            r0.mo32a(r1, r7)
            boolean r7 = r6.mo101020w3()
            r1 = 0
            if (r7 == 0) goto L_0x0085
            java.lang.String r7 = r6.getContent()
            java.lang.String r3 = r6.mo108775z2()
            com.tencent.mm.message.l$b r7 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r7, r3)
            if (r7 != 0) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            int r7 = r7.f195582i
            goto L_0x0086
        L_0x0085:
            r7 = 0
        L_0x0086:
            java.lang.String r3 = r6.mo108768t()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = "24AppMsgInnerType"
            r0.mo32a(r4, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r4 = "25curUsername"
            r0.mo32a(r4, r7)
            java.lang.String r7 = ""
            int r4 = r6.mo108769t2()
            r5 = 1
            if (r4 != r5) goto L_0x00c0
            java.lang.String r3 = eb0.C75592q0.m90789s()
            goto L_0x00e6
        L_0x00c0:
            if (r3 == 0) goto L_0x00e6
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            if (r4 == 0) goto L_0x00e6
            java.lang.String r3 = r6.getContent()
            if (r3 == 0) goto L_0x00e5
            java.lang.String r3 = r6.getContent()
            int r3 = eb0.C75604z3.m90848t(r3)
            r4 = -1
            if (r3 == r4) goto L_0x00e5
            java.lang.String r7 = r6.getContent()
            java.lang.String r7 = r7.substring(r1, r3)
            java.lang.String r7 = r7.trim()
        L_0x00e5:
            r3 = r7
        L_0x00e6:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r3 = "26msgPostUserName"
            r0.mo32a(r3, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r6 = r6.f230734R
            r7.append(r6)
            r7.append(r2)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "27MediaState"
            r0.mo32a(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "report logbuffer(13564): [chatting_exp]"
            r6.append(r7)
            java.lang.String r7 = r0.mo34c()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.ChattingExpUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r6)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 13564(0x34fc, float:1.9007E-41)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r1] = r0
            r6.mo160131h(r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelstat.C68144a.m80547c(com.tencent.mm.storage.f4, com.tencent.mm.modelstat.a$a):void");
    }
}
