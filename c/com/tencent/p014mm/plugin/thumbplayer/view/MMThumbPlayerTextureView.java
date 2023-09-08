package com.tencent.p014mm.plugin.thumbplayer.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import m03.C61425b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B%\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/MMThumbPlayerTextureView;", "Lcom/tencent/mm/plugin/thumbplayer/view/MMTextureView;", "Lm03/b;", "Landroid/graphics/Rect;", "cropRect", "Lrx3/b0;", "setCropRect", "", "scaleType", "setScaleType", "getScaleType", "", "isOpaque", "setOpaqueInfo", "Landroid/view/TextureView$SurfaceTextureListener;", "listener", "setTextureListenerCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-thumbplayer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView */
public final class MMThumbPlayerTextureView extends MMTextureView implements C61425b {

    /* renamed from: h */
    public int f164644h;

    /* renamed from: i */
    public int f164645i;

    /* renamed from: j */
    public int f164646j;

    /* renamed from: n */
    public float f164647n;

    /* renamed from: o */
    public float f164648o;

    /* renamed from: p */
    public Rect f164649p = new Rect();

    /* renamed from: q */
    public TextureView.SurfaceTextureListener f164650q;

    /* renamed from: r */
    public final C57461a f164651r = new C57461a(this);

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView$a */
    public static final class C57461a implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ MMThumbPlayerTextureView f164652d;

        public C57461a(MMThumbPlayerTextureView mMThumbPlayerTextureView) {
            this.f164652d = mMThumbPlayerTextureView;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f164652d.f164650q;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f164652d.f164650q;
            if (surfaceTextureListener == null) {
                return false;
            }
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f164652d.f164650q;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f164652d.f164650q;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    }

    public MMThumbPlayerTextureView(Context context) {
        super(context);
        mo81144n();
    }

    /* renamed from: b */
    public void mo81140b(int i, int i2) {
        Log.m105924i("MicroMsg.TP.MMThumbPlayerTextureView", "setVideoWidthAndHeight videoWidth:" + this.f164645i + ", videoHeight:" + this.f164646j + ", width:" + i + ", height:" + i2 + " scaleType:" + this.f164644h);
        if (this.f164645i == i && this.f164646j == i2) {
            this.f164645i = i;
            this.f164646j = i2;
            return;
        }
        this.f164645i = i;
        this.f164646j = i2;
        requestLayout();
    }

    /* renamed from: f */
    public void mo81141f(float f, float f2) {
        this.f164647n = f;
        this.f164648o = f2;
    }

    public int getScaleType() {
        return this.f164644h;
    }

    /* renamed from: m */
    public final void mo81143m(int i, int i2) {
        Log.m105924i("MicroMsg.TP.MMThumbPlayerTextureView", "centerCrop, container:[" + i + ", " + i2 + ']');
        float f = (float) i;
        float f2 = f / ((float) this.f164645i);
        float f3 = (float) i2;
        float f4 = f3 / ((float) this.f164646j);
        float max = Math.max(f2, f4);
        float f5 = max / f2;
        float f6 = max / f4;
        Matrix matrix = new Matrix();
        matrix.setScale(f5, f6, f / 2.0f, f3 / 2.0f);
        Log.m105924i("MicroMsg.TP.MMThumbPlayerTextureView", "centerCrop matrix:" + matrix);
        setTransform(matrix);
    }

    /* renamed from: n */
    public final void mo81144n() {
        setOpaque(false);
        setAlpha(0.0f);
        setScaleX(1.0001f);
        setScaleY(1.0001f);
        setSurfaceTextureListener(this.f164651r);
    }

    public void onMeasure(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (this.f164645i == 0 || this.f164646j == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = View.getDefaultSize(1, i3);
        int defaultSize2 = View.getDefaultSize(1, i4);
        int i5 = this.f164645i;
        int i6 = this.f164646j;
        float f = (float) defaultSize;
        float f2 = (float) defaultSize2;
        int i7 = this.f164644h;
        if (i7 == 0) {
            mo81143m(defaultSize, defaultSize2);
        } else if (i7 == 1) {
            float f3 = f / ((float) i5);
            float f4 = f2 / ((float) i6);
            float min = Math.min(f3, f4);
            float f5 = min / f3;
            float f6 = min / f4;
            Matrix matrix = new Matrix();
            matrix.setScale(f5, f6, f / 2.0f, f2 / 2.0f);
            Log.m105924i("MicroMsg.TP.MMThumbPlayerTextureView", "centerFit, container:[" + defaultSize + ", " + defaultSize2 + "] matrix:" + matrix);
            setTransform(matrix);
        } else if (i7 != 3) {
            setTransform(new Matrix());
        } else if (!this.f164649p.isEmpty()) {
            Rect rect = this.f164649p;
            boolean z = false;
            if (!(this.f164647n == 0.0f)) {
                if (this.f164648o == 0.0f) {
                    z = true;
                }
                if (!z && !rect.isEmpty()) {
                    float f7 = f / this.f164647n;
                    float f8 = f2 / this.f164648o;
                    float max = Math.max(f7, f8);
                    float centerX = ((this.f164647n / 2.0f) - ((float) rect.centerX())) * (f / ((float) rect.width()));
                    float centerY = (this.f164648o / 2.0f) - ((float) rect.centerY());
                    Matrix matrix2 = new Matrix();
                    matrix2.setScale(max / f7, max / f8, f / 2.0f, f2 / 2.0f);
                    matrix2.postTranslate(centerX, centerY * (f2 / ((float) rect.height())));
                    Log.m105924i("MicroMsg.TP.MMThumbPlayerTextureView", "cropRect(), containerWidth:" + defaultSize + " containerHeight:" + defaultSize2 + ' ' + matrix2);
                    setTransform(matrix2);
                }
            }
        } else {
            mo81143m(defaultSize, defaultSize2);
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        Log.m105924i("MicroMsg.TP.MMThumbPlayerTextureView", "onMeasure#handleOnMeasureLikeMM video size[" + this.f164645i + ' ' + this.f164646j + "] spec[" + View.getDefaultSize(1, i3) + ", " + View.getDefaultSize(1, i4) + "] result=" + defaultSize + ',' + defaultSize2);
    }

    public void reset() {
        Log.m105924i("MicroMsg.TP.MMThumbPlayerTextureView", "reset cropRect=" + this.f164649p);
        this.f164649p = new Rect();
    }

    public void setCropRect(Rect rect) {
        C87412m.m108594g(rect, "cropRect");
        this.f164649p = rect;
        Log.m105924i("MicroMsg.TP.MMThumbPlayerTextureView", "setCropRect, cropRect:" + rect);
    }

    public void setOpaqueInfo(boolean z) {
        if (z) {
            setOpaque(true);
            setAlpha(1.0f);
            return;
        }
        setOpaque(false);
        setAlpha(0.0f);
    }

    public void setScaleType(int i) {
        Log.m105924i("MicroMsg.TP.MMThumbPlayerTextureView", "setScaleType, scaleType:" + i);
        this.f164644h = i;
    }

    public void setTextureListenerCallback(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f164650q = surfaceTextureListener;
    }

    public MMThumbPlayerTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo81144n();
    }

    public MMThumbPlayerTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo81144n();
    }
}
