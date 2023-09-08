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
import com.tencent.xweb.IXWebPreferences;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.z1 */
public class C38711z1 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f104393n;

    /* renamed from: o */
    public static final String[] f104394o = new String[0];

    /* renamed from: p */
    public static final int f104395p = 1152214031;

    /* renamed from: q */
    public static final int f104396q = 107902;

    /* renamed from: r */
    public static final int f104397r = 3314158;

    /* renamed from: s */
    public static final int f104398s = 3079825;

    /* renamed from: t */
    public static final int f104399t = 293428218;

    /* renamed from: u */
    public static final int f104400u = -777312317;

    /* renamed from: v */
    public static final int f104401v = 31458499;

    /* renamed from: w */
    public static final int f104402w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f104403x = initAutoDBInfo(C38711z1.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38711z1> f104404y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f104405d = true;

    /* renamed from: e */
    public boolean f104406e = true;

    /* renamed from: f */
    public boolean f104407f = true;
    public int field_click_flag;
    public String field_desc;
    public int field_download_flag;
    public String field_groupId;
    public String field_lang;
    public String field_md5;
    public String field_md5_lang;

    /* renamed from: g */
    public boolean f104408g = true;

    /* renamed from: h */
    public boolean f104409h = true;

    /* renamed from: i */
    public boolean f104410i = true;

    /* renamed from: j */
    public boolean f104411j = true;

    static {
        SingleTable singleTable = new SingleTable("EmojiInfoDesc");
        f104393n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("md5_lang", "string", singleTable.getName(), "");
        new Column("md5", "string", singleTable.getName(), "");
        new Column(IXWebPreferences.XWEB_LANGUAGE, "string", singleTable.getName(), "");
        new Column("desc", "string", singleTable.getName(), "");
        new Column("groupId", "string", singleTable.getName(), "");
        new Column("click_flag", "int", singleTable.getName(), "");
        new Column("download_flag", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "md5_lang";
        mAutoDBInfo.colsMap.put("md5_lang", "TEXT PRIMARY KEY  COLLATE NOCASE ");
        mAutoDBInfo.primaryKey = "md5_lang";
        mAutoDBInfo.columns[1] = "md5";
        mAutoDBInfo.colsMap.put("md5", "TEXT COLLATE NOCASE ");
        mAutoDBInfo.columns[2] = IXWebPreferences.XWEB_LANGUAGE;
        mAutoDBInfo.colsMap.put(IXWebPreferences.XWEB_LANGUAGE, "TEXT COLLATE NOCASE ");
        mAutoDBInfo.columns[3] = "desc";
        mAutoDBInfo.colsMap.put("desc", "TEXT");
        mAutoDBInfo.columns[4] = "groupId";
        mAutoDBInfo.colsMap.put("groupId", "TEXT default '' ");
        mAutoDBInfo.columns[5] = "click_flag";
        mAutoDBInfo.colsMap.put("click_flag", "INTEGER");
        mAutoDBInfo.columns[6] = "download_flag";
        mAutoDBInfo.colsMap.put("download_flag", "INTEGER");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " md5_lang TEXT PRIMARY KEY  COLLATE NOCASE ,  md5 TEXT COLLATE NOCASE ,  lang TEXT COLLATE NOCASE ,  desc TEXT,  groupId TEXT default '' ,  click_flag INTEGER,  download_flag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38711z1)) {
            return false;
        }
        C38711z1 z1Var = (C38711z1) iAutoDBItem;
        return C46238a.m51546a(this.field_md5_lang, z1Var.field_md5_lang) && C46238a.m51546a(this.field_md5, z1Var.field_md5) && C46238a.m51546a(this.field_lang, z1Var.field_lang) && C46238a.m51546a(this.field_desc, z1Var.field_desc) && C46238a.m51546a(this.field_groupId, z1Var.field_groupId) && C46238a.m51546a(Integer.valueOf(this.field_click_flag), Integer.valueOf(z1Var.field_click_flag)) && C46238a.m51546a(Integer.valueOf(this.field_download_flag), Integer.valueOf(z1Var.field_download_flag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f104395p == hashCode) {
                    try {
                        this.field_md5_lang = cursor.getString(i);
                        this.f104405d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104396q == hashCode) {
                    try {
                        this.field_md5 = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104397r == hashCode) {
                    try {
                        this.field_lang = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104398s == hashCode) {
                    try {
                        this.field_desc = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104399t == hashCode) {
                    try {
                        this.field_groupId = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104400u == hashCode) {
                    try {
                        this.field_click_flag = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104401v == hashCode) {
                    try {
                        this.field_download_flag = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f104402w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f104405d) {
            contentValues.put("md5_lang", this.field_md5_lang);
        }
        if (this.f104406e) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f104407f) {
            contentValues.put(IXWebPreferences.XWEB_LANGUAGE, this.field_lang);
        }
        if (this.f104408g) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.field_groupId == null) {
            this.field_groupId = "";
        }
        if (this.f104409h) {
            contentValues.put("groupId", this.field_groupId);
        }
        if (this.f104410i) {
            contentValues.put("click_flag", Integer.valueOf(this.field_click_flag));
        }
        if (this.f104411j) {
            contentValues.put("download_flag", Integer.valueOf(this.field_download_flag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseEmojiInfoDesc", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS EmojiInfoDesc ( " + f104403x.sql + ");");
        for (String add : f104394o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiInfoDesc", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("EmojiInfoDesc", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f104403x, "EmojiInfoDesc", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseEmojiInfoDesc", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("EmojiInfoDesc", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseEmojiInfoDesc", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f104403x;
    }

    public String[] getIndexCreateSQL() {
        return f104394o;
    }

    public StorageObserverOwner<C38711z1> getObserverOwner() {
        return f104404y;
    }

    public Object getPrimaryKeyValue() {
        return this.field_md5_lang;
    }

    public SingleTable getTable() {
        return f104393n;
    }

    public String getTableName() {
        return f104393n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("md5_lang")) {
            this.field_md5_lang = contentValues.getAsString("md5_lang");
            if (z) {
                this.f104405d = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z) {
                this.f104406e = true;
            }
        }
        if (contentValues.containsKey(IXWebPreferences.XWEB_LANGUAGE)) {
            this.field_lang = contentValues.getAsString(IXWebPreferences.XWEB_LANGUAGE);
            if (z) {
                this.f104407f = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z) {
                this.f104408g = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsString("groupId");
            if (z) {
                this.f104409h = true;
            }
        }
        if (contentValues.containsKey("click_flag")) {
            this.field_click_flag = contentValues.getAsInteger("click_flag").intValue();
            if (z) {
                this.f104410i = true;
            }
        }
        if (contentValues.containsKey("download_flag")) {
            this.field_download_flag = contentValues.getAsInteger("download_flag").intValue();
            if (z) {
                this.f104411j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
