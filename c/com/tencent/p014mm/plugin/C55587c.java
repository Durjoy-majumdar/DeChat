package com.tencent.p014mm.plugin;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.widget.QImageView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.c */
public final class C55587c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f158258d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f158259e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55587c(View view, Bitmap bitmap) {
        super(0);
        this.f158258d = view;
        this.f158259e = bitmap;
    }

    public Object invoke() {
        View view = this.f158258d;
        if (view instanceof QImageView) {
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.widget.QImageView");
            ((QImageView) view).setImageBitmap(this.f158259e);
        } else if (view instanceof MMImageView) {
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.MMImageView");
            ((MMImageView) view).setImageBitmap(this.f158259e);
        }
        return C13598b0.f38549a;
    }
}
