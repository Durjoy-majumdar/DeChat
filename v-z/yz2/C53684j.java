package yz2;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: yz2.j */
public class C53684j extends Dialog {

    /* renamed from: d */
    public LinearLayout f150769d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53684j(Context context) {
        super(context, C0966R.style.f8526ll);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            super.onCreate(r17)
            r0 = r16
            yz2.d0 r0 = (yz2.C53666d0) r0
            java.lang.Class<uz2.f0> r1 = uz2.C78315f0.class
            java.lang.Class<ox.b> r2 = p640ox.C77049b.class
            java.lang.Class<qy2.x> r3 = qy2.C47904x.class
            android.view.Window r4 = r0.getWindow()
            if (r4 == 0) goto L_0x0019
            r5 = 2131887085(0x7f1203ed, float:1.9408767E38)
            r4.setWindowAnimations(r5)
        L_0x0019:
            android.content.Context r4 = r0.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131493473(0x7f0c0261, float:1.8610427E38)
            r6 = 0
            r7 = 0
            android.view.View r4 = r4.inflate(r5, r6, r7)
            r0.setContentView(r4)
            boolean r5 = r4 instanceof android.widget.RelativeLayout
            if (r5 == 0) goto L_0x003f
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            android.content.Context r5 = r0.getContext()
            yz2.g r8 = new yz2.g
            r8.<init>(r0, r5)
            r4.addView(r8)
        L_0x003f:
            r4 = 2131307097(0x7f092a59, float:1.8232412E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.f150769d = r4
            r4 = 2131301015(0x7f091297, float:1.8220076E38)
            android.view.View r4 = r0.findViewById(r4)
            yz2.h r5 = new yz2.h
            r5.<init>(r0)
            r4.setOnClickListener(r5)
            r4 = 2131307088(0x7f092a50, float:1.8232393E38)
            android.view.View r4 = r0.findViewById(r4)
            yz2.i r5 = new yz2.i
            r5.<init>(r0)
            r4.setOnClickListener(r5)
            di3.d r4 = di3.C86312j.m106911c(r3)
            qy2.x r4 = (qy2.C47904x) r4
            r4.mo72667bk()
            di3.d r3 = di3.C86312j.m106911c(r3)
            qy2.x r3 = (qy2.C47904x) r3
            r3.mo72665af()
            di3.d r3 = di3.C86312j.m106911c(r2)
            ox.b r3 = (p640ox.C77049b) r3
            android.content.Context r4 = r0.f150734e
            dm2.c r5 = new dm2.c
            r8 = 9
            r9 = 1
            r5.<init>(r1, r8, r9)
            r3.mo72352Rp(r4, r5)
            di3.d r2 = di3.C86312j.m106911c(r2)
            ox.b r2 = (p640ox.C77049b) r2
            android.content.Context r3 = r0.f150734e
            pe3.a r1 = r2.Wi0(r3, r8, r1)
            uz2.f0 r1 = (uz2.C78315f0) r1
            if (r1 == 0) goto L_0x00ab
            java.lang.Class<vr.e> r2 = p255vr.C65873e.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            vr.e r2 = (p255vr.C65873e) r2
            java.lang.String r2 = r2.ep0(r9)
            r1.f229428d = r2
        L_0x00ab:
            java.lang.String r1 = "MicroMsg.TextStatus.TextStatusCardDialog"
            java.lang.String r2 = "initUI: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            yz2.y r1 = new yz2.y
            android.content.Context r2 = r0.f150734e
            qy2.a0 r3 = new qy2.a0
            r3.<init>()
            r3.mo72637c(r9)
            r3.mo72636b(r9)
            java.text.SimpleDateFormat r4 = qy2.C77448f0.f225876a
            r3.mo72639d(r9)
            r1.<init>(r2, r3)
            android.view.View r2 = r1.f232762j
            java.lang.String r3 = "customView"
            gy3.C87412m.m108594g(r2, r3)
            android.widget.LinearLayout r3 = r0.f150769d
            if (r3 == 0) goto L_0x00d9
            r4 = -1
            r5 = -2
            r3.addView(r2, r4, r5)
        L_0x00d9:
            az2.e r2 = az2.C39674e.f106452d
            java.lang.String r3 = r0.f150735f
            rz2.c r12 = r2.mo62253n0(r3)
            java.lang.String r11 = r0.f150735f
            r13 = 0
            r14 = 4
            r15 = 0
            r10 = r1
            qy2.C47898p.C47899a.m53214a(r10, r11, r12, r13, r14, r15)
            yz2.e0 r2 = yz2.C16084e0.f43231d
            r1.f232753U = r2
            android.view.View r2 = r1.f232762j
            yz2.f0 r3 = new yz2.f0
            r3.<init>(r0)
            r2.setOnTouchListener(r3)
            yz2.g0 r2 = new yz2.g0
            r2.<init>(r1, r0)
            r1.f232754V = r2
            r0.f150736g = r1
            android.widget.LinearLayout r2 = r0.f150769d
            if (r2 == 0) goto L_0x0132
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r3 = r2 instanceof android.widget.RelativeLayout.LayoutParams
            if (r3 == 0) goto L_0x0110
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            goto L_0x0111
        L_0x0110:
            r2 = r6
        L_0x0111:
            if (r2 == 0) goto L_0x0132
            boolean r3 = com.tencent.p014mm.p136ui.C75054z4.m90006d()
            if (r3 == 0) goto L_0x011a
            goto L_0x0124
        L_0x011a:
            android.content.Context r3 = r0.getContext()
            r4 = 25
            int r7 = p206nj.C47264o.m52556a(r3, r4)
        L_0x0124:
            int r3 = r2.topMargin
            android.content.Context r4 = r0.getContext()
            int r4 = com.tencent.p014mm.p136ui.C75044y4.m89989a(r4)
            int r3 = r3 + r4
            int r3 = r3 + r7
            r2.topMargin = r3
        L_0x0132:
            android.content.Context r2 = r0.f150734e
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r3 == 0) goto L_0x013b
            r6 = r2
            com.tencent.mm.ui.MMFragmentActivity r6 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r6
        L_0x013b:
            if (r6 == 0) goto L_0x0147
            dl3.b r2 = r0.f150737h
            yz2.d0$b r2 = (yz2.C53666d0.C53668b) r2
            r2.getClass()
            dl3.C45413b.C45414a.m50357a(r2, r6)
        L_0x0147:
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r3 = r0.f150734e
            bl3.r$a r2 = r2.mo62443b(r3)
            java.lang.Class<zz2.b> r3 = zz2.C16421b.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            zz2.b r2 = (zz2.C16421b) r2
            android.view.View r1 = r1.f232762j
            r3 = 2131307102(0x7f092a5e, float:1.8232422E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.String r0 = r0.f150735f
            r2.mo14880d3(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C53684j.onCreate(android.os.Bundle):void");
    }

    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.5f);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setLayout(-1, -1);
        }
    }

    public void show() {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        super.show();
    }
}
