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

/* renamed from: xh.a */
public class C38516a extends IAutoDBItem {

    /* renamed from: h */
    public static final SingleTable f101555h;

    /* renamed from: i */
    public static final String[] f101556i = new String[0];

    /* renamed from: j */
    public static final int f101557j = 1353538740;

    /* renamed from: n */
    public static final int f101558n = -384451032;

    /* renamed from: o */
    public static final int f101559o = 1438296115;

    /* renamed from: p */
    public static final int f101560p = 104191100;

    /* renamed from: q */
    public static final int f101561q = 108705909;

    /* renamed from: r */
    public static final IAutoDBItem.MAutoDBInfo f101562r = initAutoDBInfo(C38516a.class);

    /* renamed from: s */
    public static final StorageObserverOwner<C38516a> f101563s = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f101564d = true;

    /* renamed from: e */
    public boolean f101565e = true;

    /* renamed from: f */
    public boolean f101566f = true;
    public String field_chatroom;
    public boolean field_insertmsg;
    public long field_msgId;
    public String field_payMsgId;

    /* renamed from: g */
    public boolean f101567g = true;

    static {
        SingleTable singleTable = new SingleTable("AAPayRecord");
        f101555h = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("payMsgId", "string", singleTable.getName(), "");
        new Column("insertmsg", DownloadSetting.TYPE_BOOLEAN, singleTable.getName(), "");
        new Column("chatroom", "string", singleTable.getName(), "");
        new Column("msgId", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[4];
        String[] strArr = new String[5];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "payMsgId";
        mAutoDBInfo.colsMap.put("payMsgId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "payMsgId";
        mAutoDBInfo.columns[1] = "insertmsg";
        mAutoDBInfo.colsMap.put("insertmsg", "INTEGER");
        mAutoDBInfo.columns[2] = "chatroom";
        mAutoDBInfo.colsMap.put("chatroom", "TEXT");
        mAutoDBInfo.columns[3] = "msgId";
        mAutoDBInfo.colsMap.put("msgId", "LONG");
        mAutoDBInfo.columns[4] = "rowid";
        mAutoDBInfo.sql = " payMsgId TEXT PRIMARY KEY ,  insertmsg INTEGER,  chatroom TEXT,  msgId LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38516a)) {
            return false;
        }
        C38516a aVar = (C38516a) iAutoDBItem;
        return C46238a.m51546a(this.field_payMsgId, aVar.field_payMsgId) && C46238a.m51546a(Boolean.valueOf(this.field_insertmsg), Boolean.valueOf(aVar.field_insertmsg)) && C46238a.m51546a(this.field_chatroom, aVar.field_chatroom) && C46238a.m51546a(Long.valueOf(this.field_msgId), Long.valueOf(aVar.field_msgId));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f101557j == hashCode) {
                    try {
                        this.field_payMsgId = cursor.getString(i);
                        this.f101564d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAAPayRecord", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101558n == hashCode) {
                    try {
                        this.field_insertmsg = cursor.getInt(i) != 0;
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAAPayRecord", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101559o == hashCode) {
                    try {
                        this.field_chatroom = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAAPayRecord", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101560p == hashCode) {
                    try {
                        this.field_msgId = cursor.getLong(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAAPayRecord", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f101561q == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f101564d) {
            contentValues.put("payMsgId", this.field_payMsgId);
        }
        if (this.f101565e) {
            if (this.field_insertmsg) {
                contentValues.put("insertmsg", 1);
            } else {
                contentValues.put("insertmsg", 0);
            }
        }
        if (this.f101566f) {
            contentValues.put("chatroom", this.field_chatroom);
        }
        if (this.f101567g) {
            contentValues.put("msgId", Long.valueOf(this.field_msgId));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAAPayRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AAPayRecord ( " + f101562r.sql + ");");
        for (String add : f101556i) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAAPayRecord", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AAPayRecord", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f101562r, "AAPayRecord", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAAPayRecord", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AAPayRecord", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAAPayRecord", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101562r;
    }

    public String[] getIndexCreateSQL() {
        return f101556i;
    }

    public StorageObserverOwner<C38516a> getObserverOwner() {
        return f101563s;
    }

    public Object getPrimaryKeyValue() {
        return this.field_payMsgId;
    }

    public SingleTable getTable() {
        return f101555h;
    }

    public String getTableName() {
        return f101555h.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("payMsgId")) {
            this.field_payMsgId = contentValues.getAsString("payMsgId");
            if (z) {
                this.f101564d = true;
            }
        }
        if (contentValues.containsKey("insertmsg")) {
            this.field_insertmsg = contentValues.getAsInteger("insertmsg").intValue() != 0;
            if (z) {
                this.f101565e = true;
            }
        }
        if (contentValues.containsKey("chatroom")) {
            this.field_chatroom = contentValues.getAsString("chatroom");
            if (z) {
                this.f101566f = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z) {
                this.f101567g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
