package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.mapsdk.internal.C114124qv;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;

/* renamed from: com.tencent.mapsdk.internal.qt */
public final class C114122qt implements C114124qv.C114126a {

    /* renamed from: a */
    public static final String f341597a = "rastermap/handdraw";

    /* renamed from: c */
    private static final int f341598c = 4;

    /* renamed from: d */
    private static final int f341599d = 20;

    /* renamed from: b */
    public TileOverlay f341600b = null;

    /* renamed from: e */
    private final Object f341601e = new Object();

    /* renamed from: f */
    private C114322sx f341602f;

    /* renamed from: g */
    private TileOverlayOptions f341603g;

    public C114122qt(C114322sx sxVar) {
        this.f341602f = sxVar;
        if (sxVar != null) {
            C114121qs.m159236a(sxVar.mo171543G());
            C114124qv qvVar = new C114124qv(this.f341602f.mo171543G(), this);
            new C114124qv.C114127b(qvVar, (byte) 0).execute(new Context[]{qvVar.f341608a});
        }
    }

    /* renamed from: d */
    private void m159238d() {
        TileOverlayOptions tileOverlayOptions = this.f341603g;
        if (tileOverlayOptions != null) {
            C114123qu.f341604a = C114121qs.m159235a();
            TileOverlayOptions tileOverlayOptions2 = ((C114123qu) tileOverlayOptions.getTileProvider()).f341606b;
            if (tileOverlayOptions2 != null) {
                tileOverlayOptions2.versionInfo(C114123qu.m159244a());
            }
        }
        synchronized (this.f341601e) {
            TileOverlay tileOverlay = this.f341600b;
            if (tileOverlay != null) {
                tileOverlay.clearTileCache();
                this.f341600b.reload();
            }
        }
    }

    /* renamed from: e */
    private boolean m159239e() {
        return this.f341600b != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r3 >= r0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r4 = r1[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r4.getType() != com.tencent.mapsdk.internal.C114110qj.class) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.setAccessible(true);
        ((com.tencent.mapsdk.internal.C114110qj) r4.get(r7.f341600b)).mo172728a(4, 20);
        r4.setAccessible(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        com.tencent.mapsdk.internal.C113889km.m157547b("SketchOverlayManager set data level with reflect", (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r0 = r1.length;
        r3 = 0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m159240f() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f341601e
            monitor-enter(r0)
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlay r1 = r7.f341600b     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0009:
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0042 }
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            int r0 = r1.length
            r2 = 0
            r3 = 0
        L_0x0015:
            if (r3 >= r0) goto L_0x0041
            r4 = r1[r3]
            java.lang.Class r5 = r4.getType()
            java.lang.Class<com.tencent.mapsdk.internal.qj> r6 = com.tencent.mapsdk.internal.C114110qj.class
            if (r5 != r6) goto L_0x003e
            r0 = 1
            r4.setAccessible(r0)     // Catch:{ IllegalAccessException -> 0x0037 }
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlay r0 = r7.f341600b     // Catch:{ IllegalAccessException -> 0x0037 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ IllegalAccessException -> 0x0037 }
            com.tencent.mapsdk.internal.qj r0 = (com.tencent.mapsdk.internal.C114110qj) r0     // Catch:{ IllegalAccessException -> 0x0037 }
            r1 = 4
            r3 = 20
            r0.mo172728a(r1, r3)     // Catch:{ IllegalAccessException -> 0x0037 }
            r4.setAccessible(r2)     // Catch:{ IllegalAccessException -> 0x0037 }
            return
        L_0x0037:
            r0 = move-exception
            java.lang.String r1 = "SketchOverlayManager set data level with reflect"
            com.tencent.mapsdk.internal.C113889km.m157547b((java.lang.String) r1, (java.lang.Throwable) r0)
            return
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x0041:
            return
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114122qt.m159240f():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = r1.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r3 >= r0) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r4 = r1[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r4.getType() != com.tencent.mapsdk.internal.C114110qj.class) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.setAccessible(true);
        ((com.tencent.mapsdk.internal.C114110qj) r4.get(r7.f341600b)).mo172728a(4, 20);
        r4.setAccessible(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        com.tencent.mapsdk.internal.C113889km.m157547b("SketchOverlayManager set data level with reflect", (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo172741a() {
        /*
            r7 = this;
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlay r0 = r7.f341600b
            if (r0 != 0) goto L_0x0081
            com.tencent.mapsdk.internal.sx r0 = r7.f341602f
            if (r0 == 0) goto L_0x0081
            M r0 = r0.f339878e_
            if (r0 != 0) goto L_0x000d
            goto L_0x0081
        L_0x000d:
            com.tencent.mapsdk.vector.VectorMap r0 = (com.tencent.mapsdk.vector.VectorMap) r0
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions r1 = r7.f341603g
            if (r1 != 0) goto L_0x002f
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions r1 = new com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions
            r1.<init>()
            r7.f341603g = r1
            com.tencent.mapsdk.internal.qu r2 = new com.tencent.mapsdk.internal.qu
            r2.<init>(r1)
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions r1 = r7.f341603g
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions r1 = r1.tileProvider(r2)
            java.lang.String r2 = "rastermap/handdraw"
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions r1 = r1.diskCacheDir(r2)
            r2 = 2
            r1.zIndex(r2)
        L_0x002f:
            r1 = 19
            r0.mo173455b((int) r1)
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions r1 = r7.f341603g
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlay r0 = r0.addTileOverlay(r1)
            r7.f341600b = r0
            java.lang.Object r0 = r7.f341601e
            monitor-enter(r0)
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlay r1 = r7.f341600b     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0045
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            return
        L_0x0045:
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x007e }
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()     // Catch:{ all -> 0x007e }
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            int r0 = r1.length
            r2 = 0
            r3 = 0
        L_0x0051:
            if (r3 >= r0) goto L_0x007d
            r4 = r1[r3]
            java.lang.Class r5 = r4.getType()
            java.lang.Class<com.tencent.mapsdk.internal.qj> r6 = com.tencent.mapsdk.internal.C114110qj.class
            if (r5 != r6) goto L_0x007a
            r0 = 1
            r4.setAccessible(r0)     // Catch:{ IllegalAccessException -> 0x0073 }
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlay r0 = r7.f341600b     // Catch:{ IllegalAccessException -> 0x0073 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ IllegalAccessException -> 0x0073 }
            com.tencent.mapsdk.internal.qj r0 = (com.tencent.mapsdk.internal.C114110qj) r0     // Catch:{ IllegalAccessException -> 0x0073 }
            r1 = 4
            r3 = 20
            r0.mo172728a(r1, r3)     // Catch:{ IllegalAccessException -> 0x0073 }
            r4.setAccessible(r2)     // Catch:{ IllegalAccessException -> 0x0073 }
            return
        L_0x0073:
            r0 = move-exception
            java.lang.String r1 = "SketchOverlayManager set data level with reflect"
            com.tencent.mapsdk.internal.C113889km.m157547b((java.lang.String) r1, (java.lang.Throwable) r0)
            return
        L_0x007a:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x007d:
            return
        L_0x007e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r1
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114122qt.mo172741a():void");
    }

    /* renamed from: b */
    public final void mo172742b() {
        synchronized (this.f341601e) {
            TileOverlay tileOverlay = this.f341600b;
            if (tileOverlay != null) {
                tileOverlay.remove();
                this.f341600b = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo172743c() {
        TileOverlayOptions tileOverlayOptions = this.f341603g;
        if (tileOverlayOptions != null) {
            C114123qu.f341604a = C114121qs.m159235a();
            TileOverlayOptions tileOverlayOptions2 = ((C114123qu) tileOverlayOptions.getTileProvider()).f341606b;
            if (tileOverlayOptions2 != null) {
                tileOverlayOptions2.versionInfo(C114123qu.m159244a());
            }
        }
        synchronized (this.f341601e) {
            TileOverlay tileOverlay = this.f341600b;
            if (tileOverlay != null) {
                tileOverlay.clearTileCache();
                this.f341600b.reload();
            }
        }
    }
}
