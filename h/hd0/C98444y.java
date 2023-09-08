package hd0;

/* renamed from: hd0.y */
public class C98444y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98438x f288745d;

    public C98444y(C98438x xVar) {
        this.f288745d = xVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r0.mo137777h("") != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        if (r0.mo137777h("@chatroom") != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r0.f288723e != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r0.f288724f == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r0 == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r12.f288745d.f288719a.isEmpty() == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r0 = r12.f288745d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r0.f288729k) <= 600) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        r0.f288729k = com.tencent.p014mm.sdk.platformtools.Util.nowSecond();
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        hd0.C98438x.m127860b(r12.f288745d, 111, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        r0 = new com.tencent.p014mm.pointers.PBool();
        r1 = r12.f288745d.f288719a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2 = r12.f288745d.f288719a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r2.hasNext() == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        r6 = r2.next();
        r8 = hd0.C98438x.m127861c(r12.f288745d, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        if (r0.value == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        r2.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        if (r8 == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (r2.f194020e.f194028b != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        if (r6 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        r12.f288745d.f288728j = new hd0.C98411p(r6.getMsgId());
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.PreloadVideoService", "%s start to preload video[%s]", java.lang.Integer.valueOf(r12.f288745d.hashCode()), r12.f288745d.f288728j.mo137736c());
        r0 = r12.f288745d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ee, code lost:
        if (r0.f288728j.mo137735b(r0) >= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f0, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.PreloadVideoService", "%s curr preload task do scene error.", java.lang.Integer.valueOf(r12.f288745d.hashCode()));
        r0 = r12.f288745d.f288719a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1 = r12.f288745d.f288719a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002e, code lost:
        if (r1 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0116, code lost:
        if (r1.hasNext() == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        r2 = r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011e, code lost:
        if (r2 == null) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        r8 = r2.getMsgId();
        r2 = r12.f288745d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012c, code lost:
        if (r8 != r2.f288728j.f288594b) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012e, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", java.lang.Integer.valueOf(r2.hashCode()), java.lang.Long.valueOf(r12.f288745d.f288728j.f288594b));
        r1.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0151, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0152, code lost:
        r12.f288745d.f288728j = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        if (hd0.C98398h0.Dx0().f288760p == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r0.f288728j == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            hd0.x r0 = r12.f288745d
            r0.getClass()
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_voip_pause_other_preload_android
            r3 = 0
            boolean r1 = r1.mo58784wf(r2, r3)
            boolean r2 = p182kk.C61104a.m71644D()
            r4 = 2
            r5 = 1
            if (r2 != 0) goto L_0x002e
            com.tencent.mm.autogen.events.VoipEvent r2 = new com.tencent.mm.autogen.events.VoipEvent
            r2.<init>()
            com.tencent.mm.autogen.events.VoipEvent$a r6 = r2.f194019d
            r6.f194022b = r4
            r2.publish()
            com.tencent.mm.autogen.events.VoipEvent$b r2 = r2.f194020e
            boolean r2 = r2.f194028b
            if (r2 == 0) goto L_0x0031
        L_0x002e:
            if (r1 == 0) goto L_0x0031
            goto L_0x0057
        L_0x0031:
            hd0.z0 r1 = hd0.C98398h0.Dx0()
            boolean r1 = r1.f288760p
            if (r1 == 0) goto L_0x003a
            goto L_0x0057
        L_0x003a:
            hd0.p r1 = r0.f288728j
            if (r1 == 0) goto L_0x003f
            goto L_0x0057
        L_0x003f:
            java.lang.String r1 = ""
            boolean r1 = r0.mo137777h(r1)
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = "@chatroom"
            boolean r1 = r0.mo137777h(r1)
            if (r1 != 0) goto L_0x0059
            boolean r1 = r0.f288723e
            if (r1 != 0) goto L_0x0057
            boolean r0 = r0.f288724f
            if (r0 == 0) goto L_0x0059
        L_0x0057:
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x005d
            return
        L_0x005d:
            hd0.x r0 = r12.f288745d
            java.util.LinkedList<com.tencent.mm.storage.f4> r0 = r0.f288719a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0086
            hd0.x r0 = r12.f288745d
            long r1 = r0.f288729k
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r1)
            r6 = 600(0x258, double:2.964E-321)
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x007c
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.f288729k = r1
            r3 = 1
        L_0x007c:
            if (r3 == 0) goto L_0x0085
            hd0.x r0 = r12.f288745d
            r1 = 111(0x6f, float:1.56E-43)
            hd0.C98438x.m127860b(r0, r1, r5)
        L_0x0085:
            return
        L_0x0086:
            com.tencent.mm.pointers.PBool r0 = new com.tencent.mm.pointers.PBool
            r0.<init>()
            hd0.x r1 = r12.f288745d
            java.util.LinkedList<com.tencent.mm.storage.f4> r1 = r1.f288719a
            monitor-enter(r1)
            hd0.x r2 = r12.f288745d     // Catch:{ all -> 0x015b }
            java.util.LinkedList<com.tencent.mm.storage.f4> r2 = r2.f288719a     // Catch:{ all -> 0x015b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x015b }
        L_0x0098:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x015b }
            r7 = 0
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x015b }
            com.tencent.mm.storage.f4 r6 = (com.tencent.p014mm.storage.C72963f4) r6     // Catch:{ all -> 0x015b }
            hd0.x r8 = r12.f288745d     // Catch:{ all -> 0x015b }
            boolean r8 = hd0.C98438x.m127861c(r8, r6, r0)     // Catch:{ all -> 0x015b }
            boolean r9 = r0.value     // Catch:{ all -> 0x015b }
            if (r9 == 0) goto L_0x00b2
            r2.remove()     // Catch:{ all -> 0x015b }
        L_0x00b2:
            if (r8 == 0) goto L_0x0098
            goto L_0x00b6
        L_0x00b5:
            r6 = r7
        L_0x00b6:
            monitor-exit(r1)     // Catch:{ all -> 0x015b }
            if (r6 != 0) goto L_0x00ba
            return
        L_0x00ba:
            hd0.x r0 = r12.f288745d
            hd0.p r1 = new hd0.p
            long r8 = r6.getMsgId()
            r1.<init>(r8)
            r0.f288728j = r1
            java.lang.String r0 = "MicroMsg.PreloadVideoService"
            java.lang.String r1 = "%s start to preload video[%s]"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            hd0.x r6 = r12.f288745d
            int r6 = r6.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r3] = r6
            hd0.x r6 = r12.f288745d
            hd0.p r6 = r6.f288728j
            java.lang.String r6 = r6.mo137736c()
            r2[r5] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            hd0.x r0 = r12.f288745d
            hd0.p r1 = r0.f288728j
            int r0 = r1.mo137735b(r0)
            if (r0 >= 0) goto L_0x015a
            java.lang.String r0 = "MicroMsg.PreloadVideoService"
            java.lang.String r1 = "%s curr preload task do scene error."
            java.lang.Object[] r2 = new java.lang.Object[r5]
            hd0.x r6 = r12.f288745d
            int r6 = r6.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r3] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r2)
            hd0.x r0 = r12.f288745d
            java.util.LinkedList<com.tencent.mm.storage.f4> r0 = r0.f288719a
            monitor-enter(r0)
            hd0.x r1 = r12.f288745d     // Catch:{ all -> 0x0157 }
            java.util.LinkedList<com.tencent.mm.storage.f4> r1 = r1.f288719a     // Catch:{ all -> 0x0157 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0157 }
        L_0x0112:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0157 }
            if (r2 == 0) goto L_0x0151
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0157 }
            com.tencent.mm.storage.f4 r2 = (com.tencent.p014mm.storage.C72963f4) r2     // Catch:{ all -> 0x0157 }
            if (r2 == 0) goto L_0x0112
            long r8 = r2.getMsgId()     // Catch:{ all -> 0x0157 }
            hd0.x r2 = r12.f288745d     // Catch:{ all -> 0x0157 }
            hd0.p r6 = r2.f288728j     // Catch:{ all -> 0x0157 }
            long r10 = r6.f288594b     // Catch:{ all -> 0x0157 }
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0112
            java.lang.String r6 = "MicroMsg.PreloadVideoService"
            java.lang.String r8 = "%d find msg[%d], remove now"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0157 }
            int r2 = r2.hashCode()     // Catch:{ all -> 0x0157 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0157 }
            r9[r3] = r2     // Catch:{ all -> 0x0157 }
            hd0.x r2 = r12.f288745d     // Catch:{ all -> 0x0157 }
            hd0.p r2 = r2.f288728j     // Catch:{ all -> 0x0157 }
            long r10 = r2.f288594b     // Catch:{ all -> 0x0157 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0157 }
            r9[r5] = r2     // Catch:{ all -> 0x0157 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)     // Catch:{ all -> 0x0157 }
            r1.remove()     // Catch:{ all -> 0x0157 }
            goto L_0x0112
        L_0x0151:
            monitor-exit(r0)     // Catch:{ all -> 0x0157 }
            hd0.x r0 = r12.f288745d
            r0.f288728j = r7
            goto L_0x015a
        L_0x0157:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0157 }
            throw r1
        L_0x015a:
            return
        L_0x015b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x015b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98444y.run():void");
    }
}
