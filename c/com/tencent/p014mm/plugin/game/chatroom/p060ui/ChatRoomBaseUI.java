package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.os.Bundle;
import com.tencent.p014mm.autogen.mmdata.rpt.GameChatRoomReportStruct;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.ChatRoomBaseUI */
public abstract class ChatRoomBaseUI extends MMActivity {

    /* renamed from: d */
    public long f112168d = 0;

    /* renamed from: e */
    public long f112169e = 0;

    /* renamed from: f */
    public long f112170f = 0;

    /* renamed from: H7 */
    public abstract long mo65401H7();

    /* renamed from: I7 */
    public abstract long mo65402I7();

    /* renamed from: J7 */
    public abstract long mo65403J7();

    /* renamed from: K7 */
    public abstract long mo65404K7();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C41864d.m45384a(this);
    }

    public void onDestroy() {
        if (this.f112169e != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f112169e;
            C41864d.m45388e(this);
            Log.m105925i("MicroMsg.ChatRoomBaseUI", "visit page(%s), stayTime:%sms, foregroundTime:%sms", getClass().getSimpleName(), Long.valueOf(currentTimeMillis), Long.valueOf(this.f112168d));
            if (mo65401H7() != -1) {
                long H7 = mo65401H7();
                long K7 = mo65404K7();
                long J7 = mo65403J7();
                long I7 = mo65402I7();
                GameChatRoomReportStruct gameChatRoomReportStruct = new GameChatRoomReportStruct();
                gameChatRoomReportStruct.f107903d = H7;
                gameChatRoomReportStruct.f107904e = K7;
                gameChatRoomReportStruct.f107905f = 0;
                gameChatRoomReportStruct.f107906g = 29;
                gameChatRoomReportStruct.f107907h = 0;
                gameChatRoomReportStruct.f107908i = J7;
                gameChatRoomReportStruct.f107909j = I7;
                gameChatRoomReportStruct.f107918s = Util.getLong(C40308d.f108378d, 0);
                gameChatRoomReportStruct.f107920u = gameChatRoomReportStruct.mo86045b("session_id", C41864d.m45385b().getString("session_id"), true);
                gameChatRoomReportStruct.f107921v = C41864d.m45385b().getLong("client_timestamp");
                gameChatRoomReportStruct.mo62727s(C40308d.f108376b);
                gameChatRoomReportStruct.f107916q = this.f112168d / 1000;
                gameChatRoomReportStruct.mo86054n();
            }
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f112168d += System.currentTimeMillis() - this.f112170f;
    }

    public void onResume() {
        if (this.f112169e == 0) {
            this.f112169e = System.currentTimeMillis();
        }
        this.f112170f = System.currentTimeMillis();
        super.onResume();
    }
}
