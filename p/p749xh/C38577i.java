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
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.i */
public class C38577i extends IAutoDBItem {

    /* renamed from: g */
    public static final SingleTable f102488g;

    /* renamed from: h */
    public static final String[] f102489h = new String[0];

    /* renamed from: i */
    public static final int f102490i = -266666762;

    /* renamed from: j */
    public static final int f102491j = 109254796;

    /* renamed from: n */
    public static final int f102492n = -873960692;

    /* renamed from: o */
    public static final int f102493o = 108705909;

    /* renamed from: p */
    public static final IAutoDBItem.MAutoDBInfo f102494p = initAutoDBInfo(C38577i.class);

    /* renamed from: q */
    public static final StorageObserverOwner<C38577i> f102495q = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102496d = true;

    /* renamed from: e */
    public boolean f102497e = true;

    /* renamed from: f */
    public boolean f102498f = true;
    public int field_scene;
    public String field_ticket;
    public String field_userName;

    static {
        SingleTable singleTable = new SingleTable("AddContactAntispamTicket");
        f102488g = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "int", singleTable.getName(), "");
        new Column("ticket", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[3];
        String[] strArr = new String[4];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT");
        mAutoDBInfo.columns[1] = TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        mAutoDBInfo.colsMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        mAutoDBInfo.columns[2] = "ticket";
        mAutoDBInfo.colsMap.put("ticket", "TEXT");
        mAutoDBInfo.columns[3] = "rowid";
        mAutoDBInfo.sql = " userName TEXT,  scene INTEGER,  ticket TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38577i)) {
            return false;
        }
        C38577i iVar = (C38577i) iAutoDBItem;
        return C46238a.m51546a(this.field_userName, iVar.field_userName) && C46238a.m51546a(Integer.valueOf(this.field_scene), Integer.valueOf(iVar.field_scene)) && C46238a.m51546a(this.field_ticket, iVar.field_ticket);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102490i == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAddContactAntispamTicket", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102491j == hashCode) {
                    try {
                        this.field_scene = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAddContactAntispamTicket", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102492n == hashCode) {
                    try {
                        this.field_ticket = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseAddContactAntispamTicket", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102493o == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102496d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f102497e) {
            contentValues.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(this.field_scene));
        }
        if (this.f102498f) {
            contentValues.put("ticket", this.field_ticket);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseAddContactAntispamTicket", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS AddContactAntispamTicket ( " + f102494p.sql + ");");
        for (String add : f102489h) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseAddContactAntispamTicket", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("AddContactAntispamTicket", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102494p, "AddContactAntispamTicket", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseAddContactAntispamTicket", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("AddContactAntispamTicket", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseAddContactAntispamTicket", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102494p;
    }

    public String[] getIndexCreateSQL() {
        return f102489h;
    }

    public StorageObserverOwner<C38577i> getObserverOwner() {
        return f102495q;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102488g;
    }

    public String getTableName() {
        return f102488g.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f102496d = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z) {
                this.f102497e = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.field_ticket = contentValues.getAsString("ticket");
            if (z) {
                this.f102498f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
