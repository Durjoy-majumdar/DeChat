package com.tencent.p014mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Util;
import l40.C99336c;
import l40.C99339f;

/* renamed from: com.tencent.mm.kiss.widget.textview.PLSysTextView */
public class PLSysTextView extends SysTextView {
    public PLSysTextView(Context context) {
        super(context);
    }

    /* renamed from: b */
    public void mo126786b() {
    }

    /* renamed from: e */
    public void mo126787e() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getLayoutWrapper() != null) {
            getLayoutWrapper().f291291a = false;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!Util.isNullOrNil(charSequence)) {
            if (getLayoutWrapper() != null && getLayoutWrapper().f291291a) {
                C99336c.f291266b.mo138733c(getConfig(), getLayoutWrapper());
            }
            C99339f b = C99336c.f291266b.mo138732b(getConfig(), charSequence);
            if (b != null) {
                setTextLayout(b);
            } else {
                mo126843f(charSequence, false);
            }
        }
    }

    public PLSysTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PLSysTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
