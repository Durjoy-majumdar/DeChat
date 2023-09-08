package p007bo;

import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.pigeon.BizPigeon;
import f40.C86709a0;
import f62.C75700k0;
import fy0.C20734b;
import gy3.C87412m;
import rb0.C48009v0;

/* renamed from: bo.n */
public final class C16815n {

    /* renamed from: a */
    public static final C16815n f45432a = new C16815n();

    /* renamed from: a */
    public final BizPigeon.OftenReadAccountInfo mo17860a(String str) {
        Class cls = C75700k0.class;
        C87412m.m108594g(str, "userName");
        BizPigeon.OftenReadAccountInfo oftenReadAccountInfo = new BizPigeon.OftenReadAccountInfo();
        oftenReadAccountInfo.setContactInfo(C16801f.f45399a.mo17843c(str));
        long n3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69715n3(str);
        C19623o0 LL = C48009v0.Jx0().mo25784LL(n3);
        if (LL == null) {
            return oftenReadAccountInfo;
        }
        oftenReadAccountInfo.setLastMsgTime(Long.valueOf(LL.field_createTime));
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(str);
        if ((j != null ? j.mo108786G2() : 0) > 0) {
            long currentTimeMillis = System.currentTimeMillis() - LL.field_createTime;
            if (C20734b.f58617b <= 0) {
                C20734b.f58617b = 43200000;
            }
            if (currentTimeMillis < C20734b.f58617b && j.mo108786G2() > C48009v0.Kx0().mo25735TE(n3)) {
                oftenReadAccountInfo.setHasUnreadDot(Boolean.TRUE);
            }
        }
        return oftenReadAccountInfo;
    }
}
