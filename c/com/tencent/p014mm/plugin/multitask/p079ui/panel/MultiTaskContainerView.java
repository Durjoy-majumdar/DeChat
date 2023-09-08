package com.tencent.p014mm.plugin.multitask.p079ui.panel;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/ui/panel/MultiTaskContainerView;", "Landroid/widget/FrameLayout;", "", "getLoadingMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.panel.MultiTaskContainerView */
public final class MultiTaskContainerView extends FrameLayout {

    /* renamed from: q */
    public static int f162966q;

    /* renamed from: r */
    public static int f162967r;

    /* renamed from: d */
    public Point f162968d = new Point();

    /* renamed from: e */
    public Point f162969e = new Point();

    /* renamed from: f */
    public final Paint f162970f = new Paint();

    /* renamed from: g */
    public final Paint f162971g = new Paint();

    /* renamed from: h */
    public float f162972h;

    /* renamed from: i */
    public float f162973i;

    /* renamed from: j */
    public float f162974j;

    /* renamed from: n */
    public int f162975n;

    /* renamed from: o */
    public float f162976o;

    /* renamed from: p */
    public float f162977p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTaskContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        mo80323a();
    }

    /* renamed from: a */
    public final void mo80323a() {
        this.f162973i = (float) C74942w4.m89784a(getContext(), 4);
        this.f162974j = (float) C74942w4.m89784a(getContext(), 8);
        this.f162976o = ((float) C74942w4.m89784a(getContext(), 5)) + this.f162974j;
        this.f162977p = ((float) C74942w4.m89784a(getContext(), 20)) + this.f162974j;
        this.f162975n = (C74942w4.m89784a(getContext(), 48) / 2) + C75044y4.m89995g(MMApplicationContext.getContext(), -1);
        this.f162970f.setColor(getResources().getColor(C0966R.color.a66));
        this.f162970f.setStyle(Paint.Style.STROKE);
        this.f162970f.setStrokeWidth((float) C74942w4.m89784a(getContext(), 1));
        this.f162970f.setFlags(1);
        this.f162971g.setColor(getResources().getColor(C0966R.color.a66));
        this.f162971g.setStyle(Paint.Style.FILL);
        this.f162971g.setFlags(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "canvas"
            gy3.C87412m.m108594g(r1, r2)
            super.dispatchDraw(r17)
            r2 = 0
            f162967r = r2
            int r3 = f162966q
            r4 = 1
            r5 = 2
            if (r3 == r4) goto L_0x0017
            if (r3 != r5) goto L_0x0138
        L_0x0017:
            r17.save()
            float r3 = r0.f162973i
            int r6 = r16.getWidth()
            com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC$a r7 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346667E
            int r7 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346689Y
            int r6 = r6 - r7
            float r6 = (float) r6
            float r7 = r0.f162972h
            float r6 = r6 * r7
            int r7 = r16.getWidth()
            int r8 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346689Y
            int r7 = r7 - r8
            int r8 = (int) r6
            int r8 = r8 / r5
            int r7 = r7 - r8
            int r8 = r16.getWidth()
            float r8 = (float) r8
            r9 = 1041865114(0x3e19999a, float:0.15)
            float r8 = r8 * r9
            int r9 = r16.getWidth()
            float r9 = (float) r9
            r10 = 1043878380(0x3e3851ec, float:0.18)
            float r9 = r9 * r10
            int r10 = r16.getWidth()
            float r10 = (float) r10
            r11 = 1048576000(0x3e800000, float:0.25)
            float r10 = r10 * r11
            r11 = 3
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 >= 0) goto L_0x005e
            f162967r = r4
        L_0x005b:
            r6 = 0
            r8 = 0
            goto L_0x0086
        L_0x005e:
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 < 0) goto L_0x006e
            int r14 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x006e
            float r6 = r6 - r8
            float r9 = r9 - r8
            float r6 = r6 / r9
            f162967r = r5
            r8 = r6
            r6 = 0
            goto L_0x0086
        L_0x006e:
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x007c
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x007c
            float r6 = r6 - r9
            float r10 = r10 - r9
            float r6 = r6 / r10
            f162967r = r11
            goto L_0x0084
        L_0x007c:
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x005b
            f162967r = r11
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0084:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0086:
            android.graphics.Point r9 = r0.f162968d
            int r10 = r0.f162975n
            r9.y = r10
            android.graphics.Point r14 = r0.f162969e
            r14.y = r10
            float r10 = r0.f162976o
            int r15 = (int) r10
            int r15 = r15 / r5
            int r15 = r7 - r15
            r9.x = r15
            int r15 = (int) r10
            int r15 = r15 / r5
            int r15 = r15 + r7
            r14.x = r15
            int r15 = f162967r
            if (r15 != r4) goto L_0x00a4
            float r3 = r0.f162973i
            goto L_0x00ca
        L_0x00a4:
            if (r15 != r5) goto L_0x00a9
            float r3 = r0.f162973i
            goto L_0x00ca
        L_0x00a9:
            if (r15 != r11) goto L_0x00ca
            float r3 = r0.f162973i
            float r11 = r0.f162974j
            float r11 = r11 - r3
            float r11 = r11 * r6
            float r3 = r3 + r11
            float r11 = r0.f162977p
            float r15 = r11 - r10
            float r15 = r15 * r6
            float r15 = r15 + r10
            float r2 = (float) r5
            float r15 = r15 / r2
            int r15 = (int) r15
            int r15 = r7 - r15
            r9.x = r15
            float r11 = r11 - r10
            float r11 = r11 * r6
            float r10 = r10 + r11
            float r10 = r10 / r2
            int r2 = (int) r10
            int r7 = r7 + r2
            r14.x = r7
        L_0x00ca:
            int r2 = f162966q
            r6 = 176(0xb0, float:2.47E-43)
            if (r2 != r4) goto L_0x0103
            android.graphics.Paint r2 = r0.f162970f
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d8
            r4 = 0
            goto L_0x00e3
        L_0x00d8:
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00df
            r4 = 176(0xb0, float:2.47E-43)
            goto L_0x00e3
        L_0x00df:
            float r4 = (float) r6
            float r8 = r8 * r4
            int r4 = (int) r8
        L_0x00e3:
            r2.setAlpha(r4)
            android.graphics.Point r2 = r0.f162968d
            int r4 = r2.x
            float r4 = (float) r4
            int r2 = r2.y
            float r2 = (float) r2
            float r5 = (float) r5
            float r3 = r3 / r5
            android.graphics.Paint r5 = r0.f162970f
            r1.drawCircle(r4, r2, r3, r5)
            android.graphics.Point r2 = r0.f162969e
            int r4 = r2.x
            float r4 = (float) r4
            int r2 = r2.y
            float r2 = (float) r2
            android.graphics.Paint r5 = r0.f162970f
            r1.drawCircle(r4, r2, r3, r5)
            goto L_0x0135
        L_0x0103:
            android.graphics.Paint r2 = r0.f162971g
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x010b
            r4 = 0
            goto L_0x0116
        L_0x010b:
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0112
            r4 = 176(0xb0, float:2.47E-43)
            goto L_0x0116
        L_0x0112:
            float r4 = (float) r6
            float r8 = r8 * r4
            int r4 = (int) r8
        L_0x0116:
            r2.setAlpha(r4)
            android.graphics.Point r2 = r0.f162968d
            int r4 = r2.x
            float r4 = (float) r4
            int r2 = r2.y
            float r2 = (float) r2
            float r5 = (float) r5
            float r3 = r3 / r5
            android.graphics.Paint r5 = r0.f162971g
            r1.drawCircle(r4, r2, r3, r5)
            android.graphics.Point r2 = r0.f162969e
            int r4 = r2.x
            float r4 = (float) r4
            int r2 = r2.y
            float r2 = (float) r2
            android.graphics.Paint r5 = r0.f162971g
            r1.drawCircle(r4, r2, r3, r5)
        L_0x0135:
            r17.restore()
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitask.p079ui.panel.MultiTaskContainerView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final int getLoadingMode() {
        return f162966q;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTaskContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        mo80323a();
    }
}
