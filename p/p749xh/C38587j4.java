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
import yy1.C53641c;

/* renamed from: xh.j4 */
public class C38587j4 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f102614h;

    /* renamed from: i */
    public static final String[] f102615i = {"CREATE INDEX IF NOT EXISTS GameLifeSessionInfo_sessionId_index ON GameLifeSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS GameLifeSessionInfo_talker_index ON GameLifeSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS GameLifeSessionInfo_selfUsername_index ON GameLifeSessionInfo(selfUserName)"};

    /* renamed from: j */
    public static final int f102616j = 607796817;

    /* renamed from: n */
    public static final int f102617n = -881080743;

    /* renamed from: o */
    public static final int f102618o = 1228743778;

    /* renamed from: p */
    public static final int f102619p = -1306498449;

    /* renamed from: q */
    public static final int f102620q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f102621r = initAutoDBInfo(C38587j4.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38587j4> f102622s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102623d = true;

    /* renamed from: e */
    public boolean f102624e = true;

    /* renamed from: f */
    public boolean f102625f = true;
    public C53641c field_extInfo;
    public String field_selfUserName;
    public String field_sessionId;
    public String field_talker;

    /* renamed from: g */
    public boolean f102626g = true;

    static {
        SingleTable singleTable = new SingleTable("GameLifeSessionInfo");
        f102614h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("sessionId", "string", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("selfUserName", "string", singleTable.getName(), "");
        new Column("extInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.plugin.gamelife.autogen.GameLifeMsgExtInfo");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "sessionId";
        mAutoDBInfo.colsMap.put("sessionId", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "sessionId";
        mAutoDBInfo.columns[1] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT default '' ");
        mAutoDBInfo.columns[2] = "selfUserName";
        mAutoDBInfo.colsMap.put("selfUserName", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "extInfo";
        mAutoDBInfo.colsMap.put("extInfo", "BLOB");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  selfUserName TEXT default '' ,  extInfo BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38587j4)) {
            return false;
        }
        C38587j4 j4Var = (C38587j4) iAutoDBItem;
        return C46238a.m51546a(this.field_sessionId, j4Var.field_sessionId) && C46238a.m51546a(this.field_talker, j4Var.field_talker) && C46238a.m51546a(this.field_selfUserName, j4Var.field_selfUserName) && C46238a.m51546a(this.field_extInfo, j4Var.field_extInfo);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102616j == hashCode) {
                    try {
                        this.field_sessionId = cursor.getString(i);
                        this.f102623d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeSessionInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102617n == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeSessionInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102618o == hashCode) {
                    try {
                        this.field_selfUserName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeSessionInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102619p == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_extInfo = (C53641c) new C53641c().parseFrom(blob);
                        }
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeSessionInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102620q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C53641c cVar;
        ContentValues contentValues = new ContentValues();
        if (this.field_sessionId == null) {
            this.field_sessionId = "";
        }
        if (this.f102623d) {
            contentValues.put("sessionId", this.field_sessionId);
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f102624e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_selfUserName == null) {
            this.field_selfUserName = "";
        }
        if (this.f102625f) {
            contentValues.put("selfUserName", this.field_selfUserName);
        }
        if (this.f102626g && (cVar = this.field_extInfo) != null) {
            try {
                contentValues.put("extInfo", cVar.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseGameLifeSessionInfo", e.getMessage());
            }
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameLifeSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameLifeSessionInfo ( " + f102621r.sql + ");");
        for (String add : f102615i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameLifeSessionInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameLifeSessionInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102621r, "GameLifeSessionInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameLifeSessionInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameLifeSessionInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameLifeSessionInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102621r;
    }

    public String[] getIndexCreateSQL() {
        return f102615i;
    }

    public StorageObserverOwner<C38587j4> getObserverOwner() {
        return f102622s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_sessionId;
    }

    public SingleTable getTable() {
        return f102614h;
    }

    public String getTableName() {
        return f102614h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("sessionId")) {
            this.field_sessionId = contentValues.getAsString("sessionId");
            if (z) {
                this.f102623d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f102624e = true;
            }
        }
        if (contentValues.containsKey("selfUserName")) {
            this.field_selfUserName = contentValues.getAsString("selfUserName");
            if (z) {
                this.f102625f = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("extInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_extInfo = (C53641c) new C53641c().parseFrom(asByteArray);
                    if (z) {
                        this.f102626g = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseGameLifeSessionInfo", e.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
