package up1;

import android.content.ContentValues;
import android.os.SystemClock;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C44668u3;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C60198s3;
import p749xh.C66257b3;
import ue1.C65326e;
import z04.C112551y;

/* renamed from: up1.d0 */
public final class C65414d0 extends MAutoStorage<C66257b3> implements C60198s3 {

    /* renamed from: e */
    public static final String[] f188257e = {"CREATE INDEX IF NOT EXISTS FinderMsgContactStorage_username_index ON FinderMsgContactStorage(username)"};

    /* renamed from: f */
    public static final String[] f188258f = {MAutoStorage.getCreateSQLs(C58969q.f168705a2, "FinderMsgContactStorage")};

    /* renamed from: d */
    public final ISQLiteDatabase f188259d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65414d0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C58969q.f168705a2, "FinderMsgContactStorage", f188257e);
        C87412m.m108594g(iSQLiteDatabase, "storage");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
        this.f188259d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public long mo89498Lo(C58969q qVar) {
        C58969q qVar2 = qVar;
        C87412m.m108594g(qVar2, "contact");
        ContentValues convertTo = qVar.convertTo();
        long uptimeMillis = SystemClock.uptimeMillis();
        long insert = this.f188259d.insert("FinderMsgContactStorage", "", convertTo);
        String name = Thread.currentThread().getName();
        C87412m.m108593f(name, "currentThread().name");
        new C65326e("FinderMsgStrangerContactStorage.insertContact", C112551y.m153815o("insertContact", ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
        Log.m105924i("Finder.MsgContactStorage", "insert contact " + qVar2 + ' ' + insert);
        return insert;
    }

    /* renamed from: S1 */
    public boolean mo89499S1(C58969q qVar, boolean z) {
        boolean z2;
        C87412m.m108594g(qVar, "ct");
        if (z) {
            qVar.field_updateTime = C31543z5.m39453c();
        }
        if (mo89501jo(qVar.getUsername()) == null) {
            long Lo = mo89498Lo(qVar);
            qVar.systemRowid = Lo;
            z2 = Lo > 0;
        } else {
            z2 = mo89500Yt(qVar);
        }
        if (z2) {
            mo89502qq(qVar);
            doNotify("FinderMsgContactStorage", 4, qVar.getUsername());
        }
        return z2;
    }

    /* renamed from: Yt */
    public boolean mo89500Yt(C58969q qVar) {
        C58969q qVar2 = qVar;
        C87412m.m108594g(qVar2, "contact");
        ContentValues convertTo = qVar.convertTo();
        convertTo.remove("rowid");
        long uptimeMillis = SystemClock.uptimeMillis();
        ISQLiteDatabase iSQLiteDatabase = this.f188259d;
        int update = iSQLiteDatabase.update("FinderMsgContactStorage", convertTo, "username=?", new String[]{"" + qVar2.field_username});
        String name = Thread.currentThread().getName();
        C87412m.m108593f(name, "currentThread().name");
        new C65326e("FinderMsgStrangerContactStorage.updateContact", C112551y.m153815o("updateContact", ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
        Log.m105924i("Finder.MsgContactStorage", "updateContact " + qVar.mo84193q2() + ' ' + update);
        if (update > 0) {
            mo89502qq(qVar);
        }
        return update > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0071 A[Catch:{ all -> 0x006b, all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x007a A[Catch:{ all -> 0x006b, all -> 0x0082 }] */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fe1.C58969q mo89501jo(java.lang.String r20) {
        /*
            r19 = this;
            java.lang.String r0 = "username"
            r1 = r20
            gy3.C87412m.m108594g(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SELECT *, rowid FROM FinderMsgContactStorage WHERE username = "
            r0.append(r2)
            java.lang.String r1 = zh3.C91753f.m115264e(r20)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            long r0 = android.os.SystemClock.uptimeMillis()
            r8 = r19
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r8.f188259d
            r9 = 0
            r4 = 2
            android.database.Cursor r10 = r3.rawQuery(r2, r9, r4)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r14 = r3.getName()
            java.lang.String r3 = "currentThread().name"
            gy3.C87412m.m108593f(r14, r3)
            java.lang.String r3 = "sql"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 44
            r4 = 59
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r13 = z04.C112551y.m153815o(r2, r3, r4, r5, r6, r7)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r0 = r2 - r0
            ue1.e r2 = new ue1.e
            java.lang.String r12 = "FinderMsgStrangerContactStorage.getContact"
            r17 = 0
            r11 = r2
            r3 = r14
            r14 = r0
            r16 = r3
            r11.<init>(r12, r13, r14, r16, r17)
            r2.mo89421a()
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x006e
            boolean r2 = r10.moveToFirst()     // Catch:{ all -> 0x006b }
            if (r2 != r0) goto L_0x006e
            goto L_0x006f
        L_0x006b:
            r0 = move-exception
            r1 = r0
            goto L_0x0081
        L_0x006e:
            r0 = 0
        L_0x006f:
            if (r0 == 0) goto L_0x007a
            fe1.q r0 = new fe1.q     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            r0.convertFrom(r10)     // Catch:{ all -> 0x006b }
            goto L_0x007b
        L_0x007a:
            r0 = r9
        L_0x007b:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x006b }
            cy3.C58003b.m67160a(r10, r9)
            return r0
        L_0x0081:
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            r2 = r0
            cy3.C58003b.m67160a(r10, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C65414d0.mo89501jo(java.lang.String):fe1.q");
    }

    /* renamed from: qq */
    public final void mo89502qq(C58969q qVar) {
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
        String Lo = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76736Au().mo73556Lo(qVar.getUsername(), 3);
        Ni.mo69653F1(qVar.getUsername());
        Ni.mo69653F1(Lo);
    }

    /* renamed from: s5 */
    public boolean mo85199s5(C58969q qVar, boolean z) {
        boolean z2;
        C87412m.m108594g(qVar, "ct");
        if (z) {
            qVar.field_updateTime = C31543z5.m39453c();
        }
        C58969q jo = mo89501jo(qVar.getUsername());
        if (jo == null) {
            long Lo = mo89498Lo(qVar);
            qVar.systemRowid = Lo;
            z2 = Lo > 0;
        } else {
            qVar.field_badgeInfoList = jo.field_badgeInfoList;
            qVar.field_interactionCount = jo.field_interactionCount;
            qVar.field_rewardTotalAmountInWecoin = jo.field_rewardTotalAmountInWecoin;
            z2 = mo89500Yt(qVar);
        }
        if (z2) {
            mo89502qq(qVar);
            doNotify("FinderMsgContactStorage", 4, qVar.getUsername());
        }
        return z2;
    }
}
