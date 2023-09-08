package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.page.C1943c3;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.page.C83827i3;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.s1 */
public class C84981s1 implements C83827i3 {

    /* renamed from: f */
    public static View.OnTouchListener f247659f = new C2055a();

    /* renamed from: d */
    public final C83780d1 f247660d;

    /* renamed from: e */
    public final C84957h f247661e;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.s1$a */
    public class C2055a implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/NativeWidgetContainerWithInputDuplicateTouch$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/input/NativeWidgetContainerWithInputDuplicateTouch$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.s1$b */
    public static final class C84982b implements C83827i3.C83828a {
    }

    public C84981s1(C83780d1 d1Var) {
        this.f247660d = d1Var;
        this.f247661e = new C84957h(d1Var);
    }

    /* renamed from: a */
    public void mo117861a(C83797e3 e3Var) {
        C84957h hVar = this.f247661e;
        ((ViewGroup) e3Var.getContentView()).setOnTouchListener(new C84994t1(this, hVar, new C84971n1(hVar)));
    }

    /* renamed from: d */
    public void mo111230d(C1943c3 c3Var) {
        if (c3Var == C1943c3.MODAL || c3Var == C1943c3.ACTION_SHEET) {
            C84947c0.m104715c(this.f247660d, (Integer) null);
        }
    }

    /* renamed from: e */
    public void mo111231e(int i) {
        this.f247661e.setTranslationY((float) i);
    }

    /* renamed from: g */
    public void mo63351g(boolean z, int i, int i2, int i3, int i4) {
        this.f247661e.mo63351g(z, i, i2, i3, i4);
    }

    public ViewGroup getContainer() {
        return this.f247661e;
    }

    /* renamed from: i */
    public void mo111233i(C83797e3 e3Var) {
        if (e3Var.getContentView() != null) {
            ((ViewGroup) e3Var.getContentView()).setOnTouchListener(f247659f);
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
        this.f247661e.onScrollChanged(i, i2, i3, i4, view);
    }
}
