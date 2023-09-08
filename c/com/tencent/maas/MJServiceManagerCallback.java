package com.tencent.maas;

import com.tencent.maas.MJServiceManager;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.internal.NativeCallbackManager;
import com.tencent.maas.model.MJTemplateCategory;
import java.lang.ref.WeakReference;

public class MJServiceManagerCallback {

    public static class CompleteCallback extends BaseCallback<MJServiceManagerCallbackArg> {
        private final MJServiceManager.OnComplete onComplete;

        public CompleteCallback(MJServiceManager mJServiceManager, MJServiceManager.OnComplete onComplete2) {
            super(mJServiceManager);
            this.onComplete = onComplete2;
        }

        public void onInvoke(MJServiceManager mJServiceManager, MJServiceManagerCallbackArg mJServiceManagerCallbackArg) {
            MJServiceManager.OnComplete onComplete2 = this.onComplete;
            if (onComplete2 != null && mJServiceManagerCallbackArg != null) {
                onComplete2.onComplete(mJServiceManagerCallbackArg.templateCategory, mJServiceManagerCallbackArg.error);
            }
        }

        public CompleteCallback(MJServiceManager mJServiceManager, MJServiceManager.OnComplete onComplete2, boolean z) {
            super(mJServiceManager, z);
            this.onComplete = onComplete2;
        }
    }

    public static class MJServiceManagerCallbackArg extends NativeCallbackManager.CallbackArgs {
        public final MJError error;
        public final MJTemplateCategory templateCategory;

        public MJServiceManagerCallbackArg(MJTemplateCategory mJTemplateCategory, MJError mJError) {
            this.templateCategory = mJTemplateCategory;
            this.error = mJError;
        }
    }

    public static abstract class BaseCallback<T> extends NativeCallbackManager.Callback {
        private final WeakReference<MJServiceManager> mjServiceManagerRef;

        public BaseCallback(MJServiceManager mJServiceManager) {
            this.mjServiceManagerRef = new WeakReference<>(mJServiceManager);
        }

        public final void invoke(NativeCallbackManager.CallbackArgs callbackArgs) {
            onInvoke(this.mjServiceManagerRef.get(), callbackArgs);
        }

        public abstract void onInvoke(MJServiceManager mJServiceManager, T t);

        public BaseCallback(MJServiceManager mJServiceManager, boolean z) {
            super(z);
            this.mjServiceManagerRef = new WeakReference<>(mJServiceManager);
        }
    }
}
