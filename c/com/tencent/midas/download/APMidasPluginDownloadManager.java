package com.tencent.midas.download;

import android.content.Context;
import com.tencent.midas.comm.APLog;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class APMidasPluginDownloadManager {
    private static final int MAX_CURRENCY_DOWNLOAD_THREAD = 1;
    private static final String TAG = "APMidasPluginDownloadManager";
    private ExecutorService executorService = getExecutorService();

    private APMidasPluginDownloadManager() {
    }

    private synchronized void enqueue(APMidasPluginDownloadWorker aPMidasPluginDownloadWorker) {
        if (aPMidasPluginDownloadWorker == null) {
            APLog.m161212e(TAG, "Cannot enqueue null worker!");
        } else {
            this.executorService.execute(aPMidasPluginDownloadWorker);
        }
    }

    private ExecutorService getExecutorService() {
        if (this.executorService == null) {
            this.executorService = Executors.newFixedThreadPool(1, threadFactory("Plugin Download Thread", false));
        }
        return this.executorService;
    }

    public static void startDownload(Context context, ArrayList<APMidasPluginDownInfo> arrayList, IAPMidasPluginDownListener iAPMidasPluginDownListener) {
        new APMidasPluginDownloadManager().enqueue(new APMidasPluginDownloadWorker(context, arrayList, context.getApplicationContext().getDir("midaspluginsTemp", 0), iAPMidasPluginDownListener));
    }

    private static ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() {
            private AtomicInteger netThreadCount = new AtomicInteger(0);

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str + " " + this.netThreadCount.getAndIncrement());
                thread.setPriority(10);
                thread.setDaemon(z);
                return thread;
            }
        };
    }
}
