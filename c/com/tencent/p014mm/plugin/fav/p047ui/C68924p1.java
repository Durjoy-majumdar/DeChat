package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import android.text.format.DateFormat;
import com.tencent.p014mm.C0966R;
import java.util.GregorianCalendar;

/* renamed from: com.tencent.mm.plugin.fav.ui.p1 */
public class C68924p1 {
    /* renamed from: a */
    public static CharSequence m81172a(Context context, int i) {
        if (i <= 0) {
            return context.getString(C0966R.string.cr7, new Object[]{0, 0});
        }
        return context.getString(C0966R.string.cr7, new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)});
    }

    /* renamed from: b */
    public static CharSequence m81173b(Context context, long j) {
        if (j < 3600000) {
            return "";
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis = j - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis > 0 && timeInMillis <= 86400000) {
            return context.getString(C0966R.string.ezr);
        }
        long timeInMillis2 = gregorianCalendar2.getTimeInMillis() - j;
        if (timeInMillis2 > 0 && timeInMillis2 <= 86400000) {
            return context.getString(C0966R.string.f360813f00);
        }
        new GregorianCalendar().setTimeInMillis(j);
        int timeInMillis3 = (int) ((gregorianCalendar.getTimeInMillis() - j) / 86400000);
        if (timeInMillis3 < 1) {
            timeInMillis3 = 1;
        }
        if (timeInMillis3 > 30) {
            return DateFormat.format(context.getString(C0966R.string.cp7), j);
        }
        return context.getResources().getQuantityString(C0966R.plurals.f7231l, timeInMillis3, new Object[]{Integer.valueOf(timeInMillis3)});
    }
}
