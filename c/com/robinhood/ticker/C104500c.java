package com.robinhood.ticker;

import android.graphics.Paint;
import com.robinhood.ticker.TickerView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.robinhood.ticker.c */
public class C104500c {

    /* renamed from: a */
    public final Paint f309713a;

    /* renamed from: b */
    public final Map<Character, Float> f309714b;

    /* renamed from: c */
    public float f309715c;

    /* renamed from: d */
    public float f309716d;

    /* renamed from: e */
    public TickerView.C67446c f309717e = TickerView.C67446c.ANY;

    public C104500c(Paint paint) {
        HashMap hashMap = new HashMap(256);
        this.f309714b = hashMap;
        this.f309713a = paint;
        hashMap.clear();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        this.f309715c = f - f2;
        this.f309716d = -f2;
    }

    /* renamed from: a */
    public float mo147128a(char c) {
        if (c == 0) {
            return 0.0f;
        }
        Float f = (Float) ((HashMap) this.f309714b).get(Character.valueOf(c));
        if (f != null) {
            return f.floatValue();
        }
        float measureText = this.f309713a.measureText(Character.toString(c));
        ((HashMap) this.f309714b).put(Character.valueOf(c), Float.valueOf(measureText));
        return measureText;
    }
}
