package com.tencent.p014mm.plugin.vlog.p117ui.preview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Size;
import android.view.TextureView;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.plugin.vlog.model.C96554r0;
import com.tencent.p014mm.plugin.vlog.model.C96557v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32227p;
import gy3.C87412m;
import k23.C108860f;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019B\u001d\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u001aJ\"\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003J\"\u0010\n\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPreloadPlayView;", "Lcom/tencent/mm/ui/base/MMTextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lkotlin/Function2;", "", "Lrx3/b0;", "onSizeChanged", "setOnSizeChangedListener", "", "onProgress", "setOnProgressListener", "", "mute", "setMute", "Landroid/graphics/Rect;", "rect", "setCropRect", "Landroid/util/Size;", "getSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.preview.VLogPreloadPlayView */
public final class VLogPreloadPlayView extends MMTextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: h */
    public HandlerThread f316820h = C97749e.m126093a("VLogPlayView_PreviewPlayer", -4);

    /* renamed from: i */
    public MMHandler f316821i;

    /* renamed from: j */
    public C96557v0 f316822j;

    /* renamed from: n */
    public SurfaceTexture f316823n;

    /* renamed from: o */
    public C32227p<? super Integer, ? super Integer, C13598b0> f316824o;

    /* renamed from: p */
    public C32227p<? super Long, ? super Long, C13598b0> f316825p;

    public VLogPreloadPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = C58834h.f168432b;
        setSurfaceTextureListener(this);
        C96554r0 r0Var = C108860f.f325994a;
    }

    /* renamed from: E */
    public final void mo152297E(SurfaceTexture surfaceTexture) {
        Log.m105924i("MicroMsg.VLogPreloadPlayView", "bindPreloadManager surfaceTexture:" + surfaceTexture);
        if (surfaceTexture != null) {
            C96554r0 r0Var = C108860f.f325994a;
            Log.m105924i("MicroMsg.VLogPreloadPlayView", "vLogDirector init : 0, vLogSurface : 0");
            if (this.f316822j != null) {
                Log.m105924i("MicroMsg.VLogPreloadPlayView", "later set model: " + this.f316822j);
            }
        }
    }

    public final Size getSize() {
        return null;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        Log.m105924i("MicroMsg.VLogPreloadPlayView", "surfaceAvailable, surfaceTexture:" + surfaceTexture + ", width:" + i + ", height:" + i2);
        this.f316823n = surfaceTexture;
        if (!this.f316820h.isAlive()) {
            this.f316820h.start();
            Log.m105924i("MicroMsg.VLogPreloadPlayView", "previewPlayerThread is not alive, start");
        } else {
            Log.m105924i("MicroMsg.VLogPreloadPlayView", "previewPlayerThread is alive");
        }
        this.f316821i = new MMHandler(this.f316820h.getLooper());
        mo152297E(surfaceTexture);
        C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f316824o;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("MicroMsg.VLogPreloadPlayView", "surfaceDestroy");
        surfaceTexture.release();
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        Log.m105924i("MicroMsg.VLogPreloadPlayView", "surfaceSizeChanged, surfaceTexture:" + surfaceTexture + ", width:" + i + ", height:" + i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }

    public final void setCropRect(Rect rect) {
    }

    public final void setMute(boolean z) {
    }

    public final void setOnProgressListener(C32227p<? super Long, ? super Long, C13598b0> pVar) {
        this.f316825p = pVar;
    }

    public final void setOnSizeChangedListener(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f316824o = pVar;
    }

    public VLogPreloadPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = C58834h.f168432b;
        setSurfaceTextureListener(this);
        C96554r0 r0Var = C108860f.f325994a;
    }

    public VLogPreloadPlayView(Context context) {
        super(context);
        int i = C58834h.f168432b;
        setSurfaceTextureListener(this);
        C96554r0 r0Var = C108860f.f325994a;
    }
}
