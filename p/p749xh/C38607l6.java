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

/* renamed from: xh.l6 */
public class C38607l6 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f102951n;

    /* renamed from: o */
    public static final String[] f102952o = new String[0];

    /* renamed from: p */
    public static final int f102953p = -1341123211;

    /* renamed from: q */
    public static final int f102954q = 303207897;

    /* renamed from: r */
    public static final int f102955r = -266666762;

    /* renamed from: s */
    public static final int f102956s = -500140257;

    /* renamed from: t */
    public static final int f102957t = -649439915;

    /* renamed from: u */
    public static final int f102958u = -892481550;

    /* renamed from: v */
    public static final int f102959v = 1369213417;

    /* renamed from: w */
    public static final int f102960w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f102961x = initAutoDBInfo(C38607l6.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38607l6> f102962y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102963d = true;

    /* renamed from: e */
    public boolean f102964e = true;

    /* renamed from: f */
    public boolean f102965f = true;
    public long field_createTime;
    public String field_inviteUserName;
    public long field_memberId;
    public long field_memberUuid;
    public int field_status;
    public String field_userName;
    public String field_wxGroupId;

    /* renamed from: g */
    public boolean f102966g = true;

    /* renamed from: h */
    public boolean f102967h = true;

    /* renamed from: i */
    public boolean f102968i = true;

    /* renamed from: j */
    public boolean f102969j = true;

    static {
        SingleTable singleTable = new SingleTable("MultiTalkMember");
        f102951n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("memberUuid", "long", singleTable.getName(), "");
        new Column("wxGroupId", "string", singleTable.getName(), "");
        new Column("userName", "string", singleTable.getName(), "");
        new Column("inviteUserName", "string", singleTable.getName(), "");
        new Column("memberId", "long", singleTable.getName(), "");
        new Column("status", "int", singleTable.getName(), "");
        new Column("createTime", "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "memberUuid";
        mAutoDBInfo.colsMap.put("memberUuid", "LONG");
        mAutoDBInfo.columns[1] = "wxGroupId";
        mAutoDBInfo.colsMap.put("wxGroupId", "TEXT");
        mAutoDBInfo.columns[2] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT");
        mAutoDBInfo.columns[3] = "inviteUserName";
        mAutoDBInfo.colsMap.put("inviteUserName", "TEXT");
        mAutoDBInfo.columns[4] = "memberId";
        mAutoDBInfo.colsMap.put("memberId", "LONG");
        mAutoDBInfo.columns[5] = "status";
        mAutoDBInfo.colsMap.put("status", "INTEGER");
        mAutoDBInfo.columns[6] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "LONG");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " memberUuid LONG,  wxGroupId TEXT,  userName TEXT,  inviteUserName TEXT,  memberId LONG,  status INTEGER,  createTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38607l6)) {
            return false;
        }
        C38607l6 l6Var = (C38607l6) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_memberUuid), Long.valueOf(l6Var.field_memberUuid)) && C46238a.m51546a(this.field_wxGroupId, l6Var.field_wxGroupId) && C46238a.m51546a(this.field_userName, l6Var.field_userName) && C46238a.m51546a(this.field_inviteUserName, l6Var.field_inviteUserName) && C46238a.m51546a(Long.valueOf(this.field_memberId), Long.valueOf(l6Var.field_memberId)) && C46238a.m51546a(Integer.valueOf(this.field_status), Integer.valueOf(l6Var.field_status)) && C46238a.m51546a(Long.valueOf(this.field_createTime), Long.valueOf(l6Var.field_createTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102953p == hashCode) {
                    try {
                        this.field_memberUuid = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102954q == hashCode) {
                    try {
                        this.field_wxGroupId = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102955r == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102956s == hashCode) {
                    try {
                        this.field_inviteUserName = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102957t == hashCode) {
                    try {
                        this.field_memberId = cursor.getLong(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102958u == hashCode) {
                    try {
                        this.field_status = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102959v == hashCode) {
                    try {
                        this.field_createTime = cursor.getLong(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102960w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102963d) {
            contentValues.put("memberUuid", Long.valueOf(this.field_memberUuid));
        }
        if (this.f102964e) {
            contentValues.put("wxGroupId", this.field_wxGroupId);
        }
        if (this.f102965f) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f102966g) {
            contentValues.put("inviteUserName", this.field_inviteUserName);
        }
        if (this.f102967h) {
            contentValues.put("memberId", Long.valueOf(this.field_memberId));
        }
        if (this.f102968i) {
            contentValues.put("status", Integer.valueOf(this.field_status));
        }
        if (this.f102969j) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseMultiTalkMember", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS MultiTalkMember ( " + f102961x.sql + ");");
        for (String add : f102952o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseMultiTalkMember", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("MultiTalkMember", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102961x, "MultiTalkMember", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseMultiTalkMember", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("MultiTalkMember", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseMultiTalkMember", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102961x;
    }

    public String[] getIndexCreateSQL() {
        return f102952o;
    }

    public StorageObserverOwner<C38607l6> getObserverOwner() {
        return f102962y;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return f102951n;
    }

    public String getTableName() {
        return f102951n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("memberUuid")) {
            this.field_memberUuid = contentValues.getAsLong("memberUuid").longValue();
            if (z) {
                this.f102963d = true;
            }
        }
        if (contentValues.containsKey("wxGroupId")) {
            this.field_wxGroupId = contentValues.getAsString("wxGroupId");
            if (z) {
                this.f102964e = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.f102965f = true;
            }
        }
        if (contentValues.containsKey("inviteUserName")) {
            this.field_inviteUserName = contentValues.getAsString("inviteUserName");
            if (z) {
                this.f102966g = true;
            }
        }
        if (contentValues.containsKey("memberId")) {
            this.field_memberId = contentValues.getAsLong("memberId").longValue();
            if (z) {
                this.f102967h = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z) {
                this.f102968i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z) {
                this.f102969j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
