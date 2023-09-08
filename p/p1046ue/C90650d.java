package p1046ue;

import com.tencent.matrix.openglleak.hook.OpenGLHook;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p1053ve.C90767a;
import p1053ve.C90771e;

/* renamed from: ue.d */
public class C90650d {

    /* renamed from: a */
    public String f260442a;

    /* renamed from: b */
    public final int f260443b;

    /* renamed from: c */
    public C90771e.C90772a f260444c;

    /* renamed from: d */
    public long f260445d;

    /* renamed from: e */
    public final C90651a f260446e;

    /* renamed from: f */
    public C90648b f260447f;

    /* renamed from: g */
    public final long f260448g;

    /* renamed from: h */
    public final long f260449h;

    /* renamed from: i */
    public final long f260450i;

    /* renamed from: j */
    public C90767a.C90768a f260451j;

    /* renamed from: k */
    public AtomicInteger f260452k;

    /* renamed from: ue.d$a */
    public enum C90651a {
        TEXTURE,
        BUFFER,
        FRAME_BUFFERS,
        RENDER_BUFFERS,
        EGL_CONTEXT
    }

    public C90650d(C90651a aVar, int i, String str, long j) {
        this.f260445d = 0;
        this.f260442a = str;
        this.f260443b = i;
        this.f260448g = j;
        this.f260446e = aVar;
        this.f260449h = 0;
        this.f260450i = 0;
    }

    /* renamed from: a */
    public String mo124786a() {
        C90771e.C90772a aVar = this.f260444c;
        return aVar == null ? "" : aVar.f260668a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo124787b() {
        /*
            r8 = this;
            ue.e r0 = p1046ue.C90652e.f260459f
            java.util.List<ue.d> r1 = r0.f260461b
            monitor-enter(r1)
            java.util.List<ue.d> r2 = r0.f260461b     // Catch:{ all -> 0x0036 }
            java.util.LinkedList r2 = (java.util.LinkedList) r2     // Catch:{ all -> 0x0036 }
            int r2 = r2.indexOf(r8)     // Catch:{ all -> 0x0036 }
            r3 = -1
            if (r3 != r2) goto L_0x0015
            java.lang.String r0 = "res already released, can not get native stack"
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0035
        L_0x0015:
            java.lang.String r3 = ""
            java.util.List<ue.d> r0 = r0.f260461b     // Catch:{ all -> 0x0036 }
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0036 }
            ue.d r0 = (p1046ue.C90650d) r0     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0026
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            r0 = r3
            goto L_0x0035
        L_0x0026:
            long r4 = r0.f260445d     // Catch:{ all -> 0x0036 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = com.tencent.matrix.openglleak.hook.OpenGLHook.dumpNativeStack(r4)     // Catch:{ all -> 0x0036 }
            goto L_0x0034
        L_0x0033:
            r0 = r3
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
        L_0x0035:
            return r0
        L_0x0036:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1046ue.C90650d.mo124787b():java.lang.String");
    }

    /* renamed from: c */
    public boolean mo124788c() {
        boolean z;
        C90652e eVar = C90652e.f260459f;
        synchronized (eVar.f260464e) {
            z = !((ArrayList) eVar.f260464e).contains(Long.valueOf(this.f260448g));
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo124789d() {
        boolean z;
        C90652e eVar = C90652e.f260459f;
        synchronized (eVar.f260462c) {
            long j = this.f260449h;
            long j2 = this.f260450i;
            z = true;
            if (j2 != 0) {
                if (j != 0) {
                    boolean z2 = false;
                    boolean z3 = false;
                    for (Long longValue : eVar.f260462c) {
                        long longValue2 = longValue.longValue();
                        if (longValue2 == j2) {
                            z2 = true;
                        }
                        if (longValue2 == j) {
                            z3 = true;
                        }
                    }
                    if (!z2 || !z3) {
                        if (!z2) {
                            z2 = !OpenGLHook.isEglSurfaceAlive(j2);
                        }
                        if (!z3) {
                            z3 = !OpenGLHook.isEglSurfaceAlive(j);
                        }
                        if (z2) {
                            ((LinkedList) eVar.f260462c).add(Long.valueOf(j2));
                        }
                        if (z3) {
                            ((LinkedList) eVar.f260462c).add(Long.valueOf(j));
                        }
                        if (!z2 || !z3) {
                            z = false;
                        }
                    }
                }
            }
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C90650d)) {
            return false;
        }
        C90650d dVar = (C90650d) obj;
        return this.f260443b == dVar.f260443b && this.f260448g == dVar.f260448g && this.f260446e == dVar.f260446e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f260443b), Long.valueOf(this.f260448g), this.f260446e});
    }

    public String toString() {
        return "OpenGLInfo{id=" + this.f260443b + ", activityName=" + this.f260451j + ", type='" + this.f260446e.toString() + '\'' + ", threadId='" + this.f260442a + '\'' + ", eglContextNativeHandle='" + this.f260448g + '\'' + ", eglContextReleased='" + mo124788c() + '\'' + ", eglSurfaceReleased='" + mo124789d() + '\'' + ", javaStack='" + mo124786a() + '\'' + ", nativeStack='" + mo124787b() + '\'' + ", nativeStackPtr=" + this.f260445d + ", memoryInfo=" + this.f260447f + '}';
    }

    public C90650d(C90651a aVar, int i, String str, long j, long j2, long j3, C90771e.C90772a aVar2, long j4, C90767a.C90768a aVar3, AtomicInteger atomicInteger) {
        this.f260442a = str;
        this.f260444c = aVar2;
        this.f260445d = j4;
        this.f260446e = aVar;
        this.f260451j = aVar3;
        this.f260452k = atomicInteger;
        this.f260443b = i;
        this.f260448g = j;
        this.f260449h = j2;
        this.f260450i = j3;
    }
}
