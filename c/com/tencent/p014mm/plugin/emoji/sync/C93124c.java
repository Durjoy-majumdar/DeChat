package com.tencent.p014mm.plugin.emoji.sync;

import com.tencent.p014mm.sdk.platformtools.Log;
import ic0.C21071j;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import zt3.C119143b;

/* renamed from: com.tencent.mm.plugin.emoji.sync.c */
public class C93124c {

    /* renamed from: a */
    public final Executor f268270a;

    /* renamed from: com.tencent.mm.plugin.emoji.sync.c$a */
    public static class C93125a {

        /* renamed from: a */
        public int f268271a;

        /* renamed from: b */
        public Executor f268272b;
    }

    /* renamed from: com.tencent.mm.plugin.emoji.sync.c$b */
    public static class C93126b extends C119143b implements C21071j {

        /* renamed from: t */
        public boolean f268273t;

        /* renamed from: u */
        public ReentrantLock f268274u;

        /* renamed from: v */
        public Condition f268275v;

        public C93126b(int i, int i2, BlockingQueue<Runnable> blockingQueue) {
            super("bkg_loader_default", i, i2, blockingQueue);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f268274u = reentrantLock;
            this.f268275v = reentrantLock.newCondition();
        }

        /* renamed from: c */
        public void mo72174c(Thread thread, Runnable runnable) {
            this.f268274u.lock();
            while (this.f268273t) {
                try {
                    this.f268275v.await();
                } catch (Exception e) {
                    thread.interrupt();
                    Log.m105929w("MicroMsg.imageloader.DefaultThreadPoolExecutor", "[cpan] before execute exception:%s", e.toString());
                } catch (Throwable th) {
                    this.f268274u.unlock();
                    throw th;
                }
            }
            this.f268274u.unlock();
        }

        /* renamed from: e */
        public boolean mo32790e() {
            return this.f268273t;
        }

        public void execute(Runnable runnable) {
            super.execute(runnable);
        }

        public boolean isShutdown() {
            return super.isShutdown();
        }

        public void pause() {
            this.f268274u.lock();
            try {
                this.f268273t = true;
            } finally {
                this.f268274u.unlock();
            }
        }

        public void remove(Object obj) {
        }

        public void resume() {
            this.f268274u.lock();
            try {
                this.f268273t = false;
                this.f268275v.signalAll();
            } finally {
                this.f268274u.unlock();
            }
        }
    }

    public C93124c(C93125a aVar) {
        int i = aVar.f268271a;
        this.f268270a = aVar.f268272b;
    }
}
