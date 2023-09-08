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
import te3.C90446wm2;

/* renamed from: xh.s5 */
public class C38658s5 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103614f;

    /* renamed from: g */
    public static final String[] f103615g = new String[0];

    /* renamed from: h */
    public static final int f103616h = 93028124;

    /* renamed from: i */
    public static final int f103617i = -1407251227;

    /* renamed from: j */
    public static final int f103618j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103619n = initAutoDBInfo(C38658s5.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38658s5> f103620o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103621d = true;

    /* renamed from: e */
    public boolean f103622e = true;
    public String field_appId;
    public C90446wm2 field_launchPB;

    static {
        SingleTable singleTable = new SingleTable("LaunchWxaAppPBTable");
        f103614f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("appId", "string", singleTable.getName(), "");
        new Column("launchPB", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.protocal.protobuf.LaunchWxaAppResponse");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "appId";
        mAutoDBInfo.colsMap.put("appId", "TEXT");
        mAutoDBInfo.columns[1] = "launchPB";
        mAutoDBInfo.colsMap.put("launchPB", "BLOB");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " appId TEXT,  launchPB BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38658s5)) {
            return false;
        }
        C38658s5 s5Var = (C38658s5) iAutoDBItem;
        return C46238a.m51546a(this.field_appId, s5Var.field_appId) && C46238a.m51546a(this.field_launchPB, s5Var.field_launchPB);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103616h == hashCode) {
                    try {
                        this.field_appId = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppPBTable", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103617i == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_launchPB = (C90446wm2) new C90446wm2().parseFrom(blob);
                        }
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLaunchWxaAppPBTable", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103618j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C90446wm2 wm22;
        ContentValues contentValues = new ContentValues();
        if (this.f103621d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f103622e && (wm22 = this.field_launchPB) != null) {
            try {
                contentValues.put("launchPB", wm22.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppPBTable", e.getMessage());
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
            Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppPBTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LaunchWxaAppPBTable ( " + f103619n.sql + ");");
        for (String add : f103615g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLaunchWxaAppPBTable", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LaunchWxaAppPBTable", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103619n, "LaunchWxaAppPBTable", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLaunchWxaAppPBTable", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LaunchWxaAppPBTable", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLaunchWxaAppPBTable", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103619n;
    }

    public String[] getIndexCreateSQL() {
        return f103615g;
    }

    public StorageObserverOwner<C38658s5> getObserverOwner() {
        return f103620o;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f103614f;
    }

    public String getTableName() {
        return f103614f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z) {
                this.f103621d = true;
            }
        }
        if (contentValues.containsKey("launchPB")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("launchPB");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_launchPB = (C90446wm2) new C90446wm2().parseFrom(asByteArray);
                    if (z) {
                        this.f103622e = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseLaunchWxaAppPBTable", e.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
