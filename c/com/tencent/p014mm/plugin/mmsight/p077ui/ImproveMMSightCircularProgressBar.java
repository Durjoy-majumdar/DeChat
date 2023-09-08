package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.wxmm.v2helper;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mmsight/ui/ImproveMMSightCircularProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularProgressBar */
public final class ImproveMMSightCircularProgressBar extends View {

    /* renamed from: d */
    public final int f313699d = Color.parseColor("#07C160");

    /* renamed from: e */
    public final int f313700e = 255;

    /* renamed from: f */
    public Paint f313701f;

    /* renamed from: g */
    public float f313702g;

    /* renamed from: h */
    public float f313703h;

    /* renamed from: i */
    public RectF f313704i = new RectF();

    /* renamed from: j */
    public C105518b0 f313705j;

    /* renamed from: n */
    public float f313706n;

    /* renamed from: o */
    public float f313707o = 100.0f;

    /* renamed from: p */
    public float f313708p;

    /* renamed from: q */
    public Context f313709q;

    /* renamed from: r */
    public C105534i f313710r;

    public ImproveMMSightCircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f313709q = context;
    }

    public void onDraw(Canvas canvas) {
        Paint paint = this.f313701f;
        if (paint != null && canvas != null) {
            canvas.drawArc(this.f313704i, -90.0f, ((float) v2helper.VOIP_ENC_HEIGHT_LV1) * (this.f313706n / this.f313707o), false, paint);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r1.getResources();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.content.Context r1 = r0.f313709q
            if (r1 == 0) goto L_0x0016
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x0016
            r2 = 2131165283(0x7f070063, float:1.7944779E38)
            int r1 = r1.getDimensionPixelSize(r2)
            float r1 = (float) r1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r0.f313702g = r1
            r2 = 2
            float r2 = (float) r2
            float r1 = r1 / r2
            r0.f313703h = r1
            android.graphics.RectF r2 = r0.f313704i
            r2.top = r1
            r2.left = r1
            int r1 = r0.getWidth()
            float r1 = (float) r1
            float r3 = r0.f313703h
            float r1 = r1 - r3
            r2.right = r1
            int r1 = r0.getHeight()
            float r1 = (float) r1
            float r3 = r0.f313703h
            float r1 = r1 - r3
            r2.bottom = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f313701f = r1
            int r2 = r0.f313699d
            r1.setColor(r2)
            int r2 = r0.f313700e
            r1.setAlpha(r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            float r2 = r0.f313702g
            r1.setStrokeWidth(r2)
            r2 = 1
            r1.setAntiAlias(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.p077ui.ImproveMMSightCircularProgressBar.onLayout(boolean, int, int, int, int):void");
    }

    public ImproveMMSightCircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f313709q = context;
    }
}
