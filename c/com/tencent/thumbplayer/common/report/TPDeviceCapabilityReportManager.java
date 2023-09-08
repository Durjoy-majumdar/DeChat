package com.tencent.thumbplayer.common.report;

import com.tencent.thumbplayer.api.TPNativeException;
import com.tencent.thumbplayer.api.capability.TPCapability;
import com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet;
import com.tencent.thumbplayer.common.report.TPDeviceCapabilityReportParameters;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPProperties;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.util.UUID;

public class TPDeviceCapabilityReportManager {
    private static final String COMMON_DEVICE_CAP_EVENT = "tp_common_device_cap";
    private static final String TAG = "TPDeviceCapabilityReportManager";

    private void CommonCapabilityReport() {
        TPDeviceCapabilityReportParameters tPDeviceCapabilityReportParameters = new TPDeviceCapabilityReportParameters();
        TPProperties tPProperties = new TPProperties();
        commonParamsCollect(tPDeviceCapabilityReportParameters.getCommonParams(), tPProperties);
        av1DecoderCapabilityCollect(tPDeviceCapabilityReportParameters.getAV1DecoderParams(), tPProperties);
        vp9DecoderCapabilityCollect(tPDeviceCapabilityReportParameters.getVP9DecoderParams(), tPProperties);
        vp8DecoderCapabilityCollect(tPDeviceCapabilityReportParameters.getVP8DecoderParams(), tPProperties);
        hevcDecoderCapabilityCollect(tPDeviceCapabilityReportParameters.getHEVCDecoderParams(), tPProperties);
        TPLogUtil.m21897i(TAG, "device capability report:" + tPProperties.toString());
        TPBeaconReportWrapper.trackCustomKVEvent(COMMON_DEVICE_CAP_EVENT, (ITPReportProperties) tPProperties);
    }

    private void av1DecoderCapabilityCollect(TPDeviceCapabilityReportParameters.AV1DecoderParams aV1DecoderParams, ITPReportProperties iTPReportProperties) {
        TPVCodecCapabilityForGet aV1MaxCapability = getAV1MaxCapability();
        if (aV1MaxCapability != null) {
            aV1DecoderParams.av1HWDecoderProfile = aV1MaxCapability.getMaxProfile();
            aV1DecoderParams.av1HWDecoderLevel = aV1MaxCapability.getMaxLevel();
        }
        aV1DecoderParams.paramsToProperties(iTPReportProperties);
    }

    private void commonParamsCollect(TPDeviceCapabilityReportParameters.CommonParams commonParams, ITPReportProperties iTPReportProperties) {
        commonParams.apiLevel = TPSystemInfo.SDK_INT;
        commonParams.flowId = UUID.randomUUID().toString() + System.nanoTime() + "_" + TPPlayerConfig.getPlatform();
        commonParams.platform = TPPlayerConfig.getPlatform();
        commonParams.osVer = String.format("Android %s", new Object[]{TPSystemInfo.getOsVersion()});
        commonParams.model = String.format("%s_%s", new Object[]{TPSystemInfo.getDeviceManufacturer(), TPSystemInfo.getDeviceName()});
        commonParams.cpuName = TPSystemInfo.getCpuHarewareName();
        commonParams.paramsToProperties(iTPReportProperties);
    }

    private static TPVCodecCapabilityForGet getAV1MaxCapability() {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGet;
        try {
            tPVCodecCapabilityForGet = TPCapability.getThumbPlayerVCodecTypeMaxCapability(1029, 102);
        } catch (TPNativeException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            tPVCodecCapabilityForGet = null;
        }
        if (tPVCodecCapabilityForGet == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return tPVCodecCapabilityForGet;
    }

    private static TPVCodecCapabilityForGet getHEVCMaxCapability() {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGet;
        try {
            tPVCodecCapabilityForGet = TPCapability.getThumbPlayerVCodecTypeMaxCapability(172, 102);
        } catch (TPNativeException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            tPVCodecCapabilityForGet = null;
        }
        if (tPVCodecCapabilityForGet == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return tPVCodecCapabilityForGet;
    }

    private static TPVCodecCapabilityForGet getVP8MaxCapability() {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGet;
        try {
            tPVCodecCapabilityForGet = TPCapability.getThumbPlayerVCodecTypeMaxCapability(138, 102);
        } catch (TPNativeException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            tPVCodecCapabilityForGet = null;
        }
        if (tPVCodecCapabilityForGet == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return tPVCodecCapabilityForGet;
    }

    private static TPVCodecCapabilityForGet getVP9MaxCapability() {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGet;
        try {
            tPVCodecCapabilityForGet = TPCapability.getThumbPlayerVCodecTypeMaxCapability(166, 102);
        } catch (TPNativeException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            tPVCodecCapabilityForGet = null;
        }
        if (tPVCodecCapabilityForGet == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return tPVCodecCapabilityForGet;
    }

    private void hevcDecoderCapabilityCollect(TPDeviceCapabilityReportParameters.HEVCDecoderParams hEVCDecoderParams, ITPReportProperties iTPReportProperties) {
        TPVCodecCapabilityForGet hEVCMaxCapability = getHEVCMaxCapability();
        if (hEVCMaxCapability != null) {
            hEVCDecoderParams.hevcHWDecoderProfile = hEVCMaxCapability.getMaxProfile();
            hEVCDecoderParams.hevcHWDecoderLevel = hEVCMaxCapability.getMaxLevel();
        }
        hEVCDecoderParams.paramsToProperties(iTPReportProperties);
    }

    private void vp8DecoderCapabilityCollect(TPDeviceCapabilityReportParameters.VP8DecoderParams vP8DecoderParams, ITPReportProperties iTPReportProperties) {
        TPVCodecCapabilityForGet vP8MaxCapability = getVP8MaxCapability();
        if (vP8MaxCapability != null) {
            vP8DecoderParams.vp8HWDecoderProfile = vP8MaxCapability.getMaxProfile();
            vP8DecoderParams.vp8HWDecoderLevel = vP8MaxCapability.getMaxLevel();
        }
        vP8DecoderParams.paramsToProperties(iTPReportProperties);
    }

    private void vp9DecoderCapabilityCollect(TPDeviceCapabilityReportParameters.VP9DecoderParams vP9DecoderParams, ITPReportProperties iTPReportProperties) {
        TPVCodecCapabilityForGet vP9MaxCapability = getVP9MaxCapability();
        if (vP9MaxCapability != null) {
            vP9DecoderParams.vp9HWDecoderProfile = vP9MaxCapability.getMaxProfile();
            vP9DecoderParams.vp9HWDecoderLevel = vP9MaxCapability.getMaxLevel();
        }
        vP9DecoderParams.paramsToProperties(iTPReportProperties);
    }

    public void reportAsync() {
        TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() {
            public void run() {
                TPDeviceCapabilityReportManager.this.reportSync();
            }
        });
    }

    public void reportSync() {
        CommonCapabilityReport();
    }
}
