package m40;

import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: m40.a */
public class C99786a {

    /* renamed from: a */
    public int f292453a = -1;

    /* renamed from: b */
    public int f292454b = -1;

    /* renamed from: c */
    public int f292455c = -1;

    /* renamed from: d */
    public TextPaint f292456d = null;

    /* renamed from: e */
    public Layout.Alignment f292457e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public TextUtils.TruncateAt f292458f = null;

    /* renamed from: g */
    public int f292459g = 51;

    /* renamed from: h */
    public int f292460h = -1;

    /* renamed from: i */
    public float f292461i = 0.0f;

    /* renamed from: j */
    public float f292462j = 1.1f;

    /* renamed from: k */
    public int f292463k = -1;

    /* renamed from: l */
    public float f292464l = -1.0f;

    /* renamed from: m */
    public int f292465m = -1;

    /* renamed from: n */
    public int f292466n = -1;

    /* renamed from: o */
    public int f292467o = -1;

    public int hashCode() {
        int i = (this.f292453a * 31) + 0 + (this.f292455c * 31);
        TextPaint textPaint = this.f292456d;
        if (textPaint != null) {
            i += textPaint.hashCode() * 31;
        }
        int hashCode = i + (this.f292457e.hashCode() * 31);
        TextUtils.TruncateAt truncateAt = this.f292458f;
        if (truncateAt != null) {
            hashCode += truncateAt.hashCode() * 31;
        }
        return ((int) (((float) (((int) (((float) ((int) (((float) (hashCode + (this.f292459g * 31) + (this.f292460h * 31))) + (this.f292461i * 31.0f)))) + (this.f292462j * 31.0f))) + 0 + (this.f292463k * 31))) + (this.f292464l * 31.0f))) + (this.f292465m * 31) + (this.f292466n * 31) + (this.f292467o * 31);
    }

    public String toString() {
        return "" + String.format("maxLines: %d ", new Object[]{Integer.valueOf(this.f292453a)}) + String.format("maxLength: %d ", new Object[]{Integer.valueOf(this.f292455c)}) + String.format("textPaint: %s ", new Object[]{this.f292456d}) + String.format("alignment: %s ", new Object[]{this.f292457e}) + String.format("ellipsize: %s ", new Object[]{this.f292458f}) + String.format("gravity: %s ", new Object[]{Integer.valueOf(this.f292459g)}) + String.format("ellipsizeWidth: %s ", new Object[]{Integer.valueOf(this.f292460h)}) + String.format("textDirection: %s ", new Object[]{null}) + String.format("spacingAdd: %s spacingMult: %s ", new Object[]{Float.valueOf(this.f292461i), Float.valueOf(this.f292462j)}) + String.format("includedPad: %b ", new Object[]{Boolean.FALSE}) + String.format("typeface: %s ", new Object[]{null}) + String.format("fontStyle: %d ", new Object[]{Integer.valueOf(this.f292463k)}) + String.format("textSize: %s ", new Object[]{Float.valueOf(this.f292464l)}) + String.format("textColor: %d", new Object[]{Integer.valueOf(this.f292465m)}) + String.format("linkColor: %d", new Object[]{Integer.valueOf(this.f292466n)}) + String.format("breakStrategy: %d", new Object[]{Integer.valueOf(this.f292467o)});
    }
}
