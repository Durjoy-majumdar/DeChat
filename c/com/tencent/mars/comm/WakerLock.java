package com.tencent.mars.comm;

import a30.C112744a;
import android.content.Context;
import android.os.PowerManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.HashMap;

public class WakerLock {
    private static final String TAG = "MicroMsg.WakerLock";
    private static long lastChecktime;
    private static Boolean shouldLock;
    private byte _hellAccFlag_;
    /* access modifiers changed from: private */
    public IAutoUnlockCallback autoUnlockCallback;
    private Context context;
    /* access modifiers changed from: private */
    public String mCreatePosStackLine;
    private MMHandler mHandler;
    private Runnable mReleaser;
    /* access modifiers changed from: private */
    public PowerManager.WakeLock wakeLock;

    public interface IAutoUnlockCallback {
        void autoUnlockCallback();
    }

    public WakerLock(Context context2, String str, IAutoUnlockCallback iAutoUnlockCallback) {
        this(context2, str);
        this.autoUnlockCallback = iAutoUnlockCallback;
    }

    private String getCallerStack() {
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            if (!stackTraceElement.getClassName().contains(WakerLock.class.getName())) {
                return stackTraceElement.toString();
            }
        }
        return "<native>";
    }

    public void finalize() {
        Log.m105925i(TAG, "finalize unlock [%d,%d] @[%s]", Integer.valueOf(hashCode()), Integer.valueOf(this.wakeLock.hashCode()), this.mCreatePosStackLine);
        unLock();
        super.finalize();
    }

    public String getCreatePosStackLine() {
        return this.mCreatePosStackLine;
    }

    public int innerWakeLockHashCode() {
        return this.wakeLock.hashCode();
    }

    public boolean isLocking() {
        try {
            boolean isHeld = this.wakeLock.isHeld();
            Log.m105925i(TAG, "check is held [%d,%d] :%b caller:[%s] @[%s]", Integer.valueOf(hashCode()), Integer.valueOf(this.wakeLock.hashCode()), Boolean.valueOf(isHeld), getCallerStack(), getCreatePosStackLine());
            return isHeld;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", "");
            return false;
        }
    }

    public void lock(long j) {
        lock(j, getCallerStack());
    }

    public void unLock() {
        if (this.wakeLock.isHeld()) {
            this.mHandler.removeCallbacks(this.mReleaser);
            synchronized (C112744a.f337602c) {
                C112744a.C112746b bVar = C112744a.f337600a.get(hashCode());
                if (bVar != null) {
                    MMHandler mMHandler = C112744a.f337601b;
                    if (bVar.f337604a) {
                        bVar.f337604a = false;
                        mMHandler.removeCallbacks(bVar.f337605b);
                    }
                    for (C112744a.C112746b.C112747a aVar : ((HashMap) bVar.f337606c).values()) {
                        C112744a.C112748c.m154185a(aVar.f337607a, false);
                    }
                    ((HashMap) bVar.f337606c).clear();
                }
            }
            Log.m105925i(TAG, "unlock [%d,%d] caller:[%s] @[%s]", Integer.valueOf(hashCode()), Integer.valueOf(this.wakeLock.hashCode()), getCallerStack(), getCreatePosStackLine());
            try {
                PowerManager.WakeLock wakeLock2 = this.wakeLock;
                C117292a.m165357c(wakeLock2, "com/tencent/mars/comm/WakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                C117292a.m165359e(wakeLock2, "com/tencent/mars/comm/WakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", "");
            }
        }
    }

    public void lock() {
        lock(getCallerStack());
    }

    public WakerLock(Context context2, String str) {
        this(context2, str, 1);
    }

    public void lock(String str) {
        lock(-1, str);
    }

    public WakerLock(Context context2, String str, int i) {
        this.mCreatePosStackLine = null;
        this.wakeLock = null;
        this.mHandler = null;
        this.autoUnlockCallback = null;
        this.mReleaser = new Runnable() {
            public void run() {
                if (WakerLock.this.wakeLock.isHeld()) {
                    Log.m105929w(WakerLock.TAG, "unlock by timeout handler! [%d,%d] @[%s]", Integer.valueOf(WakerLock.this.hashCode()), Integer.valueOf(WakerLock.this.wakeLock.hashCode()), WakerLock.this.mCreatePosStackLine);
                    WakerLock.this.unLock();
                    if (WakerLock.this.autoUnlockCallback != null) {
                        WakerLock.this.autoUnlockCallback.autoUnlockCallback();
                    }
                }
            }
        };
        this.mCreatePosStackLine = getCallerStack();
        PowerManager.WakeLock newWakeLock = ((PowerManager) context2.getSystemService("power")).newWakeLock(i, str);
        this.wakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        this.mHandler = new MMHandler(context2.getMainLooper());
        this.context = context2;
        Log.m105925i(TAG, "init [%d,%d] @[%s]", Integer.valueOf(hashCode()), Integer.valueOf(this.wakeLock.hashCode()), this.mCreatePosStackLine);
    }

    public void lock(long j, String str) {
        long j2 = j;
        String str2 = str;
        try {
            if (this.wakeLock.isHeld()) {
                unLock();
            }
            C112744a.m154183a(this, str2);
            Log.m105925i(TAG, "lock [%d,%d] traceMsg:[%s] @[%s] limit time:%d", Integer.valueOf(hashCode()), Integer.valueOf(this.wakeLock.hashCode()), str2, getCreatePosStackLine(), Long.valueOf(j));
            PowerManager.WakeLock wakeLock2 = this.wakeLock;
            C117292a.m165357c(wakeLock2, "com/tencent/mars/comm/WakerLock", "lock", "(JLjava/lang/String;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock2.acquire();
            C117292a.m165359e(wakeLock2, "com/tencent/mars/comm/WakerLock", "lock", "(JLjava/lang/String;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            if (j2 == -1) {
                this.mHandler.removeCallbacks(this.mReleaser);
            } else {
                this.mHandler.postDelayed(this.mReleaser, j2);
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", "");
        }
    }
}
