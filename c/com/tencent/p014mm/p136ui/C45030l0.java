package com.tencent.p014mm.p136ui;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.tencent.p014mm.autogen.events.QueryGameLifeMsgEvent;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import sw1.C48477m;
import tl3.C78039a;

/* renamed from: com.tencent.mm.ui.l0 */
public class C45030l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ QueryGameLifeMsgEvent f122128d;

    /* renamed from: e */
    public final /* synthetic */ FindMoreFriendsUI f122129e;

    public C45030l0(FindMoreFriendsUI findMoreFriendsUI, QueryGameLifeMsgEvent queryGameLifeMsgEvent) {
        this.f122129e = findMoreFriendsUI;
        this.f122128d = queryGameLifeMsgEvent;
    }

    public void run() {
        FindMoreFriendsUI findMoreFriendsUI = this.f122129e;
        QueryGameLifeMsgEvent queryGameLifeMsgEvent = this.f122128d;
        NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) findMoreFriendsUI.f55702t.mo72519a("more_tab_game_recommend");
        if (normalIconNewTipPreference != null) {
            normalIconNewTipPreference.mo96252c0();
            if (C41853c.m45380n().booleanValue()) {
                findMoreFriendsUI.mo25872C0(normalIconNewTipPreference, 8, 8, 8, false, 8, 8, 8);
                Log.m105924i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, gamemsg handleUpdateGameLife but in silenceMode.");
                return;
            }
            if (!Util.isNullOrNil(queryGameLifeMsgEvent.f107703d.f107705b)) {
                normalIconNewTipPreference.mo101939Y(queryGameLifeMsgEvent.f107703d.f107705b, -1, Color.parseColor("#8c8c8c"));
            }
            if (!Util.isNullOrNil(queryGameLifeMsgEvent.f107703d.f107706c)) {
                normalIconNewTipPreference.mo101930L((Bitmap) null);
                C78039a.m94189a(normalIconNewTipPreference.f215051L, queryGameLifeMsgEvent.f107703d.f107706c);
                findMoreFriendsUI.mo25872C0(normalIconNewTipPreference, 8, 8, 0, false, 0, 0, 0);
            } else {
                findMoreFriendsUI.mo25872C0(normalIconNewTipPreference, 8, 8, 0, false, 8, 8, 8);
            }
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GAME_LIFE_REPORTED_MSG_ID_LONG;
            if (Util.nullAsNil((Long) i.mo119685f(aVar, 0L)) != queryGameLifeMsgEvent.f107703d.f107708e) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(queryGameLifeMsgEvent.f107703d.f107708e));
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.GAME_MSG_CHAT_TAB_BOOLEAN_SYNC;
                Boolean bool = Boolean.TRUE;
                i2.mo119677K(aVar2, bool);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_MSG_BOTTOM_TAB_BOOLEAN_SYNC, bool);
                C48477m a = C48477m.C13789a.m13091a();
                if (a != null) {
                    Log.m105925i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, report, gamelife exposure | unreadcount:%d", Integer.valueOf(queryGameLifeMsgEvent.f107703d.f107707d));
                    a.Q70(4, queryGameLifeMsgEvent.f107703d.f107707d);
                }
            }
            Log.m105925i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, gamelife complete | unreadcount:%d ｜title:%s", Integer.valueOf(queryGameLifeMsgEvent.f107703d.f107707d), queryGameLifeMsgEvent.f107703d.f107705b);
            findMoreFriendsUI.f55669D = true;
            findMoreFriendsUI.f55671F = queryGameLifeMsgEvent.f107703d.f107707d;
        }
    }
}
