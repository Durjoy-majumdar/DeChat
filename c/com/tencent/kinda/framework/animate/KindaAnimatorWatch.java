package com.tencent.kinda.framework.animate;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.ArrayList;
import java.util.List;

public class KindaAnimatorWatch {
    private static final String TAG = "MicroMsg.KindaAnimatorWatch";
    /* access modifiers changed from: private */
    public static List<Runnable> pendingActions = new ArrayList();
    /* access modifiers changed from: private */
    public static int pendingObj = 0;

    public static void didObjCreated(final int i) {
        pendingObj = i;
        MMHandlerThread.postToMainThreadDelayed(new Runnable() {
            public void run() {
                if (i != KindaAnimatorWatch.pendingObj) {
                    for (Runnable run : KindaAnimatorWatch.pendingActions) {
                        run.run();
                    }
                    KindaAnimatorWatch.pendingActions.clear();
                    int unused = KindaAnimatorWatch.pendingObj = 0;
                }
            }
        }, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }

    public static void didViewCreated(int i) {
        if (i == pendingObj) {
            pendingObj = 0;
            MMHandlerThread.postToMainThread(new Runnable(0) {
                public void run() {
                    for (Runnable run : KindaAnimatorWatch.pendingActions) {
                        run.run();
                    }
                    KindaAnimatorWatch.pendingActions.clear();
                }
            });
        }
    }

    public static void post(final Runnable runnable) {
        if (pendingObj != 0) {
            pendingActions.add(runnable);
        } else {
            MMHandlerThread.postToMainThread(new Runnable() {
                public void run() {
                    runnable.run();
                }
            });
        }
    }
}
