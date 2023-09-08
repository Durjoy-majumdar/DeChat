package p641oy;

import com.tencent.p014mm.autogen.events.ExtStepCountEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: oy.b */
public class C117903b extends IStaticListener<ExtStepCountEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r32) {
        /*
            r31 = this;
            r0 = r32
            com.tencent.mm.autogen.events.ExtStepCountEvent r0 = (com.tencent.p014mm.autogen.events.ExtStepCountEvent) r0
            java.lang.Class<sv2.f> r1 = sv2.C118311f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            sv2.f r1 = (sv2.C118311f) r1
            com.tencent.mm.plugin.sport.model.b r1 = r1.wx0()
            r1.getClass()
            com.tencent.mm.autogen.events.ExtStepCountEvent$a r2 = r0.f107516d
            int r3 = r2.f107518a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == r5) goto L_0x0074
            if (r3 == r4) goto L_0x001f
            goto L_0x0071
        L_0x001f:
            r1 = 3905(0xf41, float:5.472E-42)
            org.json.JSONObject r2 = com.tencent.p014mm.plugin.sport.model.C115769k.m162824c()     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = "extStepApiConfig"
            org.json.JSONObject r3 = r2.optJSONObject(r3)     // Catch:{ Exception -> 0x005d }
            if (r3 != 0) goto L_0x0033
            java.lang.String r3 = "stepExtConfig"
            org.json.JSONObject r3 = r2.optJSONObject(r3)     // Catch:{ Exception -> 0x005d }
        L_0x0033:
            if (r3 == 0) goto L_0x003d
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r2 = r0.f107517e     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x005d }
            r2.f107522a = r3     // Catch:{ Exception -> 0x005d }
        L_0x003d:
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r2 = r0.f107517e     // Catch:{ Exception -> 0x005d }
            java.lang.String r2 = r2.f107522a     // Catch:{ Exception -> 0x005d }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x005d }
            if (r2 == 0) goto L_0x0058
            kj2.d r7 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x005d }
            r8 = 625(0x271, double:3.09E-321)
            r10 = 5
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)     // Catch:{ Exception -> 0x005d }
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r2 = r0.f107517e     // Catch:{ Exception -> 0x005d }
            r2.f107524c = r1     // Catch:{ Exception -> 0x005d }
            goto L_0x006d
        L_0x0058:
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r2 = r0.f107517e     // Catch:{ Exception -> 0x005d }
            r2.f107524c = r6     // Catch:{ Exception -> 0x005d }
            goto L_0x006d
        L_0x005d:
            kj2.d r7 = kj2.C117407d.INSTANCE
            r8 = 625(0x271, double:3.09E-321)
            r10 = 6
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r2 = r0.f107517e
            r2.f107524c = r1
        L_0x006d:
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r0 = r0.f107517e
            r0.f107523b = r6
        L_0x0071:
            r1 = 1
            goto L_0x020b
        L_0x0074:
            long r2 = r2.f107520c
            long r7 = eb0.C31543z5.m39453c()
            com.tencent.mm.autogen.events.ExtStepCountEvent$a r9 = r0.f107516d
            long r9 = r9.f107521d
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            r13 = 0
            r11[r13] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r7)
            r11[r6] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r9)
            r11[r5] = r12
            java.lang.String r12 = "MicroMsg.Sport.ExtApiStepManager"
            java.lang.String r14 = "ExtStepCountEvent PASSIVE_UPDATE stepCount:%s timestamp:%s version:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r14, r11)
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r11 = r0.f107517e
            boolean r14 = com.tencent.p014mm.plugin.sport.model.C115778q.m162836e()
            r4 = 0
            if (r14 != 0) goto L_0x00a7
            r9 = 3906(0xf42, float:5.473E-42)
            goto L_0x00af
        L_0x00a7:
            boolean r14 = com.tencent.p014mm.plugin.sport.model.C115778q.m162833b()
            if (r14 != 0) goto L_0x00b6
            r9 = 3902(0xf3e, float:5.468E-42)
        L_0x00af:
            r30 = r0
            r25 = r1
            r13 = r7
            goto L_0x0192
        L_0x00b6:
            com.tencent.mm.plugin.sport.model.n r14 = com.tencent.p014mm.plugin.sport.model.C115775n.f347342a
            java.lang.String r15 = "KEY_EXT_API_LAST_STEP_TIME_LONG"
            r18 = r7
            long r6 = r14.mo176128a(r15, r4)
            java.lang.String r8 = "KEY_EXT_API_TODAY_STEP_LONG"
            long r20 = r14.mo176128a(r8, r4)
            long r22 = r18 - r6
            r24 = 300000(0x493e0, double:1.482197E-318)
            r4 = 4
            int r5 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r5 >= 0) goto L_0x00fc
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            r4[r13] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r20)
            r6 = 1
            r4[r6] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r18)
            r6 = 2
            r4[r6] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "update interval must larger than 5 minute, lastUpdateTime:%d lastUpdateStep:%d newUpdateTime:%d newUpdateStep:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r5, r4)
            r9 = 3903(0xf3f, float:5.469E-42)
            r30 = r0
            r25 = r1
            r13 = r18
            goto L_0x0192
        L_0x00fc:
            org.json.JSONObject r5 = com.tencent.p014mm.plugin.sport.model.C115769k.m162824c()
            r22 = r14
            r13 = r18
            boolean r18 = com.tencent.p014mm.sdk.platformtools.Util.isSameDay(r13, r6)
            if (r18 != 0) goto L_0x0110
            long r6 = com.tencent.p014mm.plugin.sport.model.C115778q.m162838g()
            r20 = 0
        L_0x0110:
            long r18 = r13 - r6
            long r28 = r18 / r24
            long r24 = r18 % r24
            r26 = 0
            int r30 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r30 <= 0) goto L_0x0122
            r30 = r0
            r25 = r1
            r4 = 1
            goto L_0x0127
        L_0x0122:
            r30 = r0
            r25 = r1
            r4 = 0
        L_0x0127:
            long r0 = (long) r4
            long r28 = r28 + r0
            java.lang.String r0 = "stepCounterMaxStep5m"
            int r0 = r5.optInt(r0)
            long r0 = (long) r0
            long r0 = r0 * r28
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r5 = java.lang.Long.valueOf(r28)
            r23 = 0
            r4[r23] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r18)
            r17 = 1
            r4[r17] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            r16 = 2
            r4[r16] = r5
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 3
            r4[r7] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r7 = 4
            r4[r7] = r6
            java.lang.String r6 = "interval5m %d intervalTime %d newUpdateTime:%d compareUpdateTime:%d maxIncreaseStep:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r12, r6, r4)
            long r6 = r2 - r20
            r18 = 0
            int r4 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r4 < 0) goto L_0x0194
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x016e
            goto L_0x0194
        L_0x016e:
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = com.tencent.p014mm.plugin.sport.model.C115778q.m162837f(r13)
            r4 = 0
            r0[r4] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r4 = 1
            r0[r4] = r1
            java.lang.String r1 = "can update time: %s, step: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r0)
            r0 = r22
            r0.mo176131d(r15, r13)
            r0.mo176131d(r8, r2)
            java.lang.String r1 = "KEY_EXT_API_VERSION_LONG"
            r0.mo176131d(r1, r9)
            r9 = 1
        L_0x0192:
            r1 = 1
            goto L_0x01ac
        L_0x0194:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            r6 = 0
            r4[r6] = r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 1
            r4[r1] = r0
            java.lang.String r0 = "invalid step in 5 minute actual: %d max: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r0, r4)
            r9 = 3904(0xf40, float:5.47E-42)
        L_0x01ac:
            r11.f107524c = r9
            r0 = r30
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r4 = r0.f107517e
            int r4 = r4.f107524c
            if (r4 != r1) goto L_0x01fa
            r1 = r25
            long r4 = r1.f347319c
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            com.tencent.mm.plugin.sport.model.n r4 = com.tencent.p014mm.plugin.sport.model.C115775n.f347342a
            java.lang.String r5 = "KEY_LAST_UPLOAD_EXT_API_STEP_TIME_LONG"
            long r4 = r4.mo176128a(r5, r6)
            r1.f347319c = r4
        L_0x01ca:
            long r4 = r1.f347319c
            boolean r4 = com.tencent.p014mm.plugin.sport.model.C115778q.m162835d(r4, r13)
            long r5 = r1.mo176118a()
            boolean r5 = com.tencent.p014mm.plugin.sport.model.C115778q.m162834c(r5, r2)
            if (r4 == 0) goto L_0x01ec
            if (r5 == 0) goto L_0x01ec
            r1.mo176120c(r2)
            kj2.d r6 = kj2.C117407d.INSTANCE
            r7 = 625(0x271, double:3.09E-321)
            r9 = 1
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)
            goto L_0x0206
        L_0x01ec:
            kj2.d r18 = kj2.C117407d.INSTANCE
            r19 = 625(0x271, double:3.09E-321)
            r21 = 2
            r23 = 1
            r25 = 0
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x0206
        L_0x01fa:
            kj2.d r1 = kj2.C117407d.INSTANCE
            r2 = 625(0x271, double:3.09E-321)
            r4 = 4
            r6 = 1
            r8 = 0
            r1.idkeyStat(r2, r4, r6, r8)
        L_0x0206:
            com.tencent.mm.autogen.events.ExtStepCountEvent$b r0 = r0.f107517e
            r1 = 1
            r0.f107523b = r1
        L_0x020b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p641oy.C117903b.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
