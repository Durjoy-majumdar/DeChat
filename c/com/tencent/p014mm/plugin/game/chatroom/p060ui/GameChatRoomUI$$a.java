package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.text.TextUtils;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BgPagInfo;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI$$a */
public final /* synthetic */ class GameChatRoomUI$$a implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ GameChatRoomUI f112271d;

    /* renamed from: e */
    public final /* synthetic */ BgPagInfo f112272e;

    public /* synthetic */ GameChatRoomUI$$a(GameChatRoomUI gameChatRoomUI, BgPagInfo bgPagInfo) {
        this.f112271d = gameChatRoomUI;
        this.f112272e = bgPagInfo;
    }

    public final void onChanged(Object obj) {
        GameChatRoomUI gameChatRoomUI = this.f112271d;
        BgPagInfo bgPagInfo = this.f112272e;
        C13604l lVar = (C13604l) obj;
        int i = GameChatRoomUI.f112171i1;
        gameChatRoomUI.getClass();
        int i2 = bgPagInfo.play_time;
        if (!((Boolean) lVar.f38555d).booleanValue()) {
            gameChatRoomUI.mo65411T7(gameChatRoomUI.f112217i, true);
            gameChatRoomUI.f112202X0.setVisibility(8);
            return;
        }
        gameChatRoomUI.f112229w.setVisibility(8);
        gameChatRoomUI.f112202X0.setVisibility(0);
        String str = (String) lVar.f38556e;
        if (!TextUtils.equals(str, gameChatRoomUI.f112202X0.getPath())) {
            gameChatRoomUI.f112202X0.setRepeatCount(i2);
            gameChatRoomUI.f112202X0.setPath(str);
            gameChatRoomUI.f112202X0.setScaleMode(3);
            gameChatRoomUI.f112202X0.play();
            C40308d.m43460a(20, gameChatRoomUI.f112225s, gameChatRoomUI.f112224r);
        }
    }
}
