package wh3;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import te3.C50892pz1;

/* renamed from: wh3.o */
public class C38140o extends MAutoStorage<C38139n> {

    /* renamed from: e */
    public static final String[] f100785e = {MAutoStorage.getCreateSQLs(C38139n.f100784r, "EmotionDetailInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f100786d;

    public C38140o(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C38139n.f100784r, "EmotionDetailInfo", (String[]) null);
        this.f100786d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public void mo61537Lo(String str, C50892pz1 pz12, String str2) {
        if (Util.isNullOrNil(str) || pz12 == null) {
            Log.m105928w("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID failed. productId or response is null.");
        }
        try {
            C38139n nVar = new C38139n();
            nVar.field_productID = str;
            nVar.field_content = pz12.toByteArray();
            nVar.field_lan = str2;
            if (this.f100786d.replace("EmotionDetailInfo", "productID", nVar.convertTo()) > 0) {
                Log.m105925i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID success. ProductId:%s", str);
                return;
            }
            Log.m105925i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID failed. ProductId:%s", str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID exception:%s", Util.stackTraceToString(e));
        }
    }

    public String getTableName() {
        return "EmotionDetailInfo";
    }

    /* renamed from: jo */
    public C38139n mo61538jo(String str) {
        C38139n nVar = null;
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.emoji.EmotionDetailInfoStorage", "getEmotionDetailRespnseByPID failed. productID is null.");
            return null;
        }
        ISQLiteDatabase iSQLiteDatabase = this.f100786d;
        Cursor query = iSQLiteDatabase.query("EmotionDetailInfo", new String[]{"content", "lan"}, "productID=?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query != null && query.moveToFirst()) {
            nVar = new C38139n();
            nVar.field_content = query.getBlob(0);
            nVar.field_lan = query.getString(1);
            nVar.field_productID = str;
        }
        if (query != null) {
            query.close();
        }
        return nVar;
    }
}
