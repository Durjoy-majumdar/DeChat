package d92;

import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import d92.C107028a;
import gy3.C87412m;

/* renamed from: d92.d */
public final class C45296d implements SwipeBackLayout.C19854d {

    /* renamed from: d */
    public final /* synthetic */ C45293c f122679d;

    public C45296d(C45293c cVar) {
        this.f122679d = cVar;
    }

    /* renamed from: F */
    public boolean mo26409F() {
        C107028a.C45290a aVar = this.f122679d.f122673e;
        if (aVar == null || aVar == null) {
            return false;
        }
        return aVar.mo70816c();
    }

    /* renamed from: a */
    public void mo26410a(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        C107028a.C45290a aVar = this.f122679d.f122673e;
        if (aVar != null && aVar != null) {
            aVar.mo70814a(motionEvent);
        }
    }

    /* renamed from: b */
    public int mo26411b(boolean z) {
        C107028a.C45290a aVar = this.f122679d.f122673e;
        if (aVar == null || aVar == null) {
            return 1;
        }
        return aVar.mo70817d(z);
    }

    public boolean enableSwipeBack() {
        C107028a.C45290a aVar = this.f122679d.f122673e;
        if (aVar != null) {
            return aVar.enableSwipeBack();
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo26413f(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        C107028a.C45290a aVar = this.f122679d.f122673e;
        if (aVar == null || aVar == null) {
            return false;
        }
        return aVar.mo70819f(motionEvent);
    }

    /* renamed from: h */
    public void mo26414h(int i, int i2, int i3, int i4, float f) {
        C107028a.C45290a aVar = this.f122679d.f122673e;
        if (aVar != null && aVar != null) {
            aVar.mo70815b(f);
        }
    }

    /* renamed from: i */
    public int mo26415i() {
        C107028a.C45290a aVar = this.f122679d.f122673e;
        if (aVar != null) {
            return aVar.mo70820i();
        }
        return 0;
    }

    /* renamed from: j */
    public void mo26416j(int i, int i2) {
        C107028a.C45290a aVar = this.f122679d.f122673e;
        if (aVar != null) {
            aVar.mo70821j(i, i2);
        }
    }
}
