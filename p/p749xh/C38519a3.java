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
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.a3 */
public class C38519a3 extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f101592j;

    /* renamed from: n */
    public static final String[] f101593n = new String[0];

    /* renamed from: o */
    public static final int f101594o = 338409958;

    /* renamed from: p */
    public static final int f101595p = -1868521062;

    /* renamed from: q */
    public static final int f101596q = 2060525834;

    /* renamed from: r */
    public static final int f101597r = 377305787;

    /* renamed from: s */
    public static final int f101598s = 1369213417;

    /* renamed from: t */
    public static final int f101599t = 3575610;

    /* renamed from: u */
    public static final int f101600u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f101601v = initAutoDBInfo(C38519a3.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C38519a3> f101602w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101603d = true;

    /* renamed from: e */
    public boolean f101604e = true;

    /* renamed from: f */
    public boolean f101605f = true;
    public long field_createTime;
    public String field_localId;
    public int field_pendingReason;
    public String field_subType;
    public int field_type;
    public String field_valuesJSON;

    /* renamed from: g */
    public boolean f101606g = true;

    /* renamed from: h */
    public boolean f101607h = true;

    /* renamed from: i */
    public boolean f101608i = true;

    static {
        SingleTable singleTable = new SingleTable("FinderConsumeNewXmlData");
        f101592j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "string", singleTable.getName(), "");
        new Column("subType", "string", singleTable.getName(), "");
        new Column("valuesJSON", "string", singleTable.getName(), "");
        new Column("pendingReason", "int", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
        new Column("type", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "TEXT");
        mAutoDBInfo.columns[1] = "subType";
        mAutoDBInfo.colsMap.put("subType", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "valuesJSON";
        mAutoDBInfo.colsMap.put("valuesJSON", "TEXT default '[object Object]' ");
        mAutoDBInfo.columns[3] = "pendingReason";
        mAutoDBInfo.colsMap.put("pendingReason", "INTEGER");
        mAutoDBInfo.columns[4] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[5] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " localId TEXT,  subType TEXT default '' ,  valuesJSON TEXT default '[object Object]' ,  pendingReason INTEGER,  createTime LONG,  type INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38519a3)) {
            return false;
        }
        C38519a3 a3Var = (C38519a3) iAutoDBItem;
        return C46238a.m51546a(this.field_localId, a3Var.field_localId) && C46238a.m51546a(this.field_subType, a3Var.field_subType) && C46238a.m51546a(this.field_valuesJSON, a3Var.field_valuesJSON) && C46238a.m51546a(Integer.valueOf(this.field_pendingReason), Integer.valueOf(a3Var.field_pendingReason)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(a3Var.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(a3Var.field_type));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101594o == hashCode) {
                    try {
                        this.field_localId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101595p == hashCode) {
                    try {
                        this.field_subType = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101596q == hashCode) {
                    try {
                        this.field_valuesJSON = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101597r == hashCode) {
                    try {
                        this.field_pendingReason = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101598s == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101599t == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101600u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101603d) {
            contentValues.put(C66261f3.COL_LOCALID, this.field_localId);
        }
        if (this.field_subType == null) {
            this.field_subType = "";
        }
        if (this.f101604e) {
            contentValues.put("subType", this.field_subType);
        }
        if (this.field_valuesJSON == null) {
            this.field_valuesJSON = "[object Object]";
        }
        if (this.f101605f) {
            contentValues.put("valuesJSON", this.field_valuesJSON);
        }
        if (this.f101606g) {
            contentValues.put("pendingReason", Integer.valueOf(this.field_pendingReason));
        }
        if (this.f101607h) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.f101608i) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderConsumeNewXmlData ( " + f101601v.sql + ");");
        for (String add : f101593n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderConsumeNewXmlData", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101601v, "FinderConsumeNewXmlData", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderConsumeNewXmlData", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101601v;
    }

    public String[] getIndexCreateSQL() {
        return f101593n;
    }

    public StorageObserverOwner<C38519a3> getObserverOwner() {
        return f101602w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f101592j;
    }

    public String getTableName() {
        return f101592j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsString(C66261f3.COL_LOCALID);
            if (z) {
                this.f101603d = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsString("subType");
            if (z) {
                this.f101604e = true;
            }
        }
        if (contentValues.containsKey("valuesJSON")) {
            this.field_valuesJSON = contentValues.getAsString("valuesJSON");
            if (z) {
                this.f101605f = true;
            }
        }
        if (contentValues.containsKey("pendingReason")) {
            this.field_pendingReason = contentValues.getAsInteger("pendingReason").intValue();
            if (z) {
                this.f101606g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f101607h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.f101608i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
