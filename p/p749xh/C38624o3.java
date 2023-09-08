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
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.o3 */
public class C38624o3 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f103208A = 246392323;

    /* renamed from: B */
    public static final int f103209B = -1111431691;

    /* renamed from: C */
    public static final int f103210C = 108705909;

    /* renamed from: D */
    public static final IAutoDBItem.MAutoDBInfo f103211D = initAutoDBInfo(C38624o3.class);

    /* renamed from: E */
    public static final StorageObserverOwner<C38624o3> f103212E = new StorageObserverOwner<>();

    /* renamed from: q */
    public static final SingleTable f103213q;

    /* renamed from: r */
    public static final String[] f103214r = {"CREATE INDEX IF NOT EXISTS FinderLiveTipsBar_hostRoomId ON FinderLiveTipsBar(hostRoomId)", "CREATE INDEX IF NOT EXISTS FinderLiveTipsBar_anchorWxUsername ON FinderLiveTipsBar(anchorWxUsername)"};

    /* renamed from: s */
    public static final int f103215s = -1102434521;

    /* renamed from: t */
    public static final int f103216t = -1137065186;

    /* renamed from: u */
    public static final int f103217u = 25573622;

    /* renamed from: v */
    public static final int f103218v = 1870138220;

    /* renamed from: w */
    public static final int f103219w = 678300977;

    /* renamed from: x */
    public static final int f103220x = 1014705353;

    /* renamed from: y */
    public static final int f103221y = -1166463232;

    /* renamed from: z */
    public static final int f103222z = 974703204;

    /* renamed from: d */
    public boolean f103223d = true;

    /* renamed from: e */
    public boolean f103224e = true;

    /* renamed from: f */
    public boolean f103225f = true;
    public String field_anchorFinderNickname;
    public String field_anchorFinderUsername;
    public String field_anchorWxUsername;
    public String field_finderNonceId;
    public long field_finderObjectId;
    public String field_hostRoomId;
    public long field_liveId;
    public boolean field_markRead;
    public int field_sourceType;
    public long field_timeStamp;

    /* renamed from: g */
    public boolean f103226g = true;

    /* renamed from: h */
    public boolean f103227h = true;

    /* renamed from: i */
    public boolean f103228i = true;

    /* renamed from: j */
    public boolean f103229j = true;

    /* renamed from: n */
    public boolean f103230n = true;

    /* renamed from: o */
    public boolean f103231o = true;

    /* renamed from: p */
    public boolean f103232p = true;

    static {
        SingleTable singleTable = new SingleTable("FinderLiveTipsBar");
        f103213q = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("liveId", "long", singleTable.getName(), "");
        new Column("hostRoomId", "string", singleTable.getName(), "");
        new Column("timeStamp", "long", singleTable.getName(), "");
        new Column("anchorWxUsername", "string", singleTable.getName(), "");
        new Column("anchorFinderUsername", "string", singleTable.getName(), "");
        new Column("anchorFinderNickname", "string", singleTable.getName(), "");
        new Column("finderObjectId", "long", singleTable.getName(), "");
        new Column("finderNonceId", "string", singleTable.getName(), "");
        new Column("markRead", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("sourceType", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[10];
        String[] strArr = new String[11];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "liveId";
        mAutoDBInfo.colsMap.put("liveId", "LONG default '0'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "liveId";
        mAutoDBInfo.columns[1] = "hostRoomId";
        mAutoDBInfo.colsMap.put("hostRoomId", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "timeStamp";
        mAutoDBInfo.colsMap.put("timeStamp", "LONG default '0' ");
        mAutoDBInfo.columns[3] = "anchorWxUsername";
        mAutoDBInfo.colsMap.put("anchorWxUsername", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "anchorFinderUsername";
        mAutoDBInfo.colsMap.put("anchorFinderUsername", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "anchorFinderNickname";
        mAutoDBInfo.colsMap.put("anchorFinderNickname", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "finderObjectId";
        mAutoDBInfo.colsMap.put("finderObjectId", "LONG default '' ");
        mAutoDBInfo.columns[7] = "finderNonceId";
        mAutoDBInfo.colsMap.put("finderNonceId", "TEXT default '' ");
        mAutoDBInfo.columns[8] = "markRead";
        mAutoDBInfo.colsMap.put("markRead", "INTEGER default 'false' ");
        mAutoDBInfo.columns[9] = "sourceType";
        mAutoDBInfo.colsMap.put("sourceType", "INTEGER");
        mAutoDBInfo.columns[10] = "rowid";
        mAutoDBInfo.sql = " liveId LONG default '0'  PRIMARY KEY ,  hostRoomId TEXT default '' ,  timeStamp LONG default '0' ,  anchorWxUsername TEXT default '' ,  anchorFinderUsername TEXT default '' ,  anchorFinderNickname TEXT default '' ,  finderObjectId LONG default '' ,  finderNonceId TEXT default '' ,  markRead INTEGER default 'false' ,  sourceType INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38624o3)) {
            return false;
        }
        C38624o3 o3Var = (C38624o3) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_liveId), Long.valueOf(o3Var.field_liveId)) && C46238a.m51546a(this.field_hostRoomId, o3Var.field_hostRoomId) && C46238a.m51546a(Long.valueOf(this.field_timeStamp), Long.valueOf(o3Var.field_timeStamp)) && C46238a.m51546a(this.field_anchorWxUsername, o3Var.field_anchorWxUsername) && C46238a.m51546a(this.field_anchorFinderUsername, o3Var.field_anchorFinderUsername) && C46238a.m51546a(this.field_anchorFinderNickname, o3Var.field_anchorFinderNickname) && C46238a.m51546a(Long.valueOf(this.field_finderObjectId), Long.valueOf(o3Var.field_finderObjectId)) && C46238a.m51546a(this.field_finderNonceId, o3Var.field_finderNonceId) && C46238a.m51546a(Boolean.valueOf(this.field_markRead), Boolean.valueOf(o3Var.field_markRead)) && C46238a.m51546a(Integer.valueOf(this.field_sourceType), Integer.valueOf(o3Var.field_sourceType));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103215s == hashCode) {
                    try {
                        this.field_liveId = cursor.getLong(i);
                        this.f103223d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103216t == hashCode) {
                    try {
                        this.field_hostRoomId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103217u == hashCode) {
                    try {
                        this.field_timeStamp = cursor.getLong(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103218v == hashCode) {
                    try {
                        this.field_anchorWxUsername = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103219w == hashCode) {
                    try {
                        this.field_anchorFinderUsername = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103220x == hashCode) {
                    try {
                        this.field_anchorFinderNickname = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103221y == hashCode) {
                    try {
                        this.field_finderObjectId = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103222z == hashCode) {
                    try {
                        this.field_finderNonceId = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103208A == hashCode) {
                    try {
                        this.field_markRead = cursor.getInt(i) != 0;
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103209B == hashCode) {
                    try {
                        this.field_sourceType = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveTipsBar", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103210C == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103223d) {
            contentValues.put("liveId", Long.valueOf(this.field_liveId));
        }
        if (this.field_hostRoomId == null) {
            this.field_hostRoomId = "";
        }
        if (this.f103224e) {
            contentValues.put("hostRoomId", this.field_hostRoomId);
        }
        if (this.f103225f) {
            contentValues.put("timeStamp", Long.valueOf(this.field_timeStamp));
        }
        if (this.field_anchorWxUsername == null) {
            this.field_anchorWxUsername = "";
        }
        if (this.f103226g) {
            contentValues.put("anchorWxUsername", this.field_anchorWxUsername);
        }
        if (this.field_anchorFinderUsername == null) {
            this.field_anchorFinderUsername = "";
        }
        if (this.f103227h) {
            contentValues.put("anchorFinderUsername", this.field_anchorFinderUsername);
        }
        if (this.field_anchorFinderNickname == null) {
            this.field_anchorFinderNickname = "";
        }
        if (this.f103228i) {
            contentValues.put("anchorFinderNickname", this.field_anchorFinderNickname);
        }
        if (this.f103229j) {
            contentValues.put("finderObjectId", Long.valueOf(this.field_finderObjectId));
        }
        if (this.field_finderNonceId == null) {
            this.field_finderNonceId = "";
        }
        if (this.f103230n) {
            contentValues.put("finderNonceId", this.field_finderNonceId);
        }
        if (this.f103231o) {
            if (this.field_markRead) {
                contentValues.put("markRead", 1);
            } else {
                contentValues.put("markRead", 0);
            }
        }
        if (this.f103232p) {
            contentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderLiveTipsBar", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLiveTipsBar ( " + f103211D.sql + ");");
        for (String add : f103214r) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveTipsBar", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLiveTipsBar", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103211D, "FinderLiveTipsBar", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveTipsBar", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLiveTipsBar", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLiveTipsBar", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103211D;
    }

    public String[] getIndexCreateSQL() {
        return f103214r;
    }

    public StorageObserverOwner<C38624o3> getObserverOwner() {
        return f103212E;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_liveId);
    }

    public SingleTable getTable() {
        return f103213q;
    }

    public String getTableName() {
        return f103213q.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsLong("liveId").longValue();
            if (z) {
                this.f103223d = true;
            }
        }
        if (contentValues.containsKey("hostRoomId")) {
            this.field_hostRoomId = contentValues.getAsString("hostRoomId");
            if (z) {
                this.f103224e = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z) {
                this.f103225f = true;
            }
        }
        if (contentValues.containsKey("anchorWxUsername")) {
            this.field_anchorWxUsername = contentValues.getAsString("anchorWxUsername");
            if (z) {
                this.f103226g = true;
            }
        }
        if (contentValues.containsKey("anchorFinderUsername")) {
            this.field_anchorFinderUsername = contentValues.getAsString("anchorFinderUsername");
            if (z) {
                this.f103227h = true;
            }
        }
        if (contentValues.containsKey("anchorFinderNickname")) {
            this.field_anchorFinderNickname = contentValues.getAsString("anchorFinderNickname");
            if (z) {
                this.f103228i = true;
            }
        }
        if (contentValues.containsKey("finderObjectId")) {
            this.field_finderObjectId = contentValues.getAsLong("finderObjectId").longValue();
            if (z) {
                this.f103229j = true;
            }
        }
        if (contentValues.containsKey("finderNonceId")) {
            this.field_finderNonceId = contentValues.getAsString("finderNonceId");
            if (z) {
                this.f103230n = true;
            }
        }
        if (contentValues.containsKey("markRead")) {
            this.field_markRead = contentValues.getAsInteger("markRead").intValue() != 0;
            if (z) {
                this.f103231o = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z) {
                this.f103232p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
