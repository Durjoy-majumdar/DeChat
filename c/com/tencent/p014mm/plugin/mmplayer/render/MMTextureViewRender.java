package com.tencent.p014mm.plugin.mmplayer.render;

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
import kotlin.Metadata;
import u62.C22595e;
import y62.C23252a;
import y62.C66556c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B#\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b!\u0010$J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R*\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006%"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mmplayer/render/MMTextureViewRender;", "Landroid/view/TextureView;", "Ly62/a;", "Landroid/view/Surface;", "getSurface", "Ly62/a$a;", "listener", "Lrx3/b0;", "setSurfaceListener", "", "type", "setScaleType", "getScaleType", "Landroid/graphics/Rect;", "cropRect", "setCropRect", "", "isOpaque", "setOpaqueInfo", "", "getLogTag", "value", "h", "I", "getVideoDegree", "()I", "setVideoDegree", "(I)V", "videoDegree", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "thumbplayer-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender */
public final class MMTextureViewRender extends TextureView implements C23252a {

    /* renamed from: d */
    public C22595e f162940d;

    /* renamed from: e */
    public C23252a.C23253a f162941e;

    /* renamed from: f */
    public int f162942f;

    /* renamed from: g */
    public Rect f162943g = new Rect();

    /* renamed from: h */
    public int f162944h;

    /* renamed from: i */
    public int f162945i;

    /* renamed from: j */
    public int f162946j;

    /* renamed from: n */
    public int f162947n;

    /* renamed from: o */
    public int f162948o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setSurfaceTextureListener(new C66556c(this));
    }

    /* renamed from: a */
    public void mo36718a(int i, int i2) {
        String logTag = getLogTag();
        Log.m105924i(logTag, "setOriginVideoWidthAndHeight videoWidth:" + this.f162945i + ", videoHeight:" + this.f162946j + ", width:" + i + ", height:" + i2 + " scaleType:" + this.f162942f);
        this.f162947n = i;
        this.f162948o = i2;
    }

    /* renamed from: b */
    public void mo36719b(int i, int i2) {
        String logTag = getLogTag();
        Log.m105924i(logTag, "setVideoWidthAndHeight videoWidth:" + this.f162945i + ", videoHeight:" + this.f162946j + ", width:" + i + ", height:" + i2 + " scaleType:" + this.f162942f);
        if (this.f162945i == i && this.f162946j == i2) {
            this.f162945i = i;
            this.f162946j = i2;
            return;
        }
        this.f162945i = i;
        this.f162946j = i2;
        requestLayout();
    }

    /* renamed from: c */
    public void mo36720c(C22595e eVar) {
        C87412m.m108594g(eVar, "onePlayContext");
        String logTag = getLogTag();
        Log.m105924i(logTag, "attach onePlayContext:" + eVar);
        this.f162940d = eVar;
    }

    /* renamed from: d */
    public final void mo80297d(int i, int i2) {
        float f = ((float) i) / ((float) this.f162945i);
        float f2 = ((float) i2) / ((float) this.f162946j);
        float max = Math.max(f, f2);
        float f3 = max / f;
        float f4 = max / f2;
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f4, ((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
        String logTag = getLogTag();
        Log.m105924i(logTag, "centerCrop container[" + i + ' ' + i2 + "] video[" + this.f162945i + ' ' + this.f162946j + "] matrix:" + matrix);
        setTransform(matrix);
    }

    public String getLogTag() {
        C22595e eVar = this.f162940d;
        return String.valueOf(eVar != null ? eVar.mo35698b("MMTextureViewRender") : null);
    }

    public int getScaleType() {
        return this.f162942f;
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
        return this.f162944h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0161, code lost:
        if (r11 == false) goto L_0x0163;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            super.onMeasure(r17, r18)
            int r3 = r0.f162945i
            r4 = 1
            if (r3 == 0) goto L_0x01f0
            int r3 = r0.f162946j
            if (r3 != 0) goto L_0x0014
            goto L_0x01f0
        L_0x0014:
            int r3 = android.view.View.getDefaultSize(r4, r1)
            int r5 = android.view.View.getDefaultSize(r4, r2)
            int r6 = r16.getScaleType()
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 32
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x0128
            if (r6 == r4) goto L_0x00c7
            r10 = 3
            if (r6 == r10) goto L_0x0037
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            r0.setTransform(r6)
            goto L_0x012b
        L_0x0037:
            android.graphics.Rect r6 = r0.f162943g
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x00c3
            android.graphics.Rect r6 = r0.f162943g
            int r10 = r0.f162947n
            if (r10 == 0) goto L_0x012b
            int r10 = r0.f162948o
            if (r10 == 0) goto L_0x012b
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x0051
            goto L_0x012b
        L_0x0051:
            float r10 = (float) r3
            int r11 = r6.width()
            float r11 = (float) r11
            float r11 = r10 / r11
            float r12 = (float) r5
            int r13 = r6.height()
            float r13 = (float) r13
            float r13 = r12 / r13
            float r14 = r10 * r9
            int r15 = r0.f162947n
            float r15 = (float) r15
            float r14 = r14 / r15
            float r15 = r12 * r9
            int r4 = r0.f162948o
            float r4 = (float) r4
            float r15 = r15 / r4
            float r4 = java.lang.Math.max(r14, r15)
            float r14 = r4 / r14
            float r4 = r4 / r15
            int r15 = r0.f162947n
            float r15 = (float) r15
            float r15 = r15 / r7
            int r9 = r6.centerX()
            float r9 = (float) r9
            float r15 = r15 - r9
            float r15 = r15 * r11
            int r9 = r0.f162948o
            float r9 = (float) r9
            float r9 = r9 / r7
            int r6 = r6.centerY()
            float r6 = (float) r6
            float r9 = r9 - r6
            float r9 = r9 * r13
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            float r10 = r10 / r7
            float r12 = r12 / r7
            r6.setScale(r14, r4, r10, r12)
            r6.postTranslate(r15, r9)
            java.lang.String r4 = r16.getLogTag()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "cropRect(), containerWidth:"
            r9.append(r10)
            r9.append(r3)
            java.lang.String r10 = " containerHeight:"
            r9.append(r10)
            r9.append(r5)
            r9.append(r8)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            r0.setTransform(r6)
            goto L_0x012b
        L_0x00c3:
            r0.mo80297d(r3, r5)
            goto L_0x012b
        L_0x00c7:
            float r4 = (float) r3
            int r6 = r0.f162945i
            float r6 = (float) r6
            float r4 = r4 / r6
            float r6 = (float) r5
            int r9 = r0.f162946j
            float r9 = (float) r9
            float r6 = r6 / r9
            float r9 = java.lang.Math.min(r4, r6)
            float r4 = r9 / r4
            float r9 = r9 / r6
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r10 = r16.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 / r7
            int r11 = r16.getMeasuredHeight()
            float r11 = (float) r11
            float r11 = r11 / r7
            r6.setScale(r4, r9, r10, r11)
            java.lang.String r4 = r16.getLogTag()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "centerFit container["
            r9.append(r10)
            r9.append(r3)
            r9.append(r8)
            r9.append(r5)
            java.lang.String r10 = "] video["
            r9.append(r10)
            int r10 = r0.f162945i
            r9.append(r10)
            r9.append(r8)
            int r10 = r0.f162946j
            r9.append(r10)
            java.lang.String r10 = "] matrix:"
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            r0.setTransform(r6)
            goto L_0x012b
        L_0x0128:
            r0.mo80297d(r3, r5)
        L_0x012b:
            int r4 = r0.f162944h
            r6 = 90
            if (r4 == r6) goto L_0x0135
            r6 = 270(0x10e, float:3.78E-43)
            if (r4 != r6) goto L_0x017d
        L_0x0135:
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            android.graphics.Matrix r6 = r16.getMatrix()
            r4.set(r6)
            float r6 = (float) r3
            float r9 = r6 / r7
            float r10 = (float) r5
            float r7 = r10 / r7
            float r10 = r10 / r6
            float r6 = r16.getScaleX()
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0155
            r6 = 1
            goto L_0x0156
        L_0x0155:
            r6 = 0
        L_0x0156:
            if (r6 == 0) goto L_0x0163
            float r6 = r16.getScaleY()
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0161
            r11 = 1
        L_0x0161:
            if (r11 != 0) goto L_0x016e
        L_0x0163:
            float r6 = r16.getScaleX()
            float r11 = r16.getScaleY()
            r4.setScale(r6, r11, r9, r7)
        L_0x016e:
            int r6 = r0.f162944h
            float r6 = (float) r6
            r4.postRotate(r6, r9, r7)
            r6 = 1
            float r11 = (float) r6
            float r11 = r11 / r10
            r4.postScale(r11, r10, r9, r7)
            r0.setTransform(r4)
        L_0x017d:
            r0.setMeasuredDimension(r3, r5)
            java.lang.String r4 = r16.getLogTag()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onMeasure#handleOnMeasure container["
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ", "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r9 = "] viewSize["
            r6.append(r9)
            int r9 = r16.getWidth()
            r6.append(r9)
            r6.append(r8)
            int r9 = r16.getHeight()
            r6.append(r9)
            java.lang.String r9 = "] videoSize["
            r6.append(r9)
            int r9 = r0.f162945i
            r6.append(r9)
            r6.append(r8)
            int r8 = r0.f162946j
            r6.append(r8)
            java.lang.String r8 = "] spec["
            r6.append(r8)
            r8 = 1
            int r1 = android.view.View.getDefaultSize(r8, r1)
            r6.append(r1)
            r6.append(r7)
            int r1 = android.view.View.getDefaultSize(r8, r2)
            r6.append(r1)
            java.lang.String r1 = "] result="
            r6.append(r1)
            r6.append(r3)
            r1 = 44
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            goto L_0x01f4
        L_0x01f0:
            r1 = 1
            r0.setMeasuredDimension(r1, r1)
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmplayer.render.MMTextureViewRender.onMeasure(int, int):void");
    }

    public void setCropRect(Rect rect) {
        C87412m.m108594g(rect, "cropRect");
        String logTag = getLogTag();
        Log.m105924i(logTag, "setCropRect, cropRect:" + rect);
        this.f162943g = rect;
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

    public void setScaleType(int i) {
        String logTag = getLogTag();
        Log.m105924i(logTag, "setScaleType type:" + i);
        this.f162942f = i;
    }

    public void setSurfaceListener(C23252a.C23253a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f162941e = aVar;
    }

    public final void setVideoDegree(int i) {
        this.f162944h = i;
        String logTag = getLogTag();
        Log.m105924i(logTag, "setVideoDegree, videoDegree:" + this.f162944h);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setSurfaceTextureListener(new C66556c(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMTextureViewRender(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setSurfaceTextureListener(new C66556c(this));
    }
}
