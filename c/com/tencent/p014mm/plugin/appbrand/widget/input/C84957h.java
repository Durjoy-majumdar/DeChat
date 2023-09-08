package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C40517r2;
import com.tencent.p014mm.plugin.appbrand.page.C40524u2;
import com.tencent.p014mm.plugin.appbrand.page.C55540c5;
import com.tencent.p014mm.plugin.appbrand.page.C83763b2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.page.C83803f4;
import com.tencent.p014mm.plugin.appbrand.page.C83896q4;
import com.tencent.p014mm.plugin.appbrand.widget.base.AppBrandViewMotionCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import ct0.C86130d;
import ct0.C86131e;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.h */
public final class C84957h extends AbsoluteLayout implements C40524u2, C86130d, C83803f4, C83763b2.C83766c, C40517r2, C83896q4 {

    /* renamed from: d */
    public final List<C83803f4.C83804a> f247609d = new LinkedList();

    /* renamed from: e */
    public final C86131e f247610e;

    /* renamed from: f */
    public final AbsoluteLayout f247611f;

    /* renamed from: g */
    public final C83780d1 f247612g;

    /* renamed from: h */
    public boolean f247613h;

    /* renamed from: i */
    public int f247614i;

    /* renamed from: j */
    public int f247615j;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.h$a */
    public class C84958a implements Runnable {
        public C84958a() {
        }

        public void run() {
            C84957h.this.requestLayout();
        }
    }

    public C84957h(C83780d1 d1Var) {
        super(d1Var.getContext().getApplicationContext());
        super.setId(C0966R.C0970id.f5953t8);
        this.f247612g = d1Var;
        this.f247611f = this;
        this.f247610e = new C86131e(this);
    }

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        canvas.save();
        canvas.translate((float) (-getScrollX()), (float) (-getScrollY()));
        if (C55540c5.m63172b(this)) {
            C55540c5.m63171a(canvas, this, 0.0f, 0.0f);
        } else {
            draw(canvas);
        }
        canvas.restore();
        return true;
    }

    /* renamed from: a */
    public void mo116266a(C83803f4.C83804a aVar) {
        if (aVar != null) {
            ((LinkedList) this.f247609d).remove(aVar);
        }
    }

    /* renamed from: e */
    public void mo111231e(int i) {
        setTranslationY((float) i);
    }

    /* renamed from: g */
    public void mo63351g(boolean z, int i, int i2, int i3, int i4) {
        if (mo117835q(z, i3 - i, i4 - i2)) {
            post(new C84958a());
        }
    }

    /* renamed from: h */
    public void mo116267h(C83803f4.C83804a aVar) {
        if (aVar != null && !((LinkedList) this.f247609d).contains(aVar)) {
            ((LinkedList) this.f247609d).add(aVar);
        }
    }

    /* renamed from: j */
    public <Input extends View & C104863f1> boolean mo117828j(C83797e3 e3Var, Input input, int i, int i2, int i3, int i4) {
        if (e3Var == null || e3Var.getWrapperView() == null || input == null) {
            return false;
        }
        mo117829k(e3Var);
        this.f247611f.addView(input, new AbsoluteLayout.LayoutParams(i, i2, i3, i4));
        ((C104863f1) input).mo148813k(this.f247612g);
        return true;
    }

    /* renamed from: k */
    public final void mo117829k(C83797e3 e3Var) {
        View wrapperView = e3Var.getWrapperView();
        if (this.f247611f.getWidth() != wrapperView.getWidth() || this.f247611f.getHeight() != wrapperView.getHeight()) {
            ViewGroup.LayoutParams layoutParams = this.f247611f.getLayoutParams();
            layoutParams.width = wrapperView.getWidth();
            layoutParams.height = wrapperView.getHeight();
            this.f247611f.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: l */
    public <Input extends View & C104863f1> void mo117830l(Input input) {
        if (input != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            Input input2 = input;
            C117292a.m165358d(input2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputContainer", "removeInput", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            input.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(input2, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputContainer", "removeInput", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105927v("MicroMsg.AppBrandInputContainer", "clearWebView imm active = %b", Boolean.valueOf(C84975p1.m104767b(this).isActive()));
            this.f247611f.removeView(input);
            ((C104863f1) input).mo148804g(this.f247612g);
        }
    }

    /* renamed from: m */
    public boolean mo117831m() {
        if (getChildCount() <= 0) {
            return false;
        }
        for (int i = 0; i <= getChildCount(); i++) {
            if (AppBrandViewMotionCompat.m104664d(getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    public void measureChild(View view, int i, int i2) {
        if (this.f247613h) {
            view.forceLayout();
        }
        super.measureChild(view, i, i2);
    }

    public void onMeasure(int i, int i2) {
        this.f247613h = (!isLayoutRequested() && i == this.f247614i && i2 == this.f247615j) ? false : true;
        this.f247614i = i;
        this.f247615j = i2;
        super.onMeasure(i, i2);
        this.f247613h = false;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
        Log.m105927v("MicroMsg.AppBrandInputContainer", "onScrollChanged, left = %d, top = %d, oldLeft = %d, oldTop = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (this.f247611f != null) {
            mo117835q(false, view.getWidth(), view.getHeight());
            this.f247611f.scrollTo(i, i2);
        }
        for (C83803f4.C83804a onScrollChange : this.f247609d) {
            onScrollChange.onScrollChange(this, i, i2, i3, i4);
        }
    }

    /* renamed from: p */
    public boolean mo117834p(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return false;
        }
        C86131e eVar = this.f247610e;
        eVar.getClass();
        return motionEvent.getActionMasked() == 0 && eVar.f250655c != null && motionEvent.getDownTime() == eVar.f250655c.f250656a && motionEvent.getEventTime() == eVar.f250655c.f250657b;
    }

    /* renamed from: q */
    public final boolean mo117835q(boolean z, int i, int i2) {
        AbsoluteLayout absoluteLayout = this.f247611f;
        if (absoluteLayout == null) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = absoluteLayout.getLayoutParams();
        if (layoutParams == null) {
            this.f247611f.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
            return true;
        } else if (i == layoutParams.width && i2 == layoutParams.height) {
            return z;
        } else {
            layoutParams.width = i;
            layoutParams.height = i2;
            this.f247611f.setLayoutParams(layoutParams);
            return true;
        }
    }

    /* renamed from: r */
    public <Input extends View & C104863f1> boolean mo117836r(C83797e3 e3Var, Input input, int i, int i2, int i3, int i4) {
        boolean z;
        if (!(e3Var == null || e3Var.getWrapperView() == null || input == null)) {
            if (input != null && this.f247611f != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f247611f.getChildCount()) {
                        break;
                    } else if (input == this.f247611f.getChildAt(i5)) {
                        z = true;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            z = false;
            if (!z) {
                return false;
            }
            mo117829k(e3Var);
            if (input.getLayoutParams() != null && (input.getLayoutParams() instanceof AbsoluteLayout.LayoutParams)) {
                if (!(input.getWidth() == i && input.getHeight() == i2 && input.getLeft() == i3 && input.getTop() == i4)) {
                    AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) input.getLayoutParams();
                    layoutParams.x = i3;
                    layoutParams.y = i4;
                    layoutParams.width = i;
                    layoutParams.height = i2;
                    input.setLayoutParams(layoutParams);
                }
                return true;
            }
        }
        return false;
    }

    public void setId(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
