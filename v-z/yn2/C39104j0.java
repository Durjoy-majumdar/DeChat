package yn2;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: yn2.j0 */
public class C39104j0 extends IStaticListener<PostSyncTaskEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r17) {
        /*
            r16 = this;
            java.lang.String r0 = "callback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.PostSnsAsyncTaskListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = r17
            com.tencent.mm.autogen.events.PostSyncTaskEvent r2 = (com.tencent.p014mm.autogen.events.PostSyncTaskEvent) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r3 = f40.C86709a0.m107522a()
            java.lang.String r4 = "MicroMsg.PostSnsAsyncTaskListener"
            r6 = 0
            if (r3 != 0) goto L_0x0022
            java.lang.String r2 = "PostSyncTaskEvent arrived before account was ready, ignore it."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
        L_0x001f:
            r5 = 0
            goto L_0x024d
        L_0x0022:
            boolean r2 = r2 instanceof com.tencent.p014mm.autogen.events.PostSyncTaskEvent
            if (r2 != 0) goto L_0x0030
            java.lang.String r2 = "mismatched event"
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r4, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x001f
        L_0x0030:
            boolean r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.qy0()
            if (r2 == 0) goto L_0x003a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x001f
        L_0x003a:
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.PostSnsAsyncTask"
            java.lang.String r3 = "run"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            java.lang.String r4 = "expired"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            java.lang.String r7 = "MicroMsg.PostSnsAsyncTask"
            java.lang.String r8 = "check PostTaskSnsPost "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
            com.tencent.mm.plugin.sns.model.p2 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
            if (r8 == 0) goto L_0x005e
            com.tencent.mm.plugin.sns.model.p2 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.gy0()
            r8.mo131192c()
        L_0x005e:
            java.lang.String r8 = "check AsyncQueue"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
            com.tencent.mm.plugin.sns.model.p1$a r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.dy0()
            if (r7 == 0) goto L_0x0070
            com.tencent.mm.plugin.sns.model.b1 r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            r7.mo130950e()
        L_0x0070:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.PostSnsIntoSelfPage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r2)
            f40.C86709a0.m107528h()
            f40.e r7 = f40.C86709a0.m107523b()
            boolean r7 = r7.mo121114l()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            if (r7 == 0) goto L_0x0097
            f40.C86709a0.m107528h()
            f40.C86709a0.m107523b()
            boolean r7 = f40.C86718e.m107551r()
            if (r7 != 0) goto L_0x0097
            r7 = 1
            goto L_0x0098
        L_0x0097:
            r7 = 0
        L_0x0098:
            if (r7 == 0) goto L_0x0246
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r2)
            f40.C86709a0.m107528h()
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            r9 = 0
            r10 = 68390(0x10b26, float:9.5835E-41)
            java.lang.Object r7 = r7.mo119684e(r10, r9)
            java.lang.Long r7 = (java.lang.Long) r7
            r11 = 0
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r7, (long) r11)
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r11)
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            r13 = 3600000(0x36ee80, double:1.7786363E-317)
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c9
            r7 = 1
            goto L_0x00ca
        L_0x00c9:
            r7 = 0
        L_0x00ca:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r2)
            if (r7 == 0) goto L_0x0246
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r7 = "statisticsIntoSelfPage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)
            f40.C86709a0.m107528h()
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            r12 = 68388(0x10b24, float:9.5832E-41)
            java.lang.Object r11 = r11.mo119684e(r12, r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r11, (int) r6)
            f40.C86709a0.m107528h()
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            r14 = 68389(0x10b25, float:9.5833E-41)
            java.lang.Object r13 = r13.mo119684e(r14, r9)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r13, (int) r6)
            java.lang.String r15 = ","
            if (r11 > 0) goto L_0x0110
            if (r13 <= 0) goto L_0x0148
        L_0x0110:
            tc0.j$a r5 = new tc0.j$a
            r10 = 10077(0x275d, float:1.4121E-41)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r11)
            r6.append(r15)
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            r5.<init>(r10, r6)
            r4.add(r5)
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            r5.mo119676J(r12, r8)
            f40.C86709a0.m107528h()
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            r5.mo119676J(r14, r8)
        L_0x0148:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
            java.lang.String r5 = "statisticsCdnLoadBigBm"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)
            f40.C86709a0.m107528h()
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            r7 = 68391(0x10b27, float:9.5836E-41)
            java.lang.Object r6 = r6.mo119684e(r7, r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r10 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r6, (int) r10)
            if (r6 <= 0) goto L_0x0195
            tc0.j$a r10 = new tc0.j$a
            r11 = 28
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = ""
            r12.append(r13)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            r10.<init>(r11, r6)
            r4.add(r10)
            f40.C86709a0.m107528h()
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            r6.mo119676J(r7, r8)
        L_0x0195:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            java.lang.String r5 = "statisticsTakeOrSelectPicture"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r2)
            f40.C86709a0.m107528h()
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            r7 = 68392(0x10b28, float:9.5838E-41)
            java.lang.Object r6 = r6.mo119684e(r7, r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r10 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r6, (int) r10)
            f40.C86709a0.m107528h()
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            r12 = 68393(0x10b29, float:9.5839E-41)
            java.lang.Object r9 = r11.mo119684e(r12, r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r9, (int) r10)
            if (r6 > 0) goto L_0x01d3
            if (r9 <= 0) goto L_0x020b
        L_0x01d3:
            tc0.j$a r10 = new tc0.j$a
            r11 = 10072(0x2758, float:1.4114E-41)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r15)
            r13.append(r9)
            java.lang.String r6 = r13.toString()
            r10.<init>(r11, r6)
            r4.add(r10)
            f40.C86709a0.m107528h()
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            r6.mo119676J(r7, r8)
            f40.C86709a0.m107528h()
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            r6.mo119676J(r12, r8)
        L_0x020b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r2)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0246
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.m r5 = r5.mo96100XW()
            tc0.j r6 = new tc0.j
            r6.<init>(r4)
            tc0.p r5 = (tc0.C77885p) r5
            r5.mo107993q(r6)
            f40.C86709a0.m107528h()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 68390(0x10b26, float:9.5835E-41)
            r4.mo119676J(r6, r5)
        L_0x0246:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r5 = 1
        L_0x024d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.C39104j0.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
