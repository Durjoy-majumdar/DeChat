package al3;

import android.content.Context;
import android.content.res.Resources;
import p210o.C11323a;

/* renamed from: al3.a */
public final class C0086a {

    /* renamed from: a */
    public static C11323a<Context, Resources> f520a = new C0087a();

    /* renamed from: al3.a$a */
    public class C0087a implements C11323a<Context, Resources> {
        public Object apply(Object obj) {
            return ((Context) obj).getResources();
        }
    }

    /* renamed from: a */
    public static Resources m38a(Context context) {
        return f520a.apply(context);
    }
}
