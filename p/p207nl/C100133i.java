package p207nl;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51074r90;

/* renamed from: nl.i */
public final class C100133i<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C100130h f293305a;

    public C100133i(C100130h hVar) {
        this.f293305a = hVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        C51074r90 r902 = (C51074r90) cVar.f256796d;
        String str = this.f293305a.f293303d;
        Log.m105924i(str, "checkExchange: cgi result: " + i + ", " + i2);
        if (i == 0 && i2 == 0) {
            String str2 = this.f293305a.f293301b.field_groupId;
            C87412m.m108593f(str2, "emojiInfo.field_groupId");
            C47275m.m52572a(str2);
            this.f293305a.f293302c.mo57745a(true);
        } else {
            this.f293305a.mo139425a(i2, cVar.f256795c);
        }
        return C13598b0.f38549a;
    }
}
