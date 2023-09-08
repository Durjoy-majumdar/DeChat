package ro3;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.p136ui.C85975v4;
import gy3.C87412m;
import j20.C117292a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: ro3.p */
public final class C110597p implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C110588j f330862d;

    public C110597p(C110588j jVar) {
        this.f330862d = jVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        View.OnTouchListener onTouchListener = this.f330862d.f330841p;
        boolean z = false;
        boolean onTouch = onTouchListener != null ? onTouchListener.onTouch(view, motionEvent) : false;
        C110588j jVar = this.f330862d;
        if (jVar.f330851z) {
            jVar.f330804E = (int) motionEvent.getX();
            this.f330862d.f330805F = (int) motionEvent.getY();
            C110588j jVar2 = this.f330862d;
            motionEvent.getRawY();
            jVar2.getClass();
            int action = motionEvent.getAction();
            if (action == 0) {
                C110588j jVar3 = this.f330862d;
                jVar3.f330803D = false;
                if (jVar3.f330809J) {
                    TextView textView = jVar3.f330833h;
                    try {
                        Field declaredField = TextView.class.getDeclaredField("mEditor");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(textView);
                        Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, Class[].class}).invoke(Class.forName("android.widget.Editor"), new Object[]{"getEmailPopupWindow", null});
                        method.setAccessible(true);
                        method.invoke(obj, new Object[0]);
                        C85975v4.m106306c("SelectableEditTextHelper", "getEmailPopupWindow succ", new Object[0]);
                    } catch (InvocationTargetException e) {
                        C85975v4.m106307d("SelectableEditTextHelper", e, "getEmailPopupWindow err", new Object[0]);
                    } catch (Throwable th) {
                        C85975v4.m106307d("SelectableEditTextHelper", th, "getEmailPopupWindow err", new Object[0]);
                    }
                    this.f330862d.f330809J = false;
                }
                TextView textView2 = this.f330862d.f330833h;
                C87412m.m108594g(textView2, "textView");
                try {
                    C85975v4.m106304a("SelectableEditTextHelper", "setInsertionDisabled", new Object[0]);
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(textView2);
                    Class<?> cls = Class.forName("android.widget.Editor");
                    Field declaredField3 = cls.getDeclaredField("mInsertionControllerEnabled");
                    declaredField3.setAccessible(true);
                    Boolean bool = Boolean.FALSE;
                    declaredField3.set(obj2, bool);
                    Field declaredField4 = cls.getDeclaredField("mSelectionControllerEnabled");
                    declaredField4.setAccessible(true);
                    declaredField4.set(obj2, bool);
                } catch (Exception e2) {
                    C85975v4.m106305b("SelectableEditTextHelper", "setInsertionDisabled error msg:%s", e2.getMessage());
                }
            } else if (action == 1) {
                C110588j jVar4 = this.f330862d;
                if (jVar4.f330802C) {
                    jVar4.f330802C = false;
                    if (jVar4.f330801B && jVar4.f330848w) {
                        jVar4.f330848w = false;
                        jVar4.mo162142s(jVar4.f330813N);
                        this.f330862d.f330813N = 0;
                    }
                    C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
            } else if (action == 2) {
                if (!C75054z4.m90006d() || !this.f330862d.f330803D) {
                    C110588j jVar5 = this.f330862d;
                    if (jVar5.f330806G != jVar5.f330833h.getScrollY()) {
                        C110588j jVar6 = this.f330862d;
                        jVar6.f330802C = true;
                        int f = jVar6.mo162136f();
                        C110588j jVar7 = this.f330862d;
                        if (jVar7.f330801B && !jVar7.f330848w) {
                            jVar7.getClass();
                            if (f > 0) {
                                C110588j jVar8 = this.f330862d;
                                jVar8.f330813N = f;
                                jVar8.f330848w = true;
                                jVar8.mo148757e(jVar8.mo162138h());
                                C110588j jVar9 = this.f330862d;
                                jVar9.mo148756c(jVar9.f330827b);
                                C110588j jVar10 = this.f330862d;
                                jVar10.mo148756c(jVar10.f330828c);
                                this.f330862d.mo162135d();
                            }
                        }
                    }
                } else {
                    C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
            }
            C110588j jVar11 = this.f330862d;
            jVar11.f330806G = jVar11.f330833h.getScrollY();
        } else {
            z = onTouch;
        }
        C117292a.m165362h(z, this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z;
    }
}
