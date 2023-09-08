package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.o */
public class C38622o extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f103180n;

    /* renamed from: o */
    public static final String[] f103181o = new String[0];

    /* renamed from: p */
    public static final int f103182p = -265713450;

    /* renamed from: q */
    public static final int f103183q = -1237377772;

    /* renamed from: r */
    public static final int f103184r = -295931082;

    /* renamed from: s */
    public static final int f103185s = 3433509;

    /* renamed from: t */
    public static final int f103186t = 107944136;

    /* renamed from: u */
    public static final int f103187u = 109254796;

    /* renamed from: v */
    public static final int f103188v = 3076010;

    /* renamed from: w */
    public static final int f103189w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f103190x = initAutoDBInfo(C38622o.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38622o> f103191y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103192d = true;

    /* renamed from: e */
    public boolean f103193e = true;

    /* renamed from: f */
    public boolean f103194f = true;
    public String field_data;
    public int field_fetchType;
    public String field_path;
    public String field_query;
    public int field_scene;
    public long field_updateTime;
    public String field_username;

    /* renamed from: g */
    public boolean f103195g = true;

    /* renamed from: h */
    public boolean f103196h = true;

    /* renamed from: i */
    public boolean f103197i = true;

    /* renamed from: j */
    public boolean f103198j = true;

    static {
        SingleTable singleTable = new SingleTable("AppBrandBackgroundFetchData");
        f103180n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("fetchType", "int", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("path", "string", singleTable.getName(), "");
        new Column(SearchIntents.EXTRA_QUERY, "string", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("data", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[1] = "fetchType";
        mAutoDBInfo.colsMap.put("fetchType", "INTEGER");
        mAutoDBInfo.columns[2] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[3] = "path";
        mAutoDBInfo.colsMap.put("path", "TEXT");
        mAutoDBInfo.columns[4] = SearchIntents.EXTRA_QUERY;
        mAutoDBInfo.colsMap.put(SearchIntents.EXTRA_QUERY, "TEXT");
        mAutoDBInfo.columns[5] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[6] = "data";
        mAutoDBInfo.colsMap.put("data", "TEXT");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " username TEXT,  fetchType INTEGER,  updateTime LONG,  path TEXT,  query TEXT,  scene INTEGER,  data TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38622o)) {
            return false;
        }
        C38622o oVar = (C38622o) iAutoDBItem;
        return C46238a.m51546a(this.field_username, oVar.field_username) && C46238a.m51546a(Integer.valueOf(this.field_fetchType), Integer.valueOf(oVar.field_fetchType)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(oVar.field_updateTime)) && C46238a.m51546a(this.field_path, oVar.field_path) && C46238a.m51546a(this.field_query, oVar.field_query) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(oVar.field_scene)) && C46238a.m51546a(this.field_data, oVar.field_data);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103182p == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103183q == hashCode) {
                    try {
                        this.field_fetchType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103184r == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103185s == hashCode) {
                    try {
                        this.field_path = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103186t == hashCode) {
                    try {
                        this.field_query = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103187u == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103188v == hashCode) {
                    try {
                        this.field_data = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103189w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103192d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f103193e) {
            contentValues.put("fetchType", Integer.valueOf(this.field_fetchType));
        }
        if (this.f103194f) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f103195g) {
            contentValues.put("path", this.field_path);
        }
        if (this.f103196h) {
            contentValues.put(SearchIntents.EXTRA_QUERY, this.field_query);
        }
        if (this.f103197i) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f103198j) {
            contentValues.put("data", this.field_data);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AppBrandBackgroundFetchData ( " + f103190x.sql + ");");
        for (String add : f103181o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AppBrandBackgroundFetchData", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103190x, "AppBrandBackgroundFetchData", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AppBrandBackgroundFetchData", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAppBrandBackgroundFetchData", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103190x;
    }

    public String[] getIndexCreateSQL() {
        return f103181o;
    }

    public StorageObserverOwner<C38622o> getObserverOwner() {
        return f103191y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103180n;
    }

    public String getTableName() {
        return f103180n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f103192d = true;
            }
        }
        if (contentValues.containsKey("fetchType")) {
            this.field_fetchType = contentValues.getAsInteger("fetchType").intValue();
            if (z) {
                this.f103193e = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f103194f = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsString("path");
            if (z) {
                this.f103195g = true;
            }
        }
        if (contentValues.containsKey(SearchIntents.EXTRA_QUERY)) {
            this.field_query = contentValues.getAsString(SearchIntents.EXTRA_QUERY);
            if (z) {
                this.f103196h = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f103197i = true;
            }
        }
        if (contentValues.containsKey("data")) {
            this.field_data = contentValues.getAsString("data");
            if (z) {
                this.f103198j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
