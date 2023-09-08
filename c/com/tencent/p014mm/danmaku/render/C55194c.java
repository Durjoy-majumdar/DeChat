package com.tencent.p014mm.danmaku.render;

import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.tencent.p014mm.danmaku.render.C55190a;
import p850ek.C58614e;
import p871zj.C66837d;
import p871zj.C66838e;

/* renamed from: com.tencent.mm.danmaku.render.c */
public class C55194c implements C55190a, SurfaceHolder.Callback {

    /* renamed from: d */
    public SurfaceView f157027d;

    /* renamed from: e */
    public SurfaceHolder f157028e;

    /* renamed from: f */
    public C55190a.C55191a f157029f;

    public C55194c(SurfaceView surfaceView) {
        this.f157027d = surfaceView;
        surfaceView.setWillNotCacheDrawing(true);
        this.f157027d.setDrawingCacheEnabled(false);
        this.f157027d.setWillNotDraw(true);
        this.f157027d.setZOrderMediaOverlay(true);
        SurfaceHolder holder = this.f157027d.getHolder();
        this.f157028e = holder;
        holder.addCallback(this);
        this.f157028e.setFormat(-2);
    }

    /* renamed from: a */
    public void mo76353a(C55190a.C55191a aVar) {
        this.f157029f = aVar;
    }

    /* renamed from: b */
    public void mo76354b(C55190a.C55192b bVar) {
        if (bVar != null) {
            ((C66837d) bVar).mo90813a((Canvas) null);
        }
    }

    /* renamed from: c */
    public float mo76355c() {
        return this.f157027d.getY();
    }

    public Canvas lockCanvas() {
        return this.f157028e.lockCanvas();
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f157027d.setOnTouchListener(onTouchListener);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C55190a.C55191a aVar = this.f157029f;
        if (aVar != null) {
            ((C66838e) aVar).mo90825l();
        }
        C58614e.m68067d("SurfaceDanmakuView", "surfaceChanged, width = " + i2 + ", height = " + i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f157029f != null) {
            C58614e.m68067d("surface_lock", "surfaceCreated");
        }
        C58614e.m68067d("SurfaceDanmakuView", "surfaceCreated, isHardwareAccelerateEnable = false");
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C55190a.C55191a aVar = this.f157029f;
        if (aVar != null) {
            ((C66838e) aVar).mo90826m();
        }
        C58614e.m68067d("SurfaceDanmakuView", "surfaceDestroyed");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.util.concurrent.locks.ReentrantLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.util.concurrent.locks.ReentrantLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.util.concurrent.locks.ReentrantLock} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unlock() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "SurfaceDanmakuView unlock"
            java.lang.String r3 = "SurfaceDanmakuView unlock surfaceLock = "
            java.lang.String r4 = "surface_lock"
            java.lang.Class<android.view.SurfaceView> r0 = android.view.SurfaceView.class
            android.view.SurfaceView r5 = r1.f157027d
            java.lang.String r6 = "mSurfaceLock"
            r8 = 1
            java.lang.reflect.Field r0 = r0.getDeclaredField(r6)     // Catch:{ Exception -> 0x001c }
            r0.setAccessible(r8)     // Catch:{ Exception -> 0x001c }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r5 = r0
            java.util.concurrent.locks.ReentrantLock r5 = (java.util.concurrent.locks.ReentrantLock) r5
            android.view.SurfaceView r0 = r1.f157027d
            android.view.SurfaceHolder r0 = r0.getHolder()
            android.view.Surface r0 = r0.getSurface()
            java.lang.Class<android.view.Surface> r6 = android.view.Surface.class
            java.lang.String r9 = "nativeRelease"
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0099 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0099 }
            r12 = 0
            r10[r12] = r11     // Catch:{ Exception -> 0x0099 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r9, r10)     // Catch:{ Exception -> 0x0099 }
            r6.setAccessible(r8)     // Catch:{ Exception -> 0x0099 }
            java.lang.Class<android.view.Surface> r9 = android.view.Surface.class
            java.lang.String r10 = "mLockedObject"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r10)     // Catch:{ Exception -> 0x0099 }
            r9.setAccessible(r8)     // Catch:{ Exception -> 0x0099 }
            java.lang.Object r10 = r9.get(r0)     // Catch:{ Exception -> 0x0099 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Exception -> 0x0099 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r11.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r13 = "SurfaceDanmakuView unlock lockObjectValue = "
            r11.append(r13)     // Catch:{ Exception -> 0x0099 }
            r11.append(r10)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0099 }
            p850ek.C58614e.m68067d(r4, r11)     // Catch:{ Exception -> 0x0099 }
            long r13 = r10.longValue()     // Catch:{ Exception -> 0x0099 }
            r7 = 0
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x0074
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0099 }
            r13[r12] = r10     // Catch:{ Exception -> 0x0099 }
            r10 = 0
            r6.invoke(r10, r13)     // Catch:{ Exception -> 0x0099 }
        L_0x0074:
            r9.setLong(r0, r7)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r0 = "SurfaceDanmakuView unlock: release success"
            p850ek.C58614e.m68064a(r4, r0)     // Catch:{ Exception -> 0x0099 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            p850ek.C58614e.m68067d(r4, r0)
            if (r5 == 0) goto L_0x00bf
            boolean r0 = r5.isLocked()
            if (r0 == 0) goto L_0x00bf
            goto L_0x00b9
        L_0x0097:
            r0 = move-exception
            goto L_0x00c0
        L_0x0099:
            r0 = move-exception
            java.lang.String r6 = "SurfaceDanmakuView unlock:release failed"
            p850ek.C58614e.m68066c(r4, r6, r0)     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            p850ek.C58614e.m68067d(r4, r0)
            if (r5 == 0) goto L_0x00bf
            boolean r0 = r5.isLocked()
            if (r0 == 0) goto L_0x00bf
        L_0x00b9:
            p850ek.C58614e.m68067d(r4, r2)
            r5.unlock()
        L_0x00bf:
            return
        L_0x00c0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            p850ek.C58614e.m68067d(r4, r3)
            if (r5 == 0) goto L_0x00e0
            boolean r3 = r5.isLocked()
            if (r3 == 0) goto L_0x00e0
            p850ek.C58614e.m68067d(r4, r2)
            r5.unlock()
        L_0x00e0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.danmaku.render.C55194c.unlock():void");
    }

    public void unlockCanvasAndPost(Canvas canvas) {
        this.f157028e.unlockCanvasAndPost(canvas);
    }
}
