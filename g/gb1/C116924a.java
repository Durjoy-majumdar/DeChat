package gb1;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import gb1.C116934e;
import java.util.ArrayList;
import java.util.Iterator;
import nd0.C117623b;
import p156gj.C107835h0;
import p206nj.C88956h;
import p375qh.C101193k;
import p375qh.C110390f;
import p375qh.C89658b;
import p827uh.C102032a;
import p827uh.C52575d;

/* renamed from: gb1.a */
public class C116924a {

    /* renamed from: l */
    public static final String f350360l = (C85191v.m105070i() + "/" + "fdv_v_");

    /* renamed from: a */
    public C116928e f350361a = null;

    /* renamed from: b */
    public boolean f350362b = false;

    /* renamed from: c */
    public String f350363c = "";

    /* renamed from: d */
    public C110390f f350364d;

    /* renamed from: e */
    public C102032a f350365e;

    /* renamed from: f */
    public C117623b f350366f;

    /* renamed from: g */
    public final ArrayList<C89658b> f350367g = new ArrayList<>(5);

    /* renamed from: h */
    public int f350368h = 0;

    /* renamed from: i */
    public C110390f.C89659b f350369i = new C107792a();

    /* renamed from: j */
    public C110390f.C89659b f350370j = new C116925b();

    /* renamed from: k */
    public C117623b.C117625b f350371k = new C116926c();

    /* renamed from: gb1.a$a */
    public class C107792a implements C110390f.C89659b {
        public C107792a() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            synchronized (C116924a.this.f350367g) {
                Iterator<C89658b> it = C116924a.this.f350367g.iterator();
                while (it.hasNext()) {
                    C89658b next = it.next();
                    if (next != null) {
                        next.mo35508a(bArr, i);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
            synchronized (C116924a.this.f350367g) {
                Iterator<C89658b> it = C116924a.this.f350367g.iterator();
                while (it.hasNext()) {
                    C89658b next = it.next();
                    if (next != null) {
                        next.mo35509b(i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: gb1.a$b */
    public class C116925b implements C110390f.C89659b {

        /* renamed from: a */
        public short[] f350372a;

        public C116925b() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            int i2;
            C116928e eVar;
            Log.m105919d("MicroMsg.FaceVoiceRecordLogic", "OnRecPcmDataReady len: %d", Integer.valueOf(i));
            short[] sArr = this.f350372a;
            if (sArr == null || sArr.length < i / 2) {
                this.f350372a = new short[(i / 2)];
            }
            int i3 = 0;
            while (true) {
                i2 = i / 2;
                if (i3 >= i2) {
                    break;
                }
                int i4 = i3 * 2;
                this.f350372a[i3] = (short) ((bArr[i4 + 1] << 8) | (bArr[i4] & ExifInterface.MARKER));
                i3++;
            }
            C116924a aVar = C116924a.this;
            short[] sArr2 = this.f350372a;
            aVar.getClass();
            for (int i5 = 0; i5 < i2; i5++) {
                short s = sArr2[i5];
                if (s > aVar.f350368h) {
                    aVar.f350368h = s;
                }
            }
            C116924a aVar2 = C116924a.this;
            C117623b bVar = aVar2.f350366f;
            if (bVar != null) {
                bVar.mo182348b(this.f350372a, i2);
                C102032a aVar3 = C116924a.this.f350365e;
                if (-1 == (aVar3 != null ? aVar3.mo73538b(new C101193k.C101194a(bArr, i), 0) : -1) && (eVar = C116924a.this.f350361a) != null) {
                    ((C116934e.C116941f) eVar).mo180927a(3);
                    C116924a.this.mo180900b();
                    Log.m105920e("MicroMsg.FaceVoiceRecordLogic", "write to file failed");
                    return;
                }
                return;
            }
            C116928e eVar2 = aVar2.f350361a;
            if (eVar2 != null) {
                ((C116934e.C116941f) eVar2).mo180927a(1);
                C116924a.this.mo180900b();
            }
            Log.m105920e("MicroMsg.FaceVoiceRecordLogic", "mVoiceSilentDetectAPI is null");
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
            Log.m105920e("MicroMsg.FaceVoiceRecordLogic", "onRecError state = " + i + " detailState = " + i2);
            C116924a.this.mo180900b();
            C116928e eVar = C116924a.this.f350361a;
            if (eVar != null) {
                ((C116934e.C116941f) eVar).mo180927a(2);
            }
        }
    }

    /* renamed from: gb1.a$c */
    public class C116926c implements C117623b.C117625b {
        public C116926c() {
        }

        /* renamed from: a */
        public void mo127259a() {
            Log.m105918d("MicroMsg.FaceVoiceRecordLogic", "Silent enough to finish");
            C116928e eVar = C116924a.this.f350361a;
            if (eVar != null) {
                ((C116934e.C116941f) eVar).mo180927a(11);
            }
        }

        /* renamed from: b */
        public void mo127260b(short[] sArr, int i) {
            Log.m105919d("MicroMsg.FaceVoiceRecordLogic", "onFilteredSpeakVoice data %s size %d", sArr, Integer.valueOf(i));
        }

        /* renamed from: c */
        public void mo127261c(long j) {
            Log.m105918d("MicroMsg.FaceVoiceRecordLogic", "hy: onSpeakToSilent");
        }

        /* renamed from: d */
        public void mo127262d(long j) {
            Log.m105918d("MicroMsg.FaceVoiceRecordLogic", "hy: onSilentToSpeak");
            C116928e eVar = C116924a.this.f350361a;
            if (eVar != null) {
                C116934e.C116941f fVar = (C116934e.C116941f) eVar;
                synchronized (C116934e.this.f350412r) {
                    Log.m105924i("MicroMsg.NumberFaceMotion", "hy: triggered read symbol");
                    C116934e eVar2 = C116934e.this;
                    if (!eVar2.f350406l && eVar2.f350407m) {
                        eVar2.f350406l = true;
                        C116934e.m164974k(eVar2);
                    }
                }
            }
        }
    }

    /* renamed from: gb1.a$d */
    public class C116927d implements Runnable {

        /* renamed from: d */
        public Runnable f350375d;

        public C116927d(Runnable runnable, C107792a aVar) {
            this.f350375d = runnable;
        }

        /* renamed from: a */
        public void mo180902a() {
            Log.m105924i("MicroMsg.FaceVoiceRecordLogic", "hy: initDeviceInLock");
            C116924a aVar = C116924a.this;
            aVar.f350363c = C116924a.f350360l + Util.currentTicks() + ".spx";
            Log.m105925i("MicroMsg.FaceVoiceRecordLogic", "generateVoiceFilePath: %s", C116924a.this.f350363c);
            try {
                C86013q1.m106447h(C116924a.this.f350363c);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FaceVoiceRecordLogic", e, "hy: delete file failed", new Object[0]);
            }
            C116924a.this.f350364d = new C110390f(16000, 1, 3);
            C110390f fVar = C116924a.this.f350364d;
            fVar.f330234m = -19;
            fVar.mo161904i(false);
            C116924a.this.f350365e = new C52575d();
            C116924a aVar2 = C116924a.this;
            if (!aVar2.f350365e.mo73537a(aVar2.f350363c)) {
                Log.m105920e("MicroMsg.FaceVoiceRecordLogic", "hy: init speex writer failed");
                C116924a.this.f350365e.mo73541e();
                C116924a aVar3 = C116924a.this;
                aVar3.f350365e = null;
                C116928e eVar = aVar3.f350361a;
                if (eVar != null) {
                    ((C116934e.C116941f) eVar).mo180927a(5);
                    return;
                }
                return;
            }
            int i = C107835h0.f322856m.f322906m;
            if (i > 0) {
                C116924a.this.f350364d.mo161903h(i, true);
            } else {
                C116924a.this.f350364d.mo161903h(5, false);
            }
            C116924a.this.f350364d.mo161902g(50);
            C116924a.this.f350364d.mo161905j(false);
            try {
                C116924a.this.f350366f = new C117623b(5000, 16000, C117623b.f351854n.getInt("sil_time", 200), C117623b.f351854n.getFloat("s_n_ration", 2.5f), C117623b.f351854n.getInt("s_window", 50), C117623b.f351854n.getInt("s_length", 35), C117623b.f351854n.getInt("s_delay_time", 20), 4000, false, false);
                C116924a aVar4 = C116924a.this;
                aVar4.f350366f.f351866l = aVar4.f350371k;
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.FaceVoiceRecordLogic", "hy: init VoiceDetectAPI failed :" + th.getMessage());
                C116928e eVar2 = C116924a.this.f350361a;
                if (eVar2 != null) {
                    ((C116934e.C116941f) eVar2).mo180927a(6);
                }
            }
            C116924a aVar5 = C116924a.this;
            aVar5.f350364d.f330245x = aVar5.f350369i;
            aVar5.mo180899a(aVar5.f350370j);
            if (!C116924a.this.f350364d.mo161906k()) {
                Log.m105920e("MicroMsg.FaceVoiceRecordLogic", "hy: start record failed");
                C116928e eVar3 = C116924a.this.f350361a;
                if (eVar3 != null) {
                    ((C116934e.C116941f) eVar3).mo180927a(7);
                    return;
                }
                return;
            }
            Runnable runnable = this.f350375d;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void run() {
            synchronized (C116924a.this) {
                if (!C116924a.this.f350362b) {
                    mo180902a();
                } else {
                    Log.m105928w("MicroMsg.FaceVoiceRecordLogic", "hy: already called stop. should not start record");
                }
            }
        }
    }

    /* renamed from: gb1.a$e */
    public interface C116928e {
    }

    static {
        C88956h.m111061b().getAbsolutePath();
    }

    /* renamed from: a */
    public void mo180899a(C89658b bVar) {
        synchronized (this.f350367g) {
            this.f350367g.add(bVar);
        }
    }

    /* renamed from: b */
    public void mo180900b() {
        C86013q1.m106447h(this.f350363c);
    }

    /* renamed from: c */
    public void mo180901c() {
        this.f350362b = true;
        Log.m105924i("MicroMsg.FaceVoiceRecordLogic", "hy: face start reset");
        synchronized (this) {
            C110390f fVar = this.f350364d;
            if (fVar != null) {
                fVar.mo161907l();
                this.f350364d = null;
            }
            C102032a aVar = this.f350365e;
            if (aVar != null) {
                aVar.mo73541e();
                this.f350365e = null;
            }
            C117623b bVar = this.f350366f;
            if (bVar != null) {
                try {
                    bVar.mo182350d();
                    this.f350366f = null;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FaceVoiceRecordLogic", e, "mVoiceSilentDetectAPI.release error", new Object[0]);
                }
            }
        }
    }
}
