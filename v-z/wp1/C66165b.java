package wp1;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61937h;
import p749xh.C66260e3;
import p749xh.C66261f3;
import rx3.C13598b0;
import sx3.C64197v;
import up1.C14358p;
import up1.C14370y0;
import up1.C65418l;

/* renamed from: wp1.b */
public final class C66165b extends MAutoStorage<C66260e3> {

    /* renamed from: n */
    public static final String[] f190163n = {MAutoStorage.getCreateSQLs(C65418l.f188266N, "FinderDraftItem")};

    /* renamed from: o */
    public static final int f190164o = 1;

    /* renamed from: d */
    public final String f190165d = "FinderDraftItem";

    /* renamed from: e */
    public String f190166e;

    /* renamed from: f */
    public String f190167f;

    /* renamed from: g */
    public String f190168g;

    /* renamed from: h */
    public String f190169h;

    /* renamed from: i */
    public final ISQLiteDatabase f190170i;

    /* renamed from: j */
    public final ArrayList<Integer> f190171j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66165b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C65418l.f188266N, "FinderDraftItem", C66260e3.f190548u);
        C87412m.m108594g(iSQLiteDatabase, "_db");
        C65418l.C65419a aVar = C65418l.f188265M;
        this.f190170i = iSQLiteDatabase;
        ArrayList<Integer> b = C14370y0.f39926a.mo13672b(C64197v.m75537f(1, 2, 4));
        this.f190171j = b;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        Iterator<Integer> it = b.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if ((next.intValue() & 1) != 0 && (next.intValue() & 2) == 0 && (next.intValue() & 4) == 0) {
                arrayList.add(next);
            }
        }
        this.f190167f = C14370y0.f39926a.mo13671a(arrayList, "localFlag");
        arrayList.clear();
        Iterator<Integer> it4 = this.f190171j.iterator();
        while (it4.hasNext()) {
            Integer next2 = it4.next();
            if ((next2.intValue() & 1) != 0 || (next2.intValue() & 2) != 0) {
                arrayList.add(next2);
            }
        }
        this.f190168g = C14370y0.f39926a.mo13671a(arrayList, "localFlag");
        this.f190166e = "(markDeleted=0)";
        this.f190169h = "dbversion=" + f190164o;
        Log.m105924i("Finder.FinderDraftStorage", "CONDITION_POST " + this.f190167f + "； NOT_DELETED " + this.f190166e);
    }

    /* renamed from: jo */
    public static boolean m78044jo(C66165b bVar, long j, boolean z, int i, Object obj) {
        bVar.getClass();
        Log.m105924i("Finder.FinderDraftStorage", "deleteByLocalId " + j);
        ISQLiteDatabase iSQLiteDatabase = bVar.f190170i;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(j);
        return iSQLiteDatabase.delete("FinderDraftItem", "localId=?", new String[]{sb.toString()}) > 0;
    }

    /* renamed from: Lo */
    public final boolean mo90224Lo(long j) {
        if (j == 0) {
            return true;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f190170i;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(j);
        return iSQLiteDatabase.delete("FinderDraftItem", "objectId=?", new String[]{sb.toString()}) > 0;
    }

    /* renamed from: Ow */
    public final long mo90225Ow(C65418l lVar) {
        long G;
        C87412m.m108594g(lVar, "draftItem");
        lVar.mo89516n2();
        if (lVar.field_finderItem == null) {
            Log.m105920e("Finder.FinderDraftStorage", "insertNewDraft but field_finderItem is null");
            return -1;
        }
        String[] strArr = C14358p.f39908i;
        synchronized (C14358p.f39909j) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_FINDERITEM_MAXID_LONG_SYNC;
            G = i.mo119673G(aVar, 1);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(1 + G));
            C13598b0 b0Var = C13598b0.f38549a;
        }
        lVar.field_localId = G;
        long insert = this.f190170i.insert(this.f190165d, C66261f3.COL_LOCALID, lVar.convertTo());
        Log.m105924i("Finder.FinderDraftStorage", "new draft rowId " + insert + ' ' + C61937h.m72709h(lVar) + " localID: " + G);
        return G;
    }

    /* renamed from: Yt */
    public final C65418l mo90226Yt(long j) {
        if (j == 0) {
            return null;
        }
        Cursor rawQuery = this.f190170i.rawQuery("SELECT * FROM FinderDraftItem  WHERE " + this.f190165d + ".objectId=" + j, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            C65418l lVar = new C65418l();
            lVar.convertFrom(rawQuery);
            rawQuery.close();
            return lVar;
        }
        rawQuery.close();
        return null;
    }

    /* renamed from: bD */
    public final void mo90227bD(long j) {
        C65418l qq = mo90229qq(j);
        if (qq != null) {
            Log.m105924i("Finder.FinderDraftStorage", "markDeleted, " + qq.mo89515m2());
            qq.field_markDeleted = 1;
            mo90228kD(j, qq);
        }
    }

    /* renamed from: kD */
    public final boolean mo90228kD(long j, C65418l lVar) {
        C87412m.m108594g(lVar, "draftItem");
        lVar.mo89516n2();
        ContentValues convertTo = lVar.convertTo();
        convertTo.remove("rowid");
        ISQLiteDatabase iSQLiteDatabase = this.f190170i;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(j);
        return iSQLiteDatabase.update("FinderDraftItem", convertTo, "localId=?", new String[]{sb.toString()}) > 0;
    }

    /* renamed from: qq */
    public final C65418l mo90229qq(long j) {
        Cursor rawQuery = this.f190170i.rawQuery("SELECT * FROM FinderDraftItem  WHERE " + this.f190166e + " AND " + this.f190165d + ".localId=" + j, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            C65418l lVar = new C65418l();
            lVar.convertFrom(rawQuery);
            rawQuery.close();
            return lVar;
        }
        rawQuery.close();
        return null;
    }
}
