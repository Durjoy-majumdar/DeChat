package com.eclipsesource.mmv8.utils;

import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.ReferenceHandler;
import com.eclipsesource.mmv8.V8Value;
import java.util.ArrayList;
import java.util.Iterator;

public class MemoryManager {
    private MemoryManagerReferenceHandler memoryManagerReferenceHandler;
    /* access modifiers changed from: private */
    public ArrayList<V8Value> references = new ArrayList<>();
    private boolean released = false;
    /* access modifiers changed from: private */
    public boolean releasing = false;

    /* renamed from: v8 */
    private C80135V8 f234644v8;

    public class MemoryManagerReferenceHandler implements ReferenceHandler {
        private MemoryManagerReferenceHandler() {
        }

        public void v8HandleCreated(V8Value v8Value) {
            MemoryManager.this.references.add(v8Value);
        }

        public void v8HandleDisposed(V8Value v8Value) {
            if (!MemoryManager.this.releasing) {
                Iterator it = MemoryManager.this.references.iterator();
                while (it.hasNext()) {
                    if (it.next() == v8Value) {
                        it.remove();
                        return;
                    }
                }
            }
        }
    }

    public MemoryManager(C80135V8 v8) {
        this.f234644v8 = v8;
        MemoryManagerReferenceHandler memoryManagerReferenceHandler2 = new MemoryManagerReferenceHandler();
        this.memoryManagerReferenceHandler = memoryManagerReferenceHandler2;
        v8.addReferenceHandler(memoryManagerReferenceHandler2);
    }

    private void checkReleased() {
        if (this.released) {
            throw new IllegalStateException("Memory manager released");
        }
    }

    public int getObjectReferenceCount() {
        checkReleased();
        return this.references.size();
    }

    public boolean isReleased() {
        return this.released;
    }

    public void persist(V8Value v8Value) {
        this.f234644v8.getLocker().checkThread();
        checkReleased();
        this.references.remove(v8Value);
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        this.f234644v8.getLocker().checkThread();
        if (!this.released) {
            this.releasing = true;
            try {
                Iterator<V8Value> it = this.references.iterator();
                while (it.hasNext()) {
                    it.next().release();
                }
                this.f234644v8.removeReferenceHandler(this.memoryManagerReferenceHandler);
                this.references.clear();
                this.releasing = false;
                this.released = true;
            } catch (Throwable th) {
                this.releasing = false;
                throw th;
            }
        }
    }
}
