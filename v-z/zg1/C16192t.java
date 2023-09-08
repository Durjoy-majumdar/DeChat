package zg1;

import cl1.C0702z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import o40.C61937h;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C22532vt0;
import te3.C52013xs0;
import yg1.C16006g;

/* renamed from: zg1.t */
public final class C16192t extends C16006g {

    /* renamed from: c */
    public final String f43390c = "LiveHotCommentMsgInterceptor";

    /* renamed from: d */
    public int f43391d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16192t(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150925W(linkedList);
        C22532vt0 vt02 = new C22532vt0();
        if (xs02 != null) {
            byte[] bArr = null;
            if (!(xs02.f144906h != null)) {
                xs02 = null;
            }
            if (xs02 != null) {
                C89349b bVar = xs02.f144906h;
                if (bVar != null) {
                    bArr = bVar.mo123703f();
                }
                vt02.parseFrom(bArr);
            }
        }
        int i = this.f43391d;
        int i2 = vt02.f64664d;
        if (i != i2) {
            this.f43391d = i2;
            Log.m105924i(this.f43390c, "receive hot comment msg:" + C61937h.m72709h(vt02));
            ((C0702z0) this.f43066a.mo71262a(C0702z0.class)).f1684u.postValue(vt02);
        }
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20082};
    }
}
