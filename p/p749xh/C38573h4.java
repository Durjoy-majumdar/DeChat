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
import yy1.C53650l;

/* renamed from: xh.h4 */
public class C38573h4 extends IAutoDBItem {

    /* renamed from: A */
    public static final StorageObserverOwner<C38573h4> f102430A = new StorageObserverOwner<>();

    /* renamed from: o */
    public static final SingleTable f102431o;

    /* renamed from: p */
    public static final String[] f102432p = new String[0];

    /* renamed from: q */
    public static final int f102433q = -265713450;

    /* renamed from: r */
    public static final int f102434r = 866168583;

    /* renamed from: s */
    public static final int f102435s = 70690926;

    /* renamed from: t */
    public static final int f102436t = -428647082;

    /* renamed from: u */
    public static final int f102437u = 113766;

    /* renamed from: v */
    public static final int f102438v = 114586;

    /* renamed from: w */
    public static final int f102439w = -255654404;

    /* renamed from: x */
    public static final int f102440x = -295931082;

    /* renamed from: y */
    public static final int f102441y = 108705909;

    /* renamed from: z */
    public static final IAutoDBItem.MAutoDBInfo f102442z = initAutoDBInfo(C38573h4.class);

    /* renamed from: d */
    public boolean f102443d = true;

    /* renamed from: e */
    public boolean f102444e = true;

    /* renamed from: f */
    public boolean f102445f = true;
    public int field_accountType;
    public String field_avatarURL;
    public C53650l field_jumpInfo;
    public String field_nickname;
    public int field_sex;
    public String field_tag;
    public long field_updateTime;
    public String field_username;

    /* renamed from: g */
    public boolean f102446g = true;

    /* renamed from: h */
    public boolean f102447h = true;

    /* renamed from: i */
    public boolean f102448i = true;

    /* renamed from: j */
    public boolean f102449j = true;

    /* renamed from: n */
    public boolean f102450n = true;

    static {
        SingleTable singleTable = new SingleTable("GameLifeContact");
        f102431o = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("accountType", "int", singleTable.getName(), "");
        new Column("nickname", "string", singleTable.getName(), "");
        new Column("avatarURL", "string", singleTable.getName(), "");
        new Column("sex", "int", singleTable.getName(), "");
        new Column("tag", "string", singleTable.getName(), "");
        new Column("jumpInfo", TPReportKeys.Common.COMMON_PROTO, singleTable.getName(), "com.tencent.mm.plugin.gamelife.autogen.JumpInfo");
        new Column(C66261f3.COL_UPDATETIME, "long", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[8];
        String[] strArr = new String[9];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT default ''  PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "accountType";
        mAutoDBInfo.colsMap.put("accountType", "INTEGER default '0' ");
        mAutoDBInfo.columns[2] = "nickname";
        mAutoDBInfo.colsMap.put("nickname", "TEXT default '' ");
        mAutoDBInfo.columns[3] = "avatarURL";
        mAutoDBInfo.colsMap.put("avatarURL", "TEXT default '' ");
        mAutoDBInfo.columns[4] = "sex";
        mAutoDBInfo.colsMap.put("sex", "INTEGER default '0' ");
        mAutoDBInfo.columns[5] = "tag";
        mAutoDBInfo.colsMap.put("tag", "TEXT default '' ");
        mAutoDBInfo.columns[6] = "jumpInfo";
        mAutoDBInfo.colsMap.put("jumpInfo", "BLOB");
        mAutoDBInfo.columns[7] = C66261f3.COL_UPDATETIME;
        mAutoDBInfo.colsMap.put(C66261f3.COL_UPDATETIME, "LONG");
        mAutoDBInfo.columns[8] = "rowid";
        mAutoDBInfo.sql = " username TEXT default ''  PRIMARY KEY ,  accountType INTEGER default '0' ,  nickname TEXT default '' ,  avatarURL TEXT default '' ,  sex INTEGER default '0' ,  tag TEXT default '' ,  jumpInfo BLOB,  updateTime LONG";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38573h4)) {
            return false;
        }
        C38573h4 h4Var = (C38573h4) iAutoDBItem;
        return C46238a.m51546a(this.field_username, h4Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_accountType), Integer.valueOf(h4Var.field_accountType)) && C46238a.m51546a(this.field_nickname, h4Var.field_nickname) && C46238a.m51546a(this.field_avatarURL, h4Var.field_avatarURL) && C46238a.m51546a(Integer.valueOf(this.field_sex), Integer.valueOf(h4Var.field_sex)) && C46238a.m51546a(this.field_tag, h4Var.field_tag) && C46238a.m51546a(this.field_jumpInfo, h4Var.field_jumpInfo) && C46238a.m51546a(Long.valueOf(this.field_updateTime), Long.valueOf(h4Var.field_updateTime));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102433q == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f102443d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102434r == hashCode) {
                    try {
                        this.field_accountType = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102435s == hashCode) {
                    try {
                        this.field_nickname = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102436t == hashCode) {
                    try {
                        this.field_avatarURL = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102437u == hashCode) {
                    try {
                        this.field_sex = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102438v == hashCode) {
                    try {
                        this.field_tag = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102439w == hashCode) {
                    try {
                        byte[] blob = cursor.getBlob(i);
                        if (blob != null && blob.length > 0) {
                            this.field_jumpInfo = (C53650l) new C53650l().parseFrom(blob);
                        }
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102440x == hashCode) {
                    try {
                        this.field_updateTime = cursor.getLong(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102441y == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        C53650l lVar;
        ContentValues contentValues = new ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f102443d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f102444e) {
            contentValues.put("accountType", Integer.valueOf(this.field_accountType));
        }
        if (this.field_nickname == null) {
            this.field_nickname = "";
        }
        if (this.f102445f) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.field_avatarURL == null) {
            this.field_avatarURL = "";
        }
        if (this.f102446g) {
            contentValues.put("avatarURL", this.field_avatarURL);
        }
        if (this.f102447h) {
            contentValues.put("sex", Integer.valueOf(this.field_sex));
        }
        if (this.field_tag == null) {
            this.field_tag = "";
        }
        if (this.f102448i) {
            contentValues.put("tag", this.field_tag);
        }
        if (this.f102449j && (lVar = this.field_jumpInfo) != null) {
            try {
                contentValues.put("jumpInfo", lVar.toByteArray());
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseGameLifeContact", e.getMessage());
            }
        }
        if (this.f102450n) {
            contentValues.put(C66261f3.COL_UPDATETIME, Long.valueOf(this.field_updateTime));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseGameLifeContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS GameLifeContact ( " + f102442z.sql + ");");
        for (String add : f102432p) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseGameLifeContact", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("GameLifeContact", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102442z, "GameLifeContact", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseGameLifeContact", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("GameLifeContact", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseGameLifeContact", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102442z;
    }

    public String[] getIndexCreateSQL() {
        return f102432p;
    }

    public StorageObserverOwner<C38573h4> getObserverOwner() {
        return f102430A;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f102431o;
    }

    public String getTableName() {
        return f102431o.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f102443d = true;
            }
        }
        if (contentValues.containsKey("accountType")) {
            this.field_accountType = contentValues.getAsInteger("accountType").intValue();
            if (z) {
                this.f102444e = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z) {
                this.f102445f = true;
            }
        }
        if (contentValues.containsKey("avatarURL")) {
            this.field_avatarURL = contentValues.getAsString("avatarURL");
            if (z) {
                this.f102446g = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.field_sex = contentValues.getAsInteger("sex").intValue();
            if (z) {
                this.f102447h = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.field_tag = contentValues.getAsString("tag");
            if (z) {
                this.f102448i = true;
            }
        }
        if (contentValues.containsKey("jumpInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("jumpInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_jumpInfo = (C53650l) new C53650l().parseFrom(asByteArray);
                    if (z) {
                        this.f102449j = true;
                    }
                }
            } catch (IOException e) {
                Log.m105920e("MicroMsg.SDK.BaseGameLifeContact", e.getMessage());
            }
        }
        if (contentValues.containsKey(C66261f3.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(C66261f3.COL_UPDATETIME).longValue();
            if (z) {
                this.f102450n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
