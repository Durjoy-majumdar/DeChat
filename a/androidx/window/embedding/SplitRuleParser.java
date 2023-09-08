package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.C16683R;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import sx3.C64187h0;
import z04.C112550d0;

@Metadata(mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J%\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ \u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¨\u0006\u001f"}, mo182094d2 = {"Landroidx/window/embedding/SplitRuleParser;", "", "()V", "buildClassName", "Landroid/content/ComponentName;", "pkg", "", "clsSeq", "", "parseActivityFilter", "Landroidx/window/embedding/ActivityFilter;", "context", "Landroid/content/Context;", "parser", "Landroid/content/res/XmlResourceParser;", "parseSplitActivityRule", "Landroidx/window/embedding/ActivityRule;", "parseSplitPairFilter", "Landroidx/window/embedding/SplitPairFilter;", "parseSplitPairRule", "Landroidx/window/embedding/SplitPairRule;", "parseSplitPlaceholderRule", "Landroidx/window/embedding/SplitPlaceholderRule;", "parseSplitRules", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRuleResourceId", "", "parseSplitRules$window_release", "parseSplitXml", "splitResourceId", "window_release"}, mo182095k = 1, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public final class SplitRuleParser {
    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                String obj = charSequence.toString();
                if (obj.charAt(0) == '.') {
                    return new ComponentName(str, C87412m.m108600m(str, obj));
                }
                int D = C112550d0.m153768D(obj, XVFSFile.SEPARATOR_CHAR, 0, false, 6, (Object) null);
                if (D > 0) {
                    str = obj.substring(0, D);
                    C87412m.m108593f(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    obj = obj.substring(D + 1);
                    C87412m.m108593f(obj, "(this as java.lang.String).substring(startIndex)");
                }
                if (C87412m.m108589b(obj, "*") || C112550d0.m153768D(obj, '.', 0, false, 6, (Object) null) >= 0) {
                    return new ComponentName(str, obj);
                }
                return new ComponentName(str, str + '.' + obj);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C16683R.styleable.ActivityFilter, 0, 0);
        String string = obtainStyledAttributes.getString(C16683R.styleable.ActivityFilter_activityName);
        String string2 = obtainStyledAttributes.getString(C16683R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        C87412m.m108593f(packageName, "packageName");
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseSplitActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        return new ActivityRule(C64187h0.f181908d, context.getTheme().obtainStyledAttributes(xmlResourceParser, C16683R.styleable.ActivityRule, 0, 0).getBoolean(C16683R.styleable.ActivityRule_alwaysExpand, false));
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C16683R.styleable.SplitPairFilter, 0, 0);
        String string = obtainStyledAttributes.getString(C16683R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = obtainStyledAttributes.getString(C16683R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = obtainStyledAttributes.getString(C16683R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        C87412m.m108593f(packageName, "packageName");
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C16683R.styleable.SplitPairRule, 0, 0);
        float f = obtainStyledAttributes.getFloat(C16683R.styleable.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(C16683R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C16683R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i = obtainStyledAttributes.getInt(C16683R.styleable.SplitPairRule_splitLayoutDirection, 3);
        return new SplitPairRule(C64187h0.f181908d, obtainStyledAttributes.getBoolean(C16683R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), obtainStyledAttributes.getBoolean(C16683R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), obtainStyledAttributes.getBoolean(C16683R.styleable.SplitPairRule_clearTop, false), dimension, dimension2, f, i);
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C16683R.styleable.SplitPlaceholderRule, 0, 0);
        String string = obtainStyledAttributes.getString(C16683R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f = obtainStyledAttributes.getFloat(C16683R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(C16683R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C16683R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i = obtainStyledAttributes.getInt(C16683R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        C87412m.m108593f(packageName, "packageName");
        ComponentName buildClassName = buildClassName(packageName, string);
        C64187h0 h0Var = C64187h0.f181908d;
        Intent component = new Intent().setComponent(buildClassName);
        C87412m.m108593f(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new SplitPlaceholderRule(h0Var, component, dimension, dimension2, f, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
        r5 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set<androidx.window.embedding.EmbeddingRule> parseSplitXml(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            r1 = 0
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)     // Catch:{ NotFoundException -> 0x00f3 }
            java.lang.String r0 = "resources.getXml(splitResourceId)"
            gy3.C87412m.m108593f(r10, r0)     // Catch:{ NotFoundException -> 0x00f3 }
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r2 = r10.getDepth()
            int r3 = r10.next()
            r4 = r1
            r5 = r4
            r6 = r5
        L_0x001e:
            r7 = 1
            if (r3 == r7) goto L_0x00f2
            r7 = 3
            if (r3 != r7) goto L_0x002a
            int r3 = r10.getDepth()
            if (r3 <= r2) goto L_0x00f2
        L_0x002a:
            int r3 = r10.getEventType()
            r7 = 2
            if (r3 != r7) goto L_0x00ec
            java.lang.String r3 = r10.getName()
            java.lang.String r7 = "split-config"
            boolean r3 = gy3.C87412m.m108589b(r7, r3)
            if (r3 == 0) goto L_0x0040
            goto L_0x00ec
        L_0x0040:
            java.lang.String r3 = r10.getName()
            if (r3 == 0) goto L_0x00e6
            int r7 = r3.hashCode()
            switch(r7) {
                case 511422343: goto L_0x00b1;
                case 520447504: goto L_0x009d;
                case 1579230604: goto L_0x007b;
                case 1793077963: goto L_0x0065;
                case 2050988213: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x00e6
        L_0x004f:
            java.lang.String r7 = "SplitPlaceholderRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0059
            goto L_0x00e6
        L_0x0059:
            androidx.window.embedding.SplitPlaceholderRule r3 = r8.parseSplitPlaceholderRule(r9, r10)
            r0.add(r3)
            r4 = r1
            r5 = r4
        L_0x0062:
            r6 = r3
            goto L_0x00e6
        L_0x0065:
            java.lang.String r7 = "ActivityRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x006f
            goto L_0x00e6
        L_0x006f:
            androidx.window.embedding.ActivityRule r3 = r8.parseSplitActivityRule(r9, r10)
            r0.add(r3)
            r5 = r1
            r6 = r5
        L_0x0078:
            r4 = r3
            goto L_0x00e6
        L_0x007b:
            java.lang.String r7 = "SplitPairFilter"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0084
            goto L_0x00e6
        L_0x0084:
            if (r5 == 0) goto L_0x0095
            androidx.window.embedding.SplitPairFilter r3 = r8.parseSplitPairFilter(r9, r10)
            r0.remove(r5)
            androidx.window.embedding.SplitPairRule r3 = r5.plus$window_release(r3)
            r0.add(r3)
            goto L_0x00af
        L_0x0095:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Found orphaned SplitPairFilter outside of SplitPairRule"
            r9.<init>(r10)
            throw r9
        L_0x009d:
            java.lang.String r7 = "SplitPairRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x00a6
            goto L_0x00e6
        L_0x00a6:
            androidx.window.embedding.SplitPairRule r3 = r8.parseSplitPairRule(r9, r10)
            r0.add(r3)
            r4 = r1
            r6 = r4
        L_0x00af:
            r5 = r3
            goto L_0x00e6
        L_0x00b1:
            java.lang.String r7 = "ActivityFilter"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x00ba
            goto L_0x00e6
        L_0x00ba:
            if (r4 != 0) goto L_0x00c7
            if (r6 == 0) goto L_0x00bf
            goto L_0x00c7
        L_0x00bf:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Found orphaned ActivityFilter"
            r9.<init>(r10)
            throw r9
        L_0x00c7:
            androidx.window.embedding.ActivityFilter r3 = r8.parseActivityFilter(r9, r10)
            if (r4 == 0) goto L_0x00d8
            r0.remove(r4)
            androidx.window.embedding.ActivityRule r3 = r4.plus$window_release(r3)
            r0.add(r3)
            goto L_0x0078
        L_0x00d8:
            if (r6 == 0) goto L_0x00e6
            r0.remove(r6)
            androidx.window.embedding.SplitPlaceholderRule r3 = r6.plus$window_release(r3)
            r0.add(r3)
            goto L_0x0062
        L_0x00e6:
            int r3 = r10.next()
            goto L_0x001e
        L_0x00ec:
            int r3 = r10.next()
            goto L_0x001e
        L_0x00f2:
            return r0
        L_0x00f3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitRuleParser.parseSplitXml(android.content.Context, int):java.util.Set");
    }

    public final Set<EmbeddingRule> parseSplitRules$window_release(Context context, int i) {
        C87412m.m108594g(context, "context");
        return parseSplitXml(context, i);
    }
}
