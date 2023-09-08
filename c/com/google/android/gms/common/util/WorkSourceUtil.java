package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkSourceUtil {
    public static final String TAG = "WorkSourceUtil";
    private static final int zzaam = Process.myUid();
    private static final Method zzaan = zzdf();
    private static final Method zzaao = zzdg();
    private static final Method zzaap = zzdh();
    private static final Method zzaaq = zzdi();
    private static final Method zzaar = zzdj();
    private static final Method zzaas = zzdk();
    private static final Method zzaat = zzdl();

    private WorkSourceUtil() {
    }

    public static void add(WorkSource workSource, int i, String str) {
        Method method = zzaao;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf(TAG, "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = zzaan;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf(TAG, "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    public static WorkSource fromPackage(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    return fromUidAndPackage(applicationInfo.uid, str);
                }
                if (str.length() != 0) {
                    "Could not get applicationInfo from package: ".concat(str);
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                if (str.length() != 0) {
                    "Could not find package: ".concat(str);
                }
            }
        }
        return null;
    }

    public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String str, String str2) {
        Method method;
        WorkSource workSource = null;
        if (!(context == null || context.getPackageManager() == null || str2 == null || str == null)) {
            int zzc = zzc(context, str);
            if (zzc < 0) {
                return null;
            }
            workSource = new WorkSource();
            Method method2 = zzaas;
            if (method2 == null || (method = zzaat) == null) {
                add(workSource, zzc, str);
            } else {
                try {
                    Object invoke = method2.invoke(workSource, new Object[0]);
                    int i = zzaam;
                    if (zzc != i) {
                        method.invoke(invoke, new Object[]{Integer.valueOf(zzc), str});
                    }
                    method.invoke(invoke, new Object[]{Integer.valueOf(i), str2});
                } catch (Exception unused) {
                }
            }
        }
        return workSource;
    }

    public static WorkSource fromUidAndPackage(int i, String str) {
        WorkSource workSource = new WorkSource();
        add(workSource, i, str);
        return workSource;
    }

    public static int get(WorkSource workSource, int i) {
        Method method = zzaaq;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[]{Integer.valueOf(i)})).intValue();
            } catch (Exception e) {
                Log.wtf(TAG, "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    public static String getName(WorkSource workSource, int i) {
        Method method = zzaar;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.wtf(TAG, "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    public static List<String> getNames(WorkSource workSource) {
        int size = workSource == null ? 0 : size(workSource);
        if (size == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            String name = getName(workSource, i);
            if (!Strings.isEmptyOrWhitespace(name)) {
                arrayList.add(name);
            }
        }
        return arrayList;
    }

    public static boolean hasWorkSourcePermission(Context context) {
        return (context == null || context.getPackageManager() == null || Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    public static int size(WorkSource workSource) {
        Method method = zzaap;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf(TAG, "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    private static int zzc(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return applicationInfo.uid;
            }
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Could not get applicationInfo from package: ".concat(valueOf);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                "Could not find package: ".concat(valueOf2);
            }
            return -1;
        }
    }

    private static Method zzdf() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method zzdg() {
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static Method zzdh() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method zzdi() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method zzdj() {
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static final Method zzdk() {
        if (PlatformVersion.isAtLeastP()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static final Method zzdl() {
        if (PlatformVersion.isAtLeastP()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
