package p910lj;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lj.a */
public class C76701a extends Toast {

    /* renamed from: e */
    public static AtomicBoolean f224413e;

    /* renamed from: a */
    public final Context f224414a;

    /* renamed from: b */
    public final int f224415b;

    /* renamed from: c */
    public final CharSequence f224416c;

    /* renamed from: d */
    public final Toast f224417d;

    public C76701a(Context context, CharSequence charSequence, int i) {
        super(context);
        Context applicationContext = context.getApplicationContext();
        this.f224414a = applicationContext;
        this.f224416c = charSequence;
        this.f224415b = i;
        this.f224417d = Toast.makeText(applicationContext, charSequence, i);
    }

    public static Toast makeText(Context context, int i, int i2) {
        return makeText(context, context.getResources().getText(i), i2);
    }

    public void cancel() {
        try {
            this.f224417d.cancel();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void show() {
        a$$a a__a = new a$$a(this);
        if (Looper.myLooper() == null) {
            new Handler(Looper.getMainLooper()).post(a__a);
        } else {
            a__a.run();
        }
    }

    public static Toast makeText(Context context, CharSequence charSequence, int i) {
        boolean z;
        AtomicBoolean atomicBoolean = f224413e;
        if (atomicBoolean != null) {
            z = atomicBoolean.get();
        } else {
            if (Build.VERSION.SDK_INT >= 30 && context.getApplicationInfo().targetSdkVersion >= 30) {
                if (Arrays.asList(new String[]{"vivo"}).contains(String.valueOf(Build.MANUFACTURER).toLowerCase())) {
                    AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                    f224413e = atomicBoolean2;
                    z = atomicBoolean2.get();
                }
            }
            AtomicBoolean atomicBoolean3 = new AtomicBoolean(true);
            f224413e = atomicBoolean3;
            z = atomicBoolean3.get();
        }
        if (z) {
            return Toast.makeText(context.getApplicationContext(), charSequence, i);
        }
        return new C76701a(context, charSequence, i);
    }
}
