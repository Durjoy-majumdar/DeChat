package p823sg;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: sg.c */
public class C101610c {

    /* renamed from: d */
    public static MMHandler f297457d;

    /* renamed from: a */
    public C86009m1 f297458a;

    /* renamed from: b */
    public ReentrantLock f297459b;

    /* renamed from: c */
    public Condition f297460c;

    public C101610c(String str) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f297459b = reentrantLock;
        this.f297460c = reentrantLock.newCondition();
        synchronized (C101610c.class) {
            if (f297457d == null) {
                f297457d = new MMHandler("I/O Worker");
            }
        }
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g()) {
            this.f297458a = m1Var;
            return;
        }
        Log.m105925i("MicroMsg.ConcurrentFileBuilder", "create new file %s", str);
        f297457d.post(new C101609b(this, str));
    }

    /* renamed from: a */
    public C86009m1 mo141082a() {
        this.f297459b.lock();
        while (this.f297458a == null) {
            try {
                Log.m105924i("MicroMsg.ConcurrentFileBuilder", "getFile await");
                this.f297460c.await();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f297459b.unlock();
                throw th;
            }
        }
        this.f297459b.unlock();
        return this.f297458a;
    }
}
