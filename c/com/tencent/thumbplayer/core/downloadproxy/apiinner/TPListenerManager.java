package com.tencent.thumbplayer.core.downloadproxy.apiinner;

import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils;
import com.tencent.thumbplayer.core.downloadproxy.utils.TVKThreadUtil;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class TPListenerManager {
    private static final String FILE_NAME = "TPListenerManager";
    private static final int MSG_CONFIG_URL = 2011;
    private static final int MSG_CURRENT_CDN_URL = 5;
    private static final int MSG_CURRENT_CDN_URL_INFO = 6;
    private static final int MSG_DID_RELEASE_MEMORY = 2016;
    private static final int MSG_DOWNLOAD_PROTOCOL = 9;
    private static final int MSG_DOWNLOAD_STATUS = 8;
    private static final int MSG_ERROR = 4;
    private static final int MSG_FINISH = 3;
    private static final int MSG_M3U8_REFRESH = 2017;
    private static final int MSG_MULTI_NETWORK_LOW_SPEED = 2020;
    private static final int MSG_MULTI_NETWORK_STATUS = 2021;
    private static final int MSG_NOTIFY_FLV_PRELOAD_STATUS = 2009;
    private static final int MSG_NOTIFY_HTTP_HEADER = 2006;
    private static final int MSG_NOTIFY_LOSE_PACKAGE_CEHCK = 2004;
    private static final int MSG_NOTIFY_M3U8_CONTENT = 2007;
    private static final int MSG_NOTIFY_PLAYER_SWITCH_DEFINITION = 2003;
    private static final int MSG_NOTIFY_SOCKET_FD = 2008;
    private static final int MSG_PLAY_VIDEO_NOT_FOUND = 101;
    private static final int MSG_PREPARE_FINISH = 50;
    private static final int MSG_PROGRESS = 2;
    private static final int MSG_PROXY_CANCEL_READ_DATA = 202;
    private static final int MSG_PROXY_GET_CONTENT_TYPE = 205;
    private static final int MSG_PROXY_GET_DATA_FILE_PATH = 204;
    private static final int MSG_PROXY_GET_DATA_TOTAL_SIZE = 203;
    private static final int MSG_PROXY_READ_DATA = 201;
    private static final int MSG_PROXY_START_READ_DATA = 200;
    private static final int MSG_QUIC_DOWNLOAD_STATUS = 3001;
    private static final int MSG_REPORT_QUIC_QUALITY = 3002;
    private static final int MSG_REPORT_URL = 2010;
    private static final int MSG_TAB_TESTID = 2014;
    private static final int MSG_URL_EXPIRED = 7;
    private static final int MSG_WILL_RELEASE_MEMORY = 2015;
    private static final int MSG_WUJI_CONFIG_URL = 2013;
    private static final Object OFFLINE_LISTENER_MAP_MUTEX = new Object();
    /* access modifiers changed from: private */
    public static final Object PLAY_LISTENER_MAP_MUTEX = new Object();
    private static final Object PRELOAD_LISTENER_MAP_MUTEX = new Object();
    private static final String THREAD_NAME = "TVKDL-Listener";
    private ITPDownloadListener mITPDownloadListener;
    /* access modifiers changed from: private */
    public Handler mMsgHandler;
    private HandlerThread mMsgHandlerThread;
    private Network mNetwork;
    private Map<Integer, ITPOfflineDownloadListener> mOfflineDownloadListenerMap;
    /* access modifiers changed from: private */
    public Map<Integer, ITPPlayListener> mPlayListenerMap;
    private Map<Integer, ITPPreLoadListener> mPreLoadListenerMap;
    /* access modifiers changed from: private */
    public Runnable updatePlayerInfo;

    public static class SingletonHolder {
        /* access modifiers changed from: private */
        public static final TPListenerManager INSTANCE = new TPListenerManager();

        private SingletonHolder() {
        }
    }

    /* access modifiers changed from: private */
    public void dispatchCallbackMessage(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i3 = i;
        int i4 = i2;
        ITPPlayListener playlistener = getPlaylistener(i2);
        if (playlistener != null) {
            dispatchPlayMessage(playlistener, i, i2, obj, obj2, obj3, obj4, obj5);
            return;
        }
        ITPPreLoadListener preLoadListener = getPreLoadListener(i2);
        if (preLoadListener != null) {
            dispatchPreLoadMessage(preLoadListener, i, i2, obj, obj2, obj3, obj4, obj5);
            return;
        }
        ITPOfflineDownloadListener offlineDownloadListener = getOfflineDownloadListener(i2);
        if (offlineDownloadListener != null) {
            dispatchOfflineDownloadMessage(offlineDownloadListener, i, i2, obj, obj2, obj3, obj4, obj5);
        } else if (this.mITPDownloadListener == null) {
        } else {
            if (i3 == 2015) {
                this.mITPDownloadListener.willReleaseMemory(TPDLProxyUtils.byteArrayToString((byte[]) obj));
            } else if (i3 == MSG_DID_RELEASE_MEMORY) {
                this.mITPDownloadListener.didReleaseMemory(TPDLProxyUtils.byteArrayToString((byte[]) obj));
            } else if (i3 == 3002) {
                this.mITPDownloadListener.onQuicQualityReportUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj));
            }
        }
    }

    private void dispatchOfflineDownloadMessage(ITPOfflineDownloadListener iTPOfflineDownloadListener, int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6 = obj;
        Object obj7 = obj2;
        Object obj8 = obj3;
        Object obj9 = obj4;
        if (iTPOfflineDownloadListener != null) {
            switch (i) {
                case 2:
                    iTPOfflineDownloadListener.onDownloadProgressUpdate(TPDLProxyUtils.objectToInt(obj, 0), TPDLProxyUtils.objectToInt(obj2, 0), TPDLProxyUtils.objectToLong(obj3, 0), TPDLProxyUtils.objectToLong(obj9, 0), TPDLProxyUtils.byteArrayToString((byte[]) obj5));
                    return;
                case 3:
                    iTPOfflineDownloadListener.onDownloadFinish();
                    return;
                case 4:
                    iTPOfflineDownloadListener.onDownloadError(((Integer) obj6).intValue(), ((Integer) obj7).intValue(), TPDLProxyUtils.byteArrayToString((byte[]) obj8));
                    return;
                case 5:
                    iTPOfflineDownloadListener.onDownloadCdnUrlUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj6));
                    return;
                case 6:
                    iTPOfflineDownloadListener.onDownloadCdnUrlInfoUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj6), TPDLProxyUtils.byteArrayToString((byte[]) obj7), TPDLProxyUtils.byteArrayToString((byte[]) obj8), TPDLProxyUtils.byteArrayToString((byte[]) obj9));
                    return;
                case 7:
                    String byteArrayToString = TPDLProxyUtils.byteArrayToString((byte[]) obj6);
                    long objectToLong = TPDLProxyUtils.objectToLong(obj2, 0);
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(byteArrayToString)) {
                        hashMap.put("exttag", byteArrayToString);
                        hashMap.put("randnum", String.valueOf(objectToLong));
                    }
                    iTPOfflineDownloadListener.onDownloadCdnUrlExpired(hashMap);
                    return;
                case 8:
                    iTPOfflineDownloadListener.onDownloadStatusUpdate(TPDLProxyUtils.objectToInt(obj, 0));
                    return;
                case 9:
                    iTPOfflineDownloadListener.onDownloadProtocolUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj6), TPDLProxyUtils.byteArrayToString((byte[]) obj7));
                    return;
                default:
                    return;
            }
        }
    }

    private void dispatchPlayMessage(ITPPlayListener iTPPlayListener, int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ITPPlayListener iTPPlayListener2 = iTPPlayListener;
        int i3 = i;
        Object obj6 = obj;
        Object obj7 = obj2;
        Object obj8 = obj3;
        Object obj9 = obj4;
        if (iTPPlayListener2 != null) {
            if (i3 == 2) {
                iTPPlayListener.onDownloadProgressUpdate(TPDLProxyUtils.objectToInt(obj6, 0), TPDLProxyUtils.objectToInt(obj7, 0), TPDLProxyUtils.objectToLong(obj8, 0), TPDLProxyUtils.objectToLong(obj9, 0), TPDLProxyUtils.byteArrayToString((byte[]) obj5));
            } else if (i3 == 3) {
                iTPPlayListener.onDownloadFinish();
            } else if (i3 == 101) {
                String byteArrayToString = TPDLProxyUtils.byteArrayToString((byte[]) obj6);
                long objectToLong = TPDLProxyUtils.objectToLong(obj7, 0);
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(byteArrayToString)) {
                    hashMap.put("exttag", byteArrayToString);
                    hashMap.put("randnum", String.valueOf(objectToLong));
                }
                iTPPlayListener.onPlayCallback(1, hashMap, (Object) null, (Object) null, (Object) null);
            } else if (i3 == 2009) {
                int objectToInt = TPDLProxyUtils.objectToInt(obj6, 0);
                byte[] bArr = obj7 == null ? null : (byte[]) obj7;
                iTPPlayListener.onPlayCallback(5, Integer.valueOf(objectToInt), bArr, TPDLProxyUtils.byteArrayToString((byte[]) obj8), Integer.valueOf(TPDLProxyUtils.objectToInt(obj9, 0)));
            } else if (i3 == 2014) {
                String byteArrayToString2 = TPDLProxyUtils.byteArrayToString((byte[]) obj6);
                String byteArrayToString3 = TPDLProxyUtils.byteArrayToString((byte[]) obj7);
                iTPPlayListener.onPlayCallback(8, byteArrayToString2, byteArrayToString3, (Object) null, (Object) null);
                TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "MSG_TAB_TESTID: " + byteArrayToString3);
            } else if (i3 == MSG_M3U8_REFRESH) {
                iTPPlayListener.onPlayCallback(9, (Object) null, (Object) null, (Object) null, (Object) null);
            } else if (i3 == 3001) {
                iTPPlayListener.onPlayCallback(6, TPDLProxyUtils.byteArrayToString((byte[]) obj6), (Object) null, (Object) null, (Object) null);
            } else if (i3 == 2003) {
                iTPPlayListener.onPlayCallback(2, TPDLProxyUtils.byteArrayToString((byte[]) obj6), TPDLProxyUtils.byteArrayToString((byte[]) obj7), Integer.valueOf(TPDLProxyUtils.objectToInt(obj8, 0)), (Object) null);
            } else if (i3 != 2004) {
                if (i3 == 2006) {
                    iTPPlayListener.onPlayCallback(3, TPDLProxyUtils.byteArrayToString((byte[]) obj6), (Object) null, (Object) null, (Object) null);
                } else if (i3 == 2007) {
                    iTPPlayListener.onPlayCallback(4, TPDLProxyUtils.byteArrayToString((byte[]) obj6), (Object) null, (Object) null, (Object) null);
                } else if (i3 == MSG_MULTI_NETWORK_LOW_SPEED) {
                    String byteArrayToString4 = TPDLProxyUtils.byteArrayToString((byte[]) obj6);
                    iTPPlayListener.onPlayCallback(10, byteArrayToString4, (Object) null, (Object) null, (Object) null);
                    TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "MULTI_NETWORK msg: " + i3 + ", info: " + byteArrayToString4);
                } else if (i3 != MSG_MULTI_NETWORK_STATUS) {
                    switch (i3) {
                        case 5:
                            iTPPlayListener2.onDownloadCdnUrlUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj6));
                            break;
                        case 6:
                            iTPPlayListener2.onDownloadCdnUrlInfoUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj6), TPDLProxyUtils.byteArrayToString((byte[]) obj7), TPDLProxyUtils.byteArrayToString((byte[]) obj8), TPDLProxyUtils.byteArrayToString((byte[]) obj9));
                            break;
                        case 7:
                            String byteArrayToString5 = TPDLProxyUtils.byteArrayToString((byte[]) obj6);
                            long objectToLong2 = TPDLProxyUtils.objectToLong(obj7, 0);
                            HashMap hashMap2 = new HashMap();
                            if (!TextUtils.isEmpty(byteArrayToString5)) {
                                hashMap2.put("exttag", byteArrayToString5);
                                hashMap2.put("randnum", String.valueOf(objectToLong2));
                            }
                            iTPPlayListener2.onDownloadCdnUrlExpired(hashMap2);
                            break;
                        case 8:
                            iTPPlayListener2.onDownloadStatusUpdate(TPDLProxyUtils.objectToInt(obj6, 0));
                            break;
                        case 9:
                            iTPPlayListener2.onDownloadProtocolUpdate(TPDLProxyUtils.byteArrayToString((byte[]) obj6), TPDLProxyUtils.byteArrayToString((byte[]) obj7));
                            break;
                    }
                } else {
                    String byteArrayToString6 = TPDLProxyUtils.byteArrayToString((byte[]) obj6);
                    iTPPlayListener.onPlayCallback(11, byteArrayToString6, (Object) null, (Object) null, (Object) null);
                    TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "MULTI_NETWORK msg: " + i3 + ", info: " + byteArrayToString6);
                }
            } else {
                final int objectToInt2 = TPDLProxyUtils.objectToInt(obj7, 0);
                TVKThreadUtil.getScheduledExecutorServiceInstance().execute(new Runnable() {
                    public void run() {
                        TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_LOSS_PACKAGE_INFO, TPDLProxyUtils.losePackageCheck(objectToInt2));
                    }
                });
            }
        }
    }

    private void dispatchPreLoadMessage(ITPPreLoadListener iTPPreLoadListener, int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i3 = i;
        Object obj6 = obj;
        Object obj7 = obj2;
        Object obj8 = obj3;
        if (iTPPreLoadListener != null) {
            if (i3 == 2) {
                Object obj9 = obj4;
                iTPPreLoadListener.onPrepareDownloadProgressUpdate(TPDLProxyUtils.objectToInt(obj, 0), TPDLProxyUtils.objectToInt(obj2, 0), TPDLProxyUtils.objectToLong(obj3, 0), TPDLProxyUtils.objectToLong(obj4, 0), TPDLProxyUtils.byteArrayToString((byte[]) obj5));
            } else if (i3 == 4) {
                iTPPreLoadListener.onPrepareError(((Integer) obj6).intValue(), ((Integer) obj7).intValue(), TPDLProxyUtils.byteArrayToString((byte[]) obj8));
            } else if (i3 == 50) {
                iTPPreLoadListener.onPrepareOK();
            }
        }
    }

    public static TPListenerManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public ITPOfflineDownloadListener getOfflineDownloadListener(int i) {
        ITPOfflineDownloadListener iTPOfflineDownloadListener;
        synchronized (OFFLINE_LISTENER_MAP_MUTEX) {
            iTPOfflineDownloadListener = this.mOfflineDownloadListenerMap.get(Integer.valueOf(i));
        }
        return iTPOfflineDownloadListener;
    }

    public ITPPlayListener getPlaylistener(int i) {
        ITPPlayListener iTPPlayListener;
        synchronized (PLAY_LISTENER_MAP_MUTEX) {
            iTPPlayListener = this.mPlayListenerMap.get(Integer.valueOf(i));
        }
        return iTPPlayListener;
    }

    public ITPPreLoadListener getPreLoadListener(int i) {
        ITPPreLoadListener iTPPreLoadListener;
        synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
            iTPPreLoadListener = this.mPreLoadListenerMap.get(Integer.valueOf(i));
        }
        return iTPPreLoadListener;
    }

    public synchronized void handleCallbackMessage(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i3 = i;
        synchronized (this) {
            if (2008 == i3) {
                if (this.mNetwork == null) {
                    TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, network is null");
                    return;
                }
                String byteArrayToString = TPDLProxyUtils.byteArrayToString((byte[]) obj);
                int parseInt = Integer.parseInt(byteArrayToString);
                try {
                    FileDescriptor fileDescriptor = new FileDescriptor();
                    Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                    declaredField.setAccessible(true);
                    declaredField.setInt(fileDescriptor, parseInt);
                    TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, bind begin, sock fd: " + parseInt);
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.mNetwork.bindSocket(fileDescriptor);
                        TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, bind socket success, sock fd: " + parseInt);
                    }
                } catch (Throwable th) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, "-1");
                    TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, bind socket failed: " + th.toString());
                }
                TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, sock call back end, sock fd: " + parseInt + ", str_sock: " + byteArrayToString);
            } else if (i3 == 2010 || i3 == 2011 || i3 == 2013) {
                TPCGIRequester.getInstance().addRequestItem(TPDLProxyUtils.byteArrayToString((byte[]) obj), i);
            } else {
                final int i4 = i;
                final int i5 = i2;
                final Object obj6 = obj;
                final Object obj7 = obj2;
                final Object obj8 = obj3;
                final Object obj9 = obj4;
                final Object obj10 = obj5;
                this.mMsgHandler.post(new Runnable() {
                    public void run() {
                        TPListenerManager.this.dispatchCallbackMessage(i4, i5, obj6, obj7, obj8, obj9, obj10);
                    }
                });
            }
        }
    }

    public int handleIntCallbackMessage(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ITPPlayListener playlistener = getPlaylistener(i2);
        if (playlistener == null) {
            return 0;
        }
        if (i == 200) {
            return playlistener.onStartReadData(i2, TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.objectToLong(obj2, 0), TPDLProxyUtils.objectToLong(obj3, -1));
        } else if (i == 202) {
            return playlistener.onStopReadData(i2, TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.objectToInt(obj2, 0));
        } else {
            if (i != 201) {
                return 0;
            }
            return playlistener.onReadData(i2, TPDLProxyUtils.byteArrayToString((byte[]) obj), TPDLProxyUtils.objectToLong(obj2, 0), (long) TPDLProxyUtils.objectToInt(obj3, 0));
        }
    }

    public String handleStringCallbackMessage(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ITPPlayListener playlistener = getPlaylistener(i2);
        if (playlistener != null) {
            if (i == 205) {
                return playlistener.getContentType(i2, TPDLProxyUtils.byteArrayToString((byte[]) obj));
            }
            if (i == 203) {
                return String.valueOf(playlistener.getDataTotalSize(i2, TPDLProxyUtils.byteArrayToString((byte[]) obj)));
            }
            if (i == 204) {
                return playlistener.getDataFilePath(i2, TPDLProxyUtils.byteArrayToString((byte[]) obj));
            }
        }
        return "";
    }

    public void initHandler() {
        if (this.mMsgHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread(THREAD_NAME);
            this.mMsgHandlerThread = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(this.mMsgHandlerThread.getLooper());
            this.mMsgHandler = handler;
            handler.postDelayed(this.updatePlayerInfo, 1000);
        }
    }

    public void removeAllPlayListener() {
        synchronized (PLAY_LISTENER_MAP_MUTEX) {
            this.mPlayListenerMap.clear();
        }
    }

    public void removeAllPreLoadListener() {
        synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
            this.mPreLoadListenerMap.clear();
        }
    }

    public void removeOfflineDownloadListener(int i) {
        if (i > 0) {
            synchronized (OFFLINE_LISTENER_MAP_MUTEX) {
                this.mOfflineDownloadListenerMap.remove(Integer.valueOf(i));
            }
        }
    }

    public void removePlayListener(int i) {
        if (i > 0) {
            synchronized (PLAY_LISTENER_MAP_MUTEX) {
                this.mPlayListenerMap.remove(Integer.valueOf(i));
            }
        }
    }

    public void removePreLoadListener(int i) {
        if (i > 0) {
            synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
                this.mPreLoadListenerMap.remove(Integer.valueOf(i));
            }
        }
    }

    public void setITPDownloadListener(ITPDownloadListener iTPDownloadListener) {
        this.mITPDownloadListener = iTPDownloadListener;
    }

    public void setNetwork(Network network) {
        TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, set network");
        this.mNetwork = network;
    }

    public void setOfflineDownloadListener(int i, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        if (i > 0 && iTPOfflineDownloadListener != null) {
            synchronized (OFFLINE_LISTENER_MAP_MUTEX) {
                this.mOfflineDownloadListenerMap.put(Integer.valueOf(i), iTPOfflineDownloadListener);
            }
        }
    }

    public void setPlayListener(int i, ITPPlayListener iTPPlayListener) {
        if (i > 0 && iTPPlayListener != null) {
            synchronized (PLAY_LISTENER_MAP_MUTEX) {
                this.mPlayListenerMap.put(Integer.valueOf(i), iTPPlayListener);
            }
        }
    }

    public void setPreLoadListener(int i, ITPPreLoadListener iTPPreLoadListener) {
        if (i > 0 && iTPPreLoadListener != null) {
            synchronized (PRELOAD_LISTENER_MAP_MUTEX) {
                this.mPreLoadListenerMap.put(Integer.valueOf(i), iTPPreLoadListener);
            }
        }
    }

    private TPListenerManager() {
        this.mNetwork = null;
        this.mITPDownloadListener = null;
        this.mPlayListenerMap = new HashMap();
        this.mPreLoadListenerMap = new HashMap();
        this.mOfflineDownloadListenerMap = new HashMap();
        this.updatePlayerInfo = new Runnable() {
            public void run() {
                Map access$300;
                synchronized (TPListenerManager.PLAY_LISTENER_MAP_MUTEX) {
                    access$300 = TPListenerManager.this.mPlayListenerMap;
                }
                try {
                    for (Map.Entry entry : access$300.entrySet()) {
                        int intValue = ((Integer) entry.getKey()).intValue();
                        ITPPlayListener iTPPlayListener = (ITPPlayListener) entry.getValue();
                        TPDownloadProxyNative.getInstance().updateTaskInfo(intValue, TPDownloadProxyEnum.TASKINFO_PLAY_OFFSET, String.valueOf(iTPPlayListener.getCurrentPlayOffset()));
                        TPDownloadProxyNative.getInstance().updatePlayerPlayMsg(intValue, (int) (iTPPlayListener.getCurrentPosition() / 1000), (int) (iTPPlayListener.getPlayerBufferLength() / 1000), (int) (iTPPlayListener.getAdvRemainTime() / 1000));
                    }
                } catch (Throwable th) {
                    TPListenerManager.this.mMsgHandler.postDelayed(TPListenerManager.this.updatePlayerInfo, 1000);
                    throw th;
                }
                TPListenerManager.this.mMsgHandler.postDelayed(TPListenerManager.this.updatePlayerInfo, 1000);
            }
        };
    }
}
