package com.tencent.p014mm.plugin.magicbrush.view;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86180g;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import sx3.C36907w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/view/MBSurfaceStub;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "", "Landroid/graphics/RectF;", "rectList", "Lrx3/b0;", "setTouchableRectList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mb-commons_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub */
public final class MBSurfaceStub extends FrameLayout implements TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public TextureView f248444d;

    /* renamed from: e */
    public SurfaceTexture f248445e;

    /* renamed from: f */
    public Surface f248446f;

    /* renamed from: g */
    public int f248447g;

    /* renamed from: h */
    public List<? extends RectF> f248448h;

    /* renamed from: i */
    public C86180g f248449i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MBSurfaceStub(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "texture");
        Log.m105924i("MBSurfaceStub", "onSurfaceTextureAvailable: " + i + ' ' + i2 + ' ' + this.f248447g);
        this.f248445e = surfaceTexture;
        Surface surface = new Surface(surfaceTexture);
        this.f248446f = surface;
        C86180g gVar = this.f248449i;
        if (gVar != null) {
            gVar.mo120582j(this.f248447g, surface, i, i2);
        } else {
            C87412m.m108603p("canvasEventConsumer");
            throw null;
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("MBSurfaceStub", "onSurfaceTextureDestroyed " + this.f248447g);
        C86180g gVar = this.f248449i;
        if (gVar != null) {
            gVar.mo120580f(this.f248447g);
            return false;
        }
        C87412m.m108603p("canvasEventConsumer");
        throw null;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        Log.m105924i("MBSurfaceStub", "onSurfaceTextureSizeChanged: " + i + ' ' + i2 + ' ' + this.f248447g);
        C86180g gVar = this.f248449i;
        if (gVar != null) {
            gVar.mo120581g(this.f248447g, i, i2);
        } else {
            C87412m.m108603p("canvasEventConsumer");
            throw null;
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C87412m.m108594g(motionEvent, "event");
        if (this.f248444d == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            List<? extends RectF> list = this.f248448h;
            if (list == null) {
                z = true;
            } else {
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((RectF) it.next()).contains(motionEvent.getX(), motionEvent.getY())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    z = true;
                }
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        int[] iArr = new int[motionEvent.getPointerCount()];
        float[] fArr = new float[motionEvent.getPointerCount()];
        float[] fArr2 = new float[motionEvent.getPointerCount()];
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            iArr[i] = motionEvent.getPointerId(i);
            fArr[i] = motionEvent.getX(i);
            fArr2[i] = motionEvent.getY(i);
        }
        C86180g gVar = this.f248449i;
        if (gVar != null) {
            gVar.mo120583l(this.f248447g, motionEvent.getActionMasked(), motionEvent.getActionIndex(), motionEvent.getEventTime(), iArr, fArr, fArr2);
            return true;
        }
        C87412m.m108603p("canvasEventConsumer");
        throw null;
    }

    public final void setTouchableRectList(List<? extends RectF> list) {
        String str;
        C87412m.m108594g(list, "rectList");
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (RectF rectF : list) {
                arrayList.add(rectF.toString());
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = ((String) next) + ';' + ((String) it.next());
                }
                str = (String) next;
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        } else {
            str = "";
        }
        C87412m.m108593f(str, "if (rectList.isNotEmpty(… s -> \"$acc;$s\" } else \"\"");
        Log.m105918d("MBSurfaceStub", "setTouchableRect " + str);
        this.f248448h = list;
    }
}
