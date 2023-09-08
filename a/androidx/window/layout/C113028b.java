package androidx.window.layout;

import androidx.window.layout.WindowMetricsCalculator;

/* renamed from: androidx.window.layout.b */
public final /* synthetic */ class C113028b {
    static {
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
    }

    /* renamed from: a */
    public static WindowMetricsCalculator m154648a() {
        return WindowMetricsCalculator.Companion.getOrCreate();
    }

    /* renamed from: b */
    public static void m154649b(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        WindowMetricsCalculator.Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    /* renamed from: c */
    public static void m154650c() {
        WindowMetricsCalculator.Companion.reset();
    }
}
