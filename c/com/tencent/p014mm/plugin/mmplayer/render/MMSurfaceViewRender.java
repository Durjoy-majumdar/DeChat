package com.tencent.p014mm.plugin.mmplayer.render;

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
import db0.C58248a;
import gy3.C87412m;
import kotlin.Metadata;
import u62.C22595e;
import y62.C23252a;
import y62.C66555b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,B#\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010-\u001a\u00020\u000e¢\u0006\u0004\b+\u0010.J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006/"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mmplayer/render/MMSurfaceViewRender;", "Landroid/view/SurfaceView;", "Ly62/a;", "Landroid/graphics/Bitmap;", "getBitmap", "", "getLogTag", "", "isOpaque", "Lrx3/b0;", "setOpaqueInfo", "Ly62/a$a;", "listener", "setSurfaceListener", "", "type", "setScaleType", "Landroid/graphics/Rect;", "cropRect", "setCropRect", "getScaleType", "Landroid/view/Surface;", "getSurface", "value", "h", "I", "getVideoDegree", "()I", "setVideoDegree", "(I)V", "videoDegree", "Ldb0/a;", "q", "Ldb0/a;", "getSurfaceViewSwitchHelper", "()Ldb0/a;", "setSurfaceViewSwitchHelper", "(Ldb0/a;)V", "surfaceViewSwitchHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender */
public final class MMSurfaceViewRender extends SurfaceView implements C23252a {

    /* renamed from: d */
    public C22595e f162928d;

    /* renamed from: e */
    public C23252a.C23253a f162929e;

    /* renamed from: f */
    public int f162930f;

    /* renamed from: g */
    public Rect f162931g = new Rect();

    /* renamed from: h */
    public int f162932h;

    /* renamed from: i */
    public int f162933i;

    /* renamed from: j */
    public int f162934j;

    /* renamed from: n */
    public int f162935n;

    /* renamed from: o */
    public int f162936o;

    /* renamed from: p */
    public Surface f162937p;

    /* renamed from: q */
    public C58248a f162938q;

    /* renamed from: com.tencent.mm.plugin.mmplayer.render.MMSurfaceViewRender$a */
    public static final class C56882a implements SurfaceHolder.Callback {

        /* renamed from: d */
        public final /* synthetic */ MMSurfaceViewRender f162939d;

        public C56882a(MMSurfaceViewRender mMSurfaceViewRender) {
            this.f162939d = mMSurfaceViewRender;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C87412m.m108594g(surfaceHolder, "holder");
            String logTag = this.f162939d.getLogTag();
            Log.m105924i(logTag, "surfaceChanged format:" + i + " [" + i2 + ' ' + i3 + "] listener:" + this.f162939d.f162929e);
            C23252a.C23253a aVar = this.f162939d.f162929e;
            if (aVar != null) {
                aVar.mo24011a(surfaceHolder, i2, i3);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            String logTag = this.f162939d.getLogTag();
            Log.m105924i(logTag, "surfaceCreated listener:" + this.f162939d.f162929e);
            this.f162939d.f162937p = surfaceHolder.getSurface();
            C23252a.C23253a aVar = this.f162939d.f162929e;
            if (aVar != null) {
                aVar.mo24012b(surfaceHolder);
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            String logTag = this.f162939d.getLogTag();
            Log.m105924i(logTag, "surfaceDestroy listener:" + this.f162939d.f162929e);
            C23252a.C23253a aVar = this.f162939d.f162929e;
            if (aVar != null) {
                aVar.mo24014d(surfaceHolder);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo80284e();
    }

    /* renamed from: a */
    public void mo36718a(int i, int i2) {
        String logTag = getLogTag();
        Log.m105924i(logTag, "setOriginVideoWidthAndHeight videoWidth:" + this.f162933i + ", videoHeight:" + this.f162934j + ", width:" + i + ", height:" + i2 + " scaleType:" + this.f162930f);
        this.f162935n = i;
        this.f162936o = i2;
    }

    /* renamed from: b */
    public void mo36719b(int i, int i2) {
        if (this.f162933i == i && this.f162934j == i2) {
            this.f162933i = i;
            this.f162934j = i2;
            return;
        }
        this.f162933i = i;
        this.f162934j = i2;
        requestLayout();
    }

    /* renamed from: c */
    public void mo36720c(C22595e eVar) {
        C87412m.m108594g(eVar, "onePlayContext");
        String logTag = getLogTag();
        Log.m105924i(logTag, "attach onePlayContext:" + eVar);
        this.f162928d = eVar;
    }

    /* renamed from: d */
    public final int[] mo80283d(float f, float f2, int i, int i2) {
        if (f < f2) {
            i2 = (int) (((float) i) / f);
        } else {
            i = (int) (((float) i2) * f);
        }
        return new int[]{i, i2};
    }

    /* renamed from: e */
    public final void mo80284e() {
        if (Build.VERSION.SDK_INT >= 26) {
            getHolder().setFormat(22);
        }
        getHolder().addCallback(new C56882a(this));
    }

    public Bitmap getBitmap() {
        return null;
    }

    public String getLogTag() {
        C22595e eVar = this.f162928d;
        return String.valueOf(eVar != null ? eVar.mo35698b("MMSurfaceViewRender") : null);
    }

    public int getScaleType() {
        return this.f162930f;
    }

    public Surface getSurface() {
        return this.f162937p;
    }

    public final C58248a getSurfaceViewSwitchHelper() {
        return this.f162938q;
    }

    public final int getVideoDegree() {
        return this.f162932h;
    }

    public void onMeasure(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        super.onMeasure(i, i2);
        if (this.f162933i == 0 || this.f162934j == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = View.getDefaultSize(1, i);
        int defaultSize2 = View.getDefaultSize(1, i2);
        float f = (((float) this.f162933i) * 1.0f) / ((float) this.f162934j);
        float f2 = (float) defaultSize;
        float f3 = (float) defaultSize2;
        float f4 = (1.0f * f2) / f3;
        int scaleType = getScaleType();
        if (scaleType == 0) {
            iArr = mo80283d(f, f4, defaultSize, defaultSize2);
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
        } else if (!this.f162931g.isEmpty()) {
            Rect rect = this.f162931g;
            if (this.f162935n == 0 || this.f162936o == 0 || rect.isEmpty()) {
                iArr = mo80283d(f, f4, defaultSize, defaultSize2);
            } else {
                String logTag = getLogTag();
                Log.m105924i(logTag, "cropVideo, video size[" + this.f162933i + ' ' + this.f162934j + "] container:[" + defaultSize + ", " + defaultSize2 + "]  result=" + getMeasuredWidth() + ',' + getMeasuredHeight());
                iArr = mo80283d(f, f4, defaultSize, defaultSize2);
            }
        } else {
            iArr = mo80283d(f, f4, defaultSize, defaultSize2);
        }
        post(new C66555b(this, iArr));
        setMeasuredDimension(iArr[0], iArr[1]);
        String logTag2 = getLogTag();
        Log.m105924i(logTag2, "handleOnMeasure, type:" + getScaleType() + " video size[" + this.f162933i + ' ' + this.f162934j + "] container:[" + defaultSize + ", " + defaultSize2 + "]  result=" + iArr[0] + ',' + iArr[1]);
    }

    public void setCropRect(Rect rect) {
        C87412m.m108594g(rect, "cropRect");
        String logTag = getLogTag();
        Log.m105924i(logTag, "setCropRect, cropRect:" + rect);
        this.f162931g = rect;
    }

    public void setOpaqueInfo(boolean z) {
    }

    public void setScaleType(int i) {
        String logTag = getLogTag();
        Log.m105924i(logTag, "setScaleType type:" + i);
        this.f162930f = i;
    }

    public void setSurfaceListener(C23252a.C23253a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f162929e = aVar;
    }

    public final void setSurfaceViewSwitchHelper(C58248a aVar) {
        this.f162938q = aVar;
    }

    public final void setVideoDegree(int i) {
        this.f162932h = i;
        String logTag = getLogTag();
        Log.m105924i(logTag, "setVideoDegree, videoDegree:" + this.f162932h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo80284e();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMSurfaceViewRender(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo80284e();
    }
}
