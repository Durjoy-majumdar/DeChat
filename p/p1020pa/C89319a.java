package p1020pa;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import p1020pa.C89320b;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: pa.a */
public class C89319a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C89320b f257276d;

    public C89319a(C89320b bVar) {
        this.f257276d = bVar;
    }

    public void onGlobalLayout() {
        C89320b.C89324d dVar;
        C89320b bVar = this.f257276d;
        bVar.f257281g = true;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145208c(bVar)) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = true;
            for (int i = 0; i < bVar.getChildCount(); i++) {
                View childAt = bVar.getChildAt(i);
                if (!(childAt == null || childAt == bVar.f257279e || (dVar = bVar.f257284j.get(childAt)) == null)) {
                    if (!z && dVar.f257291b != 0 && childAt.getVisibility() == 0) {
                        bVar.f257278d = childAt;
                        bVar.post(bVar.f257285n);
                        z = true;
                    }
                    z2 |= dVar.f257291b == 0;
                    z3 &= childAt.getVisibility() != 0;
                    dVar.f257291b = childAt.getVisibility();
                }
            }
            if (z || (z2 && z3)) {
                bVar.post(bVar.f257286o);
            }
        }
        if (bVar.f257283i != null) {
            View view = bVar.f257278d;
            ((C89325c) bVar.f257283i).mo123688c(bVar, true, 0, 0, 0, (view == null || !view.isShown()) ? 0 : bVar.f257278d.getMeasuredHeight());
        }
        bVar.f257281g = false;
    }
}
