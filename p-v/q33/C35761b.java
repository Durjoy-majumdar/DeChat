package q33;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: q33.b */
public class C35761b extends IStaticListener<PostSyncTaskEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r13) {
        /*
            r12 = this;
            com.tencent.mm.autogen.events.PostSyncTaskEvent r13 = (com.tencent.p014mm.autogen.events.PostSyncTaskEvent) r13
            boolean r13 = com.tencent.p014mm.plugin.voip.model.C30534j.m39119a()
            r0 = 0
            if (r13 == 0) goto L_0x0105
            boolean r13 = f40.C86709a0.m107522a()
            if (r13 == 0) goto L_0x001a
            f40.C86709a0.m107523b()
            boolean r13 = f40.C86718e.m107551r()
            if (r13 != 0) goto L_0x001a
            r13 = 1
            goto L_0x001b
        L_0x001a:
            r13 = 0
        L_0x001b:
            java.lang.String r1 = "PostTaskTenMinutesLogicState"
            if (r13 == 0) goto L_0x00ea
            boolean r13 = com.tencent.p014mm.plugin.voip.model.C30534j.m39119a()
            if (r13 == 0) goto L_0x00ea
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            r2 = 77829(0x13005, float:1.09062E-40)
            r3 = 0
            java.lang.Object r13 = r13.mo119684e(r2, r3)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x00ea
            java.util.Map r13 = com.tencent.p014mm.plugin.voip.model.C30534j.C30535a.m39121b(r13)
            if (r13 == 0) goto L_0x00ea
            int r4 = r13.size()
            if (r4 <= 0) goto L_0x00ea
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x0052:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x00c3
            java.lang.Object r5 = r13.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            com.tencent.mm.plugin.voip.model.j$a r6 = (com.tencent.p014mm.plugin.voip.model.C30534j.C30535a) r6
            if (r6 == 0) goto L_0x0052
            int r7 = r6.f82261a
            int r6 = r6.f82262b
            if (r7 > 0) goto L_0x006e
            if (r6 <= 0) goto L_0x0098
        L_0x006e:
            tc0.j$a r8 = new tc0.j$a
            r9 = 10166(0x27b6, float:1.4246E-41)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.Object r11 = r5.getKey()
            java.lang.String r11 = (java.lang.String) r11
            r10.append(r11)
            java.lang.String r11 = ","
            r10.append(r11)
            r10.append(r7)
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            r8.<init>(r9, r10)
            r4.add(r8)
        L_0x0098:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "report PostTaskTenMinutesLogicState  name "
            r8.append(r9)
            java.lang.Object r5 = r5.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r8.append(r5)
            java.lang.String r5 = " "
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = "  "
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
            goto L_0x0052
        L_0x00c3:
            boolean r13 = r4.isEmpty()
            if (r13 != 0) goto L_0x00ea
            java.lang.Class<f62.k0> r13 = f62.C75700k0.class
            k40.a r13 = f40.C86709a0.m107533q(r13)
            f62.k0 r13 = (f62.C75700k0) r13
            g62.m r13 = r13.mo96100XW()
            tc0.j r5 = new tc0.j
            r5.<init>(r4)
            tc0.p r13 = (tc0.C77885p) r13
            r13.mo107993q(r5)
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            r13.mo119676J(r2, r3)
        L_0x00ea:
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            r2 = 77828(0x13004, float:1.0906E-40)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r13.mo119676J(r2, r3)
            java.lang.String r13 = "report PostTaskTenMinutesLogicState done "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r13)
        L_0x0105:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q33.C35761b.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
