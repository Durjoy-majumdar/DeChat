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

/* renamed from: xh.f2 */
public class C38558f2 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f102233n;

    /* renamed from: o */
    public static final String[] f102234o = new String[0];

    /* renamed from: p */
    public static final int f102235p = -1067917850;

    /* renamed from: q */
    public static final int f102236q = -731385813;

    /* renamed from: r */
    public static final int f102237r = -784229327;

    /* renamed from: s */
    public static final int f102238s = 3145580;

    /* renamed from: t */
    public static final int f102239t = 1211388583;

    /* renamed from: u */
    public static final int f102240u = 1464447042;

    /* renamed from: v */
    public static final int f102241v = -691745061;

    /* renamed from: w */
    public static final int f102242w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f102243x = initAutoDBInfo(C38558f2.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38558f2> f102244y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102245d = true;

    /* renamed from: e */
    public boolean f102246e = true;

    /* renamed from: f */
    public boolean f102247f = true;
    public int field_continuCount;
    public int field_flag;
    public long field_modifyTime;
    public String field_prodcutID;
    public long field_setFlagTime;
    public long field_showTipsTime;
    public int field_totalCount;

    /* renamed from: g */
    public boolean f102248g = true;

    /* renamed from: h */
    public boolean f102249h = true;

    /* renamed from: i */
    public boolean f102250i = true;

    /* renamed from: j */
    public boolean f102251j = true;

    static {
        SingleTable singleTable = new SingleTable("EmotionRewardTipInfo");
        f102233n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("prodcutID", "string", singleTable.getName(), "");
        new Column("totalCount", "int", singleTable.getName(), "");
        new Column("continuCount", "int", singleTable.getName(), "");
        new Column("flag", "int", singleTable.getName(), "");
        new Column("modifyTime", "long", singleTable.getName(), "");
        new Column("showTipsTime", "long", singleTable.getName(), "");
        new Column("setFlagTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "prodcutID";
        mAutoDBInfo.colsMap.put("prodcutID", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "prodcutID";
        mAutoDBInfo.columns[1] = "totalCount";
        mAutoDBInfo.colsMap.put("totalCount", "INTEGER");
        mAutoDBInfo.columns[2] = "continuCount";
        mAutoDBInfo.colsMap.put("continuCount", "INTEGER");
        mAutoDBInfo.columns[3] = "flag";
        mAutoDBInfo.colsMap.put("flag", "INTEGER");
        mAutoDBInfo.columns[4] = "modifyTime";
        mAutoDBInfo.colsMap.put("modifyTime", "LONG");
        mAutoDBInfo.columns[5] = "showTipsTime";
        mAutoDBInfo.colsMap.put("showTipsTime", "LONG");
        mAutoDBInfo.columns[6] = "setFlagTime";
        mAutoDBInfo.colsMap.put("setFlagTime", "LONG");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " prodcutID TEXT PRIMARY KEY ,  totalCount INTEGER,  continuCount INTEGER,  flag INTEGER,  modifyTime LONG,  showTipsTime LONG,  setFlagTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38558f2)) {
            return false;
        }
        C38558f2 f2Var = (C38558f2) iAutoDBItem;
        return C46238a.m51546a(this.field_prodcutID, f2Var.field_prodcutID) && C46238a.m51546a(Integer.valueOf(this.field_totalCount), Integer.valueOf(f2Var.field_totalCount)) && C46238a.m51546a(Integer.valueOf(this.field_continuCount), Integer.valueOf(f2Var.field_continuCount)) && C46238a.m51546a(Integer.valueOf(this.field_flag), Integer.valueOf(f2Var.field_flag)) && C46238a.m51546a(Long.valueOf(this.field_modifyTime), Long.valueOf(f2Var.field_modifyTime)) && C46238a.m51546a(Long.valueOf(this.field_showTipsTime), Long.valueOf(f2Var.field_showTipsTime)) && C46238a.m51546a(Long.valueOf(this.field_setFlagTime), Long.valueOf(f2Var.field_setFlagTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102235p == hashCode) {
                    try {
                        this.field_prodcutID = cursor.getString(i);
                        this.f102245d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardTipInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102236q == hashCode) {
                    try {
                        this.field_totalCount = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardTipInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102237r == hashCode) {
                    try {
                        this.field_continuCount = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardTipInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102238s == hashCode) {
                    try {
                        this.field_flag = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardTipInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102239t == hashCode) {
                    try {
                        this.field_modifyTime = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardTipInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102240u == hashCode) {
                    try {
                        this.field_showTipsTime = cursor.getLong(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardTipInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102241v == hashCode) {
                    try {
                        this.field_setFlagTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmotionRewardTipInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102242w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102245d) {
            contentValues.put("prodcutID", this.field_prodcutID);
        }
        if (this.f102246e) {
            contentValues.put("totalCount", Integer.valueOf(this.field_totalCount));
        }
        if (this.f102247f) {
            contentValues.put("continuCount", Integer.valueOf(this.field_continuCount));
        }
        if (this.f102248g) {
            contentValues.put("flag", Integer.valueOf(this.field_flag));
        }
        if (this.f102249h) {
            contentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
        }
        if (this.f102250i) {
            contentValues.put("showTipsTime", Long.valueOf(this.field_showTipsTime));
        }
        if (this.f102251j) {
            contentValues.put("setFlagTime", Long.valueOf(this.field_setFlagTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEmotionRewardTipInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmotionRewardTipInfo ( " + f102243x.sql + ");");
        for (String add : f102234o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmotionRewardTipInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmotionRewardTipInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102243x, "EmotionRewardTipInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmotionRewardTipInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmotionRewardTipInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmotionRewardTipInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102243x;
    }

    public String[] getIndexCreateSQL() {
        return f102234o;
    }

    public StorageObserverOwner<C38558f2> getObserverOwner() {
        return f102244y;
    }

    public Object getPrimaryKeyValue() {
        return this.field_prodcutID;
    }

    public SingleTable getTable() {
        return f102233n;
    }

    public String getTableName() {
        return f102233n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("prodcutID")) {
            this.field_prodcutID = contentValues.getAsString("prodcutID");
            if (z) {
                this.f102245d = true;
            }
        }
        if (contentValues.containsKey("totalCount")) {
            this.field_totalCount = contentValues.getAsInteger("totalCount").intValue();
            if (z) {
                this.f102246e = true;
            }
        }
        if (contentValues.containsKey("continuCount")) {
            this.field_continuCount = contentValues.getAsInteger("continuCount").intValue();
            if (z) {
                this.f102247f = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.field_flag = contentValues.getAsInteger("flag").intValue();
            if (z) {
                this.f102248g = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.field_modifyTime = contentValues.getAsLong("modifyTime").longValue();
            if (z) {
                this.f102249h = true;
            }
        }
        if (contentValues.containsKey("showTipsTime")) {
            this.field_showTipsTime = contentValues.getAsLong("showTipsTime").longValue();
            if (z) {
                this.f102250i = true;
            }
        }
        if (contentValues.containsKey("setFlagTime")) {
            this.field_setFlagTime = contentValues.getAsLong("setFlagTime").longValue();
            if (z) {
                this.f102251j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
