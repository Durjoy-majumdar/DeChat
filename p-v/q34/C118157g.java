package q34;

import java.io.PrintStream;
import java.util.Queue;
import l34.C117459k;
import p418rx.internal.util.unsafe.SpmcArrayQueue;
import p418rx.internal.util.unsafe.SpscArrayQueue;

/* renamed from: q34.g */
public class C118157g implements C117459k {

    /* renamed from: d */
    public static int f353186d;

    /* renamed from: e */
    public static final int f353187e = f353186d;

    /* renamed from: f */
    public static final C118153d<Queue<Object>> f353188f = new C118158a();

    /* renamed from: g */
    public static final C118153d<Queue<Object>> f353189g = new C118159b();

    /* renamed from: q34.g$a */
    public static class C118158a extends C118153d<Queue<Object>> {
        /* renamed from: a */
        public Object mo182950a() {
            return new SpscArrayQueue(C118157g.f353187e);
        }
    }

    /* renamed from: q34.g$b */
    public static class C118159b extends C118153d<Queue<Object>> {
        /* renamed from: a */
        public Object mo182950a() {
            return new SpmcArrayQueue(C118157g.f353187e);
        }
    }

    static {
        f353186d = 128;
        if (C118156f.f353185b) {
            f353186d = 16;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                f353186d = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
    }
}
