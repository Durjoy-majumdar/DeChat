package os2;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import ao2.C79617c;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import f40.C86709a0;
import i40.C60247c;
import iu2.C60631e;
import iu2.C98802d;
import java.util.HashMap;
import p749xh.C102646h;
import vr2.C102236a0;

/* renamed from: os2.j */
public class C100407j extends MAutoStorage<AdSnsInfo> {

    /* renamed from: e */
    public static final String[] f294134e = {MAutoStorage.getCreateSQLs(AdSnsInfo.info, "adsnsinfo")};

    /* renamed from: f */
    public static final String[] f294135f = {"CREATE INDEX IF NOT EXISTS serverAdSnsNameIndex ON AdSnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverAdSnsTimeHeadIndex ON AdSnsInfo ( head )", "DROP INDEX IF EXISTS serverAdSnsTimeIndex", "DROP INDEX IF EXISTS serverAdSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex1 ON AdSnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex2 ON AdSnsInfo ( sourceType,type,userName)"};

    /* renamed from: d */
    public ISQLiteDatabase f294136d;

    static {
        String.format("select  %s %s,rowid from AdSnsInfo ", new Object[]{"snsId", "createTime"});
    }

    public C100407j(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, AdSnsInfo.info, "adsnsinfo", f294135f);
        this.f294136d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public Cursor mo139860Lo(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getAdInTime", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        String str = ("select *,rowid from AdSnsInfo  where createTime > " + i2 + " and " + "createTime" + " <= " + i + " and " + C100400e0.f294107z) + " order by  createTime desc";
        Log.m105918d("MicroMsg.AdSnsInfoStorage", "getAdInTime " + str);
        Cursor rawQuery = this.f294136d.rawQuery(str, (String[]) null, 2);
        SnsMethodCalculate.markEndTimeMs("getAdInTime", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return rawQuery;
    }

    /* renamed from: Ow */
    public boolean mo139861Ow(long j, AdSnsInfo adSnsInfo) {
        int i;
        SnsMethodCalculate.markStartTimeMs("replaceUserByPcId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        if (mo139862Yt(j)) {
            boolean bD = mo139863bD(j, adSnsInfo);
            SnsMethodCalculate.markEndTimeMs("replaceUserByPcId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            return bD;
        }
        Log.m105924i("MicroMsg.AdSnsInfoStorage", "added PcId " + j);
        SnsMethodCalculate.markStartTimeMs("set", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        Log.m105918d("MicroMsg.AdSnsInfoStorage", "SnsInfo Insert");
        if (adSnsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            i = -1;
        } else {
            i = (int) this.f294136d.insert(C102646h.TABLE_NAME, "", adSnsInfo.convertTo());
            Log.m105918d("MicroMsg.AdSnsInfoStorage", "SnsInfo Insert result" + i);
            SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        }
        boolean z = i != -1;
        SnsMethodCalculate.markEndTimeMs("replaceUserByPcId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return z;
    }

    /* renamed from: Yt */
    public boolean mo139862Yt(long j) {
        SnsMethodCalculate.markStartTimeMs("isPcIdExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        Cursor rawQuery = this.f294136d.rawQuery("select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=" + j, (String[]) null, 2);
        boolean moveToFirst = rawQuery.moveToFirst();
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("isPcIdExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return moveToFirst;
    }

    /* renamed from: bD */
    public boolean mo139863bD(long j, AdSnsInfo adSnsInfo) {
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        ContentValues convertTo = adSnsInfo.convertTo();
        convertTo.remove("rowid");
        ISQLiteDatabase iSQLiteDatabase = this.f294136d;
        boolean z = true;
        if (iSQLiteDatabase.update(C102646h.TABLE_NAME, convertTo, "snsId=?", new String[]{"" + j}) <= 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return z;
    }

    public boolean delete(long j) {
        C39622i0 a;
        SnsMethodCalculate.markStartTimeMs("delete", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        String q0 = C102236a0.m134765q0(j);
        HashMap<String, HashMap<String, String>> hashMap = C79617c.f233467a;
        SnsMethodCalculate.markStartTimeMs("delAd", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!TextUtils.isEmpty(q0)) {
                synchronized (C79617c.f233467a) {
                    C79617c.f233467a.remove(q0);
                    MultiProcessMMKV.getMMKV("sns_ad_mmkv").edit().remove(q0).apply();
                }
            }
            Log.m105924i("SnsAdLocalStoreage", "delAd, snsId=" + q0 + ", cost=" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            Log.m105920e("SnsAdLocalStoreage", "delAd, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("delAd", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        Class cls = C60631e.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        ((C98802d) ((C60631e) a).mo85233d3(C98802d.class)).mo138175e3(j, StorageEventId.getDELETE());
        ISQLiteDatabase iSQLiteDatabase = this.f294136d;
        boolean z = true;
        int delete = iSQLiteDatabase.delete(C102646h.TABLE_NAME, "snsId=?", new String[]{"" + j});
        Log.m105924i("MicroMsg.AdSnsInfoStorage", "del msg " + j + " res " + delete);
        if (delete <= 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("delete", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return z;
    }

    /* renamed from: jo */
    public AdSnsInfo mo139864jo(long j) {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        AdSnsInfo adSnsInfo = new AdSnsInfo();
        Cursor rawQuery = this.f294136d.rawQuery("select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=" + j, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            adSnsInfo.convertFrom(rawQuery);
            rawQuery.close();
            SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            return adSnsInfo;
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return null;
    }

    /* renamed from: qq */
    public AdSnsInfo mo139865qq(int i) {
        SnsMethodCalculate.markStartTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        AdSnsInfo adSnsInfo = new AdSnsInfo();
        Cursor rawQuery = this.f294136d.rawQuery("select *,rowid from AdSnsInfo  where AdSnsInfo.rowid=" + i, (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            adSnsInfo.convertFrom(rawQuery);
            rawQuery.close();
            SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            return adSnsInfo;
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return null;
    }

    public /* bridge */ /* synthetic */ boolean update(long j, IAutoDBItem iAutoDBItem) {
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        boolean bD = mo139863bD(j, (AdSnsInfo) iAutoDBItem);
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return bD;
    }
}
