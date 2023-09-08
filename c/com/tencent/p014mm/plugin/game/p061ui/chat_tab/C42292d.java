package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.GameLifeSessionStruct;
import j20.C117292a;
import java.util.ArrayList;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.d */
public class C42292d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatTabUI f114365d;

    public C42292d(GameChatTabUI gameChatTabUI) {
        this.f114365d = gameChatTabUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/GameChatTabUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long intExtra = (long) this.f114365d.getIntent().getIntExtra("game_report_from_scene", 0);
        GameLifeSessionStruct gameLifeSessionStruct = new GameLifeSessionStruct();
        gameLifeSessionStruct.f107922d = 2;
        gameLifeSessionStruct.f107923e = 201;
        gameLifeSessionStruct.f107924f = 0;
        gameLifeSessionStruct.f107925g = 7;
        gameLifeSessionStruct.f107926h = intExtra;
        gameLifeSessionStruct.mo86054n();
        GameChatTabUI gameChatTabUI = this.f114365d;
        C52642c.m59001s(gameChatTabUI, gameChatTabUI.f114216q);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameChatTabUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
