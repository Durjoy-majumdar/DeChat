package zg1;

import cl1.C0702z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C52013xs0;
import yg1.C16006g;

/* renamed from: zg1.r */
public final class C16190r extends C16006g {

    /* renamed from: c */
    public final String f43388c = "LiveHighLightCheerAppMsgInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16190r(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        Class cls = C0702z0.class;
        C87412m.m108594g(linkedList, "msgList");
        ((C0702z0) this.f43066a.mo71262a(cls)).f1675i.clear();
        ((C0702z0) this.f43066a.mo71262a(cls)).f1675i.addAll(linkedList);
        String str = this.f43388c;
        Log.m105924i(str, "handleHighLightCheerMsg roomData.business(LiveCommonSlice::class.java).highLightCheerList:" + ((C0702z0) this.f43066a.mo71262a(cls)).f1675i.size());
    }

    /* renamed from: e */
    public boolean mo14633e() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.f134919d;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14634f(te3.C52013xs0 r2) {
        /*
            r1 = this;
            java.lang.String r0 = "appMsg"
            gy3.C87412m.m108594g(r2, r0)
            ok1.e r0 = ok1.C62042e.f176370a
            te3.hx0 r2 = r2.f144914s
            if (r2 == 0) goto L_0x0012
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f134919d
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = r2.username
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            boolean r2 = r0.mo87084h1(r2)
            r2 = r2 ^ 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C16190r.mo14634f(te3.xs0):boolean");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20006};
    }
}
