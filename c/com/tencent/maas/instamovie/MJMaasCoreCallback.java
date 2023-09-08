package com.tencent.maas.instamovie;

import com.tencent.maas.MJMaasCore;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.internal.NativeCallbackManager;
import java.lang.ref.WeakReference;

public class MJMaasCoreCallback {

    public static class BoolCompleteCallback extends BaseCallback<MJMaasCoreCallbackArg.BoolCompleteArg> {
        private final MJMaasCore.OnBoolComplete onBoolComplete;

        public BoolCompleteCallback(MJMaasCore mJMaasCore, MJMaasCore.OnBoolComplete onBoolComplete2) {
            super(mJMaasCore);
            this.onBoolComplete = onBoolComplete2;
        }

        public void onInvoke(MJMaasCore mJMaasCore, MJMaasCoreCallbackArg.BoolCompleteArg boolCompleteArg) {
            MJMaasCore.OnBoolComplete onBoolComplete2 = this.onBoolComplete;
            if (onBoolComplete2 != null && boolCompleteArg != null) {
                onBoolComplete2.onComplete(boolCompleteArg.value);
            }
        }

        public BoolCompleteCallback(MJMaasCore mJMaasCore, MJMaasCore.OnBoolComplete onBoolComplete2, boolean z) {
            super(mJMaasCore, z);
            this.onBoolComplete = onBoolComplete2;
        }
    }

    public static class CompleteCallback extends BaseCallback<MJMaasCoreCallbackArg.CompleteArg> {
        private final MJMaasCore.OnComplete onComplete;

        public CompleteCallback(MJMaasCore mJMaasCore, MJMaasCore.OnComplete onComplete2) {
            super(mJMaasCore);
            this.onComplete = onComplete2;
        }

        public void onInvoke(MJMaasCore mJMaasCore, MJMaasCoreCallbackArg.CompleteArg completeArg) {
            MJMaasCore.OnComplete onComplete2 = this.onComplete;
            if (onComplete2 != null && completeArg != null) {
                onComplete2.onComplete(completeArg.error);
            }
        }

        public CompleteCallback(MJMaasCore mJMaasCore, MJMaasCore.OnComplete onComplete2, boolean z) {
            super(mJMaasCore, z);
            this.onComplete = onComplete2;
        }
    }

    public static class ILinkLoginParamCallback extends BaseCallbackWithReturnValue<NativeCallbackManager.CallbackArgs> {
        private final MJMaasCore.LoginParamsCallback loginParamsCallback;

        public ILinkLoginParamCallback(MJMaasCore mJMaasCore, MJMaasCore.LoginParamsCallback loginParamsCallback2) {
            super(mJMaasCore);
            this.loginParamsCallback = loginParamsCallback2;
        }

        public Object onInvokeWithReturnValue(MJMaasCore mJMaasCore, NativeCallbackManager.CallbackArgs callbackArgs) {
            return this.loginParamsCallback.onGetLoginParams();
        }

        public ILinkLoginParamCallback(MJMaasCore mJMaasCore, MJMaasCore.LoginParamsCallback loginParamsCallback2, boolean z) {
            super(mJMaasCore, z);
            this.loginParamsCallback = loginParamsCallback2;
        }
    }

    public static class MJMaasCoreCallbackArg extends NativeCallbackManager.CallbackArgs {

        public static class BoolCompleteArg extends MJMaasCoreCallbackArg {
            public final boolean value;

            public BoolCompleteArg(boolean z) {
                this.value = z;
            }
        }

        public static class CompleteArg extends MJMaasCoreCallbackArg {
            public final MJError error;

            public CompleteArg(MJError mJError) {
                this.error = mJError;
            }
        }
    }

    public static abstract class BaseCallback<T> extends NativeCallbackManager.Callback {
        private final WeakReference<MJMaasCore> massCoreRef;

        public BaseCallback(MJMaasCore mJMaasCore) {
            this.massCoreRef = new WeakReference<>(mJMaasCore);
        }

        public final void invoke(NativeCallbackManager.CallbackArgs callbackArgs) {
            onInvoke(this.massCoreRef.get(), callbackArgs);
        }

        public abstract void onInvoke(MJMaasCore mJMaasCore, T t);

        public BaseCallback(MJMaasCore mJMaasCore, boolean z) {
            super(z);
            this.massCoreRef = new WeakReference<>(mJMaasCore);
        }
    }

    public static abstract class BaseCallbackWithReturnValue<T> extends NativeCallbackManager.CallbackWithReturnValue {
        private final WeakReference<MJMaasCore> massCoreRef;

        public BaseCallbackWithReturnValue(MJMaasCore mJMaasCore) {
            this.massCoreRef = new WeakReference<>(mJMaasCore);
        }

        public final Object invoke(NativeCallbackManager.CallbackArgs callbackArgs) {
            return onInvokeWithReturnValue(this.massCoreRef.get(), callbackArgs);
        }

        public abstract Object onInvokeWithReturnValue(MJMaasCore mJMaasCore, T t);

        public BaseCallbackWithReturnValue(MJMaasCore mJMaasCore, boolean z) {
            super(z);
            this.massCoreRef = new WeakReference<>(mJMaasCore);
        }
    }
}
