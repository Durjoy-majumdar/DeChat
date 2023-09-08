package com.tencent.p014mm.live.core.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import b50.C54407c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.debug.LiveDebugView;
import com.tencent.p014mm.live.core.trtc.TRTCVideoRatioLayout;
import com.tencent.p014mm.live.core.view.LiveCameraOptionView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C13598b0;
import u50.C65212a;
import u50.C65214c;
import v50.C65547a;
import z40.C66733d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\"\u0010\u0011\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/live/core/view/LivePreviewView;", "Landroid/widget/RelativeLayout;", "Lu50/a;", "callback", "Lrx3/b0;", "setPluginCallback", "Landroid/view/TextureView;", "getCameraView", "cameraView", "setCameraOptionPreviewView", "Lcom/tencent/mm/live/core/view/LiveCameraOptionView$a;", "setupTouchMoveCallback", "", "enable", "setCameraOptionEnable", "Lkotlin/Function2;", "", "setPreviewTouchListener", "Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;", "e", "Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;", "getRenderRatioLayout", "()Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;", "setRenderRatioLayout", "(Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;)V", "renderRatioLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.view.LivePreviewView */
public class LivePreviewView extends RelativeLayout {

    /* renamed from: d */
    public final String f157152d = "MicroMsg.LiveCore";

    /* renamed from: e */
    public TRTCVideoRatioLayout f157153e;

    /* renamed from: f */
    public LiveCameraOptionView f157154f;

    /* renamed from: g */
    public C32227p<? super Float, ? super Float, C13598b0> f157155g;

    /* renamed from: h */
    public long f157156h = -1;

    /* renamed from: i */
    public C32226l<? super SurfaceTexture, C13598b0> f157157i;

    /* renamed from: j */
    public C32227p<? super Integer, ? super Integer, C13598b0> f157158j;

    /* renamed from: n */
    public C32227p<? super Boolean, ? super Boolean, C13598b0> f157159n;

    /* renamed from: o */
    public C32224a<C13598b0> f157160o;

    /* renamed from: p */
    public TextureView f157161p;

    /* renamed from: q */
    public C55210b f157162q = new C55210b(this);

    /* renamed from: com.tencent.mm.live.core.view.LivePreviewView$a */
    public static final class C55209a implements LiveCameraOptionView.C55208a {

        /* renamed from: a */
        public final /* synthetic */ LiveCameraOptionView.C55208a f157163a;

        /* renamed from: b */
        public final /* synthetic */ LivePreviewView f157164b;

        public C55209a(LiveCameraOptionView.C55208a aVar, LivePreviewView livePreviewView) {
            this.f157163a = aVar;
            this.f157164b = livePreviewView;
        }

        /* renamed from: a */
        public void mo76414a() {
            this.f157163a.mo76414a();
            C32227p<? super Boolean, ? super Boolean, C13598b0> pVar = this.f157164b.f157159n;
            if (pVar != null) {
                C13598b0 invoke = pVar.invoke(Boolean.TRUE, Boolean.FALSE);
            }
        }

        /* renamed from: b */
        public void mo76415b() {
            this.f157163a.mo76415b();
            C32227p<? super Boolean, ? super Boolean, C13598b0> pVar = this.f157164b.f157159n;
            if (pVar != null) {
                Boolean bool = Boolean.FALSE;
                C13598b0 invoke = pVar.invoke(bool, bool);
            }
        }

        /* renamed from: c */
        public void mo76416c() {
            this.f157163a.mo76416c();
            C32227p<? super Boolean, ? super Boolean, C13598b0> pVar = this.f157164b.f157159n;
            if (pVar != null) {
                C13598b0 invoke = pVar.invoke(Boolean.FALSE, Boolean.TRUE);
            }
        }

        /* renamed from: d */
        public void mo76417d(float f, float f2, int i, int i2, long j) {
            this.f157163a.mo76417d(f, f2, i, i2, j);
            C32227p<? super Boolean, ? super Boolean, C13598b0> pVar = this.f157164b.f157159n;
            if (pVar != null) {
                C13598b0 invoke = pVar.invoke(Boolean.FALSE, Boolean.TRUE);
            }
        }
    }

    /* renamed from: com.tencent.mm.live.core.view.LivePreviewView$b */
    public static final class C55210b implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ LivePreviewView f157165d;

        public C55210b(LivePreviewView livePreviewView) {
            this.f157165d = livePreviewView;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = this.f157165d.f157152d;
            Log.m105924i(str, "onSurfaceTextureAvailable " + surfaceTexture);
            C32226l<? super SurfaceTexture, C13598b0> lVar = this.f157165d.f157157i;
            if (lVar != null) {
                C13598b0 invoke = lVar.invoke(surfaceTexture);
            }
            C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f157165d.f157158j;
            if (pVar != null) {
                C13598b0 invoke2 = pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }
            C32224a<C13598b0> aVar = this.f157165d.f157160o;
            if (aVar != null) {
                C13598b0 invoke3 = aVar.invoke();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = this.f157165d.f157152d;
            Log.m105924i(str, "onSurfaceTextureDestroyed " + surfaceTexture);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = this.f157165d.f157152d;
            Log.m105924i(str, "onSurfaceTextureSizeChanged width is " + i + " and height is " + i2 + ' ' + surfaceTexture);
            C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f157165d.f157158j;
            if (pVar != null) {
                C13598b0 invoke = pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            String str = this.f157165d.f157152d;
            Log.m105924i(str, "onSurfaceTextureUpdated " + surfaceTexture);
        }
    }

    public LivePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b7r, this, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.oo6);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.render_ratio_view)");
        this.f157153e = (TRTCVideoRatioLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.fti);
        C87412m.m108593f(findViewById2, "parent.findViewById(R.id.live_debug_view)");
        LiveDebugView liveDebugView = (LiveDebugView) findViewById2;
        this.f157154f = (LiveCameraOptionView) inflate.findViewById(C0966R.C0970id.o98);
        C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LIVE_DEBUG_VIEW_INT_SYNC, 0);
    }

    /* renamed from: a */
    public final TXCloudVideoView mo76418a(String str, int i) {
        TRTCVideoRatioLayout tRTCVideoRatioLayout = this.f157153e;
        if (str == null) {
            str = "";
        }
        return tRTCVideoRatioLayout.mo76403d(str, i).getVideoView();
    }

    /* renamed from: b */
    public final void mo76419b(ArrayList<C65547a> arrayList, Rect rect) {
        C87412m.m108594g(arrayList, "list");
        C87412m.m108594g(rect, "viewRect");
        TRTCVideoRatioLayout tRTCVideoRatioLayout = this.f157153e;
        tRTCVideoRatioLayout.getClass();
        C65214c cVar = tRTCVideoRatioLayout.f157126n;
        cVar.getClass();
        Log.m105924i("TRTCRatioVideoAdapter", "updateData dataSize: " + arrayList.size() + " viewRect: " + rect);
        if (arrayList.size() <= 1) {
            cVar.f187734b.mo76401a();
        }
        cVar.f187735c.clear();
        cVar.f187735c.addAll(arrayList);
        cVar.mo85559g();
    }

    /* renamed from: c */
    public final void mo76420c() {
        TRTCVideoRatioLayout.C55206a aVar = this.f157153e.f157123h;
        aVar.removeView(aVar.f157129f);
        aVar.addView(aVar.f157129f, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: d */
    public final void mo76421d(C32226l<? super SurfaceTexture, C13598b0> lVar, C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        this.f157157i = lVar;
        this.f157158j = pVar;
        TextureView textureView = this.f157161p;
        if (textureView == null) {
            getCameraView().setSurfaceTextureListener(this.f157162q);
        } else if (textureView != null) {
            textureView.setSurfaceTextureListener(this.f157162q);
        }
        String str = this.f157152d;
        Log.m105924i(str, "setupSurface " + this.f157162q + " cameraOptionPreviewView: " + this.f157161p);
    }

    public final TextureView getCameraView() {
        return this.f157153e.getCameraView();
    }

    public final TRTCVideoRatioLayout getRenderRatioLayout() {
        return this.f157153e;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f157156h = System.currentTimeMillis();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f157156h > 0 && System.currentTimeMillis() - this.f157156h <= ((long) ViewConfiguration.getTapTimeout())) {
                Log.m105918d(this.f157152d, "preview action up");
                C32227p<? super Float, ? super Float, C13598b0> pVar = this.f157155g;
                if (pVar != null) {
                    pVar.invoke(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
                }
            }
            this.f157156h = -1;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setCameraOptionEnable(boolean z) {
        LiveCameraOptionView liveCameraOptionView;
        C66733d dVar = C66733d.f191763a;
        C54407c cVar = C66733d.f191764b;
        boolean z2 = true;
        int i = 0;
        if (cVar == null || !cVar.mo75202b5()) {
            z2 = false;
        }
        if (z2 && (liveCameraOptionView = this.f157154f) != null) {
            if (!z) {
                i = 8;
            }
            liveCameraOptionView.setVisibility(i);
        }
    }

    public final void setCameraOptionPreviewView(TextureView textureView) {
        this.f157161p = textureView;
    }

    public final void setPluginCallback(C65212a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f157153e.setPluginCallback(aVar);
    }

    public final void setPreviewTouchListener(C32227p<? super Float, ? super Float, C13598b0> pVar) {
        this.f157155g = pVar;
    }

    public final void setRenderRatioLayout(TRTCVideoRatioLayout tRTCVideoRatioLayout) {
        C87412m.m108594g(tRTCVideoRatioLayout, "<set-?>");
        this.f157153e = tRTCVideoRatioLayout;
    }

    public final void setupTouchMoveCallback(LiveCameraOptionView.C55208a aVar) {
        LiveCameraOptionView liveCameraOptionView;
        C87412m.m108594g(aVar, "callback");
        C66733d dVar = C66733d.f191763a;
        C54407c cVar = C66733d.f191764b;
        boolean z = true;
        if (cVar == null || !cVar.mo75202b5()) {
            z = false;
        }
        if (z && (liveCameraOptionView = this.f157154f) != null) {
            liveCameraOptionView.setTouchCallback(new C55209a(aVar, this));
        }
    }
}
