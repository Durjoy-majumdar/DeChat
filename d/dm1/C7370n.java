package dm1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50119ke1;
import te3.C64726td1;

/* renamed from: dm1.n */
public final class C7370n implements C11385n {

    /* renamed from: d */
    public final Context f25503d;

    /* renamed from: e */
    public C64726td1 f25504e;

    public C7370n(Context context) {
        C87412m.m108594g(context, "context");
        this.f25503d = context;
    }

    /* renamed from: a */
    public final void mo8538a(FinderObject finderObject) {
        if (this.f25504e != null) {
            C76912y0.makeText(this.f25503d, (int) C0966R.string.d2n, 0).show();
        } else {
            C76912y0.makeText(this.f25503d, (int) C0966R.string.d2m, 0).show();
        }
        ((C58417y0) C86312j.m106911c(C58417y0.class)).wy0(this.f25503d, 2, 4, finderObject != null ? Integer.valueOf(finderObject.follow_feed_count) : null);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        if (yVar != null && yVar.getType() == 7289) {
            z = true;
        }
        if (z) {
            C114799u reqResp = yVar.getReqResp();
            C47465a aVar = null;
            C47350c cVar = reqResp instanceof C47350c ? (C47350c) reqResp : null;
            if (cVar != null) {
                aVar = cVar.f127056b.f127083a;
            }
            if (aVar instanceof C50119ke1) {
                C50119ke1 ke12 = (C50119ke1) aVar;
            }
        }
    }
}
