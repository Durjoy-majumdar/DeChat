package re2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.wcdb.database.SQLiteStatement;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import ke2.C99129c;
import me2.C10783a;
import ye2.C102838a;

/* renamed from: re2.a */
public class C101371a {

    /* renamed from: re2.a$a */
    public class C101372a extends C102838a {

        /* renamed from: d */
        public String f296945d;

        /* renamed from: e */
        public int f296946e;

        /* renamed from: f */
        public long f296947f;

        /* renamed from: g */
        public int f296948g;

        /* renamed from: h */
        public int f296949h;

        public C101372a(C101371a aVar, String str, int i) {
            this.f296945d = str;
            this.f296946e = i;
        }

        /* renamed from: a */
        public String mo129622a() {
            return String.format("Priority.UpdateTask[%s][%d][%d][%d][%d]", new Object[]{this.f296945d, Integer.valueOf(this.f296946e), Long.valueOf(this.f296947f), Integer.valueOf(this.f296948g), Integer.valueOf(this.f296949h)});
        }

        public void run() {
            Class cls = C99129c.class;
            String str = this.f296945d;
            if (!(!Util.isNullOrNil(str) && !str.endsWith("@stranger") && !str.endsWith("@qqim") && !str.endsWith("@app") && !str.startsWith("fake_") && !C45628s0.m50738C(this.f296945d))) {
                Log.m105925i("MicroMsg.Priority.C2CChatUsageLogic", "filterByUsername %s", this.f296945d);
            } else if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f296945d).mo62936v3()) {
                Log.m105925i("MicroMsg.Priority.C2CChatUsageLogic", "Hidden %s", this.f296945d);
            } else {
                if (C72996z1.m85820U5(this.f296945d)) {
                    this.f296948g = 2;
                } else {
                    this.f296948g = 3;
                }
                int i = this.f296946e;
                if (i == 0) {
                    C99129c cVar = (C99129c) C86312j.m106911c(cls);
                    cVar.requireAccountInitialized();
                    C101374c cVar2 = cVar.f290665r;
                    String str2 = this.f296945d;
                    long j = this.f296947f;
                    long j2 = (long) this.f296948g;
                    cVar2.getClass();
                    long b = C10783a.m10758b();
                    long j3 = b;
                    boolean a = cVar2.mo140860a(str2, b, j2);
                    cVar2.f296953c.bindLong(1, j);
                    cVar2.f296953c.bindString(2, str2);
                    cVar2.f296953c.bindLong(3, b);
                    Log.m105925i("MicroMsg.Priority.C2CChatUsageStorage", "updateOpen chat %s insert %b update %b", str2, Boolean.valueOf(a), Integer.valueOf(cVar2.f296953c.executeUpdateDelete()));
                } else if (i == 1) {
                    C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
                    cVar3.requireAccountInitialized();
                    C101374c cVar4 = cVar3.f290665r;
                    String str3 = this.f296945d;
                    long j4 = (long) this.f296948g;
                    SQLiteStatement sQLiteStatement = cVar4.f296954d;
                    long b2 = C10783a.m10758b();
                    boolean a2 = cVar4.mo140860a(str3, b2, j4);
                    sQLiteStatement.bindString(1, str3);
                    sQLiteStatement.bindLong(2, b2);
                    Log.m105925i("MicroMsg.Priority.C2CChatUsageStorage", "%s chat %s insert %b update %b", "updateSendMsg", str3, Boolean.valueOf(a2), Integer.valueOf(sQLiteStatement.executeUpdateDelete()));
                } else if (i == 2) {
                    C99129c cVar5 = (C99129c) C86312j.m106911c(cls);
                    cVar5.requireAccountInitialized();
                    C101374c cVar6 = cVar5.f290665r;
                    String str4 = this.f296945d;
                    int i2 = this.f296949h;
                    cVar6.getClass();
                    cVar6.f296951a.mo140222d(String.format("UPDATE %s SET consumemsgcount = consumemsgcount + ? WHERE chat = ? AND date = ?", new Object[]{"C2CChatUsage"}), new String[]{String.valueOf(i2), str4, String.valueOf((long) this.f296948g)});
                } else if (i == 3) {
                    C99129c cVar7 = (C99129c) C86312j.m106911c(cls);
                    cVar7.requireAccountInitialized();
                    cVar7.f290665r.mo140860a(this.f296945d, C10783a.m10758b(), (long) this.f296948g);
                }
            }
        }

        public C101372a(C101371a aVar, String str, int i, int i2) {
            this.f296945d = str;
            this.f296946e = i;
            this.f296949h = i2;
        }

        public C101372a(C101371a aVar, String str, int i, long j) {
            this.f296945d = str;
            this.f296946e = i;
            this.f296949h = this.f296949h;
            this.f296947f = j;
        }
    }
}
