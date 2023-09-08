package com.tencent.p014mm.sdk.platformtools;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import bp3.C79760s;
import fu3.C116901a;
import fu3.C116902b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import mu3.C109639a;
import mu3.C117561c;

/* renamed from: com.tencent.mm.sdk.platformtools.MMHandler */
public class MMHandler implements C116901a {
    private static final long SLOW_DURATION = 5000;
    private static final long SLOW_UI_DURATION = 300;
    private static final Handler UIHandler = new Handler(Looper.getMainLooper());
    private final Object lock;
    private TaskWatch mTaskWatch;
    private final C116901a realHandler;
    /* access modifiers changed from: private */
    public volatile Message runningMsg;

    /* renamed from: com.tencent.mm.sdk.platformtools.MMHandler$Callback */
    public interface Callback extends Handler.Callback {
    }

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.tencent.mm.sdk.platformtools.MMHandler$Specially */
    public @interface Specially {
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MMHandler$TaskWatch */
    public interface TaskWatch {
        void onTaskFinish(Runnable runnable);

        void onTaskStart(Runnable runnable);
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MMHandler$TaskWrapper */
    public static class TaskWrapper implements Runnable {
        public static Map<Runnable, TaskWrapper> sTraces = new ConcurrentHashMap();
        public final Runnable mTask;
        public final TaskWatch mTaskWatch;

        private TaskWrapper(Runnable runnable, TaskWatch taskWatch) {
            this.mTask = runnable;
            this.mTaskWatch = taskWatch;
        }

        public static TaskWrapper remove(Runnable runnable) {
            return sTraces.remove(runnable);
        }

        public static TaskWrapper wrap(Runnable runnable, TaskWatch taskWatch) {
            TaskWrapper taskWrapper = new TaskWrapper(runnable, taskWatch);
            sTraces.put(runnable, taskWrapper);
            return taskWrapper;
        }

        public void run() {
            this.mTaskWatch.onTaskStart(this.mTask);
            this.mTask.run();
            this.mTaskWatch.onTaskFinish(this.mTask);
            remove(this.mTask);
        }
    }

    public MMHandler() {
        this.lock = new Object();
        this.realHandler = createHandler(Looper.myLooper(), C109639a.m148953d(), (Callback) null);
    }

    public static Handler createFreeHandler(Looper looper) {
        return new Handler(looper);
    }

    private C116901a createHandler(Looper looper, C109639a aVar, Callback callback) {
        if (looper == Looper.getMainLooper() || aVar == C109639a.m148951b()) {
            return createLooperHandler(Looper.getMainLooper(), callback);
        }
        if (aVar != null) {
            return createSerialHandler(aVar, callback);
        }
        if (looper != null) {
            return createLooperHandler(looper, callback);
        }
        throw new RuntimeException("looper and serial is null!");
    }

    private C116901a createLooperHandler(Looper looper, Callback callback) {
        final long id = Looper.getMainLooper().getThread().getId();
        final Callback callback2 = callback;
        return new C116902b(new Handler(looper, callback) {
            /* JADX INFO: finally extract failed */
            public void dispatchMessage(Message message) {
                long currentTimeMillis = System.currentTimeMillis();
                Message unused = MMHandler.this.runningMsg = message;
                MMHandler.this.beforeDispatchMessage(message);
                try {
                    Runnable callback = message.getCallback();
                    StringBuilder sb = new StringBuilder();
                    sb.append("MMHandler.msg(what=");
                    sb.append(message.what);
                    sb.append(", cb=");
                    sb.append(callback != null ? C79760s.m96910c(ApplicationGlobal.context(), callback.getClass().getSimpleName()) : "null");
                    sb.append(")");
                    C79760s.m96908a(sb.toString());
                    super.dispatchMessage(message);
                    C79760s.m96909b();
                    MMHandler.this.afterDispatchMessage(message);
                    Message unused2 = MMHandler.this.runningMsg = null;
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    Thread currentThread = Thread.currentThread();
                    if (id == currentThread.getId()) {
                        if (currentTimeMillis2 < MMHandler.SLOW_UI_DURATION) {
                            return;
                        }
                    } else if (currentTimeMillis2 < 5000) {
                        return;
                    }
                    Log.m105929w("Handler#Monitor", "This msg handle so slow[%sms]! runnable=%s callback=%s thread=%s", Long.valueOf(currentTimeMillis2), message.getCallback(), callback2, currentThread.getName());
                } catch (Throwable th) {
                    C79760s.m96909b();
                    throw th;
                }
            }

            public void handleMessage(Message message) {
                MMHandler.this.handleMessage(message);
            }

            public boolean sendMessageAtTime(Message message, long j) {
                MMHandler.this.beforeSendMessage(message, j);
                return super.sendMessageAtTime(message, j);
            }
        });
    }

    private C116901a createSerialHandler(C109639a aVar, Callback callback) {
        final long id = Looper.getMainLooper().getThread().getId();
        final Callback callback2 = callback;
        return new C117561c(aVar, callback) {
            public void dispatchMessage(Message message) {
                long currentTimeMillis = System.currentTimeMillis();
                Message unused = MMHandler.this.runningMsg = message;
                super.dispatchMessage(message);
                Message unused2 = MMHandler.this.runningMsg = null;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                Thread currentThread = Thread.currentThread();
                if (id == currentThread.getId()) {
                    if (currentTimeMillis2 < MMHandler.SLOW_UI_DURATION) {
                        return;
                    }
                } else if (currentTimeMillis2 < 5000) {
                    return;
                }
                Log.m105929w("Handler#Monitor", "This msg handle so slow[%sms]! runnable=%s callback=%s thread=%s", Long.valueOf(currentTimeMillis2), message.getCallback(), callback2, currentThread.getName());
            }

            public void handleMessage(Message message) {
                MMHandler.this.handleMessage(message);
            }
        };
    }

    public void afterDispatchMessage(Message message) {
    }

    public void beforeDispatchMessage(Message message) {
    }

    public void beforeSendMessage(Message message, long j) {
    }

    public final void dispatchMessage(Message message) {
        this.realHandler.dispatchMessage(message);
    }

    public void dump(Printer printer, String str) {
        this.realHandler.dump(printer, str);
    }

    public boolean executeOrSendMessage(Message message) {
        return this.realHandler.executeOrSendMessage(message);
    }

    public Looper getLooper() {
        return this.realHandler.getLooper();
    }

    public String getMessageName(Message message) {
        return this.realHandler.getMessageName(message);
    }

    public Message getRunningMessage() {
        return this.runningMsg;
    }

    public final Handler getSelf() {
        return this.realHandler.getSelf();
    }

    public C109639a getSerial() {
        return this.realHandler.getSerial();
    }

    public String getSerialTag() {
        return this.realHandler.getSerialTag();
    }

    public void handleMessage(Message message) {
    }

    public boolean hasMessages(int i) {
        return this.realHandler.hasMessages(i);
    }

    public boolean isQuit() {
        return this.realHandler.isQuit();
    }

    public void join() {
        join(0);
    }

    public Message obtainMessage() {
        return this.realHandler.obtainMessage();
    }

    public boolean post(Runnable runnable) {
        TaskWatch taskWatch = this.mTaskWatch;
        return taskWatch != null ? this.realHandler.post(TaskWrapper.wrap(runnable, taskWatch)) : this.realHandler.post(runnable);
    }

    public boolean postAtFrontOfQueue(Runnable runnable) {
        TaskWatch taskWatch = this.mTaskWatch;
        return taskWatch != null ? this.realHandler.postAtFrontOfQueue(TaskWrapper.wrap(runnable, taskWatch)) : this.realHandler.postAtFrontOfQueue(runnable);
    }

    public boolean postAtTime(Runnable runnable, long j) {
        TaskWatch taskWatch = this.mTaskWatch;
        if (taskWatch != null) {
            return this.realHandler.postAtTime(TaskWrapper.wrap(runnable, taskWatch), j);
        }
        return this.realHandler.postAtTime(runnable, j);
    }

    public boolean postDelayed(Runnable runnable, long j) {
        TaskWatch taskWatch = this.mTaskWatch;
        if (taskWatch != null) {
            return this.realHandler.postDelayed(TaskWrapper.wrap(runnable, taskWatch), j);
        }
        return this.realHandler.postDelayed(runnable, j);
    }

    @Deprecated
    public final boolean postToWorker(Runnable runnable) {
        return this.realHandler.post(runnable);
    }

    public void postUI(Runnable runnable) {
        UIHandler.post(runnable);
    }

    public void postUIDelayed(Runnable runnable, long j) {
        UIHandler.postDelayed(runnable, j);
    }

    public boolean quit() {
        boolean quit;
        synchronized (this.lock) {
            quit = this.realHandler.quit();
            this.lock.notifyAll();
        }
        return quit;
    }

    public boolean quitSafely() {
        this.realHandler.post(new Runnable() {
            public void run() {
                MMHandler.this.quit();
            }
        });
        return true;
    }

    public void removeCallbacks(Runnable runnable) {
        if (this.mTaskWatch != null) {
            this.realHandler.removeCallbacks(TaskWrapper.remove(runnable));
        } else {
            this.realHandler.removeCallbacks(runnable);
        }
    }

    public void removeCallbacksAndMessages(Object obj) {
        this.realHandler.removeCallbacksAndMessages(obj);
    }

    public void removeMessages(int i) {
        this.realHandler.removeMessages(i);
    }

    public boolean sendEmptyMessage(int i) {
        return this.realHandler.sendEmptyMessage(i);
    }

    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.realHandler.sendEmptyMessageAtTime(i, j);
    }

    public boolean sendEmptyMessageDelayed(int i, long j) {
        return this.realHandler.sendEmptyMessageDelayed(i, j);
    }

    public boolean sendMessage(Message message) {
        return this.realHandler.sendMessage(message);
    }

    public boolean sendMessageAtFrontOfQueue(Message message) {
        return this.realHandler.sendMessageAtFrontOfQueue(message);
    }

    public final boolean sendMessageAtTime(Message message, long j) {
        return this.realHandler.sendMessageAtTime(message, j);
    }

    public boolean sendMessageDelayed(Message message, long j) {
        return this.realHandler.sendMessageDelayed(message, j);
    }

    public void setHasDefaultLooper(boolean z) {
        C116901a aVar = this.realHandler;
        if (aVar instanceof C117561c) {
            ((C117561c) aVar).setHasDefaultLooper(z);
        }
    }

    public void setLogging(boolean z) {
        C116901a aVar = this.realHandler;
        if (aVar instanceof C117561c) {
            ((C117561c) aVar).setLogging(z);
        }
    }

    public void setTaskWatch(TaskWatch taskWatch) {
        this.mTaskWatch = taskWatch;
    }

    public String toString() {
        return this.realHandler.toString();
    }

    public boolean hasMessages(int i, Object obj) {
        return this.realHandler.hasMessages(i, obj);
    }

    public void join(long j) {
        synchronized (this.lock) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i >= 0) {
                if (i != 0) {
                    long j2 = 0;
                    while (true) {
                        if (isQuit()) {
                            break;
                        }
                        long j3 = j - j2;
                        if (j3 <= 0) {
                            break;
                        }
                        this.lock.wait(j3);
                        j2 = System.currentTimeMillis() - currentTimeMillis;
                    }
                } else {
                    while (!isQuit()) {
                        this.lock.wait(j);
                    }
                }
            } else {
                throw new IllegalArgumentException("timeout value is negative");
            }
        }
    }

    public Message obtainMessage(int i) {
        return this.realHandler.obtainMessage(i);
    }

    public void removeMessages(int i, Object obj) {
        this.realHandler.removeMessages(i, obj);
    }

    public Message obtainMessage(int i, Object obj) {
        return this.realHandler.obtainMessage(i, obj);
    }

    public MMHandler(Callback callback) {
        this.lock = new Object();
        this.realHandler = createHandler(Looper.myLooper(), C109639a.m148953d(), callback);
    }

    public Message obtainMessage(int i, int i2, int i3) {
        return this.realHandler.obtainMessage(i, i2, i3);
    }

    public boolean postAtTime(Runnable runnable, Object obj, long j) {
        TaskWatch taskWatch = this.mTaskWatch;
        if (taskWatch != null) {
            return this.realHandler.postAtTime(TaskWrapper.wrap(runnable, taskWatch), obj, j);
        }
        return this.realHandler.postAtTime(runnable, obj, j);
    }

    public boolean postDelayed(Runnable runnable, Object obj, long j) {
        TaskWatch taskWatch = this.mTaskWatch;
        if (taskWatch != null) {
            return this.realHandler.postDelayed(TaskWrapper.wrap(runnable, taskWatch), obj, j);
        }
        return this.realHandler.postDelayed(runnable, obj, j);
    }

    public void removeCallbacks(Runnable runnable, Object obj) {
        if (this.mTaskWatch != null) {
            this.realHandler.removeCallbacks(TaskWrapper.remove(runnable), obj);
        } else {
            this.realHandler.removeCallbacks(runnable, obj);
        }
    }

    public Message obtainMessage(int i, int i2, int i3, Object obj) {
        return this.realHandler.obtainMessage(i, i2, i3, obj);
    }

    public MMHandler(Looper looper) {
        this.lock = new Object();
        Objects.requireNonNull(looper);
        this.realHandler = createHandler(looper, (C109639a) null, (Callback) null);
    }

    public MMHandler(Looper looper, Callback callback) {
        this.lock = new Object();
        Objects.requireNonNull(looper);
        this.realHandler = createHandler(looper, (C109639a) null, callback);
    }

    public MMHandler(String str, Callback callback) {
        this.lock = new Object();
        Objects.requireNonNull(str);
        this.realHandler = createHandler((Looper) null, C109639a.m148950a(str), callback);
    }

    public MMHandler(String str) {
        this.lock = new Object();
        this.realHandler = createHandler((Looper) null, C109639a.m148950a(str), (Callback) null);
    }

    public MMHandler(C109639a aVar) {
        this.lock = new Object();
        Objects.requireNonNull(aVar);
        this.realHandler = createHandler((Looper) null, aVar, (Callback) null);
    }

    public MMHandler(C109639a aVar, Callback callback) {
        this.lock = new Object();
        Objects.requireNonNull(aVar);
        this.realHandler = createHandler((Looper) null, aVar, callback);
    }
}
