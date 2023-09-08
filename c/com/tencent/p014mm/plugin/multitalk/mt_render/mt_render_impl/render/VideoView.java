package com.tencent.p014mm.plugin.multitalk.mt_render.mt_render_impl.render;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Size;
import android.view.TextureView;
import c92.C104328f;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import m82.C109548c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u00108\u001a\u000207\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@BX\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR.\u00100\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0017\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u0014\u00102\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0013R\u0016\u00106\u001a\u0004\u0018\u0001038VX\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006="}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitalk/mt_render/mt_render_impl/render/VideoView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lm82/c$b;", "", "ori", "Lrx3/b0;", "setScreenOri", "Landroid/graphics/SurfaceTexture;", "<set-?>", "d", "Landroid/graphics/SurfaceTexture;", "getRenderSurface", "()Landroid/graphics/SurfaceTexture;", "renderSurface", "Landroid/util/Size;", "e", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "size", "Lkotlin/Function1;", "g", "Lfy3/l;", "getOnOriChange", "()Lfy3/l;", "setOnOriChange", "(Lfy3/l;)V", "onOriChange", "Lkotlin/Function0;", "h", "Lfy3/a;", "getOnFrame", "()Lfy3/a;", "setOnFrame", "(Lfy3/a;)V", "onFrame", "j", "getOnSurfaceTextureDestroyedCallback", "setOnSurfaceTextureDestroyedCallback", "onSurfaceTextureDestroyedCallback", "n", "getOnSurfaceTextureAvailable", "setOnSurfaceTextureAvailable", "onSurfaceTextureAvailable", "o", "getOnSurfaceTextureUpdate", "setOnSurfaceTextureUpdate", "onSurfaceTextureUpdate", "getRenderSize", "renderSize", "", "getRenderTarget", "()Ljava/lang/Object;", "renderTarget", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView */
public final class VideoView extends TextureView implements TextureView.SurfaceTextureListener, C109548c.C109550b {

    /* renamed from: d */
    public SurfaceTexture f314867d;

    /* renamed from: e */
    public Size f314868e = new Size(0, 0);

    /* renamed from: f */
    public int f314869f = -1;

    /* renamed from: g */
    public C32226l<? super Integer, C13598b0> f314870g = C105864b.f314879d;

    /* renamed from: h */
    public C32224a<C13598b0> f314871h = C105863a.f314878d;

    /* renamed from: i */
    public volatile boolean f314872i;

    /* renamed from: j */
    public C32226l<? super SurfaceTexture, C13598b0> f314873j = C105866d.f314881d;

    /* renamed from: n */
    public C32226l<? super SurfaceTexture, C13598b0> f314874n = C105865c.f314880d;

    /* renamed from: o */
    public C32226l<? super SurfaceTexture, C13598b0> f314875o = C105867e.f314882d;

    /* renamed from: p */
    public int f314876p;

    /* renamed from: q */
    public long f314877q;

    /* renamed from: com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView$a */
    public static final class C105863a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C105863a f314878d = new C105863a();

        public C105863a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView$b */
    public static final class C105864b extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C105864b f314879d = new C105864b();

        public C105864b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView$c */
    public static final class C105865c extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public static final C105865c f314880d = new C105865c();

        public C105865c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((SurfaceTexture) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView$d */
    public static final class C105866d extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public static final C105866d f314881d = new C105866d();

        public C105866d() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((SurfaceTexture) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView$e */
    public static final class C105867e extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public static final C105867e f314882d = new C105867e();

        public C105867e() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((SurfaceTexture) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setSurfaceTextureListener(this);
    }

    /* renamed from: b */
    public void mo150849b() {
        this.f314876p++;
        this.f314871h.invoke();
        if (System.currentTimeMillis() - this.f314877q >= 1000) {
            C104328f fVar = C104328f.f308805a;
            C104328f.f308815k += this.f314876p;
            C104328f.f308816l++;
            this.f314876p = 0;
            this.f314877q = System.currentTimeMillis();
        }
    }

    public final C32224a<C13598b0> getOnFrame() {
        return this.f314871h;
    }

    public final C32226l<Integer, C13598b0> getOnOriChange() {
        return this.f314870g;
    }

    public final C32226l<SurfaceTexture, C13598b0> getOnSurfaceTextureAvailable() {
        return this.f314874n;
    }

    public final C32226l<SurfaceTexture, C13598b0> getOnSurfaceTextureDestroyedCallback() {
        return this.f314873j;
    }

    public final C32226l<SurfaceTexture, C13598b0> getOnSurfaceTextureUpdate() {
        return this.f314875o;
    }

    public Size getRenderSize() {
        return this.f314868e;
    }

    public final SurfaceTexture getRenderSurface() {
        return this.f314867d;
    }

    public Object getRenderTarget() {
        return this.f314867d;
    }

    public final Size getSize() {
        return this.f314868e;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("MicroMsg.MTR.VideoView", "onSurfaceTextureAvailable() called with: surface = " + surfaceTexture + ", width = " + i + ", height = " + i2);
        this.f314867d = surfaceTexture;
        this.f314872i = false;
        this.f314868e = new Size(i, i2);
        this.f314874n.invoke(surfaceTexture);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("MicroMsg.MTR.VideoView", "onSurfaceTextureDestroyed() called with: surface = " + surfaceTexture);
        if (this.f314872i) {
            return false;
        }
        this.f314873j.invoke(surfaceTexture);
        this.f314872i = true;
        SurfaceTexture surfaceTexture2 = this.f314867d;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.f314867d = null;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("MicroMsg.MTR.VideoView", "onSurfaceTextureSizeChanged() called with: surface = " + surfaceTexture + ", width = " + i + ", height = " + i2);
        this.f314868e = new Size(i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        this.f314875o.invoke(surfaceTexture);
    }

    public final void setOnFrame(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f314871h = aVar;
    }

    public final void setOnOriChange(C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.f314870g = lVar;
    }

    public final void setOnSurfaceTextureAvailable(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.f314874n = lVar;
    }

    public final void setOnSurfaceTextureDestroyedCallback(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.f314873j = lVar;
    }

    public final void setOnSurfaceTextureUpdate(C32226l<? super SurfaceTexture, C13598b0> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.f314875o = lVar;
    }

    public void setScreenOri(int i) {
        if (i != this.f314869f) {
            this.f314869f = i;
            this.f314870g.invoke(Integer.valueOf(i));
        }
    }
}
