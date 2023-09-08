package ks1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C86312j;
import er1.C58784w3;
import fe1.C58969q;
import p629ny.C76979h;
import te3.C52192z0;

/* renamed from: ks1.b */
public final class C61153b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderObject f174097d;

    /* renamed from: e */
    public final /* synthetic */ C58969q f174098e;

    /* renamed from: f */
    public final /* synthetic */ C61150a f174099f;

    public C61153b(FinderObject finderObject, C58969q qVar, C61150a aVar) {
        this.f174097d = finderObject;
        this.f174098e = qVar;
        this.f174099f = aVar;
    }

    public final void run() {
        String str;
        C52192z0 j0 = C58784w3.f168295a.mo83940j0(this.f174097d);
        if (j0 == null || (str = j0.f145600d) == null) {
            C58969q qVar = this.f174098e;
            str = qVar != null ? qVar.getNickname() : this.f174097d.nickname;
        }
        this.f174099f.f174089b.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f174099f.f174089b.getContext(), str));
    }
}
