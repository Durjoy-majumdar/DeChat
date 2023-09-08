package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.measurement.AppMeasurement;
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

/* renamed from: xh.i6 */
public class C38581i6 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f102538h;

    /* renamed from: i */
    public static final String[] f102539i = {"CREATE INDEX IF NOT EXISTS MsgQueryHistoryInfo_Room_Id ON MsgQueryHistoryInfo(chat_room_id)"};

    /* renamed from: j */
    public static final int f102540j = 339796248;

    /* renamed from: n */
    public static final int f102541n = 164789714;

    /* renamed from: o */
    public static final int f102542o = -1232839014;

    /* renamed from: p */
    public static final int f102543p = 55126294;

    /* renamed from: q */
    public static final int f102544q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f102545r = initAutoDBInfo(C38581i6.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38581i6> f102546s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102547d = true;

    /* renamed from: e */
    public boolean f102548e = true;

    /* renamed from: f */
    public boolean f102549f = true;
    public String field_chat_room_id;
    public String field_cluster_history_data;
    public String field_last_image_path;
    public long field_timestamp;

    /* renamed from: g */
    public boolean f102550g = true;

    static {
        SingleTable singleTable = new SingleTable("MsgQueryHistoryInfo");
        f102538h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("chat_room_id", "string", singleTable.getName(), "");
        new Column("last_image_path", "string", singleTable.getName(), "");
        new Column("cluster_history_data", "string", singleTable.getName(), "");
        new Column(AppMeasurement.Param.TIMESTAMP, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "chat_room_id";
        mAutoDBInfo.colsMap.put("chat_room_id", "TEXT");
        mAutoDBInfo.columns[1] = "last_image_path";
        mAutoDBInfo.colsMap.put("last_image_path", "TEXT");
        mAutoDBInfo.columns[2] = "cluster_history_data";
        mAutoDBInfo.colsMap.put("cluster_history_data", "TEXT");
        mAutoDBInfo.columns[3] = AppMeasurement.Param.TIMESTAMP;
        mAutoDBInfo.colsMap.put(AppMeasurement.Param.TIMESTAMP, "LONG");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " chat_room_id TEXT,  last_image_path TEXT,  cluster_history_data TEXT,  timestamp LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38581i6)) {
            return false;
        }
        C38581i6 i6Var = (C38581i6) iAutoDBItem;
        return C46238a.m51546a(this.field_chat_room_id, i6Var.field_chat_room_id) && C46238a.m51546a(this.field_last_image_path, i6Var.field_last_image_path) && C46238a.m51546a(this.field_cluster_history_data, i6Var.field_cluster_history_data) && C46238a.m51546a(Long.valueOf(this.field_timestamp), Long.valueOf(i6Var.field_timestamp));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102540j == hashCode) {
                    try {
                        this.field_chat_room_id = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102541n == hashCode) {
                    try {
                        this.field_last_image_path = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102542o == hashCode) {
                    try {
                        this.field_cluster_history_data = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102543p == hashCode) {
                    try {
                        this.field_timestamp = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102544q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102547d) {
            contentValues.put("chat_room_id", this.field_chat_room_id);
        }
        if (this.f102548e) {
            contentValues.put("last_image_path", this.field_last_image_path);
        }
        if (this.f102549f) {
            contentValues.put("cluster_history_data", this.field_cluster_history_data);
        }
        if (this.f102550g) {
            contentValues.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(this.field_timestamp));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MsgQueryHistoryInfo ( " + f102545r.sql + ");");
        for (String add : f102539i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MsgQueryHistoryInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102545r, "MsgQueryHistoryInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MsgQueryHistoryInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102545r;
    }

    public String[] getIndexCreateSQL() {
        return f102539i;
    }

    public StorageObserverOwner<C38581i6> getObserverOwner() {
        return f102546s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102538h;
    }

    public String getTableName() {
        return f102538h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("chat_room_id")) {
            this.field_chat_room_id = contentValues.getAsString("chat_room_id");
            if (z) {
                this.f102547d = true;
            }
        }
        if (contentValues.containsKey("last_image_path")) {
            this.field_last_image_path = contentValues.getAsString("last_image_path");
            if (z) {
                this.f102548e = true;
            }
        }
        if (contentValues.containsKey("cluster_history_data")) {
            this.field_cluster_history_data = contentValues.getAsString("cluster_history_data");
            if (z) {
                this.f102549f = true;
            }
        }
        if (contentValues.containsKey(AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(AppMeasurement.Param.TIMESTAMP).longValue();
            if (z) {
                this.f102550g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
