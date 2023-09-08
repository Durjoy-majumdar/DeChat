package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class IUIPage {

    public static final class CppProxy extends IUIPage {
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

        private native NavigationBarConfig native_defaultNavigationBarConfig(long j);

        private native boolean native_enableInteractivePop(long j);

        private native boolean native_forceShowInLightMode(long j);

        private native boolean native_fullPageMode(long j);

        private native IUIPagePlatformFuncDelegate native_getPlatformFuncDelegate(long j);

        private native String native_getReportUrl(long j);

        private native KView native_keyboardTopView(long j);

        private native float native_keyboardTopViewBottomMargin(long j);

        private native void native_keyboardWillHide(long j);

        private native void native_keyboardWillShow(long j, float f);

        private native void native_onBack(long j);

        private native void native_onClickAndroidBack(long j);

        private native void native_onCreate(long j);

        private native void native_onCreateLayout(long j, KViewLayout kViewLayout);

        private native void native_onDestroy(long j);

        private native void native_onFirstLayoutFinished(long j);

        private native void native_onInvisible(long j);

        private native void native_onVisible(long j);

        private native void native_setPlatformDelegate(long j, IUIPagePlatformDelegate iUIPagePlatformDelegate);

        private native void native_setPlatformFuncDelegate(long j, IUIPagePlatformFuncDelegate iUIPagePlatformFuncDelegate);

        private native void native_startLoading(long j, String str, boolean z);

        private native void native_stopLoading(long j);

        private native boolean native_useSafeAreaToLayout(long j);

        private native void native_viewDidTransitionToNewSize(long j);

        public NavigationBarConfig defaultNavigationBarConfig() {
            return native_defaultNavigationBarConfig(this.nativeRef);
        }

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public boolean enableInteractivePop() {
            return native_enableInteractivePop(this.nativeRef);
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public boolean forceShowInLightMode() {
            return native_forceShowInLightMode(this.nativeRef);
        }

        public boolean fullPageMode() {
            return native_fullPageMode(this.nativeRef);
        }

        public IUIPagePlatformFuncDelegate getPlatformFuncDelegate() {
            return native_getPlatformFuncDelegate(this.nativeRef);
        }

        public String getReportUrl() {
            return native_getReportUrl(this.nativeRef);
        }

        public KView keyboardTopView() {
            return native_keyboardTopView(this.nativeRef);
        }

        public float keyboardTopViewBottomMargin() {
            return native_keyboardTopViewBottomMargin(this.nativeRef);
        }

        public void keyboardWillHide() {
            native_keyboardWillHide(this.nativeRef);
        }

        public void keyboardWillShow(float f) {
            native_keyboardWillShow(this.nativeRef, f);
        }

        public void onBack() {
            native_onBack(this.nativeRef);
        }

        public void onClickAndroidBack() {
            native_onClickAndroidBack(this.nativeRef);
        }

        public void onCreate() {
            native_onCreate(this.nativeRef);
        }

        public void onCreateLayout(KViewLayout kViewLayout) {
            native_onCreateLayout(this.nativeRef, kViewLayout);
        }

        public void onDestroy() {
            native_onDestroy(this.nativeRef);
        }

        public void onFirstLayoutFinished() {
            native_onFirstLayoutFinished(this.nativeRef);
        }

        public void onInvisible() {
            native_onInvisible(this.nativeRef);
        }

        public void onVisible() {
            native_onVisible(this.nativeRef);
        }

        public void setPlatformDelegate(IUIPagePlatformDelegate iUIPagePlatformDelegate) {
            native_setPlatformDelegate(this.nativeRef, iUIPagePlatformDelegate);
        }

        public void setPlatformFuncDelegate(IUIPagePlatformFuncDelegate iUIPagePlatformFuncDelegate) {
            native_setPlatformFuncDelegate(this.nativeRef, iUIPagePlatformFuncDelegate);
        }

        public void startLoading(String str, boolean z) {
            native_startLoading(this.nativeRef, str, z);
        }

        public void stopLoading() {
            native_stopLoading(this.nativeRef);
        }

        public boolean useSafeAreaToLayout() {
            return native_useSafeAreaToLayout(this.nativeRef);
        }

        public void viewDidTransitionToNewSize() {
            native_viewDidTransitionToNewSize(this.nativeRef);
        }
    }

    public static native IUIPage createAppUipage(String str);

    public abstract NavigationBarConfig defaultNavigationBarConfig();

    public abstract boolean enableInteractivePop();

    public abstract boolean forceShowInLightMode();

    public abstract boolean fullPageMode();

    public abstract IUIPagePlatformFuncDelegate getPlatformFuncDelegate();

    public abstract String getReportUrl();

    public abstract KView keyboardTopView();

    public abstract float keyboardTopViewBottomMargin();

    public abstract void keyboardWillHide();

    public abstract void keyboardWillShow(float f);

    public abstract void onBack();

    public abstract void onClickAndroidBack();

    public abstract void onCreate();

    public abstract void onCreateLayout(KViewLayout kViewLayout);

    public abstract void onDestroy();

    public abstract void onFirstLayoutFinished();

    public abstract void onInvisible();

    public abstract void onVisible();

    public abstract void setPlatformDelegate(IUIPagePlatformDelegate iUIPagePlatformDelegate);

    public abstract void setPlatformFuncDelegate(IUIPagePlatformFuncDelegate iUIPagePlatformFuncDelegate);

    public abstract void startLoading(String str, boolean z);

    public abstract void stopLoading();

    public abstract boolean useSafeAreaToLayout();

    public abstract void viewDidTransitionToNewSize();
}
