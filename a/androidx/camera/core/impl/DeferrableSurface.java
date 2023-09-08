package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.atomic.AtomicInteger;
import p1167z8.C112608f;
import p202m2.C117512b;

public abstract class DeferrableSurface {
    private static final boolean DEBUG = Logger.isDebugEnabled(TAG);
    public static final Size SIZE_UNDEFINED = new Size(0, 0);
    private static final String TAG = "DeferrableSurface";
    private static final AtomicInteger TOTAL_COUNT = new AtomicInteger(0);
    private static final AtomicInteger USED_COUNT = new AtomicInteger(0);
    private boolean mClosed;
    public Class<?> mContainerClass;
    private final Object mLock;
    private final Size mPrescribedSize;
    private final int mPrescribedStreamFormat;
    private C117512b.C117513a<Void> mTerminationCompleter;
    private final C112608f<Void> mTerminationFuture;
    private int mUseCount;

    public static final class SurfaceClosedException extends Exception {
        public DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        public DeferrableSurface getDeferrableSurface() {
            return this.mDeferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        this(SIZE_UNDEFINED, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(C117512b.C117513a aVar) {
        synchronized (this.mLock) {
            this.mTerminationCompleter = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(String str) {
        try {
            this.mTerminationFuture.get();
            printGlobalDebugCounts("Surface terminated", TOTAL_COUNT.decrementAndGet(), USED_COUNT.get());
        } catch (Exception e) {
            Logger.m15473e(TAG, "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.mLock) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", new Object[]{this, Boolean.valueOf(this.mClosed), Integer.valueOf(this.mUseCount)}), e);
            }
        }
    }

    private void printGlobalDebugCounts(String str, int i, int i2) {
        if (!DEBUG && Logger.isDebugEnabled(TAG)) {
            Logger.m15471d(TAG, "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        Logger.m15471d(TAG, str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public final void close() {
        C117512b.C117513a<Void> aVar;
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mClosed = true;
                if (this.mUseCount == 0) {
                    aVar = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                } else {
                    aVar = null;
                }
                if (Logger.isDebugEnabled(TAG)) {
                    Logger.m15471d(TAG, "surface closed,  useCount=" + this.mUseCount + " closed=true " + this);
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.mo182231a(null);
        }
    }

    public void decrementUseCount() {
        C117512b.C117513a<Void> aVar;
        synchronized (this.mLock) {
            int i = this.mUseCount;
            if (i != 0) {
                int i2 = i - 1;
                this.mUseCount = i2;
                if (i2 != 0 || !this.mClosed) {
                    aVar = null;
                } else {
                    aVar = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                }
                if (Logger.isDebugEnabled(TAG)) {
                    Logger.m15471d(TAG, "use count-1,  useCount=" + this.mUseCount + " closed=" + this.mClosed + " " + this);
                    if (this.mUseCount == 0) {
                        printGlobalDebugCounts("Surface no longer in use", TOTAL_COUNT.get(), USED_COUNT.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.mo182231a(null);
        }
    }

    public Class<?> getContainerClass() {
        return this.mContainerClass;
    }

    public Size getPrescribedSize() {
        return this.mPrescribedSize;
    }

    public int getPrescribedStreamFormat() {
        return this.mPrescribedStreamFormat;
    }

    public final C112608f<Surface> getSurface() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                C112608f<Surface> immediateFailedFuture = Futures.immediateFailedFuture(new SurfaceClosedException("DeferrableSurface already closed.", this));
                return immediateFailedFuture;
            }
            C112608f<Surface> provideSurface = provideSurface();
            return provideSurface;
        }
    }

    public C112608f<Void> getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    public int getUseCount() {
        int i;
        synchronized (this.mLock) {
            i = this.mUseCount;
        }
        return i;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            int i = this.mUseCount;
            if (i == 0) {
                if (this.mClosed) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
            }
            this.mUseCount = i + 1;
            if (Logger.isDebugEnabled(TAG)) {
                if (this.mUseCount == 1) {
                    printGlobalDebugCounts("New surface in use", TOTAL_COUNT.get(), USED_COUNT.incrementAndGet());
                }
                Logger.m15471d(TAG, "use count+1, useCount=" + this.mUseCount + " " + this);
            }
        }
    }

    public abstract C112608f<Surface> provideSurface();

    public void setContainerClass(Class<?> cls) {
        this.mContainerClass = cls;
    }

    public DeferrableSurface(Size size, int i) {
        this.mLock = new Object();
        this.mUseCount = 0;
        this.mClosed = false;
        this.mPrescribedSize = size;
        this.mPrescribedStreamFormat = i;
        C112608f<Void> a = C117512b.m165760a(new DeferrableSurface$$a(this));
        this.mTerminationFuture = a;
        if (Logger.isDebugEnabled(TAG)) {
            printGlobalDebugCounts("Surface created", TOTAL_COUNT.incrementAndGet(), USED_COUNT.get());
            a.addListener(new DeferrableSurface$$b(this, Log.getStackTraceString(new Exception())), CameraXExecutors.directExecutor());
        }
    }
}
