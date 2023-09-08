package com.tencent.p014mm.plugin.finder.extension.reddot.render;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView;
import fy3.C32224a;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import rx3.C13598b0;
import te3.C50301lr3;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.f */
public final class C105262f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RenderView.C105255c f312736d;

    /* renamed from: e */
    public final /* synthetic */ C50301lr3 f312737e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f312738f;

    /* renamed from: g */
    public final /* synthetic */ RenderView f312739g;

    /* renamed from: h */
    public final /* synthetic */ BitmapDrawable f312740h;

    /* renamed from: i */
    public final /* synthetic */ WeakReference<View> f312741i;

    /* renamed from: j */
    public final /* synthetic */ long f312742j;

    /* renamed from: n */
    public final /* synthetic */ Rect f312743n;

    /* renamed from: o */
    public final /* synthetic */ Rect f312744o;

    /* renamed from: p */
    public final /* synthetic */ String f312745p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105262f(RenderView.C105255c cVar, C50301lr3 lr32, Bitmap bitmap, RenderView renderView, BitmapDrawable bitmapDrawable, WeakReference<View> weakReference, long j, Rect rect, Rect rect2, String str) {
        super(0);
        this.f312736d = cVar;
        this.f312737e = lr32;
        this.f312738f = bitmap;
        this.f312739g = renderView;
        this.f312740h = bitmapDrawable;
        this.f312741i = weakReference;
        this.f312742j = j;
        this.f312743n = rect;
        this.f312744o = rect2;
        this.f312745p = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r1.f135628d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.extension.reddot.render.RenderView$c r0 = r4.f312736d
            te3.lr3 r1 = r4.f312737e
            te3.ir3 r1 = r1.f137621f
            if (r1 == 0) goto L_0x000f
            te3.qy r1 = r1.f135628d
            if (r1 == 0) goto L_0x000f
            te3.jr3 r1 = r1.f140610e
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2 = 0
            int r0 = r0.mo149656b(r1, r2)
            android.graphics.Bitmap r1 = r4.f312738f
            if (r1 == 0) goto L_0x0032
            com.tencent.mm.plugin.finder.extension.reddot.render.RenderView r1 = r4.f312739g
            android.graphics.drawable.BitmapDrawable r2 = r4.f312740h
            com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView.m141348b(r1, r2, r0)
            android.graphics.drawable.BitmapDrawable r1 = r4.f312740h
            r1.invalidateSelf()
            java.lang.ref.WeakReference<android.view.View> r1 = r4.f312741i
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0032
            r1.invalidate()
        L_0x0032:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[asyncLoadIcon] token="
            r1.append(r2)
            long r2 = r4.f312742j
            r1.append(r2)
            java.lang.String r2 = " resource="
            r1.append(r2)
            android.graphics.Bitmap r2 = r4.f312738f
            r1.append(r2)
            java.lang.String r2 = " src="
            r1.append(r2)
            android.graphics.Rect r2 = r4.f312743n
            r1.append(r2)
            java.lang.String r2 = " dst="
            r1.append(r2)
            android.graphics.Rect r2 = r4.f312744o
            r1.append(r2)
            java.lang.String r2 = " TextView="
            r1.append(r2)
            java.lang.ref.WeakReference<android.view.View> r2 = r4.f312741i
            java.lang.Object r2 = r2.get()
            r1.append(r2)
            java.lang.String r2 = " color="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " iconUrl="
            r1.append(r0)
            java.lang.String r0 = r4.f312745p
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Finder.RenderView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.extension.reddot.render.C105262f.invoke():java.lang.Object");
    }
}
