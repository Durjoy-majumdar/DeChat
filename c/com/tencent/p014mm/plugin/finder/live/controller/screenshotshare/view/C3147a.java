package com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view;

import android.graphics.Bitmap;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.a */
public final class C3147a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ScreenShotView f15067d;

    /* renamed from: e */
    public final /* synthetic */ float f15068e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f15069f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3147a(ScreenShotView screenShotView, float f, Bitmap bitmap) {
        super(0);
        this.f15067d = screenShotView;
        this.f15068e = f;
        this.f15069f = bitmap;
    }

    public Object invoke() {
        this.f15067d.f15027j.setVisibility(0);
        this.f15067d.f15027j.getLayoutParams().width = (int) (((float) this.f15067d.f15027j.getHeight()) * this.f15068e);
        this.f15067d.f15027j.setImageBitmap(this.f15069f);
        return C13598b0.f38549a;
    }
}
