package com.tencent.p014mm.plugin.gallery.picker.view;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.gallery.picker.view.a */
public final class C4427a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f19145d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f19146e;

    /* renamed from: f */
    public final /* synthetic */ int f19147f;

    /* renamed from: g */
    public final /* synthetic */ int f19148g;

    /* renamed from: h */
    public final /* synthetic */ C32227p<Integer, Integer, Object> f19149h;

    /* renamed from: i */
    public final /* synthetic */ ImageCropUI f19150i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4427a(ImageView imageView, Bitmap bitmap, int i, int i2, C32227p<? super Integer, ? super Integer, ? extends Object> pVar, ImageCropUI imageCropUI) {
        super(0);
        this.f19145d = imageView;
        this.f19146e = bitmap;
        this.f19147f = i;
        this.f19148g = i2;
        this.f19149h = pVar;
        this.f19150i = imageCropUI;
    }

    public Object invoke() {
        this.f19145d.setImageBitmap(this.f19146e);
        this.f19145d.setLayoutParams(new FrameLayout.LayoutParams(this.f19147f, this.f19148g));
        this.f19149h.invoke(Integer.valueOf(this.f19147f), Integer.valueOf(this.f19148g));
        ImageCropUI imageCropUI = this.f19150i;
        imageCropUI.f19121z = true;
        C89779i0 i0Var = imageCropUI.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        return C13598b0.f38549a;
    }
}
