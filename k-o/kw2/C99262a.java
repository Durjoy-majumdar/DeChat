package kw2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p749xh.C38686v8;

/* renamed from: kw2.a */
public final class C99262a extends MAutoStorage<C38686v8> {

    /* renamed from: e */
    public static final String[] f291052e = {MAutoStorage.getCreateSQLs(C99263b.f291055z, "StoryCommentSync")};

    /* renamed from: f */
    public static final String f291053f = "select * from StoryCommentSync";

    /* renamed from: d */
    public final ISQLiteDatabase f291054d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99262a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C99263b.f291055z, "StoryCommentSync", C38686v8.f104000n);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f291054d = iSQLiteDatabase;
        List asList = Arrays.asList(new Integer[]{1});
        C87412m.m108593f(asList, "asList(ConstantsStory.St…COMMENT_SYNC_FLAG_UNREAD)");
        ArrayList arrayList = new ArrayList(asList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
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
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            Integer num2 = (Integer) it5.next();
            if ((num2.intValue() & 1) != 0) {
                arrayList4.add(num2);
            }
        }
        C99269j.f291079j.mo10729a(arrayList4, "commentFlag");
    }

    /* renamed from: Lo */
    public final C99263b mo138634Lo(long j) {
        C99263b bVar = null;
        Cursor rawQuery = this.f291054d.rawQuery("select * from StoryCommentSync  where storyId = " + j + ' ', (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                C99263b bVar2 = new C99263b();
                bVar2.convertFrom(rawQuery);
                bVar = bVar2;
            }
            rawQuery.close();
        }
        return bVar;
    }

    /* renamed from: jo */
    public final List<C99263b> mo138635jo() {
        String str = f291053f;
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f291054d.rawQuery(str, (String[]) null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                C99263b bVar = new C99263b();
                bVar.convertFrom(rawQuery);
                arrayList.add(bVar);
            }
            rawQuery.close();
        }
        return arrayList;
    }
}
