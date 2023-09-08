package k11;

import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;

public final /* synthetic */ class v$$a0 implements MMFilterDialog.C74985f {

    /* renamed from: a */
    public final /* synthetic */ CleanChattingUI f290500a;

    public /* synthetic */ v$$a0(CleanChattingUI cleanChattingUI) {
        this.f290500a = cleanChattingUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31857a(int r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI r8 = r0.f290500a
            long[] r2 = com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI.f267888D
            r8.getClass()
            if (r1 < 0) goto L_0x0016
            long[] r2 = com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI.f267888D
            r3 = 4
            if (r1 < r3) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            r3 = r2[r1]
            goto L_0x0018
        L_0x0016:
            r3 = -2
        L_0x0018:
            r5 = -1
            r9 = 0
            r10 = 1
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00d4
            qo3.w r11 = new qo3.w
            r11.<init>(r8)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r8)
            r3 = 2131493238(0x7f0c0176, float:1.860995E38)
            r4 = 0
            android.view.View r12 = r2.inflate(r3, r4)
            r2 = 2131297567(0x7f09051f, float:1.8213083E38)
            android.view.View r2 = r12.findViewById(r2)
            r13 = r2
            android.widget.Button r13 = (android.widget.Button) r13
            r2 = 2131297562(0x7f09051a, float:1.8213072E38)
            android.view.View r2 = r12.findViewById(r2)
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 2
            android.widget.TextView[] r14 = new android.widget.TextView[r2]
            r3 = 2131297564(0x7f09051c, float:1.8213076E38)
            android.view.View r3 = r12.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r14[r9] = r3
            r3 = 2131297549(0x7f09050d, float:1.8213046E38)
            android.view.View r3 = r12.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r14[r10] = r3
            long[] r3 = r8.f267912x
            if (r3 == 0) goto L_0x0069
            long[] r3 = r8.f267912x
            long[] r2 = java.util.Arrays.copyOf(r3, r2)
            goto L_0x0090
        L_0x0069:
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r16 = 2011(0x7db, float:2.818E-42)
            r17 = 0
            r18 = 21
            r19 = 0
            r20 = 0
            r21 = 0
            r15 = r3
            r15.set(r16, r17, r18, r19, r20, r21)
            r4 = 14
            r3.clear(r4)
            long[] r2 = new long[r2]
            long r3 = r3.getTimeInMillis()
            r2[r9] = r3
            long r3 = java.lang.System.currentTimeMillis()
            r2[r10] = r3
        L_0x0090:
            r15 = r2
            k11.v$$i r6 = new k11.v$$i
            r2 = r6
            r3 = r8
            r4 = r15
            r5 = r14
            r10 = r6
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            k11.v$$j r2 = new k11.v$$j
            r2.<init>(r8, r11)
            r11.f36937s = r2
            r2 = 2131299709(0x7f090d7d, float:1.8217427E38)
            android.view.View r2 = r12.findViewById(r2)
            k11.v$$k r3 = new k11.v$$k
            r3.<init>(r11)
            r2.setOnClickListener(r3)
            k11.v$$m r2 = new k11.v$$m
            r2.<init>(r8, r14, r15, r10)
            r3 = r14[r9]
            r3.setOnClickListener(r2)
            r3 = 1
            r3 = r14[r3]
            r3.setOnClickListener(r2)
            k11.v$$n r2 = new k11.v$$n
            r2.<init>(r8, r15, r1, r11)
            r13.setOnClickListener(r2)
            r10.run()
            r11.mo12471k(r12)
            r11.mo5086o()
            goto L_0x00f8
        L_0x00d4:
            r8.f267911w = r3
            r8.f267907s = r1
            k11.r r1 = r8.f267895d
            java.util.List r2 = java.util.Collections.emptyList()
            r1.f290442f = r2
            r1.f290444h = r9
            r1.notifyDataSetChanged()
            android.widget.TextView r1 = r8.f267898g
            r1.setVisibility(r9)
            r1 = 1
            r8.f267892A = r1
            zt3.t r1 = zt3.C119157j.f356862d
            java.lang.Runnable r2 = r8.f267894C
            zt3.j r1 = (zt3.C119157j) r1
            java.lang.String r3 = "CleanChattingLoad"
            r1.mo183871b(r2, r3)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k11.v$$a0.mo31857a(int):void");
    }
}
