package com.tencent.p014mm.plugin.gallery.picker.view;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.gallery.picker.view.d */
public final class C4430d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f19159d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f19160e;

    /* renamed from: f */
    public final /* synthetic */ ImageCropUI f19161f;

    /* renamed from: g */
    public final /* synthetic */ C32227p<Integer, Integer, Object> f19162g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4430d(ImageView imageView, Bitmap bitmap, ImageCropUI imageCropUI, C32227p<? super Integer, ? super Integer, ? extends Object> pVar) {
        super(0);
        this.f19159d = imageView;
        this.f19160e = bitmap;
        this.f19161f = imageCropUI;
        this.f19162g = pVar;
    }

    public Object invoke() {
        ImageView imageView = this.f19159d;
        Bitmap bitmap = this.f19160e;
        ImageCropUI imageCropUI = this.f19161f;
        C32227p<Integer, Integer, Object> pVar = this.f19162g;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight()));
        imageCropUI.f19120y = bitmap;
        imageView.setImageBitmap(bitmap);
        pVar.invoke(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        imageCropUI.f19121z = true;
        C89779i0 i0Var = imageCropUI.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        return C13598b0.f38549a;
    }
}
