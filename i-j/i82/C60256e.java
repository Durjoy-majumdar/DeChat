package i82;

import android.os.HandlerThread;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: i82.e */
public final class C60256e extends C87413o implements C32224a<HandlerThread> {

    /* renamed from: d */
    public final /* synthetic */ int f171795d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60256e(int i) {
        super(0);
        this.f171795d = i;
    }

    public Object invoke() {
        String str = "GLHandlerThread-" + this.f171795d;
        int i = C58834h.f168432b;
        return C97749e.m126093a(str, -4);
    }
}
