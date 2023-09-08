package os2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.List;
import jr2.C9511t;

/* renamed from: os2.m0 */
public class C11766m0 extends MAutoStorage<C11765l0> implements C9511t {

    /* renamed from: e */
    public static final String[] f34451e = {MAutoStorage.getCreateSQLs(C11765l0.f34450t, "snsTagInfo2")};

    /* renamed from: d */
    public ISQLiteDatabase f34452d;

    public C11766m0(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C11765l0.f34450t, "snsTagInfo2", (String[]) null);
        this.f34452d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public List<Long> mo11650Lo() {
        SnsMethodCalculate.markStartTimeMs("getAllId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        Cursor query = this.f34452d.query("snsTagInfo2", new String[]{"tagId"}, (String) null, (String[]) null, (String) null, (String) null, (String) null, 2);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            arrayList.add(Long.valueOf(query.getLong(0)));
        }
        query.close();
        SnsMethodCalculate.markEndTimeMs("getAllId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return arrayList;
    }

    /* renamed from: Ow */
    public List<String> mo11651Ow(long j) {
        SnsMethodCalculate.markStartTimeMs("getMembersBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        C11765l0 qq = mo11657qq(j);
        String str = qq.field_memberList;
        if (str == null || str.equals("")) {
            ArrayList arrayList = new ArrayList();
            SnsMethodCalculate.markEndTimeMs("getMembersBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
            return arrayList;
        }
        ArrayList<String> stringsToList = Util.stringsToList(qq.field_memberList.split(","));
        SnsMethodCalculate.markEndTimeMs("getMembersBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return stringsToList;
    }

    /* renamed from: SE */
    public boolean mo11652SE(C11765l0 l0Var) {
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        long j = l0Var.field_tagId;
        if (j == 0) {
            SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
            return false;
        }
        SnsMethodCalculate.markStartTimeMs("isTagIdExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        SnsMethodCalculate.markStartTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        SnsMethodCalculate.markEndTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        ISQLiteDatabase iSQLiteDatabase = this.f34452d;
        Cursor rawQuery = iSQLiteDatabase.rawQuery("select *, rowid from snsTagInfo2 where tagId = ? ", new String[]{"" + j}, 2);
        boolean moveToFirst = rawQuery.moveToFirst();
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("isTagIdExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        if (!moveToFirst) {
            super.insert(l0Var);
        } else {
            super.replace(l0Var);
        }
        doNotify(l0Var.field_tagId + "", 0, l0Var);
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return true;
    }

    /* renamed from: Yt */
    public Cursor mo11653Yt() {
        SnsMethodCalculate.markStartTimeMs("getCursor", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        ISQLiteDatabase iSQLiteDatabase = this.f34452d;
        SnsMethodCalculate.markStartTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        SnsMethodCalculate.markEndTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        Cursor rawQuery = iSQLiteDatabase.rawQuery("select *, rowid from snsTagInfo2 where tagId > 5", (String[]) null);
        SnsMethodCalculate.markEndTimeMs("getCursor", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return rawQuery;
    }

    /* renamed from: bD */
    public boolean mo11654bD(String str, long j) {
        SnsMethodCalculate.markStartTimeMs("isInTagList", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        C11765l0 qq = mo11657qq(j);
        if (Util.isNullOrNil(qq.field_memberList)) {
            SnsMethodCalculate.markEndTimeMs("isInTagList", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
            return false;
        }
        boolean contains = Util.stringsToList(qq.field_memberList.split(",")).contains(str);
        SnsMethodCalculate.markEndTimeMs("isInTagList", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return contains;
    }

    /* renamed from: jo */
    public int mo11655jo(long j) {
        SnsMethodCalculate.markStartTimeMs("delBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        ISQLiteDatabase iSQLiteDatabase = this.f34452d;
        int delete = iSQLiteDatabase.delete("snsTagInfo2", " tagId = ? ", new String[]{"" + j});
        SnsMethodCalculate.markEndTimeMs("delBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return delete;
    }

    /* renamed from: kD */
    public boolean mo11656kD(long j, String str) {
        SnsMethodCalculate.markStartTimeMs("isTagNameExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        StringBuilder sb = new StringBuilder();
        SnsMethodCalculate.markStartTimeMs("getBirefSelect", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        SnsMethodCalculate.markEndTimeMs("getBirefSelect", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        sb.append("select tagId, tagName, count, rowid from snsTagInfo2");
        sb.append(" where tagId > ");
        sb.append(5);
        sb.append(" AND  tagName  =\"");
        sb.append(Util.escapeSqlValue(str));
        sb.append("\" AND  tagId != ");
        sb.append(j);
        String sb4 = sb.toString();
        Log.m105918d("MicroMsg.SnsTagInfoStorage", "isTagNameExist " + sb4);
        Cursor rawQuery = this.f34452d.rawQuery(sb4, (String[]) null, 2);
        boolean moveToFirst = rawQuery.moveToFirst();
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("isTagNameExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return moveToFirst;
    }

    /* renamed from: qq */
    public C11765l0 mo11657qq(long j) {
        SnsMethodCalculate.markStartTimeMs("getBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        SnsMethodCalculate.markStartTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        SnsMethodCalculate.markEndTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        ISQLiteDatabase iSQLiteDatabase = this.f34452d;
        Cursor rawQuery = iSQLiteDatabase.rawQuery("select *, rowid from snsTagInfo2 where tagId = ? ", new String[]{"" + j}, 2);
        C11765l0 l0Var = new C11765l0();
        if (rawQuery.moveToFirst()) {
            l0Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("getBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return l0Var;
    }

    public /* bridge */ /* synthetic */ boolean replace(IAutoDBItem iAutoDBItem) {
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        boolean SE = mo11652SE((C11765l0) iAutoDBItem);
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return SE;
    }
}
