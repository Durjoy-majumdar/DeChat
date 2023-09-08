package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.fragment.app.m0 */
public class C103746m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f306487d;

    /* renamed from: e */
    public final /* synthetic */ Map f306488e;

    public C103746m0(C112941l0 l0Var, ArrayList arrayList, Map map) {
        this.f306487d = arrayList;
        this.f306488e = map;
    }

    public void run() {
        String str;
        int size = this.f306487d.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f306487d.get(i);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            String k = C107207u.C107213g.m145226k(view);
            if (k != null) {
                Iterator it = this.f306488e.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (k.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                C107207u.C107213g.m145237v(view, str);
            }
        }
    }
}
