package com.facebook.jni;

import com.facebook.jni.DestructorThread;
import p1003m6.C88699a;

public class HybridData {
    private Destructor mDestructor = new Destructor(this);

    public static class Destructor extends DestructorThread.Destructor {
        /* access modifiers changed from: private */
        public volatile long mNativePointer;

        public Destructor(Object obj) {
            super(obj);
        }

        public static native void deleteNative(long j);

        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }
    }

    static {
        C88699a.m110646a("fbjni");
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}
