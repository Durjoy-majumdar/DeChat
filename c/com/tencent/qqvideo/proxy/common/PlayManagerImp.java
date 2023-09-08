package com.tencent.qqvideo.proxy.common;

import com.tencent.qqvideo.proxy.api.IPlayManager;
import com.tencent.qqvideo.proxy.api.IUtils;
import com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade;

public class PlayManagerImp implements IPlayManager {
    private static String TAG = "TV_Httpproxy";
    private static boolean mbSoLoadSuccess;
    private ConfigStorage mConfigStorageInstance;
    private HttpproxyFacade proxy;

    public PlayManagerImp() {
        this.proxy = null;
        this.mConfigStorageInstance = new ConfigStorage();
        this.proxy = HttpproxyFacade.instance();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r2 = r2.getActiveNetworkInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isWifiOn(android.content.Context r2) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r0 = 0
            if (r2 != 0) goto L_0x000c
            return r0
        L_0x000c:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 != 0) goto L_0x0013
            return r0
        L_0x0013:
            int r2 = r2.getType()
            r1 = 1
            if (r2 != r1) goto L_0x001b
            return r1
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqvideo.proxy.common.PlayManagerImp.isWifiOn(android.content.Context):boolean");
    }

    public synchronized void appToBack() {
        try {
            this.proxy.pushEvent(4);
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,appToBack native not found");
        }
        return;
    }

    public synchronized void appToFront() {
        try {
            this.proxy.pushEvent(3);
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,appToFront native not found");
        }
        return;
    }

    public synchronized String buildPlayURLMp4(int i) {
        try {
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,buildPlayURL native not found");
            return "";
        }
        return this.proxy.buildPlayURL(i);
    }

    public synchronized int cleanStorage() {
        try {
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,cleanStorage native not found");
            return -1;
        }
        return this.proxy.cleanStorage();
    }

    public synchronized void deinit() {
        try {
            this.mConfigStorageInstance.stopGetServerConfig();
            this.proxy.deinit();
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,deinit native not found");
        }
        return;
    }

    public synchronized int getCurrentOffset(int i) {
        try {
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,getCurrentOffset native not found");
            return 0;
        }
        return this.proxy.getCurrentOffset(i);
    }

    public synchronized int getLocalServerPort() {
        try {
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,getLocalServerPort native not found");
            return -1;
        }
        return this.proxy.getLocalServerPort();
    }

    public synchronized String getProxyVersion() {
        try {
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,getProxyVersion native not found");
            return "TVHttpproxy.1.0.0.0000";
        }
        return this.proxy.getVersion();
    }

    public synchronized int getTotalOffset(int i) {
        try {
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,getTotalOffset native not found");
            return 0;
        }
        return this.proxy.getTotalOffset(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0048, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int init(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = -1
            if (r4 != 0) goto L_0x0006
            monitor-exit(r3)
            return r0
        L_0x0006:
            com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade r1 = r3.proxy     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x000d
            com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade.setContext(r4)     // Catch:{ all -> 0x004b }
        L_0x000d:
            boolean r1 = mbSoLoadSuccess     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = "wxhttpproxy"
            java.lang.Class<com.tencent.qqvideo.proxy.common.PlayManagerImp> r2 = com.tencent.qqvideo.proxy.common.PlayManagerImp.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0023 }
            com.tencent.qqvideo.proxy.httpproxy.TVHttpProxyLoadLibrary.load(r1, r2, r4)     // Catch:{ all -> 0x0023 }
            com.tencent.qqvideo.proxy.httpproxy.TVHttpProxyLoadLibrary.setupBrokenLibraryHandler()     // Catch:{ all -> 0x0023 }
            r1 = 1
            mbSoLoadSuccess = r1     // Catch:{ all -> 0x0023 }
            goto L_0x0028
        L_0x0023:
            r4 = 0
            mbSoLoadSuccess = r4     // Catch:{ all -> 0x004b }
            monitor-exit(r3)
            return r0
        L_0x0028:
            java.lang.String r1 = com.tencent.qqvideo.proxy.common.ConfigStorage.getDownProxyConfig(r4)     // Catch:{ all -> 0x0049 }
            com.tencent.qqvideo.proxy.common.ConfigStorage r2 = r3.mConfigStorageInstance     // Catch:{ all -> 0x0049 }
            r2.synGetServerConfig(r4)     // Catch:{ all -> 0x0049 }
            if (r5 != 0) goto L_0x0035
            java.lang.String r5 = ""
        L_0x0035:
            com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade r2 = r3.proxy     // Catch:{ all -> 0x0049 }
            int r5 = r2.init(r5, r1)     // Catch:{ all -> 0x0049 }
            boolean r4 = isWifiOn(r4)     // Catch:{ all -> 0x0049 }
            if (r4 != 0) goto L_0x0047
            com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade r4 = r3.proxy     // Catch:{ all -> 0x0049 }
            r1 = 2
            r4.setNetWorkState(r1)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r3)
            return r5
        L_0x0049:
            monitor-exit(r3)
            return r0
        L_0x004b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqvideo.proxy.common.PlayManagerImp.init(android.content.Context, java.lang.String):int");
    }

    public synchronized int preLoad(int i, int i2) {
        try {
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,preLoad native not found");
            return -1;
        }
        return this.proxy.preLoad(i, i2);
    }

    public synchronized void setCookie(String str) {
        try {
            this.proxy.setCookie(str);
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,setCookie native not found");
        }
        return;
    }

    public synchronized int setMaxStorageSize(long j) {
        try {
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,setMaxStorageSize native not found");
            return -1;
        }
        return this.proxy.setMaxStorageSize(j);
    }

    public synchronized void setNetWorkState(int i) {
        try {
            this.proxy.setNetWorkState(i);
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,setNetWorkStatus native not found");
        }
        return;
    }

    public synchronized void setPlayerState(int i) {
        try {
            this.proxy.setPlayerState(i);
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,setPlayState native not found");
        }
        return;
    }

    public synchronized void setRemainTime(int i, int i2) {
        try {
            this.proxy.setRemainTime(i, i2);
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,getTotalOffset native not found");
        }
        return;
    }

    public synchronized void setUtilsObject(IUtils iUtils) {
        try {
            this.proxy.setUtils(iUtils);
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,setUtilsObject native not found");
        }
        return;
    }

    public synchronized int startPlay(String str, int i, String str2, long j, int i2) {
        try {
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,startPlay native not found");
            return -1;
        }
        return this.proxy.startPlay(str, i, str2, j, i2);
    }

    public synchronized void stopPlay(int i) {
        try {
            this.proxy.stopPlay(i);
        } catch (Throwable unused) {
            HttpproxyFacade.print(6, TAG, "error ,stopPlay native not found");
        }
        return;
    }
}
