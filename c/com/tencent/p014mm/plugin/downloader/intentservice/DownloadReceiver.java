package com.tencent.p014mm.plugin.downloader.intentservice;

import android.os.Bundle;
import android.os.ResultReceiver;
import zc2.C91661e;

/* renamed from: com.tencent.mm.plugin.downloader.intentservice.DownloadReceiver */
public class DownloadReceiver extends ResultReceiver {
    static {
        Class<DownloadReceiver> cls = DownloadReceiver.class;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        super.onReceiveResult(i, bundle);
        if (i == 4657) {
            int i2 = bundle.getInt("progress");
            if (C91661e.f262638a != null) {
                if (i2 < 100) {
                    throw null;
                }
                throw null;
            }
        }
    }
}
