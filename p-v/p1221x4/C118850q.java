package p1221x4;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import androidx.work.C113041b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p1014o4.C117682c;
import p1014o4.C117705u;
import p1188d4.C116569f;
import p1191e4.C116683a;
import p1191e4.C116690e;
import p1191e4.C116691f;
import p1221x4.C118847o;
import p1223z3.C119029b;
import p1223z3.C119038g;
import p1223z3.C119046i;
import p1223z3.C119048k;
import p452b4.C113139b;
import p452b4.C113140c;

/* renamed from: x4.q */
public final class C118850q implements C118849p {

    /* renamed from: a */
    public final C119038g f355561a;

    /* renamed from: b */
    public final C119029b<C118847o> f355562b;

    /* renamed from: c */
    public final C119048k f355563c;

    /* renamed from: d */
    public final C119048k f355564d;

    /* renamed from: e */
    public final C119048k f355565e;

    /* renamed from: f */
    public final C119048k f355566f;

    /* renamed from: g */
    public final C119048k f355567g;

    /* renamed from: h */
    public final C119048k f355568h;

    /* renamed from: i */
    public final C119048k f355569i;

    /* renamed from: x4.q$a */
    public class C118851a extends C119029b<C118847o> {
        public C118851a(C118850q qVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: java.io.ObjectOutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.io.ObjectOutputStream} */
        /* JADX WARNING: type inference failed for: r3v21 */
        /* JADX WARNING: type inference failed for: r3v26 */
        /* JADX WARNING: type inference failed for: r3v27 */
        /* JADX WARNING: type inference failed for: r3v41 */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:65|67|(0)|73|74|75) */
        /* JADX WARNING: Can't wrap try/catch for region: R(7:55|56|57|(5:58|59|(2:62|60)|63|64)|81|82|83) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01ce */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01c1 A[SYNTHETIC, Splitter:B:71:0x01c1] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01cb A[SYNTHETIC, Splitter:B:79:0x01cb] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01dd  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo183532d(p1188d4.C116569f r17, java.lang.Object r18) {
            /*
                r16 = this;
                r0 = r18
                x4.o r0 = (p1221x4.C118847o) r0
                java.lang.String r1 = r0.f355541a
                r2 = 1
                if (r1 != 0) goto L_0x0011
                r1 = r17
                e4.e r1 = (p1191e4.C116690e) r1
                r1.bindNull(r2)
                goto L_0x0018
            L_0x0011:
                r3 = r17
                e4.e r3 = (p1191e4.C116690e) r3
                r3.bindString(r2, r1)
            L_0x0018:
                o4.u r1 = r0.f355542b
                int r1 = p1221x4.C118863u.m167587f(r1)
                long r3 = (long) r1
                r1 = r17
                e4.e r1 = (p1191e4.C116690e) r1
                r5 = 2
                r1.bindLong(r5, r3)
                java.lang.String r3 = r0.f355543c
                r4 = 3
                if (r3 != 0) goto L_0x0030
                r1.bindNull(r4)
                goto L_0x0033
            L_0x0030:
                r1.bindString(r4, r3)
            L_0x0033:
                java.lang.String r3 = r0.f355544d
                r6 = 4
                if (r3 != 0) goto L_0x003c
                r1.bindNull(r6)
                goto L_0x003f
            L_0x003c:
                r1.bindString(r6, r3)
            L_0x003f:
                androidx.work.b r3 = r0.f355545e
                byte[] r3 = androidx.work.C113041b.m154668c(r3)
                r7 = 5
                if (r3 != 0) goto L_0x004c
                r1.bindNull(r7)
                goto L_0x004f
            L_0x004c:
                r1.bindBlob(r7, r3)
            L_0x004f:
                androidx.work.b r3 = r0.f355546f
                byte[] r3 = androidx.work.C113041b.m154668c(r3)
                r8 = 6
                if (r3 != 0) goto L_0x005c
                r1.bindNull(r8)
                goto L_0x005f
            L_0x005c:
                r1.bindBlob(r8, r3)
            L_0x005f:
                r3 = 7
                long r8 = r0.f355547g
                r1.bindLong(r3, r8)
                r3 = 8
                long r8 = r0.f355548h
                r1.bindLong(r3, r8)
                r3 = 9
                long r8 = r0.f355549i
                r1.bindLong(r3, r8)
                r3 = 10
                int r8 = r0.f355551k
                long r8 = (long) r8
                r1.bindLong(r3, r8)
                o4.a r3 = r0.f355552l
                int r8 = r3.ordinal()
                java.lang.String r9 = " to int"
                java.lang.String r10 = "Could not convert "
                if (r8 == 0) goto L_0x00a3
                if (r8 != r2) goto L_0x008b
                r3 = 1
                goto L_0x00a4
            L_0x008b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r3)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00a3:
                r3 = 0
            L_0x00a4:
                r8 = 11
                long r12 = (long) r3
                r1.bindLong(r8, r12)
                r3 = 12
                long r12 = r0.f355553m
                r1.bindLong(r3, r12)
                r3 = 13
                long r12 = r0.f355554n
                r1.bindLong(r3, r12)
                r3 = 14
                long r12 = r0.f355555o
                r1.bindLong(r3, r12)
                r3 = 15
                long r12 = r0.f355556p
                r1.bindLong(r3, r12)
                boolean r3 = r0.f355557q
                r8 = 16
                long r12 = (long) r3
                r1.bindLong(r8, r12)
                o4.q r3 = r0.f355558r
                int r8 = r3.ordinal()
                if (r8 == 0) goto L_0x00f2
                if (r8 != r2) goto L_0x00da
                r3 = 1
                goto L_0x00f3
            L_0x00da:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r3)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00f2:
                r3 = 0
            L_0x00f3:
                r8 = 17
                long r12 = (long) r3
                r1.bindLong(r8, r12)
                o4.c r0 = r0.f355550j
                r3 = 23
                r8 = 22
                r12 = 21
                r13 = 20
                r14 = 19
                r15 = 18
                if (r0 == 0) goto L_0x01e3
                o4.n r11 = r0.f351995a
                int r7 = r11.ordinal()
                if (r7 == 0) goto L_0x0143
                if (r7 == r2) goto L_0x0144
                if (r7 == r5) goto L_0x0141
                if (r7 == r4) goto L_0x013f
                if (r7 == r6) goto L_0x013d
                int r2 = android.os.Build.VERSION.SDK_INT
                r4 = 30
                if (r2 < r4) goto L_0x0125
                o4.n r2 = p1014o4.C117695n.TEMPORARILY_UNMETERED
                if (r11 != r2) goto L_0x0125
                r2 = 5
                goto L_0x0144
            L_0x0125:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r11)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x013d:
                r2 = 4
                goto L_0x0144
            L_0x013f:
                r2 = 3
                goto L_0x0144
            L_0x0141:
                r2 = 2
                goto L_0x0144
            L_0x0143:
                r2 = 0
            L_0x0144:
                long r4 = (long) r2
                r1.bindLong(r15, r4)
                boolean r2 = r0.f351996b
                long r4 = (long) r2
                r1.bindLong(r14, r4)
                boolean r2 = r0.f351997c
                long r4 = (long) r2
                r1.bindLong(r13, r4)
                boolean r2 = r0.f351998d
                long r4 = (long) r2
                r1.bindLong(r12, r4)
                boolean r2 = r0.f351999e
                long r4 = (long) r2
                r1.bindLong(r8, r4)
                long r4 = r0.f352000f
                r1.bindLong(r3, r4)
                long r2 = r0.f352001g
                r4 = 24
                r1.bindLong(r4, r2)
                o4.d r0 = r0.f352002h
                java.util.Set<o4.d$a> r2 = r0.f352004a
                java.util.HashSet r2 = (java.util.HashSet) r2
                int r2 = r2.size()
                r3 = 0
                if (r2 != 0) goto L_0x017a
                goto L_0x01d5
            L_0x017a:
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
                r2.<init>()
                java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x01c8, all -> 0x01be }
                r4.<init>(r2)     // Catch:{ IOException -> 0x01c8, all -> 0x01be }
                java.util.Set<o4.d$a> r3 = r0.f352004a     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                java.util.HashSet r3 = (java.util.HashSet) r3     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                int r3 = r3.size()     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                r4.writeInt(r3)     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                java.util.Set<o4.d$a> r0 = r0.f352004a     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
            L_0x0197:
                boolean r3 = r0.hasNext()     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                if (r3 == 0) goto L_0x01b2
                java.lang.Object r3 = r0.next()     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                o4.d$a r3 = (p1014o4.C117684d.C117685a) r3     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                android.net.Uri r5 = r3.f352005a     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                r4.writeUTF(r5)     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                boolean r3 = r3.f352006b     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                r4.writeBoolean(r3)     // Catch:{ IOException -> 0x01b8, all -> 0x01b6 }
                goto L_0x0197
            L_0x01b2:
                r4.close()     // Catch:{ IOException -> 0x01ce }
                goto L_0x01ce
            L_0x01b6:
                r0 = move-exception
                goto L_0x01ba
            L_0x01b8:
                goto L_0x01bc
            L_0x01ba:
                r3 = r4
                goto L_0x01bf
            L_0x01bc:
                r3 = r4
                goto L_0x01c9
            L_0x01be:
                r0 = move-exception
            L_0x01bf:
                if (r3 == 0) goto L_0x01c4
                r3.close()     // Catch:{ IOException -> 0x01c4 }
            L_0x01c4:
                r2.close()     // Catch:{ IOException -> 0x01c7 }
            L_0x01c7:
                throw r0
            L_0x01c8:
            L_0x01c9:
                if (r3 == 0) goto L_0x01ce
                r3.close()     // Catch:{ IOException -> 0x01ce }
            L_0x01ce:
                r2.close()     // Catch:{ IOException -> 0x01d1 }
            L_0x01d1:
                byte[] r3 = r2.toByteArray()
            L_0x01d5:
                if (r3 != 0) goto L_0x01dd
                r0 = 25
                r1.bindNull(r0)
                goto L_0x01ff
            L_0x01dd:
                r0 = 25
                r1.bindBlob(r0, r3)
                goto L_0x01ff
            L_0x01e3:
                r0 = 25
                r1.bindNull(r15)
                r1.bindNull(r14)
                r1.bindNull(r13)
                r1.bindNull(r12)
                r1.bindNull(r8)
                r1.bindNull(r3)
                r2 = 24
                r1.bindNull(r2)
                r1.bindNull(r0)
            L_0x01ff:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1221x4.C118850q.C118851a.mo183532d(d4.f, java.lang.Object):void");
        }
    }

    /* renamed from: x4.q$b */
    public class C118852b extends C119048k {
        public C118852b(C118850q qVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: x4.q$c */
    public class C118853c extends C119048k {
        public C118853c(C118850q qVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: x4.q$d */
    public class C118854d extends C119048k {
        public C118854d(C118850q qVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: x4.q$e */
    public class C118855e extends C119048k {
        public C118855e(C118850q qVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: x4.q$f */
    public class C118856f extends C119048k {
        public C118856f(C118850q qVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: x4.q$g */
    public class C118857g extends C119048k {
        public C118857g(C118850q qVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: x4.q$h */
    public class C118858h extends C119048k {
        public C118858h(C118850q qVar, C119038g gVar) {
            super(gVar);
        }

        /* renamed from: b */
        public String mo183531b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public C118850q(C119038g gVar) {
        this.f355561a = gVar;
        this.f355562b = new C118851a(this, gVar);
        this.f355563c = new C118852b(this, gVar);
        this.f355564d = new C118853c(this, gVar);
        this.f355565e = new C118854d(this, gVar);
        this.f355566f = new C118855e(this, gVar);
        this.f355567g = new C118856f(this, gVar);
        this.f355568h = new C118857g(this, gVar);
        this.f355569i = new C118858h(this, gVar);
        new AtomicBoolean(false);
    }

    /* renamed from: a */
    public void mo183552a(String str) {
        this.f355561a.mo183702b();
        C116691f a = this.f355563c.mo183713a();
        if (str == null) {
            ((C116690e) a).bindNull(1);
        } else {
            ((C116690e) a).bindString(1, str);
        }
        this.f355561a.mo183703c();
        try {
            a = (C116691f) a;
            a.mo180702a();
            this.f355561a.mo183706h();
        } finally {
            this.f355561a.mo183704f();
            this.f355563c.mo183714c(a);
        }
    }

    /* renamed from: b */
    public List<C118847o> mo183553b(int i) {
        C119046i iVar;
        C119046i c = C119046i.m167801c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        c.bindLong(1, (long) i);
        this.f355561a.mo183702b();
        Cursor a = C113140c.m154797a(this.f355561a, c, false, (CancellationSignal) null);
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
            int a17 = C113139b.m154796a(a, "worker_class_name");
            int a18 = C113139b.m154796a(a, "input_merger_class_name");
            int a19 = C113139b.m154796a(a, "input");
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
                    int i9 = i6;
                    i2 = i8;
                    int i15 = a26;
                    oVar.f355547g = a.getLong(i15);
                    int i16 = a18;
                    int i17 = a27;
                    oVar.f355548h = a.getLong(i17);
                    int i18 = i15;
                    int i19 = a5;
                    int i25 = a28;
                    oVar.f355549i = a.getLong(i25);
                    int i26 = a29;
                    oVar.f355551k = a.getInt(i26);
                    int i27 = a35;
                    int i28 = i17;
                    oVar.f355552l = C118863u.m167583b(a.getInt(i27));
                    a28 = i25;
                    int i29 = i19;
                    int i35 = a36;
                    oVar.f355553m = a.getLong(i35);
                    int i36 = i26;
                    int i37 = i27;
                    int i38 = a37;
                    oVar.f355554n = a.getLong(i38);
                    int i39 = i35;
                    a37 = i38;
                    int i44 = a38;
                    oVar.f355555o = a.getLong(i44);
                    int i45 = i36;
                    int i46 = a39;
                    oVar.f355556p = a.getLong(i46);
                    int i47 = a44;
                    oVar.f355557q = a.getInt(i47) != 0;
                    int i48 = a45;
                    int i49 = i46;
                    oVar.f355558r = C118863u.m167585d(a.getInt(i48));
                    oVar.f355550j = cVar;
                    arrayList.add(oVar);
                    a45 = i48;
                    a3 = i9;
                    a18 = i16;
                    a26 = i18;
                    a27 = i28;
                    a29 = i45;
                    a39 = i49;
                    a15 = i3;
                    a17 = i4;
                    a2 = i5;
                    a44 = i47;
                    a38 = i44;
                    a4 = i7;
                    int i54 = i37;
                    a36 = i39;
                    a5 = i29;
                    a35 = i54;
                }
                a.close();
                iVar.mo183710d();
                return arrayList;
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

    /* renamed from: c */
    public List<C118847o> mo183554c(int i) {
        C119046i iVar;
        C119046i c = C119046i.m167801c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c.bindLong(1, (long) i);
        this.f355561a.mo183702b();
        Cursor a = C113140c.m154797a(this.f355561a, c, false, (CancellationSignal) null);
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
            int a17 = C113139b.m154796a(a, "worker_class_name");
            int a18 = C113139b.m154796a(a, "input_merger_class_name");
            int a19 = C113139b.m154796a(a, "input");
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
                    int i9 = i6;
                    i2 = i8;
                    int i15 = a26;
                    oVar.f355547g = a.getLong(i15);
                    int i16 = a18;
                    int i17 = a27;
                    oVar.f355548h = a.getLong(i17);
                    int i18 = i15;
                    int i19 = a5;
                    int i25 = a28;
                    oVar.f355549i = a.getLong(i25);
                    int i26 = a29;
                    oVar.f355551k = a.getInt(i26);
                    int i27 = a35;
                    int i28 = i17;
                    oVar.f355552l = C118863u.m167583b(a.getInt(i27));
                    a28 = i25;
                    int i29 = i19;
                    int i35 = a36;
                    oVar.f355553m = a.getLong(i35);
                    int i36 = i26;
                    int i37 = i27;
                    int i38 = a37;
                    oVar.f355554n = a.getLong(i38);
                    int i39 = i35;
                    a37 = i38;
                    int i44 = a38;
                    oVar.f355555o = a.getLong(i44);
                    int i45 = i36;
                    int i46 = a39;
                    oVar.f355556p = a.getLong(i46);
                    int i47 = a44;
                    oVar.f355557q = a.getInt(i47) != 0;
                    int i48 = a45;
                    int i49 = i46;
                    oVar.f355558r = C118863u.m167585d(a.getInt(i48));
                    oVar.f355550j = cVar;
                    arrayList.add(oVar);
                    a45 = i48;
                    a3 = i9;
                    a18 = i16;
                    a26 = i18;
                    a27 = i28;
                    a29 = i45;
                    a39 = i49;
                    a15 = i3;
                    a17 = i4;
                    a2 = i5;
                    a44 = i47;
                    a38 = i44;
                    a4 = i7;
                    int i54 = i37;
                    a36 = i39;
                    a5 = i29;
                    a35 = i54;
                }
                a.close();
                iVar.mo183710d();
                return arrayList;
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

    /* renamed from: d */
    public List<C118847o> mo183555d() {
        C119046i iVar;
        C119046i c = C119046i.m167801c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f355561a.mo183702b();
        Cursor a = C113140c.m154797a(this.f355561a, c, false, (CancellationSignal) null);
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
            int a17 = C113139b.m154796a(a, "worker_class_name");
            int a18 = C113139b.m154796a(a, "input_merger_class_name");
            int a19 = C113139b.m154796a(a, "input");
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
                int i = a25;
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    String string = a.getString(a15);
                    int i2 = a15;
                    String string2 = a.getString(a17);
                    int i3 = a17;
                    C117682c cVar = new C117682c();
                    int i4 = a2;
                    cVar.f351995a = C118863u.m167584c(a.getInt(a2));
                    cVar.f351996b = a.getInt(a3) != 0;
                    cVar.f351997c = a.getInt(a4) != 0;
                    cVar.f351998d = a.getInt(a5) != 0;
                    cVar.f351999e = a.getInt(a6) != 0;
                    int i5 = a3;
                    int i6 = a4;
                    cVar.f352000f = a.getLong(a7);
                    cVar.f352001g = a.getLong(a8);
                    cVar.f352002h = C118863u.m167582a(a.getBlob(a9));
                    C118847o oVar = new C118847o(string, string2);
                    oVar.f355542b = C118863u.m167586e(a.getInt(a16));
                    oVar.f355544d = a.getString(a18);
                    oVar.f355545e = C113041b.m154667a(a.getBlob(a19));
                    int i7 = i;
                    oVar.f355546f = C113041b.m154667a(a.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = a26;
                    oVar.f355547g = a.getLong(i9);
                    int i15 = a19;
                    int i16 = a27;
                    oVar.f355548h = a.getLong(i16);
                    int i17 = i9;
                    int i18 = a5;
                    int i19 = a28;
                    oVar.f355549i = a.getLong(i19);
                    int i25 = a29;
                    oVar.f355551k = a.getInt(i25);
                    int i26 = a35;
                    int i27 = i16;
                    oVar.f355552l = C118863u.m167583b(a.getInt(i26));
                    a28 = i19;
                    int i28 = i18;
                    int i29 = a36;
                    oVar.f355553m = a.getLong(i29);
                    int i35 = i25;
                    int i36 = i26;
                    int i37 = a37;
                    oVar.f355554n = a.getLong(i37);
                    int i38 = i29;
                    a37 = i37;
                    int i39 = a38;
                    oVar.f355555o = a.getLong(i39);
                    int i44 = i35;
                    int i45 = a39;
                    oVar.f355556p = a.getLong(i45);
                    int i46 = a44;
                    oVar.f355557q = a.getInt(i46) != 0;
                    int i47 = a45;
                    int i48 = i45;
                    oVar.f355558r = C118863u.m167585d(a.getInt(i47));
                    oVar.f355550j = cVar;
                    arrayList.add(oVar);
                    a45 = i47;
                    a3 = i8;
                    a19 = i15;
                    a26 = i17;
                    a27 = i27;
                    a29 = i44;
                    a39 = i48;
                    a15 = i2;
                    a17 = i3;
                    a2 = i4;
                    a44 = i46;
                    a38 = i39;
                    a4 = i6;
                    int i49 = i36;
                    a36 = i38;
                    a5 = i28;
                    a35 = i49;
                }
                a.close();
                iVar.mo183710d();
                return arrayList;
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

    /* renamed from: e */
    public List<C118847o> mo183556e() {
        C119046i iVar;
        C119046i c = C119046i.m167801c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f355561a.mo183702b();
        Cursor a = C113140c.m154797a(this.f355561a, c, false, (CancellationSignal) null);
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
            int a17 = C113139b.m154796a(a, "worker_class_name");
            int a18 = C113139b.m154796a(a, "input_merger_class_name");
            int a19 = C113139b.m154796a(a, "input");
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
                int i = a25;
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    String string = a.getString(a15);
                    int i2 = a15;
                    String string2 = a.getString(a17);
                    int i3 = a17;
                    C117682c cVar = new C117682c();
                    int i4 = a2;
                    cVar.f351995a = C118863u.m167584c(a.getInt(a2));
                    cVar.f351996b = a.getInt(a3) != 0;
                    cVar.f351997c = a.getInt(a4) != 0;
                    cVar.f351998d = a.getInt(a5) != 0;
                    cVar.f351999e = a.getInt(a6) != 0;
                    int i5 = a3;
                    int i6 = a4;
                    cVar.f352000f = a.getLong(a7);
                    cVar.f352001g = a.getLong(a8);
                    cVar.f352002h = C118863u.m167582a(a.getBlob(a9));
                    C118847o oVar = new C118847o(string, string2);
                    oVar.f355542b = C118863u.m167586e(a.getInt(a16));
                    oVar.f355544d = a.getString(a18);
                    oVar.f355545e = C113041b.m154667a(a.getBlob(a19));
                    int i7 = i;
                    oVar.f355546f = C113041b.m154667a(a.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = a26;
                    oVar.f355547g = a.getLong(i9);
                    int i15 = a19;
                    int i16 = a27;
                    oVar.f355548h = a.getLong(i16);
                    int i17 = i9;
                    int i18 = a5;
                    int i19 = a28;
                    oVar.f355549i = a.getLong(i19);
                    int i25 = a29;
                    oVar.f355551k = a.getInt(i25);
                    int i26 = a35;
                    int i27 = i16;
                    oVar.f355552l = C118863u.m167583b(a.getInt(i26));
                    a28 = i19;
                    int i28 = i18;
                    int i29 = a36;
                    oVar.f355553m = a.getLong(i29);
                    int i35 = i25;
                    int i36 = i26;
                    int i37 = a37;
                    oVar.f355554n = a.getLong(i37);
                    int i38 = i29;
                    a37 = i37;
                    int i39 = a38;
                    oVar.f355555o = a.getLong(i39);
                    int i44 = i35;
                    int i45 = a39;
                    oVar.f355556p = a.getLong(i45);
                    int i46 = a44;
                    oVar.f355557q = a.getInt(i46) != 0;
                    int i47 = a45;
                    int i48 = i45;
                    oVar.f355558r = C118863u.m167585d(a.getInt(i47));
                    oVar.f355550j = cVar;
                    arrayList.add(oVar);
                    a45 = i47;
                    a3 = i8;
                    a19 = i15;
                    a26 = i17;
                    a27 = i27;
                    a29 = i44;
                    a39 = i48;
                    a15 = i2;
                    a17 = i3;
                    a2 = i4;
                    a44 = i46;
                    a38 = i39;
                    a4 = i6;
                    int i49 = i36;
                    a36 = i38;
                    a5 = i28;
                    a35 = i49;
                }
                a.close();
                iVar.mo183710d();
                return arrayList;
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

    /* renamed from: f */
    public C117705u mo183557f(String str) {
        C119046i c = C119046i.m167801c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        this.f355561a.mo183702b();
        C117705u uVar = null;
        Cursor a = C113140c.m154797a(this.f355561a, c, false, (CancellationSignal) null);
        try {
            if (a.moveToFirst()) {
                uVar = C118863u.m167586e(a.getInt(0));
            }
            return uVar;
        } finally {
            a.close();
            c.mo183710d();
        }
    }

    /* renamed from: g */
    public List<String> mo183558g(String str) {
        C119046i c = C119046i.m167801c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        this.f355561a.mo183702b();
        Cursor a = C113140c.m154797a(this.f355561a, c, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arrayList.add(a.getString(0));
            }
            return arrayList;
        } finally {
            a.close();
            c.mo183710d();
        }
    }

    /* renamed from: h */
    public List<String> mo183559h(String str) {
        C119046i c = C119046i.m167801c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        this.f355561a.mo183702b();
        Cursor a = C113140c.m154797a(this.f355561a, c, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                arrayList.add(a.getString(0));
            }
            return arrayList;
        } finally {
            a.close();
            c.mo183710d();
        }
    }

    /* renamed from: i */
    public C118847o mo183560i(String str) {
        C119046i iVar;
        C118847o oVar;
        String str2 = str;
        C119046i c = C119046i.m167801c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str2);
        }
        this.f355561a.mo183702b();
        Cursor a = C113140c.m154797a(this.f355561a, c, false, (CancellationSignal) null);
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
            int a17 = C113139b.m154796a(a, "worker_class_name");
            int a18 = C113139b.m154796a(a, "input_merger_class_name");
            int a19 = C113139b.m154796a(a, "input");
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
                if (a.moveToFirst()) {
                    String string = a.getString(a15);
                    String string2 = a.getString(a17);
                    int i = a45;
                    C117682c cVar = new C117682c();
                    cVar.f351995a = C118863u.m167584c(a.getInt(a2));
                    cVar.f351996b = a.getInt(a3) != 0;
                    cVar.f351997c = a.getInt(a4) != 0;
                    cVar.f351998d = a.getInt(a5) != 0;
                    cVar.f351999e = a.getInt(a6) != 0;
                    cVar.f352000f = a.getLong(a7);
                    cVar.f352001g = a.getLong(a8);
                    cVar.f352002h = C118863u.m167582a(a.getBlob(a9));
                    C118847o oVar2 = new C118847o(string, string2);
                    oVar2.f355542b = C118863u.m167586e(a.getInt(a16));
                    oVar2.f355544d = a.getString(a18);
                    oVar2.f355545e = C113041b.m154667a(a.getBlob(a19));
                    oVar2.f355546f = C113041b.m154667a(a.getBlob(a25));
                    oVar2.f355547g = a.getLong(a26);
                    oVar2.f355548h = a.getLong(a27);
                    oVar2.f355549i = a.getLong(a28);
                    oVar2.f355551k = a.getInt(a29);
                    oVar2.f355552l = C118863u.m167583b(a.getInt(a35));
                    oVar2.f355553m = a.getLong(a36);
                    oVar2.f355554n = a.getLong(a37);
                    oVar2.f355555o = a.getLong(a38);
                    oVar2.f355556p = a.getLong(a39);
                    oVar2.f355557q = a.getInt(a44) != 0;
                    oVar2.f355558r = C118863u.m167585d(a.getInt(i));
                    oVar2.f355550j = cVar;
                    oVar = oVar2;
                } else {
                    oVar = null;
                }
                a.close();
                iVar.mo183710d();
                return oVar;
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

    /* renamed from: j */
    public List<C118847o.C118848a> mo183561j(String str) {
        C119046i c = C119046i.m167801c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        this.f355561a.mo183702b();
        Cursor a = C113140c.m154797a(this.f355561a, c, false, (CancellationSignal) null);
        try {
            int a2 = C113139b.m154796a(a, "id");
            int a3 = C113139b.m154796a(a, "state");
            ArrayList arrayList = new ArrayList(a.getCount());
            while (a.moveToNext()) {
                C118847o.C118848a aVar = new C118847o.C118848a();
                aVar.f355559a = a.getString(a2);
                aVar.f355560b = C118863u.m167586e(a.getInt(a3));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a.close();
            c.mo183710d();
        }
    }

    /* renamed from: k */
    public int mo183562k(String str) {
        this.f355561a.mo183702b();
        C116691f a = this.f355566f.mo183713a();
        if (str == null) {
            ((C116690e) a).bindNull(1);
        } else {
            ((C116690e) a).bindString(1, str);
        }
        this.f355561a.mo183703c();
        try {
            a = (C116691f) a;
            int a2 = a.mo180702a();
            this.f355561a.mo183706h();
            return a2;
        } finally {
            this.f355561a.mo183704f();
            this.f355566f.mo183714c(a);
        }
    }

    /* renamed from: l */
    public int mo183563l(String str, long j) {
        this.f355561a.mo183702b();
        C116569f a = this.f355568h.mo183713a();
        ((C116690e) a).bindLong(1, j);
        if (str == null) {
            ((C116690e) a).bindNull(2);
        } else {
            ((C116690e) a).bindString(2, str);
        }
        this.f355561a.mo183703c();
        try {
            int a2 = ((C116691f) a).mo180702a();
            this.f355561a.mo183706h();
            return a2;
        } finally {
            this.f355561a.mo183704f();
            this.f355568h.mo183714c(a);
        }
    }

    /* renamed from: m */
    public int mo183564m(String str) {
        this.f355561a.mo183702b();
        C116691f a = this.f355567g.mo183713a();
        if (str == null) {
            ((C116690e) a).bindNull(1);
        } else {
            ((C116690e) a).bindString(1, str);
        }
        this.f355561a.mo183703c();
        try {
            a = (C116691f) a;
            int a2 = a.mo180702a();
            this.f355561a.mo183706h();
            return a2;
        } finally {
            this.f355561a.mo183704f();
            this.f355567g.mo183714c(a);
        }
    }

    /* renamed from: n */
    public void mo183565n(String str, C113041b bVar) {
        this.f355561a.mo183702b();
        C116691f a = this.f355564d.mo183713a();
        byte[] c = C113041b.m154668c(bVar);
        if (c == null) {
            ((C116690e) a).bindNull(1);
        } else {
            ((C116690e) a).bindBlob(1, c);
        }
        if (str == null) {
            ((C116690e) a).bindNull(2);
        } else {
            ((C116690e) a).bindString(2, str);
        }
        this.f355561a.mo183703c();
        try {
            a = (C116691f) a;
            a.mo180702a();
            this.f355561a.mo183706h();
        } finally {
            this.f355561a.mo183704f();
            this.f355564d.mo183714c(a);
        }
    }

    /* renamed from: o */
    public void mo183566o(String str, long j) {
        this.f355561a.mo183702b();
        C116569f a = this.f355565e.mo183713a();
        ((C116690e) a).bindLong(1, j);
        if (str == null) {
            ((C116690e) a).bindNull(2);
        } else {
            ((C116690e) a).bindString(2, str);
        }
        this.f355561a.mo183703c();
        try {
            ((C116691f) a).mo180702a();
            this.f355561a.mo183706h();
        } finally {
            this.f355561a.mo183704f();
            this.f355565e.mo183714c(a);
        }
    }

    /* renamed from: p */
    public int mo183567p(C117705u uVar, String... strArr) {
        this.f355561a.mo183702b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("?");
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb4 = sb.toString();
        C119038g gVar = this.f355561a;
        gVar.mo183701a();
        gVar.mo183702b();
        SQLiteStatement compileStatement = ((C116683a) gVar.f356519c.mo180540K()).f349940d.compileStatement(sb4);
        compileStatement.bindLong(1, (long) C118863u.m167587f(uVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i2);
            } else {
                compileStatement.bindString(i2, str);
            }
            i2++;
        }
        this.f355561a.mo183703c();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            this.f355561a.mo183706h();
            return executeUpdateDelete;
        } finally {
            this.f355561a.mo183704f();
        }
    }
}
