package p1017od;

import android.os.Handler;
import android.util.SparseLongArray;
import com.tencent.magicbrush.MBRuntime;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: od.e */
public class C89157e {

    /* renamed from: a */
    public final MBRuntime f256898a;

    /* renamed from: b */
    public SparseLongArray f256899b = new SparseLongArray();

    /* renamed from: c */
    public C89153a f256900c = new C89153a();

    /* renamed from: d */
    public Handler f256901d;

    /* renamed from: e */
    public final C89160c f256902e = new C89160c((C89158a) null);

    /* renamed from: f */
    public int f256903f;

    /* renamed from: g */
    public int f256904g;

    /* renamed from: h */
    public float f256905h;

    /* renamed from: i */
    public Queue<Float> f256906i = new LinkedList();

    /* renamed from: j */
    public float f256907j;

    /* renamed from: k */
    public boolean f256908k;

    /* renamed from: l */
    public int f256909l;

    /* renamed from: m */
    public int f256910m;

    /* renamed from: n */
    public boolean f256911n;

    /* renamed from: o */
    public C89159b f256912o = new C89159b(this);

    /* renamed from: p */
    public C89159b f256913p = new C89159b(this);

    /* renamed from: od.e$b */
    public class C89159b {

        /* renamed from: a */
        public int f256914a;

        /* renamed from: b */
        public int f256915b;

        /* renamed from: c */
        public int f256916c;

        /* renamed from: d */
        public int f256917d;

        /* renamed from: e */
        public int f256918e;

        /* renamed from: f */
        public int f256919f;

        public C89159b(C89157e eVar) {
        }
    }

    /* renamed from: od.e$c */
    public class C89160c implements Runnable {
        public C89160c(C89158a aVar) {
        }

        public void run() {
            C89157e eVar = C89157e.this;
            synchronized (eVar.f256898a) {
                if (eVar.f256898a.f235052a != 0) {
                    MBRuntime mBRuntime = eVar.f256898a;
                    float[] nativeGetCurrentFps = mBRuntime.nativeGetCurrentFps(mBRuntime.f235052a);
                    C89153a aVar = eVar.f256900c;
                    float f = nativeGetCurrentFps[0];
                    aVar.f256873a = f;
                    aVar.f256874b = nativeGetCurrentFps[1];
                    int i = (int) nativeGetCurrentFps[2];
                    aVar.f256875c = i;
                    int i2 = (int) nativeGetCurrentFps[3];
                    aVar.f256876d = i2;
                    aVar.f256877e = nativeGetCurrentFps[4];
                    int i3 = (int) nativeGetCurrentFps[5];
                    aVar.f256878f = i3;
                    int i4 = (int) nativeGetCurrentFps[6];
                    aVar.f256879g = i4;
                    C89159b bVar = eVar.f256912o;
                    bVar.f256916c += i;
                    bVar.f256917d += i2;
                    bVar.f256918e += i3;
                    bVar.f256919f += i4;
                    if (eVar.f256908k) {
                        int i5 = eVar.f256909l + 1;
                        eVar.f256909l = i5;
                        if (i5 > eVar.f256910m) {
                            eVar.f256909l = 1;
                            if (eVar.f256911n) {
                                bVar.f256915b = 0;
                                bVar.f256914a = 0;
                            }
                        }
                        if (f < eVar.f256905h) {
                            bVar.f256915b++;
                        }
                        int size = ((LinkedList) eVar.f256906i).size();
                        int i6 = eVar.f256903f;
                        if (size >= i6 && i6 > 0) {
                            float f2 = (eVar.f256900c.f256873a * ((float) i6)) + ((float) eVar.f256904g);
                            float f3 = eVar.f256907j;
                            if (f2 < f3) {
                                eVar.f256912o.f256914a++;
                            }
                            eVar.f256907j = f3 - ((Float) ((LinkedList) eVar.f256906i).remove()).floatValue();
                        }
                        ((LinkedList) eVar.f256906i).add(Float.valueOf(eVar.f256900c.f256873a));
                        eVar.f256907j += eVar.f256900c.f256873a;
                    }
                }
            }
            C89157e eVar2 = C89157e.this;
            Handler handler = eVar2.f256901d;
            if (handler != null) {
                handler.postDelayed(eVar2.f256902e, 1000);
            }
        }
    }

    public C89157e(MBRuntime mBRuntime) {
        this.f256898a = mBRuntime;
        this.f256908k = false;
    }

    /* renamed from: a */
    public int mo123498a() {
        synchronized (this.f256898a) {
            if (this.f256898a.f235052a == 0) {
                return 0;
            }
            MBRuntime mBRuntime = this.f256898a;
            int nativeGetDrawCalls = mBRuntime.nativeGetDrawCalls(mBRuntime.f235052a);
            return nativeGetDrawCalls;
        }
    }

    /* renamed from: b */
    public int mo123499b() {
        synchronized (this.f256898a) {
            if (this.f256898a.f235052a == 0) {
                return -1;
            }
            MBRuntime mBRuntime = this.f256898a;
            int nativeGetFrameCounter = mBRuntime.nativeGetFrameCounter(mBRuntime.f235052a);
            return nativeGetFrameCounter;
        }
    }

    /* renamed from: c */
    public int mo123500c() {
        synchronized (this.f256898a) {
            if (this.f256898a.f235052a == 0) {
                return 0;
            }
            MBRuntime mBRuntime = this.f256898a;
            int nativeGetTriangles = mBRuntime.nativeGetTriangles(mBRuntime.f235052a);
            return nativeGetTriangles;
        }
    }

    /* renamed from: d */
    public int mo123501d() {
        synchronized (this.f256898a) {
            if (this.f256898a.f235052a == 0) {
                return 0;
            }
            MBRuntime mBRuntime = this.f256898a;
            int nativeGetVertexes = mBRuntime.nativeGetVertexes(mBRuntime.f235052a);
            return nativeGetVertexes;
        }
    }
}
