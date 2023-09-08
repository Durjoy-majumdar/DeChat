package com.tencent.p014mm.plugin.gallery.picker.view;

import android.widget.FrameLayout;
import android.widget.ImageView;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import qo3.C89779i0;
import qz1.C101325b;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.gallery.picker.view.c */
public final class C4429c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f19155d;

    /* renamed from: e */
    public final /* synthetic */ ImageCropUI f19156e;

    /* renamed from: f */
    public final /* synthetic */ C101325b f19157f;

    /* renamed from: g */
    public final /* synthetic */ C32227p<Integer, Integer, Object> f19158g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4429c(ImageView imageView, ImageCropUI imageCropUI, C101325b bVar, C32227p<? super Integer, ? super Integer, ? extends Object> pVar) {
        super(0);
        this.f19155d = imageView;
        this.f19156e = imageCropUI;
        this.f19157f = bVar;
        this.f19158g = pVar;
    }

    public Object invoke() {
        ImageView imageView = this.f19155d;
        ImageCropUI imageCropUI = this.f19156e;
        C101325b bVar = this.f19157f;
        C32227p<Integer, Integer, Object> pVar = this.f19158g;
        C89779i0 i0Var = imageCropUI.f19114s;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        imageCropUI.f19121z = true;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(bVar.getIntrinsicWidth(), bVar.getIntrinsicHeight()));
        imageView.setImageDrawable(bVar);
        pVar.invoke(Integer.valueOf(bVar.getIntrinsicWidth()), Integer.valueOf(bVar.getIntrinsicHeight()));
        return C13598b0.f38549a;
    }
}
