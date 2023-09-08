package com.tencent.thumbplayer.tplayer.reportv2;

import android.content.Context;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.capability.TPCapability;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams;
import com.tencent.thumbplayer.utils.TPNetWorkUtils;
import com.tencent.thumbplayer.utils.TPNetworkChangeMonitor;
import java.util.HashMap;
import java.util.Map;

public class TPReportUtils implements TPNetworkChangeMonitor.OnNetStatusChangeListener {
    private static final int DEVICE_TYPE = 0;
    private static final int INIT_SEQ = 0;
    private static final String OS_VERSION = String.format("android %s", new Object[]{TPSystemInfo.getOsVersion()});
    private static final int PLATFORM_TYPE = 0;
    private static final Map<Integer, Integer> REPORT_DRM_TYPE;
    private static final Map<Integer, Integer> REPORT_PLAYER_TYPE;
    public static final String REPORT_PROTOCOL_VERSION = "1.0.0";
    private static final String TAG = "TPReportUtils";
    private Context mContext;

    static {
        HashMap hashMap = new HashMap();
        REPORT_PLAYER_TYPE = hashMap;
        hashMap.put(0, -1);
        hashMap.put(1, 0);
        hashMap.put(2, 3);
        hashMap.put(3, 3);
        HashMap hashMap2 = new HashMap();
        REPORT_DRM_TYPE = hashMap2;
        hashMap2.put(-1, -1);
        hashMap2.put(0, 32);
        hashMap2.put(2, 4);
    }

    public TPReportUtils(Context context) {
        this.mContext = context;
        TPNetworkChangeMonitor.getInstance().addOnNetStatusChangeListener(this);
    }

    public static int convertTPDRMTypeToReportDrmType(@TPCommonEnum.TP_DRM_TYPE int i) {
        Integer num = REPORT_DRM_TYPE.get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public static int convertTPPlayerTypeToReportPlayerEnum(int i) {
        Integer num = REPORT_PLAYER_TYPE.get(Integer.valueOf(i));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private int getDrmAbility() {
        int i = 0;
        for (int convertTPDRMTypeToReportDrmType : TPCapability.getDRMCapabilities()) {
            i |= convertTPDRMTypeToReportDrmType(convertTPDRMTypeToReportDrmType);
        }
        return i;
    }

    public void initDeviceParams(TPCommonParams tPCommonParams) {
        tPCommonParams.setGuid(TPPlayerConfig.getGuid());
        tPCommonParams.setPlatformType(0);
        tPCommonParams.setDeviceType(0);
        tPCommonParams.setNetworkType(TPNetWorkUtils.getNetWorkClass(this.mContext));
        tPCommonParams.setDeviceName(TPSystemInfo.getDeviceName());
        tPCommonParams.setOsVersion(OS_VERSION);
        tPCommonParams.setAppName(this.mContext.getPackageName());
        tPCommonParams.setAppVer(TPPlayerConfig.getAppVersionName(this.mContext));
        tPCommonParams.setReportProtocolVer("1.0.0");
        tPCommonParams.setPlayerVer(TPPlayerConfig.VERSION);
        tPCommonParams.setPlatform(TPPlayerConfig.getPlatform());
        tPCommonParams.setSeq(0);
        tPCommonParams.setDrmAbility(getDrmAbility());
    }

    public void onStatusChanged(int i, int i2, int i3, int i4) {
        TPNetWorkUtils.onNetworkChange(this.mContext);
    }

    public void updateCommonParams(TPCommonParams tPCommonParams) {
        tPCommonParams.setNetworkType(TPNetWorkUtils.getNetWorkClass(this.mContext));
    }
}
