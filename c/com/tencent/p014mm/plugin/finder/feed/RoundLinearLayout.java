package com.tencent.p014mm.plugin.finder.feed;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import gy3.C87412m;
import kotlin.Metadata;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/RoundLinearLayout;", "Landroid/widget/LinearLayout;", "", "percent", "Lrx3/b0;", "setRadius", "Lcom/tencent/mm/plugin/finder/feed/RoundLinearLayout$a;", "d", "Lcom/tencent/mm/plugin/finder/feed/RoundLinearLayout$a;", "getCornerRadius", "()Lcom/tencent/mm/plugin/finder/feed/RoundLinearLayout$a;", "setCornerRadius", "(Lcom/tencent/mm/plugin/finder/feed/RoundLinearLayout$a;)V", "cornerRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.RoundLinearLayout */
public class RoundLinearLayout extends LinearLayout {

    /* renamed from: d */
    public C2630a f13462d;

    /* renamed from: e */
    public float f13463e = 0.5f;

    /* renamed from: f */
    public final Path f13464f = new Path();

    /* renamed from: com.tencent.mm.plugin.finder.feed.RoundLinearLayout$a */
    public static final class C2630a {

        /* renamed from: a */
        public float f13465a;

        /* renamed from: b */
        public float f13466b;

        /* renamed from: c */
        public float f13467c;

        /* renamed from: d */
        public float f13468d;

        public C2630a(float f, float f2, float f3, float f4) {
            this.f13465a = f;
            this.f13466b = f2;
            this.f13467c = f3;
            this.f13468d = f4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo2648a(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo2648a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226848C, i, 0);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…inearLayout, defStyle, 0)");
        float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f13462d = new C2630a(dimension, dimension, dimension, dimension);
        setWillNotDraw(false);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            java.lang.String r0 = "canvas"
            gy3.C87412m.m108594g(r10, r0)
            android.graphics.Path r0 = r9.f13464f
            r0.reset()
            com.tencent.mm.plugin.finder.feed.RoundLinearLayout$a r0 = r9.f13462d
            if (r0 == 0) goto L_0x0081
            float r1 = r0.f13465a
            r2 = 0
            r3 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r1 = 1
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            if (r1 == 0) goto L_0x003f
            float r1 = r0.f13466b
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x003f
            float r1 = r0.f13467c
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 == 0) goto L_0x003f
            float r1 = r0.f13468d
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r1 == 0) goto L_0x003f
            r1 = 1
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x0043
            goto L_0x0081
        L_0x0043:
            android.graphics.RectF r1 = new android.graphics.RectF
            int r5 = r9.getWidth()
            float r5 = (float) r5
            int r6 = r9.getHeight()
            float r6 = (float) r6
            r1.<init>(r2, r2, r5, r6)
            android.graphics.Path r2 = r9.f13464f
            r5 = 8
            float[] r5 = new float[r5]
            float r6 = r0.f13465a
            r5[r3] = r6
            r5[r4] = r6
            r3 = 2
            float r4 = r0.f13466b
            r5[r3] = r4
            r3 = 3
            r5[r3] = r4
            r3 = 4
            float r4 = r0.f13468d
            r5[r3] = r4
            r3 = 5
            r5[r3] = r4
            r3 = 6
            float r0 = r0.f13467c
            r5[r3] = r0
            r3 = 7
            r5[r3] = r0
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CCW
            r2.addRoundRect(r1, r5, r0)
            android.graphics.Path r0 = r9.f13464f
            r0.close()
            goto L_0x00a6
        L_0x0081:
            android.graphics.Path r1 = r9.f13464f
            r2 = 0
            r3 = 0
            int r0 = r9.getWidth()
            float r4 = (float) r0
            int r0 = r9.getHeight()
            float r5 = (float) r0
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r6 = r9.f13463e
            float r6 = r6 * r0
            int r0 = r9.getHeight()
            float r0 = (float) r0
            float r7 = r9.f13463e
            float r7 = r7 * r0
            android.graphics.Path$Direction r8 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r2, r3, r4, r5, r6, r7, r8)
        L_0x00a6:
            android.graphics.Path r0 = r9.f13464f
            r10.clipPath(r0)
            super.dispatchDraw(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.RoundLinearLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public final C2630a getCornerRadius() {
        return this.f13462d;
    }

    public final void setCornerRadius(C2630a aVar) {
        this.f13462d = aVar;
    }

    public final void setRadius(float f) {
        if (f >= 0.0f && f <= 0.5f) {
            this.f13463e = f;
            invalidate();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo2648a(context, attributeSet, i);
    }
}
