package p874c3;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* renamed from: c3.b */
public class C67335b implements Spannable {
    public char charAt(int i) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    public String toString() {
        throw null;
    }

    /* renamed from: c3.b$a */
    public static final class C67336a {

        /* renamed from: a */
        public final TextPaint f193177a;

        /* renamed from: b */
        public final TextDirectionHeuristic f193178b;

        /* renamed from: c */
        public final int f193179c;

        /* renamed from: d */
        public final int f193180d;

        public C67336a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f193177a = textPaint;
            this.f193178b = textDirectionHeuristic;
            this.f193179c = i;
            this.f193180d = i2;
        }

        /* renamed from: a */
        public boolean mo91472a(C67336a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f193179c != aVar.f193179c || this.f193180d != aVar.f193180d)) || this.f193177a.getTextSize() != aVar.f193177a.getTextSize() || this.f193177a.getTextScaleX() != aVar.f193177a.getTextScaleX() || this.f193177a.getTextSkewX() != aVar.f193177a.getTextSkewX() || this.f193177a.getLetterSpacing() != aVar.f193177a.getLetterSpacing() || !TextUtils.equals(this.f193177a.getFontFeatureSettings(), aVar.f193177a.getFontFeatureSettings()) || this.f193177a.getFlags() != aVar.f193177a.getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f193177a.getTextLocales().equals(aVar.f193177a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f193177a.getTextLocale().equals(aVar.f193177a.getTextLocale())) {
                return false;
            }
            return this.f193177a.getTypeface() == null ? aVar.f193177a.getTypeface() == null : this.f193177a.getTypeface().equals(aVar.f193177a.getTypeface());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C67336a)) {
                return false;
            }
            C67336a aVar = (C67336a) obj;
            return mo91472a(aVar) && this.f193178b == aVar.f193178b;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Objects.hash(new Object[]{Float.valueOf(this.f193177a.getTextSize()), Float.valueOf(this.f193177a.getTextScaleX()), Float.valueOf(this.f193177a.getTextSkewX()), Float.valueOf(this.f193177a.getLetterSpacing()), Integer.valueOf(this.f193177a.getFlags()), this.f193177a.getTextLocales(), this.f193177a.getTypeface(), Boolean.valueOf(this.f193177a.isElegantTextHeight()), this.f193178b, Integer.valueOf(this.f193179c), Integer.valueOf(this.f193180d)});
            }
            return Objects.hash(new Object[]{Float.valueOf(this.f193177a.getTextSize()), Float.valueOf(this.f193177a.getTextScaleX()), Float.valueOf(this.f193177a.getTextSkewX()), Float.valueOf(this.f193177a.getLetterSpacing()), Integer.valueOf(this.f193177a.getFlags()), this.f193177a.getTextLocale(), this.f193177a.getTypeface(), Boolean.valueOf(this.f193177a.isElegantTextHeight()), this.f193178b, Integer.valueOf(this.f193179c), Integer.valueOf(this.f193180d)});
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f193177a.getTextSize());
            sb.append(", textScaleX=" + this.f193177a.getTextScaleX());
            sb.append(", textSkewX=" + this.f193177a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f193177a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f193177a.isElegantTextHeight());
            if (i >= 24) {
                sb.append(", textLocale=" + this.f193177a.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f193177a.getTextLocale());
            }
            sb.append(", typeface=" + this.f193177a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f193177a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f193178b);
            sb.append(", breakStrategy=" + this.f193179c);
            sb.append(", hyphenationFrequency=" + this.f193180d);
            sb.append("}");
            return sb.toString();
        }

        public C67336a(PrecomputedText.Params params) {
            this.f193177a = params.getTextPaint();
            this.f193178b = params.getTextDirection();
            this.f193179c = params.getBreakStrategy();
            this.f193180d = params.getHyphenationFrequency();
        }
    }
}
