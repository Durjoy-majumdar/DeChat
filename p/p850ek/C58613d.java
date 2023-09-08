package p850ek;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.text.TextPaint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ek.d */
public class C58613d {

    /* renamed from: a */
    public static final TextPaint f167816a = new TextPaint();

    /* renamed from: b */
    public static final Map<Float, Float> f167817b = new HashMap();

    /* renamed from: c */
    public static Paint f167818c;

    /* renamed from: d */
    public static int f167819d;

    static {
        new Rect();
        new HashMap();
        new HashMap();
        new Paint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* renamed from: a */
    public static float m68063a(float f) {
        TextPaint textPaint = f167816a;
        textPaint.setTextSize(f);
        Map<Float, Float> map = f167817b;
        Float f2 = (Float) ((HashMap) map).get(Float.valueOf(f));
        if (f2 == null) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            f2 = Float.valueOf((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading);
            ((HashMap) map).put(Float.valueOf(f), f2);
        }
        return f2.floatValue();
    }
}
