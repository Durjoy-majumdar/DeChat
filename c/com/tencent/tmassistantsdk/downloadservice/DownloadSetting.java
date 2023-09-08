package com.tencent.tmassistantsdk.downloadservice;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.storage.table.DownloadSettingTable;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.HashMap;

public class DownloadSetting {
    public static final String ISDOWNLOADWIFIONLY = "isDownloadWifiOnly";
    public static final String ISTASKAUTORESUME = "isTaskAutoResume";
    public static final String MAXTASKNUM = "maxTaskNum";
    private static final String TAG = "DownloadSetting";
    public static final String TYPE_BOOLEAN = "boolean";
    public static final String TYPE_INTEGER = "Integer";
    public static DownloadSetting mInstance;
    public boolean isDownloadWifiOnly = false;
    public boolean isTaskAutoResume = true;
    public int maxTaskNum = 5;

    public DownloadSetting() {
        loadFromDB();
    }

    public static synchronized DownloadSetting getInstance() {
        DownloadSetting downloadSetting;
        synchronized (DownloadSetting.class) {
            if (mInstance == null) {
                mInstance = new DownloadSetting();
            }
            downloadSetting = mInstance;
        }
        return downloadSetting;
    }

    public static int getSplitSizeInBytes(String str) {
        if (!str.equalsIgnoreCase("WIFI")) {
            return (!str.contains("net") && str.contains("wap")) ? Downloads.SPLIT_RANGE_SIZE_WAP : Downloads.SPLIT_RANGE_SIZE_NET;
        }
        throw new UnsupportedOperationException("Split is not allowed in current version. netType: " + str);
    }

    private void loadFromDB() {
        HashMap<String, String> query = DownloadSettingTable.query();
        String str = query.get(ISTASKAUTORESUME);
        if (str != null && str.length() > 0) {
            this.isTaskAutoResume = !str.equals("false");
        }
        String str2 = query.get(ISDOWNLOADWIFIONLY);
        if (str2 != null && str2.length() > 0) {
            this.isDownloadWifiOnly = !str2.equals("false");
        }
        String str3 = query.get(MAXTASKNUM);
        if (str3 != null && str3.length() > 0) {
            this.maxTaskNum = Util.getInt(str3, 0);
        }
    }

    public boolean getIsDownloadWifiOnly() {
        return this.isDownloadWifiOnly;
    }

    public boolean getIsTaskAutoResume() {
        return this.isTaskAutoResume;
    }

    public int getMaxTaskNum() {
        return this.maxTaskNum;
    }

    public boolean isAutoDownload() {
        if (!this.isTaskAutoResume) {
            return false;
        }
        String netStatus = DownloadHelper.getNetStatus();
        return netStatus.contains("wifi") || netStatus.contains("net");
    }

    public void setIsDownloadWifiOnly(boolean z) {
        DownloadSetting downloadSetting = mInstance;
        if (downloadSetting.isDownloadWifiOnly != z) {
            downloadSetting.isDownloadWifiOnly = z;
            DownloadSettingTable.save(ISDOWNLOADWIFIONLY, String.valueOf(z), TYPE_BOOLEAN);
        }
    }

    public void setIsTaskAutoResume(boolean z) {
        DownloadSetting downloadSetting = mInstance;
        if (downloadSetting.isTaskAutoResume != z) {
            downloadSetting.isTaskAutoResume = z;
            DownloadSettingTable.save(ISTASKAUTORESUME, String.valueOf(z), TYPE_BOOLEAN);
        }
    }

    public void setMaxTaskNum(int i) {
        DownloadSetting downloadSetting = mInstance;
        if (downloadSetting.maxTaskNum != i) {
            downloadSetting.maxTaskNum = i;
            DownloadSettingTable.save(MAXTASKNUM, String.valueOf(i), TYPE_INTEGER);
        }
    }

    public boolean isAutoDownload(String str, String str2) {
        TMLog.m164114i(TAG, "downloadInfoNetType = " + str);
        TMLog.m164114i(TAG, "currentNetType = " + str2);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str2.equalsIgnoreCase("WIFI")) {
            return true;
        }
        if (!str2.contains("net") || str.equalsIgnoreCase("WIFI")) {
            return false;
        }
        return true;
    }
}
