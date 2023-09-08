package er1;

import android.content.Context;
import android.text.format.DateFormat;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86312j;
import eb0.C75592q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tf0.C64916p1;
import zc1.C66785b;

/* renamed from: er1.t0 */
public class C7878t0 {

    /* renamed from: a */
    public static Map<String, List<String>> f26492a = new HashMap();

    /* renamed from: b */
    public static HashMap<Long, Long> f26493b = new HashMap<>();

    /* renamed from: c */
    public static HashMap<Long, String> f26494c = new HashMap<>();

    /* renamed from: d */
    public static HashMap<Long, String> f26495d = new HashMap<>();

    /* renamed from: e */
    public static String f26496e = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());

    static {
        new HashMap();
    }

    /* renamed from: a */
    public static String m8032a(int i) {
        if (i <= 0) {
            return "0";
        }
        if (i <= 999) {
            return String.valueOf(i);
        }
        if (f26496e.equals("zh_CN") || f26496e.equals("zh_HK") || f26496e.equals("zh_TW")) {
            if (i <= 9999) {
                return String.valueOf(i);
            }
            if (i <= 100000) {
                double doubleValue = new BigDecimal(((double) ((((float) i) * 1.0f) / 10000.0f)) - 0.05d).setScale(1, RoundingMode.UP).doubleValue();
                String string = MMApplicationContext.getContext().getString(C0966R.string.efi, new Object[]{Double.valueOf(doubleValue)});
                if (((double) Math.round(doubleValue)) - doubleValue != 0.0d) {
                    return string;
                }
                return MMApplicationContext.getContext().getString(C0966R.string.efl, new Object[]{Integer.valueOf((int) Math.round(doubleValue))});
            }
            return MMApplicationContext.getContext().getString(C0966R.string.efm, new Object[]{10});
        } else if (i <= 100000) {
            return MMApplicationContext.getContext().getString(C0966R.string.efk, new Object[]{Double.valueOf(((double) ((((float) i) * 1.0f) / 1000.0f)) - 0.05d)});
        } else {
            return MMApplicationContext.getContext().getString(C0966R.string.efr, new Object[]{100});
        }
    }

    /* renamed from: b */
    public static String m8033b(int i) {
        if (i <= 0) {
            return "0";
        }
        if (!f26496e.equals("zh_CN") && !f26496e.equals("zh_HK") && !f26496e.equals("zh_TW")) {
            float f = (float) i;
            if (f < 1000.0f) {
                return String.valueOf(i);
            }
            if (f < 1000000.0f) {
                String plainString = new BigDecimal((double) (f / 1000.0f)).setScale(1, 4).stripTrailingZeros().toPlainString();
                return MMApplicationContext.getContext().getString(C0966R.string.jlt, new Object[]{plainString});
            } else if (f < 1.0E7f) {
                String plainString2 = new BigDecimal((double) (f / 1000000.0f)).setScale(1, 4).stripTrailingZeros().toPlainString();
                return MMApplicationContext.getContext().getString(C0966R.string.j8t, new Object[]{plainString2});
            } else {
                return MMApplicationContext.getContext().getString(C0966R.string.jso, new Object[]{PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT});
            }
        } else if (i <= 9999) {
            return String.valueOf(i);
        } else {
            if (i < 10000000) {
                String plainString3 = new BigDecimal((double) (((float) i) / 10000.0f)).setScale(1, 4).stripTrailingZeros().toPlainString();
                return MMApplicationContext.getContext().getString(C0966R.string.jsm, new Object[]{plainString3});
            }
            return MMApplicationContext.getContext().getString(C0966R.string.efm, new Object[]{1000});
        }
    }

    /* renamed from: c */
    public static String m8034c(int i, int i2) {
        return ((C64916p1) C86312j.m106911c(C64916p1.class)).J30(i) ? m8035d((long) i2) : m8039h(i2);
    }

    /* renamed from: d */
    public static String m8035d(long j) {
        if (j <= 0) {
            return "0";
        }
        if (j <= 999) {
            return String.valueOf(j);
        }
        if (f26496e.equals("zh_CN") || f26496e.equals("zh_HK") || f26496e.equals("zh_TW")) {
            if (j <= 9999) {
                return String.valueOf(j);
            }
            if (j <= 99990000) {
                return MMApplicationContext.getContext().getString(C0966R.string.efi, new Object[]{Double.valueOf(((double) ((((float) j) * 1.0f) / 10000.0f)) - 0.05d)});
            }
            return MMApplicationContext.getContext().getString(C0966R.string.efn, new Object[]{1});
        } else if (j <= 990000) {
            return MMApplicationContext.getContext().getString(C0966R.string.efk, new Object[]{Double.valueOf(((double) ((((float) j) * 1.0f) / 1000.0f)) - 0.05d)});
        } else if (j <= 99990000) {
            return MMApplicationContext.getContext().getString(C0966R.string.efj, new Object[]{Double.valueOf(((double) ((((float) j) * 1.0f) / 1000000.0f)) - 0.05d)});
        } else {
            return MMApplicationContext.getContext().getString(C0966R.string.efo, new Object[]{100});
        }
    }

    /* renamed from: e */
    public static String m8036e(long j) {
        if (j <= 0) {
            return "0";
        }
        if (f26496e.equals("zh_CN") || f26496e.equals("zh_HK") || f26496e.equals("zh_TW")) {
            if (j <= 9999) {
                return String.valueOf(j);
            }
            if (j <= 99990000) {
                return MMApplicationContext.getContext().getString(C0966R.string.efi, new Object[]{Double.valueOf(((double) ((((float) j) * 1.0f) / 10000.0f)) - 0.05d)});
            }
            return MMApplicationContext.getContext().getString(C0966R.string.efq, new Object[]{Double.valueOf(((double) (((((float) j) * 1.0f) / 10000.0f) / 10000.0f)) - 0.05d)});
        } else if (j <= 999) {
            return String.valueOf(j);
        } else {
            if (j <= 990000) {
                return MMApplicationContext.getContext().getString(C0966R.string.efk, new Object[]{Double.valueOf(((double) ((((float) j) * 1.0f) / 1000.0f)) - 0.05d)});
            } else if (j <= 990000000) {
                return MMApplicationContext.getContext().getString(C0966R.string.efp, new Object[]{Double.valueOf(((double) (((((float) j) * 1.0f) / 1000.0f) / 1000.0f)) - 0.05d)});
            } else {
                return MMApplicationContext.getContext().getString(C0966R.string.efs, new Object[]{Double.valueOf(((double) ((((((float) j) * 1.0f) / 10000.0f) / 10000.0f) / 10.0f)) - 0.05d)});
            }
        }
    }

    /* renamed from: f */
    public static String m8037f(Context context, long j) {
        Context context2 = context;
        long j2 = j;
        if (j2 < 3600000) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (f26493b.containsKey(Long.valueOf(j))) {
            if (currentTimeMillis - f26493b.get(Long.valueOf(j)).longValue() >= 60000) {
                f26493b.remove(Long.valueOf(j));
            } else if (f26494c.containsKey(Long.valueOf(j))) {
                return f26494c.get(Long.valueOf(j));
            }
        }
        long j3 = currentTimeMillis - j2;
        long j4 = j3 / 3600000;
        if (j4 == 0) {
            int i = (int) (j3 / 60000);
            if (i < 1) {
                i = 1;
            }
            String string = context.getResources().getString(C0966R.string.es4, new Object[]{Integer.valueOf(i)});
            f26494c.put(Long.valueOf(j), string);
            f26493b.put(Long.valueOf(j), Long.valueOf(currentTimeMillis));
            return string;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis = j2 - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis <= 0 || timeInMillis > 86400000) {
            long timeInMillis2 = gregorianCalendar2.getTimeInMillis();
            int i2 = (int) (((timeInMillis2 + 86400000) - j2) / 86400000);
            if ((j2 - timeInMillis2) + 2592000000L <= 0 || i2 > 30) {
                GregorianCalendar gregorianCalendar3 = new GregorianCalendar();
                gregorianCalendar3.setTimeInMillis(j2);
                if (gregorianCalendar.get(1) == gregorianCalendar3.get(1)) {
                    String str = "" + DateFormat.format(context2.getString(C0966R.string.eyh), j2);
                    f26494c.put(Long.valueOf(j), str);
                    f26493b.put(Long.valueOf(j), Long.valueOf(currentTimeMillis));
                    return str;
                }
                String str2 = "" + DateFormat.format(context2.getString(C0966R.string.f360810ez1), j2);
                f26494c.put(Long.valueOf(j), str2);
                f26493b.put(Long.valueOf(j), Long.valueOf(currentTimeMillis));
                return str2;
            }
            if (i2 < 1) {
                i2 = 1;
            }
            String quantityString = context.getResources().getQuantityString(C0966R.plurals.f7231l, i2, new Object[]{Integer.valueOf(i2)});
            f26494c.put(Long.valueOf(j), quantityString);
            f26493b.put(Long.valueOf(j), Long.valueOf(currentTimeMillis));
            return quantityString;
        }
        int i3 = (int) j4;
        if (i3 < 1) {
            i3 = 1;
        }
        String string2 = context.getResources().getString(C0966R.string.f360792es0, new Object[]{Integer.valueOf(i3)});
        f26494c.put(Long.valueOf(j), string2);
        f26493b.put(Long.valueOf(j), Long.valueOf(currentTimeMillis));
        return string2;
    }

    /* renamed from: g */
    public static String m8038g(Context context, long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j);
        if (gregorianCalendar.get(6) == gregorianCalendar2.get(6)) {
            String string = context.getString(C0966R.string.ezr);
            f26494c.put(Long.valueOf(j), string);
            f26493b.put(Long.valueOf(j), Long.valueOf(timeInMillis));
            return string;
        } else if (gregorianCalendar.get(6) == gregorianCalendar2.get(6) + 1) {
            String string2 = context.getString(C0966R.string.f360813f00);
            f26494c.put(Long.valueOf(j), string2);
            f26493b.put(Long.valueOf(j), Long.valueOf(timeInMillis));
            return string2;
        } else if (gregorianCalendar.get(6) == gregorianCalendar2.get(6) + 2) {
            String string3 = context.getString(C0966R.string.ezj);
            f26494c.put(Long.valueOf(j), string3);
            f26493b.put(Long.valueOf(j), Long.valueOf(timeInMillis));
            return string3;
        } else if (gregorianCalendar.get(1) == gregorianCalendar2.get(1)) {
            String str = "" + DateFormat.format(context.getString(C0966R.string.eyh), j);
            f26494c.put(Long.valueOf(j), str);
            f26493b.put(Long.valueOf(j), Long.valueOf(timeInMillis));
            return str;
        } else {
            String str2 = "" + DateFormat.format(context.getString(C0966R.string.f360810ez1), j);
            f26494c.put(Long.valueOf(j), str2);
            f26493b.put(Long.valueOf(j), Long.valueOf(timeInMillis));
            return str2;
        }
    }

    /* renamed from: h */
    public static String m8039h(int i) {
        if (i <= 0) {
            return "0";
        }
        if (i <= 999) {
            return String.valueOf(i);
        }
        if (f26496e.equals("zh_CN") || f26496e.equals("zh_HK") || f26496e.equals("zh_TW")) {
            if (i <= 9999) {
                return String.valueOf(i);
            }
            if (i <= 100000) {
                return MMApplicationContext.getContext().getString(C0966R.string.efi, new Object[]{Double.valueOf(((double) ((((float) i) * 1.0f) / 10000.0f)) - 0.05d)});
            }
            return MMApplicationContext.getContext().getString(C0966R.string.efm, new Object[]{10});
        } else if (i <= 100000) {
            return MMApplicationContext.getContext().getString(C0966R.string.efk, new Object[]{Double.valueOf(((double) ((((float) i) * 1.0f) / 1000.0f)) - 0.05d)});
        } else {
            return MMApplicationContext.getContext().getString(C0966R.string.efr, new Object[]{100});
        }
    }

    /* renamed from: i */
    public static String m8040i(Context context, int i, String str) {
        if (((HashMap) f26492a).get(str) == null) {
            m8041j(context, str);
        }
        List list = (List) ((HashMap) f26492a).get(str);
        if (i >= list.size() || list.get(i) == null || ((String) list.get(i)).equals("")) {
            m8041j(context, str);
        }
        List list2 = (List) ((HashMap) f26492a).get(str);
        return i < list2.size() ? (String) list2.get(i) : "";
    }

    /* renamed from: j */
    public static void m8041j(Context context, String str) {
        String[] stringArray = context.getResources().getStringArray(C0966R.array.f2602aq);
        ArrayList arrayList = new ArrayList();
        arrayList.add("");
        for (String add : stringArray) {
            arrayList.add(add);
        }
        ((HashMap) f26492a).put(str, arrayList);
    }

    /* renamed from: k */
    public static String m8042k(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        if (str == null || str.isEmpty()) {
            return str2;
        }
        if (!str.equals(C75592q0.m90789s()) && !str.equals(C66785b.f191882e.mo90662O5()) && !str.equals(C75592q0.m90782l())) {
            return str2;
        }
        if (str2.isEmpty()) {
            return "**";
        }
        return str2.charAt(0) + "**";
    }
}
