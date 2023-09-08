package y13;

import android.media.MediaCodec;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: y13.b */
public final class C112371b {

    /* renamed from: a */
    public final int f336440a;

    /* renamed from: b */
    public int f336441b;

    /* renamed from: c */
    public final C112372a[] f336442c;

    /* renamed from: d */
    public final ReentrantLock f336443d;

    /* renamed from: e */
    public final Condition f336444e;

    /* renamed from: f */
    public final Condition f336445f;

    /* renamed from: g */
    public int f336446g;

    /* renamed from: h */
    public int f336447h;

    /* renamed from: i */
    public int f336448i;

    /* renamed from: j */
    public int f336449j;

    /* renamed from: y13.b$a */
    public static final class C112372a {

        /* renamed from: a */
        public final MediaCodec.BufferInfo f336450a;

        /* renamed from: b */
        public final ByteBuffer f336451b;

        public C112372a(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
            C87412m.m108594g(bufferInfo, "bufferInfo");
            C87412m.m108594g(byteBuffer, "buffer");
            this.f336450a = bufferInfo;
            this.f336451b = byteBuffer;
        }
    }

    public C112371b(int i, int i2, String str) {
        C87412m.m108594g(str, "tag");
        this.f336440a = i;
        this.f336441b = i2;
        C112372a[] aVarArr = new C112372a[i];
        for (int i3 = 0; i3 < i; i3++) {
            aVarArr[i3] = null;
        }
        this.f336442c = aVarArr;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f336443d = reentrantLock;
        this.f336444e = reentrantLock.newCondition();
        this.f336445f = reentrantLock.newCondition();
        if (this.f336440a == 0) {
            throw new IllegalArgumentException("Invalid count " + this.f336440a);
        }
    }

    /* renamed from: a */
    public final int mo164089a(long j) {
        int i;
        this.f336443d.lock();
        try {
            if (this.f336447h != this.f336448i || j <= 0 || this.f336444e.await(j, TimeUnit.MICROSECONDS)) {
                int i2 = this.f336448i;
                this.f336448i = i2 + 1;
                i = i2 % this.f336440a;
            } else {
                i = -1;
            }
            return i;
        } finally {
            this.f336443d.unlock();
        }
    }

    /* renamed from: b */
    public final int mo164090b(long j) {
        int i;
        this.f336443d.lock();
        try {
            if (this.f336446g - this.f336449j < this.f336440a || j <= 0 || this.f336445f.await(j, TimeUnit.MICROSECONDS)) {
                int i2 = this.f336446g;
                this.f336446g = i2 + 1;
                i = i2 % this.f336440a;
            } else {
                i = -1;
            }
            return i;
        } finally {
            this.f336443d.unlock();
        }
    }

    /* renamed from: c */
    public final C112372a mo164091c(int i) {
        this.f336443d.lock();
        try {
            C112372a aVar = this.f336442c[i];
            if (aVar == null) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                ByteBuffer order = ByteBuffer.allocateDirect(this.f336441b).order(ByteOrder.nativeOrder());
                C87412m.m108593f(order, "allocateDirect(bufferSiz…(ByteOrder.nativeOrder())");
                aVar = new C112372a(bufferInfo, order);
                this.f336442c[i] = aVar;
            }
            return aVar;
        } finally {
            this.f336443d.unlock();
        }
    }

    /* renamed from: d */
    public final void mo164092d() {
        this.f336443d.lock();
        try {
            this.f336449j++;
            this.f336445f.signalAll();
        } finally {
            this.f336443d.unlock();
        }
    }

    /* renamed from: e */
    public final void mo164093e() {
        this.f336443d.lock();
        try {
            this.f336447h++;
            this.f336444e.signalAll();
        } finally {
            this.f336443d.unlock();
        }
    }

    public String toString() {
        return '[' + this.f336449j + ", " + this.f336448i + "; " + this.f336447h + ", " + this.f336446g + "] " + (this.f336446g - this.f336449j);
    }
}
