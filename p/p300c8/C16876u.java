package p300c8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p333e8.C116702x;
import p333e8.C20528a;
import p333e8.C20550v;
import p333e8.C20551y;

/* renamed from: c8.u */
public final class C16876u {

    /* renamed from: a */
    public final ExecutorService f45617a;

    /* renamed from: b */
    public C16878b<? extends C16879c> f45618b;

    /* renamed from: c */
    public IOException f45619c;

    /* renamed from: c8.u$a */
    public interface C16877a<T extends C16879c> {
        /* renamed from: j */
        void mo17938j(T t, long j, long j2);

        /* renamed from: l */
        void mo17939l(T t, long j, long j2, boolean z);

        /* renamed from: p */
        int mo17940p(T t, long j, long j2, IOException iOException);
    }

    /* renamed from: c8.u$b */
    public final class C16878b<T extends C16879c> extends Handler implements Runnable {

        /* renamed from: d */
        public final T f45620d;

        /* renamed from: e */
        public final C16877a<T> f45621e;

        /* renamed from: f */
        public final int f45622f;

        /* renamed from: g */
        public final long f45623g;

        /* renamed from: h */
        public IOException f45624h;

        /* renamed from: i */
        public int f45625i;

        /* renamed from: j */
        public volatile Thread f45626j;

        /* renamed from: n */
        public volatile boolean f45627n;

        public C16878b(Looper looper, T t, C16877a<T> aVar, int i, long j) {
            super(looper);
            this.f45620d = t;
            this.f45621e = aVar;
            this.f45622f = i;
            this.f45623g = j;
        }

        /* renamed from: a */
        public void mo17941a(boolean z) {
            this.f45627n = z;
            this.f45624h = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f45620d.mo17946b();
                if (this.f45626j != null) {
                    this.f45626j.interrupt();
                }
            }
            if (z) {
                C16876u.this.f45618b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f45621e.mo17939l(this.f45620d, elapsedRealtime, elapsedRealtime - this.f45623g, true);
            }
        }

        /* renamed from: b */
        public void mo17942b(long j) {
            C20528a.m22240d(C16876u.this.f45618b == null);
            C16876u uVar = C16876u.this;
            uVar.f45618b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f45624h = null;
            uVar.f45617a.execute(this);
        }

        public void handleMessage(Message message) {
            if (!this.f45627n) {
                int i = message.what;
                if (i == 0) {
                    this.f45624h = null;
                    C16876u uVar = C16876u.this;
                    uVar.f45617a.execute(uVar.f45618b);
                } else if (i != 4) {
                    C16876u.this.f45618b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f45623g;
                    if (this.f45620d.mo17947c()) {
                        this.f45621e.mo17939l(this.f45620d, elapsedRealtime, j, false);
                        return;
                    }
                    int i2 = message.what;
                    int i3 = 1;
                    if (i2 == 1) {
                        this.f45621e.mo17939l(this.f45620d, elapsedRealtime, j, false);
                    } else if (i2 == 2) {
                        this.f45621e.mo17938j(this.f45620d, elapsedRealtime, j);
                    } else if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f45624h = iOException;
                        int p = this.f45621e.mo17940p(this.f45620d, elapsedRealtime, j, iOException);
                        if (p == 3) {
                            C16876u.this.f45619c = this.f45624h;
                        } else if (p != 2) {
                            if (p != 1) {
                                i3 = 1 + this.f45625i;
                            }
                            this.f45625i = i3;
                            mo17942b((long) Math.min((i3 - 1) * 1000, 5000));
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            try {
                this.f45626j = Thread.currentThread();
                if (!this.f45620d.mo17947c()) {
                    C20550v.m22309a("load:" + this.f45620d.getClass().getSimpleName());
                    this.f45620d.mo17945a();
                    C20550v.m22310b();
                }
                if (!this.f45627n) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.f45627n) {
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                C20528a.m22240d(this.f45620d.mo17947c());
                if (!this.f45627n) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                if (!this.f45627n) {
                    obtainMessage(3, new C16882f(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                if (!this.f45627n) {
                    obtainMessage(3, new C16882f(e3)).sendToTarget();
                }
            } catch (Error e4) {
                if (!this.f45627n) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C20550v.m22310b();
                throw th;
            }
        }
    }

    /* renamed from: c8.u$c */
    public interface C16879c {
        /* renamed from: a */
        void mo17945a();

        /* renamed from: b */
        void mo17946b();

        /* renamed from: c */
        boolean mo17947c();
    }

    /* renamed from: c8.u$d */
    public interface C16880d {
        /* renamed from: f */
        void mo17948f();
    }

    /* renamed from: c8.u$e */
    public static final class C16881e extends Handler implements Runnable {

        /* renamed from: d */
        public final C16880d f45629d;

        public C16881e(C16880d dVar) {
            this.f45629d = dVar;
        }

        public void handleMessage(Message message) {
            this.f45629d.mo17948f();
        }

        public void run() {
            sendEmptyMessage(0);
        }
    }

    /* renamed from: c8.u$f */
    public static final class C16882f extends IOException {
        public C16882f(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C16876u(String str) {
        int i = C20551y.f57835a;
        this.f45617a = Executors.newSingleThreadExecutor(new C116702x(str));
    }

    /* renamed from: a */
    public boolean mo17934a() {
        return this.f45618b != null;
    }

    /* renamed from: b */
    public void mo17935b() {
        IOException iOException = this.f45619c;
        if (iOException == null) {
            C16878b<? extends C16879c> bVar = this.f45618b;
            if (bVar != null) {
                int i = bVar.f45622f;
                IOException iOException2 = bVar.f45624h;
                if (iOException2 != null && bVar.f45625i > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: c */
    public boolean mo17936c(C16880d dVar) {
        C16878b<? extends C16879c> bVar = this.f45618b;
        boolean z = true;
        if (bVar != null) {
            bVar.mo17941a(true);
            if (dVar != null) {
                this.f45617a.execute(new C16881e(dVar));
            }
        } else if (dVar != null) {
            dVar.mo17948f();
            this.f45617a.shutdown();
            return z;
        }
        z = false;
        this.f45617a.shutdown();
        return z;
    }

    /* renamed from: d */
    public <T extends C16879c> long mo17937d(T t, C16877a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        C20528a.m22240d(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C16878b(myLooper, t, aVar, i, elapsedRealtime).mo17942b(0);
        return elapsedRealtime;
    }
}
