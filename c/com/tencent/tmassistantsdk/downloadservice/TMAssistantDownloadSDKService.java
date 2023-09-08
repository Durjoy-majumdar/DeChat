package com.tencent.tmassistantsdk.downloadservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback;
import com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.downloadservice.taskmanager.IServiceDownloadTaskManagerListener;
import com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTaskManager;
import com.tencent.tmassistantsdk.logreport.GetSettingEngine;
import com.tencent.tmassistantsdk.logreport.LogReportManager;
import com.tencent.tmassistantsdk.storage.DBManager;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;

public class TMAssistantDownloadSDKService extends Service implements IServiceDownloadTaskManagerListener {
    public static final String TAG = "TMAssistantDownloadSDKService";
    private byte _hellAccFlag_;
    public final TMAssistantDownloadSDKServiceImpl downloadSDKServiceImpl = new TMAssistantDownloadSDKServiceImpl();
    public final HashMap<ITMAssistantDownloadSDKServiceCallback, String> mCallbackHashMap = new HashMap<>();
    public final RemoteCallbackList<ITMAssistantDownloadSDKServiceCallback> mCallbacks = new RemoteCallbackList<>();
    public ServiceDownloadTaskManager mServiceDownloadTaskManager = null;

    public class TMAssistantDownloadSDKServiceImpl extends ITMAssistantDownloadSDKServiceInterface.Stub {
        public TMAssistantDownloadSDKServiceImpl() {
        }

        public void cancelDownloadTask(String str, String str2) {
            ServiceDownloadTaskManager serviceDownloadTaskManager = TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager;
            if (serviceDownloadTaskManager != null) {
                serviceDownloadTaskManager.cancelDownload(str, str2);
            }
        }

        public TMAssistantDownloadTaskInfo getDownloadTaskInfo(String str, String str2) {
            TMLog.m164114i(TMAssistantDownloadSDKService.TAG, "getDownloadTaskInfo");
            ServiceDownloadTaskManager serviceDownloadTaskManager = TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager;
            if (serviceDownloadTaskManager != null) {
                return serviceDownloadTaskManager.getDownloadTaskInfo(str, str2);
            }
            return null;
        }

        public int getServiceVersion() {
            return 1;
        }

        public boolean isAllDownloadFinished() {
            return ApkDownloadManager.getInstance().isAllDownloadFinished().booleanValue();
        }

        public void pauseDownloadTask(String str, String str2) {
            TMLog.m164114i(TMAssistantDownloadSDKService.TAG, JsApiPauseDownloadTask.NAME);
            try {
                ServiceDownloadTaskManager serviceDownloadTaskManager = TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager;
                if (serviceDownloadTaskManager != null) {
                    serviceDownloadTaskManager.pauseDownload(str, str2);
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TMAssistantDownloadSDKService.TAG, e, "", new Object[0]);
            }
            TMLog.m164114i(TMAssistantDownloadSDKService.TAG, "pauseDownloadTask end");
        }

        public void registerDownloadTaskCallback(String str, ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
            TMLog.m164114i(TMAssistantDownloadSDKService.TAG, "registerDownloadTaskCallback,clientKey:" + str);
            if (str != null && iTMAssistantDownloadSDKServiceCallback != null) {
                TMAssistantDownloadSDKService.this.mCallbacks.register(iTMAssistantDownloadSDKServiceCallback);
                synchronized (this) {
                    TMAssistantDownloadSDKService.this.mCallbackHashMap.put(iTMAssistantDownloadSDKServiceCallback, str);
                }
            }
        }

        public void setServiceSetingIsDownloadWifiOnly(boolean z) {
            DownloadSetting.getInstance().setIsDownloadWifiOnly(z);
        }

        public void setServiceSetingIsTaskAutoResume(boolean z) {
            DownloadSetting.getInstance().setIsTaskAutoResume(z);
        }

        public void setServiceSetingMaxTaskNum(int i) {
            DownloadSetting.getInstance().setMaxTaskNum(i);
        }

        public int startDownloadTask(String str, String str2, String str3, long j, int i, String str4, String str5, Map map) {
            String str6 = str;
            String str7 = str2;
            TMLog.m164114i(TMAssistantDownloadSDKService.TAG, "startDownloadTask，clientkey:" + str + ",url:" + str2 + ",manager:" + TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager + ",fileName:" + str5);
            if (TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager == null) {
                return 3;
            }
            DBManager.getInstance().saveClientInfo(str, str2);
            return TMAssistantDownloadSDKService.this.mServiceDownloadTaskManager.startDownload(str, str2, str3, j, i, str4, str5, map);
        }

        public void unregisterDownloadTaskCallback(String str, ITMAssistantDownloadSDKServiceCallback iTMAssistantDownloadSDKServiceCallback) {
            TMLog.m164114i(TMAssistantDownloadSDKService.TAG, "unregisterDownloadTaskCallback,clientKey:" + str);
            if (str != null && iTMAssistantDownloadSDKServiceCallback != null) {
                TMAssistantDownloadSDKService.this.mCallbacks.unregister(iTMAssistantDownloadSDKServiceCallback);
                synchronized (this) {
                    TMAssistantDownloadSDKService.this.mCallbackHashMap.remove(iTMAssistantDownloadSDKServiceCallback);
                }
            }
        }
    }

    public void OnDownloadProgressChanged(String str, String str2, long j, long j2) {
        String str3 = str;
        try {
            int beginBroadcast = this.mCallbacks.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                try {
                    ITMAssistantDownloadSDKServiceCallback broadcastItem = this.mCallbacks.getBroadcastItem(i);
                    String str4 = this.mCallbackHashMap.get(broadcastItem);
                    if (str4 != null && str4.equals(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("OnDownloadProgressChanged,clientKey:");
                        sb.append(str);
                        sb.append(",receivedLen:");
                        try {
                            sb.append(j);
                            sb.append(",url:");
                            try {
                                sb.append(str2);
                                TMLog.m164114i(TAG, sb.toString());
                                broadcastItem.OnDownloadSDKServiceTaskProgressChanged(str, str2, j, j2);
                            } catch (RemoteException unused) {
                                continue;
                            }
                        } catch (RemoteException unused2) {
                            String str5 = str2;
                        }
                    }
                } catch (RemoteException unused3) {
                }
                String str6 = str2;
                long j3 = j;
            }
            this.mCallbacks.finishBroadcast();
        } catch (Throwable unused4) {
        }
    }

    public void OnDownloadStateChanged(String str, String str2, int i, int i2, String str3, boolean z, boolean z2) {
        String str4 = str;
        try {
            int beginBroadcast = this.mCallbacks.beginBroadcast();
            for (int i3 = 0; i3 < beginBroadcast; i3++) {
                try {
                    ITMAssistantDownloadSDKServiceCallback broadcastItem = this.mCallbacks.getBroadcastItem(i3);
                    String str5 = this.mCallbackHashMap.get(broadcastItem);
                    if (str5 != null && str5.equals(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("OnDownloadStateChanged,clientKey:");
                        sb.append(str);
                        sb.append(",state:");
                        try {
                            sb.append(i);
                            sb.append(",url:");
                            try {
                                sb.append(str2);
                                TMLog.m164114i(TAG, sb.toString());
                                broadcastItem.OnDownloadSDKServiceTaskStateChanged(str, str2, i, i2, str3, z, z2);
                            } catch (RemoteException unused) {
                                continue;
                            }
                        } catch (RemoteException unused2) {
                            String str6 = str2;
                        }
                    }
                } catch (RemoteException unused3) {
                }
                String str7 = str2;
                int i4 = i;
            }
            this.mCallbacks.finishBroadcast();
        } catch (Throwable unused4) {
        }
    }

    public IBinder onBind(Intent intent) {
        TMLog.m164114i(TAG, "onBind ,intent:" + intent);
        return this.downloadSDKServiceImpl;
    }

    public void onCreate() {
        super.onCreate();
        GlobalUtil.getInstance().setContext(this);
        NetworkMonitorReceiver.getInstance().registerReceiver();
        ServiceDownloadTaskManager serviceDownloadTaskManager = new ServiceDownloadTaskManager(DBManager.getInstance().queryWaitingAndDownloadingTaskList());
        this.mServiceDownloadTaskManager = serviceDownloadTaskManager;
        serviceDownloadTaskManager.setListener(this);
        this.mServiceDownloadTaskManager.registerApkDownloadManagerListener();
        ApkDownloadManager.getInstance().init();
        TMLog.m164114i(TAG, "onCreate");
    }

    public void onDestroy() {
        TMLog.m164114i(TAG, "onDestroy");
        super.onDestroy();
        ApkDownloadManager.getInstance().uninit();
        GetSettingEngine.getInstance().cancleRequest();
        LogReportManager.getInstance().cancleReport();
        LogReportManager.getInstance().destory();
        this.mServiceDownloadTaskManager.unRegisterApkDownloadManagerListener();
        this.mServiceDownloadTaskManager.setListener((IServiceDownloadTaskManagerListener) null);
        this.mServiceDownloadTaskManager = null;
        NetworkMonitorReceiver.getInstance().unregisterReceiver();
        GlobalUtil.getInstance().destroy();
        SystemClock.sleep(300);
        int myPid = Process.myPid();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(myPid));
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/tmassistantsdk/downloadservice/TMAssistantDownloadSDKService", "onDestroy", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(obj, "com/tencent/tmassistantsdk/downloadservice/TMAssistantDownloadSDKService", "onDestroy", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    public boolean onUnbind(Intent intent) {
        TMLog.m164114i(TAG, "onUnbind ,intent:" + intent);
        return super.onUnbind(intent);
    }
}
