package p340fm;

import com.tencent.p014mm.autogen.events.SessionChangeEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: fm.c */
public class C32080c extends IStaticListener<SessionChangeEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r12) {
        /*
            r11 = this;
            com.tencent.mm.autogen.events.SessionChangeEvent r12 = (com.tencent.p014mm.autogen.events.SessionChangeEvent) r12
            hh0.e r0 = hh0.C32913e.f89480h
            if (r0 != 0) goto L_0x000d
            hh0.e r0 = new hh0.e
            r0.<init>()
            hh0.C32913e.f89480h = r0
        L_0x000d:
            hh0.e r0 = hh0.C32913e.f89480h
            r0.getClass()
            r8 = 0
            if (r12 == 0) goto L_0x01c4
            com.tencent.mm.autogen.events.SessionChangeEvent$a r1 = r12.f78973d
            if (r1 != 0) goto L_0x001b
            goto L_0x01c4
        L_0x001b:
            boolean r1 = r0.mo58856a()
            if (r1 != 0) goto L_0x0023
            goto L_0x01c4
        L_0x0023:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mm.autogen.events.SessionChangeEvent$a r2 = r12.f78973d
            java.lang.String r3 = r2.f78974a
            r1[r8] = r3
            int r2 = r2.f78976c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            com.tencent.mm.autogen.events.SessionChangeEvent$a r2 = r12.f78973d
            long r4 = r2.f78975b
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 2
            r1[r4] = r2
            java.lang.String r2 = "MicroMsg.AiFinderData"
            java.lang.String r5 = "wechat session event sid[%s] type[%d] opTimeMs[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            com.tencent.mm.autogen.events.SessionChangeEvent$a r1 = r12.f78973d
            int r2 = r1.f78976c
            if (r2 != 0) goto L_0x01c4
            long r5 = r0.f89485e
            r9 = 0
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0058
            long r9 = r1.f78975b
            long r9 = r9 - r5
        L_0x0058:
            r0.f89484d = r9
            java.lang.String r1 = r1.f78974a
            r1.getClass()
            java.lang.String r2 = "2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0069
            goto L_0x01ba
        L_0x0069:
            hh0.a r1 = r0.f89481a
            java.lang.String r2 = r0.f89483c
            r1.f89461a = r2
            long r5 = r0.f89484d
            r1.f89462b = r5
            r1.f89469i = r8
            r1.f89468h = r8
            jr2.l r2 = jr2.C99019x.m128969a()
            if (r2 == 0) goto L_0x0089
            jr2.l r2 = jr2.C99019x.m128969a()
            os2.x r2 = (os2.C100421x) r2
            int r2 = r2.mo139896kD()
            r1.f89469i = r2
        L_0x0089:
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r5 = 68377(0x10b19, float:9.5817E-41)
            r6 = 0
            java.lang.Object r2 = r2.mo119684e(r5, r6)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x00a3
            r1.f89468h = r3
        L_0x00a3:
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            di3.d r5 = di3.C86312j.m106911c(r2)
            ht1.t1 r5 = (ht1.C60200t1) r5
            ht1.b4 r5 = r5.Nt0()
            java.lang.String r7 = "FinderEntrance"
            te3.nn1 r5 = r5.mo77246R5(r7)
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            ht1.b4 r2 = r2.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = r2.mo77227G5(r7)
            if (r2 == 0) goto L_0x00cf
            java.lang.String r7 = r2.field_tipsId
            r1.f89465e = r7
            te3.xi1 r2 = r2.field_ctrInfo
            int r2 = r2.f144670e
            r1.f89466f = r2
        L_0x00cf:
            if (r5 == 0) goto L_0x00d5
            int r2 = r5.f184502d
            r1.f89467g = r2
        L_0x00d5:
            java.lang.String r2 = r1.f89465e
            java.lang.String r5 = ""
            if (r2 != 0) goto L_0x00dd
            r1.f89465e = r5
        L_0x00dd:
            java.lang.Class<hz.h> r2 = p167hz.C8835h.class
            r1.f89470j = r8
            di3.d r7 = di3.C86312j.m106911c(r2)
            hz.h r7 = (p167hz.C8835h) r7
            hz.k r7 = r7.mo9681t4()
            o03.h r7 = (o03.C21723h) r7
            boolean r7 = r7.mo33992c()
            if (r7 == 0) goto L_0x00f5
            r1.f89470j = r3
        L_0x00f5:
            di3.d r7 = di3.C86312j.m106911c(r2)
            hz.h r7 = (p167hz.C8835h) r7
            hz.k r7 = r7.mo9681t4()
            o03.h r7 = (o03.C21723h) r7
            int r7 = r7.mo34005p()
            if (r7 <= 0) goto L_0x0124
            di3.d r7 = di3.C86312j.m106911c(r2)
            hz.h r7 = (p167hz.C8835h) r7
            hz.k r7 = r7.mo9681t4()
            o03.h r7 = (o03.C21723h) r7
            java.util.LinkedList<te3.rh4> r7 = r7.f61500d
            java.lang.Object r7 = r7.getLast()
            te3.rh4 r7 = (te3.rh4) r7
            if (r7 != 0) goto L_0x011f
            r7 = 0
            goto L_0x0120
        L_0x011f:
            r7 = 1
        L_0x0120:
            if (r7 == 0) goto L_0x0124
            r7 = 1
            goto L_0x0125
        L_0x0124:
            r7 = 0
        L_0x0125:
            if (r7 == 0) goto L_0x0129
            r1.f89470j = r3
        L_0x0129:
            di3.d r9 = di3.C86312j.m106911c(r2)
            hz.h r9 = (p167hz.C8835h) r9
            hz.k r9 = r9.mo9681t4()
            o03.h r9 = (o03.C21723h) r9
            boolean r9 = r9.mo33990a()
            di3.d r10 = di3.C86312j.m106911c(r2)
            hz.h r10 = (p167hz.C8835h) r10
            hz.k r10 = r10.mo9681t4()
            o03.h r10 = (o03.C21723h) r10
            boolean r10 = r10.mo33991b()
            if (r10 == 0) goto L_0x014f
            if (r9 == 0) goto L_0x014f
            r9 = 1
            goto L_0x0150
        L_0x014f:
            r9 = 0
        L_0x0150:
            if (r7 != 0) goto L_0x0162
            if (r9 == 0) goto L_0x0162
            di3.d r2 = di3.C86312j.m106911c(r2)
            hz.h r2 = (p167hz.C8835h) r2
            hz.k r2 = r2.mo9681t4()
            o03.h r2 = (o03.C21723h) r2
            te3.rh4 r6 = r2.f61498b
        L_0x0162:
            if (r6 == 0) goto L_0x016f
            if (r9 == 0) goto L_0x016f
            int r2 = r6.f64538i
            if (r2 < r3) goto L_0x016f
            r6 = 4
            if (r2 > r6) goto L_0x016f
            r1.f89470j = r3
        L_0x016f:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            int r5 = r1.hashCode()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2[r8] = r4
            r2[r3] = r1
            java.lang.String r1 = "MicroMsg.AiFinderAtOnceStruct"
            java.lang.String r3 = "%s enter friends %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            hh0.b r1 = r0.f89482b
            com.tencent.mm.autogen.mmdata.rpt.AiFinderContextStruct r1 = r1.f89471a
            ih0.j r2 = ih0.C117197j.wx0()
            boolean r2 = r2.f351082e
            r1.f79079d = r2
            java.lang.String r1 = r0.f89483c
            java.lang.String r2 = "143"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x01ba
            r3 = 0
            r4 = 0
            r6 = 0
            zt3.t r9 = zt3.C119157j.f356862d
            hh0.d r10 = new hh0.d
            r1 = r10
            r2 = r0
            r1.<init>(r2, r3, r4, r6)
            zt3.j r9 = (zt3.C119157j) r9
            java.lang.String r1 = "Ai_thread"
            r9.mo183876g(r10, r1)
        L_0x01ba:
            com.tencent.mm.autogen.events.SessionChangeEvent$a r12 = r12.f78973d
            java.lang.String r1 = r12.f78974a
            r0.f89483c = r1
            long r1 = r12.f78975b
            r0.f89485e = r1
        L_0x01c4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p340fm.C32080c.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
