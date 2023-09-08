package my2;

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

/* renamed from: my2.a */
public class C34686a extends IAutoDBItem {

    /* renamed from: j */
    public static final SingleTable f93251j;

    /* renamed from: n */
    public static final String[] f93252n = new String[0];

    /* renamed from: o */
    public static final int f93253o = 1225215615;

    /* renamed from: p */
    public static final int f93254p = -672734438;

    /* renamed from: q */
    public static final int f93255q = -356714073;

    /* renamed from: r */
    public static final int f93256r = -1516193902;

    /* renamed from: s */
    public static final int f93257s = -1294411543;

    /* renamed from: t */
    public static final int f93258t = 3560141;

    /* renamed from: u */
    public static final int f93259u = 108705909;

    /* renamed from: v */
    public static final IAutoDBItem.MAutoDBInfo f93260v = initAutoDBInfo(C34686a.class);

    /* renamed from: w */
    public static final StorageObserverOwner<C34686a> f93261w = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f93262d = true;

    /* renamed from: e */
    public boolean f93263e = true;

    /* renamed from: f */
    public boolean f93264f = true;
    public String field_businessKey;
    public int field_businessType;
    public String field_guardianUserName;
    public long field_msgSvrId;
    public long field_time;
    public String field_wardUserName;

    /* renamed from: g */
    public boolean f93265g = true;

    /* renamed from: h */
    public boolean f93266h = true;

    /* renamed from: i */
    public boolean f93267i = true;

    static {
        SingleTable singleTable = new SingleTable("TeenModeAuthorization");
        f93251j = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("businessKey", "string", singleTable.getName(), "");
        new Column("businessType", "int", singleTable.getName(), "");
        new Column("guardianUserName", "string", singleTable.getName(), "");
        new Column("wardUserName", "string", singleTable.getName(), "");
        new Column("msgSvrId", "long", singleTable.getName(), "");
        new Column("time", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[6];
        String[] strArr = new String[7];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "businessKey";
        mAutoDBInfo.colsMap.put("businessKey", "TEXT");
        mAutoDBInfo.columns[1] = "businessType";
        mAutoDBInfo.colsMap.put("businessType", "INTEGER");
        mAutoDBInfo.columns[2] = "guardianUserName";
        mAutoDBInfo.colsMap.put("guardianUserName", "TEXT");
        mAutoDBInfo.columns[3] = "wardUserName";
        mAutoDBInfo.colsMap.put("wardUserName", "TEXT");
        mAutoDBInfo.columns[4] = "msgSvrId";
        mAutoDBInfo.colsMap.put("msgSvrId", "LONG");
        mAutoDBInfo.columns[5] = "time";
        mAutoDBInfo.colsMap.put("time", "LONG");
        mAutoDBInfo.columns[6] = "rowid";
        mAutoDBInfo.sql = " businessKey TEXT,  businessType INTEGER,  guardianUserName TEXT,  wardUserName TEXT,  msgSvrId LONG,  time LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C34686a)) {
            return false;
        }
        C34686a aVar = (C34686a) iAutoDBItem;
        return C46238a.m51546a(this.field_businessKey, aVar.field_businessKey) && C46238a.m51546a(Integer.valueOf(this.field_businessType), Integer.valueOf(aVar.field_businessType)) && C46238a.m51546a(this.field_guardianUserName, aVar.field_guardianUserName) && C46238a.m51546a(this.field_wardUserName, aVar.field_wardUserName) && C46238a.m51546a(Long.valueOf(this.field_msgSvrId), Long.valueOf(aVar.field_msgSvrId)) && C46238a.m51546a(Long.valueOf(this.field_time), Long.valueOf(aVar.field_time));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f93253o == hashCode) {
                    try {
                        this.field_businessKey = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93254p == hashCode) {
                    try {
                        this.field_businessType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93255q == hashCode) {
                    try {
                        this.field_guardianUserName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93256r == hashCode) {
                    try {
                        this.field_wardUserName = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93257s == hashCode) {
                    try {
                        this.field_msgSvrId = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93258t == hashCode) {
                    try {
                        this.field_time = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseTeenModeAuthorization", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f93259u == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f93262d) {
            contentValues.put("businessKey", this.field_businessKey);
        }
        if (this.f93263e) {
            contentValues.put("businessType", Integer.valueOf(this.field_businessType));
        }
        if (this.f93264f) {
            contentValues.put("guardianUserName", this.field_guardianUserName);
        }
        if (this.f93265g) {
            contentValues.put("wardUserName", this.field_wardUserName);
        }
        if (this.f93266h) {
            contentValues.put("msgSvrId", Long.valueOf(this.field_msgSvrId));
        }
        if (this.f93267i) {
            contentValues.put("time", Long.valueOf(this.field_time));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseTeenModeAuthorization", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS TeenModeAuthorization ( " + f93260v.sql + ");");
        for (String add : f93252n) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseTeenModeAuthorization", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("TeenModeAuthorization", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f93260v, "TeenModeAuthorization", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseTeenModeAuthorization", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("TeenModeAuthorization", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseTeenModeAuthorization", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f93260v;
    }

    public String[] getIndexCreateSQL() {
        return f93252n;
    }

    public StorageObserverOwner<C34686a> getObserverOwner() {
        return f93261w;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f93251j;
    }

    public String getTableName() {
        return f93251j.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("businessKey")) {
            this.field_businessKey = contentValues.getAsString("businessKey");
            if (z) {
                this.f93262d = true;
            }
        }
        if (contentValues.containsKey("businessType")) {
            this.field_businessType = contentValues.getAsInteger("businessType").intValue();
            if (z) {
                this.f93263e = true;
            }
        }
        if (contentValues.containsKey("guardianUserName")) {
            this.field_guardianUserName = contentValues.getAsString("guardianUserName");
            if (z) {
                this.f93264f = true;
            }
        }
        if (contentValues.containsKey("wardUserName")) {
            this.field_wardUserName = contentValues.getAsString("wardUserName");
            if (z) {
                this.f93265g = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z) {
                this.f93266h = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z) {
                this.f93267i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
