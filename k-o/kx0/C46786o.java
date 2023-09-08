package kx0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.util.FrequentLimiter;
import gy3.C87412m;
import java.util.Arrays;
import java.util.GregorianCalendar;

/* renamed from: kx0.o */
public final class C46786o {

    /* renamed from: a */
    public static final C46786o f125904a = new C46786o();

    /* renamed from: a */
    public final String mo72010a(Context context, long j) {
        Context context2 = context;
        long j2 = j;
        C87412m.m108594g(context2, "context");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (j2 < 3600000) {
            return "";
        }
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        GregorianCalendar gregorianCalendar3 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        gregorianCalendar3.setTimeInMillis(j2);
        long timeInMillis = j2 - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis <= 0 || timeInMillis > 86400000) {
            long j3 = timeInMillis + 86400000;
            if (j3 <= 0 || j3 > 86400000) {
                long j4 = timeInMillis + FrequentLimiter.WEEK_MILLS;
                if (j4 <= 0 || j4 > FrequentLimiter.WEEK_MILLS) {
                    boolean isChineseAppLang = LocaleUtil.isChineseAppLang();
                    if (gregorianCalendar2.get(1) == gregorianCalendar3.get(1)) {
                        if (isChineseAppLang) {
                            String d = C72715f.m85111d(context2.getString(C0966R.string.eyh), j2 / ((long) 1000));
                            C87412m.m108593f(d, "{\n                TimeUt…ime / 1000)\n            }");
                            return d;
                        }
                        String format = String.format("%s %d", Arrays.copyOf(new Object[]{mo72011b(gregorianCalendar3.get(2)), Integer.valueOf(gregorianCalendar3.get(5))}, 2));
                        C87412m.m108593f(format, "format(format, *args)");
                        return format;
                    } else if (isChineseAppLang) {
                        String d2 = C72715f.m85111d(context2.getString(C0966R.string.f360810ez1), j2 / ((long) 1000));
                        C87412m.m108593f(d2, "{\n            TimeUtil.f…estTime / 1000)\n        }");
                        return d2;
                    } else {
                        String format2 = String.format("%s %d, %d", Arrays.copyOf(new Object[]{mo72011b(gregorianCalendar3.get(2)), Integer.valueOf(gregorianCalendar3.get(5)), Integer.valueOf(gregorianCalendar3.get(1))}, 3));
                        C87412m.m108593f(format2, "format(format, *args)");
                        return format2;
                    }
                } else {
                    int i = 7;
                    int i2 = gregorianCalendar3.get(7) - 1;
                    if (i2 != 0) {
                        i = i2;
                    }
                    String str = MMApplicationContext.getContext().getResources().getStringArray(C0966R.array.f2602aq)[i - 1];
                    C87412m.m108593f(str, "MMApplicationContext.get…ray.time_day)[arrayIndex]");
                    return str;
                }
            } else {
                String string = context2.getString(C0966R.string.f360813f00);
                C87412m.m108593f(string, "context.getString(com.te…string.fmt_pre_yesterday)");
                return string;
            }
        } else {
            String string2 = context2.getString(C0966R.string.ezr);
            C87412m.m108593f(string2, "context.getString(com.te….R.string.fmt_pre_nowday)");
            return string2;
        }
    }

    /* renamed from: b */
    public final String mo72011b(int i) {
        switch (i) {
            case 0:
                return "Jan";
            case 1:
                return "Feb";
            case 2:
                return "Mar";
            case 3:
                return "Apr";
            case 4:
                return "May";
            case 5:
                return "Jun";
            case 6:
                return "Jul";
            case 7:
                return "Aug";
            case 8:
                return "Sep";
            case 9:
                return "Oct";
            case 10:
                return "Nov";
            case 11:
                return "Dec";
            default:
                return "UNDECIMBER";
        }
    }
}
