package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import kotlin.Metadata;
import z04.C112550d0;

@Metadata(mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, mo182094d2 = {"Landroidx/window/embedding/ActivityFilter;", "", "componentName", "Landroid/content/ComponentName;", "intentAction", "", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "getComponentName", "()Landroid/content/ComponentName;", "getIntentAction", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "matchesActivity", "activity", "Landroid/app/Activity;", "matchesIntent", "intent", "Landroid/content/Intent;", "toString", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName2, String str) {
        C87412m.m108594g(componentName2, "componentName");
        this.componentName = componentName2;
        this.intentAction = str;
        String packageName = componentName2.getPackageName();
        C87412m.m108593f(packageName, "componentName.packageName");
        String className = componentName2.getClassName();
        C87412m.m108593f(className, "componentName.className");
        boolean z = true;
        if (packageName.length() > 0) {
            if (className.length() > 0) {
                if (!C112550d0.m153801u(packageName, "*", false) || C112550d0.m153769E(packageName, "*", 0, false, 6, (Object) null) == packageName.length() - 1) {
                    if (C112550d0.m153801u(className, "*", false) && C112550d0.m153769E(className, "*", 0, false, 6, (Object) null) != className.length() - 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
            }
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) obj;
        return C87412m.m108589b(this.componentName, activityFilter.componentName) && C87412m.m108589b(this.intentAction, activityFilter.intentAction);
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int hashCode = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivity(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (C87412m.m108589b(str, intent == null ? null : intent.getAction())) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(Intent intent) {
        C87412m.m108594g(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        return str == null || C87412m.m108589b(str, intent.getAction());
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + this.intentAction + ')';
    }
}
