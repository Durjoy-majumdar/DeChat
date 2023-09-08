package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GameMessageStorageNotifyEvent;
import com.tencent.p014mm.autogen.events.GetChatRoomMsgEvent;
import com.tencent.p014mm.autogen.events.NotifyGameWebviewOperationEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.event.IListenerMStorage;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72994y1;
import cz1.C7143c;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import v10.C52735e;
import xy1.C53472h;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter */
public class ChatTabPresenter {

    /* renamed from: a */
    public MMActivity f114194a;

    /* renamed from: b */
    public GameTabWidget2 f114195b;

    /* renamed from: c */
    public String f114196c;

    /* renamed from: d */
    public BroadcastReceiver f114197d = new C42247d();

    /* renamed from: e */
    public MStorage.IOnStorageChange f114198e = new C42248e();

    /* renamed from: f */
    public IListenerMStorage f114199f = new IListenerMStorage() {
        /* renamed from: e */
        public void mo25931e(IEvent iEvent) {
            if (iEvent instanceof GameMessageStorageNotifyEvent) {
                ChatTabPresenter.this.mo66291f();
            }
        }
    };

    /* renamed from: g */
    public IListener f114200g = new IListener<GetChatRoomMsgEvent>(C40008f.f107254d) {
        {
            this.__eventId = -2093822894;
        }

        public boolean callback(IEvent iEvent) {
            GetChatRoomMsgEvent getChatRoomMsgEvent = (GetChatRoomMsgEvent) iEvent;
            synchronized (this) {
                ChatTabPresenter.this.mo66291f();
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$a */
    public class C42244a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C42305q f114203d;

        public C42244a(C42305q qVar) {
            this.f114203d = qVar;
        }

        public void run() {
            C42305q qVar = this.f114203d;
            if (qVar != null) {
                qVar.mo66284a(ChatTabPresenter.this.f114195b.getHeight());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$b */
    public class C42245b implements MenuItem.OnMenuItemClickListener {
        public C42245b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C42298k.m45997b(ChatTabPresenter.this.f114194a);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$c */
    public class C42246c implements Runnable {
        public C42246c() {
        }

        public void run() {
            if (!ChatTabPresenter.this.f114194a.isDestroyed() && !ChatTabPresenter.this.f114194a.isFinishing()) {
                ChatTabPresenter chatTabPresenter = ChatTabPresenter.this;
                String str = chatTabPresenter.f114196c;
                chatTabPresenter.getClass();
                if (!Util.isNullOrNil(str)) {
                    Log.m105925i("MicroMsg.ChatTabPresenter", "preload url: %s", str);
                    NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = new NotifyGameWebviewOperationEvent();
                    notifyGameWebviewOperationEvent.f9355d.f9356a = 3;
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str);
                    notifyGameWebviewOperationEvent.f9355d.f9358c = intent;
                    notifyGameWebviewOperationEvent.publish();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$d */
    public class C42247d extends BroadcastReceiver {
        public C42247d() {
        }

        public void onReceive(Context context, Intent intent) {
            MMActivity mMActivity;
            if (intent != null && "com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) && (mMActivity = ChatTabPresenter.this.f114194a) != null && !mMActivity.isFinishing()) {
                Log.m105924i("MicroMsg.ChatTabPresenter", "gamecenter exit!");
                ChatTabPresenter.this.f114194a.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$e */
    public class C42248e implements MStorage.IOnStorageChange {
        public C42248e() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (mStorageEventData.obj instanceof C7143c) {
                ChatTabPresenter.this.mo66291f();
            }
        }
    }

    public ChatTabPresenter(MMActivity mMActivity) {
        this.f114194a = mMActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r1 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45375i().f127802f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66286a(android.view.View r6, com.tencent.p014mm.plugin.game.p061ui.chat_tab.C42305q r7) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.ChatTabPresenter"
            java.lang.String r1 = "gamelog.activity, ChatTabPresenter, onCreate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.ui.MMActivity r1 = r5.f114194a
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 r1 = com.tencent.p014mm.plugin.game.p061ui.chat_tab.C42298k.m45996a(r1, r6)
            r5.f114195b = r1
            if (r1 == 0) goto L_0x0019
            com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$a r2 = new com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$a
            r2.<init>(r7)
            r1.post(r2)
        L_0x0019:
            py1.j1 r1 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45375i()
            r2 = 0
            if (r1 == 0) goto L_0x002b
            py1.j1 r1 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45375i()
            py1.e4 r1 = r1.f127802f
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = r1.f127672d
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 == 0) goto L_0x004f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "https://"
            r1.append(r3)
            r3 = 2131831302(0x7f112a06, float:1.9295626E38)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r3)
            r1.append(r3)
            java.lang.String r3 = "/cgi-bin/h5/static/gamelife/homepage.html"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L_0x004f:
            r5.f114196c = r1
            if (r7 == 0) goto L_0x0056
            r7.mo66285b(r1)
        L_0x0056:
            r7 = 1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r3 = 0
            java.lang.String r4 = r5.f114196c
            r1[r3] = r4
            java.lang.String r3 = "profile entrance: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r1)
            com.tencent.mm.ui.MMActivity r0 = r5.f114194a
            r1 = 2131830965(0x7f1128b5, float:1.9294942E38)
            r0.setMMTitle((int) r1)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.game.ACTION_EXIT"
            r0.addAction(r1)
            com.tencent.mm.ui.MMActivity r1 = r5.f114194a
            android.content.BroadcastReceiver r3 = r5.f114197d
            java.lang.String r4 = com.tencent.p014mm.plugin.game.C4443h.f19181a
            r1.registerReceiver(r3, r0, r4, r2)
            java.lang.Class<xy1.h> r0 = xy1.C53472h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xy1.h r0 = (xy1.C53472h) r0
            com.tencent.mm.sdk.storage.MStorage$IOnStorageChange r1 = r5.f114198e
            r0.mo70729i(r1)
            java.lang.Class<com.tencent.mm.autogen.events.GameMessageStorageNotifyEvent> r0 = com.tencent.p014mm.autogen.events.GameMessageStorageNotifyEvent.class
            java.lang.String r0 = r0.getName()
            com.tencent.mm.pluginsdk.event.IListenerMStorage r1 = r5.f114199f
            com.tencent.p014mm.pluginsdk.event.IListenerMStorage.m48928f(r0, r1)
            com.tencent.mm.sdk.event.IListener r0 = r5.f114200g
            r0.alive()
            com.tencent.mm.ui.MMActivity r0 = r5.f114194a
            r0.setRequestedOrientation(r7)
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 r0 = r5.f114195b
            if (r0 == 0) goto L_0x00ac
            com.tencent.mm.plugin.game.ui.chat_tab.l r1 = new com.tencent.mm.plugin.game.ui.chat_tab.l
            r1.<init>(r0)
            r0.post(r1)
        L_0x00ac:
            com.tencent.mm.ui.MMActivity r0 = r5.f114194a
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131101833(0x7f060889, float:1.7816087E38)
            int r0 = r0.getColor(r1)
            boolean r0 = com.tencent.p014mm.p136ui.C74933u4.m89770g(r0)
            com.tencent.mm.ui.MMActivity r2 = r5.f114194a
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r1)
            r7 = r7 ^ r0
            in3.C46279a.m51577a(r6, r2, r7)
            com.tencent.mm.ui.MMActivity r6 = r5.f114194a
            androidx.appcompat.app.ActionBar r6 = r6.getSupportActionBar()
            android.view.View r6 = r6.mo91099j()
            com.tencent.mm.ui.MMActivity r7 = r5.f114194a
            android.content.res.Resources r7 = r7.getResources()
            int r7 = r7.getColor(r1)
            r6.setBackgroundColor(r7)
            com.tencent.mm.ui.MMActivity r6 = r5.f114194a
            com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$b r7 = new com.tencent.mm.plugin.game.ui.chat_tab.ChatTabPresenter$b
            r7.<init>()
            r6.setBackBtn(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.chat_tab.ChatTabPresenter.mo66286a(android.view.View, com.tencent.mm.plugin.game.ui.chat_tab.q):void");
    }

    /* renamed from: b */
    public void mo66287b() {
        Log.m105924i("MicroMsg.ChatTabPresenter", "onDestroy");
        this.f114194a.unregisterReceiver(this.f114197d);
        ((C53472h) C86312j.m106911c(C53472h.class)).mo70728g(this.f114198e);
        IListenerMStorage.m48929g(GameMessageStorageNotifyEvent.class.getName(), this.f114199f);
        this.f114200g.dead();
        C42298k.m45997b(this.f114194a);
    }

    /* renamed from: c */
    public void mo66288c(Intent intent) {
        this.f114194a.overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
        Log.m105924i("MicroMsg.ChatTabPresenter", "onNewIntent");
        if (intent != null) {
            this.f114194a.setIntent(intent);
            String stringExtra = intent.getStringExtra("game_tab_key");
            String stringExtra2 = intent.getStringExtra("game_red_dot_tab_key");
            GameTabWidget2 gameTabWidget2 = this.f114195b;
            if (gameTabWidget2 != null) {
                gameTabWidget2.mo66333e(stringExtra, stringExtra2);
            }
        }
    }

    /* renamed from: d */
    public void mo66289d() {
        Log.m105924i("MicroMsg.ChatTabPresenter", "onPause");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG, Long.valueOf(((C53472h) C86312j.m106911c(C53472h.class)).mo70731vY().f122564b));
    }

    /* renamed from: e */
    public void mo66290e() {
        Log.m105924i("MicroMsg.ChatTabPresenter", "onResume");
        mo66291f();
        boolean z = true;
        if (((C52735e) C86312j.m106911c(C52735e.class)).mo61266Ad(C32735h.C32737c.clicfg_game_life_preload_profile_url, 0) != 1) {
            z = false;
        }
        if (z) {
            Log.m105924i("MicroMsg.ChatTabPresenter", "preload profile");
            C119179t tVar = C119157j.f356862d;
            C42246c cVar = new C42246c();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(cVar, 500, false);
        }
    }

    /* renamed from: f */
    public final void mo66291f() {
        GameTabWidget2 gameTabWidget2 = this.f114195b;
        if (gameTabWidget2 != null) {
            gameTabWidget2.setChatMsgUnreadRedDot(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.GAME_MSG_BOTTOM_TAB_BOOLEAN_SYNC, false));
        }
    }
}
