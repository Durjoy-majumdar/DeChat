package com.tencent.p014mm.plugin.finder.live.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLiveStateActionEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/live/model/FinderLiveService$checkDeviceLsn$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveStateActionEvent;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$checkDeviceLsn$1 */
public final class FinderLiveService$checkDeviceLsn$1 extends IListener<FinderLiveStateActionEvent> {
    public FinderLiveService$checkDeviceLsn$1(C40008f fVar) {
        super(fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r4 = r4.f154074q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r12) {
        /*
            r11 = this;
            com.tencent.mm.autogen.events.FinderLiveStateActionEvent r12 = (com.tencent.p014mm.autogen.events.FinderLiveStateActionEvent) r12
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r12, r2)
            com.tencent.mm.autogen.events.FinderLiveStateActionEvent$a r2 = r12.f154780d
            r3 = 0
            if (r2 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2.f154781a = r3
        L_0x0013:
            if (r2 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r2.f154782b = r3
        L_0x0018:
            if (r2 != 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r2.f154784d = r3
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r2.f154783c = r3
        L_0x0022:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            androidx.lifecycle.i0 r4 = r2.mo77630e(r4)
            cl1.u r4 = (cl1.C55001u) r4
            r5 = 1
            if (r4 == 0) goto L_0x0111
            te3.c21 r6 = r4.f154420q
            long r6 = r6.f182392d
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0111
            androidx.lifecycle.i0 r4 = r4.business(r1)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.mo75997d4()
            if (r4 != 0) goto L_0x0111
            com.tencent.mm.autogen.events.FinderLiveStateActionEvent$a r4 = r12.f154780d
            if (r4 != 0) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            boolean r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            r4.f154782b = r6
        L_0x004e:
            if (r4 != 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r4.f154781a = r5
        L_0x0053:
            androidx.lifecycle.i0 r4 = r2.mo77630e(r0)
            cl1.d0 r4 = (cl1.C54963d0) r4
            if (r4 == 0) goto L_0x0064
            java.util.List<al1.j> r4 = r4.f154074q
            if (r4 == 0) goto L_0x0064
            int r4 = r4.size()
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            java.lang.Class<cl1.t0> r6 = cl1.C39981t0.class
            androidx.lifecycle.i0 r6 = r2.mo77630e(r6)
            cl1.t0 r6 = (cl1.C39981t0) r6
            if (r6 == 0) goto L_0x007e
            di1.c<java.lang.Boolean> r6 = r6.f107198j
            if (r6 == 0) goto L_0x007e
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            goto L_0x007f
        L_0x007e:
            r6 = 0
        L_0x007f:
            com.tencent.mm.autogen.events.FinderLiveStateActionEvent$a r7 = r12.f154780d
            if (r7 != 0) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            if (r4 <= 0) goto L_0x0088
            r8 = 1
            goto L_0x0089
        L_0x0088:
            r8 = 0
        L_0x0089:
            r7.f154785e = r8
        L_0x008b:
            if (r7 != 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r7.f154786f = r6
        L_0x0090:
            java.lang.String r7 = "Finder.FinderLiveService"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "audienceLinkMicUserList size = "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r4 = ", micIntercomEnable = "
            r8.append(r4)
            r8.append(r6)
            java.lang.String r4 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            androidx.lifecycle.i0 r0 = r2.mo77630e(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            r2 = 0
            if (r0 == 0) goto L_0x00ef
            java.util.List<al1.j> r0 = r0.f154074q
            if (r0 == 0) goto L_0x00ef
            monitor-enter(r0)
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x00ec }
        L_0x00c0:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x00ec }
            if (r6 == 0) goto L_0x00e8
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x00ec }
            r7 = r6
            al1.j r7 = (al1.C54130j) r7     // Catch:{ all -> 0x00ec }
            java.lang.String r7 = r7.f151997a     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d     // Catch:{ all -> 0x00ec }
            androidx.lifecycle.i0 r8 = r8.mo77630e(r1)     // Catch:{ all -> 0x00ec }
            cl1.o r8 = (cl1.C54991o) r8     // Catch:{ all -> 0x00ec }
            if (r8 == 0) goto L_0x00df
            java.lang.String r8 = r8.mo76015n4()     // Catch:{ all -> 0x00ec }
            if (r8 != 0) goto L_0x00e1
        L_0x00df:
            java.lang.String r8 = ""
        L_0x00e1:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ all -> 0x00ec }
            if (r7 == 0) goto L_0x00c0
            r2 = r6
        L_0x00e8:
            monitor-exit(r0)
            al1.j r2 = (al1.C54130j) r2
            goto L_0x00ef
        L_0x00ec:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x00ef:
            if (r2 == 0) goto L_0x0111
            int r0 = r2.f152001e
            r1 = 2
            if (r0 != r1) goto L_0x0103
            com.tencent.mm.autogen.events.FinderLiveStateActionEvent$a r12 = r12.f154780d
            if (r12 != 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r12.f154784d = r5
        L_0x00fd:
            if (r12 != 0) goto L_0x0100
            goto L_0x0111
        L_0x0100:
            r12.f154783c = r5
            goto L_0x0111
        L_0x0103:
            if (r0 != r5) goto L_0x0111
            com.tencent.mm.autogen.events.FinderLiveStateActionEvent$a r12 = r12.f154780d
            if (r12 != 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r12.f154784d = r3
        L_0x010c:
            if (r12 != 0) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            r12.f154783c = r5
        L_0x0111:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService$checkDeviceLsn$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
