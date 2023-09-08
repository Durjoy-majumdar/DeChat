package mb3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import zt3.C119157j;

/* renamed from: mb3.i */
public class C46988i {

    /* renamed from: a */
    public static C46990b f126346a = null;

    /* renamed from: b */
    public static int f126347b = -1;

    /* renamed from: mb3.i$b */
    public static class C46990b extends BroadcastReceiver {

        /* renamed from: mb3.i$b$a */
        public class C46991a implements Runnable {
            public C46991a(C46990b bVar) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r10 = this;
                    java.lang.Class<mb3.i> r0 = mb3.C46988i.class
                    monitor-enter(r0)
                    boolean r1 = f40.C86709a0.m107522a()     // Catch:{ all -> 0x00b5 }
                    if (r1 == 0) goto L_0x00ac
                    boolean r1 = f40.C86718e.m107551r()     // Catch:{ all -> 0x00b5 }
                    if (r1 == 0) goto L_0x0011
                    goto L_0x00ac
                L_0x0011:
                    android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00b5 }
                    int r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r1)     // Catch:{ all -> 0x00b5 }
                    int r2 = mb3.C46988i.f126347b     // Catch:{ all -> 0x00b5 }
                    if (r1 != r2) goto L_0x001f
                    monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
                    return
                L_0x001f:
                    mb3.C46988i.f126347b = r1     // Catch:{ all -> 0x00b5 }
                    java.lang.String r2 = "MicroMsg.Wepkg.WepkgAutoDownloader"
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b5 }
                    r3.<init>()     // Catch:{ all -> 0x00b5 }
                    java.lang.String r4 = "onNetStateChange, netState = "
                    r3.append(r4)     // Catch:{ all -> 0x00b5 }
                    r3.append(r1)     // Catch:{ all -> 0x00b5 }
                    java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b5 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x00b5 }
                    if (r1 != 0) goto L_0x00a3
                    boolean r1 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45367a()     // Catch:{ all -> 0x00b5 }
                    f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x00b5 }
                    com.tencent.mm.storage.v1 r2 = r2.mo121142i()     // Catch:{ all -> 0x00b5 }
                    com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEPKG_CHECK_DOWNLOAD_TIME_LONG     // Catch:{ all -> 0x00b5 }
                    r4 = 0
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00b5 }
                    java.lang.Object r2 = r2.mo119685f(r3, r4)     // Catch:{ all -> 0x00b5 }
                    java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x00b5 }
                    long r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r2)     // Catch:{ all -> 0x00b5 }
                    java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00b5 }
                    long r4 = r2.longValue()     // Catch:{ all -> 0x00b5 }
                    long r4 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r4)     // Catch:{ all -> 0x00b5 }
                    r2 = 1
                    r6 = 1800(0x708, double:8.893E-321)
                    r8 = 0
                    int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r9 <= 0) goto L_0x006d
                    r4 = 1
                    goto L_0x006e
                L_0x006d:
                    r4 = 0
                L_0x006e:
                    if (r4 != 0) goto L_0x007f
                    java.lang.String r5 = "MicroMsg.Wepkg.WepkgAutoDownloader"
                    java.lang.String r9 = "dont auto download in wifi, because from the last time is not enough for %s s"
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00b5 }
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00b5 }
                    r2[r8] = r6     // Catch:{ all -> 0x00b5 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r2)     // Catch:{ all -> 0x00b5 }
                L_0x007f:
                    if (r1 != 0) goto L_0x00aa
                    if (r4 == 0) goto L_0x00aa
                    f40.o r1 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x00b5 }
                    com.tencent.mm.storage.v1 r1 = r1.mo121142i()     // Catch:{ all -> 0x00b5 }
                    long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ all -> 0x00b5 }
                    java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00b5 }
                    r1.mo119677K(r3, r2)     // Catch:{ all -> 0x00b5 }
                    com.tencent.mm.autogen.events.WepkgNotifyEvent r1 = new com.tencent.mm.autogen.events.WepkgNotifyEvent     // Catch:{ all -> 0x00b5 }
                    r1.<init>()     // Catch:{ all -> 0x00b5 }
                    com.tencent.mm.autogen.events.WepkgNotifyEvent$a r2 = r1.f107837d     // Catch:{ all -> 0x00b5 }
                    r2.f107838a = r8     // Catch:{ all -> 0x00b5 }
                    r1.publish()     // Catch:{ all -> 0x00b5 }
                    goto L_0x00aa
                L_0x00a3:
                    mb3.d r1 = mb3.C46983d.m52299a()     // Catch:{ all -> 0x00b5 }
                    r1.mo72172b()     // Catch:{ all -> 0x00b5 }
                L_0x00aa:
                    monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
                    return
                L_0x00ac:
                    java.lang.String r1 = "MicroMsg.Wepkg.WepkgAutoDownloader"
                    java.lang.String r2 = "acc has not ready"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x00b5 }
                    monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
                    return
                L_0x00b5:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00b5 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: mb3.C46988i.C46990b.C46991a.run():void");
            }
        }

        public C46990b(C46989a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            ((C119157j) C119157j.f356862d).mo183875f(new C46991a(this));
        }
    }
}
