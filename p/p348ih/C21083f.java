package p348ih;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import p213oh.C11412b;
import p335eh.C107275e;
import p335eh.C116768d;
import p339fh.C116867h;
import p346hh.C20941j;
import p356lh.C21428d;
import p362mh.C21502a;
import p362mh.C21503b;
import p362mh.C21504c;
import p366nh.C21632c;

/* renamed from: ih.f */
public class C21083f extends C21082e {

    /* renamed from: J */
    public C21502a f59634J;

    /* renamed from: K */
    public Object f59635K = new Object();

    public C21083f(C21428d dVar, C21632c cVar) {
        super(dVar, cVar);
    }

    /* renamed from: B */
    public void mo32837B(C116768d dVar) {
        C20941j jVar = this.f59603e;
        if (jVar != null) {
            jVar.mo32681c();
        }
        mo32836A(dVar);
        dVar.mo180735a();
    }

    /* renamed from: C */
    public void mo32838C(C116768d dVar, ByteBuffer byteBuffer, int i) {
        mo32839D(dVar, byteBuffer, i);
    }

    /* renamed from: a */
    public void mo32807a(float f, float f2) {
        synchronized (this.f59635K) {
            C21502a aVar = this.f59634J;
            if (aVar != null) {
                aVar.mo33710i(f, f2);
            }
        }
    }

    /* renamed from: b */
    public void mo32808b() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "pauseOnBackground", (Object[]) null);
        mo32821o(5);
        this.f59609k.set(true);
        this.f59611m.set(false);
        mo32816j();
    }

    /* renamed from: d */
    public void mo32835d() {
        super.mo32835d();
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "releasePlayComponent", (Object[]) null);
        synchronized (this.f59635K) {
            C21502a aVar = this.f59634J;
            if (aVar != null) {
                aVar.mo33706e();
                aVar.f60886i = null;
                aVar.f60885h = null;
                aVar.f60879b = null;
                aVar.f60880c = 0;
                aVar.f60881d = 0;
                this.f59634J = null;
            }
        }
    }

    public long getCurrentPosition() {
        synchronized (this.f59635K) {
            C21502a aVar = this.f59634J;
            if (aVar == null) {
                return -1;
            }
            long a = aVar.mo33702a();
            return a;
        }
    }

    /* renamed from: n */
    public void mo32820n() {
    }

    public void pause() {
        super.pause();
        synchronized (this.f59635K) {
            C21502a aVar = this.f59634J;
            if (aVar != null) {
                aVar.mo33703b();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0028  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32824q() {
        /*
            r4 = this;
            int r0 = p213oh.C11412b.f33577a
            java.lang.String r0 = "MicroMsg.Mix.AudioDecoderMediaCodecPlay"
            java.lang.String r1 = "playAfter"
            r2 = 0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            mh.a r1 = r4.f59634J
            if (r1 == 0) goto L_0x0046
            r1.mo33705d()
            mh.a r1 = r4.f59634J
            boolean r1 = r1 instanceof p362mh.C21503b
            if (r1 == 0) goto L_0x0046
        L_0x0017:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f59608j
            boolean r1 = r1.get()
            r4.mo32832x()
            java.util.concurrent.atomic.AtomicBoolean r3 = r4.f59609k
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x0046
            if (r1 == 0) goto L_0x0036
            int r1 = p213oh.C11412b.f33577a
            java.lang.String r1 = "need resume if not stop"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            mh.a r1 = r4.f59634J
            r1.mo33708g()
        L_0x0036:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f59609k
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f59608j
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x0017
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p348ih.C21083f.mo32824q():void");
    }

    /* renamed from: r */
    public void mo32825r() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecoderMediaCodecPlay", "playBefore", (Object[]) null);
        synchronized (this.f59635K) {
            C21502a aVar = this.f59634J;
            if (aVar != null) {
                aVar.mo33707f();
            }
        }
    }

    /* renamed from: s */
    public void mo32826s(C107275e eVar) {
        if (mo32810e().f350076e) {
            this.f59613o = 44100;
            this.f59614p = 2;
        } else {
            this.f59613o = eVar.f320939b;
            this.f59614p = eVar.f320940c;
        }
        byte[] bArr = eVar.f320943f;
        if (!this.f59606h.get()) {
            if (this.f59634J == null) {
                C116768d e = mo32810e();
                if (!e.f350073b || e.f350075d > 2000) {
                    this.f59634J = new C21504c(this.f59613o, this.f59614p, e, this);
                } else {
                    this.f59634J = new C21503b(this.f59613o, this.f59614p, e, this);
                }
                this.f59634J.f60884g = this.f59601c.f256428m;
                this.f59634J.mo33710i((float) this.f59601c.f256427l, (float) this.f59601c.f256427l);
            }
            C21502a aVar = this.f59634J;
            if (aVar != null) {
                aVar.mo33704c(bArr);
            }
        }
        if (eVar.f320944g) {
            C116867h.m164840a().mo180851c(eVar);
        }
    }

    public void seek(int i) {
        super.seek(i);
        synchronized (this.f59635K) {
            C21502a aVar = this.f59634J;
            if (aVar != null) {
                Object[] objArr = {Integer.valueOf(aVar.f60887j)};
                int i2 = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioPcmBasePlayComponent", "seek startPos:%d", objArr);
                aVar.f60887j = i;
            }
        }
    }
}
