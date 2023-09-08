package fg2;

import android.view.View;
import com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView;

/* renamed from: fg2.h */
public final class C75756h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RadarMemberView f222358d;

    public C75756h(RadarMemberView radarMemberView) {
        this.f222358d = radarMemberView;
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if ((r5 == null || z04.C112551y.m153811k(r5)) != false) goto L_0x0071;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r9)
            java.lang.Object[] r7 = r1.toArray()
            r1.clear()
            java.lang.String r2 = "com/tencent/mm/plugin/radar/ui/RadarMemberView$mOnModifyNameClickListener$1"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "onClick"
            java.lang.String r5 = "(Landroid/view/View;)V"
            r6 = r8
            j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.radar.ui.RadarMemberView r9 = r8.f222358d
            com.tencent.mm.storage.z1 r9 = r9.f203313u
            r1 = 1
            r2 = 0
            java.lang.String r3 = ""
            r4 = 0
            if (r9 == 0) goto L_0x00ac
            boolean r9 = r9.mo62927s3()
            if (r9 != r1) goto L_0x0031
            r9 = 1
            goto L_0x0032
        L_0x0031:
            r9 = 0
        L_0x0032:
            if (r9 == 0) goto L_0x0043
            com.tencent.mm.plugin.radar.ui.RadarMemberView r9 = r8.f222358d
            com.tencent.mm.storage.z1 r9 = r9.f203313u
            if (r9 == 0) goto L_0x0040
            java.lang.String r9 = r9.mo73969n2()
            goto L_0x00ad
        L_0x0040:
            r9 = r4
            goto L_0x00ad
        L_0x0043:
            k40.a r9 = f40.C86709a0.m107533q(r0)
            f62.k0 r9 = (f62.C75700k0) r9
            g62.s r9 = r9.mm0()
            com.tencent.mm.plugin.radar.ui.RadarMemberView r5 = r8.f222358d
            com.tencent.mm.storage.z1 r5 = r5.f203313u
            if (r5 == 0) goto L_0x0058
            java.lang.String r5 = r5.getUsername()
            goto L_0x0059
        L_0x0058:
            r5 = r4
        L_0x0059:
            com.tencent.mm.storage.a5 r9 = (com.tencent.p014mm.storage.C44651a5) r9
            com.tencent.mm.storage.z4 r9 = r9.mo69630Lo(r5)
            if (r9 == 0) goto L_0x0071
            java.lang.String r5 = r9.field_encryptUsername
            if (r5 == 0) goto L_0x006e
            boolean r5 = z04.C112551y.m153811k(r5)
            if (r5 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r5 = 0
            goto L_0x006f
        L_0x006e:
            r5 = 1
        L_0x006f:
            if (r5 == 0) goto L_0x00a7
        L_0x0071:
            com.tencent.mm.plugin.radar.ui.RadarMemberView r5 = r8.f222358d
            com.tencent.mm.storage.z1 r5 = r5.f203313u
            if (r5 == 0) goto L_0x007c
            java.lang.String r5 = r5.mo73978v2()
            goto L_0x007d
        L_0x007c:
            r5 = r4
        L_0x007d:
            if (r5 == 0) goto L_0x0088
            boolean r5 = z04.C112551y.m153811k(r5)
            if (r5 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r5 = 0
            goto L_0x0089
        L_0x0088:
            r5 = 1
        L_0x0089:
            if (r5 != 0) goto L_0x00a7
            k40.a r9 = f40.C86709a0.m107533q(r0)
            f62.k0 r9 = (f62.C75700k0) r9
            g62.s r9 = r9.mm0()
            com.tencent.mm.plugin.radar.ui.RadarMemberView r0 = r8.f222358d
            com.tencent.mm.storage.z1 r0 = r0.f203313u
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = r0.mo73978v2()
            goto L_0x00a1
        L_0x00a0:
            r0 = r4
        L_0x00a1:
            com.tencent.mm.storage.a5 r9 = (com.tencent.p014mm.storage.C44651a5) r9
            com.tencent.mm.storage.z4 r9 = r9.mo69630Lo(r0)
        L_0x00a7:
            if (r9 == 0) goto L_0x00ac
            java.lang.String r9 = r9.field_conRemark
            goto L_0x00ad
        L_0x00ac:
            r9 = r3
        L_0x00ad:
            if (r9 == 0) goto L_0x00b7
            boolean r0 = z04.C112551y.m153811k(r9)
            if (r0 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r1 = 0
        L_0x00b7:
            if (r1 == 0) goto L_0x00cd
            com.tencent.mm.plugin.radar.ui.RadarMemberView r0 = r8.f222358d
            te3.km3 r0 = r0.getMember()
            if (r0 == 0) goto L_0x00cd
            com.tencent.mm.plugin.radar.ui.RadarMemberView r9 = r8.f222358d
            te3.km3 r9 = r9.getMember()
            if (r9 == 0) goto L_0x00cc
            java.lang.String r9 = r9.f183959f
            goto L_0x00cd
        L_0x00cc:
            r9 = r4
        L_0x00cd:
            com.tencent.mm.plugin.radar.ui.RadarMemberView r0 = r8.f222358d
            if (r9 != 0) goto L_0x00d2
            r9 = r3
        L_0x00d2:
            android.content.Context r1 = r0.getContext()
            r5 = 2131497391(0x7f0c11af, float:1.8618374E38)
            android.view.View r1 = android.view.View.inflate(r1, r5, r4)
            r0.f203318z = r1
            if (r1 == 0) goto L_0x00eb
            r5 = 2131313213(0x7f09423d, float:1.8244816E38)
            android.view.View r1 = r1.findViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x00ec
        L_0x00eb:
            r1 = r4
        L_0x00ec:
            if (r1 != 0) goto L_0x00ef
            goto L_0x00f2
        L_0x00ef:
            r1.setText(r3)
        L_0x00f2:
            android.view.View r1 = r0.f203318z
            if (r1 == 0) goto L_0x0100
            r3 = 2131313212(0x7f09423c, float:1.8244814E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.EditText r1 = (android.widget.EditText) r1
            goto L_0x0101
        L_0x0100:
            r1 = r4
        L_0x0101:
            r0.f203297A = r1
            android.view.View r1 = r0.f203318z
            if (r1 == 0) goto L_0x0111
            r3 = 2131317161(0x7f0951a9, float:1.8252824E38)
            android.view.View r1 = r1.findViewById(r3)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
        L_0x0111:
            r0.f203298B = r4
            if (r4 != 0) goto L_0x0116
            goto L_0x0119
        L_0x0116:
            r4.setVisibility(r2)
        L_0x0119:
            android.widget.EditText r1 = r0.f203297A
            if (r1 == 0) goto L_0x0120
            r1.setText(r9)
        L_0x0120:
            android.widget.TextView r9 = r0.f203298B
            if (r9 != 0) goto L_0x0125
            goto L_0x012a
        L_0x0125:
            java.lang.String r1 = "50"
            r9.setText(r1)
        L_0x012a:
            android.widget.EditText r9 = r0.f203297A
            if (r9 != 0) goto L_0x012f
            goto L_0x0134
        L_0x012f:
            android.text.InputFilter[] r1 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72927t0.f212544a
            r9.setFilters(r1)
        L_0x0134:
            android.widget.EditText r9 = r0.f203297A
            if (r9 == 0) goto L_0x0140
            fg2.i r1 = new fg2.i
            r1.<init>(r0)
            r9.addTextChangedListener(r1)
        L_0x0140:
            fg2.l r6 = new fg2.l
            r6.<init>(r0)
            fg2.k r7 = new fg2.k
            r7.<init>(r0)
            android.content.Context r2 = r0.getContext()
            android.content.Context r9 = r0.getContext()
            r1 = 2131834340(0x7f1135e4, float:1.9301788E38)
            java.lang.String r3 = r9.getString(r1)
            r4 = 0
            android.view.View r5 = r0.f203318z
            qo3.g r9 = nj3.C76879j.m92753x(r2, r3, r4, r5, r6, r7)
            r0.f203317y = r9
            android.widget.EditText r9 = r0.f203297A
            if (r9 == 0) goto L_0x016e
            fg2.j r1 = new fg2.j
            r1.<init>(r0)
            r9.post(r1)
        L_0x016e:
            java.lang.String r9 = "com/tencent/mm/plugin/radar/ui/RadarMemberView$mOnModifyNameClickListener$1"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r8, r9, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fg2.C75756h.onClick(android.view.View):void");
    }
}
