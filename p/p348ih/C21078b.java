package p348ih;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea2.C20561h;
import fa2.C20705c;
import java.util.ArrayList;
import nb0.C88912b;
import p213oh.C11412b;
import p335eh.C116768d;
import p339fh.C116869j;
import p348ih.C21076a;
import p354kh.C21333a;
import p356lh.C21435i;

/* renamed from: ih.b */
public class C21078b extends C21088l {

    /* renamed from: g */
    public C21089m f59596g;

    /* renamed from: h */
    public boolean f59597h = false;

    /* renamed from: i */
    public C21090n f59598i;

    public C21078b(C21089m mVar, String str, int i) {
        super(str, i);
        this.f59596g = mVar;
    }

    /* renamed from: a */
    public void mo32806a() {
        this.f59597h = false;
    }

    public void run() {
        boolean z;
        Object[] objArr = {this.f59643d};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDecodeTask", "run task %s", objArr);
        if (!this.f59597h) {
            Process.setThreadPriority(-16);
            C21089m mVar = this.f59596g;
            C21090n nVar = this.f59598i;
            C21076a.C21077a aVar = (C21076a.C21077a) mVar;
            aVar.getClass();
            if (nVar == null) {
                Log.m105921e("MicroMsg.Mix.AudioDecodeMgr", "process decoder is null", (Object[]) null);
            } else {
                C21079c cVar = (C21079c) nVar;
                C88912b f = cVar.mo32811f();
                if (cVar.f59599a.f60650l != null) {
                    C21435i iVar = cVar.f59599a.f60650l;
                    int i2 = cVar.mo32811f().f256424i;
                    C20705c cVar2 = C20561h.this.f57887t;
                    if (cVar2 != null) {
                        cVar2.mo32419o0(i2);
                    }
                }
                cVar.f59604f = cVar.mo32811f().f256418c;
                if (TextUtils.isEmpty(cVar.f59604f)) {
                    Log.m105921e("MicroMsg.Mix.AudioDecoderBase", "source path is null", (Object[]) null);
                    cVar.mo32818l(712);
                } else {
                    C88912b f2 = cVar.mo32811f();
                    Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "decode sourcePath :%s, loop:%b", cVar.f59604f, Boolean.valueOf(f2.f256423h));
                    if (cVar.f59606h.get()) {
                        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "do preload audio", (Object[]) null);
                        if (f2.f256414A) {
                            Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "preload begin", (Object[]) null);
                            if (!C116869j.m164845a().mo180855d(cVar.f59604f)) {
                                cVar.mo32817k();
                            } else {
                                Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "audio is loaded complete!", (Object[]) null);
                            }
                            Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "preload end", (Object[]) null);
                            cVar.mo32821o(15);
                        } else {
                            if (!(cVar.f59607i.get() == 4)) {
                                cVar.mo32821o(3);
                            }
                            if (!C116869j.m164845a().mo180855d(cVar.f59604f)) {
                                cVar.mo32817k();
                            } else {
                                Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "audio is loaded complete!", (Object[]) null);
                            }
                            Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "preload audio end", (Object[]) null);
                            cVar.f59606h.set(false);
                            C116768d e = cVar.mo32810e();
                            if (cVar.mo32814h()) {
                                Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "stopped, not to play", (Object[]) null);
                                if (e.f350073b) {
                                    cVar.mo32821o(2);
                                }
                            } else {
                                if (cVar.f59607i.get() == 9) {
                                    Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "occurs error, not to play", (Object[]) null);
                                } else {
                                    if ((cVar.f59607i.get() == 4) || f2.f256422g) {
                                        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "to play", (Object[]) null);
                                        cVar.mo32821o(2);
                                    } else {
                                        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "not to play", (Object[]) null);
                                        cVar.mo32821o(2);
                                    }
                                }
                            }
                        }
                    }
                    cVar.mo32821o(4);
                    do {
                        if (!C116869j.m164845a().mo180855d(cVar.f59604f)) {
                            cVar.mo32817k();
                        } else {
                            cVar.mo32828t();
                        }
                        z = f2.f256423h && !cVar.mo32814h();
                        if (z) {
                            Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "loop again for audioId:%s", cVar.mo32809c());
                            try {
                                Thread.sleep(20);
                            } catch (Exception unused) {
                                Log.m105921e("MicroMsg.Mix.AudioDecoderBase", "sleep exception", (Object[]) null);
                            }
                            cVar.f59615q = 0;
                            continue;
                        }
                    } while (z);
                    if (!cVar.mo32814h()) {
                        if (!(cVar.f59607i.get() == 9)) {
                            if (!cVar.f59599a.f60647i.mo33367c(cVar.mo32809c())) {
                                Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "not mix end, not set to play complete!", (Object[]) null);
                                C21333a aVar2 = cVar.f59599a.f60647i;
                                String c = cVar.mo32809c();
                                synchronized (aVar2.f60307n) {
                                    aVar2.f60309p.put(c, Boolean.TRUE);
                                }
                            } else {
                                cVar.mo32821o(7);
                                cVar.f59599a.f60647i.mo33374j(cVar.mo32809c());
                            }
                            Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "task end", (Object[]) null);
                        }
                    }
                    Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "is stop or error, not set to play complete!", (Object[]) null);
                    if (cVar.f59600b.equals(cVar.mo32811f().f256418c)) {
                        cVar.f59599a.f60647i.mo33374j(cVar.mo32809c());
                        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "removeAudio", (Object[]) null);
                    } else {
                        Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "change src only, don't removeAudio", (Object[]) null);
                    }
                    Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "task end", (Object[]) null);
                }
                cVar.mo32810e();
                int i3 = C11412b.f33577a;
                Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "release", (Object[]) null);
                Log.m105925i("MicroMsg.Mix.AudioDecoderBase", "duration:%d", Long.valueOf(cVar.mo32810e().f350075d));
                cVar.mo32820n();
                cVar.mo32835d();
                if (cVar.f59600b != null) {
                    cVar.f59600b.mo32136a().f256419d = 0;
                    cVar.f59600b.disconnect();
                }
                cVar.f59606h.set(false);
                cVar.f59609k.set(true);
                cVar.f59608j.set(false);
                cVar.f59610l.set(false);
                cVar.f59599a = null;
                synchronized (C21076a.this.f59594f) {
                    if (f != null) {
                        if (((ArrayList) C21076a.this.f59592d).contains(f.f256418c)) {
                            ((ArrayList) C21076a.this.f59592d).remove(f.f256418c);
                        }
                    }
                }
            }
            ((C21076a.C21077a) this.f59596g).getClass();
            Log.m105925i("MicroMsg.Mix.AudioDecodeMgr", "decode process end", (Object[]) null);
            C21087k.m23343c(this);
            this.f59597h = true;
            Log.m105925i("MicroMsg.Mix.AudioDecodeTask", "run task %s end", this.f59643d);
        }
    }
}
