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

/* renamed from: xh.u6 */
public class C78827u6 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f231460A = 108705909;

    /* renamed from: B */
    public static final IAutoDBItem.MAutoDBInfo f231461B = initAutoDBInfo(C78827u6.class);

    /* renamed from: C */
    public static final StorageObserverOwner<C78827u6> f231462C = new StorageObserverOwner<>();

    /* renamed from: p */
    public static final SingleTable f231463p;

    /* renamed from: q */
    public static final String[] f231464q = new String[0];

    /* renamed from: r */
    public static final int f231465r = -1914377637;

    /* renamed from: s */
    public static final int f231466s = 2095350813;

    /* renamed from: t */
    public static final int f231467t = -873960692;

    /* renamed from: u */
    public static final int f231468u = 70690926;

    /* renamed from: v */
    public static final int f231469v = -1246914448;

    /* renamed from: w */
    public static final int f231470w = -339192195;

    /* renamed from: x */
    public static final int f231471x = 220606420;

    /* renamed from: y */
    public static final int f231472y = -265713450;

    /* renamed from: z */
    public static final int f231473z = 113759;

    /* renamed from: d */
    public boolean f231474d = true;

    /* renamed from: e */
    public boolean f231475e = true;

    /* renamed from: f */
    public boolean f231476f = true;
    public int field_addState;
    public String field_encryptUsername;
    public String field_nickname;
    public String field_oldUsername;
    public String field_pinyinName;
    public int field_seq;
    public int field_showHead;
    public String field_ticket;
    public String field_username;

    /* renamed from: g */
    public boolean f231477g = true;

    /* renamed from: h */
    public boolean f231478h = true;

    /* renamed from: i */
    public boolean f231479i = true;

    /* renamed from: j */
    public boolean f231480j = true;

    /* renamed from: n */
    public boolean f231481n = true;

    /* renamed from: o */
    public boolean f231482o = true;

    static {
        SingleTable singleTable = new SingleTable("OldAccountFriend");
        f231463p = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("encryptUsername", "string", singleTable.getName(), "");
        new Column("oldUsername", "string", singleTable.getName(), "");
        new Column("ticket", "string", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("addState", "int", singleTable.getName(), "");
        new Column("showHead", "int", singleTable.getName(), "");
        new Column("pinyinName", "string", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column(TPReportKeys.Common.COMMON_SEQ, "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[9];
        String[] strArr = new String[10];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "encryptUsername";
        mAutoDBInfo.colsMap.put("encryptUsername", "TEXT");
        mAutoDBInfo.columns[1] = "oldUsername";
        mAutoDBInfo.colsMap.put("oldUsername", "TEXT");
        mAutoDBInfo.columns[2] = "ticket";
        mAutoDBInfo.colsMap.put("ticket", "TEXT");
        mAutoDBInfo.columns[3] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT");
        mAutoDBInfo.columns[4] = "addState";
        mAutoDBInfo.colsMap.put("addState", "INTEGER");
        mAutoDBInfo.columns[5] = "showHead";
        mAutoDBInfo.colsMap.put("showHead", "INTEGER");
        mAutoDBInfo.columns[6] = "pinyinName";
        mAutoDBInfo.colsMap.put("pinyinName", "TEXT");
        mAutoDBInfo.columns[7] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT");
        mAutoDBInfo.columns[8] = TPReportKeys.Common.COMMON_SEQ;
        mAutoDBInfo.colsMap.put(TPReportKeys.Common.COMMON_SEQ, "INTEGER");
        mAutoDBInfo.columns[9] = "rowid";
        mAutoDBInfo.sql = " encryptUsername TEXT,  oldUsername TEXT,  ticket TEXT,  nickname TEXT,  addState INTEGER,  showHead INTEGER,  pinyinName TEXT,  username TEXT,  seq INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C78827u6)) {
            return false;
        }
        C78827u6 u6Var = (C78827u6) iAutoDBItem;
        return C46238a.m51546a(this.field_encryptUsername, u6Var.field_encryptUsername) && C46238a.m51546a(this.field_oldUsername, u6Var.field_oldUsername) && C46238a.m51546a(this.field_ticket, u6Var.field_ticket) && C46238a.m51546a(this.field_nickname, u6Var.field_nickname) && C46238a.m51546a(Integer.valueOf(this.field_addState), Integer.valueOf(u6Var.field_addState)) && C46238a.m51546a(Integer.valueOf(this.field_showHead), Integer.valueOf(u6Var.field_showHead)) && C46238a.m51546a(this.field_pinyinName, u6Var.field_pinyinName) && C46238a.m51546a(this.field_username, u6Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_seq), Integer.valueOf(u6Var.field_seq));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f231465r == hashCode) {
                    try {
                        this.field_encryptUsername = cursor.getString(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231466s == hashCode) {
                    try {
                        this.field_oldUsername = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231467t == hashCode) {
                    try {
                        this.field_ticket = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231468u == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231469v == hashCode) {
                    try {
                        this.field_addState = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231470w == hashCode) {
                    try {
                        this.field_showHead = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231471x == hashCode) {
                    try {
                        this.field_pinyinName = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231472y == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231473z == hashCode) {
                    try {
                        this.field_seq = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f231460A == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f231474d) {
            contentValues.put("encryptUsername", this.field_encryptUsername);
        }
        if (this.f231475e) {
            contentValues.put("oldUsername", this.field_oldUsername);
        }
        if (this.f231476f) {
            contentValues.put("ticket", this.field_ticket);
        }
        if (this.f231477g) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f231478h) {
            contentValues.put("addState", Integer.valueOf(this.field_addState));
        }
        if (this.f231479i) {
            contentValues.put("showHead", Integer.valueOf(this.field_showHead));
        }
        if (this.f231480j) {
            contentValues.put("pinyinName", this.field_pinyinName);
        }
        if (this.f231481n) {
            contentValues.put("username", this.field_username);
        }
        if (this.f231482o) {
            contentValues.put(TPReportKeys.Common.COMMON_SEQ, Integer.valueOf(this.field_seq));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseOldAccountFriend", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS OldAccountFriend ( " + f231461B.sql + ");");
        for (String add : f231464q) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseOldAccountFriend", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("OldAccountFriend", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f231461B, "OldAccountFriend", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseOldAccountFriend", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("OldAccountFriend", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseOldAccountFriend", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f231461B;
    }

    public String[] getIndexCreateSQL() {
        return f231464q;
    }

    public StorageObserverOwner<C78827u6> getObserverOwner() {
        return f231462C;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f231463p;
    }

    public String getTableName() {
        return f231463p.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("encryptUsername")) {
            this.field_encryptUsername = contentValues.getAsString("encryptUsername");
            if (z) {
                this.f231474d = true;
            }
        }
        if (contentValues.containsKey("oldUsername")) {
            this.field_oldUsername = contentValues.getAsString("oldUsername");
            if (z) {
                this.f231475e = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.field_ticket = contentValues.getAsString("ticket");
            if (z) {
                this.f231476f = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f231477g = true;
            }
        }
        if (contentValues.containsKey("addState")) {
            this.field_addState = contentValues.getAsInteger("addState").intValue();
            if (z) {
                this.f231478h = true;
            }
        }
        if (contentValues.containsKey("showHead")) {
            this.field_showHead = contentValues.getAsInteger("showHead").intValue();
            if (z) {
                this.f231479i = true;
            }
        }
        if (contentValues.containsKey("pinyinName")) {
            this.field_pinyinName = contentValues.getAsString("pinyinName");
            if (z) {
                this.f231480j = true;
            }
        }
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f231481n = true;
            }
        }
        if (contentValues.containsKey(TPReportKeys.Common.COMMON_SEQ)) {
            this.field_seq = contentValues.getAsInteger(TPReportKeys.Common.COMMON_SEQ).intValue();
            if (z) {
                this.f231482o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
