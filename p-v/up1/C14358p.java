package up1;

import android.database.Cursor;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import gy3.C8477a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import o40.C61937h;
import p749xh.C66261f3;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C49863il0;
import te3.C50140kk0;
import vp1.C14935l;
import vp1.C14937o;

/* renamed from: up1.p */
public final class C14358p extends MAutoStorage<C66261f3> {

    /* renamed from: i */
    public static final String[] f39908i = {MAutoStorage.getCreateSQLs(FinderItem.info, C66261f3.TABLE_NAME)};

    /* renamed from: j */
    public static final Object f39909j = new Object();

    /* renamed from: d */
    public final String f39910d = C66261f3.TABLE_NAME;

    /* renamed from: e */
    public String f39911e;

    /* renamed from: f */
    public String f39912f;

    /* renamed from: g */
    public final ISQLiteDatabase f39913g;

    /* renamed from: h */
    public final ArrayList<Integer> f39914h;

    static {
        FinderItem.Companion.getClass();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14358p(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, FinderItem.info, C66261f3.TABLE_NAME, C66261f3.INDEX_CREATE);
        C87412m.m108594g(iSQLiteDatabase, "_db");
        FinderItem.Companion.getClass();
        this.f39913g = iSQLiteDatabase;
        ArrayList<Integer> b = C14370y0.f39926a.mo13672b(C64197v.m75537f(1, 2));
        this.f39914h = b;
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = b.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if ((next.intValue() & 1) != 0 && (next.intValue() & 2) == 0) {
                arrayList.add(next);
            }
        }
        this.f39911e = C14370y0.f39926a.mo13671a(arrayList, "localFlag");
        Log.m105924i("Finder.FinderFeedStorage", "CONDITION_POST " + this.f39911e);
        arrayList.clear();
        Iterator<Integer> it4 = this.f39914h.iterator();
        while (it4.hasNext()) {
            Integer next2 = it4.next();
            if ((next2.intValue() & 1) != 0 || (next2.intValue() & 2) != 0) {
                arrayList.add(next2);
            }
        }
        this.f39912f = C14370y0.f39926a.mo13671a(arrayList, "localFlag");
        Log.m105924i("Finder.FinderFeedStorage", "FAIL_OR_WAITING " + this.f39912f);
    }

    public final List<FinderItem> Hw0() {
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f39913g.rawQuery("SELECT * FROM FinderFeedItem  WHERE localFlag IN (1, 2);", (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            FinderItem finderItem = new FinderItem();
            finderItem.convertFrom(rawQuery);
            arrayList.add(finderItem);
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: Lo */
    public final FinderItem mo13662Lo(long j) {
        Cursor rawQuery = this.f39913g.rawQuery("SELECT * FROM FinderFeedItem  WHERE FinderFeedItem.localId=" + j, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            FinderItem finderItem = new FinderItem();
            finderItem.convertFrom(rawQuery);
            rawQuery.close();
            return finderItem;
        }
        rawQuery.close();
        return null;
    }

    /* renamed from: Yt */
    public final long mo13663Yt(FinderItem finderItem) {
        long G;
        C87412m.m108594g(finderItem, "finderObj");
        synchronized (f39909j) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_FINDERITEM_MAXID_LONG_SYNC;
            G = i.mo119673G(aVar, 1);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(1 + G));
            C13598b0 b0Var = C13598b0.f38549a;
        }
        finderItem.setLocalId(G);
        long insert = this.f39913g.insert(C66261f3.TABLE_NAME, C66261f3.COL_LOCALID, finderItem.convertTo());
        Log.m105924i("Finder.FinderFeedStorage", "new feed rowId " + insert + ' ' + C61937h.m72709h(finderItem.getFeedObject()) + " localID: " + G);
        return G;
    }

    /* renamed from: jo */
    public final boolean mo13664jo(long j, boolean z) {
        C49863il0 il02;
        LinkedList<C50140kk0> linkedList;
        if (z) {
            C14937o.C14938a aVar = C14937o.f40972a;
            Integer[] numArr = C14937o.f40974c;
            for (int i = 0; i < 13; i++) {
                int intValue = numArr[i].intValue();
                C14937o.C14938a aVar2 = C14937o.f40972a;
                aVar2.mo13990l(intValue);
                LinkedList<C49863il0> linkedList2 = C14937o.f40976e.mo13997a(intValue).f40955c.f144718d;
                if (!(linkedList2 == null || (il02 = (C49863il0) C110818d0.m150917O(linkedList2, 0)) == null || (linkedList = il02.f135460d) == null)) {
                    C8477a0 a0Var = new C8477a0();
                    C61926c.m72675T(linkedList, new C14935l(j, a0Var));
                    if (a0Var.f27482d) {
                        aVar2.mo13981b(C14937o.f40976e.mo13997a(intValue));
                    }
                }
            }
        }
        ISQLiteDatabase iSQLiteDatabase = this.f39913g;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(j);
        return iSQLiteDatabase.delete(C66261f3.TABLE_NAME, "localId=?", new String[]{sb.toString()}) > 0;
    }

    /* renamed from: qq */
    public final FinderItem mo13665qq() {
        FinderItem finderItem = new FinderItem();
        String str = "SELECT * FROM FinderFeedItem  WHERE " + this.f39911e + " ORDER BY " + this.f39910d + ".localId ASC LIMIT 1";
        Cursor rawQuery = this.f39913g.rawQuery(str, (String[]) null, 2);
        Log.m105918d("Finder.FinderFeedStorage", "getWaitingPost " + str);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return null;
        }
        finderItem.convertFrom(rawQuery);
        rawQuery.close();
        return finderItem;
    }
}
