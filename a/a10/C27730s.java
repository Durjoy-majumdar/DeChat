package a10;

import kotlin.Result;
import p172io.flutter.plugin.common.BasicMessageChannel;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: a10.s */
public final class C27730s<T> implements BasicMessageChannel.Reply {

    /* renamed from: a */
    public final /* synthetic */ C15601d<C13598b0> f76747a;

    public C27730s(C15601d<? super C13598b0> dVar) {
        this.f76747a = dVar;
    }

    public void reply(Object obj) {
        String str = (String) obj;
        if (str != null && str.hashCode() == -699785983 && str.equals("HybridNavPageState.Paused")) {
            C15601d<C13598b0> dVar = this.f76747a;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
    }
}
