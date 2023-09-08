package com.tencent.xweb.pinus.sdk.process;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.xweb.pinus.ChildProcessServiceWrapper;

public class ContentChildProcessService extends Service {
    private static final String TAG = "ContentChildProcessService";
    private ChildProcessServiceWrapper mService;

    public IBinder onBind(Intent intent) {
        if (this.mService == null) {
            ChildProcessServiceWrapper childProcessServiceWrapper = new ChildProcessServiceWrapper(intent, this, getApplicationContext());
            this.mService = childProcessServiceWrapper;
            childProcessServiceWrapper.onCreate();
        }
        return this.mService.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
        this.mService.onDestroy();
        this.mService = null;
    }
}
