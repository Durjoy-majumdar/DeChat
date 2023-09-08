package com.tencent.p014mm.kara.feature.feature.comm;

import android.media.AudioManager;
import android.provider.Settings;
import com.tencent.mars.comm.PlatformComm;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f30.C86704a;
import java.util.Calendar;
import java.util.Date;
import o30.C89112b;
import p933be.C113159b;
import q30.C100982b;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.DeviceFeatureGroup */
public class DeviceFeatureGroup extends C89112b {
    @C86704a
    public int[] audioPort;
    @C86704a
    public float batteryLevel;
    @C86704a
    public int[] batteryState;
    @C86704a
    public float capacityOfDeviceStorageInMB;
    @C86704a
    public int[] dayOfTheWeek;
    @C86704a
    public float downloadSpeedInMBPerSeconds;
    @C86704a
    public float freeSpaceOfDeviceStorageInMB;
    @C86704a
    public int[] hourOfTheDay;
    @C86704a
    public int lowPowerMode;
    @C86704a
    public int[] network;
    @C86704a
    public float outputVolumn;
    @C86704a
    public float proportionOfChatHistories;
    @C86704a
    public float proportionOfFreeSpace;
    @C86704a
    public float proportionOfWeChatData;
    @C86704a
    public float screenBrightness;
    @C86704a
    public float sizeOfChatHistoriesInMB;
    @C86704a
    public float sizeOfWeChatDataInMB;
    @C86704a
    public int[] thermalState;

    public void build() {
        super.build();
        int i = C100982b.f295706e;
        this.batteryLevel = (float) C113159b.m154842h().mo165664a().mo165677b();
        int[] iArr = new int[3];
        C113159b.C113163c a = C113159b.m154842h().mo165664a();
        if (a.mo165677b() == 100) {
            iArr[0] = 1;
        } else if (a.mo165678c()) {
            iArr[1] = 1;
        } else {
            iArr[2] = 1;
        }
        this.batteryState = iArr;
        int statisticsNetType = PlatformComm.C2Java.getStatisticsNetType();
        int[] iArr2 = new int[6];
        if (statisticsNetType == -1) {
            iArr2[0] = 1;
        } else if (statisticsNetType == 1) {
            iArr2[1] = 1;
        } else if (statisticsNetType == 7) {
            iArr2[5] = 1;
        } else if (statisticsNetType == 3) {
            iArr2[2] = 1;
        } else if (statisticsNetType == 4) {
            iArr2[3] = 1;
        } else if (statisticsNetType == 5) {
            iArr2[4] = 1;
        }
        this.network = iArr2;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(currentTimeMillis));
        int[] iArr3 = new int[7];
        iArr3[instance.get(7) - 1] = 1;
        this.dayOfTheWeek = iArr3;
        long currentTimeMillis2 = System.currentTimeMillis();
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date(currentTimeMillis2));
        int[] iArr4 = new int[24];
        iArr4[instance2.get(11)] = 1;
        this.hourOfTheDay = iArr4;
        C113159b.m154842h().mo165664a().mo165680e();
        this.lowPowerMode = 0;
        AudioManager audioManager = (AudioManager) MMApplicationContext.getContext().getSystemService("audio");
        this.outputVolumn = ((float) audioManager.getStreamVolume(1)) / ((float) audioManager.getStreamMaxVolume(1));
        this.screenBrightness = (float) Settings.System.getInt(MMApplicationContext.getContext().getContentResolver(), "screen_brightness", 0);
    }

    public String getName() {
        return TPReportKeys.Common.COMMON_DEVICE_NAME;
    }
}
