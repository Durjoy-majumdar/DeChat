package qo0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hj0.C87535e;
import qo0.C89750q;

/* renamed from: qo0.u */
public final class C89770u extends C89750q.C89752b {

    /* renamed from: a */
    public final /* synthetic */ C89750q f258129a;

    /* renamed from: b */
    public final /* synthetic */ int f258130b;

    /* renamed from: c */
    public final /* synthetic */ int f258131c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89770u(C89750q qVar, int i, int i2) {
        super(qVar);
        this.f258129a = qVar;
        this.f258130b = i;
        this.f258131c = i2;
    }

    /* renamed from: a */
    public void mo88410a(C87535e eVar) {
        Log.m105920e("MicroMsg.VideoCast.VideoCastController", "play fail");
        C89750q.C89751a aVar = new C89750q.C89751a(C89724a.ACTION_ERROR);
        aVar.f258107b = Integer.valueOf(this.f258131c);
        C89750q.m112209a(this.f258129a, aVar);
    }

    /* renamed from: b */
    public void mo88411b(C87535e eVar) {
        C87412m.m108594g(eVar, "response");
        Log.m105925i("MicroMsg.VideoCast.VideoCastController", "play success, url = [%s]", this.f258129a.f258092c.f257411f);
        int i = this.f258130b;
        C89750q qVar = this.f258129a;
        if (i > 0) {
            qVar.f258101l = new C89774w(qVar, i);
        }
    }
}
