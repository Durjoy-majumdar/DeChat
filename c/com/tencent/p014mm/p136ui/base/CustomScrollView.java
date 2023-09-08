package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* renamed from: com.tencent.mm.ui.base.CustomScrollView */
public class CustomScrollView extends ScrollView {

    /* renamed from: d */
    public C57659a f214736d;

    /* renamed from: com.tencent.mm.ui.base.CustomScrollView$a */
    public interface C57659a {
        /* renamed from: a */
        void mo12459a(ScrollView scrollView, int i, int i2, int i3, int i4);
    }

    public CustomScrollView(Context context) {
        super(context);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C57659a aVar = this.f214736d;
        if (aVar != null) {
            aVar.mo12459a(this, i, i2, i3, i4);
        }
    }

    public void setOnScrollChangeListener(C57659a aVar) {
        this.f214736d = aVar;
    }

    public CustomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
