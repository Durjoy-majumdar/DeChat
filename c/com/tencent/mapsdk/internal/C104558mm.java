package com.tencent.mapsdk.internal;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mapsdk.internal.mm */
public final class C104558mm extends Paint {

    /* renamed from: a */
    private WeakReference<TencentMapContext> f309951a;

    public C104558mm(TencentMapContext tencentMapContext) {
        this.f309951a = new WeakReference<>(tencentMapContext);
    }

    public final Typeface setTypeface(Typeface typeface) {
        TencentMapContext tencentMapContext;
        WeakReference<TencentMapContext> weakReference = this.f309951a;
        if (weakReference == null || (tencentMapContext = weakReference.get()) == null) {
            return super.setTypeface(typeface);
        }
        Typeface typeface2 = tencentMapContext.getTypeface();
        return (typeface2 == null || !(Typeface.DEFAULT == typeface || Typeface.DEFAULT_BOLD == typeface)) ? super.setTypeface(typeface) : super.setTypeface(typeface2);
    }
}
