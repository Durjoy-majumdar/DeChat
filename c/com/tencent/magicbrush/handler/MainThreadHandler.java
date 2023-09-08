package com.tencent.magicbrush.handler;

import p748xd.C91175g;

public class MainThreadHandler {

    /* renamed from: com.tencent.magicbrush.handler.MainThreadHandler$b */
    public static class C17660b implements Runnable {

        /* renamed from: d */
        public int f48047d;

        /* renamed from: e */
        public long f48048e;

        /* renamed from: f */
        public long f48049f;

        public C17660b(int i, long j, long j2, C17659a aVar) {
            this.f48047d = i;
            this.f48048e = j;
            this.f48049f = j2;
        }

        public void run() {
            int i = this.f48047d;
            if (i <= 1) {
                MainThreadHandler.nativeDoTask(this.f48048e, this.f48049f);
            } else {
                MainThreadHandler.post(this.f48048e, this.f48049f, i - 1);
            }
        }
    }

    /* access modifiers changed from: private */
    public static native void nativeDoTask(long j, long j2);

    public static void post(long j, long j2, int i) {
        C91175g.f261413a.post(new C17660b(i, j, j2, (C17659a) null));
    }
}
