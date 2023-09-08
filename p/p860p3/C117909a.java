package p860p3;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p329d3.C116556i;
import p834a3.C112743e;
import p860p3.C117914c;

/* renamed from: p3.a */
public abstract class C117909a<D> extends C117911b<D> {
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncTaskLoader";
    public volatile C117909a<D>.a mCancellingTask;
    private final Executor mExecutor;
    public Handler mHandler;
    public long mLastLoadCompleteTime;
    public volatile C117909a<D>.a mTask;
    public long mUpdateThrottle;

    /* renamed from: p3.a$a */
    public final class C117910a extends C117914c<Void, Void, D> implements Runnable {

        /* renamed from: n */
        public final CountDownLatch f352434n = new CountDownLatch(1);

        /* renamed from: o */
        public boolean f352435o;

        public C117910a() {
        }

        /* renamed from: a */
        public Object mo182668a(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                return C117909a.this.onLoadInBackground();
            } catch (C112743e e) {
                if (this.f352442g.get()) {
                    return null;
                }
                throw e;
            }
        }

        /* renamed from: b */
        public void mo182669b(D d) {
            try {
                C117909a.this.dispatchOnCancelled(this, d);
            } finally {
                this.f352434n.countDown();
            }
        }

        /* renamed from: c */
        public void mo182670c(D d) {
            try {
                C117909a.this.dispatchOnLoadComplete(this, d);
            } finally {
                this.f352434n.countDown();
            }
        }

        public void run() {
            this.f352435o = false;
            C117909a.this.executePendingTask();
        }
    }

    public C117909a(Context context) {
        this(context, C117914c.f352437i);
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(C117909a<D>.a aVar, D d) {
        onCanceled(d);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(C117909a<D>.a aVar, D d) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, d);
        } else if (isAbandoned()) {
            onCanceled(d);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f352435o);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f352435o);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            long j = this.mUpdateThrottle;
            Object obj = C116556i.f349575a;
            synchronized (obj) {
                printWriter.print(new String(C116556i.f349576b, 0, C116556i.m164397b(j, 0)));
            }
            printWriter.print(" mLastLoadCompleteTime=");
            long j2 = this.mLastLoadCompleteTime;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (j2 == 0) {
                printWriter.print("--");
            } else {
                long j3 = j2 - uptimeMillis;
                synchronized (obj) {
                    printWriter.print(new String(C116556i.f349576b, 0, C116556i.m164397b(j3, 0)));
                }
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.f352435o) {
                this.mTask.f352435o = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                C117909a<D>.a aVar = this.mTask;
                Executor executor = this.mExecutor;
                if (aVar.f352441f != C117914c.C117919f.PENDING) {
                    int ordinal = aVar.f352441f.ordinal();
                    if (ordinal == 1) {
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    } else if (ordinal != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    } else {
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                } else {
                    aVar.f352441f = C117914c.C117919f.RUNNING;
                    aVar.f352439d.f352452d = null;
                    executor.execute(aVar.f352440e);
                }
            } else {
                this.mTask.f352435o = true;
                this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            }
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f352435o) {
                this.mTask.f352435o = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        } else if (this.mTask.f352435o) {
            this.mTask.f352435o = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        } else {
            C117909a<D>.a aVar = this.mTask;
            aVar.f352442g.set(true);
            boolean cancel = aVar.f352440e.cancel(false);
            if (cancel) {
                this.mCancellingTask = this.mTask;
                cancelLoadInBackground();
            }
            this.mTask = null;
            return cancel;
        }
    }

    public void onCanceled(D d) {
    }

    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new C117910a();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        C117909a<D>.a aVar = this.mTask;
        if (aVar != null) {
            try {
                aVar.f352434n.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    private C117909a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = executor;
    }
}
