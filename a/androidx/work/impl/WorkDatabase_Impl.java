package androidx.work.impl;

import android.content.Context;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p1188d4.C116562b;
import p1188d4.C116563c;
import p1191e4.C116683a;
import p1221x4.C118827b;
import p1221x4.C118828c;
import p1221x4.C118831e;
import p1221x4.C118832f;
import p1221x4.C118835h;
import p1221x4.C118836i;
import p1221x4.C118840k;
import p1221x4.C118841l;
import p1221x4.C118843m;
import p1221x4.C118844n;
import p1221x4.C118849p;
import p1221x4.C118850q;
import p1221x4.C118860s;
import p1221x4.C118861t;
import p1223z3.C119028a;
import p1223z3.C119033f;
import p1223z3.C119043h;
import p452b4.C113141d;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: s */
    public static final /* synthetic */ int f338357s = 0;

    /* renamed from: l */
    public volatile C118849p f338358l;

    /* renamed from: m */
    public volatile C118827b f338359m;

    /* renamed from: n */
    public volatile C118860s f338360n;

    /* renamed from: o */
    public volatile C118835h f338361o;

    /* renamed from: p */
    public volatile C118840k f338362p;

    /* renamed from: q */
    public volatile C118843m f338363q;

    /* renamed from: r */
    public volatile C118831e f338364r;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    public class C113043a extends C119043h.C119044a {
        public C113043a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo165536a(C116562b bVar) {
            C116683a aVar = (C116683a) bVar;
            aVar.mo180684c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo180684c("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.mo180684c("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.mo180684c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.mo180684c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.mo180684c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar.mo180684c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo180684c("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.mo180684c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo180684c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo180684c("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.mo180684c("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo180684c("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.mo180684c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.mo180684c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        /* renamed from: b */
        public C119043h.C119045b mo165537b(C116562b bVar) {
            C116562b bVar2 = bVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C113141d.C28252a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new C113141d.C28252a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C113141d.C28253b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new C113141d.C28253b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C113141d.C28254d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new C113141d.C28254d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            C113141d dVar = new C113141d("Dependency", hashMap, hashSet, hashSet2);
            C113141d a = C113141d.m154799a(bVar2, "Dependency");
            if (!dVar.equals(a)) {
                return new C119043h.C119045b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new C113141d.C28252a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new C113141d.C28252a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new C113141d.C28252a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new C113141d.C28252a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new C113141d.C28252a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new C113141d.C28252a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new C113141d.C28252a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new C113141d.C28252a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new C113141d.C28252a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new C113141d.C28252a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new C113141d.C28252a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new C113141d.C28252a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_start_time", new C113141d.C28252a("period_start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new C113141d.C28252a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new C113141d.C28252a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new C113141d.C28252a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new C113141d.C28252a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_type", new C113141d.C28252a("required_network_type", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("requires_charging", new C113141d.C28252a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new C113141d.C28252a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new C113141d.C28252a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new C113141d.C28252a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new C113141d.C28252a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new C113141d.C28252a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new C113141d.C28252a("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C113141d.C28254d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
            hashSet4.add(new C113141d.C28254d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"})));
            C113141d dVar2 = new C113141d("WorkSpec", hashMap2, hashSet3, hashSet4);
            C113141d a2 = C113141d.m154799a(bVar2, "WorkSpec");
            if (!dVar2.equals(a2)) {
                return new C119043h.C119045b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C113141d.C28252a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new C113141d.C28252a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C113141d.C28253b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C113141d.C28254d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            C113141d dVar3 = new C113141d("WorkTag", hashMap3, hashSet5, hashSet6);
            C113141d a3 = C113141d.m154799a(bVar2, "WorkTag");
            if (!dVar3.equals(a3)) {
                return new C119043h.C119045b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C113141d.C28252a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("system_id", new C113141d.C28252a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C113141d.C28253b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C113141d dVar4 = new C113141d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C113141d a4 = C113141d.m154799a(bVar2, "SystemIdInfo");
            if (!dVar4.equals(a4)) {
                return new C119043h.C119045b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C113141d.C28252a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new C113141d.C28252a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C113141d.C28253b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C113141d.C28254d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            C113141d dVar5 = new C113141d("WorkName", hashMap5, hashSet8, hashSet9);
            C113141d a5 = C113141d.m154799a(bVar2, "WorkName");
            if (!dVar5.equals(a5)) {
                return new C119043h.C119045b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C113141d.C28252a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new C113141d.C28252a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C113141d.C28253b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C113141d dVar6 = new C113141d("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C113141d a6 = C113141d.m154799a(bVar2, "WorkProgress");
            if (!dVar6.equals(a6)) {
                return new C119043h.C119045b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + dVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C113141d.C28252a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new C113141d.C28252a("long_value", "INTEGER", false, 0, (String) null, 1));
            C113141d dVar7 = new C113141d("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C113141d a7 = C113141d.m154799a(bVar2, "Preference");
            if (dVar7.equals(a7)) {
                return new C119043h.C119045b(true, (String) null);
            }
            return new C119043h.C119045b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + dVar7 + "\n Found:\n" + a7);
        }
    }

    /* renamed from: d */
    public C119033f mo165534d() {
        return new C119033f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* renamed from: e */
    public C116563c mo165535e(C119028a aVar) {
        C119043h hVar = new C119043h(aVar, new C113043a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = aVar.f356491b;
        String str = aVar.f356492c;
        if (context != null) {
            return aVar.f356490a.mo180546a(new C116563c.C116565b(context, str, hVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    /* renamed from: i */
    public C118827b mo165527i() {
        C118827b bVar;
        if (this.f338359m != null) {
            return this.f338359m;
        }
        synchronized (this) {
            if (this.f338359m == null) {
                this.f338359m = new C118828c(this);
            }
            bVar = this.f338359m;
        }
        return bVar;
    }

    /* renamed from: j */
    public C118831e mo165528j() {
        C118831e eVar;
        if (this.f338364r != null) {
            return this.f338364r;
        }
        synchronized (this) {
            if (this.f338364r == null) {
                this.f338364r = new C118832f(this);
            }
            eVar = this.f338364r;
        }
        return eVar;
    }

    /* renamed from: k */
    public C118835h mo165529k() {
        C118835h hVar;
        if (this.f338361o != null) {
            return this.f338361o;
        }
        synchronized (this) {
            if (this.f338361o == null) {
                this.f338361o = new C118836i(this);
            }
            hVar = this.f338361o;
        }
        return hVar;
    }

    /* renamed from: l */
    public C118840k mo165530l() {
        C118840k kVar;
        if (this.f338362p != null) {
            return this.f338362p;
        }
        synchronized (this) {
            if (this.f338362p == null) {
                this.f338362p = new C118841l(this);
            }
            kVar = this.f338362p;
        }
        return kVar;
    }

    /* renamed from: m */
    public C118843m mo165531m() {
        C118843m mVar;
        if (this.f338363q != null) {
            return this.f338363q;
        }
        synchronized (this) {
            if (this.f338363q == null) {
                this.f338363q = new C118844n(this);
            }
            mVar = this.f338363q;
        }
        return mVar;
    }

    /* renamed from: n */
    public C118849p mo165532n() {
        C118849p pVar;
        if (this.f338358l != null) {
            return this.f338358l;
        }
        synchronized (this) {
            if (this.f338358l == null) {
                this.f338358l = new C118850q(this);
            }
            pVar = this.f338358l;
        }
        return pVar;
    }

    /* renamed from: o */
    public C118860s mo165533o() {
        C118860s sVar;
        if (this.f338360n != null) {
            return this.f338360n;
        }
        synchronized (this) {
            if (this.f338360n == null) {
                this.f338360n = new C118861t(this);
            }
            sVar = this.f338360n;
        }
        return sVar;
    }
}
