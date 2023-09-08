package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.autogen.events.FreeWifiStartMainUIEvent;

/* renamed from: com.tencent.mm.ui.conversation.n0 */
public class C74714n0 implements Runnable {
    public C74714n0(InitHelper initHelper) {
    }

    public void run() {
        FreeWifiStartMainUIEvent freeWifiStartMainUIEvent = new FreeWifiStartMainUIEvent();
        freeWifiStartMainUIEvent.f193626d.f193627a = "MAIN_UI_EVENT_INIT_FINALLY";
        freeWifiStartMainUIEvent.publish();
    }
}
