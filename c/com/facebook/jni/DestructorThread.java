package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

public class DestructorThread {
    /* access modifiers changed from: private */
    public static final DestructorList sDestructorList = new DestructorList();
    /* access modifiers changed from: private */
    public static final DestructorStack sDestructorStack = new DestructorStack();
    /* access modifiers changed from: private */
    public static final ReferenceQueue sReferenceQueue = new ReferenceQueue();
    private static final Thread sThread;

    public static abstract class Destructor extends PhantomReference<Object> {
        /* access modifiers changed from: private */
        public Destructor next;
        /* access modifiers changed from: private */
        public Destructor previous;

        public abstract void destruct();

        public Destructor(Object obj) {
            super(obj, DestructorThread.sReferenceQueue);
            DestructorThread.sDestructorStack.push(this);
        }

        private Destructor() {
            super((Object) null, DestructorThread.sReferenceQueue);
        }
    }

    public static class DestructorList {
        private final Destructor mHead;

        public DestructorList() {
            Terminus terminus = new Terminus();
            this.mHead = terminus;
            Destructor unused = terminus.next = new Terminus();
            Destructor unused2 = terminus.next.previous = terminus;
        }

        /* access modifiers changed from: private */
        public static void drop(Destructor destructor) {
            Destructor unused = destructor.next.previous = destructor.previous;
            Destructor unused2 = destructor.previous.next = destructor.next;
        }

        public void enqueue(Destructor destructor) {
            Destructor unused = destructor.next = this.mHead.next;
            Destructor unused2 = this.mHead.next = destructor;
            Destructor unused3 = destructor.next.previous = destructor;
            Destructor unused4 = destructor.previous = this.mHead;
        }
    }

    public static class DestructorStack {
        private final AtomicReference<Destructor> mHead;

        private DestructorStack() {
            this.mHead = new AtomicReference<>();
        }

        public void push(Destructor destructor) {
            boolean z;
            do {
                Destructor destructor2 = this.mHead.get();
                Destructor unused = destructor.next = destructor2;
                AtomicReference<Destructor> atomicReference = this.mHead;
                while (true) {
                    if (!atomicReference.compareAndSet(destructor2, destructor)) {
                        if (atomicReference.get() != destructor2) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } while (!z);
        }

        public void transferAllToList() {
            Destructor andSet = this.mHead.getAndSet((Object) null);
            while (andSet != null) {
                Destructor access$600 = andSet.next;
                DestructorThread.sDestructorList.enqueue(andSet);
                andSet = access$600;
            }
        }
    }

    public static class Terminus extends Destructor {
        private Terminus() {
            super();
        }

        public void destruct() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        C238021 r0 = new Thread("HybridData DestructorThread") {
            /* JADX WARNING: Can't wrap try/catch for region: R(4:0|1|(2:3|5)(1:6)|4) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
            /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:4:0x001a, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r2 = this;
                L_0x0000:
                    java.lang.ref.ReferenceQueue r0 = com.facebook.jni.DestructorThread.sReferenceQueue     // Catch:{ InterruptedException -> 0x0000 }
                    java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.DestructorThread$Destructor r0 = (com.facebook.jni.DestructorThread.Destructor) r0     // Catch:{ InterruptedException -> 0x0000 }
                    r0.destruct()     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.DestructorThread$Destructor r1 = r0.previous     // Catch:{ InterruptedException -> 0x0000 }
                    if (r1 != 0) goto L_0x001a
                    com.facebook.jni.DestructorThread$DestructorStack r1 = com.facebook.jni.DestructorThread.sDestructorStack     // Catch:{ InterruptedException -> 0x0000 }
                    r1.transferAllToList()     // Catch:{ InterruptedException -> 0x0000 }
                L_0x001a:
                    com.facebook.jni.DestructorThread.DestructorList.drop(r0)     // Catch:{ InterruptedException -> 0x0000 }
                    goto L_0x0000
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.jni.DestructorThread.C238021.run():void");
            }
        };
        sThread = r0;
        r0.start();
    }
}
