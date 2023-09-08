package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.fragment.app.n0 */
public class C103747n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f306489d;

    /* renamed from: e */
    public final /* synthetic */ Map f306490e;

    public C103747n0(C112941l0 l0Var, ArrayList arrayList, Map map) {
        this.f306489d = arrayList;
        this.f306490e = map;
    }

    public void run() {
        int size = this.f306489d.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f306489d.get(i);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107213g.m145237v(view, (String) this.f306490e.get(C107207u.C107213g.m145226k(view)));
        }
    }
}
