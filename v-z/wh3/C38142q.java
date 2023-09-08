package wh3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.io.IOException;
import te3.C51759vz1;

/* renamed from: wh3.q */
public class C38142q extends MAutoStorage<C38141p> {

    /* renamed from: e */
    public static final String[] f100788e = {MAutoStorage.getCreateSQLs(C38141p.f100787p, "EmotionRewardInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f100789d;

    public C38142q(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38141p.f100787p, "EmotionRewardInfo", (String[]) null);
        this.f100789d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public C51759vz1 mo61539jo(String str) {
        C51759vz1 vz12 = null;
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.emoji.EmotionRewardInfoStorage", "getEmotionRewardResponseByPID failed. productID is null.");
            return null;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f100789d;
        Cursor query = iSQLiteDatabase.query("EmotionRewardInfo", new String[]{"content"}, "productID=?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query != null && query.moveToFirst()) {
            try {
                C51759vz1 vz13 = new C51759vz1();
                vz13.parseFrom(query.getBlob(0));
                vz12 = vz13;
            } catch (IOException e) {
                Log.m105921e("MicroMsg.emoji.EmotionRewardInfoStorage", "exception:%s", Util.stackTraceToString(e));
            }
        }
        if (query != null) {
            query.close();
        }
        return vz12;
    }
}
