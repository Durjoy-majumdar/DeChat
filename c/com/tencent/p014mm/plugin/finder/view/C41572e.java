package com.tencent.p014mm.plugin.finder.view;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.e */
public final class C41572e extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C41569c f111901d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41572e(C41569c cVar) {
        super(1);
        this.f111901d = cVar;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = this.f111901d.f111893f;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return C13598b0.f38549a;
    }
}
