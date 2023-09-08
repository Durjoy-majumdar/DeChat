package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class IUIModal {

    public static final class CppProxy extends IUIModal {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native boolean native_IsShowAndroidCenterPadding(long j);

        private native float native_animationCutLinePosition(long j);

        private native boolean native_forceShowInLightMode(long j);

        private native IUIModalPlatformFuncDelegate native_getFuncDelegate(long j);

        private native String native_getReportUrl(long j);

        private native void native_keyboardWillHide(long j);

        private native void native_keyboardWillShow(long j, float f);

        private native DynamicColor native_navigationBarColor(long j);

        private native void native_onClickAndroidBack(long j);

        private native void native_onCreateLayout(long j, KViewLayout kViewLayout);

        private native void native_onDestroy(long j);

        private native void native_onFirstRenderFinish(long j);

        private native void native_onModalEnterBackground(long j);

        private native void native_onModalEnterForeground(long j);

        private native void native_setFuncDelegate(long j, IUIModalPlatformFuncDelegate iUIModalPlatformFuncDelegate);

        private native void native_setPlatformDelegate(long j, IUIPagePlatformDelegate iUIPagePlatformDelegate);

        private native DynamicColor native_statusbarColor(long j);

        private native boolean native_useImmediateKeyboardAnimation(long j);

        private native boolean native_useKeyboardCoverMode(long j);

        private native boolean native_usePanelModalMode(long j);

        private native void native_viewDidTransitionToNewSize(long j);

        public boolean IsShowAndroidCenterPadding() {
            return native_IsShowAndroidCenterPadding(this.nativeRef);
        }

        public float animationCutLinePosition() {
            return native_animationCutLinePosition(this.nativeRef);
        }

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public boolean forceShowInLightMode() {
            return native_forceShowInLightMode(this.nativeRef);
        }

        public IUIModalPlatformFuncDelegate getFuncDelegate() {
            return native_getFuncDelegate(this.nativeRef);
        }

        public String getReportUrl() {
            return native_getReportUrl(this.nativeRef);
        }

        public void keyboardWillHide() {
            native_keyboardWillHide(this.nativeRef);
        }

        public void keyboardWillShow(float f) {
            native_keyboardWillShow(this.nativeRef, f);
        }

        public DynamicColor navigationBarColor() {
            return native_navigationBarColor(this.nativeRef);
        }

        public void onClickAndroidBack() {
            native_onClickAndroidBack(this.nativeRef);
        }

        public void onCreateLayout(KViewLayout kViewLayout) {
            native_onCreateLayout(this.nativeRef, kViewLayout);
        }

        public void onDestroy() {
            native_onDestroy(this.nativeRef);
        }

        public void onFirstRenderFinish() {
            native_onFirstRenderFinish(this.nativeRef);
        }

        public void onModalEnterBackground() {
            native_onModalEnterBackground(this.nativeRef);
        }

        public void onModalEnterForeground() {
            native_onModalEnterForeground(this.nativeRef);
        }

        public void setFuncDelegate(IUIModalPlatformFuncDelegate iUIModalPlatformFuncDelegate) {
            native_setFuncDelegate(this.nativeRef, iUIModalPlatformFuncDelegate);
        }

        public void setPlatformDelegate(IUIPagePlatformDelegate iUIPagePlatformDelegate) {
            native_setPlatformDelegate(this.nativeRef, iUIPagePlatformDelegate);
        }

        public DynamicColor statusbarColor() {
            return native_statusbarColor(this.nativeRef);
        }

        public boolean useImmediateKeyboardAnimation() {
            return native_useImmediateKeyboardAnimation(this.nativeRef);
        }

        public boolean useKeyboardCoverMode() {
            return native_useKeyboardCoverMode(this.nativeRef);
        }

        public boolean usePanelModalMode() {
            return native_usePanelModalMode(this.nativeRef);
        }

        public void viewDidTransitionToNewSize() {
            native_viewDidTransitionToNewSize(this.nativeRef);
        }
    }

    public abstract boolean IsShowAndroidCenterPadding();

    public abstract float animationCutLinePosition();

    public abstract boolean forceShowInLightMode();

    public abstract IUIModalPlatformFuncDelegate getFuncDelegate();

    public abstract String getReportUrl();

    public abstract void keyboardWillHide();

    public abstract void keyboardWillShow(float f);

    public abstract DynamicColor navigationBarColor();

    public abstract void onClickAndroidBack();

    public abstract void onCreateLayout(KViewLayout kViewLayout);

    public abstract void onDestroy();

    public abstract void onFirstRenderFinish();

    public abstract void onModalEnterBackground();

    public abstract void onModalEnterForeground();

    public abstract void setFuncDelegate(IUIModalPlatformFuncDelegate iUIModalPlatformFuncDelegate);

    public abstract void setPlatformDelegate(IUIPagePlatformDelegate iUIPagePlatformDelegate);

    public abstract DynamicColor statusbarColor();

    public abstract boolean useImmediateKeyboardAnimation();

    public abstract boolean useKeyboardCoverMode();

    public abstract boolean usePanelModalMode();

    public abstract void viewDidTransitionToNewSize();
}
