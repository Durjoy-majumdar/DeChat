package p871zj;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

/* renamed from: zj.n */
public class C66853n {

    /* renamed from: a */
    public Handler f192028a;

    /* renamed from: b */
    public C66855b f192029b;

    /* renamed from: c */
    public int f192030c = 1;

    /* renamed from: zj.n$b */
    public static class C66855b implements Handler.Callback {

        /* renamed from: d */
        public WeakReference<C66838e> f192031d;

        public C66855b(C66838e eVar, C66854a aVar) {
            this.f192031d = new WeakReference<>(eVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:147:0x033a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r24) {
            /*
                r23 = this;
                r1 = r23
                r0 = r24
                java.lang.ref.WeakReference<zj.e> r2 = r1.f192031d
                java.lang.Object r2 = r2.get()
                zj.e r2 = (p871zj.C66838e) r2
                r3 = 0
                if (r2 != 0) goto L_0x0010
                return r3
            L_0x0010:
                int r4 = r0.what
                r5 = 5
                java.lang.String r6 = "DanmakuManager"
                r7 = 3
                r8 = 0
                r10 = 0
                r11 = -1
                r13 = 2
                r14 = 1
                switch(r4) {
                    case 1: goto L_0x034f;
                    case 2: goto L_0x034b;
                    case 3: goto L_0x0347;
                    case 4: goto L_0x0238;
                    case 5: goto L_0x01f5;
                    case 6: goto L_0x0195;
                    case 7: goto L_0x0167;
                    case 8: goto L_0x0151;
                    case 9: goto L_0x012d;
                    case 10: goto L_0x0128;
                    case 11: goto L_0x0036;
                    case 12: goto L_0x002c;
                    case 13: goto L_0x0022;
                    default: goto L_0x0020;
                }
            L_0x0020:
                goto L_0x0394
            L_0x0022:
                java.lang.String r0 = "invalidate()"
                p850ek.C58614e.m68069f(r6, r0)
                r2.mo90817d()
                goto L_0x0394
            L_0x002c:
                r2.mo90828o()
                r4 = 4
                r2.mo90833s(r4)
                goto L_0x0394
            L_0x0036:
                java.lang.String r4 = "surface_lock"
                java.lang.String r0 = "handleClearDrawingCache"
                p850ek.C58614e.m68067d(r4, r0)
                r2.mo90831q()
                boolean r0 = r2.f191988f
                if (r0 == 0) goto L_0x0394
                java.lang.String r5 = "clearDrawing unlockCanvas "
                java.lang.String r6 = "clearDrawing unlockCanvasAndPost exception: "
                com.tencent.mm.danmaku.render.a r0 = r2.f191989g     // Catch:{ all -> 0x007a }
                android.graphics.Canvas r10 = r0.lockCanvas()     // Catch:{ all -> 0x007a }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
                r0.<init>()     // Catch:{ all -> 0x007a }
                java.lang.String r7 = "clearDrawing lockCanvas "
                r0.append(r7)     // Catch:{ all -> 0x007a }
                if (r10 != 0) goto L_0x005e
                java.lang.String r7 = "null"
                goto L_0x0066
            L_0x005e:
                int r7 = r10.hashCode()     // Catch:{ all -> 0x007a }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x007a }
            L_0x0066:
                r0.append(r7)     // Catch:{ all -> 0x007a }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x007a }
                p850ek.C58614e.m68067d(r4, r0)     // Catch:{ all -> 0x007a }
                if (r10 == 0) goto L_0x007c
                android.text.TextPaint r0 = p850ek.C58613d.f167816a     // Catch:{ all -> 0x007a }
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x007a }
                r10.drawColor(r3, r0)     // Catch:{ all -> 0x007a }
                goto L_0x007c
            L_0x007a:
                r0 = move-exception
                goto L_0x00a2
            L_0x007c:
                if (r10 == 0) goto L_0x0394
                com.tencent.mm.danmaku.render.a r0 = r2.f191989g     // Catch:{ all -> 0x009b }
                r0.unlockCanvasAndPost(r10)     // Catch:{ all -> 0x009b }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
                r0.<init>()     // Catch:{ all -> 0x009b }
                r0.append(r5)     // Catch:{ all -> 0x009b }
                int r2 = r10.hashCode()     // Catch:{ all -> 0x009b }
                r0.append(r2)     // Catch:{ all -> 0x009b }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x009b }
                p850ek.C58614e.m68067d(r4, r0)     // Catch:{ all -> 0x009b }
                goto L_0x0394
            L_0x009b:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                goto L_0x00dd
            L_0x00a2:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
                r7.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.String r8 = "clearDrawing lockCanvas exception: "
                r7.append(r8)     // Catch:{ all -> 0x00f0 }
                int r8 = r10.hashCode()     // Catch:{ all -> 0x00f0 }
                r7.append(r8)     // Catch:{ all -> 0x00f0 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00f0 }
                p850ek.C58614e.m68066c(r4, r7, r0)     // Catch:{ all -> 0x00f0 }
                com.tencent.mm.danmaku.render.a r0 = r2.f191989g     // Catch:{ all -> 0x00d7 }
                r0.unlockCanvasAndPost(r10)     // Catch:{ all -> 0x00d7 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
                r0.<init>()     // Catch:{ all -> 0x00d7 }
                r0.append(r5)     // Catch:{ all -> 0x00d7 }
                int r2 = r10.hashCode()     // Catch:{ all -> 0x00d7 }
                r0.append(r2)     // Catch:{ all -> 0x00d7 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00d7 }
                p850ek.C58614e.m68067d(r4, r0)     // Catch:{ all -> 0x00d7 }
                goto L_0x0394
            L_0x00d7:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
            L_0x00dd:
                r2.append(r6)
                int r5 = r10.hashCode()
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                p850ek.C58614e.m68066c(r4, r2, r0)
                goto L_0x0394
            L_0x00f0:
                r0 = move-exception
                r3 = r0
                if (r10 == 0) goto L_0x0127
                com.tencent.mm.danmaku.render.a r0 = r2.f191989g     // Catch:{ all -> 0x0110 }
                r0.unlockCanvasAndPost(r10)     // Catch:{ all -> 0x0110 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
                r0.<init>()     // Catch:{ all -> 0x0110 }
                r0.append(r5)     // Catch:{ all -> 0x0110 }
                int r2 = r10.hashCode()     // Catch:{ all -> 0x0110 }
                r0.append(r2)     // Catch:{ all -> 0x0110 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0110 }
                p850ek.C58614e.m68067d(r4, r0)     // Catch:{ all -> 0x0110 }
                goto L_0x0127
            L_0x0110:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r6)
                int r5 = r10.hashCode()
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                p850ek.C58614e.m68066c(r4, r2, r0)
            L_0x0127:
                throw r3
            L_0x0128:
                r2.mo90819f()
                goto L_0x0394
            L_0x012d:
                java.lang.String r0 = "handleClear()"
                p850ek.C58614e.m68067d(r6, r0)
                zj.a r0 = r2.f191978G
                r0.mo90807a()
                bk.b r0 = r2.f191975D
                dk.d<android.graphics.drawable.Drawable> r4 = r0.f152740a
                r4.getClass()
                int r0 = p852fk.C59109a.f169072a
                monitor-enter(r4)
                android.util.LruCache<java.lang.String, T> r0 = r4.f166937a     // Catch:{ all -> 0x014e }
                r0.trimToSize(r3)     // Catch:{ all -> 0x014e }
                monitor-exit(r4)     // Catch:{ all -> 0x014e }
                zj.h r0 = r2.f191990h
                r0.mo90839b()
                goto L_0x0394
            L_0x014e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x014e }
                throw r0
            L_0x0151:
                java.lang.String r0 = "handleRelease()"
                p850ek.C58614e.m68067d(r6, r0)
                zj.n r0 = r2.f191981J
                r0.getClass()
                zj.m r0 = r2.f191993n
                r0.getClass()
                zj.b r0 = r2.f191992j
                r0.getClass()
                goto L_0x0394
            L_0x0167:
                java.lang.String r0 = "handleConfigChanged()"
                p850ek.C58614e.m68067d(r6, r0)
                zj.a r0 = r2.f191978G
                r0.mo90812f()
                zj.h r0 = r2.f191990h
                r0.mo90840c()
                dk.g<ak.a> r2 = r0.f192013b
                dk.g$a<T> r2 = r2.f166941a
                dk.g$a<T> r4 = r2.f166947c
                if (r4 == r2) goto L_0x0180
                T r10 = r4.f166945a
            L_0x0180:
                ak.a r10 = (p001ak.C54053a) r10
                if (r10 != 0) goto L_0x0187
                r0.f192016e = r11
                goto L_0x018b
            L_0x0187:
                long r4 = r10.f151348e
                r0.f192016e = r4
            L_0x018b:
                r0.mo90841d()
                java.lang.String r0 = "message config changed"
                p850ek.C58614e.m68067d(r6, r0)
                goto L_0x0394
            L_0x0195:
                java.lang.String r0 = "handleQuit()"
                p850ek.C58614e.m68067d(r6, r0)
                r2.f191986d = r14
                bk.b r0 = r2.f191975D
                dk.d<android.graphics.drawable.Drawable> r4 = r0.f152740a
                r4.getClass()
                int r0 = p852fk.C59109a.f169072a
                monitor-enter(r4)
                android.util.LruCache<java.lang.String, T> r0 = r4.f166937a     // Catch:{ all -> 0x01f2 }
                r0.trimToSize(r3)     // Catch:{ all -> 0x01f2 }
                monitor-exit(r4)     // Catch:{ all -> 0x01f2 }
                zj.h r0 = r2.f191990h
                r0.mo90839b()
                zj.b r0 = r2.f191992j
                dk.a r0 = r0.f191966a
                java.util.LinkedList<dk.a$a> r2 = r0.f166922a
                java.util.Iterator r2 = r2.iterator()
            L_0x01bb:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x01e0
                java.lang.Object r4 = r2.next()
                dk.a$a r4 = (p848dk.C58295a.C58296a) r4
                if (r4 == 0) goto L_0x01bb
                android.graphics.Bitmap r5 = r4.f166928a
                if (r5 == 0) goto L_0x01d5
                boolean r5 = r5.isRecycled()
                if (r5 != 0) goto L_0x01d5
                int r5 = p852fk.C59109a.f169072a
            L_0x01d5:
                r4.f166928a = r10
                r4.f166929b = r3
                r4.f166930c = r3
                r4.f166931d = r3
                r4.f166932e = r3
                goto L_0x01bb
            L_0x01e0:
                java.util.LinkedList<dk.a$a> r2 = r0.f166922a
                r2.clear()
                r0.f166925d = r3
                r0.f166926e = r3
                r0.f166927f = r3
                java.lang.String r0 = "message quit"
                p850ek.C58614e.m68067d(r6, r0)
                goto L_0x0394
            L_0x01f2:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x01f2 }
                throw r0
            L_0x01f5:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "handleSeek() msg.obj is null = "
                r4.append(r7)
                java.lang.Object r7 = r0.obj
                if (r7 != 0) goto L_0x0205
                r7 = 1
                goto L_0x0206
            L_0x0205:
                r7 = 0
            L_0x0206:
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                p850ek.C58614e.m68067d(r6, r4)
                java.lang.Object r0 = r0.obj
                if (r0 == 0) goto L_0x0221
                java.lang.Long r0 = (java.lang.Long) r0
                long r7 = r0.longValue()
                r2.f191997r = r7
                r2.f191998s = r14
                r2.mo90821h()
            L_0x0221:
                int r0 = p850ek.C58614e.f167821b
                if (r0 < r5) goto L_0x0394
                java.lang.Object[] r0 = new java.lang.Object[r13]
                java.lang.String r4 = "message seek:startTime:"
                r0[r3] = r4
                long r4 = r2.f191997r
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                r0[r14] = r2
                p850ek.C58614e.m68070g(r6, r0)
                goto L_0x0394
            L_0x0238:
                java.lang.String r0 = "handleUpdate()"
                p850ek.C58614e.m68069f(r6, r0)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r0 == 0) goto L_0x024d
                boolean r0 = p850ek.C58611b.f167810d
                if (r0 == 0) goto L_0x024d
                long r15 = p850ek.C58611b.f167808b
                r17 = 1
                long r15 = r15 + r17
                p850ek.C58611b.f167808b = r15
            L_0x024d:
                r2.mo90831q()
                boolean r0 = r2.mo90823j()
                if (r0 == 0) goto L_0x0394
                int r0 = r2.f191984M
                if (r0 != 0) goto L_0x0260
                zj.e$b r0 = r2.f191985N
                if (r0 == 0) goto L_0x0260
                r0 = 1
                goto L_0x0261
            L_0x0260:
                r0 = 0
            L_0x0261:
                if (r0 == 0) goto L_0x026c
                android.view.Choreographer r0 = android.view.Choreographer.getInstance()
                zj.e$b r4 = r2.f191985N
                r0.postFrameCallback(r4)
            L_0x026c:
                long r15 = android.os.SystemClock.uptimeMillis()
                dk.f r0 = r2.f191994o
                bk.b r4 = r2.f191975D
                bk.e r4 = r4.f152742c
                if (r4 != 0) goto L_0x027b
                r17 = r11
                goto L_0x027f
            L_0x027b:
                long r17 = r4.getPlayTime()
            L_0x027f:
                int r4 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
                if (r4 >= 0) goto L_0x0285
                r4 = 1
                goto L_0x0286
            L_0x0285:
                r4 = 0
            L_0x0286:
                if (r4 == 0) goto L_0x0290
                long r8 = android.os.SystemClock.uptimeMillis()
                long r10 = r2.f191996q
                long r8 = r8 - r10
                goto L_0x02b6
            L_0x0290:
                long r8 = android.os.SystemClock.uptimeMillis()
                long r11 = r2.f191973B
                long r19 = r8 - r11
                r21 = 200(0xc8, double:9.9E-322)
                int r4 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r4 < 0) goto L_0x02b1
                r2.f191973B = r8
                bk.b r4 = r2.f191975D
                bk.e r4 = r4.f152742c
                if (r4 != 0) goto L_0x02a9
                r11 = -1
                goto L_0x02ad
            L_0x02a9:
                long r11 = r4.getPlayTime()
            L_0x02ad:
                r2.f191974C = r11
                r8 = r11
                goto L_0x02b6
            L_0x02b1:
                long r13 = r2.f191974C
                long r13 = r13 + r8
                long r8 = r13 - r11
            L_0x02b6:
                r0.f166940a = r8
                dk.c r0 = r2.f191995p
                r0.getClass()
                long r8 = android.os.SystemClock.uptimeMillis()
                long r11 = r0.f166936c
                long r8 = r8 - r11
                r0.f166935b = r8
                long r11 = r0.f166934a
                long r11 = r11 + r8
                r0.f166934a = r11
                long r8 = android.os.SystemClock.uptimeMillis()
                r0.f166936c = r8
                int r0 = p850ek.C58614e.f167821b
                r8 = 4
                if (r0 < r5) goto L_0x02fa
                java.lang.Object[] r5 = new java.lang.Object[r8]
                java.lang.String r9 = "updateFrame:currentTime:"
                r5[r3] = r9
                dk.c r9 = r2.f191995p
                long r11 = r9.f166934a
                java.lang.Long r9 = java.lang.Long.valueOf(r11)
                r4 = 1
                r5[r4] = r9
                java.lang.String r9 = ",lastInterval:"
                r10 = 2
                r5[r10] = r9
                dk.c r9 = r2.f191995p
                long r9 = r9.f166935b
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r5[r7] = r9
                p850ek.C58614e.m68070g(r6, r5)
            L_0x02fa:
                boolean r5 = r2.f191998s
                if (r5 == 0) goto L_0x0305
                zj.a r5 = r2.f191978G
                r5.mo90807a()
                r2.f191998s = r3
            L_0x0305:
                if (r0 < r8) goto L_0x030d
                long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x032f }
                r2.f192000u = r9     // Catch:{ all -> 0x032f }
            L_0x030d:
                r2.mo90834t()     // Catch:{ all -> 0x032f }
                if (r0 < r8) goto L_0x0318
                long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x032f }
                r2.f192001v = r9     // Catch:{ all -> 0x032f }
            L_0x0318:
                r2.mo90824k()     // Catch:{ all -> 0x032f }
                if (r0 < r8) goto L_0x0323
                long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x032f }
                r2.f192002w = r7     // Catch:{ all -> 0x032f }
            L_0x0323:
                boolean r14 = r2.mo90817d()     // Catch:{ all -> 0x032f }
                if (r14 == 0) goto L_0x0338
                r2.mo90828o()     // Catch:{ all -> 0x032d }
                goto L_0x0338
            L_0x032d:
                r0 = move-exception
                goto L_0x0331
            L_0x032f:
                r0 = move-exception
                r14 = 1
            L_0x0331:
                java.lang.String r4 = r0.toString()
                p850ek.C58614e.m68066c(r6, r4, r0)
            L_0x0338:
                if (r14 == 0) goto L_0x0394
                r0 = 16
                long r4 = (long) r0
                long r4 = r4 + r15
                long r6 = android.os.SystemClock.uptimeMillis()
                long r4 = r4 - r6
                r2.mo90833s(r4)
                goto L_0x0394
            L_0x0347:
                r2.mo90820g()
                goto L_0x0394
            L_0x034b:
                r2.mo90821h()
                goto L_0x0394
            L_0x034f:
                r2.f191986d = r3
                r4 = 1
                r2.f191998s = r4
                java.lang.Object r0 = r0.obj
                if (r0 == 0) goto L_0x0361
                java.lang.Long r0 = (java.lang.Long) r0
                long r11 = r0.longValue()
                r2.f191997r = r11
                goto L_0x0363
            L_0x0361:
                r2.f191997r = r8
            L_0x0363:
                r2.f192003x = r3
                r2.f192004y = r3
                r2.f192005z = r3
                dk.c r0 = r2.f191995p
                r0.getClass()
                long r11 = android.os.SystemClock.uptimeMillis()
                r0.f166936c = r11
                dk.c r0 = r2.f191995p
                r0.f166934a = r8
                r0.f166935b = r8
                int r0 = p850ek.C58614e.f167821b
                if (r0 < r7) goto L_0x0391
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r5 = "message start:startTime:"
                r0[r3] = r5
                long r7 = r2.f191997r
                java.lang.Long r5 = java.lang.Long.valueOf(r7)
                r4 = 1
                r0[r4] = r5
                p850ek.C58614e.m68068e(r6, r0)
            L_0x0391:
                r2.mo90821h()
            L_0x0394:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p871zj.C66853n.C66855b.handleMessage(android.os.Message):boolean");
        }
    }

    public C66853n(C66838e eVar) {
        this.f192029b = new C66855b(eVar, (C66854a) null);
    }

    /* renamed from: a */
    public void mo90858a(int i) {
        Message obtain = Message.obtain();
        obtain.what = i;
        Handler handler = this.f192028a;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    public void mo90859b(int i) {
        boolean z = true;
        Log.m105924i("DanmakuManager", String.format("checkedThreadAlive mDrawingThreadType:%d", new Object[]{Integer.valueOf(this.f192030c)}));
        if (this.f192030c != 1) {
            z = false;
        }
        if (z && this.f192028a == null) {
            this.f192028a = new Handler(Looper.getMainLooper(), this.f192029b);
        }
    }
}
