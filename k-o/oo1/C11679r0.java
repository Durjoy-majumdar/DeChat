package oo1;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49352ez;
import te3.C50920q61;

/* renamed from: oo1.r0 */
public final class C11679r0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11614d0 f34222a;

    public C11679r0(C11614d0 d0Var) {
        this.f34222a = d0Var;
    }

    public Object call(Object obj) {
        C49352ez ezVar;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("MoreLiveListWidget", "CgiFinderLiveReceiveConcertTicket errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c + ", errType: " + cVar.f256793a);
        if (cVar.f256794b == 0 && cVar.f256793a == 0 && (ezVar = ((C50920q61) cVar.f256796d).f140162d) != null) {
            C61926c.m72668M(new C11677q0(this.f34222a, ezVar));
        }
        return C13598b0.f38549a;
    }
}
