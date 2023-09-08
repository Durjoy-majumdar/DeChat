package com.tencent.p014mm.plugin.game.model.silent_download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GameSilentDownloadEvent;
import com.tencent.p014mm.autogen.events.GameSilentDownloadNotifyEvent;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.game.model.silent_download.C42107k;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import p237sp.C13754y;
import p237sp.C48456t;
import p749xh.C53352w2;
import sw1.C48484q;
import sx1.C48493b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.model.silent_download.GameSilentDownloadListener */
public class GameSilentDownloadListener extends IStaticListener<IEvent> {

    /* renamed from: d */
    public static C42099c f113407d = null;

    /* renamed from: e */
    public static C42098b f113408e = null;

    /* renamed from: f */
    public static int f113409f = -1;

    /* renamed from: g */
    public static C114668z.C104589a f113410g = new C42097a();

    /* renamed from: h */
    public static final IListener<GameSilentDownloadNotifyEvent> f113411h;

    /* renamed from: i */
    public static final IListener<GameSilentDownloadEvent> f113412i;

    /* renamed from: com.tencent.mm.plugin.game.model.silent_download.GameSilentDownloadListener$a */
    public class C42097a extends C114668z.C104589a {
        public void onAppBackground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    GameSilentDownloadNotifyEvent gameSilentDownloadNotifyEvent = new GameSilentDownloadNotifyEvent();
                    gameSilentDownloadNotifyEvent.f107567d.f107568a = 1;
                    gameSilentDownloadNotifyEvent.publish();
                }
            }
        }

        public void onAppForeground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    GameSilentDownloadNotifyEvent gameSilentDownloadNotifyEvent = new GameSilentDownloadNotifyEvent();
                    gameSilentDownloadNotifyEvent.f107567d.f107568a = 2;
                    gameSilentDownloadNotifyEvent.publish();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.silent_download.GameSilentDownloadListener$b */
    public static class C42098b extends BroadcastReceiver {
        public C42098b(C42097a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            if (!C86709a0.m107522a() || C86718e.m107551r()) {
                Log.m105920e("MicroMsg.GameSilentDownloadListener", "acc has not ready");
            } else if (intent != null) {
                if ("android.intent.action.BATTERY_OKAY".equals(intent.getAction())) {
                    Log.m105924i("MicroMsg.GameSilentDownloadListener", "batteryChange: ACTION_BATTERY_OKAY, checkDownload");
                    C48493b.m53856b().mo73124a("game_silent_download", new C42106j(C42107k.C42110b.f113420a, true));
                } else if ("android.intent.action.BATTERY_LOW".equals(intent.getAction())) {
                    Log.m105924i("MicroMsg.GameSilentDownloadListener", "batteryChange: ACTION_BATTERY_LOW, pauseDownload");
                    C42107k.C42110b.f113420a.mo66069c();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.model.silent_download.GameSilentDownloadListener$c */
    public static class C42099c extends BroadcastReceiver {

        /* renamed from: com.tencent.mm.plugin.game.model.silent_download.GameSilentDownloadListener$c$a */
        public class C42100a implements Runnable {
            public C42100a(C42099c cVar) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r6 = this;
                    java.lang.Class<com.tencent.mm.plugin.game.model.silent_download.GameSilentDownloadListener> r0 = com.tencent.p014mm.plugin.game.model.silent_download.GameSilentDownloadListener.class
                    monitor-enter(r0)
                    boolean r1 = f40.C86709a0.m107522a()     // Catch:{ all -> 0x0063 }
                    if (r1 == 0) goto L_0x005a
                    boolean r1 = f40.C86718e.m107551r()     // Catch:{ all -> 0x0063 }
                    if (r1 == 0) goto L_0x0010
                    goto L_0x005a
                L_0x0010:
                    android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0063 }
                    int r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r1)     // Catch:{ all -> 0x0063 }
                    int r2 = com.tencent.p014mm.plugin.game.model.silent_download.GameSilentDownloadListener.f113409f     // Catch:{ all -> 0x0063 }
                    if (r1 != r2) goto L_0x001e
                    monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                    return
                L_0x001e:
                    com.tencent.p014mm.plugin.game.model.silent_download.GameSilentDownloadListener.f113409f = r1     // Catch:{ all -> 0x0063 }
                    r2 = 1
                    r3 = 0
                    if (r1 != 0) goto L_0x0044
                    java.lang.String r4 = "MicroMsg.GameSilentDownloadListener"
                    java.lang.String r5 = "netStateChange, netState = %s, checkDownload"
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0063 }
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0063 }
                    r2[r3] = r1     // Catch:{ all -> 0x0063 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)     // Catch:{ all -> 0x0063 }
                    com.tencent.mm.plugin.game.model.silent_download.k r1 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42110b.f113420a     // Catch:{ all -> 0x0063 }
                    sx1.b r2 = sx1.C48493b.m53856b()     // Catch:{ all -> 0x0063 }
                    com.tencent.mm.plugin.game.model.silent_download.j r4 = new com.tencent.mm.plugin.game.model.silent_download.j     // Catch:{ all -> 0x0063 }
                    r4.<init>(r1, r3)     // Catch:{ all -> 0x0063 }
                    java.lang.String r1 = "game_silent_download"
                    r2.mo73124a(r1, r4)     // Catch:{ all -> 0x0063 }
                    goto L_0x0058
                L_0x0044:
                    java.lang.String r4 = "MicroMsg.GameSilentDownloadListener"
                    java.lang.String r5 = "netStateChange, netState = %s, pauseDownload"
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0063 }
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0063 }
                    r2[r3] = r1     // Catch:{ all -> 0x0063 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r2)     // Catch:{ all -> 0x0063 }
                    com.tencent.mm.plugin.game.model.silent_download.k r1 = com.tencent.p014mm.plugin.game.model.silent_download.C42107k.C42110b.f113420a     // Catch:{ all -> 0x0063 }
                    r1.mo66069c()     // Catch:{ all -> 0x0063 }
                L_0x0058:
                    monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                    return
                L_0x005a:
                    java.lang.String r1 = "MicroMsg.GameSilentDownloadListener"
                    java.lang.String r2 = "acc has not ready"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x0063 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                    return
                L_0x0063:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.model.silent_download.GameSilentDownloadListener.C42099c.C42100a.run():void");
            }
        }

        public C42099c(C42097a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            ((C119157j) C119157j.f356862d).mo183875f(new C42100a(this));
        }
    }

    static {
        C40008f fVar = C40008f.f107254d;
        f113411h = new IListener<GameSilentDownloadNotifyEvent>(fVar) {
            {
                this.__eventId = 1248113810;
            }

            public boolean callback(IEvent iEvent) {
                Class cls = C48484q.class;
                GameSilentDownloadNotifyEvent.C40111a aVar = ((GameSilentDownloadNotifyEvent) iEvent).f107567d;
                int i = aVar.f107568a;
                if (i == 2) {
                    C85801v1 i2 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_GAME_SILENT_DOWNLOAD_TIME_LONG;
                    if (Util.secondsToNow(Long.valueOf(Util.nullAsNil((Long) i2.mo119685f(aVar2, 0L))).longValue()) > 600) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(Util.nowSecond()));
                        C48493b.m53856b().mo73124a("game_silent_download", new C42106j(C42107k.C42110b.f113420a, false));
                    }
                } else if (i == 3) {
                    String str = aVar.f107569b;
                    if (Util.isNullOrNil(str)) {
                        C42105i Po0 = ((C48484q) C86312j.m106911c(cls)).Po0();
                        Po0.getClass();
                        Log.m105925i("MicroMsg.GameSilentDownloadStorage", "deleteAllItem ret:%b", Boolean.valueOf(Po0.execSQL("GameSilentDownload", String.format("delete from %s", new Object[]{"GameSilentDownload"}))));
                    } else {
                        C42103f fVar = new C42103f();
                        fVar.field_appId = str;
                        ((C48484q) C86312j.m106911c(cls)).Po0().delete(fVar, new String[0]);
                        Log.m105925i("MicroMsg.GameSilentDownloadListener", "delete silent download, appid:%s", str);
                    }
                } else if (i == 4) {
                    String str2 = aVar.f107569b;
                    if (!Util.isNullOrNil(str2)) {
                        Class cls2 = C48456t.class;
                        C53352w2 IX = ((C48456t) C86312j.m106911c(cls2)).mo72822IX(str2);
                        if (IX != null) {
                            ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(IX.field_downloadId);
                            ((C48456t) C86312j.m106911c(cls2)).Fu0(IX.field_downloadId);
                            Log.m105925i("MicroMsg.GameSilentDownload.GameDownloadHelper", "delete downloadInfo in DB. appId:%s", str2);
                        }
                    }
                }
                return false;
            }
        };
        f113412i = new IListener<GameSilentDownloadEvent>(fVar) {
            {
                this.__eventId = 1688812315;
            }

            public boolean callback(IEvent iEvent) {
                String str = ((GameSilentDownloadEvent) iEvent).f107565d.f107566a;
                if (Util.isNullOrNil(str)) {
                    Log.m105924i("MicroMsg.GameSilentDownloadListener", "GameSilentDownloadEvent, appid is null!");
                } else {
                    C42104h.m45806c(str, 7, 0);
                    C42103f fVar = new C42103f();
                    fVar.field_appId = str;
                    Log.m105925i("MicroMsg.GameSilentDownloadListener", "cancel silentDownloadTask, appid:%s, ret:%b", str, Boolean.valueOf(((C48484q) C86312j.m106911c(C48484q.class)).Po0().delete(fVar, new String[0])));
                }
                return false;
            }
        };
    }

    public boolean callback(IEvent iEvent) {
        if (iEvent instanceof GameSilentDownloadEvent) {
            f113412i.callback((GameSilentDownloadEvent) iEvent);
            return false;
        } else if (!(iEvent instanceof GameSilentDownloadNotifyEvent)) {
            return false;
        } else {
            f113411h.callback((GameSilentDownloadNotifyEvent) iEvent);
            return false;
        }
    }
}
