package com.tencent.p014mm.plugin.finder.extension.reddot.render;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.tencent.p014mm.plugin.finder.extension.reddot.render.RenderView;
import java.lang.ref.WeakReference;
import o40.C61926c;
import r60.C101350i;
import t60.C64207e;
import te3.C50301lr3;
import x60.C102564a;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.render.g */
public final class C105263g<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ BitmapDrawable f312746a;

    /* renamed from: b */
    public final /* synthetic */ RenderView f312747b;

    /* renamed from: c */
    public final /* synthetic */ RenderView.C105255c f312748c;

    /* renamed from: d */
    public final /* synthetic */ C50301lr3 f312749d;

    /* renamed from: e */
    public final /* synthetic */ WeakReference<View> f312750e;

    /* renamed from: f */
    public final /* synthetic */ long f312751f;

    /* renamed from: g */
    public final /* synthetic */ String f312752g;

    public C105263g(BitmapDrawable bitmapDrawable, RenderView renderView, RenderView.C105255c cVar, C50301lr3 lr32, WeakReference<View> weakReference, long j, String str) {
        this.f312746a = bitmapDrawable;
        this.f312747b = renderView;
        this.f312748c = cVar;
        this.f312749d = lr32;
        this.f312750e = weakReference;
        this.f312751f = j;
        this.f312752g = str;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Canvas canvas = new Canvas(this.f312746a.getBitmap());
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, this.f312746a.getBitmap().getWidth(), this.f312746a.getBitmap().getHeight());
        canvas.drawColor(this.f312747b.f312715i, PorterDuff.Mode.CLEAR);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawBitmap(bitmap, rect, rect2, new Paint(3));
        C61926c.m72668M(new C105262f(this.f312748c, this.f312749d, bitmap, this.f312747b, this.f312746a, this.f312750e, this.f312751f, rect, rect2, this.f312752g));
    }
}
