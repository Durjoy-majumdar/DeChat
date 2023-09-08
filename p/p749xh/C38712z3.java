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

/* renamed from: xh.z3 */
public class C38712z3 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f104412n;

    /* renamed from: o */
    public static final String[] f104413o = {"CREATE INDEX IF NOT EXISTS FinderSnsKeyWordsJumpInfo_local_index ON FinderSnsKeyWordsJumpConfig(localId)"};

    /* renamed from: p */
    public static final int f104414p = 338409958;

    /* renamed from: q */
    public static final int f104415q = 673554686;

    /* renamed from: r */
    public static final int f104416r = -255811600;

    /* renamed from: s */
    public static final int f104417s = -2129294769;

    /* renamed from: t */
    public static final int f104418t = -1607243192;

    /* renamed from: u */
    public static final int f104419u = -815361527;

    /* renamed from: v */
    public static final int f104420v = -217112298;

    /* renamed from: w */
    public static final int f104421w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f104422x = initAutoDBInfo(C38712z3.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38712z3> f104423y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104424d = true;

    /* renamed from: e */
    public boolean f104425e = true;

    /* renamed from: f */
    public boolean f104426f = true;
    public int field_endTime;
    public int field_jumpDest;
    public int field_jumpScene;
    public String field_keyWord;
    public long field_localId;
    public String field_passByInfo;
    public int field_startTime;

    /* renamed from: g */
    public boolean f104427g = true;

    /* renamed from: h */
    public boolean f104428h = true;

    /* renamed from: i */
    public boolean f104429i = true;

    /* renamed from: j */
    public boolean f104430j = true;

    static {
        SingleTable singleTable = new SingleTable("FinderSnsKeyWordsJumpConfig");
        f104412n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(C66261f3.COL_LOCALID, "long", singleTable.getName(), "");
        new Column("jumpScene", "int", singleTable.getName(), "");
        new Column("jumpDest", "int", singleTable.getName(), "");
        new Column("startTime", "int", singleTable.getName(), "");
        new Column("endTime", "int", singleTable.getName(), "");
        new Column("keyWord", "string", singleTable.getName(), "");
        new Column("passByInfo", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = C66261f3.COL_LOCALID;
        mAutoDBInfo.colsMap.put(C66261f3.COL_LOCALID, "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = C66261f3.COL_LOCALID;
        mAutoDBInfo.columns[1] = "jumpScene";
        mAutoDBInfo.colsMap.put("jumpScene", "INTEGER default '-1' ");
        mAutoDBInfo.columns[2] = "jumpDest";
        mAutoDBInfo.colsMap.put("jumpDest", "INTEGER default '-1' ");
        mAutoDBInfo.columns[3] = "startTime";
        mAutoDBInfo.colsMap.put("startTime", "INTEGER default '0' ");
        mAutoDBInfo.columns[4] = "endTime";
        mAutoDBInfo.colsMap.put("endTime", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "keyWord";
        mAutoDBInfo.colsMap.put("keyWord", "TEXT");
        mAutoDBInfo.columns[6] = "passByInfo";
        mAutoDBInfo.colsMap.put("passByInfo", "TEXT");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " localId LONG PRIMARY KEY ,  jumpScene INTEGER default '-1' ,  jumpDest INTEGER default '-1' ,  startTime INTEGER default '0' ,  endTime INTEGER default '0' ,  keyWord TEXT,  passByInfo TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38712z3)) {
            return false;
        }
        C38712z3 z3Var = (C38712z3) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_localId), Long.valueOf(z3Var.field_localId)) && C46238a.m51546a(Integer.valueOf(this.field_jumpScene), Integer.valueOf(z3Var.field_jumpScene)) && C46238a.m51546a(Integer.valueOf(this.field_jumpDest), Integer.valueOf(z3Var.field_jumpDest)) && C46238a.m51546a(Integer.valueOf(this.field_startTime), Integer.valueOf(z3Var.field_startTime)) && C46238a.m51546a(Integer.valueOf(this.field_endTime), Integer.valueOf(z3Var.field_endTime)) && C46238a.m51546a(this.field_keyWord, z3Var.field_keyWord) && C46238a.m51546a(this.field_passByInfo, z3Var.field_passByInfo);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104414p == hashCode) {
                    try {
                        this.field_localId = cursor.getLong(i);
                        this.f104424d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104415q == hashCode) {
                    try {
                        this.field_jumpScene = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104416r == hashCode) {
                    try {
                        this.field_jumpDest = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104417s == hashCode) {
                    try {
                        this.field_startTime = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104418t == hashCode) {
                    try {
                        this.field_endTime = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104419u == hashCode) {
                    try {
                        this.field_keyWord = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104420v == hashCode) {
                    try {
                        this.field_passByInfo = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104421w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104424d) {
            contentValues.put(C66261f3.COL_LOCALID, Long.valueOf(this.field_localId));
        }
        if (this.f104425e) {
            contentValues.put("jumpScene", Integer.valueOf(this.field_jumpScene));
        }
        if (this.f104426f) {
            contentValues.put("jumpDest", Integer.valueOf(this.field_jumpDest));
        }
        if (this.f104427g) {
            contentValues.put("startTime", Integer.valueOf(this.field_startTime));
        }
        if (this.f104428h) {
            contentValues.put("endTime", Integer.valueOf(this.field_endTime));
        }
        if (this.f104429i) {
            contentValues.put("keyWord", this.field_keyWord);
        }
        if (this.f104430j) {
            contentValues.put("passByInfo", this.field_passByInfo);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderSnsKeyWordsJumpConfig ( " + f104422x.sql + ");");
        for (String add : f104413o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderSnsKeyWordsJumpConfig", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104422x, "FinderSnsKeyWordsJumpConfig", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderSnsKeyWordsJumpConfig", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104422x;
    }

    public String[] getIndexCreateSQL() {
        return f104413o;
    }

    public StorageObserverOwner<C38712z3> getObserverOwner() {
        return f104423y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_localId);
    }

    public SingleTable getTable() {
        return f104412n;
    }

    public String getTableName() {
        return f104412n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(C66261f3.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(C66261f3.COL_LOCALID).longValue();
            if (z) {
                this.f104424d = true;
            }
        }
        if (contentValues.containsKey("jumpScene")) {
            this.field_jumpScene = contentValues.getAsInteger("jumpScene").intValue();
            if (z) {
                this.f104425e = true;
            }
        }
        if (contentValues.containsKey("jumpDest")) {
            this.field_jumpDest = contentValues.getAsInteger("jumpDest").intValue();
            if (z) {
                this.f104426f = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsInteger("startTime").intValue();
            if (z) {
                this.f104427g = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsInteger("endTime").intValue();
            if (z) {
                this.f104428h = true;
            }
        }
        if (contentValues.containsKey("keyWord")) {
            this.field_keyWord = contentValues.getAsString("keyWord");
            if (z) {
                this.f104429i = true;
            }
        }
        if (contentValues.containsKey("passByInfo")) {
            this.field_passByInfo = contentValues.getAsString("passByInfo");
            if (z) {
                this.f104430j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
