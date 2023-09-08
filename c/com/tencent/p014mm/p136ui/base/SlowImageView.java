package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: com.tencent.mm.ui.base.SlowImageView */
public class SlowImageView extends ImageView {

    /* renamed from: com.tencent.mm.ui.base.SlowImageView$a */
    public interface C116069a {
        /* renamed from: a */
        void mo177328a(SlowImageView slowImageView);
    }

    public SlowImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setImageLoader(C116069a aVar) {
        aVar.mo177328a(this);
    }

    public SlowImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
