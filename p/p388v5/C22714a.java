package p388v5;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p288a6.C16430c;
import p288a6.C23611b;
import p288a6.C23614e;
import p288a6.C23616f;
import p288a6.C53978d;

/* renamed from: v5.a */
public class C22714a {

    /* renamed from: c */
    public static final ExecutorService f65295c = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public Context f65296a;

    /* renamed from: b */
    public C53978d f65297b;

    public C22714a(Context context, int i) {
        this.f65296a = context;
        if (i == 0) {
            this.f65297b = new C23611b(context);
        } else if (i == 1) {
            this.f65297b = new C23616f(context);
        } else if (i == 2) {
            this.f65297b = new C23614e(context);
        }
    }

    /* renamed from: a */
    public static C22714a m26598a(Context context) {
        return C16430c.m15255a(2) ? m26599b(context, 2) : C16430c.m15255a(1) ? m26599b(context, 1) : m26599b(context, 0);
    }

    /* renamed from: b */
    public static C22714a m26599b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 26 && context != null && C16430c.m15255a(i)) {
            return new C22714a(context, i);
        }
        return null;
    }
}
