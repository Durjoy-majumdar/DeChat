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

/* renamed from: xh.s7 */
public class C38660s7 extends IAutoDBItem {

    /* renamed from: A */
    public static final int f103654A = 1600383530;

    /* renamed from: B */
    public static final int f103655B = 1975266339;

    /* renamed from: C */
    public static final int f103656C = 2141634243;

    /* renamed from: D */
    public static final int f103657D = 1503253694;

    /* renamed from: E */
    public static final int f103658E = -266534175;

    /* renamed from: F */
    public static final int f103659F = 1797026611;

    /* renamed from: G */
    public static final int f103660G = 1525468599;

    /* renamed from: H */
    public static final int f103661H = -1922654984;

    /* renamed from: I */
    public static final int f103662I = 1039022764;

    /* renamed from: J */
    public static final int f103663J = -518280656;

    /* renamed from: K */
    public static final int f103664K = 844465593;

    /* renamed from: L */
    public static final int f103665L = -553589393;

    /* renamed from: M */
    public static final int f103666M = 1127144867;

    /* renamed from: N */
    public static final int f103667N = -1245715549;

    /* renamed from: P */
    public static final int f103668P = 539612541;

    /* renamed from: Q */
    public static final int f103669Q = 2101460339;

    /* renamed from: R */
    public static final int f103670R = 108705909;

    /* renamed from: S */
    public static final IAutoDBItem.MAutoDBInfo f103671S = initAutoDBInfo(C38660s7.class);

    /* renamed from: T */
    public static final StorageObserverOwner<C38660s7> f103672T = new StorageObserverOwner<>();

    /* renamed from: x */
    public static final SingleTable f103673x;

    /* renamed from: y */
    public static final String[] f103674y = new String[0];

    /* renamed from: z */
    public static final int f103675z = -265713450;

    /* renamed from: d */
    public boolean f103676d = true;

    /* renamed from: e */
    public boolean f103677e = true;

    /* renamed from: f */
    public boolean f103678f = true;
    public String field_allArticleWording;
    public String field_banReason;
    public String field_bizAccountListStr;
    public long field_cacheTime;
    public String field_decryptUserName;
    public int field_friendSubscribeCount;
    public int field_hiddenAvatar;
    public int field_hiddenButtonBeforeFocus;
    public String field_historyArticlesUrl;
    public String field_messageListStr;
    public String field_newBanReason;
    public int field_originalArticleCount;
    public String field_serviceInfoListStr;
    public int field_showRecommendArticle;
    public int field_showService;
    public int field_userRole;
    public String field_username;

    /* renamed from: g */
    public boolean f103679g = true;

    /* renamed from: h */
    public boolean f103680h = true;

    /* renamed from: i */
    public boolean f103681i = true;

    /* renamed from: j */
    public boolean f103682j = true;

    /* renamed from: n */
    public boolean f103683n = true;

    /* renamed from: o */
    public boolean f103684o = true;

    /* renamed from: p */
    public boolean f103685p = true;

    /* renamed from: q */
    public boolean f103686q = true;

    /* renamed from: r */
    public boolean f103687r = true;

    /* renamed from: s */
    public boolean f103688s = true;

    /* renamed from: t */
    public boolean f103689t = true;

    /* renamed from: u */
    public boolean f103690u = true;

    /* renamed from: v */
    public boolean f103691v = true;

    /* renamed from: w */
    public boolean f103692w = true;

    static {
        SingleTable singleTable = new SingleTable("ProfileInfo");
        f103673x = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("username", "string", singleTable.getName(), "");
        new Column("originalArticleCount", "int", singleTable.getName(), "");
        new Column("friendSubscribeCount", "int", singleTable.getName(), "");
        new Column("allArticleWording", "string", singleTable.getName(), "");
        new Column("historyArticlesUrl", "string", singleTable.getName(), "");
        new Column("userRole", "int", singleTable.getName(), "");
        new Column("banReason", "string", singleTable.getName(), "");
        new Column("showRecommendArticle", "int", singleTable.getName(), "");
        new Column("showService", "int", singleTable.getName(), "");
        new Column("messageListStr", "string", singleTable.getName(), "");
        new Column("serviceInfoListStr", "string", singleTable.getName(), "");
        new Column("bizAccountListStr", "string", singleTable.getName(), "");
        new Column("cacheTime", "long", singleTable.getName(), "");
        new Column("decryptUserName", "string", singleTable.getName(), "");
        new Column("hiddenAvatar", "int", singleTable.getName(), "");
        new Column("hiddenButtonBeforeFocus", "int", singleTable.getName(), "");
        new Column("newBanReason", "string", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[17];
        String[] strArr = new String[18];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "username";
        mAutoDBInfo.colsMap.put("username", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "username";
        mAutoDBInfo.columns[1] = "originalArticleCount";
        mAutoDBInfo.colsMap.put("originalArticleCount", "INTEGER default '1' ");
        mAutoDBInfo.columns[2] = "friendSubscribeCount";
        mAutoDBInfo.colsMap.put("friendSubscribeCount", "INTEGER default '1' ");
        mAutoDBInfo.columns[3] = "allArticleWording";
        mAutoDBInfo.colsMap.put("allArticleWording", "TEXT");
        mAutoDBInfo.columns[4] = "historyArticlesUrl";
        mAutoDBInfo.colsMap.put("historyArticlesUrl", "TEXT");
        mAutoDBInfo.columns[5] = "userRole";
        mAutoDBInfo.colsMap.put("userRole", "INTEGER default '1' ");
        mAutoDBInfo.columns[6] = "banReason";
        mAutoDBInfo.colsMap.put("banReason", "TEXT");
        mAutoDBInfo.columns[7] = "showRecommendArticle";
        mAutoDBInfo.colsMap.put("showRecommendArticle", "INTEGER default '0' ");
        mAutoDBInfo.columns[8] = "showService";
        mAutoDBInfo.colsMap.put("showService", "INTEGER default '0' ");
        mAutoDBInfo.columns[9] = "messageListStr";
        mAutoDBInfo.colsMap.put("messageListStr", "TEXT");
        mAutoDBInfo.columns[10] = "serviceInfoListStr";
        mAutoDBInfo.colsMap.put("serviceInfoListStr", "TEXT");
        mAutoDBInfo.columns[11] = "bizAccountListStr";
        mAutoDBInfo.colsMap.put("bizAccountListStr", "TEXT");
        mAutoDBInfo.columns[12] = "cacheTime";
        mAutoDBInfo.colsMap.put("cacheTime", "LONG default '0' ");
        mAutoDBInfo.columns[13] = "decryptUserName";
        mAutoDBInfo.colsMap.put("decryptUserName", "TEXT default '' ");
        mAutoDBInfo.columns[14] = "hiddenAvatar";
        mAutoDBInfo.colsMap.put("hiddenAvatar", "INTEGER default '0' ");
        mAutoDBInfo.columns[15] = "hiddenButtonBeforeFocus";
        mAutoDBInfo.colsMap.put("hiddenButtonBeforeFocus", "INTEGER default '0' ");
        mAutoDBInfo.columns[16] = "newBanReason";
        mAutoDBInfo.colsMap.put("newBanReason", "TEXT");
        mAutoDBInfo.columns[17] = "rowid";
        mAutoDBInfo.sql = " username TEXT PRIMARY KEY ,  originalArticleCount INTEGER default '1' ,  friendSubscribeCount INTEGER default '1' ,  allArticleWording TEXT,  historyArticlesUrl TEXT,  userRole INTEGER default '1' ,  banReason TEXT,  showRecommendArticle INTEGER default '0' ,  showService INTEGER default '0' ,  messageListStr TEXT,  serviceInfoListStr TEXT,  bizAccountListStr TEXT,  cacheTime LONG default '0' ,  decryptUserName TEXT default '' ,  hiddenAvatar INTEGER default '0' ,  hiddenButtonBeforeFocus INTEGER default '0' ,  newBanReason TEXT";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38660s7)) {
            return false;
        }
        C38660s7 s7Var = (C38660s7) iAutoDBItem;
        return C46238a.m51546a(this.field_username, s7Var.field_username) && C46238a.m51546a(Integer.valueOf(this.field_originalArticleCount), Integer.valueOf(s7Var.field_originalArticleCount)) && C46238a.m51546a(Integer.valueOf(this.field_friendSubscribeCount), Integer.valueOf(s7Var.field_friendSubscribeCount)) && C46238a.m51546a(this.field_allArticleWording, s7Var.field_allArticleWording) && C46238a.m51546a(this.field_historyArticlesUrl, s7Var.field_historyArticlesUrl) && C46238a.m51546a(Integer.valueOf(this.field_userRole), Integer.valueOf(s7Var.field_userRole)) && C46238a.m51546a(this.field_banReason, s7Var.field_banReason) && C46238a.m51546a(Integer.valueOf(this.field_showRecommendArticle), Integer.valueOf(s7Var.field_showRecommendArticle)) && C46238a.m51546a(Integer.valueOf(this.field_showService), Integer.valueOf(s7Var.field_showService)) && C46238a.m51546a(this.field_messageListStr, s7Var.field_messageListStr) && C46238a.m51546a(this.field_serviceInfoListStr, s7Var.field_serviceInfoListStr) && C46238a.m51546a(this.field_bizAccountListStr, s7Var.field_bizAccountListStr) && C46238a.m51546a(Long.valueOf(this.field_cacheTime), Long.valueOf(s7Var.field_cacheTime)) && C46238a.m51546a(this.field_decryptUserName, s7Var.field_decryptUserName) && C46238a.m51546a(Integer.valueOf(this.field_hiddenAvatar), Integer.valueOf(s7Var.field_hiddenAvatar)) && C46238a.m51546a(Integer.valueOf(this.field_hiddenButtonBeforeFocus), Integer.valueOf(s7Var.field_hiddenButtonBeforeFocus)) && C46238a.m51546a(this.field_newBanReason, s7Var.field_newBanReason);
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f103675z == hashCode) {
                    try {
                        this.field_username = cursor.getString(i);
                        this.f103676d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103654A == hashCode) {
                    try {
                        this.field_originalArticleCount = cursor.getInt(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103655B == hashCode) {
                    try {
                        this.field_friendSubscribeCount = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103656C == hashCode) {
                    try {
                        this.field_allArticleWording = cursor.getString(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103657D == hashCode) {
                    try {
                        this.field_historyArticlesUrl = cursor.getString(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103658E == hashCode) {
                    try {
                        this.field_userRole = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103659F == hashCode) {
                    try {
                        this.field_banReason = cursor.getString(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103660G == hashCode) {
                    try {
                        this.field_showRecommendArticle = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103661H == hashCode) {
                    try {
                        this.field_showService = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103662I == hashCode) {
                    try {
                        this.field_messageListStr = cursor.getString(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103663J == hashCode) {
                    try {
                        this.field_serviceInfoListStr = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103664K == hashCode) {
                    try {
                        this.field_bizAccountListStr = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103665L == hashCode) {
                    try {
                        this.field_cacheTime = cursor.getLong(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103666M == hashCode) {
                    try {
                        this.field_decryptUserName = cursor.getString(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103667N == hashCode) {
                    try {
                        this.field_hiddenAvatar = cursor.getInt(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103668P == hashCode) {
                    try {
                        this.field_hiddenButtonBeforeFocus = cursor.getInt(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103669Q == hashCode) {
                    try {
                        this.field_newBanReason = cursor.getString(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace("MicroMsg.SDK.BaseProfileInfo", th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f103670R == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f103676d) {
            contentValues.put("username", this.field_username);
        }
        if (this.f103677e) {
            contentValues.put("originalArticleCount", Integer.valueOf(this.field_originalArticleCount));
        }
        if (this.f103678f) {
            contentValues.put("friendSubscribeCount", Integer.valueOf(this.field_friendSubscribeCount));
        }
        if (this.f103679g) {
            contentValues.put("allArticleWording", this.field_allArticleWording);
        }
        if (this.f103680h) {
            contentValues.put("historyArticlesUrl", this.field_historyArticlesUrl);
        }
        if (this.f103681i) {
            contentValues.put("userRole", Integer.valueOf(this.field_userRole));
        }
        if (this.f103682j) {
            contentValues.put("banReason", this.field_banReason);
        }
        if (this.f103683n) {
            contentValues.put("showRecommendArticle", Integer.valueOf(this.field_showRecommendArticle));
        }
        if (this.f103684o) {
            contentValues.put("showService", Integer.valueOf(this.field_showService));
        }
        if (this.f103685p) {
            contentValues.put("messageListStr", this.field_messageListStr);
        }
        if (this.f103686q) {
            contentValues.put("serviceInfoListStr", this.field_serviceInfoListStr);
        }
        if (this.f103687r) {
            contentValues.put("bizAccountListStr", this.field_bizAccountListStr);
        }
        if (this.f103688s) {
            contentValues.put("cacheTime", Long.valueOf(this.field_cacheTime));
        }
        if (this.field_decryptUserName == null) {
            this.field_decryptUserName = "";
        }
        if (this.f103689t) {
            contentValues.put("decryptUserName", this.field_decryptUserName);
        }
        if (this.f103690u) {
            contentValues.put("hiddenAvatar", Integer.valueOf(this.field_hiddenAvatar));
        }
        if (this.f103691v) {
            contentValues.put("hiddenButtonBeforeFocus", Integer.valueOf(this.field_hiddenButtonBeforeFocus));
        }
        if (this.f103692w) {
            contentValues.put("newBanReason", this.field_newBanReason);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BaseProfileInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS ProfileInfo ( " + f103671S.sql + ");");
        for (String add : f103674y) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BaseProfileInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("ProfileInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f103671S, "ProfileInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BaseProfileInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("ProfileInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BaseProfileInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f103671S;
    }

    public String[] getIndexCreateSQL() {
        return f103674y;
    }

    public StorageObserverOwner<C38660s7> getObserverOwner() {
        return f103672T;
    }

    public Object getPrimaryKeyValue() {
        return this.field_username;
    }

    public SingleTable getTable() {
        return f103673x;
    }

    public String getTableName() {
        return f103673x.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("username")) {
            this.field_username = contentValues.getAsString("username");
            if (z) {
                this.f103676d = true;
            }
        }
        if (contentValues.containsKey("originalArticleCount")) {
            this.field_originalArticleCount = contentValues.getAsInteger("originalArticleCount").intValue();
            if (z) {
                this.f103677e = true;
            }
        }
        if (contentValues.containsKey("friendSubscribeCount")) {
            this.field_friendSubscribeCount = contentValues.getAsInteger("friendSubscribeCount").intValue();
            if (z) {
                this.f103678f = true;
            }
        }
        if (contentValues.containsKey("allArticleWording")) {
            this.field_allArticleWording = contentValues.getAsString("allArticleWording");
            if (z) {
                this.f103679g = true;
            }
        }
        if (contentValues.containsKey("historyArticlesUrl")) {
            this.field_historyArticlesUrl = contentValues.getAsString("historyArticlesUrl");
            if (z) {
                this.f103680h = true;
            }
        }
        if (contentValues.containsKey("userRole")) {
            this.field_userRole = contentValues.getAsInteger("userRole").intValue();
            if (z) {
                this.f103681i = true;
            }
        }
        if (contentValues.containsKey("banReason")) {
            this.field_banReason = contentValues.getAsString("banReason");
            if (z) {
                this.f103682j = true;
            }
        }
        if (contentValues.containsKey("showRecommendArticle")) {
            this.field_showRecommendArticle = contentValues.getAsInteger("showRecommendArticle").intValue();
            if (z) {
                this.f103683n = true;
            }
        }
        if (contentValues.containsKey("showService")) {
            this.field_showService = contentValues.getAsInteger("showService").intValue();
            if (z) {
                this.f103684o = true;
            }
        }
        if (contentValues.containsKey("messageListStr")) {
            this.field_messageListStr = contentValues.getAsString("messageListStr");
            if (z) {
                this.f103685p = true;
            }
        }
        if (contentValues.containsKey("serviceInfoListStr")) {
            this.field_serviceInfoListStr = contentValues.getAsString("serviceInfoListStr");
            if (z) {
                this.f103686q = true;
            }
        }
        if (contentValues.containsKey("bizAccountListStr")) {
            this.field_bizAccountListStr = contentValues.getAsString("bizAccountListStr");
            if (z) {
                this.f103687r = true;
            }
        }
        if (contentValues.containsKey("cacheTime")) {
            this.field_cacheTime = contentValues.getAsLong("cacheTime").longValue();
            if (z) {
                this.f103688s = true;
            }
        }
        if (contentValues.containsKey("decryptUserName")) {
            this.field_decryptUserName = contentValues.getAsString("decryptUserName");
            if (z) {
                this.f103689t = true;
            }
        }
        if (contentValues.containsKey("hiddenAvatar")) {
            this.field_hiddenAvatar = contentValues.getAsInteger("hiddenAvatar").intValue();
            if (z) {
                this.f103690u = true;
            }
        }
        if (contentValues.containsKey("hiddenButtonBeforeFocus")) {
            this.field_hiddenButtonBeforeFocus = contentValues.getAsInteger("hiddenButtonBeforeFocus").intValue();
            if (z) {
                this.f103691v = true;
            }
        }
        if (contentValues.containsKey("newBanReason")) {
            this.field_newBanReason = contentValues.getAsString("newBanReason");
            if (z) {
                this.f103692w = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
