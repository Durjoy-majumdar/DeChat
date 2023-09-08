package nl3;

import android.view.MotionEvent;
import android.view.View;
import gy3.C45983e0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: nl3.d */
public final class C47281d implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ View f126913d;

    /* renamed from: e */
    public final /* synthetic */ C47282e f126914e;

    /* renamed from: f */
    public final /* synthetic */ C45983e0 f126915f;

    /* renamed from: g */
    public final /* synthetic */ float f126916g;

    /* renamed from: h */
    public final /* synthetic */ View f126917h;

    /* renamed from: i */
    public final /* synthetic */ View f126918i;

    /* renamed from: j */
    public final /* synthetic */ int f126919j;

    public C47281d(View view, C47282e eVar, C45983e0 e0Var, float f, View view2, View view3, int i) {
        this.f126913d = view;
        this.f126914e = eVar;
        this.f126915f = e0Var;
        this.f126916g = f;
        this.f126917h = view2;
        this.f126918i = view3;
        this.f126919j = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        View view2 = this.f126913d;
        if (view2 != null) {
            view2.dispatchTouchEvent(motionEvent2);
        }
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            float f = 0.0f;
            if (action == 1) {
                if (System.currentTimeMillis() - this.f126915f.f124000d < 350) {
                    this.f126917h.performClick();
                }
                this.f126914e.mo72316b(this.f126918i, this.f126919j);
                this.f126914e.f126921b = 0.0f;
                View view3 = this.f126917h;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view4, "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (action == 2) {
                if (this.f126914e.f126922c == 0.0f) {
                    this.f126915f.f124000d = System.currentTimeMillis();
                    this.f126914e.f126922c = motionEvent.getRawY();
                }
                this.f126914e.f126922c = motionEvent.getRawY();
                C47282e eVar = this.f126914e;
                float f2 = eVar.f126922c - eVar.f126921b;
                float f3 = eVar.f126923d;
                float f4 = f2 + f3;
                if (f4 >= 0.0f) {
                    f = f4;
                }
                if (f == f3) {
                    z = true;
                }
                if (!z) {
                    eVar.f126923d = f;
                    this.f126918i.setTranslationY(f);
                }
                C47282e eVar2 = this.f126914e;
                eVar2.f126921b = eVar2.f126922c;
            }
        } else {
            this.f126914e.f126921b = motionEvent.getRawY();
            this.f126915f.f124000d = System.currentTimeMillis();
            float f5 = this.f126916g;
            if (!(f5 == 1.0f)) {
                View view5 = this.f126917h;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(f5));
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view6, "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        C117292a.m165362h(true, this, "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
