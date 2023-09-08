package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p1014o4.C109939f;
import p1014o4.C117693m;
import p1160w4.C111733c;
import p1160w4.C118741d;
import p1160w4.C118742e;
import p1169a5.C112757a;
import p1169a5.C112758b;
import p1206p4.C117969b;
import p1206p4.C117979k;
import p1214t4.C118384c;
import p1214t4.C118385d;
import p1221x4.C118847o;
import p1222y4.C118928l;

/* renamed from: androidx.work.impl.foreground.a */
public class C113063a implements C118384c, C117969b {

    /* renamed from: q */
    public static final String f338428q = C117693m.m165967e("SystemFgDispatcher");

    /* renamed from: d */
    public Context f338429d;

    /* renamed from: e */
    public C117979k f338430e;

    /* renamed from: f */
    public final C112757a f338431f;

    /* renamed from: g */
    public final Object f338432g = new Object();

    /* renamed from: h */
    public String f338433h;

    /* renamed from: i */
    public final Map<String, C109939f> f338434i;

    /* renamed from: j */
    public final Map<String, C118847o> f338435j;

    /* renamed from: n */
    public final Set<C118847o> f338436n;

    /* renamed from: o */
    public final C118385d f338437o;

    /* renamed from: p */
    public C113064a f338438p;

    /* renamed from: androidx.work.impl.foreground.a$a */
    public interface C113064a {
    }

    public C113063a(Context context) {
        this.f338429d = context;
        C117979k b = C117979k.m166386b(context);
        this.f338430e = b;
        C112757a aVar = b.f352607d;
        this.f338431f = aVar;
        this.f338433h = null;
        this.f338434i = new LinkedHashMap();
        this.f338436n = new HashSet();
        this.f338435j = new HashMap();
        this.f338437o = new C118385d(this.f338429d, aVar, this);
        this.f338430e.f352609f.mo182722a(this);
    }

    /* renamed from: a */
    public static Intent m154719a(Context context, String str, C109939f fVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", fVar.f328934a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fVar.f328935b);
        intent.putExtra("KEY_NOTIFICATION", fVar.f328936c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    public static Intent m154720b(Context context, String str, C109939f fVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", fVar.f328934a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fVar.f328935b);
        intent.putExtra("KEY_NOTIFICATION", fVar.f328936c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public final void mo165566c(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C117693m.m165966c().mo182389a(f338428q, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f338438p != null) {
            this.f338434i.put(stringExtra, new C109939f(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f338433h)) {
                this.f338433h = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f338438p;
                systemForegroundService.f338424e.post(new C111733c(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f338438p;
            systemForegroundService2.f338424e.post(new C118741d(systemForegroundService2, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry value : ((LinkedHashMap) this.f338434i).entrySet()) {
                    i |= ((C109939f) value.getValue()).f328935b;
                }
                C109939f fVar = (C109939f) ((LinkedHashMap) this.f338434i).get(this.f338433h);
                if (fVar != null) {
                    C113064a aVar = this.f338438p;
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar;
                    systemForegroundService3.f338424e.post(new C111733c(systemForegroundService3, fVar.f328934a, fVar.f328936c, i));
                }
            }
        }
    }

    /* renamed from: d */
    public void mo165549d(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                C117693m.m165966c().mo182389a(f338428q, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                C117979k kVar = this.f338430e;
                ((C112758b) kVar.f352607d).mo164514a(new C118928l(kVar, next, true));
            }
        }
    }

    /* renamed from: e */
    public void mo165545e(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.f338432g) {
            C118847o oVar = (C118847o) ((HashMap) this.f338435j).remove(str);
            if (oVar != null ? ((HashSet) this.f338436n).remove(oVar) : false) {
                this.f338437o.mo183175b(this.f338436n);
            }
        }
        C109939f remove = this.f338434i.remove(str);
        if (str.equals(this.f338433h) && this.f338434i.size() > 0) {
            Iterator it = ((LinkedHashMap) this.f338434i).entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f338433h = (String) entry.getKey();
            if (this.f338438p != null) {
                C109939f fVar = (C109939f) entry.getValue();
                C113064a aVar = this.f338438p;
                SystemForegroundService systemForegroundService = (SystemForegroundService) aVar;
                systemForegroundService.f338424e.post(new C111733c(systemForegroundService, fVar.f328934a, fVar.f328936c, fVar.f328935b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f338438p;
                systemForegroundService2.f338424e.post(new C118742e(systemForegroundService2, fVar.f328934a));
            }
        }
        C113064a aVar2 = this.f338438p;
        if (remove != null && aVar2 != null) {
            C117693m.m165966c().mo182389a(f338428q, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove.f328934a), str, Integer.valueOf(remove.f328935b)}), new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar2;
            systemForegroundService3.f338424e.post(new C118742e(systemForegroundService3, remove.f328934a));
        }
    }

    /* renamed from: f */
    public void mo165550f(List<String> list) {
    }
}
