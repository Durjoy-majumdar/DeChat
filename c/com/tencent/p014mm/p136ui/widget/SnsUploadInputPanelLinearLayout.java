package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.widget.C74965a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.widget.SnsUploadInputPanelLinearLayout */
public abstract class SnsUploadInputPanelLinearLayout extends LinearLayout implements C74965a.C74969d {

    /* renamed from: d */
    public C74965a f220456d;

    /* renamed from: e */
    public List<C74965a.C74969d> f220457e;

    public SnsUploadInputPanelLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C74965a getInputPanelHelper() {
        return this.f220456d;
    }

    public abstract int getSoftInputMode();

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        for (int i2 = 0; i2 < ((LinkedList) this.f220457e).size(); i2++) {
            C74965a.C74969d dVar = (C74965a.C74969d) ((LinkedList) this.f220457e).get(i2);
            if (dVar != null) {
                dVar.mo1072i0(z, i);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f220456d.mo104360c();
        ((LinkedList) this.f220457e).clear();
    }

    public void onMeasure(int i, int i2) {
        this.f220456d.mo104361d(i2);
        super.onMeasure(i, i2);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f220456d.mo104364g();
            return;
        }
        this.f220456d.mo104360c();
        ((LinkedList) this.f220457e).clear();
    }

    public SnsUploadInputPanelLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f220457e = new LinkedList();
        this.f220456d = new C74965a(this, this);
        int softInputMode = getSoftInputMode();
        if ((softInputMode & 32) > 0) {
            this.f220456d.f220487n = true;
        } else if ((softInputMode & 16) > 0) {
            this.f220456d.f220487n = false;
        }
    }
}
