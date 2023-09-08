package pz0;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import oz0.C47407b;

/* renamed from: pz0.j */
public class C47721j extends MAutoStorage<ShareCardInfo> {

    /* renamed from: e */
    public static final String[] f128212e = {MAutoStorage.getCreateSQLs(ShareCardInfo.f51612Q0, "ShareCardInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f128213d;

    public C47721j(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, ShareCardInfo.f51612Q0, "ShareCardInfo", (String[]) null);
        this.f128213d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final String mo72538Lo(int i) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> e = C47407b.m52743e(i);
        if (e == null || e.size() <= 0) {
            return "";
        }
        sb.append(" (");
        for (int i2 = 0; i2 < e.size(); i2++) {
            if (i2 != 0) {
                sb.append(" OR ");
            }
            sb.append("card_id");
            sb.append(" = '" + e.get(i2) + "' ");
        }
        sb.append(") AND ");
        return sb.toString();
    }

    /* renamed from: Ow */
    public ArrayList<String> mo72539Ow(String str, int i) {
        Log.m105924i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), limit is " + i);
        StringBuilder sb = new StringBuilder();
        sb.append(" where ( status=0) ");
        sb.append(" AND (card_tp_id = '" + str + "' )");
        sb.append(" order by share_time desc ");
        sb.append(" limit " + i);
        Cursor rawQuery = this.f128213d.rawQuery("select ShareCardInfo.from_username from ShareCardInfo" + sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), cursor == null");
            return null;
        }
        int columnIndex = rawQuery.getColumnIndex("from_username");
        if (columnIndex == -1) {
            Log.m105924i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), index is wrong");
            rawQuery.close();
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        while (rawQuery.moveToNext()) {
            String string = rawQuery.getString(columnIndex);
            if (TextUtils.isEmpty(string) || arrayList.contains(string)) {
                Log.m105920e("MicroMsg.ShareCardInfoStorage", "the field_from_username is empty or username is added!, the card id is " + str);
            } else {
                arrayList.add(string);
            }
            if (arrayList.size() >= i) {
                break;
            }
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: SE */
    public boolean mo72540SE(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(" where ( status=0) ");
        sb.append(" AND (card_tp_id = '" + str + "' )");
        boolean execSQL = this.f128213d.execSQL("ShareCardInfo", "update ShareCardInfo set categoryType = '" + i + "', " + "itemIndex" + " = '" + i2 + "' " + sb.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("updateCategoryInfo updateRet is ");
        sb4.append(execSQL ? 1 : 0);
        Log.m105924i("MicroMsg.ShareCardInfoStorage", sb4.toString());
        return execSQL;
    }

    /* renamed from: Yt */
    public String mo72541Yt(String str) {
        Log.m105924i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId()");
        StringBuilder sb = new StringBuilder();
        sb.append(" where ( status=0) ");
        sb.append(" AND (card_tp_id = '" + str + "' )");
        sb.append(" order by share_time desc ");
        sb.append(" limit 1");
        Cursor rawQuery = this.f128213d.rawQuery("select ShareCardInfo.card_id from ShareCardInfo" + sb.toString(), (String[]) null, 2);
        String str2 = "";
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId(), cursor == null");
            return str2;
        }
        int columnIndex = rawQuery.getColumnIndex("card_id");
        if (columnIndex == -1) {
            Log.m105924i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId(), index is wrong");
            rawQuery.close();
            return str2;
        }
        if (rawQuery.moveToFirst()) {
            str2 = rawQuery.getString(columnIndex);
        }
        rawQuery.close();
        return str2;
    }

    /* renamed from: bD */
    public String mo72542bD(String str, String str2) {
        Log.m105924i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId()");
        StringBuilder sb = new StringBuilder();
        sb.append(" where ( status=0) ");
        sb.append(" AND (card_tp_id = '" + str2 + "' )");
        sb.append(" order by share_time desc ");
        sb.append(" limit 2");
        Cursor rawQuery = this.f128213d.rawQuery("select ShareCardInfo.card_id from ShareCardInfo" + sb.toString(), (String[]) null, 2);
        String str3 = "";
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId(), cursor == null");
            return str3;
        }
        int columnIndex = rawQuery.getColumnIndex("card_id");
        if (columnIndex == -1) {
            Log.m105924i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId(), index is wrong");
            rawQuery.close();
            return str3;
        }
        while (rawQuery.moveToNext()) {
            str3 = rawQuery.getString(columnIndex);
            if (str != null && !str.equals(str3)) {
                break;
            }
        }
        rawQuery.close();
        return str3;
    }

    /* renamed from: jo */
    public ShareCardInfo mo72543jo(String str) {
        ShareCardInfo shareCardInfo = new ShareCardInfo();
        shareCardInfo.field_card_id = str;
        if (super.get(shareCardInfo, new String[0])) {
            return shareCardInfo;
        }
        return null;
    }

    /* renamed from: kD */
    public boolean mo72544kD(ArrayList<String> arrayList, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(" where ( status=0) ");
        sb.append(" AND (");
        if (arrayList != null && arrayList.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 != 0) {
                    sb.append(" OR ");
                }
                sb.append("card_tp_id");
                sb.append(" = '" + arrayList.get(i2) + "' ");
            }
            sb.append(")");
            sb.append(" AND (");
        }
        sb.append("categoryType");
        sb.append(" = '" + i + "'");
        sb.append(")");
        boolean execSQL = this.f128213d.execSQL("ShareCardInfo", "update ShareCardInfo set categoryType = '0' , itemIndex = '0' " + sb.toString());
        Log.m105924i("MicroMsg.ShareCardInfoStorage", "resetCategoryInfo updateRet is " + (execSQL ? 1 : 0));
        return execSQL;
    }

    /* renamed from: qq */
    public int mo72545qq(String str) {
        Log.m105924i("MicroMsg.ShareCardInfoStorage", "getNormalCount()");
        StringBuilder sb = new StringBuilder();
        sb.append(" where ( status=0) ");
        sb.append(" AND (card_tp_id = '" + str + "' )");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("select count(*) from ShareCardInfo");
        sb4.append(sb.toString());
        Cursor rawQuery = this.f128213d.rawQuery(sb4.toString(), (String[]) null, 2);
        int i = 0;
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.ShareCardInfoStorage", "getNormalCount(), cursor == null");
            return 0;
        }
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }
}
