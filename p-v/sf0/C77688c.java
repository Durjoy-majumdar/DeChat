package sf0;

import android.app.Activity;
import java.util.HashSet;
import java.util.Set;
import ob0.C11385n;

/* renamed from: sf0.c */
public abstract class C77688c implements C11385n {

    /* renamed from: d */
    public Set<Integer> f226474d = new HashSet();

    /* renamed from: e */
    public Activity f226475e;

    public C77688c(Activity activity) {
        this.f226475e = activity;
    }

    /* renamed from: a */
    public abstract boolean mo107843a(C77701p0 p0Var);

    /* renamed from: b */
    public abstract boolean mo107844b(C77701p0 p0Var);

    /* renamed from: c */
    public abstract boolean mo107845c(C77701p0 p0Var);

    /* renamed from: d */
    public abstract boolean mo107846d(C77701p0 p0Var);

    /* renamed from: e */
    public abstract boolean mo107847e(C77701p0 p0Var);

    /* renamed from: f */
    public boolean mo107848f(C77701p0 p0Var) {
        int i = p0Var.f226481b;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return mo107847e(p0Var);
        }
        if (i == 2) {
            return mo107846d(p0Var);
        }
        if (i == 4) {
            return mo107845c(p0Var);
        }
        if (i == 5) {
            return mo107844b(p0Var);
        }
        if (i != 6) {
            return false;
        }
        return mo107843a(p0Var);
    }
}
