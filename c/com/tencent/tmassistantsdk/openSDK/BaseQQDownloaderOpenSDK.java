package com.tencent.tmassistantsdk.openSDK;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import j20.C117292a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k20.C9556a;

public abstract class BaseQQDownloaderOpenSDK {
    public static final String TAG = "BaseQQDownloaderOpenSDK";
    private byte _hellAccFlag_;
    public String hostPackageName = null;
    public int hostVersionCode = 0;
    public Context mContext = null;
    public ReferenceQueue<ITMQQDownloaderOpenSDKListener> mListenerQueue = new ReferenceQueue<>();
    public ArrayList<WeakReference<ITMQQDownloaderOpenSDKListener>> mWeakListenerArrayList = new ArrayList<>();
    public int sdkAPILevel = 1;
    public TMAssistantSDKChannel sdkChannel = new TMAssistantSDKChannel();

    public static int getQQDownloadApiLevel(Context context) {
        Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.tencent.android.qqdownloader", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("com.tencent.android.qqdownloader.sdk.apilevel");
        } catch (Exception unused) {
            TMLog.m164114i(TAG, "packagename not found！");
            return 0;
        }
    }

    public abstract long addDownloadTaskFromAppDetail(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2);

    public abstract long addDownloadTaskFromAuthorize(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, String str);

    public abstract long addDownloadTaskFromTaskList(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2);

    public long addDownloadTaskFromWebview(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        String formatIntentUriPath = formatIntentUriPath(5, hashMap);
        long currentTimeMillis = System.currentTimeMillis();
        TMLog.m164114i(TAG, "addDownloadTaskFromTaskList,hostPackageName=" + this.hostPackageName + "; hostVersionCode=" + this.hostVersionCode + "; hostUserIdentity=" + "" + "; dataItemType=" + 0 + ";dataItemAction=" + formatIntentUriPath);
        return this.sdkChannel.AddDataItem(this.hostPackageName, this.hostVersionCode, "", 0, formatIntentUriPath, currentTimeMillis, currentTimeMillis + 300000, 0, (byte[]) null);
    }

    public long buildAddDBData(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2, String str, String str2, int i) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str2)) {
            map = formatMapParams(tMQQDownloaderOpenSDKParam, z, z2);
        } else {
            TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam2 = tMQQDownloaderOpenSDKParam;
            map = formatMapParams(tMQQDownloaderOpenSDKParam, true, true);
            map.put("verifytype", str2);
        }
        String formatIntentUriPath = formatIntentUriPath(i, map);
        long currentTimeMillis = System.currentTimeMillis();
        TMLog.m164114i(TAG, "addDownloadTaskFromTaskList,hostPackageName=" + this.hostPackageName + "; hostVersionCode=" + this.hostVersionCode + "; hostUserIdentity=" + "" + "; dataItemType=" + 0 + ";dataItemAction=" + formatIntentUriPath);
        return this.sdkChannel.AddDataItem(this.hostPackageName, this.hostVersionCode, "", 0, formatIntentUriPath, currentTimeMillis, currentTimeMillis + 300000, 0, (byte[]) null);
    }

    public int checkQQDownloaderInstalled() {
        Context context = this.mContext;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    if (packageManager.getPackageInfo("com.tencent.android.qqdownloader", 0) == null) {
                        return 1;
                    }
                    return this.sdkAPILevel > GlobalUtil.getInstance().getQQDownloaderAPILevel() ? 2 : 0;
                } catch (PackageManager.NameNotFoundException unused) {
                    TMLog.m164114i(TAG, "packagename not found！");
                }
            }
            return 1;
        }
        throw new Exception("you must initial openSDK,by calling initQQDownloaderOpenSDK method!");
    }

    public abstract void destroyQQDownloaderOpenSDK();

    public String formatEncryptUrl(String str) {
        String encode = URLEncoder.encode(OpenSDKTool4Assistant.encryptUri(str));
        return "tmast://encrypt?encryptdata=" + encode;
    }

    public String formatIntentUriPath(int i, Map<String, String> map) {
        String str = "appdetails";
        if (i == 1) {
            str = "download";
        } else if (!(i == 2 || i == 3)) {
            if (i == 4) {
                str = "updatedownload";
            } else if (i == 5) {
                str = "webview";
            }
        }
        String str2 = "tpmast://" + str + "?";
        int i2 = 0;
        String str3 = "";
        if (map != null && map.size() > 0) {
            String str4 = str3;
            for (Map.Entry next : map.entrySet()) {
                String str5 = (String) next.getKey();
                String str6 = (String) next.getValue();
                if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                    str4 = str4 + (i2 <= 0 ? str3 : "&") + str5 + "=" + URLEncoder.encode(str6);
                }
                i2++;
            }
            str3 = str4;
        }
        String str7 = str2 + str3;
        TMLog.m164114i(TAG, "path:" + str7);
        return formatEncryptUrl(str7);
    }

    public Map<String, String> formatMapParams(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2) {
        String formatOplist = formatOplist(z, z2);
        HashMap hashMap = new HashMap();
        hashMap.put("hostpname", this.hostPackageName);
        hashMap.put("hostversioncode", String.valueOf(this.hostVersionCode));
        hashMap.put("sngappid", tMQQDownloaderOpenSDKParam.SNGAppId);
        hashMap.put("appid", tMQQDownloaderOpenSDKParam.taskAppId);
        hashMap.put("apkid", tMQQDownloaderOpenSDKParam.taskApkId);
        hashMap.put("pname", tMQQDownloaderOpenSDKParam.taskPackageName);
        hashMap.put(OpenSDKTool4Assistant.EXTRA_VIA, tMQQDownloaderOpenSDKParam.via);
        hashMap.put("uin", tMQQDownloaderOpenSDKParam.uin);
        hashMap.put("uintype", tMQQDownloaderOpenSDKParam.uinType);
        hashMap.put("versioncode", String.valueOf(tMQQDownloaderOpenSDKParam.taskVersion));
        hashMap.put("oplist", formatOplist);
        hashMap.put("channelid", tMQQDownloaderOpenSDKParam.channelId);
        hashMap.put("actionflag", tMQQDownloaderOpenSDKParam.actionFlag);
        hashMap.put("sdkid", tMQQDownloaderOpenSDKParam.sdkId);
        return hashMap;
    }

    public String formatOplist(boolean z, boolean z2) {
        return (!z || !z2) ? z2 ? "2" : z ? "1" : "" : "1;2";
    }

    public abstract TMAssistantDownloadTaskInfo getDownloadTaskState(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam);

    public abstract void initQQDownloaderOpenSDK(Context context);

    public void onStateChanged(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, int i, int i2, String str) {
        Iterator<WeakReference<ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = (ITMQQDownloaderOpenSDKListener) it.next().get();
            if (iTMQQDownloaderOpenSDKListener == null) {
                TMLog.m164114i(TAG, "onDownloadStateChanged listener = null");
            } else {
                iTMQQDownloaderOpenSDKListener.OnDownloadTaskStateChanged(tMQQDownloaderOpenSDKParam, i, i2, str);
            }
        }
    }

    public boolean registerListener(ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener) {
        if (iTMQQDownloaderOpenSDKListener == null) {
            return false;
        }
        while (true) {
            Reference<? extends ITMQQDownloaderOpenSDKListener> poll = this.mListenerQueue.poll();
            if (poll == null) {
                break;
            }
            this.mWeakListenerArrayList.remove(poll);
        }
        Iterator<WeakReference<ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            if (((ITMQQDownloaderOpenSDKListener) it.next().get()) == iTMQQDownloaderOpenSDKListener) {
                return true;
            }
        }
        this.mWeakListenerArrayList.add(new WeakReference(iTMQQDownloaderOpenSDKListener, this.mListenerQueue));
        return true;
    }

    public boolean removeDownloadTask(long j) {
        if (j >= 0) {
            return this.sdkChannel.delDataItem(j);
        }
        return false;
    }

    public abstract void startToAuthorized(Context context, TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, String str);

    public void startToDownloadTaskList(Context context) {
        if (context != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("tmast://download?hostpname=" + this.hostPackageName + "&hostversion=" + this.hostVersionCode));
            if (context instanceof Application) {
                intent.addFlags(268435456);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/tmassistantsdk/openSDK/BaseQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/tmassistantsdk/openSDK/BaseQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        throw new Exception("you must input an application or activity context!");
    }

    public abstract void startToWebView(Context context, String str);

    public boolean unregisterListener(ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener) {
        if (iTMQQDownloaderOpenSDKListener == null) {
            return false;
        }
        Iterator<WeakReference<ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            if (((ITMQQDownloaderOpenSDKListener) it.next().get()) == iTMQQDownloaderOpenSDKListener) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public long buildAddDBData(byte[] bArr) {
        if (bArr == null) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return this.sdkChannel.AddDataItem((String) null, 0, (String) null, 0, (String) null, currentTimeMillis, currentTimeMillis + 300000, 1, bArr);
    }
}
