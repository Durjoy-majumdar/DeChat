package androidx.window.java.layout;

import d14.C45253g;
import kotlin.Metadata;
import p329d3.C86165a;
import rx3.C13598b0;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo182094d2 = {"androidx/window/java/layout/WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1", "Ld14/g;", "value", "Lrx3/b0;", "emit", "(Ljava/lang/Object;Lwx3/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo182095k = 1, mo182096mv = {1, 5, 1})
/* renamed from: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 */
public final class C103854x3e71c403 implements C45253g<T> {
    public final /* synthetic */ C86165a $consumer$inlined;

    public C103854x3e71c403(C86165a aVar) {
        this.$consumer$inlined = aVar;
    }

    public Object emit(T t, C15601d<? super C13598b0> dVar) {
        this.$consumer$inlined.accept(t);
        return C13598b0.f38549a;
    }
}
