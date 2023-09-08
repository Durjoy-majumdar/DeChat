package com.tencent.maas.camstudio;

import com.tencent.maas.camstudio.MJCamResourceManager;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.internal.NativeCallbackManager;
import java.lang.ref.WeakReference;

public class MJCamResourceManagerCallback {

    public static class CompleteCallback extends BaseCallback<MJCamResourceManagerCallbackArg.CompleteArg> {
        private final MJCamResourceManager.OnComplete onComplete;

        public CompleteCallback(MJCamResourceManager mJCamResourceManager, MJCamResourceManager.OnComplete onComplete2) {
            super(mJCamResourceManager);
            this.onComplete = onComplete2;
        }

        public void onInvoke(MJCamResourceManager mJCamResourceManager, MJCamResourceManagerCallbackArg.CompleteArg completeArg) {
            MJCamResourceManager.OnComplete onComplete2 = this.onComplete;
            if (onComplete2 != null && completeArg != null) {
                onComplete2.onComplete(completeArg.error);
            }
        }

        public CompleteCallback(MJCamResourceManager mJCamResourceManager, MJCamResourceManager.OnComplete onComplete2, boolean z) {
            super(mJCamResourceManager, z);
            this.onComplete = onComplete2;
        }
    }

    public static class MJCamResourceManagerCallbackArg extends NativeCallbackManager.CallbackArgs {

        public static class CompleteArg extends MJCamResourceManagerCallbackArg {
            public final MJError error;

            public CompleteArg(MJError mJError) {
                this.error = mJError;
            }
        }

        public static class ProgressArg extends MJCamResourceManagerCallbackArg {
            public final float progress;

            public ProgressArg(float f) {
                this.progress = f;
            }
        }
    }

    public static class ProgressCallback extends BaseCallback<MJCamResourceManagerCallbackArg.ProgressArg> {
        private final MJCamResourceManager.OnProgress onProgress;

        public ProgressCallback(MJCamResourceManager mJCamResourceManager, MJCamResourceManager.OnProgress onProgress2) {
            super(mJCamResourceManager);
            this.onProgress = onProgress2;
        }

        public void onInvoke(MJCamResourceManager mJCamResourceManager, MJCamResourceManagerCallbackArg.ProgressArg progressArg) {
            MJCamResourceManager.OnProgress onProgress2 = this.onProgress;
            if (onProgress2 != null && progressArg != null) {
                onProgress2.onProgress(progressArg.progress);
            }
        }

        public ProgressCallback(MJCamResourceManager mJCamResourceManager, MJCamResourceManager.OnProgress onProgress2, boolean z) {
            super(mJCamResourceManager, z);
            this.onProgress = onProgress2;
        }
    }

    public static abstract class BaseCallback<T> extends NativeCallbackManager.Callback {
        private final WeakReference<MJCamResourceManager> mjCamResourceManagerWeakReference;

        public BaseCallback(MJCamResourceManager mJCamResourceManager) {
            this.mjCamResourceManagerWeakReference = new WeakReference<>(mJCamResourceManager);
        }

        public final void invoke(NativeCallbackManager.CallbackArgs callbackArgs) {
            onInvoke(this.mjCamResourceManagerWeakReference.get(), callbackArgs);
        }

        public abstract void onInvoke(MJCamResourceManager mJCamResourceManager, T t);

        public BaseCallback(MJCamResourceManager mJCamResourceManager, boolean z) {
            super(z);
            this.mjCamResourceManagerWeakReference = new WeakReference<>(mJCamResourceManager);
        }
    }
}
