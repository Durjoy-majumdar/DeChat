package ry1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p159gw.C45962f;
import p763ym.C79138l;
import uy1.C52642c;

/* renamed from: ry1.k0 */
public class C48130k0 implements AdapterView.OnItemClickListener, View.OnClickListener {

    /* renamed from: d */
    public int f129022d = 0;

    /* renamed from: a */
    public final void mo72870a(Context context, C42039b bVar) {
        int i;
        int n;
        int i2 = bVar.f113271z1;
        if (i2 == 1) {
            n = C52642c.m59002t(context, bVar.f113250C1, (String) null);
        } else {
            if (i2 != 0) {
                i = 0;
            } else if (bVar.mo65996u2() && !Util.isNullOrNil(bVar.f113269V1.f128166i) && !((C79138l) C86312j.m106911c(C79138l.class)).mo74016tz(context, bVar)) {
                n = C52642c.m59002t(context, bVar.f113269V1.f128166i, (String) null);
            } else if (Util.isNullOrNil(bVar.f149247P) || bVar.f149252S != 4) {
                Bundle bundle = new Bundle();
                bundle.putCharSequence("game_app_id", bVar.field_appId);
                int i3 = bVar.f113255H1;
                if (i3 == 1601) {
                    bundle.putInt("game_report_from_scene", this.f129022d);
                } else {
                    bundle.putInt("game_report_from_scene", i3);
                }
                n = C52642c.m58996n(context, bVar.field_appId, bVar.f113250C1, bundle, 0);
            } else {
                Log.m105924i("MicroMsg.GameItemClickListener", "Download via Google Play");
                ((C45962f) C86312j.m106911c(C45962f.class)).Qt0(context, bVar.f149247P);
                i = 25;
            }
            Context context2 = context;
            C40314g.m43488g(context2, bVar.f113254G1, bVar.f113255H1, bVar.f113256I1, i, bVar.field_appId, this.f129022d, bVar.f113252E1, bVar.f113263P1);
        }
        i = n;
        Context context22 = context;
        C40314g.m43488g(context22, bVar.f113254G1, bVar.f113255H1, bVar.f113256I1, i, bVar.field_appId, this.f129022d, bVar.f113252E1, bVar.f113263P1);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof C42039b)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        mo72870a(view.getContext(), (C42039b) view.getTag());
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            r0.add(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0.add(r1)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r0.add(r11)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/game/ui/GameItemClickListener"
            java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r3 = "onItemClick"
            java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            r5 = r7
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            android.widget.Adapter r8 = r8.getAdapter()
            java.lang.Object r8 = r8.getItem(r10)
            java.lang.String r10 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
            java.lang.String r11 = "onItemClick"
            java.lang.String r12 = "android/widget/AdapterView$OnItemClickListener"
            java.lang.String r0 = "com/tencent/mm/plugin/game/ui/GameItemClickListener"
            if (r8 == 0) goto L_0x005c
            boolean r1 = r8 instanceof com.tencent.p014mm.plugin.game.model.C42039b
            if (r1 != 0) goto L_0x0043
            goto L_0x005c
        L_0x0043:
            com.tencent.mm.plugin.game.model.b r8 = (com.tencent.p014mm.plugin.game.model.C42039b) r8
            java.lang.String r1 = r8.field_appId
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0051
            j20.C117292a.m165361g(r7, r0, r12, r11, r10)
            return
        L_0x0051:
            android.content.Context r9 = r9.getContext()
            r7.mo72870a(r9, r8)
            j20.C117292a.m165361g(r7, r0, r12, r11, r10)
            return
        L_0x005c:
            j20.C117292a.m165361g(r7, r0, r12, r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ry1.C48130k0.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
