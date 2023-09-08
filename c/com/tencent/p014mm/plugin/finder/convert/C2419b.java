package com.tencent.p014mm.plugin.finder.convert;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87413o;
import jq3.C60905o;
import kg3.C76577a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.convert.b */
public final class C2419b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f12833d;

    /* renamed from: e */
    public final /* synthetic */ WeImageView f12834e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f12835f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2419b(Bitmap bitmap, WeImageView weImageView, C60905o oVar) {
        super(0);
        this.f12833d = bitmap;
        this.f12834e = weImageView;
        this.f12835f = oVar;
    }

    public Object invoke() {
        if (this.f12833d != null) {
            this.f12834e.setLayerPaint((Paint) null);
            this.f12834e.setIconColor(0);
            this.f12834e.setImageBitmap(this.f12833d);
            this.f12834e.setIconColor(C76577a.m92153d(this.f12835f.f173499A, C0966R.color.f3585yj));
        }
        return C13598b0.f38549a;
    }
}
