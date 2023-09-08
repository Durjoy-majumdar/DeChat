package com.tencent.matrix.lifecycle.supervisor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.IForegroundStatefulOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.matrix.lifecycle.supervisor.SupervisorService;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p723vf.C118672d;
import p723vf.C90779e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SupervisorPacemaker;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class SupervisorPacemaker extends BroadcastReceiver {

    /* renamed from: a */
    public static String f235436a;

    /* renamed from: b */
    public static final C13601g f235437b = C36568h.m40985a(C28663a.f78636d);

    /* renamed from: c */
    public static volatile C80407h f235438c;

    /* renamed from: d */
    public static final SupervisorPacemaker f235439d = new SupervisorPacemaker();

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.SupervisorPacemaker$a */
    public static final class C28663a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C28663a f78636d = new C28663a();

        public C28663a() {
            super(0);
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            String str = SupervisorPacemaker.f235436a;
            C87412m.m108591d(str);
            sb.append(str);
            sb.append(".matrix.permission.PROCESS_SUPERVISOR");
            return sb.toString();
        }
    }

    private SupervisorPacemaker() {
    }

    /* renamed from: a */
    public final void mo111988a(Context context) {
        String str = C90779e.f260690b;
        if (str == null) {
            str = context.getPackageName();
            C90779e.f260690b = str;
        }
        f235436a = str;
        IntentFilter intentFilter = new IntentFilter();
        ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
        if (processSupervisor.mo111977d()) {
            intentFilter.addAction("TELL_SUPERVISOR_FOREGROUND");
            if (context != null) {
                context.registerReceiver(this, intentFilter, (String) ((C36570n) f235437b).getValue(), (Handler) null);
            }
            C118672d.m167353c(processSupervisor.mo111975b(), "pacemaker: receiver installed", new Object[0]);
        } else if (f235438c == null) {
            f235438c = new C80497m(context);
            ProcessUILifecycleOwner.f235399x.getClass();
            IForegroundStatefulOwner iForegroundStatefulOwner = ProcessUILifecycleOwner.f235390o;
            C80407h hVar = f235438c;
            C87412m.m108591d(hVar);
            iForegroundStatefulOwner.observeForever(hVar);
            C118672d.m167353c(processSupervisor.mo111975b(), "pacemaker: install pacemaker", new Object[0]);
        }
    }

    public void onReceive(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == -1689097108 && action.equals("TELL_SUPERVISOR_FOREGROUND")) {
            ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
            processSupervisor.getClass();
            C80496l lVar = ProcessSupervisor.f235414d;
            if (lVar == null || true != lVar.f235498a) {
                C118672d.m167352b(processSupervisor.mo111975b(), "supervisor was disabled", new Object[0]);
            } else if (!processSupervisor.mo111977d()) {
                C118672d.m167352b(processSupervisor.mo111975b(), "ERROR: this is NOT supervisor process", new Object[0]);
            } else {
                String stringExtra = intent.getStringExtra("KEY_PROCESS_NAME");
                int intExtra = intent.getIntExtra("KEY_PROCESS_PID", -1);
                String b = processSupervisor.mo111975b();
                C118672d.m167353c(b, "pacemaker: receive TELL_SUPERVISOR_FOREGROUND from " + intExtra + '-' + stringExtra, new Object[0]);
                SupervisorService.C80462a aVar = SupervisorService.f235443o;
                Context applicationContext = context.getApplicationContext();
                C87412m.m108593f(applicationContext, "context.applicationContext");
                aVar.mo111999a(applicationContext);
            }
        }
    }
}
