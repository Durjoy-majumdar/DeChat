package com.tencent.p014mm.plugin.finder.search;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import gy3.C8479f0;
import h81.C59774i;
import java.util.Map;
import p185kq.C10383h;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C48868bk1;

/* renamed from: com.tencent.mm.plugin.finder.search.d */
public final class C3581d implements C118148a {

    /* renamed from: a */
    public final /* synthetic */ C8479f0<C48868bk1> f16634a;

    public C3581d(C8479f0<C48868bk1> f0Var) {
        this.f16634a = f0Var;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
        return false;
    }

    /* renamed from: b */
    public final Map<String, Object> mo37b(String str) {
        Class cls = C10383h.class;
        C13604l[] lVarArr = new C13604l[5];
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        C13604l lVar = new C13604l("behaviour_session_id", Wb);
        boolean z = false;
        lVarArr[0] = lVar;
        lVarArr[1] = new C13604l("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
        lVarArr[2] = new C13604l("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
        FinderContact finderContact = ((C48868bk1) this.f16634a.f27484d).f131162d;
        if (finderContact != null && finderContact.liveStatus == 1) {
            z = true;
        }
        lVarArr[3] = new C13604l("live_enter_status", Long.valueOf(z ? 1 : 2));
        lVarArr[4] = new C13604l("share_username", "");
        return C90364q0.m113147f(lVarArr);
    }
}
