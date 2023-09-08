package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.view.View;
import p849e3.C107179f0;
import p849e3.C107204q;
import st0.C90358a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.y$$a */
public final /* synthetic */ class y$$a implements C107204q {

    /* renamed from: a */
    public final /* synthetic */ C85004y f247727a;

    public /* synthetic */ y$$a(C85004y yVar) {
        this.f247727a = yVar;
    }

    /* renamed from: a */
    public final C107179f0 mo12075a(View view, C107179f0 f0Var) {
        C85004y yVar = this.f247727a;
        yVar.f247719g = true;
        yVar.mo117927b();
        C90358a aVar = yVar.f247722j;
        if (aVar != null) {
            ((C84967l0) aVar).mo117846d(view, false, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        yVar.f247719g = false;
        return f0Var;
    }
}
