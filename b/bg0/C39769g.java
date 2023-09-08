package bg0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C51471u;

/* renamed from: bg0.g */
public class C39769g implements C87581a<Void, C89132b.C89134c<C51471u>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f106726a;

    public C39769g(C67235i iVar, C46888b bVar) {
        this.f106726a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.PaylistAAInteractor", "errType: %s, errCode: %s, retCode: %s, retMsg: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), Integer.valueOf(((C51471u) cVar.f256796d).f142511d), ((C51471u) cVar.f256796d).f142512e);
        this.f106726a.resume();
        return null;
    }
}
