package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mmsight/ui/ImproveMMSightCircularCustomProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mmsightui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mmsight.ui.ImproveMMSightCircularCustomProgressBar */
public final class ImproveMMSightCircularCustomProgressBar extends View {

    /* renamed from: d */
    public final int f19990d = Color.parseColor("#FFFFFF");

    /* renamed from: e */
    public final int f19991e = 102;

    /* renamed from: f */
    public Paint f19992f;

    /* renamed from: g */
    public float f19993g;

    /* renamed from: h */
    public float f19994h;

    /* renamed from: i */
    public float f19995i;

    /* renamed from: j */
    public Context f19996j;

    public ImproveMMSightCircularCustomProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19996j = context;
    }

    public void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        Paint paint = this.f19992f;
        if (paint != null && canvas != null) {
            canvas.drawCircle(width, height, this.f19995i, paint);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002d, code lost:
        r1 = r1.getResources();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initData "
            r1.append(r2)
            int r2 = r0.getWidth()
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            int r2 = r0.getHeight()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.ImproveMMSightCircularCustomProgressBar"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.content.Context r1 = r0.f19996j
            if (r1 == 0) goto L_0x003c
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x003c
            r2 = 2131165283(0x7f070063, float:1.7944779E38)
            int r1 = r1.getDimensionPixelSize(r2)
            float r1 = (float) r1
            goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            r0.f19993g = r1
            r2 = 2
            float r2 = (float) r2
            float r1 = r1 / r2
            r0.f19994h = r1
            int r1 = r0.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r2 = r0.f19994h
            float r1 = r1 - r2
            r0.f19995i = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f19992f = r1
            int r2 = r0.f19990d
            r1.setColor(r2)
            int r2 = r0.f19991e
            r1.setAlpha(r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            float r2 = r0.f19993g
            r1.setStrokeWidth(r2)
            r2 = 1
            r1.setAntiAlias(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.p077ui.ImproveMMSightCircularCustomProgressBar.onLayout(boolean, int, int, int, int):void");
    }

    public ImproveMMSightCircularCustomProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19996j = context;
    }
}
