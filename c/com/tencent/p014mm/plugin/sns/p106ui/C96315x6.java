package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.text.format.DateFormat;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.sns.ui.x6 */
public class C96315x6 {

    /* renamed from: a */
    public static Map<String, List<String>> f281690a = new HashMap();

    /* renamed from: b */
    public static HashMap<Long, Long> f281691b = new HashMap<>();

    /* renamed from: c */
    public static HashMap<Long, String> f281692c = new HashMap<>();

    static {
        new HashMap();
    }

    /* renamed from: a */
    public static synchronized String m123535a(Context context, long j) {
        synchronized (C96315x6.class) {
            SnsMethodCalculate.markStartTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            if (j < 3600000) {
                SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return "";
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (f281691b.containsKey(Long.valueOf(j))) {
                if (timeInMillis - f281691b.get(Long.valueOf(j)).longValue() >= 60000) {
                    f281691b.remove(Long.valueOf(j));
                } else if (f281692c.containsKey(Long.valueOf(j))) {
                    String str = f281692c.get(Long.valueOf(j));
                    SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                    return str;
                }
            }
            long j2 = timeInMillis - j;
            if (j2 / 3600000 == 0) {
                int i = (int) (j2 / 60000);
                if (i < 1) {
                    i = 1;
                }
                String quantityString = context.getResources().getQuantityString(C0966R.plurals.f7230k, i, new Object[]{Integer.valueOf(i)});
                f281692c.put(Long.valueOf(j), quantityString);
                f281691b.put(Long.valueOf(j), Long.valueOf(timeInMillis));
                SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return quantityString;
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            long timeInMillis2 = j - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis2 <= 0 || timeInMillis2 > 86400000) {
                long timeInMillis3 = (j - gregorianCalendar2.getTimeInMillis()) + 86400000;
                if (timeInMillis3 <= 0 || timeInMillis3 > 86400000) {
                    Context context2 = context;
                    int timeInMillis4 = (int) (((gregorianCalendar2.getTimeInMillis() + 86400000) - j) / 86400000);
                    if (timeInMillis4 < 1) {
                        timeInMillis4 = 1;
                    }
                    String quantityString2 = context.getResources().getQuantityString(C0966R.plurals.f7231l, timeInMillis4, new Object[]{Integer.valueOf(timeInMillis4)});
                    f281692c.put(Long.valueOf(j), quantityString2);
                    f281691b.put(Long.valueOf(j), Long.valueOf(timeInMillis));
                    SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                    return quantityString2;
                }
                String string = context.getString(C0966R.string.f360813f00);
                f281692c.put(Long.valueOf(j), string);
                f281691b.put(Long.valueOf(j), Long.valueOf(timeInMillis));
                SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return string;
            }
            int i2 = (int) (j2 / 3600000);
            if (i2 < 1) {
                i2 = 1;
            }
            String quantityString3 = context.getResources().getQuantityString(C0966R.plurals.f7229j, i2, new Object[]{Integer.valueOf(i2)});
            f281692c.put(Long.valueOf(j), quantityString3);
            f281691b.put(Long.valueOf(j), Long.valueOf(timeInMillis));
            SnsMethodCalculate.markEndTimeMs("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return quantityString3;
        }
    }

    /* renamed from: b */
    public static CharSequence m123536b(Context context, long j) {
        SnsMethodCalculate.markStartTimeMs("fromatSnsTime24", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        CharSequence format = DateFormat.format(context.getString(C0966R.string.ezc), j);
        SnsMethodCalculate.markEndTimeMs("fromatSnsTime24", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return format;
    }

    /* renamed from: c */
    public static String m123537c(Context context, long j) {
        SnsMethodCalculate.markStartTimeMs("fromatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j);
        boolean z = false;
        boolean z2 = instance.get(1) == instance2.get(1);
        boolean z3 = z2 && instance.get(2) == instance2.get(2);
        boolean z4 = z2 && z3 && instance.get(5) == instance2.get(5);
        boolean z5 = z2 && z3 && instance.get(5) - 1 == instance2.get(5);
        if (!z5) {
            if ((z2 && instance.get(2) - 1 == instance2.get(2)) || instance.get(1) - instance2.get(1) == 1) {
                instance.add(5, -1);
                if (instance.get(1) == instance2.get(1) && instance.get(2) == instance2.get(2) && instance.get(5) == instance2.get(5)) {
                    z = true;
                }
                z5 = z;
            }
        }
        if (z4) {
            String str = (String) m123536b(context, j);
            SnsMethodCalculate.markEndTimeMs("fromatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str;
        } else if (z5) {
            String str2 = context.getString(C0966R.string.f360813f00) + " " + ((String) m123536b(context, j));
            SnsMethodCalculate.markEndTimeMs("fromatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str2;
        } else {
            String str3 = (String) DateFormat.format(context.getString(C0966R.string.f360810ez1), j);
            if (str3.indexOf("-") > 0) {
                str3 = instance2.get(5) + " " + m123539e(context, instance2.get(2) + 1);
                if (!z2) {
                    str3 = str3 + " " + instance2.get(1);
                }
            }
            String str4 = str3 + " " + ((String) m123536b(context, j));
            SnsMethodCalculate.markEndTimeMs("fromatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str4;
        }
    }

    /* renamed from: d */
    public static String m123538d(Context context, long j) {
        SnsMethodCalculate.markStartTimeMs("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j);
        boolean z = false;
        boolean z2 = instance.get(1) == instance2.get(1);
        boolean z3 = z2 && instance.get(2) == instance2.get(2);
        boolean z4 = z2 && z3 && instance.get(5) == instance2.get(5);
        boolean z5 = z2 && z3 && instance.get(5) - 1 == instance2.get(5);
        if (!z5) {
            if ((z2 && instance.get(2) - 1 == instance2.get(2)) || instance.get(1) - instance2.get(1) == 1) {
                instance.add(5, -1);
                if (instance.get(1) == instance2.get(1) && instance.get(2) == instance2.get(2) && instance.get(5) == instance2.get(5)) {
                    z = true;
                }
                z5 = z;
            }
        }
        if (z4) {
            String str = (String) m123536b(context, j);
            SnsMethodCalculate.markEndTimeMs("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str;
        } else if (z5) {
            String str2 = context.getString(C0966R.string.f360813f00) + " " + ((String) m123536b(context, j));
            SnsMethodCalculate.markEndTimeMs("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str2;
        } else {
            String str3 = z2 ? (String) DateFormat.format(context.getString(C0966R.string.eyh), j) : (String) DateFormat.format(context.getString(C0966R.string.f360810ez1), j);
            if (str3.indexOf("-") > 0) {
                str3 = instance2.get(5) + " " + m123539e(context, instance2.get(2) + 1);
                if (!z2) {
                    str3 = str3 + " " + instance2.get(1);
                }
            }
            String str4 = str3 + " " + ((String) m123536b(context, j));
            SnsMethodCalculate.markEndTimeMs("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str4;
        }
    }

    /* renamed from: e */
    public static String m123539e(Context context, int i) {
        SnsMethodCalculate.markStartTimeMs("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        String[] stringArray = context.getResources().getStringArray(C0966R.array.f2603ar);
        ArrayList arrayList = new ArrayList();
        arrayList.add("");
        for (String add : stringArray) {
            arrayList.add(add);
        }
        if (i >= arrayList.size()) {
            SnsMethodCalculate.markEndTimeMs("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return "";
        }
        String str = (String) arrayList.get(i);
        SnsMethodCalculate.markEndTimeMs("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return str;
    }

    /* renamed from: f */
    public static int m123540f() {
        SnsMethodCalculate.markStartTimeMs("getYear", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        int i = new GregorianCalendar().get(1);
        SnsMethodCalculate.markEndTimeMs("getYear", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return i;
    }

    /* renamed from: g */
    public static void m123541g(Context context, String str) {
        SnsMethodCalculate.markStartTimeMs("initMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        String[] stringArray = context.getResources().getStringArray(C0966R.array.f2603ar);
        ArrayList arrayList = new ArrayList();
        arrayList.add("");
        for (String add : stringArray) {
            arrayList.add(add);
        }
        ((HashMap) f281690a).put(str, arrayList);
        SnsMethodCalculate.markEndTimeMs("initMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
    }

    /* renamed from: h */
    public static boolean m123542h(long j) {
        SnsMethodCalculate.markStartTimeMs("isThisWeek", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        int i = gregorianCalendar.get(7) - 1;
        if (i == 0) {
            i = 7;
        }
        long timeInMillis = gregorianCalendar2.getTimeInMillis() - (((long) i) * 86400000);
        long timeInMillis2 = gregorianCalendar2.getTimeInMillis() + (((long) (7 - i)) * 86400000);
        if (j < timeInMillis || j >= timeInMillis2) {
            SnsMethodCalculate.markEndTimeMs("isThisWeek", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isThisWeek", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return true;
    }

    /* renamed from: i */
    public static boolean m123543i(long j) {
        SnsMethodCalculate.markStartTimeMs("isToday", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        long timeInMillis = j - new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
        if (timeInMillis <= 0 || timeInMillis > 86400000) {
            SnsMethodCalculate.markEndTimeMs("isToday", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isToday", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return true;
    }
}
