package com.tencent.matrix.lifecycle.supervisor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.lifecycle.C80392a0;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.IForegroundStatefulOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p723vf.C118672d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SubordinatePacemaker;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class SubordinatePacemaker extends BroadcastReceiver {

    /* renamed from: a */
    public static String f235430a;

    /* renamed from: b */
    public static final C13601g f235431b = C36568h.m40985a(C28662b.f78635d);

    /* renamed from: c */
    public static volatile C80407h f235432c;

    /* renamed from: d */
    public static C32224a<C13598b0> f235433d;

    /* renamed from: e */
    public static final SubordinatePacemaker f235434e = new SubordinatePacemaker();

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker$b */
    public static final class C28662b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C28662b f78635d = new C28662b();

        public C28662b() {
            super(0);
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            String str = SubordinatePacemaker.f235430a;
            C87412m.m108591d(str);
            sb.append(str);
            sb.append(".matrix.permission.PROCESS_SUPERVISOR");
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker$a */
    public static final class C80460a implements Runnable {

        /* renamed from: d */
        public static final C80460a f235435d = new C80460a();

        public final void run() {
            C118672d.m167353c(ProcessSupervisor.f235421k.mo111975b(), "SubordinatePacemaker: callback when supervisor installed", new Object[0]);
            String str = SubordinatePacemaker.f235430a;
            C32224a<C13598b0> aVar = SubordinatePacemaker.f235433d;
            if (aVar != null) {
                C13598b0 invoke = aVar.invoke();
            }
        }
    }

    private SubordinatePacemaker() {
    }

    /* renamed from: a */
    public final void mo111985a(Context context) {
        if (f235432c != null) {
            ProcessUILifecycleOwner.f235399x.getClass();
            IForegroundStatefulOwner iForegroundStatefulOwner = ProcessUILifecycleOwner.f235390o;
            C80407h hVar = f235432c;
            C87412m.m108591d(hVar);
            iForegroundStatefulOwner.removeObserver(hVar);
            f235432c = null;
            String b = ProcessSupervisor.f235421k.mo111975b();
            if (context != null) {
                try {
                    context.unregisterReceiver(this);
                } catch (Throwable th) {
                    C118672d.m167354d(b, th, "", new Object[0]);
                }
            }
            C118672d.m167353c(ProcessSupervisor.f235421k.mo111975b(), "SubordinatePacemaker: uninstalled", new Object[0]);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 465198915 && action.equals("SUPERVISOR_INSTALLED")) {
            C80392a0.f235326f.mo111887a().post(C80460a.f235435d);
        }
    }
}
