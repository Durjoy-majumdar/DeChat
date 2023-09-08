package p268x1;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import gy3.C87412m;
import rx3.C13604l;

/* renamed from: x1.r */
public final class C112011r {

    /* renamed from: a */
    public static final C13604l<Integer, Integer> f335303a = new C13604l<>(0, 0);

    /* renamed from: a */
    public static final TextDirectionHeuristic m152733a(int i) {
        if (i == 0) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
            C87412m.m108593f(textDirectionHeuristic, "LTR");
            return textDirectionHeuristic;
        } else if (i == 1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            C87412m.m108593f(textDirectionHeuristic2, "RTL");
            return textDirectionHeuristic2;
        } else if (i == 2) {
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            C87412m.m108593f(textDirectionHeuristic3, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic3;
        } else if (i == 3) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            C87412m.m108593f(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
            return textDirectionHeuristic4;
        } else if (i == 4) {
            TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.ANYRTL_LTR;
            C87412m.m108593f(textDirectionHeuristic5, "ANYRTL_LTR");
            return textDirectionHeuristic5;
        } else if (i != 5) {
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            C87412m.m108593f(textDirectionHeuristic6, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic6;
        } else {
            TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LOCALE;
            C87412m.m108593f(textDirectionHeuristic7, "LOCALE");
            return textDirectionHeuristic7;
        }
    }
}
