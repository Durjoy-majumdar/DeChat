package kd0;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import eb0.C7628p0;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import zh3.C91753f;

/* renamed from: kd0.g0 */
public class C76541g0 extends MStorage {

    /* renamed from: h */
    public static final String[] f224033h = {"CREATE TABLE IF NOT EXISTS voiceinfo ( FileName TEXT PRIMARY KEY, User TEXT, MsgId INT, NetOffset INT, FileNowSize INT, TotalLen INT, Status INT, CreateTime INT, LastModifyTime INT, ClientId TEXT, VoiceLength INT, MsgLocalId INT, Human TEXT, reserved1 INT, reserved2 TEXT, MsgSource TEXT, MsgFlag INT, MsgSeq INT, MasterBufId INT, checksum INT DEFAULT 0, VoiceFlag INT DEFAULT 0, VoiceInfoExt BLOB )", "CREATE INDEX IF NOT EXISTS voiceinfomsgidindex ON voiceinfo ( MsgId ) ", "CREATE UNIQUE INDEX IF NOT EXISTS voiceinfouniqueindex ON voiceinfo ( FileName )", "CREATE INDEX IF NOT EXISTS voice_unfinish_info_index ON voiceinfo ( Status,User,CreateTime )"};

    /* renamed from: d */
    public C91753f f224034d;

    /* renamed from: e */
    public Map<String, C76534a> f224035e = new HashMap();

    /* renamed from: f */
    public Map<String, C76545t> f224036f = new HashMap();

    /* renamed from: g */
    public Map<String, C76544n> f224037g = new HashMap();

    public C76541g0(C91753f fVar) {
        Cursor rawQuery = fVar.rawQuery("PRAGMA table_info(voiceinfo)", (String[]) null);
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.VoiceStorage", "addNewColIfNeed failed, cursor is null.");
        } else {
            int columnIndex = rawQuery.getColumnIndex("name");
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            while (rawQuery.moveToNext()) {
                if (columnIndex >= 0) {
                    String string = rawQuery.getString(columnIndex);
                    z = "MsgSource".equals(string) ? true : z;
                    z2 = "MsgFlag".equals(string) ? true : z2;
                    z3 = "MsgSeq".equals(string) ? true : z3;
                    z4 = "MasterBufId".equals(string) ? true : z4;
                    z5 = "checksum".equals(string) ? true : z5;
                    z6 = "VoiceFlag".equals(string) ? true : z6;
                    if ("VoiceInfoExt".equals(string)) {
                        z7 = true;
                    }
                }
            }
            rawQuery.close();
            if (!z) {
                fVar.execSQL("voiceinfo", "Alter table voiceinfo add MsgSource TEXT");
            }
            if (!z2) {
                fVar.execSQL("voiceinfo", "Alter table voiceinfo add MsgFlag INT");
            }
            if (!z3) {
                fVar.execSQL("voiceinfo", "Alter table voiceinfo add MsgSeq INT");
            }
            if (!z4) {
                fVar.execSQL("voiceinfo", "Alter table voiceinfo add MasterBufId INT");
            }
            if (!z5) {
                fVar.execSQL("voiceinfo", "Alter table voiceinfo add checksum INT DEFAULT 0");
            }
            if (!z6) {
                fVar.execSQL("voiceinfo", "Alter table voiceinfo add VoiceFlag INT DEFAULT 0");
            }
            if (!z7) {
                fVar.execSQL("voiceinfo", "Alter table voiceinfo add VoiceInfoExt BLOB");
            }
        }
        this.f224034d = fVar;
    }

    /* renamed from: SQ */
    public static String m92032SQ(String str, String str2) {
        return C7628p0.m7761a(str, Util.nowMilliSecond());
    }

    /* renamed from: Lo */
    public C76551y mo106781Lo(long j) {
        C76551y yVar = null;
        Cursor rawQuery = this.f224034d.rawQuery("SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum, VoiceFlag, VoiceInfoExt" + " FROM voiceinfo WHERE MsgId=" + j, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            yVar = new C76551y();
            yVar.mo106794a(rawQuery);
        }
        rawQuery.close();
        return yVar;
    }

    /* renamed from: Ow */
    public boolean mo106782Ow(String str, C76551y yVar) {
        Assert.assertTrue(str.length() > 0);
        Assert.assertTrue(yVar != null);
        ContentValues b = yVar.mo106795b();
        if (b.size() <= 0) {
            Log.m105920e("MicroMsg.VoiceStorage", "update failed, no values set");
        } else {
            if (this.f224034d.update("voiceinfo", b, "FileName= ?", new String[]{str}) > 0) {
                doNotify();
                return true;
            }
        }
        return false;
    }

    /* renamed from: Yt */
    public boolean mo106783Yt(C76551y yVar) {
        Assert.assertTrue(yVar != null);
        ContentValues b = yVar.mo106795b();
        if (b.size() <= 0) {
            Log.m105920e("MicroMsg.VoiceStorage", "insert falied, no values set");
        } else if (this.f224034d.insert("voiceinfo", "FileName", b) != -1) {
            doNotify();
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo106784c(String str) {
        Assert.assertTrue(str.length() > 0);
        if (this.f224034d.delete("voiceinfo", "FileName= ?", new String[]{str}) <= 0) {
            Log.m105928w("MicroMsg.VoiceStorage", "delete failed, no such file:" + str);
        }
        return true;
    }

    /* renamed from: jo */
    public C76551y mo106785jo(String str) {
        C76551y yVar;
        Cursor rawQuery = this.f224034d.rawQuery("SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum, VoiceFlag, VoiceInfoExt FROM voiceinfo WHERE FileName= ?", new String[]{str}, 2);
        if (rawQuery.moveToFirst()) {
            yVar = new C76551y();
            yVar.mo106794a(rawQuery);
        } else {
            yVar = null;
        }
        rawQuery.close();
        return yVar;
    }

    /* renamed from: qq */
    public C76551y mo106786qq(int i) {
        C76551y yVar = null;
        Cursor rawQuery = this.f224034d.rawQuery("SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum, VoiceFlag, VoiceInfoExt" + " FROM voiceinfo WHERE MsgLocalId=" + i, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            yVar = new C76551y();
            yVar.mo106794a(rawQuery);
        }
        rawQuery.close();
        return yVar;
    }
}
