package yn2;

import com.tencent.p014mm.autogen.events.UpdateSnsTagListEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: yn2.e1 */
public class C53550e1 extends IStaticListener<UpdateSnsTagListEvent> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [int] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "callback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.UpdateSnsTagListListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.autogen.events.UpdateSnsTagListEvent r14 = (com.tencent.p014mm.autogen.events.UpdateSnsTagListEvent) r14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = f40.C86709a0.m107522a()
            java.lang.String r3 = "MicroMsg.UpdateSnsTagListListener"
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0020
            java.lang.String r14 = "UpdateSnsTagListEvent arrived before account was ready, ignore it."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x00c7
        L_0x0020:
            boolean r2 = r14 instanceof com.tencent.p014mm.autogen.events.UpdateSnsTagListEvent
            if (r2 != 0) goto L_0x002f
            java.lang.String r14 = "mismatched event"
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r3, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x00c7
        L_0x002f:
            com.tencent.mm.autogen.events.UpdateSnsTagListEvent$a r2 = r14.f107791d
            ob0.y r2 = r2.f107793a
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.sns.model.C43039l0
            if (r3 == 0) goto L_0x00c3
            com.tencent.mm.plugin.sns.model.l0 r2 = (com.tencent.p014mm.plugin.sns.model.C43039l0) r2
            r2.getClass()
            java.lang.String r3 = "getState"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.NetSceneSnsTagList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
            int r7 = r2.f116505i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
            java.lang.String r3 = "getTagList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
            java.util.LinkedList<te3.m84> r8 = r2.f116504h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
            com.tencent.mm.autogen.events.UpdateSnsTagListEvent$b r3 = r14.f107792e
            r3.f107794a = r7
            r3 = 2
            r9 = 7
            if (r7 != r3) goto L_0x0092
            if (r8 == 0) goto L_0x006a
            int r3 = r8.size()
            if (r3 <= 0) goto L_0x006a
            os2.m0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.ey0()
            r3.mo11655jo(r9)
        L_0x006a:
            if (r8 == 0) goto L_0x0092
            java.util.Iterator r3 = r8.iterator()
        L_0x0070:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0092
            java.lang.Object r6 = r3.next()
            te3.m84 r6 = (te3.m84) r6
            long r11 = r6.f137907d
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0070
            os2.l0 r8 = new os2.l0
            r8.<init>()
            r2.mo67232k1(r8, r6)
            os2.m0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.ey0()
            r6.mo11652SE(r8)
            goto L_0x0070
        L_0x0092:
            if (r7 == r5) goto L_0x00c3
            os2.m0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.ey0()
            os2.l0 r2 = r2.mo11657qq(r9)
            com.tencent.mm.autogen.events.UpdateSnsTagListEvent$b r14 = r14.f107792e
            java.lang.String r3 = "tagInfoToList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.lang.String r2 = r2.field_memberList
            if (r2 == 0) goto L_0x00be
            java.lang.String r7 = ","
            java.lang.String[] r2 = r2.split(r7)
            int r7 = r2.length
        L_0x00b4:
            if (r4 >= r7) goto L_0x00be
            r8 = r2[r4]
            r6.add(r8)
            int r4 = r4 + 1
            goto L_0x00b4
        L_0x00be:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            r14.f107795b = r6
        L_0x00c3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r4 = 1
        L_0x00c7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.C53550e1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
