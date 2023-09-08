package com.tencent.thumbplayer.core.downloadproxy.client;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TPDownloadProxyClient implements ITPDownloadProxy {
    private static final String FILE_NAME = "TPDownloadProxyClient";
    private ITPDownloadProxyAidl downloadProxyAidl;

    public TPDownloadProxyClient(ITPDownloadProxyAidl iTPDownloadProxyAidl) {
        this.downloadProxyAidl = iTPDownloadProxyAidl;
    }

    public int checkResourceStatus(String str, String str2, int i) {
        try {
            return this.downloadProxyAidl.checkResourceStatus(str, str2, i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th.toString());
            return -1;
        }
    }

    public int clearCache(String str, String str2, int i) {
        try {
            return this.downloadProxyAidl.clearCache(str, str2, i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "clearCache failed, error:" + th.toString());
            return -1;
        }
    }

    public int deinit() {
        return 0;
    }

    public String getClipPlayUrl(int i, int i2, int i3) {
        try {
            return this.downloadProxyAidl.getClipPlayUrl(i, i2, i3);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getClipPlayUrl failed, error:" + th.toString());
            return null;
        }
    }

    public String getNativeInfo(int i) {
        try {
            return this.downloadProxyAidl.getNativeInfo(i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th.toString());
            return null;
        }
    }

    public String getPlayErrorCodeStr(int i) {
        try {
            return this.downloadProxyAidl.getPlayErrorCodeStr(i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayErrorCodeStr failed, error:" + th.toString());
            return null;
        }
    }

    public String getPlayUrl(int i, int i2) {
        try {
            return this.downloadProxyAidl.getPlayUrl(i, i2);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayUrl failed, error:" + th.toString());
            return null;
        }
    }

    public long getResourceSize(String str, String str2) {
        try {
            return this.downloadProxyAidl.getResourceSize(str, str2);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceSize failed, error:" + th.toString());
            return -1;
        }
    }

    public int init(Context context, TPDLProxyInitParam tPDLProxyInitParam) {
        String serialize = TPDLProxyUtils.serialize(tPDLProxyInitParam);
        if (TextUtils.isEmpty(serialize)) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "param is null");
            return -1;
        }
        try {
            return this.downloadProxyAidl.init(serialize);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "init failed, error:" + th.toString());
            return -2;
        }
    }

    public int pauseDownload(int i) {
        try {
            return this.downloadProxyAidl.pauseDownload(i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "pauseDownload failed, error:" + th.toString());
            return -1;
        }
    }

    public void pushEvent(int i) {
        try {
            this.downloadProxyAidl.pushEvent(i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "pushEvent failed, error:" + th.toString());
        }
    }

    public int removeStorageCache(String str) {
        return -1;
    }

    public int resumeDownload(int i) {
        try {
            return this.downloadProxyAidl.resumeDownload(i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "resumeDownload failed, error:" + th.toString());
            return -1;
        }
    }

    public boolean setClipInfo(int i, int i2, String str, TPDownloadParam tPDownloadParam) {
        try {
            return this.downloadProxyAidl.setClipInfo(i, i2, str, new TPDownloadParamAidl(tPDownloadParam.getUrlList(), tPDownloadParam.getDlType(), tPDownloadParam.getExtInfoMap()));
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setClipInfo failed, error:" + th.toString());
            return false;
        }
    }

    public void setLogListener(ITPDLProxyLogListener iTPDLProxyLogListener) {
        TPDLProxyLog.setLogListener(10303, iTPDLProxyLogListener);
    }

    public void setMaxStorageSizeMB(long j) {
        try {
            this.downloadProxyAidl.setMaxStorageSizeMB(j);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setMaxStorageSizeMB failed, error:" + th.toString());
        }
    }

    public void setPlayState(int i, int i2) {
        try {
            this.downloadProxyAidl.setPlayState(i, i2);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setPlayState failed, error:" + th.toString());
        }
    }

    public void setUserData(String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, obj);
        try {
            this.downloadProxyAidl.setUserData(hashMap);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th.toString());
        }
    }

    public int startClipOfflineDownload(String str, int i, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        return -1;
    }

    public int startClipPlay(String str, int i, final ITPPlayListener iTPPlayListener) {
        if (iTPPlayListener == null) {
            try {
                return this.downloadProxyAidl.startClipPlay(str, i, (ITPPlayListenerAidl) null);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipPlay failed, error:" + th.toString());
                return -1;
            }
        } else {
            return this.downloadProxyAidl.startClipPlay(str, i, new ITPPlayListenerAidl.Stub() {
                public long getAdvRemainTime() {
                    return iTPPlayListener.getAdvRemainTime();
                }

                public String getContentType(int i, String str) {
                    return null;
                }

                public int getCurrentPlayClipNo() {
                    return iTPPlayListener.getCurrentPlayClipNo();
                }

                public long getCurrentPlayOffset() {
                    return iTPPlayListener.getCurrentPlayOffset();
                }

                public long getCurrentPosition() {
                    return iTPPlayListener.getCurrentPosition();
                }

                public String getDataFilePath(int i, String str) {
                    return null;
                }

                public long getDataTotalSize(int i, String str) {
                    return 0;
                }

                public String getPlayInfo(String str) {
                    Class<String> cls = String.class;
                    Object playInfo = iTPPlayListener.getPlayInfo(str);
                    if (playInfo == null || playInfo.getClass() != cls) {
                        return null;
                    }
                    if (playInfo.getClass() == cls) {
                        return (String) playInfo;
                    }
                    if (playInfo.getClass() == Integer.class) {
                        return Integer.toString(((Integer) playInfo).intValue());
                    }
                    return null;
                }

                public long getPlayerBufferLength() {
                    return iTPPlayListener.getPlayerBufferLength();
                }

                public void onDownloadCdnUrlExpired(Map map) {
                    iTPPlayListener.onDownloadCdnUrlExpired(map);
                }

                public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
                    iTPPlayListener.onDownloadCdnUrlInfoUpdate(str, str2, str3, str4);
                }

                public void onDownloadCdnUrlUpdate(String str) {
                    iTPPlayListener.onDownloadCdnUrlUpdate(str);
                }

                public void onDownloadError(int i, int i2, String str) {
                    iTPPlayListener.onDownloadError(i, i2, str);
                }

                public void onDownloadFinish() {
                    iTPPlayListener.onDownloadFinish();
                }

                public void onDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
                    iTPPlayListener.onDownloadProgressUpdate(i, i2, j, j2, str);
                }

                public void onDownloadProtocolUpdate(String str, String str2) {
                    iTPPlayListener.onDownloadProtocolUpdate(str, str2);
                }

                public void onDownloadStatusUpdate(int i) {
                    iTPPlayListener.onDownloadStatusUpdate(i);
                }

                public int onPlayCallback(int i, List list) {
                    Object obj = 0;
                    if (list != null && !list.isEmpty()) {
                        if (list.size() == 1) {
                            obj = iTPPlayListener.onPlayCallback(i, list.get(0), (Object) null, (Object) null, (Object) null);
                        } else if (list.size() == 2) {
                            obj = iTPPlayListener.onPlayCallback(i, list.get(0), list.get(1), (Object) null, (Object) null);
                        } else if (list.size() == 3) {
                            obj = iTPPlayListener.onPlayCallback(i, list.get(0), list.get(1), list.get(2), (Object) null);
                        }
                    }
                    if (obj == null || obj.getClass() != Integer.class) {
                        return -1;
                    }
                    return ((Integer) obj).intValue();
                }

                public int onReadData(int i, String str, long j, long j2) {
                    return 0;
                }

                public int onStartReadData(int i, String str, long j, long j2) {
                    return 0;
                }

                public int onStopReadData(int i, String str, int i2) {
                    return 0;
                }
            });
        }
    }

    public int startClipPreload(String str, int i, final ITPPreLoadListener iTPPreLoadListener) {
        try {
            return this.downloadProxyAidl.startClipPreload(str, i, new ITPPreLoadListenerAidl.Stub() {
                public void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
                    iTPPreLoadListener.onPrepareDownloadProgressUpdate(i, i2, j, j2, str);
                }

                public void onPrepareError(int i, int i2, String str) {
                    iTPPreLoadListener.onPrepareError(i, i2, str);
                }

                public void onPrepareOK() {
                    iTPPreLoadListener.onPrepareOK();
                }
            });
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipPreload failed, error:" + th.toString());
            return -1;
        }
    }

    public int startOfflineDownload(String str, TPDownloadParam tPDownloadParam, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        return -1;
    }

    public int startPlay(String str, TPDownloadParam tPDownloadParam, final ITPPlayListener iTPPlayListener) {
        if (!(this.downloadProxyAidl == null || tPDownloadParam == null)) {
            TPDownloadParamAidl tPDownloadParamAidl = new TPDownloadParamAidl(tPDownloadParam.getUrlList(), tPDownloadParam.getDlType(), tPDownloadParam.getExtInfoMap());
            if (iTPPlayListener == null) {
                try {
                    return this.downloadProxyAidl.startPlay(str, tPDownloadParamAidl, (ITPPlayListenerAidl) null);
                } catch (Throwable th) {
                    TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPlay failed, error:" + th.toString());
                }
            } else {
                return this.downloadProxyAidl.startPlay(str, tPDownloadParamAidl, new ITPPlayListenerAidl.Stub() {
                    public long getAdvRemainTime() {
                        return iTPPlayListener.getAdvRemainTime();
                    }

                    public String getContentType(int i, String str) {
                        return iTPPlayListener.getContentType(i, str);
                    }

                    public int getCurrentPlayClipNo() {
                        return iTPPlayListener.getCurrentPlayClipNo();
                    }

                    public long getCurrentPlayOffset() {
                        return iTPPlayListener.getCurrentPlayOffset();
                    }

                    public long getCurrentPosition() {
                        return iTPPlayListener.getCurrentPosition();
                    }

                    public String getDataFilePath(int i, String str) {
                        return iTPPlayListener.getDataFilePath(i, str);
                    }

                    public long getDataTotalSize(int i, String str) {
                        return iTPPlayListener.getDataTotalSize(i, str);
                    }

                    public String getPlayInfo(String str) {
                        Class<String> cls = String.class;
                        Object playInfo = iTPPlayListener.getPlayInfo(str);
                        if (playInfo == null || playInfo.getClass() != cls) {
                            return null;
                        }
                        if (playInfo.getClass() == cls) {
                            return (String) playInfo;
                        }
                        if (playInfo.getClass() == Integer.class) {
                            return Integer.toString(((Integer) playInfo).intValue());
                        }
                        return null;
                    }

                    public long getPlayerBufferLength() {
                        return iTPPlayListener.getPlayerBufferLength();
                    }

                    public void onDownloadCdnUrlExpired(Map map) {
                        iTPPlayListener.onDownloadCdnUrlExpired(map);
                    }

                    public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
                        iTPPlayListener.onDownloadCdnUrlInfoUpdate(str, str2, str3, str4);
                    }

                    public void onDownloadCdnUrlUpdate(String str) {
                        iTPPlayListener.onDownloadCdnUrlUpdate(str);
                    }

                    public void onDownloadError(int i, int i2, String str) {
                        iTPPlayListener.onDownloadError(i, i2, str);
                    }

                    public void onDownloadFinish() {
                        iTPPlayListener.onDownloadFinish();
                    }

                    public void onDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
                        iTPPlayListener.onDownloadProgressUpdate(i, i2, j, j2, str);
                    }

                    public void onDownloadProtocolUpdate(String str, String str2) {
                        iTPPlayListener.onDownloadProtocolUpdate(str, str2);
                    }

                    public void onDownloadStatusUpdate(int i) {
                        iTPPlayListener.onDownloadStatusUpdate(i);
                    }

                    public int onPlayCallback(int i, List list) {
                        Object obj = 0;
                        if (list != null && !list.isEmpty()) {
                            if (list.size() == 1) {
                                obj = iTPPlayListener.onPlayCallback(i, list.get(0), (Object) null, (Object) null, (Object) null);
                            } else if (list.size() == 2) {
                                obj = iTPPlayListener.onPlayCallback(i, list.get(0), list.get(1), (Object) null, (Object) null);
                            } else if (list.size() == 3) {
                                obj = iTPPlayListener.onPlayCallback(i, list.get(0), list.get(1), list.get(2), (Object) null);
                            }
                        }
                        if (obj == null || obj.getClass() != Integer.class) {
                            return -1;
                        }
                        return ((Integer) obj).intValue();
                    }

                    public int onReadData(int i, String str, long j, long j2) {
                        return iTPPlayListener.onReadData(i, str, j, j2);
                    }

                    public int onStartReadData(int i, String str, long j, long j2) {
                        return iTPPlayListener.onStartReadData(i, str, j, j2);
                    }

                    public int onStopReadData(int i, String str, int i2) {
                        return iTPPlayListener.onStopReadData(i, str, i2);
                    }
                });
            }
        }
        return -1;
    }

    public int startPreload(String str, TPDownloadParam tPDownloadParam, final ITPPreLoadListener iTPPreLoadListener) {
        try {
            return this.downloadProxyAidl.startPreload(str, new TPDownloadParamAidl(tPDownloadParam.getUrlList(), tPDownloadParam.getDlType(), tPDownloadParam.getExtInfoMap()), new ITPPreLoadListenerAidl.Stub() {
                public void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
                    iTPPreLoadListener.onPrepareDownloadProgressUpdate(i, i2, j, j2, str);
                }

                public void onPrepareError(int i, int i2, String str) {
                    iTPPreLoadListener.onPrepareError(i, i2, str);
                }

                public void onPrepareOK() {
                    iTPPreLoadListener.onPrepareOK();
                }
            });
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPreload failed, error:" + th.toString());
            return -1;
        }
    }

    public void startTask(int i) {
        try {
            this.downloadProxyAidl.startTask(i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startTask failed, error:" + th.toString());
        }
    }

    public void stopOfflineDownload(int i) {
    }

    public void stopPlay(int i) {
        try {
            this.downloadProxyAidl.stopPlay(i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopPlay failed, error:" + th.toString());
        }
    }

    public void stopPreload(int i) {
        try {
            this.downloadProxyAidl.stopPreload(i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopPreload failed, error:" + th.toString());
        }
    }

    public void updateAidl(ITPDownloadProxyAidl iTPDownloadProxyAidl) {
        this.downloadProxyAidl = iTPDownloadProxyAidl;
    }

    public void updateStoragePath(String str) {
    }

    public void updateTaskInfo(int i, String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, obj);
        try {
            this.downloadProxyAidl.updateTaskInfo(i, hashMap);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updateTaskInfo failed, error:" + th.toString());
        }
    }
}
