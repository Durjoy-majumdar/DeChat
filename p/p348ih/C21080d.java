package p348ih;

import com.tencent.p014mm.audio.mix.decode.IDecodeCallback;
import com.tencent.p014mm.audio.mix.jni.AudioFFmpegDecodeJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import p213oh.C11412b;
import p335eh.C116768d;
import p346hh.C117085f;
import p346hh.C20941j;
import p356lh.C21428d;
import p366nh.C21632c;

/* renamed from: ih.d */
public class C21080d extends C21079c {

    /* renamed from: ih.d$a */
    public class C21081a implements IDecodeCallback {
        public C21081a(C21080d dVar) {
        }
    }

    public C21080d(C21428d dVar, C21632c cVar) {
        super(dVar, cVar);
    }

    /* renamed from: d */
    public void mo32835d() {
        C20941j jVar = this.f59603e;
        if (jVar != null) {
            jVar.release();
            this.f59603e = null;
        }
    }

    /* renamed from: k */
    public void mo32817k() {
        C116768d e = mo32810e();
        e.mo180742h();
        this.f59603e = new C117085f(e, 44100, 2, 2, this.f59604f);
        if (AudioFFmpegDecodeJni.decode(44100, 2, 2, this.f59604f, new C21081a(this)) != 0) {
            int i = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioDecoderFFmpeg", "decode fail", (Object[]) null);
            return;
        }
        this.f59603e.mo32680b();
        e.mo180735a();
        if (mo32814h()) {
            int i2 = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioDecoderFFmpeg", "flushCache", (Object[]) null);
            this.f59603e.mo32680b();
        } else if (mo32812g()) {
            int i3 = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioDecoderFFmpeg", "flushCache and readCacheAndPlay", (Object[]) null);
            this.f59603e.mo32680b();
            mo32828t();
        } else {
            int i4 = C11412b.f33577a;
            Log.m105925i("MicroMsg.Mix.AudioDecoderFFmpeg", "writeCacheAndPlay", (Object[]) null);
            mo32834z(e);
        }
    }
}
