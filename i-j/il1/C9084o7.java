package il1;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: il1.o7 */
public final class C9084o7<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public static final C9084o7<_Ret, _Var> f28652a = new C9084o7<>();

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "ljd do CgiAudienceSendCommentToReserveGame success");
        } else {
            Log.m105921e("Finder.FinderLiveVisitorGameTeamWidget", "ljd do CgiAudienceSendCommentToReserveGame fail errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(cVar.f256794b), cVar.f256795c);
        }
        return C13598b0.f38549a;
    }
}
