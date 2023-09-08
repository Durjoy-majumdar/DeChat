package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import rf0.C22230d;

/* renamed from: com.tencent.mm.ui.widget.picker.CustomTimePickerNew */
public class CustomTimePickerNew extends FrameLayout {

    /* renamed from: r */
    public static final /* synthetic */ int f24840r = 0;

    /* renamed from: d */
    public View f24841d = null;

    /* renamed from: e */
    public C22230d f24842e;

    /* renamed from: f */
    public Context f24843f;

    /* renamed from: g */
    public int f24844g = -1;

    /* renamed from: h */
    public int f24845h = -1;

    /* renamed from: i */
    public int f24846i = -1;

    /* renamed from: j */
    public int f24847j = -1;

    /* renamed from: n */
    public int f24848n = -1;

    /* renamed from: o */
    public int f24849o = -1;

    /* renamed from: p */
    public int f24850p;

    /* renamed from: q */
    public int f24851q;

    public CustomTimePickerNew(Context context) {
        super(new ContextThemeWrapper(context, C0966R.style.a4p));
        this.f24843f = context;
        this.f24842e = new C22230d(context);
    }

    public View getView() {
        if (this.f24841d == null) {
            this.f24841d = this.f24842e.mo35389e();
        }
        return this.f24841d;
    }

    public CustomTimePickerNew(Context context, AttributeSet attributeSet) {
        super(new ContextThemeWrapper(context, C0966R.style.a4p), attributeSet);
        this.f24843f = context;
        this.f24842e = new C22230d(context);
    }

    public CustomTimePickerNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24843f = context;
        this.f24842e = new C22230d(context);
    }
}
