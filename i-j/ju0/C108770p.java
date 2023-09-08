package ju0;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import q00.C110264g;
import q00.C110268h;
import q00.C62571i;
import rh3.C101382f;

/* renamed from: ju0.p */
public class C108770p implements C17643a {

    /* renamed from: c */
    public C110264g f325684c = null;

    /* renamed from: d */
    public boolean f325685d = false;

    /* renamed from: e */
    public float f325686e = 0.0f;

    /* renamed from: f */
    public float f325687f = 0.0f;

    /* renamed from: g */
    public float f325688g = 0.0f;

    /* renamed from: h */
    public float f325689h = 0.0f;

    /* renamed from: i */
    public String f325690i = "";

    /* renamed from: j */
    public long f325691j = 0;

    /* renamed from: k */
    public long f325692k = 0;

    /* renamed from: l */
    public long f325693l = 0;

    /* renamed from: m */
    public long f325694m = 0;

    /* renamed from: n */
    public long f325695n = 0;

    /* renamed from: o */
    public long f325696o = 0;

    /* renamed from: p */
    public long f325697p = 0;

    /* renamed from: q */
    public long f325698q = 0;

    /* renamed from: r */
    public int[] f325699r = new int[1];

    /* renamed from: s */
    public ArrayList<Runnable> f325700s = new ArrayList<>();

    /* renamed from: ju0.p$a */
    public class C108771a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C17643a.C17644b f325701d;

        /* renamed from: e */
        public final /* synthetic */ int f325702e;

        /* renamed from: f */
        public final /* synthetic */ float f325703f;

        public C108771a(C17643a.C17644b bVar, int i, float f) {
            this.f325701d = bVar;
            this.f325702e = i;
            this.f325703f = f;
        }

        public void run() {
            if (C108770p.this.f325685d) {
                int ordinal = this.f325701d.ordinal();
                if (ordinal == 0) {
                    C108770p.this.f325684c.mo143253t(3, this.f325702e);
                    C108770p.this.f325686e = this.f325703f;
                } else if (ordinal == 1) {
                    C108770p.this.f325684c.mo143253t(0, this.f325702e);
                    C108770p.this.f325687f = this.f325703f;
                } else if (ordinal == 2) {
                    C108770p.this.f325684c.mo143253t(2, this.f325702e * 2);
                    C108770p.this.f325688g = this.f325703f * 2.0f;
                } else if (ordinal == 3) {
                    C108770p.this.f325684c.mo143253t(1, this.f325702e);
                    C108770p.this.f325689h = this.f325703f;
                }
            }
        }
    }

    /* renamed from: ju0.p$b */
    public class C108772b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f325705d;

        /* renamed from: e */
        public final /* synthetic */ float f325706e;

        public C108772b(String str, float f) {
            this.f325705d = str;
            this.f325706e = f;
        }

        public void run() {
            C108770p pVar = C108770p.this;
            if (pVar.f325685d) {
                pVar.f325684c.mo143250q(this.f325705d, this.f325706e);
                C108770p.this.f325690i = this.f325705d;
            }
        }
    }

    /* renamed from: ju0.p$c */
    public class C108773c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f325708d;

        /* renamed from: e */
        public final /* synthetic */ C17643a.C17646d f325709e;

        public C108773c(String str, C17643a.C17646d dVar) {
            this.f325708d = str;
            this.f325709e = dVar;
        }

        public void run() {
            if (C108770p.this.f325685d) {
                C101382f fVar = new C101382f();
                try {
                    String str = this.f325708d;
                    C87412m.m108594g(str, "<set-?>");
                    fVar.f296972d = str;
                    fVar.mo140863b(new JSONObject(C86013q1.m106432N(this.f325708d + "/config.json")));
                    int ordinal = this.f325709e.ordinal();
                    if (ordinal == 0) {
                        C108770p pVar = C108770p.this;
                        long j = pVar.f325692k;
                        if (j != 0) {
                            pVar.f325684c.mo143251r(j);
                            C108770p.this.f325692k = 0;
                        }
                        C108770p.this.f325684c.mo143255v(12, true);
                        C108770p pVar2 = C108770p.this;
                        pVar2.f325692k = pVar2.f325684c.mo143249p(fVar);
                        C108770p.this.f325684c.mo143233a(true);
                    } else if (ordinal == 1) {
                        C108770p pVar3 = C108770p.this;
                        long j2 = pVar3.f325693l;
                        if (j2 != 0) {
                            pVar3.f325684c.mo143251r(j2);
                            C108770p.this.f325693l = 0;
                        }
                        C108770p.this.f325684c.mo143255v(13, true);
                        C108770p pVar4 = C108770p.this;
                        pVar4.f325693l = pVar4.f325684c.mo143249p(fVar);
                    } else if (ordinal == 2) {
                        C108770p pVar5 = C108770p.this;
                        long j3 = pVar5.f325691j;
                        if (j3 != 0) {
                            pVar5.f325684c.mo143251r(j3);
                            C108770p.this.f325691j = 0;
                        }
                        C108770p.this.f325684c.mo143255v(11, true);
                        C108770p pVar6 = C108770p.this;
                        pVar6.f325691j = pVar6.f325684c.mo143249p(fVar);
                    }
                } catch (IOException | JSONException unused) {
                }
            }
        }
    }

    /* renamed from: ju0.p$d */
    public class C108774d implements Runnable {
        public C108774d() {
        }

        public void run() {
            C108770p pVar = C108770p.this;
            if (pVar.f325685d) {
                pVar.f325684c.mo143251r(pVar.f325692k);
                C108770p.this.f325684c.mo143255v(12, false);
                C108770p pVar2 = C108770p.this;
                pVar2.f325684c.mo143251r(pVar2.f325693l);
                C108770p.this.f325684c.mo143255v(13, false);
                C108770p pVar3 = C108770p.this;
                pVar3.f325684c.mo143251r(pVar3.f325691j);
                C108770p.this.f325684c.mo143255v(11, false);
                C108770p.this.f325684c.mo143233a(false);
                C108770p pVar4 = C108770p.this;
                pVar4.f325692k = 0;
                pVar4.f325693l = 0;
                pVar4.f325691j = 0;
            }
        }
    }

    /* renamed from: ju0.p$e */
    public class C108775e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C17643a.C17645c f325712d;

        /* renamed from: e */
        public final /* synthetic */ String f325713e;

        public C108775e(C17643a.C17645c cVar, String str) {
            this.f325712d = cVar;
            this.f325713e = str;
        }

        public void run() {
            if (C108770p.this.f325685d) {
                int ordinal = this.f325712d.ordinal();
                if (ordinal == 0) {
                    C108770p pVar = C108770p.this;
                    long j = pVar.f325694m;
                    if (j != 0) {
                        pVar.f325684c.mo143251r(j);
                        C108770p.this.f325694m = 0;
                    }
                    C108770p.this.f325684c.mo143255v(14, true);
                    C108770p pVar2 = C108770p.this;
                    pVar2.f325694m = pVar2.f325684c.mo143241h(0, this.f325713e);
                } else if (ordinal == 1) {
                    C108770p pVar3 = C108770p.this;
                    long j2 = pVar3.f325695n;
                    if (j2 != 0) {
                        pVar3.f325684c.mo143251r(j2);
                        C108770p.this.f325695n = 0;
                    }
                    C108770p.this.f325684c.mo143255v(15, true);
                    C108770p pVar4 = C108770p.this;
                    pVar4.f325695n = pVar4.f325684c.mo143241h(1, this.f325713e);
                } else if (ordinal == 2) {
                    C108770p pVar5 = C108770p.this;
                    long j3 = pVar5.f325696o;
                    if (j3 != 0) {
                        pVar5.f325684c.mo143251r(j3);
                        C108770p.this.f325696o = 0;
                    }
                    C108770p.this.f325684c.mo143255v(16, true);
                    C108770p pVar6 = C108770p.this;
                    pVar6.f325696o = pVar6.f325684c.mo143241h(2, this.f325713e);
                } else if (ordinal == 3) {
                    C108770p pVar7 = C108770p.this;
                    long j4 = pVar7.f325697p;
                    if (j4 != 0) {
                        pVar7.f325684c.mo143251r(j4);
                        C108770p.this.f325697p = 0;
                    }
                    C108770p.this.f325684c.mo143255v(17, true);
                    C108770p pVar8 = C108770p.this;
                    pVar8.f325697p = pVar8.f325684c.mo143241h(3, this.f325713e);
                } else if (ordinal == 4) {
                    C108770p pVar9 = C108770p.this;
                    long j5 = pVar9.f325698q;
                    if (j5 != 0) {
                        pVar9.f325684c.mo143251r(j5);
                        C108770p.this.f325698q = 0;
                    }
                    C108770p.this.f325684c.mo143255v(18, true);
                    C108770p pVar10 = C108770p.this;
                    pVar10.f325698q = pVar10.f325684c.mo143241h(4, this.f325713e);
                }
            }
        }
    }

    /* renamed from: ju0.p$f */
    public class C108776f implements Runnable {
        public C108776f() {
        }

        public void run() {
            C108770p pVar = C108770p.this;
            if (pVar.f325685d) {
                pVar.f325684c.mo143255v(14, false);
                C108770p.this.f325684c.mo143255v(15, false);
                C108770p.this.f325684c.mo143255v(16, false);
                C108770p.this.f325684c.mo143255v(17, false);
                C108770p.this.f325684c.mo143255v(18, false);
                C108770p pVar2 = C108770p.this;
                pVar2.f325684c.mo143251r(pVar2.f325694m);
                C108770p pVar3 = C108770p.this;
                pVar3.f325684c.mo143251r(pVar3.f325695n);
                C108770p pVar4 = C108770p.this;
                pVar4.f325684c.mo143251r(pVar4.f325696o);
                C108770p pVar5 = C108770p.this;
                pVar5.f325684c.mo143251r(pVar5.f325697p);
                C108770p pVar6 = C108770p.this;
                pVar6.f325684c.mo143251r(pVar6.f325698q);
                C108770p pVar7 = C108770p.this;
                pVar7.f325694m = 0;
                pVar7.f325695n = 0;
                pVar7.f325696o = 0;
                pVar7.f325697p = 0;
                pVar7.f325698q = 0;
            }
        }
    }

    /* renamed from: a */
    public void mo21055a(C17643a.C17646d dVar, String str) {
        mo159783d(new C108773c(str, dVar));
    }

    /* renamed from: b */
    public void mo21056b(C17643a.C17645c cVar, String str) {
        mo159783d(new C108775e(cVar, str));
    }

    /* renamed from: c */
    public final void mo159782c() {
        this.f325684c = ((C62571i) C86312j.m106911c(C62571i.class)).mo87574qb();
        GLES20.glGenTextures(1, this.f325699r, 0);
        GLES20.glBindTexture(3553, this.f325699r[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glBindTexture(3553, 0);
        ((C110268h) this.f325684c).mo143235c().f194705d = 2;
        this.f325685d = true;
    }

    public void clearFilters() {
        mo21061m("", 0.0f);
    }

    /* renamed from: d */
    public final void mo159783d(Runnable runnable) {
        if (runnable != null) {
            synchronized (this) {
                this.f325700s.add(runnable);
            }
            return;
        }
        throw new IllegalArgumentException("runnable must not be null");
    }

    /* renamed from: f */
    public void mo21058f() {
        mo159783d(new C108776f());
    }

    public boolean isEnabled() {
        return true;
    }

    /* renamed from: j */
    public void mo21060j(C17643a.C17644b bVar, float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        mo159783d(new C108771a(bVar, (int) (100.0f * f), f));
    }

    /* renamed from: m */
    public void mo21061m(String str, float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (!str.isEmpty()) {
            try {
                if (!new C86009m1(str).mo119967g()) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        mo159783d(new C108772b(str, f));
    }

    /* renamed from: n */
    public void mo21062n() {
        mo159783d(new C108774d());
    }

    public void onDetectFacePoints(float[] fArr) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onTextureCustomProcess(int r13, int r14, int r15) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f325685d     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0008
            r12.mo159782c()     // Catch:{ all -> 0x00b1 }
        L_0x0008:
            java.util.ArrayList<java.lang.Runnable> r0 = r12.f325700s     // Catch:{ all -> 0x00b1 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00b1 }
            r1 = 0
            if (r0 != 0) goto L_0x001d
            java.util.ArrayList<java.lang.Runnable> r0 = r12.f325700s     // Catch:{ all -> 0x00b1 }
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x00b1 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x00b1 }
            r0.run()     // Catch:{ all -> 0x00b1 }
            goto L_0x0008
        L_0x001d:
            float r0 = r12.f325686e     // Catch:{ all -> 0x00b1 }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            float r0 = r12.f325687f     // Catch:{ all -> 0x00b1 }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            float r0 = r12.f325688g     // Catch:{ all -> 0x00b1 }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            float r0 = r12.f325689h     // Catch:{ all -> 0x00b1 }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = r12.f325690i     // Catch:{ all -> 0x00b1 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0073
            long r2 = r12.f325691j     // Catch:{ all -> 0x00b1 }
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            long r2 = r12.f325692k     // Catch:{ all -> 0x00b1 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            long r2 = r12.f325693l     // Catch:{ all -> 0x00b1 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            long r2 = r12.f325694m     // Catch:{ all -> 0x00b1 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            long r2 = r12.f325695n     // Catch:{ all -> 0x00b1 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            long r2 = r12.f325696o     // Catch:{ all -> 0x00b1 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            long r2 = r12.f325697p     // Catch:{ all -> 0x00b1 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            long r2 = r12.f325698q     // Catch:{ all -> 0x00b1 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r0 = 0
            goto L_0x0074
        L_0x0073:
            r0 = 1
        L_0x0074:
            if (r0 == 0) goto L_0x00af
            int[] r0 = r12.f325699r     // Catch:{ all -> 0x00b1 }
            r0 = r0[r1]     // Catch:{ all -> 0x00b1 }
            r2 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r2, r0)     // Catch:{ all -> 0x00b1 }
            r3 = 3553(0xde1, float:4.979E-42)
            r4 = 0
            r5 = 6408(0x1908, float:8.98E-42)
            r8 = 0
            r9 = 6408(0x1908, float:8.98E-42)
            r10 = 5121(0x1401, float:7.176E-42)
            r11 = 0
            r6 = r14
            r7 = r15
            android.opengl.GLES20.glTexImage2D(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00b1 }
            q00.g r0 = r12.f325684c     // Catch:{ all -> 0x00b1 }
            r0.mo143224C(r14, r15)     // Catch:{ all -> 0x00b1 }
            q00.g r14 = r12.f325684c     // Catch:{ all -> 0x00b1 }
            r14.mo143242i(r13, r1, r1)     // Catch:{ all -> 0x00b1 }
            q00.g r2 = r12.f325684c     // Catch:{ all -> 0x00b1 }
            int[] r14 = r12.f325699r     // Catch:{ all -> 0x00b1 }
            r4 = r14[r1]     // Catch:{ all -> 0x00b1 }
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r3 = r13
            r2.mo143234b(r3, r4, r5, r7, r8, r9, r10)     // Catch:{ all -> 0x00b1 }
            int[] r13 = r12.f325699r     // Catch:{ all -> 0x00b1 }
            r13 = r13[r1]     // Catch:{ all -> 0x00b1 }
            monitor-exit(r12)     // Catch:{ all -> 0x00b1 }
            return r13
        L_0x00af:
            monitor-exit(r12)     // Catch:{ all -> 0x00b1 }
            return r13
        L_0x00b1:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00b1 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ju0.C108770p.onTextureCustomProcess(int, int, int):int");
    }

    public void onTextureDestoryed() {
        synchronized (this) {
            if (this.f325685d) {
                this.f325684c.destroy();
                GLES20.glDeleteTextures(1, this.f325699r, 0);
                this.f325685d = false;
            }
        }
    }
}
