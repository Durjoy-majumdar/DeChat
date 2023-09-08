package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49352ez;
import te3.C50920q61;

/* renamed from: qj1.nc */
public final class C12555nc<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C12572oc f36046a;

    /* renamed from: b */
    public final /* synthetic */ String f36047b;

    public C12555nc(C12572oc ocVar, String str) {
        this.f36046a = ocVar;
        this.f36047b = str;
    }

    public Object call(Object obj) {
        C49352ez ezVar;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        String str = this.f36046a.f36075i;
        Log.m105924i(str, "CgiFinderLiveReceiveConcertTicket errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c + ", errType: " + cVar.f256793a);
        if (cVar.f256794b == 0 && cVar.f256793a == 0 && (ezVar = ((C50920q61) cVar.f256796d).f140162d) != null) {
            C61926c.m72668M(new C12520mc(this.f36046a, ezVar, this.f36047b));
        }
        return C13598b0.f38549a;
    }
}
