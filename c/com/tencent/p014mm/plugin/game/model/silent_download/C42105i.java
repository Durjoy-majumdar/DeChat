package com.tencent.p014mm.plugin.game.model.silent_download;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: com.tencent.mm.plugin.game.model.silent_download.i */
public class C42105i extends MAutoStorage<C42103f> {

    /* renamed from: d */
    public static final String[] f113414d = {MAutoStorage.getCreateSQLs(C42103f.f113413Y, "GameSilentDownload")};

    public C42105i(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C42103f.f113413Y, "GameSilentDownload", (String[]) null);
    }

    /* renamed from: Lo */
    public boolean mo66058Lo(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "updateBatteryState: appid is null");
            return false;
        }
        C42103f jo = mo66064jo(str);
        if (jo == null) {
            return false;
        }
        jo.field_lowBattery = false;
        boolean update = super.update(jo, new String[0]);
        Log.m105925i("MicroMsg.GameSilentDownloadStorage", "updateBatteryState, ret:%b", Boolean.valueOf(update));
        return update;
    }

    /* renamed from: Ow */
    public boolean mo66059Ow(String str, long j) {
        if (Util.isNullOrNil(str) || j < 0) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "updateNextCheckTime: appid is null");
            return false;
        }
        boolean execSQL = execSQL("GameSilentDownload", String.format("update %s set %s=%s where %s='%s'", new Object[]{"GameSilentDownload", "nextCheckTime", String.valueOf(j), "appId", str}));
        Log.m105925i("MicroMsg.GameSilentDownloadStorage", "updateNextCheckTime ret:%b", Boolean.valueOf(execSQL));
        return execSQL;
    }

    /* renamed from: SE */
    public boolean mo66060SE(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "updateSdcardSpaceState: appid is null");
            return false;
        }
        C42103f jo = mo66064jo(str);
        if (jo == null) {
            return false;
        }
        jo.field_noEnoughSpace = false;
        boolean update = super.update(jo, new String[0]);
        Log.m105925i("MicroMsg.GameSilentDownloadStorage", "updateSdcardSpaceState, ret:%b", Boolean.valueOf(update));
        return update;
    }

    /* renamed from: TE */
    public boolean mo66061TE(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "updateWifiState: appid is null");
            return false;
        }
        C42103f jo = mo66064jo(str);
        if (jo == null) {
            return false;
        }
        jo.field_noWifi = false;
        boolean update = super.update(jo, new String[0]);
        Log.m105925i("MicroMsg.GameSilentDownloadStorage", "updateWifiState, ret:%b", Boolean.valueOf(update));
        return update;
    }

    /* renamed from: Yt */
    public boolean mo66062Yt(String str, int i) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "updateForceUpdateFlag: appid is null");
            return false;
        }
        C42103f jo = mo66064jo(str);
        if (jo == null) {
            return false;
        }
        jo.field_forceUpdateFlag = i;
        boolean update = super.update(jo, new String[0]);
        Log.m105925i("MicroMsg.GameSilentDownloadStorage", "updateForceUpdateFlag, ret:%b", Boolean.valueOf(update));
        return update;
    }

    /* renamed from: bD */
    public boolean mo66063bD(String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "updateRunningState: appid is null");
            return false;
        }
        C42103f jo = mo66064jo(str);
        if (jo == null) {
            return false;
        }
        jo.field_isRunning = z;
        boolean update = super.update(jo, new String[0]);
        Log.m105925i("MicroMsg.GameSilentDownloadStorage", "updateRunningState, ret:%b", Boolean.valueOf(update));
        return update;
    }

    /* renamed from: jo */
    public C42103f mo66064jo(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfo: appid is null");
            return null;
        }
        Cursor rawQuery = rawQuery(String.format("select * from %s where %s=?", new Object[]{"GameSilentDownload", "appId"}), str);
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "cursor is null");
            return null;
        } else if (rawQuery.moveToFirst()) {
            C42103f fVar = new C42103f();
            fVar.convertFrom(rawQuery);
            rawQuery.close();
            return fVar;
        } else {
            Log.m105925i("MicroMsg.GameSilentDownloadStorage", "getDownloadInfo appid:%s, no record in DB", str);
            rawQuery.close();
            return null;
        }
    }

    /* renamed from: kD */
    public boolean mo66065kD(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "updateSdcardAvailableState: appid is null");
            return false;
        }
        C42103f jo = mo66064jo(str);
        if (jo == null) {
            return false;
        }
        jo.field_noSdcard = false;
        boolean update = super.update(jo, new String[0]);
        Log.m105925i("MicroMsg.GameSilentDownloadStorage", "updateSdcardAvailableState, ret:%b", Boolean.valueOf(update));
        return update;
    }

    /* renamed from: qq */
    public boolean mo66066qq(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.GameSilentDownloadStorage", "updateDelayState: appid is null");
            return false;
        }
        C42103f jo = mo66064jo(str);
        if (jo == null) {
            return false;
        }
        jo.field_continueDelay = false;
        boolean update = super.update(jo, new String[0]);
        Log.m105925i("MicroMsg.GameSilentDownloadStorage", "updateDelayState, ret:%b", Boolean.valueOf(update));
        return update;
    }
}
