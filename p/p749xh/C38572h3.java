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

/* renamed from: xh.h3 */
public class C38572h3 extends IAutoDBItem {

    /* renamed from: i */
    public static final SingleTable f102415i;

    /* renamed from: j */
    public static final String[] f102416j = new String[0];

    /* renamed from: n */
    public static final int f102417n = -1102434521;

    /* renamed from: o */
    public static final int f102418o = -370888772;

    /* renamed from: p */
    public static final int f102419p = 226087607;

    /* renamed from: q */
    public static final int f102420q = 1648787341;

    /* renamed from: r */
    public static final int f102421r = 1959784951;

    /* renamed from: s */
    public static final int f102422s = 108705909;

    /* renamed from: t */
    public static final IAutoDBItem.MAutoDBInfo f102423t = initAutoDBInfo(C38572h3.class);

    /* renamed from: u */
    public static final StorageObserverOwner<C38572h3> f102424u = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102425d = true;

    /* renamed from: e */
    public boolean f102426e = true;

    /* renamed from: f */
    public boolean f102427f = true;
    public int field_freeTimeForLive;
    public int field_freeTimeForReplay;
    public int field_invalid;
    public long field_liveId;
    public int field_payForLive;

    /* renamed from: g */
    public boolean f102428g = true;

    /* renamed from: h */
    public boolean f102429h = true;

    static {
        SingleTable singleTable = new SingleTable("FinderLiveChargeInfo");
        f102415i = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("liveId", "long", singleTable.getName(), "");
        new Column("freeTimeForLive", "int", singleTable.getName(), "");
        new Column("freeTimeForReplay", "int", singleTable.getName(), "");
        new Column("payForLive", "int", singleTable.getName(), "");
        new Column("invalid", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[5];
        String[] strArr = new String[6];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "liveId";
        mAutoDBInfo.colsMap.put("liveId", "LONG PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "liveId";
        mAutoDBInfo.columns[1] = "freeTimeForLive";
        mAutoDBInfo.colsMap.put("freeTimeForLive", "INTEGER");
        mAutoDBInfo.columns[2] = "freeTimeForReplay";
        mAutoDBInfo.colsMap.put("freeTimeForReplay", "INTEGER");
        mAutoDBInfo.columns[3] = "payForLive";
        mAutoDBInfo.colsMap.put("payForLive", "INTEGER");
        mAutoDBInfo.columns[4] = "invalid";
        mAutoDBInfo.colsMap.put("invalid", "INTEGER");
        mAutoDBInfo.columns[5] = "rowid";
        mAutoDBInfo.sql = " liveId LONG PRIMARY KEY ,  freeTimeForLive INTEGER,  freeTimeForReplay INTEGER,  payForLive INTEGER,  invalid INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38572h3)) {
            return false;
        }
        C38572h3 h3Var = (C38572h3) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_liveId), Long.valueOf(h3Var.field_liveId)) && C46238a.m51546a(Integer.valueOf(this.field_freeTimeForLive), Integer.valueOf(h3Var.field_freeTimeForLive)) && C46238a.m51546a(Integer.valueOf(this.field_freeTimeForReplay), Integer.valueOf(h3Var.field_freeTimeForReplay)) && C46238a.m51546a(Integer.valueOf(this.field_payForLive), Integer.valueOf(h3Var.field_payForLive)) && C46238a.m51546a(Integer.valueOf(this.field_invalid), Integer.valueOf(h3Var.field_invalid));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102417n == hashCode) {
                    try {
                        this.field_liveId = cursor.getLong(i);
                        this.f102425d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveChargeInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102418o == hashCode) {
                    try {
                        this.field_freeTimeForLive = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveChargeInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102419p == hashCode) {
                    try {
                        this.field_freeTimeForReplay = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveChargeInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102420q == hashCode) {
                    try {
                        this.field_payForLive = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveChargeInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102421r == hashCode) {
                    try {
                        this.field_invalid = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseFinderLiveChargeInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102422s == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102425d) {
            contentValues.put("liveId", Long.valueOf(this.field_liveId));
        }
        if (this.f102426e) {
            contentValues.put("freeTimeForLive", Integer.valueOf(this.field_freeTimeForLive));
        }
        if (this.f102427f) {
            contentValues.put("freeTimeForReplay", Integer.valueOf(this.field_freeTimeForReplay));
        }
        if (this.f102428g) {
            contentValues.put("payForLive", Integer.valueOf(this.field_payForLive));
        }
        if (this.f102429h) {
            contentValues.put("invalid", Integer.valueOf(this.field_invalid));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseFinderLiveChargeInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS FinderLiveChargeInfo ( " + f102423t.sql + ");");
        for (String add : f102416j) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveChargeInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("FinderLiveChargeInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102423t, "FinderLiveChargeInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseFinderLiveChargeInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("FinderLiveChargeInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseFinderLiveChargeInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102423t;
    }

    public String[] getIndexCreateSQL() {
        return f102416j;
    }

    public StorageObserverOwner<C38572h3> getObserverOwner() {
        return f102424u;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.field_liveId);
    }

    public SingleTable getTable() {
        return f102415i;
    }

    public String getTableName() {
        return f102415i.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("liveId")) {
            this.field_liveId = contentValues.getAsLong("liveId").longValue();
            if (z) {
                this.f102425d = true;
            }
        }
        if (contentValues.containsKey("freeTimeForLive")) {
            this.field_freeTimeForLive = contentValues.getAsInteger("freeTimeForLive").intValue();
            if (z) {
                this.f102426e = true;
            }
        }
        if (contentValues.containsKey("freeTimeForReplay")) {
            this.field_freeTimeForReplay = contentValues.getAsInteger("freeTimeForReplay").intValue();
            if (z) {
                this.f102427f = true;
            }
        }
        if (contentValues.containsKey("payForLive")) {
            this.field_payForLive = contentValues.getAsInteger("payForLive").intValue();
            if (z) {
                this.f102428g = true;
            }
        }
        if (contentValues.containsKey("invalid")) {
            this.field_invalid = contentValues.getAsInteger("invalid").intValue();
            if (z) {
                this.f102429h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
