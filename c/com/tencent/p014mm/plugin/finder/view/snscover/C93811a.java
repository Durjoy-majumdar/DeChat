package com.tencent.p014mm.plugin.finder.view.snscover;

import android.graphics.Bitmap;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import vp3.C65849b;

/* renamed from: com.tencent.mm.plugin.finder.view.snscover.a */
public final class C93811a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f270749d;

    /* renamed from: e */
    public final /* synthetic */ SnsFinderVideoBackPreview f270750e;

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.a$a */
    public static final class C93812a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270751d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93812a(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(1);
            this.f270751d = snsFinderVideoBackPreview;
        }

        public Object invoke(Object obj) {
            this.f270751d.getThumbView().setImageBitmap((Bitmap) obj);
            return C13598b0.f38549a;
        }
    }

    public C93811a(Bitmap bitmap, SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
        this.f270749d = bitmap;
        this.f270750e = snsFinderVideoBackPreview;
    }

    public final void run() {
        C65849b bVar = new C65849b();
        Bitmap bitmap = this.f270749d;
        C87412m.m108593f(bitmap, "resource");
        bVar.mo89891b(bitmap);
        int width = this.f270750e.getThumbView().getWidth();
        int height = this.f270750e.getThumbView().getHeight();
        bVar.f189363b = width;
        bVar.f189364c = height;
        bVar.f189366e.f334033b.mo154924d();
        bVar.mo89890a(new C93812a(this.f270750e));
    }
}
