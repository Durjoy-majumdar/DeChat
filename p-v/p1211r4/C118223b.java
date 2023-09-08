package p1211r4;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C113055a;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p1014o4.C117693m;
import p1206p4.C117973e;
import p1221x4.C118847o;

/* renamed from: r4.b */
public class C118223b implements C117973e {

    /* renamed from: e */
    public static final String f353372e = C117693m.m165967e("SystemAlarmScheduler");

    /* renamed from: d */
    public final Context f353373d;

    public C118223b(Context context) {
        this.f353373d = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo182730a(String str) {
        Context context = this.f353373d;
        String str2 = C113055a.f338384g;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.f353373d.startService(intent);
    }

    /* renamed from: b */
    public boolean mo182731b() {
        return true;
    }

    /* renamed from: c */
    public void mo182732c(C118847o... oVarArr) {
        for (C118847o oVar : oVarArr) {
            C117693m.m165966c().mo182389a(f353372e, String.format("Scheduling work with workSpecId %s", new Object[]{oVar.f355541a}), new Throwable[0]);
            this.f353373d.startService(C113055a.m154701b(this.f353373d, oVar.f355541a));
        }
    }
}
