package p1211r4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C113055a;
import j20.C117292a;
import k20.C9556a;
import p1014o4.C117693m;
import p1206p4.C117979k;
import p1221x4.C118830d;
import p1221x4.C118832f;
import p1221x4.C118834g;
import p1221x4.C118836i;
import p1222y4.C118921f;

/* renamed from: r4.a */
public class C118222a {

    /* renamed from: a */
    public static final String f353371a = C117693m.m165967e("Alarms");

    /* renamed from: a */
    public static void m166778a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C113055a.m154700a(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service != null && alarmManager != null) {
            C117693m.m165966c().mo182389a(f353371a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            C9556a aVar = new C9556a();
            aVar.mo10233c(service);
            AlarmManager alarmManager2 = alarmManager;
            C117292a.m165358d(alarmManager2, aVar.mo10232b(), "androidx/work/impl/background/systemalarm/Alarms", "cancelExactAlarm", "(Landroid/content/Context;Ljava/lang/String;I)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
            alarmManager.cancel((PendingIntent) aVar.mo10231a(0));
            C117292a.m165359e(alarmManager2, "androidx/work/impl/background/systemalarm/Alarms", "cancelExactAlarm", "(Landroid/content/Context;Ljava/lang/String;I)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        }
    }

    /* renamed from: b */
    public static void m166779b(Context context, C117979k kVar, String str, long j) {
        int intValue;
        WorkDatabase workDatabase = kVar.f352606c;
        C118836i iVar = (C118836i) workDatabase.mo165529k();
        C118834g a = iVar.mo183539a(str);
        if (a != null) {
            m166778a(context, str, a.f355530b);
            m166780c(context, str, a.f355530b, j);
            return;
        }
        synchronized (C118921f.class) {
            workDatabase.mo183703c();
            try {
                Long a2 = ((C118832f) workDatabase.mo165528j()).mo183535a("next_alarm_manager_id");
                int i = 0;
                intValue = a2 != null ? a2.intValue() : 0;
                if (intValue != Integer.MAX_VALUE) {
                    i = intValue + 1;
                }
                ((C118832f) workDatabase.mo165528j()).mo183536b(new C118830d("next_alarm_manager_id", (long) i));
                workDatabase.mo183706h();
            } finally {
                workDatabase.mo183704f();
            }
        }
        iVar.mo183540b(new C118834g(str, intValue));
        m166780c(context, str, intValue, j);
    }

    /* renamed from: c */
    public static void m166780c(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C113055a.m154700a(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
