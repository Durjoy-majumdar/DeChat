package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.page.n */
public final class C83854n extends C83873p2 {
    public C83854n(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: A */
    public void mo116409A() {
        ViewGroup o = mo116437o(0, false, false);
        Objects.requireNonNull(o);
        ViewGroup viewGroup = o;
        View findViewById = o.findViewById(C0966R.C0970id.f5887rf);
        if (findViewById != null) {
            mo116441s(2);
            o.removeView(findViewById);
        }
    }

    /* renamed from: c */
    public boolean mo114857c(View view, int i, int i2, float[] fArr, int i3, boolean z, boolean z2, boolean z3) {
        return super.mo114857c(view, i, i2, fArr, i3, z, z2, z3);
    }

    /* renamed from: e */
    public boolean mo116410e(View view, int i, int i2, float[] fArr, int i3, boolean z) {
        return super.mo116410e(view, i, i2, fArr, i3, z);
    }

    /* renamed from: f */
    public boolean mo116411f(View view, int i, int i2, float[] fArr, int i3, boolean z, boolean z2) {
        return super.mo116411f(view, i, i2, fArr, i3, z, z2);
    }

    /* renamed from: z */
    public void mo116412z(View view, int i) {
        ViewGroup o = mo116437o(0, false, false);
        Objects.requireNonNull(o);
        ViewGroup viewGroup = o;
        View findViewById = o.findViewById(C0966R.C0970id.f5887rf);
        if (!(findViewById instanceof RelativeLayout)) {
            findViewById = new RelativeLayout(view.getContext());
            findViewById.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            findViewById.setId(C0966R.C0970id.f5887rf);
            o.addView(findViewById);
            mo116430h(new C83873p2.C83880g(findViewById, 2, 0, 999, true, false, false));
        }
        View findViewById2 = findViewById.findViewById(i);
        if (findViewById2 != null) {
            ((RelativeLayout) findViewById).removeView(findViewById2);
        }
        ((RelativeLayout) findViewById).addView(view);
    }
}
