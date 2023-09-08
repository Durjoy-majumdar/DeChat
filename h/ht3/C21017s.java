package ht3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: ht3.s */
public class C21017s {

    /* renamed from: c */
    public static C21017s f59485c;

    /* renamed from: a */
    public ExecutorService f59486a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public Handler f59487b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static C21017s m23187a() {
        if (f59485c == null) {
            synchronized (C21017s.class) {
                if (f59485c == null) {
                    f59485c = new C21017s();
                }
            }
        }
        return f59485c;
    }
}
