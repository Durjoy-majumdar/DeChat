package com.tencent.wechat.aff.common;

import android.os.Handler;
import android.os.Looper;
import com.tencent.mars.ilink.xlog.Log;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/wechat/aff/common/ThreadHelper;", "", "()V", "Companion", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
public final class ThreadHelper {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMessage.Ting.ThreadHelper";
    /* access modifiers changed from: private */
    public static ThreadHelperDelegate delegate;
    /* access modifiers changed from: private */
    public static final C13601g<Handler> mainThreadHandle$delegate = C36568h.m40985a(ThreadHelper$Companion$mainThreadHandle$2.INSTANCE);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/wechat/aff/common/ThreadHelper$Companion;", "", "", "isMainThread", "", "runnablePtr", "Lrx3/b0;", "runInMainThread", "Landroid/os/Handler;", "mainThreadHandle$delegate", "Lrx3/g;", "getMainThreadHandle", "()Landroid/os/Handler;", "mainThreadHandle", "Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;", "delegate", "Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;", "getDelegate", "()Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;", "setDelegate", "(Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;)V", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        private final Handler getMainThreadHandle() {
            return (Handler) ThreadHelper.mainThreadHandle$delegate.getValue();
        }

        public final ThreadHelperDelegate getDelegate() {
            return ThreadHelper.delegate;
        }

        public final boolean isMainThread() {
            ThreadHelperDelegate delegate = getDelegate();
            return delegate != null ? delegate.isMainThread() : C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread());
        }

        public final void runInMainThread(long j) {
            Log.m160922d(ThreadHelper.TAG, "runInMainThread ptr:" + j);
            FunctionRunnable functionRunnable = new FunctionRunnable();
            functionRunnable.setNativePointer(j);
            ThreadHelperDelegate delegate = getDelegate();
            if (delegate != null) {
                delegate.runInMainThread(functionRunnable);
            } else if (isMainThread()) {
                functionRunnable.run();
            } else {
                getMainThreadHandle().post(functionRunnable);
            }
        }

        public final void setDelegate(ThreadHelperDelegate threadHelperDelegate) {
            ThreadHelper.delegate = threadHelperDelegate;
        }
    }

    public static final boolean isMainThread() {
        return Companion.isMainThread();
    }

    public static final void runInMainThread(long j) {
        Companion.runInMainThread(j);
    }
}
