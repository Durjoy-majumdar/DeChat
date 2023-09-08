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
import com.tencent.p014mm.plugin.game.luggage.MMLuggageGameWebViewUI;
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
import di3.C86312j;
import java.util.ArrayList;
import java.util.Iterator;
import js0.C88020k;
import jx1.C46577a;
import p225rc.g$$d;
import p828wa.C53106j;
import sw1.C48478n;
import uy1.C52644e;
import xy1.C53472h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI */
public class MMGameWebTabUI extends MMLuggageGameWebViewUI implements g$$d {

    /* renamed from: r */
    public static C1256g<Bundle> f114340r = new C42286b();

    /* renamed from: h */
    public GameTabWidget2 f114341h;

    /* renamed from: i */
    public String f114342i;

    /* renamed from: j */
    public GameTabData2 f114343j;

    /* renamed from: n */
    public int f114344n = 0;

    /* renamed from: o */
    public boolean f114345o = true;

    /* renamed from: p */
    public BroadcastReceiver f114346p = new C42289d();

    /* renamed from: q */
    public IListener f114347q = new IListener<GetUnreadGameMsgCountEvent>(C40008f.f107254d) {
        {
            this.__eventId = 98332773;
        }

        public boolean callback(IEvent iEvent) {
            GetUnreadGameMsgCountEvent.C40123a aVar = ((GetUnreadGameMsgCountEvent) iEvent).f107597d;
            int i = aVar.f107598a;
            boolean z = aVar.f107601d;
            MMGameWebTabUI mMGameWebTabUI = MMGameWebTabUI.this;
            C1256g<Bundle> gVar = MMGameWebTabUI.f114340r;
            mMGameWebTabUI.getClass();
            Log.m105919d("MicroMsg.MMGameWebTabUI", "get unread count: %d", Integer.valueOf(i));
            GameTabWidget2 gameTabWidget2 = mMGameWebTabUI.f114341h;
            if (gameTabWidget2 != null) {
                gameTabWidget2.mo66334f(i, z);
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI$IPCInvoke_readGameLifeConversation */
    public static class IPCInvoke_readGameLifeConversation implements C80883e<IPCInteger, Bundle> {

        /* renamed from: d */
        public C1256g<Bundle> f114349d;

        /* renamed from: e */
        public MStorage.IOnStorageChange f114350e = new C42284a();

        /* renamed from: f */
        public IListenerMStorage f114351f = new IListenerMStorage() {
            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r2 = r1.f114353e;
             */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo25931e(com.tencent.p014mm.sdk.event.IEvent r2) {
                /*
                    r1 = this;
                    boolean r2 = r2 instanceof com.tencent.p014mm.autogen.events.GameMessageStorageNotifyEvent
                    if (r2 == 0) goto L_0x0011
                    com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI$IPCInvoke_readGameLifeConversation r2 = com.tencent.p014mm.plugin.game.p061ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.this
                    com.tencent.mm.ipcinvoker.g<android.os.Bundle> r0 = r2.f114349d
                    if (r0 == 0) goto L_0x0011
                    android.os.Bundle r2 = r2.mo66359a()
                    r0.mo894a(r2)
                L_0x0011:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.C422822.mo25931e(com.tencent.mm.sdk.event.IEvent):void");
            }
        };

        /* renamed from: g */
        public IListener f114352g = new IListener<GetChatRoomMsgEvent>(C40008f.f107254d) {
            {
                this.__eventId = -2093822894;
            }

            public boolean callback(IEvent iEvent) {
                GetChatRoomMsgEvent getChatRoomMsgEvent = (GetChatRoomMsgEvent) iEvent;
                synchronized (this) {
                    IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = IPCInvoke_readGameLifeConversation.this;
                    C1256g<Bundle> gVar = iPCInvoke_readGameLifeConversation.f114349d;
                    if (gVar != null) {
                        gVar.mo894a(iPCInvoke_readGameLifeConversation.mo66359a());
                    }
                }
                return false;
            }
        };

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI$IPCInvoke_readGameLifeConversation$a */
        public class C42284a implements MStorage.IOnStorageChange {
            public C42284a() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
                r1 = r0.f114355d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onNotifyChange(java.lang.String r1, com.tencent.p014mm.sdk.storage.MStorageEventData r2) {
                /*
                    r0 = this;
                    java.lang.Object r1 = r2.obj
                    boolean r1 = r1 instanceof cz1.C7143c
                    if (r1 == 0) goto L_0x0013
                    com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI$IPCInvoke_readGameLifeConversation r1 = com.tencent.p014mm.plugin.game.p061ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.this
                    com.tencent.mm.ipcinvoker.g<android.os.Bundle> r2 = r1.f114349d
                    if (r2 == 0) goto L_0x0013
                    android.os.Bundle r1 = r1.mo66359a()
                    r2.mo894a(r1)
                L_0x0013:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.chat_tab.MMGameWebTabUI.IPCInvoke_readGameLifeConversation.C42284a.onNotifyChange(java.lang.String, com.tencent.mm.sdk.storage.MStorageEventData):void");
            }
        }

        private IPCInvoke_readGameLifeConversation() {
        }

        /* renamed from: a */
        public final Bundle mo66359a() {
            Class cls = C48478n.class;
            int kd = ((C53472h) C86312j.m106911c(C53472h.class)).mo70730kd();
            int Fm0 = ((C48478n) C86312j.m106911c(cls)).Fm0(1);
            int Fm02 = ((C48478n) C86312j.m106911c(cls)).Fm0(2);
            Bundle bundle = new Bundle();
            bundle.putInt("msg_unread_count", kd + Fm0);
            bundle.putInt("notify_unread_count", Fm02);
            C46577a aVar = C46577a.f125473d;
            bundle.putBoolean("has_chat_room_unread_msg", C46577a.f125476g);
            return bundle;
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCInteger iPCInteger = (IPCInteger) obj;
            Class<GameMessageStorageNotifyEvent> cls = GameMessageStorageNotifyEvent.class;
            Class cls2 = C53472h.class;
            Bundle bundle = null;
            if (iPCInteger != null) {
                Log.m105925i("MicroMsg.MMGameWebTabUI", "IPCInvoke_readGameLifeConversation cmd:%d", Integer.valueOf(iPCInteger.f10313d));
                int i = iPCInteger.f10313d;
                if (i == 1) {
                    this.f114349d = gVar;
                    ((C53472h) C86312j.m106911c(cls2)).mo70729i(this.f114350e);
                    IListenerMStorage.m48928f(cls.getName(), this.f114351f);
                    this.f114352g.alive();
                    bundle = mo66359a();
                } else if (i == 2) {
                    this.f114349d = null;
                    ((C53472h) C86312j.m106911c(cls2)).mo70728g(this.f114350e);
                    IListenerMStorage.m48929g(cls.getName(), this.f114351f);
                    this.f114352g.dead();
                } else if (i == 3) {
                    bundle = mo66359a();
                }
            }
            if (gVar != null) {
                gVar.mo894a(bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI$a */
    public class C42285a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ GameTabData2.TabItem f114356d;

        public C42285a(GameTabData2.TabItem tabItem) {
            this.f114356d = tabItem;
        }

        public void run() {
            if (!MMGameWebTabUI.this.isFinishing() && !MMGameWebTabUI.this.isDestroyed()) {
                MMGameWebTabUI mMGameWebTabUI = MMGameWebTabUI.this;
                GameTabData2.TabItem tabItem = this.f114356d;
                C1256g<Bundle> gVar = MMGameWebTabUI.f114340r;
                mMGameWebTabUI.mo66358L7(tabItem, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI$b */
    public class C42286b implements C1256g<Bundle> {
        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                int i = bundle.getInt("msg_unread_count");
                int i2 = bundle.getInt("notify_unread_count");
                boolean z = bundle.getBoolean("has_chat_room_unread_msg");
                GetUnreadGameMsgCountEvent getUnreadGameMsgCountEvent = new GetUnreadGameMsgCountEvent();
                GetUnreadGameMsgCountEvent.C40123a aVar = getUnreadGameMsgCountEvent.f107597d;
                aVar.f107598a = i;
                aVar.f107599b = i2;
                aVar.f107600c = z;
                getUnreadGameMsgCountEvent.publish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI$c */
    public class C42287c implements C41948f.C41953d {

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI$c$a */
        public class C42288a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f114359d;

            public C42288a(int i) {
                this.f114359d = i;
            }

            public void run() {
                GameTabWidget2 gameTabWidget2 = MMGameWebTabUI.this.f114341h;
                if (gameTabWidget2 != null) {
                    int i = this.f114359d;
                    if (i == 0) {
                        gameTabWidget2.setVisibility(8);
                    } else if (i == 1) {
                        gameTabWidget2.setVisibility(0);
                    }
                }
            }
        }

        public C42287c() {
        }

        /* renamed from: a */
        public boolean mo65833a() {
            GameTabWidget2 gameTabWidget2 = MMGameWebTabUI.this.f114341h;
            if (gameTabWidget2 != null) {
                return gameTabWidget2.f114297h;
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo65834b() {
            GameTabData2 gameTabData2 = MMGameWebTabUI.this.f114343j;
            return gameTabData2 != null && gameTabData2.f114262d.size() <= 1;
        }

        /* renamed from: c */
        public void mo65835c(boolean z) {
            GameTabWidget2 gameTabWidget2 = MMGameWebTabUI.this.f114341h;
            if (gameTabWidget2 != null) {
                gameTabWidget2.setPageChanging(z);
            }
        }

        /* renamed from: d */
        public void mo65836d(int i) {
            Log.m105925i("MicroMsg.MMGameWebTabUI", "showGameTab, isShowTab:%d", Integer.valueOf(i));
            ((C119157j) C119157j.f356862d).mo183895z(new C42288a(i));
        }

        /* renamed from: e */
        public void mo65837e(int i) {
            Log.m105925i("MicroMsg.MMGameWebTabUI", "disableTabSwitch, isSwitchEnable:%d", Integer.valueOf(i));
            GameTabWidget2 gameTabWidget2 = MMGameWebTabUI.this.f114341h;
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
            GameTabData2 gameTabData2 = MMGameWebTabUI.this.f114343j;
            if (gameTabData2 == null) {
                return 0;
            }
            if (gameTabData2.f114262d.containsKey("chat")) {
                return 2;
            }
            return C52644e.m59020a(MMGameWebTabUI.this.f114343j) ? 1 : 0;
        }

        /* renamed from: g */
        public int mo65839g() {
            GameTabWidget2 gameTabWidget2 = MMGameWebTabUI.this.f114341h;
            int height = gameTabWidget2 != null ? gameTabWidget2.getHeight() : 0;
            int f = C88020k.m109555f(height);
            Log.m105925i("MicroMsg.MMGameWebTabUI", "tabHeight:%d, heightInH5:%d", Integer.valueOf(height), Integer.valueOf(f));
            return f;
        }

        /* renamed from: h */
        public String mo65840h() {
            GameTabData2 gameTabData2 = MMGameWebTabUI.this.f114343j;
            return gameTabData2 != null ? gameTabData2.mo66312e() : "";
        }

        /* renamed from: i */
        public boolean mo65841i() {
            return MMGameWebTabUI.this.getIntent().getBooleanExtra("game_has_entrance_info", false);
        }

        /* renamed from: j */
        public void mo65842j(String str) {
            GameTabWidget2 gameTabWidget2 = MMGameWebTabUI.this.f114341h;
            if (gameTabWidget2 != null) {
                gameTabWidget2.post(new C42300m(gameTabWidget2, str));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI$d */
    public class C42289d extends BroadcastReceiver {
        public C42289d() {
        }

        public void onReceive(Context context, Intent intent) {
            MMGameWebTabUI mMGameWebTabUI;
            if (intent != null && "com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) && (mMGameWebTabUI = MMGameWebTabUI.this) != null && !mMGameWebTabUI.isFinishing()) {
                Log.m105924i("MicroMsg.MMGameWebTabUI", "MMGameWebTabUI exit!");
                MMGameWebTabUI.this.finish();
            }
        }
    }

    /* renamed from: I7 */
    public void mo65739I7() {
        C42298k.m45997b(this);
    }

    /* renamed from: J7 */
    public void mo65740J7() {
        C41948f fVar = this.f112883g;
        if (fVar != null) {
            fVar.f112996H1 = new C42287c();
        }
    }

    /* renamed from: L7 */
    public final void mo66358L7(GameTabData2.TabItem tabItem, boolean z) {
        C41948f fVar;
        if (tabItem != null && (fVar = this.f112883g) != null) {
            fVar.mo65827k0(tabItem.f114267d, tabItem.f114278r, z);
            Log.m105925i("MicroMsg.MMGameWebTabUI", "Preload tabItem[key:%s, url:%s, isPreload:%b]", tabItem.f114267d, tabItem.f114278r, Boolean.valueOf(z));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.f114344n;
        int i2 = configuration.orientation;
        if (i != i2) {
            Log.m105925i("MicroMsg.MMGameWebTabUI", "orientation:%d", Integer.valueOf(i2));
            GameTabWidget2 gameTabWidget2 = this.f114341h;
            if (gameTabWidget2 != null) {
                gameTabWidget2.post(new C42299l(gameTabWidget2));
            }
            this.f114344n = configuration.orientation;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.MMGameWebTabUI", "onCreate");
        C41946e eVar = this.f112880d;
        if (eVar == null) {
            finish();
            return;
        }
        this.f114341h = C42298k.m45996a(this, eVar.f148203c);
        this.f114343j = (GameTabData2) getIntent().getParcelableExtra("game_tab_data");
        this.f114342i = getIntent().getStringExtra("game_tab_key");
        GameTabData2 gameTabData2 = this.f114343j;
        if (gameTabData2 != null) {
            Iterator it = ((ArrayList) gameTabData2.mo66309a()).iterator();
            while (it.hasNext()) {
                GameTabData2.TabItem tabItem = (GameTabData2.TabItem) it.next();
                if (tabItem.f114277q == 2 && !Util.isNullOrNil(tabItem.f114278r) && !tabItem.f114267d.equalsIgnoreCase(this.f114342i) && !tabItem.f114281u) {
                    this.f112880d.f148203c.postDelayed(new C42285a(tabItem), (long) (tabItem.f114282v * 1000));
                }
            }
        }
        C41946e eVar2 = this.f112880d;
        C53106j.this.f148206f.f258382d = this;
        FrameLayout frameLayout = eVar2.f148203c;
        if (frameLayout instanceof ViewGroup) {
            frameLayout.setOnHierarchyChangeListener(new C42306r(this, frameLayout));
            int indexOfChild = frameLayout.indexOfChild(frameLayout.findViewWithTag("game_float_view_tag"));
            Log.m105925i("MicroMsg.MMGameWebTabUI", "float page index1:%d", Integer.valueOf(indexOfChild));
            if (indexOfChild >= 0) {
                frameLayout.removeView(this.f114341h);
                frameLayout.addView(this.f114341h, indexOfChild);
            }
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        registerReceiver(this.f114346p, intentFilter, C4443h.f19181a, (Handler) null);
        this.f114347q.alive();
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCInteger(1), IPCInvoke_readGameLifeConversation.class, f114340r);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.MMGameWebTabUI", "onDestroy");
        unregisterReceiver(this.f114346p);
        this.f114347q.dead();
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCInteger(2), IPCInvoke_readGameLifeConversation.class, (C1256g) null);
        C42298k.m45997b(this);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
        Log.m105924i("MicroMsg.MMGameWebTabUI", "onNewIntent");
        if (intent != null) {
            setIntent(intent);
            String stringExtra = intent.getStringExtra("game_tab_key");
            if (stringExtra != null && !Util.nullAsNil(this.f114342i).equalsIgnoreCase(stringExtra)) {
                this.f114342i = stringExtra;
                String stringExtra2 = intent.getStringExtra("game_red_dot_tab_key");
                GameTabWidget2 gameTabWidget2 = this.f114341h;
                if (gameTabWidget2 != null) {
                    gameTabWidget2.mo66333e(stringExtra, stringExtra2);
                }
                GameTabData2 gameTabData2 = this.f114343j;
                if (gameTabData2 != null && this.f112883g != null) {
                    mo66358L7((GameTabData2.TabItem) gameTabData2.f114262d.get(stringExtra), false);
                    this.f112883g.mo65823g0(stringExtra);
                    GameTabWidget2 gameTabWidget22 = this.f114341h;
                    if (gameTabWidget22 != null) {
                        gameTabWidget22.bringToFront();
                    }
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f114345o) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCInteger(3), IPCInvoke_readGameLifeConversation.class, f114340r);
        }
        this.f114345o = false;
    }

    /* renamed from: s7 */
    public boolean mo66353s7() {
        C42298k.m45997b(this);
        return true;
    }
}
