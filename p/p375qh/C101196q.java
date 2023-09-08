package p375qh;

import android.media.MediaRecorder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p206nj.C100115c;
import p206nj.C76861g;
import p331dj.C75411c;
import p375qh.C101180a;
import p492dn.C97498p;

/* renamed from: qh.q */
public class C101196q implements C97498p {

    /* renamed from: f */
    public static int f296204f = 100;

    /* renamed from: a */
    public C100115c f296205a = new C100115c(MMApplicationContext.getContext());

    /* renamed from: b */
    public C101182e f296206b = new C101182e(C75411c.AMR);

    /* renamed from: c */
    public String f296207c = "";

    /* renamed from: d */
    public C97498p.C97499a f296208d = null;

    /* renamed from: e */
    public int f296209e = 0;

    /* renamed from: qh.q$a */
    public class C101197a implements C101180a.C101181a {
        public C101197a() {
        }

        /* renamed from: a */
        public void mo127303a() {
            C101196q.this.f296205a.mo139414a();
            C97498p.C97499a aVar = C101196q.this.f296208d;
            if (aVar != null) {
                aVar.mo128609a();
            }
            try {
                C101196q.this.f296206b.mo140629d();
                C101196q.this.f296209e = -1;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SimpleVoiceRecorder", "setErrorListener File[" + C101196q.this.f296207c + "] ErrMsg[" + e.getStackTrace() + "]");
            }
        }
    }

    /* renamed from: a */
    public boolean mo140641a(String str, int i) {
        MediaRecorder mediaRecorder;
        C76861g.C47263a aVar = new C76861g.C47263a();
        if (this.f296207c.length() > 0) {
            Log.m105920e("MicroMsg.SimpleVoiceRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
            return false;
        }
        this.f296207c = str;
        try {
            this.f296205a.mo139415b();
            this.f296206b.mo140630e(new C101197a());
            C101182e eVar = this.f296206b;
            C75411c cVar = eVar.f296176q;
            C75411c cVar2 = C75411c.AMR;
            if (cVar == cVar2) {
                MediaRecorder mediaRecorder2 = eVar.f296174o;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.setAudioSource(1);
                }
            }
            C101182e eVar2 = this.f296206b;
            if (eVar2.f296176q == cVar2) {
                MediaRecorder mediaRecorder3 = eVar2.f296174o;
                if (mediaRecorder3 != null) {
                    mediaRecorder3.setOutputFormat(3);
                }
            }
            C101182e eVar3 = this.f296206b;
            if (eVar3.f296176q == cVar2 && (mediaRecorder = eVar3.f296174o) != null) {
                mediaRecorder.setAudioEncoder(1);
            }
            this.f296206b.mo140631f(this.f296207c);
            C101182e eVar4 = this.f296206b;
            if (eVar4.f296176q == cVar2) {
                MediaRecorder mediaRecorder4 = eVar4.f296174o;
                if (mediaRecorder4 != null) {
                    mediaRecorder4.setMaxDuration(i);
                }
            } else {
                eVar4.f296167h = (long) i;
            }
            this.f296206b.mo140628c();
            this.f296206b.mo140632g();
            Log.m105918d("MicroMsg.SimpleVoiceRecorder", "StartRecord File[" + this.f296207c + "] start time:" + aVar.mo72288a());
            this.f296209e = 1;
            return true;
        } catch (Exception e) {
            this.f296205a.mo139414a();
            Log.m105920e("MicroMsg.SimpleVoiceRecorder", "StartRecord File[" + this.f296207c + "] ErrMsg[" + e.getMessage() + "]");
            this.f296209e = -1;
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo140642b() {
        this.f296205a.mo139414a();
        C101182e eVar = this.f296206b;
        if (eVar == null) {
            return true;
        }
        try {
            eVar.mo140633h();
            this.f296206b.mo140629d();
            this.f296207c = "";
            this.f296209e = 0;
            return true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SimpleVoiceRecorder", "StopRecord File[" + this.f296207c + "] ErrMsg[" + e.getMessage() + "]");
            this.f296209e = -1;
            return false;
        }
    }
}
