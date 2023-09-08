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

/* renamed from: xh.ea */
public class C102643ea extends IAutoDBItem {

    /* renamed from: A */
    public static final int f302313A = 81784169;

    /* renamed from: B */
    public static final int f302314B = 1194200757;

    /* renamed from: C */
    public static final int f302315C = 108705909;

    /* renamed from: D */
    public static final IAutoDBItem.MAutoDBInfo f302316D = initAutoDBInfo(C102643ea.class);

    /* renamed from: E */
    public static final StorageObserverOwner<C102643ea> f302317E = new StorageObserverOwner<>();

    /* renamed from: q */
    public static final SingleTable f302318q;

    /* renamed from: r */
    public static final String[] f302319r = new String[0];

    /* renamed from: s */
    public static final int f302320s = 104191100;

    /* renamed from: t */
    public static final int f302321t = -265713450;

    /* renamed from: u */
    public static final int f302322u = 1343750747;

    /* renamed from: v */
    public static final int f302323v = 1567968985;

    /* renamed from: w */
    public static final int f302324w = 3433509;

    /* renamed from: x */
    public static final int f302325x = 3530753;

    /* renamed from: y */
    public static final int f302326y = 1344688590;

    /* renamed from: z */
    public static final int f302327z = 3195150;

    /* renamed from: d */
    public boolean f302328d = true;

    /* renamed from: e */
    public boolean f302329e = true;

    /* renamed from: f */
    public boolean f302330f = true;
    public long field_diskSpace;
    public byte[] field_hash;
    public byte[] field_linkUUID;
    public long field_msgId;
    public int field_msgSubType;
    public int field_msgType;
    public long field_msgtime;
    public String field_path;
    public long field_size;
    public String field_username;

    /* renamed from: g */
    public boolean f302331g = true;

    /* renamed from: h */
    public boolean f302332h = true;

    /* renamed from: i */
    public boolean f302333i = true;

    /* renamed from: j */
    public boolean f302334j = true;

    /* renamed from: n */
    public boolean f302335n = true;

    /* renamed from: o */
    public boolean f302336o = true;

    /* renamed from: p */
    public boolean f302337p = true;

    static {
        SingleTable singleTable = new SingleTable("WxFileIndex3");
        f302318q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("msgType", "int", singleTable.getName(), "");
        new Column("msgSubType", "int", singleTable.getName(), "");
        new Column("path", "string", singleTable.getName(), "");
        new Column("size", "long", singleTable.getName(), "");
        new Column("msgtime", "long", singleTable.getName(), "");
        new Column("hash", "byte[]", singleTable.getName(), "");
        new Column("diskSpace", "long", singleTable.getName(), "");
        new Column("linkUUID", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[10];
        String[] strArr = new String[11];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG");
        mAutoDBInfo.columns[1] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[2] = "msgType";
        mAutoDBInfo.colsMap.put("msgType", "INTEGER");
        mAutoDBInfo.columns[3] = "msgSubType";
        mAutoDBInfo.colsMap.put("msgSubType", "INTEGER");
        mAutoDBInfo.columns[4] = "path";
        mAutoDBInfo.colsMap.put("path", "TEXT");
        mAutoDBInfo.columns[5] = "size";
        mAutoDBInfo.colsMap.put("size", "LONG");
        mAutoDBInfo.columns[6] = "msgtime";
        mAutoDBInfo.colsMap.put("msgtime", "LONG");
        mAutoDBInfo.columns[7] = "hash";
        mAutoDBInfo.colsMap.put("hash", "BLOB");
        mAutoDBInfo.columns[8] = "diskSpace";
        mAutoDBInfo.colsMap.put("diskSpace", "LONG");
        mAutoDBInfo.columns[9] = "linkUUID";
        mAutoDBInfo.colsMap.put("linkUUID", "BLOB");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " msgId LONG,  username TEXT,  msgType INTEGER,  msgSubType INTEGER,  path TEXT,  size LONG,  msgtime LONG,  hash BLOB,  diskSpace LONG,  linkUUID BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102643ea)) {
            return false;
        }
        C102643ea eaVar = (C102643ea) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(eaVar.field_msgId)) && C46238a.m51546a(this.field_username, eaVar.field_username) && C46238a.m51546a(Integer.valueOf(this.field_msgType), Integer.valueOf(eaVar.field_msgType)) && C46238a.m51546a(Integer.valueOf(this.field_msgSubType), Integer.valueOf(eaVar.field_msgSubType)) && C46238a.m51546a(this.field_path, eaVar.field_path) && C46238a.m51546a(Long.valueOf(this.field_size), Long.valueOf(eaVar.field_size)) && C46238a.m51546a(Long.valueOf(this.field_msgtime), Long.valueOf(eaVar.field_msgtime)) && C46238a.m51546a(this.field_hash, eaVar.field_hash) && C46238a.m51546a(Long.valueOf(this.field_diskSpace), Long.valueOf(eaVar.field_diskSpace)) && C46238a.m51546a(this.field_linkUUID, eaVar.field_linkUUID);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f302320s == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302321t == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302322u == hashCode) {
                    try {
                        this.field_msgType = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302323v == hashCode) {
                    try {
                        this.field_msgSubType = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302324w == hashCode) {
                    try {
                        this.field_path = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302325x == hashCode) {
                    try {
                        this.field_size = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302326y == hashCode) {
                    try {
                        this.field_msgtime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302327z == hashCode) {
                    try {
                        this.field_hash = cursor.getBlob(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302313A == hashCode) {
                    try {
                        this.field_diskSpace = cursor.getLong(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302314B == hashCode) {
                    try {
                        this.field_linkUUID = cursor.getBlob(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f302315C == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f302328d) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f302329e) {
            contentValues.put("username", this.field_username);
        }
        if (this.f302330f) {
            contentValues.put("msgType", Integer.valueOf(this.field_msgType));
        }
        if (this.f302331g) {
            contentValues.put("msgSubType", Integer.valueOf(this.field_msgSubType));
        }
        if (this.f302332h) {
            contentValues.put("path", this.field_path);
        }
        if (this.f302333i) {
            contentValues.put("size", Long.valueOf(this.field_size));
        }
        if (this.f302334j) {
            contentValues.put("msgtime", Long.valueOf(this.field_msgtime));
        }
        if (this.f302335n) {
            contentValues.put("hash", this.field_hash);
        }
        if (this.f302336o) {
            contentValues.put("diskSpace", Long.valueOf(this.field_diskSpace));
        }
        if (this.f302337p) {
            contentValues.put("linkUUID", this.field_linkUUID);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWxFileIndex3", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WxFileIndex3 ( " + f302316D.sql + ");");
        for (String add : f302319r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWxFileIndex3", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WxFileIndex3", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f302316D, "WxFileIndex3", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWxFileIndex3", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WxFileIndex3", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWxFileIndex3", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f302316D;
    }

    public String[] getIndexCreateSQL() {
        return f302319r;
    }

    public StorageObserverOwner<C102643ea> getObserverOwner() {
        return f302317E;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f302318q;
    }

    public String getTableName() {
        return f302318q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f302328d = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f302329e = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsInteger("msgType").intValue();
            if (z) {
                this.f302330f = true;
            }
        }
        if (contentValues.containsKey("msgSubType")) {
            this.field_msgSubType = contentValues.getAsInteger("msgSubType").intValue();
            if (z) {
                this.f302331g = true;
            }
        }
        if (contentValues.containsKey("path")) {
            this.field_path = contentValues.getAsString("path");
            if (z) {
                this.f302332h = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z) {
                this.f302333i = true;
            }
        }
        if (contentValues.containsKey("msgtime")) {
            this.field_msgtime = contentValues.getAsLong("msgtime").longValue();
            if (z) {
                this.f302334j = true;
            }
        }
        if (contentValues.containsKey("hash")) {
            this.field_hash = contentValues.getAsByteArray("hash");
            if (z) {
                this.f302335n = true;
            }
        }
        if (contentValues.containsKey("diskSpace")) {
            this.field_diskSpace = contentValues.getAsLong("diskSpace").longValue();
            if (z) {
                this.f302336o = true;
            }
        }
        if (contentValues.containsKey("linkUUID")) {
            this.field_linkUUID = contentValues.getAsByteArray("linkUUID");
            if (z) {
                this.f302337p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
