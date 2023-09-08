package com.tencent.p014mm.plugin.finder.live.view;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.live.view.h0 */
public final class C3218h0 extends C87413o implements C32224a<Paint> {

    /* renamed from: d */
    public static final C3218h0 f15339d = new C3218h0();

    public C3218h0() {
        super(0);
    }

    public Object invoke() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        return paint;
    }
}
