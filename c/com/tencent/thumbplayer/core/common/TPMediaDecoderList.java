package com.tencent.thumbplayer.core.common;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import com.tencent.thumbplayer.core.thirdparties.LocalCache;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public final class TPMediaDecoderList {
    private static final int GET_SYSTEM_MEDIA_CODEC_LIST_TIMEOUT_MS = 2000;
    private static final String MEDIA_DECODER_INFO_KEY = "DecoderInfos_Key";
    private static String MEDIA_DECODER_VERSION = "2.33.0.1016.wechat";
    private static final String MEDIA_DECODER_VERSION_KEY = "Version_Key";
    private static final String TAG = "TPMediaDecoderList";
    private static TPMediaDecoderInfo[] sDecoderInfos;

    private static String buildCacheDecoderVersion() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(MEDIA_DECODER_VERSION);
        stringBuffer.append("_");
        stringBuffer.append(TPSystemInfo.getDeviceName());
        stringBuffer.append("_");
        stringBuffer.append(TPSystemInfo.getProductBoard());
        stringBuffer.append("_");
        stringBuffer.append(TPSystemInfo.getProductDevice());
        stringBuffer.append("_");
        stringBuffer.append(TPSystemInfo.getApiLevel());
        return stringBuffer.toString();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void cacheDecoderInfos(com.tencent.thumbplayer.core.thirdparties.LocalCache r1, com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] r2) {
        /*
            java.lang.String r0 = "DecoderInfos_Key"
            r1.put((java.lang.String) r0, (java.io.Serializable) r2)     // Catch:{ all -> 0x0006 }
            goto L_0x000e
        L_0x0006:
            r1 = 4
            java.lang.String r2 = "TPMediaDecoderList"
            java.lang.String r0 = "cache decode infos failed"
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r2, r0)
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPMediaDecoderList.cacheDecoderInfos(com.tencent.thumbplayer.core.thirdparties.LocalCache, com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[]):void");
    }

    private static void cacheVersion(LocalCache localCache, String str) {
        try {
            localCache.put(MEDIA_DECODER_VERSION_KEY, str);
        } catch (Throwable unused) {
            TPNativeLog.printLog(4, TAG, "cache version failed");
        }
    }

    private static TPMediaDecoderInfo[] getCachedDecoderInfos(LocalCache localCache) {
        try {
            return (TPMediaDecoderInfo[]) localCache.getAsObject(MEDIA_DECODER_INFO_KEY);
        } catch (Throwable unused) {
            TPNativeLog.printLog(4, TAG, "get decoder info failed");
            return null;
        }
    }

    private static String getCachedVersion(LocalCache localCache) {
        try {
            String asString = localCache.getAsString(MEDIA_DECODER_VERSION_KEY);
            TPNativeLog.printLog(2, TAG, "version:" + asString);
            return asString;
        } catch (Throwable unused) {
            TPNativeLog.printLog(4, TAG, "get version failed");
            return null;
        }
    }

    private static final MediaCodecInfo[] getCodecInfos() {
        try {
            return new MediaCodecList(1).getCodecInfos();
        } catch (Exception e) {
            TPNativeLog.printLog(4, "getCodecInfos MediaCodecList " + e.getMessage());
            return new MediaCodecInfo[0];
        }
    }

    private static final TPMediaDecoderInfo[] getLocalCacheMediaCodecList(LocalCache localCache) {
        TPMediaDecoderInfo[] cachedDecoderInfos;
        TPNativeLog.printLog(2, "getLocalCacheMediaCodecList");
        if (!TextUtils.equals(getCachedVersion(localCache), buildCacheDecoderVersion()) || (cachedDecoderInfos = getCachedDecoderInfos(localCache)) == null) {
            return null;
        }
        TPNativeLog.printLog(2, "getCachedDecoderInfos length " + cachedDecoderInfos.length);
        return cachedDecoderInfos;
    }

    /* access modifiers changed from: private */
    public static TPMediaDecoderInfo[] getSystemMediaCodecList() {
        TPNativeLog.printLog(2, "getSystemMediaCodecList");
        MediaCodecInfo[] codecInfos = getCodecInfos();
        if (codecInfos == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    TPMediaDecoderInfo tPMediaDecoderInfo = new TPMediaDecoderInfo(str, mediaCodecInfo.getName(), mediaCodecInfo.getCapabilitiesForType(str));
                    if (tPMediaDecoderInfo.isValidDecoder()) {
                        TPNativeLog.printLog(2, "MediaCodecList codecName " + mediaCodecInfo.getName() + " supportedType " + str);
                        arrayList.add(tPMediaDecoderInfo);
                    }
                }
            }
        }
        return (TPMediaDecoderInfo[]) arrayList.toArray(new TPMediaDecoderInfo[arrayList.size()]);
    }

    private static TPMediaDecoderInfo[] getSystemMediaCodecListAsyncAndTimeOutWait() {
        boolean z;
        final TPMediaDecoderInfo[][] tPMediaDecoderInfoArr = (TPMediaDecoderInfo[][]) Array.newInstance(TPMediaDecoderInfo.class, new int[]{1, 1});
        tPMediaDecoderInfoArr[0] = null;
        final boolean[] zArr = {false};
        new Thread(new Runnable() {
            public void run() {
                tPMediaDecoderInfoArr[0] = TPMediaDecoderList.getSystemMediaCodecList();
                synchronized (tPMediaDecoderInfoArr) {
                    zArr[0] = true;
                    tPMediaDecoderInfoArr.notify();
                }
            }
        }).start();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (tPMediaDecoderInfoArr) {
            z = false;
            for (long j = 2000; j > 0; j -= System.currentTimeMillis() - currentTimeMillis) {
                if (zArr[0]) {
                    break;
                }
                try {
                    tPMediaDecoderInfoArr.wait(j);
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        TPMediaDecoderInfo[] tPMediaDecoderInfoArr2 = tPMediaDecoderInfoArr[0];
        return tPMediaDecoderInfoArr2 == null ? new TPMediaDecoderInfo[0] : tPMediaDecoderInfoArr2;
    }

    public static final synchronized TPMediaDecoderInfo[] getTPMediaDecoderInfos(LocalCache localCache) {
        TPMediaDecoderInfo[] tPMediaDecoderInfoArr;
        synchronized (TPMediaDecoderList.class) {
            if (sDecoderInfos == null || localCache == null) {
                sDecoderInfos = initCodecList(localCache);
            }
            TPMediaDecoderInfo[] tPMediaDecoderInfoArr2 = sDecoderInfos;
            tPMediaDecoderInfoArr = (TPMediaDecoderInfo[]) Arrays.copyOf(tPMediaDecoderInfoArr2, tPMediaDecoderInfoArr2.length);
        }
        return tPMediaDecoderInfoArr;
    }

    private static final TPMediaDecoderInfo[] initCodecList(LocalCache localCache) {
        TPMediaDecoderInfo[] localCacheMediaCodecList = getLocalCacheMediaCodecList(localCache);
        if (localCacheMediaCodecList != null && localCacheMediaCodecList.length != 0) {
            return localCacheMediaCodecList;
        }
        TPMediaDecoderInfo[] systemMediaCodecListAsyncAndTimeOutWait = getSystemMediaCodecListAsyncAndTimeOutWait();
        storeLocalCacheMediaCodecList(localCache, systemMediaCodecListAsyncAndTimeOutWait);
        return systemMediaCodecListAsyncAndTimeOutWait;
    }

    private static final void storeLocalCacheMediaCodecList(LocalCache localCache, TPMediaDecoderInfo[] tPMediaDecoderInfoArr) {
        TPNativeLog.printLog(2, "storeLocalCacheMediaCodecList");
        cacheDecoderInfos(localCache, tPMediaDecoderInfoArr);
        cacheVersion(localCache, buildCacheDecoderVersion());
    }
}
