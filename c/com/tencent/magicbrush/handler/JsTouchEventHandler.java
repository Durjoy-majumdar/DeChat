package com.tencent.magicbrush.handler;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import p416qd.C89598h;

public class JsTouchEventHandler {

    /* renamed from: a */
    public IntBuffer f235108a;

    /* renamed from: b */
    public FloatBuffer f235109b;

    /* renamed from: c */
    public C80309c f235110c = new C80309c(this);

    /* renamed from: com.tencent.magicbrush.handler.JsTouchEventHandler$a */
    public interface C80307a {
    }

    /* renamed from: com.tencent.magicbrush.handler.JsTouchEventHandler$b */
    public static class C80308b {

        /* renamed from: a */
        public int f235111a;

        /* renamed from: b */
        public float f235112b;

        /* renamed from: c */
        public float f235113c;

        public C80308b(int i, float f, float f2) {
            this.f235111a = i;
            this.f235112b = f;
            this.f235113c = f2;
        }
    }

    /* renamed from: com.tencent.magicbrush.handler.JsTouchEventHandler$c */
    public static class C80309c implements C80307a {

        /* renamed from: a */
        public WeakReference<JsTouchEventHandler> f235114a;

        public C80309c(JsTouchEventHandler jsTouchEventHandler) {
            this.f235114a = new WeakReference<>(jsTouchEventHandler);
        }
    }

    public JsTouchEventHandler() {
        mo111606b(10);
    }

    private native long nativeCreateTouchEvent(int i, int i2, int i3, IntBuffer intBuffer, FloatBuffer floatBuffer, long j);

    /* access modifiers changed from: private */
    public native void nativeFreeTouchEvent(long j);

    /* renamed from: b */
    public final void mo111606b(int i) {
        int i2;
        IntBuffer intBuffer = this.f235108a;
        if (intBuffer == null || intBuffer.capacity() < i) {
            IntBuffer intBuffer2 = this.f235108a;
            if (intBuffer2 != null) {
                i2 = intBuffer2.capacity();
                while (i2 < i) {
                    i2 *= 2;
                }
            } else {
                i2 = i;
            }
            Object[] objArr = new Object[3];
            IntBuffer intBuffer3 = this.f235108a;
            objArr[0] = Integer.valueOf(intBuffer3 == null ? 0 : intBuffer3.capacity());
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            C89598h.m112045b("MicroMsg.JsTouchEventHandler", "Should Create A New Buffer, Current = [%d], Request = [%d], ShouldBe = [%d]", objArr);
            this.f235108a = ByteBuffer.allocateDirect(i2 * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
            this.f235109b = ByteBuffer.allocateDirect(i2 * 2 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            return;
        }
        this.f235108a.clear();
        this.f235109b.clear();
    }

    /* renamed from: c */
    public long mo111607c(int i, int i2, long j, List<C80308b> list, float f) {
        mo111606b(list.size());
        int e = mo111609e(i);
        if (e == -1) {
            return 0;
        }
        for (C80308b next : list) {
            this.f235108a.put(next.f235111a);
            this.f235109b.put(next.f235112b / f);
            this.f235109b.put(next.f235113c / f);
        }
        return nativeCreateTouchEvent(e, e == 1 ? -1 : i2, list.size(), this.f235108a, this.f235109b, j);
    }

    /* renamed from: d */
    public long mo111608d(MotionEvent motionEvent, float f, boolean z) {
        mo111606b(motionEvent.getPointerCount());
        int e = mo111609e(motionEvent.getActionMasked());
        if (e == -1) {
            return 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.f235108a.put(motionEvent.getPointerId(i));
            if (z) {
                this.f235109b.put((i == 0 ? motionEvent.getRawX() : motionEvent.getX(i) + (motionEvent.getRawX() - motionEvent.getX())) / f);
                this.f235109b.put((i == 0 ? motionEvent.getRawY() : motionEvent.getY(i) + (motionEvent.getRawY() - motionEvent.getY())) / f);
            } else {
                this.f235109b.put(motionEvent.getX(i) / f);
                this.f235109b.put(motionEvent.getY(i) / f);
            }
            i++;
        }
        return nativeCreateTouchEvent(mo111609e(motionEvent.getActionMasked()), e == 1 ? -1 : motionEvent.getActionIndex(), pointerCount, this.f235108a, this.f235109b, motionEvent.getEventTime());
    }

    /* renamed from: e */
    public final int mo111609e(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 5) {
                        return 0;
                    }
                    if (i != 6) {
                        return -1;
                    }
                }
            }
            return i2;
        }
        return 2;
    }
}
