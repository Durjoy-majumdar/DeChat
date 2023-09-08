package com.tencent.mars.ilink.comm;

import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import com.tencent.mars.ilink.xlog.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

public class WakerLock {
    private static final String TAG = "MicroMsg.WakerLock";
    private byte _hellAccFlag_;
    private Handler mHandler = null;
    private Runnable mReleaser = new Runnable() {
        public void run() {
            WakerLock.this.unLock();
        }
    };
    private PowerManager.WakeLock wakeLock = null;

    public WakerLock(Context context) {
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, TAG);
        this.wakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        this.mHandler = new Handler(context.getMainLooper());
    }

    public void finalize() {
        unLock();
    }

    public boolean isLocking() {
        try {
            return this.wakeLock.isHeld();
        } catch (Exception unused) {
            return false;
        }
    }

    public void lock(long j) {
        if (j == -1) {
            try {
                PowerManager.WakeLock wakeLock2 = this.wakeLock;
                C117292a.m165357c(wakeLock2, "com/tencent/mars/ilink/comm/WakerLock", "lock", "(J)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock2.acquire();
                C117292a.m165359e(wakeLock2, "com/tencent/mars/ilink/comm/WakerLock", "lock", "(J)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                Log.m160932w(TAG, "acquire wakelock without timeout, msg:");
            } catch (Exception unused) {
            }
        } else {
            PowerManager.WakeLock wakeLock3 = this.wakeLock;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Long.valueOf(j));
            C117292a.m165358d(wakeLock3, aVar.mo10232b(), "com/tencent/mars/ilink/comm/WakerLock", "lock", "(J)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            C60958c.f173611a.set(aVar);
            long longValue = ((Long) aVar.mo10231a(0)).longValue();
            C60958c.m71441a();
            wakeLock3.acquire(longValue);
            C117292a.m165359e(wakeLock3, "com/tencent/mars/ilink/comm/WakerLock", "lock", "(J)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
        }
    }

    public void unLock() {
        try {
            this.mHandler.removeCallbacks(this.mReleaser);
            if (this.wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = this.wakeLock;
                C117292a.m165357c(wakeLock2, "com/tencent/mars/ilink/comm/WakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                C117292a.m165359e(wakeLock2, "com/tencent/mars/ilink/comm/WakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
        } catch (Exception unused) {
        }
    }

    public void lock() {
        try {
            this.mHandler.removeCallbacks(this.mReleaser);
            lock(-1);
        } catch (Exception unused) {
        }
    }
}
