package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class IAppKinda {

    public static final class CppProxy extends IAppKinda {
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

        private native void native_applicationBecomeActive(long j);

        private native void native_applicationEnterBackground(long j);

        private native void native_applicationEnterForeground(long j);

        private native void native_applicationReceiveMemoryWarning(long j, ITransmitKvData iTransmitKvData);

        private native void native_applicationResignActive(long j);

        private native void native_applicationRestart(long j);

        private native void native_applicationWillTerminate(long j, ITransmitKvData iTransmitKvData);

        private native void native_checkIfNeedRequestUserBindqueryWhenUnBindCard(long j, String str);

        private native void native_checkIfNeedUpdateOfflinePayToken(long j);

        private native boolean native_checkOfflineReady(long j);

        private native boolean native_getIsPaying(long j);

        private native boolean native_isInAnyUseCase(long j);

        private native boolean native_isUseCaseAlive(long j, String str);

        private native void native_networkChange(long j, ITransmitKvData iTransmitKvData);

        private native void native_notifyAllUseCases(long j, ITransmitKvData iTransmitKvData);

        private native void native_notifyHKOfflineNewXml(long j, ITransmitKvData iTransmitKvData);

        private native void native_notifyScreenCapture(long j);

        private native void native_popToUseCase(long j, String str);

        private native UseCase native_startUseCase(long j, String str, ITransmitKvData iTransmitKvData, UseCaseCallback useCaseCallback);

        private native void native_stopUseCase(long j, String str);

        private native void native_takeScreenshot(long j);

        private native void native_updateOfflinePayDefaultCard(long j, String str, String str2);

        private native void native_updateOfflinePayTokenWithScene(long j, int i);

        public void applicationBecomeActive() {
            native_applicationBecomeActive(this.nativeRef);
        }

        public void applicationEnterBackground() {
            native_applicationEnterBackground(this.nativeRef);
        }

        public void applicationEnterForeground() {
            native_applicationEnterForeground(this.nativeRef);
        }

        public void applicationReceiveMemoryWarning(ITransmitKvData iTransmitKvData) {
            native_applicationReceiveMemoryWarning(this.nativeRef, iTransmitKvData);
        }

        public void applicationResignActive() {
            native_applicationResignActive(this.nativeRef);
        }

        public void applicationRestart() {
            native_applicationRestart(this.nativeRef);
        }

        public void applicationWillTerminate(ITransmitKvData iTransmitKvData) {
            native_applicationWillTerminate(this.nativeRef, iTransmitKvData);
        }

        public void checkIfNeedRequestUserBindqueryWhenUnBindCard(String str) {
            native_checkIfNeedRequestUserBindqueryWhenUnBindCard(this.nativeRef, str);
        }

        public void checkIfNeedUpdateOfflinePayToken() {
            native_checkIfNeedUpdateOfflinePayToken(this.nativeRef);
        }

        public boolean checkOfflineReady() {
            return native_checkOfflineReady(this.nativeRef);
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

        public boolean getIsPaying() {
            return native_getIsPaying(this.nativeRef);
        }

        public boolean isInAnyUseCase() {
            return native_isInAnyUseCase(this.nativeRef);
        }

        public boolean isUseCaseAlive(String str) {
            return native_isUseCaseAlive(this.nativeRef, str);
        }

        public void networkChange(ITransmitKvData iTransmitKvData) {
            native_networkChange(this.nativeRef, iTransmitKvData);
        }

        public void notifyAllUseCases(ITransmitKvData iTransmitKvData) {
            native_notifyAllUseCases(this.nativeRef, iTransmitKvData);
        }

        public void notifyHKOfflineNewXml(ITransmitKvData iTransmitKvData) {
            native_notifyHKOfflineNewXml(this.nativeRef, iTransmitKvData);
        }

        public void notifyScreenCapture() {
            native_notifyScreenCapture(this.nativeRef);
        }

        public void popToUseCase(String str) {
            native_popToUseCase(this.nativeRef, str);
        }

        public UseCase startUseCase(String str, ITransmitKvData iTransmitKvData, UseCaseCallback useCaseCallback) {
            return native_startUseCase(this.nativeRef, str, iTransmitKvData, useCaseCallback);
        }

        public void stopUseCase(String str) {
            native_stopUseCase(this.nativeRef, str);
        }

        public void takeScreenshot() {
            native_takeScreenshot(this.nativeRef);
        }

        public void updateOfflinePayDefaultCard(String str, String str2) {
            native_updateOfflinePayDefaultCard(this.nativeRef, str, str2);
        }

        public void updateOfflinePayTokenWithScene(int i) {
            native_updateOfflinePayTokenWithScene(this.nativeRef, i);
        }
    }

    public static native IAppKinda getInstance();

    public abstract void applicationBecomeActive();

    public abstract void applicationEnterBackground();

    public abstract void applicationEnterForeground();

    public abstract void applicationReceiveMemoryWarning(ITransmitKvData iTransmitKvData);

    public abstract void applicationResignActive();

    public abstract void applicationRestart();

    public abstract void applicationWillTerminate(ITransmitKvData iTransmitKvData);

    public abstract void checkIfNeedRequestUserBindqueryWhenUnBindCard(String str);

    public abstract void checkIfNeedUpdateOfflinePayToken();

    public abstract boolean checkOfflineReady();

    public abstract boolean getIsPaying();

    public abstract boolean isInAnyUseCase();

    public abstract boolean isUseCaseAlive(String str);

    public abstract void networkChange(ITransmitKvData iTransmitKvData);

    public abstract void notifyAllUseCases(ITransmitKvData iTransmitKvData);

    public abstract void notifyHKOfflineNewXml(ITransmitKvData iTransmitKvData);

    public abstract void notifyScreenCapture();

    public abstract void popToUseCase(String str);

    public abstract UseCase startUseCase(String str, ITransmitKvData iTransmitKvData, UseCaseCallback useCaseCallback);

    public abstract void stopUseCase(String str);

    public abstract void takeScreenshot();

    public abstract void updateOfflinePayDefaultCard(String str, String str2);

    public abstract void updateOfflinePayTokenWithScene(int i);
}
