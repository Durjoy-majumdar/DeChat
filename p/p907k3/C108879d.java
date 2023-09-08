package p907k3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import p907k3.C108861a;

/* renamed from: k3.d */
public final class C108879d extends C108867b<C108879d> {

    /* renamed from: s */
    public C108880e f326027s = null;

    /* renamed from: t */
    public float f326028t = Float.MAX_VALUE;

    public <K> C108879d(K k, C76488c<K> cVar) {
        super(k, cVar);
    }

    /* renamed from: d */
    public void mo159990d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f326019f) {
                mo159986b(true);
            }
            float f = this.f326028t;
            if (f != Float.MAX_VALUE) {
                C108880e eVar = this.f326027s;
                if (eVar == null) {
                    this.f326027s = new C108880e(f);
                } else {
                    eVar.f326037i = (double) f;
                }
                this.f326028t = Float.MAX_VALUE;
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    /* renamed from: e */
    public void mo159991e() {
        C108880e eVar = this.f326027s;
        if (eVar != null) {
            double d = (double) ((float) eVar.f326037i);
            if (d > ((double) Float.MAX_VALUE)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d >= ((double) this.f326020g)) {
                double abs = Math.abs((double) (this.f326022i * 0.75f));
                eVar.f326032d = abs;
                eVar.f326033e = abs * 62.5d;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    boolean z = this.f326019f;
                    if (!z && !z) {
                        this.f326019f = true;
                        if (!this.f326016c) {
                            this.f326015b = this.f326018e.mo91414a(this.f326017d);
                        }
                        float f = this.f326015b;
                        if (f > Float.MAX_VALUE || f < this.f326020g) {
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        ThreadLocal<C108861a> threadLocal = C108861a.f325995g;
                        if (threadLocal.get() == null) {
                            threadLocal.set(new C108861a());
                        }
                        C108861a aVar = threadLocal.get();
                        if (aVar.f325997b.size() == 0) {
                            if (aVar.f325999d == null) {
                                aVar.f325999d = new C108861a.C108865d(aVar.f325998c);
                            }
                            C108861a.C108865d dVar = (C108861a.C108865d) aVar.f325999d;
                            dVar.f326004b.postFrameCallback(dVar.f326005c);
                        }
                        if (!aVar.f325997b.contains(this)) {
                            aVar.f325997b.add(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public <K> C108879d(K k, C76488c<K> cVar, float f) {
        super(k, cVar);
        this.f326027s = new C108880e(f);
    }
}
