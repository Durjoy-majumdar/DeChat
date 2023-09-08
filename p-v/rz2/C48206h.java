package rz2;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C77813z;
import ux3.C65486b;
import uz2.C52678e0;
import wz2.C53270a;
import z04.C112551y;

/* renamed from: rz2.h */
public final class C48206h extends MAutoStorage<C48201c> {

    /* renamed from: f */
    public static final String[] f129188f = {MAutoStorage.getCreateSQLs(C48201c.f129176B1, "TextStatus")};

    /* renamed from: d */
    public final ISQLiteDatabase f129189d;

    /* renamed from: e */
    public final C13601g f129190e = C36568h.m40985a(new C48207a(this));

    /* renamed from: rz2.h$a */
    public static final class C48207a extends C87413o implements C32224a<ConcurrentHashMap<String, C48201c>> {

        /* renamed from: d */
        public final /* synthetic */ C48206h f129191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48207a(C48206h hVar) {
            super(0);
            this.f129191d = hVar;
        }

        public Object invoke() {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            long currentTimeMillis = System.currentTimeMillis();
            int e = C31543z5.m39455e();
            StringBuilder sb = new StringBuilder();
            sb.append("select rowid, * from ");
            String[] strArr = C48206h.f129188f;
            sb.append("TextStatus");
            sb.append(" where ExpireTime > ");
            sb.append(e);
            sb.append(' ');
            Cursor rawQuery = this.f129191d.f129189d.rawQuery(sb.toString(), (String[]) null);
            C87412m.m108593f(rawQuery, "db.rawQuery(sql, null)");
            while (rawQuery.moveToNext()) {
                C48201c cVar = new C48201c();
                cVar.convertFrom(rawQuery);
                concurrentHashMap.put(cVar.field_UserName, cVar);
            }
            rawQuery.close();
            Log.m105924i("MicroMsg.TextStatus.TextStatusStorage", "init time " + (System.currentTimeMillis() - currentTimeMillis) + " serverCurTime:" + e + " size:" + Integer.valueOf(rawQuery.getCount()));
            return concurrentHashMap;
        }
    }

    /* renamed from: rz2.h$b */
    public static final class C48208b {

        /* renamed from: a */
        public String f129192a;

        /* renamed from: b */
        public List<C48201c> f129193b;

        public C48208b(String str, List<C48201c> list) {
            C87412m.m108594g(str, "topicId");
            C87412m.m108594g(list, "items");
            this.f129192a = str;
            this.f129193b = list;
        }
    }

    /* renamed from: rz2.h$c */
    public static final class C48209c<T> implements Comparator {
        public final int compare(T t, T t2) {
            C48208b bVar = (C48208b) t2;
            int i = 0;
            Integer valueOf = Integer.valueOf(bVar.f129193b.size() > 0 ? bVar.f129193b.get(0).field_CreateTime : 0);
            C48208b bVar2 = (C48208b) t;
            if (bVar2.f129193b.size() > 0) {
                i = bVar2.f129193b.get(0).field_CreateTime;
            }
            return C65486b.m77169a(valueOf, Integer.valueOf(i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48206h(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C48201c.f129176B1, "TextStatus", C53270a.f148615U);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C48201c.f129176B1;
        this.f129189d = iSQLiteDatabase;
    }

    /* renamed from: DN */
    public boolean update(C48201c cVar, String... strArr) {
        C87412m.m108594g(cVar, "item");
        C87412m.m108594g(strArr, "keys");
        boolean updateNotify = super.updateNotify(cVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (updateNotify) {
            mo72966Yt().put(cVar.field_UserName, cVar);
            super.doNotify(cVar.field_UserName);
        }
        return updateNotify;
    }

    /* renamed from: LL */
    public final boolean mo72961LL(C48201c cVar) {
        C87412m.m108594g(cVar, "item");
        if (super.replace(cVar, false)) {
            super.doNotify(cVar.field_UserName);
        }
        return false;
    }

    /* renamed from: Lo */
    public final boolean mo72962Lo(String str, String str2) {
        C48201c cVar;
        C87412m.m108594g(str, "statusId");
        C87412m.m108594g(str2, "userName");
        boolean z = true;
        if (this.f129189d.delete("TextStatus", "StatusID = ?", new String[]{str}) <= 0) {
            z = false;
        }
        if (z && (cVar = mo72966Yt().get(str2)) != null && C87412m.m108589b(cVar.field_StatusID, str)) {
            mo72966Yt().remove(str2);
            super.doNotify(str2);
        }
        return z;
    }

    /* renamed from: Ow */
    public final C48201c mo72963Ow(String str) {
        C87412m.m108594g(str, "statusId");
        for (C48201c next : mo72966Yt().values()) {
            if (C87412m.m108589b(next.field_StatusID, str) && !next.mo72946o2()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: SE */
    public final List<C48208b> mo72964SE(String str, String str2) {
        HashMap hashMap = new HashMap();
        for (C48201c next : mo72966Yt().values()) {
            C87412m.m108593f(next, "item");
            if (!C87412m.m108589b(str, C48200b.m53529b(next)) && !C87412m.m108589b(str2, next.field_UserName)) {
                if (!next.mo72946o2() && !TextUtils.isEmpty(C48200b.m53529b(next))) {
                    C48208b bVar = (C48208b) hashMap.get(C48200b.m53529b(next));
                    if (bVar == null) {
                        String b = C48200b.m53529b(next);
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(next);
                        hashMap.put(C48200b.m53529b(next), new C48208b(b, linkedList));
                    } else {
                        bVar.f129193b.add(next);
                    }
                }
                for (C48208b bVar2 : hashMap.values()) {
                    bVar2.getClass();
                    bVar2.f129193b = new LinkedList(C110818d0.m150943o0(bVar2.f129193b, new C48210i()));
                }
            }
        }
        return new LinkedList(C110818d0.m150943o0(hashMap.values(), new C48209c()));
    }

    /* renamed from: TE */
    public final int mo72965TE(String str) {
        int i = 0;
        for (C48201c next : mo72966Yt().values()) {
            if (!next.mo72946o2() && !next.field_UserName.equals(str)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: Yt */
    public final ConcurrentHashMap<String, C48201c> mo72966Yt() {
        return (ConcurrentHashMap) ((C36570n) this.f129190e).getValue();
    }

    /* renamed from: bD */
    public final List<C48201c> mo72967bD(C52678e0 e0Var, ArrayList<String> arrayList) {
        String c = e0Var != null ? C48200b.m53530c(e0Var) : null;
        ArrayList arrayList2 = new ArrayList();
        if (!(c == null || C112551y.m153811k(c))) {
            for (C48201c next : mo72966Yt().values()) {
                C87412m.m108593f(next, "item");
                if (C87412m.m108589b(C48200b.m53529b(next), c) && !next.mo72946o2()) {
                    if (arrayList == null || !arrayList.contains(next.field_UserName)) {
                        arrayList2.add(next);
                    }
                }
            }
            if (arrayList2.size() > 1) {
                C77813z.m93909o(arrayList2, new C48211j());
            }
        }
        return arrayList2;
    }

    /* renamed from: bF */
    public boolean insert(C48201c cVar) {
        C87412m.m108594g(cVar, "item");
        boolean insertNotify = super.insertNotify(cVar, false);
        if (insertNotify) {
            mo72966Yt().put(cVar.field_UserName, cVar);
            super.doNotify(cVar.field_UserName);
        }
        return insertNotify;
    }

    public boolean delete(IAutoDBItem iAutoDBItem, String[] strArr) {
        C48201c cVar = (C48201c) iAutoDBItem;
        C87412m.m108594g(cVar, "item");
        C87412m.m108594g(strArr, "keys");
        boolean delete = super.delete(cVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (delete) {
            mo72966Yt().remove(cVar.field_UserName);
            super.doNotify(cVar.field_UserName);
        }
        return delete;
    }

    public void doNotify(String str) {
        super.doNotify(str);
    }

    /* renamed from: jo */
    public final boolean mo72969jo(String str, int i) {
        C48201c cVar;
        C87412m.m108594g(str, "userName");
        Log.m105924i("MicroMsg.TextStatus.TextStatusStorage", "deleteByCreateTime " + str + ' ' + i);
        boolean z = false;
        if (this.f129189d.delete("TextStatus", "UserName = ? and CreateTime<?", new String[]{str, String.valueOf(i)}) > 0) {
            z = true;
        }
        if (z && (cVar = mo72966Yt().get(str)) != null && cVar.field_CreateTime < i) {
            mo72966Yt().remove(str);
            super.doNotify(str);
        }
        return z;
    }

    /* renamed from: kD */
    public final C48201c mo72970kD(String str) {
        if (str == null) {
            return null;
        }
        C48201c cVar = mo72966Yt().get(str);
        if (cVar != null && !cVar.mo72946o2()) {
            return cVar;
        }
        mo72966Yt().remove(str);
        return null;
    }

    /* renamed from: mI */
    public final void mo72971mI(String str) {
        Log.m105924i("MicroMsg.TextStatus.TextStatusStorage", "markRead " + str);
        C48201c kD = mo72970kD(str);
        if (kD != null) {
            int i = kD.field_state;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C48201c.f129176B1;
            int i2 = C48201c.f129177C1;
            if (i != i2) {
                kD.field_state = i2;
                update(kD, new String[0]);
            }
        }
    }

    /* renamed from: mL */
    public boolean replace(C48201c cVar) {
        C87412m.m108594g(cVar, "item");
        boolean replace = super.replace(cVar, false);
        if (replace) {
            mo72966Yt().put(cVar.field_UserName, cVar);
            super.doNotify(cVar.field_UserName);
        }
        return replace;
    }

    /* renamed from: qq */
    public final boolean mo72973qq(String str) {
        C87412m.m108594g(str, "userName");
        Log.m105924i("MicroMsg.TextStatus.TextStatusStorage", "delete " + str);
        boolean z = true;
        if (this.f129189d.delete("TextStatus", "UserName = ?", new String[]{str}) <= 0) {
            z = false;
        }
        if (z) {
            mo72966Yt().remove(str);
            super.doNotify(str);
        }
        return z;
    }

    public boolean update(long j, IAutoDBItem iAutoDBItem) {
        C48201c cVar = (C48201c) iAutoDBItem;
        C87412m.m108594g(cVar, "item");
        boolean update = super.update(j, cVar);
        if (update) {
            mo72966Yt().put(cVar.field_UserName, cVar);
            super.doNotify(cVar.field_UserName);
        }
        return update;
    }
}
