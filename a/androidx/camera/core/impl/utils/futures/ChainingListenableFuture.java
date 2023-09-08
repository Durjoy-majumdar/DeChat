package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p1167z8.C112608f;

class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {
    private AsyncFunction<? super I, ? extends O> mFunction;
    private C112608f<? extends I> mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);
    public volatile C112608f<? extends O> mOutputFuture;

    public ChainingListenableFuture(AsyncFunction<? super I, ? extends O> asyncFunction, C112608f<? extends I> fVar) {
        asyncFunction.getClass();
        this.mFunction = asyncFunction;
        fVar.getClass();
        this.mInputFuture = fVar;
    }

    private <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z));
        cancel(this.mInputFuture, z);
        cancel(this.mOutputFuture, z);
        return true;
    }

    public O get() {
        if (!isDone()) {
            C112608f<? extends I> fVar = this.mInputFuture;
            if (fVar != null) {
                fVar.get();
            }
            this.mOutputCreated.await();
            C112608f<? extends O> fVar2 = this.mOutputFuture;
            if (fVar2 != null) {
                fVar2.get();
            }
        }
        return super.get();
    }

    public void run() {
        try {
            try {
                final C112608f<? extends O> apply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                this.mOutputFuture = apply;
                if (isCancelled()) {
                    apply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                    this.mOutputFuture = null;
                    this.mFunction = null;
                    this.mInputFuture = null;
                    this.mOutputCreated.countDown();
                    return;
                }
                apply.addListener(new Runnable() {
                    public void run() {
                        try {
                            ChainingListenableFuture.this.set(Futures.getUninterruptibly(apply));
                        } catch (CancellationException unused) {
                            ChainingListenableFuture.this.cancel(false);
                            ChainingListenableFuture.this.mOutputFuture = null;
                            return;
                        } catch (ExecutionException e) {
                            ChainingListenableFuture.this.setException(e.getCause());
                        } catch (Throwable th) {
                            ChainingListenableFuture.this.mOutputFuture = null;
                            throw th;
                        }
                        ChainingListenableFuture.this.mOutputFuture = null;
                    }
                }, CameraXExecutors.directExecutor());
                this.mFunction = null;
                this.mInputFuture = null;
                this.mOutputCreated.countDown();
            } catch (UndeclaredThrowableException e) {
                setException(e.getCause());
            } catch (Exception e2) {
                setException(e2);
            } catch (Error e3) {
                setException(e3);
            } catch (Throwable th) {
                this.mFunction = null;
                this.mInputFuture = null;
                this.mOutputCreated.countDown();
                throw th;
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e4) {
            setException(e4.getCause());
        }
    }

    private void cancel(Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    public O get(long j, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            C112608f<? extends I> fVar = this.mInputFuture;
            if (fVar != null) {
                long nanoTime = System.nanoTime();
                fVar.get(j, timeUnit);
                j -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.mOutputCreated.await(j, timeUnit)) {
                j -= Math.max(0, System.nanoTime() - nanoTime2);
                C112608f<? extends O> fVar2 = this.mOutputFuture;
                if (fVar2 != null) {
                    fVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j, timeUnit);
    }
}
