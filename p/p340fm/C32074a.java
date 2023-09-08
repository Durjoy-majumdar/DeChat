package p340fm;

import com.tencent.p014mm.autogen.events.KvReportEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: fm.a */
public class C32074a extends IStaticListener<KvReportEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r22) {
        /*
            r21 = this;
            r0 = r22
            com.tencent.mm.autogen.events.KvReportEvent r0 = (com.tencent.p014mm.autogen.events.KvReportEvent) r0
            hh0.e r1 = hh0.C32913e.f89480h
            if (r1 != 0) goto L_0x000f
            hh0.e r1 = new hh0.e
            r1.<init>()
            hh0.C32913e.f89480h = r1
        L_0x000f:
            hh0.e r1 = hh0.C32913e.f89480h
            r1.getClass()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            r9 = 0
            if (r2 != 0) goto L_0x001d
            goto L_0x01eb
        L_0x001d:
            if (r0 == 0) goto L_0x01eb
            com.tencent.mm.autogen.events.KvReportEvent$a r2 = r0.f78853d
            if (r2 != 0) goto L_0x0025
            goto L_0x01eb
        L_0x0025:
            long r3 = r2.f78854a
            r5 = 19943(0x4de7, double:9.853E-320)
            r10 = 0
            java.lang.String r12 = ","
            r13 = 3
            r14 = 2
            r15 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00bc
            java.lang.String r2 = r2.f78855b
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x003e
            goto L_0x00bc
        L_0x003e:
            java.lang.String[] r2 = r2.split(r12)
            if (r2 == 0) goto L_0x00bc
            int r3 = r2.length
            r4 = 4
            if (r3 > r4) goto L_0x004a
            goto L_0x00bc
        L_0x004a:
            r3 = r2[r15]
            java.lang.String r4 = "All"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00bc
            r3 = r2[r14]
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r10)
            r2 = r2[r13]
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r10)
            r4 = 1
            zt3.t r16 = zt3.C119157j.f356862d
            hh0.d r3 = new hh0.d
            r2 = r3
            r14 = r3
            r3 = r1
            r17 = r5
            r19 = r7
            r2.<init>(r3, r4, r5, r7)
            r2 = r16
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r3 = "Ai_thread"
            r2.mo183876g(r14, r3)
            hh0.b r2 = r1.f89482b
            hh0.a r3 = r1.f89481a
            com.tencent.mm.autogen.mmdata.rpt.AiFinderContextStruct r4 = r2.f89471a
            java.lang.String r5 = r3.f89465e
            java.lang.String r6 = "FinderRedDotTipsId"
            java.lang.String r5 = r4.mo86045b(r6, r5, r15)
            r4.f79082g = r5
            com.tencent.mm.autogen.mmdata.rpt.AiFinderContextStruct r2 = r2.f89471a
            int r4 = r3.f89466f
            long r4 = (long) r4
            r2.f79083h = r4
            int r3 = r3.f89467g
            long r3 = (long) r3
            r2.f79084i = r3
            hh0.b r2 = r1.f89482b
            com.tencent.mm.autogen.mmdata.rpt.AiFinderContextStruct r2 = r2.f89471a
            r3 = r17
            r2.f79080e = r3
            java.lang.String r5 = "LastEnterFinderTimeStampMs"
            r2.mo86048e(r5, r3)
            hh0.b r1 = r1.f89482b
            com.tencent.mm.autogen.mmdata.rpt.AiFinderContextStruct r2 = r1.f89471a
            r3 = r19
            r2.f79081f = r3
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_AI_FINDER_CONTEXT_STRING
            com.tencent.mm.autogen.mmdata.rpt.AiFinderContextStruct r1 = r1.f89471a
            java.lang.String r1 = r1.mo1005p()
            r2.mo119677K(r3, r1)
        L_0x00bc:
            com.tencent.mm.autogen.events.KvReportEvent$a r1 = r0.f78853d
            long r2 = r1.f78854a
            r4 = 16563(0x40b3, double:8.183E-320)
            java.lang.String r6 = "MicroMsg.AiFinderData"
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x01c1
            java.lang.String r1 = r1.f78855b
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 == 0) goto L_0x00d6
            goto L_0x01c5
        L_0x00d6:
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r9] = r1
            java.lang.String r5 = "handle wechat app %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r5, r4)
            java.lang.String[] r1 = r1.split(r12)
            if (r1 == 0) goto L_0x01c1
            int r4 = r1.length
            if (r4 > r15) goto L_0x00ea
            goto L_0x01c5
        L_0x00ea:
            r1 = r1[r9]
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 == 0) goto L_0x00f4
            goto L_0x01c5
        L_0x00f4:
            java.lang.String r4 = "."
            java.lang.String r1 = r1.replace(r4, r12)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 == 0) goto L_0x0102
            goto L_0x01c5
        L_0x0102:
            java.lang.String r4 = ";"
            java.lang.String[] r1 = r1.split(r4)
            if (r1 == 0) goto L_0x01c1
            int r4 = r1.length
            if (r4 > 0) goto L_0x010f
            goto L_0x01c5
        L_0x010f:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            int r5 = r1.length
            r7 = 0
        L_0x0116:
            if (r7 >= r5) goto L_0x018f
            r8 = r1[r7]
            lh0.l r12 = new lh0.l
            r12.<init>()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r14 == 0) goto L_0x012a
            r16 = r0
            r17 = r1
            goto L_0x0183
        L_0x012a:
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x0154 }
            r14.<init>(r8)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r8 = "tbe"
            r16 = r0
            r17 = r1
            long r0 = r14.optLong(r8, r10)     // Catch:{ Exception -> 0x0158 }
            r12.field_appTbe = r0     // Catch:{ Exception -> 0x0158 }
            java.lang.String r0 = "ten"
            long r0 = r14.optLong(r0, r10)     // Catch:{ Exception -> 0x0158 }
            r12.field_appTen = r0     // Catch:{ Exception -> 0x0158 }
            java.lang.String r0 = "in"
            long r0 = r14.optLong(r0, r10)     // Catch:{ Exception -> 0x0158 }
            r12.field_appIn = r0     // Catch:{ Exception -> 0x0158 }
            java.lang.String r0 = "inbg"
            long r0 = r14.optLong(r0, r10)     // Catch:{ Exception -> 0x0158 }
            r12.field_appInbg = r0     // Catch:{ Exception -> 0x0158 }
            goto L_0x0159
        L_0x0154:
            r16 = r0
            r17 = r1
        L_0x0158:
        L_0x0159:
            long r0 = r12.field_appTbe
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0183
            long r0 = r12.field_appTen
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x0166
            goto L_0x0183
        L_0x0166:
            java.text.SimpleDateFormat r0 = jh0.C33573a.m40125a()
            long r10 = r12.field_appTbe
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.String r0 = r0.format(r1)
            r1 = -1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            r12.field_appDs = r0
            long r0 = r12.field_appTbe
            int r0 = jh0.C33573a.m40128d(r0)
            r12.field_appHour = r0
        L_0x0183:
            r4.add(r12)
            int r7 = r7 + 1
            r0 = r16
            r1 = r17
            r10 = 0
            goto L_0x0116
        L_0x018f:
            r16 = r0
            lh0.g r0 = lh0.C34262g.vx0()
            r0.requireAccountInitialized()
            lh0.m r0 = r0.f92368f
            int r0 = r0.mo59532Ow(r4)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r9] = r0
            int r0 = r4.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r15] = r0
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 2
            r1[r2] = r0
            java.lang.String r0 = "handleWechatApp count[db: %d item: %d] cost: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r1)
            goto L_0x01c3
        L_0x01c1:
            r16 = r0
        L_0x01c3:
            r0 = r16
        L_0x01c5:
            com.tencent.mm.autogen.events.KvReportEvent$a r0 = r0.f78853d
            long r0 = r0.f78854a
            r2 = 9999(0x270f, double:4.94E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x01eb
            java.lang.String r0 = "cash debug here."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = "debug"
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r9] = r0
            java.lang.String r2 = "notify to run ai [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
            com.tencent.mm.autogen.events.RunAiEvent r1 = new com.tencent.mm.autogen.events.RunAiEvent
            r1.<init>()
            com.tencent.mm.autogen.events.RunAiEvent$a r2 = r1.f78961d
            r2.f78962a = r0
            r1.publish()
        L_0x01eb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p340fm.C32074a.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
