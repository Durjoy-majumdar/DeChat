package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
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

/* renamed from: xh.w5 */
public class C38690w5 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f104103n;

    /* renamed from: o */
    public static final String[] f104104o = new String[0];

    /* renamed from: p */
    public static final int f104105p = 110371416;

    /* renamed from: q */
    public static final int f104106q = 1303780429;

    /* renamed from: r */
    public static final int f104107r = -1513215954;

    /* renamed from: s */
    public static final int f104108s = -876896539;

    /* renamed from: t */
    public static final int f104109t = 3560248;

    /* renamed from: u */
    public static final int f104110u = 409014923;

    /* renamed from: v */
    public static final int f104111v = 1873403047;

    /* renamed from: w */
    public static final int f104112w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f104113x = initAutoDBInfo(C38690w5.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38690w5> f104114y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104115d = true;

    /* renamed from: e */
    public boolean f104116e = true;

    /* renamed from: f */
    public boolean f104117f = true;
    public String field_available_otb;
    public int field_is_overdue;
    public int field_is_show_entry;
    public String field_loan_jump_url;
    public int field_red_dot_index;
    public String field_tips;
    public String field_title;

    /* renamed from: g */
    public boolean f104118g = true;

    /* renamed from: h */
    public boolean f104119h = true;

    /* renamed from: i */
    public boolean f104120i = true;

    /* renamed from: j */
    public boolean f104121j = true;

    static {
        SingleTable singleTable = new SingleTable("LoanEntryInfo");
        f104103n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "string", singleTable.getName(), "");
        new Column("loan_jump_url", "string", singleTable.getName(), "");
        new Column("red_dot_index", "int", singleTable.getName(), "");
        new Column("is_show_entry", "int", singleTable.getName(), "");
        new Column("tips", "string", singleTable.getName(), "");
        new Column("is_overdue", "int", singleTable.getName(), "");
        new Column("available_otb", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.colsMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        mAutoDBInfo.columns[1] = "loan_jump_url";
        mAutoDBInfo.colsMap.put("loan_jump_url", "TEXT");
        mAutoDBInfo.columns[2] = "red_dot_index";
        mAutoDBInfo.colsMap.put("red_dot_index", "INTEGER");
        mAutoDBInfo.columns[3] = "is_show_entry";
        mAutoDBInfo.colsMap.put("is_show_entry", "INTEGER");
        mAutoDBInfo.columns[4] = "tips";
        mAutoDBInfo.colsMap.put("tips", "TEXT");
        mAutoDBInfo.columns[5] = "is_overdue";
        mAutoDBInfo.colsMap.put("is_overdue", "INTEGER");
        mAutoDBInfo.columns[6] = "available_otb";
        mAutoDBInfo.colsMap.put("available_otb", "TEXT");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " title TEXT PRIMARY KEY ,  loan_jump_url TEXT,  red_dot_index INTEGER,  is_show_entry INTEGER,  tips TEXT,  is_overdue INTEGER,  available_otb TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38690w5)) {
            return false;
        }
        C38690w5 w5Var = (C38690w5) iAutoDBItem;
        return C46238a.m51546a(this.field_title, w5Var.field_title) && C46238a.m51546a(this.field_loan_jump_url, w5Var.field_loan_jump_url) && C46238a.m51546a(Integer.valueOf(this.field_red_dot_index), Integer.valueOf(w5Var.field_red_dot_index)) && C46238a.m51546a(Integer.valueOf(this.field_is_show_entry), Integer.valueOf(w5Var.field_is_show_entry)) && C46238a.m51546a(this.field_tips, w5Var.field_tips) && C46238a.m51546a(Integer.valueOf(this.field_is_overdue), Integer.valueOf(w5Var.field_is_overdue)) && C46238a.m51546a(this.field_available_otb, w5Var.field_available_otb);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104105p == hashCode) {
                    try {
                        this.field_title = cursor.getString(i);
                        this.f104115d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104106q == hashCode) {
                    try {
                        this.field_loan_jump_url = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104107r == hashCode) {
                    try {
                        this.field_red_dot_index = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104108s == hashCode) {
                    try {
                        this.field_is_show_entry = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104109t == hashCode) {
                    try {
                        this.field_tips = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104110u == hashCode) {
                    try {
                        this.field_is_overdue = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104111v == hashCode) {
                    try {
                        this.field_available_otb = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104112w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104115d) {
            contentValues.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f104116e) {
            contentValues.put("loan_jump_url", this.field_loan_jump_url);
        }
        if (this.f104117f) {
            contentValues.put("red_dot_index", Integer.valueOf(this.field_red_dot_index));
        }
        if (this.f104118g) {
            contentValues.put("is_show_entry", Integer.valueOf(this.field_is_show_entry));
        }
        if (this.f104119h) {
            contentValues.put("tips", this.field_tips);
        }
        if (this.f104120i) {
            contentValues.put("is_overdue", Integer.valueOf(this.field_is_overdue));
        }
        if (this.f104121j) {
            contentValues.put("available_otb", this.field_available_otb);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseLoanEntryInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS LoanEntryInfo ( " + f104113x.sql + ");");
        for (String add : f104104o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseLoanEntryInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("LoanEntryInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104113x, "LoanEntryInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseLoanEntryInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("LoanEntryInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseLoanEntryInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104113x;
    }

    public String[] getIndexCreateSQL() {
        return f104104o;
    }

    public StorageObserverOwner<C38690w5> getObserverOwner() {
        return f104114y;
    }

    public Object getPrimaryKeyValue() {
        return this.field_title;
    }

    public SingleTable getTable() {
        return f104103n;
    }

    public String getTableName() {
        return f104103n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z) {
                this.f104115d = true;
            }
        }
        if (contentValues.containsKey("loan_jump_url")) {
            this.field_loan_jump_url = contentValues.getAsString("loan_jump_url");
            if (z) {
                this.f104116e = true;
            }
        }
        if (contentValues.containsKey("red_dot_index")) {
            this.field_red_dot_index = contentValues.getAsInteger("red_dot_index").intValue();
            if (z) {
                this.f104117f = true;
            }
        }
        if (contentValues.containsKey("is_show_entry")) {
            this.field_is_show_entry = contentValues.getAsInteger("is_show_entry").intValue();
            if (z) {
                this.f104118g = true;
            }
        }
        if (contentValues.containsKey("tips")) {
            this.field_tips = contentValues.getAsString("tips");
            if (z) {
                this.f104119h = true;
            }
        }
        if (contentValues.containsKey("is_overdue")) {
            this.field_is_overdue = contentValues.getAsInteger("is_overdue").intValue();
            if (z) {
                this.f104120i = true;
            }
        }
        if (contentValues.containsKey("available_otb")) {
            this.field_available_otb = contentValues.getAsString("available_otb");
            if (z) {
                this.f104121j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
