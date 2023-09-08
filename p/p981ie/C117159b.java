package p981ie;

import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import p723vf.C118672d;
import p723vf.C90779e;
import p761yd.C91441c;
import p933be.C113173i;

/* renamed from: ie.b */
public final class C117159b {

    /* renamed from: a */
    public static C117161b f351002a = new C117160a();

    /* renamed from: ie.b$a */
    public class C117160a implements C117161b {

        /* renamed from: a */
        public String f351003a;

        /* renamed from: b */
        public String f351004b;

        /* renamed from: c */
        public C117161b.C117162a<Integer> f351005c;

        /* renamed from: d */
        public C117161b.C117162a<Integer> f351006d;

        /* renamed from: e */
        public C117161b.C117162a<Integer> f351007e;

        /* renamed from: f */
        public C117161b.C117162a<Integer> f351008f;

        /* renamed from: g */
        public C117161b.C117162a<Integer> f351009g;

        /* renamed from: h */
        public C117161b.C117162a<Integer> f351010h;
    }

    /* renamed from: ie.b$b */
    public interface C117161b {

        /* renamed from: ie.b$b$a */
        public static final class C117162a<T extends Number> {

            /* renamed from: a */
            public final T f351011a;

            /* renamed from: b */
            public final long f351012b;

            /* renamed from: c */
            public final long f351013c = SystemClock.uptimeMillis();

            public C117162a(T t, long j) {
                this.f351011a = t;
                this.f351012b = j;
            }

            /* renamed from: a */
            public boolean mo181083a() {
                return SystemClock.uptimeMillis() - this.f351013c >= this.f351012b;
            }
        }
    }

    /* renamed from: a */
    public static String m165200a(String str) {
        RandomAccessFile randomAccessFile;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
            String readLine = randomAccessFile.readLine();
            randomAccessFile.close();
            return readLine;
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.battery.Utils", th, "cat file fail", new Object[0]);
            return null;
        }
        throw th;
    }

    /* renamed from: b */
    public static int m165201b(Context context, boolean z) {
        C117160a aVar = (C117160a) f351002a;
        if (z) {
            return 1;
        }
        C117161b.C117162a<Integer> aVar2 = aVar.f351006d;
        if (aVar2 != null && !aVar2.mo181083a()) {
            return ((Integer) aVar.f351006d.f351011a).intValue();
        }
        Integer valueOf = Integer.valueOf(m165202c(context, false));
        aVar.f351006d = new C117161b.C117162a<>(valueOf, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        return valueOf.intValue();
    }

    /* renamed from: c */
    public static int m165202c(Context context, boolean z) {
        if (z) {
            return 1;
        }
        if (m165217r(context)) {
            return 3;
        }
        return OverlayWindowLifecycleOwner.INSTANCE.hasOverlayWindow() ? 4 : 2;
    }

    /* renamed from: d */
    public static int m165203d(Context context) {
        Class<?> cls;
        Object newInstance;
        try {
            if (C117173p.f351032f.equals("framework") || C117173p.f351032f.equals("custom")) {
                return (int) C117173p.m165234j(context).mo181084a("battery.capacity");
            }
        } catch (Throwable unused) {
        }
        try {
            cls = Class.forName("com.android.internal.os.PowerProfile");
            newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            return (int) ((Double) cls.getMethod("getAveragePower", new Class[]{String.class}).invoke(newInstance, new Object[]{"battery.capacity"})).doubleValue();
        } catch (Throwable unused2) {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            int intProperty = batteryManager.getIntProperty(1);
            int intProperty2 = batteryManager.getIntProperty(4);
            if (intProperty <= 0 || intProperty2 <= 0) {
                return -1;
            }
            return (int) (((((float) intProperty) / ((float) intProperty2)) * 100.0f) / 1000.0f);
        }
    }

    /* renamed from: e */
    public static long m165204e(Context context) {
        return ((BatteryManager) context.getSystemService("batterymanager")).getLongProperty(2);
    }

    /* renamed from: f */
    public static int m165205f(Context context) {
        C117160a aVar = (C117160a) f351002a;
        C117161b.C117162a<Integer> aVar2 = aVar.f351008f;
        if (aVar2 != null && !aVar2.mo181083a()) {
            return ((Integer) aVar.f351008f.f351011a).intValue();
        }
        Intent g = m165206g(context);
        int i = -1;
        if (g != null) {
            int intExtra = g.getIntExtra(FirebaseAnalytics.C113379b.LEVEL, -1);
            int intExtra2 = g.getIntExtra("scale", -1);
            if (intExtra2 > 0) {
                i = (intExtra * 100) / intExtra2;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        aVar.f351008f = new C117161b.C117162a<>(valueOf, 60000);
        return valueOf.intValue();
    }

    /* renamed from: g */
    public static Intent m165206g(Context context) {
        try {
            return context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception e) {
            C118672d.m167356f("Matrix.battery.Utils", "get ACTION_BATTERY_CHANGED failed: " + e.getMessage(), new Object[0]);
            return null;
        }
    }

    /* renamed from: h */
    public static int m165207h(Context context) {
        C117160a aVar = (C117160a) f351002a;
        C117161b.C117162a<Integer> aVar2 = aVar.f351005c;
        if (aVar2 != null && !aVar2.mo181083a()) {
            return ((Integer) aVar.f351005c.f351011a).intValue();
        }
        Integer valueOf = Integer.valueOf(m165208i(context));
        aVar.f351005c = new C117161b.C117162a<>(valueOf, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        return valueOf.intValue();
    }

    /* renamed from: i */
    public static int m165208i(Context context) {
        try {
            Intent g = m165206g(context);
            if (g == null) {
                return 0;
            }
            return g.getIntExtra("temperature", 0);
        } catch (Exception e) {
            C118672d.m167356f("Matrix.battery.Utils", "get EXTRA_TEMPERATURE failed: " + e.getMessage(), new Object[0]);
            return 0;
        }
    }

    /* renamed from: j */
    public static int m165209j(Context context) {
        Intent g = m165206g(context);
        if (g == null) {
            return -1;
        }
        int intExtra = g.getIntExtra("max_charging_current", -1);
        int intExtra2 = g.getIntExtra("max_charging_voltage", -1);
        if (intExtra <= 0 || intExtra2 <= 0) {
            return -1;
        }
        return ((intExtra / 1000) * (intExtra2 / 1000)) / 1000000;
    }

    /* renamed from: k */
    public static int m165210k() {
        int i;
        C117160a aVar = (C117160a) f351002a;
        C117161b.C117162a<Integer> aVar2 = aVar.f351010h;
        if (aVar2 != null && !aVar2.mo181083a()) {
            return ((Integer) aVar.f351010h.f351011a).intValue();
        }
        try {
            i = new File("/sys/devices/system/cpu/").listFiles(new C87698c()).length;
        } catch (Exception unused) {
            i = Runtime.getRuntime().availableProcessors();
        }
        if (i <= 1) {
            return i;
        }
        Integer valueOf = Integer.valueOf(i);
        aVar.f351010h = new C117161b.C117162a<>(valueOf, 3600000);
        return valueOf.intValue();
    }

    /* renamed from: l */
    public static int[] m165211l() {
        int k = m165210k();
        int[] iArr = new int[k];
        for (int i = 0; i < k; i++) {
            iArr[i] = 0;
            String a = m165200a("/sys/devices/system/cpu/cpu" + i + "/cpufreq/scaling_cur_freq");
            if (!TextUtils.isEmpty(a)) {
                try {
                    iArr[i] = Integer.parseInt(a) / 1000;
                } catch (Exception unused) {
                }
            }
        }
        return iArr;
    }

    /* renamed from: m */
    public static List<int[]> m165212m() {
        int k = m165210k();
        ArrayList arrayList = new ArrayList(k);
        for (int i = 0; i < k; i++) {
            String a = m165200a("/sys/devices/system/cpu/cpu" + i + "/cpufreq/scaling_available_frequencies");
            if (!TextUtils.isEmpty(a)) {
                String[] split = a.split(" ");
                int[] iArr = new int[split.length];
                int length = split.length;
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        iArr[i2] = Integer.parseInt(split[i2]) / 1000;
                    } catch (Exception unused) {
                        iArr[i2] = 0;
                    }
                }
                arrayList.add(iArr);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m165213n(android.content.Context r4) {
        /*
            ie.b$b r0 = f351002a
            ie.b$a r0 = (p981ie.C117159b.C117160a) r0
            ie.b$b$a<java.lang.Integer> r1 = r0.f351007e
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.mo181083a()
            if (r1 != 0) goto L_0x0019
            ie.b$b$a<java.lang.Integer> r4 = r0.f351007e
            T r4 = r4.f351011a
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x004f
        L_0x0019:
            boolean r1 = m165218s(r4)
            if (r1 == 0) goto L_0x0021
            r4 = 1
            goto L_0x003e
        L_0x0021:
            java.lang.String r1 = "power"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch:{ Exception -> 0x0030 }
            android.os.PowerManager r1 = (android.os.PowerManager) r1     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.isInteractive()     // Catch:{ Exception -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            if (r1 != 0) goto L_0x0035
            r4 = 3
            goto L_0x003e
        L_0x0035:
            boolean r4 = m165220u(r4)
            if (r4 == 0) goto L_0x003d
            r4 = 4
            goto L_0x003e
        L_0x003d:
            r4 = 2
        L_0x003e:
            ie.b$b$a r1 = new ie.b$b$a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.<init>(r4, r2)
            r0.f351007e = r1
            int r4 = r4.intValue()
        L_0x004f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p981ie.C117159b.m165213n(android.content.Context):int");
    }

    /* renamed from: o */
    public static String m165214o() {
        C117160a aVar = (C117160a) f351002a;
        if (!TextUtils.isEmpty(aVar.f351003a)) {
            return aVar.f351003a;
        }
        C113173i iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class);
        if (iVar != null) {
            if (C113173i.f338612j == null) {
                synchronized (iVar) {
                    if (C113173i.f338612j == null) {
                        Application application = iVar.f261037e;
                        if (application == null) {
                            if (C91441c.m114729c()) {
                                application = C91441c.m114730d().f262168b;
                            } else {
                                throw new IllegalStateException("BatteryMonitorPlugin is not yet init!");
                            }
                        }
                        C113173i.f338612j = C90779e.m113846a(application);
                    }
                }
            }
            String str = C113173i.f338612j;
            aVar.f351003a = str;
            return str;
        }
        throw new IllegalStateException("BatteryMonitorPlugin is not yet installed!");
    }

    /* renamed from: p */
    public static float m165215p(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                return ((PowerManager) context.getSystemService("power")).getThermalHeadroom(i);
            } catch (Exception e) {
                C118672d.m167356f("Matrix.battery.Utils", "getThermalHeadroom failed: " + e.getMessage(), new Object[0]);
            }
        }
        return -1.0f;
    }

    /* renamed from: q */
    public static int m165216q(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        try {
            return ((PowerManager) context.getSystemService("power")).getCurrentThermalStatus();
        } catch (Exception e) {
            C118672d.m167356f("Matrix.battery.Utils", "getCurrentThermalStatus failed: " + e.getMessage(), new Object[0]);
            return -1;
        }
    }

    /* renamed from: r */
    public static boolean m165217r(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null) {
                return false;
            }
            for (ActivityManager.RunningServiceInfo next : runningServices) {
                if (!TextUtils.isEmpty(next.process) && next.process.startsWith(context.getPackageName()) && next.foreground) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: s */
    public static boolean m165218s(Context context) {
        Intent g = m165206g(context);
        if (g == null) {
            return false;
        }
        int intExtra = g.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: t */
    public static boolean m165219t(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                return powerManager.isDeviceIdleMode();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: u */
    public static boolean m165220u(Context context) {
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                return powerManager.isPowerSaveMode();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: v */
    public static <K, V> Map<K, V> m165221v(Map<K, V> map, Comparator<? super Map.Entry<K, V>> comparator) {
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, comparator);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* renamed from: w */
    public static String m165222w(StackTraceElement[] stackTraceElementArr, boolean z) {
        String str;
        if (stackTraceElementArr == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            if (!className.contains("com.tencent.matrix") && !className.contains("java.lang.reflect") && !className.contains("$Proxy2") && !className.contains("android.os")) {
                arrayList.add(stackTraceElement);
            }
        }
        if (z) {
            C117160a aVar = (C117160a) f351002a;
            if (!TextUtils.isEmpty(aVar.f351004b)) {
                str = aVar.f351004b;
            } else {
                C113173i iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class);
                if (iVar != null) {
                    if (C113173i.f338611i == null) {
                        synchronized (iVar) {
                            if (C113173i.f338611i == null) {
                                Application application = iVar.f261037e;
                                if (application == null) {
                                    if (C91441c.m114729c()) {
                                        application = C91441c.m114730d().f262168b;
                                    } else {
                                        throw new IllegalStateException("BatteryMonitorPlugin is not yet init!");
                                    }
                                }
                                C113173i.f338611i = application.getPackageName();
                            }
                        }
                    }
                    String str2 = C113173i.f338611i;
                    aVar.f351004b = str2;
                    str = str2;
                } else {
                    throw new IllegalStateException("BatteryMonitorPlugin is not yet installed!");
                }
            }
            if (arrayList.size() > 10 && !TextUtils.isEmpty(str)) {
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (listIterator.hasPrevious()) {
                    if (!((StackTraceElement) listIterator.previous()).getClassName().contains(str)) {
                        listIterator.remove();
                    }
                    if (arrayList.size() <= 10) {
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append("\n");
            sb.append("at ");
            sb.append((StackTraceElement) it.next());
        }
        if (sb.length() <= 0) {
            return "";
        }
        return "Matrix" + sb.toString();
    }
}
