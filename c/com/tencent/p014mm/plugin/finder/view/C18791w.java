package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: com.tencent.mm.plugin.finder.view.w */
public class C18791w {

    /* renamed from: z */
    public static final int f52590z = ViewConfiguration.getTouchSlop();

    /* renamed from: a */
    public int f52591a;

    /* renamed from: b */
    public int f52592b;

    /* renamed from: c */
    public int f52593c;

    /* renamed from: d */
    public int f52594d;

    /* renamed from: e */
    public int f52595e;

    /* renamed from: f */
    public int f52596f = 400;

    /* renamed from: g */
    public final Handler f52597g;

    /* renamed from: h */
    public final C18795d f52598h;

    /* renamed from: i */
    public C18794c f52599i;

    /* renamed from: j */
    public C18793b f52600j;

    /* renamed from: k */
    public boolean f52601k;

    /* renamed from: l */
    public boolean f52602l;

    /* renamed from: m */
    public boolean f52603m;

    /* renamed from: n */
    public boolean f52604n;

    /* renamed from: o */
    public boolean f52605o;

    /* renamed from: p */
    public MotionEvent f52606p;

    /* renamed from: q */
    public MotionEvent f52607q;

    /* renamed from: r */
    public MotionEvent f52608r;

    /* renamed from: s */
    public boolean f52609s;

    /* renamed from: t */
    public float f52610t;

    /* renamed from: u */
    public float f52611u;

    /* renamed from: v */
    public float f52612v;

    /* renamed from: w */
    public float f52613w;

    /* renamed from: x */
    public boolean f52614x;

    /* renamed from: y */
    public VelocityTracker f52615y;

    /* renamed from: com.tencent.mm.plugin.finder.view.w$b */
    public interface C18793b {
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.w$c */
    public interface C18794c {
        boolean onDoubleTap(MotionEvent motionEvent);

        boolean onDoubleTapEvent(MotionEvent motionEvent);

        boolean onSingleTapConfirmed(MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.w$d */
    public interface C18795d {
        boolean onDown(MotionEvent motionEvent);

        boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        void onLongPress(MotionEvent motionEvent);

        boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        void onShowPress(MotionEvent motionEvent);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public C18791w(Context context, C18795d dVar, Handler handler) {
        int i;
        int i2;
        int i3;
        if (handler != null) {
            this.f52597g = new C18792a(handler);
        } else {
            this.f52597g = new C18792a();
        }
        this.f52598h = dVar;
        if (dVar instanceof C18794c) {
            this.f52599i = (C18794c) dVar;
        }
        if (dVar instanceof C18793b) {
            this.f52600j = (C18793b) dVar;
        }
        if (dVar != null) {
            this.f52614x = true;
            if (context == null) {
                i3 = f52590z;
                i2 = 100;
                this.f52594d = 50;
                this.f52595e = 8000;
                i = i3;
            } else {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                i = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f52594d = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f52595e = viewConfiguration.getScaledMaximumFlingVelocity();
                i3 = scaledTouchSlop;
                i2 = scaledDoubleTapSlop;
            }
            this.f52591a = i3 * i3;
            this.f52592b = i * i;
            this.f52593c = i2 * i2;
            return;
        }
        throw new NullPointerException("OnGestureListener must not be null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x029e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23720a(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getAction()
            android.view.MotionEvent r3 = r0.f52607q
            if (r3 == 0) goto L_0x000f
            r3.recycle()
        L_0x000f:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r18)
            r0.f52607q = r3
            android.view.VelocityTracker r3 = r0.f52615y
            if (r3 != 0) goto L_0x001f
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r0.f52615y = r3
        L_0x001f:
            android.view.VelocityTracker r3 = r0.f52615y
            r3.addMovement(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 6
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            if (r6 == 0) goto L_0x0035
            int r7 = r18.getActionIndex()
            goto L_0x0036
        L_0x0035:
            r7 = -1
        L_0x0036:
            int r8 = r18.getPointerCount()
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x003e:
            if (r10 >= r8) goto L_0x0050
            if (r7 != r10) goto L_0x0043
            goto L_0x004d
        L_0x0043:
            float r13 = r1.getX(r10)
            float r11 = r11 + r13
            float r13 = r1.getY(r10)
            float r12 = r12 + r13
        L_0x004d:
            int r10 = r10 + 1
            goto L_0x003e
        L_0x0050:
            if (r6 == 0) goto L_0x0055
            int r6 = r8 + -1
            goto L_0x0056
        L_0x0055:
            r6 = r8
        L_0x0056:
            float r6 = (float) r6
            float r11 = r11 / r6
            float r12 = r12 / r6
            r6 = 3
            r7 = 2
            if (r2 == 0) goto L_0x0208
            r10 = 1000(0x3e8, float:1.401E-42)
            r13 = 0
            if (r2 == r4) goto L_0x017b
            if (r2 == r7) goto L_0x0101
            if (r2 == r6) goto L_0x00dd
            r13 = 5
            if (r2 == r13) goto L_0x00ba
            if (r2 == r3) goto L_0x006d
            goto L_0x02d0
        L_0x006d:
            r0.f52610t = r11
            r0.f52612v = r11
            r0.f52611u = r12
            r0.f52613w = r12
            android.view.VelocityTracker r2 = r0.f52615y
            int r3 = r0.f52595e
            float r3 = (float) r3
            r2.computeCurrentVelocity(r10, r3)
            int r2 = r18.getActionIndex()
            int r3 = r1.getPointerId(r2)
            android.view.VelocityTracker r4 = r0.f52615y
            float r4 = r4.getXVelocity(r3)
            android.view.VelocityTracker r6 = r0.f52615y
            float r3 = r6.getYVelocity(r3)
            r6 = 0
        L_0x0092:
            if (r6 >= r8) goto L_0x02d0
            if (r6 != r2) goto L_0x0097
            goto L_0x00b7
        L_0x0097:
            int r7 = r1.getPointerId(r6)
            android.view.VelocityTracker r10 = r0.f52615y
            float r10 = r10.getXVelocity(r7)
            float r10 = r10 * r4
            android.view.VelocityTracker r11 = r0.f52615y
            float r7 = r11.getYVelocity(r7)
            float r7 = r7 * r3
            float r10 = r10 + r7
            int r7 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b7
            android.view.VelocityTracker r1 = r0.f52615y
            r1.clear()
            goto L_0x02d0
        L_0x00b7:
            int r6 = r6 + 1
            goto L_0x0092
        L_0x00ba:
            r0.f52610t = r11
            r0.f52612v = r11
            r0.f52611u = r12
            r0.f52613w = r12
            android.os.Handler r1 = r0.f52597g
            r1.removeMessages(r4)
            android.os.Handler r1 = r0.f52597g
            r1.removeMessages(r7)
            android.os.Handler r1 = r0.f52597g
            r1.removeMessages(r6)
            r0.f52609s = r5
            r0.f52604n = r5
            r0.f52605o = r5
            r0.f52602l = r5
            r0.f52603m = r5
            goto L_0x02d0
        L_0x00dd:
            android.os.Handler r1 = r0.f52597g
            r1.removeMessages(r4)
            android.os.Handler r1 = r0.f52597g
            r1.removeMessages(r7)
            android.os.Handler r1 = r0.f52597g
            r1.removeMessages(r6)
            android.view.VelocityTracker r1 = r0.f52615y
            r1.recycle()
            r0.f52615y = r13
            r0.f52609s = r5
            r0.f52601k = r5
            r0.f52604n = r5
            r0.f52605o = r5
            r0.f52602l = r5
            r0.f52603m = r5
            goto L_0x02d0
        L_0x0101:
            boolean r2 = r0.f52603m
            if (r2 != 0) goto L_0x02d0
            android.os.Handler r2 = r0.f52597g
            r2.hasMessages(r7)
            float r2 = r0.f52610t
            float r2 = r2 - r11
            float r3 = r0.f52611u
            float r3 = r3 - r12
            boolean r8 = r0.f52609s
            if (r8 == 0) goto L_0x011d
            com.tencent.mm.plugin.finder.view.w$c r2 = r0.f52599i
            boolean r1 = r2.onDoubleTapEvent(r1)
            r5 = r5 | r1
            goto L_0x02d0
        L_0x011d:
            boolean r8 = r0.f52604n
            if (r8 == 0) goto L_0x015b
            float r8 = r0.f52612v
            float r8 = r11 - r8
            int r8 = (int) r8
            float r9 = r0.f52613w
            float r9 = r12 - r9
            int r9 = (int) r9
            int r8 = r8 * r8
            int r9 = r9 * r9
            int r8 = r8 + r9
            int r9 = r0.f52591a
            if (r8 <= r9) goto L_0x0152
            com.tencent.mm.plugin.finder.view.w$d r9 = r0.f52598h
            android.view.MotionEvent r10 = r0.f52606p
            boolean r1 = r9.onScroll(r10, r1, r2, r3)
            r0.f52610t = r11
            r0.f52611u = r12
            r0.f52604n = r5
            android.os.Handler r2 = r0.f52597g
            r2.removeMessages(r6)
            android.os.Handler r2 = r0.f52597g
            r2.removeMessages(r4)
            android.os.Handler r2 = r0.f52597g
            r2.removeMessages(r7)
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            int r2 = r0.f52592b
            if (r8 <= r2) goto L_0x0205
            r0.f52605o = r5
            goto L_0x0205
        L_0x015b:
            float r4 = java.lang.Math.abs(r2)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x016d
            float r4 = java.lang.Math.abs(r3)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x02d0
        L_0x016d:
            com.tencent.mm.plugin.finder.view.w$d r4 = r0.f52598h
            android.view.MotionEvent r5 = r0.f52606p
            boolean r5 = r4.onScroll(r5, r1, r2, r3)
            r0.f52610t = r11
            r0.f52611u = r12
            goto L_0x02d0
        L_0x017b:
            r0.f52601k = r5
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r18)
            boolean r3 = r0.f52609s
            if (r3 == 0) goto L_0x018d
            com.tencent.mm.plugin.finder.view.w$c r3 = r0.f52599i
            boolean r1 = r3.onDoubleTapEvent(r1)
            r1 = r1 | r5
            goto L_0x01e5
        L_0x018d:
            boolean r3 = r0.f52603m
            if (r3 == 0) goto L_0x0199
            android.os.Handler r1 = r0.f52597g
            r1.removeMessages(r6)
            r0.f52603m = r5
            goto L_0x01db
        L_0x0199:
            boolean r3 = r0.f52604n
            if (r3 == 0) goto L_0x01b0
            com.tencent.mm.plugin.finder.view.w$d r3 = r0.f52598h
            boolean r3 = r3.onSingleTapUp(r1)
            boolean r6 = r0.f52602l
            if (r6 == 0) goto L_0x01ae
            com.tencent.mm.plugin.finder.view.w$c r6 = r0.f52599i
            if (r6 == 0) goto L_0x01ae
            r6.onSingleTapConfirmed(r1)
        L_0x01ae:
            r1 = r3
            goto L_0x01e5
        L_0x01b0:
            android.view.VelocityTracker r3 = r0.f52615y
            int r6 = r1.getPointerId(r5)
            int r8 = r0.f52595e
            float r8 = (float) r8
            r3.computeCurrentVelocity(r10, r8)
            float r8 = r3.getYVelocity(r6)
            float r3 = r3.getXVelocity(r6)
            float r6 = java.lang.Math.abs(r8)
            int r9 = r0.f52594d
            float r9 = (float) r9
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x01dd
            float r6 = java.lang.Math.abs(r3)
            int r9 = r0.f52594d
            float r9 = (float) r9
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x01db
            goto L_0x01dd
        L_0x01db:
            r1 = 0
            goto L_0x01e5
        L_0x01dd:
            com.tencent.mm.plugin.finder.view.w$d r6 = r0.f52598h
            android.view.MotionEvent r9 = r0.f52606p
            boolean r1 = r6.onFling(r9, r1, r3, r8)
        L_0x01e5:
            android.view.MotionEvent r3 = r0.f52608r
            if (r3 == 0) goto L_0x01ec
            r3.recycle()
        L_0x01ec:
            r0.f52608r = r2
            android.view.VelocityTracker r2 = r0.f52615y
            if (r2 == 0) goto L_0x01f7
            r2.recycle()
            r0.f52615y = r13
        L_0x01f7:
            r0.f52609s = r5
            r0.f52602l = r5
            android.os.Handler r2 = r0.f52597g
            r2.removeMessages(r4)
            android.os.Handler r2 = r0.f52597g
            r2.removeMessages(r7)
        L_0x0205:
            r5 = r1
            goto L_0x02d0
        L_0x0208:
            com.tencent.mm.plugin.finder.view.w$c r2 = r0.f52599i
            if (r2 == 0) goto L_0x027a
            android.os.Handler r2 = r0.f52597g
            boolean r2 = r2.hasMessages(r6)
            if (r2 == 0) goto L_0x0219
            android.os.Handler r3 = r0.f52597g
            r3.removeMessages(r6)
        L_0x0219:
            android.view.MotionEvent r3 = r0.f52606p
            r8 = 300(0x12c, double:1.48E-321)
            if (r3 == 0) goto L_0x0275
            android.view.MotionEvent r10 = r0.f52608r
            if (r10 == 0) goto L_0x0275
            if (r2 == 0) goto L_0x0275
            boolean r2 = r0.f52605o
            if (r2 != 0) goto L_0x022a
            goto L_0x025f
        L_0x022a:
            long r13 = r18.getEventTime()
            long r15 = r10.getEventTime()
            long r13 = r13 - r15
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x025f
            r15 = 40
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 >= 0) goto L_0x023e
            goto L_0x025f
        L_0x023e:
            float r2 = r3.getX()
            int r2 = (int) r2
            float r10 = r18.getX()
            int r10 = (int) r10
            int r2 = r2 - r10
            float r3 = r3.getY()
            int r3 = (int) r3
            float r10 = r18.getY()
            int r10 = (int) r10
            int r3 = r3 - r10
            int r10 = r0.f52593c
            int r2 = r2 * r2
            int r3 = r3 * r3
            int r2 = r2 + r3
            if (r2 >= r10) goto L_0x025f
            r2 = 1
            goto L_0x0260
        L_0x025f:
            r2 = 0
        L_0x0260:
            if (r2 == 0) goto L_0x0275
            r0.f52609s = r4
            com.tencent.mm.plugin.finder.view.w$c r2 = r0.f52599i
            android.view.MotionEvent r3 = r0.f52606p
            boolean r2 = r2.onDoubleTap(r3)
            r2 = r2 | r5
            com.tencent.mm.plugin.finder.view.w$c r3 = r0.f52599i
            boolean r3 = r3.onDoubleTapEvent(r1)
            r2 = r2 | r3
            goto L_0x027b
        L_0x0275:
            android.os.Handler r2 = r0.f52597g
            r2.sendEmptyMessageDelayed(r6, r8)
        L_0x027a:
            r2 = 0
        L_0x027b:
            r0.f52610t = r11
            r0.f52612v = r11
            r0.f52611u = r12
            r0.f52613w = r12
            android.view.MotionEvent r3 = r0.f52606p
            if (r3 == 0) goto L_0x028a
            r3.recycle()
        L_0x028a:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r18)
            r0.f52606p = r3
            r0.f52604n = r4
            r0.f52605o = r4
            r0.f52601k = r4
            r0.f52603m = r5
            r0.f52602l = r5
            boolean r3 = r0.f52614x
            if (r3 == 0) goto L_0x02ba
            android.os.Handler r3 = r0.f52597g
            r3.removeMessages(r7)
            android.os.Handler r3 = r0.f52597g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.os.Message r5 = r3.obtainMessage(r7, r5)
            android.view.MotionEvent r6 = r0.f52606p
            long r6 = r6.getDownTime()
            int r8 = r0.f52596f
            long r8 = (long) r8
            long r6 = r6 + r8
            r3.sendMessageAtTime(r5, r6)
        L_0x02ba:
            android.os.Handler r3 = r0.f52597g
            android.view.MotionEvent r5 = r0.f52606p
            long r5 = r5.getDownTime()
            r7 = 100
            long r5 = r5 + r7
            r3.sendEmptyMessageAtTime(r4, r5)
            com.tencent.mm.plugin.finder.view.w$d r3 = r0.f52598h
            boolean r1 = r3.onDown(r1)
            r5 = r2 | r1
        L_0x02d0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C18791w.mo23720a(android.view.MotionEvent):boolean");
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.w$a */
    public class C18792a extends Handler {
        public C18792a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C18791w wVar = C18791w.this;
                wVar.f52598h.onShowPress(wVar.f52606p);
            } else if (i == 2) {
                C18791w wVar2 = C18791w.this;
                wVar2.f52597g.removeMessages(3);
                wVar2.f52602l = false;
                wVar2.f52603m = true;
                wVar2.f52598h.onLongPress(wVar2.f52606p);
            } else if (i == 3) {
                C18791w wVar3 = C18791w.this;
                C18794c cVar = wVar3.f52599i;
                if (cVar == null) {
                    return;
                }
                if (!wVar3.f52601k) {
                    cVar.onSingleTapConfirmed(wVar3.f52606p);
                } else {
                    wVar3.f52602l = true;
                }
            } else {
                throw new RuntimeException("Unknown message " + message);
            }
        }

        public C18792a(Handler handler) {
            super(handler.getLooper());
        }
    }
}
