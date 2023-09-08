package com.tencent.p014mm.videocomposition.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import gy3.C87412m;
import kotlin.Metadata;
import vp3.C111580c;
import vp3.C111599l;
import yp3.C112478a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B!\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0007R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/videocomposition/effect/EffectRenderView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/graphics/Bitmap;", "bitmap", "Lrx3/b0;", "setInputBitmap", "Lcom/tencent/mm/xeffect/effect/EffectManager;", "getEffectManager", "Lvp3/l;", "getReportData", "()Lvp3/l;", "reportData", "Lvp3/c$a;", "value", "getSurfaceCallback", "()Lvp3/c$a;", "setSurfaceCallback", "(Lvp3/c$a;)V", "surfaceCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "video_composition_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.videocomposition.effect.EffectRenderView */
public final class EffectRenderView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final String f165560d = ("EffectRenderView@" + hashCode());

    /* renamed from: e */
    public C111580c f165561e = new C111580c();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectRenderView(Context context) {
        super(context);
        C87412m.m108595h(context, "context");
        setSurfaceTextureListener(this);
        getReportData().f334061a = 2;
    }

    /* renamed from: a */
    public final void mo82358a(int i, int i2, int i3) {
        String str = this.f165560d;
        C112478a.m153625c(str, "setInputContentInfo, size:[" + i + ',' + i2 + "], rotate:" + i3, new Object[0]);
        this.f165561e.mo163264l(i, i2, i3);
    }

    public final EffectManager getEffectManager() {
        return this.f165561e.f334033b;
    }

    public final C111599l getReportData() {
        return this.f165561e.f334049r;
    }

    public final C111580c.C111581a getSurfaceCallback() {
        return this.f165561e.f334010A;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108595h(surfaceTexture, "surface");
        String str = this.f165560d;
        C112478a.m153625c(str, "onSurfaceTextureAvailable, surface:" + surfaceTexture.hashCode() + ", size:[" + i + ", " + i2 + ']', new Object[0]);
        C111580c cVar = this.f165561e;
        cVar.getClass();
        cVar.f334038g = new Surface(surfaceTexture);
        cVar.mo163272i(i, i2);
        cVar.mo163261d();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108595h(surfaceTexture, "surface");
        String str = this.f165560d;
        C112478a.m153625c(str, "onSurfaceTextureDestroyed, surface:" + surfaceTexture.hashCode(), new Object[0]);
        this.f165561e.mo163259b();
        C111580c cVar = this.f165561e;
        EffectManager effectManager = cVar.f334033b;
        C111580c.C111581a aVar = cVar.f334010A;
        C111580c cVar2 = new C111580c();
        this.f165561e = cVar2;
        cVar2.mo163265m(aVar);
        C111580c cVar3 = this.f165561e;
        cVar3.getClass();
        C87412m.m108595h(effectManager, "<set-?>");
        cVar3.f334033b = effectManager;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108595h(surfaceTexture, "surface");
        String str = this.f165560d;
        C112478a.m153625c(str, "onSurfaceTextureSizeChanged, surface:" + surfaceTexture.hashCode() + ", size:[" + i + ", " + i2 + ']', new Object[0]);
        this.f165561e.mo163272i(i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108595h(surfaceTexture, "surface");
    }

    public final void setInputBitmap(Bitmap bitmap) {
        C87412m.m108595h(bitmap, "bitmap");
        String str = this.f165560d;
        C112478a.m153625c(str, "setInputBitmap: " + bitmap + ", size:[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ']', new Object[0]);
        this.f165561e.mo163263k(bitmap);
    }

    public final void setSurfaceCallback(C111580c.C111581a aVar) {
        this.f165561e.mo163265m(aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108595h(context, "context");
        C87412m.m108595h(attributeSet, "attrs");
        setSurfaceTextureListener(this);
        getReportData().f334061a = 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108595h(context, "context");
        C87412m.m108595h(attributeSet, "attrs");
        setSurfaceTextureListener(this);
        getReportData().f334061a = 2;
    }
}
