package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.memory.p1073ui.QPictureView;

/* renamed from: com.tencent.mm.ui.widget.QFadeImageView */
public class QFadeImageView extends QPictureView {

    /* renamed from: H */
    public long f285487H;

    /* renamed from: I */
    public String f285488I;

    public QFadeImageView(Context context) {
        super(context);
    }

    public String getImageKey() {
        return this.f285488I;
    }

    public long getStartTimeMillis() {
        return this.f285487H;
    }

    public QFadeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QFadeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
