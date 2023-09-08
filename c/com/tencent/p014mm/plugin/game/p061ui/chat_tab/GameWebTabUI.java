package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GameMessageStorageNotifyEvent;
import com.tencent.p014mm.autogen.events.GetChatRoomMsgEvent;
import com.tencent.p014mm.autogen.events.GetUnreadGameMsgCountEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.game.C4443h;
import com.tencent.p014mm.plugin.game.luggage.LuggageGameWebViewUI;
import com.tencent.p014mm.plugin.game.luggage.page.C41946e;
import com.tencent.p014mm.plugin.game.luggage.page.C41948f;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2;
import com.tencent.p014mm.pluginsdk.event.IListenerMStorage;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import js0.C88020k;
import jx1.C46577a;
import jy1.C46582b;
import p225rc.g$$d;
import p828wa.C53106j;
import p828wa.C53118n;
import p828wa.C53133t;
import q20.C89449a;
import sw1.C48478n;
import ty1.C52391a;
import uy1.C52644e;
import xy1.C53472h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI */
public class GameWebTabUI extends LuggageGameWebViewUI implements g$$d {

    /* renamed from: u */
    public static C1256g<Bundle> f114316u = new C42276b();

    /* renamed from: j */
    public GameTabWidget2 f114317j;

    /* renamed from: n */
    public String f114318n;

    /* renamed from: o */
    public GameTabData2 f114319o;

    /* renamed from: p */
    public int f114320p = 0;

    /* renamed from: q */
    public boolean f114321q = true;

    /* renamed from: r */
    public boolean f114322r = false;

    /* renamed from: s */
    public BroadcastReceiver f114323s = new C42280e();

    /* renamed from: t */
    public IListener f114324t = new IListener<GetUnreadGameMsgCountEvent>(C40008f.f107254d) {
        {
            this.__eventId = 98332773;
        }

        public boolean callback(IEvent iEvent) {
            GetUnreadGameMsgCountEvent.C40123a aVar = ((GetUnreadGameMsgCountEvent) iEvent).f107597d;
            int i = aVar.f107598a;
            boolean z = aVar.f107601d;
            GameWebTabUI gameWebTabUI = GameWebTabUI.this;
            C1256g<Bundle> gVar = GameWebTabUI.f114316u;
            gameWebTabUI.getClass();
            Log.m105919d("MicroMsg.GameWebTabUI", "get unread count: %d", Integer.valueOf(i));
            GameTabWidget2 gameTabWidget2 = gameWebTabUI.f114317j;
            if (gameTabWidget2 != null) {
                gameTabWidget2.mo66334f(i, z);
            }
            return false;
        }
    };

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$IPCInvoke_readGameLifeConversation */
    public static class IPCInvoke_readGameLifeConversation implements C80883e<IPCInteger, Bundle> {

        /* renamed from: d */
        public C1256g<Bundle> f114326d;

        /* renamed from: e */
        public MStorage.IOnStorageChange f114327e = new C42274a();

        /* renamed from: f */
        public IListenerMStorage f114328f = new IListenerMStorage() {
            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r2 = r1.f114330e;
             */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo25931e(com.tencent.p014mm.sdk.event.IEvent r2) {
                /*
                    r1 = this;
                    boolean r2 = r2 instanceof com.tencent.p014mm.autogen.events.GameMessageStorageNotifyEvent
                    if (r2 == 0) goto L_0x0011
                    com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$IPCInvoke_readGameLifeConversation r2 = com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.this
                    com.tencent.mm.ipcinvoker.g<android.os.Bundle> r0 = r2.f114326d
                    if (r0 == 0) goto L_0x0011
                    android.os.Bundle r2 = r2.mo66354a()
                    r0.mo894a(r2)
                L_0x0011:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.C422722.mo25931e(com.tencent.mm.sdk.event.IEvent):void");
            }
        };

        /* renamed from: g */
        public IListener f114329g = new IListener<GetChatRoomMsgEvent>(C40008f.f107254d) {
            {
                this.__eventId = -2093822894;
            }

            public boolean callback(IEvent iEvent) {
                GetChatRoomMsgEvent getChatRoomMsgEvent = (GetChatRoomMsgEvent) iEvent;
                synchronized (this) {
                    IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = IPCInvoke_readGameLifeConversation.this;
                    C1256g<Bundle> gVar = iPCInvoke_readGameLifeConversation.f114326d;
                    if (gVar != null) {
                        gVar.mo894a(iPCInvoke_readGameLifeConversation.mo66354a());
                    }
                }
                return false;
            }
        };

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$IPCInvoke_readGameLifeConversation$a */
        public class C42274a implements MStorage.IOnStorageChange {
            public C42274a() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
                r1 = r0.f114332d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onNotifyChange(java.lang.String r1, com.tencent.p014mm.sdk.storage.MStorageEventData r2) {
                /*
                    r0 = this;
                    java.lang.Object r1 = r2.obj
                    boolean r1 = r1 instanceof cz1.C7143c
                    if (r1 == 0) goto L_0x0013
                    com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$IPCInvoke_readGameLifeConversation r1 = com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.this
                    com.tencent.mm.ipcinvoker.g<android.os.Bundle> r2 = r1.f114326d
                    if (r2 == 0) goto L_0x0013
                    android.os.Bundle r1 = r1.mo66354a()
                    r2.mo894a(r1)
                L_0x0013:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation.C42274a.onNotifyChange(java.lang.String, com.tencent.mm.sdk.storage.MStorageEventData):void");
            }
        }

        /* renamed from: a */
        public final Bundle mo66354a() {
            Class cls = C48478n.class;
            int kd = ((C53472h) C86312j.m106911c(C53472h.class)).mo70730kd();
            int Fm0 = ((C48478n) C86312j.m106911c(cls)).Fm0(1);
            int Fm02 = ((C48478n) C86312j.m106911c(cls)).Fm0(2);
            boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.GAME_MSG_BOTTOM_TAB_BOOLEAN_SYNC, false);
            Bundle bundle = new Bundle();
            bundle.putInt("msg_unread_count", kd + Fm0);
            bundle.putInt("notify_unread_count", Fm02);
            C46577a aVar = C46577a.f125473d;
            bundle.putBoolean("has_chat_room_unread_msg", C46577a.f125476g);
            bundle.putBoolean("bottom_red_dot", g);
            return bundle;
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCInteger iPCInteger = (IPCInteger) obj;
            Class<GameMessageStorageNotifyEvent> cls = GameMessageStorageNotifyEvent.class;
            Class cls2 = C53472h.class;
            Bundle bundle = null;
            if (iPCInteger != null) {
                Log.m105925i("MicroMsg.GameWebTabUI", "IPCInvoke_readGameLifeConversation cmd:%d", Integer.valueOf(iPCInteger.f10313d));
                int i = iPCInteger.f10313d;
                if (i == 1) {
                    this.f114326d = gVar;
                    ((C53472h) C86312j.m106911c(cls2)).mo70729i(this.f114327e);
                    IListenerMStorage.m48928f(cls.getName(), this.f114328f);
                    this.f114329g.alive();
                    bundle = mo66354a();
                } else if (i == 2) {
                    this.f114326d = null;
                    if (C86709a0.m107522a()) {
                        ((C53472h) C86312j.m106911c(cls2)).mo70728g(this.f114327e);
                    }
                    IListenerMStorage.m48929g(cls.getName(), this.f114328f);
                    this.f114329g.dead();
                } else if (i == 3) {
                    bundle = mo66354a();
                }
            }
            if (gVar != null) {
                gVar.mo894a(bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$a */
    public class C42275a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ GameTabData2.TabItem f114333d;

        public C42275a(GameTabData2.TabItem tabItem) {
            this.f114333d = tabItem;
        }

        public void run() {
            if (!GameWebTabUI.this.isFinishing() && !GameWebTabUI.this.isDestroyed()) {
                GameWebTabUI gameWebTabUI = GameWebTabUI.this;
                GameTabData2.TabItem tabItem = this.f114333d;
                C1256g<Bundle> gVar = GameWebTabUI.f114316u;
                gameWebTabUI.mo66352N7(tabItem, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$b */
    public class C42276b implements C1256g<Bundle> {
        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                int i = bundle.getInt("msg_unread_count");
                int i2 = bundle.getInt("notify_unread_count");
                boolean z = bundle.getBoolean("has_chat_room_unread_msg");
                boolean z2 = bundle.getBoolean("bottom_red_dot");
                GetUnreadGameMsgCountEvent getUnreadGameMsgCountEvent = new GetUnreadGameMsgCountEvent();
                GetUnreadGameMsgCountEvent.C40123a aVar = getUnreadGameMsgCountEvent.f107597d;
                aVar.f107598a = i;
                aVar.f107599b = i2;
                aVar.f107600c = z;
                aVar.f107601d = z2;
                getUnreadGameMsgCountEvent.publish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$c */
    public class C42277c implements C41948f.C41952c {
        public C42277c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$d */
    public class C42278d implements C41948f.C41953d {

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$d$a */
        public class C42279a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f114337d;

            public C42279a(int i) {
                this.f114337d = i;
            }

            public void run() {
                GameTabWidget2 gameTabWidget2 = GameWebTabUI.this.f114317j;
                if (gameTabWidget2 != null) {
                    int i = this.f114337d;
                    if (i == 0) {
                        gameTabWidget2.setVisibility(8);
                    } else if (i == 1) {
                        gameTabWidget2.setVisibility(0);
                    }
                }
            }
        }

        public C42278d() {
        }

        /* renamed from: a */
        public boolean mo65833a() {
            GameTabWidget2 gameTabWidget2 = GameWebTabUI.this.f114317j;
            if (gameTabWidget2 != null) {
                return gameTabWidget2.f114297h;
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo65834b() {
            GameTabData2 gameTabData2 = GameWebTabUI.this.f114319o;
            return gameTabData2 != null && gameTabData2.f114262d.size() <= 1;
        }

        /* renamed from: c */
        public void mo65835c(boolean z) {
            GameTabWidget2 gameTabWidget2 = GameWebTabUI.this.f114317j;
            if (gameTabWidget2 != null) {
                gameTabWidget2.setPageChanging(z);
            }
        }

        /* renamed from: d */
        public void mo65836d(int i) {
            Log.m105925i("MicroMsg.GameWebTabUI", "showGameTab, isShowTab:%d", Integer.valueOf(i));
            ((C119157j) C119157j.f356862d).mo183895z(new C42279a(i));
        }

        /* renamed from: e */
        public void mo65837e(int i) {
            Log.m105925i("MicroMsg.GameWebTabUI", "disableTabSwitch, isSwitchEnable:%d", Integer.valueOf(i));
            GameTabWidget2 gameTabWidget2 = GameWebTabUI.this.f114317j;
            if (gameTabWidget2 != null) {
                if (i == 0) {
                    gameTabWidget2.setTabSwitchEnable(false);
                } else if (i == 1) {
                    gameTabWidget2.setTabSwitchEnable(true);
                }
            }
        }

        /* renamed from: f */
        public int mo65838f() {
            GameTabData2 gameTabData2 = GameWebTabUI.this.f114319o;
            if (gameTabData2 == null) {
                return 0;
            }
            if (gameTabData2.f114262d.containsKey("chat")) {
                return 2;
            }
            return C52644e.m59020a(GameWebTabUI.this.f114319o) ? 1 : 0;
        }

        /* renamed from: g */
        public int mo65839g() {
            GameTabWidget2 gameTabWidget2 = GameWebTabUI.this.f114317j;
            int height = gameTabWidget2 != null ? gameTabWidget2.getHeight() : 0;
            int f = C88020k.m109555f(height);
            Log.m105925i("MicroMsg.GameWebTabUI", "tabHeight:%d, heightInH5:%d", Integer.valueOf(height), Integer.valueOf(f));
            return f;
        }

        /* renamed from: h */
        public String mo65840h() {
            GameTabData2 gameTabData2 = GameWebTabUI.this.f114319o;
            return gameTabData2 != null ? gameTabData2.mo66312e() : "";
        }

        /* renamed from: i */
        public boolean mo65841i() {
            return GameWebTabUI.this.getIntent().getBooleanExtra("game_has_entrance_info", false);
        }

        /* renamed from: j */
        public void mo65842j(String str) {
            GameTabWidget2 gameTabWidget2 = GameWebTabUI.this.f114317j;
            if (gameTabWidget2 != null) {
                gameTabWidget2.post(new C42300m(gameTabWidget2, str));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI$e */
    public class C42280e extends BroadcastReceiver {
        public C42280e() {
        }

        public void onReceive(Context context, Intent intent) {
            GameWebTabUI gameWebTabUI;
            if (intent != null && "com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) && (gameWebTabUI = GameWebTabUI.this) != null && !gameWebTabUI.isFinishing()) {
                Log.m105924i("MicroMsg.GameWebTabUI", "GameWebTabUI exit!");
                GameWebTabUI.this.finish();
            }
        }
    }

    /* renamed from: I7 */
    public C41948f mo65720I7(C53118n nVar, Bundle bundle) {
        return new C52391a(nVar, (C53133t) null, bundle, (String) null);
    }

    /* renamed from: K7 */
    public void mo65721K7() {
        C42298k.m45997b(this);
    }

    /* renamed from: L7 */
    public void mo65722L7() {
        C41948f fVar = this.f112863g;
        if (fVar != null) {
            if (this.f114322r) {
                fVar.f113003O1 = new C42277c();
            }
            fVar.f112996H1 = new C42278d();
        }
    }

    /* renamed from: N7 */
    public final void mo66352N7(GameTabData2.TabItem tabItem, boolean z) {
        C41948f fVar;
        if (tabItem != null && (fVar = this.f112863g) != null) {
            fVar.mo65827k0(tabItem.f114267d, tabItem.f114278r, z);
            Log.m105925i("MicroMsg.GameWebTabUI", "Preload tabItem[key:%s, url:%s, isPreload:%b]", tabItem.f114267d, tabItem.f114278r, Boolean.valueOf(z));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.f114320p;
        int i2 = configuration.orientation;
        if (i != i2) {
            Log.m105925i("MicroMsg.GameWebTabUI", "orientation:%d", Integer.valueOf(i2));
            GameTabWidget2 gameTabWidget2 = this.f114317j;
            if (gameTabWidget2 != null) {
                gameTabWidget2.post(new C42299l(gameTabWidget2));
            }
            this.f114320p = configuration.orientation;
        }
    }

    public void onCreate(Bundle bundle) {
        this.f114319o = (GameTabData2) getIntent().getParcelableExtra("game_tab_data");
        String stringExtra = getIntent().getStringExtra("game_tab_key");
        this.f114318n = stringExtra;
        GameTabData2 gameTabData2 = this.f114319o;
        if (gameTabData2 != null && gameTabData2.f114263e.equalsIgnoreCase(stringExtra) && ((Boolean) C46582b.f125488c.mo124238b(C46582b.f125486a, C46582b.f125487b[0])).booleanValue()) {
            this.f114322r = true;
        }
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.GameWebTabUI", "onCreate");
        C41946e eVar = this.f112860d;
        if (eVar == null) {
            finish();
            return;
        }
        this.f114317j = C42298k.m45996a(this, eVar.f148203c);
        GameTabData2 gameTabData22 = this.f114319o;
        if (gameTabData22 != null) {
            Iterator it = ((ArrayList) gameTabData22.mo66309a()).iterator();
            while (it.hasNext()) {
                GameTabData2.TabItem tabItem = (GameTabData2.TabItem) it.next();
                if (tabItem.f114277q == 2 && !Util.isNullOrNil(tabItem.f114278r) && !tabItem.f114267d.equalsIgnoreCase(this.f114318n) && !tabItem.f114281u) {
                    this.f112860d.f148203c.postDelayed(new C42275a(tabItem), (long) (tabItem.f114282v * 1000));
                }
            }
        }
        C41946e eVar2 = this.f112860d;
        C53106j.this.f148206f.f258382d = this;
        FrameLayout frameLayout = eVar2.f148203c;
        if (frameLayout instanceof ViewGroup) {
            frameLayout.setOnHierarchyChangeListener(new C42304p(this, frameLayout));
            int indexOfChild = frameLayout.indexOfChild(frameLayout.findViewWithTag("game_float_view_tag"));
            Log.m105925i("MicroMsg.GameWebTabUI", "float page index1:%d", Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                frameLayout.removeView(this.f114317j);
                frameLayout.addView(this.f114317j, indexOfChild);
            }
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        registerReceiver(this.f114323s, intentFilter, C4443h.f19181a, (Handler) null);
        this.f114324t.alive();
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCInteger(1), IPCInvoke_readGameLifeConversation.class, f114316u);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.GameWebTabUI", "onDestroy");
        unregisterReceiver(this.f114323s);
        this.f114324t.dead();
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCInteger(2), IPCInvoke_readGameLifeConversation.class, (C1256g) null);
        C42298k.m45997b(this);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
        Log.m105924i("MicroMsg.GameWebTabUI", "onNewIntent");
        if (intent != null) {
            setIntent(intent);
            String stringExtra = intent.getStringExtra("game_tab_key");
            if (stringExtra != null && !Util.nullAsNil(this.f114318n).equalsIgnoreCase(stringExtra)) {
                this.f114318n = stringExtra;
                String stringExtra2 = intent.getStringExtra("game_red_dot_tab_key");
                GameTabWidget2 gameTabWidget2 = this.f114317j;
                if (gameTabWidget2 != null) {
                    gameTabWidget2.mo66333e(stringExtra, stringExtra2);
                }
                GameTabData2 gameTabData2 = this.f114319o;
                if (gameTabData2 != null && this.f112863g != null) {
                    mo66352N7((GameTabData2.TabItem) gameTabData2.f114262d.get(stringExtra), false);
                    this.f112863g.mo65823g0(stringExtra);
                    GameTabWidget2 gameTabWidget22 = this.f114317j;
                    if (gameTabWidget22 != null) {
                        gameTabWidget22.bringToFront();
                    }
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f114321q) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCInteger(3), IPCInvoke_readGameLifeConversation.class, f114316u);
        }
        this.f114321q = false;
    }

    /* renamed from: s7 */
    public boolean mo66353s7() {
        C42298k.m45997b(this);
        return true;
    }
}
