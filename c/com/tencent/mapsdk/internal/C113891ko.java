package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.mapsdk.internal.C113880kc;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.File;
import java.io.FileFilter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mapsdk.internal.ko */
public final class C113891ko implements C113890kn {

    /* renamed from: a */
    public static Set<String> f340718a;

    /* renamed from: f */
    private static final int[] f340719f = {2, 3, 4, 5, 6};

    /* renamed from: b */
    private boolean f340720b;

    /* renamed from: c */
    private long f340721c;

    /* renamed from: d */
    private int f340722d;

    /* renamed from: e */
    private final Map<String, int[]> f340723e = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final File f340724g;

    /* renamed from: h */
    private final Context f340725h;

    /* renamed from: i */
    private boolean f340726i;

    static {
        HashSet hashSet = new HashSet();
        f340718a = hashSet;
        hashSet.add(C0949kl.f2238h);
        f340718a.add("NetManager");
        f340718a.add("asset");
    }

    public C113891ko(Context context, TencentMapOptions tencentMapOptions) {
        String[] debugTags;
        this.f340725h = context;
        File file = new File(C113959ml.m157965a(context, tencentMapOptions).mo172405c().getAbsolutePath());
        this.f340724g = C113884kf.m157485a(file, "logs");
        if (C80343jx.m97833a("4.5.12.4", "4.3.4", 3) < 0) {
            C113884kf.m157484a(file, (FileFilter) new FileFilter() {
                public final boolean accept(File file) {
                    return Pattern.compile("log-.*.log").matcher(file.getName()).matches();
                }
            });
        }
        if (!(tencentMapOptions == null || (debugTags = tencentMapOptions.getDebugTags()) == null)) {
            mo172301a(true, debugTags);
        }
        C113865kb.m157396a(new C113865kb.C113879g<Void>() {
            /* renamed from: a */
            private Void m157642a() {
                int i;
                Calendar instance = Calendar.getInstance();
                Date date = new Date();
                instance.setTime(date);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                sb.append("(");
                sb4.append("(");
                int i2 = 2;
                while (true) {
                    i = 0;
                    if (i2 == 0) {
                        break;
                    }
                    instance.add(2, -1);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(instance.get(1));
                    String sb6 = sb5.toString();
                    String format = String.format(Locale.CHINA, "%02d", new Object[]{Integer.valueOf(instance.get(2) + 1)});
                    sb.append(sb6);
                    sb.append("|");
                    sb4.append(format);
                    sb4.append("|");
                    String str = sb6 + "_" + format;
                    File[] e = C113884kf.m157507e(C113891ko.this.f340724g, ".*" + str + ".*.log.*");
                    if (e != null && e.length > 0) {
                        if (C80344ki.m97844a(e, C113891ko.this.f340724g, "archive-".concat(String.valueOf(str)))) {
                            int length = e.length;
                            while (i < length) {
                                C113884kf.m157500b(e[i]);
                                i++;
                            }
                        }
                    }
                    i2--;
                }
                instance.setTime(date);
                sb.deleteCharAt(sb.lastIndexOf("|")).append(")");
                sb4.deleteCharAt(sb4.lastIndexOf("|")).append(")");
                String str2 = "archive-" + sb.toString() + "_" + sb4.toString() + ".zip";
                File[] e2 = C113884kf.m157507e(C113891ko.this.f340724g, "archive-.*.zip");
                if (e2 == null) {
                    return null;
                }
                int length2 = e2.length;
                while (i < length2) {
                    File file = e2[i];
                    if (!file.getName().matches(str2)) {
                        C113884kf.m157500b(file);
                    }
                    i++;
                }
                return null;
            }

            public final /* synthetic */ Object call() {
                int i;
                Calendar instance = Calendar.getInstance();
                Date date = new Date();
                instance.setTime(date);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                sb.append("(");
                sb4.append("(");
                int i2 = 2;
                while (true) {
                    i = 0;
                    if (i2 == 0) {
                        break;
                    }
                    instance.add(2, -1);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(instance.get(1));
                    String sb6 = sb5.toString();
                    String format = String.format(Locale.CHINA, "%02d", new Object[]{Integer.valueOf(instance.get(2) + 1)});
                    sb.append(sb6);
                    sb.append("|");
                    sb4.append(format);
                    sb4.append("|");
                    String str = sb6 + "_" + format;
                    File[] e = C113884kf.m157507e(C113891ko.this.f340724g, ".*" + str + ".*.log.*");
                    if (e != null && e.length > 0) {
                        if (C80344ki.m97844a(e, C113891ko.this.f340724g, "archive-".concat(String.valueOf(str)))) {
                            int length = e.length;
                            while (i < length) {
                                C113884kf.m157500b(e[i]);
                                i++;
                            }
                        }
                    }
                    i2--;
                }
                instance.setTime(date);
                sb.deleteCharAt(sb.lastIndexOf("|")).append(")");
                sb4.deleteCharAt(sb4.lastIndexOf("|")).append(")");
                String str2 = "archive-" + sb.toString() + "_" + sb4.toString() + ".zip";
                File[] e2 = C113884kf.m157507e(C113891ko.this.f340724g, "archive-.*.zip");
                if (e2 == null) {
                    return null;
                }
                int length2 = e2.length;
                while (i < length2) {
                    File file = e2[i];
                    if (!file.getName().matches(str2)) {
                        C113884kf.m157500b(file);
                    }
                    i++;
                }
                return null;
            }
        }).mo172279a(null);
        if (C114207sl.f341932d) {
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public final void uncaughtException(Thread thread, Throwable th) {
                    C113891ko koVar = C113891ko.this;
                    koVar.m157602a(6, C0949kl.f2233c, "UncaughtException: t[" + thread + "]", th);
                    throw new RuntimeException(th);
                }
            });
        }
    }

    /* renamed from: f */
    private void m157606f() {
        C113865kb.m157396a(new C113865kb.C113879g<Void>() {
            /* renamed from: a */
            private Void m157642a() {
                int i;
                Calendar instance = Calendar.getInstance();
                Date date = new Date();
                instance.setTime(date);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                sb.append("(");
                sb4.append("(");
                int i2 = 2;
                while (true) {
                    i = 0;
                    if (i2 == 0) {
                        break;
                    }
                    instance.add(2, -1);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(instance.get(1));
                    String sb6 = sb5.toString();
                    String format = String.format(Locale.CHINA, "%02d", new Object[]{Integer.valueOf(instance.get(2) + 1)});
                    sb.append(sb6);
                    sb.append("|");
                    sb4.append(format);
                    sb4.append("|");
                    String str = sb6 + "_" + format;
                    File[] e = C113884kf.m157507e(C113891ko.this.f340724g, ".*" + str + ".*.log.*");
                    if (e != null && e.length > 0) {
                        if (C80344ki.m97844a(e, C113891ko.this.f340724g, "archive-".concat(String.valueOf(str)))) {
                            int length = e.length;
                            while (i < length) {
                                C113884kf.m157500b(e[i]);
                                i++;
                            }
                        }
                    }
                    i2--;
                }
                instance.setTime(date);
                sb.deleteCharAt(sb.lastIndexOf("|")).append(")");
                sb4.deleteCharAt(sb4.lastIndexOf("|")).append(")");
                String str2 = "archive-" + sb.toString() + "_" + sb4.toString() + ".zip";
                File[] e2 = C113884kf.m157507e(C113891ko.this.f340724g, "archive-.*.zip");
                if (e2 == null) {
                    return null;
                }
                int length2 = e2.length;
                while (i < length2) {
                    File file = e2[i];
                    if (!file.getName().matches(str2)) {
                        C113884kf.m157500b(file);
                    }
                    i++;
                }
                return null;
            }

            public final /* synthetic */ Object call() {
                int i;
                Calendar instance = Calendar.getInstance();
                Date date = new Date();
                instance.setTime(date);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                sb.append("(");
                sb4.append("(");
                int i2 = 2;
                while (true) {
                    i = 0;
                    if (i2 == 0) {
                        break;
                    }
                    instance.add(2, -1);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(instance.get(1));
                    String sb6 = sb5.toString();
                    String format = String.format(Locale.CHINA, "%02d", new Object[]{Integer.valueOf(instance.get(2) + 1)});
                    sb.append(sb6);
                    sb.append("|");
                    sb4.append(format);
                    sb4.append("|");
                    String str = sb6 + "_" + format;
                    File[] e = C113884kf.m157507e(C113891ko.this.f340724g, ".*" + str + ".*.log.*");
                    if (e != null && e.length > 0) {
                        if (C80344ki.m97844a(e, C113891ko.this.f340724g, "archive-".concat(String.valueOf(str)))) {
                            int length = e.length;
                            while (i < length) {
                                C113884kf.m157500b(e[i]);
                                i++;
                            }
                        }
                    }
                    i2--;
                }
                instance.setTime(date);
                sb.deleteCharAt(sb.lastIndexOf("|")).append(")");
                sb4.deleteCharAt(sb4.lastIndexOf("|")).append(")");
                String str2 = "archive-" + sb.toString() + "_" + sb4.toString() + ".zip";
                File[] e2 = C113884kf.m157507e(C113891ko.this.f340724g, "archive-.*.zip");
                if (e2 == null) {
                    return null;
                }
                int length2 = e2.length;
                while (i < length2) {
                    File file = e2[i];
                    if (!file.getName().matches(str2)) {
                        C113884kf.m157500b(file);
                    }
                    i++;
                }
                return null;
            }
        }).mo172279a(null);
    }

    /* renamed from: h */
    private static String m157608h() {
        return new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.CHINA).format(new Date());
    }

    /* renamed from: i */
    private static String m157609i() {
        return new SimpleDateFormat("yyyy_MM", Locale.CHINA).format(new Date());
    }

    /* renamed from: b */
    public final void mo172307b(String str, String str2) {
        if (mo172303a(3, str)) {
            m157601a(3, str, str2);
        }
    }

    /* renamed from: c */
    public final void mo172310c() {
    }

    /* renamed from: c */
    public final void mo172312c(String str, String str2) {
        if (mo172303a(4, str)) {
            m157601a(4, str, str2);
        }
    }

    /* renamed from: d */
    public final void mo172316d(String str, String str2) {
        if (mo172303a(5, str)) {
            m157601a(5, str, str2);
        }
    }

    /* renamed from: e */
    public final void mo172320e(String str, String str2) {
        if (mo172303a(6, str)) {
            m157601a(6, str, str2);
        }
    }

    /* renamed from: g */
    public final void mo172325g(String str) {
        mo172295a(this.f340724g, "tms", str);
    }

    /* renamed from: g */
    private static String m157607g() {
        return "###########\n" + C113896kq.m157649a(C113798hb.m157070a("", "")) + "\n###########\n";
    }

    /* renamed from: a */
    public final boolean mo172302a() {
        return mo172304a(C0949kl.f2233c);
    }

    /* renamed from: b */
    public final void mo172308b(String str, String str2, Throwable th) {
        if (mo172303a(3, str)) {
            m157602a(3, str, str2, th);
        }
    }

    /* renamed from: c */
    public final void mo172313c(String str, String str2, Throwable th) {
        if (mo172303a(4, str)) {
            m157602a(4, str, str2, th);
        }
    }

    /* renamed from: d */
    public final void mo172317d(String str, String str2, Throwable th) {
        if (mo172303a(5, str)) {
            m157602a(5, str, str2, th);
        }
    }

    /* renamed from: e */
    public final void mo172321e(String str, String str2, Throwable th) {
        if (mo172303a(6, str)) {
            m157602a(6, str, str2, th);
        }
    }

    /* renamed from: f */
    public final void mo172324f(String str, String str2) {
        mo172295a(this.f340724g, str, str2);
    }

    /* renamed from: a */
    public final boolean mo172304a(String str) {
        if (!this.f340723e.containsKey(str) && !this.f340720b && (!C114207sl.f341932d || f340718a.contains(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo172323f(String str) {
        if (mo172304a(C0949kl.f2233c)) {
            m157601a(6, C0949kl.f2233c, str);
        }
    }

    /* renamed from: d */
    public static String m157604d() {
        return new SimpleDateFormat("yyyy_MM_dd", Locale.CHINA).format(new Date());
    }

    /* renamed from: b */
    public final String mo172305b() {
        return this.f340724g.getAbsolutePath();
    }

    /* renamed from: c */
    public final void mo172311c(String str) {
        if (mo172304a(C0949kl.f2233c)) {
            m157601a(3, C0949kl.f2233c, str);
        }
    }

    /* renamed from: e */
    public final void mo172319e(String str) {
        if (mo172304a(C0949kl.f2233c)) {
            m157601a(5, C0949kl.f2233c, str);
        }
    }

    /* renamed from: a */
    public final boolean mo172303a(int i, String str) {
        if (!this.f340723e.containsKey(str)) {
            return this.f340720b || (C114207sl.f341932d && !f340718a.contains(str));
        }
        int[] iArr = this.f340723e.get(str);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo172306b(String str) {
        if (mo172304a(C0949kl.f2233c)) {
            m157601a(2, C0949kl.f2233c, str);
        }
    }

    /* renamed from: c */
    public final void mo172314c(String str, Throwable th) {
        if (mo172304a(C0949kl.f2233c)) {
            m157602a(4, C0949kl.f2233c, str, th);
        }
    }

    /* renamed from: d */
    public final void mo172315d(String str) {
        if (mo172304a(C0949kl.f2233c)) {
            m157601a(4, C0949kl.f2233c, str);
        }
    }

    /* renamed from: e */
    public final void mo172322e(String str, Throwable th) {
        if (mo172304a(C0949kl.f2233c)) {
            m157602a(6, C0949kl.f2233c, str, th);
        }
    }

    /* renamed from: b */
    public final void mo172309b(String str, Throwable th) {
        if (mo172304a(C0949kl.f2233c)) {
            m157602a(3, C0949kl.f2233c, str, th);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ String m157605e() {
        return "###########\n" + C113896kq.m157649a(C113798hb.m157070a("", "")) + "\n###########\n";
    }

    /* renamed from: d */
    public final void mo172318d(String str, Throwable th) {
        if (mo172304a(C0949kl.f2233c)) {
            m157602a(5, C0949kl.f2233c, str, th);
        }
    }

    /* renamed from: a */
    public final void mo172296a(String str, String str2) {
        if (mo172303a(2, str)) {
            m157601a(2, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo172297a(String str, String str2, Throwable th) {
        if (mo172303a(2, str)) {
            m157602a(2, str, str2, th);
        }
    }

    /* renamed from: a */
    public final void mo172294a(Context context, C113880kc.C113881a aVar) {
        if (context != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.f340721c;
            if (j == 0 || uptimeMillis - j < 400) {
                this.f340721c = uptimeMillis;
                this.f340722d++;
                String str = "触发调试模式" + this.f340722d + "次";
                int i = this.f340722d;
                if (i >= 5 && i < 10) {
                    str = "开发者调试在" + (10 - this.f340722d) + "次后开启";
                    if (aVar != null) {
                        aVar.mo172289a(str, 1).mo172291b();
                    }
                } else if (i == 10) {
                    this.f340720b = true;
                    str = "开发者调试已开启";
                    if (aVar != null) {
                        aVar.mo172289a(str, 1).mo172291b();
                    }
                }
                m157601a(5, C0949kl.f2233c, str);
                return;
            }
            this.f340722d = 0;
            this.f340721c = 0;
            this.f340720b = false;
        }
    }

    /* renamed from: a */
    public final void mo172301a(boolean z, String... strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                this.f340723e.remove(str);
                if (z) {
                    this.f340723e.put(str, f340719f);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo172300a(boolean z, int i, String... strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                this.f340723e.remove(str);
                if (z) {
                    this.f340723e.put(str, new int[]{i});
                }
            }
        }
    }

    /* renamed from: a */
    private void m157601a(int i, String str, String str2) {
        m157602a(i, str, str2, (Throwable) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m157602a(int i, String str, String str2, Throwable th) {
        if (!C0949kl.f2233c.equals(str)) {
            str = TextUtils.isEmpty(str) ? C0949kl.f2233c : "TMS-".concat(String.valueOf(str));
        }
        if (th != null) {
            switch (i) {
                case 7:
                    Log.wtf(str, str2, th);
                    break;
            }
        } else {
            Log.println(i, str, str2);
        }
        if (this.f340726i) {
            if (th != null) {
                str2 = str2 + " [error]:" + th.getMessage();
            }
            System.out.println("[" + str + "]:" + str2);
        }
    }

    /* renamed from: a */
    public final void mo172299a(boolean z) {
        this.f340726i = z;
    }

    /* renamed from: a */
    public final void mo172298a(String str, Throwable th) {
        if (mo172304a(C0949kl.f2233c)) {
            m157602a(2, C0949kl.f2233c, str, th);
        }
    }

    /* renamed from: a */
    public final void mo172295a(final File file, final String str, final String str2) {
        if (mo172304a(C0949kl.f2233c) && !TextUtils.isEmpty(str2)) {
            new Thread(new Runnable() {
                public final void run() {
                    String str;
                    File file = new File(file, str + "-" + C113891ko.m157604d() + ".log");
                    if (!file.exists()) {
                        C113884kf.m157489a(file);
                        str = C113891ko.m157605e() + str2;
                    } else {
                        str = str2 + "\n";
                    }
                    if (file.length() >= 2097152) {
                        File file2 = null;
                        boolean z = false;
                        int i = 1;
                        while (true) {
                            if (i > 500) {
                                break;
                            }
                            file2 = new File(file.getParent(), file.getName() + ".part" + i);
                            if (!file2.exists()) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                        if (z) {
                            C113884kf.m157490a(file, file2);
                            C113884kf.m157489a(file);
                        }
                    }
                    C113884kf.m157502c(file, str);
                }
            }).start();
        }
    }
}
