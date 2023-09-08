package kf1;

import com.tencent.p014mm.autogen.events.FinderTagClickEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import os1.C11739f;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C51270sn1;

/* renamed from: kf1.bb */
public final class C9639bb extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderTagClickEvent f29959d;

    /* renamed from: e */
    public final /* synthetic */ C10029wa f29960e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9639bb(FinderTagClickEvent finderTagClickEvent, C10029wa waVar) {
        super(0);
        this.f29959d = finderTagClickEvent;
        this.f29960e = waVar;
    }

    public Object invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("tag click:");
        sb.append(this.f29959d.f9253d.f9254a);
        sb.append(",index:");
        this.f29959d.f9253d.getClass();
        sb.append(0);
        Log.m105918d("Finder.TimelineMachinePresenter", sb.toString());
        C51270sn1 sn12 = this.f29959d.f9253d.f9254a;
        if (sn12 != null) {
            C10029wa waVar = this.f29960e;
            if (waVar.f30741p == null) {
                C11739f fVar = waVar.f30734f;
                int i = waVar.f30738j;
                Object clone = waVar.f30742q.getDataListJustForAdapter().clone();
                C87412m.m108592e(clone, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.RVFeed>");
                C11739f.m11436j3(fVar, 4, 0, i, (ArrayList) clone, (ArrayList) null, (C89349b) null, false, false, 240, (Object) null);
            }
            C10029wa waVar2 = this.f29960e;
            waVar2.f30741p = this.f29959d.f9253d.f9254a;
            waVar2.mo10488q(new C10071za(waVar2));
        } else {
            C10029wa waVar3 = this.f29960e;
            waVar3.f30741p = sn12;
            waVar3.mo10488q(new C9628ab(waVar3));
        }
        return C13598b0.f38549a;
    }
}
