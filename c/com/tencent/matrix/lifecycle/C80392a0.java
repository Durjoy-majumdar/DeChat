package com.tencent.matrix.lifecycle;

import android.os.Handler;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import p723vf.C90778c;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: com.tencent.matrix.lifecycle.a0 */
public final class C80392a0 {

    /* renamed from: a */
    public static C80411j f235321a = new C80411j((Executor) null, 0, 0, (C32227p) null, (C32228q) null, 31, (C8480h) null);

    /* renamed from: b */
    public static final C13601g f235322b;

    /* renamed from: c */
    public static final ArrayList<String> f235323c;

    /* renamed from: d */
    public static final C13601g f235324d;

    /* renamed from: e */
    public static final ConcurrentHashMap<Thread, C28655b> f235325e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final C80392a0 f235326f;

    /* renamed from: com.tencent.matrix.lifecycle.a0$b */
    public static final class C28655b {

        /* renamed from: a */
        public final String f78627a;

        /* renamed from: b */
        public final long f78628b;

        public C28655b() {
            this("", 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28655b)) {
                return false;
            }
            C28655b bVar = (C28655b) obj;
            return C87412m.m108589b(this.f78627a, bVar.f78627a) && this.f78628b == bVar.f78628b;
        }

        public int hashCode() {
            String str = this.f78627a;
            int hashCode = str != null ? str.hashCode() : 0;
            long j = this.f78628b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "TaskInfo(task=" + this.f78627a + ", time=" + this.f78628b + ")";
        }

        public C28655b(String str, long j) {
            C87412m.m108594g(str, "task");
            this.f78627a = str;
            this.f78628b = j;
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.a0$a */
    public static final class C80393a extends SynchronousQueue<Runnable> {

        /* renamed from: d */
        public final LinkedBlockingQueue<Runnable> f235327d = new LinkedBlockingQueue<>();

        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null ? obj instanceof Runnable : true) {
                return super.contains((Runnable) obj);
            }
            return false;
        }

        public Object poll(long j, TimeUnit timeUnit) {
            Runnable poll = this.f235327d.poll();
            return poll != null ? poll : (Runnable) super.poll(j, timeUnit);
        }

        public final /* bridge */ boolean remove(Object obj) {
            if (obj != null ? obj instanceof Runnable : true) {
                return super.remove((Runnable) obj);
            }
            return false;
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public Object take() {
            Runnable poll = this.f235327d.poll();
            if (poll != null) {
                return poll;
            }
            Object take = super.take();
            C87412m.m108593f(take, "super.take()");
            return (Runnable) take;
        }

        public Object poll() {
            Runnable poll = this.f235327d.poll();
            return poll != null ? poll : (Runnable) super.poll();
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.a0$c */
    public static final class C80394c extends C87413o implements C32224a<Executor> {
        public C80394c(C80392a0 a0Var) {
            super(0);
        }

        public Object invoke() {
            Executor executor = C80392a0.f235321a.f235345a;
            if (executor != null) {
                return executor;
            }
            C80393a aVar = new C80393a();
            return new C80397b0(this, aVar, 0, 5, 30, TimeUnit.SECONDS, aVar, C80399c0.f235331d, new C80402d0(aVar));
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.a0$d */
    public static final class C80395d extends C87413o implements C32224a<Handler> {

        /* renamed from: d */
        public static final C80395d f235328d = new C80395d();

        public C80395d() {
            super(0);
        }

        public Object invoke() {
            return new Handler(C90778c.m113845c("matrix_li", 5).getLooper());
        }
    }

    static {
        C13602i iVar = C13602i.SYNCHRONIZED;
        C80392a0 a0Var = new C80392a0();
        f235326f = a0Var;
        f235322b = C36568h.m40986b(iVar, C80395d.f235328d);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add("matrix_x_" + i);
        }
        f235323c = arrayList;
        f235324d = C36568h.m40986b(iVar, new C80394c(a0Var));
    }

    /* renamed from: a */
    public final Handler mo111887a() {
        return (Handler) f235322b.getValue();
    }
}
