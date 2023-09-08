package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FadeOutLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/graphics/Paint;", "f", "Lrx3/g;", "getGradientPaint", "()Landroid/graphics/Paint;", "gradientPaint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FadeOutLinearLayout */
public final class FadeOutLinearLayout extends LinearLayout {

    /* renamed from: d */
    public ComposeShader f17614d;

    /* renamed from: e */
    public final int f17615e = -16777216;

    /* renamed from: f */
    public final C13601g f17616f = C36568h.m40985a(C4028c0.f18093d);

    /* renamed from: g */
    public Bitmap f17617g;

    /* renamed from: h */
    public Canvas f17618h;

    /* renamed from: i */
    public int f17619i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FadeOutLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final Paint getGradientPaint() {
        return (Paint) this.f17616f.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r2 == false) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4367a(int r9, boolean r10) {
        /*
            r8 = this;
            android.graphics.Bitmap r0 = r8.f17617g
            r1 = 1
            if (r0 == 0) goto L_0x0028
            r2 = 0
            if (r0 == 0) goto L_0x0014
            int r0 = r0.getWidth()
            int r3 = r8.getWidth()
            if (r0 != r3) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0028
            android.graphics.Bitmap r0 = r8.f17617g
            if (r0 == 0) goto L_0x0026
            int r0 = r0.getHeight()
            int r3 = r8.getHeight()
            if (r0 != r3) goto L_0x0026
            r2 = 1
        L_0x0026:
            if (r2 != 0) goto L_0x0045
        L_0x0028:
            int r10 = r8.getWidth()
            int r0 = r8.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r10, r0, r2)
            r8.f17617g = r10
            android.graphics.Canvas r10 = new android.graphics.Canvas
            android.graphics.Bitmap r0 = r8.f17617g
            gy3.C87412m.m108591d(r0)
            r10.<init>(r0)
            r8.f17618h = r10
            r10 = 1
        L_0x0045:
            if (r10 == 0) goto L_0x0074
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            int r0 = r8.getWidth()
            int r0 = r0 - r9
            float r1 = (float) r0
            r2 = 0
            int r9 = r8.getWidth()
            float r3 = (float) r9
            r4 = 0
            int r5 = r8.f17615e
            r6 = 0
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.graphics.BitmapShader r9 = new android.graphics.BitmapShader
            android.graphics.Bitmap r0 = r8.f17617g
            gy3.C87412m.m108591d(r0)
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            r9.<init>(r0, r1, r1)
            android.graphics.ComposeShader r0 = new android.graphics.ComposeShader
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.<init>(r10, r9, r1)
            r8.f17614d = r0
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FadeOutLinearLayout.mo4367a(int, boolean):void");
    }

    /* renamed from: b */
    public final void mo4368b(int i, long j) {
        Log.m105924i("FadeOutLinearLayout", "setRightFadingLength: feedId = " + C61926c.m72691p(j) + ", fadingLen = " + i + ", width = " + getWidth());
        boolean z = true;
        if (i <= 0 || getWidth() <= 0 || getHeight() <= 0) {
            this.f17614d = null;
        } else {
            mo4367a(i > getWidth() ? getWidth() : i, true);
        }
        this.f17619i = i;
        if (i != 0) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void draw(Canvas canvas) {
        C13598b0 b0Var;
        C87412m.m108594g(canvas, "canvas");
        if (getWidth() <= 0 || getHeight() <= 0) {
            super.draw(canvas);
            return;
        }
        if (this.f17614d != null) {
            mo4367a(this.f17619i, false);
            Canvas canvas2 = this.f17618h;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            }
            super.draw(this.f17618h);
            canvas.save();
            getGradientPaint().setShader(this.f17614d);
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), getGradientPaint());
            canvas.restore();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            super.draw(canvas);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FadeOutLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
