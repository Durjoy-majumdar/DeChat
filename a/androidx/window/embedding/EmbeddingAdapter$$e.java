package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class EmbeddingAdapter$$e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ EmbeddingAdapter f45089a;

    /* renamed from: b */
    public final /* synthetic */ Set f45090b;

    public /* synthetic */ EmbeddingAdapter$$e(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f45089a = embeddingAdapter;
        this.f45090b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m168126translateActivityPairPredicates$lambda1(this.f45089a, this.f45090b, (Pair) obj);
    }
}
