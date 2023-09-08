package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import sx3.C110818d0;
import sx3.C36907w;

@Metadata(mo182093d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tJ(\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0007J(\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0007J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0007J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0007J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J*\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u001f0\u000fH\u0002¢\u0006\u0002\u0010 J*\u0010!\u001a\u0002H\u001f\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u001f0\u000fH\u0002¢\u0006\u0002\u0010 ¨\u0006\""}, mo182094d2 = {"Landroidx/window/embedding/EmbeddingAdapter;", "", "()V", "translate", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Landroidx/window/extensions/embedding/SplitInfo;", "", "splitInfoList", "", "Landroidx/window/extensions/embedding/EmbeddingRule;", "rules", "Landroidx/window/embedding/EmbeddingRule;", "translateActivityIntentPredicates", "Ljava/util/function/Predicate;", "Landroid/util/Pair;", "Landroid/app/Activity;", "Landroid/content/Intent;", "splitPairFilters", "Landroidx/window/embedding/SplitPairFilter;", "translateActivityPairPredicates", "translateActivityPredicates", "activityFilters", "Landroidx/window/embedding/ActivityFilter;", "translateIntentPredicates", "translateParentMetricsPredicate", "Landroid/view/WindowMetrics;", "splitRule", "Landroidx/window/embedding/SplitRule;", "component1", "F", "S", "(Landroid/util/Pair;)Ljava/lang/Object;", "component2", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class EmbeddingAdapter {
    private final <F, S> F component1(Pair<F, S> pair) {
        C87412m.m108594g(pair, "<this>");
        return pair.first;
    }

    private final <F, S> S component2(Pair<F, S> pair) {
        C87412m.m108594g(pair, "<this>");
        return pair.second;
    }

    private final SplitInfo translate(SplitInfo splitInfo) {
        boolean z;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        C87412m.m108593f(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z2 = false;
        try {
            z = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z = false;
        }
        List activities = primaryActivityStack.getActivities();
        C87412m.m108593f(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, z);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        C87412m.m108593f(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        C87412m.m108593f(activities2, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack, new ActivityStack(activities2, z2), splitInfo.getSplitRatio());
    }

    /* access modifiers changed from: private */
    /* renamed from: translateActivityIntentPredicates$lambda-3  reason: not valid java name */
    public static final boolean m168125translateActivityIntentPredicates$lambda3(EmbeddingAdapter embeddingAdapter, Set set, Pair pair) {
        C87412m.m108594g(embeddingAdapter, "this$0");
        C87412m.m108594g(set, "$splitPairFilters");
        C87412m.m108593f(pair, "(first, second)");
        Activity activity = (Activity) embeddingAdapter.component1(pair);
        Intent intent = (Intent) embeddingAdapter.component2(pair);
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((SplitPairFilter) it.next()).matchesActivityIntentPair(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: translateActivityPairPredicates$lambda-1  reason: not valid java name */
    public static final boolean m168126translateActivityPairPredicates$lambda1(EmbeddingAdapter embeddingAdapter, Set set, Pair pair) {
        C87412m.m108594g(embeddingAdapter, "this$0");
        C87412m.m108594g(set, "$splitPairFilters");
        C87412m.m108593f(pair, "(first, second)");
        Activity activity = (Activity) embeddingAdapter.component1(pair);
        Activity activity2 = (Activity) embeddingAdapter.component2(pair);
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((SplitPairFilter) it.next()).matchesActivityPair(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: translateActivityPredicates$lambda-6  reason: not valid java name */
    public static final boolean m168127translateActivityPredicates$lambda6(Set set, Activity activity) {
        C87412m.m108594g(set, "$activityFilters");
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C87412m.m108593f(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (((ActivityFilter) it.next()).matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: translateIntentPredicates$lambda-8  reason: not valid java name */
    public static final boolean m168128translateIntentPredicates$lambda8(Set set, Intent intent) {
        C87412m.m108594g(set, "$activityFilters");
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C87412m.m108593f(intent, "intent");
            if (((ActivityFilter) it.next()).matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: translateParentMetricsPredicate$lambda-4  reason: not valid java name */
    public static final boolean m168129translateParentMetricsPredicate$lambda4(SplitRule splitRule, WindowMetrics windowMetrics) {
        C87412m.m108594g(splitRule, "$splitRule");
        C87412m.m108593f(windowMetrics, "windowMetrics");
        return splitRule.checkParentMetrics(windowMetrics);
    }

    public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(Set<SplitPairFilter> set) {
        C87412m.m108594g(set, "splitPairFilters");
        return new EmbeddingAdapter$$a(this, set);
    }

    public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(Set<SplitPairFilter> set) {
        C87412m.m108594g(set, "splitPairFilters");
        return new EmbeddingAdapter$$e(this, set);
    }

    public final Predicate<Activity> translateActivityPredicates(Set<ActivityFilter> set) {
        C87412m.m108594g(set, "activityFilters");
        return new EmbeddingAdapter$$b(set);
    }

    public final Predicate<Intent> translateIntentPredicates(Set<ActivityFilter> set) {
        C87412m.m108594g(set, "activityFilters");
        return new EmbeddingAdapter$$d(set);
    }

    public final Predicate<WindowMetrics> translateParentMetricsPredicate(SplitRule splitRule) {
        C87412m.m108594g(splitRule, "splitRule");
        return new EmbeddingAdapter$$c(splitRule);
    }

    public final List<SplitInfo> translate(List<? extends SplitInfo> list) {
        C87412m.m108594g(list, "splitInfoList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (SplitInfo translate : list) {
            arrayList.add(translate(translate));
        }
        return arrayList;
    }

    public final Set<EmbeddingRule> translate(Set<? extends EmbeddingRule> set) {
        SplitPairRule splitPairRule;
        C87412m.m108594g(set, "rules");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(set, 10));
        for (EmbeddingRule embeddingRule : set) {
            if (embeddingRule instanceof SplitPairRule) {
                SplitPairRule splitPairRule2 = (SplitPairRule) embeddingRule;
                splitPairRule = new SplitPairRule.Builder(translateActivityPairPredicates(splitPairRule2.getFilters()), translateActivityIntentPredicates(splitPairRule2.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPairRule2.getSplitRatio()).setLayoutDirection(splitPairRule2.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(splitPairRule2.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(splitPairRule2.getFinishSecondaryWithPrimary()).setShouldClearTop(splitPairRule2.getClearTop()).build();
                C87412m.m108593f(splitPairRule, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) embeddingRule;
                splitPairRule = new SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), translateActivityPredicates(splitPlaceholderRule.getFilters()), translateIntentPredicates(splitPlaceholderRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPlaceholderRule.getSplitRatio()).setLayoutDirection(splitPlaceholderRule.getLayoutDirection()).build();
                C87412m.m108593f(splitPairRule, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (embeddingRule instanceof ActivityRule) {
                ActivityRule activityRule = (ActivityRule) embeddingRule;
                splitPairRule = new ActivityRule.Builder(translateActivityPredicates(activityRule.getFilters()), translateIntentPredicates(activityRule.getFilters())).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
                C87412m.m108593f(splitPairRule, "ActivityRuleBuilder(\n   …                 .build()");
            } else {
                throw new IllegalArgumentException("Unsupported rule type");
            }
            arrayList.add((EmbeddingRule) splitPairRule);
        }
        return C110818d0.m150904D0(arrayList);
    }
}
