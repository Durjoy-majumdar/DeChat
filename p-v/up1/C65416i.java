package up1;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import fe1.C58969q;
import gy3.C87412m;
import java.util.ArrayList;
import p749xh.C66257b3;
import sx3.C110823p;

/* renamed from: up1.i */
public final class C65416i extends MAutoStorage<C66257b3> {

    /* renamed from: e */
    public static final String[] f188261e = {MAutoStorage.getCreateSQLs(C58969q.f168705a2, "FinderContact")};

    /* renamed from: f */
    public static final String[] f188262f;

    /* renamed from: d */
    public final ISQLiteDatabase f188263d;

    static {
        String[] strArr = C66257b3.f190338S0;
        C87412m.m108593f(strArr, "INDEX_CREATE");
        ArrayList arrayList = (ArrayList) C110823p.m151003c0(strArr);
        arrayList.add(0, "DROP INDEX username_index");
        Object[] array = arrayList.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        f188262f = (String[]) array;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65416i(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C58969q.f168705a2, "FinderContact", f188262f);
        C87412m.m108594g(iSQLiteDatabase, "storage");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
        this.f188263d = iSQLiteDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0071 A[Catch:{ all -> 0x006b, all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x007a A[Catch:{ all -> 0x006b, all -> 0x0082 }] */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fe1.C58969q mo89509jo(java.lang.String r20) {
        /*
            r19 = this;
            java.lang.String r0 = "username"
            r1 = r20
            gy3.C87412m.m108594g(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SELECT *, rowid FROM FinderContact WHERE username = "
            r0.append(r2)
            java.lang.String r1 = zh3.C91753f.m115264e(r20)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            long r0 = android.os.SystemClock.uptimeMillis()
            r8 = r19
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r8.f188263d
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
            java.lang.String r12 = "FinderContactStorage.getContact"
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
        throw new UnsupportedOperationException("Method not decompiled: up1.C65416i.mo89509jo(java.lang.String):fe1.q");
    }
}
