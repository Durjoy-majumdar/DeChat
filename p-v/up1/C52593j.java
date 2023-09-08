package up1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import bd1.C54446b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleCondition;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C72996z1;
import cy3.C58003b;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fe1.C58961d;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C46119x1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import p629ny.C76979h;
import p749xh.C53330c3;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64197v;
import ue1.C52528f;
import ue1.C65326e;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: up1.j */
public final class C52593j extends MAutoStorage<C52528f> implements C46119x1 {

    /* renamed from: e */
    public static final C52595b f146894e = new C52595b((C8480h) null);

    /* renamed from: f */
    public static final String[] f146895f = {MAutoStorage.getCreateSQLs(C52528f.f146718c1, "FinderConversation")};

    /* renamed from: g */
    public static final C52594a f146896g = new C52594a();

    /* renamed from: d */
    public final ISQLiteDatabase f146897d;

    /* renamed from: up1.j$a */
    public static final class C52594a implements C52528f.C52529a {
        /* renamed from: a */
        public CharSequence mo73473a(C52528f fVar) {
            Class cls = C76979h.class;
            C87412m.m108594g(fVar, "owner");
            Context context = MMApplicationContext.getContext();
            String str = fVar.field_editingMsg;
            if (str == null || C112551y.m153811k(str)) {
                SpannableString T1 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(context, fVar.field_digest);
                C87412m.m108593f(T1, "getService(ISpannableSer…text, owner.field_digest)");
                return T1;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(C0966R.string.ebn));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(C0966R.color.a_3)), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(" ").append(((C76979h) C86312j.m106911c(cls)).mo107057T1(context, fVar.field_editingMsg));
            return spannableStringBuilder;
        }

        /* renamed from: b */
        public void mo73474b(C52528f fVar) {
            CharSequence charSequence;
            C87412m.m108594g(fVar, "owner");
            String str = fVar.field_sessionId;
            if (C87412m.m108589b(str, "findersayhisessionholder")) {
                String string = MMApplicationContext.getContext().getString(C0966R.string.f360715ec3);
                fVar.f146722a1 = string;
                fVar.f146721Z0 = string;
            } else if (C87412m.m108589b(str, "finderaliassessionholder")) {
                String string2 = MMApplicationContext.getContext().getString(C0966R.string.ebl, new Object[]{C58961d.f168673a.mo84159f().getNickname()});
                fVar.f146722a1 = string2;
                fVar.f146721Z0 = string2;
            } else {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(fVar.field_sessionId);
                fVar.f146720Y0 = z1Var;
                fVar.f146722a1 = z1Var != null ? z1Var.mo62898f() : null;
                C72996z1 z1Var2 = fVar.f146720Y0;
                if (z1Var2 == null || (charSequence = z1Var2.f214114V1) == null) {
                    charSequence = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), fVar.f146722a1);
                }
                fVar.f146721Z0 = charSequence;
            }
        }
    }

    /* renamed from: up1.j$b */
    public static final class C52595b {
        public C52595b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C52528f mo73554a() {
            return new C52528f(C52593j.f146896g);
        }
    }

    /* renamed from: up1.j$c */
    public static final class C52596c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ Exception f146898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52596c(Exception exc) {
            super(0);
            this.f146898d = exc;
        }

        public Object invoke() {
            return "[checkOldConv] crash, errMsg" + this.f146898d.getMessage();
        }
    }

    /* renamed from: up1.j$d */
    public static final class C52597d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<C52528f> f146899d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f146900e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52597d(LinkedList<C52528f> linkedList, C8478d0 d0Var) {
            super(0);
            this.f146899d = linkedList;
            this.f146900e = d0Var;
        }

        public Object invoke() {
            return "[checkOldConv] status, total:" + this.f146899d.size() + ", failed:" + this.f146900e.f27483d;
        }
    }

    static {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C52528f.f146718c1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52593j(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C52528f.f146718c1, "FinderConversation", C53330c3.f149039K);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C52528f.f146718c1;
        this.f146897d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("FinderConversation", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_type_senderUserName_index ON FinderConversation(scene,type,senderUserName)");
        iSQLiteDatabase.execSQL("FinderConversation", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_type_senderUserNameVersion_index ON FinderConversation(scene,type,senderUserNameVersion)");
        iSQLiteDatabase.execSQL("FinderConversation", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_type_talker_index ON FinderConversation(scene,type,talker)");
    }

    /* renamed from: J8 */
    public int mo71565J8(String str) {
        C87412m.m108594g(str, "finderUsername");
        C54446b N1 = C66785b.f191882e.mo90661N1(str, true);
        if (N1 == null) {
            return 0;
        }
        SelectSql.Builder select = C53330c3.f149030B.select((Column) C53330c3.f149038J.max());
        Column column = C53330c3.f149037I;
        String str2 = N1.field_finder_version_username_history;
        C87412m.m108593f(str2, "account.field_finder_version_username_history");
        return select.where(column.inString(C112550d0.m153785U(str2, new String[]{";"}, false, 0, 6, (Object) null)).and(C53330c3.f149036H.equal((Number) 2))).build().singleInt(this.f146897d);
    }

    /* renamed from: K */
    public boolean mo71566K(String str) {
        C87412m.m108594g(str, "sessionId");
        boolean z = false;
        if (str.length() == 0) {
            return false;
        }
        C52528f fVar = get(str);
        int i = fVar.field_unReadCount;
        fVar.field_unReadCount = 0;
        fVar.field_readStatus = 1;
        if (i != 0) {
            z = update(fVar.systemRowid, fVar, false);
            doNotify(fVar.field_sessionId, 5, fVar);
        }
        Log.m105924i("Finder.ConversationStorage", "[clearUnreadCount] ret=" + z + ' ' + i + " => " + fVar.field_unReadCount + " sessionId=" + str);
        return z;
    }

    /* renamed from: Lo */
    public int mo73548Lo(int i, String str) {
        String str2 = str;
        C87412m.m108594g(str2, "finderUsername");
        C54446b N1 = C66785b.f191882e.mo90661N1(str2, true);
        if (N1 == null) {
            return 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        SingleTable singleTable = C53330c3.f149030B;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        ISqlCondition and = C53330c3.f149036H.equal((Number) Integer.valueOf(i)).and(C53330c3.f149035G.equal((Number) 1));
        Column column = C53330c3.f149037I;
        String str3 = N1.field_finder_version_username_history;
        C87412m.m108593f(str3, "account.field_finder_version_username_history");
        SelectSql build = C53330c3.f149030B.select((List<? extends ISqlColumn>) linkedList).where(and.and(column.inString(C110818d0.m150953y0(C112550d0.m153785U(str3, new String[]{";"}, false, 0, 6, (Object) null))))).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build();
        C87412m.m108593f(build, "select()\n            .wh…  )\n            ).build()");
        List<C52528f> multiQuery = build.multiQuery(this.f146897d, C52528f.class);
        String name = Thread.currentThread().getName();
        C87412m.m108593f(name, "currentThread().name");
        String sql = build.toSql();
        C87412m.m108594g(sql, "sql");
        new C65326e("FinderConversationStorage.getGreetConvCount", C112551y.m153815o(sql, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
        return multiQuery.size();
    }

    /* renamed from: Ow */
    public boolean replace(C52528f fVar, boolean z) {
        Throwable th;
        C52528f fVar2 = fVar;
        StringBuilder sb = new StringBuilder();
        sb.append("[replace] ");
        sb.append(fVar2 != null ? C52598k.m58934a(fVar) : null);
        Log.m105924i("Finder.ConversationStorage", sb.toString());
        boolean z2 = false;
        if (fVar2 == null) {
            return false;
        }
        ContentValues convertTo = fVar.convertTo();
        String str = fVar2.field_sessionId;
        C87412m.m108593f(str, "item.field_sessionId");
        long uptimeMillis = SystemClock.uptimeMillis();
        String str2 = "select *, rowid from FinderConversation where sessionId = '" + str + "' ";
        Cursor rawQuery = this.f146897d.rawQuery(str2, (String[]) null);
        try {
            String name = Thread.currentThread().getName();
            C87412m.m108593f(name, "currentThread().name");
            C87412m.m108594g(str2, "sql");
            new C65326e("FinderConversationStorage.isExit", C112551y.m153815o(str2, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
            boolean z3 = rawQuery.getCount() > 0;
            C58003b.m67160a(rawQuery, (Throwable) null);
            if (z3) {
                if (this.f146897d.update(getTableName(), convertTo, "sessionId = ?", new String[]{"" + fVar2.field_sessionId}) > 0) {
                    z2 = true;
                }
            } else {
                z2 = super.insertNotify(fVar2, false);
            }
            if (z2 && z) {
                doNotify(fVar2.field_sessionId);
            }
            return z2;
        } catch (Throwable th4) {
            Throwable th5 = th4;
            C58003b.m67160a(rawQuery, th);
            throw th5;
        }
    }

    /* renamed from: Yt */
    public List<C52528f> mo73550Yt(String str, int i, int i2, int[] iArr, int i3) {
        List list;
        List list2;
        List list3;
        ArrayList arrayList;
        String str2 = str;
        int i4 = i;
        int i5 = i2;
        int[] iArr2 = iArr;
        int i6 = i3;
        C87412m.m108594g(str2, "finderUsername");
        LinkedList linkedList = new LinkedList();
        if (i6 == 1) {
            list = C64197v.m75537f(C75592q0.m90789s(), C75592q0.m90782l());
        } else {
            C54446b N1 = C66785b.f191882e.mo90661N1(str2, true);
            if (N1 == null) {
                return C64186f0.f181907d;
            }
            String str3 = N1.field_finder_version_username_history;
            C87412m.m108593f(str3, "account.field_finder_version_username_history");
            list = C110818d0.m150953y0(C112550d0.m153785U(str3, new String[]{";"}, false, 0, 6, (Object) null));
        }
        if (iArr2 != null) {
            list2 = new ArrayList();
            int length = iArr2.length;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr2[i7];
                if (i8 >= 100) {
                    list2.add(Integer.valueOf(i8));
                }
            }
        } else {
            list2 = C64186f0.f181907d;
        }
        if (iArr2 != null) {
            list3 = new ArrayList();
            int length2 = iArr2.length;
            for (int i9 = 0; i9 < length2; i9++) {
                int i15 = iArr2[i9];
                if (i15 < 100) {
                    list3.add(Integer.valueOf(i15));
                }
            }
        } else {
            list3 = C64186f0.f181907d;
        }
        SingleTable singleTable = C53330c3.f149030B;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        SingleCondition equal = C53330c3.f149036H.equal((Number) Integer.valueOf(i3));
        SingleCondition inString = C53330c3.f149037I.inString(list);
        Column column = C53330c3.f149035G;
        ISqlCondition or = equal.and(inString.and(column.inNumber(list3))).mo81855or(column.inNumber(list2));
        linkedList3.add(C53330c3.f149034F.orderDesc());
        linkedList3.add(C53330c3.f149033E.orderDesc());
        SelectSql.Limit limit = new SelectSql.Limit(i5, i4);
        SelectSql.Builder groupBy = C53330c3.f149030B.select((List<? extends ISqlColumn>) linkedList2).where(or).orderBy((List<? extends ISqlOrder>) linkedList3).groupBy((List<? extends Column>) linkedList4);
        groupBy.limit(limit.getLimit(), limit.getOffset());
        SelectSql build = groupBy.build();
        C87412m.m108593f(build, "select()\n               …\n                .build()");
        for (C52528f fVar : build.multiQuery(this.f146897d, C52528f.class)) {
            fVar.f146719X0 = f146896g;
            fVar.mo73472l2();
            linkedList.add(fVar);
        }
        Log.m105924i("Finder.ConversationStorage", "SQL=" + build);
        long uptimeMillis = SystemClock.uptimeMillis();
        String name = Thread.currentThread().getName();
        C87412m.m108593f(name, "currentThread().name");
        String sqlObj = build.toString();
        C87412m.m108594g(sqlObj, "sql");
        new C65326e("FinderConversationStorage.queryLimit", C112551y.m153815o(sqlObj, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
        StringBuilder sb = new StringBuilder();
        sb.append("[query] finderUsername=");
        sb.append(str2);
        sb.append(" offset=");
        sb.append(i4);
        sb.append(" pageCount=");
        sb.append(i5);
        sb.append(" type=");
        if (iArr2 != null) {
            arrayList = new ArrayList(iArr2.length);
            for (int valueOf : iArr2) {
                arrayList.add(Integer.valueOf(valueOf));
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        sb.append(" list size=");
        sb.append(linkedList.size());
        sb.append(", scene=");
        sb.append(i6);
        Log.m105924i("Finder.ConversationStorage", sb.toString());
        return linkedList;
    }

    public boolean deleteNotify(long j, boolean z) {
        C52528f fVar = new C52528f(f146896g);
        if (get(j, fVar)) {
            fVar.mo73472l2();
        }
        Log.m105924i("Finder.ConversationStorage", "[delete] rowId=" + j + " isNotify=" + z + ' ' + C52598k.m58934a(fVar));
        return super.deleteNotify(j, z);
    }

    public C52528f get(String str) {
        C87412m.m108594g(str, "sessionId");
        long uptimeMillis = SystemClock.uptimeMillis();
        String str2 = "select *, rowid from FinderConversation where sessionId = '" + str + "' ";
        Cursor rawQuery = this.f146897d.rawQuery(str2, (String[]) null);
        C52528f fVar = new C52528f(f146896g);
        fVar.field_sessionId = str;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                fVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        String name = Thread.currentThread().getName();
        C87412m.m108593f(name, "currentThread().name");
        C87412m.m108594g(str2, "sql");
        new C65326e("FinderConversationStorage.get", C112551y.m153815o(str2, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
        return fVar;
    }

    /* renamed from: jo */
    public boolean delete(C52528f fVar, boolean z, String... strArr) {
        C87412m.m108594g(strArr, "keys");
        StringBuilder sb = new StringBuilder();
        sb.append("[delete] ");
        sb.append(fVar != null ? C52598k.m58934a(fVar) : null);
        Log.m105924i("Finder.ConversationStorage", sb.toString());
        return super.delete(fVar, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bc A[Catch:{ Exception -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m40() {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r2 = "currentThread().name"
            java.lang.String r3 = "Finder.ConversationStorage"
            java.lang.String r0 = "[checkOldConv] begin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            long r5 = android.os.SystemClock.uptimeMillis()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f146897d
            java.lang.String r7 = "select * from FinderConversation"
            r13 = 0
            android.database.Cursor r14 = r0.rawQuery(r7, r13)
            r21 = 0
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0252 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0252 }
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ all -> 0x0252 }
            r8 = 44
            r9 = 59
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r17 = z04.C112551y.m153815o(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0252 }
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0252 }
            long r18 = r7 - r5
            java.lang.String r16 = "FinderConversationStorage.checkOldConv"
            ue1.e r5 = new ue1.e     // Catch:{ all -> 0x0252 }
            r15 = r5
            r20 = r0
            r15.<init>(r16, r17, r18, r20, r21)     // Catch:{ all -> 0x0252 }
            r5.mo89421a()     // Catch:{ all -> 0x0252 }
        L_0x0048:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x0252 }
            if (r0 == 0) goto L_0x005c
            ue1.f r0 = new ue1.f     // Catch:{ all -> 0x0252 }
            up1.j$a r5 = f146896g     // Catch:{ all -> 0x0252 }
            r0.<init>(r5)     // Catch:{ all -> 0x0252 }
            r0.convertFrom(r14)     // Catch:{ all -> 0x0252 }
            r4.add(r0)     // Catch:{ all -> 0x0252 }
            goto L_0x0048
        L_0x005c:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0252 }
            cy3.C58003b.m67160a(r14, r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "[convList] size:"
            r0.append(r5)
            int r5 = r4.size()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.String r0 = eb0.C75592q0.m90789s()
            zc1.b r5 = zc1.C66785b.f191882e
            java.lang.String r5 = r5.mo90662O5()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r1.f146897d
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.storagebase.SqliteDB"
            gy3.C87412m.m108592e(r6, r7)
            zh3.f r6 = (zh3.C91753f) r6
            long r8 = r6.mo125613a()
            gy3.d0 r6 = new gy3.d0
            r6.<init>()
            long r10 = java.lang.System.currentTimeMillis()
            java.util.Iterator r14 = r4.iterator()     // Catch:{ Exception -> 0x0161 }
            r15 = 1
        L_0x009e:
            boolean r16 = r14.hasNext()     // Catch:{ Exception -> 0x0161 }
            if (r16 == 0) goto L_0x0121
            java.lang.Object r16 = r14.next()     // Catch:{ Exception -> 0x0161 }
            r12 = r16
            ue1.f r12 = (ue1.C52528f) r12     // Catch:{ Exception -> 0x0161 }
            java.lang.String r13 = r12.field_senderUserName     // Catch:{ Exception -> 0x0161 }
            if (r13 == 0) goto L_0x00b9
            int r13 = r13.length()     // Catch:{ Exception -> 0x0161 }
            if (r13 != 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r13 = 0
            goto L_0x00ba
        L_0x00b9:
            r13 = 1
        L_0x00ba:
            if (r13 == 0) goto L_0x011a
            java.lang.String r13 = r12.field_talker     // Catch:{ Exception -> 0x0161 }
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85817T4(r13)     // Catch:{ Exception -> 0x0161 }
            if (r13 == 0) goto L_0x00cd
            r12.field_senderUserName = r0     // Catch:{ Exception -> 0x0161 }
            r13 = 1
            r12.field_senderRoleType = r13     // Catch:{ Exception -> 0x00ca }
            goto L_0x00d2
        L_0x00ca:
            r0 = move-exception
            goto L_0x0163
        L_0x00cd:
            r12.field_senderUserName = r5     // Catch:{ Exception -> 0x0161 }
            r13 = 3
            r12.field_senderRoleType = r13     // Catch:{ Exception -> 0x0161 }
        L_0x00d2:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0161 }
            r13.<init>()     // Catch:{ Exception -> 0x0161 }
            r18 = r0
            java.lang.String r0 = "UPDATE FinderConversation SET senderUserName = '"
            r13.append(r0)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r0 = r12.field_senderUserName     // Catch:{ Exception -> 0x0161 }
            r13.append(r0)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r0 = "' , senderRoleType = '"
            r13.append(r0)     // Catch:{ Exception -> 0x0161 }
            int r0 = r12.field_senderRoleType     // Catch:{ Exception -> 0x0161 }
            r13.append(r0)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r0 = "' WHERE talker = '"
            r13.append(r0)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r0 = r12.field_talker     // Catch:{ Exception -> 0x0161 }
            r13.append(r0)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r0 = "' "
            r13.append(r0)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x0161 }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r1.f146897d     // Catch:{ Exception -> 0x0161 }
            java.lang.String r13 = "FinderConversation"
            boolean r0 = r12.execSQL(r13, r0)     // Catch:{ Exception -> 0x0161 }
            if (r0 != 0) goto L_0x0111
            int r12 = r6.f27483d     // Catch:{ Exception -> 0x0161 }
            r13 = 1
            int r12 = r12 + r13
            r6.f27483d = r12     // Catch:{ Exception -> 0x00ca }
            goto L_0x0112
        L_0x0111:
            r13 = 1
        L_0x0112:
            if (r15 == 0) goto L_0x0118
            if (r0 == 0) goto L_0x0118
            r15 = 1
            goto L_0x011d
        L_0x0118:
            r15 = 0
            goto L_0x011d
        L_0x011a:
            r18 = r0
            r13 = 1
        L_0x011d:
            r0 = r18
            goto L_0x009e
        L_0x0121:
            r13 = 1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f146897d
            gy3.C87412m.m108592e(r0, r7)
            zh3.f r0 = (zh3.C91753f) r0
            r0.endTransaction(r8)
            r24 = 0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            gy3.C87412m.m108593f(r0, r2)
            r19 = 44
            r20 = 59
            r21 = 0
            r22 = 4
            r23 = 0
            java.lang.String r18 = "UPDATE FinderConversation SET senderUserName = 'xxxx' , senderRoleType = xxx WHERE talker = xx "
            java.lang.String r20 = z04.C112551y.m153815o(r18, r19, r20, r21, r22, r23)
            long r7 = android.os.SystemClock.uptimeMillis()
            long r21 = r7 - r10
            ue1.e r2 = new ue1.e
            java.lang.String r19 = "FinderConversationStorage.checkOldConv#UPDATE"
            r18 = r2
            r23 = r0
            r18.<init>(r19, r20, r21, r23, r24)
            r2.mo89421a()
            goto L_0x01d1
        L_0x015e:
            r0 = move-exception
            goto L_0x021a
        L_0x0161:
            r0 = move-exception
            r13 = 1
        L_0x0163:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            r5.<init>()     // Catch:{ all -> 0x015e }
            java.lang.String r12 = "crash catch [checkOldConv] "
            r5.append(r12)     // Catch:{ all -> 0x015e }
            java.lang.String r12 = r0.getMessage()     // Catch:{ all -> 0x015e }
            r5.append(r12)     // Catch:{ all -> 0x015e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x015e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)     // Catch:{ all -> 0x015e }
            ft1.a r18 = ft1.C59319a.f169618b     // Catch:{ all -> 0x015e }
            java.lang.String r19 = "checkOldConv"
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            up1.j$c r5 = new up1.j$c     // Catch:{ all -> 0x015e }
            r5.<init>(r0)     // Catch:{ all -> 0x015e }
            r25 = 28
            r26 = 0
            r24 = r5
            o40.C11348f.C11349a.m11178b(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x015e }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f146897d
            gy3.C87412m.m108592e(r0, r7)
            zh3.f r0 = (zh3.C91753f) r0
            r0.endTransaction(r8)
            r24 = 0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            gy3.C87412m.m108593f(r0, r2)
            java.lang.String r18 = "UPDATE FinderConversation SET senderUserName = 'xxxx' , senderRoleType = xxx WHERE talker = xx "
            r19 = 44
            r20 = 59
            r21 = 0
            r22 = 4
            r23 = 0
            java.lang.String r20 = z04.C112551y.m153815o(r18, r19, r20, r21, r22, r23)
            long r7 = android.os.SystemClock.uptimeMillis()
            long r21 = r7 - r10
            ue1.e r2 = new ue1.e
            java.lang.String r19 = "FinderConversationStorage.checkOldConv#UPDATE"
            r18 = r2
            r23 = r0
            r18.<init>(r19, r20, r21, r23, r24)
            r2.mo89421a()
            r15 = 0
        L_0x01d1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[checkOldConv] status, total:"
            r0.append(r2)
            int r2 = r4.size()
            r0.append(r2)
            java.lang.String r2 = ", failed:"
            r0.append(r2)
            int r2 = r6.f27483d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            ft1.a r18 = ft1.C59319a.f169618b
            int r0 = r6.f27483d
            if (r0 != 0) goto L_0x01fc
            r20 = 1
            goto L_0x01fe
        L_0x01fc:
            r20 = 0
        L_0x01fe:
            r21 = 0
            r22 = 0
            r23 = 0
            up1.j$d r0 = new up1.j$d
            r0.<init>(r4, r6)
            r25 = 28
            r26 = 0
            java.lang.String r19 = "checkOldConv-status"
            r24 = r0
            o40.C11348f.C11349a.m11178b(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r0 = "[checkOldConv] end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r15
        L_0x021a:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r1.f146897d
            gy3.C87412m.m108592e(r3, r7)
            zh3.f r3 = (zh3.C91753f) r3
            r3.endTransaction(r8)
            r18 = 0
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            gy3.C87412m.m108593f(r3, r2)
            r5 = 44
            r6 = 59
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r4 = "UPDATE FinderConversation SET senderUserName = 'xxxx' , senderRoleType = xxx WHERE talker = xx "
            java.lang.String r14 = z04.C112551y.m153815o(r4, r5, r6, r7, r8, r9)
            long r4 = android.os.SystemClock.uptimeMillis()
            long r15 = r4 - r10
            ue1.e r2 = new ue1.e
            java.lang.String r13 = "FinderConversationStorage.checkOldConv#UPDATE"
            r12 = r2
            r17 = r3
            r12.<init>(r13, r14, r15, r17, r18)
            r2.mo89421a()
            throw r0
        L_0x0252:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r14, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C52593j.m40():boolean");
    }

    /* renamed from: qq */
    public int mo73553qq(int i, int i2, String str) {
        SelectSql selectSql;
        int i3 = i2;
        String str2 = str;
        C87412m.m108594g(str2, "finderUsername");
        if (i == 1) {
            selectSql = i3 >= 0 ? C53330c3.f149030B.select((Column) C53330c3.f149032D.sum()).where(C53330c3.f149035G.equal((Number) Integer.valueOf(i2)).and(C53330c3.f149036H.equal((Number) Integer.valueOf(i)))).log("Finder.ConversationStorage").build() : C53330c3.f149030B.select((Column) C53330c3.f149032D.sum()).where(C53330c3.f149035G.equal((Number) Integer.valueOf(i2)).and(C53330c3.f149036H.equal((Number) Integer.valueOf(i)))).log("Finder.ConversationStorage").build();
        } else {
            C54446b N1 = C66785b.f191882e.mo90661N1(str2, true);
            if (N1 == null) {
                return 0;
            }
            if (i3 >= 0) {
                SelectSql.Builder select = C53330c3.f149030B.select((Column) C53330c3.f149032D.sum());
                Column column = C53330c3.f149037I;
                String str3 = N1.field_finder_version_username_history;
                C87412m.m108593f(str3, "account.field_finder_version_username_history");
                selectSql = select.where(column.inString(C112550d0.m153785U(str3, new String[]{";"}, false, 0, 6, (Object) null)).and(C53330c3.f149035G.equal((Number) Integer.valueOf(i2)).and(C53330c3.f149036H.equal((Number) Integer.valueOf(i))))).log("Finder.ConversationStorage").build();
            } else {
                SelectSql.Builder select2 = C53330c3.f149030B.select((Column) C53330c3.f149032D.sum());
                Column column2 = C53330c3.f149037I;
                String str4 = N1.field_finder_version_username_history;
                C87412m.m108593f(str4, "account.field_finder_version_username_history");
                selectSql = select2.where(column2.inString(C112550d0.m153785U(str4, new String[]{";"}, false, 0, 6, (Object) null)).and(C53330c3.f149036H.equal((Number) Integer.valueOf(i)))).log("Finder.ConversationStorage").build();
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int singleInt = selectSql.singleInt(this.f146897d);
        String name = Thread.currentThread().getName();
        C87412m.m108593f(name, "currentThread().name");
        String sql = selectSql.toSql();
        C87412m.m108594g(sql, "sql");
        new C65326e("FinderConversationStorage.getUnreadCount", C112551y.m153815o(sql, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
        Log.m105924i("Finder.ConversationStorage", "[getUnreadCount] type=" + i3 + " count=" + singleInt);
        return singleInt;
    }

    public boolean delete(IAutoDBItem iAutoDBItem, String[] strArr) {
        C52528f fVar = (C52528f) iAutoDBItem;
        C87412m.m108594g(strArr, "keys");
        StringBuilder sb = new StringBuilder();
        sb.append("[delete] ");
        sb.append(fVar != null ? C52598k.m58934a(fVar) : null);
        Log.m105924i("Finder.ConversationStorage", sb.toString());
        return super.delete(fVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
