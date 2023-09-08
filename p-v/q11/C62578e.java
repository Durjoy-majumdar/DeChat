package q11;

import android.os.HandlerThread;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: q11.e */
public final class C62578e extends C87413o implements C32224a<HandlerThread> {

    /* renamed from: d */
    public final /* synthetic */ int f177732d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62578e(int i) {
        super(0);
        this.f177732d = i;
    }

    public Object invoke() {
        String str = "GLHandlerThread-" + this.f177732d;
        int i = C58834h.f168432b;
        return C97749e.m126093a(str, -4);
    }
}
