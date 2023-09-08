package com.tencent.p014mm.plugin.vlog.p117ui.preview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g23.C107700e;
import g23.C107701f;
import g23.C107709l;
import g23.C107715p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/preview/VLogPlayView;", "Lcom/tencent/mm/ui/base/MMTextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/graphics/Rect;", "rect", "Lrx3/b0;", "setCropRect", "", "mute", "setMute", "Lkotlin/Function0;", "prepareCallback", "setPrepareCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.preview.VLogPlayView */
public final class VLogPlayView extends MMTextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: r */
    public static final /* synthetic */ int f316810r = 0;

    /* renamed from: h */
    public HandlerThread f316811h;

    /* renamed from: i */
    public MMHandler f316812i;

    /* renamed from: j */
    public C107701f f316813j;

    /* renamed from: n */
    public C107715p f316814n;

    /* renamed from: o */
    public C32224a<C13598b0> f316815o;

    /* renamed from: p */
    public boolean f316816p;

    /* renamed from: q */
    public Rect f316817q;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.preview.VLogPlayView$a */
    public static final class C106261a extends C87413o implements C32227p<Long, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VLogPlayView f316818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106261a(VLogPlayView vLogPlayView) {
            super(2);
            this.f316818d = vLogPlayView;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).longValue();
            ((Number) obj2).longValue();
            VLogPlayView vLogPlayView = this.f316818d;
            int i = VLogPlayView.f316810r;
            vLogPlayView.getClass();
            this.f316818d.getClass();
            this.f316818d.getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.preview.VLogPlayView$b */
    public static final class C106262b extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VLogPlayView f316819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106262b(VLogPlayView vLogPlayView) {
            super(1);
            this.f316819d = vLogPlayView;
        }

        public Object invoke(Object obj) {
            ((Number) obj).longValue();
            Log.m105924i("MicroMsg.VLogPlayView", "onDecodeEnd");
            VLogPlayView vLogPlayView = this.f316819d;
            int i = VLogPlayView.f316810r;
            vLogPlayView.getClass();
            return C13598b0.f38549a;
        }
    }

    public VLogPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setSurfaceTextureListener(this);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        Log.m105924i("MicroMsg.VLogPlayView", "surfaceAvailable, surfaceTexture:" + surfaceTexture + ", width:" + i + ", height:" + i2);
        int i3 = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("VLogPlayView_PreviewPlayer", -4);
        this.f316811h = a;
        a.start();
        HandlerThread handlerThread = this.f316811h;
        this.f316812i = new MMHandler(handlerThread != null ? handlerThread.getLooper() : null);
        C107709l lVar = new C107709l(i, i2);
        this.f316814n = lVar;
        lVar.mo158115a(new Surface(surfaceTexture));
        C107701f fVar = new C107701f(i, i2, true, true);
        this.f316813j = fVar;
        C107715p pVar = this.f316814n;
        C87412m.m108591d(pVar);
        fVar.mo158112e(pVar);
        C107701f fVar2 = this.f316813j;
        if (fVar2 != null) {
            fVar2.mo158110c(30, 30);
        }
        C107701f fVar3 = this.f316813j;
        if (fVar3 != null) {
            fVar3.f322241h = new C106261a(this);
            fVar3.f322242i = new C106262b(this);
            Rect rect = this.f316817q;
            if (rect != null) {
                fVar3.mo158109b(rect);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("MicroMsg.VLogPlayView", "surfaceDestroy");
        surfaceTexture.release();
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        Log.m105924i("MicroMsg.VLogPlayView", "surfaceSizeChanged, surfaceTexture:" + surfaceTexture + ", width:" + i + ", height:" + i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }

    public final void setCropRect(Rect rect) {
        C107701f fVar = this.f316813j;
        if (fVar == null) {
            this.f316817q = rect;
        } else if (fVar != null) {
            fVar.mo158109b(rect);
        }
    }

    public final void setMute(boolean z) {
        C107715p pVar;
        C107701f fVar = this.f316813j;
        if (fVar != null && (pVar = fVar.f322240g) != null) {
            pVar.mo158117c(new C107700e(fVar, z));
        }
    }

    public final void setPrepareCallback(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "prepareCallback");
        this.f316815o = aVar;
    }

    public VLogPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
    }
}
