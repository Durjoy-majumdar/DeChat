package p828wa;

import android.content.Context;
import ky1.C46803a;

/* renamed from: wa.s */
public class C53132s implements C53095a {

    /* renamed from: d */
    public Context f148240d;

    /* renamed from: e */
    public C53127q f148241e;

    public C53132s(Context context, Class<? extends C53102g> cls) {
        ((C46803a) this).f125932h = C46803a.C46807c.initing;
        this.f148240d = context;
        this.f148241e = new C53101f(context, cls);
    }

    public Context getContext() {
        return this.f148240d;
    }

    public C53127q getRuntime() {
        return this.f148241e;
    }
}
