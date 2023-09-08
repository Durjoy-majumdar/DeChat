package fv1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import ev1.C31726h;
import f40.C86709a0;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import zh3.C91753f;

/* renamed from: fv1.a */
public final class C32183a extends MAutoStorage<C31726h> {

    /* renamed from: d */
    public static final C32183a f85554d = new C32183a();

    /* renamed from: e */
    public static final C91753f f85555e;

    /* renamed from: f */
    public static final ConcurrentHashMap<String, C31726h> f85556f = new ConcurrentHashMap<>();

    static {
        C91753f fVar = C86709a0.m107535s().f251811i;
        C87412m.m108591d(fVar);
        f85555e = fVar;
    }

    public C32183a() {
        super(C86709a0.m107535s().f251811i, C31726h.f84713D, "ForceNotifyData", new String[]{"DROP INDEX IF EXISTS statusIndex", "CREATE INDEX IF NOT EXISTS userNameIndex ON ForceNotifyData(UserName)", "CREATE INDEX IF NOT EXISTS forcePushIdIndex ON ForceNotifyData(ForcePushId)", "CREATE INDEX IF NOT EXISTS ForceNotifyData_statusIndex ON ForceNotifyData(Status)", "CREATE INDEX IF NOT EXISTS expireTimeIndex ON ForceNotifyData(ExpiredTime)"});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        cy3.C58003b.m67160a(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        throw r1;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ev1.C31726h mo58521Lo(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "forcePushId"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getById("
            r0.append(r1)
            r0.append(r12)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.ForceNotifyStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            zh3.f r2 = f85555e
            java.lang.String r0 = "*"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r0 = 0
            r6[r0] = r12
            java.lang.String r3 = "ForceNotifyData"
            java.lang.String r5 = "ForcePushId=?"
            r7 = 0
            r8 = 0
            java.lang.String r9 = "ExpiredTime Desc"
            r10 = 2
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)
            ev1.h r0 = new ev1.h
            r0.<init>()
            r12.moveToFirst()     // Catch:{ all -> 0x0055 }
            boolean r1 = r12.isAfterLast()     // Catch:{ all -> 0x0055 }
            r2 = 0
            if (r1 != 0) goto L_0x0051
            r0.convertFrom(r12)     // Catch:{ all -> 0x0055 }
            cy3.C58003b.m67160a(r12, r2)
            return r0
        L_0x0051:
            cy3.C58003b.m67160a(r12, r2)
            return r2
        L_0x0055:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            cy3.C58003b.m67160a(r12, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fv1.C32183a.mo58521Lo(java.lang.String):ev1.h");
    }

    /* renamed from: c */
    public final boolean mo58522c(String str) {
        C87412m.m108594g(str, "forcePushId");
        Log.m105924i("MicroMsg.ForceNotifyStorage", "delete(" + str + ')');
        if (f85555e.delete("ForceNotifyData", "ForcePushId=?", new String[]{str}) < 0) {
            return false;
        }
        f85556f.remove(str);
        doNotify();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        cy3.C58003b.m67160a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0092, code lost:
        throw r1;
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58523jo() {
        /*
            r13 = this;
            java.lang.Class<sr.g> r0 = p687sr.C64156g.class
            java.lang.String r1 = "MicroMsg.ForceNotifyStorage"
            java.lang.String r2 = "deleteExpireInfo()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            boolean r2 = f40.C86709a0.m107522a()
            if (r2 == 0) goto L_0x0093
            di3.d r2 = di3.C86312j.m106911c(r0)
            if (r2 != 0) goto L_0x0017
            goto L_0x0093
        L_0x0017:
            zh3.f r3 = f85555e
            java.lang.String r2 = "*"
            java.lang.String[] r5 = new java.lang.String[]{r2}
            r2 = 1
            java.lang.String[] r7 = new java.lang.String[r2]
            long r8 = eb0.C31543z5.m39453c()
            java.lang.String r4 = java.lang.String.valueOf(r8)
            r12 = 0
            r7[r12] = r4
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 2
            java.lang.String r4 = "ForceNotifyData"
            java.lang.String r6 = "ExpiredTime<=?"
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)
            r4 = 0
            r3.moveToFirst()     // Catch:{ all -> 0x008c }
        L_0x003d:
            boolean r5 = r3.isAfterLast()     // Catch:{ all -> 0x008c }
            if (r5 != 0) goto L_0x0063
            ev1.h r5 = new ev1.h     // Catch:{ all -> 0x008c }
            r5.<init>()     // Catch:{ all -> 0x008c }
            r5.convertFrom(r3)     // Catch:{ all -> 0x008c }
            di3.d r6 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x008c }
            sr.g r6 = (p687sr.C64156g) r6     // Catch:{ all -> 0x008c }
            java.lang.String r5 = r5.field_ForcePushId     // Catch:{ all -> 0x008c }
            r7 = 5
            long r8 = eb0.C31543z5.m39453c()     // Catch:{ all -> 0x008c }
            r10 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r10     // Catch:{ all -> 0x008c }
            long r8 = r8 / r10
            r6.mo58059Hj(r5, r7, r8)     // Catch:{ all -> 0x008c }
            r3.moveToNext()     // Catch:{ all -> 0x008c }
            goto L_0x003d
        L_0x0063:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x008c }
            cy3.C58003b.m67160a(r3, r4)
            zh3.f r0 = f85555e
            java.lang.String[] r3 = new java.lang.String[r2]
            long r4 = eb0.C31543z5.m39453c()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3[r12] = r4
            java.lang.String r4 = "ForceNotifyData"
            java.lang.String r5 = "ExpiredTime<=?"
            int r0 = r0.delete(r4, r5, r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r12] = r0
            java.lang.String r0 = "[deleteExpireInfo] ret:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r2)
            return
        L_0x008c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x008e }
        L_0x008e:
            r1 = move-exception
            cy3.C58003b.m67160a(r3, r0)
            throw r1
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fv1.C32183a.mo58523jo():void");
    }

    /* renamed from: qq */
    public final void mo58524qq(String str, int i) {
        C87412m.m108594g(str, "forcePushId");
        Log.m105924i("MicroMsg.ForceNotifyStorage", "updateStatus(" + str + ", " + i + ')');
        C31726h hVar = new C31726h();
        hVar.field_ForcePushId = str;
        if (get(hVar, new String[0])) {
            hVar.field_Status = i;
            Log.m105925i("MicroMsg.ForceNotifyStorage", "[updateStatus] ret:%s %s", Long.valueOf(f85555e.replace("ForceNotifyData", "ForcePushId", hVar.convertTo())), hVar);
            f85556f.put(str, hVar);
            doNotify();
        }
    }
}
