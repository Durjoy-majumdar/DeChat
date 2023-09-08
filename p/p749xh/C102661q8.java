package p749xh;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.executor.BatchInsertExecutor;
import com.tencent.p014mm.sdk.storage.executor.DeleteExecutor;
import com.tencent.p014mm.sdk.storage.executor.InsertExecutor;
import com.tencent.p014mm.sdk.storage.executor.ReplaceExecutor;
import com.tencent.p014mm.sdk.storage.executor.UpdateExecutor;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import if0.C46238a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

/* renamed from: xh.q8 */
public class C102661q8 extends IAutoDBItem {
    public static final Column ATTRBUF;
    public static final String COL_ATTRBUF = "attrBuf";
    public static final String COL_CONTENT = "content";
    public static final String COL_CREATETIME = "createTime";
    public static final String COL_HEAD = "head";
    public static final String COL_LIKEFLAG = "likeFlag";
    public static final String COL_LOCALFLAG = "localFlag";
    public static final String COL_LOCALPRIVATE = "localPrivate";
    public static final String COL_POSTBUF = "postBuf";
    public static final String COL_PRAVITED = "pravited";
    public static final String COL_SERVEREXTFLAG = "serverExtFlag";
    public static final String COL_SNSID = "snsId";
    public static final String COL_SOURCETYPE = "sourceType";
    public static final String COL_STRINGSEQ = "stringSeq";
    public static final String COL_SUBTYPE = "subType";
    public static final String COL_TYPE = "type";
    public static final String COL_USERNAME = "userName";
    public static final String COL_WITHTA = "withTa";
    public static final String COL_WITHTAHASOTHER = "withTaHasOther";
    public static final Column CONTENT;
    public static final Column CREATETIME;
    public static final IAutoDBItem.MAutoDBInfo DB_INFO = initAutoDBInfo(C102661q8.class);
    public static final Column HEAD;
    public static final String[] INDEX_CREATE = new String[0];
    public static final Column LIKEFLAG;
    public static final Column LOCALFLAG;
    public static final Column LOCALPRIVATE;
    public static final StorageObserverOwner<C102661q8> OBSERVER_OWNER = new StorageObserverOwner<>();
    public static final Column POSTBUF;
    public static final Column PRAVITED;
    public static final Column ROWID;
    public static final Column SERVEREXTFLAG;
    public static final Column SNSID;
    public static final Column SOURCETYPE;
    public static final Column STRINGSEQ;
    public static final Column SUBTYPE;
    public static final SingleTable TABLE;
    public static final String TABLE_NAME = "SnsInfo";
    private static final String TAG_ = "MicroMsg.SDK.BaseSnsInfo";
    public static final Column TYPE;
    public static final Column USERNAME;
    public static final Column WITHTA;
    public static final Column WITHTAHASOTHER;
    private static final int attrBuf_HASHCODE = -674882878;
    private static final int content_HASHCODE = 951530617;
    private static final int createTime_HASHCODE = 1369213417;
    private static final int head_HASHCODE = 3198432;
    private static final int likeFlag_HASHCODE = 1102348195;
    private static final int localFlag_HASHCODE = -1205623433;
    private static final int localPrivate_HASHCODE = -1746354280;
    private static final int postBuf_HASHCODE = -391239245;
    private static final int pravited_HASHCODE = -1388287679;
    private static final int rowid_HASHCODE = 108705909;
    private static final int serverExtFlag_HASHCODE = -331264918;
    private static final int snsId_HASHCODE = 109594803;
    private static final int sourceType_HASHCODE = -1111431691;
    private static final int stringSeq_HASHCODE = -189292914;
    private static final int subType_HASHCODE = -1868521062;
    private static final int type_HASHCODE = 3575610;
    private static final int userName_HASHCODE = -266666762;
    private static final int withTaHasOther_HASHCODE = 748883849;
    private static final int withTa_HASHCODE = -787570221;
    private boolean __hadSetattrBuf = true;
    private boolean __hadSetcontent = true;
    private boolean __hadSetcreateTime = true;
    private boolean __hadSethead = true;
    private boolean __hadSetlikeFlag = true;
    private boolean __hadSetlocalFlag = true;
    private boolean __hadSetlocalPrivate = true;
    private boolean __hadSetpostBuf = true;
    private boolean __hadSetpravited = true;
    private boolean __hadSetserverExtFlag = true;
    private boolean __hadSetsnsId = true;
    private boolean __hadSetsourceType = true;
    private boolean __hadSetstringSeq = true;
    private boolean __hadSetsubType = true;
    private boolean __hadSettype = true;
    private boolean __hadSetuserName = true;
    private boolean __hadSetwithTa = true;
    private boolean __hadSetwithTaHasOther = true;
    public byte[] field_attrBuf;
    public byte[] field_content;
    public int field_createTime;
    public int field_head;
    public int field_likeFlag;
    public int field_localFlag;
    public int field_localPrivate;
    public byte[] field_postBuf;
    public int field_pravited;
    public int field_serverExtFlag;
    public long field_snsId;
    public int field_sourceType;
    public String field_stringSeq;
    public int field_subType;
    public int field_type;
    public String field_userName;
    public String field_withTa;
    public int field_withTaHasOther;

    /* renamed from: xh.q8$a */
    public static class C102662a {
        public C102662a() {
            new ContentValues();
        }
    }

    /* renamed from: xh.q8$b */
    public static class C102663b {
    }

    /* renamed from: xh.q8$c */
    public static class C102664c {
        public C102664c() {
            new LinkedList();
            new LinkedList();
            new LinkedList();
        }
    }

    /* renamed from: xh.q8$d */
    public static class C102665d {
        public C102665d() {
            new ContentValues();
        }
    }

    static {
        SingleTable singleTable = new SingleTable(TABLE_NAME);
        TABLE = singleTable;
        ROWID = new Column("rowid", "long", singleTable.getName(), "");
        SNSID = new Column("snsId", "long", singleTable.getName(), "");
        USERNAME = new Column("userName", "string", singleTable.getName(), "");
        LOCALFLAG = new Column("localFlag", "int", singleTable.getName(), "");
        CREATETIME = new Column("createTime", "int", singleTable.getName(), "");
        HEAD = new Column("head", "int", singleTable.getName(), "");
        LOCALPRIVATE = new Column("localPrivate", "int", singleTable.getName(), "");
        TYPE = new Column("type", "int", singleTable.getName(), "");
        SOURCETYPE = new Column("sourceType", "int", singleTable.getName(), "");
        LIKEFLAG = new Column("likeFlag", "int", singleTable.getName(), "");
        PRAVITED = new Column("pravited", "int", singleTable.getName(), "");
        STRINGSEQ = new Column("stringSeq", "string", singleTable.getName(), "");
        WITHTA = new Column(COL_WITHTA, "string", singleTable.getName(), "");
        WITHTAHASOTHER = new Column(COL_WITHTAHASOTHER, "int", singleTable.getName(), "");
        CONTENT = new Column("content", "byte[]", singleTable.getName(), "");
        ATTRBUF = new Column("attrBuf", "byte[]", singleTable.getName(), "");
        POSTBUF = new Column("postBuf", "byte[]", singleTable.getName(), "");
        SUBTYPE = new Column("subType", "int", singleTable.getName(), "");
        SERVEREXTFLAG = new Column(COL_SERVEREXTFLAG, "int", singleTable.getName(), "");
    }

    public static final BatchInsertExecutor batchInsert(List<C102661q8> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (C102661q8 next : list) {
            if (z) {
                arrayList.add(new InsertExecutor(next, true, next.createInsertEvent(), OBSERVER_OWNER, TAG_));
            } else {
                arrayList.add(new InsertExecutor(next, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_));
            }
        }
        return new BatchInsertExecutor(arrayList);
    }

    private final void buildBuff() {
    }

    public static void createTable(ISQLiteDatabase iSQLiteDatabase) {
        if (iSQLiteDatabase == null) {
            Log.m105920e(TAG_, "createTable db is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(getCreateSQLs());
        for (String add : INDEX_CREATE) {
            linkedList.add(add);
        }
        for (String str : linkedList) {
            Log.m105925i(TAG_, "createTableSql %s", str);
            iSQLiteDatabase.execSQL(TABLE_NAME, str);
        }
        for (String next : MAutoStorage.getUpdateSQLs(DB_INFO, TABLE_NAME, iSQLiteDatabase)) {
            Log.m105925i(TAG_, "updateTableSql %s", next);
            iSQLiteDatabase.execSQL(TABLE_NAME, next);
        }
        Log.m105925i(TAG_, "createTable cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static final C102662a cvBuilder() {
        return new C102662a();
    }

    public static final C102663b delete() {
        return new C102663b();
    }

    private static String getCreateSQLs() {
        return "CREATE TABLE IF NOT EXISTS SnsInfo ( " + DB_INFO.sql + ");";
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[18];
        String[] strArr = new String[19];
        mAutoDBInfo.columns = strArr;
        strArr[0] = "snsId";
        mAutoDBInfo.colsMap.put("snsId", "LONG");
        mAutoDBInfo.columns[1] = "userName";
        mAutoDBInfo.colsMap.put("userName", "TEXT");
        mAutoDBInfo.columns[2] = "localFlag";
        mAutoDBInfo.colsMap.put("localFlag", "INTEGER");
        mAutoDBInfo.columns[3] = "createTime";
        mAutoDBInfo.colsMap.put("createTime", "INTEGER");
        mAutoDBInfo.columns[4] = "head";
        mAutoDBInfo.colsMap.put("head", "INTEGER");
        mAutoDBInfo.columns[5] = "localPrivate";
        mAutoDBInfo.colsMap.put("localPrivate", "INTEGER");
        mAutoDBInfo.columns[6] = "type";
        mAutoDBInfo.colsMap.put("type", "INTEGER");
        mAutoDBInfo.columns[7] = "sourceType";
        mAutoDBInfo.colsMap.put("sourceType", "INTEGER");
        mAutoDBInfo.columns[8] = "likeFlag";
        mAutoDBInfo.colsMap.put("likeFlag", "INTEGER");
        mAutoDBInfo.columns[9] = "pravited";
        mAutoDBInfo.colsMap.put("pravited", "INTEGER");
        mAutoDBInfo.columns[10] = "stringSeq";
        mAutoDBInfo.colsMap.put("stringSeq", "TEXT");
        mAutoDBInfo.columns[11] = COL_WITHTA;
        mAutoDBInfo.colsMap.put(COL_WITHTA, "TEXT");
        mAutoDBInfo.columns[12] = COL_WITHTAHASOTHER;
        mAutoDBInfo.colsMap.put(COL_WITHTAHASOTHER, "INTEGER");
        mAutoDBInfo.columns[13] = "content";
        mAutoDBInfo.colsMap.put("content", "BLOB");
        mAutoDBInfo.columns[14] = "attrBuf";
        mAutoDBInfo.colsMap.put("attrBuf", "BLOB");
        mAutoDBInfo.columns[15] = "postBuf";
        mAutoDBInfo.colsMap.put("postBuf", "BLOB");
        mAutoDBInfo.columns[16] = "subType";
        mAutoDBInfo.colsMap.put("subType", "INTEGER");
        mAutoDBInfo.columns[17] = COL_SERVEREXTFLAG;
        mAutoDBInfo.colsMap.put(COL_SERVEREXTFLAG, "INTEGER");
        mAutoDBInfo.columns[18] = "rowid";
        mAutoDBInfo.sql = " snsId LONG,  userName TEXT,  localFlag INTEGER,  createTime INTEGER,  head INTEGER,  localPrivate INTEGER,  type INTEGER,  sourceType INTEGER,  likeFlag INTEGER,  pravited INTEGER,  stringSeq TEXT,  withTa TEXT,  withTaHasOther INTEGER,  content BLOB,  attrBuf BLOB,  postBuf BLOB,  subType INTEGER,  serverExtFlag INTEGER";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public static final InsertExecutor insert(C102661q8 q8Var, boolean z) {
        if (!z) {
            return new InsertExecutor(q8Var, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
        }
        return new InsertExecutor(q8Var, true, q8Var.createInsertEvent(), OBSERVER_OWNER, TAG_);
    }

    public static final InsertExecutor insertOrThrow(C102661q8 q8Var, boolean z) {
        if (!z) {
            return new InsertExecutor(q8Var, false, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
        }
        return new InsertExecutor(q8Var, false, q8Var.createInsertEvent(), OBSERVER_OWNER, TAG_);
    }

    public static final void observe(C0125s sVar, IStorageObserver<? extends C102661q8> iStorageObserver) {
        OBSERVER_OWNER.observe(sVar, iStorageObserver);
    }

    private final void parseBuff() {
    }

    public static final void removeObserve(IStorageObserver<? extends C102661q8> iStorageObserver) {
        OBSERVER_OWNER.removeObserver(iStorageObserver);
    }

    public static final ReplaceExecutor replace(C102661q8 q8Var, boolean z) {
        return z ? new ReplaceExecutor(q8Var, q8Var.createReplaceEvent(), OBSERVER_OWNER, TAG_) : new ReplaceExecutor(q8Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public static final C102664c select() {
        return new C102664c();
    }

    public static final SelectSql selectByCreateTime(int i) {
        return TABLE.selectAll().where(CREATETIME.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByCreateTimeList(List<Integer> list) {
        return TABLE.selectAll().where(CREATETIME.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByHead(int i) {
        return TABLE.selectAll().where(HEAD.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByHeadList(List<Integer> list) {
        return TABLE.selectAll().where(HEAD.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByLikeFlag(int i) {
        return TABLE.selectAll().where(LIKEFLAG.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByLikeFlagList(List<Integer> list) {
        return TABLE.selectAll().where(LIKEFLAG.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByLocalFlag(int i) {
        return TABLE.selectAll().where(LOCALFLAG.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByLocalFlagList(List<Integer> list) {
        return TABLE.selectAll().where(LOCALFLAG.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByLocalPrivate(int i) {
        return TABLE.selectAll().where(LOCALPRIVATE.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByLocalPrivateList(List<Integer> list) {
        return TABLE.selectAll().where(LOCALPRIVATE.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByPravited(int i) {
        return TABLE.selectAll().where(PRAVITED.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByPravitedList(List<Integer> list) {
        return TABLE.selectAll().where(PRAVITED.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByServerExtFlag(int i) {
        return TABLE.selectAll().where(SERVEREXTFLAG.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByServerExtFlagList(List<Integer> list) {
        return TABLE.selectAll().where(SERVEREXTFLAG.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectBySnsId(long j) {
        return TABLE.selectAll().where(SNSID.equal((Number) Long.valueOf(j))).log(TAG_).build();
    }

    public static final SelectSql selectBySnsIdList(List<Long> list) {
        return TABLE.selectAll().where(SNSID.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectBySourceType(int i) {
        return TABLE.selectAll().where(SOURCETYPE.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectBySourceTypeList(List<Integer> list) {
        return TABLE.selectAll().where(SOURCETYPE.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByStringSeq(String str) {
        return TABLE.selectAll().where(STRINGSEQ.equal(str)).log(TAG_).build();
    }

    public static final SelectSql selectByStringSeqList(List<String> list) {
        return TABLE.selectAll().where(STRINGSEQ.inString(list)).log(TAG_).build();
    }

    public static final SelectSql selectBySubType(int i) {
        return TABLE.selectAll().where(SUBTYPE.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectBySubTypeList(List<Integer> list) {
        return TABLE.selectAll().where(SUBTYPE.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByType(int i) {
        return TABLE.selectAll().where(TYPE.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByTypeList(List<Integer> list) {
        return TABLE.selectAll().where(TYPE.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByUserName(String str) {
        return TABLE.selectAll().where(USERNAME.equal(str)).log(TAG_).build();
    }

    public static final SelectSql selectByUserNameList(List<String> list) {
        return TABLE.selectAll().where(USERNAME.inString(list)).log(TAG_).build();
    }

    public static final SelectSql selectByWithTa(String str) {
        return TABLE.selectAll().where(WITHTA.equal(str)).log(TAG_).build();
    }

    public static final SelectSql selectByWithTaHasOther(int i) {
        return TABLE.selectAll().where(WITHTAHASOTHER.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByWithTaHasOtherList(List<Integer> list) {
        return TABLE.selectAll().where(WITHTAHASOTHER.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByWithTaList(List<String> list) {
        return TABLE.selectAll().where(WITHTA.inString(list)).log(TAG_).build();
    }

    public static final C102665d update() {
        return new C102665d();
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102661q8)) {
            return false;
        }
        C102661q8 q8Var = (C102661q8) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_snsId), Long.valueOf(q8Var.field_snsId)) && C46238a.m51546a(this.field_userName, q8Var.field_userName) && C46238a.m51546a(Integer.valueOf(this.field_localFlag), Integer.valueOf(q8Var.field_localFlag)) && C46238a.m51546a(Integer.valueOf(this.field_createTime), Integer.valueOf(q8Var.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_head), Integer.valueOf(q8Var.field_head)) && C46238a.m51546a(Integer.valueOf(this.field_localPrivate), Integer.valueOf(q8Var.field_localPrivate)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(q8Var.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_sourceType), Integer.valueOf(q8Var.field_sourceType)) && C46238a.m51546a(Integer.valueOf(this.field_likeFlag), Integer.valueOf(q8Var.field_likeFlag)) && C46238a.m51546a(Integer.valueOf(this.field_pravited), Integer.valueOf(q8Var.field_pravited)) && C46238a.m51546a(this.field_stringSeq, q8Var.field_stringSeq) && C46238a.m51546a(this.field_withTa, q8Var.field_withTa) && C46238a.m51546a(Integer.valueOf(this.field_withTaHasOther), Integer.valueOf(q8Var.field_withTaHasOther)) && C46238a.m51546a(this.field_content, q8Var.field_content) && C46238a.m51546a(this.field_attrBuf, q8Var.field_attrBuf) && C46238a.m51546a(this.field_postBuf, q8Var.field_postBuf) && C46238a.m51546a(Integer.valueOf(this.field_subType), Integer.valueOf(q8Var.field_subType)) && C46238a.m51546a(Integer.valueOf(this.field_serverExtFlag), Integer.valueOf(q8Var.field_serverExtFlag));
    }

    public void convertFrom(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (snsId_HASHCODE == hashCode) {
                    try {
                        this.field_snsId = cursor.getLong(i);
                    } catch (Throwable th) {
                        Log.printErrStackTrace(TAG_, th, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (userName_HASHCODE == hashCode) {
                    try {
                        this.field_userName = cursor.getString(i);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace(TAG_, th4, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (localFlag_HASHCODE == hashCode) {
                    try {
                        this.field_localFlag = cursor.getInt(i);
                    } catch (Throwable th5) {
                        Log.printErrStackTrace(TAG_, th5, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (createTime_HASHCODE == hashCode) {
                    try {
                        this.field_createTime = cursor.getInt(i);
                    } catch (Throwable th6) {
                        Log.printErrStackTrace(TAG_, th6, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (head_HASHCODE == hashCode) {
                    try {
                        this.field_head = cursor.getInt(i);
                    } catch (Throwable th7) {
                        Log.printErrStackTrace(TAG_, th7, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (localPrivate_HASHCODE == hashCode) {
                    try {
                        this.field_localPrivate = cursor.getInt(i);
                    } catch (Throwable th8) {
                        Log.printErrStackTrace(TAG_, th8, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (type_HASHCODE == hashCode) {
                    try {
                        this.field_type = cursor.getInt(i);
                    } catch (Throwable th9) {
                        Log.printErrStackTrace(TAG_, th9, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (sourceType_HASHCODE == hashCode) {
                    try {
                        this.field_sourceType = cursor.getInt(i);
                    } catch (Throwable th10) {
                        Log.printErrStackTrace(TAG_, th10, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (likeFlag_HASHCODE == hashCode) {
                    try {
                        this.field_likeFlag = cursor.getInt(i);
                    } catch (Throwable th11) {
                        Log.printErrStackTrace(TAG_, th11, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (pravited_HASHCODE == hashCode) {
                    try {
                        this.field_pravited = cursor.getInt(i);
                    } catch (Throwable th12) {
                        Log.printErrStackTrace(TAG_, th12, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (stringSeq_HASHCODE == hashCode) {
                    try {
                        this.field_stringSeq = cursor.getString(i);
                    } catch (Throwable th13) {
                        Log.printErrStackTrace(TAG_, th13, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (withTa_HASHCODE == hashCode) {
                    try {
                        this.field_withTa = cursor.getString(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace(TAG_, th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (withTaHasOther_HASHCODE == hashCode) {
                    try {
                        this.field_withTaHasOther = cursor.getInt(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace(TAG_, th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (content_HASHCODE == hashCode) {
                    try {
                        this.field_content = cursor.getBlob(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace(TAG_, th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (attrBuf_HASHCODE == hashCode) {
                    try {
                        this.field_attrBuf = cursor.getBlob(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace(TAG_, th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (postBuf_HASHCODE == hashCode) {
                    try {
                        this.field_postBuf = cursor.getBlob(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace(TAG_, th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (subType_HASHCODE == hashCode) {
                    try {
                        this.field_subType = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace(TAG_, th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (serverExtFlag_HASHCODE == hashCode) {
                    try {
                        this.field_serverExtFlag = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace(TAG_, th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (rowid_HASHCODE == hashCode) {
                    this.systemRowid = cursor.getLong(i);
                }
            }
        }
    }

    public ContentValues convertTo() {
        buildBuff();
        ContentValues contentValues = new ContentValues();
        if (this.__hadSetsnsId) {
            contentValues.put("snsId", Long.valueOf(this.field_snsId));
        }
        if (this.__hadSetuserName) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.__hadSetlocalFlag) {
            contentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
        }
        if (this.__hadSetcreateTime) {
            contentValues.put("createTime", Integer.valueOf(this.field_createTime));
        }
        if (this.__hadSethead) {
            contentValues.put("head", Integer.valueOf(this.field_head));
        }
        if (this.__hadSetlocalPrivate) {
            contentValues.put("localPrivate", Integer.valueOf(this.field_localPrivate));
        }
        if (this.__hadSettype) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.__hadSetsourceType) {
            contentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
        }
        if (this.__hadSetlikeFlag) {
            contentValues.put("likeFlag", Integer.valueOf(this.field_likeFlag));
        }
        if (this.__hadSetpravited) {
            contentValues.put("pravited", Integer.valueOf(this.field_pravited));
        }
        if (this.__hadSetstringSeq) {
            contentValues.put("stringSeq", this.field_stringSeq);
        }
        if (this.__hadSetwithTa) {
            contentValues.put(COL_WITHTA, this.field_withTa);
        }
        if (this.__hadSetwithTaHasOther) {
            contentValues.put(COL_WITHTAHASOTHER, Integer.valueOf(this.field_withTaHasOther));
        }
        if (this.__hadSetcontent) {
            contentValues.put("content", this.field_content);
        }
        if (this.__hadSetattrBuf) {
            contentValues.put("attrBuf", this.field_attrBuf);
        }
        if (this.__hadSetpostBuf) {
            contentValues.put("postBuf", this.field_postBuf);
        }
        if (this.__hadSetsubType) {
            contentValues.put("subType", Integer.valueOf(this.field_subType));
        }
        if (this.__hadSetserverExtFlag) {
            contentValues.put(COL_SERVEREXTFLAG, Integer.valueOf(this.field_serverExtFlag));
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public StorageObserverEvent<? extends C102661q8> createDeleteEvent() {
        StorageObserverEvent<? extends C102661q8> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getDELETE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public StorageObserverEvent<? extends C102661q8> createInsertEvent() {
        StorageObserverEvent<? extends C102661q8> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getINSERT(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        createTable(iSQLiteDatabase);
    }

    public StorageObserverEvent<? extends C102661q8> createReplaceEvent() {
        StorageObserverEvent<? extends C102661q8> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getUPDATE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public StorageObserverEvent<? extends C102661q8> createUpdateEvent() {
        StorageObserverEvent<? extends C102661q8> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getUPDATE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public int deleteFromDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return delete(this, z).execute(iSQLiteDatabase);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return DB_INFO;
    }

    public String[] getIndexCreateSQL() {
        return INDEX_CREATE;
    }

    public StorageObserverOwner<C102661q8> getObserverOwner() {
        return OBSERVER_OWNER;
    }

    public Object getPrimaryKeyValue() {
        return Long.valueOf(this.systemRowid);
    }

    public SingleTable getTable() {
        return TABLE;
    }

    public String getTableName() {
        return TABLE.getName();
    }

    public long insertOrThrowToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return insertOrThrow(this, z).execute(iSQLiteDatabase);
    }

    public long insertToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return insert(this, z).execute(iSQLiteDatabase);
    }

    public long replaceToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return replace(this, z).execute(iSQLiteDatabase);
    }

    public void reset() {
    }

    public int updateToDB(ISQLiteDatabase iSQLiteDatabase, boolean z) {
        return update(this, z).execute(iSQLiteDatabase);
    }

    public static final DeleteExecutor delete(C102661q8 q8Var, boolean z) {
        if (z) {
            return new DeleteExecutor(q8Var, q8Var.createDeleteEvent(), OBSERVER_OWNER, TAG_);
        }
        return new DeleteExecutor(q8Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public static final UpdateExecutor update(C102661q8 q8Var, boolean z) {
        if (z) {
            return new UpdateExecutor(q8Var, q8Var.createUpdateEvent(), OBSERVER_OWNER, TAG_);
        }
        return new UpdateExecutor(q8Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public SelectSql selectByCreateTime() {
        return selectByCreateTime(this.field_createTime);
    }

    public SelectSql selectByHead() {
        return selectByHead(this.field_head);
    }

    public SelectSql selectByLikeFlag() {
        return selectByLikeFlag(this.field_likeFlag);
    }

    public SelectSql selectByLocalFlag() {
        return selectByLocalFlag(this.field_localFlag);
    }

    public SelectSql selectByLocalPrivate() {
        return selectByLocalPrivate(this.field_localPrivate);
    }

    public SelectSql selectByPravited() {
        return selectByPravited(this.field_pravited);
    }

    public SelectSql selectByServerExtFlag() {
        return selectByServerExtFlag(this.field_serverExtFlag);
    }

    public SelectSql selectBySnsId() {
        return selectBySnsId(this.field_snsId);
    }

    public SelectSql selectBySourceType() {
        return selectBySourceType(this.field_sourceType);
    }

    public SelectSql selectByStringSeq() {
        return selectByStringSeq(this.field_stringSeq);
    }

    public SelectSql selectBySubType() {
        return selectBySubType(this.field_subType);
    }

    public SelectSql selectByType() {
        return selectByType(this.field_type);
    }

    public SelectSql selectByUserName() {
        return selectByUserName(this.field_userName);
    }

    public SelectSql selectByWithTa() {
        return selectByWithTa(this.field_withTa);
    }

    public SelectSql selectByWithTaHasOther() {
        return selectByWithTaHasOther(this.field_withTaHasOther);
    }

    public void convertFrom(ContentValues contentValues, boolean z) {
        if (contentValues.containsKey("snsId")) {
            this.field_snsId = contentValues.getAsLong("snsId").longValue();
            if (z) {
                this.__hadSetsnsId = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z) {
                this.__hadSetuserName = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z) {
                this.__hadSetlocalFlag = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z) {
                this.__hadSetcreateTime = true;
            }
        }
        if (contentValues.containsKey("head")) {
            this.field_head = contentValues.getAsInteger("head").intValue();
            if (z) {
                this.__hadSethead = true;
            }
        }
        if (contentValues.containsKey("localPrivate")) {
            this.field_localPrivate = contentValues.getAsInteger("localPrivate").intValue();
            if (z) {
                this.__hadSetlocalPrivate = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z) {
                this.__hadSettype = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.field_sourceType = contentValues.getAsInteger("sourceType").intValue();
            if (z) {
                this.__hadSetsourceType = true;
            }
        }
        if (contentValues.containsKey("likeFlag")) {
            this.field_likeFlag = contentValues.getAsInteger("likeFlag").intValue();
            if (z) {
                this.__hadSetlikeFlag = true;
            }
        }
        if (contentValues.containsKey("pravited")) {
            this.field_pravited = contentValues.getAsInteger("pravited").intValue();
            if (z) {
                this.__hadSetpravited = true;
            }
        }
        if (contentValues.containsKey("stringSeq")) {
            this.field_stringSeq = contentValues.getAsString("stringSeq");
            if (z) {
                this.__hadSetstringSeq = true;
            }
        }
        if (contentValues.containsKey(COL_WITHTA)) {
            this.field_withTa = contentValues.getAsString(COL_WITHTA);
            if (z) {
                this.__hadSetwithTa = true;
            }
        }
        if (contentValues.containsKey(COL_WITHTAHASOTHER)) {
            this.field_withTaHasOther = contentValues.getAsInteger(COL_WITHTAHASOTHER).intValue();
            if (z) {
                this.__hadSetwithTaHasOther = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsByteArray("content");
            if (z) {
                this.__hadSetcontent = true;
            }
        }
        if (contentValues.containsKey("attrBuf")) {
            this.field_attrBuf = contentValues.getAsByteArray("attrBuf");
            if (z) {
                this.__hadSetattrBuf = true;
            }
        }
        if (contentValues.containsKey("postBuf")) {
            this.field_postBuf = contentValues.getAsByteArray("postBuf");
            if (z) {
                this.__hadSetpostBuf = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z) {
                this.__hadSetsubType = true;
            }
        }
        if (contentValues.containsKey(COL_SERVEREXTFLAG)) {
            this.field_serverExtFlag = contentValues.getAsInteger(COL_SERVEREXTFLAG).intValue();
            if (z) {
                this.__hadSetserverExtFlag = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
