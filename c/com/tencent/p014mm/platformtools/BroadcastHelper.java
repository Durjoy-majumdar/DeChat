package com.tencent.p014mm.platformtools;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.tencent.p014mm.booter.CoreService;
import com.tencent.p014mm.booter.MMReceivers$ConnectionReceiver;
import com.tencent.p014mm.booter.MountReceiver;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.base.stub.WXEntryActivity;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.systemservicecache.NetworkCache;
import di3.C86312j;
import java.util.HashMap;
import p206nj.C11171e;
import p407zo.C112644i;
import zt3.C119157j;

/* renamed from: com.tencent.mm.platformtools.BroadcastHelper */
public class BroadcastHelper implements CoreService.C114706e {
    private static final String TAG = "MicroMsg.BroadcastHelper";

    /* renamed from: a */
    public static final /* synthetic */ int f310937a = 0;
    private static HashMap<String, BroadcastReceiver> broadcastReceiverHashMap = new HashMap<>();

    /* renamed from: com.tencent.mm.platformtools.BroadcastHelper$a */
    public class C104699a implements Runnable {
        public C104699a(BroadcastHelper broadcastHelper) {
        }

        public void run() {
            NetworkCache networkCache = NetworkCache.INSTANCE;
            networkCache.initCache(MMApplicationContext.getContext());
            boolean decodeBool = MultiProcessMMKV.getDefault().decodeBool("clicfg_network_cache_wifi", true);
            boolean decodeBool2 = MultiProcessMMKV.getDefault().decodeBool("clicfg_network_cache_wap", true);
            boolean decodeBool3 = MultiProcessMMKV.getDefault().decodeBool("clicfg_get_active_network_cache", true);
            networkCache.setWifiCacheExpt(decodeBool);
            networkCache.setWapCacheExpt(decodeBool2);
            networkCache.setNetworkCacheExpt(decodeBool3);
        }
    }

    public static void registerBroadcast(BroadcastReceiver broadcastReceiver, String str) {
        registerBroadcast(broadcastReceiver, new String[]{str}, new String[0]);
    }

    public static void unRegisterBroadcast(BroadcastReceiver broadcastReceiver) {
        Log.m105924i(TAG, "unRegisterBroadcast: " + broadcastReceiver.getClass().getSimpleName());
        MMApplicationContext.getContext().unregisterReceiver(broadcastReceiver);
    }

    public void registerBroadcasts() {
        Log.m105925i(TAG, "registerBroadcasts(), process:%s", MMApplicationContext.getProcessName());
        if (MMApplicationContext.isPushProcess()) {
            if (C11171e.m11046c(24)) {
                MMReceivers$ConnectionReceiver mMReceivers$ConnectionReceiver = new MMReceivers$ConnectionReceiver();
                broadcastReceiverHashMap.put(MMReceivers$ConnectionReceiver.class.getSimpleName(), mMReceivers$ConnectionReceiver);
                registerBroadcast((BroadcastReceiver) mMReceivers$ConnectionReceiver, "android.net.conn.CONNECTIVITY_CHANGE");
            }
            ConnectivityCompat.Companion.registerReceiver();
        }
        if (MMApplicationContext.isMMProcess()) {
            MountReceiver mountReceiver = new MountReceiver();
            Class<MountReceiver> cls = MountReceiver.class;
            broadcastReceiverHashMap.put("MountReceiver", mountReceiver);
            registerBroadcast((BroadcastReceiver) mountReceiver, new String[]{"android.intent.action.MEDIA_MOUNTED", "android.intent.action.MEDIA_EJECT", "android.intent.action.MEDIA_UNMOUNTED", "android.intent.action.MEDIA_SHARED", "android.intent.action.MEDIA_SCANNER_STARTED", "android.intent.action.MEDIA_SCANNER_FINISHED", "android.intent.action.MEDIA_REMOVED", "android.intent.action.MEDIA_BAD_REMOVAL"});
            if (C11171e.m11046c(26)) {
                WXEntryActivity.EntryReceiver entryReceiver = new WXEntryActivity.EntryReceiver();
                broadcastReceiverHashMap.put(WXEntryActivity.EntryReceiver.class.getSimpleName(), entryReceiver);
                registerBroadcast((BroadcastReceiver) entryReceiver, new String[]{ConstantsAPI.ACTION_HANDLE_APP_REGISTER, ConstantsAPI.ACTION_HANDLE_APP_UNREGISTER});
                BroadcastReceiver rT = ((C112644i) C86312j.m106911c(C112644i.class)).mo36798rT();
                broadcastReceiverHashMap.put("com.tencent.mm.ui.tools.QbCallBackBroadcast", rT);
                registerBroadcast(rT, "com.tencent.mm.qb");
            }
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C104699a(this));
    }

    public void unRegisterBroadcasts() {
        Log.m105924i(TAG, "unRegisterBroadcasts()");
        try {
            if (MMApplicationContext.isPushProcess()) {
                if (C11171e.m11046c(24)) {
                    unRegisterBroadcast((MMReceivers$ConnectionReceiver) broadcastReceiverHashMap.get(MMReceivers$ConnectionReceiver.class.getSimpleName()));
                }
                ConnectivityCompat.Companion.unregisterReceiver();
            }
            if (MMApplicationContext.isMMProcess()) {
                Class<MountReceiver> cls = MountReceiver.class;
                unRegisterBroadcast((MountReceiver) broadcastReceiverHashMap.get("MountReceiver"));
                if (C11171e.m11046c(26)) {
                    unRegisterBroadcast((WXEntryActivity.EntryReceiver) broadcastReceiverHashMap.get(WXEntryActivity.EntryReceiver.class.getSimpleName()));
                    unRegisterBroadcast(broadcastReceiverHashMap.get("com.tencent.mm.ui.tools.QbCallBackBroadcast"));
                }
            }
        } catch (Exception e) {
            Log.m105921e(TAG, "unRegisterBroadcasts() Exception = %s ", e.getMessage());
        }
    }

    public static void registerBroadcast(BroadcastReceiver broadcastReceiver, String str, String str2) {
        registerBroadcast(broadcastReceiver, new String[]{str}, new String[]{str2});
    }

    public static void registerBroadcast(BroadcastReceiver broadcastReceiver, String[] strArr) {
        registerBroadcast(broadcastReceiver, strArr, new String[0]);
    }

    public static void registerBroadcast(BroadcastReceiver broadcastReceiver, String[] strArr, String str) {
        registerBroadcast(broadcastReceiver, strArr, new String[]{str});
    }

    public static void registerBroadcast(BroadcastReceiver broadcastReceiver, String[] strArr, String[] strArr2) {
        Log.m105924i(TAG, "registerBroadcast: " + broadcastReceiver.getClass().getSimpleName());
        IntentFilter intentFilter = new IntentFilter();
        if (!Util.isNullOrNil(strArr)) {
            for (String addAction : strArr) {
                intentFilter.addAction(addAction);
            }
        }
        if (!Util.isNullOrNil(strArr2)) {
            for (String addCategory : strArr2) {
                intentFilter.addCategory(addCategory);
            }
        }
        MMApplicationContext.getContext().registerReceiver(broadcastReceiver, intentFilter);
    }
}
