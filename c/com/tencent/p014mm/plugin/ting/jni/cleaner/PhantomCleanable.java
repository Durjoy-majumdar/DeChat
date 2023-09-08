package com.tencent.p014mm.plugin.ting.jni.cleaner;

import com.tencent.p014mm.plugin.ting.jni.cleaner.Cleaner;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.ting.jni.cleaner.PhantomCleanable */
public abstract class PhantomCleanable<T> extends PhantomReference<T> implements Cleaner.Cleanable {
    private final PhantomCleanable<?> list;
    public PhantomCleanable<?> next;
    public PhantomCleanable<?> prev;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhantomCleanable(T t, Cleaner cleaner) {
        super(t, CleanerImpl.getCleanerImpl(cleaner).queue);
        Objects.requireNonNull(t);
        this.prev = this;
        this.next = this;
        this.list = CleanerImpl.getCleanerImpl(cleaner).phantomCleanableList;
        insert();
    }

    private void insert() {
        synchronized (this.list) {
            PhantomCleanable<?> phantomCleanable = this.list;
            this.prev = phantomCleanable;
            PhantomCleanable<?> phantomCleanable2 = phantomCleanable.next;
            this.next = phantomCleanable2;
            phantomCleanable2.prev = this;
            phantomCleanable.next = this;
        }
    }

    private boolean remove() {
        synchronized (this.list) {
            PhantomCleanable<?> phantomCleanable = this.next;
            if (phantomCleanable == this) {
                return false;
            }
            phantomCleanable.prev = this.prev;
            this.prev.next = phantomCleanable;
            this.prev = this;
            this.next = this;
            return true;
        }
    }

    public final void clean() {
        if (remove()) {
            super.clear();
            performCleanup();
        }
    }

    public void clear() {
        if (remove()) {
            super.clear();
        }
    }

    public final boolean enqueue() {
        throw new UnsupportedOperationException("enqueue");
    }

    public final boolean isEnqueued() {
        throw new UnsupportedOperationException("isEnqueued");
    }

    public boolean isListEmpty() {
        boolean z;
        synchronized (this.list) {
            PhantomCleanable<?> phantomCleanable = this.list;
            z = phantomCleanable == phantomCleanable.next;
        }
        return z;
    }

    public abstract void performCleanup();

    public PhantomCleanable() {
        super((Object) null, (ReferenceQueue) null);
        this.prev = this;
        this.next = this;
        this.list = this;
    }
}
