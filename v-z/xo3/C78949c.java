package xo3;

import android.view.ViewTreeObserver;
import com.tencent.p014mm.p136ui.C85975v4;

/* renamed from: xo3.c */
public class C78949c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C78950d f231825d;

    public C78949c(C78950d dVar) {
        this.f231825d = dVar;
    }

    public void onGlobalLayout() {
        this.f231825d.f231844f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C78950d dVar = this.f231825d;
        if (dVar.f231845g != null) {
            dVar.f231844f.getLocationInWindow(dVar.f231833H);
            C85975v4.m106304a("SelectableTextHelper", "init: loc-x: %d, loc-y: %d.", Integer.valueOf(this.f231825d.f231833H[0]), Integer.valueOf(this.f231825d.f231833H[1]));
        }
    }
}
