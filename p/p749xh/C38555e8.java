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
import te3.C48897bs;

/* renamed from: xh.e8 */
public class C38555e8 extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f102181h;

    /* renamed from: i */
    public static final String[] f102182i = new String[0];

    /* renamed from: j */
    public static final int f102183j = 1725503695;

    /* renamed from: n */
    public static final int f102184n = 104191100;

    /* renamed from: o */
    public static final int f102185o = -881080743;

    /* renamed from: p */
    public static final int f102186p = -696748209;

    /* renamed from: q */
    public static final int f102187q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f102188r = initAutoDBInfo(C38555e8.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38555e8> f102189s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102190d = true;

    /* renamed from: e */
    public boolean f102191e = true;

    /* renamed from: f */
    public boolean f102192f = true;
    public C48897bs field_chatHistoryItem;
    public String field_historyId;
    public long field_msgId;
    public String field_talker;

    /* renamed from: g */
    public boolean f102193g = true;

    static {
        SingleTable singleTable = new SingleTable("SelectRecord");
        f102181h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("historyId", "string", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
        new Column("talker", "string", singleTable.getName(), "");
        new Column("chatHistoryItem", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.ChatHistoryItem");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "historyId";
        mAutoDBInfo.colsMap.put("historyId", "TEXT");
        mAutoDBInfo.columns[1] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG");
        mAutoDBInfo.columns[2] = "talker";
        mAutoDBInfo.colsMap.put("talker", "TEXT");
        mAutoDBInfo.columns[3] = "chatHistoryItem";
        mAutoDBInfo.colsMap.put("chatHistoryItem", "BLOB");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " historyId TEXT,  msgId LONG,  talker TEXT,  chatHistoryItem BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38555e8)) {
            return false;
        }
        C38555e8 e8Var = (C38555e8) iAutoDBItem;
        return C46238a.m51546a(this.field_historyId, e8Var.field_historyId) && C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(e8Var.field_msgId)) && C46238a.m51546a(this.field_talker, e8Var.field_talker) && C46238a.m51546a(this.field_chatHistoryItem, e8Var.field_chatHistoryItem);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102183j == hashCode) {
                    try {
                        this.field_historyId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSelectRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102184n == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSelectRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102185o == hashCode) {
                    try {
                        this.field_talker = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSelectRecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102186p == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_chatHistoryItem = (C48897bs) new C48897bs().parseFrom(blob);
                        }
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseSelectRecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102187q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C48897bs bsVar;
        ContentValues contentValues = new ContentValues();
        if (this.f102190d) {
            contentValues.put("historyId", this.field_historyId);
        }
        if (this.f102191e) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        if (this.f102192f) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f102193g && (bsVar = this.field_chatHistoryItem) != null) {
            try {
                contentValues.put("chatHistoryItem", bsVar.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseSelectRecord", e.getMessage());
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
            Log.m105920e("MicroMsg.SDK.BaseSelectRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS SelectRecord ( " + f102188r.sql + ");");
        for (String add : f102182i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseSelectRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("SelectRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102188r, "SelectRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseSelectRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("SelectRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseSelectRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102188r;
    }

    public String[] getIndexCreateSQL() {
        return f102182i;
    }

    public StorageObserverOwner<C38555e8> getObserverOwner() {
        return f102189s;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102181h;
    }

    public String getTableName() {
        return f102181h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("historyId")) {
            this.field_historyId = contentValues.getAsString("historyId");
            if (z) {
                this.f102190d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f102191e = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z) {
                this.f102192f = true;
            }
        }
        if (contentValues.containsKey("chatHistoryItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("chatHistoryItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_chatHistoryItem = (C48897bs) new C48897bs().parseFrom(asByteArray);
                    if (z) {
                        this.f102193g = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseSelectRecord", e.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
