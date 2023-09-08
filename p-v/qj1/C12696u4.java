package qj1;

import android.view.View;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.u4 */
public final class C12696u4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12669t4 f36379d;

    /* renamed from: qj1.u4$a */
    public static final class C12697a extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f36380d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12697a(View view) {
            super(1);
            this.f36380d = view;
        }

        public Object invoke(Object obj) {
            ((Number) obj).floatValue();
            this.f36380d.setTag(Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    public C12696u4(C12669t4 t4Var) {
        this.f36379d = t4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r0 = r20
            qj1.t4 r1 = r0.f36379d
            android.view.View r1 = r1.f36293y
            r2 = 0
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r1.getTag()
            goto L_0x000f
        L_0x000e:
            r1 = r2
        L_0x000f:
            boolean r3 = r1 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x0016
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "expandCostLayout layoutFolded:"
            r3.append(r4)
            r3.append(r1)
            r4 = 33
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FinderLiveChargePayLazyPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 != 0) goto L_0x003b
            return
        L_0x003b:
            qj1.t4 r1 = r0.f36379d
            android.view.View r4 = r1.f36293y
            if (r4 == 0) goto L_0x00c3
            int r10 = r4.getWidth()
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r1.f36290v
            r5 = 0
            if (r3 == 0) goto L_0x004f
            int r3 = r3.getWidth()
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            int r3 = r3 + r10
            android.widget.TextView r6 = r1.f36291w
            if (r6 == 0) goto L_0x005a
            int r6 = r6.getWidth()
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            int r3 = r3 + r6
            android.widget.TextView r6 = r1.f36291w
            if (r6 == 0) goto L_0x0065
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L_0x0066
        L_0x0065:
            r6 = r2
        L_0x0066:
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L_0x006d
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L_0x006e
        L_0x006d:
            r6 = r2
        L_0x006e:
            if (r6 == 0) goto L_0x0087
            int r6 = r6.leftMargin
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r7 = r6.intValue()
            if (r7 <= 0) goto L_0x007d
            r5 = 1
        L_0x007d:
            if (r5 == 0) goto L_0x0080
            r2 = r6
        L_0x0080:
            if (r2 == 0) goto L_0x0087
            int r2 = r2.intValue()
            goto L_0x0096
        L_0x0087:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131166429(0x7f0704dd, float:1.7947103E38)
            int r2 = r2.getDimensionPixelOffset(r5)
        L_0x0096:
            int r2 = r2 + r3
            er1.j4 r11 = er1.C58739j4.f168176a
            r7 = 150(0x96, double:7.4E-322)
            qj1.u4$a r9 = new qj1.u4$a
            r9.<init>(r4)
            r3 = r11
            r5 = r10
            r6 = r2
            r3.mo83717l(r4, r5, r6, r7, r9)
            org.libpag.PAGView r12 = r1.f36281E
            if (r12 == 0) goto L_0x00c3
            wk1.n r1 = wk1.C15440n.f41895a
            int r3 = r1.mo14257f()
            int r13 = r10 + r3
            int r1 = r1.mo14257f()
            int r14 = r2 + r1
            r15 = 150(0x96, double:7.4E-322)
            r17 = 0
            r18 = 16
            r19 = 0
            er1.C58739j4.m68252m(r11, r12, r13, r14, r15, r17, r18, r19)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12696u4.run():void");
    }
}
