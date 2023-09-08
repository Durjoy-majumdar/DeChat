package com.tencent.p014mm.plugin.offline.p085ui;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import id2.C76313t;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.plugin.offline.ui.r */
public class C70021r {

    /* renamed from: com.tencent.mm.plugin.offline.ui.r$a */
    public class C70022a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77390c0 f202046d;

        public C70022a(C77390c0 c0Var) {
            this.f202046d = c0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/offline/ui/OfflineErrorHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f202046d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/offline/ui/OfflineErrorHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.r$b */
    public class C70023b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77390c0 f202047d;

        public C70023b(C77390c0 c0Var) {
            this.f202047d = c0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/offline/ui/OfflineErrorHelper$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f202047d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/offline/ui/OfflineErrorHelper$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.r$c */
    public class C70024c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f202048d;

        /* renamed from: e */
        public final /* synthetic */ C76313t.C76319g f202049e;

        /* renamed from: f */
        public final /* synthetic */ C77390c0 f202050f;

        public C70024c(Activity activity, C76313t.C76319g gVar, C77390c0 c0Var) {
            this.f202048d = activity;
            this.f202049e = gVar;
            this.f202050f = c0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/offline/ui/OfflineErrorHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C75228t.m90219L(this.f202048d, this.f202049e.f223567h, true);
            C75228t.m90243e0(3, 1);
            this.f202050f.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/offline/ui/OfflineErrorHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        if (r8 > 0) goto L_0x00c2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m82512a(android.app.Activity r17, java.lang.String r18, id2.C76313t.C76319g r19) {
        /*
            r0 = r17
            r1 = r19
            r2 = 0
            r3 = 2131839734(0x7f114af6, float:1.9312728E38)
            r4 = 0
            if (r1 != 0) goto L_0x0021
            boolean r1 = android.text.TextUtils.isEmpty(r18)
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = r0.getString(r3)
            goto L_0x0018
        L_0x0016:
            r1 = r18
        L_0x0018:
            com.tencent.mm.plugin.offline.ui.o r3 = new com.tencent.mm.plugin.offline.ui.o
            r3.<init>()
            nj3.C76879j.m92713G(r0, r1, r2, r4, r3)
            return
        L_0x0021:
            java.lang.String r5 = r1.f223569j
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0084
            java.lang.String r1 = r1.f223567h
            boolean r5 = android.text.TextUtils.isEmpty(r18)
            if (r5 == 0) goto L_0x0036
            java.lang.String r5 = r0.getString(r3)
            goto L_0x0038
        L_0x0036:
            r5 = r18
        L_0x0038:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r6 != 0) goto L_0x0071
            java.lang.String r2 = "MicroMsg.OfflineErrorHelper"
            java.lang.String r3 = "error_detail_url is not null "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r2 = 0
            android.content.res.Resources r3 = r17.getResources()
            r4 = 2131839077(0x7f114865, float:1.9311395E38)
            java.lang.String r3 = r3.getString(r4)
            android.content.res.Resources r4 = r17.getResources()
            r6 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r4 = r4.getString(r6)
            r6 = 1
            com.tencent.mm.plugin.offline.ui.p r7 = new com.tencent.mm.plugin.offline.ui.p
            r7.<init>(r0, r1)
            com.tencent.mm.plugin.offline.ui.q r8 = new com.tencent.mm.plugin.offline.ui.q
            r8.<init>()
            r0 = r17
            r1 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            nj3.C76879j.m92709C(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0083
        L_0x0071:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L_0x007b
            java.lang.String r5 = r0.getString(r3)
        L_0x007b:
            com.tencent.mm.plugin.offline.ui.o r1 = new com.tencent.mm.plugin.offline.ui.o
            r1.<init>()
            nj3.C76879j.m92713G(r0, r5, r2, r4, r1)
        L_0x0083:
            return
        L_0x0084:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            if (r5 == 0) goto L_0x008f
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0091
        L_0x008f:
            r3 = r18
        L_0x0091:
            java.lang.String r5 = r1.f223569j
            java.lang.String r6 = "http://"
            boolean r5 = r5.startsWith(r6)
            if (r5 != 0) goto L_0x00a8
            java.lang.String r5 = r1.f223569j
            java.lang.String r6 = "https://"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r5 = 0
            goto L_0x00a9
        L_0x00a8:
            r5 = 1
        L_0x00a9:
            r6 = 0
            if (r5 != 0) goto L_0x00de
            boolean r8 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r8 == 0) goto L_0x00ba
            long r8 = r1.f223571l
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ba
            goto L_0x00c2
        L_0x00ba:
            long r8 = r1.f223570k
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r8 = r6
        L_0x00c2:
            android.content.res.Resources r10 = r17.getResources()
            java.lang.String r11 = r1.f223569j
            java.lang.String r12 = r17.getPackageName()
            java.lang.String r13 = "raw"
            int r10 = r10.getIdentifier(r11, r13, r12)
            if (r10 == 0) goto L_0x00df
            android.content.res.Resources r2 = r17.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r10)
            goto L_0x00df
        L_0x00de:
            r8 = r6
        L_0x00df:
            qo3.c0 r10 = new qo3.c0
            r11 = 2131887328(0x7f1204e0, float:1.940926E38)
            r10.<init>(r0, r11)
            java.lang.String r11 = r1.f223567h
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            r12 = 2131300422(0x7f091046, float:1.8218873E38)
            r13 = 2131300381(0x7f09101d, float:1.821879E38)
            r14 = 2131300416(0x7f091040, float:1.8218861E38)
            r15 = 8
            r6 = 1061997773(0x3f4ccccd, float:0.8)
            r7 = 2131099757(0x7f06006d, float:1.7811876E38)
            if (r11 == 0) goto L_0x0167
            r11 = 2131498261(0x7f0c1515, float:1.8620138E38)
            r10.setContentView(r11)
            android.view.View r11 = r10.findViewById(r14)
            com.tencent.mm.ui.widget.imageview.WeImageView r11 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r11
            android.view.View r13 = r10.findViewById(r13)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r13 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r13
            android.view.View r12 = r10.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r14 = 2131298403(0x7f090863, float:1.8214778E38)
            android.view.View r14 = r10.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r5 == 0) goto L_0x012f
            r11.setVisibility(r15)
            r13.setVisibility(r4)
            java.lang.String r1 = r1.f223569j
            r13.setUrl(r1)
            goto L_0x0153
        L_0x012f:
            r11.setVisibility(r4)
            r13.setVisibility(r15)
            r15 = 0
            int r1 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x0143
            int r1 = com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46930a(r8)
            r11.setIconColor(r1)
            goto L_0x014e
        L_0x0143:
            android.content.res.Resources r1 = r17.getResources()
            int r1 = r1.getColor(r7)
            r11.setIconColor(r1)
        L_0x014e:
            if (r2 == 0) goto L_0x0153
            r11.setImageDrawable(r2)
        L_0x0153:
            r12.setText(r3)
            android.text.TextPaint r1 = r12.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1, r6)
            com.tencent.mm.plugin.offline.ui.r$a r1 = new com.tencent.mm.plugin.offline.ui.r$a
            r1.<init>(r10)
            r14.setOnClickListener(r1)
            goto L_0x01e0
        L_0x0167:
            r11 = 2131498262(0x7f0c1516, float:1.862014E38)
            r10.setContentView(r11)
            android.view.View r11 = r10.findViewById(r14)
            com.tencent.mm.ui.widget.imageview.WeImageView r11 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r11
            android.view.View r13 = r10.findViewById(r13)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r13 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r13
            android.view.View r12 = r10.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r14 = 2131307229(0x7f092add, float:1.823268E38)
            android.view.View r14 = r10.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r6 = 2131312494(0x7f093f6e, float:1.8243358E38)
            android.view.View r6 = r10.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r5 == 0) goto L_0x019f
            r11.setVisibility(r15)
            r13.setVisibility(r4)
            java.lang.String r2 = r1.f223569j
            r13.setUrl(r2)
            goto L_0x01c3
        L_0x019f:
            r11.setVisibility(r4)
            r13.setVisibility(r15)
            r15 = 0
            int r5 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x01b3
            int r5 = com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46930a(r8)
            r11.setIconColor(r5)
            goto L_0x01be
        L_0x01b3:
            android.content.res.Resources r5 = r17.getResources()
            int r5 = r5.getColor(r7)
            r11.setIconColor(r5)
        L_0x01be:
            if (r2 == 0) goto L_0x01c3
            r11.setImageDrawable(r2)
        L_0x01c3:
            r12.setText(r3)
            android.text.TextPaint r2 = r12.getPaint()
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r2, r3)
            com.tencent.mm.plugin.offline.ui.r$b r2 = new com.tencent.mm.plugin.offline.ui.r$b
            r2.<init>(r10)
            r14.setOnClickListener(r2)
            com.tencent.mm.plugin.offline.ui.r$c r2 = new com.tencent.mm.plugin.offline.ui.r$c
            r2.<init>(r0, r1, r10)
            r6.setOnClickListener(r2)
        L_0x01e0:
            r10.setCancelable(r4)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            r0.addDialog(r10)
            r10.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.offline.p085ui.C70021r.m82512a(android.app.Activity, java.lang.String, id2.t$g):void");
    }
}
