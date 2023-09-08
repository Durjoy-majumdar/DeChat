package md0;

import android.net.Uri;
import android.os.Message;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.util.GmsVersion;
import com.tencent.p014mm.modelvoiceaddr.p878ui.C114759a;
import com.tencent.p014mm.modelvoiceaddr.p878ui.C114760b;
import com.tencent.p014mm.modelvoiceaddr.p878ui.VoiceSearchLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.qqpinyin.voicerecoapi.C116361c;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import od0.C117748a;
import p156gj.C107835h0;
import p375qh.C101193k;
import p375qh.C110390f;
import p492dn.C45427v;
import p827uh.C102032a;
import p827uh.C52575d;

/* renamed from: md0.e */
public class C117546e implements C11385n {

    /* renamed from: t */
    public static final String f351673t = (C72994y1.f212832a + "tmp_voiceaddr.spx");

    /* renamed from: u */
    public static final String f351674u = (C72994y1.f212832a + "tmp_voiceaddr.amr");

    /* renamed from: v */
    public static int f351675v = 100;

    /* renamed from: d */
    public int f351676d = 1;

    /* renamed from: e */
    public int f351677e = 0;

    /* renamed from: f */
    public int f351678f = 0;

    /* renamed from: g */
    public boolean f351679g = false;

    /* renamed from: h */
    public int f351680h;

    /* renamed from: i */
    public boolean f351681i;

    /* renamed from: j */
    public C117550d f351682j;

    /* renamed from: n */
    public C110390f f351683n;

    /* renamed from: o */
    public C102032a f351684o;

    /* renamed from: p */
    public C116361c f351685p;

    /* renamed from: q */
    public C76751a f351686q;

    /* renamed from: r */
    public C110390f.C89659b f351687r;

    /* renamed from: s */
    public MMHandler f351688s;

    /* renamed from: md0.e$a */
    public class C117547a implements C110390f.C89659b {
        public C117547a() {
        }

        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            Log.m105919d("MicroMsg.SceneVoiceAddr", "OnRecPcmDataReady len: %d", Integer.valueOf(i));
            C116361c.C45130a aVar = new C116361c.C45130a();
            int i2 = i / 2;
            short[] sArr = new short[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * 2;
                sArr[i3] = (short) ((bArr[i4 + 1] << 8) | (bArr[i4] & ExifInterface.MARKER));
            }
            C116361c cVar = C117546e.this.f351685p;
            if (cVar != null) {
                cVar.mo178018a(sArr, i2, aVar);
            }
            C117546e eVar = C117546e.this;
            eVar.getClass();
            for (int i5 = 0; i5 < i2; i5++) {
                short s = sArr[i5];
                if (s > eVar.f351677e) {
                    eVar.f351677e = s;
                }
            }
            C102032a aVar2 = C117546e.this.f351684o;
            int b = aVar2 != null ? aVar2.mo73538b(new C101193k.C101194a(bArr, i), 0) : -1;
            if (-1 == b) {
                C117546e.this.mo182282b();
                Log.m105920e("MicroMsg.SceneVoiceAddr", "write to file failed");
                return;
            }
            C117546e eVar2 = C117546e.this;
            int i6 = eVar2.f351678f + b;
            eVar2.f351678f = i6;
            if (i6 > 3300 && !eVar2.f351679g) {
                Log.m105918d("MicroMsg.SceneVoiceAddr", "sendEmptyMessage(0)");
                C117546e.this.f351688s.sendEmptyMessage(0);
                C117546e.this.f351679g = true;
            }
            int i7 = aVar.f122402a;
            if (i7 == 2 || i7 == 3) {
                Log.m105924i("MicroMsg.SceneVoiceAddr", "state.vad_flag: " + aVar.f122402a);
                C117546e.this.mo182282b();
            }
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
        }
    }

    /* renamed from: md0.e$b */
    public class C117548b extends MMHandler {
        public C117548b() {
        }

        public void handleMessage(Message message) {
            C117550d dVar;
            int i = message.what;
            if (i == 2) {
                C117550d dVar2 = C117546e.this.f351682j;
                if (dVar2 != null) {
                    C114759a aVar = (C114759a) dVar2;
                    VoiceSearchLayout.m161446a(aVar.f344096a);
                    aVar.f344096a.mo174397e(false, (C117748a) null);
                    MTimerHandler mTimerHandler = aVar.f344096a.f344094s;
                    if (mTimerHandler != null) {
                        mTimerHandler.stopTimer();
                    }
                }
            } else if (i == 0) {
                if (C117546e.this.f351676d == 0) {
                    Log.m105918d("MicroMsg.SceneVoiceAddr", "addSceneEndListener MMFunc_UploadInputVoice");
                    C86709a0.m107524d().mo123455a(349, C117546e.this);
                } else {
                    C86709a0.m107524d().mo123455a(206, C117546e.this);
                }
                C117546e eVar = C117546e.this;
                if (eVar.f351676d != 0) {
                    eVar.f351686q = new C46996c(C117546e.m165827a(eVar), C117546e.this.f351676d);
                } else if (!eVar.f351681i) {
                    eVar.f351686q = new C46998d(C117546e.m165827a(eVar), 0);
                } else {
                    eVar.f351686q = new C46998d(C117546e.m165827a(eVar), 1);
                }
                C86709a0.m107524d().mo123460f(C117546e.this.f351686q);
            } else if (i == 3 && (dVar = C117546e.this.f351682j) != null) {
                ((C114759a) dVar).mo174406a(new String[0], -1);
            }
        }
    }

    /* renamed from: md0.e$c */
    public class C117549c implements Runnable {
        public C117549c() {
        }

        /* renamed from: a */
        public void mo182284a() {
            int i;
            Log.m105924i("MicroMsg.SceneVoiceAddr", "initDeviceInLock");
            try {
                Uri n = C116299g2.m163858n(C117546e.m165827a(C117546e.this));
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (l.mo177810a()) {
                    boolean c = l.f348991a.mo119933c(l.f348992b);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SceneVoiceAddr", "delete file failed, " + C117546e.m165827a(C117546e.this), e);
            }
            C117546e eVar = C117546e.this;
            eVar.f351683n = new C110390f(eVar.f351681i ? 8000 : 16000, 1, 3);
            C110390f fVar = C117546e.this.f351683n;
            fVar.f330234m = -19;
            fVar.mo161904i(false);
            C117546e eVar2 = C117546e.this;
            if (!eVar2.f351681i) {
                eVar2.f351684o = new C52575d();
                C117546e eVar3 = C117546e.this;
                if (!eVar3.f351684o.mo73537a(C117546e.m165827a(eVar3))) {
                    Log.m105920e("MicroMsg.SceneVoiceAddr", "init speex writer failed");
                    C117546e.this.f351684o.mo73541e();
                    C117546e.this.f351684o = null;
                }
            }
            C117546e eVar4 = C117546e.this;
            if (eVar4.f351681i || (i = C107835h0.f322856m.f322906m) <= 0) {
                eVar4.f351683n.mo161903h(5, false);
            } else {
                eVar4.f351683n.mo161903h(i, true);
            }
            C117546e.this.f351683n.mo161905j(false);
            C117546e eVar5 = C117546e.this;
            eVar5.f351685p = new C116361c(eVar5.f351680h, GmsVersion.VERSION_LONGHORN);
            int b = C117546e.this.f351685p.mo178019b();
            if (b != 0) {
                Log.m105920e("MicroMsg.SceneVoiceAddr", "init VoiceDetectAPI failed :" + b);
                C117546e.this.mo182283c();
                return;
            }
            C117546e eVar6 = C117546e.this;
            C110390f fVar2 = eVar6.f351683n;
            fVar2.f330245x = eVar6.f351687r;
            if (!fVar2.mo161906k()) {
                Log.m105920e("MicroMsg.SceneVoiceAddr", "start record failed");
                C117546e.this.mo182283c();
            }
        }

        public void run() {
            synchronized (C117546e.this) {
                mo182284a();
            }
        }
    }

    /* renamed from: md0.e$d */
    public interface C117550d {
    }

    public C117546e(C117550d dVar, int i) {
        int i2 = 500000;
        this.f351680h = 500000;
        this.f351681i = false;
        this.f351682j = null;
        this.f351685p = null;
        this.f351686q = null;
        this.f351687r = new C117547a();
        this.f351688s = new C117548b();
        this.f351682j = dVar;
        this.f351676d = i;
        this.f351680h = i != 1 ? 1500000 : i2;
        C45427v.m50377a();
    }

    /* renamed from: a */
    public static String m165827a(C117546e eVar) {
        return !eVar.f351681i ? f351673t : f351674u;
    }

    /* renamed from: b */
    public final void mo182282b() {
        Log.m105924i("MicroMsg.SceneVoiceAddr", "finish");
        Log.printInfoStack("MicroMsg.SceneVoiceAddr", "finish", new Object[0]);
        C76751a aVar = this.f351686q;
        if (aVar != null) {
            aVar.mo72192n1();
        }
        this.f351688s.sendEmptyMessage(2);
        if (!this.f351679g) {
            this.f351688s.sendEmptyMessage(3);
        }
        mo182283c();
    }

    /* renamed from: c */
    public final void mo182283c() {
        Log.m105924i("MicroMsg.SceneVoiceAddr", "reset");
        synchronized (this) {
            C110390f fVar = this.f351683n;
            if (fVar != null) {
                fVar.mo161907l();
                this.f351683n = null;
            }
            C102032a aVar = this.f351684o;
            if (aVar != null) {
                aVar.mo73541e();
                this.f351684o = null;
            }
            C116361c cVar = this.f351685p;
            if (cVar != null) {
                cVar.mo178020c();
            }
            this.f351685p = null;
            C76751a aVar2 = this.f351686q;
            if (aVar2 != null) {
                aVar2.mo72192n1();
                this.f351686q = null;
            }
            this.f351678f = 0;
            this.f351679g = false;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (this.f351676d == 0) {
            Log.m105918d("MicroMsg.SceneVoiceAddr", "removeSceneEndListener MMFunc_UploadInputVoice");
            C86709a0.m107524d().mo123470p(349, this);
        } else {
            C86709a0.m107524d().mo123470p(206, this);
        }
        C76751a aVar = (C76751a) yVar;
        String[] k1 = aVar.mo72189k1();
        long l1 = aVar.mo72190l1();
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(k1 == null ? -1 : k1.length);
        Log.m105925i("MicroMsg.SceneVoiceAddr", "onSceneEnd errType:%d errCode:%d list:%d", objArr);
        C117550d dVar = this.f351682j;
        if (dVar == null) {
            return;
        }
        if (i2 == 0 && i == 0) {
            ((C114759a) dVar).mo174406a(k1, l1);
            return;
        }
        aVar.mo72188j1();
        C114759a aVar2 = (C114759a) dVar;
        aVar2.f344096a.mo174398f();
        ((C114760b.C114761a) aVar2.f344096a.f344083e).mo174408a(false, (String[]) null, -1);
        this.f351682j = null;
        mo182282b();
    }
}
