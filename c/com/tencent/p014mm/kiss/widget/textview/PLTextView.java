package com.tencent.p014mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.tencent.p014mm.sdk.platformtools.Util;
import l40.C99336c;
import l40.C99339f;

/* renamed from: com.tencent.mm.kiss.widget.textview.PLTextView */
public class PLTextView extends StaticTextView {
    public PLTextView(Context context) {
        super(context);
    }

    /* renamed from: c */
    public void mo126791c() {
    }

    /* renamed from: d */
    public void mo126792d() {
    }

    /* renamed from: g */
    public void mo126793g(CharSequence charSequence) {
    }

    /* renamed from: h */
    public void mo126794h(CharSequence charSequence) {
        mo126802f(charSequence, false);
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

    public void setText(CharSequence charSequence) {
        setContentDescription(charSequence);
        if (!Util.isNullOrNil(charSequence)) {
            if (getLayoutWrapper() != null && getLayoutWrapper().f291291a) {
                C99336c.f291266b.mo138733c(getConfig(), getLayoutWrapper());
            }
            C99339f b = C99336c.f291266b.mo138732b(getConfig(), charSequence);
            if (b != null) {
                mo126793g(charSequence);
                setTextLayout(b);
                return;
            }
            mo126794h(charSequence);
        }
    }

    public PLTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PLTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
