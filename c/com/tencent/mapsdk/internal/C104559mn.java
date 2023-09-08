package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;

/* renamed from: com.tencent.mapsdk.internal.mn */
public final class C104559mn extends TextView {

    /* renamed from: a */
    private boolean f309952a;

    public C104559mn(Context context, TencentMapContext tencentMapContext) {
        super(context);
        if (!this.f309952a && tencentMapContext != null) {
            this.f309952a = true;
            Typeface typeface = tencentMapContext.getTypeface();
            if (typeface != null) {
                setTypeface(typeface);
            }
        }
    }

    /* renamed from: a */
    private void m140067a(TencentMapContext tencentMapContext) {
        if (!this.f309952a && tencentMapContext != null) {
            this.f309952a = true;
            Typeface typeface = tencentMapContext.getTypeface();
            if (typeface != null) {
                setTypeface(typeface);
            }
        }
    }
}
