package e01;

import com.tencent.p014mm.autogen.events.ScreenCastEvent;

/* renamed from: e01.g */
public final class C7582g implements Runnable {

    /* renamed from: d */
    public static final C7582g f25850d = new C7582g();

    public final void run() {
        ScreenCastEvent screenCastEvent = new ScreenCastEvent();
        screenCastEvent.f9475d.f9476a = true;
        screenCastEvent.publish();
    }
}
