package up1;

import android.database.Cursor;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72996z1;
import cy3.C58003b;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C46111l4;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import p749xh.C38697x3;
import rx3.C13598b0;
import ue1.C37429f0;
import ue1.C52528f;
import ue1.C65326e;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: up1.l0 */
public final class C52599l0 extends MAutoStorage<C37429f0> implements C46111l4 {

    /* renamed from: g */
    public static final String[] f146901g = {MAutoStorage.getCreateSQLs(C37429f0.f98935I, "FinderSessionInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f146902d;

    /* renamed from: e */
    public final ConcurrentHashMap<String, C37429f0> f146903e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public final ConcurrentHashMap<String, C37429f0> f146904f = new ConcurrentHashMap<>();

    /* renamed from: up1.l0$a */
    public static final class C52600a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ Exception f146905d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52600a(Exception exc) {
            super(0);
            this.f146905d = exc;
        }

        public Object invoke() {
            return "[checkOldSessionInfo] crash, errMsg" + this.f146905d.getMessage();
        }
    }

    /* renamed from: up1.l0$b */
    public static final class C52601b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<C37429f0> f146906d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f146907e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52601b(LinkedList<C37429f0> linkedList, C8478d0 d0Var) {
            super(0);
            this.f146906d = linkedList;
            this.f146907e = d0Var;
        }

        public Object invoke() {
            return "[checkOldSessionInfo] status, total:" + this.f146906d.size() + ", failed:" + this.f146907e.f27483d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52599l0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37429f0.f98935I, "FinderSessionInfo", C38697x3.f104224t);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C37429f0.f98935I;
        this.f146902d = iSQLiteDatabase;
    }

    /* renamed from: G2 */
    public C37429f0 mo71553G2(String str) {
        Throwable th;
        String str2 = str;
        if (str2 == null || str.length() == 0) {
            return new C37429f0();
        }
        C37429f0 f0Var = this.f146904f.get(str2);
        if (f0Var == null) {
            String str3 = "select * , rowid from FinderSessionInfo where sessionId = '" + str2 + "' ";
            f0Var = new C37429f0();
            long uptimeMillis = SystemClock.uptimeMillis();
            Cursor rawQuery = this.f146902d.rawQuery(str3, (String[]) null);
            try {
                String name = Thread.currentThread().getName();
                C87412m.m108593f(name, "currentThread().name");
                C87412m.m108594g(str3, "sql");
                new C65326e("FinderSessionInfoStorage.getSessionInfoBySessionId", C112551y.m153815o(str3, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
                if (rawQuery.moveToFirst()) {
                    f0Var.convertFrom(rawQuery);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                C58003b.m67160a(rawQuery, (Throwable) null);
                if (f0Var.systemRowid > 0) {
                    this.f146904f.put(str2, f0Var);
                    this.f146903e.put(f0Var.field_talker + '_' + f0Var.field_senderUserName, f0Var);
                }
            } catch (Throwable th4) {
                Throwable th5 = th4;
                C58003b.m67160a(rawQuery, th);
                throw th5;
            }
        }
        return f0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b6 A[Catch:{ Exception -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01f6  */
    /* renamed from: Js */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo73555Js() {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r2 = "currentThread().name"
            java.lang.String r3 = "Finder.SessionStorage"
            java.lang.String r0 = "[checkOldSessionInfo] begin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            long r5 = android.os.SystemClock.uptimeMillis()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f146902d
            java.lang.String r7 = "select * , rowid from FinderSessionInfo"
            r13 = 0
            android.database.Cursor r14 = r0.rawQuery(r7, r13)
            r21 = 0
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x024c }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x024c }
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ all -> 0x024c }
            r8 = 44
            r9 = 59
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r17 = z04.C112551y.m153815o(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x024c }
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x024c }
            long r18 = r7 - r5
            java.lang.String r16 = "FinderConversationStorage.checkOldSessionInfo"
            ue1.e r7 = new ue1.e     // Catch:{ all -> 0x024c }
            r15 = r7
            r20 = r0
            r15.<init>(r16, r17, r18, r20, r21)     // Catch:{ all -> 0x024c }
            r7.mo89421a()     // Catch:{ all -> 0x024c }
        L_0x0048:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x024c }
            if (r0 == 0) goto L_0x005a
            ue1.f0 r0 = new ue1.f0     // Catch:{ all -> 0x024c }
            r0.<init>()     // Catch:{ all -> 0x024c }
            r0.convertFrom(r14)     // Catch:{ all -> 0x024c }
            r4.add(r0)     // Catch:{ all -> 0x024c }
            goto L_0x0048
        L_0x005a:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x024c }
            cy3.C58003b.m67160a(r14, r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "[checkOldSessionInfo] size:"
            r0.append(r7)
            int r7 = r4.size()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.String r0 = eb0.C75592q0.m90789s()
            zc1.b r7 = zc1.C66785b.f191882e
            java.lang.String r7 = r7.mo90662O5()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r8 = r1.f146902d
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.storagebase.SqliteDB"
            gy3.C87412m.m108592e(r8, r9)
            zh3.f r8 = (zh3.C91753f) r8
            long r10 = r8.mo125613a()
            gy3.d0 r8 = new gy3.d0
            r8.<init>()
            java.util.Iterator r14 = r4.iterator()     // Catch:{ Exception -> 0x015b }
            r15 = 1
        L_0x0098:
            boolean r16 = r14.hasNext()     // Catch:{ Exception -> 0x015b }
            if (r16 == 0) goto L_0x011b
            java.lang.Object r16 = r14.next()     // Catch:{ Exception -> 0x015b }
            r12 = r16
            ue1.f0 r12 = (ue1.C37429f0) r12     // Catch:{ Exception -> 0x015b }
            java.lang.String r13 = r12.field_senderUserName     // Catch:{ Exception -> 0x015b }
            if (r13 == 0) goto L_0x00b3
            int r13 = r13.length()     // Catch:{ Exception -> 0x015b }
            if (r13 != 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r13 = 0
            goto L_0x00b4
        L_0x00b3:
            r13 = 1
        L_0x00b4:
            if (r13 == 0) goto L_0x0114
            java.lang.String r13 = r12.field_talker     // Catch:{ Exception -> 0x015b }
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85817T4(r13)     // Catch:{ Exception -> 0x015b }
            if (r13 == 0) goto L_0x00c7
            r12.field_senderUserName = r0     // Catch:{ Exception -> 0x015b }
            r13 = 1
            r12.field_senderRoleType = r13     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00cc
        L_0x00c4:
            r0 = move-exception
            goto L_0x015d
        L_0x00c7:
            r12.field_senderUserName = r7     // Catch:{ Exception -> 0x015b }
            r13 = 3
            r12.field_senderRoleType = r13     // Catch:{ Exception -> 0x015b }
        L_0x00cc:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015b }
            r13.<init>()     // Catch:{ Exception -> 0x015b }
            r18 = r0
            java.lang.String r0 = "UPDATE FinderSessionInfo SET senderUserName = '"
            r13.append(r0)     // Catch:{ Exception -> 0x015b }
            java.lang.String r0 = r12.field_senderUserName     // Catch:{ Exception -> 0x015b }
            r13.append(r0)     // Catch:{ Exception -> 0x015b }
            java.lang.String r0 = "' , senderRoleType = '"
            r13.append(r0)     // Catch:{ Exception -> 0x015b }
            int r0 = r12.field_senderRoleType     // Catch:{ Exception -> 0x015b }
            r13.append(r0)     // Catch:{ Exception -> 0x015b }
            java.lang.String r0 = "' WHERE talker = '"
            r13.append(r0)     // Catch:{ Exception -> 0x015b }
            java.lang.String r0 = r12.field_talker     // Catch:{ Exception -> 0x015b }
            r13.append(r0)     // Catch:{ Exception -> 0x015b }
            r0 = 39
            r13.append(r0)     // Catch:{ Exception -> 0x015b }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x015b }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r1.f146902d     // Catch:{ Exception -> 0x015b }
            java.lang.String r13 = "FinderSessionInfo"
            boolean r0 = r12.execSQL(r13, r0)     // Catch:{ Exception -> 0x015b }
            if (r0 != 0) goto L_0x010b
            int r12 = r8.f27483d     // Catch:{ Exception -> 0x015b }
            r13 = 1
            int r12 = r12 + r13
            r8.f27483d = r12     // Catch:{ Exception -> 0x00c4 }
            goto L_0x010c
        L_0x010b:
            r13 = 1
        L_0x010c:
            if (r15 == 0) goto L_0x0112
            if (r0 == 0) goto L_0x0112
            r15 = 1
            goto L_0x0117
        L_0x0112:
            r15 = 0
            goto L_0x0117
        L_0x0114:
            r18 = r0
            r13 = 1
        L_0x0117:
            r0 = r18
            goto L_0x0098
        L_0x011b:
            r13 = 1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f146902d
            gy3.C87412m.m108592e(r0, r9)
            zh3.f r0 = (zh3.C91753f) r0
            r0.endTransaction(r10)
            r24 = 0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            gy3.C87412m.m108593f(r0, r2)
            r19 = 44
            r20 = 59
            r21 = 0
            r22 = 4
            r23 = 0
            java.lang.String r18 = "UPDATE FinderSessionInfo SET senderUserName = 'xxx' , senderRoleType = 'xxxx'\"WHERE talker = 'xxx'"
            java.lang.String r20 = z04.C112551y.m153815o(r18, r19, r20, r21, r22, r23)
            long r9 = android.os.SystemClock.uptimeMillis()
            long r21 = r9 - r5
            ue1.e r2 = new ue1.e
            java.lang.String r19 = "FinderConversationStorage.checkOldSessionInfo#UPDATE"
            r18 = r2
            r23 = r0
            r18.<init>(r19, r20, r21, r23, r24)
            r2.mo89421a()
            goto L_0x01cb
        L_0x0158:
            r0 = move-exception
            goto L_0x0214
        L_0x015b:
            r0 = move-exception
            r13 = 1
        L_0x015d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0158 }
            r7.<init>()     // Catch:{ all -> 0x0158 }
            java.lang.String r12 = "crash catch [checkOldSessionInfo] "
            r7.append(r12)     // Catch:{ all -> 0x0158 }
            java.lang.String r12 = r0.getMessage()     // Catch:{ all -> 0x0158 }
            r7.append(r12)     // Catch:{ all -> 0x0158 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0158 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ all -> 0x0158 }
            ft1.a r18 = ft1.C59319a.f169618b     // Catch:{ all -> 0x0158 }
            java.lang.String r19 = "checkOldSessionInfo"
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            up1.l0$a r7 = new up1.l0$a     // Catch:{ all -> 0x0158 }
            r7.<init>(r0)     // Catch:{ all -> 0x0158 }
            r25 = 28
            r26 = 0
            r24 = r7
            o40.C11348f.C11349a.m11178b(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0158 }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f146902d
            gy3.C87412m.m108592e(r0, r9)
            zh3.f r0 = (zh3.C91753f) r0
            r0.endTransaction(r10)
            r24 = 0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            gy3.C87412m.m108593f(r0, r2)
            java.lang.String r18 = "UPDATE FinderSessionInfo SET senderUserName = 'xxx' , senderRoleType = 'xxxx'\"WHERE talker = 'xxx'"
            r19 = 44
            r20 = 59
            r21 = 0
            r22 = 4
            r23 = 0
            java.lang.String r20 = z04.C112551y.m153815o(r18, r19, r20, r21, r22, r23)
            long r9 = android.os.SystemClock.uptimeMillis()
            long r21 = r9 - r5
            ue1.e r2 = new ue1.e
            java.lang.String r19 = "FinderConversationStorage.checkOldSessionInfo#UPDATE"
            r18 = r2
            r23 = r0
            r18.<init>(r19, r20, r21, r23, r24)
            r2.mo89421a()
            r15 = 0
        L_0x01cb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[checkOldSessionInfo] status, total:"
            r0.append(r2)
            int r2 = r4.size()
            r0.append(r2)
            java.lang.String r2 = ", failed:"
            r0.append(r2)
            int r2 = r8.f27483d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            ft1.a r18 = ft1.C59319a.f169618b
            int r0 = r8.f27483d
            if (r0 != 0) goto L_0x01f6
            r20 = 1
            goto L_0x01f8
        L_0x01f6:
            r20 = 0
        L_0x01f8:
            r21 = 0
            r22 = 0
            r23 = 0
            up1.l0$b r0 = new up1.l0$b
            r0.<init>(r4, r8)
            r25 = 28
            r26 = 0
            java.lang.String r19 = "checkOldSessionInfo-status"
            r24 = r0
            o40.C11348f.C11349a.m11178b(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r0 = "[checkOldSessionInfo] end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r15
        L_0x0214:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r1.f146902d
            gy3.C87412m.m108592e(r3, r9)
            zh3.f r3 = (zh3.C91753f) r3
            r3.endTransaction(r10)
            r18 = 0
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            gy3.C87412m.m108593f(r3, r2)
            r8 = 44
            r9 = 59
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r7 = "UPDATE FinderSessionInfo SET senderUserName = 'xxx' , senderRoleType = 'xxxx'\"WHERE talker = 'xxx'"
            java.lang.String r14 = z04.C112551y.m153815o(r7, r8, r9, r10, r11, r12)
            long r7 = android.os.SystemClock.uptimeMillis()
            long r15 = r7 - r5
            ue1.e r2 = new ue1.e
            java.lang.String r13 = "FinderConversationStorage.checkOldSessionInfo#UPDATE"
            r12 = r2
            r17 = r3
            r12.<init>(r13, r14, r15, r17, r18)
            r2.mo89421a()
            throw r0
        L_0x024c:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x024f }
        L_0x024f:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r14, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C52599l0.mo73555Js():boolean");
    }

    /* renamed from: Lo */
    public String mo73556Lo(String str, int i) {
        C37429f0 f0Var;
        Throwable th;
        String str2 = str;
        int i2 = i;
        String str3 = null;
        if (str2 == null || str.length() == 0) {
            f0Var = new C37429f0();
        } else {
            String O5 = i2 != 1 ? i2 != 2 ? i2 != 3 ? "" : C66785b.f191882e.mo90662O5() : C75592q0.m90782l() : C75592q0.m90789s();
            C37429f0 f0Var2 = this.f146903e.get(str2 + '_' + O5);
            if (f0Var2 == null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                String str4 = "select * , rowid from FinderSessionInfo  where talker = '" + str2 + "' and senderUserName = '" + O5 + '\'';
                Cursor rawQuery = this.f146902d.rawQuery(str4, (String[]) null);
                try {
                    String name = Thread.currentThread().getName();
                    C87412m.m108593f(name, "currentThread().name");
                    C87412m.m108594g(str4, "sql");
                    new C65326e("FinderSessionInfoStorage.getSessionInfoByTalker", C112551y.m153815o(str4, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
                    if (rawQuery.moveToFirst()) {
                        f0Var2 = new C37429f0();
                        f0Var2.convertFrom(rawQuery);
                        ConcurrentHashMap<String, C37429f0> concurrentHashMap = this.f146904f;
                        String str5 = f0Var2.field_sessionId;
                        C87412m.m108593f(str5, "cache.field_sessionId");
                        concurrentHashMap.put(str5, f0Var2);
                        this.f146903e.put(str2 + '_' + O5, f0Var2);
                        C58003b.m67160a(rawQuery, (Throwable) null);
                    } else {
                        C13598b0 b0Var = C13598b0.f38549a;
                        C58003b.m67160a(rawQuery, (Throwable) null);
                        f0Var = null;
                    }
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    C58003b.m67160a(rawQuery, th);
                    throw th5;
                }
            }
            f0Var = f0Var2;
        }
        if (f0Var != null) {
            str3 = f0Var.field_sessionId;
        }
        return str3 == null ? "" : str3;
    }

    /* renamed from: Ow */
    public void mo73557Ow(String str, int i) {
        C87412m.m108594g(str, "sessionId");
        C37429f0 G2 = mo71553G2(str);
        G2.field_rejectMsg = i;
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean updateNotify = updateNotify(G2, false, new String[0]);
        String name = Thread.currentThread().getName();
        C87412m.m108593f(name, "currentThread().name");
        new C65326e("FinderSessionInfoStorage.updateOpType", C112551y.m153815o("updateNotify", ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
        if (updateNotify) {
            ConcurrentHashMap<String, C37429f0> concurrentHashMap = this.f146903e;
            concurrentHashMap.remove(G2.field_talker + '_' + G2.field_senderUserName);
            this.f146904f.remove(G2.field_sessionId);
            doNotify(G2.field_sessionId);
        }
    }

    /* renamed from: Yt */
    public void mo73558Yt(String str, String str2, int i, int i2, C46111l4.C33059a aVar, int i3, int i4, String str3, int i5) {
        String str4 = str;
        String str5 = str2;
        int i6 = i;
        int i7 = i2;
        C46111l4.C33059a aVar2 = aVar;
        String str6 = str3;
        int i8 = i5;
        C87412m.m108594g(str4, "sessionId");
        C87412m.m108594g(str5, "talker");
        C87412m.m108594g(aVar2, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(str6, "senderUserName");
        C37429f0 f0Var = new C37429f0();
        f0Var.field_sessionId = str4;
        f0Var.field_talker = str5;
        f0Var.field_type = i6;
        f0Var.field_updateTime = C31543z5.m39453c();
        f0Var.field_selfUsername = C66785b.f191882e.mo90662O5();
        f0Var.field_actionPermission = i7;
        f0Var.field_rejectMsg = i3;
        f0Var.field_disableSendMsg = i4;
        f0Var.field_senderUserName = str6;
        f0Var.field_senderRoleType = C72996z1.m85817T4(str3) ? 3 : C72996z1.m85821V4(str3) ? 2 : 1;
        f0Var.field_followFlag = i8;
        if (!C72996z1.m85825X4(str2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean replace = replace(f0Var, false);
            String name = Thread.currentThread().getName();
            C87412m.m108593f(name, "currentThread().name");
            new C65326e("FinderSessionInfoStorage.replaceSessionInfo", C112551y.m153815o("replace", ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
            if (replace) {
                ConcurrentHashMap<String, C37429f0> concurrentHashMap = this.f146903e;
                concurrentHashMap.remove(f0Var.field_talker + '_' + f0Var.field_senderUserName);
                this.f146904f.remove(str4);
                doNotify(f0Var.field_sessionId);
            }
            if (aVar2 == C46111l4.C33059a.FOR_TEST) {
                C52593j Bx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4();
                C52528f fVar = Bx0.get(str4);
                fVar.field_talker = str5;
                fVar.field_actionPermission = i7;
                fVar.field_type = i6;
                if (!Bx0.replace(fVar, false)) {
                    Log.m105920e("Finder.SessionStorage", "[replaceSessionInfo] fail! sessionId=" + str4);
                }
            }
            Log.m105924i("Finder.SessionStorage", "[replaceSessionInfo] source=" + aVar2 + ", ret=" + replace + ", sessionId=" + str4 + ", talker=" + str5 + ", actionPermission=" + i7 + ", type=" + i6 + ", followType=" + i8);
            return;
        }
        throw new RuntimeException(str5 + " is invalid");
    }

    /* renamed from: jo */
    public boolean mo73559jo(String str, boolean z) {
        String str2 = str;
        C87412m.m108594g(str2, "sessionId");
        C37429f0 G2 = mo71553G2(str);
        this.f146904f.remove(str2);
        ConcurrentHashMap<String, C37429f0> concurrentHashMap = this.f146903e;
        concurrentHashMap.remove(G2.field_talker + '_' + G2.field_senderUserName);
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean delete = delete(G2, z, "sessionId");
        String name = Thread.currentThread().getName();
        C87412m.m108593f(name, "currentThread().name");
        new C65326e("FinderSessionInfoStorage.deleteSession", C112551y.m153815o("updateNotify", ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
        return delete;
    }

    /* renamed from: qq */
    public LinkedList<C37429f0> mo73560qq(String str) {
        Throwable th;
        String str2 = str;
        C87412m.m108594g(str2, "senderUserName");
        if (str.length() == 0) {
            return null;
        }
        String str3 = "select * , rowid from FinderSessionInfo where senderUserName = '" + str2 + "' ";
        LinkedList<C37429f0> linkedList = new LinkedList<>();
        long uptimeMillis = SystemClock.uptimeMillis();
        Cursor rawQuery = this.f146902d.rawQuery(str3, (String[]) null);
        try {
            String name = Thread.currentThread().getName();
            C87412m.m108593f(name, "currentThread().name");
            C87412m.m108594g(str3, "sql");
            new C65326e("FinderSessionInfoStorage.getSessionInfoBySenderUserName", C112551y.m153815o(str3, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
            while (rawQuery.moveToNext()) {
                C37429f0 f0Var = new C37429f0();
                f0Var.convertFrom(rawQuery);
                linkedList.add(f0Var);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            C58003b.m67160a(rawQuery, (Throwable) null);
            return linkedList;
        } catch (Throwable th4) {
            Throwable th5 = th4;
            C58003b.m67160a(rawQuery, th);
            throw th5;
        }
    }
}
