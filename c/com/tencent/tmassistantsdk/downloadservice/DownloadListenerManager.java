package com.tencent.tmassistantsdk.downloadservice;

import java.util.ArrayList;
import java.util.Iterator;

public class DownloadListenerManager {
    public static DownloadListenerManager mDownloadListenerManager;
    public final ArrayList<IDownloadManagerListener> mListeners = new ArrayList<>();

    public static DownloadListenerManager getInstance() {
        if (mDownloadListenerManager == null) {
            mDownloadListenerManager = new DownloadListenerManager();
        }
        return mDownloadListenerManager;
    }

    public synchronized void Add(IDownloadManagerListener iDownloadManagerListener) {
        if (!this.mListeners.contains(iDownloadManagerListener)) {
            this.mListeners.add(iDownloadManagerListener);
        }
    }

    public synchronized void OnDownloadProgressChanged(String str, long j, long j2) {
        Iterator<IDownloadManagerListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().OnDownloadProgressChanged(str, j, j2);
        }
    }

    public synchronized void OnDownloadStateChanged(String str, int i, int i2, String str2, boolean z, boolean z2) {
        Iterator<IDownloadManagerListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().OnDownloadStateChanged(str, i, i2, str2, z, z2);
        }
    }

    public synchronized void Remove(IDownloadManagerListener iDownloadManagerListener) {
        this.mListeners.remove(iDownloadManagerListener);
    }
}
