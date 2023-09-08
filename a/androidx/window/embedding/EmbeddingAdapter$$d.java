package androidx.window.embedding;

import android.content.Intent;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class EmbeddingAdapter$$d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f45088a;

    public /* synthetic */ EmbeddingAdapter$$d(Set set) {
        this.f45088a = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m168128translateIntentPredicates$lambda8(this.f45088a, (Intent) obj);
    }
}
