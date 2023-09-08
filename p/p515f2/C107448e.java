package p515f2;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import com.google.android.gms.common.internal.Constants;
import gy3.C87412m;
import iy3.C60641c;
import p436a1.C103272w;
import p436a1.C103276y;
import p486d2.C106971a;
import p486d2.C106974e;
import p486d2.C106975h;
import p486d2.C31047d;
import p560i2.C108322d;
import p560i2.C33184p;
import p560i2.C33186r;

/* renamed from: f2.e */
public final class C107448e {
    /* renamed from: a */
    public static final float m145531a(long j, float f, C108322d dVar) {
        long b = C33184p.m39969b(j);
        if (C33186r.m39977a(b, 4294967296L)) {
            return dVar.mo143033O(j);
        }
        if (C33186r.m39977a(b, 8589934592L)) {
            return C33184p.m39970c(j) * f;
        }
        return Float.NaN;
    }

    /* renamed from: b */
    public static final void m145532b(Spannable spannable, long j, int i, int i2) {
        C87412m.m108594g(spannable, "$this$setBackground");
        int i3 = C103272w.f304516h;
        if (j != C103272w.f304515g) {
            m145536f(spannable, new BackgroundColorSpan(C103276y.m136796g(j)), i, i2);
        }
    }

    /* renamed from: c */
    public static final void m145533c(Spannable spannable, long j, int i, int i2) {
        C87412m.m108594g(spannable, "$this$setColor");
        int i3 = C103272w.f304516h;
        if (j != C103272w.f304515g) {
            m145536f(spannable, new ForegroundColorSpan(C103276y.m136796g(j)), i, i2);
        }
    }

    /* renamed from: d */
    public static final void m145534d(Spannable spannable, long j, C108322d dVar, int i, int i2) {
        C87412m.m108594g(spannable, "$this$setFontSize");
        C87412m.m108594g(dVar, Constants.PARAM_DENSITY);
        long b = C33184p.m39969b(j);
        if (C33186r.m39977a(b, 4294967296L)) {
            m145536f(spannable, new AbsoluteSizeSpan(C60641c.m70921b(dVar.mo143033O(j)), false), i, i2);
        } else if (C33186r.m39977a(b, 8589934592L)) {
            m145536f(spannable, new RelativeSizeSpan(C33184p.m39970c(j)), i, i2);
        }
    }

    /* renamed from: e */
    public static final void m145535e(Spannable spannable, C106974e eVar, int i, int i2) {
        Object obj;
        C87412m.m108594g(spannable, "<this>");
        if (eVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                obj = C107446a.f321465a.mo157833a(eVar);
            } else {
                C31047d dVar = eVar.isEmpty() ? new C31047d(C106975h.f320207a.mo57948a().get(0)) : eVar.f320205d.get(0);
                C87412m.m108594g(dVar, "<this>");
                obj = new LocaleSpan(((C106971a) dVar.f83288a).f320204a);
            }
            m145536f(spannable, obj, i, i2);
        }
    }

    /* renamed from: f */
    public static final void m145536f(Spannable spannable, Object obj, int i, int i2) {
        C87412m.m108594g(spannable, "<this>");
        C87412m.m108594g(obj, "span");
        spannable.setSpan(obj, i, i2, 33);
    }
}
