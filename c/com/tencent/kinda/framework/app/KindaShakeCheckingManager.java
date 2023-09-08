package com.tencent.kinda.framework.app;

import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.IShakeCheckingManager;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import ud3.C101998d;

public class KindaShakeCheckingManager implements IShakeCheckingManager {
    private static final int CONTINUE_SHAKE_INTERVAL = 80;
    private static final int FIRST_SHAKE_INTERVAL = 1200;
    private final String TAG = "KindaShakeCheckingManager";
    private Runnable delayNofiyRunnable = new Runnable() {
        public void run() {
            if (!KindaShakeCheckingManager.this.isInvokeCallback && KindaShakeCheckingManager.this.delayNotifyCallback != null) {
                KindaShakeCheckingManager.this.delayNotifyCallback.call();
            }
        }
    };
    /* access modifiers changed from: private */
    public VoidCallback delayNotifyCallback;
    private int delayNotifyMs = 3000;
    /* access modifiers changed from: private */
    public boolean isInvokeCallback = false;
    /* access modifiers changed from: private */
    public boolean isStartShake = false;
    /* access modifiers changed from: private */
    public long lastShakeTime;
    /* access modifiers changed from: private */
    public VoidCallback shakeCallBack;
    private C101998d shakeSensor;

    public void playShakeMatch(boolean z) {
        if (z) {
            PlaySound.play(KindaContext.get(), C0966R.string.j4p);
        } else {
            PlaySound.play(KindaContext.get(), C0966R.string.f361353j50);
        }
    }

    public void playShakeSound() {
        PlaySound.play(KindaContext.get(), C0966R.string.j5q);
    }

    public void setDelayNotifyCallBackImpl(VoidCallback voidCallback, int i) {
        this.delayNotifyCallback = voidCallback;
        this.delayNotifyMs = i;
    }

    public void setOnShakeCallBackImpl(VoidCallback voidCallback) {
        this.shakeCallBack = voidCallback;
    }

    public void startCheck() {
        C101998d dVar = new C101998d(KindaContext.get());
        this.shakeSensor = dVar;
        dVar.mo141497a(new C101998d.C101999a() {
            public void onRelease() {
            }

            public void onShake(boolean z) {
                Log.m105924i("KindaShakeCheckingManager", "onShake");
                long ticksToNow = Util.ticksToNow(KindaShakeCheckingManager.this.lastShakeTime);
                if (!KindaShakeCheckingManager.this.isStartShake) {
                    if (ticksToNow < 1200) {
                        return;
                    }
                } else if (ticksToNow < 80) {
                    return;
                }
                long unused = KindaShakeCheckingManager.this.lastShakeTime = Util.currentTicks();
                boolean unused2 = KindaShakeCheckingManager.this.isStartShake = true;
                if (!KindaShakeCheckingManager.this.isInvokeCallback) {
                    boolean unused3 = KindaShakeCheckingManager.this.isInvokeCallback = true;
                    if (KindaShakeCheckingManager.this.shakeCallBack != null) {
                        KindaShakeCheckingManager.this.shakeCallBack.call();
                    }
                }
            }
        });
        this.lastShakeTime = Util.currentTicks();
        MMHandlerThread.removeRunnable(this.delayNofiyRunnable);
        MMHandlerThread.postToMainThreadDelayed(this.delayNofiyRunnable, (long) this.delayNotifyMs);
    }

    public void stopCheck() {
        C101998d dVar = this.shakeSensor;
        if (dVar != null) {
            dVar.mo141498b();
            this.shakeSensor = null;
        }
        this.isInvokeCallback = false;
        this.isStartShake = false;
        MMHandlerThread.removeRunnable(this.delayNofiyRunnable);
    }
}
