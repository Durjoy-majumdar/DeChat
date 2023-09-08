package androidx.window.embedding;

import android.content.Intent;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110818d0;

@Metadata(mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0002\b\u0019R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, mo182094d2 = {"Landroidx/window/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitRule;", "filters", "", "Landroidx/window/embedding/ActivityFilter;", "placeholderIntent", "Landroid/content/Intent;", "minWidth", "", "minSmallestWidth", "splitRatio", "", "layoutDirection", "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "getFilters", "()Ljava/util/Set;", "getPlaceholderIntent", "()Landroid/content/Intent;", "equals", "", "other", "", "hashCode", "plus", "filter", "plus$window_release", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final Intent placeholderIntent;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i, int i2, float f, int i3, int i4, C8480h hVar) {
        this(set, intent, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0.5f : f, (i4 & 32) != 0 ? 3 : i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        return C87412m.m108589b(this.filters, splitPlaceholderRule.filters) && C87412m.m108589b(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter activityFilter) {
        C87412m.m108594g(activityFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(activityFilter);
        return new SplitPlaceholderRule(C110818d0.m150904D0(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(Set<ActivityFilter> set, Intent intent, int i, int i2, float f, int i3) {
        super(i, i2, f, i3);
        C87412m.m108594g(set, "filters");
        C87412m.m108594g(intent, "placeholderIntent");
        this.placeholderIntent = intent;
        this.filters = C110818d0.m150904D0(set);
    }
}
