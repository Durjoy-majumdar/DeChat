package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import kotlin.Metadata;
import z04.C112550d0;
import z04.C112551y;

@Metadata(mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u001f\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo182094d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "()V", "sDebugMatchers", "", "sMatchersTag", "", "areActivityOrIntentComponentsMatching", "activity", "Landroid/app/Activity;", "ruleComponent", "Landroid/content/ComponentName;", "areActivityOrIntentComponentsMatching$window_release", "areComponentsMatching", "activityComponent", "areComponentsMatching$window_release", "wildcardMatch", "name", "pattern", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String str, String str2) {
        if (!C112550d0.m153803w(str2, "*", false, 2, (Object) null)) {
            return false;
        }
        if (C87412m.m108589b(str2, "*")) {
            return true;
        }
        String str3 = str2;
        if (C112550d0.m153769E(str3, "*", 0, false, 6, (Object) null) == C112550d0.m153772H(str3, "*", 0, false, 6, (Object) null) && C112551y.m153808h(str2, "*", false, 2, (Object) null)) {
            String substring = str2.substring(0, str2.length() - 1);
            C87412m.m108593f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return C112551y.m153819s(str, substring, false);
        }
        throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName componentName) {
        ComponentName component;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(componentName, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), componentName)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, componentName);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean areComponentsMatching$window_release(android.content.ComponentName r6, android.content.ComponentName r7) {
        /*
            r5 = this;
            java.lang.String r0 = "ruleComponent"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L_0x0022
            java.lang.String r6 = r7.getPackageName()
            boolean r6 = gy3.C87412m.m108589b(r6, r0)
            if (r6 == 0) goto L_0x0020
            java.lang.String r6 = r7.getClassName()
            boolean r6 = gy3.C87412m.m108589b(r6, r0)
            if (r6 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            return r1
        L_0x0022:
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "activityComponent.toString()"
            gy3.C87412m.m108593f(r3, r4)
            boolean r0 = z04.C112550d0.m153801u(r3, r0, r2)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = r7.getPackageName()
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            gy3.C87412m.m108593f(r0, r3)
            java.lang.String r3 = r7.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            gy3.C87412m.m108593f(r3, r4)
            boolean r0 = r5.wildcardMatch(r0, r3)
            if (r0 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = 0
            goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            java.lang.String r3 = r6.getClassName()
            java.lang.String r4 = r7.getClassName()
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 != 0) goto L_0x0085
            java.lang.String r6 = r6.getClassName()
            java.lang.String r3 = "activityComponent.className"
            gy3.C87412m.m108593f(r6, r3)
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            gy3.C87412m.m108593f(r7, r3)
            boolean r6 = r5.wildcardMatch(r6, r7)
            if (r6 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r6 = 0
            goto L_0x0086
        L_0x0085:
            r6 = 1
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            if (r6 == 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            return r1
        L_0x008d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Wildcard can only be part of the rule."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.MatcherUtils.areComponentsMatching$window_release(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
