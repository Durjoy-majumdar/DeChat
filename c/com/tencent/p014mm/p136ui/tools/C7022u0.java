package com.tencent.p014mm.p136ui.tools;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.tools.u0 */
public final class C7022u0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ int f24774d;

    /* renamed from: e */
    public final /* synthetic */ int f24775e;

    /* renamed from: f */
    public final /* synthetic */ Float f24776f;

    public C7022u0(int i, int i2, Float f) {
        this.f24774d = i;
        this.f24775e = i2;
        this.f24776f = f;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/LinkPressedUtil$setPressedBGSelector$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            int i = this.f24775e;
            Float f = this.f24776f;
            if (view != null) {
                view.setBackgroundColor(MMApplicationContext.getColor(i));
            }
            if (f != null) {
                f.floatValue();
                double doubleValue = Double.valueOf((double) f.floatValue()).doubleValue();
                Float f2 = (doubleValue > 0.0d ? 1 : (doubleValue == 0.0d ? 0 : -1)) >= 0 && (doubleValue > 1.0d ? 1 : (doubleValue == 1.0d ? 0 : -1)) <= 0 ? f : null;
                if (f2 != null) {
                    f2.floatValue();
                    if (view != null) {
                        float floatValue = f.floatValue();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Float.valueOf(floatValue));
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/tools/LinkPressedUtil", "press", "(Landroid/view/View;ILjava/lang/Float;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                        C117292a.m165359e(view, "com/tencent/mm/ui/tools/LinkPressedUtil", "press", "(Landroid/view/View;ILjava/lang/Float;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                }
            }
        } else if (action == 1 || action == 3) {
            int i2 = this.f24774d;
            if (view != null) {
                view.setBackgroundColor(MMApplicationContext.getColor(i2));
            }
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/ui/tools/LinkPressedUtil", "depress", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/tools/LinkPressedUtil", "depress", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        if (view.isClickable() || view.isLongClickable()) {
            z = false;
        }
        C117292a.m165362h(z, this, "com/tencent/mm/ui/tools/LinkPressedUtil$setPressedBGSelector$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
