package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.framework.widget.tools.ActivityController;
import com.tencent.kinda.gen.IUIModal;
import com.tencent.kinda.gen.IUIPagePlatformDelegate;
import com.tencent.kinda.gen.KindaModalManager;
import com.tencent.kinda.gen.Platform;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

public class KindaModalManagerImpl implements KindaModalManager {
    public static final String TAG = "MicroMsg.KindaModalManagerImpl";

    public void addModalView(IUIModal iUIModal) {
        Log.m105925i(TAG, "kinda call addModalView, modal: %s, %s", iUIModal.getReportUrl(), Integer.valueOf(iUIModal.hashCode()));
        ActivityController.startNewUIModal(iUIModal);
    }

    public IUIPagePlatformDelegate getPlatformDelegate() {
        return new IUIPagePlatformDelegate() {
            public Platform currentPlatform() {
                return Platform.ANDROID;
            }
        };
    }

    public void removeAllModalViews() {
        ActivityController.removeAll();
    }

    public void removeModalViewImpl(IUIModal iUIModal, final VoidCallback voidCallback) {
        Log.m105925i(TAG, "kinda call reremoveModalView, modal: %s, %s", iUIModal.getReportUrl(), Integer.valueOf(iUIModal.hashCode()));
        ActivityController.remove(iUIModal);
        MMHandlerThread.postToMainThread(new Runnable() {
            public void run() {
                voidCallback.call();
            }
        });
    }
}
