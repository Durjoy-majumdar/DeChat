package er1;

import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7888v2;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.db4;

/* renamed from: er1.w2 */
public final class C7911w2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ LinkedList<db4> f26578a;

    public C7911w2(LinkedList<db4> linkedList) {
        this.f26578a = linkedList;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256794b == 0 && cVar.f256793a == 0) {
            C7888v2.C7889a.f26514a.getClass();
            String str = C7888v2.C7889a.f26515b;
            Log.m105924i(str, "liveShareStatsReport successfully! size=" + this.f26578a.size());
        } else {
            C7888v2.C7889a.f26514a.getClass();
            String str2 = C7888v2.C7889a.f26515b;
            Log.m105928w(str2, "liveShareStatsReport fail to report! size=" + this.f26578a.size());
        }
        return C13598b0.f38549a;
    }
}
