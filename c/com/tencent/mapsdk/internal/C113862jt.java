package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C113849jm;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.tencent.mapsdk.internal.jt */
public abstract class C113862jt<D extends C113849jm> implements C113846jl<D>, C113861js<D> {

    /* renamed from: a */
    private ReentrantReadWriteLock f340640a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public final void mo172239b(String str, D d) {
        try {
            this.f340640a.writeLock().lock();
            mo170951a(str, d);
        } finally {
            this.f340640a.writeLock().unlock();
        }
    }

    /* renamed from: j */
    public final void mo172241j() {
        try {
            this.f340640a.writeLock().lock();
            mo170953b();
        } finally {
            this.f340640a.writeLock().unlock();
        }
    }

    /* renamed from: k */
    public final long mo172242k() {
        try {
            this.f340640a.readLock().lock();
            return mo170954c();
        } finally {
            this.f340640a.readLock().unlock();
        }
    }

    /* renamed from: l */
    public final long mo172243l() {
        try {
            this.f340640a.readLock().lock();
            return mo170955d();
        } finally {
            this.f340640a.readLock().unlock();
        }
    }

    /* renamed from: m */
    public final C113861js<D> mo172244m() {
        return this;
    }

    /* renamed from: b */
    public final D mo172238b(String str, Class<D> cls) {
        try {
            this.f340640a.readLock().lock();
            return mo170950a(str, cls);
        } finally {
            this.f340640a.readLock().unlock();
        }
    }

    /* renamed from: b */
    public final boolean mo172240b(String str) {
        try {
            this.f340640a.writeLock().lock();
            return mo170952a(str);
        } finally {
            this.f340640a.writeLock().unlock();
        }
    }
}
