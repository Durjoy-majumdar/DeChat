package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, mo182094d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "primaryActivityName", "Landroid/content/ComponentName;", "secondaryActivityName", "secondaryActivityIntentAction", "", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "getSecondaryActivityIntentAction", "()Ljava/lang/String;", "getSecondaryActivityName", "equals", "", "other", "hashCode", "", "matchesActivityIntentPair", "primaryActivity", "Landroid/app/Activity;", "secondaryActivityIntent", "Landroid/content/Intent;", "matchesActivityPair", "secondaryActivity", "toString", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SplitPairFilter(android.content.ComponentName r12, android.content.ComponentName r13, java.lang.String r14) {
        /*
            r11 = this;
            java.lang.String r0 = "primaryActivityName"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "secondaryActivityName"
            gy3.C87412m.m108594g(r13, r0)
            r11.<init>()
            r11.primaryActivityName = r12
            r11.secondaryActivityName = r13
            r11.secondaryActivityIntentAction = r14
            java.lang.String r14 = r12.getPackageName()
            java.lang.String r0 = "primaryActivityName.packageName"
            gy3.C87412m.m108593f(r14, r0)
            java.lang.String r12 = r12.getClassName()
            java.lang.String r0 = "primaryActivityName.className"
            gy3.C87412m.m108593f(r12, r0)
            java.lang.String r0 = r13.getPackageName()
            java.lang.String r1 = "secondaryActivityName.packageName"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r13 = r13.getClassName()
            java.lang.String r1 = "secondaryActivityName.className"
            gy3.C87412m.m108593f(r13, r1)
            int r1 = r14.length()
            r8 = 1
            r9 = 0
            if (r1 != 0) goto L_0x0041
            r1 = 1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 != 0) goto L_0x0051
            int r1 = r0.length()
            if (r1 != 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            if (r1 != 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r1 == 0) goto L_0x0120
            int r1 = r12.length()
            if (r1 != 0) goto L_0x005c
            r1 = 1
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            if (r1 != 0) goto L_0x006c
            int r1 = r13.length()
            if (r1 != 0) goto L_0x0067
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            if (r1 != 0) goto L_0x006c
            r1 = 1
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            if (r1 == 0) goto L_0x0114
            java.lang.String r7 = "*"
            boolean r1 = z04.C112550d0.m153801u(r14, r7, r9)
            if (r1 == 0) goto L_0x008c
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.lang.String r2 = "*"
            r1 = r14
            int r1 = z04.C112550d0.m153769E(r1, r2, r3, r4, r5, r6)
            int r14 = r14.length()
            int r14 = r14 - r8
            if (r1 != r14) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r14 = 0
            goto L_0x008d
        L_0x008c:
            r14 = 1
        L_0x008d:
            java.lang.String r10 = "Wildcard in package name is only allowed at the end."
            if (r14 == 0) goto L_0x010a
            boolean r14 = z04.C112550d0.m153801u(r12, r7, r9)
            if (r14 == 0) goto L_0x00ac
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.lang.String r2 = "*"
            r1 = r12
            int r14 = z04.C112550d0.m153769E(r1, r2, r3, r4, r5, r6)
            int r12 = r12.length()
            int r12 = r12 - r8
            if (r14 != r12) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r12 = 0
            goto L_0x00ad
        L_0x00ac:
            r12 = 1
        L_0x00ad:
            java.lang.String r14 = "Wildcard in class name is only allowed at the end."
            if (r12 == 0) goto L_0x0100
            boolean r12 = z04.C112550d0.m153801u(r0, r7, r9)
            if (r12 == 0) goto L_0x00cc
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.lang.String r2 = "*"
            r1 = r0
            int r12 = z04.C112550d0.m153769E(r1, r2, r3, r4, r5, r6)
            int r0 = r0.length()
            int r0 = r0 - r8
            if (r12 != r0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r12 = 0
            goto L_0x00cd
        L_0x00cc:
            r12 = 1
        L_0x00cd:
            if (r12 == 0) goto L_0x00f6
            boolean r12 = z04.C112550d0.m153801u(r13, r7, r9)
            if (r12 == 0) goto L_0x00e9
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.lang.String r3 = "*"
            r2 = r13
            int r12 = z04.C112550d0.m153769E(r2, r3, r4, r5, r6, r7)
            int r13 = r13.length()
            int r13 = r13 - r8
            if (r12 != r13) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r8 = 0
        L_0x00e9:
            if (r8 == 0) goto L_0x00ec
            return
        L_0x00ec:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        L_0x00f6:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r10.toString()
            r12.<init>(r13)
            throw r12
        L_0x0100:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        L_0x010a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r10.toString()
            r12.<init>(r13)
            throw r12
        L_0x0114:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Activity class name must not be empty."
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0120:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Package name must not be empty"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairFilter.<init>(android.content.ComponentName, android.content.ComponentName, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        return C87412m.m108589b(this.primaryActivityName, splitPairFilter.primaryActivityName) && C87412m.m108589b(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && C87412m.m108589b(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int hashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityIntentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivityIntentPair(Activity activity, Intent intent) {
        C87412m.m108594g(activity, "primaryActivity");
        C87412m.m108594g(intent, "secondaryActivityIntent");
        ComponentName componentName = activity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(intent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || C87412m.m108589b(str, intent.getAction());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (matchesActivityIntentPair(r6, r7) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchesActivityPair(android.app.Activity r6, android.app.Activity r7) {
        /*
            r5 = this;
            java.lang.String r0 = "primaryActivity"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "secondaryActivity"
            gy3.C87412m.m108594g(r7, r0)
            androidx.window.embedding.MatcherUtils r0 = androidx.window.embedding.MatcherUtils.INSTANCE
            android.content.ComponentName r1 = r6.getComponentName()
            android.content.ComponentName r2 = r5.primaryActivityName
            boolean r1 = r0.areComponentsMatching$window_release(r1, r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0028
            android.content.ComponentName r1 = r7.getComponentName()
            android.content.ComponentName r4 = r5.secondaryActivityName
            boolean r0 = r0.areComponentsMatching$window_release(r1, r4)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            android.content.Intent r1 = r7.getIntent()
            if (r1 == 0) goto L_0x0043
            if (r0 == 0) goto L_0x0041
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r0 = "secondaryActivity.intent"
            gy3.C87412m.m108593f(r7, r0)
            boolean r6 = r5.matchesActivityIntentPair(r6, r7)
            if (r6 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r0 = r2
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairFilter.matchesActivityPair(android.app.Activity, android.app.Activity):boolean");
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + this.secondaryActivityIntentAction + '}';
    }
}
