package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GameChatRoomReportStruct;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.ChatRoomBaseUI;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.model.C42036a0;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jx1.C46577a;
import k20.C60958c;
import k20.C9556a;
import sw1.C48483p;
import sw1.C48484q;
import xy1.C53472h;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI */
public class ChatRoomTabUI extends ChatRoomBaseUI {

    /* renamed from: q */
    public static final /* synthetic */ int f114183q = 0;

    /* renamed from: g */
    public ChatTabPresenter f114184g = null;

    /* renamed from: h */
    public long f114185h;

    /* renamed from: i */
    public long f114186i;

    /* renamed from: j */
    public int f114187j;

    /* renamed from: n */
    public ChatCustomTabActionBar f114188n;

    /* renamed from: o */
    public GameRoomListFragment f114189o;

    /* renamed from: p */
    public GameMsgNoticeFragment f114190p;

    /* renamed from: H7 */
    public long mo65401H7() {
        return 10;
    }

    /* renamed from: I7 */
    public long mo65402I7() {
        return this.f114186i;
    }

    /* renamed from: J7 */
    public long mo65403J7() {
        return this.f114185h;
    }

    /* renamed from: K7 */
    public long mo65404K7() {
        return 1099;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.avg;
    }

    public void onBackPressed() {
        super.onBackPressed();
        ChatTabPresenter chatTabPresenter = this.f114184g;
        if (chatTabPresenter != null) {
            Log.m105924i("MicroMsg.ChatTabPresenter", "onBackPressed");
            C42298k.m45997b(chatTabPresenter.f114194a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ChatTabPresenter chatTabPresenter = this.f114184g;
        if (chatTabPresenter != null) {
            Log.m105924i("MicroMsg.ChatTabPresenter", "onConfigurationChanged");
            chatTabPresenter.f114194a.setRequestedOrientation(1);
        }
    }

    public void onCreate(Bundle bundle) {
        TabLayout.C55061f k;
        C42119w bD;
        Class cls = C48484q.class;
        Bundle extras = getIntent().getExtras();
        boolean z = false;
        if (extras != null) {
            if (!extras.containsKey("game_report_ssid")) {
                getIntent().putExtra("game_report_ssid", (long) getIntent().getIntExtra("game_report_from_scene", 0));
            }
            if (!extras.containsKey("game_report_sourceid")) {
                getIntent().putExtra("game_report_sourceid", 0);
            }
            this.f114187j = getIntent().getIntExtra("game_msg_center_tab_type", C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.GAME_ENTRANCE_MSG_TAB_TYPE_INT_SYNC, 0));
            this.f114185h = getIntent().getLongExtra("game_report_ssid", 0);
            this.f114186i = getIntent().getLongExtra("game_report_sourceid", 0);
        }
        String stringExtra = getIntent().getStringExtra("game_msg_ui_from_msgid");
        String str = "";
        C40308d.f108378d = str;
        if (!Util.isNullOrNil(stringExtra) && (bD = ((C48484q) C86312j.m106911c(cls)).xi0().mo66004bD(stringExtra)) != null) {
            bD.mo66075l2();
            str = bD.f113464Y1.f113521b.f113501a;
            C40308d.f108378d = bD.f113472f2;
        }
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("game_from_detail_back", false)) {
            overridePendingTransition(MMFragmentActivity$$c.f318646c, MMFragmentActivity$$c.f318647d);
        }
        this.f114189o = new GameRoomListFragment(str, this.f114187j != 1);
        this.f114190p = new GameMsgNoticeFragment();
        getSupportActionBar().mo91104o();
        C42291b bVar = new C42291b(getContext(), getSupportFragmentManager());
        GameMsgNoticeFragment gameMsgNoticeFragment = this.f114190p;
        List<Fragment> list = bVar.f114364j;
        C87412m.m108591d(gameMsgNoticeFragment);
        ((ArrayList) list).add(gameMsgNoticeFragment);
        GameRoomListFragment gameRoomListFragment = this.f114189o;
        List<Fragment> list2 = bVar.f114364j;
        C87412m.m108591d(gameRoomListFragment);
        ((ArrayList) list2).add(gameRoomListFragment);
        ViewPager viewPager = (ViewPager) findViewById(C0966R.C0970id.nsh);
        viewPager.setAdapter(bVar);
        GameTabData2 gameTabData2 = (GameTabData2) getIntent().getParcelableExtra("game_tab_data");
        if (gameTabData2 != null && gameTabData2.f114262d.size() > 1) {
            ChatTabPresenter chatTabPresenter = new ChatTabPresenter(this);
            this.f114184g = chatTabPresenter;
            chatTabPresenter.mo66286a(getContentView(), new ChatRoomTabUI$$b(this));
        }
        ChatCustomTabActionBar chatCustomTabActionBar = (ChatCustomTabActionBar) findViewById(C0966R.C0970id.enu);
        this.f114188n = chatCustomTabActionBar;
        chatCustomTabActionBar.setBackBtn(new ChatRoomTabUI$$a(this));
        ChatCustomTabActionBar chatCustomTabActionBar2 = this.f114188n;
        int i = this.f114187j == 1 ? 0 : 1;
        chatCustomTabActionBar2.getClass();
        C72994y1.C72995a aVar = C72994y1.C72995a.GAME_MSG_BOTTOM_TAB_BOOLEAN_SYNC;
        C103853a adapter = viewPager.getAdapter();
        chatCustomTabActionBar2.f114181f.setupWithViewPager(viewPager);
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{MMApplicationContext.getColor(C0966R.color.FG_0), MMApplicationContext.getColor(C0966R.color.FG_1)});
        chatCustomTabActionBar2.f114181f.mo146882a(new C42290a(chatCustomTabActionBar2));
        int i2 = 0;
        while (true) {
            if (i2 >= (adapter != null ? adapter.getCount() : 0) || (k = chatCustomTabActionBar2.f114181f.mo146907k(i2)) == null) {
                viewPager.addOnPageChangeListener(new ChatRoomTabUI$$c(this));
                C85801v1 i3 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_ENABLE_LONG;
            } else {
                k.mo76122c(C0966R.C0971layout.d4x);
                View findViewById = k.f154605f.findViewById(C0966R.C0970id.nsg);
                if (i2 == 0) {
                    C85801v1 i4 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar3 = C72994y1.C72995a.GAME_MSG_NOTIFY_TAB_BOOLEAN_SYNC;
                    if (i4.mo119686g(aVar3, z)) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar4.mo10233c(0);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar4.mo10231a(z ? 1 : 0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar5.mo10233c(8);
                        View view2 = findViewById;
                        C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (i == i2) {
                        k.mo76121b();
                        chatCustomTabActionBar2.mo66279b(k, 1);
                        C9556a aVar6 = new C9556a();
                        aVar6.mo10233c(8);
                        View view3 = findViewById;
                        C117292a.m165358d(view3, aVar6.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C85801v1 i5 = C86709a0.m107535s().mo121142i();
                        Boolean bool = Boolean.FALSE;
                        i5.mo119677K(aVar3, bool);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, bool);
                        ((C48484q) C86312j.m106911c(cls)).xi0().mo66006bO(1);
                        C42036a0 ar = ((C48483p) C86312j.m106911c(C48483p.class)).mo66079ar();
                        C42119w g = ar.mo65978g();
                        if (g != null && g.field_showType == 1) {
                            ar.mo65974c();
                        }
                    }
                } else {
                    C85801v1 i6 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar7 = C72994y1.C72995a.GAME_MSG_CHAT_TAB_BOOLEAN_SYNC;
                    if (i6.mo119686g(aVar7, false)) {
                        C9556a aVar8 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar8.mo10233c(0);
                        View view4 = findViewById;
                        C117292a.m165358d(view4, aVar8.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        C9556a aVar9 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar9.mo10233c(8);
                        View view5 = findViewById;
                        C117292a.m165358d(view5, aVar9.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (i == i2) {
                        k.mo76121b();
                        chatCustomTabActionBar2.mo66279b(k, 1);
                        C9556a aVar10 = new C9556a();
                        aVar10.mo10233c(8);
                        View view6 = findViewById;
                        C117292a.m165358d(view6, aVar10.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "setmTabs", "(Landroidx/viewpager/widget/ViewPager;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C85801v1 i7 = C86709a0.m107535s().mo121142i();
                        Boolean bool2 = Boolean.FALSE;
                        i7.mo119677K(aVar7, bool2);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, bool2);
                        TextView textView = (TextView) k.f154605f.findViewById(C0966R.C0970id.nsf);
                        textView.setText(adapter.getPageTitle(i2));
                        textView.setTextColor(colorStateList);
                        i2++;
                        z = false;
                    }
                }
                TextView textView2 = (TextView) k.f154605f.findViewById(C0966R.C0970id.nsf);
                textView2.setText(adapter.getPageTitle(i2));
                textView2.setTextColor(colorStateList);
                i2++;
                z = false;
            }
        }
        viewPager.addOnPageChangeListener(new ChatRoomTabUI$$c(this));
        C85801v1 i35 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar22 = C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_ENABLE_LONG;
        if (Util.nullAsNil((Long) i35.mo119685f(aVar22, 0L)) == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar22, Long.valueOf(Util.nowSecond()));
        }
        long j = this.f114185h;
        GameChatRoomReportStruct gameChatRoomReportStruct = new GameChatRoomReportStruct();
        gameChatRoomReportStruct.f107903d = 10;
        gameChatRoomReportStruct.f107904e = 0;
        gameChatRoomReportStruct.f107905f = 0;
        gameChatRoomReportStruct.f107906g = 1;
        gameChatRoomReportStruct.f107907h = 0;
        gameChatRoomReportStruct.f107908i = j;
        gameChatRoomReportStruct.f107909j = 0;
        gameChatRoomReportStruct.f107918s = Util.getLong(C40308d.f108378d, 0);
        gameChatRoomReportStruct.f107920u = gameChatRoomReportStruct.mo86045b("session_id", C41864d.m45385b().getString("session_id"), true);
        gameChatRoomReportStruct.f107921v = C41864d.m45385b().getLong("client_timestamp");
        gameChatRoomReportStruct.mo86054n();
        if (getBounceView() != null) {
            getBounceView().setStart2EndBgColor(getResources().getColor(C0966R.color.al8));
            ((NestedBounceView) getBounceView()).f319699n &= -3;
        }
    }

    public void onDestroy() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_ENTRANCE_MSG_TAB_TYPE_INT_SYNC, Integer.valueOf(this.f114188n.getmTabs().getSelectedTabPosition() + 1));
        super.onDestroy();
        C40308d.f108378d = "";
        ChatTabPresenter chatTabPresenter = this.f114184g;
        if (chatTabPresenter != null) {
            chatTabPresenter.mo66287b();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ChatTabPresenter chatTabPresenter = this.f114184g;
        if (chatTabPresenter != null) {
            chatTabPresenter.mo66288c(intent);
        }
    }

    public void onPause() {
        super.onPause();
        C46577a aVar = C46577a.f125473d;
        C46577a.f125474e.f124306o = 2;
        ChatTabPresenter chatTabPresenter = this.f114184g;
        if (chatTabPresenter == null) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG, Long.valueOf(((C53472h) C86312j.m106911c(C53472h.class)).mo70731vY().f122564b));
        } else {
            chatTabPresenter.mo66289d();
        }
    }

    public void onResume() {
        TabLayout.C55061f k;
        ChatCustomTabActionBar chatCustomTabActionBar = this.f114188n;
        int i = 0;
        while (i < chatCustomTabActionBar.f114181f.getTabCount() && (k = chatCustomTabActionBar.f114181f.mo146907k(i)) != null) {
            View findViewById = k.f154605f.findViewById(C0966R.C0970id.nsg);
            if (i == 0) {
                if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.GAME_MSG_NOTIFY_TAB_BOOLEAN_SYNC, false)) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "updateRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "updateRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = findViewById;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "updateRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "updateRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.GAME_MSG_CHAT_TAB_BOOLEAN_SYNC, false)) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view3 = findViewById;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "updateRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "updateRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "updateRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "updateRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i++;
        }
        super.onResume();
        C46577a aVar5 = C46577a.f125473d;
        C46577a.f125474e.f124306o = 1;
        ChatTabPresenter chatTabPresenter = this.f114184g;
        if (chatTabPresenter != null) {
            chatTabPresenter.mo66290e();
        }
    }

    public boolean supportNavigationSwipeBack() {
        return !getIntent().getBooleanExtra("disable_game_page_swipe", false);
    }
}
