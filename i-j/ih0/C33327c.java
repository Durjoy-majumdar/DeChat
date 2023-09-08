package ih0;

import com.tencent.p014mm.autogen.events.FindMoreFriendEntryRedDotEvent;

/* renamed from: ih0.c */
public class C33327c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FindMoreFriendEntryRedDotEvent f90349d;

    /* renamed from: e */
    public final /* synthetic */ C33329e f90350e;

    public C33327c(C33329e eVar, FindMoreFriendEntryRedDotEvent findMoreFriendEntryRedDotEvent) {
        this.f90350e = eVar;
        this.f90349d = findMoreFriendEntryRedDotEvent;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r0.equals("find_friends_by_finder") == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent r0 = r8.f90349d
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0040
            java.lang.String r4 = "MicroMsg.AiRedDotData"
            java.lang.String r5 = "note entry red dot [%s] entry [%b]"
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent$a r0 = r0.f78789d
            java.lang.String r7 = r0.f78790a
            r6[r3] = r7
            boolean r0 = r0.f78791b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
            ih0.e r0 = r8.f90350e
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r0.f90354e
            monitor-enter(r0)
            ih0.e r4 = r8.f90350e     // Catch:{ all -> 0x003d }
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r4.f90354e     // Catch:{ all -> 0x003d }
            com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent r5 = r8.f90349d     // Catch:{ all -> 0x003d }
            com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent$a r5 = r5.f78789d     // Catch:{ all -> 0x003d }
            java.lang.String r6 = r5.f78790a     // Catch:{ all -> 0x003d }
            boolean r5 = r5.f78791b     // Catch:{ all -> 0x003d }
            if (r5 == 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x003d }
            r4.put(r6, r5)     // Catch:{ all -> 0x003d }
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r1
        L_0x0040:
            com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent r0 = r8.f90349d
            com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent$a r0 = r0.f78789d
            boolean r4 = r0.f78791b
            if (r4 == 0) goto L_0x00c6
            java.lang.String r0 = r0.f78790a
            r0.getClass()
            r4 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case -497456467: goto L_0x006b;
                case 974172121: goto L_0x0060;
                case 1529575902: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            r1 = -1
            goto L_0x0075
        L_0x0057:
            java.lang.String r2 = "find_friends_by_finder"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0075
            goto L_0x0055
        L_0x0060:
            java.lang.String r1 = "find_live_friends_by_near"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0069
            goto L_0x0055
        L_0x0069:
            r1 = 1
            goto L_0x0075
        L_0x006b:
            java.lang.String r1 = "find_friends_by_finder_live"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0074
            goto L_0x0055
        L_0x0074:
            r1 = 0
        L_0x0075:
            switch(r1) {
                case 0: goto L_0x00ad;
                case 1: goto L_0x0093;
                case 2: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x00c6
        L_0x0079:
            ih0.b r0 = ih0.C21092b.m23349i()
            r0.getClass()
            lh0.g r0 = lh0.C34262g.vx0()
            r0.requireAccountInitialized()
            lh0.f r0 = r0.f92371i
            long r1 = eb0.C31543z5.m39453c()
            java.lang.String r3 = "last_expose_finder_reddot_ms"
            r0.mo33604e(r3, r1)
            goto L_0x00c6
        L_0x0093:
            ih0.b r0 = ih0.C21092b.m23349i()
            r0.getClass()
            lh0.g r0 = lh0.C34262g.vx0()
            r0.requireAccountInitialized()
            lh0.f r0 = r0.f92371i
            long r1 = eb0.C31543z5.m39453c()
            java.lang.String r3 = "last_expose_near_reddot_ms"
            r0.mo33604e(r3, r1)
            goto L_0x00c6
        L_0x00ad:
            ih0.b r0 = ih0.C21092b.m23349i()
            r0.getClass()
            lh0.g r0 = lh0.C34262g.vx0()
            r0.requireAccountInitialized()
            lh0.f r0 = r0.f92371i
            long r1 = eb0.C31543z5.m39453c()
            java.lang.String r3 = "last_expose_finder_live_reddot_ms"
            r0.mo33604e(r3, r1)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ih0.C33327c.run():void");
    }
}
