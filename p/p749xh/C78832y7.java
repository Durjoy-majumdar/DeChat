package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.executor.UpdateExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.y7 */
public class C78832y7 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f231613A = 3076010;

    /* renamed from: B */
    public static final int f231614B = 109757585;

    /* renamed from: C */
    public static final int f231615C = 3496342;

    /* renamed from: D */
    public static final int f231616D = -295931082;

    /* renamed from: E */
    public static final int f231617E = 108705909;

    /* renamed from: F */
    public static final IAutoDBItem.MAutoDBInfo f231618F = initAutoDBInfo(C78832y7.class);

    /* renamed from: G */
    public static final StorageObserverOwner<C78832y7> f231619G = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f231620o;

    /* renamed from: p */
    public static final Column f231621p;

    /* renamed from: q */
    public static final Column f231622q;

    /* renamed from: r */
    public static final Column f231623r;

    /* renamed from: s */
    public static final Column f231624s;

    /* renamed from: t */
    public static final Column f231625t;

    /* renamed from: u */
    public static final Column f231626u;

    /* renamed from: v */
    public static final String[] f231627v = new String[0];

    /* renamed from: w */
    public static final int f231628w = -1274920707;

    /* renamed from: x */
    public static final int f231629x = 697508465;

    /* renamed from: y */
    public static final int f231630y = 787786110;

    /* renamed from: z */
    public static final int f231631z = 104191100;

    /* renamed from: d */
    public boolean f231632d = true;

    /* renamed from: e */
    public boolean f231633e = true;

    /* renamed from: f */
    public boolean f231634f = true;
    public String field_chatRoomName;
    public byte[] field_data;
    public String field_hashKey;
    public long field_msgId;
    public String field_primaryKey;
    public int field_read;
    public int field_state;
    public long field_updateTime;

    /* renamed from: g */
    public boolean f231635g = true;

    /* renamed from: h */
    public boolean f231636h = true;

    /* renamed from: i */
    public boolean f231637i = true;

    /* renamed from: j */
    public boolean f231638j = true;

    /* renamed from: n */
    public boolean f231639n = true;

    static {
        SingleTable singleTable = new SingleTable("RoomVerifyApplicationStg");
        f231620o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("primaryKey", "string", singleTable.getName(), "");
        f231621p = new Column("hashKey", "string", singleTable.getName(), "");
        f231622q = new Column("chatRoomName", "string", singleTable.getName(), "");
        f231623r = new Column("msgId", "long", singleTable.getName(), "");
        new Column("data", "byte[]", singleTable.getName(), "");
        f231624s = new Column("state", "int", singleTable.getName(), "");
        f231625t = new Column("read", "int", singleTable.getName(), "");
        f231626u = new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
    }

    public static void createTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS RoomVerifyApplicationStg ( " + f231618F.sql + ");");
        for (String add : f231627v) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("RoomVerifyApplicationStg", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231618F, "RoomVerifyApplicationStg", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("RoomVerifyApplicationStg", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseRoomVerifyApplicationStg", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "primaryKey";
        mAutoDBInfo.colsMap.put("primaryKey", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "primaryKey";
        mAutoDBInfo.columns[1] = "hashKey";
        mAutoDBInfo.colsMap.put("hashKey", "TEXT");
        mAutoDBInfo.columns[2] = "chatRoomName";
        mAutoDBInfo.colsMap.put("chatRoomName", "TEXT");
        mAutoDBInfo.columns[3] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG");
        mAutoDBInfo.columns[4] = "data";
        mAutoDBInfo.colsMap.put("data", "BLOB");
        mAutoDBInfo.columns[5] = "state";
        mAutoDBInfo.colsMap.put("state", "INTEGER");
        mAutoDBInfo.columns[6] = "read";
        mAutoDBInfo.colsMap.put("read", "INTEGER");
        mAutoDBInfo.columns[7] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " primaryKey TEXT PRIMARY KEY ,  hashKey TEXT,  chatRoomName TEXT,  msgId LONG,  data BLOB,  state INTEGER,  read INTEGER,  updateTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78832y7)) {
            return false;
        }
        C78832y7 y7Var = (C78832y7) iAutoDBItem;
        return C46238a.m51546a(this.field_primaryKey, y7Var.field_primaryKey) && C46238a.m51546a(this.field_hashKey, y7Var.field_hashKey) && C46238a.m51546a(this.field_chatRoomName, y7Var.field_chatRoomName) && C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(y7Var.field_msgId)) && C46238a.m51546a(this.field_data, y7Var.field_data) && C46238a.m51546a(Integer.valueOf(this.field_state), Integer.valueOf(y7Var.field_state)) && C46238a.m51546a(Integer.valueOf(this.field_read), Integer.valueOf(y7Var.field_read)) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(y7Var.field_updateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231628w == hashCode) {
                    try {
                        this.field_primaryKey = cursor.getString(i);
                        this.f231632d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231629x == hashCode) {
                    try {
                        this.field_hashKey = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231630y == hashCode) {
                    try {
                        this.field_chatRoomName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231631z == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231613A == hashCode) {
                    try {
                        this.field_data = cursor.getBlob(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231614B == hashCode) {
                    try {
                        this.field_state = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231615C == hashCode) {
                    try {
                        this.field_read = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231616D == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseRoomVerifyApplicationStg", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231617E == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231632d) {
            contentValues.put("primaryKey", this.field_primaryKey);
        }
        if (this.f231633e) {
            contentValues.put("hashKey", this.field_hashKey);
        }
        if (this.f231634f) {
            contentValues.put("chatRoomName", this.field_chatRoomName);
        }
        if (this.f231635g) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f231636h) {
            contentValues.put("data", this.field_data);
        }
        if (this.f231637i) {
            contentValues.put("state", Integer.valueOf(this.field_state));
        }
        if (this.f231638j) {
            contentValues.put("read", Integer.valueOf(this.field_read));
        }
        if (this.f231639n) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
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
        return f231618F;
    }

    public String[] getIndexCreateSQL() {
        return f231627v;
    }

    public StorageObserverOwner<C78832y7> getObserverOwner() {
        return f231619G;
    }

    public Object getPrimaryKeyValue() {
        return this.field_primaryKey;
    }

    public SingleTable getTable() {
        return f231620o;
    }

    public String getTableName() {
        return f231620o.getName();
    }

    public int updateToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        UpdateExecutor updateExecutor;
        if (z) {
            StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getUPDATE(), String.valueOf(this.field_primaryKey), "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
            storageObserverEvent.setObj(this);
            updateExecutor = new UpdateExecutor(this, storageObserverEvent, f231619G, "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
        } else {
            updateExecutor = new UpdateExecutor(this, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
        }
        return updateExecutor.execute(iSQLiteDatabase);
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("primaryKey")) {
            this.field_primaryKey = contentValues.getAsString("primaryKey");
            if (z) {
                this.f231632d = true;
            }
        }
        if (contentValues.containsKey("hashKey")) {
            this.field_hashKey = contentValues.getAsString("hashKey");
            if (z) {
                this.f231633e = true;
            }
        }
        if (contentValues.containsKey("chatRoomName")) {
            this.field_chatRoomName = contentValues.getAsString("chatRoomName");
            if (z) {
                this.f231634f = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f231635g = true;
            }
        }
        if (contentValues.containsKey("data")) {
            this.field_data = contentValues.getAsByteArray("data");
            if (z) {
                this.f231636h = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z) {
                this.f231637i = true;
            }
        }
        if (contentValues.containsKey("read")) {
            this.field_read = contentValues.getAsInteger("read").intValue();
            if (z) {
                this.f231638j = true;
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f231639n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
