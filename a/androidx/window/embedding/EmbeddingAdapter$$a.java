package androidx.window.embedding;

import android.util.Pair;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class EmbeddingAdapter$$a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ EmbeddingAdapter f45084a;

    /* renamed from: b */
    public final /* synthetic */ Set f45085b;

    public /* synthetic */ EmbeddingAdapter$$a(EmbeddingAdapter embeddingAdapter, Set set) {
        this.f45084a = embeddingAdapter;
        this.f45085b = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m168125translateActivityIntentPredicates$lambda3(this.f45084a, this.f45085b, (Pair) obj);
    }
}
