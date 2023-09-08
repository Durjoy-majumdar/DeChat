package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.game.model.C42114u;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.p061ui.tab.GameRouteUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86737h0;
import h81.C32735h;
import j20.C117292a;
import k20.C9556a;
import nj3.C88989a;
import ob0.C47350c;
import ob0.C89144l0;
import py1.C47563d1;
import py1.C47641o2;
import py1.C47648p2;
import rw1.C48094b;
import sw1.C48483p;
import uy1.C52638a;
import uy1.C52642c;
import v10.C52735e;

@C86737h0
@C88989a(19)
/* renamed from: com.tencent.mm.plugin.game.ui.GameCenterUI */
public class GameCenterUI extends MMBaseActivity {
    /* renamed from: E7 */
    public final void mo66136E7(boolean z) {
        Intent intent = new Intent(this, GameRouteUI.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpNativeIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpNativeIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (z) {
            overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
        } else {
            overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
        }
        if (getIntent().getBooleanExtra("from_find_more_friend", false)) {
            C42114u.m45829f(6, false, (String) null);
        }
        C115669n.INSTANCE.idkeyStat(848, 4, 1, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (r11 != null) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0254  */
    /* renamed from: F7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66137F7(boolean r34) {
        /*
            r33 = this;
            r1 = r33
            boolean r0 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.isGPVersion()
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "MicroMsg.GameCenterUI"
            java.lang.String r2 = "GP version"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 848(0x350, double:4.19E-321)
            r6 = 13
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            r33.mo66136E7(r34)
            r6 = r1
            goto L_0x0491
        L_0x0021:
            android.content.Intent r2 = r33.getIntent()
            java.lang.Class<xy1.h> r3 = xy1.C53472h.class
            java.lang.Class<sw1.p> r4 = sw1.C48483p.class
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x0031
        L_0x002d:
            r6 = r1
            r5 = 0
            goto L_0x048c
        L_0x0031:
            java.lang.String r0 = "from_find_more_friend"
            boolean r7 = r2.getBooleanExtra(r0, r6)
            java.lang.String r8 = "game_report_from_scene"
            int r8 = r2.getIntExtra(r8, r6)
            java.lang.String r9 = "has_game_life_chat_msg"
            boolean r9 = r2.getBooleanExtra(r9, r6)
            if (r7 == 0) goto L_0x0057
            if (r9 != 0) goto L_0x0057
            di3.d r11 = di3.C86312j.m106911c(r4)
            sw1.p r11 = (sw1.C48483p) r11
            com.tencent.mm.plugin.game.model.a0 r11 = r11.mo66079ar()
            com.tencent.mm.plugin.game.model.w r11 = r11.mo65979h()
            r14 = r11
            goto L_0x0058
        L_0x0057:
            r14 = 0
        L_0x0058:
            r2.putExtra(r0, r5)
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 r0 = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2
            r0.<init>()
            com.tencent.p014mm.plugin.game.commlib.C41853c.m45371e()
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r11 = com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a
            if (r11 == 0) goto L_0x006c
            py1.q0 r11 = r11.GameCenterTabSetting
            if (r11 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006c:
            com.tencent.p014mm.plugin.game.commlib.C41853c.m45381o()
        L_0x006f:
            r11 = 0
        L_0x0070:
            java.lang.String r12 = "MicroMsg.GameTabData2"
            if (r11 == 0) goto L_0x00c6
            java.util.LinkedList<py1.b5> r13 = r11.f127940e
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r13)
            if (r13 != 0) goto L_0x00c6
            java.util.LinkedList<py1.b5> r13 = r11.f127940e
            java.util.Iterator r13 = r13.iterator()
        L_0x0082:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x00c6
            java.lang.Object r15 = r13.next()
            py1.b5 r15 = (py1.C47553b5) r15
            r16 = r7
            long r6 = r15.f127606d
            r18 = r11
            long r10 = r15.f127607e
            r19 = 0
            int r21 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r21 != 0) goto L_0x00a1
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00a1:
            long r19 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r21 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r21 < 0) goto L_0x00c0
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r19 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r19 <= 0) goto L_0x00b2
            goto L_0x00c0
        L_0x00b2:
            py1.v4 r6 = r15.f127608f
            boolean r6 = com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2.m45938c(r0, r6)
            if (r6 == 0) goto L_0x00c0
            java.lang.String r6 = "Get GameTabData from TabStyleList"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            goto L_0x00f8
        L_0x00c0:
            r7 = r16
            r11 = r18
            r6 = 0
            goto L_0x0082
        L_0x00c6:
            r16 = r7
            r18 = r11
            if (r18 == 0) goto L_0x00dc
            r10 = r18
            py1.v4 r6 = r10.f127939d
            boolean r6 = com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2.m45938c(r0, r6)
            if (r6 == 0) goto L_0x00dc
            java.lang.String r6 = "Get GameTabData from globalConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            goto L_0x00f8
        L_0x00dc:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ef }
            java.lang.String r7 = com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2.f114261h     // Catch:{ JSONException -> 0x00ef }
            r6.<init>(r7)     // Catch:{ JSONException -> 0x00ef }
            boolean r6 = com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2.m45939d(r0, r6)     // Catch:{ JSONException -> 0x00ef }
            if (r6 == 0) goto L_0x00f7
            java.lang.String r6 = "Get GameTabData from local"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)     // Catch:{ JSONException -> 0x00ef }
            goto L_0x00f8
        L_0x00ef:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            if (r0 != 0) goto L_0x00fc
            goto L_0x002d
        L_0x00fc:
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b r6 = r0.f114262d
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
            java.lang.String r7 = ""
            r11 = r7
            r10 = 1
        L_0x010a:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x0163
            java.lang.Object r12 = r6.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getValue()
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItem r13 = (com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2.TabItem) r13
            if (r13 == 0) goto L_0x010a
            java.lang.String r15 = r13.f114278r
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x014d
            java.lang.String r15 = r13.f114278r
            java.lang.String r10 = com.tencent.p014mm.plugin.game.model.C42114u.m45824a(r15, r14, r2, r10)
            r13.f114278r = r10
            java.lang.String r10 = r13.f114267d
            java.lang.String r15 = "profile"
            boolean r10 = android.text.TextUtils.equals(r10, r15)
            if (r10 == 0) goto L_0x014c
            java.lang.String r10 = "key_game_profile_tab_type"
            boolean r15 = r2.hasExtra(r10)
            if (r15 == 0) goto L_0x014c
            java.lang.String r10 = r2.getStringExtra(r10)
            java.lang.String r15 = r13.f114278r
            java.lang.String r10 = com.tencent.p014mm.plugin.game.model.C42114u.m45825b(r15, r10)
            r13.f114278r = r10
        L_0x014c:
            r10 = 0
        L_0x014d:
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b r15 = r0.f114262d
            java.lang.Object r12 = r12.getKey()
            java.lang.String r12 = (java.lang.String) r12
            r15.put(r12, r13)
            int r12 = r13.f114277q
            if (r12 != r5) goto L_0x010a
            java.lang.String r11 = r13.f114267d
            if (r9 == 0) goto L_0x010a
            r0.f114263e = r11
            goto L_0x010a
        L_0x0163:
            if (r16 == 0) goto L_0x0176
            if (r9 != 0) goto L_0x0176
            di3.d r4 = di3.C86312j.m106911c(r4)
            sw1.p r4 = (sw1.C48483p) r4
            com.tencent.mm.plugin.game.model.a0 r4 = r4.mo66079ar()
            com.tencent.mm.plugin.game.model.w r4 = r4.mo65982k()
            goto L_0x0177
        L_0x0176:
            r4 = 0
        L_0x0177:
            java.lang.String r6 = "chat"
            if (r4 == 0) goto L_0x01b4
            if (r9 != 0) goto L_0x01b4
            r4.mo66075l2()
            com.tencent.mm.plugin.game.model.w$r r10 = r4.f113465Z1
            java.lang.String r10 = r10.f113554a
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x01b4
            com.tencent.mm.plugin.game.model.w$r r10 = r4.f113465Z1
            java.lang.String r10 = r10.f113554a
            boolean r10 = android.text.TextUtils.equals(r10, r6)
            if (r10 == 0) goto L_0x01a2
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b r10 = r0.f114262d
            com.tencent.mm.plugin.game.model.w$r r12 = r4.f113465Z1
            java.lang.String r12 = r12.f113554a
            boolean r10 = r10.containsKey(r12)
            if (r10 != 0) goto L_0x01a2
            r10 = 1
            goto L_0x01b5
        L_0x01a2:
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b r10 = r0.f114262d
            com.tencent.mm.plugin.game.model.w$r r12 = r4.f113465Z1
            java.lang.String r12 = r12.f113554a
            boolean r10 = r10.containsKey(r12)
            if (r10 == 0) goto L_0x01b4
            com.tencent.mm.plugin.game.model.w$r r10 = r4.f113465Z1
            java.lang.String r10 = r10.f113554a
            r0.f114263e = r10
        L_0x01b4:
            r10 = 0
        L_0x01b5:
            if (r4 == 0) goto L_0x01cc
            r4.mo66075l2()
            java.lang.String r12 = r4.field_gameMsgId
            java.lang.String r13 = "game_tab_entrance_msgid"
            r2.putExtra(r13, r12)
            com.tencent.mm.plugin.game.model.w$h r12 = r4.f113464Y1
            com.tencent.mm.plugin.game.model.w$a r12 = r12.f113521b
            java.lang.String r12 = r12.f113501a
            java.lang.String r13 = "game_msg_top_chatroom_name"
            r2.putExtra(r13, r12)
        L_0x01cc:
            java.lang.String r12 = "default_game_tab_key"
            java.lang.String r12 = r2.getStringExtra(r12)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x01e2
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b r13 = r0.f114262d
            boolean r13 = r13.containsKey(r12)
            if (r13 == 0) goto L_0x01e2
            r0.f114263e = r12
        L_0x01e2:
            java.lang.String r12 = "default_game_tab_chat_type"
            r13 = 0
            boolean r12 = r2.getBooleanExtra(r12, r13)
            if (r12 == 0) goto L_0x01f3
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r12 != 0) goto L_0x01f3
            r0.f114263e = r11
        L_0x01f3:
            java.lang.Class<sw1.q> r11 = sw1.C48484q.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            sw1.q r11 = (sw1.C48484q) r11
            com.tencent.mm.plugin.game.model.b0 r11 = r11.xi0()
            r11.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "select * from GameRawMessage where redDotExpireTime>"
            r12.append(r13)
            r13 = r6
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r12.append(r5)
            java.lang.String r5 = " and "
            r12.append(r5)
            java.lang.String r5 = "isRead"
            r12.append(r5)
            java.lang.String r5 = "=0 and "
            r12.append(r5)
            java.lang.String r5 = "isHidden"
            r12.append(r5)
            java.lang.String r5 = "=0 order by "
            r12.append(r5)
            java.lang.String r5 = "redDotExpireTime"
            r12.append(r5)
            java.lang.String r5 = " desc"
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            r6 = 1
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r6 = 0
            r12[r6] = r5
            java.lang.String r15 = "MicroMsg.GameMessageStorage"
            r19 = r7
            java.lang.String r7 = "getTabRedDotMsg sql:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r7, r12)
            java.lang.String[] r7 = new java.lang.String[r6]
            android.database.Cursor r5 = r11.rawQuery(r5, r7)
            if (r5 != 0) goto L_0x0254
            r6 = 0
            goto L_0x027c
        L_0x0254:
            boolean r6 = r5.moveToFirst()
            if (r6 == 0) goto L_0x0278
        L_0x025a:
            com.tencent.mm.plugin.game.model.w r6 = new com.tencent.mm.plugin.game.model.w
            r6.<init>()
            r6.convertFrom(r5)
            if (r4 != 0) goto L_0x0266
            r15 = r6
            goto L_0x0276
        L_0x0266:
            long r11 = r6.field_msgId
            r15 = r6
            long r6 = r4.field_msgId
            int r20 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r20 == 0) goto L_0x0270
            goto L_0x0276
        L_0x0270:
            boolean r6 = r5.moveToNext()
            if (r6 != 0) goto L_0x025a
        L_0x0276:
            r6 = r15
            goto L_0x0279
        L_0x0278:
            r6 = 0
        L_0x0279:
            r5.close()
        L_0x027c:
            if (r6 == 0) goto L_0x0291
            r6.mo66075l2()
            com.tencent.mm.plugin.game.model.w$r r5 = r6.f113465Z1
            java.lang.String r5 = r5.f113555b
            java.lang.String r7 = "game_red_dot_tab_key"
            r2.putExtra(r7, r5)
            java.lang.String r5 = r6.field_gameMsgId
            java.lang.String r6 = "game_tab_red_dot_msgid"
            r2.putExtra(r6, r5)
        L_0x0291:
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b r5 = r0.f114262d
            java.lang.String r6 = r0.f114263e
            java.lang.Object r5 = r5.get(r6)
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItem r5 = (com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2.TabItem) r5
            if (r5 != 0) goto L_0x029f
            goto L_0x002d
        L_0x029f:
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r5.f114267d
            r11 = 0
            r6[r11] = r7
            int r7 = r5.f114277q
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11 = 1
            r6[r11] = r7
            r7 = 2
            java.lang.String r11 = r0.mo66312e()
            r6[r7] = r11
            java.lang.String r7 = "MicroMsg.GameEntranceChecker"
            java.lang.String r11 = "gamelog.activity, GameEntranceChecker, jump, defaultKey:%s, tabType:%d, gameTabData:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r6)
            py1.d1 r6 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45373g()
            if (r6 == 0) goto L_0x0322
            py1.d1 r6 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45373g()
            boolean r6 = r6.f127637h
            if (r6 == 0) goto L_0x0322
            java.lang.String r6 = r5.f114278r
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0322
            java.lang.String r6 = r5.f114278r
            jy1.b r11 = jy1.C46582b.f125486a
            java.lang.String r11 = "url"
            gy3.C87412m.m108594g(r6, r11)
            long r11 = java.lang.System.currentTimeMillis()
            rc.i r15 = jy1.C46582b.f125488c
            r20 = r3
            jy1.b r3 = jy1.C46582b.f125486a
            ny3.m<java.lang.Object>[] r21 = jy1.C46582b.f125487b
            r17 = 0
            r1 = r21[r17]
            r21 = r8
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r15.mo124239c(r3, r1, r8)
            jy1.C46582b.m51904b(r17)
            py1.g2 r1 = new py1.g2
            r1.<init>()
            r1.f127711d = r6
            ob0.c$b r3 = new ob0.c$b
            r3.<init>()
            java.lang.String r6 = "/cgi-bin/mmgame-bin/getgameindexpreload"
            r3.f127068c = r6
            r6 = 5089(0x13e1, float:7.131E-42)
            r3.f127069d = r6
            r3.f127066a = r1
            py1.h2 r1 = new py1.h2
            r1.<init>()
            r3.f127067b = r1
            ob0.c r1 = r3.mo72403a()
            jy1.c r3 = new jy1.c
            r3.<init>(r11)
            r6 = 0
            ob0.C89144l0.m111429e(r1, r3, r6)
            goto L_0x0326
        L_0x0322:
            r20 = r3
            r21 = r8
        L_0x0326:
            if (r9 != 0) goto L_0x032a
            if (r10 == 0) goto L_0x035a
        L_0x032a:
            java.lang.String r1 = r0.f114263e
            boolean r1 = android.text.TextUtils.equals(r1, r13)
            if (r1 != 0) goto L_0x035a
            java.lang.String r1 = "game_has_entrance_info"
            r3 = 1
            r2.putExtra(r1, r3)
            if (r4 == 0) goto L_0x0355
            sw1.i$b r1 = new sw1.i$b
            r1.<init>()
            com.tencent.mm.plugin.game.model.w$k r3 = r4.f113491q1
            java.lang.String r6 = r3.f113528b
            r1.f129672a = r6
            java.lang.String r3 = r3.f113529c
            r1.f129673b = r3
            java.lang.String r3 = r4.f113472f2
            r1.f129674c = r3
            int r3 = r4.field_msgType
            r1.f129675d = r3
            sw1.i r3 = sw1.C48467i.C48470c.f129676a
            r3.f129671a = r1
        L_0x0355:
            java.lang.String r1 = "hasEntranceInfo  = true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x035a:
            java.lang.String r1 = "game_tab_key"
            java.lang.String r3 = "game_tab_data"
            if (r16 == 0) goto L_0x046a
            if (r4 == 0) goto L_0x037a
            r4.mo66075l2()
            int r6 = r4.f113470e2
            r8 = 107(0x6b, float:1.5E-43)
            if (r6 != r8) goto L_0x0371
            java.lang.String r6 = "from_download_floagt_ball_shutdown_entrance"
            r8 = 1
            r2.putExtra(r6, r8)
        L_0x0371:
            com.tencent.mm.plugin.game.model.w$h r4 = r4.f113464Y1
            com.tencent.mm.plugin.game.model.w$a r4 = r4.f113521b
            java.lang.String r4 = r4.f113502b
            r23 = r4
            goto L_0x037c
        L_0x037a:
            r23 = 0
        L_0x037c:
            r13 = 1
            java.lang.String r4 = r5.f114278r
            java.lang.String r12 = "game_center_entrance"
            r11 = r2
            r15 = r21
            r16 = r4
            com.tencent.p014mm.plugin.game.model.C42114u.m45826c(r11, r12, r13, r14, r15, r16)
            r2.putExtra(r3, r0)
            java.lang.String r0 = r0.f114263e
            r2.putExtra(r1, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r23)
            if (r0 != 0) goto L_0x03b5
            zw1.b$a r0 = new zw1.b$a
            r4 = r21
            long r3 = (long) r4
            r27 = 0
            java.lang.String r24 = ""
            r22 = r0
            r25 = r3
            r22.<init>(r23, r24, r25, r27)
            java.lang.Class<zw1.b> r1 = zw1.C16408b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            zw1.b r1 = (zw1.C16408b) r1
            r6 = r33
            r1.mo14868GB(r6, r0)
            goto L_0x03bb
        L_0x03b5:
            r1 = 1
            r6 = r33
            com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabWidget2.m45946d(r6, r5, r1)
        L_0x03bb:
            if (r9 == 0) goto L_0x0461
            java.lang.String r0 = "game_life_msg_count"
            r1 = 0
            int r0 = r2.getIntExtra(r0, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            di3.d r2 = di3.C86312j.m106911c(r20)
            xy1.h r2 = (xy1.C53472h) r2
            cz1.d r2 = r2.mo70731vY()
            java.lang.String r3 = "chatmsg_num"
            if (r2 != 0) goto L_0x03ea
            java.lang.String r2 = "interactive"
            java.lang.String r4 = "20002"
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x03e5 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x03e5 }
            r1.put(r3, r0)     // Catch:{ JSONException -> 0x03e5 }
        L_0x03e5:
            r0 = 200(0xc8, float:2.8E-43)
            r29 = 200(0xc8, float:2.8E-43)
            goto L_0x040c
        L_0x03ea:
            int r4 = r2.f122566d
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0401 }
            java.lang.String r2 = r2.f122565c     // Catch:{ JSONException -> 0x0401 }
            r5.<init>(r2)     // Catch:{ JSONException -> 0x0401 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x03fe }
            r5.put(r3, r0)     // Catch:{ JSONException -> 0x03fe }
            r29 = r4
            r1 = r5
            goto L_0x040c
        L_0x03fe:
            r0 = move-exception
            r1 = r5
            goto L_0x0402
        L_0x0401:
            r0 = move-exception
        L_0x0402:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r19
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r3, r2)
            r29 = r4
        L_0x040c:
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.String r32 = com.tencent.p014mm.game.report.C40314g.m43482a(r1, r1, r0, r1)
            android.content.Context r21 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r22 = 9
            r23 = 901(0x385, float:1.263E-42)
            r24 = 1
            r25 = 6
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            com.tencent.p014mm.game.report.C40314g.m43485d(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG
            di3.d r2 = di3.C86312j.m106911c(r20)
            xy1.h r2 = (xy1.C53472h) r2
            cz1.d r2 = r2.mo70731vY()
            long r2 = r2.f122564b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo119677K(r1, r2)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LAST_CLICK_GAME_REDDOT_TIME_LONG
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo119677K(r1, r2)
            goto L_0x0468
        L_0x0461:
            r0 = 7
            java.lang.String r1 = r5.f114278r
            r2 = 1
            com.tencent.p014mm.plugin.game.model.C42114u.m45829f(r0, r2, r1)
        L_0x0468:
            r1 = 1
            goto L_0x048b
        L_0x046a:
            r6 = r33
            r4 = r21
            java.lang.String r8 = "gamelog.activity, GameEntranceChecker, jump, not from finder, may be auto jump"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            r13 = 0
            java.lang.String r7 = r5.f114278r
            java.lang.String r12 = "game_center_entrance"
            r11 = r2
            r15 = r4
            r16 = r7
            com.tencent.p014mm.plugin.game.model.C42114u.m45826c(r11, r12, r13, r14, r15, r16)
            r2.putExtra(r3, r0)
            java.lang.String r0 = r0.f114263e
            r2.putExtra(r1, r0)
            r1 = 1
            com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabWidget2.m45946d(r6, r5, r1)
        L_0x048b:
            r5 = 1
        L_0x048c:
            if (r5 != 0) goto L_0x0491
            r33.mo66136E7(r34)
        L_0x0491:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameCenterUI.mo66137F7(boolean):void");
    }

    public void onCreate(Bundle bundle) {
        Class cls = C48483p.class;
        super.onCreate(bundle);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C47641o2();
        bVar.f127067b = new C47648p2();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getusergamecenteraccountinfo";
        bVar.f127069d = 5087;
        C89144l0.m111429e(bVar.mo72403a(), C48094b.f128948d, false);
        getIntent().putExtra("gamecenterui_createtime", System.currentTimeMillis());
        Log.m105924i("MicroMsg.GameCenterUI", "gamelog.activity, GameCenterUI, onCreate, time: " + System.currentTimeMillis());
        if (getIntent().getIntExtra("game_report_from_scene", 0) == 901) {
            C52638a.C52641c cVar = C52638a.C52640b.f146975a.f146973c;
            cVar.f146976a = 0;
            cVar.f146977b = 0;
            cVar.f146978c = 0;
            cVar.f146979d = 0;
            cVar.f146976a = System.currentTimeMillis();
            C52638a.C52640b.f146975a.f146973c.f146979d = System.currentTimeMillis();
        }
        if (getIntent().getBooleanExtra("game_check_float", false)) {
            int intExtra = getIntent().getIntExtra("game_sourceScene", 0);
            C42119w j = ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65981j();
            if (j != null) {
                j.mo66075l2();
                if (!Util.isNullOrNil(j.f113442C1.f113503a)) {
                    C52642c.m58999q(getBaseContext(), j, "game_center_h5_floatlayer");
                }
            }
            C42114u.m45828e(j, intExtra, 1);
            finish();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("switch_country_no_anim", false);
        C47563d1 g = C41853c.m45373g();
        if (g == null) {
            mo66137F7(booleanExtra);
        } else {
            int i = g.f127633d;
            if (i == 0) {
                mo66137F7(booleanExtra);
            } else if (i != 1) {
                if (i == 2) {
                    Intent intent = new Intent(this, GameOverSeaCenterUI.class);
                    Bundle extras = getIntent().getExtras();
                    if (extras != null) {
                        intent.putExtras(extras);
                    }
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpToForeignerIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpToForeignerIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    if (booleanExtra) {
                        overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
                    } else {
                        overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
                    }
                    if (getIntent().getBooleanExtra("from_find_more_friend", false)) {
                        C42114u.m45829f(6, false, (String) null);
                    }
                    C115669n.INSTANCE.idkeyStat(848, 5, 1, false);
                } else if (i == 3) {
                    Intent intent2 = new Intent(this, GameDownloadGuidanceUI.class);
                    Bundle extras2 = getIntent().getExtras();
                    if (extras2 != null) {
                        intent2.putExtras(extras2);
                    }
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent2);
                    C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpToDownloadGuidanceIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/game/ui/GameCenterUI", "jumpToDownloadGuidanceIndex", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    if (booleanExtra) {
                        overridePendingTransition(C0966R.C0968anim.f2426cr, C0966R.C0968anim.f2426cr);
                    } else {
                        overridePendingTransition(MMFragmentActivity$$c.f318644a, MMFragmentActivity$$c.f318645b);
                    }
                    if (getIntent().getBooleanExtra("from_find_more_friend", false)) {
                        C42114u.m45829f(6, false, (String) null);
                    }
                    C115669n.INSTANCE.idkeyStat(848, 6, 1, false);
                } else if (i != 4) {
                    mo66137F7(booleanExtra);
                } else {
                    mo66136E7(booleanExtra);
                }
            } else if (!Util.isNullOrNil(g.f127634e)) {
                String str = g.f127634e;
                getIntent().putExtra("rawUrl", str);
                if (((C52735e) C86312j.m106911c(C52735e.class)).mo61269fe(C32735h.C32737c.game_luggage, true)) {
                    Intent intent3 = getIntent();
                    if (!Util.isNullOrNil(str) && intent3 != null) {
                        boolean booleanExtra2 = intent3.getBooleanExtra("from_find_more_friend", false);
                        int intExtra2 = intent3.getIntExtra("game_report_from_scene", 0);
                        C42119w h = ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65979h();
                        String a = C42114u.m45824a(str, h, intent3, true);
                        intent3.putExtra("rawUrl", a);
                        intent3.putExtra("from_find_more_friend", true);
                        if (booleanExtra2) {
                            C42119w k = ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65982k();
                            if (k != null) {
                                k.mo66075l2();
                                if (k.f113470e2 == 107) {
                                    intent3.putExtra("from_download_floagt_ball_shutdown_entrance", true);
                                }
                            }
                            C42114u.m45826c(intent3, "game_center_entrance", true, h, intExtra2, a);
                            C52642c.m58980A(intent3, this);
                            C42114u.m45829f(7, true, a);
                        } else {
                            C42114u.m45826c(intent3, "game_center_entrance", false, h, intExtra2, a);
                            C52642c.m58980A(intent3, this);
                        }
                    }
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(848, 3, 1, false);
                    nVar.idkeyStat(848, 9, 1, false);
                } else {
                    Intent intent4 = getIntent();
                    if (!Util.isNullOrNil(str) && intent4 != null) {
                        boolean booleanExtra3 = intent4.getBooleanExtra("from_find_more_friend", false);
                        int intExtra3 = intent4.getIntExtra("game_report_from_scene", 0);
                        C42119w h2 = ((C48483p) C86312j.m106911c(cls)).mo66079ar().mo65979h();
                        String a2 = C42114u.m45824a(str, h2, intent4, true);
                        intent4.putExtra("rawUrl", a2);
                        if (booleanExtra3) {
                            C42114u.m45827d(this, intent4, "game_center_entrance", true, h2, intExtra3);
                            C42114u.m45829f(7, true, a2);
                        } else {
                            C42114u.m45827d(this, intent4, "game_center_entrance", false, h2, intExtra3);
                        }
                    }
                    C115669n.INSTANCE.idkeyStat(848, 3, 1, false);
                }
                MMApplicationContext.getContext().getSharedPreferences("game_center_pref", 0).edit().putLong("game_index_last_visit_time", System.currentTimeMillis()).commit();
            } else {
                mo66137F7(booleanExtra);
            }
        }
        finish();
    }
}
