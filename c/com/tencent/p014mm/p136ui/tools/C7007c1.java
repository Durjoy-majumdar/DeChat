package com.tencent.p014mm.p136ui.tools;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.tools.c1 */
public class C7007c1 {

    /* renamed from: a */
    public static Float f24745a = Float.valueOf(0.7f);

    /* renamed from: com.tencent.mm.ui.tools.c1$a */
    public class C7008a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ float f24746d;

        public C7008a(float f) {
            this.f24746d = f;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/PressAlphaUtil$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            boolean z = true;
            if (action == 0) {
                float f = this.f24746d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/tools/PressAlphaUtil$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/tools/PressAlphaUtil$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (action == 1 || action == 3) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/tools/PressAlphaUtil$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/tools/PressAlphaUtil$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (view.isClickable() || view.isLongClickable()) {
                z = false;
            }
            C117292a.m165362h(z, this, "com/tencent/mm/ui/tools/PressAlphaUtil$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z;
        }
    }

    /* renamed from: a */
    public static void m7256a(View view) {
        m7257b(view, f24745a.floatValue());
    }

    /* renamed from: b */
    public static void m7257b(View view, float f) {
        if (view != null && f > 0.0f && f < 1.0f) {
            view.setOnTouchListener(new C7008a(f));
        }
    }
}
