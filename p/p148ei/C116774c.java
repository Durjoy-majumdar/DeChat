package p148ei;

import com.tencent.p014mm.autogen.events.UINotifyEvent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ei.c */
public class C116774c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ UINotifyEvent f350092d;

    public C116774c(C116775d dVar, UINotifyEvent uINotifyEvent) {
        this.f350092d = uINotifyEvent;
    }

    public void run() {
        Log.m105924i("MicroMsg.BroadcastController", "summerdiz handleEventOOB publish uiEvent");
        this.f350092d.publish();
    }
}
