package a10;

import a14.C53916l;
import kotlin.Result;
import p172io.flutter.plugin.common.BasicMessageChannel;
import rx3.C13598b0;

/* renamed from: a10.q */
public final class C27728q<T> implements BasicMessageChannel.Reply {

    /* renamed from: a */
    public final /* synthetic */ C53916l<C13598b0> f76745a;

    public C27728q(C53916l<? super C13598b0> lVar) {
        this.f76745a = lVar;
    }

    public void reply(Object obj) {
        String str = (String) obj;
        if (str != null && str.hashCode() == 1586390661 && str.equals("HybridNavPageState.Detached")) {
            C53916l<C13598b0> lVar = this.f76745a;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }
}
