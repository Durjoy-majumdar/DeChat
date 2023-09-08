package p828wa;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import p361me.imid.swipebacklayout.lib.SwipeBackLayout;

/* renamed from: wa.w */
public class C53137w implements SwipeBackLayout.C21490b {

    /* renamed from: a */
    public final /* synthetic */ boolean[] f148256a;

    /* renamed from: b */
    public final /* synthetic */ C53138x f148257b;

    public C53137w(C53138x xVar, boolean[] zArr) {
        this.f148257b = xVar;
        this.f148256a = zArr;
    }

    /* renamed from: a */
    public void mo33673a(MotionEvent motionEvent) {
    }

    /* renamed from: b */
    public int mo33674b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public void mo33675c() {
    }

    /* renamed from: d */
    public void mo33676d(int i, float f) {
        C53138x xVar = this.f148257b;
        int indexOf = C53106j.this.f148204d.indexOf(xVar);
        C53104i iVar = indexOf >= C53106j.this.f148204d.size() + -1 ? null : C53106j.this.f148204d.get(indexOf + 1);
        if (iVar != null) {
            if (Float.compare(1.0f, f) <= 0 && !this.f148256a[0]) {
                C53138x xVar2 = this.f148257b;
                View b = iVar.mo73783b();
                xVar2.getClass();
                b.clearAnimation();
                b.setTranslationX(0.0f);
                C53106j.this.mo73791f(false);
                this.f148256a[0] = true;
            }
            Log.m105925i("", "scrollPercent %f", Float.valueOf(f));
        }
    }

    /* renamed from: f */
    public void mo33677f(int i) {
        if (C53106j.this.f148204d.size() <= 1) {
            this.f148257b.f148260j.setEnableGesture(false);
        }
    }
}
