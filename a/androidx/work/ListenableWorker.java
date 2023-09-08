package androidx.work;

import android.content.Context;
import p1014o4.C109939f;
import p1167z8.C112608f;
import p283z4.C119060c;

public abstract class ListenableWorker {

    /* renamed from: d */
    public Context f338326d;

    /* renamed from: e */
    public WorkerParameters f338327e;

    /* renamed from: f */
    public volatile boolean f338328f;

    /* renamed from: g */
    public boolean f338329g;

    /* renamed from: h */
    public boolean f338330h;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C113032a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C113033a extends C113032a {

            /* renamed from: a */
            public final C113041b f338331a = C113041b.f338352b;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C113033a.class != obj.getClass()) {
                    return false;
                }
                return this.f338331a.equals(((C113033a) obj).f338331a);
            }

            public int hashCode() {
                return (C113033a.class.getName().hashCode() * 31) + this.f338331a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f338331a + '}';
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C113034b extends C113032a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C113034b.class == obj.getClass();
            }

            public int hashCode() {
                return C113034b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C113035c extends C113032a {

            /* renamed from: a */
            public final C113041b f338332a;

            public C113035c() {
                this(C113041b.f338352b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C113035c.class != obj.getClass()) {
                    return false;
                }
                return this.f338332a.equals(((C113035c) obj).f338332a);
            }

            public int hashCode() {
                return (C113035c.class.getName().hashCode() * 31) + this.f338332a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f338332a + '}';
            }

            public C113035c(C113041b bVar) {
                this.f338332a = bVar;
            }
        }
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f338326d = context;
            this.f338327e = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    /* renamed from: a */
    public C112608f<C109939f> mo165503a() {
        C119060c cVar = new C119060c();
        cVar.mo183733j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    /* renamed from: b */
    public boolean mo165507b() {
        return this.f338330h;
    }

    /* renamed from: c */
    public void mo165504c() {
    }

    /* renamed from: e */
    public abstract C112608f<C113032a> mo165505e();

    /* renamed from: g */
    public final void mo165508g() {
        this.f338328f = true;
        mo165504c();
    }
}
