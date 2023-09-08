package androidx.window.embedding;

import android.view.WindowMetrics;
import java.util.function.Predicate;

public final /* synthetic */ class EmbeddingAdapter$$c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ SplitRule f45087a;

    public /* synthetic */ EmbeddingAdapter$$c(SplitRule splitRule) {
        this.f45087a = splitRule;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m168129translateParentMetricsPredicate$lambda4(this.f45087a, (WindowMetrics) obj);
    }
}
