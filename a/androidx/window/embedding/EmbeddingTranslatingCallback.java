package androidx.window.embedding;

import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.embedding.SplitInfo;
import gy3.C87412m;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo182094d2 = {"Landroidx/window/embedding/EmbeddingTranslatingCallback;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfoList", "Lrx3/b0;", "accept", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "callback", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "Landroidx/window/embedding/EmbeddingAdapter;", "adapter", "Landroidx/window/embedding/EmbeddingAdapter;", "<init>", "(Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;Landroidx/window/embedding/EmbeddingAdapter;)V", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1})
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends SplitInfo>> {
    private final EmbeddingAdapter adapter;
    private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;

    public EmbeddingTranslatingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, EmbeddingAdapter embeddingAdapter) {
        C87412m.m108594g(embeddingCallbackInterface, "callback");
        C87412m.m108594g(embeddingAdapter, "adapter");
        this.callback = embeddingCallbackInterface;
        this.adapter = embeddingAdapter;
    }

    public void accept(List<? extends SplitInfo> list) {
        C87412m.m108594g(list, "splitInfoList");
        this.callback.onSplitInfoChanged(this.adapter.translate(list));
    }
}
