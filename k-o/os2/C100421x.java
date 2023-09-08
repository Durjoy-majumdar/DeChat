package os2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import jr2.C33650l;
import p749xh.C102655l8;
import zh3.C91753f;

/* renamed from: os2.x */
public class C100421x extends MAutoStorage<C100420w> implements C33650l {

    /* renamed from: f */
    public static final String[] f294190f = {MAutoStorage.getCreateSQLs(C100420w.f294188M, "SnsComment")};

    /* renamed from: d */
    public C91753f f294191d;

    /* renamed from: e */
    public boolean f294192e = false;

    public C100421x(C91753f fVar) {
        super(fVar, C100420w.f294188M, "SnsComment", C102655l8.f302627u);
        this.f294191d = fVar;
    }

    /* renamed from: Lo */
    public boolean mo139888Lo(long j, long j2, int i) {
        SnsMethodCalculate.markStartTimeMs("deleteComment", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        String str = i == 9 ? "(2)" : "";
        if (i == 10) {
            str = str + "(8,16)";
        }
        boolean execSQL = this.f294191d.execSQL("SnsComment", "delete from SnsComment where snsID = " + j + " and commentSvrID = " + j2 + " and type in " + str);
        SnsMethodCalculate.markEndTimeMs("deleteComment", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return execSQL;
    }

    /* renamed from: Ow */
    public final String mo139889Ow() {
        SnsMethodCalculate.markStartTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        SnsMethodCalculate.markEndTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return "select *, rowid from SnsComment";
    }

    /* renamed from: SE */
    public boolean mo139890SE(long j, String str, int i, String str2) {
        String str3;
        SnsMethodCalculate.markStartTimeMs("isExistComment", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        if (Util.isNullOrNil(str2)) {
            str3 = "select count(*) from SnsComment where snsID = " + j + " and createTime = " + i + " and talker = '" + str + "'";
        } else {
            str3 = "select count(*) from SnsComment where snsID = " + j + " and clientId = '" + str2 + "'";
        }
        boolean z = false;
        Cursor rawQuery = rawQuery(str3, new String[0]);
        if (rawQuery != null) {
            rawQuery.moveToFirst();
            int i2 = rawQuery.getInt(0);
            rawQuery.close();
            if (i2 > 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isExistComment", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("isExistComment", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return false;
    }

    /* renamed from: TE */
    public boolean mo139891TE(long j, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateIsSilence", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        String str = " update SnsComment set isSilence = " + (z ? 1 : 0) + " where isSilence != " + z + " and  snsID = " + j;
        Log.m105924i("MicroMsg.SnsCommentStorage", "updateIsSilence " + str);
        boolean execSQL = this.f294191d.execSQL("SnsComment", str);
        SnsMethodCalculate.markEndTimeMs("updateIsSilence", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return execSQL;
    }

    /* renamed from: Yt */
    public int mo139892Yt(boolean z) {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        Cursor rawQuery = rawQuery("select count(*) from SnsComment where isSend = " + (z ? 1 : 0) + "", new String[0]);
        if (rawQuery != null) {
            rawQuery.moveToFirst();
            int i = rawQuery.getInt(0);
            rawQuery.close();
            SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            return i;
        }
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return 0;
    }

    /* renamed from: bD */
    public Cursor mo139893bD() {
        SnsMethodCalculate.markStartTimeMs("getUnReadCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        mo139889Ow();
        Cursor rawQuery = this.f294191d.rawQuery("select *, rowid from SnsComment where isRead = ?  and isSilence != ?  order by createTime desc", new String[]{"0", "1"});
        SnsMethodCalculate.markEndTimeMs("getUnReadCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return rawQuery;
    }

    /* renamed from: bF */
    public boolean mo139894bF() {
        SnsMethodCalculate.markStartTimeMs("updateToRead", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        boolean execSQL = this.f294191d.execSQL("SnsComment", " update SnsComment set isRead = 1 where isRead = 0");
        SnsMethodCalculate.markEndTimeMs("updateToRead", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return execSQL;
    }

    /* renamed from: jo */
    public boolean mo139895jo(long j) {
        SnsMethodCalculate.markStartTimeMs("deleteBySnsId", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        boolean execSQL = this.f294191d.execSQL("SnsComment", "delete from SnsComment where snsID = " + j);
        SnsMethodCalculate.markEndTimeMs("deleteBySnsId", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return execSQL;
    }

    /* renamed from: kD */
    public int mo139896kD() {
        SnsMethodCalculate.markStartTimeMs("getUnreadCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        Cursor rawQuery = this.f294191d.rawQuery(" select count(*) from SnsComment where isRead = ? and isSilence != ? ", new String[]{"0", "1"}, 2);
        int i = 0;
        if (rawQuery == null) {
            SnsMethodCalculate.markEndTimeMs("getUnreadCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            return 0;
        }
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("getUnreadCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return i;
    }

    /* renamed from: qq */
    public C100420w mo139897qq(long j, long j2, int i) {
        SnsMethodCalculate.markStartTimeMs("getByCommentId", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        String str = i == 9 ? "(2)" : "";
        if (i == 10) {
            str = str + "(8,16)";
        }
        C100420w wVar = null;
        StringBuilder sb = new StringBuilder();
        mo139889Ow();
        sb.append("select *, rowid from SnsComment");
        sb.append(" where snsID = ");
        sb.append(j);
        sb.append(" and commentSvrID = ");
        sb.append(j2);
        sb.append(" and type in ");
        sb.append(str);
        Cursor rawQuery = rawQuery(sb.toString(), new String[0]);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                C100420w wVar2 = new C100420w();
                wVar2.convertFrom(rawQuery);
                wVar = wVar2;
            }
            rawQuery.close();
        }
        SnsMethodCalculate.markEndTimeMs("getByCommentId", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return wVar;
    }
}
