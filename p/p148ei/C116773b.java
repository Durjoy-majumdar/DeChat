package p148ei;

import com.tencent.p014mm.autogen.events.UINotifyEvent;

/* renamed from: ei.b */
public class C116773b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ UINotifyEvent f350091d;

    public C116773b(C116775d dVar, UINotifyEvent uINotifyEvent) {
        this.f350091d = uINotifyEvent;
    }

    public void run() {
        this.f350091d.publish();
    }
}
