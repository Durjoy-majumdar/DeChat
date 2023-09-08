package kz2;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import p158gt.C8451i;
import rx3.C13598b0;
import rz2.C48201c;

/* renamed from: kz2.d */
public final class C76652d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f224320d;

    /* renamed from: e */
    public final /* synthetic */ String f224321e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f224322f;

    /* renamed from: g */
    public final /* synthetic */ C48201c f224323g;

    /* renamed from: h */
    public final /* synthetic */ Context f224324h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76652d(String str, String str2, ImageView imageView, C48201c cVar, Context context) {
        super(0);
        this.f224320d = str;
        this.f224321e = str2;
        this.f224322f = imageView;
        this.f224323g = cVar;
        this.f224324h = context;
    }

    public Object invoke() {
        Bitmap b = C76658g.m92308b(this.f224320d);
        ((C8451i) C86312j.m106911c(C8451i.class)).mo9376xq(this.f224321e, b);
        ImageView imageView = this.f224322f;
        boolean B0 = this.f224323g.mo72933B0();
        if (b != null) {
            imageView.post(new C76656f(B0, b, imageView));
        }
        return C13598b0.f38549a;
    }
}
