package mo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileDraftUIC;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87413o;
import java.util.LinkedList;
import je1.C46547x1;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C64621p23;
import up1.C65418l;
import up1.C65426w0;

/* renamed from: mo1.m */
public final class C61513m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C64621p23 f174868d;

    /* renamed from: e */
    public final /* synthetic */ C65418l f174869e;

    /* renamed from: f */
    public final /* synthetic */ FinderProfileDraftUIC f174870f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<C64621p23, C13598b0> f174871g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61513m(C64621p23 p232, C65418l lVar, FinderProfileDraftUIC finderProfileDraftUIC, C32226l<? super C64621p23, C13598b0> lVar2) {
        super(0);
        this.f174868d = p232;
        this.f174869e = lVar;
        this.f174870f = finderProfileDraftUIC;
        this.f174871g = lVar2;
    }

    public Object invoke() {
        LinkedList<FinderObject> linkedList = this.f174868d.f184740e;
        Log.m105924i("Finder.FinderProfileDraftUIC", "localId:" + this.f174869e.field_localId + ", id:" + this.f174869e.field_objectId + " is svrFeed");
        C8477a0 a0Var = new C8477a0();
        a0Var.f27482d = true;
        C65418l lVar = this.f174869e;
        C46547x1 x1Var = new C46547x1(lVar.field_objectId, lVar.mo89514l2().getObjectNonceId(), 0, 0, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, (C49712hj1) null, 0, (C49946j51) null, false, 122816, (C8480h) null);
        x1Var.mo85582k(this.f174870f.getContext(), "", 500);
        x1Var.mo9225i().mo123420E(new C47091l(a0Var, linkedList, this.f174870f, this.f174871g, this.f174868d));
        return C13598b0.f38549a;
    }
}
