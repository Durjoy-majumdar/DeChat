package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import p1168a4.C112754a;
import p1188d4.C116562b;
import p1191e4.C116683a;

/* renamed from: androidx.work.impl.a */
public class C113044a {

    /* renamed from: a */
    public static C112754a f338366a = new C113045a(1, 2);

    /* renamed from: b */
    public static C112754a f338367b = new C113046b(3, 4);

    /* renamed from: c */
    public static C112754a f338368c = new C113047c(4, 5);

    /* renamed from: d */
    public static C112754a f338369d = new C113048d(6, 7);

    /* renamed from: e */
    public static C112754a f338370e = new C113049e(7, 8);

    /* renamed from: f */
    public static C112754a f338371f = new C113050f(8, 9);

    /* renamed from: g */
    public static C112754a f338372g = new C113051g(11, 12);

    /* renamed from: androidx.work.impl.a$a */
    public class C113045a extends C112754a {
        public C113045a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo164510a(C116562b bVar) {
            C116683a aVar = (C116683a) bVar;
            aVar.mo180684c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo180684c("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.mo180684c("DROP TABLE IF EXISTS alarmInfo");
            aVar.mo180684c("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.a$b */
    public class C113046b extends C112754a {
        public C113046b(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo164510a(C116562b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((C116683a) bVar).mo180684c("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.a$c */
    public class C113047c extends C112754a {
        public C113047c(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo164510a(C116562b bVar) {
            C116683a aVar = (C116683a) bVar;
            aVar.mo180684c("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            aVar.mo180684c("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.a$d */
    public class C113048d extends C112754a {
        public C113048d(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo164510a(C116562b bVar) {
            ((C116683a) bVar).mo180684c("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.a$e */
    public class C113049e extends C112754a {
        public C113049e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo164510a(C116562b bVar) {
            ((C116683a) bVar).mo180684c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.a$f */
    public class C113050f extends C112754a {
        public C113050f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo164510a(C116562b bVar) {
            ((C116683a) bVar).mo180684c("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$g */
    public class C113051g extends C112754a {
        public C113051g(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo164510a(C116562b bVar) {
            ((C116683a) bVar).mo180684c("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$h */
    public static class C113052h extends C112754a {

        /* renamed from: c */
        public final Context f338373c;

        public C113052h(Context context, int i, int i2) {
            super(i, i2);
            this.f338373c = context;
        }

        /* renamed from: a */
        public void mo164510a(C116562b bVar) {
            if (this.f337629b >= 10) {
                ((C116683a) bVar).f349940d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f338373c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* renamed from: androidx.work.impl.a$i */
    public static class C113053i extends C112754a {

        /* renamed from: c */
        public final Context f338374c;

        public C113053i(Context context) {
            super(9, 10);
            this.f338374c = context;
        }

        /* renamed from: a */
        public void mo164510a(C116562b bVar) {
            C116683a aVar = (C116683a) bVar;
            aVar.mo180684c("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f338374c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = 0;
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j = 1;
                }
                aVar.mo180682a();
                try {
                    aVar.f349940d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    aVar.f349940d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                    sharedPreferences.edit().clear().apply();
                    aVar.mo180688g();
                } finally {
                    aVar.mo180683b();
                }
            }
            SharedPreferences sharedPreferences2 = this.f338374c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                aVar.mo180682a();
                try {
                    aVar.f349940d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    aVar.f349940d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    aVar.mo180688g();
                } finally {
                    aVar.mo180683b();
                }
            }
        }
    }
}
