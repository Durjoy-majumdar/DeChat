package eg1;

import com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback;

/* renamed from: eg1.e0 */
public final class C58569e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveViewCallback f167651d;

    /* renamed from: e */
    public final /* synthetic */ long f167652e;

    /* renamed from: f */
    public final /* synthetic */ String f167653f;

    public C58569e0(FinderLiveViewCallback finderLiveViewCallback, long j, String str) {
        this.f167651d = finderLiveViewCallback;
        this.f167652e = j;
        this.f167653f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r5 = r5.mo77493G0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.tencent.mm.autogen.events.FinderLiveSwitchEvent r0 = new com.tencent.mm.autogen.events.FinderLiveSwitchEvent
            r0.<init>()
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r1 = r8.f167651d
            long r2 = r8.f167652e
            java.lang.String r4 = r8.f167653f
            eg1.u r5 = r1.f159214h
            if (r5 == 0) goto L_0x0018
            al1.i r5 = r5.mo77493G0()
            if (r5 == 0) goto L_0x0018
            int r5 = r5.f151992g
            goto L_0x0019
        L_0x0018:
            r5 = 0
        L_0x0019:
            com.tencent.mm.autogen.events.FinderLiveSwitchEvent$a r6 = r0.f154791d
            r6.f154792a = r5
            r7 = 4
            if (r5 != r7) goto L_0x003a
            eg1.u r1 = r1.f159214h
            if (r1 == 0) goto L_0x003a
            al1.i r1 = r1.mo77493G0()
            if (r1 == 0) goto L_0x003a
            java.util.HashMap<java.lang.Long, java.lang.String> r1 = r1.f151993h
            if (r1 == 0) goto L_0x003a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x003b
        L_0x003a:
            r1 = r4
        L_0x003b:
            r6.f154793b = r1
            r0.publish()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "notifyLiveSwitch data.liveId:"
            r1.append(r2)
            com.tencent.mm.autogen.events.FinderLiveSwitchEvent$a r2 = r0.f154791d
            java.lang.String r2 = r2.f154793b
            r1.append(r2)
            java.lang.String r2 = ", liveId:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", source:"
            r1.append(r2)
            com.tencent.mm.autogen.events.FinderLiveSwitchEvent$a r0 = r0.f154791d
            int r0 = r0.f154792a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Finder.FinderLiveViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eg1.C58569e0.run():void");
    }
}
