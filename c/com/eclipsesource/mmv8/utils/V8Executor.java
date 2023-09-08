package com.eclipsesource.mmv8.utils;

import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.JavaVoidCallback;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;
import java.util.LinkedList;

public class V8Executor extends Thread {
    private Exception exception;
    /* access modifiers changed from: private */
    public volatile boolean forceTerminating;
    private boolean longRunning;
    private String messageHandler;
    private LinkedList<String[]> messageQueue;
    private String result;
    private C80135V8 runtime;
    private final String script;
    private volatile boolean shuttingDown;
    private volatile boolean terminated;

    public class ExecutorTermination implements JavaVoidCallback {
        public ExecutorTermination() {
        }

        public void invoke(V8Object v8Object, V8Array v8Array) {
            if (V8Executor.this.forceTerminating) {
                throw new RuntimeException("V8Thread Termination");
            }
        }
    }

    public V8Executor(String str, boolean z, String str2) {
        this.terminated = false;
        this.shuttingDown = false;
        this.forceTerminating = false;
        this.exception = null;
        this.messageQueue = new LinkedList<>();
        this.script = str;
        this.longRunning = z;
        this.messageHandler = str2;
    }

    public void forceTermination() {
        synchronized (this) {
            this.forceTerminating = true;
            this.shuttingDown = true;
            C80135V8 v8 = this.runtime;
            if (v8 != null) {
                v8.terminateExecution();
            }
            notify();
        }
    }

    public Exception getException() {
        return this.exception;
    }

    public String getResult() {
        return this.result;
    }

    public boolean hasException() {
        return this.exception != null;
    }

    public boolean hasTerminated() {
        return this.terminated;
    }

    public boolean isShuttingDown() {
        return this.shuttingDown;
    }

    public boolean isTerminating() {
        return this.forceTerminating;
    }

    public void postMessage(String... strArr) {
        synchronized (this) {
            this.messageQueue.add(strArr);
            notify();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r8.runtime.getLocker().hasLock() == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        r8.runtime.release();
        r8.runtime = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        r8.terminated = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a1, code lost:
        if (r8.messageQueue.isEmpty() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a3, code lost:
        r3 = 0;
        r2 = r8.messageQueue.remove(0);
        r4 = new com.eclipsesource.mmv8.V8Array(r8.runtime);
        r5 = new com.eclipsesource.mmv8.V8Array(r8.runtime);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r6 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bb, code lost:
        if (r3 >= r6) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bd, code lost:
        r5.push(r2[r3]);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c5, code lost:
        r4.push((com.eclipsesource.mmv8.V8Value) r5);
        r8.runtime.executeVoidFunction(r8.messageHandler, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r5.release();
        r4.release();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.eclipsesource.mmv8.V8 r0 = com.eclipsesource.mmv8.C80135V8.createV8Runtime()     // Catch:{ all -> 0x0137 }
            r8.runtime = r0     // Catch:{ all -> 0x0137 }
            com.eclipsesource.mmv8.utils.V8Executor$ExecutorTermination r1 = new com.eclipsesource.mmv8.utils.V8Executor$ExecutorTermination     // Catch:{ all -> 0x0137 }
            r1.<init>()     // Catch:{ all -> 0x0137 }
            java.lang.String r2 = "__j2v8__checkThreadTerminate"
            r0.registerJavaMethod((com.eclipsesource.mmv8.JavaVoidCallback) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0137 }
            com.eclipsesource.mmv8.V8 r0 = r8.runtime     // Catch:{ all -> 0x0137 }
            r8.setup(r0)     // Catch:{ all -> 0x0137 }
            monitor-exit(r8)     // Catch:{ all -> 0x0137 }
            r0 = 0
            r1 = 1
            boolean r2 = r8.forceTerminating     // Catch:{ Exception -> 0x00fe }
            if (r2 != 0) goto L_0x0056
            com.eclipsesource.mmv8.V8 r2 = r8.runtime     // Catch:{ Exception -> 0x00fe }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fe }
            r3.<init>()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r4 = "__j2v8__checkThreadTerminate();\n"
            r3.append(r4)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r4 = r8.script     // Catch:{ Exception -> 0x00fe }
            r3.append(r4)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r4 = r8.getName()     // Catch:{ Exception -> 0x00fe }
            r5 = -1
            java.lang.Object r2 = r2.executeScript(r3, r4, r5)     // Catch:{ Exception -> 0x00fe }
            if (r2 == 0) goto L_0x0043
            java.lang.String r3 = r2.toString()     // Catch:{ Exception -> 0x00fe }
            r8.result = r3     // Catch:{ Exception -> 0x00fe }
        L_0x0043:
            boolean r3 = r2 instanceof com.eclipsesource.mmv8.Releasable     // Catch:{ Exception -> 0x00fe }
            if (r3 == 0) goto L_0x004d
            r3 = r2
            com.eclipsesource.mmv8.Releasable r3 = (com.eclipsesource.mmv8.Releasable) r3     // Catch:{ Exception -> 0x00fe }
            r3.release()     // Catch:{ Exception -> 0x00fe }
        L_0x004d:
            boolean r3 = r2 instanceof com.eclipsesource.mmv8.Releasable     // Catch:{ Exception -> 0x00fe }
            if (r3 == 0) goto L_0x0056
            com.eclipsesource.mmv8.Releasable r2 = (com.eclipsesource.mmv8.Releasable) r2     // Catch:{ Exception -> 0x00fe }
            r2.release()     // Catch:{ Exception -> 0x00fe }
        L_0x0056:
            boolean r2 = r8.forceTerminating     // Catch:{ Exception -> 0x00fe }
            if (r2 != 0) goto L_0x00e1
            boolean r2 = r8.longRunning     // Catch:{ Exception -> 0x00fe }
            if (r2 == 0) goto L_0x00e1
            monitor-enter(r8)     // Catch:{ Exception -> 0x00fe }
            java.util.LinkedList<java.lang.String[]> r2 = r8.messageQueue     // Catch:{ all -> 0x00de }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x006e
            boolean r2 = r8.shuttingDown     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x006e
            r8.wait()     // Catch:{ all -> 0x00de }
        L_0x006e:
            java.util.LinkedList<java.lang.String[]> r2 = r8.messageQueue     // Catch:{ all -> 0x00de }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x007a
            boolean r2 = r8.shuttingDown     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x007e
        L_0x007a:
            boolean r2 = r8.forceTerminating     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x009a
        L_0x007e:
            monitor-exit(r8)     // Catch:{ all -> 0x00de }
            monitor-enter(r8)
            com.eclipsesource.mmv8.V8 r2 = r8.runtime     // Catch:{ all -> 0x0097 }
            com.eclipsesource.mmv8.V8Locker r2 = r2.getLocker()     // Catch:{ all -> 0x0097 }
            boolean r2 = r2.hasLock()     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x0093
            com.eclipsesource.mmv8.V8 r2 = r8.runtime     // Catch:{ all -> 0x0097 }
            r2.release()     // Catch:{ all -> 0x0097 }
            r8.runtime = r0     // Catch:{ all -> 0x0097 }
        L_0x0093:
            r8.terminated = r1     // Catch:{ all -> 0x0097 }
            monitor-exit(r8)     // Catch:{ all -> 0x0097 }
            return
        L_0x0097:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0097 }
            throw r0
        L_0x009a:
            monitor-exit(r8)     // Catch:{ all -> 0x00de }
            java.util.LinkedList<java.lang.String[]> r2 = r8.messageQueue     // Catch:{ Exception -> 0x00fe }
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x00fe }
            if (r2 != 0) goto L_0x0056
            java.util.LinkedList<java.lang.String[]> r2 = r8.messageQueue     // Catch:{ Exception -> 0x00fe }
            r3 = 0
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ Exception -> 0x00fe }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x00fe }
            com.eclipsesource.mmv8.V8Array r4 = new com.eclipsesource.mmv8.V8Array     // Catch:{ Exception -> 0x00fe }
            com.eclipsesource.mmv8.V8 r5 = r8.runtime     // Catch:{ Exception -> 0x00fe }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00fe }
            com.eclipsesource.mmv8.V8Array r5 = new com.eclipsesource.mmv8.V8Array     // Catch:{ Exception -> 0x00fe }
            com.eclipsesource.mmv8.V8 r6 = r8.runtime     // Catch:{ Exception -> 0x00fe }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00fe }
            int r6 = r2.length     // Catch:{ all -> 0x00d6 }
        L_0x00bb:
            if (r3 >= r6) goto L_0x00c5
            r7 = r2[r3]     // Catch:{ all -> 0x00d6 }
            r5.push((java.lang.String) r7)     // Catch:{ all -> 0x00d6 }
            int r3 = r3 + 1
            goto L_0x00bb
        L_0x00c5:
            r4.push((com.eclipsesource.mmv8.V8Value) r5)     // Catch:{ all -> 0x00d6 }
            com.eclipsesource.mmv8.V8 r2 = r8.runtime     // Catch:{ all -> 0x00d6 }
            java.lang.String r3 = r8.messageHandler     // Catch:{ all -> 0x00d6 }
            r2.executeVoidFunction(r3, r4)     // Catch:{ all -> 0x00d6 }
            r5.release()     // Catch:{ Exception -> 0x00fe }
            r4.release()     // Catch:{ Exception -> 0x00fe }
            goto L_0x0056
        L_0x00d6:
            r2 = move-exception
            r5.release()     // Catch:{ Exception -> 0x00fe }
            r4.release()     // Catch:{ Exception -> 0x00fe }
            throw r2     // Catch:{ Exception -> 0x00fe }
        L_0x00de:
            r2 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00de }
            throw r2     // Catch:{ Exception -> 0x00fe }
        L_0x00e1:
            monitor-enter(r8)
            com.eclipsesource.mmv8.V8 r2 = r8.runtime     // Catch:{ all -> 0x00f9 }
            com.eclipsesource.mmv8.V8Locker r2 = r2.getLocker()     // Catch:{ all -> 0x00f9 }
            boolean r2 = r2.hasLock()     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            com.eclipsesource.mmv8.V8 r2 = r8.runtime     // Catch:{ all -> 0x00f9 }
            r2.release()     // Catch:{ all -> 0x00f9 }
            r8.runtime = r0     // Catch:{ all -> 0x00f9 }
        L_0x00f5:
            r8.terminated = r1     // Catch:{ all -> 0x00f9 }
            monitor-exit(r8)     // Catch:{ all -> 0x00f9 }
            goto L_0x0118
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00f9 }
            throw r0
        L_0x00fc:
            r2 = move-exception
            goto L_0x011c
        L_0x00fe:
            r2 = move-exception
            r8.exception = r2     // Catch:{ all -> 0x00fc }
            monitor-enter(r8)
            com.eclipsesource.mmv8.V8 r2 = r8.runtime     // Catch:{ all -> 0x0119 }
            com.eclipsesource.mmv8.V8Locker r2 = r2.getLocker()     // Catch:{ all -> 0x0119 }
            boolean r2 = r2.hasLock()     // Catch:{ all -> 0x0119 }
            if (r2 == 0) goto L_0x0115
            com.eclipsesource.mmv8.V8 r2 = r8.runtime     // Catch:{ all -> 0x0119 }
            r2.release()     // Catch:{ all -> 0x0119 }
            r8.runtime = r0     // Catch:{ all -> 0x0119 }
        L_0x0115:
            r8.terminated = r1     // Catch:{ all -> 0x0119 }
            monitor-exit(r8)     // Catch:{ all -> 0x0119 }
        L_0x0118:
            return
        L_0x0119:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0119 }
            throw r0
        L_0x011c:
            monitor-enter(r8)
            com.eclipsesource.mmv8.V8 r3 = r8.runtime     // Catch:{ all -> 0x0134 }
            com.eclipsesource.mmv8.V8Locker r3 = r3.getLocker()     // Catch:{ all -> 0x0134 }
            boolean r3 = r3.hasLock()     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x0130
            com.eclipsesource.mmv8.V8 r3 = r8.runtime     // Catch:{ all -> 0x0134 }
            r3.release()     // Catch:{ all -> 0x0134 }
            r8.runtime = r0     // Catch:{ all -> 0x0134 }
        L_0x0130:
            r8.terminated = r1     // Catch:{ all -> 0x0134 }
            monitor-exit(r8)     // Catch:{ all -> 0x0134 }
            throw r2
        L_0x0134:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0134 }
            throw r0
        L_0x0137:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0137 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.eclipsesource.mmv8.utils.V8Executor.run():void");
    }

    public void setup(C80135V8 v8) {
    }

    public void shutdown() {
        synchronized (this) {
            this.shuttingDown = true;
            notify();
        }
    }

    public V8Executor(String str) {
        this(str, false, (String) null);
    }
}
