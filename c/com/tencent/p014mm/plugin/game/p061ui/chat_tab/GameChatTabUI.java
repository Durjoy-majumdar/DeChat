package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.plugin.gamelife.p062ui.GameLifeConversationUI;
import com.tencent.p014mm.plugin.gamelife.p062ui.GameLifeEmptyCoverView;
import com.tencent.p014mm.plugin.gamelife.p062ui.GameLifeLoadingCoverView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import kg3.C76577a;
import vo3.C90852c;
import xy1.C53472h;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI */
public class GameChatTabUI extends GameLifeConversationUI {

    /* renamed from: r */
    public static final /* synthetic */ int f114214r = 0;

    /* renamed from: p */
    public ChatTabPresenter f114215p = null;

    /* renamed from: q */
    public String f114216q;

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI$a */
    public class C42249a implements C42305q {
        public C42249a() {
        }

        /* renamed from: a */
        public void mo66284a(int i) {
            GameChatTabUI gameChatTabUI = GameChatTabUI.this;
            int i2 = GameChatTabUI.f114214r;
            ViewGroup.LayoutParams layoutParams = gameChatTabUI.mo66481H7().f123157a.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.bottomMargin = i;
            }
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams3.topMargin = C76577a.m92151b(gameChatTabUI, 152);
            FrameLayout frameLayout = gameChatTabUI.mo66481H7().f123158b;
            GameLifeLoadingCoverView gameLifeLoadingCoverView = gameChatTabUI.f114700i;
            if (gameLifeLoadingCoverView != null) {
                frameLayout.addView(gameLifeLoadingCoverView, layoutParams3);
                FrameLayout frameLayout2 = gameChatTabUI.mo66481H7().f123158b;
                GameLifeEmptyCoverView gameLifeEmptyCoverView = gameChatTabUI.f114701j;
                if (gameLifeEmptyCoverView != null) {
                    frameLayout2.addView(gameLifeEmptyCoverView, layoutParams3);
                } else {
                    C87412m.m108603p("emptyCoverView");
                    throw null;
                }
            } else {
                C87412m.m108603p("loadingCoverView");
                throw null;
            }
        }

        /* renamed from: b */
        public void mo66285b(String str) {
            GameChatTabUI.this.f114216q = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI$b */
    public class C42250b implements MessageQueue.IdleHandler {
        public C42250b() {
        }

        public boolean queueIdle() {
            if (!GameChatTabUI.this.isDestroyed() && !GameChatTabUI.this.isFinishing()) {
                GameChatTabUI gameChatTabUI = GameChatTabUI.this;
                int i = GameChatTabUI.f114214r;
                gameChatTabUI.getSwipeBackLayout().setEnableGesture(false);
                View findViewById = gameChatTabUI.findViewById(C0966R.C0970id.kai);
                if (findViewById != null) {
                    ((SwipeBackLayout) findViewById).setEnableGesture(false);
                }
            }
            return false;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        ChatTabPresenter chatTabPresenter = this.f114215p;
        if (chatTabPresenter != null) {
            Log.m105924i("MicroMsg.ChatTabPresenter", "onBackPressed");
            C42298k.m45997b(chatTabPresenter.f114194a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ChatTabPresenter chatTabPresenter = this.f114215p;
        if (chatTabPresenter != null) {
            Log.m105924i("MicroMsg.ChatTabPresenter", "onConfigurationChanged");
            chatTabPresenter.f114194a.setRequestedOrientation(1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("game_from_detail_back", false)) {
            overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
        }
        GameTabData2 gameTabData2 = (GameTabData2) getIntent().getParcelableExtra("game_tab_data");
        if (gameTabData2 != null && gameTabData2.f114262d.size() > 1) {
            ChatTabPresenter chatTabPresenter = new ChatTabPresenter(this);
            this.f114215p = chatTabPresenter;
            chatTabPresenter.mo66286a(getContentView(), new C42249a());
        }
        View j = getSupportActionBar().mo91099j();
        if (j != null && (j instanceof LinearLayout)) {
            ViewGroup.LayoutParams layoutParams = j.getLayoutParams();
            layoutParams.width = -1;
            j.setLayoutParams(layoutParams);
            LinearLayout linearLayout = (LinearLayout) j;
            View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.awx, linearLayout, false);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) inflate.getLayoutParams();
            layoutParams2.gravity = 16;
            linearLayout.addView(inflate, layoutParams2);
            inflate.setOnClickListener(new C42292d(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ChatTabPresenter chatTabPresenter = this.f114215p;
        if (chatTabPresenter != null) {
            chatTabPresenter.mo66287b();
        }
    }

    public void onFinish() {
        ChatTabPresenter chatTabPresenter = this.f114215p;
        if (chatTabPresenter != null) {
            Log.m105924i("MicroMsg.ChatTabPresenter", "finishPage");
            C42298k.m45997b(chatTabPresenter.f114194a);
            return;
        }
        finish();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ChatTabPresenter chatTabPresenter = this.f114215p;
        if (chatTabPresenter != null) {
            chatTabPresenter.mo66288c(intent);
        }
    }

    public void onPause() {
        super.onPause();
        ChatTabPresenter chatTabPresenter = this.f114215p;
        if (chatTabPresenter == null) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG, Long.valueOf(((C53472h) C86312j.m106911c(C53472h.class)).mo70731vY().f122564b));
        } else {
            chatTabPresenter.mo66289d();
        }
    }

    public void onResume() {
        super.onResume();
        ChatTabPresenter chatTabPresenter = this.f114215p;
        if (chatTabPresenter != null) {
            chatTabPresenter.mo66290e();
        }
        if (getIntent().getBooleanExtra("disable_game_page_swipe", false)) {
            Looper.myQueue().addIdleHandler(new C42250b());
        }
    }
}
