package yy2;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import su0.C13781a;
import uy2.C37612h;
import wz2.C38419f;

/* renamed from: yy2.d */
public final class C39246d extends MAutoStorage<C37612h> {

    /* renamed from: g */
    public static final String[] f105579g = {MAutoStorage.getCreateSQLs(C37612h.f99729F, "TextStatusSessionInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f105580d;

    /* renamed from: e */
    public final ConcurrentHashMap<String, C37612h> f105581e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public final ConcurrentHashMap<String, C37612h> f105582f = new ConcurrentHashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39246d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C37612h.f99729F, "TextStatusSessionInfo", C38419f.f101345r);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C37612h.f99729F;
        this.f105580d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final void mo61998Lo(String str, String str2, int i, int i2, int i3, int i4, String str3) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "talker");
        C87412m.m108594g(str3, "senderUserName");
        C37612h hVar = new C37612h();
        hVar.field_sessionId = str;
        hVar.field_talker = str2;
        hVar.field_type = i;
        hVar.field_updateTime = C31543z5.m39453c();
        hVar.field_selfUsername = C13781a.m13082a();
        hVar.field_actionPermission = i2;
        hVar.field_rejectMsg = i3;
        hVar.field_disableSendMsg = i4;
        hVar.field_senderUserName = str3;
        SystemClock.uptimeMillis();
        boolean replace = replace(hVar, false);
        if (replace) {
            ConcurrentHashMap<String, C37612h> concurrentHashMap = this.f105581e;
            concurrentHashMap.remove(hVar.field_talker + '_' + hVar.field_senderUserName);
            this.f105582f.remove(str);
            doNotify(hVar.field_sessionId);
        }
        Log.m105924i("MicroMsg.TextStatus.TextStatusSessionInfoStorage", "[replaceSessionInfo]  ret=" + replace + ", sessionId=" + str + ", talker=" + str2 + ", actionPermission=" + i2 + ", type=" + i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        cy3.C58003b.m67160a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        throw r1;
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uy2.C37612h mo61999jo(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x000b
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = 0
            goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            if (r0 == 0) goto L_0x0014
            uy2.h r7 = new uy2.h
            r7.<init>()
            return r7
        L_0x0014:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, uy2.h> r0 = r6.f105582f
            java.lang.Object r0 = r0.get(r7)
            uy2.h r0 = (uy2.C37612h) r0
            if (r0 != 0) goto L_0x008b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "select * , rowid from TextStatusSessionInfo where sessionId = '"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "' "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            uy2.h r1 = new uy2.h
            r1.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r6.f105580d
            r3 = 0
            android.database.Cursor r0 = r2.rawQuery(r0, r3)
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x0049
            r1.convertFrom(r0)     // Catch:{ all -> 0x0084 }
        L_0x0049:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0084 }
            cy3.C58003b.m67160a(r0, r3)
            long r2 = r1.systemRowid
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0082
            java.util.concurrent.ConcurrentHashMap<java.lang.String, uy2.h> r0 = r6.f105582f
            r0.put(r7, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, uy2.h> r7 = r6.f105581e
            java.lang.String r0 = r1.field_talker
            java.lang.String r2 = "cache.field_talker"
            gy3.C87412m.m108593f(r0, r2)
            java.lang.String r2 = r1.field_senderUserName
            java.lang.String r3 = "cache.field_senderUserName"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r0 = 95
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r7.put(r0, r1)
        L_0x0082:
            r0 = r1
            goto L_0x008b
        L_0x0084:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            cy3.C58003b.m67160a(r0, r7)
            throw r1
        L_0x008b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yy2.C39246d.mo61999jo(java.lang.String):uy2.h");
    }
}
