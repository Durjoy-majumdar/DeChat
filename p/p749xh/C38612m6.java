package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
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
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;
import org.json.JSONObject;
import te3.C64459j13;

/* renamed from: xh.m6 */
public class C38612m6 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f103014j;

    /* renamed from: n */
    public static final String[] f103015n = new String[0];

    /* renamed from: o */
    public static final int f103016o = 3355;

    /* renamed from: p */
    public static final int f103017p = 3575610;

    /* renamed from: q */
    public static final int f103018q = 1369213417;

    /* renamed from: r */
    public static final int f103019r = -295931082;

    /* renamed from: s */
    public static final int f103020s = -339314617;

    /* renamed from: t */
    public static final int f103021t = 3076010;

    /* renamed from: u */
    public static final int f103022u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f103023v = initAutoDBInfo(C38612m6.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38612m6> f103024w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103025d = true;

    /* renamed from: e */
    public boolean f103026e = true;

    /* renamed from: f */
    public boolean f103027f = true;
    public long field_createTime;
    public byte[] field_data;
    public String field_id;
    public C64459j13 field_showData;
    public int field_type;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f103028g = true;

    /* renamed from: h */
    public boolean f103029h = true;

    /* renamed from: i */
    public boolean f103030i = true;

    static {
        SingleTable singleTable = new SingleTable("MultiTaskInfo");
        f103014j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("id", "string", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
        new Column("showData", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.MultiTaskShowData");
        new Column("data", "byte[]", singleTable.getName(), "");
    }

    public static void createTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMultiTaskInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MultiTaskInfo ( " + f103023v.sql + ");");
        for (String add : f103015n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMultiTaskInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MultiTaskInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103023v, "MultiTaskInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMultiTaskInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MultiTaskInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMultiTaskInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "id";
        mAutoDBInfo.colsMap.put("id", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "id";
        mAutoDBInfo.columns[1] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER default '0' ");
        mAutoDBInfo.columns[2] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG default '0' ");
        mAutoDBInfo.columns[3] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG default '0' ");
        mAutoDBInfo.columns[4] = "showData";
        mAutoDBInfo.colsMap.put("showData", "BLOB");
        mAutoDBInfo.columns[5] = "data";
        mAutoDBInfo.colsMap.put("data", "BLOB default '' ");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " id TEXT PRIMARY KEY ,  type INTEGER default '0' ,  createTime LONG default '0' ,  updateTime LONG default '0' ,  showData BLOB,  data BLOB default '' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38612m6)) {
            return false;
        }
        C38612m6 m6Var = (C38612m6) iAutoDBItem;
        return C46238a.m51546a(this.field_id, m6Var.field_id) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(m6Var.field_type)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(m6Var.field_createTime)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(m6Var.field_updateTime)) && C46238a.m51546a(this.field_showData, m6Var.field_showData) && C46238a.m51546a(this.field_data, m6Var.field_data);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103016o == hashCode) {
                    try {
                        this.field_id = cursor.getString(i);
                        this.f103025d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103017p == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103018q == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103019r == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103020s == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_showData = (C64459j13) new C64459j13().parseFrom(blob);
                        }
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103021t == hashCode) {
                    try {
                        this.field_data = cursor.getBlob(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTaskInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103022u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C64459j13 j132;
        ContentValues contentValues = new ContentValues();
        if (this.f103025d) {
            contentValues.put("id", this.field_id);
        }
        if (this.f103026e) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.f103027f) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f103028g) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        if (this.f103029h && (j132 = this.field_showData) != null) {
            try {
                contentValues.put("showData", j132.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseMultiTaskInfo", e.getMessage());
            }
        }
        if (this.f103030i) {
            contentValues.put("data", this.field_data);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        createTable(iSQLiteDatabase);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103023v;
    }

    public String[] getIndexCreateSQL() {
        return f103015n;
    }

    public StorageObserverOwner<C38612m6> getObserverOwner() {
        return f103024w;
    }

    public Object getPrimaryKeyValue() {
        return this.field_id;
    }

    public SingleTable getTable() {
        return f103014j;
    }

    public String getTableName() {
        return f103014j.getName();
    }

    /* renamed from: l2 */
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "id", this.field_id);
            C46238a.m51547b(jSONObject, "type", Integer.valueOf(this.field_type));
            C46238a.m51547b(jSONObject, "createTime", Long.valueOf(this.field_createTime));
            C46238a.m51547b(jSONObject, C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
            C46238a.m51547b(jSONObject, "showData", this.field_showData);
            C46238a.m51547b(jSONObject, "data", this.field_data);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("id")) {
            this.field_id = contentValues.getAsString("id");
            if (z) {
                this.f103025d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f103026e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f103027f = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f103028g = true;
            }
        }
        if (contentValues.containsKey("showData")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("showData");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_showData = (C64459j13) new C64459j13().parseFrom(asByteArray);
                    if (z) {
                        this.f103029h = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseMultiTaskInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("data")) {
            this.field_data = contentValues.getAsByteArray("data");
            if (z) {
                this.f103030i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
