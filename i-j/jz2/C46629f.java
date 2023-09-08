package jz2;

import android.view.View;
import rz2.C48201c;

/* renamed from: jz2.f */
public final class C46629f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f125566d;

    /* renamed from: e */
    public final /* synthetic */ C76474e f125567e;

    /* renamed from: f */
    public final /* synthetic */ C48201c f125568f;

    public C46629f(String str, C76474e eVar, C48201c cVar) {
        this.f125566d = str;
        this.f125567e = eVar;
        this.f125568f = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r34) {
        /*
            r33 = this;
            r6 = r33
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r34
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleLike$likeClickListener$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r33
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = su0.C13781a.m13082a()
            java.lang.String r1 = r6.f125566d
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.String r4 = "(Landroid/view/View;)V"
            java.lang.String r5 = "onClick"
            java.lang.String r7 = "android/view/View$OnClickListener"
            java.lang.String r8 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleLike$likeClickListener$1"
            if (r0 == 0) goto L_0x00ea
            jz2.e r0 = r6.f125567e
            qy2.a0 r0 = r0.f223873d
            boolean r0 = r0.f128521i
            if (r0 == 0) goto L_0x0057
            az2.e r0 = az2.C39674e.f106452d
            nz2.a r0 = r0.mo62248f0()
            int r0 = r0.mo72361a()
            if (r0 == 0) goto L_0x0057
            com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity$a r0 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListActivity.f116931f
            jz2.e r3 = r6.f125567e
            android.content.Context r3 = r3.mo106716y()
            r0.mo67454a(r3, r1)
            goto L_0x00af
        L_0x0057:
            com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity$a r0 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListActivity.f116931f
            jz2.e r0 = r6.f125567e
            android.content.Context r0 = r0.mo106716y()
            rz2.c r1 = r6.f125568f
            java.lang.String r1 = r1.field_StatusID
            r9 = 9
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity> r11 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListActivity.class
            r10.<init>(r0, r11)
            java.lang.String r11 = "status_id"
            r10.putExtra(r11, r1)
            java.lang.String r1 = "scene"
            r10.putExtra(r1, r3)
            java.lang.String r1 = "reportEnterScene"
            r10.putExtra(r1, r9)
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r10)
            java.lang.Object[] r10 = r1.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion"
            java.lang.String r12 = "startForSingleStatusHistory"
            java.lang.String r13 = "(Landroid/content/Context;Ljava/lang/String;I)V"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "startActivity"
            java.lang.String r16 = "(Landroid/content/Intent;)V"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo10231a(r3)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.startActivity(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion"
            java.lang.String r11 = "startForSingleStatusHistory"
            java.lang.String r12 = "(Landroid/content/Context;Ljava/lang/String;I)V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "startActivity"
            java.lang.String r15 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x00af:
            vz2.d r16 = vz2.C78501d.f229945a
            jz2.e r0 = r6.f125567e
            android.content.Context r17 = r0.mo106716y()
            r18 = 14
            jz2.e r0 = r6.f125567e
            android.widget.TextView r0 = r0.mo106692C()
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r20 = r0.toString()
            rz2.c r0 = r6.f125568f
            r21 = r0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r31 = 496(0x1f0, float:6.95E-43)
            r32 = 0
            vz2.C78501d.m94806h(r16, r17, r18, r20, r21, r22, r24, r26, r28, r30, r31, r32)
            jz2.e r0 = r6.f125567e
            qy2.n$a r0 = r0.f223871X
            if (r0 == 0) goto L_0x00e6
            r1 = 3
            r0.mo67431a(r1, r2)
        L_0x00e6:
            j20.C117292a.m165361g(r6, r8, r7, r5, r4)
            return
        L_0x00ea:
            long r9 = java.lang.System.currentTimeMillis()
            jz2.e r0 = r6.f125567e
            r0.getClass()
            r11 = 0
            long r9 = r9 - r11
            long r9 = java.lang.Math.abs(r9)
            r11 = 500(0x1f4, double:2.47E-321)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            j20.C117292a.m165361g(r6, r8, r7, r5, r4)
            return
        L_0x0104:
            jz2.e r0 = r6.f125567e
            android.widget.ImageView r0 = r0.mo106715x()
            java.lang.Object r0 = r0.getTag()
            boolean r9 = r0 instanceof java.lang.Boolean
            if (r9 == 0) goto L_0x0115
            r2 = r0
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0115:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "localIsLike:"
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "MicroMsg.TextStatus.BaseStatusLoadLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r2, r0)
            r0 = r0 ^ r1
            jz2.e r1 = r6.f125567e
            r1.mo106705V(r0, r3)
            jz2.e r1 = r6.f125567e
            qy2.n$a r1 = r1.f223871X
            if (r1 == 0) goto L_0x0147
            if (r1 == 0) goto L_0x0147
            r2 = 2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo67431a(r2, r0)
        L_0x0147:
            jz2.e r0 = r6.f125567e
            r0.mo106694H()
            j20.C117292a.m165361g(r6, r8, r7, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C46629f.onClick(android.view.View):void");
    }
}
