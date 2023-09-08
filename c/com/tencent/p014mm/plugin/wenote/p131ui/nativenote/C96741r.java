package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import ab3.C91983a;
import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import fb3.C97855a;
import j20.C117292a;
import java.util.ArrayList;
import wa3.C102364c;
import wa3.C102365e;
import xa3.C102592h;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.r */
public class C96741r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91983a f283386d;

    /* renamed from: e */
    public final /* synthetic */ C96728e0 f283387e;

    public C96741r(C96728e0 e0Var, C91983a aVar) {
        this.f283387e = e0Var;
        this.f283386d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C102365e Rd = C102364c.vx0().mo137946Rd();
        if (Rd != null) {
            String a = Rd.f301472i.mo141954a(Rd.mo141945g());
            boolean f = Rd.mo141944f();
            String str = Rd.f301472i.f301479a;
            FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new FavoriteNoteClickReportStruct();
            favoriteNoteClickReportStruct.f265562d = (long) 10;
            favoriteNoteClickReportStruct.f265564f = favoriteNoteClickReportStruct.mo86045b("noteid", a, true);
            favoriteNoteClickReportStruct.f265565g = f ? 1 : 0;
            favoriteNoteClickReportStruct.f265563e = favoriteNoteClickReportStruct.mo86045b("sessionID", str, true);
            favoriteNoteClickReportStruct.mo86054n();
            C97855a.f287023a.mo137182b(favoriteNoteClickReportStruct);
        }
        C102592h hVar = new C102592h();
        C96679b bVar = C96679b.f283182r;
        if (bVar != null) {
            ((NoteEditorUI) this.f283387e.f283371s).f283238X0.mo126209s(hVar, bVar.mo134905c(), true, true, false, false, true);
        } else {
            ((NoteEditorUI) this.f283387e.f283371s).f283238X0.mo126209s(hVar, (WXRTEditText) null, true, true, false, false, true);
        }
        C96728e0.m124170b(this.f283387e, this.f283386d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
