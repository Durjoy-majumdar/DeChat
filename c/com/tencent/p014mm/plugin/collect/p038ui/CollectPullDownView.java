package com.tencent.p014mm.plugin.collect.p038ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.collect.ui.CollectPullDownView */
public class CollectPullDownView extends MMPullDownView {
    public CollectPullDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: f */
    public void mo94704f() {
        View inflate = View.inflate(this.f214887y, C0966R.C0971layout.f7016v0, (ViewGroup) null);
        View inflate2 = View.inflate(this.f214887y, C0966R.C0971layout.f7016v0, (ViewGroup) null);
        addView(inflate, 0, new FrameLayout.LayoutParams(-1, C76577a.m92151b(this.f214887y, 48)));
        addView(inflate2, new FrameLayout.LayoutParams(-1, C76577a.m92151b(this.f214887y, 48)));
    }

    public void setLoadDataEnd(boolean z) {
        this.f214880r = z;
    }

    public CollectPullDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
