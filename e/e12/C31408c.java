package e12;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.vfs.C86013q1;
import d12.C7159a;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: e12.c */
public final class C31408c extends MAutoStorage<C31407b> {

    /* renamed from: e */
    public static final String[] f84073e = {MAutoStorage.getCreateSQLs(C31407b.f84072z, "ILinkResourceInfo")};

    /* renamed from: d */
    public final ISQLiteDatabase f84074d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31408c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C31407b.f84072z, "ILinkResourceInfo", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C31407b.f84072z;
        this.f84074d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final boolean mo58155Lo(C31407b bVar) {
        C31407b bVar2;
        C31407b bVar3 = null;
        if (bVar != null) {
            String str = bVar.field_projectId;
            C87412m.m108593f(str, "it.field_projectId");
            String str2 = bVar.field_resourceName;
            C87412m.m108593f(str2, "item.field_resourceName");
            int i = bVar.field_resourceVersion;
            Cursor rawQuery = this.f84074d.rawQuery("select rowid, * from ILinkResourceInfo where projectId = ? and resourceName = ? and resourceVersion = ? ", new String[]{Util.escapeSqlValue(str), Util.escapeSqlValue(str2), String.valueOf(i)});
            C87412m.m108593f(rawQuery, "db.rawQuery(sql, arrayOf…ourceVersion.toString()))");
            if (rawQuery.moveToFirst()) {
                bVar2 = new C31407b();
                bVar2.convertFrom(rawQuery);
            } else {
                bVar2 = null;
            }
            rawQuery.close();
            if (bVar2 != null) {
                C7159a aVar = C7159a.f25134a;
                String str3 = bVar2.field_projectId;
                C87412m.m108593f(str3, "result.field_projectId");
                String str4 = bVar2.field_resourceName;
                C87412m.m108593f(str4, "result.field_resourceName");
                if (!C86013q1.m106450k(aVar.mo8346a(str3, str4, bVar2.field_resourceVersion))) {
                    mo58156jo(str, str2, i);
                }
            }
            bVar3 = bVar2;
        }
        return bVar3 == null ? super.insert(bVar) : super.update(bVar3.systemRowid, bVar);
    }

    public boolean delete(IAutoDBItem iAutoDBItem, String[] strArr) {
        C87412m.m108594g(strArr, "keys");
        return super.delete((C31407b) iAutoDBItem, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        return super.insert((C31407b) iAutoDBItem);
    }

    /* renamed from: jo */
    public final int mo58156jo(String str, String str2, int i) {
        C87412m.m108594g(str, "projectId");
        C87412m.m108594g(str2, "resourceName");
        return super.delete("ILinkResourceInfo", "projectId = ? and resourceName = ? and resourceVersion = ?", new String[]{Util.escapeSqlValue(str), Util.escapeSqlValue(str2), String.valueOf(i)});
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        return super.replace((C31407b) iAutoDBItem);
    }

    public boolean update(long j, IAutoDBItem iAutoDBItem) {
        return super.update(j, (C31407b) iAutoDBItem);
    }

    public boolean update(IAutoDBItem iAutoDBItem, String[] strArr) {
        C87412m.m108594g(strArr, "keys");
        return super.update((C31407b) iAutoDBItem, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
