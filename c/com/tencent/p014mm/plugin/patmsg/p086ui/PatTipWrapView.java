package com.tencent.p014mm.plugin.patmsg.p086ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.patmsg.ui.PatTipWrapView */
public class PatTipWrapView extends FrameLayout {

    /* renamed from: d */
    public View f20091d;

    public PatTipWrapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PatTipWrapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20091d = View.inflate(getContext(), C0966R.C0971layout.bm9, (ViewGroup) null);
    }
}
