package o10;

import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o10.c */
public class C109903c {

    /* renamed from: a */
    public static final /* synthetic */ int f328858a = 0;

    /* renamed from: o10.c$a */
    public static class C109904a {
        /* renamed from: a */
        public static C109905d m149397a(View view) {
            WindowInsets rootWindowInsets;
            if (view == null || (rootWindowInsets = view.getRootWindowInsets()) == null) {
                return null;
            }
            C109905d dVar = new C109905d(rootWindowInsets);
            dVar.f328859a.mo161233p(dVar);
            dVar.f328859a.mo161225d(view.getRootView());
            return dVar;
        }
    }

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }
}
