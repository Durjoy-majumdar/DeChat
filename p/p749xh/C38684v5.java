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

/* renamed from: xh.v5 */
public class C38684v5 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f103967n;

    /* renamed from: o */
    public static final String[] f103968o = new String[0];

    /* renamed from: p */
    public static final int f103969p = -1102434521;

    /* renamed from: q */
    public static final int f103970q = -1137065186;

    /* renamed from: r */
    public static final int f103971r = 1417496983;

    /* renamed from: s */
    public static final int f103972s = 1566917561;

    /* renamed from: t */
    public static final int f103973t = 1850157739;

    /* renamed from: u */
    public static final int f103974u = -231928833;

    /* renamed from: v */
    public static final int f103975v = 25573622;

    /* renamed from: w */
    public static final int f103976w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f103977x = initAutoDBInfo(C38684v5.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38684v5> f103978y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103979d = true;

    /* renamed from: e */
    public boolean f103980e = true;

    /* renamed from: f */
    public boolean f103981f = true;
    public String field_anchorUsername;
    public String field_hostRoomId;
    public boolean field_isSender;
    public long field_liveId;
    public String field_liveName;
    public String field_thumbUrl;
    public long field_timeStamp;

    /* renamed from: g */
    public boolean f103982g = true;

    /* renamed from: h */
    public boolean f103983h = true;

    /* renamed from: i */
    public boolean f103984i = true;

    /* renamed from: j */
    public boolean f103985j = true;

    static {
        SingleTable singleTable = new SingleTable("LiveTipsBar");
        f103967n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("liveId", "long", singleTable.getName(), "");
        new Column("hostRoomId", "string", singleTable.getName(), "");
        new Column("liveName", "string", singleTable.getName(), "");
        new Column("thumbUrl", "string", singleTable.getName(), "");
        new Column("anchorUsername", "string", singleTable.getName(), "");
        new Column("isSender", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("timeStamp", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "liveId";
        mAutoDBInfo.colsMap.put("liveId", "LONG default '0'  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "liveId";
        mAutoDBInfo.columns[1] = "hostRoomId";
        mAutoDBInfo.colsMap.put("hostRoomId", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "liveName";
        mAutoDBInfo.colsMap.put("liveName", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "thumbUrl";
        mAutoDBInfo.colsMap.put("thumbUrl", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "anchorUsername";
        mAutoDBInfo.colsMap.put("anchorUsername", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "isSender";
        mAutoDBInfo.colsMap.put("isSender", "INTEGER default 'false' ");
        mAutoDBInfo.columns[6] = "timeStamp";
        mAutoDBInfo.colsMap.put("timeStamp", "LONG default '0' ");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " liveId LONG default '0'  PRIMARY KEY ,  hostRoomId TEXT default '' ,  liveName TEXT default '' ,  thumbUrl TEXT default '' ,  anchorUsername TEXT default '' ,  isSender INTEGER default 'false' ,  timeStamp LONG default '0' ";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38684v5)) {
            return false;
        }
        C38684v5 v5Var = (C38684v5) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_liveId), Long.valueOf(v5Var.field_liveId)) && C46238a.m51546a(this.field_hostRoomId, v5Var.field_hostRoomId) && C46238a.m51546a(this.field_liveName, v5Var.field_liveName) && C46238a.m51546a(this.field_thumbUrl, v5Var.field_thumbUrl) && C46238a.m51546a(this.field_anchorUsername, v5Var.field_anchorUsername) && C46238a.m51546a(Boolean.valueOf(this.field_isSender), Boolean.valueOf(v5Var.field_isSender)) && C46238a.m51546a(Long.valueOf(this.field_timeStamp), Long.valueOf(v5Var.field_timeStamp));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103969p == hashCode) {
                    try {
                        this.field_liveId = cursor.getLong(i);
                        this.f103979d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103970q == hashCode) {
                    try {
                        this.field_hostRoomId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103971r == hashCode) {
                    try {
                        this.field_liveName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103972s == hashCode) {
                    try {
                        this.field_thumbUrl = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103973t == hashCode) {
                    try {
                        this.field_anchorUsername = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103974u == hashCode) {
                    try {
                        this.field_isSender = cursor.getInt(i) != 0;
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103975v == hashCode) {
                    try {
                        this.field_timeStamp = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLiveTipsBar", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103976w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103979d) {
            contentValues.put("liveId", Long.valueOf(this.field_liveId));
        }
        if (this.field_hostRoomId == null) {
            this.field_hostRoomId = "";
        }
        if (this.f103980e) {
            contentValues.put("hostRoomId", this.field_hostRoomId);
        }
        if (this.field_liveName == null) {
            this.field_liveName = "";
        }
        if (this.f103981f) {
            contentValues.put("liveName", this.field_liveName);
        }
        if (this.field_thumbUrl == null) {
            this.field_thumbUrl = "";
        }
        if (this.f103982g) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.field_anchorUsername == null) {
            this.field_anchorUsername = "";
        }
        if (this.f103983h) {
            contentValues.put("anchorUsername", this.field_anchorUsername);
        }
        if (this.f103984i) {
            if (this.field_isSender) {
                contentValues.put("isSender", 1);
            } else {
                contentValues.put("isSender", 0);
            }
        }
        if (this.f103985j) {
            contentValues.put("timeStamp", Long.valueOf(this.field_timeStamp));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLiveTipsBar", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LiveTipsBar ( " + f103977x.sql + ");");
        for (String add : f103968o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLiveTipsBar", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LiveTipsBar", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103977x, "LiveTipsBar", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLiveTipsBar", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LiveTipsBar", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLiveTipsBar", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103977x;
    }

    public String[] getIndexCreateSQL() {
        return f103968o;
    }

    public StorageObserverOwner<C38684v5> getObserverOwner() {
        return f103978y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_liveId);
    }

    public SingleTable getTable() {
        return f103967n;
    }

    public String getTableName() {
        return f103967n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsLong("liveId").longValue();
            if (z) {
                this.f103979d = true;
            }
        }
        if (contentValues.containsKey("hostRoomId")) {
            this.field_hostRoomId = contentValues.getAsString("hostRoomId");
            if (z) {
                this.f103980e = true;
            }
        }
        if (contentValues.containsKey("liveName")) {
            this.field_liveName = contentValues.getAsString("liveName");
            if (z) {
                this.f103981f = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z) {
                this.f103982g = true;
            }
        }
        if (contentValues.containsKey("anchorUsername")) {
            this.field_anchorUsername = contentValues.getAsString("anchorUsername");
            if (z) {
                this.f103983h = true;
            }
        }
        if (contentValues.containsKey("isSender")) {
            this.field_isSender = contentValues.getAsInteger("isSender").intValue() != 0;
            if (z) {
                this.f103984i = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z) {
                this.f103985j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
