package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import ab3.C91983a;
import android.view.View;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.sdk.platformtools.Log;
import db3.C97468l;
import db3.C97478u;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import wa3.C102364c;
import wa3.C102365e;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.d0 */
public class C96726d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91983a f283350d;

    /* renamed from: e */
    public final /* synthetic */ C96728e0 f283351e;

    public C96726d0(C96728e0 e0Var, C91983a aVar) {
        this.f283351e = e0Var;
        this.f283350d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C102365e Rd = C102364c.vx0().mo137946Rd();
        if (Rd != null) {
            String a = Rd.f301472i.mo141954a(Rd.mo141945g());
            boolean f = Rd.mo141944f();
            String str = Rd.f301472i.f301479a;
            FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new FavoriteNoteClickReportStruct();
            favoriteNoteClickReportStruct.f265562d = (long) 9;
            favoriteNoteClickReportStruct.f265564f = favoriteNoteClickReportStruct.mo86045b("noteid", a, true);
            favoriteNoteClickReportStruct.f265565g = f ? 1 : 0;
            favoriteNoteClickReportStruct.f265563e = favoriteNoteClickReportStruct.mo86045b("sessionID", str, true);
            favoriteNoteClickReportStruct.mo86054n();
            if (Log.getLogLevel() <= 1) {
                String q = favoriteNoteClickReportStruct.mo1006q();
                C87412m.m108593f(q, "struct.toShowString()");
                Log.m105925i("MicroMsg.WNNoteReporter", "report%s %s", 14547, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
            }
        }
        this.f283351e.f283361i.setPressed(false);
        this.f283351e.f283364l.setPressed(false);
        C96728e0 e0Var = this.f283351e;
        if (e0Var.f283368p || e0Var.f283370r) {
            e0Var.f283369q = false;
        }
        C97468l lVar = C97478u.f286111d;
        Boolean valueOf = Boolean.valueOf(!e0Var.f283369q);
        C96679b bVar = C96679b.f283182r;
        if (bVar != null) {
            bVar.mo134907e(lVar, valueOf);
        }
        C96728e0 e0Var2 = this.f283351e;
        boolean z = true ^ e0Var2.f283369q;
        e0Var2.f283369q = z;
        C96728e0.m124169a(e0Var2, view, z);
        C96728e0.m124170b(this.f283351e, this.f283350d);
        C96728e0 e0Var3 = this.f283351e;
        e0Var3.f283368p = false;
        e0Var3.f283370r = false;
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
