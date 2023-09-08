package com.tencent.p014mm.plugin.game;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bd3.C39760a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GameCenterOperationEvent;
import com.tencent.p014mm.autogen.events.GameCommOperationEvent;
import com.tencent.p014mm.autogen.events.GameDebugSettingEvent;
import com.tencent.p014mm.autogen.events.GameDownloadReport4WebViewEvent;
import com.tencent.p014mm.autogen.events.GameJsApiCommandEvent;
import com.tencent.p014mm.autogen.events.GameLifeStorageNotifyEvent;
import com.tencent.p014mm.autogen.events.GameMessageStorageNotifyEvent;
import com.tencent.p014mm.autogen.events.GameMsgDownloadImgEvent;
import com.tencent.p014mm.autogen.events.GamePBCacheEvent;
import com.tencent.p014mm.autogen.events.GameWatchReportEvent;
import com.tencent.p014mm.autogen.events.GetGameDebugDownloaderTypeEvent;
import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import com.tencent.p014mm.autogen.events.NotifyGameWebviewOperationEvent;
import com.tencent.p014mm.autogen.events.OpenGameCenterEvent;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.autogen.events.QueryGameLifeMsgEvent;
import com.tencent.p014mm.autogen.events.QueryGameMessageEvent;
import com.tencent.p014mm.autogen.events.ReportGameCenterEvent;
import com.tencent.p014mm.autogen.events.ReportMsgClickEvent;
import com.tencent.p014mm.autogen.events.SetEntranceMsgExposureEvent;
import com.tencent.p014mm.autogen.events.ShowGameCenterEntranceEvent;
import com.tencent.p014mm.autogen.events.SwitcherEvent;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.commlib.C30075d;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.game.model.C30099e0;
import com.tencent.p014mm.plugin.game.model.C42036a0;
import com.tencent.p014mm.plugin.game.model.C42040b0;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.plugin.game.model.C42114u;
import com.tencent.p014mm.plugin.game.model.C42116v;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.model.C42147y0;
import com.tencent.p014mm.plugin.game.model.C4566p;
import com.tencent.p014mm.plugin.game.model.NotifyGameWebviewOperationListener;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import cz1.C45227d;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import h81.C32735h;
import hx1.C46130b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jx1.C46577a;
import ke3.C88144b;
import my1.C100028c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C66261f3;
import py1.C47583g0;
import py1.C47605j1;
import py1.C47658q5;
import sw1.C48483p;
import sw1.C48484q;
import u10.C52415a;
import uy1.C52638a;
import uy1.C52642c;
import v10.C52735e;
import xy1.C53472h;

/* renamed from: com.tencent.mm.plugin.game.GameEventListener */
public class GameEventListener extends IStaticListener<IEvent> {

    /* renamed from: E */
    public static C100028c f112095E = new C100028c();

    /* renamed from: F */
    public static MTimerHandler f112096F = new MTimerHandler(new C41675c(), false);

    /* renamed from: G */
    public static C114668z.C104589a f112097G = new C41676d();

    /* renamed from: A */
    public IListener<ManualAuthEvent> f112098A;

    /* renamed from: B */
    public IListener<GameMsgDownloadImgEvent> f112099B;

    /* renamed from: C */
    public IListener<ShowGameCenterEntranceEvent> f112100C;

    /* renamed from: D */
    public IListener<GamePBCacheEvent> f112101D;

    /* renamed from: d */
    public long f112102d = 0;

    /* renamed from: e */
    public boolean f112103e = false;

    /* renamed from: f */
    public NotifyGameWebviewOperationListener f112104f = new NotifyGameWebviewOperationListener();

    /* renamed from: g */
    public IListener<GameDownloadReport4WebViewEvent> f112105g;

    /* renamed from: h */
    public IListener<QueryGameLifeMsgEvent> f112106h;

    /* renamed from: i */
    public IListener<SetEntranceMsgExposureEvent> f112107i;

    /* renamed from: j */
    public IListener<QueryGameMessageEvent> f112108j;

    /* renamed from: n */
    public IListener<GameCenterOperationEvent> f112109n;

    /* renamed from: o */
    public IListener<GameJsApiCommandEvent> f112110o;

    /* renamed from: p */
    public IListener<OpenGameCenterEvent> f112111p;

    /* renamed from: q */
    public IListener<ReportGameCenterEvent> f112112q;

    /* renamed from: r */
    public IListener<ReportMsgClickEvent> f112113r;

    /* renamed from: s */
    public IListener<GameCommOperationEvent> f112114s;

    /* renamed from: t */
    public C39760a f112115t;

    /* renamed from: u */
    public C39760a f112116u;

    /* renamed from: v */
    public IListener<SwitcherEvent> f112117v;

    /* renamed from: w */
    public IListener<GameDebugSettingEvent> f112118w;

    /* renamed from: x */
    public IListener<GetGameDebugDownloaderTypeEvent> f112119x;

    /* renamed from: y */
    public IListener<GameWatchReportEvent> f112120y;

    /* renamed from: z */
    public IListener<PostSyncTaskEvent> f112121z;

    /* renamed from: com.tencent.mm.plugin.game.GameEventListener$a */
    public class C41673a extends C39760a {
        public C41673a(GameEventListener gameEventListener) {
        }

        /* renamed from: a */
        public IEvent mo62400a(String str) {
            GameMessageStorageNotifyEvent gameMessageStorageNotifyEvent = new GameMessageStorageNotifyEvent();
            gameMessageStorageNotifyEvent.f107553d.f107554a = str;
            return gameMessageStorageNotifyEvent;
        }

        /* renamed from: b */
        public MStorage mo62401b() {
            return ((C48484q) C86312j.m106911c(C48484q.class)).xi0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.GameEventListener$b */
    public class C41674b extends C39760a {
        public C41674b(GameEventListener gameEventListener) {
        }

        /* renamed from: a */
        public IEvent mo62400a(String str) {
            GameLifeStorageNotifyEvent gameLifeStorageNotifyEvent = new GameLifeStorageNotifyEvent();
            gameLifeStorageNotifyEvent.f107551d.f107552a = str;
            return gameLifeStorageNotifyEvent;
        }

        /* renamed from: b */
        public MStorage mo62401b() {
            return ((C53472h) C86312j.m106911c(C53472h.class)).mo70732y2();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.GameEventListener$c */
    public class C41675c implements MTimerHandler.CallBack {
        public boolean onTimerExpired() {
            C46577a aVar = C46577a.f125473d;
            C46130b bVar = C46577a.f125474e;
            synchronized (bVar) {
                Log.m105924i("GameChatRoom.GetMyChatRoomKeepAliveService", "pauseKeepAlive");
                bVar.f124302h = true;
                bVar.f124303i = false;
                if (bVar.f124300f != null) {
                    C86709a0.m107524d().mo123458d(bVar.f124300f);
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.GameEventListener$d */
    public class C41676d extends C114668z.C104589a {
        public void onAppBackground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    Log.m105925i("MicroMsg.GameEventListener", "appForegroundListener, onAppBackground(%s)", str);
                    long j = C52638a.C52640b.f146975a.f146973c.f146979d;
                    if (j > 0 && j < System.currentTimeMillis()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C52638a.C52641c cVar = C52638a.C52640b.f146975a.f146973c;
                        long j2 = currentTimeMillis - cVar.f146979d;
                        cVar.f146978c += j2;
                        Log.m105919d("MicroMsg.GameEventListener", "spanTime:%d, stayTime:%d", Long.valueOf(j2), Long.valueOf(C52638a.C52640b.f146975a.f146973c.f146978c));
                    }
                    GameEventListener.f112096F.startTimer(600000, 0);
                }
            }
        }

        public void onAppForeground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    Log.m105925i("MicroMsg.GameEventListener", "appForegroundListener, onAppForeground(%s)", str);
                    C52638a.C52641c cVar = C52638a.C52640b.f146975a.f146973c;
                    if (cVar.f146976a > 0) {
                        cVar.f146979d = System.currentTimeMillis();
                    }
                    Long valueOf = Long.valueOf(Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_PULL_GLOBAL_CONFIG_TIME_LONG, 0L)));
                    if (valueOf.longValue() != 0 && Util.nowSecond() > valueOf.longValue()) {
                        C30075d.m38954a().mo57102b(true, 1);
                    }
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GAME_LAST_SAVED_VERSION_CODE_INT;
                    int intValue = ((Integer) i.mo119685f(aVar, 0)).intValue();
                    if (2320 != intValue) {
                        Log.m105925i("MicroMsg.GameEventListener", "checkVersionChange lastVersion:%d, currentVersion:%d", Integer.valueOf(intValue), 2320);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, 2320);
                        GameCommOperationEvent gameCommOperationEvent = new GameCommOperationEvent();
                        GameCommOperationEvent.C1072a aVar2 = gameCommOperationEvent.f9268d;
                        aVar2.f9270a = 5;
                        aVar2.f9271b = String.valueOf(5);
                        gameCommOperationEvent.publish();
                    }
                    GameEventListener.f112096F.stopTimer();
                    C46577a aVar3 = C46577a.f125473d;
                    C46130b bVar = C46577a.f125474e;
                    synchronized (bVar) {
                        Log.m105924i("GameChatRoom.GetMyChatRoomKeepAliveService", "resumeKeepAlive");
                        if (bVar.f124302h && bVar.f124301g) {
                            bVar.mo71576a(bVar.f124307p, bVar.f124304j, bVar.f124305n);
                            bVar.f124302h = false;
                        }
                    }
                }
            }
        }
    }

    public GameEventListener() {
        C40008f fVar = C40008f.f107254d;
        this.f112105g = new IListener<GameDownloadReport4WebViewEvent>(this, fVar) {
            {
                this.__eventId = -130268553;
            }

            public boolean callback(IEvent iEvent) {
                GameDownloadReport4WebViewEvent.C1075a aVar = ((GameDownloadReport4WebViewEvent) iEvent).f9278d;
                int i = aVar.f9283e;
                int i2 = i != 0 ? i : 1000;
                String str = aVar.f9279a;
                String str2 = aVar.f9280b;
                String str3 = aVar.f9281c;
                String str4 = aVar.f9282d;
                C42091s sVar = C42091s.f113396a;
                if (Util.isNullOrNil(str)) {
                    return false;
                }
                C42091s.C42093b bVar = new C42091s.C42093b(str2, i2, str3, "", str4);
                bVar.f113404f = true;
                C42091s.f113398c.put(str, bVar);
                return false;
            }
        };
        this.f112106h = new IListener<QueryGameLifeMsgEvent>(this, fVar) {
            {
                this.__eventId = 63085695;
            }

            public boolean callback(IEvent iEvent) {
                C47583g0 g0Var;
                QueryGameLifeMsgEvent queryGameLifeMsgEvent = (QueryGameLifeMsgEvent) iEvent;
                Class cls = C53472h.class;
                int kd = ((C53472h) C86312j.m106911c(cls)).mo70730kd();
                if (kd == 0) {
                    queryGameLifeMsgEvent.f107703d.f107704a = false;
                } else {
                    long nullAsNil = Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG, 0L));
                    C45227d vY = ((C53472h) C86312j.m106911c(cls)).mo70731vY();
                    long j = vY.f122564b;
                    long j2 = vY.f122567e;
                    long nowMilliSecond = Util.nowMilliSecond();
                    if (Boolean.valueOf(Math.abs(nowMilliSecond - j2) > 86400000).booleanValue()) {
                        queryGameLifeMsgEvent.f107703d.f107704a = false;
                        Log.m105925i("MicroMsg.GameEventListener", "isConverSationUpdateTimeMore1day now:%d, sessionUpdateTimeMillSec:%d", Long.valueOf(nowMilliSecond), Long.valueOf(j2));
                    } else {
                        queryGameLifeMsgEvent.f107703d.f107704a = true;
                        queryGameLifeMsgEvent.f107703d.f107705b = MMApplicationContext.getContext().getResources().getString(C0966R.string.f97).replace("{unread_msg_count}", String.valueOf(kd));
                        queryGameLifeMsgEvent.f107703d.f107706c = Util.nullAsNil(((C53472h) C86312j.m106911c(cls)).mo70731vY().f122563a);
                        QueryGameLifeMsgEvent.C40155a aVar = queryGameLifeMsgEvent.f107703d;
                        aVar.f107707d = kd;
                        aVar.f107708e = j;
                        aVar.f107709f = j2 / 1000;
                        if (nullAsNil == j) {
                            aVar.f107704a = false;
                        } else {
                            C47605j1 i = C41853c.m45375i();
                            if (!(i == null || (g0Var = i.f127800d) == null)) {
                                if (g0Var.f127704e && g0Var.f127705f) {
                                    queryGameLifeMsgEvent.f107703d.f107704a = false;
                                } else if (g0Var.f127705f) {
                                    queryGameLifeMsgEvent.f107703d.f107706c = "";
                                } else {
                                    C47658q5 q5Var = g0Var.f127703d;
                                    if (q5Var != null && q5Var.f127953d == 1 && !Util.isNullOrNil(q5Var.f127954e)) {
                                        queryGameLifeMsgEvent.f107703d.f107705b = i.f127800d.f127703d.f127954e.replace("{unread_msg_count}", String.valueOf(kd));
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f112107i = new IListener<SetEntranceMsgExposureEvent>(this, fVar) {
            {
                this.__eventId = 368788730;
            }

            public boolean callback(IEvent iEvent) {
                SetEntranceMsgExposureEvent setEntranceMsgExposureEvent = (SetEntranceMsgExposureEvent) iEvent;
                Class cls = C48484q.class;
                if (setEntranceMsgExposureEvent.f107753d.f107755b) {
                    C42040b0 xi02 = ((C48484q) C86312j.m106911c(cls)).xi0();
                    long j = setEntranceMsgExposureEvent.f107753d.f107754a;
                    xi02.getClass();
                    xi02.execSQL("GameRawMessage", "update GameRawMessage set entranceExposure=1 where msgId=" + j);
                    if (setEntranceMsgExposureEvent.f107753d.f107757d) {
                        C42036a0 ar = ((C48483p) C86312j.m106911c(C48483p.class)).mo66079ar();
                        long j2 = setEntranceMsgExposureEvent.f107753d.f107754a;
                        ar.getClass();
                        C42119w Ow = ((C48484q) C86312j.m106911c(cls)).xi0().mo66000Ow(j2);
                        if (Ow != null) {
                            if (Ow.field_exposuredCount == 0) {
                                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_REDDOT_LAST_LEVELUP_REFRESH_TIME_SEC_LONG, Long.valueOf(Util.nowSecond()));
                                if (Ow.field_channel == 2) {
                                    C85801v1 i = C86709a0.m107535s().mo121142i();
                                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GAME_SINGLE_DAY_REDDOT_EXPOSURED_CNT_STRING;
                                    i.mo119677K(aVar, System.currentTimeMillis() + "_" + (ar.mo65980i() + 1));
                                }
                            }
                            C42040b0 xi03 = ((C48484q) C86312j.m106911c(cls)).xi0();
                            xi03.getClass();
                            xi03.execSQL("GameRawMessage", "update GameRawMessage set exposuredCount=exposuredCount+1 where msgId=" + j2);
                            Log.m105919d("MicroMsg.GameMessageService", "gamelog.srv_msg, service, reddotExposure, reddot msgId:%d increase exposure count.", Long.valueOf(j2));
                        }
                    }
                }
                return false;
            }
        };
        this.f112108j = new IListener<QueryGameMessageEvent>(fVar) {
            {
                this.__eventId = -625127267;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
                if (r9.f107837d.f107841d > 0) goto L_0x0086;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
                if (r9.f107837d.f107840c != false) goto L_0x0086;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x010f, code lost:
                if (r8 > r10) goto L_0x014e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x0149, code lost:
                if (r8 > r10) goto L_0x014e;
             */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x0175  */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x01a9  */
            /* JADX WARNING: Removed duplicated region for block: B:63:0x0202  */
            /* JADX WARNING: Removed duplicated region for block: B:66:0x020e  */
            /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r18) {
                /*
                    r17 = this;
                    r0 = r17
                    r1 = r18
                    com.tencent.mm.autogen.events.QueryGameMessageEvent r1 = (com.tencent.p014mm.autogen.events.QueryGameMessageEvent) r1
                    java.lang.Class<sw1.q> r2 = sw1.C48484q.class
                    java.lang.Class<sw1.p> r3 = sw1.C48483p.class
                    com.tencent.mm.autogen.events.QueryGameMessageEvent$a r4 = r1.f107710d
                    java.lang.String r4 = r4.f107721k
                    boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                    r5 = 10
                    r6 = 1
                    r8 = 11
                    if (r4 == 0) goto L_0x023d
                    di3.d r4 = di3.C86312j.m106911c(r3)
                    sw1.p r4 = (sw1.C48483p) r4
                    com.tencent.mm.plugin.game.model.a0 r4 = r4.mo66079ar()
                    com.tencent.mm.plugin.game.model.w r4 = r4.mo65984m()
                    if (r4 == 0) goto L_0x0230
                    int r9 = r4.field_isHidden
                    r10 = 2
                    if (r9 != r10) goto L_0x0030
                    goto L_0x0230
                L_0x0030:
                    r4.mo66075l2()
                    long r11 = r4.field_receiveTime
                    com.tencent.mm.plugin.game.model.w$q r9 = r4.f113458S1
                    long r13 = r9.f113553c
                    long r11 = r11 + r13
                    long r13 = java.lang.System.currentTimeMillis()
                    r15 = 1000(0x3e8, double:4.94E-321)
                    long r13 = r13 / r15
                    int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                    if (r9 <= 0) goto L_0x0046
                    goto L_0x0086
                L_0x0046:
                    com.tencent.mm.plugin.game.model.w$q r9 = r4.f113458S1
                    int r9 = r9.f113552b
                    if (r9 == 0) goto L_0x0086
                    if (r9 == r6) goto L_0x006b
                    if (r9 == r10) goto L_0x0051
                    goto L_0x0084
                L_0x0051:
                    com.tencent.mm.autogen.events.WepkgNotifyEvent r9 = new com.tencent.mm.autogen.events.WepkgNotifyEvent
                    r9.<init>()
                    com.tencent.mm.autogen.events.WepkgNotifyEvent$a r11 = r9.f107837d
                    r12 = 4
                    r11.f107838a = r12
                    com.tencent.mm.plugin.game.model.w$q r12 = r4.f113458S1
                    java.lang.String r12 = r12.f113551a
                    r11.f107839b = r12
                    r9.publish()
                    com.tencent.mm.autogen.events.WepkgNotifyEvent$a r9 = r9.f107837d
                    int r9 = r9.f107841d
                    if (r9 <= 0) goto L_0x0084
                    goto L_0x0086
                L_0x006b:
                    com.tencent.mm.autogen.events.WepkgNotifyEvent r9 = new com.tencent.mm.autogen.events.WepkgNotifyEvent
                    r9.<init>()
                    com.tencent.mm.autogen.events.WepkgNotifyEvent$a r11 = r9.f107837d
                    r11.f107838a = r10
                    com.tencent.mm.plugin.game.model.w$q r12 = r4.f113458S1
                    java.lang.String r12 = r12.f113551a
                    r11.f107839b = r12
                    r9.publish()
                    com.tencent.mm.autogen.events.WepkgNotifyEvent$a r9 = r9.f107837d
                    boolean r9 = r9.f107840c
                    if (r9 == 0) goto L_0x0084
                    goto L_0x0086
                L_0x0084:
                    r9 = 0
                    goto L_0x0087
                L_0x0086:
                    r9 = 1
                L_0x0087:
                    int r11 = r4.f113498x1
                    java.lang.String r12 = "GameRawMessage"
                    java.lang.String r13 = "update GameRawMessage set isHidden = 0 where msgId="
                    if (r11 <= 0) goto L_0x0175
                    android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    boolean r11 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r11)
                    java.lang.String r14 = "MicroMsg.GameWifiStrategy"
                    if (r11 == 0) goto L_0x00a2
                    java.lang.String r5 = "WifiStrategy:isInWifi"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
                    goto L_0x014e
                L_0x00a2:
                    java.util.GregorianCalendar r11 = new java.util.GregorianCalendar
                    r11.<init>()
                    int r15 = r11.get(r8)
                    r10 = 12
                    r11.get(r10)
                    r11 = 21
                    r7 = 3
                    if (r15 < r11) goto L_0x00b7
                    r11 = 3
                    goto L_0x00c7
                L_0x00b7:
                    if (r15 >= r10) goto L_0x00ba
                    goto L_0x00c4
                L_0x00ba:
                    r11 = 14
                    if (r15 >= r11) goto L_0x00c0
                    r11 = 1
                    goto L_0x00c7
                L_0x00c0:
                    r11 = 18
                    if (r15 >= r11) goto L_0x00c6
                L_0x00c4:
                    r11 = 0
                    goto L_0x00c7
                L_0x00c6:
                    r11 = 2
                L_0x00c7:
                    java.lang.StringBuilder r15 = new java.lang.StringBuilder
                    r15.<init>()
                    java.lang.String r10 = "WifiStrategy:inWhichTimeRange = "
                    r15.append(r10)
                    r15.append(r11)
                    java.lang.String r10 = r15.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
                    if (r11 != 0) goto L_0x00de
                    goto L_0x014c
                L_0x00de:
                    if (r11 != r7) goto L_0x00e1
                    goto L_0x014e
                L_0x00e1:
                    java.lang.String r7 = "WifiStrategy:randomHide p = %s, randomNum = %s"
                    r10 = 100
                    if (r11 != r6) goto L_0x0112
                    java.util.GregorianCalendar r11 = new java.util.GregorianCalendar
                    r11.<init>()
                    int r8 = r11.get(r8)
                    int r8 = r8 + -12
                    int r8 = r8 << r6
                    int r8 = r8 + r6
                    int r8 = r8 * 10
                    int r8 = r8 + 50
                    r5 = 0
                    int r10 = com.tencent.p014mm.sdk.platformtools.Util.getIntRandom(r10, r5)
                    r15 = 2
                    java.lang.Object[] r11 = new java.lang.Object[r15]
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
                    r11[r5] = r15
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
                    r11[r6] = r5
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r11)
                    if (r8 <= r10) goto L_0x014c
                    goto L_0x014e
                L_0x0112:
                    r15 = 2
                    if (r11 != r15) goto L_0x014e
                    java.util.GregorianCalendar r11 = new java.util.GregorianCalendar
                    r11.<init>()
                    int r8 = r11.get(r8)
                    r15 = 12
                    int r11 = r11.get(r15)
                    int r8 = r8 + -18
                    r15 = 30
                    if (r11 <= r15) goto L_0x012c
                    r11 = 1
                    goto L_0x012d
                L_0x012c:
                    r11 = 0
                L_0x012d:
                    int r8 = r8 + r11
                    int r8 = r8 * 10
                    int r8 = r8 + 50
                    r5 = 0
                    int r10 = com.tencent.p014mm.sdk.platformtools.Util.getIntRandom(r10, r5)
                    r11 = 2
                    java.lang.Object[] r11 = new java.lang.Object[r11]
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
                    r11[r5] = r15
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
                    r11[r6] = r5
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r11)
                    if (r8 <= r10) goto L_0x014c
                    goto L_0x014e
                L_0x014c:
                    r5 = 1
                    goto L_0x014f
                L_0x014e:
                    r5 = 0
                L_0x014f:
                    if (r5 != 0) goto L_0x0198
                    if (r9 == 0) goto L_0x0198
                    di3.d r2 = di3.C86312j.m106911c(r2)
                    sw1.q r2 = (sw1.C48484q) r2
                    com.tencent.mm.plugin.game.model.b0 r2 = r2.xi0()
                    long r4 = r4.field_msgId
                    r2.getClass()
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r13)
                    r7.append(r4)
                    java.lang.String r4 = r7.toString()
                    r2.execSQL(r12, r4)
                    goto L_0x0198
                L_0x0175:
                    if (r9 == 0) goto L_0x0198
                    di3.d r2 = di3.C86312j.m106911c(r2)
                    sw1.q r2 = (sw1.C48484q) r2
                    com.tencent.mm.plugin.game.model.b0 r2 = r2.xi0()
                    long r4 = r4.field_msgId
                    r2.getClass()
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r13)
                    r7.append(r4)
                    java.lang.String r4 = r7.toString()
                    r2.execSQL(r12, r4)
                L_0x0198:
                    di3.d r2 = di3.C86312j.m106911c(r3)
                    sw1.p r2 = (sw1.C48483p) r2
                    com.tencent.mm.plugin.game.model.a0 r2 = r2.mo66079ar()
                    com.tencent.mm.plugin.game.model.w r4 = r2.mo65982k()
                    if (r4 != 0) goto L_0x01a9
                    goto L_0x01f5
                L_0x01a9:
                    r4.mo66075l2()
                    boolean r2 = r2.mo65985n(r4)
                    if (r2 == 0) goto L_0x01b3
                    goto L_0x01f5
                L_0x01b3:
                    com.tencent.mm.autogen.events.QueryGameMessageEvent$a r2 = r1.f107710d
                    com.tencent.mm.plugin.game.model.w$k r5 = r4.f113491q1
                    int r7 = r5.f113527a
                    r2.f107711a = r7
                    java.lang.String r7 = r4.field_appId
                    r2.f107712b = r7
                    java.lang.String r7 = r5.f113529c
                    r2.f107713c = r7
                    java.lang.String r7 = r5.f113528b
                    r2.f107714d = r7
                    int r7 = r5.f113530d
                    r2.f107715e = r7
                    int r7 = r5.f113531e
                    r2.f107716f = r7
                    int r7 = r4.f113470e2
                    r2.f107718h = r7
                    long r7 = r4.field_msgId
                    r2.f107719i = r7
                    java.lang.String r7 = r4.f113472f2
                    r2.f107720j = r7
                    boolean r5 = r5.f113532f
                    r2.f107717g = r5
                    com.tencent.mm.plugin.game.model.w$h r5 = r4.f113464Y1
                    boolean r5 = r5.f113520a
                    r2.f107722l = r5
                    int r5 = r4.field_exposuredCount
                    r2.f107723m = r5
                    int r5 = r4.field_channel
                    r2.f107724n = r5
                    long r7 = r4.field_receiveTime
                    r2.f107725o = r7
                    java.lang.String r4 = r4.field_gameMsgId
                    r2.f107726p = r4
                L_0x01f5:
                    com.tencent.mm.plugin.game.GameEventListener r2 = com.tencent.p014mm.plugin.game.GameEventListener.this
                    com.tencent.mm.autogen.events.QueryGameMessageEvent$a r4 = r1.f107710d
                    long r4 = r4.f107719i
                    r7 = 0
                    int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                    if (r9 == 0) goto L_0x0202
                    goto L_0x0203
                L_0x0202:
                    r6 = 0
                L_0x0203:
                    com.tencent.p014mm.plugin.game.GameEventListener.m45009d(r2, r6)
                    com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r1.f107710d
                    long r1 = r1.f107719i
                    int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                    if (r4 != 0) goto L_0x02bd
                    di3.d r1 = di3.C86312j.m106911c(r3)
                    sw1.p r1 = (sw1.C48483p) r1
                    com.tencent.mm.plugin.game.model.a0 r1 = r1.mo66079ar()
                    com.tencent.mm.plugin.game.model.w r2 = r1.mo65983l()
                    if (r2 == 0) goto L_0x0229
                    boolean r2 = r1.mo65987p(r2)
                    if (r2 == 0) goto L_0x0229
                    com.tencent.mm.plugin.game.model.a0$a r2 = com.tencent.p014mm.plugin.game.model.C42036a0.C42037a.GAME_REDDOT_EXIT_TIMEOUT
                    r1.mo65977f(r2)
                L_0x0229:
                    com.tencent.mm.plugin.game.GameEventListener r1 = com.tencent.p014mm.plugin.game.GameEventListener.this
                    com.tencent.p014mm.plugin.game.GameEventListener.m45010q(r1)
                    goto L_0x02bd
                L_0x0230:
                    com.tencent.mm.plugin.game.GameEventListener r1 = com.tencent.p014mm.plugin.game.GameEventListener.this
                    r2 = 0
                    com.tencent.p014mm.plugin.game.GameEventListener.m45009d(r1, r2)
                    com.tencent.mm.plugin.game.GameEventListener r1 = com.tencent.p014mm.plugin.game.GameEventListener.this
                    com.tencent.p014mm.plugin.game.GameEventListener.m45010q(r1)
                    goto L_0x02bd
                L_0x023d:
                    com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r1.f107710d
                    java.lang.String r1 = r1.f107721k
                    if (r1 == 0) goto L_0x02bd
                    java.lang.String r2 = "//gamemsg:"
                    boolean r2 = r1.startsWith(r2)
                    if (r2 == 0) goto L_0x02bd
                    te3.j3 r2 = new te3.j3
                    r2.<init>()
                    java.lang.String r3 = r1.substring(r5)
                    te3.rv3 r3 = sf0.C48374j0.m53720i(r3)
                    r2.f227631h = r3
                    java.lang.String r1 = r1.substring(r5)
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                    if (r2 != 0) goto L_0x02bd
                    java.lang.String r2 = "jumpnative"
                    boolean r2 = r1.equals(r2)
                    r3 = 0
                    java.lang.String r4 = "game"
                    if (r2 == 0) goto L_0x0283
                    android.content.Intent r1 = new android.content.Intent
                    r1.<init>()
                    java.lang.String r2 = "from_find_more_friend"
                    r1.putExtra(r2, r6)
                    android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    java.lang.String r5 = ".ui.tab.GameRouteUI"
                    ke3.C88144b.m109791i(r2, r4, r5, r1, r3)
                    goto L_0x02bd
                L_0x0283:
                    java.lang.String r2 = "jumpLibrary"
                    boolean r2 = r1.equals(r2)
                    if (r2 == 0) goto L_0x029a
                    android.content.Intent r1 = new android.content.Intent
                    r1.<init>()
                    android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    java.lang.String r5 = ".ui.GameLibraryUI"
                    ke3.C88144b.m109791i(r2, r4, r5, r1, r3)
                    goto L_0x02bd
                L_0x029a:
                    java.lang.String r2 = "jumpDetail:"
                    boolean r2 = r1.contains(r2)
                    if (r2 == 0) goto L_0x02bd
                    int r2 = r1.length()
                    java.lang.String r1 = r1.substring(r8, r2)
                    android.content.Intent r2 = new android.content.Intent
                    r2.<init>()
                    java.lang.String r5 = "game_app_id"
                    r2.putExtra(r5, r1)
                    android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    java.lang.String r5 = ".ui.GameDetailUI2"
                    ke3.C88144b.m109791i(r1, r4, r5, r2, r3)
                L_0x02bd:
                    r1 = 0
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.GameEventListener.C416694.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f112109n = new IListener<GameCenterOperationEvent>(this, fVar) {
            {
                this.__eventId = -1149286806;
            }

            public boolean callback(IEvent iEvent) {
                GameCenterOperationEvent gameCenterOperationEvent = (GameCenterOperationEvent) iEvent;
                GameCenterOperationEvent.C40104a aVar = gameCenterOperationEvent.f107543d;
                int i = aVar.f107544a;
                if (i == 1) {
                    C42046d.m45752k(aVar.f107545b, aVar.f107546c, aVar.f107547d, aVar.f107548e, (C44580q1) null);
                    GameCenterOperationEvent.C40104a aVar2 = gameCenterOperationEvent.f107543d;
                    Context context = aVar2.f107545b;
                    int i2 = aVar2.f107549f;
                    C40314g.m43487f(context, i2, i2, 1, 3, aVar2.f107546c, 0, (String) null);
                } else if (i == 2) {
                    int i3 = aVar.f107549f;
                    String str = aVar.f107550g;
                    Log.m105925i("MicroMsg.GameEventListener", "scene = %d, extinfo = %s", Integer.valueOf(i3), str);
                    Bundle bundle = new Bundle();
                    bundle.putInt("game_report_from_scene", i3);
                    bundle.putCharSequence("game_app_id", gameCenterOperationEvent.f107543d.f107546c);
                    bundle.putCharSequence("game_report_extra_click_extinfo", str);
                    GameCenterOperationEvent.C40104a aVar3 = gameCenterOperationEvent.f107543d;
                    int n = C52642c.m58996n(aVar3.f107545b, aVar3.f107546c, (String) null, bundle, aVar3.f107549f);
                    GameCenterOperationEvent.C40104a aVar4 = gameCenterOperationEvent.f107543d;
                    Context context2 = aVar4.f107545b;
                    int i4 = aVar4.f107549f;
                    C40314g.m43487f(context2, i4, i4, 1, n, aVar4.f107546c, 0, (String) null);
                } else if (i == 3) {
                    boolean z = C42116v.f113431e;
                    if (!(System.currentTimeMillis() - ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_SEARCH_LIST_UPDATE_TIME_LONG, 0L)).longValue() > 86400000)) {
                        Log.m105924i("MicroMsg.GameListUpdater", "No need to update");
                    } else if (C42116v.f113431e) {
                        Log.m105920e("MicroMsg.GameListUpdater", "Already running");
                    } else {
                        C42116v.f113433g = new MMHandler("GameListUpdate");
                        C42116v.f113432f.clear();
                        C42116v vVar = new C42116v();
                        C86709a0.m107524d().mo123455a(1215, vVar);
                        C86709a0.m107524d().mo123460f(new C42147y0(vVar.f113434d, 20));
                        C42116v.f113431e = true;
                    }
                } else if (i == 5) {
                    C42114u.m45828e(((C48483p) C86312j.m106911c(C48483p.class)).mo66079ar().mo65981j(), aVar.f107549f, 2);
                }
                return false;
            }
        };
        this.f112110o = new IListener<GameJsApiCommandEvent>(this, fVar) {
            {
                this.__eventId = -1855576386;
            }

            public boolean callback(IEvent iEvent) {
                String str;
                GameJsApiCommandEvent gameJsApiCommandEvent = (GameJsApiCommandEvent) iEvent;
                C72994y1.C72995a aVar = C72994y1.C72995a.GAME_GIFT_ENTRANCE_MSGID_LONG_SYNC;
                Class cls = C48483p.class;
                Class cls2 = C48484q.class;
                GameJsApiCommandEvent.C1076a aVar2 = gameJsApiCommandEvent.f9284d;
                int i = aVar2.f9286a;
                if (i == 1) {
                    String str2 = aVar2.f9287b;
                    new LinkedList();
                    if (str2 != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            int i2 = Util.getInt(jSONObject.optString("type"), 0);
                            int i3 = Util.getInt(jSONObject.optString("limit"), 0);
                            long j = Util.getLong(jSONObject.optString("lastLocalId"), -1);
                            int i4 = Util.getInt(jSONObject.optString("isUnread"), -1);
                            if (i3 > 0 && i3 <= 10000 && j >= 0) {
                                if (i4 >= 0) {
                                    LinkedList<C42119w> mI = ((C48484q) C86312j.m106911c(cls2)).xi0().mo66009mI(i2, j, i4, i3);
                                    if (!Util.isNullOrNil((List) mI)) {
                                        JSONArray jSONArray = new JSONArray();
                                        Iterator<C42119w> it = mI.iterator();
                                        while (it.hasNext()) {
                                            C42119w next = it.next();
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put(C66261f3.COL_LOCALID, next.field_msgId);
                                            jSONObject2.put("content", next.field_rawXML);
                                            jSONArray.put(jSONObject2);
                                        }
                                        gameJsApiCommandEvent.f9285e.f9288a = jSONArray.toString();
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            Log.m105929w("MicroMsg.GameJsapiProcessor", "JSONException : %s", e.getMessage());
                            return false;
                        }
                    }
                } else if (i == 2) {
                    String str3 = aVar2.f9287b;
                    Log.m105919d("MicroMsg.GameJsapiProcessor", "writeMsg param=%s", str3);
                    if (str3 != null) {
                        try {
                            JSONObject jSONObject3 = new JSONObject(str3);
                            if (!jSONObject3.isNull("type")) {
                                if (Util.getInt(jSONObject3.optString("type"), 0) != 0) {
                                    if (Util.getInt(jSONObject3.optString("type"), 0) == 65536) {
                                        ((C48484q) C86312j.m106911c(cls2)).xi0().execSQL("GameRawMessage", "update GameRawMessage set isRead=1 where 1=1");
                                    }
                                }
                            }
                            new JSONArray();
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("localIdList");
                            int length = jSONArray2.length();
                            long[] jArr = new long[length];
                            for (int i5 = 0; i5 < length; i5++) {
                                jArr[i5] = jSONArray2.getLong(i5);
                            }
                            ((C48484q) C86312j.m106911c(cls2)).xi0().mo65998LL(jArr);
                        } catch (JSONException e2) {
                            Log.m105929w("MicroMsg.GameJsapiProcessor", "JSONException : %s", e2.getMessage());
                        }
                    }
                } else if (i == 3) {
                    C42119w g = ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65978g();
                    if (g != null) {
                        gameJsApiCommandEvent.f9285e.f9288a = g.field_rawXML;
                    }
                } else if (i == 4) {
                    ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65974c();
                } else if (i == 9) {
                    ((C48483p) C86312j.m106911c(cls)).mo66079ar().getClass();
                    C42119w Ow = ((C48484q) C86312j.m106911c(cls2)).xi0().mo66000Ow(((Long) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0L)).longValue());
                    if (Ow != null) {
                        gameJsApiCommandEvent.f9285e.f9288a = Ow.field_rawXML;
                    }
                } else if (i == 10) {
                    ((C48483p) C86312j.m106911c(cls)).mo66079ar().getClass();
                    if (((C48484q) C86312j.m106911c(cls2)).xi0().mo66000Ow(((Long) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0L)).longValue()) != null) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, 0L);
                    }
                } else if (i == 12) {
                    String str4 = aVar2.f9287b;
                    Log.m105919d("MicroMsg.GameJsapiProcessor", "deleteMessage param=%s", str4);
                    if (str4 != null) {
                        try {
                            JSONObject jSONObject4 = new JSONObject(str4);
                            if (jSONObject4.optBoolean("deleteAll", false)) {
                                ((C48484q) C86312j.m106911c(cls2)).xi0().execSQL("GameRawMessage", "delete from GameRawMessage");
                            } else {
                                JSONArray optJSONArray = jSONObject4.optJSONArray("localIdList");
                                if (optJSONArray != null) {
                                    int length2 = optJSONArray.length();
                                    long[] jArr2 = new long[length2];
                                    for (int i6 = 0; i6 < length2; i6++) {
                                        jArr2[i6] = optJSONArray.getLong(i6);
                                    }
                                    ((C48484q) C86312j.m106911c(cls2)).xi0().mo65999Lo(jArr2);
                                }
                            }
                        } catch (JSONException e3) {
                            Log.m105929w("MicroMsg.GameJsapiProcessor", "JSONException : %s", e3.getMessage());
                        }
                    }
                } else if (i == 13 && (str = aVar2.f9287b) != null) {
                    try {
                        JSONArray optJSONArray2 = new JSONObject(str).optJSONArray("msgIdList");
                        if (optJSONArray2 != null) {
                            JSONObject jSONObject5 = new JSONObject();
                            int length3 = optJSONArray2.length();
                            for (int i7 = 0; i7 < length3; i7++) {
                                String string = optJSONArray2.getString(i7);
                                if (!Util.isNullOrNil(string)) {
                                    C42119w bD = ((C48484q) C86312j.m106911c(cls2)).xi0().mo66004bD(string);
                                    if (bD != null) {
                                        bD.mo66075l2();
                                        jSONObject5.put(string, C52642c.m58995m(bD.f113463X1.f113573q));
                                    }
                                }
                            }
                            gameJsApiCommandEvent.f9285e.f9288a = jSONObject5.toString();
                        }
                    } catch (JSONException e4) {
                        Log.m105929w("MicroMsg.GameJsapiProcessor", "JSONException : %s", e4.getMessage());
                    }
                }
                return false;
            }
        };
        this.f112111p = new IListener<OpenGameCenterEvent>(this, fVar) {
            {
                this.__eventId = 2000383001;
            }

            public boolean callback(IEvent iEvent) {
                OpenGameCenterEvent openGameCenterEvent = (OpenGameCenterEvent) iEvent;
                JSONObject jSONObject = openGameCenterEvent.f9383d.f9384a;
                String optString = jSONObject.optString("viewName");
                if (optString.length() == 0) {
                    optString = jSONObject.optString("jumpView");
                    if (optString.length() == 0) {
                        optString = null;
                    } else if (optString.compareTo("0") == 0) {
                        optString = "MAIN_PAGE";
                    } else if (optString.compareTo("1") == 0) {
                        optString = "GAME_LIB";
                    } else if (optString.compareTo("2") == 0) {
                        optString = "GAME_DETAIL";
                    } else if (optString.compareTo("3") == 0) {
                        optString = "MSG_CENTER";
                    }
                }
                String optString2 = jSONObject.optString("openType");
                if (optString2.length() == 0) {
                    optString2 = jSONObject.optString("jumpType");
                }
                boolean z = (optString2.length() == 0 || optString2.compareTo("0") == 0 || optString2.compareTo("OPEN_DEFAULT") == 0 || (optString2.compareTo("1") != 0 && optString2.compareTo("OPEN_JUMP") != 0)) ? false : true;
                JSONObject optJSONObject = jSONObject.optJSONObject("extInfo");
                if (optJSONObject == null) {
                    String optString3 = jSONObject.optString("extInfo");
                    if (optString3.length() > 0) {
                        try {
                            optJSONObject = new JSONObject(optString3);
                        } catch (JSONException unused) {
                            Log.m105925i("MicroMsg.OpenGameJsapiProcessor", "extInfo parse error: %s", optString3);
                        }
                    }
                }
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                if (optString.compareTo("MSG_CENTER") == 0) {
                    try {
                        optJSONObject.put("msgId", jSONObject.optString("msgId"));
                        optJSONObject.put("msgTabType", jSONObject.optString("msgTabType"));
                    } catch (JSONException unused2) {
                    }
                }
                int i = Util.getInt(optJSONObject.optString(TPDownloadProxyEnum.USER_SSID), 0);
                if (optString.compareTo("MAIN_PAGE") == 0) {
                    Intent intent = new Intent();
                    if (z) {
                        intent.putExtra("jump_find_more_friends", "jump_find_more_friends");
                    }
                    intent.putExtra("game_report_from_scene", 5);
                    C88144b.m109791i(openGameCenterEvent.f9383d.f9385b, "game", ".ui.GameCenterUI", intent, (Bundle) null);
                    C40314g.m43484c(openGameCenterEvent.f9383d.f9385b, 5, 5, 1, 6, i, (String) null);
                    return false;
                } else if (optString.compareTo("GAME_LIB") == 0) {
                    Intent intent2 = new Intent();
                    if (z) {
                        intent2.putExtra("jump_game_center", "jump_game_center");
                    }
                    intent2.putExtra("game_report_from_scene", 5);
                    C88144b.m109791i(openGameCenterEvent.f9383d.f9385b, "game", ".ui.GameLibraryUI", intent2, (Bundle) null);
                    C40314g.m43484c(openGameCenterEvent.f9383d.f9385b, 5, 5, 1, 6, i, (String) null);
                    return false;
                } else if (optString.compareTo("GAME_DETAIL") == 0) {
                    Intent intent3 = new Intent();
                    String optString4 = optJSONObject.optString("appId");
                    if (Util.isNullOrNil(optString4)) {
                        return false;
                    }
                    intent3.putExtra("game_app_id", optString4);
                    if (z) {
                        intent3.putExtra("jump_game_center", "jump_game_center");
                    }
                    intent3.putExtra("game_report_from_scene", 5);
                    C88144b.m109791i(openGameCenterEvent.f9383d.f9385b, "game", ".ui.GameDetailUI", intent3, (Bundle) null);
                    C40314g.m43484c(openGameCenterEvent.f9383d.f9385b, 5, 5, 1, 6, i, (String) null);
                    return false;
                } else if (optString.compareTo("MSG_CENTER") == 0) {
                    Intent intent4 = new Intent();
                    boolean z2 = ((C52735e) C86312j.m106911c(C52735e.class)).mo61266Ad(C32735h.C32737c.clicfg_game_open_message_center_v2, 1) == 1;
                    String optString5 = optJSONObject.optString("msgId");
                    int optInt = optJSONObject.optInt("msgTabType", 0);
                    if (optInt == 1) {
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_ENTRANCE_MSG_TAB_TYPE_INT_SYNC, 1);
                    }
                    intent4.putExtra("game_report_from_scene", i);
                    intent4.putExtra("game_msg_ui_from_msgid", optString5);
                    intent4.putExtra("game_msg_center_tab_type", optInt);
                    if (!z2) {
                        C88144b.m109791i(openGameCenterEvent.f9383d.f9385b, "game", ".ui.GameMessageUI", intent4, (Bundle) null);
                    } else if (optInt == 2) {
                        C88144b.m109791i(openGameCenterEvent.f9383d.f9385b, "game", ".ui.message.GameMsgCenterUI", intent4, (Bundle) null);
                    } else {
                        C88144b.m109791i(openGameCenterEvent.f9383d.f9385b, "game", ".ui.chat_tab.ChatRoomTabUI", intent4, (Bundle) null);
                    }
                    C40314g.m43484c(openGameCenterEvent.f9383d.f9385b, 5, 5, 1, 6, i, (String) null);
                    return false;
                } else {
                    optString.compareTo("GAME_DOWNLOADER");
                    return false;
                }
            }
        };
        this.f112112q = new IListener<ReportGameCenterEvent>(this, fVar) {
            {
                this.__eventId = 944019439;
            }

            public boolean callback(IEvent iEvent) {
                ReportGameCenterEvent reportGameCenterEvent = (ReportGameCenterEvent) iEvent;
                Context context = MMApplicationContext.getContext();
                reportGameCenterEvent.f107747d.getClass();
                reportGameCenterEvent.f107747d.getClass();
                reportGameCenterEvent.f107747d.getClass();
                reportGameCenterEvent.f107747d.getClass();
                reportGameCenterEvent.f107747d.getClass();
                reportGameCenterEvent.f107747d.getClass();
                reportGameCenterEvent.f107747d.getClass();
                reportGameCenterEvent.f107747d.getClass();
                C40314g.m43485d(context, 0, 0, 1, 0, 0, (String) null, 0, 0, (String) null, (String) null, (String) null);
                return false;
            }
        };
        this.f112113r = new IListener<ReportMsgClickEvent>(this, fVar) {
            {
                this.__eventId = -1494271153;
            }

            public boolean callback(IEvent iEvent) {
                ReportMsgClickEvent reportMsgClickEvent = (ReportMsgClickEvent) iEvent;
                int i = reportMsgClickEvent.f193900d.f193908h;
                C52415a a = C52415a.m58668a();
                ReportMsgClickEvent.C67778a aVar = reportMsgClickEvent.f193900d;
                a.mo62982d(aVar.f193901a, aVar.f193902b, aVar.f193903c, aVar.f193904d, aVar.f193905e, aVar.f193907g, i, aVar.f193906f, aVar.f193909i, aVar.f193910j, aVar.f193911k, aVar.f193912l);
                return false;
            }
        };
        this.f112114s = new IListener<GameCommOperationEvent>(this, fVar) {
            {
                this.__eventId = 1471153505;
            }

            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r13) {
                /*
                    r12 = this;
                    com.tencent.mm.autogen.events.GameCommOperationEvent r13 = (com.tencent.p014mm.autogen.events.GameCommOperationEvent) r13
                    java.lang.String r0 = com.tencent.p014mm.plugin.game.model.C42059h.f113319a
                    java.lang.Class<sw1.q> r0 = sw1.C48484q.class
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r1 = r13.f9268d
                    int r1 = r1.f9270a
                    java.lang.String r2 = "MicroMsg.GameCommOpertionProcessor"
                    java.lang.String r3 = "cmd:%d"
                    r4 = 1
                    java.lang.Object[] r5 = new java.lang.Object[r4]
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
                    r7 = 0
                    r5[r7] = r6
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
                    r2 = 10001(0x2711, float:1.4014E-41)
                    if (r1 == r2) goto L_0x0549
                    r2 = 4
                    r3 = 2
                    switch(r1) {
                        case 1: goto L_0x01f9;
                        case 2: goto L_0x01c6;
                        case 3: goto L_0x0174;
                        case 4: goto L_0x00a2;
                        case 5: goto L_0x0091;
                        case 6: goto L_0x002d;
                        default: goto L_0x0024;
                    }
                L_0x0024:
                    r0 = 0
                    switch(r1) {
                        case 10003: goto L_0x0406;
                        case 10004: goto L_0x03d9;
                        case 10005: goto L_0x039a;
                        case 10006: goto L_0x02f8;
                        case 10007: goto L_0x021f;
                        default: goto L_0x0028;
                    }
                L_0x0028:
                    switch(r1) {
                        case 10010: goto L_0x0525;
                        case 10011: goto L_0x04db;
                        case 10012: goto L_0x04c3;
                        case 10013: goto L_0x0491;
                        default: goto L_0x002b;
                    }
                L_0x002b:
                    goto L_0x0570
                L_0x002d:
                    di3.d r13 = di3.C86312j.m106911c(r0)
                    sw1.q r13 = (sw1.C48484q) r13
                    com.tencent.mm.plugin.game.model.e0 r13 = r13.mo66106SL()
                    java.lang.String r1 = "cache_my_chatroom"
                    r13.mo57115Lo(r1)
                    di3.d r13 = di3.C86312j.m106911c(r0)
                    sw1.q r13 = (sw1.C48484q) r13
                    com.tencent.mm.plugin.game.model.e0 r13 = r13.mo66106SL()
                    java.lang.String r1 = "cache_chatroom_recommend"
                    r13.mo57115Lo(r1)
                    di3.d r13 = di3.C86312j.m106911c(r0)
                    sw1.q r13 = (sw1.C48484q) r13
                    com.tencent.mm.plugin.game.model.e0 r13 = r13.mo66106SL()
                    r13.getClass()
                    java.lang.String r1 = "delete from GamePBCache where key like 'cache_game_chat_msg#%'"
                    java.lang.String r2 = "GameHaowanMedia"
                    boolean r13 = r13.execSQL(r2, r1)
                    java.lang.Object[] r2 = new java.lang.Object[r3]
                    java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
                    r2[r7] = r13
                    r2[r4] = r1
                    java.lang.String r13 = "MicroMsg.GamePBCacheStorage"
                    java.lang.String r1 = "deleteDataWithPrefix, ret:%b, sql: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r2)
                    di3.d r13 = di3.C86312j.m106911c(r0)
                    sw1.q r13 = (sw1.C48484q) r13
                    com.tencent.mm.plugin.game.model.e0 r13 = r13.mo66106SL()
                    java.lang.String r1 = "memberVersion"
                    r13.mo57118jo(r1)
                    di3.d r13 = di3.C86312j.m106911c(r0)
                    sw1.q r13 = (sw1.C48484q) r13
                    com.tencent.mm.plugin.game.model.e0 r13 = r13.mo66106SL()
                    java.lang.String r0 = "updateTime"
                    r13.mo57118jo(r0)
                    goto L_0x0570
                L_0x0091:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r13 = r13.f9268d
                    java.lang.String r13 = r13.f9271b
                    int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r7)
                    com.tencent.mm.plugin.game.commlib.d r0 = com.tencent.p014mm.plugin.game.commlib.C30075d.m38954a()
                    r0.mo57102b(r4, r13)
                    goto L_0x0570
                L_0x00a2:
                    java.lang.String r0 = "MicroMsg.GameCommOpertionProcessor"
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r13 = r13.f9268d
                    java.lang.String r13 = r13.f9271b
                    boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                    if (r1 == 0) goto L_0x00b0
                    goto L_0x0570
                L_0x00b0:
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0164 }
                    r1.<init>(r13)     // Catch:{ JSONException -> 0x0164 }
                    java.lang.String r13 = "game_page_report_id"
                    java.lang.String r13 = r1.getString(r13)     // Catch:{ JSONException -> 0x0164 }
                    int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r7)     // Catch:{ JSONException -> 0x0164 }
                    java.lang.String r5 = "game_page_report_instantly"
                    boolean r5 = r1.getBoolean(r5)     // Catch:{ JSONException -> 0x0164 }
                    java.lang.String r6 = "game_page_report_format_data"
                    java.lang.String r6 = r1.optString(r6)     // Catch:{ JSONException -> 0x0164 }
                    java.lang.String r8 = "game_page_report_tabs_format_data"
                    java.lang.String r1 = r1.optString(r8)     // Catch:{ JSONException -> 0x0164 }
                    java.lang.String r8 = "reportGamePageTime, reportId:%d, reportInstantly:%b, reportFormatData:(%s), reportTabsFormatData(%s)"
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ JSONException -> 0x0164 }
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0164 }
                    r2[r7] = r9     // Catch:{ JSONException -> 0x0164 }
                    java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x0164 }
                    r2[r4] = r9     // Catch:{ JSONException -> 0x0164 }
                    r2[r3] = r6     // Catch:{ JSONException -> 0x0164 }
                    r3 = 3
                    r2[r3] = r1     // Catch:{ JSONException -> 0x0164 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r2)     // Catch:{ JSONException -> 0x0164 }
                    if (r13 != 0) goto L_0x00f2
                    java.lang.String r13 = "reportId format exception"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
                    goto L_0x0570
                L_0x00f2:
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                    if (r2 != 0) goto L_0x0118
                    if (r5 == 0) goto L_0x0111
                    u10.b r0 = new u10.b
                    r0.<init>()
                    r0.f146497a = r13
                    r0.f146498b = r6
                    u10.a r13 = u10.C52415a.m58668a()
                    com.tencent.mm.game.report.b r13 = (com.tencent.p014mm.game.report.C40304b) r13
                    r13.getClass()
                    com.tencent.p014mm.game.report.C40311f.m43479a(r0)
                    goto L_0x0570
                L_0x0111:
                    com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r0.kvStat(r13, r6)
                    goto L_0x0570
                L_0x0118:
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                    if (r2 != 0) goto L_0x0570
                    org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0154 }
                    r2.<init>(r1)     // Catch:{ JSONException -> 0x0154 }
                    r1 = 0
                L_0x0124:
                    int r3 = r2.length()     // Catch:{ JSONException -> 0x0154 }
                    if (r1 >= r3) goto L_0x0570
                    java.lang.String r3 = r2.getString(r1)     // Catch:{ JSONException -> 0x0154 }
                    boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ JSONException -> 0x0154 }
                    if (r6 != 0) goto L_0x0151
                    if (r5 == 0) goto L_0x014c
                    u10.b r6 = new u10.b     // Catch:{ JSONException -> 0x0154 }
                    r6.<init>()     // Catch:{ JSONException -> 0x0154 }
                    r6.f146497a = r13     // Catch:{ JSONException -> 0x0154 }
                    r6.f146498b = r3     // Catch:{ JSONException -> 0x0154 }
                    u10.a r3 = u10.C52415a.m58668a()     // Catch:{ JSONException -> 0x0154 }
                    com.tencent.mm.game.report.b r3 = (com.tencent.p014mm.game.report.C40304b) r3     // Catch:{ JSONException -> 0x0154 }
                    r3.getClass()     // Catch:{ JSONException -> 0x0154 }
                    com.tencent.p014mm.game.report.C40311f.m43479a(r6)     // Catch:{ JSONException -> 0x0154 }
                    goto L_0x0151
                L_0x014c:
                    com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ JSONException -> 0x0154 }
                    r6.kvStat(r13, r3)     // Catch:{ JSONException -> 0x0154 }
                L_0x0151:
                    int r1 = r1 + 1
                    goto L_0x0124
                L_0x0154:
                    r13 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r4]
                    java.lang.String r13 = r13.getMessage()
                    r1[r7] = r13
                    java.lang.String r13 = "reportGamePageTime, err2:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r1)
                    goto L_0x0570
                L_0x0164:
                    r13 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r4]
                    java.lang.String r13 = r13.getMessage()
                    r1[r7] = r13
                    java.lang.String r13 = "reportGamePageTime, err1:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r1)
                    goto L_0x0570
                L_0x0174:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r1 = r13.f9268d
                    java.lang.String r1 = r1.f9271b
                    java.lang.Object[] r2 = new java.lang.Object[r4]
                    r2[r7] = r1
                    java.lang.String r3 = "MicroMsg.GameCommOpertionProcessor"
                    java.lang.String r5 = "get hv menu! appid:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                    if (r2 == 0) goto L_0x018b
                    goto L_0x0570
                L_0x018b:
                    di3.d r0 = di3.C86312j.m106911c(r0)
                    sw1.q r0 = (sw1.C48484q) r0
                    com.tencent.mm.plugin.game.model.e0 r0 = r0.mo66106SL()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r5 = "pb_game_hv_menu_"
                    r2.append(r5)
                    r2.append(r1)
                    java.lang.String r2 = r2.toString()
                    byte[] r0 = r0.mo57116Rz(r2)
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
                    if (r2 != 0) goto L_0x0570
                    java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0570 }
                    java.lang.String r5 = "ISO-8859-1"
                    r2.<init>(r0, r5)     // Catch:{ UnsupportedEncodingException -> 0x0570 }
                    com.tencent.mm.autogen.events.GameCommOperationEvent$b r13 = r13.f9269e     // Catch:{ UnsupportedEncodingException -> 0x0570 }
                    r13.f9273a = r2     // Catch:{ UnsupportedEncodingException -> 0x0570 }
                    java.lang.String r13 = "get hv menu success! appid:%s"
                    java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ UnsupportedEncodingException -> 0x0570 }
                    r0[r7] = r1     // Catch:{ UnsupportedEncodingException -> 0x0570 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r0)     // Catch:{ UnsupportedEncodingException -> 0x0570 }
                    goto L_0x0570
                L_0x01c6:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r13 = r13.f9268d
                    java.lang.String r13 = r13.f9271b
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    r0[r7] = r13
                    java.lang.String r1 = "MicroMsg.GameCommOpertionProcessor"
                    java.lang.String r2 = "update hv menu! appid:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                    if (r0 == 0) goto L_0x01dd
                    goto L_0x0570
                L_0x01dd:
                    ob0.b0 r0 = f40.C86709a0.m107524d()
                    r1 = 1369(0x559, float:1.918E-42)
                    com.tencent.mm.plugin.game.model.f r2 = new com.tencent.mm.plugin.game.model.f
                    r2.<init>(r13)
                    r0.mo123455a(r1, r2)
                    com.tencent.mm.plugin.game.model.x0 r0 = new com.tencent.mm.plugin.game.model.x0
                    r0.<init>(r13)
                    ob0.b0 r13 = f40.C86709a0.m107524d()
                    r13.mo123460f(r0)
                    goto L_0x0570
                L_0x01f9:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r0 = r13.f9268d
                    android.content.Context r0 = r0.f9272c
                    if (r0 != 0) goto L_0x0201
                    goto L_0x0570
                L_0x0201:
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    com.tencent.mm.plugin.game.ui.GameRegionPreference$a r0 = com.tencent.p014mm.plugin.game.model.C42046d.m45748g(r0)
                    if (r0 == 0) goto L_0x0215
                    java.lang.String r0 = com.tencent.p014mm.plugin.game.model.C42046d.m45750i(r0)     // Catch:{ JSONException -> 0x0215 }
                    java.lang.String r2 = "gameRegionName"
                    r1.put(r2, r0)     // Catch:{ JSONException -> 0x0215 }
                L_0x0215:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$b r13 = r13.f9269e
                    java.lang.String r0 = r1.toString()
                    r13.f9273a = r0
                    goto L_0x0570
                L_0x021f:
                    java.lang.String r0 = "weixin://bgmixid/"
                    org.json.JSONArray r1 = new org.json.JSONArray
                    r1.<init>()
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r2 = r13.f9268d
                    java.lang.String r2 = r2.f9271b
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                    java.lang.String r5 = "MicroMsg.GameCommOpertionProcessor"
                    if (r2 != 0) goto L_0x02db
                    java.lang.Object[] r2 = new java.lang.Object[r4]
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r6 = r13.f9268d
                    java.lang.String r6 = r6.f9271b
                    r2[r7] = r6
                    java.lang.String r6 = "checkMediaLocalIds params:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r2)
                    org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02db }
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r6 = r13.f9268d     // Catch:{ JSONException -> 0x02db }
                    java.lang.String r6 = r6.f9271b     // Catch:{ JSONException -> 0x02db }
                    r2.<init>(r6)     // Catch:{ JSONException -> 0x02db }
                    r6 = 0
                L_0x024a:
                    int r8 = r2.length()     // Catch:{ JSONException -> 0x02db }
                    if (r6 >= r8) goto L_0x02db
                    java.lang.String r8 = r2.getString(r6)     // Catch:{ JSONException -> 0x02db }
                    com.tencent.mm.plugin.webview.model.m1 r9 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Ax0()     // Catch:{ JSONException -> 0x02db }
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem r9 = r9.mo7010b(r8)     // Catch:{ JSONException -> 0x02db }
                    if (r9 == 0) goto L_0x027a
                    java.lang.String r10 = r9.f283024g     // Catch:{ JSONException -> 0x02db }
                    boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)     // Catch:{ JSONException -> 0x02db }
                    if (r10 == 0) goto L_0x027a
                    java.lang.String r10 = r9.f283023f     // Catch:{ JSONException -> 0x02db }
                    boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ JSONException -> 0x02db }
                    if (r10 != 0) goto L_0x0276
                    java.lang.String r9 = r9.f283023f     // Catch:{ JSONException -> 0x02db }
                    boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)     // Catch:{ JSONException -> 0x02db }
                    if (r9 == 0) goto L_0x027a
                L_0x0276:
                    r1.put(r4)     // Catch:{ JSONException -> 0x02db }
                    goto L_0x02d7
                L_0x027a:
                    boolean r9 = r8.startsWith(r0)     // Catch:{ JSONException -> 0x02db }
                    if (r9 == 0) goto L_0x02ca
                    java.lang.String r9 = ""
                    java.lang.String r8 = r8.replace(r0, r9)     // Catch:{ JSONException -> 0x02db }
                    java.lang.Class<rw.o> r9 = p232rw.C101476o.class
                    di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ JSONException -> 0x02db }
                    rw.o r9 = (p232rw.C101476o) r9     // Catch:{ JSONException -> 0x02db }
                    zg2.e r8 = r9.mo140776Ie(r8)     // Catch:{ JSONException -> 0x02db }
                    if (r8 == 0) goto L_0x02c6
                    int r9 = r8.getStatus()     // Catch:{ JSONException -> 0x02db }
                    if (r9 != r3) goto L_0x02b4
                    te3.gb0 r8 = r8.mo74365p0()     // Catch:{ JSONException -> 0x02db }
                    if (r8 == 0) goto L_0x02c6
                    java.lang.String r9 = r8.f298299o     // Catch:{ JSONException -> 0x02db }
                    boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)     // Catch:{ JSONException -> 0x02db }
                    if (r9 == 0) goto L_0x02c6
                    java.lang.String r8 = r8.f298300p     // Catch:{ JSONException -> 0x02db }
                    boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ JSONException -> 0x02db }
                    if (r8 == 0) goto L_0x02c6
                    r1.put(r4)     // Catch:{ JSONException -> 0x02db }
                    goto L_0x02d7
                L_0x02b4:
                    te3.gb0 r8 = r8.mo74365p0()     // Catch:{ JSONException -> 0x02db }
                    if (r8 == 0) goto L_0x02c6
                    java.lang.String r8 = r8.f298298n     // Catch:{ JSONException -> 0x02db }
                    boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ JSONException -> 0x02db }
                    if (r8 == 0) goto L_0x02c6
                    r1.put(r4)     // Catch:{ JSONException -> 0x02db }
                    goto L_0x02d7
                L_0x02c6:
                    r1.put(r7)     // Catch:{ JSONException -> 0x02db }
                    goto L_0x02d7
                L_0x02ca:
                    boolean r8 = com.tencent.p014mm.plugin.game.model.C42059h.m45764b(r8)     // Catch:{ JSONException -> 0x02db }
                    if (r8 == 0) goto L_0x02d4
                    r1.put(r4)     // Catch:{ JSONException -> 0x02db }
                    goto L_0x02d7
                L_0x02d4:
                    r1.put(r7)     // Catch:{ JSONException -> 0x02db }
                L_0x02d7:
                    int r6 = r6 + 1
                    goto L_0x024a
                L_0x02db:
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r2 = "result"
                    r0.put(r2, r1)     // Catch:{ JSONException -> 0x02e5 }
                L_0x02e5:
                    java.lang.String r0 = r0.toString()
                    java.lang.Object[] r1 = new java.lang.Object[r4]
                    r1[r7] = r0
                    java.lang.String r2 = "checkMediaLocalIds result:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
                    com.tencent.mm.autogen.events.GameCommOperationEvent$b r13 = r13.f9269e
                    r13.f9273a = r0
                    goto L_0x0570
                L_0x02f8:
                    java.lang.Class<nx1.b> r1 = nx1.C47305b.class
                    org.json.JSONArray r3 = new org.json.JSONArray
                    r3.<init>()
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r5 = r13.f9268d
                    java.lang.String r5 = r5.f9271b
                    boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                    java.lang.String r6 = "MicroMsg.GameCommOpertionProcessor"
                    if (r5 != 0) goto L_0x037d
                    java.lang.Object[] r5 = new java.lang.Object[r4]
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r8 = r13.f9268d
                    java.lang.String r8 = r8.f9271b
                    r5[r7] = r8
                    java.lang.String r8 = "saveMediaLocalIds params:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r5)
                    org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x037d }
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r8 = r13.f9268d     // Catch:{ JSONException -> 0x037d }
                    java.lang.String r8 = r8.f9271b     // Catch:{ JSONException -> 0x037d }
                    r5.<init>(r8)     // Catch:{ JSONException -> 0x037d }
                    r8 = 0
                L_0x0322:
                    int r9 = r5.length()     // Catch:{ JSONException -> 0x037d }
                    if (r8 >= r9) goto L_0x037d
                    java.lang.String r9 = r5.getString(r8)     // Catch:{ JSONException -> 0x037d }
                    com.tencent.mm.plugin.webview.model.m1 r10 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Ax0()     // Catch:{ JSONException -> 0x037d }
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem r10 = r10.mo7010b(r9)     // Catch:{ JSONException -> 0x037d }
                    if (r10 != 0) goto L_0x033a
                    r3.put(r7)     // Catch:{ JSONException -> 0x037d }
                    goto L_0x037a
                L_0x033a:
                    int r11 = r10.f283028n     // Catch:{ JSONException -> 0x037d }
                    if (r11 != r4) goto L_0x0349
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem r10 = (com.tencent.p014mm.plugin.webview.model.WebViewJSSDKImageItem) r10     // Catch:{ JSONException -> 0x037d }
                    org.json.JSONObject r10 = r10.mo6979a()     // Catch:{ JSONException -> 0x037d }
                    java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x037d }
                    goto L_0x0357
                L_0x0349:
                    if (r11 != r2) goto L_0x0356
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem r10 = (com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem) r10     // Catch:{ JSONException -> 0x037d }
                    org.json.JSONObject r10 = r10.mo6979a()     // Catch:{ JSONException -> 0x037d }
                    java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x037d }
                    goto L_0x0357
                L_0x0356:
                    r10 = r0
                L_0x0357:
                    boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ JSONException -> 0x037d }
                    if (r11 != 0) goto L_0x0377
                    di3.d r11 = di3.C86312j.m106911c(r1)     // Catch:{ JSONException -> 0x037d }
                    nx1.b r11 = (nx1.C47305b) r11     // Catch:{ JSONException -> 0x037d }
                    r11.q60(r9)     // Catch:{ JSONException -> 0x037d }
                    di3.d r11 = di3.C86312j.m106911c(r1)     // Catch:{ JSONException -> 0x037d }
                    nx1.b r11 = (nx1.C47305b) r11     // Catch:{ JSONException -> 0x037d }
                    byte[] r10 = r10.getBytes()     // Catch:{ JSONException -> 0x037d }
                    r11.mo57104im(r9, r10)     // Catch:{ JSONException -> 0x037d }
                    r3.put(r4)     // Catch:{ JSONException -> 0x037d }
                    goto L_0x037a
                L_0x0377:
                    r3.put(r7)     // Catch:{ JSONException -> 0x037d }
                L_0x037a:
                    int r8 = r8 + 1
                    goto L_0x0322
                L_0x037d:
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r1 = "result"
                    r0.put(r1, r3)     // Catch:{ JSONException -> 0x0387 }
                L_0x0387:
                    java.lang.String r0 = r0.toString()
                    java.lang.Object[] r1 = new java.lang.Object[r4]
                    r1[r7] = r0
                    java.lang.String r2 = "saveMediaLocalIds result:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
                    com.tencent.mm.autogen.events.GameCommOperationEvent$b r13 = r13.f9269e
                    r13.f9273a = r0
                    goto L_0x0570
                L_0x039a:
                    java.lang.String r0 = com.tencent.p014mm.plugin.game.model.C42046d.m45742a()
                    boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    if (r1 != 0) goto L_0x0570
                    java.lang.String r1 = ","
                    java.lang.String[] r0 = r0.split(r1)
                    org.json.JSONArray r1 = new org.json.JSONArray
                    r1.<init>()
                    int r2 = r0.length
                    r3 = 0
                L_0x03b1:
                    if (r3 >= r2) goto L_0x03c5
                    r4 = r0[r3]
                    boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                    if (r5 != 0) goto L_0x03c2
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r1.put(r4)
                L_0x03c2:
                    int r3 = r3 + 1
                    goto L_0x03b1
                L_0x03c5:
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r2 = "basic_type"
                    r0.put(r2, r1)     // Catch:{ JSONException -> 0x03cf }
                L_0x03cf:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$b r13 = r13.f9269e
                    java.lang.String r0 = r0.toString()
                    r13.f9273a = r0
                    goto L_0x0570
                L_0x03d9:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r0 = r13.f9268d
                    java.lang.String r0 = r0.f9271b
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    if (r0 == 0) goto L_0x03e5
                    goto L_0x0570
                L_0x03e5:
                    org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{  }
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r13 = r13.f9268d     // Catch:{  }
                    java.lang.String r13 = r13.f9271b     // Catch:{  }
                    r0.<init>(r13)     // Catch:{  }
                    java.lang.String r13 = "basic_type"
                    int r13 = r0.optInt(r13)     // Catch:{  }
                    java.lang.String r1 = "ban"
                    boolean r0 = r0.optBoolean(r1)     // Catch:{  }
                    if (r0 == 0) goto L_0x0401
                    com.tencent.p014mm.plugin.game.model.C42046d.m45756o(r13)     // Catch:{  }
                    goto L_0x0570
                L_0x0401:
                    com.tencent.p014mm.plugin.game.model.C42046d.m45753l(r13)     // Catch:{  }
                    goto L_0x0570
                L_0x0406:
                    ly1.d r1 = new ly1.d
                    r1.<init>()
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r2 = r13.f9268d
                    java.lang.String r2 = r2.f9271b
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                    if (r2 != 0) goto L_0x0427
                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0424 }
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r3 = r13.f9268d     // Catch:{ JSONException -> 0x0424 }
                    java.lang.String r3 = r3.f9271b     // Catch:{ JSONException -> 0x0424 }
                    r2.<init>(r3)     // Catch:{ JSONException -> 0x0424 }
                    java.lang.String r3 = "albumInfos"
                    org.json.JSONArray r0 = r2.optJSONArray(r3)     // Catch:{ JSONException -> 0x0424 }
                L_0x0424:
                    r1.mo139081h(r0)
                L_0x0427:
                    com.tencent.mm.ipcinvoker.type.IPCString r0 = new com.tencent.mm.ipcinvoker.type.IPCString
                    r0.<init>()
                    int r2 = r1.mo139080f()
                    vw1.g r3 = new vw1.g
                    r3.<init>()
                    java.lang.String r4 = r1.f292275h
                    r3.f147978d = r4
                    ob0.c$b r4 = new ob0.c$b
                    r4.<init>()
                    java.lang.String r5 = "/cgi-bin/mmgame-bin/checkuserifhasnewvideo"
                    r4.f127068c = r5
                    r5 = 3911(0xf47, float:5.48E-42)
                    r4.f127069d = r5
                    r4.f127066a = r3
                    vw1.h r3 = new vw1.h
                    r3.<init>()
                    r4.f127067b = r3
                    java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r3 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
                    di3.d r3 = di3.C86312j.m106911c(r3)
                    com.tencent.mm.ipcinvoker.wx_extension.j r3 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r3
                    ob0.c r4 = r4.mo72403a()
                    ly1.e r5 = new ly1.e
                    r5.<init>(r1, r2, r0)
                    r3.mo63014eH(r4, r5)
                    java.lang.Object r2 = r1.f292268a
                    monitor-enter(r2)
                    java.lang.Object r1 = r1.f292268a     // Catch:{ InterruptedException -> 0x046e }
                    r1.wait()     // Catch:{ InterruptedException -> 0x046e }
                    goto L_0x0478
                L_0x046c:
                    r13 = move-exception
                    goto L_0x048f
                L_0x046e:
                    r1 = move-exception
                    java.lang.String r3 = "MicroMsg.GameHaowanDataCenter"
                    java.lang.String r4 = ""
                    java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x046c }
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r4, r5)     // Catch:{ all -> 0x046c }
                L_0x0478:
                    monitor-exit(r2)     // Catch:{ all -> 0x046c }
                    java.lang.String r0 = r0.f10315d
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    java.lang.String r2 = "newVideoDesc"
                    r1.put(r2, r0)     // Catch:{ JSONException -> 0x0485 }
                L_0x0485:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$b r13 = r13.f9269e
                    java.lang.String r0 = r1.toString()
                    r13.f9273a = r0
                    goto L_0x0570
                L_0x048f:
                    monitor-exit(r2)     // Catch:{ all -> 0x046c }
                    throw r13
                L_0x0491:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r0 = r13.f9268d
                    java.lang.String r0 = r0.f9271b
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    if (r0 == 0) goto L_0x049d
                    goto L_0x0570
                L_0x049d:
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.Class<v10.e> r1 = v10.C52735e.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    v10.e r1 = (v10.C52735e) r1
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r2 = r13.f9268d
                    java.lang.String r2 = r2.f9271b
                    java.lang.String r3 = ""
                    java.lang.String r1 = r1.mo61268F5(r2, r3)
                    java.lang.String r2 = "exp_info"
                    r0.put(r2, r1)     // Catch:{ JSONException -> 0x04b9 }
                L_0x04b9:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$b r13 = r13.f9269e
                    java.lang.String r0 = r0.toString()
                    r13.f9273a = r0
                    goto L_0x0570
                L_0x04c3:
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                    java.lang.String r1 = "isExDevice"
                    boolean r2 = eb0.C75592q0.m90795y()     // Catch:{ JSONException -> 0x04d1 }
                    r0.put(r1, r2)     // Catch:{ JSONException -> 0x04d1 }
                L_0x04d1:
                    java.lang.String r0 = r0.toString()
                    com.tencent.mm.autogen.events.GameCommOperationEvent$b r13 = r13.f9269e
                    r13.f9273a = r0
                    goto L_0x0570
                L_0x04db:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r0 = r13.f9268d
                    java.lang.String r0 = r0.f9271b
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    if (r0 == 0) goto L_0x04e7
                    goto L_0x0570
                L_0x04e7:
                    org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{  }
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r13 = r13.f9268d     // Catch:{  }
                    java.lang.String r13 = r13.f9271b     // Catch:{  }
                    r0.<init>(r13)     // Catch:{  }
                    java.lang.String r13 = "appid"
                    java.lang.String r13 = r0.optString(r13)     // Catch:{  }
                    java.lang.String r1 = "version"
                    int r0 = r0.optInt(r1)     // Catch:{  }
                    java.lang.String r1 = "MicroMsg.GameCommOpertionProcessor"
                    java.lang.String r2 = "updateAppInfo, appid:%s, version:%d"
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
                    r3[r7] = r13     // Catch:{  }
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{  }
                    r3[r4] = r5     // Catch:{  }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{  }
                    boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)     // Catch:{  }
                    if (r1 == 0) goto L_0x0514
                    goto L_0x0570
                L_0x0514:
                    if (r0 != 0) goto L_0x0519
                    r0 = 2147483647(0x7fffffff, float:NaN)
                L_0x0519:
                    java.lang.Class<ym.l> r1 = p763ym.C79138l.class
                    di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{  }
                    ym.l r1 = (p763ym.C79138l) r1     // Catch:{  }
                    r1.mo74003UV(r13, r0)     // Catch:{  }
                    goto L_0x0570
                L_0x0525:
                    java.lang.String r0 = "disable_gamelife_api"
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    r1.put(r0, r7)     // Catch:{ JSONException -> 0x0540 }
                    py1.j1 r2 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45375i()     // Catch:{ JSONException -> 0x0540 }
                    if (r2 == 0) goto L_0x0540
                    py1.j1 r2 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45375i()     // Catch:{ JSONException -> 0x0540 }
                    boolean r2 = r2.f127803g     // Catch:{ JSONException -> 0x0540 }
                    if (r2 == 0) goto L_0x0540
                    r1.put(r0, r4)     // Catch:{ JSONException -> 0x0540 }
                L_0x0540:
                    java.lang.String r0 = r1.toString()
                    com.tencent.mm.autogen.events.GameCommOperationEvent$b r13 = r13.f9269e
                    r13.f9273a = r0
                    goto L_0x0570
                L_0x0549:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$a r0 = r13.f9268d
                    android.content.Context r0 = r0.f9272c
                    if (r0 != 0) goto L_0x0550
                    goto L_0x0570
                L_0x0550:
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    java.lang.String r0 = com.tencent.p014mm.plugin.game.model.C42046d.m45745d(r0)
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    if (r2 == 0) goto L_0x0563
                    java.lang.String r0 = com.tencent.p014mm.plugin.game.model.C42046d.m45743b()
                L_0x0563:
                    java.lang.String r2 = "regionCode"
                    r1.put(r2, r0)     // Catch:{ JSONException -> 0x0568 }
                L_0x0568:
                    com.tencent.mm.autogen.events.GameCommOperationEvent$b r13 = r13.f9269e
                    java.lang.String r0 = r1.toString()
                    r13.f9273a = r0
                L_0x0570:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.GameEventListener.C4166010.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f112115t = new C41673a(this);
        this.f112116u = new C41674b(this);
        this.f112117v = new IListener<SwitcherEvent>(fVar) {
            {
                this.__eventId = -173637623;
            }

            public boolean callback(IEvent iEvent) {
                SwitcherEvent switcherEvent = (SwitcherEvent) iEvent;
                if (switcherEvent.f107783d.f107785b.equals(GameMessageStorageNotifyEvent.class.getName())) {
                    if (switcherEvent.f107783d.f107784a == 1) {
                        GameEventListener.this.f112115t.mo62402c();
                        return false;
                    }
                    GameEventListener.this.f112115t.mo62403d();
                    return false;
                } else if (!switcherEvent.f107783d.f107785b.equals(GameLifeStorageNotifyEvent.class.getName())) {
                    return false;
                } else {
                    if (switcherEvent.f107783d.f107784a == 1) {
                        GameEventListener.this.f112116u.mo62402c();
                        return false;
                    }
                    GameEventListener.this.f112116u.mo62403d();
                    return false;
                }
            }
        };
        this.f112118w = new IListener<GameDebugSettingEvent>(this, fVar) {
            {
                this.__eventId = 591188507;
            }

            public boolean callback(IEvent iEvent) {
                GameDebugSettingEvent.C1074a aVar = ((GameDebugSettingEvent) iEvent).f9274d;
                C4566p.f19310a = aVar.f9275a;
                C4566p.f19311b = aVar.f9277c;
                return false;
            }
        };
        this.f112119x = new IListener<GetGameDebugDownloaderTypeEvent>(this, fVar) {
            {
                this.__eventId = -528556336;
            }

            public boolean callback(IEvent iEvent) {
                ((GetGameDebugDownloaderTypeEvent) iEvent).f107595d.f107596a = C4566p.f19310a;
                return false;
            }
        };
        this.f112120y = new IListener<GameWatchReportEvent>(this, fVar) {
            {
                this.__eventId = 1648872377;
            }

            public boolean callback(IEvent iEvent) {
                GameWatchReportEvent gameWatchReportEvent = (GameWatchReportEvent) iEvent;
                Log.m105925i("MicroMsg.GameEventListener", "opType = %d, opStatus = %d, appId = %s", Integer.valueOf(gameWatchReportEvent.f9289d.f9291b), Integer.valueOf(gameWatchReportEvent.f9289d.f9292c), gameWatchReportEvent.f9289d.f9290a);
                int i = gameWatchReportEvent.f9289d.f9291b;
                if (i != 0) {
                    if (i == 2) {
                        C42091s c = C42091s.m45784c();
                        GameWatchReportEvent.C1078a aVar = gameWatchReportEvent.f9289d;
                        c.mo66050g(aVar.f9290a, aVar.f9292c, false, aVar.f9293d);
                    } else if (i != 6) {
                        C52415a a = C52415a.m58668a();
                        GameWatchReportEvent.C1078a aVar2 = gameWatchReportEvent.f9289d;
                        a.mo62981c(aVar2.f9290a, aVar2.f9291b, aVar2.f9292c, (String) null, aVar2.f9293d);
                    } else {
                        C42091s c2 = C42091s.m45784c();
                        GameWatchReportEvent.C1078a aVar3 = gameWatchReportEvent.f9289d;
                        String str = aVar3.f9290a;
                        String str2 = aVar3.f9293d;
                        c2.getClass();
                        C52415a.m58668a().mo62981c(str, 6, 0, (String) null, str2);
                    }
                }
                return false;
            }
        };
        this.f112121z = new IListener<PostSyncTaskEvent>(this, fVar) {
            {
                this.__eventId = -790196534;
            }

            public boolean callback(IEvent iEvent) {
                PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
                C30075d.m38954a().mo57102b(false, 2);
                return false;
            }
        };
        this.f112098A = new IListener<ManualAuthEvent>(this, fVar) {
            {
                this.__eventId = -199921540;
            }

            public /* bridge */ /* synthetic */ boolean callback(IEvent iEvent) {
                ManualAuthEvent manualAuthEvent = (ManualAuthEvent) iEvent;
                return false;
            }
        };
        this.f112099B = new IListener<GameMsgDownloadImgEvent>(this, fVar) {
            {
                this.__eventId = 110532958;
            }

            public boolean callback(IEvent iEvent) {
                GameMsgDownloadImgEvent gameMsgDownloadImgEvent = (GameMsgDownloadImgEvent) iEvent;
                GameMsgDownloadImgEvent.C40107a aVar = gameMsgDownloadImgEvent.f107555d;
                String str = aVar.f107558b;
                GameMsgDownloadImgEvent.C40108b bVar = gameMsgDownloadImgEvent.f107556e;
                bVar.f107559a = C4443h.f19182b;
                int i = aVar.f107557a;
                boolean z = true;
                if (i == 1) {
                    C52638a aVar2 = C52638a.C52640b.f146975a;
                    synchronized (aVar2) {
                        if (!Util.isNullOrNil(str)) {
                            if (!((ConcurrentHashMap) aVar2.f146974d).containsKey(str) || !((Boolean) ((ConcurrentHashMap) aVar2.f146974d).get(str)).booleanValue()) {
                                Log.m105925i("MicroMsg.GameCacheUtil", "download entrance image start : %s", str);
                                ((ConcurrentHashMap) aVar2.f146974d).put(str, Boolean.TRUE);
                            }
                        }
                        z = false;
                    }
                    bVar.f107560b = z;
                } else if (i == 2) {
                    C52638a aVar3 = C52638a.C52640b.f146975a;
                    synchronized (aVar3) {
                        if (!Util.isNullOrNil(str) && ((ConcurrentHashMap) aVar3.f146974d).containsKey(str)) {
                            Log.m105925i("MicroMsg.GameCacheUtil", "download entrance image finish : %s", str);
                            ((ConcurrentHashMap) aVar3.f146974d).remove(str);
                        }
                    }
                }
                return false;
            }
        };
        this.f112100C = new IListener<ShowGameCenterEntranceEvent>(this, fVar) {
            {
                this.__eventId = 1446704624;
            }

            public boolean callback(IEvent iEvent) {
                ShowGameCenterEntranceEvent showGameCenterEntranceEvent = (ShowGameCenterEntranceEvent) iEvent;
                synchronized (this) {
                    C52638a.C52641c cVar = C52638a.C52640b.f146975a.f146973c;
                    if (cVar.f146976a > 0 && cVar.f146979d > 0) {
                        cVar.f146977b = System.currentTimeMillis();
                        C52638a.C52641c cVar2 = C52638a.C52640b.f146975a.f146973c;
                        long j = cVar2.f146978c;
                        long currentTimeMillis = System.currentTimeMillis();
                        C52638a.C52641c cVar3 = C52638a.C52640b.f146975a.f146973c;
                        cVar2.f146978c = j + (currentTimeMillis - cVar3.f146979d);
                        Log.m105925i("MicroMsg.GameEventListener", "enter game center, startTime:%d(ms), endTime:%d(ms), stayTime:%d(ms)", Long.valueOf(cVar3.f146976a), Long.valueOf(C52638a.C52640b.f146975a.f146973c.f146977b), Long.valueOf(C52638a.C52640b.f146975a.f146973c.f146978c));
                        C52638a.C52641c cVar4 = C52638a.C52640b.f146975a.f146973c;
                        C40314g.m43486e(MMApplicationContext.getContext(), 35, 0, 0, 91, 0, "", 901, 0, "", "", "", cVar4.f146976a / 1000, cVar4.f146977b / 1000, cVar4.f146978c / 1000);
                    }
                    C52638a.C52641c cVar5 = C52638a.C52640b.f146975a.f146973c;
                    cVar5.f146976a = 0;
                    cVar5.f146977b = 0;
                    cVar5.f146978c = 0;
                    cVar5.f146979d = 0;
                }
                return false;
            }
        };
        this.f112101D = new IListener<GamePBCacheEvent>(this, fVar) {
            {
                this.__eventId = 738480876;
            }

            public boolean callback(IEvent iEvent) {
                GamePBCacheEvent gamePBCacheEvent = (GamePBCacheEvent) iEvent;
                Class cls = C48484q.class;
                GamePBCacheEvent.C40109a aVar = gamePBCacheEvent.f107561d;
                int i = aVar.f107562a;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && !Util.isNullOrNil(aVar.f107563b)) {
                            ((C48484q) C86312j.m106911c(cls)).mo66106SL().mo57115Lo(gamePBCacheEvent.f107561d.f107563b);
                            Log.m105925i("MicroMsg.GameEventListener", "delete game cache, key:[%s]", gamePBCacheEvent.f107561d.f107563b);
                        }
                    } else if (!Util.isNullOrNil(aVar.f107563b) && gamePBCacheEvent.f107561d.f107564c != null) {
                        C30099e0 SL = ((C48484q) C86312j.m106911c(cls)).mo66106SL();
                        GamePBCacheEvent.C40109a aVar2 = gamePBCacheEvent.f107561d;
                        SL.mo57117Yt(aVar2.f107563b, aVar2.f107564c);
                        Log.m105925i("MicroMsg.GameEventListener", "save game cache, key:[%s]", gamePBCacheEvent.f107561d.f107563b);
                    }
                } else if (!Util.isNullOrNil(aVar.f107563b)) {
                    gamePBCacheEvent.f107561d.f107564c = ((C48484q) C86312j.m106911c(cls)).mo66106SL().mo57116Rz(gamePBCacheEvent.f107561d.f107563b);
                    Log.m105925i("MicroMsg.GameEventListener", "get game cache, key:[%s]", gamePBCacheEvent.f107561d.f107563b);
                }
                return false;
            }
        };
    }

    /* renamed from: d */
    public static void m45009d(GameEventListener gameEventListener, boolean z) {
        if (gameEventListener.f112103e && !z) {
            long nowSecond = Util.nowSecond();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_HIDE_ENTRANCE_RED_DOT_TIME_LONG, Long.valueOf(nowSecond));
            Log.m105925i("MicroMsg.GameEventListener", "reset backup msg startTime:%d", Long.valueOf(nowSecond));
        }
        gameEventListener.f112103e = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009b, code lost:
        if (r13 < 2) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45010q(com.tencent.p014mm.plugin.game.GameEventListener r13) {
        /*
            r13.getClass()
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_TAB_RED_DOT_DESC_STRING_SYNC
            java.lang.Class<sw1.p> r1 = sw1.C48483p.class
            boolean r2 = com.tencent.p014mm.plugin.game.commlib.util.C30081b.m38959a()
            java.lang.String r3 = "MicroMsg.GameEventListener"
            if (r2 == 0) goto L_0x0016
            java.lang.String r13 = "hit reddot level up, no checkBackupMsg."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r13)
            goto L_0x01ab
        L_0x0016:
            long r4 = r13.f112102d
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r4)
            long r4 = java.lang.Math.abs(r4)
            r6 = 60
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x002d
            java.lang.String r13 = "checkBackupMsg, check waiting..."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r13)
            goto L_0x01ab
        L_0x002d:
            java.lang.String r2 = "checkBackupMsg, start"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r13.f112102d = r4
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_HIDE_ENTRANCE_RED_DOT_TIME_LONG
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r13 = r13.mo119685f(r2, r4)
            java.lang.Long r13 = (java.lang.Long) r13
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            long r4 = r13.longValue()
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r4)
            long r4 = java.lang.Math.abs(r4)
            r6 = 7200(0x1c20, double:3.5573E-320)
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x01a6
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            java.lang.String r2 = ""
            java.lang.Object r13 = r13.mo119685f(r0, r2)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r4 = "_"
            java.lang.String[] r13 = r13.split(r4)
            int r5 = r13.length
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 != r6) goto L_0x00a7
            r5 = r13[r8]     // Catch:{ NumberFormatException -> 0x009e }
            long r9 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x009e }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x009e }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isSameDay(r9, r11)     // Catch:{ NumberFormatException -> 0x009e }
            r13 = r13[r7]     // Catch:{ NumberFormatException -> 0x009e }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x009e }
            if (r5 != 0) goto L_0x009b
            goto L_0x00a7
        L_0x009b:
            if (r13 >= r6) goto L_0x00a5
            goto L_0x00a8
        L_0x009e:
            r13 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r13, r2, r5)
            r13 = 0
        L_0x00a5:
            r2 = 0
            goto L_0x00a9
        L_0x00a7:
            r13 = 0
        L_0x00a8:
            r2 = 1
        L_0x00a9:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r5[r8] = r6
            java.lang.String r6 = "allowUseBackup:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r5)
            if (r2 == 0) goto L_0x01ab
            java.lang.Class<sw1.q> r2 = sw1.C48484q.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            sw1.q r2 = (sw1.C48484q) r2
            com.tencent.mm.plugin.game.model.b0 r2 = r2.xi0()
            r2.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "select * from GameRawMessage where reappearable=1 and entranceExposure=0 and isRead=0 and isHidden=0 and expireTime>"
            r5.append(r6)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r5.append(r9)
            java.lang.String r6 = " order by "
            r5.append(r6)
            java.lang.String r6 = "weight"
            r5.append(r6)
            java.lang.String r6 = " desc, "
            r5.append(r6)
            java.lang.String r6 = "createTime"
            r5.append(r6)
            java.lang.String r6 = " desc "
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String[] r6 = new java.lang.String[r8]
            android.database.Cursor r2 = r2.rawQuery(r5, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r2 != 0) goto L_0x0104
            goto L_0x011e
        L_0x0104:
            boolean r6 = r2.moveToFirst()
            if (r6 == 0) goto L_0x011b
        L_0x010a:
            com.tencent.mm.plugin.game.model.w r6 = new com.tencent.mm.plugin.game.model.w
            r6.<init>()
            r6.convertFrom(r2)
            r5.add(r6)
            boolean r6 = r2.moveToNext()
            if (r6 != 0) goto L_0x010a
        L_0x011b:
            r2.close()
        L_0x011e:
            r2 = 0
            java.util.Iterator r5 = r5.iterator()
        L_0x0123:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0153
            java.lang.Object r6 = r5.next()
            com.tencent.mm.plugin.game.model.w r6 = (com.tencent.p014mm.plugin.game.model.C42119w) r6
            r6.mo66075l2()
            di3.d r9 = di3.C86312j.m106911c(r1)
            sw1.p r9 = (sw1.C48483p) r9
            com.tencent.mm.plugin.game.model.a0 r9 = r9.mo66079ar()
            boolean r9 = r9.mo65985n(r6)
            di3.d r10 = di3.C86312j.m106911c(r1)
            sw1.p r10 = (sw1.C48483p) r10
            com.tencent.mm.plugin.game.model.a0 r10 = r10.mo66079ar()
            boolean r10 = r10.mo65986o(r6)
            if (r9 != 0) goto L_0x0123
            if (r10 != 0) goto L_0x0123
            r2 = r6
        L_0x0153:
            if (r2 != 0) goto L_0x015b
            java.lang.String r13 = "dont have backup msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r13)
            goto L_0x01ab
        L_0x015b:
            r2.mo66075l2()
            di3.d r1 = di3.C86312j.m106911c(r1)
            sw1.p r1 = (sw1.C48483p) r1
            com.tencent.mm.plugin.game.model.a0 r1 = r1.mo66079ar()
            r1.mo65994w(r2)
            r1.mo65993v(r2)
            r1.mo65992u(r2)
            r1.mo65991t(r2)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            long r5 = r2.field_msgId
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r1[r8] = r2
            java.lang.String r2 = "show backup msg, msgId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
            int r13 = r13 + r7
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r5 = java.lang.System.currentTimeMillis()
            r2.append(r5)
            r2.append(r4)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r1.mo119677K(r0, r13)
            goto L_0x01ab
        L_0x01a6:
            java.lang.String r13 = "two hour waiting..."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r13)
        L_0x01ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.GameEventListener.m45010q(com.tencent.mm.plugin.game.GameEventListener):void");
    }

    public boolean callback(IEvent iEvent) {
        if (iEvent instanceof NotifyGameWebviewOperationEvent) {
            this.f112104f.mo65957f((NotifyGameWebviewOperationEvent) iEvent);
            return false;
        } else if (iEvent instanceof GameDownloadReport4WebViewEvent) {
            return this.f112105g.callback((GameDownloadReport4WebViewEvent) iEvent);
        } else {
            if (iEvent instanceof QueryGameMessageEvent) {
                return this.f112108j.callback((QueryGameMessageEvent) iEvent);
            }
            if (iEvent instanceof SwitcherEvent) {
                return this.f112117v.callback((SwitcherEvent) iEvent);
            }
            if (iEvent instanceof GameCenterOperationEvent) {
                return this.f112109n.callback((GameCenterOperationEvent) iEvent);
            }
            if (iEvent instanceof GameJsApiCommandEvent) {
                return this.f112110o.callback((GameJsApiCommandEvent) iEvent);
            }
            if (iEvent instanceof OpenGameCenterEvent) {
                return this.f112111p.callback((OpenGameCenterEvent) iEvent);
            }
            if (iEvent instanceof ReportGameCenterEvent) {
                return this.f112112q.callback((ReportGameCenterEvent) iEvent);
            }
            if (iEvent instanceof ReportMsgClickEvent) {
                return this.f112113r.callback((ReportMsgClickEvent) iEvent);
            }
            if (iEvent instanceof GameDebugSettingEvent) {
                return this.f112118w.callback((GameDebugSettingEvent) iEvent);
            }
            if (iEvent instanceof GetGameDebugDownloaderTypeEvent) {
                return this.f112119x.callback((GetGameDebugDownloaderTypeEvent) iEvent);
            }
            if (iEvent instanceof GameCommOperationEvent) {
                return this.f112114s.callback((GameCommOperationEvent) iEvent);
            }
            if (iEvent instanceof GameWatchReportEvent) {
                return this.f112120y.callback((GameWatchReportEvent) iEvent);
            }
            if (iEvent instanceof PostSyncTaskEvent) {
                return this.f112121z.callback((PostSyncTaskEvent) iEvent);
            }
            if (iEvent instanceof ManualAuthEvent) {
                ManualAuthEvent manualAuthEvent = (ManualAuthEvent) iEvent;
                ((C3006818) this.f112098A).getClass();
                return false;
            } else if (iEvent instanceof GameMsgDownloadImgEvent) {
                return this.f112099B.callback((GameMsgDownloadImgEvent) iEvent);
            } else {
                if (iEvent instanceof QueryGameLifeMsgEvent) {
                    return this.f112106h.callback((QueryGameLifeMsgEvent) iEvent);
                }
                if (iEvent instanceof ShowGameCenterEntranceEvent) {
                    return this.f112100C.callback((ShowGameCenterEntranceEvent) iEvent);
                }
                if (iEvent instanceof GamePBCacheEvent) {
                    return this.f112101D.callback((GamePBCacheEvent) iEvent);
                }
                if (iEvent instanceof SetEntranceMsgExposureEvent) {
                    return this.f112107i.callback((SetEntranceMsgExposureEvent) iEvent);
                }
                return false;
            }
        }
    }
}
