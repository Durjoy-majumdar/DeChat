package oo1;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49352ez;
import te3.C50920q61;

/* renamed from: oo1.n */
public final class C11670n<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11625e f34197a;

    /* renamed from: b */
    public final /* synthetic */ String f34198b;

    public C11670n(C11625e eVar, String str) {
        this.f34197a = eVar;
        this.f34198b = str;
    }

    public Object call(Object obj) {
        C49352ez ezVar;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("Finder.HeaderLiveWidget", "CgiFinderLiveReceiveConcertTicket errCode: " + cVar.f256794b + ", errMsg: " + cVar.f256795c + ", errType: " + cVar.f256793a);
        if (cVar.f256794b == 0 && cVar.f256793a == 0 && (ezVar = ((C50920q61) cVar.f256796d).f140162d) != null) {
            C61926c.m72668M(new C11668m(this.f34197a, ezVar, this.f34198b));
        }
        return C13598b0.f38549a;
    }
}
