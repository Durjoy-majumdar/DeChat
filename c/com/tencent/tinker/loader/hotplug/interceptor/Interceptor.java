package com.tencent.tinker.loader.hotplug.interceptor;

import com.tencent.tinker.loader.shareutil.ShareTinkerLog;

public abstract class Interceptor<T_TARGET> {
    private static final String TAG = "Tinker.Interceptor";
    private volatile boolean mInstalled = false;
    private T_TARGET mTarget = null;

    public interface ITinkerHotplugProxy {
    }

    public T_TARGET decorate(T_TARGET t_target) {
        return t_target;
    }

    public abstract T_TARGET fetchTarget();

    public abstract void inject(T_TARGET t_target);

    public synchronized void install() {
        try {
            T_TARGET fetchTarget = fetchTarget();
            this.mTarget = fetchTarget;
            T_TARGET decorate = decorate(fetchTarget);
            if (decorate != fetchTarget) {
                inject(decorate);
            } else {
                ShareTinkerLog.m106534w(TAG, "target: " + fetchTarget + " was already hooked.", new Object[0]);
            }
            this.mInstalled = true;
        } catch (Throwable th) {
            this.mTarget = null;
            throw new InterceptFailedException(th);
        }
    }

    public synchronized void uninstall() {
        if (this.mInstalled) {
            try {
                inject(this.mTarget);
                this.mTarget = null;
                this.mInstalled = false;
            } catch (Throwable th) {
                throw new InterceptFailedException(th);
            }
        }
    }
}
