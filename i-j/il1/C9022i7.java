package il1;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: il1.i7 */
public final class C9022i7<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public static final C9022i7<_Ret, _Var> f28494a = new C9022i7<>();

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "ljd do doFinderLiveGetTeamupGiftPrepare success");
        } else {
            Log.m105921e("Finder.FinderLiveVisitorGameTeamWidget", "ljd do doFinderLiveGetTeamupGiftPrepare fail errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(cVar.f256794b), cVar.f256795c);
        }
        return C13598b0.f38549a;
    }
}
