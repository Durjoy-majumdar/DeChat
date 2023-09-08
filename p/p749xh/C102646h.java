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

/* renamed from: xh.h */
public class C102646h extends IAutoDBItem {
    public static final Column ADINFO;
    public static final Column ADXML;
    public static final Column ATADINFO;
    public static final Column ATTRBUF;
    public static final String COL_ADINFO = "adinfo";
    public static final String COL_ADXML = "adxml";
    public static final String COL_ATADINFO = "atAdinfo";
    public static final String COL_ATTRBUF = "attrBuf";
    public static final String COL_CONTENT = "content";
    public static final String COL_CREATEADTIME = "createAdTime";
    public static final String COL_CREATETIME = "createTime";
    public static final String COL_EXPOSURECOUNT = "exposureCount";
    public static final String COL_EXPOSURETIME = "exposureTime";
    public static final String COL_FIRSTCONTROLTIME = "firstControlTime";
    public static final String COL_HEAD = "head";
    public static final String COL_LIKEFLAG = "likeFlag";
    public static final String COL_LOCALFLAG = "localFlag";
    public static final String COL_LOCALPRIVATE = "localPrivate";
    public static final String COL_POSTBUF = "postBuf";
    public static final String COL_PRAVITED = "pravited";
    public static final String COL_RECXML = "recxml";
    public static final String COL_REMINDINFOGROUP = "remindInfoGroup";
    public static final String COL_SNSID = "snsId";
    public static final String COL_SOURCETYPE = "sourceType";
    public static final String COL_STRINGSEQ = "stringSeq";
    public static final String COL_SUBTYPE = "subType";
    public static final String COL_TYPE = "type";
    public static final String COL_USERNAME = "userName";
    public static final Column CONTENT;
    public static final Column CREATEADTIME;
    public static final Column CREATETIME;
    public static final IAutoDBItem.MAutoDBInfo DB_INFO = initAutoDBInfo(C102646h.class);
    public static final Column EXPOSURECOUNT;
    public static final Column EXPOSURETIME;
    public static final Column FIRSTCONTROLTIME;
    public static final Column HEAD;
    public static final String[] INDEX_CREATE = new String[0];
    public static final Column LIKEFLAG;
    public static final Column LOCALFLAG;
    public static final Column LOCALPRIVATE;
    public static final StorageObserverOwner<C102646h> OBSERVER_OWNER = new StorageObserverOwner<>();
    public static final Column POSTBUF;
    public static final Column PRAVITED;
    public static final Column RECXML;
    public static final Column REMINDINFOGROUP;
    public static final Column ROWID;
    public static final Column SNSID;
    public static final Column SOURCETYPE;
    public static final Column STRINGSEQ;
    public static final Column SUBTYPE;
    public static final SingleTable TABLE;
    public static final String TABLE_NAME = "AdSnsInfo";
    private static final String TAG_ = "MicroMsg.SDK.BaseAdSnsInfo";
    public static final Column TYPE;
    public static final Column USERNAME;
    private static final int adinfo_HASHCODE = -1422350511;
    private static final int adxml_HASHCODE = 92679444;
    private static final int atAdinfo_HASHCODE = -918393500;
    private static final int attrBuf_HASHCODE = -674882878;
    private static final int content_HASHCODE = 951530617;
    private static final int createAdTime_HASHCODE = 1004792236;
    private static final int createTime_HASHCODE = 1369213417;
    private static final int exposureCount_HASHCODE = 407433288;
    private static final int exposureTime_HASHCODE = -1648924556;
    private static final int firstControlTime_HASHCODE = -295142150;
    private static final int head_HASHCODE = 3198432;
    private static final int likeFlag_HASHCODE = 1102348195;
    private static final int localFlag_HASHCODE = -1205623433;
    private static final int localPrivate_HASHCODE = -1746354280;
    private static final int postBuf_HASHCODE = -391239245;
    private static final int pravited_HASHCODE = -1388287679;
    private static final int recxml_HASHCODE = -934900345;
    private static final int remindInfoGroup_HASHCODE = -61213972;
    private static final int rowid_HASHCODE = 108705909;
    private static final int snsId_HASHCODE = 109594803;
    private static final int sourceType_HASHCODE = -1111431691;
    private static final int stringSeq_HASHCODE = -189292914;
    private static final int subType_HASHCODE = -1868521062;
    private static final int type_HASHCODE = 3575610;
    private static final int userName_HASHCODE = -266666762;
    private boolean __hadSetadinfo = true;
    private boolean __hadSetadxml = true;
    private boolean __hadSetatAdinfo = true;
    private boolean __hadSetattrBuf = true;
    private boolean __hadSetcontent = true;
    private boolean __hadSetcreateAdTime = true;
    private boolean __hadSetcreateTime = true;
    private boolean __hadSetexposureCount = true;
    private boolean __hadSetexposureTime = true;
    private boolean __hadSetfirstControlTime = true;
    private boolean __hadSethead = true;
    private boolean __hadSetlikeFlag = true;
    private boolean __hadSetlocalFlag = true;
    private boolean __hadSetlocalPrivate = true;
    private boolean __hadSetpostBuf = true;
    private boolean __hadSetpravited = true;
    private boolean __hadSetrecxml = true;
    private boolean __hadSetremindInfoGroup = true;
    private boolean __hadSetsnsId = true;
    private boolean __hadSetsourceType = true;
    private boolean __hadSetstringSeq = true;
    private boolean __hadSetsubType = true;
    private boolean __hadSettype = true;
    private boolean __hadSetuserName = true;
    public String field_adinfo;
    public String field_adxml;
    public String field_atAdinfo;
    public byte[] field_attrBuf;
    public byte[] field_content;
    public int field_createAdTime;
    public int field_createTime;
    public int field_exposureCount;
    public int field_exposureTime;
    public int field_firstControlTime;
    public int field_head;
    public int field_likeFlag;
    public int field_localFlag;
    public int field_localPrivate;
    public byte[] field_postBuf;
    public int field_pravited;
    public String field_recxml;
    public byte[] field_remindInfoGroup;
    public long field_snsId;
    public int field_sourceType;
    public String field_stringSeq;
    public int field_subType;
    public int field_type;
    public String field_userName;

    /* renamed from: xh.h$a */
    public static class C102647a {
        public C102647a() {
            new ContentValues();
        }
    }

    /* renamed from: xh.h$b */
    public static class C102648b {
    }

    /* renamed from: xh.h$c */
    public static class C102649c {
        public C102649c() {
            new LinkedList();
            new LinkedList();
            new LinkedList();
        }
    }

    /* renamed from: xh.h$d */
    public static class C102650d {
        public C102650d() {
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
        CONTENT = new Column("content", "byte[]", singleTable.getName(), "");
        ATTRBUF = new Column("attrBuf", "byte[]", singleTable.getName(), "");
        POSTBUF = new Column("postBuf", "byte[]", singleTable.getName(), "");
        ADINFO = new Column(COL_ADINFO, "string", singleTable.getName(), "");
        ADXML = new Column(COL_ADXML, "string", singleTable.getName(), "");
        CREATEADTIME = new Column(COL_CREATEADTIME, "int", singleTable.getName(), "");
        EXPOSURETIME = new Column(COL_EXPOSURETIME, "int", singleTable.getName(), "");
        FIRSTCONTROLTIME = new Column(COL_FIRSTCONTROLTIME, "int", singleTable.getName(), "");
        RECXML = new Column(COL_RECXML, "string", singleTable.getName(), "");
        SUBTYPE = new Column("subType", "int", singleTable.getName(), "");
        EXPOSURECOUNT = new Column(COL_EXPOSURECOUNT, "int", singleTable.getName(), "");
        ATADINFO = new Column(COL_ATADINFO, "string", singleTable.getName(), "");
        REMINDINFOGROUP = new Column(COL_REMINDINFOGROUP, "byte[]", singleTable.getName(), "");
    }

    public static final BatchInsertExecutor batchInsert(List<C102646h> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (C102646h next : list) {
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

    public static final C102647a cvBuilder() {
        return new C102647a();
    }

    public static final C102648b delete() {
        return new C102648b();
    }

    private static String getCreateSQLs() {
        return "CREATE TABLE IF NOT EXISTS AdSnsInfo ( " + DB_INFO.sql + ");";
    }

    public static IAutoDBItem.MAutoDBInfo initAutoDBInfo(Class<?> cls) {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = new IAutoDBItem.MAutoDBInfo();
        mAutoDBInfo.fields = new Field[24];
        String[] strArr = new String[25];
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
        mAutoDBInfo.columns[11] = "content";
        mAutoDBInfo.colsMap.put("content", "BLOB");
        mAutoDBInfo.columns[12] = "attrBuf";
        mAutoDBInfo.colsMap.put("attrBuf", "BLOB");
        mAutoDBInfo.columns[13] = "postBuf";
        mAutoDBInfo.colsMap.put("postBuf", "BLOB");
        mAutoDBInfo.columns[14] = COL_ADINFO;
        mAutoDBInfo.colsMap.put(COL_ADINFO, "TEXT");
        mAutoDBInfo.columns[15] = COL_ADXML;
        mAutoDBInfo.colsMap.put(COL_ADXML, "TEXT");
        mAutoDBInfo.columns[16] = COL_CREATEADTIME;
        mAutoDBInfo.colsMap.put(COL_CREATEADTIME, "INTEGER");
        mAutoDBInfo.columns[17] = COL_EXPOSURETIME;
        mAutoDBInfo.colsMap.put(COL_EXPOSURETIME, "INTEGER");
        mAutoDBInfo.columns[18] = COL_FIRSTCONTROLTIME;
        mAutoDBInfo.colsMap.put(COL_FIRSTCONTROLTIME, "INTEGER");
        mAutoDBInfo.columns[19] = COL_RECXML;
        mAutoDBInfo.colsMap.put(COL_RECXML, "TEXT");
        mAutoDBInfo.columns[20] = "subType";
        mAutoDBInfo.colsMap.put("subType", "INTEGER");
        mAutoDBInfo.columns[21] = COL_EXPOSURECOUNT;
        mAutoDBInfo.colsMap.put(COL_EXPOSURECOUNT, "INTEGER");
        mAutoDBInfo.columns[22] = COL_ATADINFO;
        mAutoDBInfo.colsMap.put(COL_ATADINFO, "TEXT");
        mAutoDBInfo.columns[23] = COL_REMINDINFOGROUP;
        mAutoDBInfo.colsMap.put(COL_REMINDINFOGROUP, "BLOB");
        mAutoDBInfo.columns[24] = "rowid";
        mAutoDBInfo.sql = " snsId LONG,  userName TEXT,  localFlag INTEGER,  createTime INTEGER,  head INTEGER,  localPrivate INTEGER,  type INTEGER,  sourceType INTEGER,  likeFlag INTEGER,  pravited INTEGER,  stringSeq TEXT,  content BLOB,  attrBuf BLOB,  postBuf BLOB,  adinfo TEXT,  adxml TEXT,  createAdTime INTEGER,  exposureTime INTEGER,  firstControlTime INTEGER,  recxml TEXT,  subType INTEGER,  exposureCount INTEGER,  atAdinfo TEXT,  remindInfoGroup BLOB";
        if (mAutoDBInfo.primaryKey == null) {
            mAutoDBInfo.primaryKey = "rowid";
        }
        return mAutoDBInfo;
    }

    public static final InsertExecutor insert(C102646h hVar, boolean z) {
        if (!z) {
            return new InsertExecutor(hVar, true, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
        }
        return new InsertExecutor(hVar, true, hVar.createInsertEvent(), OBSERVER_OWNER, TAG_);
    }

    public static final InsertExecutor insertOrThrow(C102646h hVar, boolean z) {
        if (!z) {
            return new InsertExecutor(hVar, false, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
        }
        return new InsertExecutor(hVar, false, hVar.createInsertEvent(), OBSERVER_OWNER, TAG_);
    }

    public static final void observe(C0125s sVar, IStorageObserver<? extends C102646h> iStorageObserver) {
        OBSERVER_OWNER.observe(sVar, iStorageObserver);
    }

    private final void parseBuff() {
    }

    public static final void removeObserve(IStorageObserver<? extends C102646h> iStorageObserver) {
        OBSERVER_OWNER.removeObserver(iStorageObserver);
    }

    public static final ReplaceExecutor replace(C102646h hVar, boolean z) {
        return z ? new ReplaceExecutor(hVar, hVar.createReplaceEvent(), OBSERVER_OWNER, TAG_) : new ReplaceExecutor(hVar, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public static final C102649c select() {
        return new C102649c();
    }

    public static final SelectSql selectByAdinfo(String str) {
        return TABLE.selectAll().where(ADINFO.equal(str)).log(TAG_).build();
    }

    public static final SelectSql selectByAdinfoList(List<String> list) {
        return TABLE.selectAll().where(ADINFO.inString(list)).log(TAG_).build();
    }

    public static final SelectSql selectByAdxml(String str) {
        return TABLE.selectAll().where(ADXML.equal(str)).log(TAG_).build();
    }

    public static final SelectSql selectByAdxmlList(List<String> list) {
        return TABLE.selectAll().where(ADXML.inString(list)).log(TAG_).build();
    }

    public static final SelectSql selectByAtAdinfo(String str) {
        return TABLE.selectAll().where(ATADINFO.equal(str)).log(TAG_).build();
    }

    public static final SelectSql selectByAtAdinfoList(List<String> list) {
        return TABLE.selectAll().where(ATADINFO.inString(list)).log(TAG_).build();
    }

    public static final SelectSql selectByCreateAdTime(int i) {
        return TABLE.selectAll().where(CREATEADTIME.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByCreateAdTimeList(List<Integer> list) {
        return TABLE.selectAll().where(CREATEADTIME.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByCreateTime(int i) {
        return TABLE.selectAll().where(CREATETIME.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByCreateTimeList(List<Integer> list) {
        return TABLE.selectAll().where(CREATETIME.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByExposureCount(int i) {
        return TABLE.selectAll().where(EXPOSURECOUNT.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByExposureCountList(List<Integer> list) {
        return TABLE.selectAll().where(EXPOSURECOUNT.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByExposureTime(int i) {
        return TABLE.selectAll().where(EXPOSURETIME.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByExposureTimeList(List<Integer> list) {
        return TABLE.selectAll().where(EXPOSURETIME.inNumber(list)).log(TAG_).build();
    }

    public static final SelectSql selectByFirstControlTime(int i) {
        return TABLE.selectAll().where(FIRSTCONTROLTIME.equal((Number) Integer.valueOf(i))).log(TAG_).build();
    }

    public static final SelectSql selectByFirstControlTimeList(List<Integer> list) {
        return TABLE.selectAll().where(FIRSTCONTROLTIME.inNumber(list)).log(TAG_).build();
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

    public static final SelectSql selectByRecxml(String str) {
        return TABLE.selectAll().where(RECXML.equal(str)).log(TAG_).build();
    }

    public static final SelectSql selectByRecxmlList(List<String> list) {
        return TABLE.selectAll().where(RECXML.inString(list)).log(TAG_).build();
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

    public static final C102650d update() {
        return new C102650d();
    }

    public boolean compareContent(IAutoDBItem iAutoDBItem) {
        if (iAutoDBItem == null || !(iAutoDBItem instanceof C102646h)) {
            return false;
        }
        C102646h hVar = (C102646h) iAutoDBItem;
        return C46238a.m51546a(Long.valueOf(this.field_snsId), Long.valueOf(hVar.field_snsId)) && C46238a.m51546a(this.field_userName, hVar.field_userName) && C46238a.m51546a(Integer.valueOf(this.field_localFlag), Integer.valueOf(hVar.field_localFlag)) && C46238a.m51546a(Integer.valueOf(this.field_createTime), Integer.valueOf(hVar.field_createTime)) && C46238a.m51546a(Integer.valueOf(this.field_head), Integer.valueOf(hVar.field_head)) && C46238a.m51546a(Integer.valueOf(this.field_localPrivate), Integer.valueOf(hVar.field_localPrivate)) && C46238a.m51546a(Integer.valueOf(this.field_type), Integer.valueOf(hVar.field_type)) && C46238a.m51546a(Integer.valueOf(this.field_sourceType), Integer.valueOf(hVar.field_sourceType)) && C46238a.m51546a(Integer.valueOf(this.field_likeFlag), Integer.valueOf(hVar.field_likeFlag)) && C46238a.m51546a(Integer.valueOf(this.field_pravited), Integer.valueOf(hVar.field_pravited)) && C46238a.m51546a(this.field_stringSeq, hVar.field_stringSeq) && C46238a.m51546a(this.field_content, hVar.field_content) && C46238a.m51546a(this.field_attrBuf, hVar.field_attrBuf) && C46238a.m51546a(this.field_postBuf, hVar.field_postBuf) && C46238a.m51546a(this.field_adinfo, hVar.field_adinfo) && C46238a.m51546a(this.field_adxml, hVar.field_adxml) && C46238a.m51546a(Integer.valueOf(this.field_createAdTime), Integer.valueOf(hVar.field_createAdTime)) && C46238a.m51546a(Integer.valueOf(this.field_exposureTime), Integer.valueOf(hVar.field_exposureTime)) && C46238a.m51546a(Integer.valueOf(this.field_firstControlTime), Integer.valueOf(hVar.field_firstControlTime)) && C46238a.m51546a(this.field_recxml, hVar.field_recxml) && C46238a.m51546a(Integer.valueOf(this.field_subType), Integer.valueOf(hVar.field_subType)) && C46238a.m51546a(Integer.valueOf(this.field_exposureCount), Integer.valueOf(hVar.field_exposureCount)) && C46238a.m51546a(this.field_atAdinfo, hVar.field_atAdinfo) && C46238a.m51546a(this.field_remindInfoGroup, hVar.field_remindInfoGroup);
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
                } else if (content_HASHCODE == hashCode) {
                    try {
                        this.field_content = cursor.getBlob(i);
                    } catch (Throwable th14) {
                        Log.printErrStackTrace(TAG_, th14, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (attrBuf_HASHCODE == hashCode) {
                    try {
                        this.field_attrBuf = cursor.getBlob(i);
                    } catch (Throwable th15) {
                        Log.printErrStackTrace(TAG_, th15, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (postBuf_HASHCODE == hashCode) {
                    try {
                        this.field_postBuf = cursor.getBlob(i);
                    } catch (Throwable th16) {
                        Log.printErrStackTrace(TAG_, th16, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (adinfo_HASHCODE == hashCode) {
                    try {
                        this.field_adinfo = cursor.getString(i);
                    } catch (Throwable th17) {
                        Log.printErrStackTrace(TAG_, th17, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (adxml_HASHCODE == hashCode) {
                    try {
                        this.field_adxml = cursor.getString(i);
                    } catch (Throwable th18) {
                        Log.printErrStackTrace(TAG_, th18, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (createAdTime_HASHCODE == hashCode) {
                    try {
                        this.field_createAdTime = cursor.getInt(i);
                    } catch (Throwable th19) {
                        Log.printErrStackTrace(TAG_, th19, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (exposureTime_HASHCODE == hashCode) {
                    try {
                        this.field_exposureTime = cursor.getInt(i);
                    } catch (Throwable th20) {
                        Log.printErrStackTrace(TAG_, th20, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (firstControlTime_HASHCODE == hashCode) {
                    try {
                        this.field_firstControlTime = cursor.getInt(i);
                    } catch (Throwable th21) {
                        Log.printErrStackTrace(TAG_, th21, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (recxml_HASHCODE == hashCode) {
                    try {
                        this.field_recxml = cursor.getString(i);
                    } catch (Throwable th22) {
                        Log.printErrStackTrace(TAG_, th22, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (subType_HASHCODE == hashCode) {
                    try {
                        this.field_subType = cursor.getInt(i);
                    } catch (Throwable th23) {
                        Log.printErrStackTrace(TAG_, th23, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (exposureCount_HASHCODE == hashCode) {
                    try {
                        this.field_exposureCount = cursor.getInt(i);
                    } catch (Throwable th24) {
                        Log.printErrStackTrace(TAG_, th24, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (atAdinfo_HASHCODE == hashCode) {
                    try {
                        this.field_atAdinfo = cursor.getString(i);
                    } catch (Throwable th25) {
                        Log.printErrStackTrace(TAG_, th25, "convertFrom %s", columnNames[i]);
                        if (BuildInfo.DEBUG) {
                            Assert.assertTrue("db data is not match", false);
                        }
                    }
                } else if (remindInfoGroup_HASHCODE == hashCode) {
                    try {
                        this.field_remindInfoGroup = cursor.getBlob(i);
                    } catch (Throwable th26) {
                        Log.printErrStackTrace(TAG_, th26, "convertFrom %s", columnNames[i]);
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
        if (this.__hadSetcontent) {
            contentValues.put("content", this.field_content);
        }
        if (this.__hadSetattrBuf) {
            contentValues.put("attrBuf", this.field_attrBuf);
        }
        if (this.__hadSetpostBuf) {
            contentValues.put("postBuf", this.field_postBuf);
        }
        if (this.__hadSetadinfo) {
            contentValues.put(COL_ADINFO, this.field_adinfo);
        }
        if (this.__hadSetadxml) {
            contentValues.put(COL_ADXML, this.field_adxml);
        }
        if (this.__hadSetcreateAdTime) {
            contentValues.put(COL_CREATEADTIME, Integer.valueOf(this.field_createAdTime));
        }
        if (this.__hadSetexposureTime) {
            contentValues.put(COL_EXPOSURETIME, Integer.valueOf(this.field_exposureTime));
        }
        if (this.__hadSetfirstControlTime) {
            contentValues.put(COL_FIRSTCONTROLTIME, Integer.valueOf(this.field_firstControlTime));
        }
        if (this.__hadSetrecxml) {
            contentValues.put(COL_RECXML, this.field_recxml);
        }
        if (this.__hadSetsubType) {
            contentValues.put("subType", Integer.valueOf(this.field_subType));
        }
        if (this.__hadSetexposureCount) {
            contentValues.put(COL_EXPOSURECOUNT, Integer.valueOf(this.field_exposureCount));
        }
        if (this.__hadSetatAdinfo) {
            contentValues.put(COL_ATADINFO, this.field_atAdinfo);
        }
        if (this.__hadSetremindInfoGroup) {
            contentValues.put(COL_REMINDINFOGROUP, this.field_remindInfoGroup);
        }
        long j = this.systemRowid;
        if (j > 0) {
            contentValues.put("rowid", Long.valueOf(j));
        }
        return contentValues;
    }

    public StorageObserverEvent<? extends C102646h> createDeleteEvent() {
        StorageObserverEvent<? extends C102646h> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getDELETE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public StorageObserverEvent<? extends C102646h> createInsertEvent() {
        StorageObserverEvent<? extends C102646h> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getINSERT(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public void createMyTable(ISQLiteDatabase iSQLiteDatabase) {
        createTable(iSQLiteDatabase);
    }

    public StorageObserverEvent<? extends C102646h> createReplaceEvent() {
        StorageObserverEvent<? extends C102646h> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getUPDATE(), String.valueOf(getPrimaryKeyValue()), TAG_);
        storageObserverEvent.setObj(this);
        return storageObserverEvent;
    }

    public StorageObserverEvent<? extends C102646h> createUpdateEvent() {
        StorageObserverEvent<? extends C102646h> storageObserverEvent = new StorageObserverEvent<>(StorageEventId.getUPDATE(), String.valueOf(getPrimaryKeyValue()), TAG_);
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

    public StorageObserverOwner<C102646h> getObserverOwner() {
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

    public static final DeleteExecutor delete(C102646h hVar, boolean z) {
        if (z) {
            return new DeleteExecutor(hVar, hVar.createDeleteEvent(), OBSERVER_OWNER, TAG_);
        }
        return new DeleteExecutor(hVar, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public static final UpdateExecutor update(C102646h hVar, boolean z) {
        if (z) {
            return new UpdateExecutor(hVar, hVar.createUpdateEvent(), OBSERVER_OWNER, TAG_);
        }
        return new UpdateExecutor(hVar, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, TAG_);
    }

    public SelectSql selectByAdinfo() {
        return selectByAdinfo(this.field_adinfo);
    }

    public SelectSql selectByAdxml() {
        return selectByAdxml(this.field_adxml);
    }

    public SelectSql selectByAtAdinfo() {
        return selectByAtAdinfo(this.field_atAdinfo);
    }

    public SelectSql selectByCreateAdTime() {
        return selectByCreateAdTime(this.field_createAdTime);
    }

    public SelectSql selectByCreateTime() {
        return selectByCreateTime(this.field_createTime);
    }

    public SelectSql selectByExposureCount() {
        return selectByExposureCount(this.field_exposureCount);
    }

    public SelectSql selectByExposureTime() {
        return selectByExposureTime(this.field_exposureTime);
    }

    public SelectSql selectByFirstControlTime() {
        return selectByFirstControlTime(this.field_firstControlTime);
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

    public SelectSql selectByRecxml() {
        return selectByRecxml(this.field_recxml);
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
        if (contentValues.containsKey(COL_ADINFO)) {
            this.field_adinfo = contentValues.getAsString(COL_ADINFO);
            if (z) {
                this.__hadSetadinfo = true;
            }
        }
        if (contentValues.containsKey(COL_ADXML)) {
            this.field_adxml = contentValues.getAsString(COL_ADXML);
            if (z) {
                this.__hadSetadxml = true;
            }
        }
        if (contentValues.containsKey(COL_CREATEADTIME)) {
            this.field_createAdTime = contentValues.getAsInteger(COL_CREATEADTIME).intValue();
            if (z) {
                this.__hadSetcreateAdTime = true;
            }
        }
        if (contentValues.containsKey(COL_EXPOSURETIME)) {
            this.field_exposureTime = contentValues.getAsInteger(COL_EXPOSURETIME).intValue();
            if (z) {
                this.__hadSetexposureTime = true;
            }
        }
        if (contentValues.containsKey(COL_FIRSTCONTROLTIME)) {
            this.field_firstControlTime = contentValues.getAsInteger(COL_FIRSTCONTROLTIME).intValue();
            if (z) {
                this.__hadSetfirstControlTime = true;
            }
        }
        if (contentValues.containsKey(COL_RECXML)) {
            this.field_recxml = contentValues.getAsString(COL_RECXML);
            if (z) {
                this.__hadSetrecxml = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsInteger("subType").intValue();
            if (z) {
                this.__hadSetsubType = true;
            }
        }
        if (contentValues.containsKey(COL_EXPOSURECOUNT)) {
            this.field_exposureCount = contentValues.getAsInteger(COL_EXPOSURECOUNT).intValue();
            if (z) {
                this.__hadSetexposureCount = true;
            }
        }
        if (contentValues.containsKey(COL_ATADINFO)) {
            this.field_atAdinfo = contentValues.getAsString(COL_ATADINFO);
            if (z) {
                this.__hadSetatAdinfo = true;
            }
        }
        if (contentValues.containsKey(COL_REMINDINFOGROUP)) {
            this.field_remindInfoGroup = contentValues.getAsByteArray(COL_REMINDINFOGROUP);
            if (z) {
                this.__hadSetremindInfoGroup = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
