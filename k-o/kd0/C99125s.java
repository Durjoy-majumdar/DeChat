package kd0;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.autogen.events.SceneVoiceRcdDataEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Arrays;
import ob0.C77002r;
import p156gj.C107835h0;
import p375qh.C101193k;
import p375qh.C110390f;
import p492dn.C97501r;
import p827uh.C52575d;

/* renamed from: kd0.s */
public class C99125s implements C97501r {

    /* renamed from: h */
    public static int f290641h = 100;

    /* renamed from: a */
    public String f290642a = null;

    /* renamed from: b */
    public int f290643b = 0;

    /* renamed from: c */
    public int f290644c = 0;

    /* renamed from: d */
    public C110390f f290645d;

    /* renamed from: e */
    public C52575d f290646e;

    /* renamed from: f */
    public Object f290647f = new Object();

    /* renamed from: g */
    public C110390f.C89659b f290648g = new C99126a();

    /* renamed from: kd0.s$a */
    public class C99126a implements C110390f.C89659b {
        public C99126a() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            C52575d dVar = C99125s.this.f290646e;
            if (dVar != null) {
                dVar.mo73538b(new C101193k.C101194a(bArr, i), 0);
            }
            C99125s sVar = C99125s.this;
            sVar.getClass();
            for (int i2 = 0; i2 < i / 2; i2++) {
                int i3 = i2 * 2;
                short s = (short) ((bArr[i3 + 1] << 8) | (bArr[i3] & ExifInterface.MARKER));
                if (s > sVar.f290643b) {
                    sVar.f290643b = s;
                }
            }
            Log.m105919d("MicroMsg.SpeexRecorder", "publish SceneVoiceRcdDataEvent, buf.len %d, len: %d.", Integer.valueOf(bArr.length), Integer.valueOf(i));
            SceneVoiceRcdDataEvent sceneVoiceRcdDataEvent = new SceneVoiceRcdDataEvent();
            sceneVoiceRcdDataEvent.f265096d.f265097a = Arrays.copyOf(bArr, bArr.length);
            sceneVoiceRcdDataEvent.f265096d.f265098b = i;
            sceneVoiceRcdDataEvent.publish();
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
        }
    }

    /* renamed from: a */
    public int mo107469a() {
        return this.f290645d.f330216C;
    }

    /* renamed from: b */
    public final void mo138499b() {
        synchronized (this.f290647f) {
            C110390f fVar = this.f290645d;
            if (fVar != null) {
                fVar.mo161907l();
                this.f290645d = null;
            }
            C52575d dVar = this.f290646e;
            if (dVar != null) {
                dVar.mo73541e();
                this.f290646e = null;
            }
        }
    }

    /* renamed from: c */
    public void mo107470c(C77002r.C77003a aVar) {
    }

    /* renamed from: d */
    public int mo107471d() {
        int i = this.f290643b;
        this.f290643b = 0;
        if (i > f290641h) {
            f290641h = i;
        }
        return (i * 100) / f290641h;
    }

    public int getStatus() {
        return this.f290644c;
    }

    public boolean startRecord(String str) {
        if (!Util.isNullOrNil(this.f290642a)) {
            Log.m105920e("MicroMsg.SpeexRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
            return false;
        }
        Log.m105925i("MicroMsg.SpeexRecorder", "[startRecord] fileName:%s", str);
        this.f290644c = 1;
        this.f290643b = 0;
        synchronized (this.f290647f) {
            C110390f fVar = new C110390f(16000, 1, 0);
            this.f290645d = fVar;
            fVar.f330234m = -19;
            int i = C107835h0.f322856m.f322906m;
            if (i > 0) {
                fVar.mo161903h(i, true);
            } else {
                fVar.mo161903h(5, false);
            }
            this.f290645d.mo161904i(false);
            this.f290645d.f330245x = this.f290648g;
            C52575d dVar = new C52575d();
            this.f290646e = dVar;
            if (!dVar.mo73537a(str)) {
                Log.m105920e("MicroMsg.SpeexRecorder", "init speex writer failed");
                mo138499b();
                this.f290644c = -1;
                return false;
            } else if (!this.f290645d.mo161906k()) {
                Log.m105920e("MicroMsg.SpeexRecorder", "start record failed");
                mo138499b();
                this.f290644c = -1;
                return false;
            } else {
                this.f290642a = str;
                return true;
            }
        }
    }

    public boolean stopRecord() {
        this.f290642a = null;
        this.f290644c = 0;
        mo138499b();
        return true;
    }
}
