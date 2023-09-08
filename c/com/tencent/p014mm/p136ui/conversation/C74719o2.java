package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.autogen.events.FreeWifiStartMainUIEvent;

/* renamed from: com.tencent.mm.ui.conversation.o2 */
public class C74719o2 implements Runnable {
    public C74719o2(C74739q2 q2Var) {
    }

    public void run() {
        FreeWifiStartMainUIEvent freeWifiStartMainUIEvent = new FreeWifiStartMainUIEvent();
        freeWifiStartMainUIEvent.f193626d.f193627a = "MAIN_UI_EVENT_UPDATE_VIEW";
        freeWifiStartMainUIEvent.publish();
    }
}
