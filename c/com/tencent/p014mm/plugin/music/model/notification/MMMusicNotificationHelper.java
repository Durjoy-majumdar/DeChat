package com.tencent.p014mm.plugin.music.model.notification;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper */
public class MMMusicNotificationHelper {

    /* renamed from: a */
    public MMMusicPlayerService f272158a;

    /* renamed from: b */
    public volatile boolean f272159b = false;

    /* renamed from: c */
    public IListener f272160c;

    /* renamed from: c */
    public void mo129504c() {
        Log.m105924i("MicroMsg.Music.MMMusicNotificationHelper", "initMusicPlayerService");
        C942091 r0 = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1155728636;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
                if (r1 != 11) goto L_0x0141;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r8) {
                /*
                    r7 = this;
                    com.tencent.mm.autogen.events.MusicPlayerEvent r8 = (com.tencent.p014mm.autogen.events.MusicPlayerEvent) r8
                    java.lang.Class<la2.f> r0 = la2.C99358f.class
                    com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper r1 = com.tencent.p014mm.plugin.music.model.notification.MMMusicNotificationHelper.this
                    com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r2 = r1.f272158a
                    r3 = 1
                    r4 = 0
                    if (r2 != 0) goto L_0x004b
                    monitor-enter(r1)
                    com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r8 = r1.f272158a     // Catch:{ all -> 0x0048 }
                    if (r8 == 0) goto L_0x0018
                    boolean r8 = r1.f272159b     // Catch:{ all -> 0x0048 }
                    if (r8 == 0) goto L_0x0018
                    monitor-exit(r1)
                    goto L_0x0141
                L_0x0018:
                    r1.f272159b = r3     // Catch:{ all -> 0x0048 }
                    android.content.Intent r8 = new android.content.Intent     // Catch:{ all -> 0x0048 }
                    r8.<init>()     // Catch:{ all -> 0x0048 }
                    android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0048 }
                    java.lang.Class<com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService> r2 = com.tencent.p014mm.plugin.music.model.notification.MMMusicPlayerService.class
                    r8.setClass(r0, r2)     // Catch:{ all -> 0x0048 }
                    android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0048 }
                    com.tencent.mm.plugin.music.model.notification.e r2 = new com.tencent.mm.plugin.music.model.notification.e     // Catch:{ all -> 0x0048 }
                    r2.<init>(r1)     // Catch:{ all -> 0x0048 }
                    boolean r8 = r0.bindService(r8, r2, r3)     // Catch:{ all -> 0x0048 }
                    java.lang.String r0 = "MicroMsg.Music.MMMusicNotificationHelper"
                    java.lang.String r2 = "isOk:%b"
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0048 }
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0048 }
                    r3[r4] = r8     // Catch:{ all -> 0x0048 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)     // Catch:{ all -> 0x0048 }
                    monitor-exit(r1)
                    goto L_0x0141
                L_0x0048:
                    r8 = move-exception
                    monitor-exit(r1)
                    throw r8
                L_0x004b:
                    java.lang.String r1 = "MicroMsg.Music.MMMusicNotificationHelper"
                    java.lang.String r2 = "event.data.action:%d"
                    java.lang.Object[] r5 = new java.lang.Object[r3]
                    com.tencent.mm.autogen.events.MusicPlayerEvent$a r6 = r8.f9336d
                    int r6 = r6.f9337a
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    r5[r4] = r6
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r5)
                    com.tencent.mm.autogen.events.MusicPlayerEvent$a r8 = r8.f9336d
                    int r1 = r8.f9337a
                    if (r1 == 0) goto L_0x011f
                    if (r1 == r3) goto L_0x011f
                    r2 = 2
                    if (r1 == r2) goto L_0x0111
                    r8 = 3
                    if (r1 == r8) goto L_0x00ee
                    r8 = 4
                    if (r1 == r8) goto L_0x00e4
                    r8 = 7
                    if (r1 == r8) goto L_0x0078
                    r8 = 11
                    if (r1 == r8) goto L_0x011f
                    goto L_0x0141
                L_0x0078:
                    ua2.a r8 = ua2.C101991b.m134284b(r0)
                    la2.f r8 = (la2.C99358f) r8
                    java.util.List r8 = r8.mo138818q0()
                    ua2.a r1 = ua2.C101991b.m134284b(r0)
                    la2.f r1 = (la2.C99358f) r1
                    int r1 = r1.mo138817q()
                    if (r8 == 0) goto L_0x0095
                    int r8 = r8.size()
                    int r8 = r8 - r3
                    if (r8 == r1) goto L_0x00a1
                L_0x0095:
                    ua2.a r8 = ua2.C101991b.m134284b(r0)
                    la2.f r8 = (la2.C99358f) r8
                    int r8 = r8.getMode()
                    if (r8 != r3) goto L_0x0141
                L_0x00a1:
                    com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper r8 = com.tencent.p014mm.plugin.music.model.notification.MMMusicNotificationHelper.this
                    com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r8 = r8.f272158a
                    if (r8 == 0) goto L_0x0141
                    java.lang.String r0 = "MicroMsg.Music.MMMusicPlayerService"
                    java.lang.String r1 = "end"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                    com.tencent.mm.plugin.music.model.notification.a r0 = r8.f272162d
                    boolean r2 = r0.f272166a
                    java.lang.String r3 = "MicroMsg.Music.MMMusicNotification"
                    if (r2 != 0) goto L_0x00bc
                    java.lang.String r0 = "MMMusicNotification not init, close err"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                    goto L_0x00d6
                L_0x00bc:
                    com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r2 = r0.f272168c
                    if (r2 != 0) goto L_0x00c7
                    java.lang.String r0 = "mmMusicPlayerService is null, return"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                    goto L_0x00d6
                L_0x00c7:
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                    java.lang.Runnable r1 = r0.f272171f
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r1)
                    java.lang.Runnable r0 = r0.f272171f
                    r1 = 2000(0x7d0, double:9.88E-321)
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r1)
                L_0x00d6:
                    java.lang.Runnable r0 = r8.f272163e
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r0)
                    java.lang.Runnable r8 = r8.f272163e
                    r0 = 60000(0xea60, double:2.9644E-319)
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r8, r0)
                    goto L_0x0141
                L_0x00e4:
                    com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper r8 = com.tencent.p014mm.plugin.music.model.notification.MMMusicNotificationHelper.this
                    com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r8 = r8.f272158a
                    if (r8 == 0) goto L_0x0141
                    r8.mo129508d()
                    goto L_0x0141
                L_0x00ee:
                    com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper r8 = com.tencent.p014mm.plugin.music.model.notification.MMMusicNotificationHelper.this
                    com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r8 = r8.f272158a
                    if (r8 == 0) goto L_0x0141
                    ua2.a r8 = ua2.C101991b.m134284b(r0)
                    la2.f r8 = (la2.C99358f) r8
                    ra2.a r8 = r8.mo138809U()
                    if (r8 != 0) goto L_0x0109
                    java.lang.String r8 = "MicroMsg.Music.MMMusicNotificationHelper"
                    java.lang.String r0 = "music is null, return"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                    goto L_0x0141
                L_0x0109:
                    com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper r0 = com.tencent.p014mm.plugin.music.model.notification.MMMusicNotificationHelper.this
                    com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r0 = r0.f272158a
                    r0.mo129505a(r8)
                    goto L_0x0141
                L_0x0111:
                    com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper r0 = com.tencent.p014mm.plugin.music.model.notification.MMMusicNotificationHelper.this
                    com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r0 = r0.f272158a
                    if (r0 == 0) goto L_0x0141
                    boolean r8 = r8.f9343g
                    if (r8 != 0) goto L_0x0141
                    r0.mo129508d()
                    goto L_0x0141
                L_0x011f:
                    com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper r8 = com.tencent.p014mm.plugin.music.model.notification.MMMusicNotificationHelper.this
                    com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r8 = r8.f272158a
                    if (r8 == 0) goto L_0x0141
                    ua2.a r8 = ua2.C101991b.m134284b(r0)
                    la2.f r8 = (la2.C99358f) r8
                    ra2.a r8 = r8.mo138809U()
                    if (r8 != 0) goto L_0x013a
                    java.lang.String r8 = "MicroMsg.Music.MMMusicNotificationHelper"
                    java.lang.String r0 = "music is null, return"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                    goto L_0x0141
                L_0x013a:
                    com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper r0 = com.tencent.p014mm.plugin.music.model.notification.MMMusicNotificationHelper.this
                    com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService r0 = r0.f272158a
                    r0.mo129506b(r8)
                L_0x0141:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.music.model.notification.MMMusicNotificationHelper.C942091.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f272160c = r0;
        r0.alive();
    }
}
