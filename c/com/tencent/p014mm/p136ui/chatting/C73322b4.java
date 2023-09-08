package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.autogen.events.NewChattingUIStatusEvent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.b4 */
public class C73322b4 {

    /* renamed from: c */
    public static C73322b4 f215431c;

    /* renamed from: a */
    public int f215432a = 0;

    /* renamed from: b */
    public int f215433b = 0;

    /* renamed from: a */
    public static C73322b4 m86462a() {
        if (f215431c == null) {
            f215431c = new C73322b4();
        }
        return f215431c;
    }

    /* renamed from: b */
    public void mo102140b(int i) {
        int i2 = this.f215432a;
        if (i2 > 0) {
            this.f215432a = i2 - 1;
            return;
        }
        if (i != this.f215433b) {
            Log.m105925i("MicroMsg.OrzChattingLifecycle", "notifyChattingStatus [%d]", Integer.valueOf(i));
            NewChattingUIStatusEvent newChattingUIStatusEvent = new NewChattingUIStatusEvent();
            newChattingUIStatusEvent.f193747d.f193748a = i;
            newChattingUIStatusEvent.publish();
        }
        if (i == 1 || i == 4) {
            this.f215433b = i;
        }
    }
}
