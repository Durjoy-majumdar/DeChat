package i82;

import gy3.C8480h;
import rx3.C13601g;
import rx3.C36568h;
import w80.C111742d;

/* renamed from: i82.f */
public final class C108408f {

    /* renamed from: f */
    public static int f324606f;

    /* renamed from: a */
    public final String f324607a;

    /* renamed from: b */
    public boolean f324608b;

    /* renamed from: c */
    public final C13601g f324609c;

    /* renamed from: d */
    public final C13601g f324610d;

    /* renamed from: e */
    public C111742d.C65942b f324611e;

    public C108408f(int i, int i2, C8480h hVar) {
        if ((i2 & 1) != 0) {
            i = f324606f;
            f324606f = i + 1;
        }
        this.f324607a = "MicroMsg.MTR.GLHandlerThread-" + i;
        this.f324609c = C36568h.m40985a(new C60256e(i));
        this.f324610d = C36568h.m40985a(new C108407d(this));
    }
}
