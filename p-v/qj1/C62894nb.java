package qj1;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C39622i0;
import cl1.C55004v1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import nj3.C76912y0;
import te3.C64404gv0;

/* renamed from: qj1.nb */
public final class C62894nb<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C62843kb f178491d;

    public C62894nb(C62843kb kbVar) {
        this.f178491d = kbVar;
    }

    public void onChanged(Object obj) {
        C64404gv0 gv02 = (C64404gv0) obj;
        Class cls = C55004v1.class;
        C39622i0 x0 = this.f178491d.mo87696x0(cls);
        C62843kb kbVar = this.f178491d;
        C55004v1 v1Var = (C55004v1) x0;
        String c3 = v1Var.mo76046c3();
        Log.m105924i("MultiStreamPlugin", "multiStreamDelete is curStreamId: curStreamIddelete success: " + v1Var.f154438i.removeIf(new C62884mb(gv02)));
        if (C87412m.m108589b(c3, gv02.f183359f)) {
            C76912y0.makeText(kbVar.f166287d.getContext(), (CharSequence) kbVar.f166287d.getContext().getResources().getString(C0966R.string.mav), 0).show();
            ((C55004v1) v1Var.business(cls)).f154437h = 0;
        }
        if (((C55004v1) v1Var.business(cls)).f154437h == v1Var.f154438i.size()) {
            C55004v1 v1Var2 = (C55004v1) v1Var.business(cls);
            v1Var2.f154437h--;
        }
        if (((C55004v1) v1Var.business(cls)).f154437h < 0) {
            ((C55004v1) v1Var.business(cls)).f154437h = 0;
        }
        kbVar.mo87805c1(v1Var.f154438i);
    }
}
