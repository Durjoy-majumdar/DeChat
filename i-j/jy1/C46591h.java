package jy1;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.game.luggage.model.H5CgiPreloadModel;
import kotlin.Metadata;
import p225rc.C89918i;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljy1/h;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/game/luggage/model/H5CgiPreloadModel;", "<init>", "()V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: jy1.h */
public final class C46591h implements C80883e<IPCVoid, H5CgiPreloadModel> {
    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        C89918i iVar = C46582b.f125489d;
        C46582b bVar = C46582b.f125486a;
        if (!((Boolean) iVar.mo124238b(bVar, C46582b.f125487b[1])).booleanValue()) {
            C46582b.f125491f = new C46590g(gVar);
        } else if (gVar != null) {
            gVar.mo894a(bVar.mo71883a());
        }
    }
}
