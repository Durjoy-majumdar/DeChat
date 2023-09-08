package p1091b3;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: b3.n */
public class C113135n implements ThreadFactory {

    /* renamed from: d */
    public String f338537d;

    /* renamed from: e */
    public int f338538e;

    /* renamed from: b3.n$a */
    public static class C113136a extends Thread {

        /* renamed from: d */
        public final int f338539d;

        public C113136a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f338539d = i;
        }

        public void run() {
            Process.setThreadPriority(this.f338539d);
            super.run();
        }
    }

    public C113135n(String str, int i) {
        this.f338537d = str;
        this.f338538e = i;
    }

    public Thread newThread(Runnable runnable) {
        return new C113136a(runnable, this.f338537d, this.f338538e);
    }
}
