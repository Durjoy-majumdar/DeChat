package a34;

import android.app.Fragment;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: a34.c */
public class C112752c extends Fragment {

    /* renamed from: d */
    public final Set<C112753d> f337627d = Collections.newSetFromMap(new WeakHashMap());

    public void onResume() {
        super.onResume();
        synchronized (this.f337627d) {
            for (C112753d next : this.f337627d) {
                if (next != null) {
                    next.onResume();
                }
            }
        }
    }
}
