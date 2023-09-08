package androidx.core.widget;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;
import p874c3.C67335b;

/* renamed from: androidx.core.widget.h */
public final class C103733h {

    /* renamed from: androidx.core.widget.h$a */
    public static class C103734a implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f306427a;

        /* renamed from: b */
        public final TextView f306428b;

        /* renamed from: c */
        public Class<?> f306429c;

        /* renamed from: d */
        public Method f306430d;

        /* renamed from: e */
        public boolean f306431e;

        /* renamed from: f */
        public boolean f306432f = false;

        public C103734a(ActionMode.Callback callback, TextView textView) {
            this.f306427a = callback;
            this.f306428b = textView;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f306427a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f306427a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f306427a.onDestroyActionMode(actionMode);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x009f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
            /*
                r12 = this;
                android.widget.TextView r0 = r12.f306428b
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r12.f306432f
                r3 = 0
                r4 = 1
                java.lang.String r5 = "removeItemAt"
                if (r2 != 0) goto L_0x0032
                r12.f306432f = r4
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f306429c = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r6[r3] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f306430d = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f306431e = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                goto L_0x0032
            L_0x002b:
                r2 = 0
                r12.f306429c = r2
                r12.f306430d = r2
                r12.f306431e = r3
            L_0x0032:
                boolean r2 = r12.f306431e     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r2 == 0) goto L_0x0041
                java.lang.Class<?> r2 = r12.f306429c     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                boolean r2 = r2.isInstance(r14)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r2 == 0) goto L_0x0041
                java.lang.reflect.Method r2 = r12.f306430d     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                goto L_0x004f
            L_0x0041:
                java.lang.Class r2 = r14.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r6[r3] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
            L_0x004f:
                int r5 = r14.size()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                int r5 = r5 - r4
            L_0x0054:
                java.lang.String r6 = "android.intent.action.PROCESS_TEXT"
                if (r5 < 0) goto L_0x007e
                android.view.MenuItem r7 = r14.getItem(r5)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                android.content.Intent r8 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r8 == 0) goto L_0x007b
                android.content.Intent r7 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.String r7 = r7.getAction()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                boolean r6 = r6.equals(r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r6 == 0) goto L_0x007b
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r6[r3] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r2.invoke(r14, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
            L_0x007b:
                int r5 = r5 + -1
                goto L_0x0054
            L_0x007e:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                boolean r5 = r0 instanceof android.app.Activity
                java.lang.String r7 = "text/plain"
                if (r5 != 0) goto L_0x008a
                goto L_0x00d5
            L_0x008a:
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                android.content.Intent r5 = r5.setAction(r6)
                android.content.Intent r5 = r5.setType(r7)
                java.util.List r5 = r1.queryIntentActivities(r5, r3)
                java.util.Iterator r5 = r5.iterator()
            L_0x009f:
                boolean r8 = r5.hasNext()
                if (r8 == 0) goto L_0x00d5
                java.lang.Object r8 = r5.next()
                android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
                java.lang.String r9 = r0.getPackageName()
                android.content.pm.ActivityInfo r10 = r8.activityInfo
                java.lang.String r10 = r10.packageName
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x00ba
                goto L_0x00ce
            L_0x00ba:
                android.content.pm.ActivityInfo r9 = r8.activityInfo
                boolean r10 = r9.exported
                if (r10 != 0) goto L_0x00c1
                goto L_0x00cc
            L_0x00c1:
                java.lang.String r9 = r9.permission
                if (r9 == 0) goto L_0x00ce
                int r9 = r0.checkSelfPermission(r9)
                if (r9 != 0) goto L_0x00cc
                goto L_0x00ce
            L_0x00cc:
                r9 = 0
                goto L_0x00cf
            L_0x00ce:
                r9 = 1
            L_0x00cf:
                if (r9 == 0) goto L_0x009f
                r2.add(r8)
                goto L_0x009f
            L_0x00d5:
                r0 = 0
            L_0x00d6:
                int r5 = r2.size()
                if (r0 >= r5) goto L_0x0129
                java.lang.Object r5 = r2.get(r0)
                android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
                int r8 = r0 + 100
                java.lang.CharSequence r9 = r5.loadLabel(r1)
                android.view.MenuItem r8 = r14.add(r3, r3, r8, r9)
                android.widget.TextView r9 = r12.f306428b
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                android.content.Intent r10 = r10.setAction(r6)
                android.content.Intent r10 = r10.setType(r7)
                boolean r11 = r9 instanceof android.text.Editable
                if (r11 == 0) goto L_0x010d
                boolean r11 = r9.onCheckIsTextEditor()
                if (r11 == 0) goto L_0x010d
                boolean r9 = r9.isEnabled()
                if (r9 == 0) goto L_0x010d
                r9 = 1
                goto L_0x010e
            L_0x010d:
                r9 = 0
            L_0x010e:
                r9 = r9 ^ r4
                java.lang.String r11 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r9 = r10.putExtra(r11, r9)
                android.content.pm.ActivityInfo r5 = r5.activityInfo
                java.lang.String r10 = r5.packageName
                java.lang.String r5 = r5.name
                android.content.Intent r5 = r9.setClassName(r10, r5)
                android.view.MenuItem r5 = r8.setIntent(r5)
                r5.setShowAsAction(r4)
                int r0 = r0 + 1
                goto L_0x00d6
            L_0x0129:
                android.view.ActionMode$Callback r0 = r12.f306427a
                boolean r13 = r0.onPrepareActionMode(r13, r14)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C103733h.C103734a.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* renamed from: a */
    public static C67335b.C67336a m138104a(TextView textView) {
        int i;
        int i2;
        TextDirectionHeuristic textDirectionHeuristic;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new C67335b.C67336a(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 1;
            i = 1;
        } else {
            i2 = 0;
            i = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i3 >= 23) {
            i2 = textView.getBreakStrategy();
            i = textView.getHyphenationFrequency();
        }
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i3 < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (!z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C67335b.C67336a(textPaint, textDirectionHeuristic, i2, i);
    }

    /* renamed from: b */
    public static void m138105b(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (textView instanceof C103725b) {
            ((C103725b) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    /* renamed from: c */
    public static void m138106c(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        } else if (textView instanceof C103725b) {
            ((C103725b) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: d */
    public static void m138107d(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
        } else {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
            }
        }
    }

    /* renamed from: e */
    public static void m138108e(TextView textView, int i) {
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public static void m138109f(TextView textView, C67335b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            bVar.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        C67335b.C67336a a = m138104a(textView);
        bVar.getClass();
        if (a.mo91472a((C67335b.C67336a) null)) {
            textView.setText(bVar);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    /* renamed from: g */
    public static void m138110g(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: h */
    public static void m138111h(TextView textView, C67335b.C67336a aVar) {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f193178b;
        int i2 = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i2 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i2 = 7;
            }
        }
        textView.setTextDirection(i2);
        if (i < 23) {
            float textScaleX = aVar.f193177a.getTextScaleX();
            textView.getPaint().set(aVar.f193177a);
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.f193177a);
        textView.setBreakStrategy(aVar.f193179c);
        textView.setHyphenationFrequency(aVar.f193180d);
    }

    /* renamed from: i */
    public static ActionMode.Callback m138112i(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C103734a) || callback == null) ? callback : new C103734a(callback, textView);
    }
}
