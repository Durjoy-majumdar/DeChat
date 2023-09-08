package fw0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.provider.ContactsContract;
import com.tencent.p014mm.booter.TrafficStatsReceiver;
import com.tencent.p014mm.feature.performance.C80860a;
import com.tencent.p014mm.modelfriend.AddrBookObserver;
import com.tencent.p014mm.modelstat.WatchDogPushReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import jc3.C117344c;
import k20.C9556a;
import p447aw.C103918d;
import p970gg.C87186a;

/* renamed from: fw0.g */
public class C87103g implements C117344c {

    /* renamed from: d */
    public AddrBookObserver f252704d;

    /* renamed from: e */
    public WatchDogPushReceiver f252705e;

    /* renamed from: f */
    public TrafficStatsReceiver f252706f;

    /* renamed from: b */
    public void mo119071b(Service service) {
        Service service2 = service;
        if (this.f252704d != null) {
            service.getContentResolver().unregisterContentObserver(this.f252704d);
            this.f252704d = null;
        }
        service2.unregisterReceiver(this.f252705e);
        service2.unregisterReceiver(this.f252706f);
        this.f252706f.getClass();
        Intent intent = new Intent("com.tencent.mm.TrafficStatsReceiver");
        Log.m105925i("MicroMsg.AlarmHelper", "cancel(requestCode:%s intent:%s flags:%s)", 111, intent, 268435456);
        AlarmManager alarmManager = (AlarmManager) service2.getSystemService("alarm");
        if (alarmManager == null) {
            Log.m105921e("MicroMsg.AlarmHelper", "cancel(requestCode:%s): am == null", 111);
            return;
        }
        PendingIntent b = C87186a.m108239b(service2, 111, intent, 268435456, true);
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            C117292a.m165358d(alarmManager, aVar.mo10232b(), "com/tencent/mm/alarm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/content/Intent;IZ)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
            alarmManager.cancel((PendingIntent) aVar.mo10231a(0));
            C117292a.m165359e(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/content/Intent;IZ)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AlarmHelper", "cancel Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            C87186a.C87187a aVar2 = C87186a.f252847a;
            if (aVar2 != null) {
                ((C80860a) aVar2).mo112619b(111, 2, C87186a.m108240c());
            }
        }
    }

    /* renamed from: i */
    public void mo119072i(Service service) {
        Uri uri;
        boolean z = Build.VERSION.SDK_INT < 26;
        if (!z) {
            z = ((C103918d) C86312j.m106911c(C103918d.class)).Lb0(service.getApplicationContext(), "android.permission.READ_CONTACTS");
        }
        if (z) {
            try {
                this.f252704d = new AddrBookObserver(service);
                ContentResolver contentResolver = service.getContentResolver();
                try {
                    uri = ContactsContract.Contacts.CONTENT_URI;
                } catch (Exception unused) {
                    uri = null;
                }
                contentResolver.registerContentObserver(uri, true, this.f252704d);
            } catch (Exception e) {
                this.f252704d = null;
                Log.m105921e("MicroMsg.CoreService", "onCreate registerContentObserver() Exception = %s", e.getMessage());
            }
        }
        WatchDogPushReceiver watchDogPushReceiver = new WatchDogPushReceiver();
        this.f252705e = watchDogPushReceiver;
        service.registerReceiver(watchDogPushReceiver, new IntentFilter("com.tencent.mm.WatchDogPushReceiver"));
        TrafficStatsReceiver trafficStatsReceiver = new TrafficStatsReceiver();
        this.f252706f = trafficStatsReceiver;
        service.registerReceiver(trafficStatsReceiver, new IntentFilter("com.tencent.mm.TrafficStatsReceiver"));
        this.f252706f.getClass();
        C87186a.m108242e(service, 111, 3, SystemClock.elapsedRealtime(), 300000, new Intent("com.tencent.mm.TrafficStatsReceiver"), 268435456);
        Log.m105925i("MicroMsg.TrafficStats", "Register alarm, interval: %d ms", 300000L);
    }
}
