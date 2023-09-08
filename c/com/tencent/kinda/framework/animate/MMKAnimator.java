package com.tencent.kinda.framework.animate;

import com.tencent.kinda.gen.KindaAnimator;
import com.tencent.kinda.gen.VoidCallback;

public class MMKAnimator implements KindaAnimator {
    public void startAnimationImpl(float f, final VoidCallback voidCallback) {
        KindaGlobalAnimator.startAnimate((long) (f * 1000.0f), new Runnable() {
            public void run() {
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
            }
        });
    }

    public void startAnimationImpl(float f, final VoidCallback voidCallback, final VoidCallback voidCallback2) {
        KindaGlobalAnimator.startAnimate((long) (f * 1000.0f), new Runnable() {
            public void run() {
                VoidCallback voidCallback = voidCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
            }
        }, new Runnable() {
            public void run() {
                VoidCallback voidCallback = voidCallback2;
                if (voidCallback != null) {
                    voidCallback.call();
                }
            }
        });
    }
}
