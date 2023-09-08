package rb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p248ug.C52558c;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: rb0.j */
public class C47976j extends MAutoStorage<C52558c> {

    /* renamed from: e */
    public static final String[] f128682e = {MAutoStorage.getCreateSQLs(C52558c.f146783y0, "bizinfo")};

    /* renamed from: f */
    public static Map<String, String> f128683f = new HashMap();

    /* renamed from: g */
    public static final String[] f128684g = {"CREATE  INDEX IF NOT EXISTS type_username_index ON bizinfo ( type,username ) ", "CREATE  INDEX IF NOT EXISTS  username_acceptType_index ON bizinfo ( username,acceptType ) "};

    /* renamed from: d */
    public final MStorageEvent<C47978b, C47978b.C47980b> f128685d = new C47977a(this);

    /* renamed from: rb0.j$a */
    public class C47977a extends MStorageEvent<C47978b, C47978b.C47980b> {
        public C47977a(C47976j jVar) {
        }

        public boolean needNotifyExtension() {
            return true;
        }

        public void processEvent(Object obj, Object obj2) {
            ((C47978b) obj).mo70089m5((C47978b.C47980b) obj2);
        }

        public void processEventForExtensionOnDemand(Object obj) {
            C47978b.C47980b bVar = (C47978b.C47980b) obj;
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C47981c.class);
            C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar2.hasNext()) {
                ((C47981c) ((C38174i) bVar2.next()).get()).mo72773m5(bVar);
            }
        }
    }

    /* renamed from: rb0.j$b */
    public interface C47978b {

        /* renamed from: rb0.j$b$a */
        public enum C47979a {
            INSTERT,
            DELETE,
            UPDATE
        }

        /* renamed from: rb0.j$b$b */
        public static class C47980b {

            /* renamed from: a */
            public C47979a f128690a;

            /* renamed from: b */
            public String f128691b;

            /* renamed from: c */
            public C52558c f128692c;
        }

        /* renamed from: m5 */
        void mo70089m5(C47980b bVar);
    }

    /* renamed from: rb0.j$c */
    public interface C47981c extends C15510f {
        /* renamed from: m5 */
        void mo72773m5(C47978b.C47980b bVar);
    }

    public C47976j(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C52558c.f146783y0, "bizinfo", f128684g);
    }

    /* renamed from: CP */
    public final void mo72752CP(StringBuilder sb) {
        sb.append("select ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("username");
        sb.append(" ");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(1:2)|3|4|5|6|7|(1:9)|10|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002d */
    /* renamed from: DN */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor mo72753DN(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3.mo72772vP(r0)
            r3.mo72766kD(r0)
            r3.mo72756Ow(r0, r4)
            r1 = 1
            r3.mo72760Yt(r0, r1)
            r2 = 0
            if (r5 == 0) goto L_0x0018
            r3.mo72755Lo(r0, r2)
        L_0x0018:
            rb0.i r5 = rb0.C48009v0.Ex0()     // Catch:{ all -> 0x002d }
            rb0.h r4 = r5.mo72749jo(r4)     // Catch:{ all -> 0x002d }
            te3.lf r5 = new te3.lf     // Catch:{ all -> 0x002d }
            r5.<init>()     // Catch:{ all -> 0x002d }
            byte[] r4 = r4.field_raw_attrs     // Catch:{ all -> 0x002d }
            r5.parseFrom(r4)     // Catch:{ all -> 0x002d }
            java.util.LinkedList<java.lang.String> r4 = r5.f137369e     // Catch:{ all -> 0x002d }
            goto L_0x0032
        L_0x002d:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x003b }
            r4.<init>(r2)     // Catch:{ all -> 0x003b }
        L_0x0032:
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x003b }
            if (r5 != 0) goto L_0x003b
            r3.mo72765jo(r0, r4)     // Catch:{ all -> 0x003b }
        L_0x003b:
            java.lang.String r4 = " order by "
            r0.append(r4)
            java.lang.String r4 = "rcontact.type & 2048 desc, rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc "
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r4
            java.lang.String r0 = "MicroMsg.BizInfoStorage"
            java.lang.String r1 = "getEnterpriseEnableChild sql %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r5)
            f40.o r5 = f40.C86709a0.m107535s()
            zh3.f r5 = r5.f251811i
            r0 = 0
            android.database.Cursor r4 = r5.rawQuery(r4, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rb0.C47976j.mo72753DN(java.lang.String, boolean):android.database.Cursor");
    }

    /* renamed from: LL */
    public List<String> mo72754LL() {
        StringBuilder sb = new StringBuilder();
        sb.append("select ");
        sb.append("rcontact");
        sb.append(".");
        sb.append("username");
        sb.append(", ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("enterpriseFather");
        sb.append(", ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("bitFlag");
        sb.append(" & ");
        sb.append(1);
        mo72766kD(sb);
        mo72770qq(sb);
        sb.append(" and (");
        sb.append(" (");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("bitFlag");
        sb.append(" & ");
        sb.append(1);
        sb.append(") != 0");
        sb.append(" or ");
        sb.append(" (");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("acceptType");
        sb.append(" & ");
        sb.append(128);
        sb.append(") > 0 ");
        sb.append(" and (");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("brandFlag");
        sb.append(" & ");
        sb.append(1);
        sb.append(") == 0) ");
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.BizInfoStorage", "getEnterpriseConnectorList sql %s", sb4);
        Cursor rawQuery = C86709a0.m107535s().f251811i.rawQuery(sb4, (String[]) null, 2);
        ArrayList arrayList = new ArrayList();
        if (rawQuery == null) {
            return arrayList;
        }
        while (rawQuery.moveToNext()) {
            arrayList.add(rawQuery.getString((rawQuery.getInt(2) > 0 ? 1 : 0) ^ 1));
        }
        rawQuery.close();
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69677X3(arrayList);
    }

    /* renamed from: Lo */
    public final void mo72755Lo(StringBuilder sb, boolean z) {
        sb.append(" and (");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("bitFlag");
        sb.append(" & ");
        sb.append(1);
        sb.append(") ");
        sb.append(z ? "!=" : "==");
        sb.append(" 0 ");
    }

    /* renamed from: Ow */
    public final void mo72756Ow(StringBuilder sb, String str) {
        sb.append(" and ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("type");
        sb.append(" = ");
        sb.append(3);
        sb.append(" and ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("enterpriseFather");
        sb.append(" = '");
        sb.append(str);
        sb.append("' ");
    }

    /* renamed from: SE */
    public C52558c mo72757SE(String str) {
        C52558c cVar = new C52558c();
        cVar.field_username = str;
        super.get(cVar, new String[0]);
        return cVar;
    }

    /* renamed from: TE */
    public String mo72758TE(String str) {
        String str2 = null;
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.BizInfoStorage", "getBizChatBrandUserName userName is null");
            return null;
        }
        Map<String, String> map = f128683f;
        if (map == null || !((HashMap) map).containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            mo72752CP(sb);
            mo72766kD(sb);
            mo72756Ow(sb, str);
            mo72755Lo(sb, true);
            String sb4 = sb.toString();
            Log.m105925i("MicroMsg.BizInfoStorage", "getEnterpriseBizChatChild sql %s", sb4);
            Cursor rawQuery = C86709a0.m107535s().f251811i.rawQuery(sb4, (String[]) null, 2);
            if (rawQuery == null) {
                return null;
            }
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                ((HashMap) f128683f).put(str, str2);
            }
            rawQuery.close();
            return str2;
        }
        String str3 = (String) ((HashMap) f128683f).get(str);
        if (Util.isNullOrNil(str3) || !C45628s0.m50740E(str3)) {
            return null;
        }
        return str3;
    }

    /* renamed from: TO */
    public int mo72759TO(int i) {
        List<String> bO = mo72763bO(i);
        if (Util.isNullOrNil((List) bO)) {
            return 0;
        }
        return bO.size();
    }

    /* renamed from: Yt */
    public final void mo72760Yt(StringBuilder sb, boolean z) {
        sb.append(" and (");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("brandFlag");
        sb.append(" & ");
        sb.append(1);
        sb.append(") ");
        sb.append(z ? "==" : "!=");
        sb.append(" 0 ");
    }

    /* renamed from: bD */
    public void mo72761bD(C52558c cVar) {
        Log.m105925i("MicroMsg.BizInfoStorage", "delete biz ret = %b, username = %s", Boolean.valueOf(super.delete(cVar, "username")), cVar.field_username);
        C47978b.C47980b bVar = new C47978b.C47980b();
        bVar.f128691b = cVar.field_username;
        bVar.f128690a = C47978b.C47979a.DELETE;
        bVar.f128692c = cVar;
        this.f128685d.event(bVar);
        this.f128685d.doNotify();
    }

    /* renamed from: bF */
    public Cursor mo72762bF(String str) {
        C52558c.C52560b.C52563c.C52564a d;
        List<String> mI = mo72767mI(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) mI).iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            C52558c SE = mo72757SE(str3);
            SE.mo73499q2();
            C52558c.C52560b bVar = SE.f146785x0;
            if (!(bVar == null || (d = bVar.mo73511d()) == null)) {
                str2 = d.f146830d;
            }
            if (!Util.isNullOrNil(str2)) {
                arrayList.add(str3);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        mo72772vP(sb);
        mo72766kD(sb);
        mo72756Ow(sb, str);
        mo72760Yt(sb, true);
        sb.append(" and (");
        for (int i = 0; i < arrayList.size(); i++) {
            String str4 = (String) arrayList.get(i);
            if (i > 0) {
                sb.append(" or ");
            }
            sb.append("rcontact");
            sb.append(".");
            sb.append("username");
            sb.append(" = '");
            sb.append(str4);
            sb.append("'");
        }
        sb.append(") order by ");
        sb.append("rcontact.type & 2048 desc, rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc ");
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.BizInfoStorage", "getEnterpriseChatConnector sql %s", sb4);
        return C86709a0.m107535s().f251811i.rawQuery(sb4, (String[]) null, 0);
    }

    /* renamed from: bO */
    public List<String> mo72763bO(int i) {
        String format = String.format(Locale.US, "select %s from %s where %s & %d > 0", new Object[]{"username", "bizinfo", "acceptType", Integer.valueOf(i)});
        Log.m105925i("MicroMsg.BizInfoStorage", "getList: sql[%s]", format);
        long currentTicks = Util.currentTicks();
        Cursor rawQuery = rawQuery(format, new String[0]);
        LinkedList linkedList = new LinkedList();
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    linkedList.add(rawQuery.getString(0));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            Log.m105925i("MicroMsg.BizInfoStorage", "getMyAcceptList: type[%d], use time[%d ms]", Integer.valueOf(i), Long.valueOf(Util.ticksToNow(currentTicks)));
            return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69677X3(linkedList);
        }
        Log.m105925i("MicroMsg.BizInfoStorage", "getMyAcceptList: cursor not null, type[%d], use time[%d ms]", Integer.valueOf(i), Long.valueOf(Util.ticksToNow(currentTicks)));
        return linkedList;
    }

    /* renamed from: c */
    public void mo72764c(String str) {
        C52558c cVar = new C52558c();
        cVar.field_username = str;
        Log.m105925i("MicroMsg.BizInfoStorage", "delete biz ret = %b, username = %s", Boolean.valueOf(super.delete(cVar, "username")), str);
        C47978b.C47980b bVar = new C47978b.C47980b();
        bVar.f128691b = str;
        bVar.f128690a = C47978b.C47979a.DELETE;
        bVar.f128692c = cVar;
        this.f128685d.event(bVar);
        this.f128685d.doNotify();
    }

    /* renamed from: jo */
    public final void mo72765jo(StringBuilder sb, List<String> list) {
        if (!list.isEmpty()) {
            sb.append(" and (");
            sb.append("bizinfo");
            sb.append(".");
            sb.append("username");
            sb.append(" NOT IN (");
            int size = list.size();
            int i = size - 1;
            for (int i2 = 0; i2 < size; i2++) {
                sb.append("'");
                sb.append(list.get(i2));
                sb.append("'");
                if (i2 != i) {
                    sb.append(",");
                }
            }
            sb.append(")) ");
        }
    }

    /* renamed from: kD */
    public final void mo72766kD(StringBuilder sb) {
        sb.append(" from ");
        sb.append("rcontact");
        sb.append(", ");
        sb.append("bizinfo");
        sb.append(" where ");
        sb.append("rcontact");
        sb.append(".");
        sb.append("username");
        sb.append(" = ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("username");
        sb.append(" and (");
        sb.append("rcontact");
        sb.append(".");
        sb.append("verifyFlag");
        sb.append(" & ");
        int i = C72996z1.f214113Y1;
        sb.append(8);
        sb.append(") != 0 ");
        sb.append(" and (");
        sb.append("rcontact");
        sb.append(".");
        sb.append("type");
        sb.append(" & ");
        sb.append(1);
        sb.append(") != 0 ");
    }

    /* renamed from: mI */
    public List<String> mo72767mI(String str) {
        StringBuilder sb = new StringBuilder();
        mo72752CP(sb);
        mo72766kD(sb);
        mo72756Ow(sb, str);
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.BizInfoStorage", "getEnterpriseChildNameList sql %s", sb4);
        Cursor rawQuery = C86709a0.m107535s().f251811i.rawQuery(sb4, (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            arrayList.add(rawQuery.getString(0));
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: mL */
    public Cursor mo72768mL(String str, int i) {
        StringBuilder sb = new StringBuilder();
        mo72772vP(sb);
        mo72766kD(sb);
        mo72756Ow(sb, str);
        mo72755Lo(sb, false);
        mo72760Yt(sb, true);
        sb.append(" and (");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("acceptType");
        sb.append(" & ");
        sb.append(i);
        sb.append(") > 0 ");
        sb.append(" order by ");
        sb.append("rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc ");
        String sb4 = sb.toString();
        Log.m105925i("MicroMsg.BizInfoStorage", "getEnterpriseChildOfAcceptType sql %s", sb4);
        return C86709a0.m107535s().f251811i.rawQuery(sb4, (String[]) null);
    }

    /* renamed from: nP */
    public boolean insert(C52558c cVar) {
        C52558c.C52560b.C52562b e;
        cVar.field_updateTime = System.currentTimeMillis();
        cVar.mo73494l2();
        Log.m105927v("MicroMsg.BizInfoStorage", "username is %s, %s, %d, %s, %s, %s, %d", cVar.field_username, cVar.field_brandList, Integer.valueOf(cVar.field_brandFlag), cVar.field_brandInfo, cVar.field_extInfo, cVar.field_brandIconURL, Long.valueOf(cVar.field_updateTime));
        C52558c.C52560b r2 = cVar.mo73500r2(false);
        if (!(r2 == null || (e = r2.mo73512e()) == null)) {
            cVar.field_specialType = e.f146824c;
        }
        boolean insert = super.insert(cVar);
        if (insert && !C72996z1.m85820U5(cVar.field_username)) {
            C47978b.C47980b bVar = new C47978b.C47980b();
            bVar.f128691b = cVar.field_username;
            cVar.mo73505w2();
            bVar.f128690a = C47978b.C47979a.INSTERT;
            bVar.f128692c = cVar;
            this.f128685d.event(bVar);
            this.f128685d.doNotify();
        }
        return insert;
    }

    /* renamed from: qq */
    public final void mo72770qq(StringBuilder sb) {
        sb.append(" and ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("type");
        sb.append(" = ");
        sb.append(3);
        sb.append(" ");
    }

    /* renamed from: uP */
    public boolean replace(C52558c cVar) {
        C52558c.C52560b.C52562b e;
        cVar.field_updateTime = System.currentTimeMillis();
        cVar.mo73494l2();
        C52558c.C52560b r2 = cVar.mo73500r2(false);
        if (!(r2 == null || (e = r2.mo73512e()) == null)) {
            cVar.field_specialType = e.f146824c;
        }
        boolean replace = super.replace(cVar);
        if (replace && !C72996z1.m85820U5(cVar.field_username)) {
            C47978b.C47980b bVar = new C47978b.C47980b();
            bVar.f128691b = cVar.field_username;
            cVar.mo73505w2();
            bVar.f128690a = C47978b.C47979a.UPDATE;
            bVar.f128692c = cVar;
            this.f128685d.event(bVar);
            this.f128685d.doNotify();
        }
        return replace;
    }

    /* renamed from: vP */
    public final void mo72772vP(StringBuilder sb) {
        sb.append("select ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("brandIconURL");
        sb.append(", ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("type");
        sb.append(", ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("status");
        sb.append(", ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("enterpriseFather");
        sb.append(", ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("brandFlag");
        sb.append(", ");
        sb.append("bizinfo");
        sb.append(".");
        sb.append("extInfo");
        sb.append(", ");
        sb.append("rcontact");
        sb.append(".");
        sb.append("username");
        sb.append(", ");
        sb.append("rcontact");
        sb.append(".");
        sb.append("conRemark");
        sb.append(", ");
        sb.append("rcontact");
        sb.append(".");
        sb.append("quanPin");
        sb.append(", ");
        sb.append("rcontact");
        sb.append(".");
        sb.append("nickname");
        sb.append(", ");
        sb.append("rcontact");
        sb.append(".");
        sb.append("alias");
        sb.append(", ");
        sb.append("rcontact");
        sb.append(".");
        sb.append("type");
        sb.append(" ");
    }
}
