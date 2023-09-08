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

/* renamed from: kz2.b */
public final class C76650b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f224308d;

    /* renamed from: e */
    public final /* synthetic */ String f224309e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f224310f;

    /* renamed from: g */
    public final /* synthetic */ C48201c f224311g;

    /* renamed from: h */
    public final /* synthetic */ Context f224312h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76650b(String str, String str2, ImageView imageView, C48201c cVar, Context context) {
        super(0);
        this.f224308d = str;
        this.f224309e = str2;
        this.f224310f = imageView;
        this.f224311g = cVar;
        this.f224312h = context;
    }

    public Object invoke() {
        Bitmap b = C76658g.m92308b(this.f224308d);
        ((C8451i) C86312j.m106911c(C8451i.class)).mo9376xq(this.f224309e, b);
        ImageView imageView = this.f224310f;
        boolean B0 = this.f224311g.mo72933B0();
        if (b != null) {
            imageView.post(new C76656f(B0, b, imageView));
        }
        return C13598b0.f38549a;
    }
}
