package com.tencent.p014mm.sdk.thread;

import com.tencent.p014mm.sdk.thread.api.IThreadPool;
import lu3.C109426i;
import zt3.C119157j;

@Deprecated
/* renamed from: com.tencent.mm.sdk.thread.ThreadPool */
public class ThreadPool implements IThreadPool {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ThreadPool INSTANCE = new ThreadPool();
    public static final String TAG = "MicroMsg.ThreadPool";

    @Deprecated
    public static void post(Runnable runnable, String str) {
        INSTANCE.adapterPost(runnable, str, true);
    }

    @Deprecated
    public static void postAtFront(Runnable runnable, String str) {
        INSTANCE.adapterPost(runnable, str, true);
    }

    @Deprecated
    public void adapterPost(final Runnable runnable, final String str, final boolean z) {
        ((C119157j) C119157j.f356862d).mo183875f(new C109426i() {
            public String getKey() {
                return str;
            }

            public boolean isLogging() {
                return z;
            }

            public void run() {
                runnable.run();
            }
        });
    }

    @Deprecated
    public static void post(Runnable runnable, String str, boolean z) {
        INSTANCE.adapterPost(runnable, str, z);
    }

    @Deprecated
    public static void post(Runnable runnable, String str, int i) {
        INSTANCE.adapterPost(runnable, str, true);
    }
}
