package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C113063a;
import java.util.ArrayList;
import java.util.UUID;
import p1014o4.C117693m;
import p1160w4.C118740b;
import p1169a5.C112758b;
import p1206p4.C117971d;
import p1206p4.C117979k;
import p1222y4.C118916a;

public class SystemForegroundService extends LifecycleService implements C113063a.C113064a {

    /* renamed from: i */
    public static final String f338423i = C117693m.m165967e("SystemFgService");

    /* renamed from: e */
    public Handler f338424e;

    /* renamed from: f */
    public boolean f338425f;

    /* renamed from: g */
    public C113063a f338426g;

    /* renamed from: h */
    public NotificationManager f338427h;

    /* renamed from: a */
    public final void mo165565a() {
        this.f338424e = new Handler(Looper.getMainLooper());
        this.f338427h = (NotificationManager) getApplicationContext().getSystemService("notification");
        C113063a aVar = new C113063a(getApplicationContext());
        this.f338426g = aVar;
        if (aVar.f338438p != null) {
            C117693m.m165966c().mo182390b(C113063a.f338428q, "A callback already exists.", new Throwable[0]);
        } else {
            aVar.f338438p = this;
        }
    }

    public void onCreate() {
        super.onCreate();
        mo165565a();
    }

    public void onDestroy() {
        super.onDestroy();
        C113063a aVar = this.f338426g;
        aVar.f338438p = null;
        synchronized (aVar.f338432g) {
            aVar.f338437o.mo183176c();
        }
        C117971d dVar = aVar.f338430e.f352609f;
        synchronized (dVar.f352583q) {
            ((ArrayList) dVar.f352582p).remove(aVar);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f338425f) {
            C117693m.m165966c().mo182391d(f338423i, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            C113063a aVar = this.f338426g;
            aVar.f338438p = null;
            synchronized (aVar.f338432g) {
                aVar.f338437o.mo183176c();
            }
            C117971d dVar = aVar.f338430e.f352609f;
            synchronized (dVar.f352583q) {
                ((ArrayList) dVar.f352582p).remove(aVar);
            }
            mo165565a();
            this.f338425f = false;
        }
        if (intent == null) {
            return 3;
        }
        C113063a aVar2 = this.f338426g;
        aVar2.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C117693m.m165966c().mo182391d(C113063a.f338428q, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = aVar2.f338430e.f352606c;
            ((C112758b) aVar2.f338431f).mo164514a(new C118740b(aVar2, workDatabase, stringExtra));
            aVar2.mo165566c(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            aVar2.mo165566c(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            C117693m.m165966c().mo182391d(C113063a.f338428q, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            C117979k kVar = aVar2.f338430e;
            UUID fromString = UUID.fromString(stringExtra2);
            kVar.getClass();
            ((C112758b) kVar.f352607d).mo164514a(new C118916a(kVar, fromString));
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            C117693m.m165966c().mo182391d(C113063a.f338428q, "Stopping foreground service", new Throwable[0]);
            C113063a.C113064a aVar3 = aVar2.f338438p;
            if (aVar3 == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) aVar3;
            systemForegroundService.f338425f = true;
            C117693m.m165966c().mo182389a(f338423i, "All commands completed.", new Throwable[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
    }
}
