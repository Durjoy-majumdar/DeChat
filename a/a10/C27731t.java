package a10;

import kotlin.Result;
import p172io.flutter.plugin.common.BasicMessageChannel;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: a10.t */
public final class C27731t<T> implements BasicMessageChannel.Reply {

    /* renamed from: a */
    public final /* synthetic */ C15601d<C13598b0> f76748a;

    public C27731t(C15601d<? super C13598b0> dVar) {
        this.f76748a = dVar;
    }

    public void reply(Object obj) {
        String str = (String) obj;
        if (str != null && str.hashCode() == 1669215332 && str.equals("HybridNavPageState.Resumed")) {
            C15601d<C13598b0> dVar = this.f76748a;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }
}
