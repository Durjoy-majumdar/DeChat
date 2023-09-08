package com.tencent.p014mm.plugin.thumbplayer.render;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import k03.C60931a;
import k03.C60938e;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+B#\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\b*\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/render/MMTextureViewRender;", "Landroid/view/TextureView;", "Lk03/a;", "", "getTagPrefix", "Landroid/view/Surface;", "getSurface", "tag", "Lrx3/b0;", "setTagPrefix", "Lk03/a$a;", "listener", "setSurfaceListener", "", "type", "setScaleType", "getScaleType", "Landroid/graphics/Rect;", "cropRect", "setCropRect", "", "isOpaque", "setOpaqueInfo", "getLogTag", "h", "Z", "isPreloadMode", "()Z", "setPreloadMode", "(Z)V", "value", "i", "I", "getVideoDegree", "()I", "setVideoDegree", "(I)V", "videoDegree", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender */
public final class MMTextureViewRender extends TextureView implements C60931a {

    /* renamed from: d */
    public String f164610d = "PREFIX";

    /* renamed from: e */
    public C60931a.C60932a f164611e;

    /* renamed from: f */
    public int f164612f;

    /* renamed from: g */
    public Rect f164613g = new Rect();

    /* renamed from: h */
    public boolean f164614h;

    /* renamed from: i */
    public int f164615i;

    /* renamed from: j */
    public int f164616j;

    /* renamed from: n */
    public int f164617n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setSurfaceTextureListener(new C60938e(this));
    }

    private final String getTagPrefix() {
        return this.f164610d;
    }

    /* renamed from: a */
    public final void mo81087a(int i, int i2) {
        String logTag = getLogTag();
        Log.m105924i(logTag, "centerCrop, container:[" + i + ", " + i2 + ']');
        float f = ((float) i) / ((float) this.f164616j);
        float f2 = ((float) i2) / ((float) this.f164617n);
        float max = Math.max(f, f2);
        float f3 = max / f;
        float f4 = max / f2;
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f4, ((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
        String logTag2 = getLogTag();
        Log.m105924i(logTag2, "centerCrop sx:" + f3 + " sy:" + f4 + " px:" + (((float) getMeasuredWidth()) / 2.0f) + " py:" + (((float) getMeasuredHeight()) / 2.0f) + " matrix:" + matrix);
        setTransform(matrix);
    }

    /* renamed from: b */
    public void mo81067b(int i, int i2) {
        if (this.f164616j == i && this.f164617n == i2) {
            this.f164616j = i;
            this.f164617n = i2;
            return;
        }
        this.f164616j = i;
        this.f164617n = i2;
        requestLayout();
    }

    public String getLogTag() {
        return getTagPrefix() + "_MMTextureViewRender";
    }

    public int getScaleType() {
        return this.f164612f;
    }

    public Surface getSurface() {
        if (getSurfaceTexture() == null) {
            Log.m105928w("MMTextureViewRender", "getSurface return for null");
            return null;
        }
        if (Build.VERSION.SDK_INT > 26) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            C87412m.m108591d(surfaceTexture);
            if (surfaceTexture.isReleased()) {
                Log.m105928w("MMTextureViewRender", "getSurface return for Released");
                return null;
            }
        }
        return new Surface(getSurfaceTexture());
    }

    public final int getVideoDegree() {
        return this.f164615i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        if (r9 == false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            super.onMeasure(r11, r12)
            int r0 = r10.f164616j
            r1 = 1
            if (r0 == 0) goto L_0x012a
            int r2 = r10.f164617n
            if (r2 != 0) goto L_0x000e
            goto L_0x012a
        L_0x000e:
            boolean r2 = r10.f164614h
            if (r2 == 0) goto L_0x0013
            goto L_0x0017
        L_0x0013:
            int r0 = android.view.View.getDefaultSize(r1, r11)
        L_0x0017:
            boolean r2 = r10.f164614h
            if (r2 == 0) goto L_0x001e
            int r2 = r10.f164617n
            goto L_0x0022
        L_0x001e:
            int r2 = android.view.View.getDefaultSize(r1, r12)
        L_0x0022:
            int r3 = r10.getScaleType()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x006e
            if (r3 == r1) goto L_0x0045
            r5 = 3
            if (r3 == r5) goto L_0x0038
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r10.setTransform(r3)
            goto L_0x0071
        L_0x0038:
            android.graphics.Rect r3 = r10.f164613g
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0041
            goto L_0x0071
        L_0x0041:
            r10.mo81087a(r0, r2)
            goto L_0x0071
        L_0x0045:
            float r3 = (float) r0
            int r5 = r10.f164616j
            float r5 = (float) r5
            float r3 = r3 / r5
            float r5 = (float) r2
            int r6 = r10.f164617n
            float r6 = (float) r6
            float r5 = r5 / r6
            float r6 = java.lang.Math.min(r3, r5)
            float r3 = r6 / r3
            float r6 = r6 / r5
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            int r7 = r10.getMeasuredWidth()
            float r7 = (float) r7
            float r7 = r7 / r4
            int r8 = r10.getMeasuredHeight()
            float r8 = (float) r8
            float r8 = r8 / r4
            r5.setScale(r3, r6, r7, r8)
            r10.setTransform(r5)
            goto L_0x0071
        L_0x006e:
            r10.mo81087a(r0, r2)
        L_0x0071:
            int r3 = r10.f164615i
            r5 = 90
            if (r3 == r5) goto L_0x007b
            r5 = 270(0x10e, float:3.78E-43)
            if (r3 != r5) goto L_0x00c2
        L_0x007b:
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            android.graphics.Matrix r5 = r10.getMatrix()
            r3.set(r5)
            float r5 = (float) r0
            float r6 = r5 / r4
            float r7 = (float) r2
            float r4 = r7 / r4
            float r7 = r7 / r5
            float r5 = r10.getScaleX()
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x009b
            r5 = 1
            goto L_0x009c
        L_0x009b:
            r5 = 0
        L_0x009c:
            if (r5 == 0) goto L_0x00a9
            float r5 = r10.getScaleY()
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x00a7
            r9 = 1
        L_0x00a7:
            if (r9 != 0) goto L_0x00b4
        L_0x00a9:
            float r5 = r10.getScaleX()
            float r8 = r10.getScaleY()
            r3.setScale(r5, r8, r6, r4)
        L_0x00b4:
            int r5 = r10.f164615i
            float r5 = (float) r5
            r3.postRotate(r5, r6, r4)
            float r5 = (float) r1
            float r5 = r5 / r7
            r3.postScale(r5, r7, r6, r4)
            r10.setTransform(r3)
        L_0x00c2:
            r10.setMeasuredDimension(r0, r2)
            java.lang.String r3 = r10.getLogTag()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onMeasure#handleOnMeasure video size["
            r4.append(r5)
            int r5 = r10.f164616j
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            int r5 = r10.f164617n
            r4.append(r5)
            java.lang.String r5 = "], spec["
            r4.append(r5)
            int r11 = android.view.View.getDefaultSize(r1, r11)
            r4.append(r11)
            java.lang.String r11 = ", "
            r4.append(r11)
            int r12 = android.view.View.getDefaultSize(r1, r12)
            r4.append(r12)
            java.lang.String r12 = "], result="
            r4.append(r12)
            r4.append(r0)
            r12 = 44
            r4.append(r12)
            r4.append(r2)
            java.lang.String r12 = ", container=["
            r4.append(r12)
            r4.append(r0)
            r4.append(r11)
            r4.append(r2)
            java.lang.String r11 = "], isPreloadMode="
            r4.append(r11)
            boolean r11 = r10.f164614h
            r4.append(r11)
            java.lang.String r11 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            goto L_0x012d
        L_0x012a:
            r10.setMeasuredDimension(r1, r1)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender.onMeasure(int, int):void");
    }

    public void reset() {
        String logTag = getLogTag();
        Log.m105924i(logTag, "reset cropRect=" + this.f164613g);
        this.f164613g = new Rect();
    }

    public void setCropRect(Rect rect) {
        C87412m.m108594g(rect, "cropRect");
        String logTag = getLogTag();
        Log.m105924i(logTag, "setCropRect, cropRect:" + rect);
        this.f164613g = rect;
    }

    public void setOpaqueInfo(boolean z) {
        float f;
        if (z) {
            setOpaque(true);
            f = 1.0f;
        } else {
            setOpaque(false);
            f = 0.0f;
        }
        setAlpha(f);
    }

    public final void setPreloadMode(boolean z) {
        this.f164614h = z;
    }

    public void setScaleType(int i) {
        String logTag = getLogTag();
        Log.m105924i(logTag, "setScaleType type:" + i);
        this.f164612f = i;
    }

    public void setSurfaceListener(C60931a.C60932a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f164611e = aVar;
    }

    public void setTagPrefix(String str) {
        C87412m.m108594g(str, "tag");
        this.f164610d = str;
    }

    public final void setVideoDegree(int i) {
        this.f164615i = i;
        String logTag = getLogTag();
        Log.m105924i(logTag, "setVideoDegree, videoDegree:" + this.f164615i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setSurfaceTextureListener(new C60938e(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setSurfaceTextureListener(new C60938e(this));
    }
}
