package vj0;

import android.content.Context;
import android.opengl.EGLContext;
import android.view.SurfaceHolder;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import p1059wd.C90963f;
import p80.C110194c;
import rx3.C13598b0;
import s80.C110777a;
import vj0.C90807f;

/* renamed from: vj0.d */
public class C111524d extends C90963f implements C90807f {

    /* renamed from: p */
    public static final /* synthetic */ int f333911p = 0;

    /* renamed from: g */
    public C111530c f333912g;

    /* renamed from: h */
    public SurfaceHolder f333913h = null;

    /* renamed from: i */
    public boolean f333914i = false;

    /* renamed from: j */
    public int f333915j = 0;

    /* renamed from: n */
    public int f333916n = 0;

    /* renamed from: o */
    public int f333917o = 0;

    /* renamed from: vj0.d$a */
    public class C111525a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111531d f333918d;

        public C111525a(C111524d dVar, C111531d dVar2) {
            this.f333918d = dVar2;
        }

        public void run() {
            this.f333918d.onDone();
        }
    }

    /* renamed from: vj0.d$b */
    public class C111526b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f333919d;

        /* renamed from: e */
        public final /* synthetic */ boolean f333920e;

        /* renamed from: f */
        public final /* synthetic */ C32226l f333921f;

        /* renamed from: g */
        public final /* synthetic */ MBRuntime f333922g;

        /* renamed from: vj0.d$b$a */
        public class C111527a implements C111531d {

            /* renamed from: vj0.d$b$a$a */
            public class C111528a implements C111531d {

                /* renamed from: vj0.d$b$a$a$a */
                public class C111529a implements C111531d {
                    public C111529a() {
                    }

                    public void onDone() {
                        C111526b bVar = C111526b.this;
                        if (!C111524d.this.f333912g.mo163213o(bVar.f333919d)) {
                            Log.m105924i("MicroMsg.GameGLSurfaceView", "switch record not support!");
                            C111526b.this.f333921f.invoke(Boolean.FALSE);
                            return;
                        }
                        C111526b.this.f333921f.invoke(Boolean.TRUE);
                    }
                }

                public C111528a() {
                }

                public void onDone() {
                    C111524d dVar = C111524d.this;
                    dVar.f333912g.mo163209f(dVar.f333913h, dVar.f333917o, dVar.f333915j, dVar.f333916n, new C111529a());
                }
            }

            public C111527a() {
            }

            public void onDone() {
                C111526b bVar = C111526b.this;
                int i = bVar.f333919d;
                if (i == 0) {
                    C111524d dVar = C111524d.this;
                    dVar.f333912g = new C111516a(dVar);
                } else {
                    int i2 = C111524d.f333911p;
                    boolean z = false;
                    if ((i & 1) > 0) {
                        if ((i & 2) > 0) {
                            throw new IllegalArgumentException("not support live and record at same time now");
                        }
                    }
                    if ((i & 2) > 0) {
                        C111524d dVar2 = C111524d.this;
                        dVar2.f333912g = new C111535g(dVar2);
                    } else {
                        if ((i & 1) > 0) {
                            z = true;
                        }
                        if (z) {
                            C111524d dVar3 = C111524d.this;
                            dVar3.f333912g = new C111537h(dVar3);
                        } else {
                            throw new IllegalArgumentException("invalid flag");
                        }
                    }
                }
                C111524d.this.f333912g.init();
                C111524d dVar4 = C111524d.this;
                dVar4.f333912g.mo163214x(dVar4.f333913h, new C111528a());
            }
        }

        public C111526b(int i, boolean z, C32226l lVar, MBRuntime mBRuntime) {
            this.f333919d = i;
            this.f333920e = z;
            this.f333921f = lVar;
            this.f333922g = mBRuntime;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
            r1 = r9.f333923h;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                int r2 = r9.f333919d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 0
                r1[r3] = r2
                java.lang.String r2 = "MicroMsg.GameGLSurfaceView"
                java.lang.String r4 = "hy: request switch to render mode %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
                boolean r1 = r9.f333920e
                if (r1 != 0) goto L_0x0030
                vj0.d r1 = vj0.C111524d.this
                vj0.d$c r1 = r1.f333912g
                int r4 = r9.f333919d
                boolean r1 = r1.mo163213o(r4)
                if (r1 == 0) goto L_0x0030
                java.lang.String r0 = "hy: support status not changed!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                fy3.l r0 = r9.f333921f
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.invoke(r1)
                return
            L_0x0030:
                com.tencent.magicbrush.MBRuntime r1 = r9.f333922g
                monitor-enter(r1)
                long r4 = r1.f235052a     // Catch:{ all -> 0x0073 }
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 != 0) goto L_0x003c
                r3 = 1
            L_0x003c:
                monitor-exit(r1)
                if (r3 != 0) goto L_0x0066
                vj0.d r1 = vj0.C111524d.this
                android.view.SurfaceHolder r3 = r1.f333913h
                if (r3 != 0) goto L_0x0046
                goto L_0x0066
            L_0x0046:
                com.tencent.magicbrush.MBRuntime r4 = r9.f333922g
                boolean r5 = r4 instanceof com.tencent.magicbrush.C80301a
                if (r5 != 0) goto L_0x0059
                java.lang.String r0 = "hy: runtime is not magic brush!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
                fy3.l r0 = r9.f333921f
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.invoke(r1)
                return
            L_0x0059:
                com.tencent.magicbrush.a r4 = (com.tencent.magicbrush.C80301a) r4
                vj0.d$c r1 = r1.f333912g
                vj0.d$b$a r2 = new vj0.d$b$a
                r2.<init>()
                r1.mo163210g(r3, r2, r0)
                return
            L_0x0066:
                java.lang.String r0 = "hy: runtime  destroyed!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
                fy3.l r0 = r9.f333921f
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.invoke(r1)
                return
            L_0x0073:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vj0.C111524d.C111526b.run():void");
        }
    }

    /* renamed from: vj0.d$c */
    public interface C111530c extends C90807f {
        /* renamed from: f */
        void mo163209f(SurfaceHolder surfaceHolder, int i, int i2, int i3, C111531d dVar);

        /* renamed from: g */
        void mo163210g(SurfaceHolder surfaceHolder, C111531d dVar, boolean z);

        C110777a getAbsSurfaceRenderer();

        Object getSurfaceTexture();

        void init();

        /* renamed from: o */
        boolean mo163213o(int i);

        /* renamed from: x */
        void mo163214x(SurfaceHolder surfaceHolder, C111531d dVar);
    }

    /* renamed from: vj0.d$d */
    public interface C111531d {
        void onDone();
    }

    public C111524d(Context context) {
        super(context);
        C111516a aVar = new C111516a(this);
        this.f333912g = aVar;
        aVar.init();
    }

    /* renamed from: b */
    public void mo163222b(C111531d dVar) {
        if (dVar != null) {
            post(new C111525a(this, dVar));
        }
    }

    /* renamed from: c */
    public Object mo163223c() {
        return super.getSurfaceTexture();
    }

    /* renamed from: d */
    public void mo163224d(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
    }

    /* renamed from: e */
    public void mo163225e(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
    }

    public C110777a getAbsSurfaceRenderer() {
        return this.f333912g.getAbsSurfaceRenderer();
    }

    public EGLContext getEGLContext() {
        return this.f333912g.getEGLContext();
    }

    public int getPreviewTextureId() {
        return this.f333912g.getPreviewTextureId();
    }

    public int getSurfaceHeight() {
        return this.f333916n;
    }

    public Object getSurfaceTexture() {
        return this.f333912g.getSurfaceTexture();
    }

    public int getSurfaceWidth() {
        return this.f333915j;
    }

    /* renamed from: h */
    public void mo163226h(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
    }

    public boolean isAvailable() {
        return this.f333914i;
    }

    /* renamed from: l */
    public void mo111654l(boolean z, int i, C32226l<? super Boolean, Void> lVar, MBRuntime mBRuntime) {
        post(new C111526b(i, z, lVar, mBRuntime));
    }

    /* renamed from: q */
    public void mo148312q(C32224a<C13598b0> aVar) {
        this.f333912g.mo148312q(aVar);
    }

    public void requestRender() {
        this.f333912g.requestRender();
    }

    public void setOnSurfaceTextureAvailableDelegate(C90807f.C90808a aVar) {
        Log.m105924i("MicroMsg.GameGLSurfaceView", "setOnSurfaceTextureAvailableDelegate:");
        this.f333912g.setOnSurfaceTextureAvailableDelegate(aVar);
    }

    public void setOnTextureDrawFinishDelegate(C32226l<C110194c, C13598b0> lVar) {
        this.f333912g.setOnTextureDrawFinishDelegate(lVar);
    }

    public void setPreviewRenderer(C110777a aVar) {
        this.f333912g.setPreviewRenderer(aVar);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Log.m105925i("MicroMsg.GameGLSurfaceView", "surfaceChanged %s", surfaceHolder);
        synchronized (this) {
            this.f333917o = i;
            this.f333915j = i2;
            this.f333916n = i3;
            this.f333913h = surfaceHolder;
        }
        this.f333912g.mo163209f(surfaceHolder, i, i2, i3, (C111531d) null);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.m105925i("MicroMsg.GameGLSurfaceView", "surfaceCreated %s", surfaceHolder);
        synchronized (this) {
            this.f333913h = surfaceHolder;
        }
        this.f333912g.mo163214x(surfaceHolder, (C111531d) null);
        synchronized (this) {
            this.f333914i = true;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.m105924i("MicroMsg.GameGLSurfaceView", "surfaceDestroyed, holder:" + surfaceHolder);
        synchronized (this) {
            this.f333913h = surfaceHolder;
        }
        this.f333912g.mo163210g(surfaceHolder, (C111531d) null, false);
        synchronized (this) {
            this.f333914i = false;
        }
    }
}
