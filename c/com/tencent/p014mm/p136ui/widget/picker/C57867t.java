package com.tencent.p014mm.p136ui.widget.picker;

import android.widget.NumberPicker;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: com.tencent.mm.ui.widget.picker.t */
public final class C57867t implements NumberPicker.Formatter {

    /* renamed from: a */
    public final StringBuilder f165545a;

    /* renamed from: b */
    public final Object[] f165546b = new Object[1];

    /* renamed from: c */
    public char f165547c;

    /* renamed from: d */
    public Formatter f165548d;

    public C57867t() {
        StringBuilder sb = new StringBuilder();
        this.f165545a = sb;
        this.f165548d = new Formatter(sb, Locale.getDefault());
        this.f165547c = '0';
    }

    public String format(int i) {
        Locale locale = Locale.getDefault();
        if (this.f165547c != '0') {
            this.f165548d = new Formatter(this.f165545a, locale);
            this.f165547c = '0';
        }
        this.f165546b[0] = Integer.valueOf(i);
        StringBuilder sb = this.f165545a;
        sb.delete(0, sb.length());
        this.f165548d.format("%02d", this.f165546b);
        return this.f165548d.toString();
    }
}
