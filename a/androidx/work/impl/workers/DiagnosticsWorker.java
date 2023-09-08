package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.work.C113041b;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p1014o4.C117682c;
import p1014o4.C117693m;
import p1206p4.C117979k;
import p1221x4.C118834g;
import p1221x4.C118835h;
import p1221x4.C118836i;
import p1221x4.C118840k;
import p1221x4.C118841l;
import p1221x4.C118847o;
import p1221x4.C118849p;
import p1221x4.C118850q;
import p1221x4.C118860s;
import p1221x4.C118861t;
import p1221x4.C118863u;
import p1223z3.C119046i;
import p452b4.C113139b;
import p452b4.C113140c;

public class DiagnosticsWorker extends Worker {

    /* renamed from: j */
    public static final String f338451j = C117693m.m165967e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public static String m154734i(C118840k kVar, C118860s sVar, C118835h hVar, List<C118847o> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"}));
        for (C118847o next : list) {
            C118834g a = ((C118836i) hVar).mo183539a(next.f355541a);
            Integer valueOf = a != null ? Integer.valueOf(a.f355530b) : null;
            String str = next.f355541a;
            C118841l lVar = (C118841l) kVar;
            lVar.getClass();
            C119046i c = C119046i.m167801c("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                c.bindNull(1);
            } else {
                c.bindString(1, str);
            }
            lVar.f355536a.mo183702b();
            Cursor a2 = C113140c.m154797a(lVar.f355536a, c, false, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    arrayList.add(a2.getString(0));
                }
                a2.close();
                c.mo183710d();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{next.f355541a, next.f355543c, valueOf, next.f355542b.name(), TextUtils.join(",", arrayList), TextUtils.join(",", ((C118861t) sVar).mo183568a(next.f355541a))}));
            } catch (Throwable th) {
                a2.close();
                c.mo183710d();
                throw th;
            }
        }
        return sb.toString();
    }

    /* renamed from: h */
    public ListenableWorker.C113032a mo165518h() {
        C119046i iVar;
        C118835h hVar;
        C118860s sVar;
        C118840k kVar;
        int i;
        WorkDatabase workDatabase = C117979k.m166386b(this.f338326d).f352606c;
        C118849p n = workDatabase.mo165532n();
        C118840k l = workDatabase.mo165530l();
        C118860s o = workDatabase.mo165533o();
        C118835h k = workDatabase.mo165529k();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1);
        C118850q qVar = (C118850q) n;
        qVar.getClass();
        C119046i c = C119046i.m167801c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        c.bindLong(1, currentTimeMillis);
        qVar.f355561a.mo183702b();
        Cursor a = C113140c.m154797a(qVar.f355561a, c, false, (CancellationSignal) null);
        try {
            int a2 = C113139b.m154796a(a, "required_network_type");
            int a3 = C113139b.m154796a(a, "requires_charging");
            int a4 = C113139b.m154796a(a, "requires_device_idle");
            int a5 = C113139b.m154796a(a, "requires_battery_not_low");
            int a6 = C113139b.m154796a(a, "requires_storage_not_low");
            int a7 = C113139b.m154796a(a, "trigger_content_update_delay");
            int a8 = C113139b.m154796a(a, "trigger_max_content_delay");
            int a9 = C113139b.m154796a(a, "content_uri_triggers");
            int a15 = C113139b.m154796a(a, "id");
            int a16 = C113139b.m154796a(a, "state");
            C118835h hVar2 = k;
            int a17 = C113139b.m154796a(a, "worker_class_name");
            C118840k kVar2 = l;
            int a18 = C113139b.m154796a(a, "input_merger_class_name");
            C118860s sVar2 = o;
            int a19 = C113139b.m154796a(a, "input");
            C118849p pVar = n;
            int a25 = C113139b.m154796a(a, "output");
            iVar = c;
            try {
                int a26 = C113139b.m154796a(a, "initial_delay");
                int a27 = C113139b.m154796a(a, "interval_duration");
                int a28 = C113139b.m154796a(a, "flex_duration");
                int a29 = C113139b.m154796a(a, "run_attempt_count");
                int a35 = C113139b.m154796a(a, "backoff_policy");
                int a36 = C113139b.m154796a(a, "backoff_delay_duration");
                int a37 = C113139b.m154796a(a, "period_start_time");
                int a38 = C113139b.m154796a(a, "minimum_retention_duration");
                int a39 = C113139b.m154796a(a, "schedule_requested_at");
                int a44 = C113139b.m154796a(a, "run_in_foreground");
                int a45 = C113139b.m154796a(a, "out_of_quota_policy");
                int i2 = a25;
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    String string = a.getString(a15);
                    int i3 = a15;
                    String string2 = a.getString(a17);
                    int i4 = a17;
                    C117682c cVar = new C117682c();
                    int i5 = a2;
                    cVar.f351995a = C118863u.m167584c(a.getInt(a2));
                    cVar.f351996b = a.getInt(a3) != 0;
                    cVar.f351997c = a.getInt(a4) != 0;
                    cVar.f351998d = a.getInt(a5) != 0;
                    cVar.f351999e = a.getInt(a6) != 0;
                    int i6 = a3;
                    int i7 = a4;
                    cVar.f352000f = a.getLong(a7);
                    cVar.f352001g = a.getLong(a8);
                    cVar.f352002h = C118863u.m167582a(a.getBlob(a9));
                    C118847o oVar = new C118847o(string, string2);
                    oVar.f355542b = C118863u.m167586e(a.getInt(a16));
                    oVar.f355544d = a.getString(a18);
                    oVar.f355545e = C113041b.m154667a(a.getBlob(a19));
                    int i8 = i2;
                    oVar.f355546f = C113041b.m154667a(a.getBlob(i8));
                    int i9 = a16;
                    i2 = i8;
                    int i15 = a26;
                    oVar.f355547g = a.getLong(i15);
                    int i16 = a18;
                    int i17 = a27;
                    oVar.f355548h = a.getLong(i17);
                    int i18 = a19;
                    int i19 = a28;
                    oVar.f355549i = a.getLong(i19);
                    int i25 = a29;
                    oVar.f355551k = a.getInt(i25);
                    int i26 = a35;
                    int i27 = i17;
                    oVar.f355552l = C118863u.m167583b(a.getInt(i26));
                    a28 = i19;
                    int i28 = i25;
                    int i29 = a36;
                    oVar.f355553m = a.getLong(i29);
                    int i35 = i26;
                    int i36 = a37;
                    oVar.f355554n = a.getLong(i36);
                    int i37 = i29;
                    a37 = i36;
                    int i38 = a38;
                    oVar.f355555o = a.getLong(i38);
                    a38 = i38;
                    int i39 = a39;
                    oVar.f355556p = a.getLong(i39);
                    int i44 = a44;
                    oVar.f355557q = a.getInt(i44) != 0;
                    int i45 = a45;
                    int i46 = i39;
                    oVar.f355558r = C118863u.m167585d(a.getInt(i45));
                    oVar.f355550j = cVar;
                    arrayList.add(oVar);
                    a45 = i45;
                    a3 = i6;
                    a16 = i9;
                    a18 = i16;
                    a39 = i46;
                    a17 = i4;
                    a4 = i7;
                    a2 = i5;
                    a44 = i44;
                    a26 = i15;
                    a15 = i3;
                    int i47 = i35;
                    a36 = i37;
                    a19 = i18;
                    a27 = i27;
                    a29 = i28;
                    a35 = i47;
                }
                a.close();
                iVar.mo183710d();
                C118850q qVar2 = (C118850q) pVar;
                List<C118847o> d = qVar2.mo183555d();
                List<C118847o> b = qVar2.mo183553b(200);
                if (!arrayList.isEmpty()) {
                    C117693m c2 = C117693m.m165966c();
                    String str = f338451j;
                    i = 0;
                    c2.mo182391d(str, "Recently completed work:\n\n", new Throwable[0]);
                    hVar = hVar2;
                    kVar = kVar2;
                    sVar = sVar2;
                    C117693m.m165966c().mo182391d(str, m154734i(kVar, sVar, hVar, arrayList), new Throwable[0]);
                } else {
                    hVar = hVar2;
                    kVar = kVar2;
                    sVar = sVar2;
                    i = 0;
                }
                if (!((ArrayList) d).isEmpty()) {
                    C117693m c3 = C117693m.m165966c();
                    String str2 = f338451j;
                    c3.mo182391d(str2, "Running work:\n\n", new Throwable[i]);
                    C117693m.m165966c().mo182391d(str2, m154734i(kVar, sVar, hVar, d), new Throwable[i]);
                }
                if (!((ArrayList) b).isEmpty()) {
                    C117693m c4 = C117693m.m165966c();
                    String str3 = f338451j;
                    c4.mo182391d(str3, "Enqueued work:\n\n", new Throwable[i]);
                    C117693m.m165966c().mo182391d(str3, m154734i(kVar, sVar, hVar, b), new Throwable[i]);
                }
                return new ListenableWorker.C113032a.C113035c();
            } catch (Throwable th) {
                th = th;
                a.close();
                iVar.mo183710d();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            iVar = c;
            a.close();
            iVar.mo183710d();
            throw th;
        }
    }
}
