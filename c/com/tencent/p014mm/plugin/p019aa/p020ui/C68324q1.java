package com.tencent.p014mm.plugin.p019aa.p020ui;

import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import qo3.C47883u;
import te3.C78021z;

/* renamed from: com.tencent.mm.plugin.aa.ui.q1 */
public class C68324q1 implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ C78021z f196349a;

    /* renamed from: b */
    public final /* synthetic */ PaylistAAUI f196350b;

    /* renamed from: com.tencent.mm.plugin.aa.ui.q1$a */
    public class C68325a implements C47883u {
        public C68325a(C68324q1 q1Var) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.q1$b */
    public class C68326b implements C47883u {
        public C68326b() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            PaylistAAUI.m80673I7(C68324q1.this.f196350b);
        }
    }

    public C68324q1(PaylistAAUI paylistAAUI, C78021z zVar) {
        this.f196350b = paylistAAUI;
        this.f196349a = zVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.String r10 = "MicroMsg.Aa.PaylistAAUI"
            java.lang.String r0 = "click AlertMsgTips"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            qo3.q r10 = new qo3.q
            com.tencent.mm.plugin.aa.ui.PaylistAAUI r0 = r9.f196350b
            r10.<init>(r0)
            com.tencent.mm.plugin.aa.ui.PaylistAAUI r0 = r9.f196350b
            r1 = 2131838234(0x7f11451a, float:1.9309686E38)
            java.lang.String r0 = r0.getString(r1)
            r10.mo107606r(r0)
            com.tencent.mm.plugin.aa.ui.PaylistAAUI r0 = r9.f196350b
            android.view.LayoutInflater r0 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r0)
            r1 = 2131498091(0x7f0c146b, float:1.8619794E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r1 = 2131306251(0x7f09270b, float:1.8230696E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 2131315081(0x7f094989, float:1.8248605E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            te3.z r3 = r9.f196349a
            int r4 = r3.f228663h
            r5 = 1
            r6 = 0
            r7 = 4
            if (r4 != r7) goto L_0x0073
            com.tencent.mm.plugin.aa.ui.PaylistAAUI r4 = r9.f196350b
            int r8 = com.tencent.p014mm.plugin.p019aa.p020ui.PaylistAAUI.f196231R
            r4.getClass()
            java.util.LinkedList<te3.x> r3 = r3.f228649A
            java.util.Iterator r3 = r3.iterator()
        L_0x0050:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r3.next()
            te3.x r4 = (te3.C64820x) r4
            java.lang.String r4 = r4.f186250i
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0050
            r3 = 1
            goto L_0x0067
        L_0x0066:
            r3 = 0
        L_0x0067:
            if (r3 != 0) goto L_0x0073
            r3 = 2131234370(0x7f080e42, float:1.8084904E38)
            r1.setImageResource(r3)
            r1 = 2131838232(0x7f114518, float:1.9309681E38)
            goto L_0x007c
        L_0x0073:
            r3 = 2131234369(0x7f080e41, float:1.8084902E38)
            r1.setImageResource(r3)
            r1 = 2131838231(0x7f114517, float:1.930968E38)
        L_0x007c:
            com.tencent.mm.plugin.aa.ui.PaylistAAUI r3 = r9.f196350b
            java.lang.String r3 = r3.f196239H
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            if (r3 != 0) goto L_0x0089
            r1 = 2131838233(0x7f114519, float:1.9309683E38)
        L_0x0089:
            r2.setText(r1)
            r10.mo107592d(r0)
            r0 = 2131821677(0x7f11046d, float:1.9276104E38)
            r10.mo107601m(r0)
            com.tencent.mm.plugin.aa.ui.PaylistAAUI r0 = r9.f196350b
            r1 = 2131820619(0x7f11004b, float:1.9273958E38)
            java.lang.String r0 = r0.getString(r1)
            r10.mo107598j(r0)
            com.tencent.mm.plugin.aa.ui.q1$a r0 = new com.tencent.mm.plugin.aa.ui.q1$a
            r0.<init>(r9)
            com.tencent.mm.plugin.aa.ui.q1$b r1 = new com.tencent.mm.plugin.aa.ui.q1$b
            r1.<init>()
            r10.mo107591c(r0, r1)
            r10.mo107603o()
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 13721(0x3599, float:1.9227E-41)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r1[r6] = r2
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            r2 = 2
            com.tencent.mm.plugin.aa.ui.PaylistAAUI r3 = r9.f196350b
            int r3 = r3.f196247Q
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r10.mo160131h(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p019aa.p020ui.C68324q1.onClick(android.view.View):void");
    }
}
