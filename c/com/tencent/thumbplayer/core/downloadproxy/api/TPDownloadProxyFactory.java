package com.tencent.thumbplayer.core.downloadproxy.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl;
import com.tencent.thumbplayer.core.downloadproxy.client.TPDownloadProxyClient;
import com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.core.downloadproxy.service.TPDownloadProxyService;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog;
import java.util.HashMap;
import java.util.Map;

public class TPDownloadProxyFactory {
    private static final String FILE_NAME = "TPDownloadProxyFactory";
    /* access modifiers changed from: private */
    public static TPDownloadProxyFactoryAidl downloadProxyFactoryAidl;
    /* access modifiers changed from: private */
    public static TPDLProxyBindServiceCallback mCallback = null;
    private static boolean mCanUseAIDL = false;
    private static ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            TPDownloadProxyFactoryAidl unused = TPDownloadProxyFactory.downloadProxyFactoryAidl = TPDownloadProxyFactoryAidl.Stub.asInterface(iBinder);
            try {
                for (Map.Entry entry : TPDownloadProxyFactory.mvTPDownloadProxyClientMap.entrySet()) {
                    ((TPDownloadProxyClient) entry.getValue()).updateAidl(TPDownloadProxyFactory.downloadProxyFactoryAidl.getTPDownloadProxy(((Integer) entry.getKey()).intValue()));
                }
            } catch (Throwable th) {
                TPDLProxyLog.m21866i(TPDownloadProxyFactory.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "onServiceConnected failed, error:" + th.toString());
            }
            TPDLProxyLog.m21866i(TPDownloadProxyFactory.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on service connected!");
            if (TPDownloadProxyFactory.downloadProxyFactoryAidl == null) {
                TPDLProxyLog.m21866i(TPDownloadProxyFactory.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on service connected, aidl is null!");
                return;
            }
            TPDLProxyLog.m21866i(TPDownloadProxyFactory.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on service connected, aidl not null!");
            TPDownloadProxyFactory.setCanUseAIDL(true);
            if (TPDownloadProxyFactory.mCallback != null) {
                TPDownloadProxyFactory.mCallback.onBindSuccess();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            TPDLProxyLog.m21866i(TPDownloadProxyFactory.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "on service disconnected");
            TPDownloadProxyFactoryAidl unused = TPDownloadProxyFactory.downloadProxyFactoryAidl = null;
            TPDownloadProxyFactory.setCanUseAIDL(false);
            TPDownloadProxyFactory.ensurePlayManagerService(TPDownloadProxyFactory.mCallback);
        }
    };
    private static boolean mIsReadyForDownload = false;
    private static Object mMapObject = new Object();
    private static boolean mUseService = false;
    /* access modifiers changed from: private */
    public static HashMap<Integer, TPDownloadProxyClient> mvTPDownloadProxyClientMap = new HashMap<>();
    private static HashMap<Integer, ITPDownloadProxy> mvTPDownloadProxyMap = new HashMap<>();

    public static synchronized boolean canUseService() {
        synchronized (TPDownloadProxyFactory.class) {
            if (!mUseService) {
                return true;
            }
            if (!mCanUseAIDL) {
                return false;
            }
            TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
            if (tPDownloadProxyFactoryAidl != null) {
                try {
                    tPDownloadProxyFactoryAidl.isReadyForPlay();
                    return true;
                } catch (Throwable th) {
                    TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "canUseService failed, error:" + th.toString());
                    return false;
                }
            }
        }
    }

    public static boolean ensurePlayManagerService(TPDLProxyBindServiceCallback tPDLProxyBindServiceCallback) {
        Context context = TPDownloadProxyHelper.getContext();
        if (context == null) {
            TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService get context null!");
            return false;
        }
        mCallback = tPDLProxyBindServiceCallback;
        TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService " + "ok");
        try {
            Intent intent = new Intent(context, TPDownloadProxyService.class);
            context.startService(intent);
            if (!context.bindService(intent, mConnection, 1)) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService bind service failed!");
            }
            return true;
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "ensurePlayManagerService failed, error:" + th.toString());
            return false;
        }
    }

    public static synchronized boolean getCanUseAIDL() {
        boolean z;
        synchronized (TPDownloadProxyFactory.class) {
            z = mCanUseAIDL;
        }
        return z;
    }

    public static String getNativeVersion() {
        if (!mUseService) {
            return TPDownloadProxyNative.getInstance().getNativeVersion();
        }
        if (!mCanUseAIDL) {
            return TPDownloadProxyNative.getInstance().getNativeVersion();
        }
        TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
        if (tPDownloadProxyFactoryAidl != null) {
            try {
                return tPDownloadProxyFactoryAidl.getNativeVersion();
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeVersion failed, error:" + th.toString());
            }
        }
        return TPDownloadProxyNative.getInstance().getNativeVersion();
    }

    public static ITPDownloadProxy getTPDownloadProxy(int i) {
        ITPDownloadProxy iTPDownloadProxy;
        if (i <= 0) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxy is invalid, serviceType:" + i);
            return null;
        } else if (!mUseService) {
            synchronized (mMapObject) {
                iTPDownloadProxy = mvTPDownloadProxyMap.get(Integer.valueOf(i));
                if (iTPDownloadProxy == null) {
                    iTPDownloadProxy = new TPDownloadProxy(i);
                    mvTPDownloadProxyMap.put(Integer.valueOf(i), iTPDownloadProxy);
                }
            }
            return iTPDownloadProxy;
        } else if (mCanUseAIDL) {
            try {
                return getTPDownloadProxyService(i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxy failed, error:" + th.toString());
                return null;
            }
        } else {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxy failed, can't use aidl!");
            return null;
        }
    }

    private static synchronized ITPDownloadProxy getTPDownloadProxyService(int i) {
        TPDownloadProxyClient tPDownloadProxyClient;
        synchronized (TPDownloadProxyFactory.class) {
            if (downloadProxyFactoryAidl != null) {
                synchronized (mvTPDownloadProxyClientMap) {
                    tPDownloadProxyClient = mvTPDownloadProxyClientMap.get(Integer.valueOf(i));
                    if (tPDownloadProxyClient == null) {
                        try {
                            tPDownloadProxyClient = new TPDownloadProxyClient(downloadProxyFactoryAidl.getTPDownloadProxy(i));
                        } catch (Throwable th) {
                            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxyService failed, error:" + th.toString());
                        }
                    }
                    mvTPDownloadProxyClientMap.put(Integer.valueOf(i), tPDownloadProxyClient);
                }
                return tPDownloadProxyClient;
            }
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getTPDownloadProxyService failed, aidl is null!");
            return null;
        }
    }

    public static boolean getUseService() {
        return mUseService;
    }

    public static synchronized boolean isReadyForDownload() {
        boolean z;
        synchronized (TPDownloadProxyFactory.class) {
            z = false;
            if (!mUseService) {
                TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "isReadyForDownload ret:" + mIsReadyForDownload);
                boolean z2 = mIsReadyForDownload;
                return z2;
            } else if (!mCanUseAIDL) {
                return false;
            } else {
                TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
                if (tPDownloadProxyFactoryAidl != null) {
                    try {
                        z = tPDownloadProxyFactoryAidl.isReadyForDownload();
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "isReadyForDownload failed, error:" + th.toString());
                    }
                }
            }
        }
        return z;
    }

    public static synchronized boolean isReadyForPlay() {
        boolean z;
        synchronized (TPDownloadProxyFactory.class) {
            z = false;
            if (!mUseService) {
                boolean isReadyForWork = TPDownloadProxyNative.getInstance().isReadyForWork();
                TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "isReadyForPlay ret:" + isReadyForWork);
                return isReadyForWork;
            } else if (!mCanUseAIDL) {
                return false;
            } else {
                TPDownloadProxyFactoryAidl tPDownloadProxyFactoryAidl = downloadProxyFactoryAidl;
                if (tPDownloadProxyFactoryAidl != null) {
                    try {
                        z = tPDownloadProxyFactoryAidl.isReadyForPlay();
                    } catch (Throwable th) {
                        TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "isReadyForPlay failed, error:" + th.toString());
                    }
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    public static synchronized void setCanUseAIDL(boolean z) {
        synchronized (TPDownloadProxyFactory.class) {
            mCanUseAIDL = z;
        }
    }

    public static synchronized void setReadyForDownload(boolean z) {
        synchronized (TPDownloadProxyFactory.class) {
            mIsReadyForDownload = z;
        }
    }

    public static void setUseService(boolean z) {
        mUseService = z;
    }
}
