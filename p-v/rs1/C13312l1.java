package rs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import jq3.C60905o;

/* renamed from: rs1.l1 */
public final class C13312l1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderDescPanelUIC f37771d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f37772e;

    /* renamed from: f */
    public final /* synthetic */ View f37773f;

    /* renamed from: g */
    public final /* synthetic */ View f37774g;

    /* renamed from: h */
    public final /* synthetic */ View f37775h;

    public C13312l1(FinderDescPanelUIC finderDescPanelUIC, C60905o oVar, View view, View view2, View view3) {
        this.f37771d = finderDescPanelUIC;
        this.f37772e = oVar;
        this.f37773f = view;
        this.f37774g = view2;
        this.f37775h = view3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r0 = r15.f37771d
            jq3.o r1 = r15.f37772e
            android.view.View r2 = r15.f37773f
            android.view.View r3 = r15.f37774g
            android.view.View r4 = r15.f37775h
            r0.getClass()
            r0 = 2131305120(0x7f0922a0, float:1.8228402E38)
            android.view.View r0 = r1.mo85812D(r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x010e
        L_0x0018:
            r5 = 2131302830(0x7f0919ae, float:1.8223757E38)
            android.view.View r5 = r1.mo85812D(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 != 0) goto L_0x0025
            goto L_0x010e
        L_0x0025:
            r6 = 2131302903(0x7f0919f7, float:1.8223905E38)
            android.view.View r6 = r1.mo85812D(r6)
            if (r6 != 0) goto L_0x0030
            goto L_0x010e
        L_0x0030:
            int r7 = r5.getChildCount()
            r8 = 0
            r9 = 0
        L_0x0036:
            r10 = 0
            r11 = 1
            if (r9 >= r7) goto L_0x0056
            android.view.View r12 = r5.getChildAt(r9)
            int r13 = r12.getVisibility()
            if (r13 != 0) goto L_0x0053
            float r13 = r12.getAlpha()
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x004e
            r13 = 1
            goto L_0x004f
        L_0x004e:
            r13 = 0
        L_0x004f:
            if (r13 != 0) goto L_0x0053
            r0 = r12
            goto L_0x0056
        L_0x0053:
            int r9 = r9 + 1
            goto L_0x0036
        L_0x0056:
            r5 = 2
            int[] r7 = new int[r5]
            int[] r9 = new int[r5]
            int[] r12 = new int[r5]
            int[] r5 = new int[r5]
            android.view.View r13 = r1.f44854d
            r13.getLocationInWindow(r7)
            r2.getLocationInWindow(r9)
            r13 = r9[r8]
            r14 = r7[r8]
            int r13 = r13 - r14
            r9[r8] = r13
            r13 = r9[r11]
            r14 = r7[r11]
            int r13 = r13 - r14
            r9[r11] = r13
            r0.getLocationInWindow(r12)
            r0 = r12[r8]
            r13 = r7[r8]
            int r0 = r0 - r13
            r12[r8] = r0
            r0 = r12[r11]
            r13 = r7[r11]
            int r0 = r0 - r13
            r12[r11] = r0
            r6.getLocationInWindow(r5)
            r0 = r5[r8]
            r13 = r7[r8]
            int r0 = r0 - r13
            r5[r8] = r0
            r0 = r5[r11]
            r7 = r7[r11]
            int r0 = r0 - r7
            r5[r11] = r0
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x00b1
            float r0 = r6.getAlpha()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00a6
            r8 = 1
        L_0x00a6:
            if (r8 != 0) goto L_0x00b1
            r0 = r12[r11]
            r5 = r5[r11]
            int r0 = java.lang.Math.min(r0, r5)
            goto L_0x00b3
        L_0x00b1:
            r0 = r12[r11]
        L_0x00b3:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            java.lang.String r6 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            gy3.C87412m.m108592e(r5, r6)
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r6 = r5.topMargin
            int r4 = r4.getHeight()
            int r7 = r3.getHeight()
            int r7 = r7 - r4
            r4 = r9[r11]
            int r8 = r2.getHeight()
            int r4 = r4 + r8
            int r8 = r3.getHeight()
            int r4 = r4 + r8
            if (r4 <= r0) goto L_0x00ee
            android.content.Context r1 = r1.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165371(0x7f0700bb, float:1.7944957E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            int r2 = r3.getHeight()
            int r0 = r0 - r2
            int r0 = r0 - r1
            r5.topMargin = r0
            goto L_0x0107
        L_0x00ee:
            android.content.Context r0 = r1.f173499A
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165307(0x7f07007b, float:1.7944827E38)
            float r0 = r0.getDimension(r1)
            int r0 = (int) r0
            r1 = r9[r11]
            int r2 = r2.getHeight()
            int r1 = r1 + r2
            int r1 = r1 - r7
            int r1 = r1 + r0
            r5.topMargin = r1
        L_0x0107:
            int r0 = r5.topMargin
            if (r0 == r6) goto L_0x010e
            r3.requestLayout()
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13312l1.run():void");
    }
}
