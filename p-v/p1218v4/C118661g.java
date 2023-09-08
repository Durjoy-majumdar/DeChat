package p1218v4;

import android.content.Context;
import p1169a5.C112757a;

/* renamed from: v4.g */
public class C118661g {

    /* renamed from: e */
    public static C118661g f355061e;

    /* renamed from: a */
    public C118651a f355062a;

    /* renamed from: b */
    public C118652b f355063b;

    /* renamed from: c */
    public C118657e f355064c;

    /* renamed from: d */
    public C118660f f355065d;

    public C118661g(Context context, C112757a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f355062a = new C118651a(applicationContext, aVar);
        this.f355063b = new C118652b(applicationContext, aVar);
        this.f355064c = new C118657e(applicationContext, aVar);
        this.f355065d = new C118660f(applicationContext, aVar);
    }

    /* renamed from: a */
    public static synchronized C118661g m167348a(Context context, C112757a aVar) {
        C118661g gVar;
        synchronized (C118661g.class) {
            if (f355061e == null) {
                f355061e = new C118661g(context, aVar);
            }
            gVar = f355061e;
        }
        return gVar;
    }
}
