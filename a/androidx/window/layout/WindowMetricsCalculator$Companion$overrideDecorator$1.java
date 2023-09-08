package androidx.window.layout;

import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182095k = 3, mo182096mv = {1, 5, 1}, mo182098xi = 48)
public /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends C24565l implements C32226l<WindowMetricsCalculator, WindowMetricsCalculator> {
    public WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        C87412m.m108594g(windowMetricsCalculator, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(windowMetricsCalculator);
    }
}
