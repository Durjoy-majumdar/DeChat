package com.tencent.p014mm.plugin.thumbplayer.render;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import k03.C60931a;
import k03.C60933b;
import k03.C60934c;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/B#\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u00100\u001a\u00020\u0011¢\u0006\u0004\b.\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016R*\u0010!\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00118\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00062"}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/render/MMSurfaceViewRender;", "Landroid/view/SurfaceView;", "Lk03/a;", "", "getTagPrefix", "Landroid/graphics/Bitmap;", "getBitmap", "getLogTag", "", "isOpaque", "Lrx3/b0;", "setOpaqueInfo", "tag", "setTagPrefix", "Lk03/a$a;", "listener", "setSurfaceListener", "", "type", "setScaleType", "Landroid/graphics/Rect;", "cropRect", "setCropRect", "getScaleType", "Landroid/view/Surface;", "getSurface", "value", "h", "I", "getVideoDegree", "()I", "setVideoDegree", "(I)V", "videoDegree", "Lk03/c;", "o", "Lk03/c;", "getSurfaceViewSwitchHelper", "()Lk03/c;", "setSurfaceViewSwitchHelper", "(Lk03/c;)V", "surfaceViewSwitchHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender */
public final class MMSurfaceViewRender extends SurfaceView implements C60931a {

    /* renamed from: d */
    public String f164600d = "PREFIX";

    /* renamed from: e */
    public C60931a.C60932a f164601e;

    /* renamed from: f */
    public int f164602f;

    /* renamed from: g */
    public Rect f164603g = new Rect();

    /* renamed from: h */
    public int f164604h;

    /* renamed from: i */
    public int f164605i;

    /* renamed from: j */
    public int f164606j;

    /* renamed from: n */
    public Surface f164607n;

    /* renamed from: o */
    public C60934c f164608o;

    /* renamed from: com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender$a */
    public static final class C57458a implements SurfaceHolder.Callback {

        /* renamed from: d */
        public final /* synthetic */ MMSurfaceViewRender f164609d;

        public C57458a(MMSurfaceViewRender mMSurfaceViewRender) {
            this.f164609d = mMSurfaceViewRender;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C87412m.m108594g(surfaceHolder, "holder");
            String logTag = this.f164609d.getLogTag();
            Log.m105924i(logTag, "surfaceChanged format:" + i + " [" + i2 + ' ' + i3 + "] listener:" + this.f164609d.f164601e);
            C60931a.C60932a aVar = this.f164609d.f164601e;
            if (aVar != null) {
                aVar.mo24864a(surfaceHolder, i2, i3);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            String logTag = this.f164609d.getLogTag();
            Log.m105924i(logTag, "surfaceCreated listener:" + this.f164609d.f164601e);
            this.f164609d.f164607n = surfaceHolder.getSurface();
            C60931a.C60932a aVar = this.f164609d.f164601e;
            if (aVar != null) {
                aVar.mo24865b(surfaceHolder);
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            String logTag = this.f164609d.getLogTag();
            Log.m105924i(logTag, "surfaceDestroy listener:" + this.f164609d.f164601e);
            C60931a.C60932a aVar = this.f164609d.f164601e;
            if (aVar != null) {
                aVar.mo24867d(surfaceHolder);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo81068c();
    }

    private final String getTagPrefix() {
        return this.f164600d;
    }

    /* renamed from: a */
    public final int[] mo81066a(float f, float f2, int i, int i2) {
        if (f < f2) {
            i2 = (int) (((float) i) / f);
        } else {
            i = (int) (((float) i2) * f);
        }
        return new int[]{i, i2};
    }

    /* renamed from: b */
    public void mo81067b(int i, int i2) {
        if (this.f164605i == i && this.f164606j == i2) {
            this.f164605i = i;
            this.f164606j = i2;
            return;
        }
        this.f164605i = i;
        this.f164606j = i2;
        requestLayout();
    }

    /* renamed from: c */
    public final void mo81068c() {
        if (Build.VERSION.SDK_INT >= 26) {
            getHolder().setFormat(22);
        }
        getHolder().addCallback(new C57458a(this));
    }

    public Bitmap getBitmap() {
        return null;
    }

    public String getLogTag() {
        return getTagPrefix() + "_MMSurfaceViewRender";
    }

    public int getScaleType() {
        return this.f164602f;
    }

    public Surface getSurface() {
        return this.f164607n;
    }

    public final C60934c getSurfaceViewSwitchHelper() {
        return this.f164608o;
    }

    public final int getVideoDegree() {
        return this.f164604h;
    }

    public void onMeasure(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        super.onMeasure(i, i2);
        if (this.f164605i == 0 || this.f164606j == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = View.getDefaultSize(1, i);
        int defaultSize2 = View.getDefaultSize(1, i2);
        float f = (((float) this.f164605i) * 1.0f) / ((float) this.f164606j);
        float f2 = (float) defaultSize;
        float f3 = (float) defaultSize2;
        float f4 = (1.0f * f2) / f3;
        int scaleType = getScaleType();
        if (scaleType == 0) {
            iArr = mo81066a(f, f4, defaultSize, defaultSize2);
        } else if (scaleType == 1) {
            if (f > f4) {
                i3 = (int) (f2 / f);
                i4 = defaultSize;
            } else {
                i4 = (int) (f3 * f);
                i3 = defaultSize2;
            }
            iArr = new int[]{i4, i3};
        } else if (scaleType != 3) {
            if (f > f4) {
                i5 = (int) (f2 / f);
                i6 = defaultSize;
            } else {
                i6 = (int) (f3 * f);
                i5 = defaultSize2;
            }
            iArr = new int[]{i6, i5};
        } else {
            iArr = !this.f164603g.isEmpty() ? mo81066a(f, f4, defaultSize, defaultSize2) : mo81066a(f, f4, defaultSize, defaultSize2);
        }
        post(new C60933b(this, iArr));
        setMeasuredDimension(iArr[0], iArr[1]);
        String logTag = getLogTag();
        Log.m105924i(logTag, "handleOnMeasure, type:" + getScaleType() + " video size[" + this.f164605i + ' ' + this.f164606j + "] container:[" + defaultSize + ", " + defaultSize2 + "]  result=" + iArr[0] + ',' + iArr[1]);
    }

    public void reset() {
    }

    public void setCropRect(Rect rect) {
        C87412m.m108594g(rect, "cropRect");
        String logTag = getLogTag();
        Log.m105924i(logTag, "setCropRect, cropRect:" + rect);
        this.f164603g = rect;
    }

    public void setOpaqueInfo(boolean z) {
    }

    public void setScaleType(int i) {
        String logTag = getLogTag();
        Log.m105924i(logTag, "setScaleType type:" + i);
        this.f164602f = i;
    }

    public void setSurfaceListener(C60931a.C60932a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f164601e = aVar;
    }

    public final void setSurfaceViewSwitchHelper(C60934c cVar) {
        this.f164608o = cVar;
    }

    public void setTagPrefix(String str) {
        C87412m.m108594g(str, "tag");
        this.f164600d = str;
    }

    public final void setVideoDegree(int i) {
        this.f164604h = i;
        String logTag = getLogTag();
        Log.m105924i(logTag, "setVideoDegree, videoDegree:" + this.f164604h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo81068c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo81068c();
    }
}
