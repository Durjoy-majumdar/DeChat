package q11;

import gy3.C8480h;
import rx3.C13601g;
import rx3.C36568h;
import w80.C111742d;

/* renamed from: q11.f */
public final class C110336f {

    /* renamed from: f */
    public static int f330059f;

    /* renamed from: a */
    public final String f330060a;

    /* renamed from: b */
    public boolean f330061b;

    /* renamed from: c */
    public final C13601g f330062c;

    /* renamed from: d */
    public final C13601g f330063d;

    /* renamed from: e */
    public C111742d.C65942b f330064e;

    public C110336f(int i, int i2, C8480h hVar) {
        if ((i2 & 1) != 0) {
            i = f330059f;
            f330059f = i + 1;
        }
        this.f330060a = "MicroMsg.MTR.GLHandlerThread-" + i;
        this.f330062c = C36568h.m40985a(new C62578e(i));
        this.f330063d = C36568h.m40985a(new C110335d(this));
    }
}
