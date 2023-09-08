package com.tencent.p014mm.plugin.transvoice.model;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SceneVoiceRcdDataEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import md0.C99847f;
import nd0.C117623b;
import p375qh.C101193k;
import p827uh.C102032a;
import p827uh.C102034c;

/* renamed from: com.tencent.mm.plugin.transvoice.model.CutShortSentence */
public class CutShortSentence {

    /* renamed from: f */
    public static final String f282470f = (C72994y1.f212832a + "voice_temp.silk");

    /* renamed from: a */
    public IListener f282471a;

    /* renamed from: b */
    public C102032a f282472b;

    /* renamed from: c */
    public C117623b f282473c;

    /* renamed from: d */
    public C99847f f282474d;

    /* renamed from: e */
    public C117623b.C117625b f282475e = new C96528a();

    /* renamed from: com.tencent.mm.plugin.transvoice.model.CutShortSentence$a */
    public class C96528a implements C117623b.C117625b {

        /* renamed from: a */
        public byte[] f282478a;

        public C96528a() {
        }

        /* renamed from: a */
        public void mo127259a() {
            Log.m105925i("MicroMsg.CutShortSentence", "Silent enough to finish time %s.", Long.valueOf(System.currentTimeMillis()));
        }

        /* renamed from: b */
        public void mo127260b(short[] sArr, int i) {
            if (sArr != null) {
                byte[] bArr = this.f282478a;
                if (bArr == null || bArr.length < i * 2) {
                    this.f282478a = new byte[(i * 2)];
                }
                for (int i2 = 0; i2 < i; i2++) {
                    byte[] bArr2 = this.f282478a;
                    int i3 = i2 * 2;
                    short s = sArr[i2];
                    bArr2[i3] = (byte) (s & 255);
                    bArr2[i3 + 1] = (byte) ((65280 & s) >> 8);
                }
                C102032a aVar = CutShortSentence.this.f282472b;
                if (-1 == (aVar != null ? aVar.mo73540d(new C101193k.C101194a(this.f282478a, i * 2), 0, true) : -1)) {
                    CutShortSentence.this.mo134551a(2);
                    Log.m105920e("MicroMsg.CutShortSentence", "write to file failed");
                }
            }
        }

        /* renamed from: c */
        public void mo127261c(long j) {
            CutShortSentence.this.getClass();
            int l = (int) C86013q1.m106451l(CutShortSentence.f282470f);
            Log.m105925i("MicroMsg.CutShortSentence", "onSpeakToSilent nowLen: %d.", Integer.valueOf(l));
            if (l > 0 && CutShortSentence.this.f282474d != null) {
                Log.m105924i("MicroMsg.CutShortSentence", "onSpeakToSilent, cutShortSentence.");
                CutShortSentence.this.f282474d.mo139203c(l);
            }
        }

        /* renamed from: d */
        public void mo127262d(long j) {
            Log.m105924i("MicroMsg.CutShortSentence", "onSilentToSpeak.");
            if (CutShortSentence.this.f282474d != null) {
                Log.m105924i("MicroMsg.CutShortSentence", "onSilentToSpeak, createNewShortSentence.");
                CutShortSentence.this.f282474d.mo139202b();
            }
            C102032a aVar = CutShortSentence.this.f282472b;
            if (aVar != null && !aVar.mo73539c()) {
                CutShortSentence.this.mo134551a(1);
            }
        }
    }

    public CutShortSentence() {
        Log.m105919d("MicroMsg.CutShortSentence", "new CutShortSentence, %s.", this);
        this.f282471a = new IListener<SceneVoiceRcdDataEvent>(C40008f.f107254d) {

            /* renamed from: d */
            public short[] f282476d;

            {
                this.__eventId = 822073171;
            }

            public boolean callback(IEvent iEvent) {
                SceneVoiceRcdDataEvent sceneVoiceRcdDataEvent = (SceneVoiceRcdDataEvent) iEvent;
                synchronized (CutShortSentence.this) {
                    Log.m105918d("MicroMsg.CutShortSentence", "receive SceneVoiceRcdDataEvent.");
                    SceneVoiceRcdDataEvent.C92561a aVar = sceneVoiceRcdDataEvent.f265096d;
                    byte[] bArr = aVar.f265097a;
                    int i = aVar.f265098b;
                    Log.m105925i("MicroMsg.CutShortSentence", "rec data, len: %s time: %s.", Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()));
                    short[] sArr = this.f282476d;
                    if (sArr == null || sArr.length < i / 2) {
                        this.f282476d = new short[(i / 2)];
                    }
                    for (int i2 = 0; i2 < i / 2; i2++) {
                        int i3 = i2 * 2;
                        this.f282476d[i2] = (short) ((bArr[i3 + 1] << 8) | (bArr[i3] & ExifInterface.MARKER));
                    }
                    CutShortSentence cutShortSentence = CutShortSentence.this;
                    C117623b bVar = cutShortSentence.f282473c;
                    if (bVar != null) {
                        bVar.mo182348b(this.f282476d, i / 2);
                    } else {
                        cutShortSentence.mo134551a(4);
                        Log.m105920e("MicroMsg.CutShortSentence", "mVoiceSilentDetectAPI is null");
                    }
                }
                return false;
            }
        };
        Log.m105925i("MicroMsg.CutShortSentence", "init cut sentence, time %s.", Long.valueOf(System.currentTimeMillis()));
        try {
            String str = f282470f;
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            C86009m1 m1Var = new C86009m1(str);
            if (!m1Var.mo119967g()) {
                m1Var.mo119964e();
            }
            m1Var.mo119966f();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CutShortSentence", e, "delete file failed", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo134551a(int i) {
        Log.m105925i("MicroMsg.CutShortSentence", "error localCode = %s.", Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo134552b(C99847f fVar) {
        this.f282474d = fVar;
        C102034c cVar = new C102034c(16000, 23900);
        this.f282472b = cVar;
        if (!cVar.mo73537a(f282470f)) {
            Log.m105920e("MicroMsg.CutShortSentence", "init speex writer failed");
            this.f282472b.mo73541e();
            this.f282472b = null;
            mo134551a(1);
        }
        try {
            C117623b bVar = new C117623b(NetworkMonitorReceiver.MSG_DELAY_TIME, 16000, false, false);
            this.f282473c = bVar;
            bVar.f351866l = this.f282475e;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.CutShortSentence", th, "init VoiceDetectAPI failed", new Object[0]);
            mo134551a(3);
        }
        this.f282471a.alive();
    }

    /* renamed from: c */
    public final void mo134553c() {
        C102032a aVar = this.f282472b;
        if (aVar != null) {
            aVar.mo73541e();
            this.f282472b = null;
        }
        C117623b bVar = this.f282473c;
        if (bVar != null) {
            try {
                bVar.mo182350d();
                this.f282473c = null;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CutShortSentence", e, "mVoiceSilentDetectAPI.release error", new Object[0]);
            }
        }
        if (this.f282474d != null) {
            this.f282474d.mo139203c((int) C86013q1.m106451l(f282470f));
            this.f282474d = null;
        }
    }
}
