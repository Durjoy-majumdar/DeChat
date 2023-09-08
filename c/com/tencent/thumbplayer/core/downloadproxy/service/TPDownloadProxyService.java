package com.tencent.thumbplayer.core.downloadproxy.service;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPDownloadProxyAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPlayListenerAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadParamAidl;
import com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager;
import com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TPDownloadProxyService extends Service {
    private static final String FILE_NAME = "TPDownloadProxyService";
    private TPDownloadProxyFactoryAidl.Stub downloadProxyFactory = null;
    private int pid = -1;

    public class DownloadProxy extends ITPDownloadProxyAidl.Stub {
        private ITPDownloadProxy downloadProxy = null;

        public DownloadProxy(int i) {
            this.downloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(i);
        }

        public int checkResourceStatus(String str, String str2, int i) {
            try {
                return this.downloadProxy.checkResourceStatus(str, str2, i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th.toString());
                return -1;
            }
        }

        public int clearCache(String str, String str2, int i) {
            try {
                return this.downloadProxy.clearCache(str, str2, i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th.toString());
                return -1;
            }
        }

        public String getClipPlayUrl(int i, int i2, int i3) {
            return this.downloadProxy.getClipPlayUrl(i, i2, i3);
        }

        public String getNativeInfo(int i) {
            try {
                return this.downloadProxy.getNativeInfo(i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th.toString());
                return null;
            }
        }

        public String getPlayErrorCodeStr(int i) {
            return this.downloadProxy.getPlayErrorCodeStr(i);
        }

        public String getPlayUrl(int i, int i2) {
            return this.downloadProxy.getPlayUrl(i, i2);
        }

        public long getResourceSize(String str, String str2) {
            try {
                return this.downloadProxy.getResourceSize(str, str2);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceSize failed, error:" + th.toString());
                return -1;
            }
        }

        public int init(String str) {
            try {
                TPDLProxyInitParam tPDLProxyInitParam = (TPDLProxyInitParam) TPDLProxyUtils.serializeToObject(str);
                if (tPDLProxyInitParam != null) {
                    return this.downloadProxy.init(TPDownloadProxyHelper.getContext(), tPDLProxyInitParam);
                }
                TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "param is null");
                return -1;
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "init failed, error:" + th.toString());
                return -2;
            }
        }

        public int pauseDownload(int i) {
            return this.downloadProxy.pauseDownload(i);
        }

        public void pushEvent(int i) {
            this.downloadProxy.pushEvent(i);
        }

        public int resumeDownload(int i) {
            return this.downloadProxy.resumeDownload(i);
        }

        public boolean setClipInfo(int i, int i2, String str, TPDownloadParamAidl tPDownloadParamAidl) {
            return this.downloadProxy.setClipInfo(i, i2, str, new TPDownloadParam(tPDownloadParamAidl.getUrlList(), tPDownloadParamAidl.getDlType(), tPDownloadParamAidl.getExtInfoMap()));
        }

        public void setMaxStorageSizeMB(long j) {
            this.downloadProxy.setMaxStorageSizeMB(j);
        }

        public void setPlayState(int i, int i2) {
            this.downloadProxy.setPlayState(i, i2);
        }

        public void setUserData(Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry != null) {
                        try {
                            if (entry.getValue() != null) {
                                this.downloadProxy.setUserData((String) entry.getKey(), entry.getValue());
                            }
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th.toString());
                        }
                    }
                }
            }
        }

        public int startClipPlay(String str, int i, final ITPPlayListenerAidl iTPPlayListenerAidl) {
            return this.downloadProxy.startClipPlay(str, i, new ITPPlayListener() {
                public long getAdvRemainTime() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.getAdvRemainTime();
                        }
                        return -1;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getAdvRemainTime failed, error:" + th.toString());
                        return -1;
                    }
                }

                public String getContentType(int i, String str) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        return iTPPlayListenerAidl != null ? iTPPlayListenerAidl.getContentType(i, str) : "";
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getContentType key failed, error:" + th.toString());
                        return "";
                    }
                }

                public int getCurrentPlayClipNo() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.getCurrentPlayClipNo();
                        }
                        return -1;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayClipNo failed, error:" + th.toString());
                        return -1;
                    }
                }

                public long getCurrentPlayOffset() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.getCurrentPlayOffset();
                        }
                        return -1;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayOffset failed, error:" + th.toString());
                        return -1;
                    }
                }

                public long getCurrentPosition() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.getCurrentPosition();
                        }
                        return -1;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPosition failed, error:" + th.toString());
                        return -1;
                    }
                }

                public String getDataFilePath(int i, String str) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        return iTPPlayListenerAidl != null ? iTPPlayListenerAidl.getDataFilePath(i, str) : "";
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getDataFilePath key failed, error:" + th.toString());
                        return "";
                    }
                }

                public long getDataTotalSize(int i, String str) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.getDataTotalSize(i, str);
                        }
                        return -1;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getDataTotalSize key failed, error:" + th.toString());
                        return -1;
                    }
                }

                public Object getPlayInfo(long j) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.getPlayInfo(Long.toString(j));
                        }
                        return null;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo type failed, error:" + th.toString());
                        return null;
                    }
                }

                public long getPlayerBufferLength() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.getPlayerBufferLength();
                        }
                        return -1;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayerBufferLength failed, error:" + th.toString());
                        return -1;
                    }
                }

                public void onDownloadCdnUrlExpired(Map<String, String> map) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            iTPPlayListenerAidl.onDownloadCdnUrlExpired(map);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlExpired failed, error:" + th.toString());
                    }
                }

                public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            iTPPlayListenerAidl.onDownloadCdnUrlInfoUpdate(str, str2, str3, str4);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlInfoUpdate failed, error:" + th.toString());
                    }
                }

                public void onDownloadCdnUrlUpdate(String str) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            iTPPlayListenerAidl.onDownloadCdnUrlUpdate(str);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlUpdate failed, error:" + th.toString());
                    }
                }

                public void onDownloadError(int i, int i2, String str) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            iTPPlayListenerAidl.onDownloadError(i, i2, str);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadError failed, error:" + th.toString());
                    }
                }

                public void onDownloadFinish() {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            iTPPlayListenerAidl.onDownloadFinish();
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadFinish failed, error:" + th.toString());
                    }
                }

                public void onDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            iTPPlayListenerAidl.onDownloadProgressUpdate(i, i2, j, j2, str);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadProgressUpdate failed, error:" + th.toString());
                    }
                }

                public void onDownloadProtocolUpdate(String str, String str2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            iTPPlayListenerAidl.onDownloadProtocolUpdate(str, str2);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadProtocolUpdate failed, error:" + th.toString());
                    }
                }

                public void onDownloadStatusUpdate(int i) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            iTPPlayListenerAidl.onDownloadStatusUpdate(i);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadStatusUpdate failed, error:" + th.toString());
                    }
                }

                public Object onPlayCallback(int i, Object obj, Object obj2, Object obj3, Object obj4) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                        if (obj != null) {
                            arrayList.add(obj2);
                        }
                        if (obj != null) {
                            arrayList.add(obj3);
                        }
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl == null) {
                            return null;
                        }
                        iTPPlayListenerAidl.onPlayCallback(i, arrayList);
                        return null;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPlayCallback failed, error:" + th.toString());
                        return null;
                    }
                }

                public int onReadData(int i, String str, long j, long j2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.onReadData(i, str, j, j2);
                        }
                        return -1;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onReadData key failed, error:" + th.toString());
                        return -1;
                    }
                }

                public int onStartReadData(int i, String str, long j, long j2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.onStartReadData(i, str, j, j2);
                        }
                        return -1;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onStartReadData key failed, error:" + th.toString());
                        return -1;
                    }
                }

                public int onStopReadData(int i, String str, int i2) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.onStopReadData(i, str, i2);
                        }
                        return -1;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onStopReadData key failed, error:" + th.toString());
                        return -1;
                    }
                }

                public Object getPlayInfo(String str) {
                    try {
                        ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                        if (iTPPlayListenerAidl != null) {
                            return iTPPlayListenerAidl.getPlayInfo(str);
                        }
                        return null;
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo key failed, error:" + th.toString());
                        return null;
                    }
                }
            });
        }

        public int startClipPreload(String str, int i, final ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            return this.downloadProxy.startClipPreload(str, i, new ITPPreLoadListener() {
                public void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl != null) {
                            iTPPreLoadListenerAidl.onPrepareDownloadProgressUpdate(i, i2, j, j2, str);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareDownloadProgressUpdate failed, error:" + th.toString());
                    }
                }

                public void onPrepareError(int i, int i2, String str) {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl != null) {
                            iTPPreLoadListenerAidl.onPrepareError(i, i2, str);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareError failed, error:" + th.toString());
                    }
                }

                public void onPrepareOK() {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl != null) {
                            iTPPreLoadListenerAidl.onPrepareOK();
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareOK failed, error:" + th.toString());
                    }
                }
            });
        }

        public int startPlay(String str, TPDownloadParamAidl tPDownloadParamAidl, final ITPPlayListenerAidl iTPPlayListenerAidl) {
            try {
                return this.downloadProxy.startPlay(str, new TPDownloadParam(tPDownloadParamAidl.getUrlList(), tPDownloadParamAidl.getDlType(), tPDownloadParamAidl.getExtInfoMap()), new ITPPlayListener() {
                    public long getAdvRemainTime() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                return iTPPlayListenerAidl.getAdvRemainTime();
                            }
                            return -1;
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getAdvRemainTime failed, error:" + th.toString());
                            return -1;
                        }
                    }

                    public String getContentType(int i, String str) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            return iTPPlayListenerAidl != null ? iTPPlayListenerAidl.getContentType(i, str) : "";
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getContentType key failed, error:" + th.toString());
                            return "";
                        }
                    }

                    public int getCurrentPlayClipNo() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                return iTPPlayListenerAidl.getCurrentPlayClipNo();
                            }
                            return -1;
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayClipInfo failed, error:" + th.toString());
                            return -1;
                        }
                    }

                    public long getCurrentPlayOffset() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                return iTPPlayListenerAidl.getCurrentPlayOffset();
                            }
                            return -1;
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPlayOffset failed, error:" + th.toString());
                            return -1;
                        }
                    }

                    public long getCurrentPosition() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                return iTPPlayListenerAidl.getCurrentPosition();
                            }
                            return -1;
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getCurrentPosition failed, error:" + th.toString());
                            return -1;
                        }
                    }

                    public String getDataFilePath(int i, String str) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            return iTPPlayListenerAidl != null ? iTPPlayListenerAidl.getDataFilePath(i, str) : "";
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getDataFilePath key failed, error:" + th.toString());
                            return "";
                        }
                    }

                    public long getDataTotalSize(int i, String str) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                return iTPPlayListenerAidl.getDataTotalSize(i, str);
                            }
                            return -1;
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getDataTotalSize key failed, error:" + th.toString());
                            return -1;
                        }
                    }

                    public Object getPlayInfo(long j) {
                        try {
                            return iTPPlayListenerAidl.getPlayInfo(Long.toString(j));
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo type failed, error:" + th.toString());
                            return null;
                        }
                    }

                    public long getPlayerBufferLength() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                return iTPPlayListenerAidl.getPlayerBufferLength();
                            }
                            return -1;
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayerBufferLength failed, error:" + th.toString());
                            return -1;
                        }
                    }

                    public void onDownloadCdnUrlExpired(Map<String, String> map) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                iTPPlayListenerAidl.onDownloadCdnUrlExpired(map);
                            }
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlExpired failed, error:" + th.toString());
                        }
                    }

                    public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                iTPPlayListenerAidl.onDownloadCdnUrlInfoUpdate(str, str2, str3, str4);
                            }
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlInfoUpdate failed, error:" + th.toString());
                        }
                    }

                    public void onDownloadCdnUrlUpdate(String str) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                iTPPlayListenerAidl.onDownloadCdnUrlUpdate(str);
                            }
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadCdnUrlUpdate failed, error:" + th.toString());
                        }
                    }

                    public void onDownloadError(int i, int i2, String str) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                iTPPlayListenerAidl.onDownloadError(i, i2, str);
                            }
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadError failed, error:" + th.toString());
                        }
                    }

                    public void onDownloadFinish() {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                iTPPlayListenerAidl.onDownloadFinish();
                            }
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownlaodFinish failed, error:" + th.toString());
                        }
                    }

                    public void onDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                iTPPlayListenerAidl.onDownloadProgressUpdate(i, i2, j, j2, str);
                            }
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownlaodProgressUpdate failed, error:" + th.toString());
                        }
                    }

                    public void onDownloadProtocolUpdate(String str, String str2) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                iTPPlayListenerAidl.onDownloadProtocolUpdate(str, str2);
                            }
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadProtocolUpdate failed, error:" + th.toString());
                        }
                    }

                    public void onDownloadStatusUpdate(int i) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                iTPPlayListenerAidl.onDownloadStatusUpdate(i);
                            }
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onDownloadStatusUpdate failed, error:" + th.toString());
                        }
                    }

                    public Object onPlayCallback(int i, Object obj, Object obj2, Object obj3, Object obj4) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                            if (obj2 != null) {
                                arrayList.add(obj2);
                            }
                            if (obj3 != null) {
                                arrayList.add(obj3);
                            }
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl == null) {
                                return null;
                            }
                            iTPPlayListenerAidl.onPlayCallback(i, arrayList);
                            return null;
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPlayCallback failed, error:" + th.toString());
                            return null;
                        }
                    }

                    public int onReadData(int i, String str, long j, long j2) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                return iTPPlayListenerAidl.onReadData(i, str, j, j2);
                            }
                            return -1;
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onReadData key failed, error:" + th.toString());
                            return -1;
                        }
                    }

                    public int onStartReadData(int i, String str, long j, long j2) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                return iTPPlayListenerAidl.onStartReadData(i, str, j, j2);
                            }
                            return -1;
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onStartReadData key failed, error:" + th.toString());
                            return -1;
                        }
                    }

                    public int onStopReadData(int i, String str, int i2) {
                        try {
                            ITPPlayListenerAidl iTPPlayListenerAidl = iTPPlayListenerAidl;
                            if (iTPPlayListenerAidl != null) {
                                return iTPPlayListenerAidl.onStopReadData(i, str, i2);
                            }
                            return -1;
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onStopReadData key failed, error:" + th.toString());
                            return -1;
                        }
                    }

                    public Object getPlayInfo(String str) {
                        try {
                            return iTPPlayListenerAidl.getPlayInfo(str);
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayInfo key failed, error:" + th.toString());
                            return null;
                        }
                    }
                });
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPlay failed, error:" + th.toString());
                return -1;
            }
        }

        public int startPreload(String str, TPDownloadParamAidl tPDownloadParamAidl, final ITPPreLoadListenerAidl iTPPreLoadListenerAidl) {
            return this.downloadProxy.startPreload(str, new TPDownloadParam(tPDownloadParamAidl.getUrlList(), tPDownloadParamAidl.getDlType(), tPDownloadParamAidl.getExtInfoMap()), new ITPPreLoadListener() {
                public void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl != null) {
                            iTPPreLoadListenerAidl.onPrepareDownloadProgressUpdate(i, i2, j, j2, str);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareDownloadProgressUpdate failed, error:" + th.toString());
                    }
                }

                public void onPrepareError(int i, int i2, String str) {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl != null) {
                            iTPPreLoadListenerAidl.onPrepareError(i, i2, str);
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareError failed, error:" + th.toString());
                    }
                }

                public void onPrepareOK() {
                    try {
                        ITPPreLoadListenerAidl iTPPreLoadListenerAidl = iTPPreLoadListenerAidl;
                        if (iTPPreLoadListenerAidl != null) {
                            iTPPreLoadListenerAidl.onPrepareOK();
                        }
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onPrepareOK failed, error:" + th.toString());
                    }
                }
            });
        }

        public void startTask(int i) {
            this.downloadProxy.startTask(i);
        }

        public void stopPlay(int i) {
            this.downloadProxy.stopPlay(i);
        }

        public void stopPreload(int i) {
            this.downloadProxy.stopPreload(i);
        }

        public void updateTaskInfo(int i, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry != null) {
                        try {
                            if (entry.getValue() != null) {
                                this.downloadProxy.updateTaskInfo(i, (String) entry.getKey(), entry.getValue());
                            }
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(TPDownloadProxyService.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updateTaskInfo failed, error:" + th.toString());
                        }
                    }
                }
            }
        }
    }

    public class DownloadProxyFactory extends TPDownloadProxyFactoryAidl.Stub {
        private HashMap<Integer, ITPDownloadProxyAidl> mvTPDownloadProxyMap;

        private DownloadProxyFactory() {
            this.mvTPDownloadProxyMap = new HashMap<>();
        }

        public String getNativeVersion() {
            return TPDownloadProxyFactory.getNativeVersion();
        }

        public synchronized ITPDownloadProxyAidl getTPDownloadProxy(int i) {
            ITPDownloadProxyAidl iTPDownloadProxyAidl;
            iTPDownloadProxyAidl = this.mvTPDownloadProxyMap.get(Integer.valueOf(i));
            if (iTPDownloadProxyAidl == null) {
                iTPDownloadProxyAidl = new DownloadProxy(i);
                this.mvTPDownloadProxyMap.put(Integer.valueOf(i), iTPDownloadProxyAidl);
            }
            return iTPDownloadProxyAidl;
        }

        public boolean isReadyForDownload() {
            return TPDownloadProxyFactory.isReadyForDownload();
        }

        public boolean isReadyForPlay() {
            return TPDownloadProxyFactory.isReadyForPlay();
        }
    }

    private boolean isExistMainProcess() {
        int i;
        try {
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
                String str = next.processName;
                if (!TextUtils.isEmpty(str) && str.equals(getPackageName())) {
                    int i2 = this.pid;
                    if (i2 == -1 || i2 == (i = next.pid)) {
                        this.pid = next.pid;
                        TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "app main exist!");
                        return true;
                    }
                    this.pid = i;
                    return false;
                }
            }
        } catch (Throwable th) {
            TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "isExistMainProcess failed, error:" + th.toString());
        }
        return false;
    }

    public IBinder onBind(Intent intent) {
        if (this.downloadProxyFactory == null) {
            this.downloadProxyFactory = new DownloadProxyFactory();
        }
        TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on bind!");
        isExistMainProcess();
        return this.downloadProxyFactory;
    }

    public void onRebind(Intent intent) {
        TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on rebind!");
        isExistMainProcess();
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on start command!");
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on unbind!");
        super.onUnbind(intent);
        if (isExistMainProcess()) {
            return true;
        }
        try {
            TPDownloadProxyNative.getInstance().stopAllDownload(3);
            TPListenerManager.getInstance().removeAllPlayListener();
            TPListenerManager.getInstance().removeAllPreLoadListener();
            return true;
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, th.toString());
            return true;
        }
    }
}
