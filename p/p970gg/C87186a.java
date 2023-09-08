package p970gg;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.feature.performance.C80860a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gg.a */
public class C87186a {

    /* renamed from: a */
    public static C87187a f252847a;

    /* renamed from: b */
    public static int f252848b;

    /* renamed from: gg.a$a */
    public interface C87187a {
    }

    /* renamed from: a */
    public static void m108238a(Context context, int i, PendingIntent pendingIntent) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = pendingIntent != null ? "no null" : "null";
        Log.m105925i("MicroMsg.AlarmHelper", "cancel(requestCode:%s operation:%s)", objArr);
        if (context == null) {
            Log.m105921e("MicroMsg.AlarmHelper", "cancel(requestCode:%s): context == null", Integer.valueOf(i));
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            Log.m105921e("MicroMsg.AlarmHelper", "cancel(requestCode:%s): am == null", Integer.valueOf(i));
            return;
        }
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(pendingIntent);
            C117292a.m165358d(alarmManager, aVar.mo10232b(), "com/tencent/mm/alarm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/app/PendingIntent;)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
            alarmManager.cancel((PendingIntent) aVar.mo10231a(0));
            C117292a.m165359e(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/app/PendingIntent;)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AlarmHelper", "cancel Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            C87187a aVar2 = f252847a;
            if (aVar2 != null) {
                ((C80860a) aVar2).mo112619b(i, 2, m108240c());
            }
        }
    }

    /* renamed from: b */
    public static PendingIntent m108239b(Context context, int i, Intent intent, int i2, boolean z) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = intent != null ? intent : "null";
        objArr[2] = Integer.valueOf(i2);
        Log.m105925i("MicroMsg.AlarmHelper", "getPendingIntent(requestCode:%s intent:%s flags:%s)", objArr);
        if (context == null) {
            Log.m105921e("MicroMsg.AlarmHelper", "getPendingIntent(requestCode:%s): context == null", Integer.valueOf(i));
            return null;
        }
        if (i >= 100 && i <= 119) {
            return z ? PendingIntent.getBroadcast(context, i, intent, i2) : PendingIntent.getActivity(context, i, intent, i2);
        }
        Log.m105921e("MicroMsg.AlarmHelper", "getPendingIntent(requestCode:%s): requestCode invalid", Integer.valueOf(i));
        return null;
    }

    /* renamed from: c */
    public static String m108240c() {
        C87187a aVar = f252847a;
        return aVar != null ? ((C80860a) aVar).mo112618a() : Util.getStack().toString();
    }

    /* renamed from: d */
    public static PendingIntent m108241d(Context context, int i, int i2, long j, Intent intent, int i3, boolean z) {
        Context context2 = context;
        int i4 = i;
        Intent intent2 = intent;
        int i5 = i3;
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Long.valueOf(j);
        objArr[3] = intent2 != null ? intent2 : "null";
        objArr[4] = Integer.valueOf(i3);
        objArr[5] = m108240c();
        Log.m105925i("MicroMsg.AlarmHelper", "set(type:%s requestCode:%s triggerAtMillis:%s intent:%s flags:%s stack:%s)", objArr);
        if (context2 == null) {
            Log.m105921e("MicroMsg.AlarmHelper", "set(requestCode:%s): context == null", Integer.valueOf(i));
            return null;
        }
        AlarmManager alarmManager = (AlarmManager) context2.getSystemService("alarm");
        if (alarmManager == null) {
            Log.m105921e("MicroMsg.AlarmHelper", "set(requestCode:%s): am == null", Integer.valueOf(i));
            return null;
        }
        if (!(i4 >= 100 && i4 <= 119)) {
            Log.m105921e("MicroMsg.AlarmHelper", "set(requestCode:%s): requestCode invalid", Integer.valueOf(i));
            return null;
        }
        PendingIntent broadcast = z ? PendingIntent.getBroadcast(context2, i4, intent2, i5) : PendingIntent.getActivity(context2, i4, intent2, i5);
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(broadcast);
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Long.valueOf(j));
            aVar.mo10233c(Integer.valueOf(i2));
            C117292a.m165358d(alarmManager, aVar.mo10232b(), "com/tencent/mm/alarm/AlarmHelper", "set", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
            int intValue = ((Integer) aVar.mo10231a(0)).intValue();
            C60958c.f173611a.set(aVar);
            alarmManager.set(intValue, ((Long) aVar.mo10231a(1)).longValue(), (PendingIntent) C60958c.m71441a().mo10231a(2));
            C117292a.m165359e(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "set", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AlarmHelper", "set Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            C87187a aVar2 = f252847a;
            if (aVar2 != null) {
                ((C80860a) aVar2).mo112619b(i4, 1, m108240c());
            }
        }
        return broadcast;
    }

    /* renamed from: e */
    public static PendingIntent m108242e(Context context, int i, int i2, long j, long j2, Intent intent, int i3) {
        Context context2 = context;
        int i4 = i;
        Intent intent2 = intent;
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Long.valueOf(j);
        objArr[3] = Long.valueOf(j2);
        objArr[4] = intent2 != null ? intent2 : "null";
        objArr[5] = Integer.valueOf(i3);
        objArr[6] = m108240c();
        Log.m105925i("MicroMsg.AlarmHelper", "setRepeating(type:%s requestCode:%s triggerAtMillis:%s intervalMillis:%s intent:%s flags:%s stack:%s)", objArr);
        PendingIntent pendingIntent = null;
        if (context2 == null) {
            Log.m105921e("MicroMsg.AlarmHelper", "setRepeating(requestCode:%s): context == null", Integer.valueOf(i));
        } else {
            AlarmManager alarmManager = (AlarmManager) context2.getSystemService("alarm");
            if (alarmManager == null) {
                Log.m105921e("MicroMsg.AlarmHelper", "setRepeating(requestCode:%s): am == null", Integer.valueOf(i));
            } else {
                if (!(i4 >= 100 && i4 <= 119)) {
                    Log.m105921e("MicroMsg.AlarmHelper", "setRepeating(requestCode:%s): requestCode invalid", Integer.valueOf(i));
                } else {
                    pendingIntent = PendingIntent.getBroadcast(context2, i4, intent2, i3);
                    try {
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(pendingIntent);
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Long.valueOf(j2));
                        aVar.mo10233c(Long.valueOf(j));
                        aVar.mo10233c(Integer.valueOf(i2));
                        C117292a.m165358d(alarmManager, aVar.mo10232b(), "com/tencent/mm/alarm/AlarmHelper", "setRepeating", "(Landroid/content/Context;IIJJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setRepeating", "(IJJLandroid/app/PendingIntent;)V");
                        int intValue = ((Integer) aVar.mo10231a(0)).intValue();
                        C60958c.f173611a.set(aVar);
                        long longValue = ((Long) aVar.mo10231a(1)).longValue();
                        C9556a a = C60958c.m71441a();
                        C60958c.f173611a.set(a);
                        alarmManager.setRepeating(intValue, longValue, ((Long) a.mo10231a(2)).longValue(), (PendingIntent) C60958c.m71441a().mo10231a(3));
                        C117292a.m165359e(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "setRepeating", "(Landroid/content/Context;IIJJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setRepeating", "(IJJLandroid/app/PendingIntent;)V");
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.AlarmHelper", "setRepeating Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                        C87187a aVar2 = f252847a;
                        if (aVar2 != null) {
                            ((C80860a) aVar2).mo112619b(i4, 1, m108240c());
                        }
                    }
                }
            }
        }
        return pendingIntent;
    }
}
