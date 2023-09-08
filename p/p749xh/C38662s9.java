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

/* renamed from: xh.s9 */
public class C38662s9 extends IAutoDBItem {

    /* renamed from: f */
    public static final SingleTable f103706f;

    /* renamed from: g */
    public static final String[] f103707g = new String[0];

    /* renamed from: h */
    public static final int f103708h = -1553000966;

    /* renamed from: i */
    public static final int f103709i = -89975071;

    /* renamed from: j */
    public static final int f103710j = 108705909;

    /* renamed from: n */
    public static final IAutoDBItem.MAutoDBInfo f103711n = initAutoDBInfo(C38662s9.class);

    /* renamed from: o */
    public static final StorageObserverOwner<C38662s9> f103712o = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f103713d = true;

    /* renamed from: e */
    public boolean f103714e = true;
    public byte[] field_wallet_grey_item_buf;
    public int field_wallet_region;

    static {
        SingleTable singleTable = new SingleTable("WalletRegionGreyAreaList");
        f103706f = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("wallet_region", "int", singleTable.getName(), "");
        new Column("wallet_grey_item_buf", "byte[]", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[2];
        String[] strArr = new String[3];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "wallet_region";
        mAutoDBInfo.colsMap.put("wallet_region", "INTEGER PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "wallet_region";
        mAutoDBInfo.columns[1] = "wallet_grey_item_buf";
        mAutoDBInfo.colsMap.put("wallet_grey_item_buf", "BLOB");
        mAutoDBInfo.columns[2] = "rowid";
        mAutoDBInfo.sql = " wallet_region INTEGER PRIMARY KEY ,  wallet_grey_item_buf BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38662s9)) {
            return false;
        }
        C38662s9 s9Var = (C38662s9) iAutoDBItem;
        return C46238a.m51546a(Integer.valueOf(this.field_wallet_region), Integer.valueOf(s9Var.field_wallet_region)) && C46238a.m51546a(this.field_wallet_grey_item_buf, s9Var.field_wallet_grey_item_buf);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103708h == hashCode) {
                    try {
                        this.field_wallet_region = cursor.getInt(i);
                        this.f103713d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletRegionGreyAreaList", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103709i == hashCode) {
                    try {
                        this.field_wallet_grey_item_buf = cursor.getBlob(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseWalletRegionGreyAreaList", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103710j == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103713d) {
            contentValues.put("wallet_region", Integer.valueOf(this.field_wallet_region));
        }
        if (this.f103714e) {
            contentValues.put("wallet_grey_item_buf", this.field_wallet_grey_item_buf);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseWalletRegionGreyAreaList", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS WalletRegionGreyAreaList ( " + f103711n.sql + ");");
        for (String add : f103707g) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseWalletRegionGreyAreaList", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("WalletRegionGreyAreaList", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103711n, "WalletRegionGreyAreaList", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseWalletRegionGreyAreaList", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("WalletRegionGreyAreaList", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseWalletRegionGreyAreaList", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103711n;
    }

    public String[] getIndexCreateSQL() {
        return f103707g;
    }

    public StorageObserverOwner<C38662s9> getObserverOwner() {
        return f103712o;
    }

    public Object getPrimaryKeyValue() {
        return Integer.valueOf(this.field_wallet_region);
    }

    public SingleTable getTable() {
        return f103706f;
    }

    public String getTableName() {
        return f103706f.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("wallet_region")) {
            this.field_wallet_region = contentValues.getAsInteger("wallet_region").intValue();
            if (z) {
                this.f103713d = true;
            }
        }
        if (contentValues.containsKey("wallet_grey_item_buf")) {
            this.field_wallet_grey_item_buf = contentValues.getAsByteArray("wallet_grey_item_buf");
            if (z) {
                this.f103714e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
