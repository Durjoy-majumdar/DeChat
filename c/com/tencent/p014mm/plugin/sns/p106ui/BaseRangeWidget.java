package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.tencent.mm.plugin.sns.ui.BaseRangeWidget */
public abstract class BaseRangeWidget extends RelativeLayout {

    /* renamed from: d */
    public boolean f276688d = false;

    public BaseRangeWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public abstract void mo132077a(SnsUploadConfigView snsUploadConfigView);

    /* renamed from: b */
    public abstract boolean mo132078b(int i, int i2, Intent intent, AtContactWidget atContactWidget);

    public abstract int getLabelRange();

    public abstract void setRangeTipClickListener(View.OnClickListener onClickListener);

    public BaseRangeWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
