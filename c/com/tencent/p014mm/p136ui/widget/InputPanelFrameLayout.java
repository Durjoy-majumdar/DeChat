package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.widget.C74965a;

/* renamed from: com.tencent.mm.ui.widget.InputPanelFrameLayout */
public class InputPanelFrameLayout extends FrameLayout implements C74965a.C74969d {

    /* renamed from: d */
    public C74965a f220337d;

    /* renamed from: e */
    public C74965a.C74969d f220338e;

    public InputPanelFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C74965a getInputPanelHelper() {
        return this.f220337d;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        C74965a.C74969d dVar = this.f220338e;
        if (dVar != null) {
            dVar.mo1072i0(z, i);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f220337d.mo104360c();
    }

    public void onMeasure(int i, int i2) {
        this.f220337d.mo104361d(i2);
        super.onMeasure(i, i2);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f220337d.mo104364g();
        } else {
            this.f220337d.mo104360c();
        }
    }

    public void setExternalListener(C74965a.C74969d dVar) {
        this.f220338e = dVar;
    }

    public InputPanelFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f220337d = new C74965a(this, this);
    }
}
