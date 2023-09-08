package ty1;

import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameWebTabUI;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;

/* renamed from: ty1.d */
public final class C52395d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C52393c f146468d;

    public C52395d(C52393c cVar) {
        this.f146468d = cVar;
    }

    public final void run() {
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCInteger(1), GameWebTabUI.IPCInvoke_readGameLifeConversation.class, this.f146468d.f146463Z0);
    }
}
