package com.tencent.mars.ilink.comm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.tencent.mars.ilink.xlog.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

public class AlarmHelper {
    private static final String TAG = "MicroMsg.AlarmHelper";
    private byte _hellAccFlag_;

    public static void cancel(Context context, PendingIntent pendingIntent) {
        Object[] objArr = new Object[1];
        objArr[0] = pendingIntent != null ? pendingIntent.toString() : "null";
        Log.m160923d(TAG, "cancel(operation:%s)", objArr);
        if (context == null) {
            Log.m160924e(TAG, "cancel: context == null");
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            Log.m160924e(TAG, "cancel: am == null");
            return;
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(pendingIntent);
        AlarmManager alarmManager2 = alarmManager;
        C117292a.m165358d(alarmManager2, aVar.mo10232b(), "com/tencent/mars/ilink/comm/AlarmHelper", "cancel", "(Landroid/content/Context;Landroid/app/PendingIntent;)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((PendingIntent) aVar.mo10231a(0));
        C117292a.m165359e(alarmManager2, "com/tencent/mars/ilink/comm/AlarmHelper", "cancel", "(Landroid/content/Context;Landroid/app/PendingIntent;)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
    }

    public static PendingIntent getPendingIntent(Context context, int i, Intent intent, int i2) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = intent != null ? intent : "null";
        objArr[2] = Integer.valueOf(i2);
        Log.m160923d(TAG, "getPendingIntent(requestCode:%s intent:%s flags:%s)", objArr);
        if (context == null) {
            Log.m160925e(TAG, "getPendingIntent(requestCode:%s): context == null", Integer.valueOf(i));
            return null;
        } else if (isRequestCodeValid(i)) {
            return PendingIntent.getBroadcast(context, i, intent, i2);
        } else {
            Log.m160925e(TAG, "getPendingIntent(requestCode:%s): requestCode invalid", Integer.valueOf(i));
            return null;
        }
    }

    private static boolean isRequestCodeValid(int i) {
        return i >= 100 && i <= 119;
    }

    public static PendingIntent set(Context context, int i, int i2, long j, Intent intent, int i3) {
        Context context2 = context;
        Intent intent2 = intent;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Long.valueOf(j);
        objArr[3] = intent2 != null ? intent2 : "null";
        objArr[4] = Integer.valueOf(i3);
        Log.m160923d(TAG, "set(type:%s requestCode:%s triggerAtMillis:%s intent:%s flags:%s)", objArr);
        if (context2 == null) {
            Log.m160925e(TAG, "set(requestCode:%s): context == null", Integer.valueOf(i));
            return null;
        }
        AlarmManager alarmManager = (AlarmManager) context2.getSystemService("alarm");
        if (alarmManager == null) {
            Log.m160925e(TAG, "set(requestCode:%s): am == null", Integer.valueOf(i));
            return null;
        } else if (!isRequestCodeValid(i)) {
            Log.m160925e(TAG, "set(requestCode:%s): requestCode invalid", Integer.valueOf(i));
            return null;
        } else {
            PendingIntent broadcast = PendingIntent.getBroadcast(context2, i, intent2, i3);
            C9556a aVar = new C9556a();
            aVar.mo10233c(broadcast);
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Long.valueOf(j));
            aVar.mo10233c(Integer.valueOf(i2));
            C117292a.m165358d(alarmManager, aVar.mo10232b(), "com/tencent/mars/ilink/comm/AlarmHelper", "set", "(Landroid/content/Context;IIJLandroid/content/Intent;I)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
            int intValue = ((Integer) aVar.mo10231a(0)).intValue();
            C60958c.f173611a.set(aVar);
            alarmManager.set(intValue, ((Long) aVar.mo10231a(1)).longValue(), (PendingIntent) C60958c.m71441a().mo10231a(2));
            C117292a.m165359e(alarmManager, "com/tencent/mars/ilink/comm/AlarmHelper", "set", "(Landroid/content/Context;IIJLandroid/content/Intent;I)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
            return broadcast;
        }
    }

    public static PendingIntent setExact(Context context, int i, int i2, long j, Intent intent, int i3) {
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Long.valueOf(j);
        objArr[3] = intent != null ? intent : "null";
        objArr[4] = Integer.valueOf(i3);
        Log.m160923d(TAG, "setExact(type:%s requestCode:%s triggerAtMillis:%s intent:%s flags:%s)", objArr);
        if (context == null) {
            Log.m160925e(TAG, "setExact(requestCode:%s): context == null", Integer.valueOf(i));
            return null;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            Log.m160925e(TAG, "setExact(requestCode:%s): am == null", Integer.valueOf(i));
            return null;
        } else if (!isRequestCodeValid(i)) {
            Log.m160925e(TAG, "setExact(requestCode:%s): requestCode invalid", Integer.valueOf(i));
            return null;
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                i3 |= 67108864;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, i3);
            try {
                alarmManager.setExact(i2, j, broadcast);
            } catch (Exception e) {
                Log.m160925e(TAG, "setExact Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
            return broadcast;
        }
    }

    public static PendingIntent setRepeating(Context context, int i, int i2, long j, long j2, Intent intent, int i3) {
        Context context2 = context;
        Intent intent2 = intent;
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Long.valueOf(j);
        objArr[3] = Long.valueOf(j2);
        objArr[4] = intent2 != null ? intent2 : "null";
        objArr[5] = Integer.valueOf(i3);
        Log.m160923d(TAG, "setRepeating(type:%s requestCode:%s triggerAtMillis:%s intervalMillis:%s intent:%s flags:%s)", objArr);
        if (context2 == null) {
            Log.m160925e(TAG, "setRepeating(requestCode:%s): context == null", Integer.valueOf(i));
            return null;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            Log.m160925e(TAG, "setRepeating(requestCode:%s): am == null", Integer.valueOf(i));
            return null;
        } else if (!isRequestCodeValid(i)) {
            Log.m160925e(TAG, "setRepeating(requestCode:%s): requestCode invalid", Integer.valueOf(i));
            return null;
        } else {
            PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent2, i3);
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c(broadcast);
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Long.valueOf(j2));
                aVar.mo10233c(Long.valueOf(j));
                aVar.mo10233c(Integer.valueOf(i2));
                C117292a.m165358d(alarmManager, aVar.mo10232b(), "com/tencent/mars/ilink/comm/AlarmHelper", "setRepeating", "(Landroid/content/Context;IIJJLandroid/content/Intent;I)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setRepeating", "(IJJLandroid/app/PendingIntent;)V");
                int intValue = ((Integer) aVar.mo10231a(0)).intValue();
                C60958c.f173611a.set(aVar);
                long longValue = ((Long) aVar.mo10231a(1)).longValue();
                C9556a a = C60958c.m71441a();
                C60958c.f173611a.set(a);
                alarmManager.setRepeating(intValue, longValue, ((Long) a.mo10231a(2)).longValue(), (PendingIntent) C60958c.m71441a().mo10231a(3));
                C117292a.m165359e(alarmManager, "com/tencent/mars/ilink/comm/AlarmHelper", "setRepeating", "(Landroid/content/Context;IIJJLandroid/content/Intent;I)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setRepeating", "(IJJLandroid/app/PendingIntent;)V");
            } catch (Exception e) {
                Log.m160925e(TAG, "setRepeating Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
            return broadcast;
        }
    }

    public static void cancel(Context context, int i, PendingIntent pendingIntent) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = pendingIntent != null ? pendingIntent.toString() : "null";
        Log.m160923d(TAG, "cancel(requestCode:%s operation:%s)", objArr);
        if (context == null) {
            Log.m160925e(TAG, "cancel(requestCode:%s): context == null", Integer.valueOf(i));
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            Log.m160925e(TAG, "cancel(requestCode:%s): am == null", Integer.valueOf(i));
            return;
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(pendingIntent);
        AlarmManager alarmManager2 = alarmManager;
        C117292a.m165358d(alarmManager2, aVar.mo10232b(), "com/tencent/mars/ilink/comm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/app/PendingIntent;)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((PendingIntent) aVar.mo10231a(0));
        C117292a.m165359e(alarmManager2, "com/tencent/mars/ilink/comm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/app/PendingIntent;)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
    }

    public static void cancel(Context context, int i, Intent intent, int i2) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = intent != null ? intent : "null";
        objArr[2] = Integer.valueOf(i2);
        Log.m160923d(TAG, "cancel(requestCode:%s intent:%s flags:%s)", objArr);
        if (context == null) {
            Log.m160925e(TAG, "cancel(requestCode:%s): context == null", Integer.valueOf(i));
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            Log.m160925e(TAG, "cancel(requestCode:%s): am == null", Integer.valueOf(i));
            return;
        }
        PendingIntent pendingIntent = getPendingIntent(context, i, intent, i2);
        C9556a aVar = new C9556a();
        aVar.mo10233c(pendingIntent);
        AlarmManager alarmManager2 = alarmManager;
        C117292a.m165358d(alarmManager2, aVar.mo10232b(), "com/tencent/mars/ilink/comm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/content/Intent;I)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((PendingIntent) aVar.mo10231a(0));
        C117292a.m165359e(alarmManager2, "com/tencent/mars/ilink/comm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/content/Intent;I)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
    }
}
