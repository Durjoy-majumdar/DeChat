package yn2;

import com.tencent.p014mm.autogen.events.ExtGetSnsDataEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: yn2.f */
public class C102877f extends IStaticListener<ExtGetSnsDataEvent> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5, types: [int] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r17) {
        /*
            r16 = this;
            java.lang.String r0 = "callback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = r17
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent r2 = (com.tencent.p014mm.autogen.events.ExtGetSnsDataEvent) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r3 = f40.C86709a0.m107522a()
            java.lang.String r4 = "MicroMsg.ExtGetSnsDataEventListener"
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L_0x0022
            java.lang.String r2 = "ExtGetSnsDataEvent arrived before account was ready, ignore it."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x01bb
        L_0x0022:
            boolean r3 = r2 instanceof com.tencent.p014mm.autogen.events.ExtGetSnsDataEvent
            if (r3 != 0) goto L_0x0031
            java.lang.String r2 = "mismatched event"
            com.tencent.p014mm.sdk.platformtools.Log.m105922f(r4, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x01bb
        L_0x0031:
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$a r3 = r2.f264756d
            android.database.Cursor r3 = r3.f264758a
            if (r3 != 0) goto L_0x003c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x01bb
        L_0x003c:
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r3.<init>()
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$a r7 = r2.f264756d
            android.database.Cursor r7 = r7.f264758a
            r3.convertFrom((android.database.Cursor) r7)
            int r7 = r3.localid
            if (r7 > 0) goto L_0x0057
            java.lang.String r2 = "sns == null || sns.getLocalid()<=0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x01bb
        L_0x0057:
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r3.getTimeLine()
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r7 = r2.f264757e
            r7.f264763e = r5
            r7.f264767i = r5
            r7.f264768j = r5
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            r7.f264765g = r8
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r7 = r2.f264757e
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            r7.f264766h = r8
            te3.j00 r7 = r4.ContentObj
            if (r7 == 0) goto L_0x0194
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r8 = r2.f264757e
            int r9 = r7.f298424e
            r8.f264763e = r9
            if (r9 == r6) goto L_0x0092
            r10 = 7
            if (r9 == r10) goto L_0x0092
            r10 = 8
            if (r9 != r10) goto L_0x0087
            goto L_0x0092
        L_0x0087:
            java.util.List r5 = r8.f264765g
            java.lang.String r7 = r7.f298426g
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            r5.add(r7)
            goto L_0x0194
        L_0x0092:
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            if (r7 == 0) goto L_0x0194
        L_0x0096:
            te3.j00 r7 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x0194
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r7 = r2.f264757e
            java.util.List r7 = r7.f264765g
            com.tencent.mm.plugin.sns.model.o r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            te3.j00 r9 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r9 = r9.f298427h
            java.lang.Object r9 = r9.get(r5)
            te3.kv2 r9 = (te3.C101804kv2) r9
            r8.getClass()
            java.lang.String r8 = "getSnsThumbImgUri"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r10)
            java.lang.String r11 = ""
            r12 = 0
            if (r9 == 0) goto L_0x00f9
            java.lang.String r13 = r9.f298689d
            if (r13 == 0) goto L_0x00f9
            boolean r13 = r13.equals(r11)
            if (r13 == 0) goto L_0x00cc
            goto L_0x00f9
        L_0x00cc:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r15 = r9.f298689d
            java.lang.String r14 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r14, r15)
            r13.append(r14)
            java.lang.String r14 = vr2.C102236a0.m134729X(r9)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            boolean r14 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r14 != 0) goto L_0x00f5
            java.lang.String r13 = r9.f298694i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
            goto L_0x00fd
        L_0x00f5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
            goto L_0x00fd
        L_0x00f9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
            r13 = r12
        L_0x00fd:
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            r7.add(r13)
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r7 = r2.f264757e
            java.util.List r7 = r7.f264766h
            com.tencent.mm.plugin.sns.model.o r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            te3.j00 r9 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r9 = r9.f298427h
            java.lang.Object r9 = r9.get(r5)
            te3.kv2 r9 = (te3.C101804kv2) r9
            r8.getClass()
            java.lang.String r8 = "getSnsBigImgUri"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r10)
            if (r9 == 0) goto L_0x0156
            java.lang.String r13 = r9.f298689d
            if (r13 == 0) goto L_0x0156
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x0129
            goto L_0x0156
        L_0x0129:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r13 = r9.f298689d
            java.lang.String r12 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r12, r13)
            r11.append(r12)
            java.lang.String r12 = vr2.C102236a0.m134722Q(r9)
            r11.append(r12)
            java.lang.String r12 = r11.toString()
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r11 != 0) goto L_0x0152
            java.lang.String r12 = r9.f298692g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
            goto L_0x0159
        L_0x0152:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
            goto L_0x0159
        L_0x0156:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
        L_0x0159:
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            r7.add(r12)
            if (r5 != 0) goto L_0x0190
            te3.j00 r7 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            java.lang.Object r7 = r7.get(r5)
            if (r7 == 0) goto L_0x0190
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r7 = r2.f264757e
            te3.j00 r8 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r8 = r8.f298427h
            java.lang.Object r8 = r8.get(r5)
            te3.kv2 r8 = (te3.C101804kv2) r8
            te3.mv2 r8 = r8.f298698p
            float r8 = r8.f298875d
            int r8 = (int) r8
            r7.f264767i = r8
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r7 = r2.f264757e
            te3.j00 r8 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r8 = r8.f298427h
            java.lang.Object r8 = r8.get(r5)
            te3.kv2 r8 = (te3.C101804kv2) r8
            te3.mv2 r8 = r8.f298698p
            float r8 = r8.f298876e
            int r8 = (int) r8
            r7.f264768j = r8
        L_0x0190:
            int r5 = r5 + 1
            goto L_0x0096
        L_0x0194:
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r5 = r2.f264757e
            java.util.List r7 = r5.f264765g
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            int r7 = r7.size()
            r5.f264764f = r7
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r5 = r2.f264757e
            int r7 = r3.localid
            r5.f264760b = r7
            java.lang.String r3 = r3.getUserName()
            r5.f264759a = r3
            com.tencent.mm.autogen.events.ExtGetSnsDataEvent$b r2 = r2.f264757e
            java.lang.String r3 = r4.ContentDesc
            r2.f264761c = r3
            int r3 = r4.CreateTime
            long r3 = (long) r3
            r2.f264762d = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r5 = 1
        L_0x01bb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.C102877f.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
