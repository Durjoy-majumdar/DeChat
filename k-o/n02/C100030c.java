package n02;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.xweb.util.FrequentLimiter;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import o02.C35072a;
import o40.C61926c;
import rx3.C13598b0;
import su0.C13781a;
import sx3.C110818d0;
import sx3.C64197v;
import z04.C112551y;
import z04.C119027c;
import zh3.C91753f;

/* renamed from: n02.c */
public final class C100030c extends MvvmStorage<C34715b> {

    /* renamed from: g */
    public static final String f293052g = (C86709a0.m107535s().f251807e + "HashInfo.db");

    /* renamed from: d */
    public String f293053d = "";

    /* renamed from: e */
    public String f293054e = "";

    /* renamed from: f */
    public final C34717b f293055f;

    /* renamed from: h4 */
    public String f293056h4 = "";

    /* renamed from: n02.c$a */
    public static final class C34716a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C100030c f93344d;

        /* renamed from: e */
        public final /* synthetic */ IMvvmDBProvider f93345e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34716a(C100030c cVar, IMvvmDBProvider iMvvmDBProvider) {
            super(0);
            this.f93344d = cVar;
            this.f93345e = iMvvmDBProvider;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.HashInfo.HashUserNameMapStorage", "init start");
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LAST_SYNC_COMM_USERNAMEMAP_V1_LONG_SYNC;
            long G = i.mo119673G(aVar, 0);
            if (System.currentTimeMillis() - G < FrequentLimiter.WEEK_MILLS) {
                Log.m105928w("MicroMsg.HashInfo.HashUserNameMapStorage", "lastSyncTime: " + G + ", not need to sync now~");
            } else {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(System.currentTimeMillis()));
                String f3 = this.f93344d.mo139359f3();
                if (f3 == null || f3.length() == 0) {
                    Log.m105920e("MicroMsg.HashInfo.HashUserNameMapStorage", "salt is empty");
                } else {
                    LinkedHashSet<C34715b> linkedHashSet = new LinkedHashSet<>();
                    Cursor J3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69659J3();
                    if (J3 != null) {
                        C72996z1 z1Var = new C72996z1();
                        while (J3.moveToNext()) {
                            z1Var.convertFrom(J3);
                            C34715b bVar = new C34715b();
                            bVar.field_UserName = z1Var.getUsername();
                            linkedHashSet.add(bVar);
                        }
                        J3.close();
                    }
                    C34715b bVar2 = new C34715b();
                    bVar2.field_UserName = C13781a.m13082a();
                    linkedHashSet.add(bVar2);
                    Log.m105924i("MicroMsg.HashInfo.HashUserNameMapStorage", "get contact done");
                    C100030c cVar = this.f93344d;
                    for (C34715b bVar3 : linkedHashSet) {
                        bVar3.field_HashUserName = cVar.mo139357c3(bVar3.field_UserName, cVar.mo139359f3());
                        bVar3.field_CommHashUserName = cVar.mo139357c3(bVar3.field_UserName, cVar.mo139358e3());
                        bVar3.field_HardCodeHashUserName = cVar.mo139357c3(bVar3.field_UserName, cVar.mo139356a());
                    }
                    Log.m105924i("MicroMsg.HashInfo.HashUserNameMapStorage", "compute salt done");
                    ISQLiteDatabase db = this.f93345e.getDB();
                    C91753f fVar = db instanceof C91753f ? (C91753f) db : null;
                    if (fVar != null) {
                        C100030c cVar2 = this.f93344d;
                        long beginTransaction = fVar.beginTransaction(Thread.currentThread().getId());
                        for (C34715b replace$default : linkedHashSet) {
                            MvvmStorage.replace$default(cVar2, replace$default, false, false, 6, (Object) null);
                        }
                        fVar.endTransaction(beginTransaction);
                        Log.m105924i("MicroMsg.HashInfo.HashUserNameMapStorage", "init end size:" + linkedHashSet.size());
                    } else {
                        Log.m105924i("MicroMsg.HashInfo.HashUserNameMapStorage", "init end db is null size:" + linkedHashSet.size());
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: n02.c$b */
    public static final class C34717b {

        /* renamed from: a */
        public final LinkedList<C34715b> f93346a = new LinkedList<>();

        /* renamed from: a */
        public final C34715b mo59708a(C32226l<? super C34715b, Boolean> lVar) {
            synchronized (this.f93346a) {
                C8478d0 d0Var = new C8478d0();
                d0Var.f27483d = -1;
                C8479f0 f0Var = new C8479f0();
                int i = 0;
                Iterator<T> it = this.f93346a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        T t = (C34715b) next;
                        if (lVar.invoke(t).booleanValue()) {
                            d0Var.f27483d = i;
                            f0Var.f27484d = t;
                            break;
                        }
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                int i3 = d0Var.f27483d;
                if (i3 == -1 || f0Var.f27484d == null) {
                    C13598b0 b0Var = C13598b0.f38549a;
                    return null;
                }
                this.f93346a.remove(i3);
                this.f93346a.addLast(f0Var.f27484d);
                C34715b bVar = (C34715b) f0Var.f27484d;
                return bVar;
            }
        }

        /* renamed from: b */
        public final void mo59709b(C34715b bVar) {
            C87412m.m108594g(bVar, "map");
            synchronized (this.f93346a) {
                this.f93346a.addLast(bVar);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }

        public String toString() {
            return "cache:" + this.f93346a.size() + " - " + this.f93346a;
        }
    }

    /* renamed from: n02.c$c */
    public static final class C34718c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C100030c f93347d;

        /* renamed from: e */
        public final /* synthetic */ String f93348e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34718c(C100030c cVar, String str) {
            super(0);
            this.f93347d = cVar;
            this.f93348e = str;
        }

        public Object invoke() {
            if (C100030c.m130699d3(this.f93347d, this.f93348e) != null) {
                Log.m105918d("MicroMsg.HashInfo.HashUserNameMapStorage", "update already cal " + this.f93348e);
            } else {
                C34715b bVar = new C34715b();
                String str = this.f93348e;
                bVar.field_UserName = str;
                C100030c cVar = this.f93347d;
                bVar.field_HashUserName = cVar.mo139357c3(str, cVar.mo139359f3());
                C100030c cVar2 = this.f93347d;
                bVar.field_CommHashUserName = cVar2.mo139357c3(this.f93348e, cVar2.mo139358e3());
                C100030c cVar3 = this.f93347d;
                bVar.field_HardCodeHashUserName = cVar3.mo139357c3(this.f93348e, cVar3.mo139356a());
                MvvmStorage.replace$default(this.f93347d, bVar, false, false, 6, (Object) null);
                Log.m105918d("MicroMsg.HashInfo.HashUserNameMapStorage", "update finished update " + this.f93348e + ' ' + bVar.field_CommHashUserName);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: n02.c$d */
    public static final class C76815d extends C87413o implements C32226l<Character, CharSequence> {

        /* renamed from: d */
        public static final C76815d f224624d = new C76815d();

        public C76815d() {
            super(1);
        }

        public Object invoke(Object obj) {
            return String.valueOf(((Character) obj).charValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100030c(IMvvmDBProvider iMvvmDBProvider) {
        super(iMvvmDBProvider);
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
        C61926c.m72657B("HashUserNameMapStorage_INIT", true, new C34716a(this, iMvvmDBProvider));
        this.f293055f = new C34717b();
    }

    /* renamed from: d3 */
    public static final C34715b m130699d3(C100030c cVar, String str) {
        cVar.getClass();
        if (str == null || C112551y.m153811k(str)) {
            return null;
        }
        SingleTable singleTable = C35072a.f94102g;
        C87412m.m108593f(singleTable, "TABLE");
        Column column = C35072a.f94103h;
        C87412m.m108593f(column, "USERNAME");
        SelectSql.Builder selectAll = singleTable.selectAll();
        String escapeSqlValue = Util.escapeSqlValue(str);
        C87412m.m108593f(escapeSqlValue, "escapeSqlValue(userName)");
        return (C34715b) selectAll.where(column.equal(escapeSqlValue)).build().singleQuery(cVar.getDbProvider().getDB(), C34715b.class);
    }

    /* renamed from: a */
    public final String mo139356a() {
        String str = this.f293056h4;
        if (str == null || C112551y.m153811k(str)) {
            this.f293056h4 = mo139362j3("5feceb66ffc86f38d952786c6d696c79c2dbc239dd4e91b46729d73a27fb57e9", "f0390fff96a5ab7168f9e9a6f8e9f4f4bdd87d2be99f7d27faf19dfc0725e875");
        }
        return this.f293056h4;
    }

    /* renamed from: c3 */
    public final String mo139357c3(String str, String str2) {
        byte[] bArr;
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            Charset charset = C119027c.f356488a;
            byte[] bytes = str2.getBytes(charset);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            instance.init(new SecretKeySpec(bytes, "HmacSHA256"));
            if (str != null) {
                bArr = str.getBytes(charset);
                C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = null;
            }
            String encodeHexString = Util.encodeHexString(instance.doFinal(bArr));
            C87412m.m108593f(encodeHexString, "encodeHexString(sha256_H…nal(text?.toByteArray()))");
            return encodeHexString;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e3 */
    public final String mo139358e3() {
        String str;
        String str2 = this.f293054e;
        boolean z = false;
        if (str2 == null || C112551y.m153811k(str2)) {
            String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_ACCOUNT_SALT_STRING_SYNC, (String) null);
            if (I == null || C112551y.m153811k(I)) {
                z = true;
            }
            if (z) {
                Log.m105928w("MicroMsg.HashInfo.HashUserNameMapStorage", "ACC_SALT is empty");
                str = "";
            } else {
                C87412m.m108593f(I, "acc_salt");
                str = mo139362j3(I, "64ad9fafb003525bbc9f8fb1a3cd271e8efc2002c3a3d23806ad66e165325d4e");
            }
            this.f293054e = str;
        }
        return this.f293054e;
    }

    /* renamed from: f3 */
    public final String mo139359f3() {
        String str;
        String str2 = this.f293053d;
        boolean z = false;
        if (str2 == null || C112551y.m153811k(str2)) {
            String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_ACCOUNT_SALT_STRING_SYNC, (String) null);
            if (I == null || C112551y.m153811k(I)) {
                z = true;
            }
            if (z) {
                Log.m105928w("MicroMsg.HashInfo.HashUserNameMapStorage", "ACC_SALT is empty");
                str = "";
            } else {
                C87412m.m108593f(I, "acc_salt");
                str = mo139362j3(I, "765272c5645917a2578092a523cd2a37ccf0b352d16d9744d5b5bd4668e71c4a");
            }
            this.f293053d = str;
        }
        return this.f293053d;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [com.tencent.mm.sdk.storage.IAutoDBItem] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo139360g3(java.lang.String r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == 0) goto L_0x000c
            boolean r1 = z04.C112551y.m153811k(r5)
            if (r1 == 0) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            r1 = 0
            goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            r2 = 0
            if (r1 == 0) goto L_0x0011
            return r2
        L_0x0011:
            n02.c$b r1 = r4.f293055f
            r1.getClass()
            java.lang.String r3 = "hashUserName"
            gy3.C87412m.m108594g(r5, r3)
            n02.d r3 = new n02.d
            r3.<init>(r6, r5)
            n02.b r1 = r1.mo59708a(r3)
            if (r1 != 0) goto L_0x007a
            com.tencent.mm.sdk.storage.sql.SingleTable r1 = o02.C35072a.f94102g
            java.lang.String r3 = "TABLE"
            gy3.C87412m.m108593f(r1, r3)
            if (r6 == r0) goto L_0x0042
            r0 = 3
            if (r6 == r0) goto L_0x003a
            com.tencent.mm.sdk.storage.sql.Column r6 = o02.C35072a.f94105j
            java.lang.String r0 = "COMMHASHUSERNAME"
            gy3.C87412m.m108593f(r6, r0)
            goto L_0x0049
        L_0x003a:
            com.tencent.mm.sdk.storage.sql.Column r6 = o02.C35072a.f94100Z2
            java.lang.String r0 = "HARDCODEHASHUSERNAME"
            gy3.C87412m.m108593f(r6, r0)
            goto L_0x0049
        L_0x0042:
            com.tencent.mm.sdk.storage.sql.Column r6 = o02.C35072a.f94104i
            java.lang.String r0 = "HASHUSERNAME"
            gy3.C87412m.m108593f(r6, r0)
        L_0x0049:
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r1.selectAll()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r5)
            java.lang.String r1 = "escapeSqlValue(hashUserName)"
            gy3.C87412m.m108593f(r5, r1)
            com.tencent.mm.sdk.storage.sql.SingleCondition r5 = r6.equal((java.lang.String) r5)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r5 = r0.where(r5)
            com.tencent.mm.sdk.storage.sql.SelectSql r5 = r5.build()
            com.tencent.mm.sdk.storage.mvvm.IMvvmDBProvider r6 = r4.getDbProvider()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.getDB()
            java.lang.Class<n02.b> r0 = n02.C34715b.class
            com.tencent.mm.sdk.storage.IAutoDBItem r5 = r5.singleQuery(r6, r0)
            r1 = r5
            n02.b r1 = (n02.C34715b) r1
            if (r1 == 0) goto L_0x007a
            n02.c$b r5 = r4.f293055f
            r5.mo59709b(r1)
        L_0x007a:
            if (r1 == 0) goto L_0x007e
            java.lang.String r2 = r1.field_UserName
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n02.C100030c.mo139360g3(java.lang.String, int):java.lang.String");
    }

    /* renamed from: i3 */
    public final void mo139361i3(String str) {
        C87412m.m108594g(str, "userName");
        String f3 = mo139359f3();
        if (!(f3 == null || f3.length() == 0) && !C112551y.m153811k(str)) {
            C61926c.m72657B("MicroMsg.HashInfo.HashUserNameMapStorage", true, new C34718c(this, str));
        }
    }

    /* renamed from: j3 */
    public final String mo139362j3(String str, String str2) {
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            arrayList.add(Character.valueOf((char) (str2.charAt(i2) ^ str.charAt(i))));
            i++;
            i2++;
        }
        return C110818d0.m150921S(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C76815d.f224624d, 30, (Object) null);
    }
}
