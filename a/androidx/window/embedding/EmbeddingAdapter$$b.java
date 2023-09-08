package androidx.window.embedding;

import android.app.Activity;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class EmbeddingAdapter$$b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f45086a;

    public /* synthetic */ EmbeddingAdapter$$b(Set set) {
        this.f45086a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m168127translateActivityPredicates$lambda6(this.f45086a, (Activity) obj);
    }
}
