package t34;

import java.io.PrintStream;
import l34.C117447c;
import l34.C117453e;
import l34.C117456i;
import l34.C117459k;
import n34.C117603a;
import n34.C117604b;
import n34.C117605d;
import n34.C117606e;

/* renamed from: t34.m */
public final class C118375m {

    /* renamed from: a */
    public static volatile C117604b<Throwable> f353769a = new C118368f();

    /* renamed from: b */
    public static volatile C117605d<C117453e.C88376a, C117453e.C88376a> f353770b = new C118366d();

    /* renamed from: c */
    public static volatile C117605d<C117447c.C117450c, C117447c.C117450c> f353771c = new C118367e();

    /* renamed from: d */
    public static volatile C117606e<C117453e, C117453e.C88376a, C117453e.C88376a> f353772d = new C118369g();

    /* renamed from: e */
    public static volatile C117606e<C117447c, C117447c.C117450c, C117447c.C117450c> f353773e = new C118371i();

    /* renamed from: f */
    public static volatile C117605d<C117456i, C117456i> f353774f;

    /* renamed from: g */
    public static volatile C117605d<C117603a, C117603a> f353775g = new C118372j();

    /* renamed from: h */
    public static volatile C117605d<C117459k, C117459k> f353776h = new C118370h();

    /* renamed from: i */
    public static volatile C117605d<Throwable, Throwable> f353777i = new C118373k();

    /* renamed from: j */
    public static volatile C117605d<Throwable, Throwable> f353778j = new C118365c();

    /* renamed from: k */
    public static volatile C117605d<C117453e.C88377b, C117453e.C88377b> f353779k = new C118374l();

    /* renamed from: a */
    public static void m166985a(Throwable th) {
        C117604b<Throwable> bVar = f353769a;
        if (bVar != null) {
            try {
                ((C118368f) bVar).call(th);
                return;
            } catch (Throwable th4) {
                PrintStream printStream = System.err;
                printStream.println("The onError handler threw an Exception. It shouldn't. => " + th4.getMessage());
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th4);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    /* renamed from: b */
    public static Throwable m166986b(Throwable th) {
        C117605d<Throwable, Throwable> dVar = f353777i;
        return dVar != null ? (Throwable) ((C118373k) dVar).call(th) : th;
    }
}
