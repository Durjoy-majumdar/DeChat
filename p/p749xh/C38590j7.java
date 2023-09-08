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
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import junit.framework.Assert;

/* renamed from: xh.j7 */
public class C38590j7 extends IAutoDBItem {

    /* renamed from: n */
    public static final SingleTable f102653n;

    /* renamed from: o */
    public static final String[] f102654o = new String[0];

    /* renamed from: p */
    public static final int f102655p = 1412694560;

    /* renamed from: q */
    public static final int f102656q = 843870474;

    /* renamed from: r */
    public static final int f102657r = -735721945;

    /* renamed from: s */
    public static final int f102658s = 476696869;

    /* renamed from: t */
    public static final int f102659t = 898934463;

    /* renamed from: u */
    public static final int f102660u = 1262717208;

    /* renamed from: v */
    public static final int f102661v = -1333948289;

    /* renamed from: w */
    public static final int f102662w = 108705909;

    /* renamed from: x */
    public static final IAutoDBItem.MAutoDBInfo f102663x = initAutoDBInfo(C38590j7.class);

    /* renamed from: y */
    public static final StorageObserverOwner<C38590j7> f102664y = new StorageObserverOwner<>();

    /* renamed from: d */
    public boolean f102665d = true;

    /* renamed from: e */
    public boolean f102666e = true;

    /* renamed from: f */
    public boolean f102667f = true;
    public int field_fileCacheComplete;
    public String field_fileName;
    public byte[] field_indexBitData;
    public String field_musicId;
    public String field_musicUrl;
    public String field_pieceFileMIMEType;
    public int field_removeDirtyBit;

    /* renamed from: g */
    public boolean f102668g = true;

    /* renamed from: h */
    public boolean f102669h = true;

    /* renamed from: i */
    public boolean f102670i = true;

    /* renamed from: j */
    public boolean f102671j = true;

    static {
        SingleTable singleTable = new SingleTable("PieceMusicInfo");
        f102653n = singleTable;
        new Column("rowid", "long", singleTable.getName(), "");
        new Column("musicId", "string", singleTable.getName(), "");
        new Column("musicUrl", "string", singleTable.getName(), "");
        new Column(DownloadInfo.FILENAME, "string", singleTable.getName(), "");
        new Column("indexBitData", "byte[]", singleTable.getName(), "");
        new Column("fileCacheComplete", "int", singleTable.getName(), "");
        new Column("pieceFileMIMEType", "string", singleTable.getName(), "");
        new Column("removeDirtyBit", "int", singleTable.getName(), "");
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[7];
        String[] strArr = new String[8];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "musicId";
        mAutoDBInfo.colsMap.put("musicId", "TEXT PRIMARY KEY ");
        mAutoDBInfo.primaryKey = "musicId";
        mAutoDBInfo.columns[1] = "musicUrl";
        mAutoDBInfo.colsMap.put("musicUrl", "TEXT");
        mAutoDBInfo.columns[2] = DownloadInfo.FILENAME;
        mAutoDBInfo.colsMap.put(DownloadInfo.FILENAME, "TEXT");
        mAutoDBInfo.columns[3] = "indexBitData";
        mAutoDBInfo.colsMap.put("indexBitData", "BLOB");
        mAutoDBInfo.columns[4] = "fileCacheComplete";
        mAutoDBInfo.colsMap.put("fileCacheComplete", "INTEGER");
        mAutoDBInfo.columns[5] = "pieceFileMIMEType";
        mAutoDBInfo.colsMap.put("pieceFileMIMEType", "TEXT");
        mAutoDBInfo.columns[6] = "removeDirtyBit";
        mAutoDBInfo.colsMap.put("removeDirtyBit", "INTEGER");
        mAutoDBInfo.columns[7] = "rowid";
        mAutoDBInfo.sql = " musicId TEXT PRIMARY KEY ,  musicUrl TEXT,  fileName TEXT,  indexBitData BLOB,  fileCacheComplete INTEGER,  pieceFileMIMEType TEXT,  removeDirtyBit INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C38590j7)) {
            return false;
        }
        C38590j7 j7Var = (C38590j7) iAutoDBItem;
        return C46238a.m51546a(this.field_musicId, j7Var.field_musicId) && C46238a.m51546a(this.field_musicUrl, j7Var.field_musicUrl) && C46238a.m51546a(this.field_fileName, j7Var.field_fileName) && C46238a.m51546a(this.field_indexBitData, j7Var.field_indexBitData) && C46238a.m51546a(Integer.valueOf(this.field_fileCacheComplete), Integer.valueOf(j7Var.field_fileCacheComplete)) && C46238a.m51546a(this.field_pieceFileMIMEType, j7Var.field_pieceFileMIMEType) && C46238a.m51546a(Integer.valueOf(this.field_removeDirtyBit), Integer.valueOf(j7Var.field_removeDirtyBit));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (f102655p == hashCode) {
                    try {
                        this.field_musicId = cursor.getString(i);
                        this.f102665d = true;
                    } catch (Throwable th) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102656q == hashCode) {
                    try {
                        this.field_musicUrl = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102657r == hashCode) {
                    try {
                        this.field_fileName = cursor.getString(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102658s == hashCode) {
                    try {
                        this.field_indexBitData = cursor.getBlob(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102659t == hashCode) {
                    try {
                        this.field_fileCacheComplete = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102660u == hashCode) {
                    try {
                        this.field_pieceFileMIMEType = cursor.getString(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102661v == hashCode) {
                    try {
                        this.field_removeDirtyBit = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace("MicroMsg.SDK.BasePieceMusicInfo", th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (f102662w == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues contentValues = new ContentValues();
        if (this.f102665d) {
            contentValues.put("musicId", this.field_musicId);
        }
        if (this.f102666e) {
            contentValues.put("musicUrl", this.field_musicUrl);
        }
        if (this.f102667f) {
            contentValues.put(DownloadInfo.FILENAME, this.field_fileName);
        }
        if (this.f102668g) {
            contentValues.put("indexBitData", this.field_indexBitData);
        }
        if (this.f102669h) {
            contentValues.put("fileCacheComplete", Integer.valueOf(this.field_fileCacheComplete));
        }
        if (this.f102670i) {
            contentValues.put("pieceFileMIMEType", this.field_pieceFileMIMEType);
        }
        if (this.f102671j) {
            contentValues.put("removeDirtyBit", Integer.valueOf(this.field_removeDirtyBit));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e("MicroMsg.SDK.BasePieceMusicInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("CREATE TABLE IF NOT EXISTS PieceMusicInfo ( " + f102663x.sql + ");");
        for (String add : f102654o) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i("MicroMsg.SDK.BasePieceMusicInfo", "createTableSql %s", str);
            iSQLiteDatabase.execSQL("PieceMusicInfo", str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(f102663x, "PieceMusicInfo", iSQLiteDatabase)) {
            Log.m105925i("MicroMsg.SDK.BasePieceMusicInfo", "updateTableSql %s", next);
            iSQLiteDatabase.execSQL("PieceMusicInfo", next);
        }
        Log.m105925i("MicroMsg.SDK.BasePieceMusicInfo", "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f102663x;
    }

    public String[] getIndexCreateSQL() {
        return f102654o;
    }

    public StorageObserverOwner<C38590j7> getObserverOwner() {
        return f102664y;
    }

    public Object getPrimaryKeyValue() {
        return this.field_musicId;
    }

    public SingleTable getTable() {
        return f102653n;
    }

    public String getTableName() {
        return f102653n.getName();
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("musicId")) {
            this.field_musicId = contentValues.getAsString("musicId");
            if (z) {
                this.f102665d = true;
            }
        }
        if (contentValues.containsKey("musicUrl")) {
            this.field_musicUrl = contentValues.getAsString("musicUrl");
            if (z) {
                this.f102666e = true;
            }
        }
        if (contentValues.containsKey(DownloadInfo.FILENAME)) {
            this.field_fileName = contentValues.getAsString(DownloadInfo.FILENAME);
            if (z) {
                this.f102667f = true;
            }
        }
        if (contentValues.containsKey("indexBitData")) {
            this.field_indexBitData = contentValues.getAsByteArray("indexBitData");
            if (z) {
                this.f102668g = true;
            }
        }
        if (contentValues.containsKey("fileCacheComplete")) {
            this.field_fileCacheComplete = contentValues.getAsInteger("fileCacheComplete").intValue();
            if (z) {
                this.f102669h = true;
            }
        }
        if (contentValues.containsKey("pieceFileMIMEType")) {
            this.field_pieceFileMIMEType = contentValues.getAsString("pieceFileMIMEType");
            if (z) {
                this.f102670i = true;
            }
        }
        if (contentValues.containsKey("removeDirtyBit")) {
            this.field_removeDirtyBit = contentValues.getAsInteger("removeDirtyBit").intValue();
            if (z) {
                this.f102671j = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
