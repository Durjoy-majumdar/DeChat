package p907k3;

import android.view.Choreographer;
import java.util.ArrayList;
import p1042u.C111059i;

/* renamed from: k3.a */
public class C108861a {

    /* renamed from: g */
    public static final ThreadLocal<C108861a> f325995g = new ThreadLocal<>();

    /* renamed from: a */
    public final C111059i<C108863b, Long> f325996a = new C111059i<>();

    /* renamed from: b */
    public final ArrayList<C108863b> f325997b = new ArrayList<>();

    /* renamed from: c */
    public final C108862a f325998c = new C108862a();

    /* renamed from: d */
    public C108864c f325999d;

    /* renamed from: e */
    public long f326000e = 0;

    /* renamed from: f */
    public boolean f326001f = false;

    /* renamed from: k3.a$a */
    public class C108862a {
        public C108862a() {
        }
    }

    /* renamed from: k3.a$b */
    public interface C108863b {
        /* renamed from: a */
        boolean mo159984a(long j);
    }

    /* renamed from: k3.a$c */
    public static abstract class C108864c {

        /* renamed from: a */
        public final C108862a f326003a;

        public C108864c(C108862a aVar) {
            this.f326003a = aVar;
        }
    }

    /* renamed from: k3.a$d */
    public static class C108865d extends C108864c {

        /* renamed from: b */
        public final Choreographer f326004b = Choreographer.getInstance();

        /* renamed from: c */
        public final Choreographer.FrameCallback f326005c = new C108866a();

        /* renamed from: k3.a$d$a */
        public class C108866a implements Choreographer.FrameCallback {
            public C108866a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x004a A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void doFrame(long r11) {
                /*
                    r10 = this;
                    k3.a$d r11 = p907k3.C108861a.C108865d.this
                    k3.a$a r11 = r11.f326003a
                    k3.a r12 = p907k3.C108861a.this
                    long r0 = android.os.SystemClock.uptimeMillis()
                    r12.f326000e = r0
                    k3.a r12 = p907k3.C108861a.this
                    long r0 = r12.f326000e
                    long r2 = android.os.SystemClock.uptimeMillis()
                    r4 = 0
                    r5 = 0
                L_0x0016:
                    java.util.ArrayList<k3.a$b> r6 = r12.f325997b
                    int r6 = r6.size()
                    if (r5 >= r6) goto L_0x004d
                    java.util.ArrayList<k3.a$b> r6 = r12.f325997b
                    java.lang.Object r6 = r6.get(r5)
                    k3.a$b r6 = (p907k3.C108861a.C108863b) r6
                    if (r6 != 0) goto L_0x0029
                    goto L_0x004a
                L_0x0029:
                    u.i<k3.a$b, java.lang.Long> r7 = r12.f325996a
                    r8 = 0
                    java.lang.Object r7 = r7.getOrDefault(r6, r8)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 != 0) goto L_0x0035
                    goto L_0x0042
                L_0x0035:
                    long r7 = r7.longValue()
                    int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                    if (r9 >= 0) goto L_0x0044
                    u.i<k3.a$b, java.lang.Long> r7 = r12.f325996a
                    r7.remove(r6)
                L_0x0042:
                    r7 = 1
                    goto L_0x0045
                L_0x0044:
                    r7 = 0
                L_0x0045:
                    if (r7 == 0) goto L_0x004a
                    r6.mo159984a(r0)
                L_0x004a:
                    int r5 = r5 + 1
                    goto L_0x0016
                L_0x004d:
                    boolean r0 = r12.f326001f
                    if (r0 == 0) goto L_0x006b
                    java.util.ArrayList<k3.a$b> r0 = r12.f325997b
                    int r0 = r0.size()
                L_0x0057:
                    int r0 = r0 + -1
                    if (r0 < 0) goto L_0x0069
                    java.util.ArrayList<k3.a$b> r1 = r12.f325997b
                    java.lang.Object r1 = r1.get(r0)
                    if (r1 != 0) goto L_0x0057
                    java.util.ArrayList<k3.a$b> r1 = r12.f325997b
                    r1.remove(r0)
                    goto L_0x0057
                L_0x0069:
                    r12.f326001f = r4
                L_0x006b:
                    k3.a r12 = p907k3.C108861a.this
                    java.util.ArrayList<k3.a$b> r12 = r12.f325997b
                    int r12 = r12.size()
                    if (r12 <= 0) goto L_0x008f
                    k3.a r11 = p907k3.C108861a.this
                    k3.a$c r12 = r11.f325999d
                    if (r12 != 0) goto L_0x0084
                    k3.a$d r12 = new k3.a$d
                    k3.a$a r0 = r11.f325998c
                    r12.<init>(r0)
                    r11.f325999d = r12
                L_0x0084:
                    k3.a$c r11 = r11.f325999d
                    k3.a$d r11 = (p907k3.C108861a.C108865d) r11
                    android.view.Choreographer r12 = r11.f326004b
                    android.view.Choreographer$FrameCallback r11 = r11.f326005c
                    r12.postFrameCallback(r11)
                L_0x008f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p907k3.C108861a.C108865d.C108866a.doFrame(long):void");
            }
        }

        public C108865d(C108862a aVar) {
            super(aVar);
        }
    }
}
