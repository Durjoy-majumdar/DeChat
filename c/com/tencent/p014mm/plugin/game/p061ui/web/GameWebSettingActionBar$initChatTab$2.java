package com.tencent.p014mm.plugin.game.p061ui.web;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameWebTabUI;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import kotlin.Metadata;
import ty1.C52393c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/game/ui/web/GameWebSettingActionBar$initChatTab$2", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onResume", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.ui.web.GameWebSettingActionBar$initChatTab$2 */
public final class GameWebSettingActionBar$initChatTab$2 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C52393c f114688d;

    public GameWebSettingActionBar$initChatTab$2(C52393c cVar) {
        this.f114688d = cVar;
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void onResume() {
        C52393c cVar = this.f114688d;
        if (cVar.f146454R0) {
            cVar.f146454R0 = false;
        } else {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCInteger(3), GameWebTabUI.IPCInvoke_readGameLifeConversation.class, cVar.f146463Z0);
        }
    }
}
