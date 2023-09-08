package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.h */
public class C29328h extends MAutoStorage<C29325g> implements C81414g0 {

    /* renamed from: g */
    public static final String[] f80078g = {MAutoStorage.getCreateSQLs(C29325g.f80066t, "AppBrandKVData"), "DROP TABLE IF EXISTS AppBrandStorageKVData;"};

    /* renamed from: d */
    public ISQLiteDatabase f80079d;

    /* renamed from: e */
    public C32226l<String, String> f80080e = new C29329a();

    /* renamed from: f */
    public C32227p<String, String, C13598b0> f80081f = new C29330b();

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.h$a */
    public class C29329a implements C32226l<String, String> {
        public C29329a() {
        }

        public Object invoke(Object obj) {
            C29325g gVar = new C29325g();
            gVar.field_key = (String) obj;
            if (!C29328h.super.get(gVar, new String[0])) {
                return null;
            }
            return gVar.field_data;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.h$b */
    public class C29330b implements C32227p<String, String, C13598b0> {
        public C29330b() {
        }

        public Object invoke(Object obj, Object obj2) {
            C29325g gVar = new C29325g();
            gVar.field_key = (String) obj;
            gVar.field_data = (String) obj2;
            boolean unused = C29328h.super.replace(gVar);
            return null;
        }
    }

    public C29328h(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29325g.f80066t, "AppBrandKVData", (String[]) null);
        this.f80079d = iSQLiteDatabase;
    }

    /* renamed from: Bh */
    public Object[] mo56588Bh(int i, String str) {
        String str2;
        if (i == 0) {
            str2 = str + "__";
        } else {
            str2 = i + "__" + str + "__";
        }
        Cursor query = this.f80079d.query("AppBrandKVData", new String[]{"key"}, "key like ? escape ?", new String[]{str2.replace("_", "\\_") + "%", "\\"}, (String) null, (String) null, (String) null, 2);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            arrayList.add(query.getString(0).replace(str2, ""));
        }
        query.close();
        return new Object[]{arrayList, Integer.valueOf(mo56605SE(i, str)), Integer.valueOf(C81420m0.m99901g(i, str))};
    }

    /* renamed from: Bk */
    public int mo56589Bk(String str) {
        int i = 0;
        for (int SE : C81420m0.m99900f(str, this.f80080e, this.f80081f)) {
            i += mo56605SE(SE, str);
        }
        return i;
    }

    /* renamed from: Ow */
    public final void mo56604Ow() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C29325g.f80066t;
        ISQLiteDatabase iSQLiteDatabase = this.f80079d;
        String tableName = getTableName();
        for (String next : MAutoStorage.getUpdateSQLs(mAutoDBInfo, getTableName(), iSQLiteDatabase)) {
            if (!iSQLiteDatabase.execSQL(tableName, next)) {
                Log.m105921e("AppBrandKVStorage", "updateColumnSQLs table failed %s, sql %s", tableName, next);
            }
        }
    }

    /* renamed from: S */
    public void mo56590S(int i, String str) {
        String str2;
        if (i == 0) {
            str2 = str + "__";
        } else {
            str2 = i + "__" + str + "__";
        }
        C81420m0.m99902h(str, i, this.f80080e, this.f80081f);
        this.f80079d.delete("AppBrandKVData", String.format("%s like ? escape ? OR %s=?", new Object[]{"key", "key"}), new String[]{str2.replace("_", "\\_") + "%", "\\", mo56607bD(i, str, "@@@TOTAL@DATA@SIZE@@@")});
    }

    /* renamed from: SE */
    public final int mo56605SE(int i, String str) {
        C29325g gVar = new C29325g();
        gVar.field_key = mo56607bD(i, str, "@@@TOTAL@DATA@SIZE@@@");
        if (super.get(gVar, new String[0])) {
            return Util.getInt(gVar.field_data, 0);
        }
        return 0;
    }

    /* renamed from: T0 */
    public C81414g0.C29326a mo56591T0(int i, String str, List<C81414g0.C29327b> list) {
        return C81414g0.C29326a.UNKNOWN;
    }

    /* renamed from: Yt */
    public final int mo56606Yt(int i, String str, int i2) {
        int max = Math.max(0, mo56605SE(i, str) + i2);
        C29325g gVar = new C29325g();
        gVar.field_key = mo56607bD(i, str, "@@@TOTAL@DATA@SIZE@@@");
        gVar.field_data = max + "";
        super.replace(gVar);
        return max;
    }

    /* renamed from: bD */
    public final String mo56607bD(int i, String str, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "key");
        return C81420m0.m99899e(i, str, str2, "++");
    }

    /* renamed from: cg */
    public C81414g0.C29326a mo56593cg(int i, String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return C81414g0.C29326a.MISSING_PARAMS;
        }
        String e = C81420m0.m99899e(i, str, str2, "__");
        int Yt = mo56606Yt(i, str, -mo56608kD(e));
        C29325g gVar = new C29325g();
        gVar.field_key = e;
        super.delete(gVar, new String[0]);
        if (Yt <= 0) {
            C81420m0.m99902h(str, i, this.f80080e, this.f80081f);
        }
        return C81414g0.C29326a.NONE;
    }

    /* renamed from: g5 */
    public List<Object[]> mo56594g5(int i, String str, List<String> list) {
        return new ArrayList();
    }

    /* renamed from: j0 */
    public C81414g0.C29326a mo56595j0(int i, String str, String str2, String str3, String str4) {
        int i2 = i;
        String str5 = str;
        String str6 = str2;
        int b = C81420m0.m99896b(str2, str3);
        C81414g0.C29326a aVar = C81414g0.C29326a.NONE;
        C81414g0.C29326a aVar2 = C81414g0.C29326a.UNKNOWN;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return C81414g0.C29326a.MISSING_PARAMS;
        }
        String e = C81420m0.m99899e(i2, str5, str6, "__");
        int kD = b - mo56608kD(e);
        if (mo56605SE(i, str) + kD >= C81420m0.m99901g(i, str)) {
            return C81414g0.C29326a.QUOTA_REACHED;
        }
        C29325g gVar = new C29325g();
        gVar.field_key = e;
        gVar.field_data = str3;
        gVar.field_dataType = str4;
        gVar.field_size = b;
        try {
            if (super.replace(gVar)) {
                C81420m0.m99895a(str5, i2, this.f80080e, this.f80081f);
                mo56606Yt(i2, str5, kD);
                return aVar;
            }
        } catch (SQLiteException e2) {
            SQLiteException sQLiteException = e2;
            if (Util.nullAsNil(sQLiteException.getMessage()).contains("no such table")) {
                Log.m105921e("AppBrandKVStorage", "set storageId[%d] appId[%s] key[%s], get exception[%s] try create table", Integer.valueOf(i), str5, str6, sQLiteException);
                try {
                    mo56604Ow();
                    if (super.replace(gVar)) {
                        C81420m0.m99895a(str5, i2, this.f80080e, this.f80081f);
                        mo56606Yt(i2, str5, kD);
                    }
                } catch (SQLiteException e3) {
                    String format = String.format(Locale.ENGLISH, "set storageId[%d] appId[%s] key[%s], get exception[%s] after retry", new Object[]{Integer.valueOf(i), str5, str6, sQLiteException});
                    Log.m105920e("AppBrandKVStorage", format);
                    throw new SQLiteException(format, e3);
                }
            } else {
                throw sQLiteException;
            }
        }
        aVar = aVar2;
        return aVar;
    }

    /* renamed from: kD */
    public final int mo56608kD(String str) {
        Cursor query = this.f80079d.query("AppBrandKVData", new String[]{"size"}, "key = ?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            int i = query.getInt(0);
            query.close();
            return i;
        }
        query.close();
        return 0;
    }

    /* renamed from: xf */
    public Object[] mo56596xf(int i, String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return new Object[]{C81414g0.C29326a.MISSING_PARAMS};
        }
        C29325g gVar = new C29325g();
        gVar.field_key = C81420m0.m99899e(i, str, str2, "__");
        try {
            if (!super.get(gVar, new String[0])) {
                return C81420m0.f238952a;
            }
            return new Object[]{C81414g0.C29326a.NONE, gVar.field_data, gVar.field_dataType};
        } catch (SQLiteException e) {
            if (Util.nullAsNil(e.getMessage()).contains("no such table")) {
                Log.m105921e("AppBrandKVStorage", "get storageId[%d] appId[%s] key[%s], no such table, return RET_GET_NO_SUCH_KEY", Integer.valueOf(i), str, str2);
                return C81420m0.f238952a;
            } else if (e.getClass().getName().endsWith("CursorWindowAllocationException")) {
                return new Object[]{C81414g0.C29326a.MEMORY_ISSUE};
            } else {
                throw e;
            }
        }
    }
}
