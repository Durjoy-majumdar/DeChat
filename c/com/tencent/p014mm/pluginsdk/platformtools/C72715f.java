package com.tencent.p014mm.pluginsdk.platformtools;

import android.content.Context;
import android.text.format.Time;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.FrequentLimiter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: com.tencent.mm.pluginsdk.platformtools.f */
public class C72715f {

    /* renamed from: a */
    public static boolean f211584a;

    /* renamed from: a */
    public static String m85108a(Context context, long j) {
        String str;
        Context context2 = context;
        long j2 = j;
        if (!LocaleUtil.isSimplifiedChineseAppLang()) {
            LocaleUtil.transLanguageToLocale(LocaleUtil.getApplicationLanguage());
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            if (j2 < 3600000) {
                return "";
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            long timeInMillis = j2 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis > 0 && timeInMillis <= 86400000) {
                return context2.getString(C0966R.string.ezr);
            }
            long timeInMillis2 = (j2 - gregorianCalendar2.getTimeInMillis()) + 86400000;
            if (timeInMillis2 > 0 && timeInMillis2 <= 86400000) {
                return context2.getString(C0966R.string.f360813f00);
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
            gregorianCalendar3.setTimeInMillis(j2);
            long timeInMillis3 = (j2 - gregorianCalendar2.getTimeInMillis()) + FrequentLimiter.WEEK_MILLS;
            if (timeInMillis3 > 0 && timeInMillis3 <= FrequentLimiter.WEEK_MILLS) {
                return context2.getString(C0966R.string.ezh);
            }
            long timeInMillis4 = (j2 - gregorianCalendar2.getTimeInMillis()) + 2592000000L;
            if (timeInMillis4 > 0 && timeInMillis4 <= 2592000000L) {
                return context2.getString(C0966R.string.ezg);
            }
            if (gregorianCalendar.get(1) == gregorianCalendar3.get(1)) {
                switch (gregorianCalendar.get(2)) {
                    case 0:
                        str = "JANUARY";
                        break;
                    case 1:
                        str = "FEBRUARY";
                        break;
                    case 2:
                        str = "MARCH";
                        break;
                    case 3:
                        str = "APRIL";
                        break;
                    case 4:
                        str = "MAY";
                        break;
                    case 5:
                        str = "JUNE";
                        break;
                    case 6:
                        str = "JULY";
                        break;
                    case 7:
                        str = "AUGUST";
                        break;
                    case 8:
                        str = "SEPTEMBER";
                        break;
                    case 9:
                        str = "OCTOBER";
                        break;
                    case 10:
                        str = "NOVEMBER";
                        break;
                    case 11:
                        str = "DECEMBER";
                        break;
                    default:
                        str = "UNDECIMBER";
                        break;
                }
                return str;
            }
            return String.format("%d", new Object[]{Integer.valueOf(gregorianCalendar3.get(1))});
        } else if (j2 < 3600000) {
            return "";
        } else {
            Time time = new Time();
            Time time2 = new Time();
            time.set(j2);
            time2.setToNow();
            int i = time.year;
            int i2 = time2.year;
            if (i == i2 && time.yearDay == time2.yearDay) {
                return context2.getString(C0966R.string.ezr);
            }
            if (i == i2 && time2.yearDay - time.yearDay == 1) {
                return context2.getString(C0966R.string.f360813f00);
            }
            if (i == i2 && time2.yearDay - time.yearDay <= 7) {
                return context2.getString(C0966R.string.ezh);
            }
            if (i == i2 && time2.yearDay - time.yearDay <= 30) {
                return context2.getString(C0966R.string.ezg);
            }
            if (i == i2) {
                return (time.month + 1) + "月";
            }
            return time.year + "年";
        }
    }

    /* renamed from: b */
    public static CharSequence m85109b(Context context, int i) {
        if (i < 0) {
            return "";
        }
        long j = (long) i;
        return j < 6 ? context.getString(C0966R.string.eyl) : j < 12 ? context.getString(C0966R.string.ez5) : j < 13 ? context.getString(C0966R.string.eza) : j < 18 ? context.getString(C0966R.string.ey8) : context.getString(C0966R.string.eyt);
    }

    /* renamed from: c */
    public static CharSequence m85110c(Context context, long j) {
        return j < 0 ? "" : j < 21600000 ? context.getString(C0966R.string.eyl) : j < 43200000 ? context.getString(C0966R.string.ez5) : j < 46800000 ? context.getString(C0966R.string.eza) : j < 64800000 ? context.getString(C0966R.string.ey8) : context.getString(C0966R.string.eyt);
    }

    /* renamed from: d */
    public static String m85111d(String str, long j) {
        return new SimpleDateFormat(str).format(new Date(j * 1000));
    }

    /* renamed from: e */
    public static CharSequence m85112e(Context context, long j, boolean z) {
        Object obj;
        String str;
        Context context2 = context;
        long j2 = j;
        if (!LocaleUtil.isSimplifiedChineseAppLang()) {
            Locale transLanguageToLocale = LocaleUtil.transLanguageToLocale(LocaleUtil.getApplicationLanguage());
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            if (j2 < 3600000) {
                return "";
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            long timeInMillis = j2 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000) {
                long timeInMillis2 = (j2 - gregorianCalendar2.getTimeInMillis()) + 86400000;
                if (timeInMillis2 <= 0 || timeInMillis2 > 86400000) {
                    GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                    gregorianCalendar3.setTimeInMillis(j2);
                    if (gregorianCalendar.get(1) == gregorianCalendar3.get(1) && gregorianCalendar.get(3) == gregorianCalendar3.get(3)) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ExifInterface.LONGITUDE_EAST, transLanguageToLocale);
                        str = "" + simpleDateFormat.format(Long.valueOf(j));
                        if (!z) {
                            str = str + " " + DateFormat.getTimeInstance(3, transLanguageToLocale).format(Long.valueOf(j));
                        }
                    } else if (gregorianCalendar.get(1) == gregorianCalendar3.get(1)) {
                        return (z ? DateFormat.getDateInstance(3, transLanguageToLocale) : DateFormat.getDateTimeInstance(3, 3, transLanguageToLocale)).format(Long.valueOf(j));
                    } else {
                        return (z ? DateFormat.getDateInstance(3, transLanguageToLocale) : DateFormat.getDateTimeInstance(3, 3, transLanguageToLocale)).format(Long.valueOf(j));
                    }
                } else if (z) {
                    str = context2.getString(C0966R.string.f360813f00);
                } else {
                    str = context2.getString(C0966R.string.f360813f00) + " " + DateFormat.getTimeInstance(3, transLanguageToLocale).format(Long.valueOf(j));
                }
                return str;
            }
            DateFormat timeInstance = DateFormat.getTimeInstance(3, transLanguageToLocale);
            return "" + timeInstance.format(Long.valueOf(j));
        } else if (j2 < 3600000) {
            return "";
        } else {
            Time time = new Time();
            Time time2 = new Time();
            time.set(j2);
            time2.setToNow();
            int i = time.year;
            int i2 = time2.year;
            if (i == i2 && time.yearDay == time2.yearDay) {
                if (m85116i()) {
                    return C72714e.m85106a(context2.getString(C0966R.string.ezc), time);
                }
                return "" + m85109b(context2, time.hour) + C72714e.m85106a(context2.getString(C0966R.string.ezb), time);
            } else if (i == i2 && time2.yearDay - time.yearDay == 1) {
                boolean i3 = m85116i();
                if (z) {
                    return context2.getString(C0966R.string.f360813f00);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(context2.getString(C0966R.string.f360813f00));
                sb.append(" ");
                if (i3) {
                    obj = C72714e.m85106a(context2.getString(C0966R.string.ezc), time);
                } else {
                    obj = "" + m85109b(context2, time.hour) + C72714e.m85106a(context2.getString(C0966R.string.ezb), time);
                }
                sb.append(obj);
                return sb.toString();
            } else if (i == i2 && time.getWeekNumber() == time2.getWeekNumber()) {
                String str2 = "" + C72714e.m85106a("E ", time);
                if (z) {
                    return str2;
                }
                return str2 + C72714e.m85106a(context2.getString(C0966R.string.ezd), time);
            } else if (time.year == time2.year) {
                return C72714e.m85106a(z ? context2.getString(C0966R.string.eyh) : context2.getString(C0966R.string.eyj, new Object[]{m85110c(context2, ((long) time.hour) * 3600000)}).toString(), time);
            } else {
                return C72714e.m85106a(z ? context2.getString(C0966R.string.f360810ez1) : context2.getString(C0966R.string.f360812ez3, new Object[]{m85110c(context2, ((long) time.hour) * 3600000)}).toString(), time);
            }
        }
    }

    /* renamed from: f */
    public static String m85113f(Context context, int i) {
        switch (i) {
            case 1:
                return context.getString(C0966R.string.ezw);
            case 2:
                return context.getString(C0966R.string.ezu);
            case 3:
                return context.getString(C0966R.string.ezy);
            case 4:
                return context.getString(C0966R.string.ezz);
            case 5:
                return context.getString(C0966R.string.ezx);
            case 6:
                return context.getString(C0966R.string.ezt);
            case 7:
                return context.getString(C0966R.string.ezv);
            default:
                return "";
        }
    }

    /* renamed from: g */
    public static String m85114g(String str, long j) {
        String charSequence = android.text.format.DateFormat.format(str, j).toString();
        if (Util.isNullOrNil(charSequence)) {
            return "";
        }
        String trim = charSequence.trim();
        return trim.startsWith("0") ? trim.substring(1) : trim;
    }

    /* renamed from: h */
    public static String m85115h(Context context, int i) {
        Context context2 = context;
        long j = ((long) i) * 1000;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        String str = "";
        if (j < 3600000) {
            return str;
        }
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis = j - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis < 0 || timeInMillis >= 86400000) {
            long timeInMillis2 = j - (gregorianCalendar2.getTimeInMillis() - 86400000);
            if (timeInMillis2 < 0 || timeInMillis2 >= 86400000) {
                long timeInMillis3 = j - (gregorianCalendar2.getTimeInMillis() - 172800000);
                if (timeInMillis3 < 0 || timeInMillis3 >= 86400000) {
                    long timeInMillis4 = j - (gregorianCalendar2.getTimeInMillis() + 86400000);
                    if (timeInMillis4 < 0 || timeInMillis4 >= 86400000) {
                        long timeInMillis5 = j - (gregorianCalendar2.getTimeInMillis() + 172800000);
                        if (timeInMillis5 < 0 || timeInMillis5 >= 86400000) {
                            GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                            gregorianCalendar3.setTimeInMillis(j);
                            int i2 = gregorianCalendar3.get(11);
                            if (gregorianCalendar.get(1) == gregorianCalendar3.get(1) && gregorianCalendar.get(3) == gregorianCalendar3.get(3)) {
                                int i3 = gregorianCalendar3.get(7);
                                return m85113f(context2, i3) + " " + m85109b(context2, i2) + ";" + m85114g(context2.getString(C0966R.string.ezb), j);
                            } else if (gregorianCalendar.get(1) == gregorianCalendar3.get(1) && gregorianCalendar.get(3) + 1 == gregorianCalendar3.get(3)) {
                                int i4 = gregorianCalendar3.get(7);
                                StringBuilder sb = new StringBuilder();
                                switch (i4) {
                                    case 1:
                                        str = context2.getString(C0966R.string.ezn);
                                        break;
                                    case 2:
                                        str = context2.getString(C0966R.string.ezl);
                                        break;
                                    case 3:
                                        str = context2.getString(C0966R.string.ezp);
                                        break;
                                    case 4:
                                        str = context2.getString(C0966R.string.ezq);
                                        break;
                                    case 5:
                                        str = context2.getString(C0966R.string.ezo);
                                        break;
                                    case 6:
                                        str = context2.getString(C0966R.string.ezk);
                                        break;
                                    case 7:
                                        str = context2.getString(C0966R.string.ezm);
                                        break;
                                }
                                sb.append(str);
                                sb.append(" ");
                                sb.append(m85109b(context2, i2));
                                sb.append(";");
                                sb.append(m85114g(context2.getString(C0966R.string.ezb), j));
                                return sb.toString();
                            } else if (gregorianCalendar.get(1) == gregorianCalendar3.get(1)) {
                                return android.text.format.DateFormat.format(context2.getString(C0966R.string.eyh), j) + " " + m85109b(context2, i2) + ";" + m85114g(context2.getString(C0966R.string.ezb), j);
                            } else {
                                return android.text.format.DateFormat.format(context2.getString(C0966R.string.f360810ez1), j) + " " + m85109b(context2, i2) + ";" + m85114g(context2.getString(C0966R.string.ezb), j);
                            }
                        } else {
                            return context2.getString(C0966R.string.ezi) + " " + m85110c(context2, timeInMillis5) + ";" + m85114g(context2.getString(C0966R.string.ezb), j);
                        }
                    } else {
                        return context2.getString(C0966R.string.ezs) + " " + m85110c(context2, timeInMillis4) + ";" + m85114g(context2.getString(C0966R.string.ezb), j);
                    }
                } else {
                    return context2.getString(C0966R.string.ezj) + " " + m85110c(context2, timeInMillis3) + ";" + m85114g(context2.getString(C0966R.string.ezb), j);
                }
            } else {
                return context2.getString(C0966R.string.f360813f00) + " " + m85110c(context2, timeInMillis2) + ";" + m85114g(context2.getString(C0966R.string.ezb), j);
            }
        } else {
            return str + m85110c(context2, timeInMillis) + ";" + m85114g(context2.getString(C0966R.string.ezb), j);
        }
    }

    /* renamed from: i */
    public static boolean m85116i() {
        if (System.currentTimeMillis() - 0 > 30000) {
            try {
                f211584a = android.text.format.DateFormat.is24HourFormat(MMApplicationContext.getContext());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TimeUtil", e, "", new Object[0]);
            }
        }
        return f211584a;
    }
}
