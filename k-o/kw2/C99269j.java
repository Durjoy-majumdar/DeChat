package kw2;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72994y1;
import cw2.C30930i;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o40.C61926c;
import p749xh.C66261f3;
import zv2.C103110d;

/* renamed from: kw2.j */
public final class C99269j extends MAutoStorage<C99268i> {

    /* renamed from: j */
    public static final C10425a f291079j = new C10425a((C8480h) null);

    /* renamed from: n */
    public static String f291080n = (" order by " + "MMStoryInfo" + ".createTime desc");

    /* renamed from: o */
    public static final String f291081o = " (storyID != 0  ) ";

    /* renamed from: p */
    public static String f291082p;

    /* renamed from: q */
    public static String f291083q;

    /* renamed from: r */
    public static String f291084r;

    /* renamed from: s */
    public static String f291085s;

    /* renamed from: t */
    public static String f291086t;

    /* renamed from: u */
    public static final String[] f291087u;

    /* renamed from: v */
    public static final String[] f291088v = {MAutoStorage.getCreateSQLs(C99268i.f291073M, "MMStoryInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f291089d;

    /* renamed from: e */
    public final ArrayList<Integer> f291090e;

    /* renamed from: f */
    public final ArrayList<Integer> f291091f;

    /* renamed from: g */
    public final ArrayList<Integer> f291092g;

    /* renamed from: h */
    public final ISQLiteDatabase f291093h = this.f291089d;

    /* renamed from: i */
    public final List<String> f291094i = Collections.synchronizedList(new ArrayList());

    /* renamed from: kw2.j$a */
    public static final class C10425a {
        public C10425a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo10729a(List<Integer> list, String str) {
            C87412m.m108594g(list, "data");
            C87412m.m108594g(str, "col");
            return mo10730b(list, str, false);
        }

        /* renamed from: b */
        public final String mo10730b(List<Integer> list, String str, boolean z) {
            C87412m.m108594g(list, "data");
            C87412m.m108594g(str, "col");
            StringBuilder sb = new StringBuilder("(");
            if (z) {
                sb.append(str + " not in (");
            } else {
                sb.append(str + " in (");
            }
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next().intValue());
                if (it.hasNext()) {
                    sb.append(",");
                }
            }
            sb.append(")");
            sb.append(")");
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "sb.toString()");
            return sb4;
        }

        /* renamed from: c */
        public final ArrayList<Integer> mo10731c(List<Integer> list) {
            C87412m.m108594g(list, "data");
            ArrayList arrayList = new ArrayList(list);
            HashSet hashSet = new HashSet();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    int intValue = ((Integer) it4.next()).intValue();
                    C87412m.m108593f(num, "i");
                    arrayList3.add(Integer.valueOf(intValue | num.intValue()));
                }
                hashSet.addAll(new HashSet(arrayList3));
                hashSet.add(num);
            }
            hashSet.add(0);
            arrayList2.addAll(hashSet);
            return arrayList2;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE INDEX IF NOT EXISTS ");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C99268i.f291073M;
        sb.append(C99268i.f291075P);
        sb.append(" ON ");
        sb.append("MMStoryInfo");
        sb.append(" ( storyID )");
        f291087u = new String[]{sb.toString(), "CREATE INDEX IF NOT EXISTS " + C99268i.f291076Q + " ON " + "MMStoryInfo" + " (userName,storyID, createTime)", "CREATE INDEX IF NOT EXISTS " + C99268i.f291077R + " ON " + "MMStoryInfo" + " (userName, createTime)"};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99269j(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C99268i.f291073M, "MMStoryInfo", f291087u);
        C87412m.m108594g(iSQLiteDatabase, "vdb");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C99268i.f291073M;
        this.f291089d = iSQLiteDatabase;
        C10425a aVar = f291079j;
        List asList = Arrays.asList(new Integer[]{2, 4, 8});
        C87412m.m108593f(asList, "asList(ConstantsStory.St…lag.LOCAL_FLAG_STATE_MIX)");
        ArrayList<Integer> c = aVar.mo10731c(asList);
        this.f291090e = c;
        List asList2 = Arrays.asList(new Integer[]{4, 8, 16});
        C87412m.m108593f(asList2, "asList(ConstantsStory.ST…ORY_SOURCE_ALBUM_HISTORY)");
        this.f291091f = aVar.mo10731c(asList2);
        List asList3 = Arrays.asList(new Integer[]{4, 8});
        C87412m.m108593f(asList3, "asList(ConstantsStory.ST…STORY_ITEM_FAVORITE_FLAG)");
        this.f291092g = aVar.mo10731c(asList3);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if ((next.intValue() & 2) != 0 && (next.intValue() & 4) == 0) {
                arrayList.add(next);
            }
        }
        f291079j.mo10729a(arrayList, "localFlag");
        arrayList.clear();
        Iterator<Integer> it4 = this.f291091f.iterator();
        while (it4.hasNext()) {
            Integer next2 = it4.next();
            if ((next2.intValue() & 4) != 0) {
                arrayList.add(next2);
            }
        }
        f291083q = f291079j.mo10729a(arrayList, "sourceType");
        arrayList.clear();
        Iterator<Integer> it5 = this.f291091f.iterator();
        while (it5.hasNext()) {
            Integer next3 = it5.next();
            if ((next3.intValue() & 8) != 0) {
                arrayList.add(next3);
            }
        }
        f291084r = f291079j.mo10729a(arrayList, "sourceType");
        arrayList.clear();
        Iterator<Integer> it6 = this.f291090e.iterator();
        while (it6.hasNext()) {
            Integer next4 = it6.next();
            if ((next4.intValue() & 4) != 0) {
                arrayList.add(next4);
            }
        }
        f291079j.mo10729a(arrayList, "localFlag");
        arrayList.clear();
        Iterator<Integer> it7 = this.f291091f.iterator();
        while (it7.hasNext()) {
            Integer next5 = it7.next();
            if ((next5.intValue() & 16) != 0) {
                arrayList.add(next5);
            }
        }
        f291085s = f291079j.mo10729a(arrayList, "sourceType");
        arrayList.clear();
        Iterator<Integer> it8 = this.f291092g.iterator();
        while (it8.hasNext()) {
            Integer next6 = it8.next();
            if ((next6.intValue() & 4) != 0) {
                arrayList.add(next6);
            }
        }
        f291082p = f291079j.mo10730b(arrayList, "itemStoryFlag", true);
        arrayList.clear();
        Iterator<Integer> it9 = this.f291092g.iterator();
        while (it9.hasNext()) {
            Integer next7 = it9.next();
            if ((next7.intValue() & 8) != 0) {
                arrayList.add(next7);
            }
        }
        f291086t = f291079j.mo10729a(arrayList, "itemStoryFlag");
    }

    /* renamed from: Lo */
    public void mo138663Lo() {
        int delete = this.f291093h.delete("MMStoryInfo", (String) null, (String[]) null);
        Log.m105924i("MicroMsg.StoryInfoStorage", "dropTable " + delete);
    }

    /* renamed from: Ow */
    public final C99268i mo138664Ow(long j) {
        C99268i iVar = new C99268i();
        Cursor rawQuery = this.f291093h.rawQuery("select *,rowid from MMStoryInfo  WHERE " + "MMStoryInfo" + ".storyID=" + j, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            iVar.convertFrom(rawQuery);
            rawQuery.close();
            return iVar;
        }
        rawQuery.close();
        return null;
    }

    /* renamed from: SE */
    public final List<C99268i> mo138665SE(String str, boolean z, int i) {
        C87412m.m108594g(str, "userName");
        List<C99268i> bD = mo138668bD(str, z, i, false);
        ArrayList arrayList = new ArrayList();
        for (T next : bD) {
            if (((C99268i) next).mo138657p2().f299139n == 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: TE */
    public final List<C99268i> mo138666TE(String str, int i) {
        C87412m.m108594g(str, "userName");
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f291093h.rawQuery((("select *,rowid from MMStoryInfo " + mo138670jo(str, true)) + " AND createTime BETWEEN " + i + " AND " + ((i + 86400) - 1)) + f291080n, (String[]) null, 2);
        while (rawQuery.moveToNext()) {
            C99268i iVar = new C99268i();
            iVar.convertFrom(rawQuery);
            arrayList.add(iVar);
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: Yt */
    public final C99268i mo138667Yt(int i) {
        C99268i iVar = new C99268i();
        StringBuilder sb = new StringBuilder();
        sb.append("select *,rowid from MMStoryInfo  where ");
        sb.append("MMStoryInfo");
        sb.append('.');
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C99268i.f291073M;
        sb.append(C99268i.f291074N);
        sb.append('=');
        sb.append(i);
        Cursor rawQuery = this.f291093h.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            iVar.convertFrom(rawQuery);
            rawQuery.close();
            return iVar;
        }
        rawQuery.close();
        return null;
    }

    /* renamed from: bD */
    public final List<C99268i> mo138668bD(String str, boolean z, int i, boolean z2) {
        String str2;
        C87412m.m108594g(str, "userName");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("select *,rowid from MMStoryInfo " + mo138670jo(str, z) + ' ');
        sb.append(" AND ");
        sb.append("MMStoryInfo" + ".createTime>" + i);
        String sb4 = sb.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        if (z) {
            str2 = f291080n;
        } else {
            str2 = " AND " + f291081o + " AND " + f291082p + ' ' + f291080n;
        }
        sb5.append(str2);
        Cursor rawQuery = this.f291093h.rawQuery(sb5.toString(), (String[]) null, 2);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                C99268i iVar = new C99268i();
                iVar.convertFrom(rawQuery);
                arrayList.add(iVar);
            }
            rawQuery.close();
        }
        if (z) {
            int i2 = C30930i.f83021a;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_STORY_ONE_DAY_POST_COUNT_INT_SYNC, Integer.valueOf(Math.min(arrayList.size(), ((Number) C103110d.f304233b.mo138761d()).intValue())));
        }
        if (!z2) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!C61926c.m72696u(((C99268i) next).field_itemStoryFlag, 4)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* renamed from: bF */
    public final int mo138669bF(C99268i iVar) {
        C87412m.m108594g(iVar, "storyInfo");
        Log.m105918d("MicroMsg.StoryInfoStorage", "storyInfo Insert");
        int insert = (int) this.f291093h.insert("MMStoryInfo", "", iVar.convertTo());
        Log.m105918d("MicroMsg.StoryInfoStorage", "StoryInfo Insert result " + insert);
        return insert;
    }

    /* renamed from: jo */
    public final String mo138670jo(String str, boolean z) {
        if (z) {
            return " WHERE " + f291083q;
        }
        return " WHERE " + "MMStoryInfo" + ".userName='" + Util.escapeSqlValue(str) + "' AND " + f291084r;
    }

    /* renamed from: kD */
    public final ArrayList<C99268i> mo138671kD(String str, boolean z) {
        C87412m.m108594g(str, "username");
        ArrayList<C99268i> arrayList = new ArrayList<>();
        if (str.length() > 0) {
            String str2 = "select *,rowid from MMStoryInfo  " + mo138670jo(str, z) + " AND " + f291086t + ' ' + f291080n;
            Log.m105918d("MicroMsg.StoryInfoStorage", "getFavStoryByUsername sql:" + str2);
            Cursor rawQuery = this.f291093h.rawQuery(str2, (String[]) null, 2);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    C99268i iVar = new C99268i();
                    iVar.convertFrom(rawQuery);
                    arrayList.add(iVar);
                }
                rawQuery.close();
            }
        }
        return arrayList;
    }

    /* renamed from: mI */
    public boolean update(long j, C99268i iVar) {
        C87412m.m108594g(iVar, "storyInfo");
        return replace(iVar);
    }

    /* renamed from: mL */
    public final int mo138673mL(int i, C99268i iVar) {
        boolean z;
        C87412m.m108594g(iVar, "storyinfo");
        C99269j i2 = StoryCore.f281736t.mo134191i();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('_');
        sb.append(iVar.field_createTime);
        String sb4 = sb.toString();
        C87412m.m108594g(sb4, C66261f3.COL_LOCALID);
        List<String> list = i2.f291094i;
        C87412m.m108593f(list, "delList");
        synchronized (list) {
            z = false;
            for (String b : list) {
                if (C87412m.m108589b(b, sb4)) {
                    Log.m105924i("MicroMsg.StoryInfoStorage", "wo wo wo " + sb4);
                    z = true;
                }
            }
        }
        if (z) {
            return -1;
        }
        ContentValues convertTo = iVar.convertTo();
        convertTo.remove("rowid");
        ISQLiteDatabase iSQLiteDatabase = this.f291093h;
        StringBuilder sb5 = new StringBuilder();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C99268i.f291073M;
        sb5.append(C99268i.f291074N);
        sb5.append("=?");
        String sb6 = sb5.toString();
        return iSQLiteDatabase.update("MMStoryInfo", convertTo, sb6, new String[]{"" + i});
    }

    /* renamed from: qq */
    public final C99268i mo138674qq(long j) {
        C99268i iVar = new C99268i();
        Cursor rawQuery = this.f291093h.rawQuery("select *,rowid from MMStoryInfo  where " + "MMStoryInfo" + ".storyID=" + j + " limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            iVar.convertFrom(rawQuery);
            rawQuery.close();
            return iVar;
        }
        rawQuery.close();
        return null;
    }
}
